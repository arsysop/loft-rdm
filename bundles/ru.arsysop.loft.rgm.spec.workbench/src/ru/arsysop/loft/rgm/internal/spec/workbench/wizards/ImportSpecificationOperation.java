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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;

import ru.arsysop.loft.rgm.spec.workspace.interchange.ImportSpecificationContent;

public final class ImportSpecificationOperation implements IRunnableWithProgress {

	private final ImportSpecificationContent operation;
	private final String from;
	private final Runnable finish;

	public ImportSpecificationOperation(ImportSpecificationContent operation, String from, Runnable finish) {
		this.operation = operation;
		this.from = from;
		this.finish = finish;
	}

	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		operation.prepare(monitor, from);
		Display.getDefault().syncExec(finish);
	}

}
