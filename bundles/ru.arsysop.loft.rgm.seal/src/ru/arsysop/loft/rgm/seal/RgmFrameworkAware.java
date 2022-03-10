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
package ru.arsysop.loft.rgm.seal;

import java.util.Optional;
import java.util.function.Function;

import org.eclipse.passage.lic.api.Framework;
import org.eclipse.passage.lic.api.ServiceInvocationResult;
import org.eclipse.passage.lic.base.FrameworkAware;

public final class RgmFrameworkAware implements FrameworkAware {
	
	@Override
	public <T> ServiceInvocationResult<T> withFrameworkService(Function<Framework, ServiceInvocationResult<T>> invoke) {
		return invoke.apply(RgmFramework.instance());
	}

	@Override
	public <T> Optional<T> withFramework(Function<Framework, T> invoke) {
		return Optional.ofNullable(invoke.apply(RgmFramework.instance()));
	}

}
