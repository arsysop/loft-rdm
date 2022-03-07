/*******************************************************************************
 * Copyright (c) 2018-2022 ArSysOp.
 *******************************************************************************/
package ru.arsysop.loft.rgm.base.workbench.wizards;

import java.util.Objects;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.passage.lic.api.requirements.Feature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import ru.arsysop.loft.rgm.base.workbench.RestrictedControls;
import ru.arsysop.loft.rgm.internal.base.workbench.Messages;
import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;

public final class EmfModelWizardPage extends WizardNewFileCreationPage {

	private final String formatted;
	private final Feature feature;
	private final RestrictedControls restricted;

	public EmfModelWizardPage(String formatted, IStructuredSelection selection, Feature feature) {
		super(EmfModelWizardPage.class.getName(), selection);
		this.feature = feature;
		this.restricted = new RestrictedControls(feature);
		this.formatted = Objects.requireNonNull(formatted);
	}

	@Override
	public final void createControl(Composite parent) {
		if (new RgmLicenseProtection().cannotUse(feature)) {
			setControl(restricted.createLink(parent));
		} else {
			super.createControl(parent);
		}
	}

	@Override
	protected boolean validatePage() {
		if (super.validatePage()) {
			if (!formatted.equals(new Path(getFileName()).getFileExtension())) {
				setErrorMessage(NLS.bind(Messages.BaseModelWizardPage_e_extension, new Object[] { formatted }));
				return false;
			}
			return true;
		}
		return false;
	}

	@Override
	public void setVisible(boolean visible) {
		Control control = getControl();
		if (restricted.isRestricted(control)) {
			control.setVisible(visible);
		} else {
			super.setVisible(visible);
		}
	}

}