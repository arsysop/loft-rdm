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

import org.eclipse.passage.lic.api.LicensedProduct;
import org.eclipse.passage.lic.api.ServiceInvocationResult;
import org.eclipse.passage.lic.api.agreements.AgreementAcceptanceService;
import org.eclipse.passage.lic.api.agreements.AgreementToAccept;
import org.eclipse.passage.lic.api.conditions.mining.LicenseReadingService;
import org.eclipse.passage.lic.api.restrictions.ExaminationCertificate;
import org.eclipse.passage.lic.base.BasePassage;
import org.eclipse.passage.lic.internal.base.access.Library;

import ru.arsysop.loft.rgm.seal.RgmFramework;
import ru.arsysop.loft.rgm.seal.RgmFrameworkAware;

@SuppressWarnings("restriction")
public final class RgmLibrary implements Library {

	@Override
	public LicensedProduct product() {
		return RgmFramework.instance().product();
	}

	@Override
	public ServiceInvocationResult<ExaminationCertificate> assess() {
		return new BasePassage(new RgmFrameworkAware()).assess();
	}

	@Override
	public ServiceInvocationResult<AgreementAcceptanceService> agreementsService(AgreementToAccept agreement) {
		return new RgmAgreementService(agreement).get();
	}

	@Override
	public ServiceInvocationResult<LicenseReadingService> licenseReadingService() {
		return new RgmLicenseReadingService().get();
	}

	@Override
	public ServiceInvocationResult<Boolean> installLicense(Path license) {
		return new RgmLicenseInstallation().apply(license);
	}

}
