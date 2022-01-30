/**
 * Copyright (c) 2022 ArSysOp
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
package ru.arsysop.loft.rgm.synopsis.model.meta;

import org.eclipse.emf.ecore.EFactory;
import ru.arsysop.loft.rgm.synopsis.model.api.ClassTemplateSynopsis;
import ru.arsysop.loft.rgm.synopsis.model.api.FunctionTemplate;
import ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis;
import ru.arsysop.loft.rgm.synopsis.model.api.NamespaceSynopsis;
import ru.arsysop.loft.rgm.synopsis.model.api.TemplateTypeParameter;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage
 * @generated
 */
public interface SynopsisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SynopsisFactory eINSTANCE = ru.arsysop.loft.rgm.synopsis.model.impl.SynopsisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Header Synopsis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Synopsis</em>'.
	 * @generated
	 */
	HeaderSynopsis createHeaderSynopsis();

	/**
	 * Returns a new object of class '<em>Namespace Synopsis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace Synopsis</em>'.
	 * @generated
	 */
	NamespaceSynopsis createNamespaceSynopsis();

	/**
	 * Returns a new object of class '<em>Class Template Synopsis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Template Synopsis</em>'.
	 * @generated
	 */
	ClassTemplateSynopsis createClassTemplateSynopsis();

	/**
	 * Returns a new object of class '<em>Function Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Template</em>'.
	 * @generated
	 */
	FunctionTemplate createFunctionTemplate();

	/**
	 * Returns a new object of class '<em>Template Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Type Parameter</em>'.
	 * @generated
	 */
	TemplateTypeParameter createTemplateTypeParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SynopsisPackage getSynopsisPackage();

} //synopsisFactory
