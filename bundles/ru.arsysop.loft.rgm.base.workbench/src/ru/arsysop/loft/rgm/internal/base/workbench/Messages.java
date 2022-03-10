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
package ru.arsysop.loft.rgm.internal.base.workbench;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "ru.arsysop.loft.rgm.internal.base.workbench.messages"; //$NON-NLS-1$
	public static String BaseActionBarContributor_menu_new_child;
	public static String BaseActionBarContributor_menu_new_sibling;
	public static String BaseActionBarContributor_refresh_text;
	public static String BaseModelEditor_e_file_problem;
	public static String BaseModelEditor_page_text;
	public static String BaseModelEditor_q_conflict_description;
	public static String BaseModelEditor_q_conflict_title;
	public static String BaseModelEditor_selected_many;
	public static String BaseModelEditor_selected_one;
	public static String BaseModelEditor_selected_zero;
	public static String BaseModelWizard_description;
	public static String BaseModelWizard_title;
	public static String BaseModelWizardPage_e_extension;
	public static String ShowPropertiesViewAction_text;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
