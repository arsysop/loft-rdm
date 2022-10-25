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

import org.dom4j.Document;
import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.cxxdraft.Structure;
import ru.arsysop.loft.rgm.cxxdraft.base.DelegatingDomElement;
import ru.arsysop.loft.rgm.spec.model.api.DomElement;

public abstract class BaseStructure<C extends EObject> implements Structure {

	protected final C container;
	protected final ResolutionContext context;

	protected BaseStructure(C container, ResolutionContext context) {
		this.container = Objects.requireNonNull(container, "BaseStructure::container"); //$NON-NLS-1$
		this.context = Objects.requireNonNull(context, "BaseStructure::context"); //$NON-NLS-1$
	}

	@Override
	public void read(Document document) {
		DomElement root = new DelegatingDomElement(document.getRootElement());
		List<DomElement> elements = root.elements();
		for (DomElement element : elements) {
			if ("body".equals(element.name())) { //$NON-NLS-1$
				body(element);
			}
		}
	}

	public abstract void body(DomElement body);

}
