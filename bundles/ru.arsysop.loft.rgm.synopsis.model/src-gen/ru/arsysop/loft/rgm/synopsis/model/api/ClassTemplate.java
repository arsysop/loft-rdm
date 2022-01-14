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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.synopsis.model.api.ClassTemplate#getTemplatetypeparameter <em>Templatetypeparameter</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage#getClassTemplate()
 * @model
 * @generated
 */
public interface ClassTemplate extends Declaration {
	/**
	 * Returns the value of the '<em><b>Templatetypeparameter</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.synopsis.model.api.TemplateTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templatetypeparameter</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage#getClassTemplate_Templatetypeparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateTypeParameter> getTemplatetypeparameter();

} // ClassTemplate
