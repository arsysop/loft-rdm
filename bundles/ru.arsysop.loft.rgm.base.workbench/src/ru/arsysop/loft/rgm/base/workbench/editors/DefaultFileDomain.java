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
