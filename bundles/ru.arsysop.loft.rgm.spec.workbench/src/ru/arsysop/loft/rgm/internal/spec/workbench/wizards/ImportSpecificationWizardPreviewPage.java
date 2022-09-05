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
import java.util.function.Supplier;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.statushandlers.StatusManager;

import ru.arsysop.loft.rgm.internal.spec.workbench.Messages;
import ru.arsysop.loft.rgm.spec.model.api.Document;

public final class ImportSpecificationWizardPreviewPage extends WizardPage {

	private final Supplier<Document> document;
	private final Supplier<String> url;
	private final AdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private TreeViewer preview;

	protected ImportSpecificationWizardPreviewPage(Supplier<Document> document, Supplier<String> url) {
		super(ImportSpecificationWizardPreviewPage.class.getSimpleName());
		this.document = document;
		this.url = url;
		setTitle(Messages.ImportSpecificationWizardPreviewPage_title);
		setMessage(Messages.ImportSpecificationWizardPreviewPage_defaultMessage);
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().applyTo(container);
		Group group = new Group(container, SWT.NONE);
		group.setText(Messages.ImportSpecificationWizardPreviewPage_groupTitle);
		GridDataFactory.swtDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(group);
		GridLayoutFactory.swtDefaults().applyTo(group);
		preview = new TreeViewer(group, SWT.SINGLE | SWT.BORDER);
		preview.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		preview.setUseHashlookup(true);
		preview.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(preview.getControl());
		setControl(container);
		setPageComplete(false);
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (!visible) {
			setPageComplete(false);
			return;
		}
		runPreview();
	}

	private void runPreview() {
		try {
			setMessage(Messages.ImportSpecificationWizardPreviewPage_progressMessage);
			getContainer().run(true, true, new ImportSpecificationOperation(document.get(), url.get(), this::finish));
		} catch (InvocationTargetException | InterruptedException e) {
			StatusManager.getManager()
					.handle(new Status(IStatus.ERROR, getClass(), Messages.ImportSpecificationWizard_failure, e));
		}
	}

	private void finish() {
		setMessage(Messages.ImportSpecificationWizardPreviewPage_defaultMessage);
		setPageComplete(true);
		preview.setInput(document.get());
		preview.refresh();
	}

}
