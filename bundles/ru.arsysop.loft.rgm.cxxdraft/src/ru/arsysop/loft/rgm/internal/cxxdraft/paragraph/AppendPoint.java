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
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.spec.model.api.Paragraph;
import ru.arsysop.loft.rgm.spec.model.api.Point;
import ru.arsysop.loft.rgm.spec.model.api.StyledLine;
import ru.arsysop.loft.rgm.spec.model.api.StyledNode;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class AppendPoint implements BiConsumer<Paragraph, Element> {

	private final ResolutionContext context;
	private final SpecFactory factory = SpecFactory.eINSTANCE;

	public AppendPoint(ResolutionContext context) {
		this.context = context;
	}

	@Override
	public void accept(Paragraph paragraph, Element node) {
		Point point = factory.createPoint();
		point.setId(pointId(node));
		point.setName(pointName(paragraph, node));
		point.getText().addAll(pointText(node));
		point.getReferences().addAll(new ParseReferences(context).apply(node));
		point.getTables().addAll(new ParseTables(factory).apply(node));
		paragraph.getParts().add(point);
	}

	// TODO: NF: provide a more meaningful way to collect subparagraph's text
	private List<StyledLine> pointText(Element node) {
		return node.elements("p").stream() //$NON-NLS-1$
				.map(Element::content) //
				.map(this::collectParagraph) //
				.map(this::styledLine) //
				.collect(Collectors.toList()); // $NON-NLS-1$
	}

	private List<StyledNode> collectParagraph(List<Node> nodes) {
		return nodes.stream().map(this::styledNode).collect(Collectors.toList());
	}

	private StyledLine styledLine(List<StyledNode> nodes) {
		StyledLine styled = factory.createStyledLine();
		styled.getText().addAll(nodes);
		return styled;
	}

	private StyledNode styledNode(Node node) {
		StyledNode styled = factory.createStyledNode();
		styled.setText(node.getText());
		styled.setType(Optional.ofNullable(node.getName()).orElse("")); //$NON-NLS-1$
		return styled;
	}

	private String pointId(Element node) {
		return node.attributeValue("id"); //$NON-NLS-1$
	}

	private String pointName(Paragraph paragraph, Element node) {
		return paragraph.getNumber().concat("-").concat(node.elements("div").stream() //$NON-NLS-1$ //$NON-NLS-2$
				.filter(new OfClass("marginalizedparent")) //$NON-NLS-1$
				.map(e -> e.element("a")) //$NON-NLS-1$
				.map(Element::getText) //
				.findAny().orElse("")); //$NON-NLS-1$
	}

}
