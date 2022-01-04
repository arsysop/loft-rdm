package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.function.Predicate;

import org.dom4j.Element;

public final class IsDiv implements Predicate<Element> {

	@Override
	public boolean test(Element element) {
		return "div".equals(element.getName()); //$NON-NLS-1$
	}

}
