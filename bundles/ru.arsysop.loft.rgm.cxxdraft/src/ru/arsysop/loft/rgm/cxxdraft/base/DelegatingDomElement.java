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
package ru.arsysop.loft.rgm.cxxdraft.base;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.spec.model.api.DomElement;

public final class DelegatingDomElement implements DomElement {

	private final Element delegate;

	public DelegatingDomElement(Element delegate) {
		this.delegate = delegate;
	}

	@Override
	public List<DomElement> elements() {
		return delegate.elements().stream().map(DelegatingDomElement::new).collect(Collectors.toList());
	}

	@Override
	public List<DomElement> elements(String name) {
		return delegate.elements(name).stream().map(DelegatingDomElement::new).collect(Collectors.toList());
	}

	@Override
	public Optional<DomElement> element(String name) {
		return Optional.ofNullable(delegate.element(name)).map(DelegatingDomElement::new);
	}

	@Override
	public String name() {
		return delegate.getName();
	}

	@Override
	public String elementText(String name) {
		return delegate.elementText(name);
	}

	@Override
	public int nodeCount() {
		return delegate.nodeCount();
	}

	@Override
	public Optional<DomElement> node(int index) throws IndexOutOfBoundsException {
		return Optional.of(delegate.node(index)) //
				.filter(Element.class::isInstance) //
				.map(Element.class::cast) //
				.map(DelegatingDomElement::new);
	}

	@Override
	public String nodeText(int index) throws IndexOutOfBoundsException {
		return delegate.node(index).getText();
	}

	@Override
	public Optional<String> attributeValue(String name) {
		return Optional.ofNullable(delegate.attributeValue(name));
	}

	@Override
	public String text() {
		return delegate.getText();
	}

	@Override
	public String containingText() {
		return String.join(" ", //$NON-NLS-1$
				delegate.content() //
						.stream() //
						.filter(Predicate.not(Element.class::isInstance)) //
						.map(Node::getText) //
						.collect(Collectors.joining(" ")), //$NON-NLS-1$
				delegate.content() //
						.stream() //
						.filter(Element.class::isInstance) //
						.map(Element.class::cast) //
						.map(DelegatingDomElement::new) //
						.map(DelegatingDomElement::containingText) //
						.collect(Collectors.joining(" "))); //$NON-NLS-1$
	}

	@Override
	public List<String> containingNames() {
		return delegate.content().stream().map(Node::getName).collect(Collectors.toList());
	}

	@Override
	public Optional<DomElement> searchForElement(String name) {
		Optional<DomElement> element = this.element(name);
		if (element.isPresent()) {
			return element;
		} else {
			return this.elements().stream().map(e -> e.searchForElement(name)).filter(Optional::isPresent) //
					.map(Optional::get).findFirst();
		}
	}
}
