package ru.arsysop.loft.rgm.base.emf.xmi;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.passage.lic.api.requirements.Feature;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;

public abstract class RestrictedXmiResourceImpl extends XMIResourceImpl {

	protected final Feature feature;

	public RestrictedXmiResourceImpl(URI uri, Feature feature) {
		super(uri);
		this.feature = feature;
	}

	@Override
	public final void doLoad(InputSource inputSource, Map<?, ?> options) throws IOException {
		new RgmLicenseProtection().checkCanLoad(feature);
		super.doLoad(inputSource, options);
	}

	@Override
	public final void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		new RgmLicenseProtection().checkCanLoad(feature);
		super.doLoad(inputStream, options);
	}

	@Override
	public final void doLoad(Node node, Map<?, ?> options) throws IOException {
		new RgmLicenseProtection().checkCanLoad(feature);
		super.doLoad(node, options);
	}

	@Override
	protected void init() {
		super.init();
		Map<Object, Object> options = getDefaultLoadOptions();
		options.put(OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		options.put(OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
	}

}
