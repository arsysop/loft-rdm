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
package ru.arsysop.loft.rgm.workspace.interchange;

import java.util.Objects;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.osgi.util.NLS;

import ru.arsysop.loft.rgm.cxxdraft.Draft;
import ru.arsysop.loft.rgm.internal.cxxdraft.PublishedHtml;
import ru.arsysop.loft.rgm.internal.workspace.Messages;
import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.workspace.RgmWorkspaceId;

public final class ImportSpecificationContent implements ICoreRunnable {

	private final Document document;
	private final String from;

	public ImportSpecificationContent(Document document, String from) {
		this.document = Objects.requireNonNull(document, "ImportSpecificationContent::document"); //$NON-NLS-1$
		this.from = Objects.requireNonNull(from, "ImportSpecificationContent::from"); //$NON-NLS-1$
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, 100);
		try {
			Draft parsed = new PublishedHtml().from(from);
			sub.setWorkRemaining(50);
			fillDocument(parsed, sub.split(50));
		} catch (Exception e) {
			String message = NLS.bind(Messages.ImportSpecificationContent_e_import, from);
			throw new CoreException(new Status(IStatus.ERROR, new RgmWorkspaceId().get(), message, e));
		}
	}

	private void fillDocument(Draft parsed, SubMonitor sub) {
		// TODO Auto-generated method stub
	}

}
