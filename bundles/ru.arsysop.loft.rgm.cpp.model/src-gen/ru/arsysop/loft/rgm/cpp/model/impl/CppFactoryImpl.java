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
package ru.arsysop.loft.rgm.cpp.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.arsysop.loft.rgm.cpp.model.api.*;

import ru.arsysop.loft.rgm.cpp.model.meta.CppFactory;
import ru.arsysop.loft.rgm.cpp.model.meta.CppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CppFactoryImpl extends EFactoryImpl implements CppFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CppFactory init() {
		try {
			CppFactory theCppFactory = (CppFactory)EPackage.Registry.INSTANCE.getEFactory(CppPackage.eNS_URI);
			if (theCppFactory != null) {
				return theCppFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CppFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CppFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CppPackage.HEADER: return createHeader();
			case CppPackage.NAMESPACE: return createNamespace();
			case CppPackage.FUNCTION_DECL: return createFunctionDecl();
			case CppPackage.CLASS_DECL: return createClassDecl();
			case CppPackage.ENUM_DECL: return createEnumDecl();
			case CppPackage.STRUCT_DECL: return createStructDecl();
			case CppPackage.UNION_DECL: return createUnionDecl();
			case CppPackage.FIELD_DECL: return createFieldDecl();
			case CppPackage.VAR_DECL: return createVarDecl();
			case CppPackage.TYPEDEF_DECL: return createTypedefDecl();
			case CppPackage.PARM_DECL: return createParmDecl();
			case CppPackage.FUNCTION_TEMPLATE: return createFunctionTemplate();
			case CppPackage.CLASS_TEMPLATE: return createClassTemplate();
			case CppPackage.CXX_METHOD: return createCXXMethod();
			case CppPackage.CONSTRUCTOR: return createConstructor();
			case CppPackage.DESTRUCTOR: return createDestructor();
			case CppPackage.TEMPLATE_TYPE_PARAMETER: return createTemplateTypeParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionDecl createFunctionDecl() {
		FunctionDeclImpl functionDecl = new FunctionDeclImpl();
		return functionDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDecl createClassDecl() {
		ClassDeclImpl classDecl = new ClassDeclImpl();
		return classDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumDecl createEnumDecl() {
		EnumDeclImpl enumDecl = new EnumDeclImpl();
		return enumDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructDecl createStructDecl() {
		StructDeclImpl structDecl = new StructDeclImpl();
		return structDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnionDecl createUnionDecl() {
		UnionDeclImpl unionDecl = new UnionDeclImpl();
		return unionDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDecl createFieldDecl() {
		FieldDeclImpl fieldDecl = new FieldDeclImpl();
		return fieldDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarDecl createVarDecl() {
		VarDeclImpl varDecl = new VarDeclImpl();
		return varDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypedefDecl createTypedefDecl() {
		TypedefDeclImpl typedefDecl = new TypedefDeclImpl();
		return typedefDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParmDecl createParmDecl() {
		ParmDeclImpl parmDecl = new ParmDeclImpl();
		return parmDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionTemplate createFunctionTemplate() {
		FunctionTemplateImpl functionTemplate = new FunctionTemplateImpl();
		return functionTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassTemplate createClassTemplate() {
		ClassTemplateImpl classTemplate = new ClassTemplateImpl();
		return classTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CXXMethod createCXXMethod() {
		CXXMethodImpl cxxMethod = new CXXMethodImpl();
		return cxxMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Destructor createDestructor() {
		DestructorImpl destructor = new DestructorImpl();
		return destructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateTypeParameter createTemplateTypeParameter() {
		TemplateTypeParameterImpl templateTypeParameter = new TemplateTypeParameterImpl();
		return templateTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CppPackage getCppPackage() {
		return (CppPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CppPackage getPackage() {
		return CppPackage.eINSTANCE;
	}

} //CppFactoryImpl
