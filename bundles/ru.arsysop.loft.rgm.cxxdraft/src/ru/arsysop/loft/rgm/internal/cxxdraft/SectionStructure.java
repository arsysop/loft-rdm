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
import java.util.Optional;
import java.util.stream.IntStream;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.IsDiv;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.internal.cxxdraft.paragraph.AppendPoint;
import ru.arsysop.loft.rgm.internal.cxxdraft.synopsis.AppendSynopsis;
import ru.arsysop.loft.rgm.spec.model.api.DomElement;
import ru.arsysop.loft.rgm.spec.model.api.Revision;
import ru.arsysop.loft.rgm.spec.model.api.Section;

public final class SectionStructure extends BaseStructure<Section> {

	private final Revision revision;

	protected SectionStructure(Section container, ResolutionContext context, Revision revision) {
		super(container, context);
		this.revision = revision;
	}

	@Override
	public void body(DomElement body) {
		DomElement wrapper = revision.wrapper(body);
		IntStream.range(0, wrapper.nodeCount()) //
				.mapToObj(wrapper::node) //
				.map(Optional::get) //
				.filter(DomElement.class::isInstance) //
				.map(DomElement.class::cast) //
				.filter(new IsDiv()) //
				.forEach(this::readContent);
	}

	private void readContent(DomElement node) {
		List<DomElement> elements = node.elements();
		elements.stream() //
				.filter(e -> new IsDiv().test(e) || new OfClass("codeblock").test(e)) //$NON-NLS-1$
				.forEach(e -> resolve(e, elements));
	}

	private void resolve(DomElement node, List<DomElement> elements) {
		if (hasClass(node, "para")) { //$NON-NLS-1$
			new AppendPoint(context).accept(container, node);
		}
		if (hasClass(node, "itemdescr")) { //$NON-NLS-1$
			DomElement previous = IntStream.range(1, elements.indexOf(node) + 1) //
					.mapToObj(i -> elements.get(elements.indexOf(node) - i)) //
					.filter(e -> e.searchForElement("code").isPresent() || new OfClass("codeblock").test(e)) //$NON-NLS-1$ //$NON-NLS-2$
					.findFirst().orElseGet(() -> IntStream.range(1, elements.indexOf(node) + 1) //
							.mapToObj(i -> elements.get(elements.indexOf(node) - i)) //
							.filter(e -> e.searchForElement("span").isPresent()).findFirst().get()); //$NON-NLS-1$
			new AppendSynopsis(context).accept(container, previous);
		}
		if (hasClass(node, "codeblock")) { //$NON-NLS-1$
			new AppendSynopsis(context).accept(container, node);
		}
	}

	private boolean hasClass(DomElement node, String string) {
		return new OfClass(string).test(node);
	}

}
