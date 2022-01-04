package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ru.arsysop.loft.rgm.model.api.TocChapter;

public final class DerivedIntegrityTest extends Cxx14IntegrityTest {

	private final TocChapter derived = document.getToc().getChapters().get(11);

	@Test
	public void name() {
		assertEquals("Derived classes", derived.getName()); //$NON-NLS-1$
	}

	@Test
	public void count() {
		int subchapters = 4;
		assertEquals(subchapters, derived.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = derived.getChapters().get(i);
			assertEquals(chapter(10, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

}
