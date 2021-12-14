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
import static org.junit.Assert.assertTrue;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.junit.BeforeClass;
import org.junit.Test;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.cxxdraft.base.InvestigateHtml;
import ru.arsysop.loft.rgm.cxxdraft.base.SimpleResolutionContext;
import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.api.Index;
import ru.arsysop.loft.rgm.model.api.IndexEntry;
import ru.arsysop.loft.rgm.model.api.TocChapter;
import ru.arsysop.loft.rgm.model.meta.RgmFactory;

@SuppressWarnings("nls")
public final class InvestigateCxx14Test {

	private static final Document document = RgmFactory.eINSTANCE.createDocument();
	private static final ResolutionContext context = new SimpleResolutionContext(
			"https://timsong-cpp.github.io/cppwp/n4140/", document);

	@BeforeClass
	public static void performParsing() throws CoreException {
		new InvestigateHtml().prepare(context).run(new NullProgressMonitor());
	}

	@Test
	public void testToc() throws CoreException {
		EList<TocChapter> chapters = document.getToc().getChapters();
		int visualizations = 2;
		int numbered = 30;
		int annexes = 5;
		int indexes = 3;
		int size = visualizations + numbered + annexes + indexes;
		assertEquals(size, chapters.size());
		for (int i = visualizations; i < visualizations + numbered; i++) {
			TocChapter chapter = chapters.get(i);
			assertEquals(String.valueOf(i - 1), chapter.getNumber());
		}
		for (int i = visualizations + numbered; i < visualizations + numbered + annexes; i++) {
			TocChapter chapter = chapters.get(i);
			String number = chapter.getNumber();
			assertTrue(number.startsWith("Annex"));
		}
		for (int i = size - indexes; i < size; i++) {
			TocChapter chapter = chapters.get(i);
			String name = chapter.getName().toLowerCase();
			assertTrue(name.contains("index"));
		}
	}

	@Test
	public void testIndex() throws CoreException {
		EList<Index> indexes = document.getIndexes();
		assertEquals(3, indexes.size());
		Index general = indexes.get(0);

	}

	@Test
	public void testGeneralIndex() throws CoreException {
		Index index = document.getIndexes().get(0);
		assertEquals("generalindex", index.getId());
		assertEquals("Index", index.getName());
		EList<IndexEntry> entries = index.getEntries();
		IndexEntry entry00 = entries.get(0);
		assertEquals("!", entry00.getKeyword());
	}

}
