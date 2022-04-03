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

public final class DeclarationsIntegrityTest extends Cxx14IntegrityTest {

	private final TocChapter declarations = document.getToc().getChapters().get(8);

	@Test
	public void name() {
		assertEquals("Declarations", declarations.getName()); //$NON-NLS-1$
	}

	@Test
	public void count() {
		int subchapters = 6;
		assertEquals(subchapters, declarations.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = declarations.getChapters().get(i);
			assertEquals(chapter(7, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

	@Test
	public void specifiers() {
		int paragraphs = 6;
		assertEquals("Specifiers", declarations.getChapters().get(0).getName()); //$NON-NLS-1$
		assertEquals(paragraphs, declarations.getChapters().get(0).getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = declarations.getChapters().get(0).getChapters().get(i);
			assertEquals(paragraph(7, 1, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void typeSpecifiers() {
		int paragraphs = 4;
		assertEquals(paragraphs, declarations.getChapters().get(0).getChapters().get(5).getChapters().size());
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = declarations.getChapters().get(0).getChapters().get(5).getChapters().get(i);
			assertEquals(subparagraph(7, 1, 6, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void namespaces() {
		int paragraphs = 4;
		assertEquals("Namespaces", declarations.getChapters().get(2).getName()); //$NON-NLS-1$
		assertEquals(paragraphs, declarations.getChapters().get(2).getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = declarations.getChapters().get(2).getChapters().get(i);
			assertEquals(paragraph(7, 3, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void namespaceDefinition() {
		int paragraphs = 2;
		assertEquals(paragraphs, declarations.getChapters().get(2).getChapters().get(0).getChapters().size());
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = declarations.getChapters().get(2).getChapters().get(0).getChapters().get(i);
			assertEquals(subparagraph(7, 3, 1, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void attributes() {
		int paragraphs = 5;
		assertEquals("Attributes", declarations.getChapters().get(5).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = declarations.getChapters().get(5).getChapters().get(i);
			assertEquals(paragraph(7, 6, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

}
