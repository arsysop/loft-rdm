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
package ru.arsysop.loft.rgm.model.api;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Markup#getCitations <em>Citations</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Markup#getHeaders <em>Headers</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Markup#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Markup#getTags <em>Tags</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Markup#getContracts <em>Contracts</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getMarkup()
 * @model
 * @generated
 */
public interface Markup extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getMarkup_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getMarkup_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Contracts</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contracts</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getMarkup_Contracts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contract> getContracts();

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Header}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getMarkup_Headers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Header> getHeaders();

	/**
	 * Returns the value of the '<em><b>Citations</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Citation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citations</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getMarkup_Citations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Citation> getCitations();

} // Markup
