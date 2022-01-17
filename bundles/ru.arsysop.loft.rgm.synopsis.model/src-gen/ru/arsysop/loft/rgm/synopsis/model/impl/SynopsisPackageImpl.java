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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.arsysop.loft.rgm.spec.model.meta.SpecPackage;
import ru.arsysop.loft.rgm.synopsis.model.api.CXXMethod;
import ru.arsysop.loft.rgm.synopsis.model.api.ClassDecl;
import ru.arsysop.loft.rgm.synopsis.model.api.ClassTemplate;
import ru.arsysop.loft.rgm.synopsis.model.api.Constructor;
import ru.arsysop.loft.rgm.synopsis.model.api.Declaration;
import ru.arsysop.loft.rgm.synopsis.model.api.Destructor;
import ru.arsysop.loft.rgm.synopsis.model.api.EnumDecl;
import ru.arsysop.loft.rgm.synopsis.model.api.FieldDecl;
import ru.arsysop.loft.rgm.synopsis.model.api.FunctionDecl;
import ru.arsysop.loft.rgm.synopsis.model.api.FunctionTemplate;
import ru.arsysop.loft.rgm.synopsis.model.api.Synopsis;
import ru.arsysop.loft.rgm.synopsis.model.api.Namespace;
import ru.arsysop.loft.rgm.synopsis.model.api.ParmDecl;
import ru.arsysop.loft.rgm.synopsis.model.api.StructDecl;
import ru.arsysop.loft.rgm.synopsis.model.api.TemplateTypeParameter;
import ru.arsysop.loft.rgm.synopsis.model.api.TypedefDecl;
import ru.arsysop.loft.rgm.synopsis.model.api.UnionDecl;
import ru.arsysop.loft.rgm.synopsis.model.api.VarDecl;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisFactory;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynopsisPackageImpl extends EPackageImpl implements SynopsisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synopsisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedefDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parmDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cxxMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateTypeParameterEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SynopsisPackageImpl() {
		super(eNS_URI, SynopsisFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SynopsisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SynopsisPackage init() {
		if (isInited) return (SynopsisPackage)EPackage.Registry.INSTANCE.getEPackage(SynopsisPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSynopsisPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SynopsisPackageImpl theSynopsisPackage = registeredSynopsisPackage instanceof SynopsisPackageImpl ? (SynopsisPackageImpl)registeredSynopsisPackage : new SynopsisPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		SpecPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSynopsisPackage.createPackageContents();

		// Initialize created meta-data
		theSynopsisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSynopsisPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SynopsisPackage.eNS_URI, theSynopsisPackage);
		return theSynopsisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSynopsis() {
		return synopsisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSynopsis_Name() {
		return (EAttribute)synopsisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSynopsis_Part() {
		return (EReference)synopsisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSynopsis_Declarations() {
		return (EReference)synopsisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeclaration_Id() {
		return (EAttribute)declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeclaration_Name() {
		return (EAttribute)declarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionDecl() {
		return functionDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionDecl_Signature() {
		return (EAttribute)functionDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionDecl_Parameters() {
		return (EReference)functionDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassDecl() {
		return classDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDecl_Fields() {
		return (EReference)classDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDecl_Destructor() {
		return (EReference)classDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDecl_Constructors() {
		return (EReference)classDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDecl_Cxxmethod() {
		return (EReference)classDeclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumDecl() {
		return enumDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructDecl() {
		return structDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnionDecl() {
		return unionDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDecl() {
		return fieldDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVarDecl() {
		return varDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedefDecl() {
		return typedefDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParmDecl() {
		return parmDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionTemplate() {
		return functionTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassTemplate() {
		return classTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassTemplate_Templatetypeparameter() {
		return (EReference)classTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCXXMethod() {
		return cxxMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDestructor() {
		return destructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplateTypeParameter() {
		return templateTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynopsisFactory getSynopsisFactory() {
		return (SynopsisFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		synopsisEClass = createEClass(SYNOPSIS);
		createEAttribute(synopsisEClass, SYNOPSIS__NAME);
		createEReference(synopsisEClass, SYNOPSIS__PART);
		createEReference(synopsisEClass, SYNOPSIS__DECLARATIONS);

		declarationEClass = createEClass(DECLARATION);
		createEAttribute(declarationEClass, DECLARATION__ID);
		createEAttribute(declarationEClass, DECLARATION__NAME);

		namespaceEClass = createEClass(NAMESPACE);

		functionDeclEClass = createEClass(FUNCTION_DECL);
		createEAttribute(functionDeclEClass, FUNCTION_DECL__SIGNATURE);
		createEReference(functionDeclEClass, FUNCTION_DECL__PARAMETERS);

		classDeclEClass = createEClass(CLASS_DECL);
		createEReference(classDeclEClass, CLASS_DECL__FIELDS);
		createEReference(classDeclEClass, CLASS_DECL__DESTRUCTOR);
		createEReference(classDeclEClass, CLASS_DECL__CONSTRUCTORS);
		createEReference(classDeclEClass, CLASS_DECL__CXXMETHOD);

		enumDeclEClass = createEClass(ENUM_DECL);

		structDeclEClass = createEClass(STRUCT_DECL);

		unionDeclEClass = createEClass(UNION_DECL);

		fieldDeclEClass = createEClass(FIELD_DECL);

		varDeclEClass = createEClass(VAR_DECL);

		typedefDeclEClass = createEClass(TYPEDEF_DECL);

		parmDeclEClass = createEClass(PARM_DECL);

		functionTemplateEClass = createEClass(FUNCTION_TEMPLATE);

		classTemplateEClass = createEClass(CLASS_TEMPLATE);
		createEReference(classTemplateEClass, CLASS_TEMPLATE__TEMPLATETYPEPARAMETER);

		cxxMethodEClass = createEClass(CXX_METHOD);

		constructorEClass = createEClass(CONSTRUCTOR);

		destructorEClass = createEClass(DESTRUCTOR);

		templateTypeParameterEClass = createEClass(TEMPLATE_TYPE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SpecPackage theSpecPackage = (SpecPackage)EPackage.Registry.INSTANCE.getEPackage(SpecPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namespaceEClass.getESuperTypes().add(this.getDeclaration());
		functionDeclEClass.getESuperTypes().add(this.getDeclaration());
		classDeclEClass.getESuperTypes().add(this.getDeclaration());
		enumDeclEClass.getESuperTypes().add(this.getDeclaration());
		structDeclEClass.getESuperTypes().add(this.getDeclaration());
		unionDeclEClass.getESuperTypes().add(this.getDeclaration());
		fieldDeclEClass.getESuperTypes().add(this.getDeclaration());
		varDeclEClass.getESuperTypes().add(this.getDeclaration());
		typedefDeclEClass.getESuperTypes().add(this.getDeclaration());
		parmDeclEClass.getESuperTypes().add(this.getDeclaration());
		functionTemplateEClass.getESuperTypes().add(this.getDeclaration());
		classTemplateEClass.getESuperTypes().add(this.getDeclaration());
		cxxMethodEClass.getESuperTypes().add(this.getFunctionDecl());
		constructorEClass.getESuperTypes().add(this.getFunctionDecl());
		destructorEClass.getESuperTypes().add(this.getFunctionDecl());
		templateTypeParameterEClass.getESuperTypes().add(this.getDeclaration());

		// Initialize classes, features, and operations; add parameters
		initEClass(synopsisEClass, Synopsis.class, "Synopsis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSynopsis_Name(), ecorePackage.getEString(), "name", null, 0, 1, Synopsis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSynopsis_Part(), theSpecPackage.getPart(), null, "part", null, 1, 1, Synopsis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSynopsis_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, Synopsis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDeclaration_Id(), ecorePackage.getEString(), "id", null, 1, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(functionDeclEClass, FunctionDecl.class, "FunctionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFunctionDecl_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFunctionDecl_Parameters(), this.getParmDecl(), null, "parameters", null, 0, -1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(classDeclEClass, ClassDecl.class, "ClassDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getClassDecl_Fields(), this.getFieldDecl(), null, "fields", null, 0, -1, ClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassDecl_Destructor(), this.getDestructor(), null, "destructor", null, 0, -1, ClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassDecl_Constructors(), this.getConstructor(), null, "constructors", null, 0, -1, ClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassDecl_Cxxmethod(), this.getCXXMethod(), null, "cxxmethod", null, 0, -1, ClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(enumDeclEClass, EnumDecl.class, "EnumDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(structDeclEClass, StructDecl.class, "StructDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(unionDeclEClass, UnionDecl.class, "UnionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(fieldDeclEClass, FieldDecl.class, "FieldDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(varDeclEClass, VarDecl.class, "VarDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(typedefDeclEClass, TypedefDecl.class, "TypedefDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(parmDeclEClass, ParmDecl.class, "ParmDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(functionTemplateEClass, FunctionTemplate.class, "FunctionTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(classTemplateEClass, ClassTemplate.class, "ClassTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getClassTemplate_Templatetypeparameter(), this.getTemplateTypeParameter(), null, "templatetypeparameter", null, 0, -1, ClassTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cxxMethodEClass, CXXMethod.class, "CXXMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(destructorEClass, Destructor.class, "Destructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(templateTypeParameterEClass, TemplateTypeParameter.class, "TemplateTypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //synopsisPackageImpl
