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
