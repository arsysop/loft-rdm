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
package ru.arsysop.loft.rgm.internal.markup.editor;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;

import ru.arsysop.loft.rgm.base.workbench.actions.BaseActionBarContributor;
import ru.arsysop.loft.rgm.markup.editor.MarkupEditorMenuId;
import ru.arsysop.loft.rgm.markup.editor.MarkupEditorPlugin;

public final class MarkupActionBarContributor extends BaseActionBarContributor {

	@Override
	protected void completeToolbar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator("markup-settings")); //$NON-NLS-1$
		toolBarManager.add(new Separator("markup-additions")); //$NON-NLS-1$
	}

	@Override
	protected IMenuManager createSubMenu() {
		return new MenuManager(//
				MarkupEditorPlugin.INSTANCE.getString("_UI_MarkupEditor_menu"), //$NON-NLS-1$
				new MarkupEditorMenuId().get()//
		);
	}

}
