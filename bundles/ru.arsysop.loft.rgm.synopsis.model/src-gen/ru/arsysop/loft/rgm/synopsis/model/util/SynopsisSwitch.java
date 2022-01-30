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
package ru.arsysop.loft.rgm.synopsis.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ru.arsysop.loft.rgm.synopsis.model.api.*;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage;

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
 * @see ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage
 * @generated
 */
public class SynopsisSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SynopsisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynopsisSwitch() {
		if (modelPackage == null) {
			modelPackage = SynopsisPackage.eINSTANCE;
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
			case SynopsisPackage.DEFINITION_SYNOPSIS: {
				DefinitionSynopsis definitionSynopsis = (DefinitionSynopsis)theEObject;
				T result = caseDefinitionSynopsis(definitionSynopsis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SynopsisPackage.HEADER_SYNOPSIS: {
				HeaderSynopsis headerSynopsis = (HeaderSynopsis)theEObject;
				T result = caseHeaderSynopsis(headerSynopsis);
				if (result == null) result = caseDefinitionSynopsis(headerSynopsis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SynopsisPackage.NAMESPACE_SYNOPSIS: {
				NamespaceSynopsis namespaceSynopsis = (NamespaceSynopsis)theEObject;
				T result = caseNamespaceSynopsis(namespaceSynopsis);
				if (result == null) result = caseDefinitionSynopsis(namespaceSynopsis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SynopsisPackage.CLASS_TEMPLATE_SYNOPSIS: {
				ClassTemplateSynopsis classTemplateSynopsis = (ClassTemplateSynopsis)theEObject;
				T result = caseClassTemplateSynopsis(classTemplateSynopsis);
				if (result == null) result = caseDefinitionSynopsis(classTemplateSynopsis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SynopsisPackage.FUNCTION_TEMPLATE: {
				FunctionTemplate functionTemplate = (FunctionTemplate)theEObject;
				T result = caseFunctionTemplate(functionTemplate);
				if (result == null) result = caseDefinitionSynopsis(functionTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SynopsisPackage.TEMPLATE_TYPE_PARAMETER: {
				TemplateTypeParameter templateTypeParameter = (TemplateTypeParameter)theEObject;
				T result = caseTemplateTypeParameter(templateTypeParameter);
				if (result == null) result = caseDefinitionSynopsis(templateTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Synopsis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Synopsis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionSynopsis(DefinitionSynopsis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Synopsis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Synopsis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderSynopsis(HeaderSynopsis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Synopsis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Synopsis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceSynopsis(NamespaceSynopsis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Template Synopsis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Template Synopsis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassTemplateSynopsis(ClassTemplateSynopsis object) {
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

} //synopsisSwitch
