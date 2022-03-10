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

import java.util.function.Supplier;

import org.eclipse.passage.lic.api.Framework;
import org.eclipse.passage.lic.api.ServiceInvocationResult;
import org.eclipse.passage.lic.api.conditions.mining.LicenseReadingService;
import org.eclipse.passage.lic.base.BaseServiceInvocationResult;
import org.eclipse.passage.lic.base.conditions.mining.BaseLicenseReadingService;

import ru.arsysop.loft.rgm.seal.RgmFramework;

final class RgmLicenseReadingService implements Supplier<ServiceInvocationResult<LicenseReadingService>> {

	@Override
	public ServiceInvocationResult<LicenseReadingService> get() {
		return new BaseServiceInvocationResult<>(service());
	}

	LicenseReadingService service() {
		Framework framework = RgmFramework.instance();
		return new BaseLicenseReadingService(framework.product(),
				framework.accessCycleConfiguration().miningEquipment());
	}

}
