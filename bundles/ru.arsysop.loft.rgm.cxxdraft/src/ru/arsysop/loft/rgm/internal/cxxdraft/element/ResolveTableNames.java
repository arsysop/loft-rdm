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

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.dom4j.Element;
import org.dom4j.Node;

public final class ResolveTableNames implements Supplier<List<String>> {

	private final Element chapter;

	public ResolveTableNames(Element chapter) {
		this.chapter = chapter;
	}

	@Override
	public List<String> get() {
		int size = groups();
		List<Node> nodes = chapter.content();
		List<StringBuilder> texts = fill(size);
		int j = 0;
		for (Node node : nodes) {
			if ("br".equals(node.getName())) { //$NON-NLS-1$
				j++;
				continue;
			}
			if (!"a".equals(node.getName())) { //$NON-NLS-1$
				StringBuilder builder = texts.get(j);
				builder.append(node.getText() + " "); //$NON-NLS-1$
			}
		}
		return texts.stream() //
				.map(StringBuilder::toString) //
				.map(String::trim) //
				.collect(Collectors.toList());
	}

	private List<StringBuilder> fill(int size) {
		List<StringBuilder> array = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			array.add(new StringBuilder());
		}
		return array;
	}

	private int groups() {
		return (int) chapter.elements("span").stream().filter(new OfClass("secnum")).count(); //$NON-NLS-1$ //$NON-NLS-2$
	}

}
