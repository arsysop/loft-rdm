package ru.arsysop.loft.rgm.seal.library;

import java.util.function.Predicate;

import org.eclipse.passage.lic.api.agreements.AgreementToAccept;

@SuppressWarnings("restriction")
final class RelevantAgreement implements Predicate<AgreementToAccept> {

	@Override
	public boolean test(AgreementToAccept agreement) {
		return agreement.origin().feature().identifier().startsWith("ru.arsysop.loft.rgm");
	}

}
