/**
 */
package ru.arsysop.loft.rgm.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.model.api.*;

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
			public Adapter caseFunctionDecl(FunctionDecl object) {
				return createFunctionDeclAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseCitation(Citation object) {
				return createCitationAdapter();
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
			public Adapter caseClassDecl(ClassDecl object) {
				return createClassDeclAdapter();
			}
			@Override
			public Adapter caseEnumDecl(EnumDecl object) {
				return createEnumDeclAdapter();
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
