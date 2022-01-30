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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisFactory
 * @model kind="package"
 * @generated
 */
public interface SynopsisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "synopsis"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.arsysop.ru/rgm/synopsis/0.1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "synopsis"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SynopsisPackage eINSTANCE = ru.arsysop.loft.rgm.synopsis.model.impl.SynopsisPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.synopsis.model.impl.DefinitionSynopsisImpl <em>Definition Synopsis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.DefinitionSynopsisImpl
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.SynopsisPackageImpl#getDefinitionSynopsis()
	 * @generated
	 */
	int DEFINITION_SYNOPSIS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SYNOPSIS__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SYNOPSIS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Definition Synopsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SYNOPSIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Definition Synopsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_SYNOPSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.synopsis.model.impl.HeaderSynopsisImpl <em>Header Synopsis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.HeaderSynopsisImpl
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.SynopsisPackageImpl#getHeaderSynopsis()
	 * @generated
	 */
	int HEADER_SYNOPSIS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SYNOPSIS__ID = DEFINITION_SYNOPSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SYNOPSIS__NAME = DEFINITION_SYNOPSIS__NAME;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SYNOPSIS__PART = DEFINITION_SYNOPSIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SYNOPSIS__DEFINITIONS = DEFINITION_SYNOPSIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Header Synopsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SYNOPSIS_FEATURE_COUNT = DEFINITION_SYNOPSIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Header Synopsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SYNOPSIS_OPERATION_COUNT = DEFINITION_SYNOPSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.synopsis.model.impl.NamespaceSynopsisImpl <em>Namespace Synopsis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.NamespaceSynopsisImpl
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.SynopsisPackageImpl#getNamespaceSynopsis()
	 * @generated
	 */
	int NAMESPACE_SYNOPSIS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SYNOPSIS__ID = DEFINITION_SYNOPSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SYNOPSIS__NAME = DEFINITION_SYNOPSIS__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SYNOPSIS__DEFINITIONS = DEFINITION_SYNOPSIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Namespace Synopsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SYNOPSIS_FEATURE_COUNT = DEFINITION_SYNOPSIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Namespace Synopsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SYNOPSIS_OPERATION_COUNT = DEFINITION_SYNOPSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.synopsis.model.impl.ClassTemplateSynopsisImpl <em>Class Template Synopsis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.ClassTemplateSynopsisImpl
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.SynopsisPackageImpl#getClassTemplateSynopsis()
	 * @generated
	 */
	int CLASS_TEMPLATE_SYNOPSIS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_SYNOPSIS__ID = DEFINITION_SYNOPSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_SYNOPSIS__NAME = DEFINITION_SYNOPSIS__NAME;

	/**
	 * The feature id for the '<em><b>Templatetypeparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_SYNOPSIS__TEMPLATETYPEPARAMETER = DEFINITION_SYNOPSIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Template Synopsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_SYNOPSIS_FEATURE_COUNT = DEFINITION_SYNOPSIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Template Synopsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_SYNOPSIS_OPERATION_COUNT = DEFINITION_SYNOPSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.synopsis.model.impl.FunctionTemplateImpl <em>Function Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.FunctionTemplateImpl
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.SynopsisPackageImpl#getFunctionTemplate()
	 * @generated
	 */
	int FUNCTION_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE__ID = DEFINITION_SYNOPSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE__NAME = DEFINITION_SYNOPSIS__NAME;

	/**
	 * The number of structural features of the '<em>Function Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE_FEATURE_COUNT = DEFINITION_SYNOPSIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE_OPERATION_COUNT = DEFINITION_SYNOPSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.synopsis.model.impl.TemplateTypeParameterImpl <em>Template Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.TemplateTypeParameterImpl
	 * @see ru.arsysop.loft.rgm.synopsis.model.impl.SynopsisPackageImpl#getTemplateTypeParameter()
	 * @generated
	 */
	int TEMPLATE_TYPE_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER__ID = DEFINITION_SYNOPSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER__NAME = DEFINITION_SYNOPSIS__NAME;

	/**
	 * The number of structural features of the '<em>Template Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER_FEATURE_COUNT = DEFINITION_SYNOPSIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER_OPERATION_COUNT = DEFINITION_SYNOPSIS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.synopsis.model.api.DefinitionSynopsis <em>Definition Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Synopsis</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.DefinitionSynopsis
	 * @generated
	 */
	EClass getDefinitionSynopsis();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.synopsis.model.api.DefinitionSynopsis#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.DefinitionSynopsis#getId()
	 * @see #getDefinitionSynopsis()
	 * @generated
	 */
	EAttribute getDefinitionSynopsis_Id();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.synopsis.model.api.DefinitionSynopsis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.DefinitionSynopsis#getName()
	 * @see #getDefinitionSynopsis()
	 * @generated
	 */
	EAttribute getDefinitionSynopsis_Name();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis <em>Header Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Synopsis</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis
	 * @generated
	 */
	EClass getHeaderSynopsis();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis#getPart()
	 * @see #getHeaderSynopsis()
	 * @generated
	 */
	EReference getHeaderSynopsis_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.HeaderSynopsis#getDefinitions()
	 * @see #getHeaderSynopsis()
	 * @generated
	 */
	EReference getHeaderSynopsis_Definitions();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.synopsis.model.api.NamespaceSynopsis <em>Namespace Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Synopsis</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.NamespaceSynopsis
	 * @generated
	 */
	EClass getNamespaceSynopsis();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.synopsis.model.api.NamespaceSynopsis#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.NamespaceSynopsis#getDefinitions()
	 * @see #getNamespaceSynopsis()
	 * @generated
	 */
	EReference getNamespaceSynopsis_Definitions();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.synopsis.model.api.ClassTemplateSynopsis <em>Class Template Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Template Synopsis</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.ClassTemplateSynopsis
	 * @generated
	 */
	EClass getClassTemplateSynopsis();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.synopsis.model.api.ClassTemplateSynopsis#getTemplatetypeparameter <em>Templatetypeparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templatetypeparameter</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.ClassTemplateSynopsis#getTemplatetypeparameter()
	 * @see #getClassTemplateSynopsis()
	 * @generated
	 */
	EReference getClassTemplateSynopsis_Templatetypeparameter();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.synopsis.model.api.FunctionTemplate <em>Function Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Template</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.FunctionTemplate
	 * @generated
	 */
	EClass getFunctionTemplate();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.synopsis.model.api.TemplateTypeParameter <em>Template Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Type Parameter</em>'.
	 * @see ru.arsysop.loft.rgm.synopsis.model.api.TemplateTypeParameter
	 * @generated
	 */
	EClass getTemplateTypeParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SynopsisFactory getSynopsisFactory();

} //synopsisPackage
