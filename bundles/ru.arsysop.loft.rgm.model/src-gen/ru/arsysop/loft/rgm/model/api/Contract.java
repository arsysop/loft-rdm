/**
 */
package ru.arsysop.loft.rgm.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Contract#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Contract#getTags <em>Tags</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Contract#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.rgm.model.api.Declaration#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(Declaration)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getContract_Declaration()
	 * @see ru.arsysop.loft.rgm.model.api.Declaration#getContract
	 * @model opposite="contract" required="true"
	 * @generated
	 */
	Declaration getDeclaration();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Contract#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(Declaration value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Tag}.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.rgm.model.api.Tag#getContracts <em>Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getContract_Tags()
	 * @see ru.arsysop.loft.rgm.model.api.Tag#getContracts
	 * @model opposite="contracts"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getContract_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Contract#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // Contract
