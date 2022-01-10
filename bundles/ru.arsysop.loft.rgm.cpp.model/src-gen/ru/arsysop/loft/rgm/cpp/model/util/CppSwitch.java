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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.arsysop.loft.rgm.cpp.model.api.*;

import ru.arsysop.loft.rgm.cpp.model.meta.CppPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.cpp.model.meta.CppPackage
 * @generated
 */
public class CppSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CppPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CppSwitch() {
		if (modelPackage == null) {
			modelPackage = CppPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CppPackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = caseDeclaration(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.FUNCTION_DECL: {
				FunctionDecl functionDecl = (FunctionDecl)theEObject;
				T result = caseFunctionDecl(functionDecl);
				if (result == null) result = caseDeclaration(functionDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.CLASS_DECL: {
				ClassDecl classDecl = (ClassDecl)theEObject;
				T result = caseClassDecl(classDecl);
				if (result == null) result = caseDeclaration(classDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.ENUM_DECL: {
				EnumDecl enumDecl = (EnumDecl)theEObject;
				T result = caseEnumDecl(enumDecl);
				if (result == null) result = caseDeclaration(enumDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.STRUCT_DECL: {
				StructDecl structDecl = (StructDecl)theEObject;
				T result = caseStructDecl(structDecl);
				if (result == null) result = caseDeclaration(structDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.UNION_DECL: {
				UnionDecl unionDecl = (UnionDecl)theEObject;
				T result = caseUnionDecl(unionDecl);
				if (result == null) result = caseDeclaration(unionDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.FIELD_DECL: {
				FieldDecl fieldDecl = (FieldDecl)theEObject;
				T result = caseFieldDecl(fieldDecl);
				if (result == null) result = caseDeclaration(fieldDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.VAR_DECL: {
				VarDecl varDecl = (VarDecl)theEObject;
				T result = caseVarDecl(varDecl);
				if (result == null) result = caseDeclaration(varDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.TYPEDEF_DECL: {
				TypedefDecl typedefDecl = (TypedefDecl)theEObject;
				T result = caseTypedefDecl(typedefDecl);
				if (result == null) result = caseDeclaration(typedefDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.PARM_DECL: {
				ParmDecl parmDecl = (ParmDecl)theEObject;
				T result = caseParmDecl(parmDecl);
				if (result == null) result = caseDeclaration(parmDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.FUNCTION_TEMPLATE: {
				FunctionTemplate functionTemplate = (FunctionTemplate)theEObject;
				T result = caseFunctionTemplate(functionTemplate);
				if (result == null) result = caseDeclaration(functionTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.CLASS_TEMPLATE: {
				ClassTemplate classTemplate = (ClassTemplate)theEObject;
				T result = caseClassTemplate(classTemplate);
				if (result == null) result = caseDeclaration(classTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.CXX_METHOD: {
				CXXMethod cxxMethod = (CXXMethod)theEObject;
				T result = caseCXXMethod(cxxMethod);
				if (result == null) result = caseFunctionDecl(cxxMethod);
				if (result == null) result = caseDeclaration(cxxMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = caseFunctionDecl(constructor);
				if (result == null) result = caseDeclaration(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.DESTRUCTOR: {
				Destructor destructor = (Destructor)theEObject;
				T result = caseDestructor(destructor);
				if (result == null) result = caseFunctionDecl(destructor);
				if (result == null) result = caseDeclaration(destructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CppPackage.TEMPLATE_TYPE_PARAMETER: {
				TemplateTypeParameter templateTypeParameter = (TemplateTypeParameter)theEObject;
				T result = caseTemplateTypeParameter(templateTypeParameter);
				if (result == null) result = caseDeclaration(templateTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDecl(FunctionDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDecl(ClassDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDecl(EnumDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructDecl(StructDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionDecl(UnionDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDecl(FieldDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDecl(VarDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typedef Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typedef Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedefDecl(TypedefDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parm Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parm Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParmDecl(ParmDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionTemplate(FunctionTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassTemplate(ClassTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CXX Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CXX Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCXXMethod(CXXMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestructor(Destructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateTypeParameter(TemplateTypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CppSwitch
