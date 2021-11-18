/**
 */
package ru.arsysop.loft.rgm.model.impl;

import org.eclipse.emf.ecore.EClass;

import ru.arsysop.loft.rgm.model.api.UnionDecl;

import ru.arsysop.loft.rgm.model.meta.RgmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnionDeclImpl extends DeclarationImpl implements UnionDecl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RgmPackage.eINSTANCE.getUnionDecl();
	}

} //UnionDeclImpl
