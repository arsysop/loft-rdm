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

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import org.dom4j.Element;

public final class OfClass implements Predicate<Element> {

	private final List<String> className;

	public OfClass(String... className) {
		this.className = Arrays.asList(className);
	}

	@Override
	public boolean test(Element element) {
		return className.stream() //
				.filter(Objects::nonNull) //
				.filter(required -> required.equals(element.attributeValue("class"))) //$NON-NLS-1$
				.count() > 0;
	}

}
