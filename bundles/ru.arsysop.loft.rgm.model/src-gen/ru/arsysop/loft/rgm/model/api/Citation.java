/**
 */
package ru.arsysop.loft.rgm.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Citation#getID <em>ID</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Citation#getChapter <em>Chapter</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Citation#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Citation#getCitation <em>Citation</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Citation#getDocument <em>Document</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.Citation#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getCitation()
 * @model
 * @generated
 */
public interface Citation extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getCitation_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Citation#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapter</em>' attribute.
	 * @see #setChapter(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getCitation_Chapter()
	 * @model
	 * @generated
	 */
	String getChapter();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Citation#getChapter <em>Chapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chapter</em>' attribute.
	 * @see #getChapter()
	 * @generated
	 */
	void setChapter(String value);

	/**
	 * Returns the value of the '<em><b>Paragraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph</em>' attribute.
	 * @see #setParagraph(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getCitation_Paragraph()
	 * @model
	 * @generated
	 */
	String getParagraph();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Citation#getParagraph <em>Paragraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph</em>' attribute.
	 * @see #getParagraph()
	 * @generated
	 */
	void setParagraph(String value);

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation</em>' attribute.
	 * @see #setCitation(String)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getCitation_Citation()
	 * @model
	 * @generated
	 */
	String getCitation();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Citation#getCitation <em>Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' attribute.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(String value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.rgm.model.api.Document#getCitations <em>Citations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getCitation_Document()
	 * @see ru.arsysop.loft.rgm.model.api.Document#getCitations
	 * @model opposite="citations" required="true"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.model.api.Citation#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.Requirement}.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.rgm.model.api.Requirement#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getCitation_Requirements()
	 * @see ru.arsysop.loft.rgm.model.api.Requirement#getCitation
	 * @model opposite="citation"
	 * @generated
	 */
	EList<Requirement> getRequirements();

} // Citation
