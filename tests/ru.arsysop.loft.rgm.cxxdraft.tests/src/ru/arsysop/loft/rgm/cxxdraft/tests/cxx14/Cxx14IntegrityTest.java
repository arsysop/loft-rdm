package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.BeforeClass;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.cxxdraft.base.PublishedHtml;
import ru.arsysop.loft.rgm.cxxdraft.base.SimpleResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.TocStructure;
import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public abstract class Cxx14IntegrityTest {

	protected static final Document document = SpecFactory.eINSTANCE.createDocument();

	private static final String URL = "https://timsong-cpp.github.io/cppwp/n4140/"; //$NON-NLS-1$
	private static final ResolutionContext context = new SimpleResolutionContext(URL, document);

	@BeforeClass
	public static void performParsing() throws CoreException {
		document.setToc(SpecFactory.eINSTANCE.createToc());
		new PublishedHtml(//
				context.location(document.getToc()), //
				new TocStructure(document.getToc(), context)//
		).run(new NullProgressMonitor());
	}

	protected String chapter(int chapter, int subchapter) {
		return new StringBuilder() //
				.append(chapter).append(".") //$NON-NLS-1$
				.append(subchapter).toString();
	}

	protected String paragraph(int chapter, int subchapter, int paragraph) {
		return new StringBuilder() //
				.append(chapter).append(".") //$NON-NLS-1$
				.append(subchapter).append(".") //$NON-NLS-1$
				.append(paragraph).toString();
	}

	protected String subparagraph(int chapter, int subchapter, int paragraph, int subparagraph) {
		return new StringBuilder() //
				.append(chapter).append(".") //$NON-NLS-1$
				.append(subchapter).append(".") //$NON-NLS-1$
				.append(paragraph).append(".") //$NON-NLS-1$
				.append(subparagraph).toString();
	}

}
