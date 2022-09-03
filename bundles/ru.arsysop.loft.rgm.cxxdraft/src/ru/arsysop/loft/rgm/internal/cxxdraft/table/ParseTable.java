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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
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
	private final Map<Predicate<Element>, BiConsumer<Element, Table>> parsers = new HashMap<>();

	public ParseTable(SpecFactory factory, ResolutionContext context) {
		this.encode = new EncodeId();
		this.factory = Objects.requireNonNull(factory, "ParseTables::factory"); //$NON-NLS-1$
		this.context = context;
		this.fillParsers();
	}

	private void fillParsers() {
		parsers.put(e -> contains(e, new OfClass("capsep")) > 2, this::fillComplexTableContent); //$NON-NLS-1$
	}

	@Override
	public Table apply(Section section, Element node) {
		Table table = factory.createTable();
		table.setId(tableId(node));
		table.setLocation(tableLocation(section, node));
		table.setName(tableName(node));
		table.setNumber(tableNumber(node));
		context.parts().register(table.getId(), table);
		parsers.entrySet().stream() //
				.filter(entry -> entry.getKey().test(node)) //
				.map(entry -> entry.getValue()) //
				.findAny() //
				.ifPresentOrElse(c -> c.accept(node, table), () -> fillDefaultTableContent(node, table));
		return table;
	}

	private void fillDefaultTableContent(Element div, Table table) {
		List<Element> rows = div.element("table").elements("tr"); //$NON-NLS-1$ //$NON-NLS-2$
		int offset = fillTitle(table, rows);
		Stream.of(rows).flatMapToInt(r -> IntStream.range(offset, r.size())) //
				.forEach(j -> collectRow(rows.get(j), table, j - offset + 1)); //
	}

	private void fillComplexTableContent(Element div, Table table) {
		List<Element> rows = div.element("table").elements("tr"); //$NON-NLS-1$ //$NON-NLS-2$
		boolean skip = false;
		boolean firstCapsepPassed = false;
		List<Element> rowsToRemove = new LinkedList<>();
		// remove inner titles
		for (Element row : rows) {
			if (!firstCapsepPassed) {
				if (new OfClass("capsep").test(row)) { //$NON-NLS-1$
					firstCapsepPassed = true;
				}
			} else {
				if (new OfClass("capsep").test(row)) { //$NON-NLS-1$
					skip = !skip;
				}
				if (skip) {
					rowsToRemove.add(row);
				}
			}
		}
		// remove supertitle
		for (Element row : rows) {
			if (new OfClass("capsep").test(row)) //$NON-NLS-1$
				break;
			if (contains(row,
					e -> e.attribute("colspan") != null && Integer.parseInt(e.attributeValue("colspan")) > 1) > 0) //$NON-NLS-1$//$NON-NLS-2$
				rowsToRemove.add(row);
		}
		rows.removeAll(rowsToRemove);
		int offset = fillTitle(table, rows);
		Stream.of(rows).flatMapToInt(r -> IntStream.range(offset, r.size())) //
				.forEach(j -> collectRow(rows.get(j), table, j - offset + 1)); //
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

	private int fillTitle(Table table, List<Element> rows) {
		TableRow titleRow = row(table, table.getId() + "-title", 0); //$NON-NLS-1$
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

	private int contains(Element element, Predicate<Element> predicate) {
		int matchingElements = 0;
		matchingElements = element.elements().stream() //
				.mapToInt(r -> contains(r, predicate)) //
				.sum();
		if (predicate.test(element)) {
			matchingElements++;
		}
		return matchingElements;
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
