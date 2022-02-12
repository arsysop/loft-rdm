/*******************************************************************************
 * Copyright (c) 2022 ArSysOp.
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
 *     Nikifor Fedorov (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.internal.cxxdraft.paragraph;

import java.util.List;
import java.util.function.BiConsumer;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.spec.model.api.Paragraph;
import ru.arsysop.loft.rgm.spec.model.api.Point;
import ru.arsysop.loft.rgm.spec.model.base.EncodeId;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class AppendPoint implements BiConsumer<Paragraph, Element> {

	private final SpecFactory factory = SpecFactory.eINSTANCE;
	private final ParseTables tables;
	private final ParseReferences references;

	public AppendPoint(ResolutionContext context) {
		this.text = new ParseText(factory);
		this.references = new ParseReferences(context);
		this.tables = new ParseTables(factory, context);
	}

	@Override
	public void accept(Paragraph paragraph, Element node) {
		Point point = factory.createPoint();
		String id = pointNumber(node);
		point.setId(new EncodeId().apply(paragraph.getId() + "_point" + id)); //$NON-NLS-1$
		point.setLocation(paragraph.getLocation() + '#' + id);
		point.setNumber(id);
		point.setName(pointName(paragraph, node));
		point.getTables().addAll(tables.apply(paragraph, node));
		node.elements("p").stream().map(references).flatMap(List::stream).forEach(point.getReferences()::add); //$NON-NLS-1$
		paragraph.getParts().add(point);
	}

	private String pointName(Paragraph paragraph, Element node) {
		return paragraph.getNumber().concat("-").concat(pointNumber(node)); //$NON-NLS-1$
	}

	private String pointNumber(Element node) {
		return node.elements("div").stream() //$NON-NLS-1$
				.filter(new OfClass("marginalizedparent")) //$NON-NLS-1$
				.map(e -> e.element("a")) //$NON-NLS-1$
				.map(Element::getText) //
				.findAny().orElse(""); //$NON-NLS-1$
	}

}
