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
package ru.arsysop.loft.rgm.cxxdraft.base;

import java.util.Objects;

import org.dom4j.Node;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.osgi.util.NLS;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.Messages;
import ru.arsysop.loft.rgm.spec.model.api.ContentResolution;
import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.model.api.IndexEntry;
import ru.arsysop.loft.rgm.spec.model.api.Part;
import ru.arsysop.loft.rgm.spec.model.base.SimpleContentResolution;

public final class SimpleResolutionContext implements ResolutionContext {

	private final String location;
	private final Document document;
	private final ContentResolution<Part> parts;
	private final ContentResolution<IndexEntry> ientries;
	private final BasicDiagnostic status;

	public SimpleResolutionContext(String location, Document document) {
		this.location = Objects.requireNonNull(location, "SimpleResolutionContext::location"); //$NON-NLS-1$
		this.document = Objects.requireNonNull(document, "SimpleResolutionContext::document"); //$NON-NLS-1$
		this.parts = new SimpleContentResolution<>();
		this.ientries = new SimpleContentResolution<>();
		this.status = new BasicDiagnostic(Diagnostic.OK, getClass().getName(), 0, //
				NLS.bind(Messages.SimpleResolutionContext_d_base_message, location), //
				null);
	}

	@Override
	public String location() {
		return location;
	}

	@Override
	public Document document() {
		return document;
	}

	@Override
	public void warning(Node node, String message) {
		status.add(new BasicDiagnostic(Diagnostic.WARNING, getClass().getName(), 0, message, new Object[] { node }));
	}

	@Override
	public Diagnostic diagnostic() {
		return status;
	}

	@Override
	public ContentResolution<Part> parts() {
		return parts;
	}

	@Override
	public ContentResolution<IndexEntry> indexEntries() {
		return ientries;
	}

}
