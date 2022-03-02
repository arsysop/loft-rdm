/*******************************************************************************
 * Copyright (c) 2022 ArSysOp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     (ArSysOp) - initial API and implementation
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
