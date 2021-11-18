/**
 */
package ru.arsysop.loft.rgm.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.api.ClassTemplate#getTemplatetypeparameter <em>Templatetypeparameter</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getClassTemplate()
 * @model
 * @generated
 */
public interface ClassTemplate extends Declaration {
	/**
	 * Returns the value of the '<em><b>Templatetypeparameter</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.model.api.TemplateTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templatetypeparameter</em>' containment reference list.
	 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage#getClassTemplate_Templatetypeparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateTypeParameter> getTemplatetypeparameter();

} // ClassTemplate
