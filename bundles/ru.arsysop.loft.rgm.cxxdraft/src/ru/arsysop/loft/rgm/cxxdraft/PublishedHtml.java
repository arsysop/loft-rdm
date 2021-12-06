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

import java.io.InputStream;
import java.net.URL;
import java.util.Objects;

import org.dom4j.Document;
import org.dom4j.io.DOMReader;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.w3c.tidy.Tidy;

import ru.arsysop.loft.rgm.internal.cxxdraft.Messages;
import ru.arsysop.loft.rgm.internal.cxxdraft.StructureSwitch;

public final class PublishedHtml {

	private final EObject container;
	private final String from;

	public PublishedHtml(EObject container, String from) {
		this.container = Objects.requireNonNull(container, "PublishedHtml::container"); //$NON-NLS-1$
		this.from = Objects.requireNonNull(from, "PublishedHtml::from"); //$NON-NLS-1$
	}

	public void parse(ResolutionContext context) throws CoreException {
		try (InputStream is = new URL(from).openStream()) {
			Document parsed = new DOMReader()//
					.read(new Tidy().parseDOM(is, /* no output */null));
			new StructureSwitch(context).doSwitch(container)//
					.orElseThrow(() -> new CoreException(//
							new Status(IStatus.ERROR, getClass(), //
									NLS.bind(Messages.PublishedHtml_e_structure_undefined,
											container.getClass().getName()))))//
					.read(parsed);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CoreException(//
					new Status(IStatus.ERROR, getClass(), //
							NLS.bind(Messages.PublishedHtml_e_parsing_failed, from, e)));
		}
	}
}
