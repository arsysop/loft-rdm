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
package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.IsDiv;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.model.api.Paragraph;
import ru.arsysop.loft.rgm.model.api.SubParagraph;
import ru.arsysop.loft.rgm.model.meta.RgmFactory;

public final class ParagraphStructure extends BaseStructure<Paragraph> {

	private final RgmFactory factory;

	protected ParagraphStructure(Paragraph container, ResolutionContext context) {
		super(container, context);
		this.factory = RgmFactory.eINSTANCE;
	}

	@Override
	public void body(Element body) {
		Element wrapper = body.element("div"); //$NON-NLS-1$
		IntStream.range(0, wrapper.nodeCount()) //
				.mapToObj(wrapper::node) //
				.filter(Element.class::isInstance) //
				.map(Element.class::cast) //
				.filter(new IsDiv()) //
				.forEach(this::resolveParagraph);
	}

	private void resolveParagraph(Element node) {
		Optional<Paragraph> found = context.parts() //
				.find(node.attributeValue("id")) //$NON-NLS-1$
				.filter(Paragraph.class::isInstance).map(Paragraph.class::cast);
		if (found.isPresent()) {
			Paragraph paragraph = found.get();
			readSubParagraphs(paragraph, node);
		}
	}

	private void readSubParagraphs(Paragraph paragraph, Element node) {
		node.elements().stream() //
				.filter(new IsDiv()) //
				.filter(new OfClass("para")) //$NON-NLS-1$
				.forEach(e -> appendSubParagraph(paragraph, e));
	}

	private void appendSubParagraph(Paragraph paragraph, Element node) {
		SubParagraph subParagraph = factory.createSubParagraph();
		String id = subParagraphId(node);
		subParagraph.setId(id);
		subParagraph.setName(id); // NF: Let it be the same thing for now
		subParagraph.setText(node.elements("p").stream().map(Element::getText).collect(Collectors.joining(" "))); //$NON-NLS-1$//$NON-NLS-2$
		paragraph.getParts().add(subParagraph);
	}

	private String subParagraphId(Element node) {
		return node.elements("div").stream() //$NON-NLS-1$
				.filter(new OfClass("marginalizedparent")) //$NON-NLS-1$
				.map(e -> e.element("a")) //$NON-NLS-1$
				.map(Element::getText) //
				.findAny().orElse(""); //$NON-NLS-1$
	}

}
