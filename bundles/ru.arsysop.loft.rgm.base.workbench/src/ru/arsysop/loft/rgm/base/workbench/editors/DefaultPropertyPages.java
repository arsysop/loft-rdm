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
	public IPropertySheetPage createPropertyPage(AdapterFactoryEditingDomain domain, EmfModelEditor editor) {
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
