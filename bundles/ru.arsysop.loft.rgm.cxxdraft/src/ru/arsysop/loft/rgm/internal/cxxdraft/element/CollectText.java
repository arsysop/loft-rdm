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
package ru.arsysop.loft.rgm.internal.cxxdraft.element;

import java.util.function.Function;
import java.util.stream.Collectors;

import org.dom4j.Element;
import org.dom4j.Node;

public final class CollectText implements Function<Element, String> {

	private final String separator;

	public CollectText(String separator) {
		this.separator = separator;
	}

	@Override
	public String apply(Element element) {
		return element.content().stream().map(Node::getText).collect(Collectors.joining(separator)); // $NON-NLS-1$;
	}

}
