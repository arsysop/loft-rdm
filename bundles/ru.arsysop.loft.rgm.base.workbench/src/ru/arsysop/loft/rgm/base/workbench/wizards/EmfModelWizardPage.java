/*******************************************************************************
 * Copyright (c) 2022 ArSysOp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.base.workbench.wizards;

import java.util.Objects;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import ru.arsysop.loft.rgm.internal.base.workbench.Messages;

public final class EmfModelWizardPage extends WizardNewFileCreationPage {

	private final String formatted;

	public EmfModelWizardPage(String formatted, IStructuredSelection selection) {
		super(EmfModelWizardPage.class.getName(), selection);
		this.formatted = Objects.requireNonNull(formatted);
	}

	@Override
	public final void createControl(Composite parent) {
		// FIXME: AF: check license here
		super.createControl(parent);
	}

	@Override
	protected boolean validatePage() {
		if (super.validatePage()) {
			if (!formatted.equals(new Path(getFileName()).getFileExtension())) {
				setErrorMessage(NLS.bind(Messages.BaseModelWizardPage_e_extension,
						new Object[] { formatted }));
				return false;
			}
			return true;
		}
		return false;
	}

}