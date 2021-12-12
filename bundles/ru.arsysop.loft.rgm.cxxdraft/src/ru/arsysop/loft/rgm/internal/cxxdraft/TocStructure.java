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

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.model.api.Index;
import ru.arsysop.loft.rgm.model.api.Paragraph;
import ru.arsysop.loft.rgm.model.api.Toc;
import ru.arsysop.loft.rgm.model.api.TocChapter;
import ru.arsysop.loft.rgm.model.meta.RgmFactory;

public final class TocStructure extends BaseStructure<Toc> {

	private final RgmFactory factory;

	public TocStructure(Toc container, ResolutionContext context) {
		super(container, context);
		this.factory = RgmFactory.eINSTANCE;
	}

	@Override
	public void body(Element body) {
		Element wrapper = (Element) body.node(0);
		for (int i = 0; i < wrapper.nodeCount(); i++) {
			Node node = wrapper.node(i);
			if (node instanceof Element) {
				Element element = (Element) node;
				switch (node.getName()) {
				case "div": //$NON-NLS-1$
					div(element);
					break;
				case "h2": //$NON-NLS-1$
					topLevelH2(element);
					break;
				case "h1": //$NON-NLS-1$
					// may be later;
					break;
				default:
					System.err.println("TOC unknown: " + node); //$NON-NLS-1$
					break;
				}
			}
		}
	}

	private void div(Element node) {
		String clazz = node.attributeValue("class"); //$NON-NLS-1$
		if (clazz == null) {
			topLevelTocEntry(node);
			return;
		}
		System.out.println("DocumentElements.processDiv() for class: " + clazz); //$NON-NLS-1$

		switch (clazz) {
		case "tocChapter": //$NON-NLS-1$
			// processed above
			break;
		default:
			System.out.println("DocumentElements.processDiv()"); //$NON-NLS-1$
			break;
		}
		// TODO process div attributes
	}

	private void topLevelTocEntry(Element node) {
		TocChapter chapter = createTocChapter(node);
		if (node.element("h2")//$NON-NLS-1$
				.element("a")//$NON-NLS-1$
				.getText()//
				.startsWith("[")) { //$NON-NLS-1$
			completeVisualization(chapter, node);
		} else {
			if ("annexnum".equals( //$NON-NLS-1$
					node.element("h2") //$NON-NLS-1$
							.element("a") //$NON-NLS-1$
							.attributeValue("class"))) { //$NON-NLS-1$
				completeAnnex(chapter, node);
			} else {
				completeParagraph(chapter, node, container.getChapters()::add,
						container.getDocument().getParagraphs()::add);
			}
		}
	}

	private TocChapter createTocChapter(Element node) {
		TocChapter chapter = factory.createTocChapter();
		String raw = node.attributeValue("id"); //$NON-NLS-1$
		if (raw != null) {
			String id = raw.trim();
			chapter.setName(new ExtractSubElementText("h2", "h3", "h4").apply(node)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			String name = chapter.getName();
			if (name.isEmpty()) {
				System.out.println("TocStructure.createTocChapter(): no name" + node); //$NON-NLS-1$
			}
			chapter.setId(id);
		} else {
			List<Element> elements = node.elements();
			chapter.setName(node.getText().trim());
			if (elements.size() == 3) {
				chapter.setId(elements.get(2).attributeValue("href")); //$NON-NLS-1$
			} else if (elements.size() == 2) {
				chapter.setId(elements.get(1).attributeValue("href")); //$NON-NLS-1$
			}
		}
		chapter.setNumber(paragraphNumber(node));
		return chapter;
	}

	private String paragraphNumber(Element node) {
		Element a = node.element("a"); //$NON-NLS-1$
		if (a == null && !node.elements().isEmpty()) {
			a = node.elements().get(0).element("a"); //$NON-NLS-1$
		}
		return Optional.ofNullable(a)
				.map(Element::getText).filter(Objects::nonNull).filter(t -> !t.startsWith("[")) //$NON-NLS-1$
				.orElse(""); //$NON-NLS-1$
	}

	private void completeVisualization(TocChapter chapter, Element node) {
		container.getChapters().add(chapter);
		// TODO Auto-generated method stub
		
	}

	private void completeParagraph(TocChapter chapter, Element node, Consumer<TocChapter> chapters,
			Consumer<Paragraph> paragraphs) {
		chapters.accept(chapter);
		Paragraph paragraph = factory.createParagraph();
		paragraph.setId(chapter.getId());
		paragraph.setName(chapter.getName());
		paragraph.setNumber(chapter.getNumber());
		chapter.setPart(paragraph);
		paragraphs.accept(paragraph);
		context.parts().register(paragraph.getId(), paragraph);
		List<Element> divs = node.elements();
		for (Element div : divs) {
			if (!"div".equals(div.getName())) { //$NON-NLS-1$
				continue;
			}
			List<Element> elements = div.elements();
			for (Element element : elements) {
				TocChapter sub = createTocChapter(element);
				completeParagraph(sub, element, chapter.getChapters()::add,
						((Paragraph) chapter.getPart()).getParts()::add);
			}
		}
	}

	private void completeAnnex(TocChapter chapter, Element node) {
		container.getChapters().add(chapter);
		// TODO Auto-generated method stub

	}

	private void completeIndex(TocChapter chapter, Element node, Consumer<TocChapter> chapters,
			Consumer<Index> indexes) {
		chapters.accept(chapter);
		Index index = factory.createIndex();
		index.setId(chapter.getId());
		index.setName(chapter.getName());
		chapter.setPart(index);
		indexes.accept(index);
	}

	private void topLevelH2(Element element) {
		TocChapter chapter = factory.createTocChapter();
		Element h2a = element.element("a"); //$NON-NLS-1$
		chapter.setId(h2a.attributeValue("href")); //$NON-NLS-1$
		chapter.setName(h2a.getText());
		completeIndex(chapter, h2a, container.getChapters()::add, container.getDocument().getIndexes()::add);
	}

}
