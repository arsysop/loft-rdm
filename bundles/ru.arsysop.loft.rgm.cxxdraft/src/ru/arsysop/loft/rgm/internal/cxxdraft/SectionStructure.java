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
package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.List;
import java.util.stream.IntStream;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.IsDiv;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.internal.cxxdraft.paragraph.AppendPoint;
import ru.arsysop.loft.rgm.spec.model.api.Section;

public final class SectionStructure extends BaseStructure<Section> {

	protected SectionStructure(Section container, ResolutionContext context) {
		super(container, context);
	}

	@Override
	public void body(Element body) {
		Element wrapper = body.element("div"); //$NON-NLS-1$
		IntStream.range(0, wrapper.nodeCount()) //
				.mapToObj(wrapper::node) //
				.filter(Element.class::isInstance) //
				.map(Element.class::cast) //
				.filter(new IsDiv()) //
				.forEach(this::readContent);
	}

	private void readContent(Element node) {
		List<Element> elements = node.elements();
		elements.stream() //
				.filter(new IsDiv()) //
				.forEach(e -> resolve(e, elements));
	}

	private void resolve(Element node, List<Element> elements) {
		if (hasClass(node, "para")) { //$NON-NLS-1$
			new AppendPoint(context).accept(container, node);
		}
		if (hasClass(node, "itemdescr")) { //$NON-NLS-1$
			Element previous = elements.get(elements.indexOf(node) - 1);
//			new AppendSynopsis(context).accept(container, previous);
		}
	}

	private boolean hasClass(Element node, String string) {
		return new OfClass(string).test(node);
	}

}
