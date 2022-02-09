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
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.spec.model.api.Paragraph;
import ru.arsysop.loft.rgm.spec.model.api.Table;
import ru.arsysop.loft.rgm.spec.model.api.TableRow;
import ru.arsysop.loft.rgm.spec.model.base.EncodeId;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class ParseTables implements BiFunction<Paragraph, Element, List<Table>> {

	private final EncodeId encode;
	private final SpecFactory factory;

	public ParseTables(SpecFactory factory) {
		this.encode = new EncodeId();
		this.factory = Objects.requireNonNull(factory, "ParseTables::factory"); //$NON-NLS-1$
	}

	@Override
	public List<Table> apply(Paragraph paragraph, Element node) {
		return node.elements("div").stream() //$NON-NLS-1$
				.filter(new OfClass("numberedTable")) //$NON-NLS-1$
				.map(e -> fillTable(paragraph, e)) //
				.collect(Collectors.toList());
	}

	private Table fillTable(Paragraph paragraph, Element div) {
		// $NON-NLS-1$//$NON-NLS-2$
		Table table = factory.createTable();
		table.setId(encode.apply(div.attributeValue("id"))); //$NON-NLS-1$
		table.setLocation(paragraph.getLocation() + '#' + div.attributeValue("id")); //$NON-NLS-1$
		List<Element> rows = div.element("table").elements("tr"); //$NON-NLS-1$ //$NON-NLS-2$
		int offset = fillTitle(table, rows);
		Stream.of(rows) //
				.flatMapToInt(r -> IntStream.range(offset, r.size())) //
				.forEach(j -> collectRow(rows.get(j), table, j - offset + 1)); //
		return table;
	}

	private int fillTitle(Table table, List<Element> rows) {
		TableRow titleRow = row("Title", table.getId() + "-title", table.getLocation()); //$NON-NLS-1$ //$NON-NLS-2$
		if (rows.stream().filter(e -> "capsep".equals(e.attributeValue("class"))).count() > 0) { //$NON-NLS-1$ //$NON-NLS-2$
			List<String> titleValues = rows.get(0).elements("td").stream().map(this::extractText) //$NON-NLS-1$
					.collect(Collectors.toList());
			int i = 1;
			while (!"capsep".equals(rows.get(i).attributeValue("class"))) { //$NON-NLS-1$ //$NON-NLS-2$
				List<String> content = rows.get(i).elements("td").stream().map(this::extractText) //$NON-NLS-1$
						.collect(Collectors.toList());
				IntStream.range(0, content.size()).forEach(j -> titleValues.get(j).concat(" " + content.get(j))); //$NON-NLS-1$
				i++;
			}
			titleRow.getValues().addAll(titleValues);
			table.setTitle(titleRow);
			return i;
		}
		return 0; // No title here
	}

	private TableRow collectRow(Element tr, Table table, int index) {
		TableRow row = row(String.valueOf(index), table.getId() + "-" + index, table.getLocation()); //$NON-NLS-1$
		tr.elements("td").stream().map(this::extractText).forEach(row.getValues()::add); //$NON-NLS-1$
		table.getRows().add(row);
		return row;
	}

	private String extractText(Element cell) {
		return cell.content().stream().map(Node::getText).collect(Collectors.joining(" ")); //$NON-NLS-1$
	}

	private TableRow row(String name, String id, String location) {
		TableRow row = factory.createTableRow();
		row.setLocation(location);
		row.setId(id);
		row.setName(name);
		return row;
	}
}
