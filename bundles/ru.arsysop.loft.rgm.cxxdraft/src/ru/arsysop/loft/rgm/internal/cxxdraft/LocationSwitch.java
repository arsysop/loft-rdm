package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.Objects;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.spec.model.api.Part;
import ru.arsysop.loft.rgm.spec.model.util.SpecSwitch;

public final class LocationSwitch extends SpecSwitch<String> {

	private final String base;

	public LocationSwitch(String base) {
		this.base = Objects.requireNonNull(base, "LocationSwitch::base"); //$NON-NLS-1$
	}

	@Override
	public String casePart(Part object) {
		return base + '/' + object.getId();
	}

	@Override
	public String defaultCase(EObject object) {
		return base;
	}

}
