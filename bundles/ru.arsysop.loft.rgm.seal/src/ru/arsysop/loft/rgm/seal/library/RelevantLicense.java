package ru.arsysop.loft.rgm.seal.library;

import java.nio.file.Path;
import java.util.function.Predicate;

final class RelevantLicense implements Predicate<Path>{

	@Override
	public boolean test(Path license) {
		throw new UnsupportedOperationException();
	}

}
