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
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.osgi.util.NLS;
import org.w3c.tidy.Tidy;

import ru.arsysop.loft.rgm.internal.cxxdraft.Messages;
import ru.arsysop.loft.rgm.internal.cxxdraft.StructureSwitch;

public final class PublishedHtml implements ICoreRunnable {

	private final ResolutionContext context;

	public PublishedHtml(ResolutionContext context) {
		this.context = Objects.requireNonNull(context, "PublishedHtml::context"); //$NON-NLS-1$
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		try (InputStream is = new URL(context.from()).openStream()) {
			Document parsed = new DOMReader()//
					.read(new Tidy().parseDOM(is, /* no output */null));
			new StructureSwitch(context).doSwitch(context.container())//
					.orElseThrow(() -> new CoreException(//
							new Status(IStatus.ERROR, getClass(), //
									NLS.bind(Messages.PublishedHtml_e_structure_undefined,
											context.container()))))//
					.read(parsed);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CoreException(//
					new Status(IStatus.ERROR, getClass(), //
							NLS.bind(Messages.PublishedHtml_e_parsing_failed, context.from(), e)));
		}
	}
}
