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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import ru.arsysop.loft.rgm.spec.model.api.DomElement;

public final class ExtractSubElementText implements Function<DomElement, String> {

	private final List<String> names;

	public ExtractSubElementText(String... names) {
		this(Arrays.asList(names));
	}

	public ExtractSubElementText(List<String> names) {
		this.names = new ArrayList<String>(names);
	}

	@Override
	public String apply(DomElement element) {
		return names.stream()//
				.map(n -> element.elementText(n))//
				.filter(Objects::nonNull)//
				.map(String::trim)//
				.findFirst()//
				.orElse(""); //$NON-NLS-1$
	}

}
