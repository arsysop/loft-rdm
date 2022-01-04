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

import java.io.InputStream;
import java.net.URL;
import java.util.Objects;

import org.dom4j.io.DOMReader;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.osgi.util.NLS;
import org.w3c.tidy.Tidy;

import ru.arsysop.loft.rgm.cxxdraft.Structure;
import ru.arsysop.loft.rgm.internal.cxxdraft.Messages;

public final class PublishedHtml implements ICoreRunnable {

	private final String location;
	private final Structure structure;

	public PublishedHtml(String from, Structure to) {
		this.location = Objects.requireNonNull(from, "PublishedHtml::location"); //$NON-NLS-1$
		this.structure = Objects.requireNonNull(to, "PublishedHtml::structure"); //$NON-NLS-1$
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		try (InputStream is = new URL(location).openStream()) {

			Tidy tidy = new Tidy();
			tidy.setShowWarnings(false);
			structure.read(//
					new DOMReader()//
							.read(tidy.parseDOM(is, /* no output */null)));
		} catch (Exception e) {
			e.printStackTrace();
			throw new CoreException(//
					new Status(IStatus.ERROR, getClass(), //
							NLS.bind(Messages.PublishedHtml_e_parsing_failed, location, e)));
		}
	}
}
