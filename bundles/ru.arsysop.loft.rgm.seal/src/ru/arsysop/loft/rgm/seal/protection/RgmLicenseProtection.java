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
package ru.arsysop.loft.rgm.seal.protection;

import java.io.IOException;

import org.eclipse.passage.lic.api.LicensingException;
import org.eclipse.passage.lic.api.requirements.Feature;
import org.eclipse.passage.lic.base.BasePassage;

import ru.arsysop.loft.rgm.seal.RgmFeatures;
import ru.arsysop.loft.rgm.seal.RgmFrameworkAware;

public final class RgmLicenseProtection {
	
	public boolean cannotUse(Feature feature) {
		return !canUse(feature.identifier());
	}

	public boolean canUse(Feature feature) {
		return canUse(feature.identifier());
	}
	
	public boolean canUse(String feature) {
		BasePassage passage = new BasePassage(new RgmFrameworkAware());
		return passage.canUse(feature) && passage.canUse(new RgmFeatures().library().identifier());
	}

	public boolean cannotUse(String feature) {
		return !canUse(feature);
	}

	public void checkCanLoadSpec() {
		checkCanUse(new RgmFeatures.Spec().load());
	}

	public void checkCanLoad(Feature feature) throws IOException {
		if (canUse(feature)) {
			return;
		}
		throw new IOException(//
				new LicensingException(String.format("No license coverage for feature %s", feature))); //$NON-NLS-1$
	}

	public void checkCanImportCxx14() {
		checkCanUse(new RgmFeatures.Cxx().importCxx14());
	}

	public void checkCanImportCxx17() {
		checkCanUse(new RgmFeatures.Cxx().importCxx17());
	}

	private void checkCanUse(Feature feature) {
		if (canUse(feature)) {
			return;
		}
		throw noLicense(feature);
	}

	private RuntimeException noLicense(Feature feature) {
		return new RuntimeException(
				new LicensingException(String.format("No license coverage for feature %s", feature))); //$NON-NLS-1$
	}
	
}
