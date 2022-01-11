package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ru.arsysop.loft.rgm.spec.model.api.TocChapter;

public class ConventionsIntegrityTest extends Cxx14IntegrityTest {
	
	private final TocChapter conventions = document.getToc().getChapters().get(3);

	@Test
	public final void name() {
		assertEquals("Lexical conventions", conventions.getName()); //$NON-NLS-1$
	}

	@Test
	public final void count() {
		int subchapters = 14;
		assertEquals(subchapters, conventions.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = conventions.getChapters().get(i);
			assertEquals(chapter(2, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

	@Test
	public final void literals() {
		int paragraphs = 8;
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = conventions.getChapters().get(13).getChapters().get(i);
			assertEquals(paragraph(2, 14, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

}
