/*******************************************************************************
 * Copyright (c) ArSysOp 2018-2022
 * 
 * RGM Sources are publicly available only for 
 * informational, review, analysis and consulting purposes.
 * 
 * Definitions, terms and conditions for using RGM Sources are stated by ArSysOp Source License version 1.0.
 * See http://arsysop.ru/licenses/rgm/ArSysOpSourceLicense-1.0.txt
 * 
 * RGM Sources are provided on "as is" basis. 
 * ArSysOp is not responsible for any damages, losses, legal prosecution 
 * or other consequences of any sort that using RGM Sources can cause to you 
 * (as an individual or Legal Entity), even if aware of such consequences.
 * 
*******************************************************************************/
package ru.arsysop.loft.rgm.cxxdraft.base;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.cxxdraft.Structure;
import ru.arsysop.loft.rgm.internal.cxxdraft.Messages;
import ru.arsysop.loft.rgm.internal.cxxdraft.StructureSwitch;
import ru.arsysop.loft.rgm.spec.model.api.Index;
import ru.arsysop.loft.rgm.spec.model.api.Part;
import ru.arsysop.loft.rgm.spec.model.api.Revision;
import ru.arsysop.loft.rgm.spec.model.api.Section;
import ru.arsysop.loft.rgm.spec.model.api.Toc;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class InvestigateHtmlTree implements ICoreRunnable {

	private final ResolutionContext context;
	private final Revision revision;

	public InvestigateHtmlTree(ResolutionContext context, Revision revision) {
		this.context = Objects.requireNonNull(context, "ResolutionContext::context"); //$NON-NLS-1$
		this.revision = revision;
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, 100);
		parseToc(sub.split(10));
		parseSections(sub.split(80));
		parseAnnexes(sub.split(5));
		parseIndexes(sub.split(5));
	}

	private void parseToc(SubMonitor sub) throws CoreException {
		sub.subTask(Messages.InvestigateHtmlTree_subtask_toc);
		Toc toc = context.document().getToc();
		if (toc == null) {
			toc = SpecFactory.eINSTANCE.createToc();
			context.document().setToc(toc);
		}
		parseLocation(toc, sub);
	}

	private void parseSections(SubMonitor monitor) throws CoreException {
		List<Section> sections = context.document().getSections();
		SubMonitor sub = SubMonitor.convert(monitor, sections.size());
		for (Section paragraph : sections) {
			sub.subTask(NLS.bind(Messages.InvestigateHtmlTree_subtask_content, paragraph.getName()));
			parseSection(sub.split(1), paragraph);
		}
	}

	private void parseSection(SubMonitor monitor, Section section) throws CoreException {
		List<Section> paragraphs = section.getContents().stream() //
				.filter(Section.class::isInstance) //
				.map(Section.class::cast) //
				.collect(Collectors.toList());
		SubMonitor sub = SubMonitor.convert(monitor, paragraphs.size() + 1);
		parseLocation(section, sub.split(1));
		for (Section inner : paragraphs) {
			parseSection(sub.split(1), inner);
		}
	}

	private void parseAnnexes(SubMonitor sub) {
		// TODO Auto-generated method stub

	}

	private void parseIndexes(IProgressMonitor monitor) throws CoreException {
		EList<Index> indexes = context.document().getIndexes();
		if (indexes.isEmpty()) {
			return;
		}
		SubMonitor sub = SubMonitor.convert(monitor, indexes.size());
		for (Index index : indexes) {
			sub.subTask(NLS.bind(Messages.InvestigateHtmlTree_subtask_content, index.getName()));
			parseLocation(index, sub.split(1));
		}
	}

	private void parseLocation(EObject container, SubMonitor split) throws CoreException {
		String location = Optional.of(container)//
				.filter(Part.class::isInstance)//
				.map(Part.class::cast)//
				.map(Part::getLocation)//
				.orElseGet(context::location);
		Structure structure = new StructureSwitch(context, revision).doSwitch(container);
		new PublishedHtml(location, structure).run(split);
	}

}
