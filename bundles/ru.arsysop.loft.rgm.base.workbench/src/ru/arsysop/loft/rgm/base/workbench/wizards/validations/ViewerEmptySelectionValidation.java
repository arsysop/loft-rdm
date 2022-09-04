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
package ru.arsysop.loft.rgm.base.workbench.wizards.validations;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.osgi.util.NLS;

import ru.arsysop.loft.rgm.base.workbench.wizards.Validation;
import ru.arsysop.loft.rgm.internal.base.workbench.Messages;

public final class ViewerEmptySelectionValidation<T> implements Validation<T> {

	private final Viewer viewer;
	private final String name;

	public ViewerEmptySelectionValidation(Viewer viewer, String viewerName) {
		this.viewer = viewer;
		this.name = viewerName;
	}

	@Override
	public IStatus apply(T t) {
		if (viewer.getSelection().isEmpty()) {
			return new Status(IStatus.ERROR, getClass(), NLS.bind(Messages.ViewerSelectionValidation_error_text, name));
		}
		return Status.OK_STATUS;
	}

}
