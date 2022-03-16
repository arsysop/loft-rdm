/*******************************************************************************
 * Copyright (c) ArSysOp 2018-2022
 * 
 * RGM Sources are publicly available only for 
 * informational, review, analysis and consulting purposes.
 * 
 * Definitions, terms and conditions for using RGM Sources are stated by ArSysOp Source License version 1.0.
 * See http://arsysop.ru/licenses/rgm/ArSysOpSourceLicense-1.0.txt
 * 
 * RGM Sources are provided on "as is" basis. 
 * ArSysOp is not responsible for any damages, losses, legal prosecution 
 * or other consequences of any sort that using RGM Sources can cause to you 
 * (as an individual or Legal Entity), even if aware of such consequences.
 * 
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

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.spec.model.api.Paragraph;
import ru.arsysop.loft.rgm.spec.model.api.Table;
import ru.arsysop.loft.rgm.spec.model.api.TableRow;
import ru.arsysop.loft.rgm.spec.model.base.EncodeId;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class ParseTables implements BiFunction<Paragraph, Element, List<Table>> {

	private final EncodeId encode;
	private final SpecFactory factory;
	private final ResolutionContext context;

	public ParseTables(SpecFactory factory, ResolutionContext context) {
		this.encode = new EncodeId();
		this.factory = Objects.requireNonNull(factory, "ParseTables::factory"); //$NON-NLS-1$
		this.context = context;
	}

	@Override
	public List<Table> apply(Paragraph paragraph, Element node) {
		return node.elements("div").stream() //$NON-NLS-1$
				.filter(new OfClass("numberedTable")) //$NON-NLS-1$
				.map(e -> fillTable(paragraph, e)) //
				.collect(Collectors.toList());
	}

	private Table fillTable(Paragraph paragraph, Element div) {
		Table table = factory.createTable();
		table.setId(tableId(div));
		table.setLocation(tableLocation(paragraph, div));
		table.setName(tableName(div));
		table.setNumber(tableNumber(div));
		context.parts().register(table.getId(), table);
		fillTableContent(div, table);
		return table;
	}

	private void fillTableContent(Element div, Table table) {
		List<Element> rows = div.element("table").elements("tr"); //$NON-NLS-1$ //$NON-NLS-2$
		int offset = fillTitle(table, rows);
		Stream.of(rows).flatMapToInt(r -> IntStream.range(offset, r.size())) //
				.forEach(j -> collectRow(rows.get(j), table, j - offset + 1)); //
	}

	private String tableId(Element div) {
		return encode.apply(div.attributeValue("id")); //$NON-NLS-1$
	}

	private String tableLocation(Paragraph paragraph, Element div) {
		return paragraph.getLocation() + '#' + div.attributeValue("id"); //$NON-NLS-1$
	}

	private String tableNumber(Element div) {
		List<Node> content = div.content();
		return content.get(1).getText();
	}

	private String tableName(Element div) {
		List<Node> content = div.content();
		String name = content.subList(2, content.indexOf(div.element("table"))).stream().map(Node::getText) //$NON-NLS-1$
				.collect(Collectors.joining()).trim(); // $NON-NLS-1$
		return name;
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
		TableRow row = row(String.valueOf(index), table.getId() + "_row" + index, table.getLocation()); //$NON-NLS-1$
		List<Element> cells = tr.elements("td"); //$NON-NLS-1$
		cells.stream().map(this::extractText).forEach(row.getValues()::add);
		cells.stream().map(new ParseReferences(context)).flatMap(List::stream).forEach(row.getReferences()::add);
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
		row.setNumber(name);
		row.setName(name);
		return row;
	}
}
