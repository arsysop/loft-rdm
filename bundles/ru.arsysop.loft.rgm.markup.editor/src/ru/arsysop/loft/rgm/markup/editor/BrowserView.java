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
 *     Nikifor Fedorov (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.markup.editor;

import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import ru.arsysop.loft.rgm.spec.model.api.Part;

public final class BrowserView extends ViewPart implements ISelectionListener {

	private Browser browser;

	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.NONE);
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
	}

	@Override
	public void setFocus() {
		browser.setFocus();
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		Optional.of(selection) //
				.filter(IStructuredSelection.class::isInstance) //
				.map(IStructuredSelection.class::cast) //
				.map(IStructuredSelection::getFirstElement) //
				.filter(Part.class::isInstance) //
				.map(Part.class::cast) //
				.ifPresent(p -> browser.setUrl(p.getLocation()));
	}

	public static class Id implements Supplier<String> {

		@Override
		public String get() {
			return "ru.arsysop.loft.rgm.markup.editor.browser"; //$NON-NLS-1$
		}

	}

}
