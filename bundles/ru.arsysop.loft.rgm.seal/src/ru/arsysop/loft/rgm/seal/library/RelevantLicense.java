package ru.arsysop.loft.rgm.seal.library;

import java.nio.file.Path;
import java.util.function.Predicate;

final class RelevantLicense implements Predicate<Path> {

	@Override
	public boolean test(Path license) {
		return canBeRead(license);
	}

	private boolean canBeRead(Path license) {
		return new RgmLicenseReadingService().service().read(license).data()//
				.map(c -> !c.isEmpty())//
				.orElse(Boolean.FALSE);
	}

}
