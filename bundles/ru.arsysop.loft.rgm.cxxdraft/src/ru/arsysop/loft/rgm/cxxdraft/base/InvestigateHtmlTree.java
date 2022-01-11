/*******************************************************************************
 * Copyright (c) 2021 ArSysOp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.cxxdraft.base;

import java.util.List;
import java.util.Objects;

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
import ru.arsysop.loft.rgm.spec.model.api.Paragraph;
import ru.arsysop.loft.rgm.spec.model.api.Toc;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class InvestigateHtmlTree implements ICoreRunnable {

	private final ResolutionContext context;

	public InvestigateHtmlTree(ResolutionContext context) {
		this.context = Objects.requireNonNull(context, "ResolutionContext::context"); //$NON-NLS-1$
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, 100);
		parseToc(sub.split(5));
		parseVisualizations(sub.split(5));
		parseParagraphs(sub.split(80));
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

	private void parseVisualizations(SubMonitor sub) {
		// TODO Auto-generated method stub

	}

	private void parseParagraphs(SubMonitor monitor) throws CoreException {
		List<Paragraph> paragraphs = context.document().getParagraphs();
		SubMonitor sub = SubMonitor.convert(monitor, paragraphs.size());
		for (Paragraph paragraph : paragraphs) {
			sub.subTask(NLS.bind(Messages.InvestigateHtmlTree_subtask_content, paragraph.getName()));
			parseLocation(paragraph, sub.split(1));
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
		String location = context.location(container);
		Structure structure = new StructureSwitch(context).doSwitch(container);
		new PublishedHtml(location, structure).run(split);
	}

}
