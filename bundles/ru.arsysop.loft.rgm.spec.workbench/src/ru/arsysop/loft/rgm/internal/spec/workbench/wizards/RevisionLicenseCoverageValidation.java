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
package ru.arsysop.loft.rgm.internal.spec.workbench.wizards;

import java.util.Optional;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.passage.lic.api.requirements.Feature;

import ru.arsysop.loft.rgm.base.workbench.wizards.Validation;
import ru.arsysop.loft.rgm.internal.spec.workbench.Messages;
import ru.arsysop.loft.rgm.seal.RgmFeatures;
import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;
import ru.arsysop.loft.rgm.spec.model.api.Revision;

final class RevisionLicenseCoverageValidation<T> implements Validation<T> {

	private final StructuredViewer revisions;

	RevisionLicenseCoverageValidation(StructuredViewer revisions) {
		this.revisions = revisions;
	}

	@Override
	public IStatus apply(T t) {
		IStructuredSelection selection = revisions.getStructuredSelection();
		if (selection.isEmpty()) {
			return Status.OK_STATUS;// none of our concern
		}
		Revision revision = (Revision) selection.getFirstElement();
		Optional<Feature> feature = feature(revision);
		if (feature.isEmpty()) {
			return Status.OK_STATUS;
		}
		if (!new RgmLicenseProtection().canUse(feature.get())) {
			return Status.OK_STATUS;
		}
		return notCovered(feature.get());
	}

	private Status notCovered(Feature feature) {
		return new Status(IStatus.ERROR, getClass(),
				String.format(Messages.RevisionLicenseCoverageValidation_noLicense, feature.name(), feature.version()));
	}

	private Optional<Feature> feature(Revision revision) {
		if (revision.name().contains("14")) { //$NON-NLS-1$
			return Optional.of(new RgmFeatures.Cxx().importCxx14());
		} else if (revision.name().contains("17")) { //$NON-NLS-1$
			return Optional.of(new RgmFeatures.Cxx().importCxx17());
		}
		return Optional.empty();
	}

}
