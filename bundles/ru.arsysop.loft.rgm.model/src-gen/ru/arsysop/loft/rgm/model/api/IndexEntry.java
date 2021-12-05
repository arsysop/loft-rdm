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
package ru.arsysop.loft.rgm.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.IndexEntry#getSubentries <em>Subentries</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.IndexEntry#getSee <em>See</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.IndexEntry#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.IndexEntry#getParts <em>Parts</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.IndexEntry#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getIndexEntry()
 * @model
 * @generated
 */
public interface IndexEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Subentries</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.IndexEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subentries</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getIndexEntry_Subentries()
	 * @model containment="true"
	 * @generated
	 */
	EList<IndexEntry> getSubentries();

	/**
	 * Returns the value of the '<em><b>See</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.IndexEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See</em>' reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getIndexEntry_See()
	 * @model
	 * @generated
	 */
	EList<IndexEntry> getSee();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see #setKeyword(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getIndexEntry_Keyword()
	 * @model
	 * @generated
	 */
	String getKeyword();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.IndexEntry#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Part}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getIndexEntry_Parts()
	 * @model
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getIndexEntry_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.IndexEntry#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // IndexEntry
