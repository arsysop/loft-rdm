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

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.jface.wizard.Wizard;

import ru.arsysop.loft.rgm.base.emf.command.RecordingCommand;
import ru.arsysop.loft.rgm.internal.spec.workbench.Messages;
import ru.arsysop.loft.rgm.spec.edit.EObjectEditingDomain;
import ru.arsysop.loft.rgm.spec.model.api.Document;

public final class ImportSpecificationWizard extends Wizard {

	private final ImportSpecificationWizardConfigurationPage configuration;
	private final ImportSpecificationWizardPreviewPage preview;
	private final Document document;

	public ImportSpecificationWizard(Document document) {
		this.document = document;
		this.configuration = new ImportSpecificationWizardConfigurationPage(() -> this.document);
		this.preview = new ImportSpecificationWizardPreviewPage(() -> this.document, configuration::url);
		setNeedsProgressMonitor(true);
		setWindowTitle(Messages.ImportSpecificationWizard_title);
	}

	@Override
	public boolean performFinish() {
		// Do nothing since results cannot be gracefully applied here.
		return true;
	}

	@Override
	public boolean performCancel() {
		CommandStack stack = new EObjectEditingDomain().apply(document).getCommandStack();
		if (stack.getMostRecentCommand() instanceof RecordingCommand) {
			stack.undo();
		}
		return true;
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

}
