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


import ru.arsysop.loft.rgm.base.workbench.editors.DefaultFileDomain;
import ru.arsysop.loft.rgm.base.workbench.wizards.EmfModelWizard;
import ru.arsysop.loft.rgm.markup.edit.MarkupEditPlugin;
import ru.arsysop.loft.rgm.markup.model.meta.MarkupPackage;
import ru.arsysop.loft.rgm.seal.RgmFeatures;


public final class MarkupModelWizard extends EmfModelWizard {


	public MarkupModelWizard() {
		super(MarkupEditPlugin.INSTANCE, //
				MarkupPackage.eINSTANCE.getMarkup(), //
				new DefaultFileDomain(), //
				() -> "markup", //$NON-NLS-1$
				new RgmFeatures.Markup().editor()
		);
	}

}