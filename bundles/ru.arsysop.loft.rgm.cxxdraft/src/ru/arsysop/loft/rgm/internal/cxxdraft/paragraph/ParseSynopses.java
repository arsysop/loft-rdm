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
package ru.arsysop.loft.rgm.internal.cxxdraft.paragraph;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.WithId;
import ru.arsysop.loft.rgm.spec.model.api.Point;
import ru.arsysop.loft.rgm.spec.model.api.Synopsis;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

final class ParseSynopses {

	private final SpecFactory factory;
	private final ResolutionContext context;
	private int count = 0;

	ParseSynopses(SpecFactory factory, ResolutionContext context) {
		this.factory = factory;
		this.context = context;
	}

	List<Synopsis> parse(Point point, Element node) {
		return node.elements("pre").stream() //$NON-NLS-1$
				.filter(new OfClass("codeblock")) //$NON-NLS-1$
				.map(e -> synopsis(point, e)) //
				.collect(Collectors.toList());
	}

	private Synopsis synopsis(Point point, Element element) {
		Synopsis synopsis = factory.createSynopsis();
		synopsis.setLocation(point.getLocation());
		synopsis.setId(point.getId().concat("_synopsis" + count)); //$NON-NLS-1$
		synopsis.setName(point.getName().concat(" Synopsis")); //$NON-NLS-1$
		synopsis.setNumber(point.getNumber().concat("-" + count++)); //$NON-NLS-1$
		collectText(element, synopsis);
		collectReferences(element, synopsis);
		return synopsis;
	}

	private void collectText(Element element, Synopsis synopsis) {
		Optional.of(element).map(new CollectText()).ifPresent(synopsis::setContent);
	}

	private void collectReferences(Element element, Synopsis synopsis) {
		Stream.of(element) //
				.map(e -> e.elements("span")) //$NON-NLS-1$
				.flatMap(List::stream) //
				.filter(new WithId("comment")) //$NON-NLS-1$
				.map(new ParseReferences(context)) //
				.flatMap(List::stream) //
				.forEach(synopsis.getReferences()::add);
	}

}
