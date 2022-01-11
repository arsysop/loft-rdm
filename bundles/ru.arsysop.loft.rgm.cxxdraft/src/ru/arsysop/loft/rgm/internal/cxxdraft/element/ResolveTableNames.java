package ru.arsysop.loft.rgm.internal.cxxdraft.element;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.dom4j.Element;
import org.dom4j.Node;

public final class ResolveTableNames implements Supplier<List<String>> {

	private final Element chapter;

	public ResolveTableNames(Element chapter) {
		this.chapter = chapter;
	}

	@Override
	public List<String> get() {
		int size = groups();
		List<Node> nodes = chapter.content();
		List<StringBuilder> texts = fill(size);
		int j = 0;
		for (Node node : nodes) {
			if ("br".equals(node.getName())) { //$NON-NLS-1$
				j++;
				continue;
			}
			if (!"a".equals(node.getName())) { //$NON-NLS-1$
				StringBuilder builder = texts.get(j);
				builder.append(node.getText() + " "); //$NON-NLS-1$
			}
		}
		return texts.stream() //
				.map(StringBuilder::toString) //
				.map(String::trim) //
				.collect(Collectors.toList());
	}

	private List<StringBuilder> fill(int size) {
		List<StringBuilder> array = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			array.add(new StringBuilder());
		}
		return array;
	}

	private int groups() {
		return (int) chapter.elements("span").stream().filter(new OfClass("secnum")).count(); //$NON-NLS-1$ //$NON-NLS-2$
	}

}
