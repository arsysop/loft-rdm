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
package ru.arsysop.loft.rgm.spec.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ru.arsysop.loft.rgm.spec.model.api.Part;
import ru.arsysop.loft.rgm.spec.model.api.PointText;
import ru.arsysop.loft.rgm.spec.model.api.WithReferences;

import ru.arsysop.loft.rgm.spec.model.meta.SpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.impl.PointTextImpl#getReferences <em>References</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.impl.PointTextImpl#getRaw <em>Raw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointTextImpl extends PartImpl implements PointText {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> references;

	/**
	 * The default value of the '{@link #getRaw() <em>Raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaw()
	 * @generated
	 * @ordered
	 */
	protected static final String RAW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRaw() <em>Raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaw()
	 * @generated
	 * @ordered
	 */
	protected String raw = RAW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecPackage.eINSTANCE.getPointText();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Part> getReferences() {
		if (references == null) {
			references = new EObjectResolvingEList<Part>(Part.class, this, SpecPackage.POINT_TEXT__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRaw() {
		return raw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRaw(String newRaw) {
		String oldRaw = raw;
		raw = newRaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.POINT_TEXT__RAW, oldRaw, raw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecPackage.POINT_TEXT__REFERENCES:
				return getReferences();
			case SpecPackage.POINT_TEXT__RAW:
				return getRaw();
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
			case SpecPackage.POINT_TEXT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Part>)newValue);
				return;
			case SpecPackage.POINT_TEXT__RAW:
				setRaw((String)newValue);
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
			case SpecPackage.POINT_TEXT__REFERENCES:
				getReferences().clear();
				return;
			case SpecPackage.POINT_TEXT__RAW:
				setRaw(RAW_EDEFAULT);
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
			case SpecPackage.POINT_TEXT__REFERENCES:
				return references != null && !references.isEmpty();
			case SpecPackage.POINT_TEXT__RAW:
				return RAW_EDEFAULT == null ? raw != null : !RAW_EDEFAULT.equals(raw);
			default:
				return super.eIsSet(featureID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == WithReferences.class) {
			switch (derivedFeatureID) {
				case SpecPackage.POINT_TEXT__REFERENCES: return SpecPackage.WITH_REFERENCES__REFERENCES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == WithReferences.class) {
			switch (baseFeatureID) {
				case SpecPackage.WITH_REFERENCES__REFERENCES: return SpecPackage.POINT_TEXT__REFERENCES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (raw: "); //$NON-NLS-1$
		result.append(raw);
		result.append(')');
		return result.toString();
	}

} //PointTextImpl
