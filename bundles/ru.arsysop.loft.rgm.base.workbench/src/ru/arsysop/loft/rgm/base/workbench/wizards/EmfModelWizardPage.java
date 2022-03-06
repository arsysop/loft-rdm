/*******************************************************************************
 * Copyright (c) 2018-2022 ArSysOp.
 *******************************************************************************/
package ru.arsysop.loft.rgm.base.workbench.wizards;

import java.util.Objects;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import ru.arsysop.loft.rgm.base.workbench.IncufficientLicenseCoverageControl;
import ru.arsysop.loft.rgm.internal.base.workbench.Messages;
import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;

public final class EmfModelWizardPage extends WizardNewFileCreationPage {

	private final String formatted;
	private final String feature;

	public EmfModelWizardPage(String formatted, IStructuredSelection selection, String feature) {
		super(EmfModelWizardPage.class.getName(), selection);
		this.feature = feature;
		this.formatted = Objects.requireNonNull(formatted);
	}

	@Override
	public final void createControl(Composite parent) {
		if (new RgmLicenseProtection().cannotUse(feature)) {
			new IncufficientLicenseCoverageControl(parent, feature).get();
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

}