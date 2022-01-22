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
import java.util.stream.IntStream;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.IsDiv;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.NullClass;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.internal.cxxdraft.paragraph.AppendPoint;
import ru.arsysop.loft.rgm.spec.model.api.Paragraph;

public final class ParagraphStructure extends BaseStructure<Paragraph> {


	protected ParagraphStructure(Paragraph container, ResolutionContext context) {
		super(container, context);
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
		Optional<Paragraph> found = findParagraph(node);
		if (found.isPresent()) {
			readPoints(found.get(), node);
			node.elements("div").stream() // //$NON-NLS-1$
					.filter(new NullClass()) //
					.forEach(this::resolveParagraph);
		}
	}

	private Optional<Paragraph> findParagraph(Element node) {
		return context.parts() //
				.find(node.attributeValue("id")) //$NON-NLS-1$
				.filter(Paragraph.class::isInstance) //
				.map(Paragraph.class::cast);
	}

	private void readPoints(Paragraph paragraph, Element node) {
		node.elements().stream() //
				.filter(new IsDiv()) //
				.filter(new OfClass("para")) //$NON-NLS-1$
				.forEach(e -> new AppendPoint(context).accept(paragraph, e));
	}

}
