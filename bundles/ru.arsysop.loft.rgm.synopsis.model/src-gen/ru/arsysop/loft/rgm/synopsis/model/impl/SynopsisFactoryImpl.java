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
package ru.arsysop.loft.rgm.synopsis.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.arsysop.loft.rgm.synopsis.model.api.*;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisFactory;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynopsisFactoryImpl extends EFactoryImpl implements SynopsisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SynopsisFactory init() {
		try {
			SynopsisFactory theSynopsisFactory = (SynopsisFactory)EPackage.Registry.INSTANCE.getEFactory(SynopsisPackage.eNS_URI);
			if (theSynopsisFactory != null) {
				return theSynopsisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SynopsisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynopsisFactoryImpl() {
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
			case SynopsisPackage.HEADER_SYNOPSIS: return createHeaderSynopsis();
			case SynopsisPackage.NAMESPACE_SYNOPSIS: return createNamespaceSynopsis();
			case SynopsisPackage.CLASS_TEMPLATE_SYNOPSIS: return createClassTemplateSynopsis();
			case SynopsisPackage.FUNCTION_DECL: return createFunctionDecl();
			case SynopsisPackage.CLASS_DECL: return createClassDecl();
			case SynopsisPackage.ENUM_DECL: return createEnumDecl();
			case SynopsisPackage.STRUCT_DECL: return createStructDecl();
			case SynopsisPackage.UNION_DECL: return createUnionDecl();
			case SynopsisPackage.FIELD_DECL: return createFieldDecl();
			case SynopsisPackage.VAR_DECL: return createVarDecl();
			case SynopsisPackage.TYPEDEF_DECL: return createTypedefDecl();
			case SynopsisPackage.PARM_DECL: return createParmDecl();
			case SynopsisPackage.FUNCTION_TEMPLATE: return createFunctionTemplate();
			case SynopsisPackage.CXX_METHOD: return createCXXMethod();
			case SynopsisPackage.CONSTRUCTOR: return createConstructor();
			case SynopsisPackage.DESTRUCTOR: return createDestructor();
			case SynopsisPackage.TEMPLATE_TYPE_PARAMETER: return createTemplateTypeParameter();
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
	public HeaderSynopsis createHeaderSynopsis() {
		HeaderSynopsisImpl headerSynopsis = new HeaderSynopsisImpl();
		return headerSynopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamespaceSynopsis createNamespaceSynopsis() {
		NamespaceSynopsisImpl namespaceSynopsis = new NamespaceSynopsisImpl();
		return namespaceSynopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassTemplateSynopsis createClassTemplateSynopsis() {
		ClassTemplateSynopsisImpl classTemplateSynopsis = new ClassTemplateSynopsisImpl();
		return classTemplateSynopsis;
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
	public SynopsisPackage getSynopsisPackage() {
		return (SynopsisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SynopsisPackage getPackage() {
		return SynopsisPackage.eINSTANCE;
	}

} //synopsisFactoryImpl
