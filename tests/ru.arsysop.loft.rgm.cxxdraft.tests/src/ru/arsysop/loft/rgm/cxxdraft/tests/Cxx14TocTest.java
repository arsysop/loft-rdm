/*******************************************************************************
 * Copyright (c) 2021 ArSysOp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.cxxdraft.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.junit.BeforeClass;
import org.junit.Test;

import ru.arsysop.loft.rgm.cxxdraft.PublishedHtml;
import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.api.TocChapter;
import ru.arsysop.loft.rgm.model.meta.RgmFactory;

@SuppressWarnings("nls")
public final class Cxx14TocTest {

	private static final Document document = RgmFactory.eINSTANCE.createDocument();

	@BeforeClass
	public static void performParsing() throws CoreException {
		document.setToc(RgmFactory.eINSTANCE.createToc());
		new PublishedHtml(document, //
				"https://timsong-cpp.github.io/cppwp/n4140/")
						.parse(new ResolutionContext() {
						});
	}

	@Test
	public void testListOfTables() throws CoreException {
		EList<TocChapter> chapters = document.getToc().getChapters();
		TocChapter chapter = chapters.get(0);
		assertEquals("List of Tables", chapter.getName());
		assertEquals("tab", chapter.getId());
	}

	@Test
	public void testListOfFigures() throws CoreException {
		EList<TocChapter> chapters = document.getToc().getChapters();
		TocChapter chapter = chapters.get(1);
		assertEquals("List of Figures", chapter.getName());
		assertEquals("fig", chapter.getId());
	}

	@Test
	public void testGeneral() throws CoreException {
		EList<TocChapter> chapters = document.getToc().getChapters();
		TocChapter chapter = chapters.get(2);
		assertEquals("1", chapter.getNumber());
		assertEquals("General", chapter.getName());
		assertEquals("intro", chapter.getId());
	}
}
