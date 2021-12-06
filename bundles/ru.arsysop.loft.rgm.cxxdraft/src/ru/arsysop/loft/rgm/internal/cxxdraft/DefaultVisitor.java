package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

import org.dom4j.Element;
import org.dom4j.VisitorSupport;
import org.eclipse.emf.ecore.EObject;

public final class DefaultVisitor<C extends EObject> extends VisitorSupport {

	private final BaseElements<C> elements;
	private final Consumer<String> references;

	public DefaultVisitor(BaseElements<C> elements, Consumer<String> references) {
		this.elements = Objects.requireNonNull(elements, "DefaultVisitor::elements"); //$NON-NLS-1$
		this.references = Objects.requireNonNull(references, "DefaultVisitor::references"); //$NON-NLS-1$
	}

	@Override
	public void visit(Element node) {
		// FIXME: AF: url is insufficient, we need to know the element
		Optional.of(node)//
				.filter(n -> "a".equals(n.getName())) //$NON-NLS-1$
				.map(n -> n.attributeValue("href")) //$NON-NLS-1$
				.filter(u -> !u.startsWith("http")) //$NON-NLS-1$
				.ifPresent(references);
		elements.accept(node);
	}

}
