package ru.arsysop.loft.rgm.internal.cxxdraft.paragraph;

import java.util.Objects;
import java.util.function.BiFunction;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.spec.model.api.Point;
import ru.arsysop.loft.rgm.spec.model.api.PointText;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class ParsePointText implements BiFunction<Point, Element, PointText> {

	private final SpecFactory factory;
	private final ResolutionContext context;

	public ParsePointText(SpecFactory factory, ResolutionContext context) {
		this.factory = Objects.requireNonNull(factory, "ParsePointText::factory"); //$NON-NLS-1$
		this.context = Objects.requireNonNull(context, "ParsePointText::context"); //$NON-NLS-1$
	}

	@Override
	public PointText apply(Point point, Element p) {
		PointText pt = factory.createPointText();
		long count = point.getContents().stream().filter(PointText.class::isInstance).count();
		pt.setLocation(point.getLocation());
		pt.setId(point.getId().concat("_text" + count)); //$NON-NLS-1$
		pt.setName(point.getName().concat(" Text")); //$NON-NLS-1$
		pt.setNumber(point.getNumber().concat("-" + count)); //$NON-NLS-1$
		pt.setRaw(new CollectText().apply(p));
		new PartReferences(context).apply(p).forEach(pt.getReferences()::add);
		context.parts().register(pt.getId(), pt);
		return pt;
	}

}
