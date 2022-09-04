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
package ru.arsysop.loft.rgm.internal.spec.workbench.handlers;

import java.util.Optional;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import ru.arsysop.loft.rgm.internal.spec.workbench.wizards.ImportSpecificationWizard;
import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;
import ru.arsysop.loft.rgm.spec.model.api.Document;

public final class ImportSpecHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		checkLicense();
		Optional<Document> document = selected(event);
		if (document.isPresent()) {
			ImportSpecificationWizard wizard = new ImportSpecificationWizard(document.get());
			WizardDialog dialog = new WizardDialog(shell(event), wizard);
			dialog.open();
		}
		return null;
	}

	private Shell shell(ExecutionEvent event) {
		return Optional.ofNullable(HandlerUtil.getActiveShell(event)) //
				.orElseGet(Display.getDefault()::getActiveShell);
	}

	private Optional<Document> selected(ExecutionEvent event) {
		Optional<Document> document = Optional.ofNullable(HandlerUtil.getCurrentSelection(event)) //
				.filter(IStructuredSelection.class::isInstance) //
				.map(IStructuredSelection.class::cast) //
				.map(IStructuredSelection::getFirstElement) //
				.filter(Document.class::isInstance) //
				.map(Document.class::cast); //
		return document;
	}

	private void checkLicense() throws ExecutionException {
		try {
			new RgmLicenseProtection().checkCanImportCxx14();
		} catch (RuntimeException cannot) {
			throw new ExecutionException("Insufficient license coverage", cannot); //$NON-NLS-1$
		}
	}

}
