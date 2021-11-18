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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Declaration#getContract <em>Contract</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Declaration#getID <em>ID</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Declaration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface Declaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.rgm.model.api.Contract#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Contract)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDeclaration_Contract()
	 * @see ru.arsysop.loft.rgm.model.api.Contract#getDeclaration
	 * @model opposite="declaration"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Declaration#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDeclaration_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Declaration#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Declaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Declaration
