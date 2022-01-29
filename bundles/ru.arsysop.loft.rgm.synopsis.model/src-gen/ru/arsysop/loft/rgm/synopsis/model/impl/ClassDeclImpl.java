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
package ru.arsysop.loft.rgm.synopsis.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.arsysop.loft.rgm.synopsis.model.api.CXXMethod;
import ru.arsysop.loft.rgm.synopsis.model.api.ClassDecl;
import ru.arsysop.loft.rgm.synopsis.model.api.Constructor;
import ru.arsysop.loft.rgm.synopsis.model.api.Destructor;
import ru.arsysop.loft.rgm.synopsis.model.api.FieldDecl;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Class
 * Decl</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.synopsis.model.impl.ClassDeclImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.synopsis.model.impl.ClassDeclImpl#getDestructor <em>Destructor</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.synopsis.model.impl.ClassDeclImpl#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.synopsis.model.impl.ClassDeclImpl#getCxxmethod <em>Cxxmethod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDeclImpl extends DefinitionSynopsisImpl implements ClassDecl {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDecl> fields;

	/**
	 * The cached value of the '{@link #getDestructor() <em>Destructor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestructor()
	 * @generated
	 * @ordered
	 */
	protected EList<Destructor> destructor;

	/**
	 * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructors()
	 * @generated
	 * @ordered
	 */
	protected EList<Constructor> constructors;

	/**
	 * The cached value of the '{@link #getCxxmethod() <em>Cxxmethod</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCxxmethod()
	 * @generated
	 * @ordered
	 */
	protected EList<CXXMethod> cxxmethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SynopsisPackage.eINSTANCE.getClassDecl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FieldDecl> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<FieldDecl>(FieldDecl.class, this, SynopsisPackage.CLASS_DECL__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Destructor> getDestructor() {
		if (destructor == null) {
			destructor = new EObjectResolvingEList<Destructor>(Destructor.class, this, SynopsisPackage.CLASS_DECL__DESTRUCTOR);
		}
		return destructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constructor> getConstructors() {
		if (constructors == null) {
			constructors = new EObjectResolvingEList<Constructor>(Constructor.class, this, SynopsisPackage.CLASS_DECL__CONSTRUCTORS);
		}
		return constructors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CXXMethod> getCxxmethod() {
		if (cxxmethod == null) {
			cxxmethod = new EObjectResolvingEList<CXXMethod>(CXXMethod.class, this, SynopsisPackage.CLASS_DECL__CXXMETHOD);
		}
		return cxxmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SynopsisPackage.CLASS_DECL__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case SynopsisPackage.CLASS_DECL__FIELDS:
				return getFields();
			case SynopsisPackage.CLASS_DECL__DESTRUCTOR:
				return getDestructor();
			case SynopsisPackage.CLASS_DECL__CONSTRUCTORS:
				return getConstructors();
			case SynopsisPackage.CLASS_DECL__CXXMETHOD:
				return getCxxmethod();
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
			case SynopsisPackage.CLASS_DECL__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends FieldDecl>)newValue);
				return;
			case SynopsisPackage.CLASS_DECL__DESTRUCTOR:
				getDestructor().clear();
				getDestructor().addAll((Collection<? extends Destructor>)newValue);
				return;
			case SynopsisPackage.CLASS_DECL__CONSTRUCTORS:
				getConstructors().clear();
				getConstructors().addAll((Collection<? extends Constructor>)newValue);
				return;
			case SynopsisPackage.CLASS_DECL__CXXMETHOD:
				getCxxmethod().clear();
				getCxxmethod().addAll((Collection<? extends CXXMethod>)newValue);
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
			case SynopsisPackage.CLASS_DECL__FIELDS:
				getFields().clear();
				return;
			case SynopsisPackage.CLASS_DECL__DESTRUCTOR:
				getDestructor().clear();
				return;
			case SynopsisPackage.CLASS_DECL__CONSTRUCTORS:
				getConstructors().clear();
				return;
			case SynopsisPackage.CLASS_DECL__CXXMETHOD:
				getCxxmethod().clear();
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
			case SynopsisPackage.CLASS_DECL__FIELDS:
				return fields != null && !fields.isEmpty();
			case SynopsisPackage.CLASS_DECL__DESTRUCTOR:
				return destructor != null && !destructor.isEmpty();
			case SynopsisPackage.CLASS_DECL__CONSTRUCTORS:
				return constructors != null && !constructors.isEmpty();
			case SynopsisPackage.CLASS_DECL__CXXMETHOD:
				return cxxmethod != null && !cxxmethod.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ClassDeclImpl
