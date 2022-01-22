package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ru.arsysop.loft.rgm.spec.model.api.TocChapter;

public final class DeclaratorsIntegrityTest extends Cxx14IntegrityTest {

	private final TocChapter declarators = document.getToc().getChapters().get(9);

	@Test
	public void name() {
		assertEquals("Declarators", declarators.getName()); //$NON-NLS-1$
	}

	@Test
	public void count() {
		int subchapters = 5;
		assertEquals(subchapters, declarators.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = declarators.getChapters().get(i);
			assertEquals(chapter(8, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

	@Test
	public void meaning() {
		int paragraphs = 6;
		assertEquals("Meaning of declarators", declarators.getChapters().get(2).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = declarators.getChapters().get(2).getChapters().get(i);
			assertEquals(paragraph(8, 3, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void functions() {
		int paragraphs = 3;
		assertEquals("Function definitions", declarators.getChapters().get(3).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = declarators.getChapters().get(3).getChapters().get(i);
			assertEquals(paragraph(8, 4, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void initializers() {
		int paragraphs = 4;
		assertEquals("Initializers", declarators.getChapters().get(4).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = declarators.getChapters().get(4).getChapters().get(i);
			assertEquals(paragraph(8, 5, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

}
