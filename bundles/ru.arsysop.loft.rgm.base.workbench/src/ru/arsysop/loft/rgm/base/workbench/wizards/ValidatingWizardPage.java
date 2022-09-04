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
package ru.arsysop.loft.rgm.base.workbench.wizards;

import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.wizard.WizardPage;

public abstract class ValidatingWizardPage<S> extends WizardPage {

	private final Supplier<S> scope;
	private final ValidatingWizardPageIndication indication;

	protected ValidatingWizardPage(String pageName, Supplier<S> scope) {
		super(pageName);
		this.scope = scope;
		this.indication = new ValidatingWizardPageIndication(this);
	}

	protected abstract List<Validation<S>> validations();

	protected abstract String defaultMessage();

	protected final void validate() {
		validations().stream() //
				.map(v -> v.apply(scope.get())) //
				.sorted(problemsLast()) //
				.forEach(indication::update);
	}

	private Comparator<IStatus> problemsLast() {
		return (first, second) -> Integer.compare(first.getSeverity(), second.getSeverity());
	}
}
