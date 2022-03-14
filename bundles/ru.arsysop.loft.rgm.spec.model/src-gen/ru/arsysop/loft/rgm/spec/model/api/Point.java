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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.api.Point#getRaw <em>Raw</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.api.Point#getSynopses <em>Synopses</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.api.Point#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends Part, WithReferences {
	/**
	 * Returns the value of the '<em><b>Raw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw</em>' attribute.
	 * @see #setRaw(String)
	 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getPoint_Raw()
	 * @model
	 * @generated
	 */
	String getRaw();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.spec.model.api.Point#getRaw <em>Raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw</em>' attribute.
	 * @see #getRaw()
	 * @generated
	 */
	void setRaw(String value);

	/**
	 * Returns the value of the '<em><b>Synopses</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.spec.model.api.Synopsis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synopses</em>' reference list.
	 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getPoint_Synopses()
	 * @model
	 * @generated
	 */
	EList<Synopsis> getSynopses();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.spec.model.api.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getPoint_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // SubParagraph
