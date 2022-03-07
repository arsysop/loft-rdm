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
package ru.arsysop.loft.rgm.spec.editor;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import ru.arsysop.loft.rgm.spec.edit.SpecEditPlugin;

public final class SpecEditorPlugin extends EMFPlugin {

	public static final SpecEditorPlugin INSTANCE = new SpecEditorPlugin();

	private static Implementation plugin;

	public SpecEditorPlugin() {
		super
			(new ResourceLocator [] {
				SpecEditPlugin.INSTANCE,
			});
	}

	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	public static Implementation getPlugin() {
		return plugin;
	}
	
	public static class Implementation extends EclipseUIPlugin {
		public Implementation() {
			super();
			plugin = this;
		}
	}

}
