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
package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.Objects;

import org.dom4j.Element;
import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.cxxdraft.Structure;
import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.api.Index;
import ru.arsysop.loft.rgm.model.api.Paragraph;
import ru.arsysop.loft.rgm.model.api.Toc;
import ru.arsysop.loft.rgm.model.util.RgmSwitch;

public final class StructureSwitch extends RgmSwitch<Structure> {

	private final ResolutionContext context;

	public StructureSwitch(ResolutionContext context) {
		this.context = Objects.requireNonNull(context, "StructureSwitch::context"); //$NON-NLS-1$
	}

	@Override
	public Structure caseDocument(Document object) {
		return caseToc(object.getToc());
	}

	@Override
	public Structure caseIndex(Index object) {
		return new IndexStructure(object, context);
	}

	@Override
	public Structure caseToc(Toc object) {
		return new TocStructure(object, context);
	}

	@Override
	public Structure caseParagraph(Paragraph object) {
		return new ParagraphStructure(object, context);
	}

	@Override
	public Structure defaultCase(EObject object) {
		System.err.println("No structure for: " + object); //$NON-NLS-1$
		return new BaseStructure<EObject>(object, context) {

			@Override
			public void body(Element body) {
				// nothing for default case
			}
		};
	}

}
