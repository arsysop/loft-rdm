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

import java.util.Iterator;
import java.util.List;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
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

				default:
					System.out.println("TocStructure.body(): " + node); //$NON-NLS-1$
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
		TocChapter chapter = factory.createTocChapter();
		String id = node.attributeValue("id").trim(); //$NON-NLS-1$
		chapter.setId(id);
		Element h2 = node.element("h2"); //$NON-NLS-1$
		Element h2a = h2.element("a"); //$NON-NLS-1$
		String h2acv = h2a.attributeValue("class"); //$NON-NLS-1$
		if ("annexnum".equals(h2acv)) { //$NON-NLS-1$
			List<Node> h2acl = h2a.content();
			if (h2acl.size() == 1) {
				chapter.setNumber(h2a.getText());
			} else {
				chapter.setNumber(h2.elementText("a")); //$NON-NLS-1$
			}
		} else {
			chapter.setNumber(h2.elementText("a")); //$NON-NLS-1$
		}
		chapter.setName(new ExtractSubElementText("h2").apply(node)); //$NON-NLS-1$
		if (chapter.getNumber() == null) {
			System.out.println("TocStructure.topLevelTocEntry()"); //$NON-NLS-1$
		}
		Element content = node.element("div"); //$NON-NLS-1$
//		if (content != null) {
////			createTocSubChapters(chapter, content);
//		} else {
//			applyText(node, chapter::setName);
//		}
		container.getChapters().add(chapter);
	}

	private void createTocSubChapters(TocChapter parent, Element content) {
		Iterator<Node> nodes = content.nodeIterator();
		while (nodes.hasNext()) {
			Node node = nodes.next();
			if ("span".equals(node.getName())) { //$NON-NLS-1$
				Element span = (Element) node;
				TocChapter chapter = factory.createTocChapter();
				applyText(span, chapter::setNumber);
				Node text = nodes.next();
				chapter.setName(text.getText());
				Node next = nodes.next();
				// FIXME: AF: rework
				if ("a".equals(next.getName())) { //$NON-NLS-1$
					Element a = (Element) next;
					chapter.setId(a.attributeValue("href")); //$NON-NLS-1$
				}
				parent.getChapters().add(chapter);
			}
		}
	}
}
