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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;

import ru.arsysop.loft.rgm.internal.spec.workbench.Messages;
import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.workspace.interchange.ImportSpecificationContent;

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
		if (visible) {
			try {
				setMessage(Messages.ImportSpecificationWizardPreviewPage_progressMessage);
				Document target = document.get();
				String from = url.get();
				getContainer().run(true, true, new IRunnableWithProgress() {
					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						try {
							new ImportSpecificationContent(target, from).run(monitor);
						} catch (CoreException e) {
							throw new InvocationTargetException(e);
						}
						Display.getDefault().syncExec(() -> finish());
					}
				});
			} catch (InvocationTargetException | InterruptedException e) {
				e.printStackTrace();
				ErrorDialog.openError(getShell(), e.getClass().getSimpleName(), e.getMessage(),
						new Status(IStatus.ERROR, getClass(), e.getMessage(), e));
			}
		} else {
			setPageComplete(false);
		}
	}

	private void finish() {
		setPageComplete(true);
		setMessage(Messages.ImportSpecificationWizardPreviewPage_defaultMessage);
		preview.setInput(document.get());
		preview.refresh();
	}

}
