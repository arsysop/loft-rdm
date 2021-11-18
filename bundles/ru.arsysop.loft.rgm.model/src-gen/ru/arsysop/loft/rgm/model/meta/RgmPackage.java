/**
 */
package ru.arsysop.loft.rgm.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.model.meta.RgmFactory
 * @model kind="package"
 * @generated
 */
public interface RgmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rgm"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.arsysop.ru/loft/rgm/0.1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rgm"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RgmPackage eINSTANCE = ru.arsysop.loft.rgm.model.impl.RgmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.DocumentImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CITATIONS = 5;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.DeclarationImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__CONTRACT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.FunctionDeclImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getFunctionDecl()
	 * @generated
	 */
	int FUNCTION_DECL = 1;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__SIGNATURE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__PARAMETERS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.RequirementImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CITATION = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TAGS = 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.CitationImpl <em>Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.CitationImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getCitation()
	 * @generated
	 */
	int CITATION = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__CHAPTER = 1;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__PARAGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__CITATION = 3;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__DOCUMENT = 4;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__REQUIREMENTS = 5;

	/**
	 * The number of structural features of the '<em>Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.HeaderImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 4;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.NamespaceImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 6;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.ClassDeclImpl <em>Class Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.ClassDeclImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getClassDecl()
	 * @generated
	 */
	int CLASS_DECL = 7;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__FIELDS = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destructor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__DESTRUCTOR = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__CONSTRUCTORS = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cxxmethod</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL__CXXMETHOD = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.EnumDeclImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getEnumDecl()
	 * @generated
	 */
	int ENUM_DECL = 8;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECL__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Enum Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enum Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.TagImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 9;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__REQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__CONTRACTS = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ID = 2;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.ContractImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 10;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__TAGS = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ID = 2;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.StructDeclImpl <em>Struct Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.StructDeclImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getStructDecl()
	 * @generated
	 */
	int STRUCT_DECL = 11;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DECL__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Struct Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Struct Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.UnionDeclImpl <em>Union Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.UnionDeclImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getUnionDecl()
	 * @generated
	 */
	int UNION_DECL = 12;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DECL__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Union Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Union Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.FieldDeclImpl <em>Field Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.FieldDeclImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getFieldDecl()
	 * @generated
	 */
	int FIELD_DECL = 13;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Field Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.VarDeclImpl <em>Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.VarDeclImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getVarDecl()
	 * @generated
	 */
	int VAR_DECL = 14;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.TypedefDeclImpl <em>Typedef Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.TypedefDeclImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getTypedefDecl()
	 * @generated
	 */
	int TYPEDEF_DECL = 15;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECL__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Typedef Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Typedef Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.ParmDeclImpl <em>Parm Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.ParmDeclImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getParmDecl()
	 * @generated
	 */
	int PARM_DECL = 16;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARM_DECL__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARM_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARM_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Parm Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARM_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parm Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARM_DECL_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.FunctionTemplateImpl <em>Function Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.FunctionTemplateImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getFunctionTemplate()
	 * @generated
	 */
	int FUNCTION_TEMPLATE = 17;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Function Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TEMPLATE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.ClassTemplateImpl <em>Class Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.ClassTemplateImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getClassTemplate()
	 * @generated
	 */
	int CLASS_TEMPLATE = 18;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Templatetypeparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE__TEMPLATETYPEPARAMETER = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.CXXMethodImpl <em>CXX Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.CXXMethodImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getCXXMethod()
	 * @generated
	 */
	int CXX_METHOD = 19;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD__CONTRACT = FUNCTION_DECL__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD__ID = FUNCTION_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD__NAME = FUNCTION_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD__SIGNATURE = FUNCTION_DECL__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD__PARAMETERS = FUNCTION_DECL__PARAMETERS;

	/**
	 * The number of structural features of the '<em>CXX Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD_FEATURE_COUNT = FUNCTION_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CXX Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD_OPERATION_COUNT = FUNCTION_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.ConstructorImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 20;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CONTRACT = FUNCTION_DECL__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ID = FUNCTION_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = FUNCTION_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__SIGNATURE = FUNCTION_DECL__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMETERS = FUNCTION_DECL__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = FUNCTION_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = FUNCTION_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.DestructorImpl <em>Destructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.DestructorImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getDestructor()
	 * @generated
	 */
	int DESTRUCTOR = 21;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__CONTRACT = FUNCTION_DECL__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__ID = FUNCTION_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__NAME = FUNCTION_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__SIGNATURE = FUNCTION_DECL__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__PARAMETERS = FUNCTION_DECL__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Destructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR_FEATURE_COUNT = FUNCTION_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Destructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR_OPERATION_COUNT = FUNCTION_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.model.impl.TemplateTypeParameterImpl <em>Template Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.model.impl.TemplateTypeParameterImpl
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getTemplateTypeParameter()
	 * @generated
	 */
	int TEMPLATE_TYPE_PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER__CONTRACT = DECLARATION__CONTRACT;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Template Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_PARAMETER_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Document Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ru.arsysop.loft.rgm.model.impl.RgmPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Document#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Document#getID()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_ID();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Document#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Document#getType()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Type();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Document#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Document#getVersion()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Version();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Document#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Document#getRevision()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Revision();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.model.api.Document#getCitations <em>Citations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Citations</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Document#getCitations()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Citations();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.FunctionDecl <em>Function Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Decl</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.FunctionDecl
	 * @generated
	 */
	EClass getFunctionDecl();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.FunctionDecl#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.FunctionDecl#getSignature()
	 * @see #getFunctionDecl()
	 * @generated
	 */
	EAttribute getFunctionDecl_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.model.api.FunctionDecl#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.FunctionDecl#getParameters()
	 * @see #getFunctionDecl()
	 * @generated
	 */
	EReference getFunctionDecl_Parameters();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Requirement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Requirement#getID()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ID();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.rgm.model.api.Requirement#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Citation</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Requirement#getCitation()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Citation();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.model.api.Requirement#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Requirement#getTags()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Tags();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citation</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Citation
	 * @generated
	 */
	EClass getCitation();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Citation#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Citation#getID()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_ID();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Citation#getChapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chapter</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Citation#getChapter()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_Chapter();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Citation#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Citation#getParagraph()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_Paragraph();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Citation#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Citation</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Citation#getCitation()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_Citation();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.rgm.model.api.Citation#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Citation#getDocument()
	 * @see #getCitation()
	 * @generated
	 */
	EReference getCitation_Document();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.model.api.Citation#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Citation#getRequirements()
	 * @see #getCitation()
	 * @generated
	 */
	EReference getCitation_Requirements();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.model.api.Header#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Header#getDeclarations()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Declarations();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Header#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Header#getID()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_ID();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Header#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Header#getName()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Name();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.rgm.model.api.Declaration#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contract</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Declaration#getContract()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Contract();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Declaration#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Declaration#getID()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_ID();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Declaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Declaration#getName()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.ClassDecl <em>Class Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Decl</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.ClassDecl
	 * @generated
	 */
	EClass getClassDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.model.api.ClassDecl#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.ClassDecl#getFields()
	 * @see #getClassDecl()
	 * @generated
	 */
	EReference getClassDecl_Fields();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.model.api.ClassDecl#getDestructor <em>Destructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Destructor</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.ClassDecl#getDestructor()
	 * @see #getClassDecl()
	 * @generated
	 */
	EReference getClassDecl_Destructor();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.model.api.ClassDecl#getConstructors <em>Constructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constructors</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.ClassDecl#getConstructors()
	 * @see #getClassDecl()
	 * @generated
	 */
	EReference getClassDecl_Constructors();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.model.api.ClassDecl#getCxxmethod <em>Cxxmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cxxmethod</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.ClassDecl#getCxxmethod()
	 * @see #getClassDecl()
	 * @generated
	 */
	EReference getClassDecl_Cxxmethod();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.EnumDecl <em>Enum Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Decl</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.EnumDecl
	 * @generated
	 */
	EClass getEnumDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.model.api.Tag#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Tag#getRequirements()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Requirements();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.model.api.Tag#getContracts <em>Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contracts</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Tag#getContracts()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Contracts();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Tag#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Tag#getID()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_ID();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.rgm.model.api.Contract#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Contract#getDeclaration()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Declaration();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.model.api.Contract#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Contract#getTags()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Tags();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.model.api.Contract#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Contract#getID()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ID();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.StructDecl <em>Struct Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Decl</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.StructDecl
	 * @generated
	 */
	EClass getStructDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.UnionDecl <em>Union Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Decl</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.UnionDecl
	 * @generated
	 */
	EClass getUnionDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.FieldDecl <em>Field Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Decl</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.FieldDecl
	 * @generated
	 */
	EClass getFieldDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Decl</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.VarDecl
	 * @generated
	 */
	EClass getVarDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.TypedefDecl <em>Typedef Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedef Decl</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.TypedefDecl
	 * @generated
	 */
	EClass getTypedefDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.ParmDecl <em>Parm Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parm Decl</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.ParmDecl
	 * @generated
	 */
	EClass getParmDecl();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.FunctionTemplate <em>Function Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Template</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.FunctionTemplate
	 * @generated
	 */
	EClass getFunctionTemplate();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.ClassTemplate <em>Class Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Template</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.ClassTemplate
	 * @generated
	 */
	EClass getClassTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.model.api.ClassTemplate#getTemplatetypeparameter <em>Templatetypeparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templatetypeparameter</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.ClassTemplate#getTemplatetypeparameter()
	 * @see #getClassTemplate()
	 * @generated
	 */
	EReference getClassTemplate_Templatetypeparameter();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.CXXMethod <em>CXX Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CXX Method</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.CXXMethod
	 * @generated
	 */
	EClass getCXXMethod();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.Destructor <em>Destructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destructor</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.Destructor
	 * @generated
	 */
	EClass getDestructor();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.model.api.TemplateTypeParameter <em>Template Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Type Parameter</em>'.
	 * @see ru.arsysop.loft.rgm.model.api.TemplateTypeParameter
	 * @generated
	 */
	EClass getTemplateTypeParameter();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Document Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getDocumentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RgmFactory getRgmFactory();

} //RgmPackage
