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
