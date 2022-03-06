/*******************************************************************************
 * Copyright (c) 2018-2022 ArSysOp
 *******************************************************************************/
package ru.arsysop.loft.rgm.internal.spec.workbench.handlers;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.FrameworkUtil;

import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;
import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.workspace.interchange.ImportSpecificationContent;

public final class ImportSpecHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		checkLicense();
		Arrays.stream(HandlerUtil.getCurrentStructuredSelection(event).toArray())//
				.filter(Document.class::isInstance)//
				.map(Document.class::cast)//
				.findFirst()
				.ifPresent(d -> importContent(d, event));
		return null;
	}

	private void checkLicense() throws ExecutionException{
		try {
			new RgmLicenseProtection().checkCanImportCxx14();
		} catch (RuntimeException cannot) {
			throw new ExecutionException("Insufficient license coverage", cannot); //$NON-NLS-1$
		}
	}

	private void importContent(Document document, ExecutionEvent event) {
		String from = "https://timsong-cpp.github.io/cppwp/n4140/"; //$NON-NLS-1$
		Shell shell = HandlerUtil.getActiveShell(event);
		ProgressMonitorDialog pmd = new ProgressMonitorDialog(shell);
		try {
			pmd.run(true, false, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					try {
						new ImportSpecificationContent(document, from).run(monitor);
					} catch (CoreException e) {
						throw new InvocationTargetException(e);
					}
				}
			});
		} catch (InvocationTargetException e) {
			Throwable target = e.getTargetException();
			IStatus status;
			if (target instanceof CoreException) {
				CoreException ce = (CoreException) target;
				status = ce.getStatus();
			} else {
				status = new Status(IStatus.ERROR, FrameworkUtil.getBundle(getClass()).getSymbolicName(), target.getMessage(), target);
			}
			ErrorDialog.openError(shell, from, from, status);
		} catch (InterruptedException e) {
			// just ignore
		}
	}

}
