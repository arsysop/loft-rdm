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
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Document#getId <em>Id</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Document#getName <em>Name</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Document#getType <em>Type</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Document#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Document#getRevision <em>Revision</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Document#getToc <em>Toc</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Document#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Document#getIndexes <em>Indexes</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDocument_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Document#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Document#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDocument_Type()
	 * @model dataType="ru.arsysop.loft.rgm.model.api.DocumentType"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Document#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDocument_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Document#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDocument_Revision()
	 * @model
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Document#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Returns the value of the '<em><b>Toc</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.rgm.model.api.Toc#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toc</em>' containment reference.
	 * @see #setToc(Toc)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDocument_Toc()
	 * @see ru.arsysop.loft.rgm.model.api.Toc#getDocument
	 * @model opposite="document" containment="true"
	 * @generated
	 */
	Toc getToc();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Document#getToc <em>Toc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toc</em>' containment reference.
	 * @see #getToc()
	 * @generated
	 */
	void setToc(Toc value);

	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDocument_Paragraphs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getDocument_Indexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndexes();

} // Document
