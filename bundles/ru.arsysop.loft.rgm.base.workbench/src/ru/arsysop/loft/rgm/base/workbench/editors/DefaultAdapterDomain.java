package ru.arsysop.loft.rgm.base.workbench.editors;

import java.util.HashMap;
import java.util.function.Supplier;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

public final class DefaultAdapterDomain implements Supplier<AdapterFactoryEditingDomain> {

	@Override
	public AdapterFactoryEditingDomain get() {
		return new AdapterFactoryEditingDomain(//
				new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE), //
				new BasicCommandStack(), //
				new HashMap<Resource, Boolean>()//
		);
	}

}
