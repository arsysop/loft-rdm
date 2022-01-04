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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage
 * @generated
 */
public class RgmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RgmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RgmPackage.eINSTANCE;
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
	protected RgmSwitch<Adapter> modelSwitch =
		new RgmSwitch<Adapter>() {
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter caseWithParts(WithParts object) {
				return createWithPartsAdapter();
			}
			@Override
			public Adapter caseWithTocChapters(WithTocChapters object) {
				return createWithTocChaptersAdapter();
			}
			@Override
			public Adapter caseToc(Toc object) {
				return createTocAdapter();
			}
			@Override
			public Adapter caseTocChapter(TocChapter object) {
				return createTocChapterAdapter();
			}
			@Override
			public Adapter caseParagraph(Paragraph object) {
				return createParagraphAdapter();
			}
			@Override
			public Adapter caseSubParagraph(SubParagraph object) {
				return createSubParagraphAdapter();
			}
			@Override
			public Adapter caseIndex(Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseIndexEntry(IndexEntry object) {
				return createIndexEntryAdapter();
			}
			@Override
			public Adapter caseMarkup(Markup object) {
				return createMarkupAdapter();
			}
			@Override
			public Adapter caseCitation(Citation object) {
				return createCitationAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
			}
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
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.WithParts <em>With Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.WithParts
	 * @generated
	 */
	public Adapter createWithPartsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Paragraph
	 * @generated
	 */
	public Adapter createParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.SubParagraph <em>Sub Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.SubParagraph
	 * @generated
	 */
	public Adapter createSubParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Markup <em>Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Markup
	 * @generated
	 */
	public Adapter createMarkupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.FunctionDecl <em>Function Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.FunctionDecl
	 * @generated
	 */
	public Adapter createFunctionDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Citation
	 * @generated
	 */
	public Adapter createCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.ClassDecl <em>Class Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.ClassDecl
	 * @generated
	 */
	public Adapter createClassDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.EnumDecl <em>Enum Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.EnumDecl
	 * @generated
	 */
	public Adapter createEnumDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.StructDecl <em>Struct Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.StructDecl
	 * @generated
	 */
	public Adapter createStructDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.UnionDecl <em>Union Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.UnionDecl
	 * @generated
	 */
	public Adapter createUnionDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.FieldDecl <em>Field Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.FieldDecl
	 * @generated
	 */
	public Adapter createFieldDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.VarDecl
	 * @generated
	 */
	public Adapter createVarDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.TypedefDecl <em>Typedef Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.TypedefDecl
	 * @generated
	 */
	public Adapter createTypedefDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.ParmDecl <em>Parm Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.ParmDecl
	 * @generated
	 */
	public Adapter createParmDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.FunctionTemplate <em>Function Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.FunctionTemplate
	 * @generated
	 */
	public Adapter createFunctionTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.ClassTemplate <em>Class Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.ClassTemplate
	 * @generated
	 */
	public Adapter createClassTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.CXXMethod <em>CXX Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.CXXMethod
	 * @generated
	 */
	public Adapter createCXXMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Destructor <em>Destructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Destructor
	 * @generated
	 */
	public Adapter createDestructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.TemplateTypeParameter <em>Template Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.TemplateTypeParameter
	 * @generated
	 */
	public Adapter createTemplateTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Index
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.IndexEntry <em>Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.IndexEntry
	 * @generated
	 */
	public Adapter createIndexEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.Toc <em>Toc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.Toc
	 * @generated
	 */
	public Adapter createTocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.TocChapter <em>Toc Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.TocChapter
	 * @generated
	 */
	public Adapter createTocChapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.model.api.WithTocChapters <em>With Toc Chapters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.model.api.WithTocChapters
	 * @generated
	 */
	public Adapter createWithTocChaptersAdapter() {
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

} //RgmAdapterFactory
