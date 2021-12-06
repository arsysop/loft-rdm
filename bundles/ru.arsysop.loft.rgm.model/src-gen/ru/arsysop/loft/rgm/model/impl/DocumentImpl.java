/*******************************************************************************
 * Copyright (c) 2021 ArSysOp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.api.Index;
import ru.arsysop.loft.rgm.model.api.Paragraph;
import ru.arsysop.loft.rgm.model.api.Toc;
import ru.arsysop.loft.rgm.model.meta.RgmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.DocumentImpl#getId <em>Id</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.DocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.DocumentImpl#getType <em>Type</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.DocumentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.DocumentImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.DocumentImpl#getToc <em>Toc</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.DocumentImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.DocumentImpl#getIndexes <em>Indexes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToc() <em>Toc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToc()
	 * @generated
	 * @ordered
	 */
	protected Toc toc;

	/**
	 * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> paragraphs;

	/**
	 * The cached value of the '{@link #getIndexes() <em>Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexes()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> indexes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RgmPackage.eINSTANCE.getDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.DOCUMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.DOCUMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.DOCUMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.DOCUMENT__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toc getToc() {
		return toc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToc(Toc newToc, NotificationChain msgs) {
		Toc oldToc = toc;
		toc = newToc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RgmPackage.DOCUMENT__TOC, oldToc, newToc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToc(Toc newToc) {
		if (newToc != toc) {
			NotificationChain msgs = null;
			if (toc != null)
				msgs = ((InternalEObject)toc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RgmPackage.DOCUMENT__TOC, null, msgs);
			if (newToc != null)
				msgs = ((InternalEObject)newToc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RgmPackage.DOCUMENT__TOC, null, msgs);
			msgs = basicSetToc(newToc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.DOCUMENT__TOC, newToc, newToc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Paragraph> getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new EObjectContainmentEList<Paragraph>(Paragraph.class, this, RgmPackage.DOCUMENT__PARAGRAPHS);
		}
		return paragraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Index> getIndexes() {
		if (indexes == null) {
			indexes = new EObjectContainmentEList<Index>(Index.class, this, RgmPackage.DOCUMENT__INDEXES);
		}
		return indexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RgmPackage.DOCUMENT__TOC:
				return basicSetToc(null, msgs);
			case RgmPackage.DOCUMENT__PARAGRAPHS:
				return ((InternalEList<?>)getParagraphs()).basicRemove(otherEnd, msgs);
			case RgmPackage.DOCUMENT__INDEXES:
				return ((InternalEList<?>)getIndexes()).basicRemove(otherEnd, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RgmPackage.DOCUMENT__ID:
				return getId();
			case RgmPackage.DOCUMENT__NAME:
				return getName();
			case RgmPackage.DOCUMENT__TYPE:
				return getType();
			case RgmPackage.DOCUMENT__VERSION:
				return getVersion();
			case RgmPackage.DOCUMENT__REVISION:
				return getRevision();
			case RgmPackage.DOCUMENT__TOC:
				return getToc();
			case RgmPackage.DOCUMENT__PARAGRAPHS:
				return getParagraphs();
			case RgmPackage.DOCUMENT__INDEXES:
				return getIndexes();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RgmPackage.DOCUMENT__ID:
				setId((String)newValue);
				return;
			case RgmPackage.DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case RgmPackage.DOCUMENT__TYPE:
				setType(newValue);
				return;
			case RgmPackage.DOCUMENT__VERSION:
				setVersion((String)newValue);
				return;
			case RgmPackage.DOCUMENT__REVISION:
				setRevision((String)newValue);
				return;
			case RgmPackage.DOCUMENT__TOC:
				setToc((Toc)newValue);
				return;
			case RgmPackage.DOCUMENT__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection<? extends Paragraph>)newValue);
				return;
			case RgmPackage.DOCUMENT__INDEXES:
				getIndexes().clear();
				getIndexes().addAll((Collection<? extends Index>)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RgmPackage.DOCUMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case RgmPackage.DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RgmPackage.DOCUMENT__TYPE:
				setType((Object)null);
				return;
			case RgmPackage.DOCUMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case RgmPackage.DOCUMENT__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case RgmPackage.DOCUMENT__TOC:
				setToc((Toc)null);
				return;
			case RgmPackage.DOCUMENT__PARAGRAPHS:
				getParagraphs().clear();
				return;
			case RgmPackage.DOCUMENT__INDEXES:
				getIndexes().clear();
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RgmPackage.DOCUMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RgmPackage.DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RgmPackage.DOCUMENT__TYPE:
				return type != null;
			case RgmPackage.DOCUMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case RgmPackage.DOCUMENT__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case RgmPackage.DOCUMENT__TOC:
				return toc != null;
			case RgmPackage.DOCUMENT__PARAGRAPHS:
				return paragraphs != null && !paragraphs.isEmpty();
			case RgmPackage.DOCUMENT__INDEXES:
				return indexes != null && !indexes.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", version: "); //$NON-NLS-1$
		result.append(version);
		result.append(", revision: "); //$NON-NLS-1$
		result.append(revision);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
