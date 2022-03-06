/*******************************************************************************
 * Copyright (c) 2018-2022 ArSysOp.
 *******************************************************************************/
package ru.arsysop.loft.rgm.internal.spec.workbench;

import java.util.Objects;
import java.util.Optional;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import ru.arsysop.loft.rgm.seal.protection.RgmFeatures;
import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;
import ru.arsysop.loft.rgm.spec.model.api.Part;

public final class BrowserView extends ViewPart implements ISelectionListener {

	private Browser browser;

	@Override
	public void createPartControl(Composite parent) {
		if (new RgmLicenseProtection().cannotUse(new RgmFeatures.Spec().browser())) {
			new IncufficientLicenseCoverageControl().install(parent);
			return;
		}
		browser = new Browser(parent, SWT.NONE);
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
	}

	@Override
	public void setFocus() {
		browser.setFocus();
	}

	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);
		browser.dispose();
		super.dispose();
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		Optional.of(selection) //
				.filter(IStructuredSelection.class::isInstance) //
				.map(IStructuredSelection.class::cast) //
				.map(IStructuredSelection::getFirstElement)//
				.map(f -> Adapters.adapt(f, Part.class))//
				.filter(Objects::nonNull)//
				.map(Part::getLocation) //
				.ifPresent(this::changeLocation);
	}

	private void changeLocation(String location) {
		if (!browser.isDisposed()) {
			browser.setUrl(location);
		}
	}

}
