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
package ru.arsysop.loft.rgm.base.workbench.actions;

import java.util.Objects;
import java.util.function.Supplier;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import ru.arsysop.loft.rgm.internal.base.workbench.Messages;

public final class ShowPropertiesViewAction extends Action {

	private final Supplier<IWorkbenchPage> page;

	public ShowPropertiesViewAction(Supplier<IWorkbenchPage> page) {
		super(Messages.ShowPropertiesViewAction_text);
		this.page = Objects.requireNonNull(page);
	}

	@Override
	public void run() {
		try {
			page.get().showView(IPageLayout.ID_PROP_SHEET);
		} catch (PartInitException exception) {
			Bundle bundle = FrameworkUtil.getBundle(getClass());
			Platform.getLog(bundle)
					.log(new Status(IStatus.ERROR, bundle.getSymbolicName(), exception.getMessage(), exception));
		}
	}
}