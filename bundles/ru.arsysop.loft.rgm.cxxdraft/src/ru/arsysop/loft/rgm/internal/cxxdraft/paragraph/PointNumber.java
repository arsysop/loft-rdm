package ru.arsysop.loft.rgm.internal.cxxdraft.paragraph;

import java.util.function.Function;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;

public final class PointNumber implements Function<Element, String> {

	@Override
	public String apply(Element node) {
		return node.elements("div").stream() //$NON-NLS-1$
				.filter(new OfClass("marginalizedparent")) //$NON-NLS-1$
				.map(e -> e.element("a")) //$NON-NLS-1$
				.map(Element::getText) //
				.findAny().orElse(""); //$NON-NLS-1$
	}

}
