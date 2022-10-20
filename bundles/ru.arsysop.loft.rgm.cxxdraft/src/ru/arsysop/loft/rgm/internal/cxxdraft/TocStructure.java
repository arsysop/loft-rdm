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

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.IsDiv;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.spec.model.api.DomElement;
import ru.arsysop.loft.rgm.spec.model.api.Index;
import ru.arsysop.loft.rgm.spec.model.api.Section;
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
	public void body(DomElement body) {
		DomElement wrapper = body.node(0).get();
		for (int i = 0; i < wrapper.nodeCount(); i++) {
			Optional<DomElement> node = wrapper.node(i);
			if (node.isPresent()) {
				DomElement element = node.get();
				switch (element.name()) {
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

	private void div(DomElement node) {
		if (node.attributeValue("class").isEmpty()) { //$NON-NLS-1$
			topLevelTocEntry(node);
		}
	}

	private void topLevelTocEntry(DomElement node) {
		TocChapter chapter = createTocChapter(node);
		if (node.element("h2").get()//$NON-NLS-1$
				.element("a").get()//$NON-NLS-1$
				.text()//
				.startsWith("[")) { //$NON-NLS-1$
			completeVisualization(chapter, node);
		} else {
			if ("annexnum".equals( //$NON-NLS-1$
					node.element("h2").get() //$NON-NLS-1$
							.element("a").get() //$NON-NLS-1$
							.attributeValue("class").get())) { //$NON-NLS-1$
				completeAnnex(chapter);
			} else {
				completeParagraph(chapter, node.element("div").get(), container.getChapters()::add, //$NON-NLS-1$
						container.getDocument().getSections()::add);
			}
		}
	}

	private TocChapter createTocChapter(DomElement node) {
		TocChapter chapter = factory.createTocChapter();
		String raw = node.attributeValue("id").get(); //$NON-NLS-1$
		if (raw != null) {
			chapter.setId(raw.trim());
			chapter.setName(new ExtractSubElementText("h2", "h3", "h4").apply(node)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else {
			chapter.setName(node.text().trim());
			node.elements().stream() //
					.filter(new OfClass("abbr_ref")) //$NON-NLS-1$
					.map(e -> e.attributeValue("href").get()) //$NON-NLS-1$
					.findAny().ifPresent(chapter::setId);
		}
		chapter.setNumber(paragraphNumber(node));
		return chapter;
	}

	private String paragraphNumber(DomElement node) {
		Optional<DomElement> a = node.element("a"); //$NON-NLS-1$
		if (node.element("a").isEmpty() && !node.elements().isEmpty()) { //$NON-NLS-1$
			a = node.elements().get(0).element("a"); //$NON-NLS-1$
		}
		return a.map(DomElement::text).filter(Objects::nonNull).filter(t -> !t.startsWith("[")) //$NON-NLS-1$
				.orElse(""); //$NON-NLS-1$
	}

	private void completeVisualization(TocChapter chapter, DomElement node) {
		container.getChapters().add(chapter);
//		node.elements("div").stream().filter(new OfClass("tocChapter")).findAny().ifPresent(this::completeTables); //$NON-NLS-1$//$NON-NLS-2$
	}

	private void completeParagraph(TocChapter chapter, DomElement node, Consumer<TocChapter> chapters,
			Consumer<Section> paragraphs) {
		chapters.accept(chapter);
		Section section = factory.createSection();
		section.setId(chapter.getId());
		section.setLocation(context.location() + new IdToLocation().apply(chapter.getId()));
		section.setName(chapter.getName());
		section.setNumber(chapter.getNumber());
		chapter.setPart(section);
		paragraphs.accept(section);
		context.parts().register(section.getId(), section);
		Stream<DomElement> divs = node.elements().stream().filter(new IsDiv());
		divs.forEachOrdered(e -> completeParagraph(createTocChapter(e), e, chapter.getChapters()::add,
				((Section) chapter.getPart()).getContents()::add));
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

	private void topLevelH2(DomElement element) {
		TocChapter chapter = factory.createTocChapter();
		DomElement h2a = element.element("a").get(); //$NON-NLS-1$
		chapter.setId(h2a.attributeValue("href").get()); //$NON-NLS-1$
		chapter.setName(h2a.text());
		completeIndex(chapter, container.getChapters()::add, container.getDocument().getIndexes()::add);
	}

}
