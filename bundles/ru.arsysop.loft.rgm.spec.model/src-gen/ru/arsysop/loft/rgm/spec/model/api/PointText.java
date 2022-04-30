/**
 * Copyright (c) ArSysOp 2018-2022
 * 
 * RGM Sources are publicly available only for 
 * informational, review, analysis and consulting purposes.
 * 
 * Definitions, terms and conditions for using RGM Sources are stated by ArSysOp Source License version 1.0.
 * See http://arsysop.ru/licenses/rgm/ArSysOpSourceLicense-1.0.txt
 * 
 * RGM Sources are provided on "as is" basis. 
 * ArSysOp is not responsible for any damages, losses, legal prosecution 
 * or other consequences of any sort that using RGM Sources can cause to you 
 * (as an individual or Legal Entity), even if aware of such consequences.
 * 
 */
package ru.arsysop.loft.rgm.spec.model.api;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.spec.model.api.PointText#getRaw <em>Raw</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getPointText()
 * @model
 * @generated
 */
public interface PointText extends PointContent, WithReferences {
	/**
	 * Returns the value of the '<em><b>Raw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw</em>' attribute.
	 * @see #setRaw(String)
	 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage#getPointText_Raw()
	 * @model
	 * @generated
	 */
	String getRaw();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.spec.model.api.PointText#getRaw <em>Raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw</em>' attribute.
	 * @see #getRaw()
	 * @generated
	 */
	void setRaw(String value);

} // PointText
