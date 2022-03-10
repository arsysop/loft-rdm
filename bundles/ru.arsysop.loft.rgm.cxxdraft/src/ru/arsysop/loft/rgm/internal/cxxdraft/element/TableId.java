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

import ru.arsysop.loft.rgm.spec.model.api.Table;

public final class TableId implements Function<Table, String> {

	/**
	 * Removes the first part of id to make table reference-able from point
	 */
	@Override
	public String apply(Table table) {
		return "#" + table.getId().split("#")[1]; //$NON-NLS-1$ //$NON-NLS-2$
	}

}
