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
package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.dom4j.Document;
import org.dom4j.io.DOMReader;
import org.w3c.tidy.Tidy;

import ru.arsysop.loft.rgm.cxxdraft.Draft;
import ru.arsysop.loft.rgm.cxxdraft.Published;

public final class PublishedHtml implements Published {

	@Override
	public Draft from(String from) throws IOException {
		try (InputStream is = new URL(from).openStream()) {
			Tidy tidy = new Tidy(); 
			Document dom = new DOMReader().read(tidy.parseDOM(is, /* no output */null));
			DefaultDraft draft = new DefaultDraft();
			CxxDraftVisitor visitor = new CxxDraftVisitor(draft);
			dom.accept(visitor);
			return draft;
		} catch (Exception e) {
			throw new IOException(String.format(Messages.getString("CxxDraftSax.e_parse_failure"), from), e); //$NON-NLS-1$
		}
	}

}
