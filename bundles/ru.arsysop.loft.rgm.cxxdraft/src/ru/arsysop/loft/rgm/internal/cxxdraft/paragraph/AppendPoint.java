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
import ru.arsysop.loft.rgm.internal.cxxdraft.synopsis.ParseSynopses;
import ru.arsysop.loft.rgm.internal.cxxdraft.table.ParseTable;
import ru.arsysop.loft.rgm.spec.model.api.Point;
import ru.arsysop.loft.rgm.spec.model.api.Section;
import ru.arsysop.loft.rgm.spec.model.base.EncodeId;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class AppendPoint implements BiConsumer<Section, Element> {

	private final SpecFactory factory;
	private final PointNumber numbering;
	private final ParsePointItem item;
	private final ParsePointText text;
	private final ParseTable table;
	private final ParseSynopses synopses;

	public AppendPoint(ResolutionContext context) {
		this.factory = SpecFactory.eINSTANCE;
		this.numbering = new PointNumber();
		this.item = new ParsePointItem(factory, context);
		this.text = new ParsePointText(factory, context);
		this.table = new ParseTable(factory, context);
		this.synopses = new ParseSynopses(factory, context);
	}

	@Override
	public void accept(Section section, Element node) {
		Point point = factory.createPoint();
		String number = numbering.apply(node);
		point.setId(new EncodeId().apply(section.getId() + "_point" + number)); //$NON-NLS-1$
		point.setLocation(section.getLocation() + '#' + number);
		point.setNumber(section.getNumber().concat("-").concat(number)); //$NON-NLS-1$
		point.setName(pointName(section, node));
		point.setRaw(new CollectText().apply(node));
		section.getContents().add(point);
		List<Element> elements = node.elements();
		for (Element element : elements) {
			processContent(section, point, element);
		}
	}

	private void processContent(Section section, Point point, Element element) {
		String name = element.getName();
		if ("br".equals(name)) { //$NON-NLS-1$
			return;
		} else if ("div".equals(name) && new OfClass("figure").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			// FIXME: AF: support figures
			return;
		} else if ("div".equals(name) && new OfClass("indented").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			// FIXME: AF: looks like parser bug, see
			// https://timsong-cpp.github.io/cppwp/n4140/basic.lookup.classref#4
			point.getContents().add(text.apply(point, element));
		} else if ("div".equals(name) && new OfClass("itemdescr").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			point.getContents().add(text.apply(point, element));
		} else if ("div".equals(name) && new OfClass("marginalizedparent").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			return;
		} else if ("div".equals(name) && new OfClass("minipage").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			for (Element sub : element.elements()) {
				processContent(section, point, sub);
			}
		} else if ("div".equals(name) && new OfClass("numberedTable").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			point.getContents().add(table.apply(section, element));
		} else if ("i".equals(name)) { //$NON-NLS-1$
			// FIXME: AF: looks like parser bug, see
			// https://timsong-cpp.github.io/cppwp/n4140/temp.deduct.conv#7
			point.getContents().add(text.apply(point, element));
		} else if ("ol".equals(name) && new OfClass("enumerate").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			for (Element sub : element.elements()) {
				point.getContents().add(item.apply(point, sub));
			}
		} else if ("ol".equals(name) && new OfClass("enumeratea").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			for (Element sub : element.elements()) {
				point.getContents().add(item.apply(point, sub));
			}
		} else if ("ul".equals(name) && new OfClass("description").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			for (Element sub : element.elements()) {
				point.getContents().add(item.apply(point, sub));
			}
		} else if ("ul".equals(name) && new OfClass("itemize").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			for (Element sub : element.elements()) {
				point.getContents().add(item.apply(point, sub));
			}
		} else if ("p".equals(name)) { //$NON-NLS-1$
			point.getContents().add(text.apply(point, element));
		} else if ("pre".equals(name) && new OfClass("bnf").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			// FIXME: AF: should we add special element to ecore?
			point.getContents().add(text.apply(point, element));
		} else if ("pre".equals(name) && new OfClass("codeblock").test(element)) { //$NON-NLS-1$ //$NON-NLS-2$
			point.getContents().add(synopses.apply(point, element));
		} else if ("pre".equals(name)) { //$NON-NLS-1$
			point.getContents().add(text.apply(point, element));
		} else if ("span".equals(name)) { //$NON-NLS-1$
			// FIXME: AF: looks like parser bug, see
			// https://timsong-cpp.github.io/cppwp/n4140/temp.deduct.conv#7
			point.getContents().add(text.apply(point, element));
		} else {
			System.err.println("Unknonw point content: " + element); //$NON-NLS-1$
		}
	}

	private String pointName(Section paragraph, Element node) {
		return paragraph.getName().concat(" Point ").concat(numbering.apply(node)); //$NON-NLS-1$
	}

}
