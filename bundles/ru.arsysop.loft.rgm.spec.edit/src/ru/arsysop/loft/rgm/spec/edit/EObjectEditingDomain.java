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
package ru.arsysop.loft.rgm.spec.edit;

import java.util.Optional;
import java.util.function.Function;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

public final class EObjectEditingDomain implements Function<EObject, EditingDomain> {

	@Override
	public EditingDomain apply(EObject data) {
		return Optional.ofNullable(data)//
				.map(AdapterFactoryEditingDomain::getEditingDomainFor)//
				.orElseGet(() -> new AdapterFactoryEditingDomain(//
						new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE), //
						new BasicCommandStack()//
				));
	}

}
