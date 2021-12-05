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

import org.dom4j.Element;

import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.meta.RgmFactory;

public final class DocumentElements extends BaseElements<Document> {

	private final RgmFactory factory;

	public DocumentElements(Document document) {
		super(document);
		this.factory = RgmFactory.eINSTANCE;
	}

	@Override
	protected void processSpan(Element node) {
		// TODO check for content
	}

	@Override
	protected void processHx(Element node) {
		// TODO check for content
	}

	@Override
	protected void processHr(Element node) {
		// TODO most probably ignored, check for content
	}

	@Override
	protected void processA(Element node) {
		// TODO depends on parent element
	}

	@Override
	protected void processDiv(Element node) {
		String clazz = node.attributeValue("class"); //$NON-NLS-1$
		if (clazz == null) {
			String id = node.attributeValue("id"); //$NON-NLS-1$
			// FIXME: AF: support visualizations
			return;
		}
		switch (clazz) {
		case "wrapper": //$NON-NLS-1$
		case "tocHeader": //$NON-NLS-1$
			break;

		default:
			System.out.println("DocumentElements.processDiv()"); //$NON-NLS-1$
			break;
		}
		// TODO process div attributes
	}

}
