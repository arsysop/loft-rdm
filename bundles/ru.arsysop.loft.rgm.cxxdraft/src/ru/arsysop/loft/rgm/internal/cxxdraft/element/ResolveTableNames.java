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
		int i = 0;
		int j = 0;
		while (j < size) {
			if (!"a".equals(nodes.get(i).getName())) { //$NON-NLS-1$
				StringBuilder builder = texts.get(j);
				builder.append(nodes.get(i).getText() + " "); //$NON-NLS-1$
			}
			i++;
			if ("br".equals(nodes.get(i).getName())) { //$NON-NLS-1$
				j++;
				i++;
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
