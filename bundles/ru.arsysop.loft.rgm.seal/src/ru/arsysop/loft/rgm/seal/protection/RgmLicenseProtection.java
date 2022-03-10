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
//		BasePassage passage = new BasePassage(new RgmFrameworkAware());
//		return passage.canUse(feature) && passage.canUse(new RgmFeatures().library().identifier());
		return true;
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
				new LicensingException(String.format("No license coverage for feature %s", feature)));
	}

	public void checkCanImportCxx14() {
		checkCanUse(new RgmFeatures.CxxDraft().importCxx14());
	}

	private void checkCanUse(Feature feature) {
		if (canUse(feature)) {
			return;
		}
		throw noLicense(feature);
	}

	private RuntimeException noLicense(Feature feature) {
		return new RuntimeException(
				new LicensingException(String.format("No license coverage for feature %s", feature)));
	}
	
}
