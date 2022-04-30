/**
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
 */
package ru.arsysop.loft.rgm.spec.edit.providers;


import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ru.arsysop.loft.rgm.spec.model.api.Part;
import ru.arsysop.loft.rgm.spec.model.api.PointItem;
import ru.arsysop.loft.rgm.spec.model.base.DecodeId;
import ru.arsysop.loft.rgm.spec.model.meta.SpecPackage;

/**
 * This is the item provider adapter for a {@link ru.arsysop.loft.rgm.spec.model.api.PointItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PointItemItemProvider extends PartItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointItemItemProvider(AdapterFactory adapterFactory) {
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

			addReferencesPropertyDescriptor(object);
			addRawPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WithReferences_references_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_WithReferences_references_feature", "_UI_WithReferences_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SpecPackage.eINSTANCE.getWithReferences_References(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Raw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRawPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PointItem_raw_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_PointItem_raw_feature", "_UI_PointItem_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SpecPackage.eINSTANCE.getPointItem_Raw(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Point.png")); //$NON-NLS-1$
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
	 * @generated NOT
	 */
	@Override
	public Object getStyledText(Object object) {
		PointItem item = (PointItem) object;
		StyledString styledLabel = new StyledString();
		styledLabel.append(getString("_UI_PointItem_type"), StyledString.Style.QUALIFIER_STYLER); //$NON-NLS-1$
		Optional.ofNullable(item.getNumber()) //
				.filter(Objects::nonNull) //
				.filter(s -> !s.isEmpty())//
				.ifPresent(s -> styledLabel.append(' ' + s, StyledString.Style.COUNTER_STYLER));
		Optional.ofNullable(item.getName()) //
				.filter(Objects::nonNull)//
				.filter(s -> !s.isEmpty())//
				.ifPresent(s -> styledLabel.append(' ' + s + ' ', StyledString.Style.NO_STYLE));
		Optional.of(item.getReferences().stream()//
				.map(Part::getId)//
				.map(new DecodeId())//
				.collect(Collectors.joining("; "))) //$NON-NLS-1$
				.filter(s -> !s.isEmpty()) //
				.ifPresent(s -> {
					styledLabel.append(" (references: ", StyledString.Style.DECORATIONS_STYLER); //$NON-NLS-1$
					styledLabel.append(s, StyledString.Style.COUNTER_STYLER);
					styledLabel.append(")", StyledString.Style.DECORATIONS_STYLER); //$NON-NLS-1$
				});
		Optional.ofNullable(item.getId()) //
				.filter(Objects::nonNull)//
				.filter(s -> !s.isEmpty())//
				.ifPresent(s -> styledLabel.append(" [" + s + "] ", StyledString.Style.DECORATIONS_STYLER)); //$NON-NLS-1$//$NON-NLS-2$
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

		switch (notification.getFeatureID(PointItem.class)) {
			case SpecPackage.POINT_ITEM__RAW:
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
