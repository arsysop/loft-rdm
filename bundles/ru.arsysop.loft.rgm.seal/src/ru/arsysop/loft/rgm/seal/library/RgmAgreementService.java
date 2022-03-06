package ru.arsysop.loft.rgm.seal.library;

import java.util.function.Supplier;

import org.eclipse.passage.lic.api.ServiceInvocationResult;
import org.eclipse.passage.lic.api.agreements.AgreementAcceptanceService;
import org.eclipse.passage.lic.api.agreements.AgreementToAccept;
import org.eclipse.passage.lic.base.BaseServiceInvocationResult;

import ru.arsysop.loft.rgm.seal.RgmFramework;

@SuppressWarnings("restriction")
final class RgmAgreementService implements Supplier<ServiceInvocationResult<AgreementAcceptanceService>> {

	private final AgreementToAccept agreement;

	RgmAgreementService(AgreementToAccept agreement) {
		this.agreement = agreement;
	}

	@Override
	public ServiceInvocationResult<AgreementAcceptanceService> get() {
		if (new RelevantAgreement().test(agreement)) {
			return service();
		}
		return foreignAgreement();
	}

	private ServiceInvocationResult<AgreementAcceptanceService> service() {
		return new BaseServiceInvocationResult<>(RgmFramework.instance().accessCycleConfiguration().acceptance());
	}
	
	private ServiceInvocationResult<AgreementAcceptanceService> foreignAgreement() {
		return new DoesNotBelongToRgm().agreement(agreement);
	}

}
