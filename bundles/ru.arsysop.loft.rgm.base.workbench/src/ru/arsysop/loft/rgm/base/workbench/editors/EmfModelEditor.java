/*******************************************************************************
 * Copyright (c) 2022 ArSysOp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.base.workbench.editors;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
import org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.DecoratingColumLabelProvider;
import org.eclipse.emf.edit.ui.provider.DiagnosticDecorator;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.edit.ui.util.FindAndReplaceTarget;
import org.eclipse.emf.edit.ui.util.IRevertablePart;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.text.IFindReplaceTarget;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.passage.lic.api.requirements.Feature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.osgi.framework.FrameworkUtil;

import ru.arsysop.loft.rgm.base.workbench.RestrictedControls;
import ru.arsysop.loft.rgm.internal.base.workbench.Messages;
import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;

public abstract class EmfModelEditor extends MultiPageEditorPart implements IEditingDomainProvider, ISelectionProvider,
		IMenuListener, IViewerProvider, IGotoMarker, IRevertablePart {

	private final Feature feature;
	protected IContentOutlinePage contentOutlinePage;
	protected IStatusLineManager contentOutlineStatusLineManager;
	protected TreeViewer contentOutlineViewer;
	protected List<IPropertySheetPage> propertySheetPages = new ArrayList<>();

	protected TreeViewer selectionViewer;
	protected ViewerPane currentViewerPane;
	protected Viewer currentViewer;

	protected ISelectionChangedListener selectionChangedListener;
	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
	protected ISelection editorSelection = StructuredSelection.EMPTY;
	protected MarkerHelper markerHelper = new EditUIMarkerHelper();

	protected IPartListener partListener = new IPartListener() {
		@Override
		public void partActivated(IWorkbenchPart p) {
			if (p instanceof ContentOutline) {
				if (((ContentOutline) p).getCurrentPage() == contentOutlinePage) {
					getActionBarContributor().setActiveEditor(EmfModelEditor.this);

					setCurrentViewer(contentOutlineViewer);
				}
			} else if (p instanceof PropertySheet) {
				if (propertySheetPages.contains(((PropertySheet) p).getCurrentPage())) {
					getActionBarContributor().setActiveEditor(EmfModelEditor.this);
					handleActivate();
				}
			} else if (p == EmfModelEditor.this) {
				handleActivate();
			}
		}

		@Override
		public void partBroughtToTop(IWorkbenchPart p) {
			// Ignore.
		}

		@Override
		public void partClosed(IWorkbenchPart p) {
			// Ignore.
		}

		@Override
		public void partDeactivated(IWorkbenchPart p) {
			// Ignore.
		}

		@Override
		public void partOpened(IWorkbenchPart p) {
			// Ignore.
		}
	};

	protected Collection<Resource> removedResources = new ArrayList<Resource>();
	protected Collection<Resource> changedResources = new ArrayList<Resource>();
	protected Collection<Resource> savedResources = new ArrayList<Resource>();
	protected Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

	protected boolean updateProblemIndication = true;
	protected EContentAdapter problemIndicationAdapter = new EContentAdapter() {
		protected boolean dispatching;

		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() instanceof Resource) {
				switch (notification.getFeatureID(Resource.class)) {
				case Resource.RESOURCE__IS_LOADED:
				case Resource.RESOURCE__ERRORS:
				case Resource.RESOURCE__WARNINGS: {
					Resource resource = (Resource) notification.getNotifier();
					Diagnostic diagnostic = analyzeResourceProblems(resource, null);
					if (diagnostic.getSeverity() != Diagnostic.OK) {
						resourceToDiagnosticMap.put(resource, diagnostic);
					} else {
						resourceToDiagnosticMap.remove(resource);
					}
					dispatchUpdateProblemIndication();
					break;
				}
				default:
					break;
				}
			} else {
				super.notifyChanged(notification);
			}
		}

		protected void dispatchUpdateProblemIndication() {
			if (updateProblemIndication && !dispatching) {
				dispatching = true;
				getSite().getShell().getDisplay().asyncExec(new Runnable() {
					@Override
					public void run() {
						dispatching = false;
						updateProblemIndication();
					}
				});
			}
		}

		@Override
		protected void setTarget(Resource resource) {
			basicSetTarget(resource);
		}

		@Override
		protected void unsetTarget(Resource resource) {
			basicUnsetTarget(resource);
			resourceToDiagnosticMap.remove(resource);
			dispatchUpdateProblemIndication();
		}
	};

	protected IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {
		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			try {
				class ResourceDeltaVisitor implements IResourceDeltaVisitor {
					protected ResourceSet rs = editingDomain.getResourceSet();
					protected Collection<Resource> changed = new ArrayList<Resource>();
					protected Collection<Resource> removed = new ArrayList<Resource>();

					@Override
					public boolean visit(final IResourceDelta rd) {
						if (rd.getResource().getType() == IResource.FILE) {
							if (rd.getKind() == IResourceDelta.REMOVED || rd.getKind() == IResourceDelta.CHANGED) {
								Resource resource = rs.getResource(
										URI.createPlatformResourceURI(rd.getFullPath().toString(), true), false);
								if (resource != null) {
									if (rd.getKind() == IResourceDelta.REMOVED) {
										removed.add(resource);
									} else {
										if ((rd.getFlags() & IResourceDelta.MARKERS) != 0) {
											DiagnosticDecorator.DiagnosticAdapter.update(resource, markerHelper
													.getMarkerDiagnostics(resource, (IFile) rd.getResource(), false));
										}
										if ((rd.getFlags() & IResourceDelta.CONTENT) != 0) {
											if (!savedResources.remove(resource)) {
												changed.add(resource);
											}
										}
									}
								}
							}
							return false;
						}
						return true;
					}

					public Collection<Resource> getChangedResources() {
						return changed;
					}

					public Collection<Resource> getRemovedResources() {
						return removed;
					}
				}

				final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
				delta.accept(visitor);

				if (!visitor.getRemovedResources().isEmpty()) {
					getSite().getShell().getDisplay().asyncExec(new Runnable() {
						@Override
						public void run() {
							removedResources.addAll(visitor.getRemovedResources());
							if (!isDirty()) {
								getSite().getPage().closeEditor(EmfModelEditor.this, false);
							}
						}
					});
				}

				if (!visitor.getChangedResources().isEmpty()) {
					getSite().getShell().getDisplay().asyncExec(new Runnable() {
						@Override
						public void run() {
							changedResources.addAll(visitor.getChangedResources());
							if (getSite().getPage().getActiveEditor() == EmfModelEditor.this) {
								handleActivate();
							}
						}
					});
				}
			} catch (CoreException exception) {
				StatusManager.getManager().handle(exception.getStatus());
			}
		}
	};

	protected final AbstractUIPlugin plugin;
	private final AdapterFactoryEditingDomain editingDomain;
	private final ComposedAdapterFactory adapterFactory;
	private final RestrictedControls restricted;

	protected EmfModelEditor(AbstractUIPlugin plugin, Feature feature) {
		this(plugin, new DefaultAdapterDomain(), feature);

	}

	protected EmfModelEditor(AbstractUIPlugin plugin, Supplier<AdapterFactoryEditingDomain> afed, Feature feature) {
		super();
		this.plugin = plugin;
		this.feature = feature;
		this.restricted = new RestrictedControls(feature);
		editingDomain = afed.get();
		adapterFactory = (ComposedAdapterFactory) editingDomain.getAdapterFactory();
		initializeEditingDomain();
	}

	protected final void handleActivate() {
		if (editingDomain.getResourceToReadOnlyMap() != null) {
			editingDomain.getResourceToReadOnlyMap().clear();
			setSelection(getSelection());
		}
		if (!removedResources.isEmpty()) {
			if (handleDirtyConflict()) {
				getSite().getPage().closeEditor(EmfModelEditor.this, false);
			} else {
				removedResources.clear();
				changedResources.clear();
				savedResources.clear();
			}
		} else if (!changedResources.isEmpty()) {
			changedResources.removeAll(savedResources);
			handleChangedResources();
			changedResources.clear();
			savedResources.clear();
		}
	}

	protected final void handleChangedResources() {
		if (!changedResources.isEmpty() && (!isDirty() || handleDirtyConflict())) {
			ResourceSet resourceSet = editingDomain.getResourceSet();
			if (isDirty()) {
				changedResources.addAll(resourceSet.getResources());
			}
			editingDomain.getCommandStack().flush();
			updateProblemIndication = false;
			for (Resource resource : changedResources) {
				if (resource.isLoaded()) {
					resource.unload();
					try {
						resource.load(resourceSet.getLoadOptions());
					} catch (IOException exception) {
						if (!resourceToDiagnosticMap.containsKey(resource)) {
							resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
						}
					}
				}
			}
			if (AdapterFactoryEditingDomain.isStale(editorSelection)) {
				setSelection(StructuredSelection.EMPTY);
			}
			updateProblemIndication = true;
			updateProblemIndication();
		}
	}

	protected final void updateProblemIndication() {
		if (updateProblemIndication) {
			BasicDiagnostic diagnostic = new BasicDiagnostic(Diagnostic.OK, diagnosticSource(), 0, null,
					new Object[] { editingDomain.getResourceSet() });
			for (Diagnostic childDiagnostic : resourceToDiagnosticMap.values()) {
				if (childDiagnostic.getSeverity() != Diagnostic.OK) {
					diagnostic.add(childDiagnostic);
				}
			}
			int lastEditorPage = getPageCount() - 1;
			if (lastEditorPage >= 0 && getEditor(lastEditorPage) instanceof ProblemEditorPart) {
				((ProblemEditorPart) getEditor(lastEditorPage)).setDiagnostic(diagnostic);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					setActivePage(lastEditorPage);
				}
			} else if (diagnostic.getSeverity() != Diagnostic.OK) {
				ProblemEditorPart problemEditorPart = new ProblemEditorPart();
				problemEditorPart.setDiagnostic(diagnostic);
				problemEditorPart.setMarkerHelper(markerHelper);
				try {
					addPage(++lastEditorPage, problemEditorPart, getEditorInput());
					setPageText(lastEditorPage, problemEditorPart.getPartName());
					setActivePage(lastEditorPage);
					showTabs();
				} catch (PartInitException exception) {
					StatusManager.getManager().handle(exception.getStatus());
				}
			}
			if (markerHelper.hasMarkers(editingDomain.getResourceSet())) {
				try {
					markerHelper.updateMarkers(diagnostic);
				} catch (CoreException exception) {
					StatusManager.getManager().handle(exception.getStatus());
				}
			}
		}
	}

	protected final boolean handleDirtyConflict() {
		return MessageDialog.openQuestion(getSite().getShell(), //
				Messages.BaseModelEditor_q_conflict_title, Messages.BaseModelEditor_q_conflict_description);
	}

	protected final void initializeEditingDomain() {
		CommandStack stack = editingDomain.getCommandStack();
		// FIXME: AF: command stack should cancel decorator;
//		DiagnosticDecorator.cancel(editingDomain);
		stack.addCommandStackListener(new CommandStackListener() {
			@Override
			public void commandStackChanged(final EventObject event) {
				getContainer().getDisplay().asyncExec(new Runnable() {
					@Override
					public void run() {
						firePropertyChange(IEditorPart.PROP_DIRTY);

						// Try to select the affected objects.
						//
						Command mostRecentCommand = ((CommandStack) event.getSource()).getMostRecentCommand();
						if (mostRecentCommand != null) {
							setSelectionToViewer(mostRecentCommand.getAffectedObjects());
						}
						for (Iterator<IPropertySheetPage> i = propertySheetPages.iterator(); i.hasNext();) {
							IPropertySheetPage propertySheetPage = i.next();
							if (propertySheetPage.getControl() == null || propertySheetPage.getControl().isDisposed()) {
								i.remove();
							} else {
								if (propertySheetPage instanceof PropertySheetPage) {
									PropertySheetPage refreshable = (PropertySheetPage) propertySheetPage;
									refreshable.refresh();
								}
							}
						}
					}
				});
			}
		});
	}

	protected abstract String domainName();

	protected abstract void addDomainAdapterFactories(ComposedAdapterFactory composed);

	@Override
	protected final void firePropertyChange(int action) {
		super.firePropertyChange(action);
	}

	public final void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					if (currentViewer != null) {
						currentViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);
					}
				}
			};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}

	@Override
	public final EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public final class ReverseAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
		public ReverseAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getElements(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
		}

		@Override
		public Object[] getChildren(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
		}

		@Override
		public boolean hasChildren(Object object) {
			Object parent = super.getParent(object);
			return parent != null;
		}

		@Override
		public Object getParent(Object object) {
			return null;
		}
	}

	public final void setCurrentViewerPane(ViewerPane viewerPane) {
		if (currentViewerPane != viewerPane) {
			if (currentViewerPane != null) {
				currentViewerPane.showFocus(false);
			}
			currentViewerPane = viewerPane;
		}
		setCurrentViewer(currentViewerPane.getViewer());
	}

	public final void setCurrentViewer(Viewer viewer) {
		if (currentViewer != viewer) {
			if (selectionChangedListener == null) {
				selectionChangedListener = new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent selectionChangedEvent) {
						setSelection(selectionChangedEvent.getSelection());
					}
				};
			}
			if (currentViewer != null) {
				currentViewer.removeSelectionChangedListener(selectionChangedListener);
			}
			if (viewer != null) {
				viewer.addSelectionChangedListener(selectionChangedListener);
			}
			currentViewer = viewer;
			setSelection(currentViewer == null ? StructuredSelection.EMPTY : currentViewer.getSelection());
		}
	}

	@Override
	public final Viewer getViewer() {
		return currentViewer;
	}

	protected final void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.add(new Separator("additions")); //$NON-NLS-1$
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));
		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), LocalSelectionTransfer.getTransfer(),
				FileTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer));
	}

	private void createModel() {
		URI resourceURI = EditUIUtil.getURI(getEditorInput(), editingDomain.getResourceSet().getURIConverter());
		// FIXME: AF: process load status
		Exception exception = null;
		Resource resource = null;
		try {
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		} catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}
		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
		}
		editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
	}

	public final Diagnostic analyzeResourceProblems(Resource resource, Exception exception) {
		boolean hasErrors = !resource.getErrors().isEmpty();
		String diagnosticSource = diagnosticSource();
		if (hasErrors || !resource.getWarnings().isEmpty()) {
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(hasErrors ? Diagnostic.ERROR : Diagnostic.WARNING,
					diagnosticSource, 0, //
					NLS.bind(Messages.BaseModelEditor_e_file_problem, new Object[] { resource.getURI() }),
					new Object[] { exception == null ? (Object) resource : exception });
			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
			return basicDiagnostic;
		} else if (exception != null) {
			return new BasicDiagnostic(Diagnostic.ERROR, diagnosticSource, 0,
					NLS.bind(Messages.BaseModelEditor_e_file_problem, new Object[] { resource.getURI() }),
					new Object[] { exception });
		} else {
			return Diagnostic.OK_INSTANCE;
		}
	}

	private String diagnosticSource() {
		return plugin.getBundle().getSymbolicName();
	}

	@Override
	public final void createPages() {
		if (new RgmLicenseProtection().cannotUse(feature)) {
			int pageIndex = addPage(restricted.createLink(getContainer()));
			setPageText(pageIndex, Messages.BaseModelEditor_page_text);
			return;
		}
		createModel();
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {
			{
				ViewerPane viewerPane = new ViewerPane(getSite().getPage(), EmfModelEditor.this) {
					@Override
					public Viewer createViewer(Composite composite) {
						Tree tree = new Tree(composite, SWT.MULTI);
						TreeViewer newTreeViewer = new TreeViewer(tree);
						return newTreeViewer;
					}

					@Override
					public void requestActivation() {
						super.requestActivation();
						setCurrentViewerPane(this);
					}
				};
				viewerPane.createControl(getContainer());

				selectionViewer = (TreeViewer) viewerPane.getViewer();
				selectionViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
				selectionViewer.setUseHashlookup(true);

				selectionViewer.setLabelProvider(
						new DecoratingColumLabelProvider(new AdapterFactoryLabelProvider(adapterFactory),
								new DiagnosticDecorator(editingDomain, selectionViewer, plugin.getDialogSettings())));
				selectionViewer.setInput(editingDomain.getResourceSet());
				selectionViewer.setSelection(
						new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
				viewerPane.setTitle(editingDomain.getResourceSet());

				new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);
				new ColumnViewerInformationControlToolTipSupport(selectionViewer,
						new DiagnosticDecorator.EditingDomainLocationListener(editingDomain, selectionViewer));

				createContextMenuFor(selectionViewer);
				int pageIndex = addPage(viewerPane.getControl());
				setPageText(pageIndex, Messages.BaseModelEditor_page_text);
			}
			getSite().getShell().getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					if (!getContainer().isDisposed()) {
						setActivePage(0);
					}
				}
			});
		}
		getContainer().addControlListener(new ControlAdapter() {
			boolean guard = false;

			@Override
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		getSite().getShell().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				updateProblemIndication();
			}
		});
	}

	protected final void hideTabs() {
		if (getPageCount() <= 1) {
			setPageText(0, ""); //$NON-NLS-1$
			if (getContainer() instanceof CTabFolder) {
				Point point = getContainer().getSize();
				Rectangle clientArea = getContainer().getClientArea();
				getContainer().setSize(point.x, 2 * point.y - clientArea.height - clientArea.y);
			}
		}
	}

	protected final void showTabs() {
		if (getPageCount() > 1) {
			setPageText(0, Messages.BaseModelEditor_page_text);
			if (getContainer() instanceof CTabFolder) {
				Point point = getContainer().getSize();
				Rectangle clientArea = getContainer().getClientArea();
				getContainer().setSize(point.x, clientArea.height + clientArea.y);
			}
		}
	}

	@Override
	protected final void pageChange(int pageIndex) {
		super.pageChange(pageIndex);
		if (contentOutlinePage != null) {
			handleContentOutlineSelection(contentOutlinePage.getSelection());
		}
	}

	@Override
	public final <T> T getAdapter(Class<T> key) {
		if (key.equals(IContentOutlinePage.class)) {
			return showOutlineView() ? key.cast(getContentOutlinePage()) : null;
		} else if (key.equals(IPropertySheetPage.class)) {
			return key.cast(getPropertySheetPage());
		} else if (key.equals(IGotoMarker.class)) {
			return key.cast(this);
		} else if (key.equals(IFindReplaceTarget.class)) {
			return FindAndReplaceTarget.getAdapter(key, this, plugin);
		} else {
			return super.getAdapter(key);
		}
	}

	public final IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			final class InternalContentOutlinePage extends ContentOutlinePage {
				@Override
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);
					contentOutlineViewer.setUseHashlookup(true);
					contentOutlineViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
					contentOutlineViewer.setLabelProvider(new DecoratingColumLabelProvider(
							new AdapterFactoryLabelProvider(adapterFactory),
							new DiagnosticDecorator(editingDomain, contentOutlineViewer, plugin.getDialogSettings())));
					contentOutlineViewer.setInput(editingDomain.getResourceSet());

					new ColumnViewerInformationControlToolTipSupport(contentOutlineViewer,
							new DiagnosticDecorator.EditingDomainLocationListener(editingDomain, contentOutlineViewer));
					createContextMenuFor(contentOutlineViewer);
					if (!editingDomain.getResourceSet().getResources().isEmpty()) {
						contentOutlineViewer.setSelection(
								new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
					}
				}

				@Override
				public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager,
						IStatusLineManager statusLineManager) {
					super.makeContributions(menuManager, toolBarManager, statusLineManager);
					contentOutlineStatusLineManager = statusLineManager;
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this, actionBars);
				}
			}

			contentOutlinePage = new InternalContentOutlinePage();
			contentOutlinePage.addSelectionChangedListener(new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					handleContentOutlineSelection(event.getSelection());
				}
			});
		}

		return contentOutlinePage;
	}

	public final IPropertySheetPage getPropertySheetPage() {
		IPropertySheetPage propertySheetPage = createPropertySheetPage(editingDomain);
		propertySheetPages.add(propertySheetPage);
		return propertySheetPage;
	}

	protected IPropertySheetPage createPropertySheetPage(AdapterFactoryEditingDomain domain) {
		return Optional.ofNullable(PlatformUI.getWorkbench().getService(PropertySheetPages.class))//
				.orElseGet(() -> new DefaultPropertyPages())//
				.createPropertyPage(domain, this);
	}

	public final void handleContentOutlineSelection(ISelection selection) {
		if (currentViewerPane != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
			Iterator<?> selectedElements = ((IStructuredSelection) selection).iterator();
			if (selectedElements.hasNext()) {
				Object selectedElement = selectedElements.next();
				if (currentViewerPane.getViewer() == selectionViewer) {
					ArrayList<Object> selectionList = new ArrayList<Object>();
					selectionList.add(selectedElement);
					while (selectedElements.hasNext()) {
						selectionList.add(selectedElements.next());
					}
					selectionViewer.setSelection(new StructuredSelection(selectionList));
				} else {
					if (currentViewerPane.getViewer().getInput() != selectedElement) {
						currentViewerPane.getViewer().setInput(selectedElement);
						currentViewerPane.setTitle(selectedElement);
					}
				}
			}
		}
	}

	@Override
	public final boolean isDirty() {
		return ((BasicCommandStack) editingDomain.getCommandStack()).isSaveNeeded();
	}

	@Override
	public final void doRevert() {
		DiagnosticDecorator.cancel(editingDomain);
		ResourceSet resourceSet = editingDomain.getResourceSet();
		List<Resource> resources = resourceSet.getResources();
		List<Resource> unloadedResources = new ArrayList<Resource>();
		updateProblemIndication = false;
		for (int i = 0; i < resources.size(); ++i) {
			Resource resource = resources.get(i);
			if (resource.isLoaded()) {
				resource.unload();
				unloadedResources.add(resource);
			}
		}
		resourceToDiagnosticMap.clear();
		for (Resource resource : unloadedResources) {
			try {
				resource.load(resourceSet.getLoadOptions());
			} catch (IOException exception) {
				if (!resourceToDiagnosticMap.containsKey(resource)) {
					resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
				}
			}
		}
		editingDomain.getCommandStack().flush();
		if (AdapterFactoryEditingDomain.isStale(editorSelection)) {
			setSelection(StructuredSelection.EMPTY);
		}
		updateProblemIndication = true;
		updateProblemIndication();
	}

	@Override
	public final void doSave(IProgressMonitor progressMonitor) {
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOptions.put(Resource.OPTION_LINE_DELIMITER, Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			public void execute(IProgressMonitor monitor) {
				boolean first = true;
				List<Resource> resources = editingDomain.getResourceSet().getResources();
				for (int i = 0; i < resources.size(); ++i) {
					Resource resource = resources.get(i);
					if ((first || !resource.getContents().isEmpty() || isPersisted(resource))
							&& !editingDomain.isReadOnly(resource)) {
						try {
							long timeStamp = resource.getTimeStamp();
							resource.save(saveOptions);
							if (resource.getTimeStamp() != timeStamp) {
								savedResources.add(resource);
							}
						} catch (Exception exception) {
							resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
						}
						first = false;
					}
				}
			}
		};

		updateProblemIndication = false;
		try {
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);
			((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} catch (Exception exception) {
			StatusManager.getManager().handle(new Status(IStatus.ERROR,
					FrameworkUtil.getBundle(getClass()).getSymbolicName(), exception.getMessage(), exception));
		}
		updateProblemIndication = true;
		updateProblemIndication();
	}

	protected final boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet().getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		} catch (IOException e) {
			// Ignore
		}
		return result;
	}

	@Override
	public final boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	public final void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();
		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null) {
				doSaveAs(URI.createPlatformResourceURI(file.getFullPath().toString(), true), new FileEditorInput(file));
			}
		}
	}

	protected final void doSaveAs(URI uri, IEditorInput editorInput) {
		(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor = getActionBars().getStatusLineManager() != null
				? getActionBars().getStatusLineManager().getProgressMonitor()
				: new NullProgressMonitor();
		doSave(progressMonitor);
	}

	@Override
	public final void gotoMarker(IMarker marker) {
		List<?> targetObjects = markerHelper.getTargetObjects(editingDomain, marker);
		if (!targetObjects.isEmpty()) {
			setSelectionToViewer(targetObjects);
		}
	}

	@Override
	public final void init(IEditorSite site, IEditorInput editorInput) {
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		site.setSelectionProvider(this);
		site.getPage().addPartListener(partListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener,
				IResourceChangeEvent.POST_CHANGE);
	}

	@Override
	public final void setFocus() {
		if (currentViewerPane != null) {
			currentViewerPane.setFocus();
		} else {
			getControl(getActivePage()).setFocus();
		}
	}

	@Override
	public final void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	@Override
	public final void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	@Override
	public final ISelection getSelection() {
		return editorSelection;
	}

	@Override
	public final void setSelection(ISelection selection) {
		editorSelection = selection;

		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
		setStatusLineManager(selection);
	}

	public final void setStatusLineManager(ISelection selection) {
		IStatusLineManager statusLineManager = currentViewer != null && currentViewer == contentOutlineViewer
				? contentOutlineStatusLineManager
				: getActionBars().getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				Collection<?> collection = ((IStructuredSelection) selection).toList();
				switch (collection.size()) {
				case 0: {
					statusLineManager.setMessage(Messages.BaseModelEditor_selected_zero);
					break;
				}
				case 1: {
					String text = new AdapterFactoryItemDelegator(adapterFactory).getText(collection.iterator().next());
					statusLineManager
							.setMessage(NLS.bind(Messages.BaseModelEditor_selected_one, new Object[] { text }));
					break;
				}
				default: {
					statusLineManager.setMessage(NLS.bind(Messages.BaseModelEditor_selected_many,
							new Object[] { Integer.toString(collection.size()) }));
					break;
				}
				}
			} else {
				statusLineManager.setMessage(""); //$NON-NLS-1$
			}
		}
	}

	@Override
	public final void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener) getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

	public final EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor) getEditorSite().getActionBarContributor();
	}

	public final IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	public final AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	@Override
	public final void dispose() {
		updateProblemIndication = false;
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);
		getSite().getPage().removePartListener(partListener);
		// FIXME:AF: wrap adapter factory?
//		adapterFactory.dispose();
		if (getActionBarContributor().getActiveEditor() == this) {
			getActionBarContributor().setActiveEditor(null);
		}
		for (IPropertySheetPage propertySheetPage : propertySheetPages) {
			propertySheetPage.dispose();
		}
		if (contentOutlinePage != null) {
			contentOutlinePage.dispose();
		}
		super.dispose();
	}

	private boolean showOutlineView() {
		return true;
	}

	public final IDialogSettings getDialogSettings() {
		return plugin.getDialogSettings();
	}
}
