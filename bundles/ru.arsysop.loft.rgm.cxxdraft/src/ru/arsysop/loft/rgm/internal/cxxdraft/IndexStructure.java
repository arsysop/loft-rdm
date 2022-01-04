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
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.model.api.Index;
import ru.arsysop.loft.rgm.model.api.IndexEntry;
import ru.arsysop.loft.rgm.model.meta.RgmFactory;

public final class IndexStructure extends BaseStructure<Index> {

	private final RgmFactory factory;

	public IndexStructure(Index container, ResolutionContext context) {
		super(container, context);
		this.factory = RgmFactory.eINSTANCE;
	}

	@Override
	public void body(Element body) {
		Element wrapper = (Element) body.node(0);
		createEntries(wrapper);
		fillReferences(wrapper);
	}

	private void fillReferences(Element wrapper) {
		for (int i = 0; i < wrapper.nodeCount(); i++) {
			Node node = wrapper.node(i);
			if (node instanceof Element) {
				if ("div".equals(node.getName())) { //$NON-NLS-1$
					fillEntry((Element) node);
				}
			}
		}
	}

	private void createEntries(Element wrapper) {
		for (int i = 0; i < wrapper.nodeCount(); i++) {
			Node node = wrapper.node(i);
			if (node instanceof Element) {
				Element element = (Element) node;
				switch (node.getName()) {
				case "div": //$NON-NLS-1$
					topLevelIndexEntry(element);
					break;
				case "h1": //$NON-NLS-1$
					container.setName(node.getText());
					break;
				default:
					System.err.println("TOC unknown: " + node); //$NON-NLS-1$
					break;
				}
			}
		}
	}

	private void topLevelIndexEntry(Element node) {
		IndexEntry entry = createIndexEntry(node);
		container.getEntries().add(entry);
	}

	private void fillEntry(Element node) {
		Element div = Optional.ofNullable(node.element("div")).orElse(node); //$NON-NLS-1$
		String id = node.attributeValue("id"); //$NON-NLS-1$
		Optional<IndexEntry> found = context.indexEntries().find("#" + id); //$NON-NLS-1$
		if (found.isPresent()) {
			IndexEntry entry = found.get();
			List<Element> refNodes = div.elements("a"); //$NON-NLS-1$
			List<Element> seeNodes = div.elements("i").stream() //$NON-NLS-1$
					.filter(i -> "see".equals(i.getText())) //$NON-NLS-1$
					.collect(Collectors.toList());

			if (seeNodes.size() > 0) { // Assuming see case
				String attributeValue = refNodes.get(0).attributeValue("href"); //$NON-NLS-1$
				System.out.println(attributeValue);
				Optional<IndexEntry> foundSee = context.indexEntries().find(attributeValue);
				if (foundSee.isPresent()) {
					IndexEntry seeRef = foundSee.get();
					entry.getSee().add(seeRef);
					IntStream.range(0, seeNodes.size()) //
							.mapToObj(refNodes::get) //
							.map(element -> element.attributeValue("href")) //$NON-NLS-1$
							.map(context.indexEntries()::find) //
							.filter(Optional::isPresent) //
							.map(Optional::get) //
							.forEach(entry.getSee()::add);
				}
			} else { // Just a link otherwise
				refNodes.stream() //
						.map(element -> element.attributeValue("href")) //$NON-NLS-1$
						.map(context.parts()::find) //
						.filter(Optional::isPresent) //
						.map(Optional::get) //
						.forEach(entry.getParts()::add);
			}
		} else {
			System.err.println("No references were found for " + id); //$NON-NLS-1$
		}
	}

	private IndexEntry createIndexEntry(Element node) {
		IndexEntry entry = factory.createIndexEntry();

		Element div = Optional.ofNullable(node.element("div")).orElse(node); //$NON-NLS-1$
		Element span = div.element("span"); //$NON-NLS-1$
		if (span != null) {
			entry.setText(span.getText());
		}
		// FIXME: AF: not sure, it could be a dedicated entity
		entry.setKeyword(node.attributeValue("id")); //$NON-NLS-1$
		entry.setId(node.attributeValue("id")); //$NON-NLS-1$
		entry.getSubentries().addAll(div.elements("div").stream() //$NON-NLS-1$
				.map(this::createIndexEntry) //
				.collect(Collectors.toList()));
		context.indexEntries().register("#" + entry.getId(), entry); //$NON-NLS-1$
//		boolean pointing = div.getText().contains(","); //$NON-NLS-1$
//		Element e0 = elements.get(0);
//		if (elements.size() < 2) {
//			if (pointing) {
//				String href = e0.attributeValue("href"); //$NON-NLS-1$
//				String[] split = href.split(","); //$NON-NLS-1$
//				for (String id : split) {
//					context.parts().request(id, entry.getParts()::add);
//				}
//				entry.setText(entry.getText() + " " + href); //$NON-NLS-1$
//				return entry;
//			} else {
//				createSubIndexEntry(entry, div);
//				return entry;
//			}
//		}
//		Element e1 = elements.get(1);
//		if (elements.size() < 3) {
//			if (pointing) {
//				String href = e1.attributeValue("href"); //$NON-NLS-1$
//				context.parts().request(href, entry.getParts()::add);
//				return entry;
//			} else {
//				if ("div".equals(e0.getName())) { //$NON-NLS-1$
//					// FIXME: AF: investigate "asm"
//					createSubIndexEntry(entry, e0);
//				}
//				createSubIndexEntry(entry, e1);
//				return entry;
//			}
//		}
//		if (e1.getText().contains("see")) { //$NON-NLS-1$
//			Element e2 = elements.get(2);
//			String href = e2.attributeValue("href"); //$NON-NLS-1$
//			context.indexEntries().request(href, entry.getSee()::add);
//		} else {
//			if (pointing) {
//				Element e2 = elements.get(2);
//				String href = e2.attributeValue("href"); //$NON-NLS-1$
//				context.parts().request(href, entry.getParts()::add);
//			} else {
//				createSubIndexEntry(entry, div);
//				return entry;
//			}
//		}
		return entry;
	}

}
