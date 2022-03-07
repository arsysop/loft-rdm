package ru.arsysop.loft.rgm.seal.protection;

import org.eclipse.passage.lic.api.LicensingException;
import org.eclipse.passage.lic.base.BasePassage;

import ru.arsysop.loft.rgm.seal.RgmFrameworkAware;

public final class RgmLicenseProtection {

	public boolean canUse(String feature) {
		BasePassage passage = new BasePassage(new RgmFrameworkAware());
		return passage.canUse(feature) && passage.canUse(new RgmFeatures().library());
	}

	public boolean cannotUse(String feature) {
		return !canUse(feature);
	}

	public void checkCanLoadSpec() {
		checkCanUse(new RgmFeatures.Spec().load());
	}

	public void checkCanLoadSynopsis() {
		checkCanUse(new RgmFeatures.Synopsis().load());
	}

	public void checkCanLoadMarkup() {
		checkCanUse(new RgmFeatures.Markup().load());
	}
	
	public void checkCanImportCxx14() {
		checkCanUse(new RgmFeatures.CxxDraft().importCxx14());
	}

	private void checkCanUse(String feature) {
		if (canUse(feature)) {
			return;
		}
		throw noLicense(feature);
	}

	private RuntimeException noLicense(String feature) {
		return new RuntimeException(
				new LicensingException(String.format("No license coverage for feature %s", feature)));
	}
	
}
