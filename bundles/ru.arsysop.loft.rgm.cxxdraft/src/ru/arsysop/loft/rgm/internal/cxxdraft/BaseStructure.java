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

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Text;
import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.cxxdraft.Structure;

public abstract class BaseStructure<C extends EObject> implements Structure {

	protected final C container;
	protected final ResolutionContext context;

	protected BaseStructure(C container, ResolutionContext context) {
		this.container = Objects.requireNonNull(container, "BaseStructure::container"); //$NON-NLS-1$
		this.context = Objects.requireNonNull(context, "BaseStructure::context"); //$NON-NLS-1$
	}

	@Override
	public void read(Document document) {
		Element root = document.getRootElement();
		List<Element> elements = root.elements();
		for (Element element : elements) {
			if ("body".equals(element.getName())) { //$NON-NLS-1$
				body(element);
			}
		}
	}

	public abstract void body(Element body);

	protected final void applyText(Element node, Consumer<String> consumer) {
		node.content().stream()//
				.filter(Text.class::isInstance)//
				.map(Text.class::cast)//
				.map(Text::getText)//
				.map(String::trim)//
				.findFirst()//
				.ifPresent(consumer);
	}

}
