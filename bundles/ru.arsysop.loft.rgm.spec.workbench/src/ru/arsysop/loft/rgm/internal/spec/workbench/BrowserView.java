/*******************************************************************************
 * Copyright (c) 2018-2022 ArSysOp.
 *******************************************************************************/
package ru.arsysop.loft.rgm.internal.spec.workbench;

import java.util.Objects;
import java.util.Optional;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.passage.lic.api.requirements.Feature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import ru.arsysop.loft.rgm.base.workbench.RestrictedControls;
import ru.arsysop.loft.rgm.seal.RgmFeatures;
import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;
import ru.arsysop.loft.rgm.spec.model.api.Part;

public final class BrowserView extends ViewPart implements ISelectionListener {

	private final Feature feature = new RgmFeatures.Spec().browser();
	private Browser browser;


	@Override
	public void createPartControl(Composite parent) {
		if (new RgmLicenseProtection().cannotUse(feature)) {
			new RestrictedControls(feature).createLink(parent);
			return;
		}
		browser = new Browser(parent, SWT.NONE);
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
	}

	@Override
	public void setFocus() {
		if (browser != null) {
			browser.setFocus();
		}
	}

	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);
		if (browser != null) {
			browser.dispose();
		}
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
