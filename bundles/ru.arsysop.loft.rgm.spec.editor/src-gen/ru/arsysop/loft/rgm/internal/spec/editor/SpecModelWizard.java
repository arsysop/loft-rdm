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
package ru.arsysop.loft.rgm.internal.spec.editor;

import ru.arsysop.loft.rgm.base.workbench.editors.DefaultFileDomain;
import ru.arsysop.loft.rgm.base.workbench.wizards.EmfModelWizard;
import ru.arsysop.loft.rgm.spec.edit.SpecEditPlugin;
import ru.arsysop.loft.rgm.spec.model.meta.SpecPackage;

public final class SpecModelWizard extends EmfModelWizard {

	public SpecModelWizard() {
		super(SpecEditPlugin.INSTANCE, //
				SpecPackage.eINSTANCE.getDocument(), //
				new DefaultFileDomain(), //
				() -> "spec" //$NON-NLS-1$
		);
	}

}
