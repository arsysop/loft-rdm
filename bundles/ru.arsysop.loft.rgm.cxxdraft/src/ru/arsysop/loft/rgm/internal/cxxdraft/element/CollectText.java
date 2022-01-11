package ru.arsysop.loft.rgm.internal.cxxdraft.element;

import java.util.function.Function;
import java.util.stream.Collectors;

import org.dom4j.Element;
import org.dom4j.Node;

public final class CollectText implements Function<Element, String> {

	private final String separator;

	public CollectText(String separator) {
		this.separator = separator;
	}

	@Override
	public String apply(Element element) {
		return element.content().stream().map(Node::getText).collect(Collectors.joining(separator)); // $NON-NLS-1$;
	}

}
