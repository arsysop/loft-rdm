package ru.arsysop.loft.rgm.internal.cxxdraft;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "ru.arsysop.loft.rgm.internal.cxxdraft.messages"; //$NON-NLS-1$
	public static String PublishedHtml_e_parsing_failed;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
