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
package ru.arsysop.loft.rgm.seal.library;

import java.nio.file.Path;
import java.util.function.Predicate;

final class RelevantLicense implements Predicate<Path> {

	@Override
	public boolean test(Path license) {
		return canBeRead(license);
	}

	private boolean canBeRead(Path license) {
		return new RgmLicenseReadingService().service().read(license).data()//
				.map(c -> !c.isEmpty())//
				.orElse(Boolean.FALSE);
	}

}
