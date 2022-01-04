package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

import ru.arsysop.loft.rgm.model.api.TocChapter;

public final class DeclarationsIntegrityTest extends Cxx14IntegrityTest {

	private final TocChapter declarations = document.getToc().getChapters().get(8);

	@Test
	public void name() {
		assertEquals("Declarations", declarations.getName()); //$NON-NLS-1$
	}

	@Test
	public void count() {
		int subchapters = 6;
		assertEquals(subchapters, declarations.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = declarations.getChapters().get(i);
			assertEquals(chapter(7, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

	// TODO: see https://github.com/arsysop/loft-rgm/issues/23
	@Test
	@Ignore
	public void specifiers() {
		int paragraphs = 10;
		assertEquals("Specifiers", declarations.getChapters().get(0).getName()); //$NON-NLS-1$
		assertEquals(paragraphs, declarations.getChapters().get(0).getChapters().size()); // $NON-NLS-1$
	}

	// TODO: see https://github.com/arsysop/loft-rgm/issues/23
	@Test
	@Ignore
	public void namespaces() {
		int paragraphs = 6;
		assertEquals("Namespaces", declarations.getChapters().get(2).getName()); //$NON-NLS-1$
		assertEquals(paragraphs, declarations.getChapters().get(2).getChapters().size()); // $NON-NLS-1$
	}

	@Test
	public void attributes() {
		int paragraphs = 5;
		assertEquals("Attributes", declarations.getChapters().get(5).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = declarations.getChapters().get(5).getChapters().get(i);
			assertEquals(paragraph(7, 6, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

}
