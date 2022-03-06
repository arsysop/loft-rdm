package ru.arsysop.loft.rgm.seal.library;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;

import org.eclipse.passage.lic.api.LicensedProduct;
import org.eclipse.passage.lic.api.ServiceInvocationResult;
import org.eclipse.passage.lic.api.agreements.AgreementAcceptanceService;
import org.eclipse.passage.lic.api.agreements.AgreementToAccept;
import org.eclipse.passage.lic.api.diagnostic.Trouble;
import org.eclipse.passage.lic.base.BaseServiceInvocationResult;
import org.eclipse.passage.lic.base.diagnostic.BaseDiagnostic;
import org.eclipse.passage.lic.base.diagnostic.code.ForeignLicense;

import ru.arsysop.loft.rgm.seal.RgmFramework;

@SuppressWarnings("restriction")
final class DoesNotBelongToRgm {

	private final LicensedProduct product;

	DoesNotBelongToRgm() {
		this.product = RgmFramework.instance().product();
	}

	ServiceInvocationResult<AgreementAcceptanceService> agreement(AgreementToAccept agreement) {
		return artifact(agreement, "Agreement", this::described);
	}

	ServiceInvocationResult<Boolean> license(Path license) {
		return artifact(license, "License", Path::toString);
	}

	private <T, S> ServiceInvocationResult<S> artifact(T foreign, String type, Function<T, String> describe) {
		return new BaseServiceInvocationResult<S>(new BaseDiagnostic(Arrays.asList(//
				new Trouble(new ForeignLicense(), //
						String.format("%s [%s] does not belong to library [%s v%s]", //
								type, describe.apply(foreign), product.identifier(), product.version())//
				))));
	}

	private String described(AgreementToAccept agreement) {
		return String.format("%s from %s", agreement.definition().path(), agreement.origin());
	}

}
