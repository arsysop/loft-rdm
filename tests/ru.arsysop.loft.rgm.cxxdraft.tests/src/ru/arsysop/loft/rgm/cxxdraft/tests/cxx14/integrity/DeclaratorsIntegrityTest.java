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
