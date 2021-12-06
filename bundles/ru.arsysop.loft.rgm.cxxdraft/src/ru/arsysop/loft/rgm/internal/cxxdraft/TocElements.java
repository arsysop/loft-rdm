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

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.model.api.Toc;
import ru.arsysop.loft.rgm.model.api.TocChapter;
import ru.arsysop.loft.rgm.model.meta.RgmFactory;

public final class TocElements extends BaseElements<Toc> {

	private final RgmFactory factory;

	public TocElements(Toc toc) {
		super(toc);
		this.factory = RgmFactory.eINSTANCE;
	}

	@Override
	protected void processSpan(Element node) {
		System.out.println("TocElements.processSpan():" + node); //$NON-NLS-1$
		// TODO check for content
	}

	@Override
	protected void processHx(Element node) {
		System.out.println("TocElements.processHx(): " + node.getParent().elementText(node.getName())); //$NON-NLS-1$
		// TODO check for content
	}

	@Override
	protected void processHr(Element node) {
		System.out.println("TocElements.processHr()" + node); //$NON-NLS-1$
		// TODO most probably ignored, check for content
	}

	@Override
	protected void processA(Element node) {
		System.out.println("TocElements.processA()" + node.attributeValue("href")); //$NON-NLS-1$ //$NON-NLS-2$
		// TODO depends on parent element
	}

	@Override
	protected void processDiv(Element node) {
		String clazz = node.attributeValue("class"); //$NON-NLS-1$
		if (clazz == null) {
			createTocChapter(node);
			return;
		}
		switch (clazz) {
		case "tocChapter": //$NON-NLS-1$
			// processed above
			break;
		case "tocHeader": //$NON-NLS-1$
			// FIXME: AF: extract header
			break;
		case "wrapper": //$NON-NLS-1$
			break;

		default:
			System.out.println("DocumentElements.processDiv()"); //$NON-NLS-1$
			break;
		}
		// TODO process div attributes
	}

	private void createTocChapter(Element node) {
		TocChapter chapter = factory.createTocChapter();
		chapter.setId(node.attributeValue("id")); //$NON-NLS-1$
		Element content = node.element("div"); //$NON-NLS-1$
		if (content != null) {
			String name = node.elementText("h2"); //$NON-NLS-1$
			if (name == null) {
				name = node.elementText("h3"); //$NON-NLS-1$
			}
			chapter.setName(name);
			createTocSubChapters(chapter, content);
		} else {
			chapter.setNumber(node.elementText("a")); //$NON-NLS-1$
			applyText(node, chapter::setName);
		}
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
