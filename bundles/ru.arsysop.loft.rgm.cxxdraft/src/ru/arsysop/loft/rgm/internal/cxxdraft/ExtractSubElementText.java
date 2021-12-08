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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.dom4j.Element;

public final class ExtractSubElementText implements Function<Element, String> {

	private final List<String> names;

	public ExtractSubElementText(String... names) {
		this(Arrays.asList(names));
	}

	public ExtractSubElementText(List<String> names) {
		this.names = new ArrayList<String>(names);
	}

	@Override
	public String apply(Element element) {
		return names.stream()//
				.map(n -> element.elementText(n))//
				.filter(Objects::nonNull)//
				.map(String::trim)//
				.findFirst()//
				.orElse(""); //$NON-NLS-1$
	}

}
