/**
 */
package ru.arsysop.loft.rgm.model.impl;

import org.eclipse.emf.ecore.EClass;

import ru.arsysop.loft.rgm.model.api.StructDecl;

import ru.arsysop.loft.rgm.model.meta.RgmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StructDeclImpl extends DeclarationImpl implements StructDecl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RgmPackage.eINSTANCE.getStructDecl();
	}

} //StructDeclImpl
