/**
 */
package ru.arsysop.loft.rgm.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.arsysop.loft.rgm.model.api.ClassTemplate;
import ru.arsysop.loft.rgm.model.api.TemplateTypeParameter;

import ru.arsysop.loft.rgm.model.meta.RgmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.ClassTemplateImpl#getTemplatetypeparameter <em>Templatetypeparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassTemplateImpl extends DeclarationImpl implements ClassTemplate {
	/**
	 * The cached value of the '{@link #getTemplatetypeparameter() <em>Templatetypeparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplatetypeparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateTypeParameter> templatetypeparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RgmPackage.eINSTANCE.getClassTemplate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplateTypeParameter> getTemplatetypeparameter() {
		if (templatetypeparameter == null) {
			templatetypeparameter = new EObjectContainmentEList<TemplateTypeParameter>(TemplateTypeParameter.class, this, RgmPackage.CLASS_TEMPLATE__TEMPLATETYPEPARAMETER);
		}
		return templatetypeparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RgmPackage.CLASS_TEMPLATE__TEMPLATETYPEPARAMETER:
				return ((InternalEList<?>)getTemplatetypeparameter()).basicRemove(otherEnd, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RgmPackage.CLASS_TEMPLATE__TEMPLATETYPEPARAMETER:
				return getTemplatetypeparameter();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RgmPackage.CLASS_TEMPLATE__TEMPLATETYPEPARAMETER:
				getTemplatetypeparameter().clear();
				getTemplatetypeparameter().addAll((Collection<? extends TemplateTypeParameter>)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RgmPackage.CLASS_TEMPLATE__TEMPLATETYPEPARAMETER:
				getTemplatetypeparameter().clear();
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RgmPackage.CLASS_TEMPLATE__TEMPLATETYPEPARAMETER:
				return templatetypeparameter != null && !templatetypeparameter.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ClassTemplateImpl
