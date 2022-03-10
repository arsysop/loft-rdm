package ru.arsysop.loft.rgm.seal;

import org.eclipse.passage.lic.api.AccessCycleConfiguration;
import org.eclipse.passage.lic.api.Framework;
import org.eclipse.passage.lic.api.LicensedProduct;
import org.eclipse.passage.lic.api.requirements.Feature;
import org.eclipse.passage.lic.base.BaseLicensedProduct;
import org.eclipse.passage.lic.execute.NamespaceConfiguraton;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public final class RgmFramework implements Framework {

	private static RgmFramework instance = null;
	private final LicensedProduct library;
	private final AccessCycleConfiguration configuration;

	private RgmFramework() {
		Feature feature = new RgmFeatures().library();
		this.library = new BaseLicensedProduct(feature.identifier(), feature.version());
		this.configuration = new NamespaceConfiguraton(new RgmFeatures().namespace(), this::product, this::bundle);
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
