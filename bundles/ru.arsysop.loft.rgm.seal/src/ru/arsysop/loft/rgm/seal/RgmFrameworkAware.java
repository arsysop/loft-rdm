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
