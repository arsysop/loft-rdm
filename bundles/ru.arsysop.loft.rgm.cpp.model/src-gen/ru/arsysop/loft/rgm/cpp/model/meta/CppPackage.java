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
package ru.arsysop.loft.rgm.cpp.model.meta;

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
 * @see ru.arsysop.loft.rgm.cpp.model.meta.CppFactory
 * @model kind="package"
 * @generated
 */
public interface CppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cpp"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.arsysop.ru/rgm/cpp/0.1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cpp"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CppPackage eINSTANCE = ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.HeaderImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Synopsis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__SYNOPSIS = 1;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__DECLARATIONS = 2;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.DeclarationImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.NamespaceImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.FunctionDeclImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getFunctionDecl()
	 * @generated
	 */
	int FUNCTION_DECL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__SIGNATURE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__PARAMETERS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.ClassDeclImpl <em>Class Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.ClassDeclImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getClassDecl()
	 * @generated
	 */
	int CLASS_DECL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__FIELDS = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destructor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__DESTRUCTOR = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__CONSTRUCTORS = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cxxmethod</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__CXXMETHOD = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.EnumDeclImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getEnumDecl()
	 * @generated
	 */
	int ENUM_DECL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Enum Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enum Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.StructDeclImpl <em>Struct Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.StructDeclImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getStructDecl()
	 * @generated
	 */
	int STRUCT_DECL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Struct Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Struct Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.UnionDeclImpl <em>Union Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.UnionDeclImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getUnionDecl()
	 * @generated
	 */
	int UNION_DECL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Union Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Union Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.FieldDeclImpl <em>Field Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.FieldDeclImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getFieldDecl()
	 * @generated
	 */
	int FIELD_DECL = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Field Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.VarDeclImpl <em>Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.VarDeclImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getVarDecl()
	 * @generated
	 */
	int VAR_DECL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.TypedefDeclImpl <em>Typedef Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.TypedefDeclImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getTypedefDecl()
	 * @generated
	 */
	int TYPEDEF_DECL = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Typedef Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Typedef Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.ParmDeclImpl <em>Parm Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.ParmDeclImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getParmDecl()
	 * @generated
	 */
	int PARM_DECL = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARM_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARM_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Parm Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARM_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parm Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARM_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.FunctionTemplateImpl <em>Function Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.FunctionTemplateImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getFunctionTemplate()
	 * @generated
	 */
	int FUNCTION_TEMPLATE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Function Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.ClassTemplateImpl <em>Class Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.ClassTemplateImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getClassTemplate()
	 * @generated
	 */
	int CLASS_TEMPLATE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Templatetypeparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE__TEMPLATETYPEPARAMETER = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.CXXMethodImpl <em>CXX Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CXXMethodImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getCXXMethod()
	 * @generated
	 */
	int CXX_METHOD = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD__ID = FUNCTION_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD__NAME = FUNCTION_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD__SIGNATURE = FUNCTION_DECL__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD__PARAMETERS = FUNCTION_DECL__PARAMETERS;

	/**
	 * The number of structural features of the '<em>CXX Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD_FEATURE_COUNT = FUNCTION_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CXX Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD_OPERATION_COUNT = FUNCTION_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.ConstructorImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ID = FUNCTION_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = FUNCTION_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__SIGNATURE = FUNCTION_DECL__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMETERS = FUNCTION_DECL__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = FUNCTION_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = FUNCTION_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.DestructorImpl <em>Destructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.DestructorImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getDestructor()
	 * @generated
	 */
	int DESTRUCTOR = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__ID = FUNCTION_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__NAME = FUNCTION_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__SIGNATURE = FUNCTION_DECL__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__PARAMETERS = FUNCTION_DECL__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Destructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR_FEATURE_COUNT = FUNCTION_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Destructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR_OPERATION_COUNT = FUNCTION_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.cpp.model.impl.TemplateTypeParameterImpl <em>Template Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.TemplateTypeParameterImpl
	 * @see ru.arsysop.loft.rgm.cpp.model.impl.CppPackageImpl#getTemplateTypeParameter()
	 * @generated
	 */
	int TEMPLATE_TYPE_PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Template Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.cpp.model.api.Header#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Header#getName()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Name();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.rgm.cpp.model.api.Header#getSynopsis <em>Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synopsis</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Header#getSynopsis()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Synopsis();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.cpp.model.api.Header#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Header#getDeclarations()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Declarations();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.cpp.model.api.Declaration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Declaration#getId()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_Id();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.cpp.model.api.Declaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Declaration#getName()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.FunctionDecl <em>Function Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Decl</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.FunctionDecl
	 * @generated
	 */
	EClass getFunctionDecl();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.cpp.model.api.FunctionDecl#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.FunctionDecl#getSignature()
	 * @see #getFunctionDecl()
	 * @generated
	 */
	EAttribute getFunctionDecl_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.cpp.model.api.FunctionDecl#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.FunctionDecl#getParameters()
	 * @see #getFunctionDecl()
	 * @generated
	 */
	EReference getFunctionDecl_Parameters();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.ClassDecl <em>Class Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Decl</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ClassDecl
	 * @generated
	 */
	EClass getClassDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.cpp.model.api.ClassDecl#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ClassDecl#getFields()
	 * @see #getClassDecl()
	 * @generated
	 */
	EReference getClassDecl_Fields();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.cpp.model.api.ClassDecl#getDestructor <em>Destructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Destructor</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ClassDecl#getDestructor()
	 * @see #getClassDecl()
	 * @generated
	 */
	EReference getClassDecl_Destructor();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.cpp.model.api.ClassDecl#getConstructors <em>Constructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constructors</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ClassDecl#getConstructors()
	 * @see #getClassDecl()
	 * @generated
	 */
	EReference getClassDecl_Constructors();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.cpp.model.api.ClassDecl#getCxxmethod <em>Cxxmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cxxmethod</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ClassDecl#getCxxmethod()
	 * @see #getClassDecl()
	 * @generated
	 */
	EReference getClassDecl_Cxxmethod();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.EnumDecl <em>Enum Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Decl</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.EnumDecl
	 * @generated
	 */
	EClass getEnumDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.StructDecl <em>Struct Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Decl</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.StructDecl
	 * @generated
	 */
	EClass getStructDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.UnionDecl <em>Union Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Decl</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.UnionDecl
	 * @generated
	 */
	EClass getUnionDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.FieldDecl <em>Field Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Decl</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.FieldDecl
	 * @generated
	 */
	EClass getFieldDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Decl</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.VarDecl
	 * @generated
	 */
	EClass getVarDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.TypedefDecl <em>Typedef Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedef Decl</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.TypedefDecl
	 * @generated
	 */
	EClass getTypedefDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.ParmDecl <em>Parm Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parm Decl</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ParmDecl
	 * @generated
	 */
	EClass getParmDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.FunctionTemplate <em>Function Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Template</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.FunctionTemplate
	 * @generated
	 */
	EClass getFunctionTemplate();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.ClassTemplate <em>Class Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Template</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ClassTemplate
	 * @generated
	 */
	EClass getClassTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.cpp.model.api.ClassTemplate#getTemplatetypeparameter <em>Templatetypeparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templatetypeparameter</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ClassTemplate#getTemplatetypeparameter()
	 * @see #getClassTemplate()
	 * @generated
	 */
	EReference getClassTemplate_Templatetypeparameter();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.CXXMethod <em>CXX Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CXX Method</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.CXXMethod
	 * @generated
	 */
	EClass getCXXMethod();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.Destructor <em>Destructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destructor</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Destructor
	 * @generated
	 */
	EClass getDestructor();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.cpp.model.api.TemplateTypeParameter <em>Template Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Type Parameter</em>'.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.TemplateTypeParameter
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
	CppFactory getCppFactory();

} //CppPackage
