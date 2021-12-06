package ru.arsysop.loft.rgm.edit;

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
