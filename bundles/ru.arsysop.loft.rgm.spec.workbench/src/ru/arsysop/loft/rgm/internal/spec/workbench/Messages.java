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
package ru.arsysop.loft.rgm.internal.spec.workbench;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "ru.arsysop.loft.rgm.internal.spec.workbench.messages"; //$NON-NLS-1$

	public static String ImportSpecificationWizard_title;
	public static String ImportSpecificationWizard_failure;

	public static String ImportSpecificationWizardConfigurationPage_title;
	public static String ImportSpecificationWizardConfigurationPage_defaultMessage;
	public static String ImportSpecificationWizardConfigurationPage_viewerName;
	public static String ImportSpecificationWizardConfigurationPage_groupTitle;

	public static String ImportSpecificationWizardPreviewPage_title;
	public static String ImportSpecificationWizardPreviewPage_defaultMessage;
	public static String ImportSpecificationWizardPreviewPage_progressMessage;
	public static String ImportSpecificationWizardPreviewPage_groupTitle;
	public static String ImportSpecificationWizardPreviewPage_failed;

	public static String RevisionLicenseCoverageValidation_noLicense;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
