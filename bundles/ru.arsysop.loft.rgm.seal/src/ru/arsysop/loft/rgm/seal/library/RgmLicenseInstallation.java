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
import java.util.function.Function;

import org.eclipse.passage.lic.api.LicensedProduct;
import org.eclipse.passage.lic.api.ServiceInvocationResult;
import org.eclipse.passage.lic.api.diagnostic.Trouble;
import org.eclipse.passage.lic.base.BaseServiceInvocationResult;
import org.eclipse.passage.lic.base.diagnostic.code.ServiceFailedOnMorsel;
import org.eclipse.passage.lic.base.io.ExternalLicense;

import ru.arsysop.loft.rgm.seal.RgmFramework;

final class RgmLicenseInstallation implements Function<Path, ServiceInvocationResult<Boolean>> {
	private final LicensedProduct product;

	RgmLicenseInstallation() {
		this.product = RgmFramework.instance().product();
	}

	@Override
	public ServiceInvocationResult<Boolean> apply(Path license) {
		if (new RelevantLicense().test(license)) {
			return install(license);
		}
		return foreignLicense(license);
	}

	private ServiceInvocationResult<Boolean> install(Path license) {
		try {
			new ExternalLicense(product).install(license);
		} catch (Exception e) {
			return failure(license, e);
		}
		return success();
	}

	private ServiceInvocationResult<Boolean> success() {
		return new BaseServiceInvocationResult<>(Boolean.TRUE);
	}

	private ServiceInvocationResult<Boolean> failure(Path license, Exception e) {
		return new BaseServiceInvocationResult<>(new Trouble(new ServiceFailedOnMorsel(), //
				String.format("Failed to install license %s for library [%s v%s]", //$NON-NLS-1$
						license, product.identifier(),
						product.version()), //
				e));
	}

	private ServiceInvocationResult<Boolean> foreignLicense(Path license) {
		return new DoesNotBelongToRgm().license(license);
	}

}
