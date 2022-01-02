package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ru.arsysop.loft.rgm.model.api.TocChapter;

public final class ConversionsIntegrityTest extends Cxx14IntegrityTest {
	
	private final TocChapter standartConversions = document.getToc().getChapters().get(5);

	@Test
	public void name() {
		assertEquals("Standard conversions", standartConversions.getName()); //$NON-NLS-1$
	}

	@Test
	public void count() {
		int subchapters = 13;
		assertEquals(subchapters, standartConversions.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = standartConversions.getChapters().get(i);
			assertEquals(chapter(4, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

}
