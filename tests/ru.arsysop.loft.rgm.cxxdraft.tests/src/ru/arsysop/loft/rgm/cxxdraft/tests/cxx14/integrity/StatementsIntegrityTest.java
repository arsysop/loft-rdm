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
package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14.integrity;

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
