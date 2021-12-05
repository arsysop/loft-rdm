package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.Objects;
import java.util.function.Consumer;

import org.dom4j.Element;
import org.eclipse.emf.ecore.EObject;

public abstract class BaseElements<C extends EObject> implements Consumer<Element> {

	protected final C container;

	protected BaseElements(C container) {
		this.container = Objects.requireNonNull(container, "BaseElements::container"); //$NON-NLS-1$
	}

	@Override
	public final void accept(Element node) {
		String name = node.getName();
		switch (name) {
		case "span": //$NON-NLS-1$
			processSpan(node);
			break;
		case "h1": //$NON-NLS-1$
		case "h2": //$NON-NLS-1$
		case "h3": //$NON-NLS-1$
		case "h4": //$NON-NLS-1$
			processHx(node);
			break;
		case "hr": //$NON-NLS-1$
			processHr(node);
			break;
		case "em": //$NON-NLS-1$
			processEm(node);
			break;
		case "br": //$NON-NLS-1$
			processBr(node);
			break;
		case "a": //$NON-NLS-1$
			processA(node);
			break;
		case "div": //$NON-NLS-1$
			processDiv(node);
			break;
		case "body": //$NON-NLS-1$
			break;
		case "link": //$NON-NLS-1$
			processLink(node);
			break;
		case "title": //$NON-NLS-1$
			processTitle(node);
			break;
		case "meta": //$NON-NLS-1$
			break;
		case "head": //$NON-NLS-1$
			break;
		case "html": //$NON-NLS-1$
			break;
		default:
			System.err.println(getClass().getName() + " : " + node); //$NON-NLS-1$
			break;
		}
	}

	protected abstract void processSpan(Element node);

	protected abstract void processHx(Element node);

	protected abstract void processHr(Element node);

	protected void processEm(@SuppressWarnings("unused") Element node) {
		// so far there is nothing interesting here
	}

	protected void processBr(@SuppressWarnings("unused") Element node) {
		// so far there is nothing interesting here
	}


	protected abstract void processA(Element node);

	protected abstract void processDiv(Element node);

	protected void processLink(@SuppressWarnings("unused") Element node) {
		// so far there is nothing interesting here
	}

	protected void processTitle(@SuppressWarnings("unused") Element node) {
		// so far there is nothing interesting here
	}


}
