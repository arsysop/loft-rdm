package ru.arsysop.loft.rgm.internal.cxxdraft.paragraph;

import java.util.Objects;
import java.util.function.BiFunction;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.spec.model.api.Point;
import ru.arsysop.loft.rgm.spec.model.api.PointItem;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class ParsePointItem implements BiFunction<Point, Element, PointItem> {

	private final SpecFactory factory;
	private final ResolutionContext context;
	private final PointNumber numbering;

	public ParsePointItem(SpecFactory factory, ResolutionContext context) {
		this.factory = Objects.requireNonNull(factory, "ParsePointItems::factory"); //$NON-NLS-1$
		this.context = Objects.requireNonNull(context, "ParsePointItems::context"); //$NON-NLS-1$
		this.numbering = new PointNumber();
	}

	@Override
	public PointItem apply(Point point, Element li) {
		PointItem pt = factory.createPointItem();
		String number = numbering.apply(li);
		long count = point.getContents().stream().filter(PointItem.class::isInstance).count();
		pt.setLocation(point.getLocation());
		pt.setId(point.getId().concat("_item" + count)); //$NON-NLS-1$
		pt.setName(point.getName().concat(" Item " + number)); //$NON-NLS-1$
		pt.setNumber(number);
		pt.setRaw(new CollectText().apply(li));
		new PartReferences(context).apply(li).forEach(pt.getReferences()::add);
		context.parts().register(pt.getId(), pt);
		return pt;
	}

}
