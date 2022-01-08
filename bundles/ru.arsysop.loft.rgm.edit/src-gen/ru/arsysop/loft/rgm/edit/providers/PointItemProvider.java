/**
 * Copyright (c) 2021 ArSysOp
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 	SPDX-License-Identifier: Apache-2.0
 * Contributors:
 * 	ArSysOp - initial API and implementation
 * 
 */
package ru.arsysop.loft.rgm.edit.providers;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ru.arsysop.loft.rgm.edit.NodeStyle;
import ru.arsysop.loft.rgm.model.api.Part;
import ru.arsysop.loft.rgm.model.api.Point;
import ru.arsysop.loft.rgm.model.api.StyledLine;
import ru.arsysop.loft.rgm.model.meta.RgmPackage;

/**
 * This is the item provider adapter for a
 * {@link ru.arsysop.loft.rgm.model.api.Point} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PointItemProvider extends PartItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PointItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addReferencesPropertyDescriptor(object);
			addTextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the References feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Point_references_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Point_references_feature", "_UI_Point_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 RgmPackage.eINSTANCE.getPoint_References(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Point_text_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Point_text_feature", "_UI_Point_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 RgmPackage.eINSTANCE.getPoint_Text(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, EcoreEditPlugin.INSTANCE.getImage("full/obj16/EObject")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated NOT
	 */
	@Override
	public Object getStyledText(Object object) {
		Point item = (Point) object;
		StyledString styledLabel = new StyledString();
		styledLabel.append(getString("_UI_Point_type"), StyledString.Style.QUALIFIER_STYLER); //$NON-NLS-1$
		Optional.of(item.getName()) //
				.filter(Objects::nonNull)//
				.filter(s -> !s.isEmpty())//
				.ifPresent(s -> styledLabel.append(' ' + s + ' ', StyledString.Style.COUNTER_STYLER));
		Optional.of(item.getReferences().stream().map(Part::getId).collect(Collectors.joining("; "))) //$NON-NLS-1$
				.filter(s -> !s.isEmpty()) //
				.ifPresent(s -> {
					styledLabel.append(" (references: ", StyledString.Style.DECORATIONS_STYLER); //$NON-NLS-1$
					styledLabel.append(s, StyledString.Style.COUNTER_STYLER);
					styledLabel.append(")", StyledString.Style.DECORATIONS_STYLER); //$NON-NLS-1$
				});
		item.getText().stream().findFirst().map(StyledLine::getText).map(List::stream)
				.ifPresent(nodes -> nodes.filter(Objects::nonNull).map(new NodeStyle())
						.forEach(s -> styledLabel.append(s)));
		Optional.of(item.getId()) //
				.filter(Objects::nonNull)//
				.filter(s -> !s.isEmpty())//
				.ifPresent(s -> styledLabel.append(" [" + s + "] ", StyledString.Style.DECORATIONS_STYLER)); //$NON-NLS-1$//$NON-NLS-2$
		return styledLabel;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Point.class)) {
			case RgmPackage.POINT__TEXT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
