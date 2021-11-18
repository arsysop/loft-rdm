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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.ClassDecl#getFields <em>Fields</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.ClassDecl#getDestructor <em>Destructor</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.ClassDecl#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.ClassDecl#getCxxmethod <em>Cxxmethod</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getClassDecl()
 * @model
 * @generated
 */
public interface ClassDecl extends Declaration {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.FieldDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getClassDecl_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldDecl> getFields();

	/**
	 * Returns the value of the '<em><b>Destructor</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Destructor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destructor</em>' reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getClassDecl_Destructor()
	 * @model
	 * @generated
	 */
	EList<Destructor> getDestructor();

	/**
	 * Returns the value of the '<em><b>Constructors</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Constructor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructors</em>' reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getClassDecl_Constructors()
	 * @model
	 * @generated
	 */
	EList<Constructor> getConstructors();

	/**
	 * Returns the value of the '<em><b>Cxxmethod</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.CXXMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cxxmethod</em>' reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getClassDecl_Cxxmethod()
	 * @model
	 * @generated
	 */
	EList<CXXMethod> getCxxmethod();

} // ClassDecl
