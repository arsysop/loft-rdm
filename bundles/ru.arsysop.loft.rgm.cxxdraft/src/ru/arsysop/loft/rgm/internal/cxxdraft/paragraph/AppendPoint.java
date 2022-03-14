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
import java.util.function.BiConsumer;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.spec.model.api.Paragraph;
import ru.arsysop.loft.rgm.spec.model.api.Point;
import ru.arsysop.loft.rgm.spec.model.base.EncodeId;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class AppendPoint implements BiConsumer<Paragraph, Element> {

	private final SpecFactory factory = SpecFactory.eINSTANCE;
	private final ParseTables tables;
	private final ParseReferences references;

	public AppendPoint(ResolutionContext context) {
		this.references = new ParseReferences(context);
		this.tables = new ParseTables(factory, context);
	}

	@Override
	public void accept(Paragraph paragraph, Element node) {
		Point point = factory.createPoint();
		String id = pointNumber(node);
		point.setId(new EncodeId().apply(paragraph.getId() + "_point" + id)); //$NON-NLS-1$
		point.setLocation(paragraph.getLocation() + '#' + id);
		point.setNumber(id);
		point.setName(pointName(paragraph, node));
		point.getTables().addAll(tables.apply(paragraph, node));
		node.elements("p").stream().map(references).flatMap(List::stream).forEach(point.getReferences()::add); //$NON-NLS-1$
		paragraph.getParts().add(point);
//		node.elements("pre").stream().filter(new OfClass("codeblock"));
	}

	private String pointName(Paragraph paragraph, Element node) {
		return paragraph.getNumber().concat("-").concat(pointNumber(node)); //$NON-NLS-1$
	}

	private String pointNumber(Element node) {
		return node.elements("div").stream() //$NON-NLS-1$
				.filter(new OfClass("marginalizedparent")) //$NON-NLS-1$
				.map(e -> e.element("a")) //$NON-NLS-1$
				.map(Element::getText) //
				.findAny().orElse(""); //$NON-NLS-1$
	}

}
