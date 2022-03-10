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

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.passage.lic.api.requirements.Feature;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import ru.arsysop.loft.rgm.internal.base.workbench.Messages;

public abstract class EmfModelWizard extends BasicNewFileResourceWizard {

	private final ResourceLocator locator;
	private final EClass type;
	private final Function<IFile, AdapterFactoryEditingDomain> ed;
	private final Supplier<String> ext;
	private final Feature feature;

	private EmfModelWizardPage page;

	public EmfModelWizard(ResourceLocator locator, EClass eclass, Function<IFile, AdapterFactoryEditingDomain> ed,
			Supplier<String> ext, Feature feature) {
		this.locator = Objects.requireNonNull(locator);
		this.type = Objects.requireNonNull(eclass);
		this.ed = Objects.requireNonNull(ed);
		this.ext = Objects.requireNonNull(ext);
		this.feature = Objects.requireNonNull(feature);
	}

	@Override
	public final void init(IWorkbench workbench, IStructuredSelection structured) {
		super.init(workbench, structured);
	}

	@Override
	public final void addPages() {
		String name = locator.getString(NLS.bind("_UI_{0}_type", type.getName())); //$NON-NLS-1$
		setWindowTitle(NLS.bind(Messages.BaseModelWizard_title, name));
		String extension = ext.get();
		page = new EmfModelWizardPage(extension, selection, feature);
		page.setTitle(name);
		page.setDescription(NLS.bind(Messages.BaseModelWizard_description, name));
		page.setFileName(type.getEPackage().getName() + "." + extension); //$NON-NLS-1$
		addPage(page);
		applySelection(extension);
	}

	private void applySelection(String extension) {
		Optional.ofNullable(selection)//
				.map(s -> s.getFirstElement())//
				.filter(IResource.class::isInstance)//
				.map(IResource.class::cast)//
				.ifPresent(r -> applySelection(extension, r));
	}

	private void applySelection(String extension, IResource r) {
		IResource resource = r.getType() == IResource.FILE ? r.getParent() : r;
		if (resource instanceof IFolder || resource instanceof IProject) {
			page.setContainerFullPath(resource.getFullPath());
			String base = type.getEPackage().getName();
			String file = base + "." + extension; //$NON-NLS-1$
			for (int i = 1; ((IContainer) resource).findMember(file) != null; ++i) {
				file = base + i + "." + extension; //$NON-NLS-1$
			}
			page.setFileName(file);
		}
	}

	@Override
	public boolean performFinish() {
		IFile file = page.createNewFile();
		if (file == null) {
			return false;
		}
		try {
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progress) throws InvocationTargetException {
					try {
						URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
						Resource resource = ed.apply(file).getResourceSet().createResource(uri);
						EObject initial = type.getEPackage().getEFactoryInstance().create(type);
						resource.getContents().add(initial);
						Map<Object, Object> options = new HashMap<Object, Object>();
						options.put(XMLResource.OPTION_ENCODING, StandardCharsets.UTF_8.name());
						resource.save(options);
					} catch (Exception exception) {
						throw new InvocationTargetException(exception);
					} finally {
						progress.done();
					}
				}
			};
			getContainer().run(false, false, operation);
		} catch (Exception exception) {
			Bundle bundle = FrameworkUtil.getBundle(getClass());
			Platform.getLog(bundle)
					.log(new Status(IStatus.ERROR, bundle.getSymbolicName(), exception.getMessage(), exception));
			return false;
		}
		selectAndReveal(file);
		Optional.of(getWorkbench())//
				.map(IWorkbench::getActiveWorkbenchWindow)//
				.map(IWorkbenchWindow::getActivePage)//
				.ifPresent(p -> openEditor(file, p));
		return true;
	}

	private void openEditor(IFile file, IWorkbenchPage active) {
		try {
			IDE.openEditor(active, file, true);
		} catch (PartInitException e) {
			ErrorDialog.openError(getShell(), getWindowTitle(), e.getMessage(), e.getStatus());
		}
	}

}
