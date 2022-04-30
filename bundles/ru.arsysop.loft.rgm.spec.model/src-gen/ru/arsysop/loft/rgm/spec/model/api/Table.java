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
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.api.Table#getTitle <em>Title</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.api.Table#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends PointContent {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.spec.model.api.TableRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getTable_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableRow> getRows();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TableRow)
	 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getTable_Title()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TableRow getTitle();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.spec.model.api.Table#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TableRow value);

} // Table
