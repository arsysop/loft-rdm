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
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Requirement#getId <em>Id</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Requirement#getCitation <em>Citation</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Requirement#getTags <em>Tags</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Requirement#getSee <em>See</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getRequirement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Requirement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.rgm.model.api.Citation#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation</em>' reference.
	 * @see #setCitation(Citation)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getRequirement_Citation()
	 * @see ru.arsysop.loft.rgm.model.api.Citation#getRequirements
	 * @model opposite="requirements"
	 * @generated
	 */
	Citation getCitation();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Requirement#getCitation <em>Citation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(Citation value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Tag}.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.rgm.model.api.Tag#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getRequirement_Tags()
	 * @see ru.arsysop.loft.rgm.model.api.Tag#getRequirements
	 * @model opposite="requirements"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>See</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Part}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See</em>' reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getRequirement_See()
	 * @model
	 * @generated
	 */
	EList<Part> getSee();

} // Requirement
