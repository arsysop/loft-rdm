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
package ru.arsysop.loft.rgm.internal.cxxdraft.element;

import java.util.function.Function;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;

public final class PickId implements Function<String, String> {

	private final ResolutionContext context;

	public PickId(ResolutionContext context) {
		this.context = context;
	}

	@Override
	public String apply(String link) {
		return link.replace(context.location(), ""); //$NON-NLS-1$
	}

}
