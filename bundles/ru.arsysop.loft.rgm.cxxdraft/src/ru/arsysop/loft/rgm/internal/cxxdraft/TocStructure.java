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
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.PickId;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.ResolveTableNames;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.TableId;
import ru.arsysop.loft.rgm.spec.model.api.Index;
import ru.arsysop.loft.rgm.spec.model.api.Paragraph;
import ru.arsysop.loft.rgm.spec.model.api.Table;
import ru.arsysop.loft.rgm.spec.model.api.Toc;
import ru.arsysop.loft.rgm.spec.model.api.TocChapter;
import ru.arsysop.loft.rgm.spec.model.base.EncodeId;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class TocStructure extends BaseStructure<Toc> {

	private final SpecFactory factory;

	public TocStructure(Toc container, ResolutionContext context) {
		super(container, context);
		this.factory = SpecFactory.eINSTANCE;
	}

	@Override
	public void body(Element body) {
		Element wrapper = (Element) body.node(0);
		for (int i = 0; i < wrapper.nodeCount(); i++) {
			Node node = wrapper.node(i);
			if (node instanceof Element) {
				Element element = (Element) node;
				switch (node.getName()) {
				case "div": //$NON-NLS-1$
					div(element);
					break;
				case "h2": //$NON-NLS-1$
					topLevelH2(element);
					break;
				case "h1": //$NON-NLS-1$
					// may be later;
					break;
				default:
					System.err.println("TOC unknown: " + node); //$NON-NLS-1$
					break;
				}
			}
		}
	}

	private void div(Element node) {
		String clazz = node.attributeValue("class"); //$NON-NLS-1$
		if (clazz == null) {
			topLevelTocEntry(node);
		}
	}

	private void topLevelTocEntry(Element node) {
		TocChapter chapter = createTocChapter(node);
		if (node.element("h2")//$NON-NLS-1$
				.element("a")//$NON-NLS-1$
				.getText()//
				.startsWith("[")) { //$NON-NLS-1$
			completeVisualization(chapter, node);
		} else {
			if ("annexnum".equals( //$NON-NLS-1$
					node.element("h2") //$NON-NLS-1$
							.element("a") //$NON-NLS-1$
							.attributeValue("class"))) { //$NON-NLS-1$
				completeAnnex(chapter);
			} else {
				completeParagraph(chapter, node.element("div"), container.getChapters()::add, //$NON-NLS-1$
						container.getDocument().getParagraphs()::add);
			}
		}
	}

	private TocChapter createTocChapter(Element node) {
		TocChapter chapter = factory.createTocChapter();
		String raw = node.attributeValue("id"); //$NON-NLS-1$
		if (raw != null) {
			chapter.setId(raw.trim());
			chapter.setName(new ExtractSubElementText("h2", "h3", "h4").apply(node)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else {
			chapter.setName(node.getText().trim());
			node.elements().stream() //
					.filter(new OfClass("abbr_ref")) //$NON-NLS-1$
					.map(e -> e.attributeValue("href")) //$NON-NLS-1$
					.findAny().ifPresent(chapter::setId);
		}
		chapter.setNumber(paragraphNumber(node));
		return chapter;
	}

	private String paragraphNumber(Element node) {
		Element a = node.element("a"); //$NON-NLS-1$
		if (a == null && !node.elements().isEmpty()) {
			a = node.elements().get(0).element("a"); //$NON-NLS-1$
		}
		return Optional.ofNullable(a).map(Element::getText).filter(Objects::nonNull).filter(t -> !t.startsWith("[")) //$NON-NLS-1$
				.orElse(""); //$NON-NLS-1$
	}

	private void completeTables(Element div) {
		List<Element> spans = div.elements("span").stream() //$NON-NLS-1$
				.filter(new OfClass("secnum")) //$NON-NLS-1$
				.collect(Collectors.toList());
		List<Element> as = div.elements("a").stream() //$NON-NLS-1$
				.filter(new OfClass("abbr_ref")) //$NON-NLS-1$
				.collect(Collectors.toList());
		List<String> text = new ResolveTableNames(div).get();
		IntStream.range(0, spans.size()) //
				.mapToObj(i -> table(as.get(i), text.get(i))) //
				.filter(table -> table.getId().contains("tab:")) //$NON-NLS-1$
				.forEach(table -> {
					context.parts().register(new TableId().apply(table), table);
				});
	}

	private Table table(Element element, String text) {
		Table table = factory.createTable();
		String href = element.attributeValue("href"); //$NON-NLS-1$
		table.setId(new EncodeId().apply(new PickId(context).apply(href)));
		table.setLocation(href);
		table.setName(text);
		return table;
	}

	private void completeVisualization(TocChapter chapter, Element node) {
		container.getChapters().add(chapter);
		node.elements("div").stream().filter(new OfClass("tocChapter")).findAny().ifPresent(this::completeTables); //$NON-NLS-1$//$NON-NLS-2$
	}

	private void completeParagraph(TocChapter chapter, Element node, Consumer<TocChapter> chapters,
			Consumer<Paragraph> paragraphs) {
		chapters.accept(chapter);
		Paragraph paragraph = factory.createParagraph();
		paragraph.setId(chapter.getId());
		paragraph.setLocation(context.location() + new IdToLocation().apply(chapter.getId()));
		paragraph.setName(chapter.getName());
		paragraph.setNumber(chapter.getNumber());
		chapter.setPart(paragraph);
		paragraphs.accept(paragraph);
		context.parts().register(paragraph.getId(), paragraph);
		Stream<Element> divs = node.elements().stream().filter(e -> "div".equals(e.getName())); //$NON-NLS-1$
		divs.forEachOrdered(e -> completeParagraph(createTocChapter(e), e, chapter.getChapters()::add,
				((Paragraph) chapter.getPart()).getParts()::add));
	}

	private void completeAnnex(TocChapter chapter) {
		container.getChapters().add(chapter);
		// TODO: Specific processing for annexes
	}

	private void completeIndex(TocChapter chapter, Consumer<TocChapter> chapters, Consumer<Index> indexes) {
		chapters.accept(chapter);
		Index index = factory.createIndex();
		index.setId(new EncodeId().apply(chapter.getId()));
		index.setLocation(context.location() + chapter.getId());
		index.setName(chapter.getName());
		chapter.setPart(index);
		indexes.accept(index);
	}

	private void topLevelH2(Element element) {
		TocChapter chapter = factory.createTocChapter();
		Element h2a = element.element("a"); //$NON-NLS-1$
		chapter.setId(h2a.attributeValue("href")); //$NON-NLS-1$
		chapter.setName(h2a.getText());
		completeIndex(chapter, container.getChapters()::add, container.getDocument().getIndexes()::add);
	}

}
