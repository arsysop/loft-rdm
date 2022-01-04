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
package ru.arsysop.loft.rgm.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ru.arsysop.loft.rgm.model.api.*;
import ru.arsysop.loft.rgm.model.api.CXXMethod;
import ru.arsysop.loft.rgm.model.api.Citation;
import ru.arsysop.loft.rgm.model.api.ClassDecl;
import ru.arsysop.loft.rgm.model.api.ClassTemplate;
import ru.arsysop.loft.rgm.model.api.Constructor;
import ru.arsysop.loft.rgm.model.api.Contract;
import ru.arsysop.loft.rgm.model.api.Declaration;
import ru.arsysop.loft.rgm.model.api.Destructor;
import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.api.EnumDecl;
import ru.arsysop.loft.rgm.model.api.FieldDecl;
import ru.arsysop.loft.rgm.model.api.FunctionDecl;
import ru.arsysop.loft.rgm.model.api.FunctionTemplate;
import ru.arsysop.loft.rgm.model.api.Header;
import ru.arsysop.loft.rgm.model.api.Namespace;
import ru.arsysop.loft.rgm.model.api.ParmDecl;
import ru.arsysop.loft.rgm.model.api.Requirement;
import ru.arsysop.loft.rgm.model.api.StructDecl;
import ru.arsysop.loft.rgm.model.api.Tag;
import ru.arsysop.loft.rgm.model.api.TemplateTypeParameter;
import ru.arsysop.loft.rgm.model.api.TypedefDecl;
import ru.arsysop.loft.rgm.model.api.UnionDecl;
import ru.arsysop.loft.rgm.model.api.VarDecl;
import ru.arsysop.loft.rgm.model.meta.RgmPackage;

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
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage
 * @generated
 */
public class RgmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RgmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgmSwitch() {
		if (modelPackage == null) {
			modelPackage = RgmPackage.eINSTANCE;
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
			case RgmPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.PART: {
				Part part = (Part)theEObject;
				T result = casePart(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.WITH_PARTS: {
				WithParts withParts = (WithParts)theEObject;
				T result = caseWithParts(withParts);
				if (result == null) result = casePart(withParts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.WITH_TOC_CHAPTERS: {
				WithTocChapters withTocChapters = (WithTocChapters)theEObject;
				T result = caseWithTocChapters(withTocChapters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.TOC: {
				Toc toc = (Toc)theEObject;
				T result = caseToc(toc);
				if (result == null) result = caseWithTocChapters(toc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.TOC_CHAPTER: {
				TocChapter tocChapter = (TocChapter)theEObject;
				T result = caseTocChapter(tocChapter);
				if (result == null) result = casePart(tocChapter);
				if (result == null) result = caseWithTocChapters(tocChapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				T result = caseParagraph(paragraph);
				if (result == null) result = caseWithParts(paragraph);
				if (result == null) result = casePart(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.SUB_PARAGRAPH: {
				SubParagraph subParagraph = (SubParagraph)theEObject;
				T result = caseSubParagraph(subParagraph);
				if (result == null) result = casePart(subParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.INDEX: {
				Index index = (Index)theEObject;
				T result = caseIndex(index);
				if (result == null) result = casePart(index);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.INDEX_ENTRY: {
				IndexEntry indexEntry = (IndexEntry)theEObject;
				T result = caseIndexEntry(indexEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.MARKUP: {
				Markup markup = (Markup)theEObject;
				T result = caseMarkup(markup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.CITATION: {
				Citation citation = (Citation)theEObject;
				T result = caseCitation(citation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = caseDeclaration(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.FUNCTION_DECL: {
				FunctionDecl functionDecl = (FunctionDecl)theEObject;
				T result = caseFunctionDecl(functionDecl);
				if (result == null) result = caseDeclaration(functionDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.CLASS_DECL: {
				ClassDecl classDecl = (ClassDecl)theEObject;
				T result = caseClassDecl(classDecl);
				if (result == null) result = caseDeclaration(classDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.ENUM_DECL: {
				EnumDecl enumDecl = (EnumDecl)theEObject;
				T result = caseEnumDecl(enumDecl);
				if (result == null) result = caseDeclaration(enumDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.STRUCT_DECL: {
				StructDecl structDecl = (StructDecl)theEObject;
				T result = caseStructDecl(structDecl);
				if (result == null) result = caseDeclaration(structDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.UNION_DECL: {
				UnionDecl unionDecl = (UnionDecl)theEObject;
				T result = caseUnionDecl(unionDecl);
				if (result == null) result = caseDeclaration(unionDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.FIELD_DECL: {
				FieldDecl fieldDecl = (FieldDecl)theEObject;
				T result = caseFieldDecl(fieldDecl);
				if (result == null) result = caseDeclaration(fieldDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.VAR_DECL: {
				VarDecl varDecl = (VarDecl)theEObject;
				T result = caseVarDecl(varDecl);
				if (result == null) result = caseDeclaration(varDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.TYPEDEF_DECL: {
				TypedefDecl typedefDecl = (TypedefDecl)theEObject;
				T result = caseTypedefDecl(typedefDecl);
				if (result == null) result = caseDeclaration(typedefDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.PARM_DECL: {
				ParmDecl parmDecl = (ParmDecl)theEObject;
				T result = caseParmDecl(parmDecl);
				if (result == null) result = caseDeclaration(parmDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.FUNCTION_TEMPLATE: {
				FunctionTemplate functionTemplate = (FunctionTemplate)theEObject;
				T result = caseFunctionTemplate(functionTemplate);
				if (result == null) result = caseDeclaration(functionTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.CLASS_TEMPLATE: {
				ClassTemplate classTemplate = (ClassTemplate)theEObject;
				T result = caseClassTemplate(classTemplate);
				if (result == null) result = caseDeclaration(classTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.CXX_METHOD: {
				CXXMethod cxxMethod = (CXXMethod)theEObject;
				T result = caseCXXMethod(cxxMethod);
				if (result == null) result = caseFunctionDecl(cxxMethod);
				if (result == null) result = caseDeclaration(cxxMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = caseFunctionDecl(constructor);
				if (result == null) result = caseDeclaration(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.DESTRUCTOR: {
				Destructor destructor = (Destructor)theEObject;
				T result = caseDestructor(destructor);
				if (result == null) result = caseFunctionDecl(destructor);
				if (result == null) result = caseDeclaration(destructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RgmPackage.TEMPLATE_TYPE_PARAMETER: {
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
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>With Parts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>With Parts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithParts(WithParts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubParagraph(SubParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkup(Markup object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitation(Citation object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex(Index object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntry(IndexEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToc(Toc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toc Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toc Chapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTocChapter(TocChapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>With Toc Chapters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>With Toc Chapters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithTocChapters(WithTocChapters object) {
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

} //RgmSwitch
