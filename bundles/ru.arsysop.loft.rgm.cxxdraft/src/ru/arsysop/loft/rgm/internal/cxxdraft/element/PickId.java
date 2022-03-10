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

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;

public final class PickId implements Function<String, String> {

	private final ResolutionContext context;

	public PickId(ResolutionContext context) {
		this.context = context;
	}

	@Override
	public String apply(String link) {
		return link.replace(context.location(), ""); //$NON-NLS-1$
	}

}
