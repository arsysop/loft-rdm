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
package ru.arsysop.loft.rgm.synopsis.model.api;

import org.eclipse.emf.common.util.EList;
import ru.arsysop.loft.rgm.spec.model.api.Part;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis#getPart <em>Part</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage#getHeaderSynopsis()
 * @model
 * @generated
 */
public interface HeaderSynopsis extends DefinitionSynopsis {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference.
	 * @see #setPart(Part)
	 * @see ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage#getHeaderSynopsis_Part()
	 * @model required="true"
	 * @generated
	 */
	Part getPart();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis#getPart <em>Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(Part value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.synopsis.model.api.DefinitionSynopsis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage#getHeaderSynopsis_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionSynopsis> getDefinitions();

} // Header
