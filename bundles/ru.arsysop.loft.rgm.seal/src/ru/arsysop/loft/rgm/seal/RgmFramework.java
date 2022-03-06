package ru.arsysop.loft.rgm.seal;

import org.eclipse.passage.lic.api.AccessCycleConfiguration;
import org.eclipse.passage.lic.api.Framework;
import org.eclipse.passage.lic.api.LicensedProduct;
import org.eclipse.passage.lic.base.BaseLicensedProduct;
import org.eclipse.passage.lic.execute.FocusedAccessCycleConfiguration;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import ru.arsysop.loft.rgm.seal.protection.RgmFeatures;

public final class RgmFramework implements Framework {

	private static RgmFramework instance = null;
	private final LicensedProduct library;
	private final AccessCycleConfiguration configuration;

	private RgmFramework() {
		this.library = new BaseLicensedProduct(new RgmFeatures().library(), "0.1.0");
		this.configuration = new FocusedAccessCycleConfiguration.Wide(this::product, this::bundle);
	}

	public static RgmFramework instance() {
		if (instance == null) {
			synchronized (RgmFramework.class) {
				if (instance == null) {
					instance = new RgmFramework();
				}
			}
		}
		return instance;
	}

	@Override
	public LicensedProduct product() {
		return library;
	}

	@Override
	public AccessCycleConfiguration accessCycleConfiguration() {
		return configuration;
	}

	private Bundle bundle() {
		return FrameworkUtil.getBundle(RgmFramework.class);
	}

}
