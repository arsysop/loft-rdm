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

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;

public final class PointText implements Function<Element, String> {

	@Override
	public String apply(Element node) {
		return Stream.of(fromParagraphs(node), fromItemDescr(node)) //
				.collect(Collectors.joining(" ")); //$NON-NLS-1$
	}

	private String fromParagraphs(Element node) {
		return node.elements("p").stream() //$NON-NLS-1$
				.map(new CollectText()) //
				.collect(Collectors.joining("\n")); //$NON-NLS-1$
	}

	private String fromItemDescr(Element node) {
		return node.elements("div").stream() // //$NON-NLS-1$
				.filter(new OfClass("itemdescr")) //$NON-NLS-1$
				.map(new CollectText()) //
				.collect(Collectors.joining());
	}
}
