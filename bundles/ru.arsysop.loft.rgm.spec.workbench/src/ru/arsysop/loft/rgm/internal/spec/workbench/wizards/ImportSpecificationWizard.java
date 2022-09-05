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
package ru.arsysop.loft.rgm.internal.spec.workbench.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.statushandlers.StatusManager;

import ru.arsysop.loft.rgm.internal.spec.workbench.Messages;
import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.workspace.interchange.ImportSpecificationContent;

public final class ImportSpecificationWizard extends Wizard {

	private final ImportSpecificationWizardConfigurationPage configuration;
	private final ImportSpecificationWizardPreviewPage preview;
	private final Document document;
	private final ImportSpecificationContent operation;

	public ImportSpecificationWizard(Document document) {
		this.document = document;
		this.operation = new ImportSpecificationContent(document);
		this.configuration = new ImportSpecificationWizardConfigurationPage(() -> this.document);
		this.preview = new ImportSpecificationWizardPreviewPage(() -> this.document, configuration::url, operation);
		setNeedsProgressMonitor(true);
		setWindowTitle(Messages.ImportSpecificationWizard_title);
	}

	@Override
	public boolean performFinish() {
		return run(monitor -> operation.accept(monitor, configuration.url()),
				Messages.ImportSpecificationWizard_failure);
	}

	@Override
	public boolean performCancel() {
		return run(monitor -> operation.revert(monitor), //
				Messages.ImportSpecificationWizard_failure);
	}

	@Override
	public void addPages() {
		addPage(configuration);
		addPage(preview);
	}

	@Override
	public boolean canFinish() {
		return preview.isPageComplete();
	}

	private boolean run(Consumer<IProgressMonitor> action, String message) {
		try {
			getContainer().run(true, false, new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					action.accept(monitor);
				}
			});
			return true;
		} catch (InvocationTargetException | InterruptedException e) {
			StatusManager.getManager().handle(new Status(IStatus.ERROR, getClass(), message, e));
			return false;
		}

	}

}
