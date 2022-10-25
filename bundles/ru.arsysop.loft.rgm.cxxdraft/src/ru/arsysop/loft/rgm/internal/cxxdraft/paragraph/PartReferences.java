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
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.PickId;
import ru.arsysop.loft.rgm.spec.model.api.DomElement;
import ru.arsysop.loft.rgm.spec.model.api.Part;

public final class PartReferences implements Function<DomElement, List<Part>> {

	private final ResolutionContext context;

	public PartReferences(ResolutionContext context) {
		this.context = context;
	}

	@Override
	public List<Part> apply(DomElement node) {
		return deep(node).distinct().collect(Collectors.toList());
	}

	private Stream<Part> deep(DomElement node) {
		return Stream.concat(direct(node), others(node));
	}

	private Stream<Part> direct(DomElement node) {
		return node.elements("a").stream() //$NON-NLS-1$
				.map(a -> a.attributeValue("href")) //$NON-NLS-1$
				.filter(Optional::isPresent)//
				.map(Optional::get)//
				.map(new PickId(context)) //
				.map(context.parts()::find) //
				.filter(Optional::isPresent) //
				.map(Optional::get);
	}

	private Stream<Part> others(DomElement node) {
		return node.elements().stream()//
				.filter(e -> !"a".equals(e.name()))//$NON-NLS-1$
				.flatMap(this::deep);
	}

}
