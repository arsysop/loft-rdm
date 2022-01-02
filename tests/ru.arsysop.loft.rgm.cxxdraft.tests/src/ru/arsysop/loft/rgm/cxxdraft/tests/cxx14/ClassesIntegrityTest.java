package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ru.arsysop.loft.rgm.model.api.TocChapter;

public final class ClassesIntegrityTest extends Cxx14IntegrityTest {

	private final TocChapter classes = document.getToc().getChapters().get(10);

	@Test
	public void name() {
		assertEquals("Classes", classes.getName()); //$NON-NLS-1$
	}

	@Test
	public void count() {
		int subchapters = 9;
		assertEquals(subchapters, classes.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = classes.getChapters().get(i);
			assertEquals(chapter(9, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

	@Test
	public void memberFunctions() {
		int paragraphs = 2;
		assertEquals("Member functions", classes.getChapters().get(2).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = classes.getChapters().get(2).getChapters().get(i);
			assertEquals(paragraph(9, 3, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void staticMembers() {
		int paragraphs = 2;
		assertEquals("Static members", classes.getChapters().get(3).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = classes.getChapters().get(3).getChapters().get(i);
			assertEquals(paragraph(9, 4, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

}
