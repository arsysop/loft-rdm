package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ru.arsysop.loft.rgm.model.api.TocChapter;

public final class GeneralIntegrityTest extends Cxx14IntegrityTest {

	private final TocChapter general = document.getToc().getChapters().get(2);

	@Test
	public final void name() {
		assertEquals("General", general.getName()); //$NON-NLS-1$
	}

	@Test
	public final void count() {
		int subchapters = 11;
		assertEquals(subchapters, general.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = general.getChapters().get(i);
			assertEquals(chapter(1, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

	@Test
	public final void terms() {
		int paragraphs = 26;
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = general.getChapters().get(2).getChapters().get(i);
			assertEquals(paragraph(1, 3, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

}
