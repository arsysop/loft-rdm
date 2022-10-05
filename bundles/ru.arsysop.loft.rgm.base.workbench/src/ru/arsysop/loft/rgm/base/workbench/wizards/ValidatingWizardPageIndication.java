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
package ru.arsysop.loft.rgm.base.workbench.wizards;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.IMessageProvider;

public final class ValidatingWizardPageIndication {

	private final ValidatingWizardPage<?> page;

	public ValidatingWizardPageIndication(ValidatingWizardPage<?> page) {
		this.page = page;
	}

	public void update(IStatus status) {
		switch (status.getSeverity()) {
		case IStatus.OK:
			page.setErrorMessage(null);
			page.setMessage(page.defaultMessage());
			page.setPageComplete(true);
			break;
		case IStatus.ERROR:
			page.setErrorMessage(status.getMessage());
			page.setPageComplete(false);
			break;
		case IStatus.WARNING:
			page.setErrorMessage(null);
			page.setMessage(status.getMessage(), IMessageProvider.WARNING);
			page.setPageComplete(true);
			break;
		default:
			// Do nothing
			break;
		}
	}

}
