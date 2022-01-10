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
package ru.arsysop.loft.rgm.cpp.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.cpp.model.api.*;

import ru.arsysop.loft.rgm.cpp.model.meta.CppPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.cpp.model.meta.CppPackage
 * @generated
 */
public class CppAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CppPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CppAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CppPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CppSwitch<Adapter> modelSwitch =
		new CppSwitch<Adapter>() {
			@Override
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseFunctionDecl(FunctionDecl object) {
				return createFunctionDeclAdapter();
			}
			@Override
			public Adapter caseClassDecl(ClassDecl object) {
				return createClassDeclAdapter();
			}
			@Override
			public Adapter caseEnumDecl(EnumDecl object) {
				return createEnumDeclAdapter();
			}
			@Override
			public Adapter caseStructDecl(StructDecl object) {
				return createStructDeclAdapter();
			}
			@Override
			public Adapter caseUnionDecl(UnionDecl object) {
				return createUnionDeclAdapter();
			}
			@Override
			public Adapter caseFieldDecl(FieldDecl object) {
				return createFieldDeclAdapter();
			}
			@Override
			public Adapter caseVarDecl(VarDecl object) {
				return createVarDeclAdapter();
			}
			@Override
			public Adapter caseTypedefDecl(TypedefDecl object) {
				return createTypedefDeclAdapter();
			}
			@Override
			public Adapter caseParmDecl(ParmDecl object) {
				return createParmDeclAdapter();
			}
			@Override
			public Adapter caseFunctionTemplate(FunctionTemplate object) {
				return createFunctionTemplateAdapter();
			}
			@Override
			public Adapter caseClassTemplate(ClassTemplate object) {
				return createClassTemplateAdapter();
			}
			@Override
			public Adapter caseCXXMethod(CXXMethod object) {
				return createCXXMethodAdapter();
			}
			@Override
			public Adapter caseConstructor(Constructor object) {
				return createConstructorAdapter();
			}
			@Override
			public Adapter caseDestructor(Destructor object) {
				return createDestructorAdapter();
			}
			@Override
			public Adapter caseTemplateTypeParameter(TemplateTypeParameter object) {
				return createTemplateTypeParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.FunctionDecl <em>Function Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.FunctionDecl
	 * @generated
	 */
	public Adapter createFunctionDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.ClassDecl <em>Class Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ClassDecl
	 * @generated
	 */
	public Adapter createClassDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.EnumDecl <em>Enum Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.EnumDecl
	 * @generated
	 */
	public Adapter createEnumDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.StructDecl <em>Struct Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.StructDecl
	 * @generated
	 */
	public Adapter createStructDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.UnionDecl <em>Union Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.UnionDecl
	 * @generated
	 */
	public Adapter createUnionDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.FieldDecl <em>Field Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.FieldDecl
	 * @generated
	 */
	public Adapter createFieldDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.VarDecl
	 * @generated
	 */
	public Adapter createVarDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.TypedefDecl <em>Typedef Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.TypedefDecl
	 * @generated
	 */
	public Adapter createTypedefDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.ParmDecl <em>Parm Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ParmDecl
	 * @generated
	 */
	public Adapter createParmDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.FunctionTemplate <em>Function Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.FunctionTemplate
	 * @generated
	 */
	public Adapter createFunctionTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.ClassTemplate <em>Class Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.ClassTemplate
	 * @generated
	 */
	public Adapter createClassTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.CXXMethod <em>CXX Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.CXXMethod
	 * @generated
	 */
	public Adapter createCXXMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.Destructor <em>Destructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.Destructor
	 * @generated
	 */
	public Adapter createDestructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.cpp.model.api.TemplateTypeParameter <em>Template Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.cpp.model.api.TemplateTypeParameter
	 * @generated
	 */
	public Adapter createTemplateTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CppAdapterFactory
