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
package ru.arsysop.loft.rgm.internal.cxxdraft.table;

import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.paragraph.FormatName;
import ru.arsysop.loft.rgm.internal.cxxdraft.paragraph.PartReferences;
import ru.arsysop.loft.rgm.spec.model.api.Section;
import ru.arsysop.loft.rgm.spec.model.api.Table;
import ru.arsysop.loft.rgm.spec.model.api.TableRow;
import ru.arsysop.loft.rgm.spec.model.base.EncodeId;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class ParseTable implements BiFunction<Section, Element, Table> {

	private final EncodeId encode;
	private final SpecFactory factory;
	private final ResolutionContext context;

	public ParseTable(SpecFactory factory, ResolutionContext context) {
		this.encode = new EncodeId();
		this.factory = Objects.requireNonNull(factory, "ParseTables::factory"); //$NON-NLS-1$
		this.context = context;
	}

	@Override
	public Table apply(Section section, Element node) {
		Table table = factory.createTable();
		table.setId(tableId(node));
		table.setLocation(tableLocation(section, node));
		table.setName(tableName(node));
		table.setNumber(tableNumber(node));
		context.parts().register(table.getId(), table);
		fillTableContent(node, table);
		return table;
	}

	private void fillTableContent(Element div, Table table) {
		List<Element> rows = div.element("table").elements("tr"); //$NON-NLS-1$ //$NON-NLS-2$
		Stream.of(rows).flatMapToInt(r -> IntStream.range(0, r.size())) //
				.forEach(j -> collectRow(rows.get(j), table, j + 1)); //
	}

	private String tableId(Element div) {
		return encode.apply(div.attributeValue("id")); //$NON-NLS-1$
	}

	private String tableLocation(Section paragraph, Element div) {
		return paragraph.getLocation() + '#' + div.attributeValue("id"); //$NON-NLS-1$
	}

	private String tableNumber(Element div) {
		List<Node> content = div.content();
		return "T" + content.get(1).getText(); //$NON-NLS-1$
	}

	private String tableName(Element div) {
		List<Node> content = div.content();
		String name = content.subList(2, content.indexOf(div.element("table"))).stream().map(Node::getText) //$NON-NLS-1$
				.map(new FormatName()).collect(Collectors.joining()).trim(); // $NON-NLS-1$
		return name;
	}

	private TableRow collectRow(Element tr, Table table, int index) {
		TableRow row = row(table, table.getId() + "_row" + index, index); //$NON-NLS-1$
		List<Element> cells = tr.elements("td"); //$NON-NLS-1$
		cells.stream().map(this::extractText).forEach(row.getValues()::add);
		cells.stream().map(new PartReferences(context)).flatMap(List::stream).forEach(row.getReferences()::add);
		table.getRows().add(row);
		return row;
	}

	private String extractText(Element cell) {
		return cell.content().stream().map(Node::getText).collect(Collectors.joining(" ")); //$NON-NLS-1$
	}

	private TableRow row(Table table, String id, int index) {
		TableRow row = factory.createTableRow();
		row.setLocation(table.getLocation());
		row.setId(id);
		row.setNumber(table.getNumber().concat("-").concat(String.valueOf(index))); //$NON-NLS-1$
		row.setName(table.getName().concat(" Row ").concat(String.valueOf(index))); //$NON-NLS-1$
		return row;
	}
}
