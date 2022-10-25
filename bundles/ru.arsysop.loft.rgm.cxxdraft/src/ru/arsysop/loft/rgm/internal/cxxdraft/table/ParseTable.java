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

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.paragraph.FormatName;
import ru.arsysop.loft.rgm.internal.cxxdraft.paragraph.PartReferences;
import ru.arsysop.loft.rgm.spec.model.api.DomElement;
import ru.arsysop.loft.rgm.spec.model.api.Section;
import ru.arsysop.loft.rgm.spec.model.api.Table;
import ru.arsysop.loft.rgm.spec.model.api.TableRow;
import ru.arsysop.loft.rgm.spec.model.base.EncodeId;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class ParseTable implements BiFunction<Section, DomElement, Table> {

	private final EncodeId encode;
	private final SpecFactory factory;
	private final ResolutionContext context;

	public ParseTable(SpecFactory factory, ResolutionContext context) {
		this.encode = new EncodeId();
		this.factory = Objects.requireNonNull(factory, "ParseTables::factory"); //$NON-NLS-1$
		this.context = context;
	}

	@Override
	public Table apply(Section section, DomElement node) {
		Table table = factory.createTable();
		table.setId(tableId(node));
		table.setLocation(tableLocation(section, node));
		table.setName(tableName(node));
		table.setNumber(tableNumber(node));
		context.parts().register(table.getId(), table);
		fillTableContent(node, table);
		return table;
	}

	private void fillTableContent(DomElement div, Table table) {
		List<DomElement> rows = div.element("table").get().elements("tr"); //$NON-NLS-1$ //$NON-NLS-2$
		Stream.of(rows).flatMapToInt(r -> IntStream.range(0, r.size())) //
				.forEach(j -> collectRow(rows.get(j), table, j + 1)); //
	}

	private String tableId(DomElement div) {
		return encode.apply(div.attributeValue("id").get()); //$NON-NLS-1$
	}

	private String tableLocation(Section paragraph, DomElement div) {
		return paragraph.getLocation() + '#' + div.attributeValue("id").get(); //$NON-NLS-1$
	}

	private String tableNumber(DomElement div) {
		return "T" + div.nodeText(1); //$NON-NLS-1$
	}

	private String tableName(DomElement div) {
		return IntStream.range(2, div.containingNames().indexOf("table")) //$NON-NLS-1$
				.mapToObj(div::nodeText) //
				.map(new FormatName()).collect(Collectors.joining()).trim(); // $NON-NLS-1$
	}

	private TableRow collectRow(DomElement tr, Table table, int index) {
		TableRow row = row(table, table.getId() + "_row" + index, index); //$NON-NLS-1$
		List<DomElement> cells = tr.elements("td"); //$NON-NLS-1$
		cells.stream().map(this::extractText).forEach(row.getValues()::add);
		cells.stream().map(new PartReferences(context)).flatMap(List::stream).forEach(row.getReferences()::add);
		table.getRows().add(row);
		return row;
	}

	private String extractText(DomElement cell) {
		return IntStream.range(0, cell.nodeCount()).mapToObj(cell::nodeText).collect(Collectors.joining(" ")); //$NON-NLS-1$
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
