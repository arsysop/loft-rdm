/*******************************************************************************
 * Copyright (c) 2021 ArSysOp.
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
package ru.arsysop.loft.rgm.cxxdraft;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.model.api.Part;

public final class SimpleResolutionContext implements ResolutionContext {

	private final String from;
	private final EObject container;
	private final Map<String, EObject> parts;

	public SimpleResolutionContext(String from, EObject container) {
		this.from = Objects.requireNonNull(from, "SimpleResolutionContext::from"); //$NON-NLS-1$
		this.container = Objects.requireNonNull(container, "SimpleResolutionContext::container"); //$NON-NLS-1$
		this.parts = new LinkedHashMap<>();
	}

	@Override
	public String from() {
		return from;
	}

	@Override
	public EObject container() {
		return container;
	}

	@Override
	public void registerPart(String id, Part toc) {
		// TODO Auto-generated method stub
	}

}
