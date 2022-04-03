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

import org.dom4j.Element;
import org.dom4j.Node;

public final class CollectText implements Function<Element, String> {

	@Override
	public String apply(Element node) {
		return parse(node).trim();
	}

	private String parse(Node node) {
		if (node instanceof Element) {
			return Element.class.cast(node).content() //
					.stream() //
					.map(this::parse) //
					.collect(Collectors.joining(" ")); //$NON-NLS-1$
		} else {
			return node.getText();
		}

	}

}
