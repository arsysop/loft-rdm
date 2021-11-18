/**
 */
package ru.arsysop.loft.rgm.model.impl;

import org.eclipse.emf.ecore.EClass;

import ru.arsysop.loft.rgm.model.api.Namespace;

import ru.arsysop.loft.rgm.model.meta.RgmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NamespaceImpl extends DeclarationImpl implements Namespace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RgmPackage.eINSTANCE.getNamespace();
	}

} //NamespaceImpl
