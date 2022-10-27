package ru.arsysop.loft.rgm.internal.spec.workbench.handlers;

import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;

public final class ImportCxx14SpecHandler extends ImportSpecHandler {

	@Override
	protected void checkCanImport(RgmLicenseProtection protection) {
		protection.checkCanImportCxx14();
	}

}
