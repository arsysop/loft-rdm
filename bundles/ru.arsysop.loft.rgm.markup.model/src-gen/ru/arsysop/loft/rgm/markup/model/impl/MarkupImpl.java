/**
 * Copyright (c) 2022 ArSysOp
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
package ru.arsysop.loft.rgm.markup.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.arsysop.loft.rgm.markup.model.api.Citation;
import ru.arsysop.loft.rgm.markup.model.api.Contract;
import ru.arsysop.loft.rgm.markup.model.api.Markup;
import ru.arsysop.loft.rgm.markup.model.api.Requirement;
import ru.arsysop.loft.rgm.markup.model.api.Tag;

import ru.arsysop.loft.rgm.markup.model.meta.MarkupPackage;
import ru.arsysop.loft.rgm.synopsis.model.api.Header;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.markup.model.impl.MarkupImpl#getCitations <em>Citations</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.markup.model.impl.MarkupImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.markup.model.impl.MarkupImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.markup.model.impl.MarkupImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.markup.model.impl.MarkupImpl#getContracts <em>Contracts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkupImpl extends MinimalEObjectImpl.Container implements Markup {
	/**
	 * The cached value of the '{@link #getCitations() <em>Citations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitations()
	 * @generated
	 * @ordered
	 */
	protected EList<Citation> citations;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<Header> headers;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getContracts() <em>Contracts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> contracts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupPackage.eINSTANCE.getMarkup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Citation> getCitations() {
		if (citations == null) {
			citations = new EObjectContainmentEList<Citation>(Citation.class, this, MarkupPackage.MARKUP__CITATIONS);
		}
		return citations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Header> getHeaders() {
		if (headers == null) {
			headers = new EObjectResolvingEList<Header>(Header.class, this, MarkupPackage.MARKUP__HEADERS);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, MarkupPackage.MARKUP__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, MarkupPackage.MARKUP__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contract> getContracts() {
		if (contracts == null) {
			contracts = new EObjectContainmentEList<Contract>(Contract.class, this, MarkupPackage.MARKUP__CONTRACTS);
		}
		return contracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkupPackage.MARKUP__CITATIONS:
				return ((InternalEList<?>)getCitations()).basicRemove(otherEnd, msgs);
			case MarkupPackage.MARKUP__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case MarkupPackage.MARKUP__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case MarkupPackage.MARKUP__CONTRACTS:
				return ((InternalEList<?>)getContracts()).basicRemove(otherEnd, msgs);
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
			case MarkupPackage.MARKUP__CITATIONS:
				return getCitations();
			case MarkupPackage.MARKUP__HEADERS:
				return getHeaders();
			case MarkupPackage.MARKUP__REQUIREMENTS:
				return getRequirements();
			case MarkupPackage.MARKUP__TAGS:
				return getTags();
			case MarkupPackage.MARKUP__CONTRACTS:
				return getContracts();
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
			case MarkupPackage.MARKUP__CITATIONS:
				getCitations().clear();
				getCitations().addAll((Collection<? extends Citation>)newValue);
				return;
			case MarkupPackage.MARKUP__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends Header>)newValue);
				return;
			case MarkupPackage.MARKUP__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case MarkupPackage.MARKUP__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case MarkupPackage.MARKUP__CONTRACTS:
				getContracts().clear();
				getContracts().addAll((Collection<? extends Contract>)newValue);
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
			case MarkupPackage.MARKUP__CITATIONS:
				getCitations().clear();
				return;
			case MarkupPackage.MARKUP__HEADERS:
				getHeaders().clear();
				return;
			case MarkupPackage.MARKUP__REQUIREMENTS:
				getRequirements().clear();
				return;
			case MarkupPackage.MARKUP__TAGS:
				getTags().clear();
				return;
			case MarkupPackage.MARKUP__CONTRACTS:
				getContracts().clear();
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
			case MarkupPackage.MARKUP__CITATIONS:
				return citations != null && !citations.isEmpty();
			case MarkupPackage.MARKUP__HEADERS:
				return headers != null && !headers.isEmpty();
			case MarkupPackage.MARKUP__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case MarkupPackage.MARKUP__TAGS:
				return tags != null && !tags.isEmpty();
			case MarkupPackage.MARKUP__CONTRACTS:
				return contracts != null && !contracts.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //MarkupImpl
