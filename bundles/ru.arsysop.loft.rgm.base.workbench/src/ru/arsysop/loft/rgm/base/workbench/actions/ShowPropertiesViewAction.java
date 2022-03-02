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
package ru.arsysop.loft.rgm.base.workbench.actions;

import java.util.Objects;
import java.util.function.Supplier;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import ru.arsysop.loft.rgm.internal.base.workbench.Messages;

public final class ShowPropertiesViewAction extends Action {

	private final Supplier<IWorkbenchPage> page;

	public ShowPropertiesViewAction(Supplier<IWorkbenchPage> page) {
		super(Messages.ShowPropertiesViewAction_text);
		this.page = Objects.requireNonNull(page);
	}

	@Override
	public void run() {
		try {
			page.get().showView(IPageLayout.ID_PROP_SHEET);
		} catch (PartInitException exception) {
			Bundle bundle = FrameworkUtil.getBundle(getClass());
			Platform.getLog(bundle)
					.log(new Status(IStatus.ERROR, bundle.getSymbolicName(), exception.getMessage(), exception));
		}
	}
}