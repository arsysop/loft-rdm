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
package ru.arsysop.loft.rgm.base.workbench.editors;

import java.util.List;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

public final class DefaultPropertyPages implements PropertySheetPages {

	@Override
	public IPropertySheetPage createPropertyPage(AdapterFactoryEditingDomain domain, BaseModelEditor editor) {
		PropertySheetPage page = new ExtendedPropertySheetPage(domain, ExtendedPropertySheetPage.Decoration.LIVE,
				editor.getDialogSettings(), 0, false) {
			@Override
			public void setSelectionToViewer(List<?> selection) {
				editor.setSelectionToViewer(selection);
				editor.setFocus();
			}

			@Override
			public void setActionBars(IActionBars actionBars) {
				super.setActionBars(actionBars);
				editor.getActionBarContributor().shareGlobalActions(this, actionBars);
			}
		};
		page.setPropertySourceProvider(new AdapterFactoryContentProvider(domain.getAdapterFactory()));
		return page;
	}

}
