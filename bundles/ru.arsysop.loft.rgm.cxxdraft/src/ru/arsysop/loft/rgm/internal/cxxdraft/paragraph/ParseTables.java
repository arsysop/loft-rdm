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
package ru.arsysop.loft.rgm.internal.cxxdraft.paragraph;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.spec.model.api.Table;
import ru.arsysop.loft.rgm.spec.model.api.TableRow;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class ParseTables implements Function<Element, List<Table>> {

	private final ResolutionContext context;
	private final SpecFactory factory;

	public ParseTables(ResolutionContext context, SpecFactory factory) {
		this.context = Objects.requireNonNull(context, "ParseTables::context"); //$NON-NLS-1$
		this.factory = Objects.requireNonNull(factory, "ParseTables::factory"); //$NON-NLS-1$
	}

	@Override
	public List<Table> apply(Element node) {
		return node.elements("div").stream() //$NON-NLS-1$
				.filter(new OfClass("numberedTable")) //$NON-NLS-1$
				.map(this::fillTable) //
				.collect(Collectors.toList());
	}

	private Table fillTable(Element div) {
		Table table = factory.createTable();
		List<Element> rows = div.element("table").elements("tr"); //$NON-NLS-1$//$NON-NLS-2$
		table.setTitle(collectRow(rows.get(0)));
		table.setId(div.attributeValue("id")); //$NON-NLS-1$
		table.setLocation(context.location(table));
		if (rows.size() > 1) {
			List<Element> remaining = rows.subList(1, rows.size() - 1);
			table.getRows().addAll(remaining.stream().map(this::collectRow).collect(Collectors.toList()));
		}
		return table;
	}

	private TableRow collectRow(Element tr) {
		List<Element> cells = tr.elements("td"); //$NON-NLS-1$
		TableRow row = factory.createTableRow();
		cells.stream().map(this::extractText).forEach(row.getValues()::add);
		return row;
	}

	private String extractText(Element cell) {
		return cell.content().stream().map(Node::getText).collect(Collectors.joining(" ")); //$NON-NLS-1$
	}

}
