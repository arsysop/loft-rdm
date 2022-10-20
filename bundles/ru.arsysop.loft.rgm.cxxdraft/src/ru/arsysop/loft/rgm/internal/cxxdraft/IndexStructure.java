/*******************************************************************************
 * Copyright (c) ArSysOp 2018-2022
 * 
 * RGM Sources are publicly available only for 
 * informational, review, analysis and consulting purposes.
 * 
 * Definitions, terms and conditions for using RGM Sources are stated by ArSysOp Source License version 1.0.
 * See http://arsysop.ru/licenses/rgm/ArSysOpSourceLicense-1.0.txt
 * 
 * RGM Sources are provided on "as is" basis. 
 * ArSysOp is not responsible for any damages, losses, legal prosecution 
 * or other consequences of any sort that using RGM Sources can cause to you 
 * (as an individual or Legal Entity), even if aware of such consequences.
 * 
*******************************************************************************/
package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.IsDiv;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.PickId;
import ru.arsysop.loft.rgm.spec.model.api.DomElement;
import ru.arsysop.loft.rgm.spec.model.api.Index;
import ru.arsysop.loft.rgm.spec.model.api.IndexEntry;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class IndexStructure extends BaseStructure<Index> {

	private final SpecFactory factory;

	public IndexStructure(Index container, ResolutionContext context) {
		super(container, context);
		this.factory = SpecFactory.eINSTANCE;
	}

	@Override
	public void body(DomElement body) {
		DomElement wrapper = body.node(0).get();
		createEntries(wrapper);
		fillReferences(wrapper);
	}

	private void fillReferences(DomElement wrapper) {
		IntStream.range(0, wrapper.nodeCount()) //
				.mapToObj(wrapper::node) //
				.map(Optional::get) //
				.filter(DomElement.class::isInstance) //
				.map(DomElement.class::cast) //
				.filter(new IsDiv()) //
				.forEach(this::fillEntry);
	}

	private void createEntries(DomElement wrapper) {
		for (int i = 0; i < wrapper.nodeCount(); i++) {
			Optional<DomElement> node = wrapper.node(i);
			if (node.isPresent()) {
				DomElement element = node.get();
				switch (element.name()) {
				case "div": //$NON-NLS-1$
					topLevelIndexEntry(element);
					break;
				case "h1": //$NON-NLS-1$
					container.setName(element.text());
					break;
				default:
					System.err.println("TOC unknown: " + node); //$NON-NLS-1$
					break;
				}
			}
		}
	}

	private void topLevelIndexEntry(DomElement node) {
		IndexEntry entry = createIndexEntry(node);
		container.getEntries().add(entry);
	}

	private void fillEntry(DomElement node) {
		DomElement div = node.element("div").orElse(node); //$NON-NLS-1$
		String id = node.attributeValue("id").get(); //$NON-NLS-1$
		Optional<IndexEntry> found = context.indexEntries().find("#" + id); //$NON-NLS-1$
		if (found.isPresent()) {
			IndexEntry entry = found.get();
			List<DomElement> refNodes = div.elements("a"); //$NON-NLS-1$
			List<DomElement> seeNodes = div.elements("i").stream() //$NON-NLS-1$
					.filter(i -> "see".equals(i.text())) //$NON-NLS-1$
					.collect(Collectors.toList());
			if (seeNodes.size() > 0) { // Assuming see case
				IntStream.range(0, seeNodes.size()) //
						.mapToObj(refNodes::get) //
						.map(element -> element.attributeValue("href").get()) //$NON-NLS-1$
						.map(context.indexEntries()::find) //
						.filter(Optional::isPresent) //
						.map(Optional::get) //
						.forEach(entry.getSee()::add);
			} else { // Just a link otherwise
				refNodes.stream() //
						.map(element -> element.attributeValue("href").get()) //$NON-NLS-1$
						.map(href -> href.split("#")[0]) //$NON-NLS-1$
						.map(new PickId(context)) //
						.map(context.parts()::find) //
						.filter(Optional::isPresent) //
						.map(Optional::get) //
						.forEach(entry.getParts()::add);
			}
			div.elements("div").stream().forEach(this::fillEntry); //$NON-NLS-1$
		} else {
			System.err.println("No references were found for " + id); //$NON-NLS-1$
		}
	}

	private IndexEntry createIndexEntry(DomElement node) {
		DomElement div = node.element("div").orElse(node); //$NON-NLS-1$
		IndexEntry entry = factory.createIndexEntry();
		entry.setText(div.element("span").map(DomElement::text).orElse("")); //$NON-NLS-1$//$NON-NLS-2$
		entry.setKeyword(node.attributeValue("id").get()); //$NON-NLS-1$ FIXME: AF: not sure, it could be a dedicated
															// entity
		entry.setId(node.attributeValue("id").get()); //$NON-NLS-1$
		div.elements("div").stream().map(this::createIndexEntry).forEach(entry.getSubentries()::add); //$NON-NLS-1$
		context.indexEntries().register("#" + entry.getId(), entry); //$NON-NLS-1$
		return entry;
	}

}
