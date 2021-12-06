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

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;

import ru.arsysop.loft.rgm.cxxdraft.PublishedHtml;
import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.api.Toc;
import ru.arsysop.loft.rgm.model.meta.RgmFactory;

public final class Cxx14Test {

	@Test
	public void testCxx14Toc() throws CoreException {
		List<String> anchors = new ArrayList<>();
		Document document = RgmFactory.eINSTANCE.createDocument();
		Toc toc = RgmFactory.eINSTANCE.createToc();
		document.setToc(toc);
		new PublishedHtml(document, //
				"https://timsong-cpp.github.io/cppwp/n4140/") //$NON-NLS-1$
						.parse(anchors::add);
		assertFalse(anchors.isEmpty());
		anchors.forEach(System.out::println);
	}

}
