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
package ru.arsysop.loft.rgm.base.workbench.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CollapseAllAction;
import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.ExpandAllAction;
import org.eclipse.emf.edit.ui.action.FindAction;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.RevertAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorPart;

import ru.arsysop.loft.rgm.internal.base.workbench.Messages;

public abstract class EmfActionBarContributor extends EditingDomainActionBarContributor
		implements ISelectionChangedListener {

	private final IAction properties = new ShowPropertiesViewAction(this::getPage);

	private final IAction refresh = new Action(Messages.BaseActionBarContributor_refresh_text) {
		@Override
		public boolean isEnabled() {
			return editor instanceof IViewerProvider;
		}

		@Override
		public void run() {
			if (editor instanceof IViewerProvider) {
				Viewer viewer = ((IViewerProvider) editor).getViewer();
				if (viewer != null) {
					viewer.refresh();
				}
			}
		}
	};

	protected IEditorPart editor;
	protected ISelectionProvider selections;

	protected Collection<IAction> createChildActions;

	protected IMenuManager createChildMenuManager;

	protected Collection<IAction> createSiblingActions;

	protected IMenuManager createSiblingMenuManager;

	public EmfActionBarContributor() {
		super(ADDITIONS_LAST_STYLE);
		loadResourceAction = new LoadResourceAction();
		validateAction = new ValidateAction();
		controlAction = new ControlAction();
		findAction = FindAction.create();
		revertAction = new RevertAction();
		expandAllAction = new ExpandAllAction();
		collapseAllAction = new CollapseAllAction();
	}

	@Override
	public final void contributeToToolBar(IToolBarManager toolBarManager) {
		super.contributeToToolBar(toolBarManager);
		completeToolbar(toolBarManager);
	}

	protected abstract void completeToolbar(IToolBarManager toolBarManager);

	@Override
	public final void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);
		IMenuManager submenuManager = createSubMenu();
		menuManager.insertAfter("additions", submenuManager); //$NON-NLS-1$
		submenuManager.add(new Separator("settings")); //$NON-NLS-1$
		submenuManager.add(new Separator("actions")); //$NON-NLS-1$
		submenuManager.add(new Separator("additions")); //$NON-NLS-1$
		submenuManager.add(new Separator("additions-end")); //$NON-NLS-1$
		createChildMenuManager = new MenuManager(Messages.BaseActionBarContributor_menu_new_child);
		submenuManager.insertBefore("additions", createChildMenuManager); //$NON-NLS-1$
		createSiblingMenuManager = new MenuManager(Messages.BaseActionBarContributor_menu_new_sibling);
		submenuManager.insertBefore("additions", createSiblingMenuManager); //$NON-NLS-1$
		// Force an update because Eclipse hides empty menus now.
		submenuManager.addMenuListener(m -> m.updateAll(true));
		addGlobalActions(submenuManager);
	}

	protected abstract IMenuManager createSubMenu();

	protected Optional<IEditorPart> activeEditor() {
		return Optional.ofNullable(editor);
	}

	@Override
	public final void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		editor = part;
		if (selections != null) {
			selections.removeSelectionChangedListener(this);
		}
		if (part == null) {
			selections = null;
		} else {
			selections = part.getSite().getSelectionProvider();
			if (selections != null) {
				selections.addSelectionChangedListener(this);
				if (selections.getSelection() != null) {
					selectionChanged(new SelectionChangedEvent(selections, selections.getSelection()));
				}
			}
		}
	}

	@Override
	public final void selectionChanged(SelectionChangedEvent event) {
		if (createChildMenuManager != null) {
			depopulateManager(createChildMenuManager, createChildActions);
		}
		if (createSiblingMenuManager != null) {
			depopulateManager(createSiblingMenuManager, createSiblingActions);
		}
		Collection<?> newChildDescriptors = null;
		Collection<?> newSiblingDescriptors = null;

		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
			Object object = ((IStructuredSelection) selection).getFirstElement();

			EditingDomain domain = ((IEditingDomainProvider) editor).getEditingDomain();

			newChildDescriptors = domain.getNewChildDescriptors(object, null);
			newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
		}
		createChildActions = generateCreateChildActions(newChildDescriptors, selection);
		createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);

		if (createChildMenuManager != null) {
			populateManager(createChildMenuManager, createChildActions, null);
			createChildMenuManager.update(true);
		}
		if (createSiblingMenuManager != null) {
			populateManager(createSiblingMenuManager, createSiblingActions, null);
			createSiblingMenuManager.update(true);
		}
	}

	private Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateChildAction(editor, selection, descriptor));
			}
		}
		return actions;
	}

	private Collection<IAction> generateCreateSiblingActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateSiblingAction(editor, selection, descriptor));
			}
		}
		return actions;
	}

	private void populateManager(IContributionManager manager, Collection<? extends IAction> actions,
			String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				} else {
					manager.add(action);
				}
			}
		}
	}

	private void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem) contributionItem).getInnerItem();
				}
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem) contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	@Override
	public final void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		MenuManager children = new MenuManager(Messages.BaseActionBarContributor_menu_new_child);
		populateManager(children, createChildActions, null);
		menuManager.insertBefore("edit", children); //$NON-NLS-1$
		MenuManager sibling = new MenuManager(Messages.BaseActionBarContributor_menu_new_sibling);
		// $NON-NLS-1$
		populateManager(sibling, createSiblingActions, null);
		menuManager.insertBefore("edit", sibling); //$NON-NLS-1$
	}

	@Override
	protected final void addGlobalActions(IMenuManager menuManager) {
		menuManager.insertAfter("additions-end", new Separator("ui-actions")); //$NON-NLS-1$ //$NON-NLS-2$
		menuManager.insertAfter("ui-actions", properties); //$NON-NLS-1$
		refresh.setEnabled(refresh.isEnabled());
		menuManager.insertAfter("ui-actions", refresh); //$NON-NLS-1$
		super.addGlobalActions(menuManager);
	}

	@Override
	protected final boolean removeAllReferencesOnDelete() {
		return true;
	}

}
