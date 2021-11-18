/**
 */
package ru.arsysop.loft.rgm.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Header#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Header#getID <em>ID</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Header#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getHeader_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getHeader_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Header#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getHeader_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Header#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Header
