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
package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.Objects;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.spec.model.api.Part;
import ru.arsysop.loft.rgm.spec.model.util.SpecSwitch;

public final class LocationSwitch extends SpecSwitch<String> {

	private final String base;

	public LocationSwitch(String base) {
		this.base = Objects.requireNonNull(base, "LocationSwitch::base"); //$NON-NLS-1$
	}

	@Override
	public String casePart(Part object) {
		return base + '/' + object.getId();
	}

	@Override
	public String defaultCase(EObject object) {
		return base;
	}

}
