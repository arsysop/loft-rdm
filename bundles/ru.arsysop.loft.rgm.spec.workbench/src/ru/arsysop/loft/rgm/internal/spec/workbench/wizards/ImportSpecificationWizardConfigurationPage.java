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

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import ru.arsysop.loft.rgm.base.workbench.wizards.ValidatingWizardPage;
import ru.arsysop.loft.rgm.base.workbench.wizards.Validation;
import ru.arsysop.loft.rgm.base.workbench.wizards.validations.ViewerEmptySelectionValidation;
import ru.arsysop.loft.rgm.internal.spec.workbench.Messages;
import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.model.api.Revision;
import ru.arsysop.loft.rgm.spec.workspace.Revisions;

public final class ImportSpecificationWizardConfigurationPage extends ValidatingWizardPage<Document> {

	private Text status;
	private TableViewer revisions;
	private Revision revision;

	public ImportSpecificationWizardConfigurationPage(Supplier<Document> document) {
		super(ImportSpecificationWizardConfigurationPage.class.getName(), document);
		setTitle(Messages.ImportSpecificationWizardConfigurationPage_title);
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(1).equalWidth(true).applyTo(container);
		Group revisionSelection = new Group(container, SWT.NONE);
		revisionSelection.setText(Messages.ImportSpecificationWizardConfigurationPage_groupTitle);
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(revisionSelection);
		GridLayoutFactory.swtDefaults().applyTo(revisionSelection);
		revisions = new TableViewer(revisionSelection, SWT.SINGLE | SWT.H_SCROLL | SWT.BORDER);
		revisions.setLabelProvider(new RevisionLabelProvider());
		revisions.setContentProvider(new ArrayContentProvider());
		revisions.setInput(new Revisions().fromExtensions());
		revisions.addSelectionChangedListener(e -> updateSelection(e.getStructuredSelection()));
		revisions.addSelectionChangedListener(e -> validate());
		revisions.addSelectionChangedListener(e -> updateStatusLine());
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(revisions.getControl());
		status = new Text(revisionSelection, SWT.BORDER);
		status.setEditable(false);
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true, false).applyTo(status);
		validate();
		setControl(container);
	}

	@Override
	protected String defaultMessage() {
		return Messages.ImportSpecificationWizardConfigurationPage_defaultMessage;
	}

	protected String url() {
		return revision().map(Revision::url).orElse(""); //$NON-NLS-1$
	}

	protected Optional<Revision> revision() {
		return Optional.ofNullable(revision);
	}

	private void updateSelection(IStructuredSelection selection) {
		this.revision = Optional.ofNullable(selection) //
				.map(IStructuredSelection::getFirstElement) //
				.filter(Revision.class::isInstance) //
				.map(Revision.class::cast) //
				.orElse(null);
	}

	private void updateStatusLine() {
		status.setText(url());
	}

	@Override
	protected List<Validation<Document>> validations() {
		return Arrays.asList(//
				new ViewerEmptySelectionValidation<>(revisions,
						Messages.ImportSpecificationWizardConfigurationPage_viewerName), //
				new RevisionLicenseCoverageValidation<>(revisions));
	}

}
