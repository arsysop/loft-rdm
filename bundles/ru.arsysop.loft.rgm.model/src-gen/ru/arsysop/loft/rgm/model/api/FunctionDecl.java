/**
 */
package ru.arsysop.loft.rgm.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.FunctionDecl#getSignature <em>Signature</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.FunctionDecl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getFunctionDecl()
 * @model
 * @generated
 */
public interface FunctionDecl extends Declaration {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getFunctionDecl_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.FunctionDecl#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.ParmDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getFunctionDecl_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParmDecl> getParameters();

} // FunctionDecl
