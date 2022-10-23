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
package ru.arsysop.loft.rgm.spec.cpp14.tests.integrity;

import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.cxxdraft.base.PublishedHtml;
import ru.arsysop.loft.rgm.cxxdraft.base.SimpleResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.TocStructure;
import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.model.api.Section;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

@SuppressWarnings("restriction")
public abstract class CxxIntegrityTest {

	private static final HashSet<Section> sections = new HashSet<>();

	protected Set<Section> sections() {
		if (sections.size() == 0) {
			try {
				performParsing();
			} catch (CoreException e) {
				fail("Can't download specification"); //$NON-NLS-1$
			}
		}
		return sections;
	}

	private void performParsing() throws CoreException {
		Document document = SpecFactory.eINSTANCE.createDocument();
		String URL = "https://timsong-cpp.github.io/cppwp/n4140/"; //$NON-NLS-1$
		ResolutionContext context = new SimpleResolutionContext(URL, document);
		document.setToc(SpecFactory.eINSTANCE.createToc());
		new PublishedHtml(//
				context.location(), //
				new TocStructure(document.getToc(), context)//
		).run(new NullProgressMonitor());
		document.getSections().stream() //
				.map(CxxIntegrityTest::expand) //
				.flatMap(Collection::stream) //
				.forEach(sections::add);
	}

	private static Collection<Section> expand(Section section) {
		Set<Section> expanded = new HashSet<>();
		expanded.add(section);
		section.getContents().stream() //
				.filter(Section.class::isInstance) //
				.map(Section.class::cast) //
				.map(CxxIntegrityTest::expand) //
				.flatMap(Collection::stream) //
				.forEach(expanded::add);
		return expanded;
	}

}
