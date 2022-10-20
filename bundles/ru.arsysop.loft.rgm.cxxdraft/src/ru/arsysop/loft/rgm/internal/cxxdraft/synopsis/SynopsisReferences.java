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
package ru.arsysop.loft.rgm.internal.cxxdraft.synopsis;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.WithId;
import ru.arsysop.loft.rgm.internal.cxxdraft.paragraph.PartReferences;
import ru.arsysop.loft.rgm.spec.model.api.DomElement;
import ru.arsysop.loft.rgm.spec.model.api.Part;

public final class SynopsisReferences implements Function<DomElement, List<Part>> {

	private final ResolutionContext context;

	public SynopsisReferences(ResolutionContext context) {
		this.context = context;
	}

	@Override
	public List<Part> apply(DomElement node) {
		return Stream.of(node) //
				.map(e -> e.elements("span")) //$NON-NLS-1$
				.flatMap(List::stream) //
				.filter(new WithId("comment")) //$NON-NLS-1$
				.map(new PartReferences(context)) //
				.flatMap(List::stream) //
				.collect(Collectors.toList());
	}

}
