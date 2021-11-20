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
package ru.arsysop.loft.rgm.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.arsysop.loft.rgm.model.api.*;
import ru.arsysop.loft.rgm.model.api.CXXMethod;
import ru.arsysop.loft.rgm.model.api.Citation;
import ru.arsysop.loft.rgm.model.api.ClassDecl;
import ru.arsysop.loft.rgm.model.api.ClassTemplate;
import ru.arsysop.loft.rgm.model.api.Constructor;
import ru.arsysop.loft.rgm.model.api.Contract;
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
import ru.arsysop.loft.rgm.model.meta.RgmFactory;
import ru.arsysop.loft.rgm.model.meta.RgmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RgmFactoryImpl extends EFactoryImpl implements RgmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RgmFactory init() {
		try {
			RgmFactory theRgmFactory = (RgmFactory)EPackage.Registry.INSTANCE.getEFactory(RgmPackage.eNS_URI);
			if (theRgmFactory != null) {
				return theRgmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RgmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgmFactoryImpl() {
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
			case RgmPackage.DOCUMENT: return createDocument();
			case RgmPackage.PARAGRAPH: return createParagraph();
			case RgmPackage.ANCHORED: return createAnchored();
			case RgmPackage.MARKUP: return createMarkup();
			case RgmPackage.CITATION: return createCitation();
			case RgmPackage.REQUIREMENT: return createRequirement();
			case RgmPackage.TAG: return createTag();
			case RgmPackage.CONTRACT: return createContract();
			case RgmPackage.HEADER: return createHeader();
			case RgmPackage.NAMESPACE: return createNamespace();
			case RgmPackage.FUNCTION_DECL: return createFunctionDecl();
			case RgmPackage.CLASS_DECL: return createClassDecl();
			case RgmPackage.ENUM_DECL: return createEnumDecl();
			case RgmPackage.STRUCT_DECL: return createStructDecl();
			case RgmPackage.UNION_DECL: return createUnionDecl();
			case RgmPackage.FIELD_DECL: return createFieldDecl();
			case RgmPackage.VAR_DECL: return createVarDecl();
			case RgmPackage.TYPEDEF_DECL: return createTypedefDecl();
			case RgmPackage.PARM_DECL: return createParmDecl();
			case RgmPackage.FUNCTION_TEMPLATE: return createFunctionTemplate();
			case RgmPackage.CLASS_TEMPLATE: return createClassTemplate();
			case RgmPackage.CXX_METHOD: return createCXXMethod();
			case RgmPackage.CONSTRUCTOR: return createConstructor();
			case RgmPackage.DESTRUCTOR: return createDestructor();
			case RgmPackage.TEMPLATE_TYPE_PARAMETER: return createTemplateTypeParameter();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RgmPackage.DOCUMENT_TYPE:
				return createDocumentTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RgmPackage.DOCUMENT_TYPE:
				return convertDocumentTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchored createAnchored() {
		AnchoredImpl anchored = new AnchoredImpl();
		return anchored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markup createMarkup() {
		MarkupImpl markup = new MarkupImpl();
		return markup;
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
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Citation createCitation() {
		CitationImpl citation = new CitationImpl();
		return citation;
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
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
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
	public Object createDocumentTypeFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RgmPackage getRgmPackage() {
		return (RgmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RgmPackage getPackage() {
		return RgmPackage.eINSTANCE;
	}

} //RgmFactoryImpl
