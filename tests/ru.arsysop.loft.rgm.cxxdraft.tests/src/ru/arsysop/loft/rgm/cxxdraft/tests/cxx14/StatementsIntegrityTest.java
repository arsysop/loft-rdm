package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ru.arsysop.loft.rgm.spec.model.api.TocChapter;

public final class StatementsIntegrityTest extends Cxx14IntegrityTest {

	private final TocChapter statements = document.getToc().getChapters().get(7);

	@Test
	public void name() {
		assertEquals("Statements", statements.getName()); //$NON-NLS-1$
	}

	@Test
	public void count() {
		int subchapters = 8;
		assertEquals(subchapters, statements.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = statements.getChapters().get(i);
			assertEquals(chapter(6, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

	@Test
	public void selection() {
		int paragraphs = 2;
		assertEquals("Selection statements", statements.getChapters().get(3).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = statements.getChapters().get(3).getChapters().get(i);
			assertEquals(paragraph(6, 4, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void iteration() {
		int paragraphs = 4;
		assertEquals("Iteration statements", statements.getChapters().get(4).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = statements.getChapters().get(4).getChapters().get(i);
			assertEquals(paragraph(6, 5, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void jump() {
		int paragraphs = 4;
		assertEquals("Jump statements", statements.getChapters().get(5).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = statements.getChapters().get(5).getChapters().get(i);
			assertEquals(paragraph(6, 6, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

}
