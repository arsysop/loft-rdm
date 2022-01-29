/*******************************************************************************
 * Copyright (c) 2021 ArSysOp.
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
package ru.arsysop.loft.rgm.synopsis.edit.providers;


import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ru.arsysop.loft.rgm.spec.model.api.Part;
import ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisFactory;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage;

/**
 * This is the item provider adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HeaderSynopsisItemProvider 
	extends DefinitionSynopsisItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderSynopsisItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HeaderSynopsis_part_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_HeaderSynopsis_part_feature", "_UI_HeaderSynopsis_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SynopsisPackage.eINSTANCE.getHeaderSynopsis_Part(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, EcoreEditPlugin.INSTANCE.getImage("full/obj16/EObject")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return ((StyledString)getStyledText(object)).getString();
	}

	/**
	 * This returns the label styled text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getStyledText(Object object) {
		HeaderSynopsis header = (HeaderSynopsis)object;
		StyledString styledLabel = new StyledString();
		styledLabel.append(getString("_UI_Synopsis_type"), StyledString.Style.QUALIFIER_STYLER); //$NON-NLS-1$
		Optional.ofNullable(header.getName())//
				.filter(Objects::nonNull)//
				.filter(s -> !s.isEmpty())//
				.ifPresent(s -> styledLabel.append('<' + s + '>'));
		Optional.ofNullable(header.getPart())//
				.filter(Objects::nonNull)//
				.map(Part::getId)//
				.filter(Objects::nonNull)//
				.filter(s -> !s.isEmpty())//
				.ifPresent(s -> styledLabel.append(" --> ", StyledString.Style.COUNTER_STYLER) //$NON-NLS-1$
						.append('[' + s + ']', StyledString.Style.DECORATIONS_STYLER));
		return styledLabel;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(HeaderSynopsis.class)) {
			case SynopsisPackage.HEADER_SYNOPSIS__DEFINITIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			default:
				super.notifyChanged(notification);
				return;
			}
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createHeaderSynopsis()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createNamespace()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createFunctionDecl()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createClassDecl()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createEnumDecl()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createStructDecl()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createUnionDecl()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createFieldDecl()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createVarDecl()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createTypedefDecl()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createParmDecl()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createFunctionTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createClassTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createCXXMethod()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createDestructor()));

		newChildDescriptors.add
			(createChildParameter
				(SynopsisPackage.eINSTANCE.getHeaderSynopsis_Definitions(),
				 SynopsisFactory.eINSTANCE.createTemplateTypeParameter()));
	}

}
