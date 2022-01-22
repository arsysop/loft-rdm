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
package ru.arsysop.loft.rgm.spec.model.api;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toc Chapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter#getId <em>Id</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter#getName <em>Name</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter#getNumber <em>Number</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getTocChapter()
 * @model
 * @generated
 */
public interface TocChapter extends WithTocChapters {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getTocChapter_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter#getId <em>Id</em>}' attribute.
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
	 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getTocChapter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getTocChapter_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference.
	 * @see #setPart(Part)
	 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getTocChapter_Part()
	 * @model
	 * @generated
	 */
	Part getPart();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter#getPart <em>Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(Part value);
} // TocChapter
