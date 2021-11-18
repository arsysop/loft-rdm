/**
 */
package ru.arsysop.loft.rgm.model.impl;

import org.eclipse.emf.ecore.EClass;

import ru.arsysop.loft.rgm.model.api.VarDecl;

import ru.arsysop.loft.rgm.model.meta.RgmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VarDeclImpl extends DeclarationImpl implements VarDecl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RgmPackage.eINSTANCE.getVarDecl();
	}

} //VarDeclImpl
