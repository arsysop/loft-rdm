package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.ProcessingInstruction;
import org.dom4j.Text;
import org.dom4j.Visitor;
import org.eclipse.emf.ecore.EObject;

public final class DefaultVisitor<C extends EObject> implements Visitor {

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

	@Override
	public void visit(Text node) {
		// processed with Element node
	}

	@Override
	public void visit(ProcessingInstruction node) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(Namespace namespace) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(Entity node) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(Comment node) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(CDATA node) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(Attribute node) {
		// processed with Element node
	}

	@Override
	public void visit(DocumentType documentType) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(Document document) {
		// so far there is nothing interesting here
	}

}
