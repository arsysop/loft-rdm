package ru.arsysop.loft.rgm.base.workbench.editors;

import java.util.function.Function;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

public final class DefaultFileDomain implements Function<IFile, AdapterFactoryEditingDomain> {

	private final AdapterFactoryEditingDomain afed;

	public DefaultFileDomain() {
		afed = new DefaultAdapterDomain().get();
	}

	@Override
	public AdapterFactoryEditingDomain apply(IFile file) {
		return afed;
	}

}
