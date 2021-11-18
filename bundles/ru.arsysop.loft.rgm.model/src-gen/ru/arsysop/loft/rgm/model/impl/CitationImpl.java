/**
 */
package ru.arsysop.loft.rgm.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.arsysop.loft.rgm.model.api.Citation;
import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.api.Requirement;

import ru.arsysop.loft.rgm.model.meta.RgmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.CitationImpl#getID <em>ID</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.CitationImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.CitationImpl#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.CitationImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.CitationImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.model.impl.CitationImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationImpl extends MinimalEObjectImpl.Container implements Citation {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChapter() <em>Chapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChapter()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAPTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChapter() <em>Chapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChapter()
	 * @generated
	 * @ordered
	 */
	protected String chapter = CHAPTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getParagraph() <em>Paragraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAGRAPH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected String paragraph = PARAGRAPH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCitation() <em>Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected static final String CITATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected String citation = CITATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Document document;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RgmPackage.eINSTANCE.getCitation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.CITATION__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChapter() {
		return chapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChapter(String newChapter) {
		String oldChapter = chapter;
		chapter = newChapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.CITATION__CHAPTER, oldChapter, chapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParagraph() {
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParagraph(String newParagraph) {
		String oldParagraph = paragraph;
		paragraph = newParagraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.CITATION__PARAGRAPH, oldParagraph, paragraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCitation() {
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitation(String newCitation) {
		String oldCitation = citation;
		citation = newCitation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.CITATION__CITATION, oldCitation, citation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document getDocument() {
		if (document != null && document.eIsProxy()) {
			InternalEObject oldDocument = (InternalEObject)document;
			document = (Document)eResolveProxy(oldDocument);
			if (document != oldDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RgmPackage.CITATION__DOCUMENT, oldDocument, document));
			}
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Document newDocument, NotificationChain msgs) {
		Document oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RgmPackage.CITATION__DOCUMENT, oldDocument, newDocument);
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
	public void setDocument(Document newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, RgmPackage.DOCUMENT__CITATIONS, Document.class, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, RgmPackage.DOCUMENT__CITATIONS, Document.class, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RgmPackage.CITATION__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectWithInverseResolvingEList<Requirement>(Requirement.class, this, RgmPackage.CITATION__REQUIREMENTS, RgmPackage.REQUIREMENT__CITATION);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RgmPackage.CITATION__DOCUMENT:
				if (document != null)
					msgs = ((InternalEObject)document).eInverseRemove(this, RgmPackage.DOCUMENT__CITATIONS, Document.class, msgs);
				return basicSetDocument((Document)otherEnd, msgs);
			case RgmPackage.CITATION__REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequirements()).basicAdd(otherEnd, msgs);
			default:
				return super.eInverseAdd(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RgmPackage.CITATION__DOCUMENT:
				return basicSetDocument(null, msgs);
			case RgmPackage.CITATION__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
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
			case RgmPackage.CITATION__ID:
				return getID();
			case RgmPackage.CITATION__CHAPTER:
				return getChapter();
			case RgmPackage.CITATION__PARAGRAPH:
				return getParagraph();
			case RgmPackage.CITATION__CITATION:
				return getCitation();
			case RgmPackage.CITATION__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case RgmPackage.CITATION__REQUIREMENTS:
				return getRequirements();
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
			case RgmPackage.CITATION__ID:
				setID((String)newValue);
				return;
			case RgmPackage.CITATION__CHAPTER:
				setChapter((String)newValue);
				return;
			case RgmPackage.CITATION__PARAGRAPH:
				setParagraph((String)newValue);
				return;
			case RgmPackage.CITATION__CITATION:
				setCitation((String)newValue);
				return;
			case RgmPackage.CITATION__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case RgmPackage.CITATION__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
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
			case RgmPackage.CITATION__ID:
				setID(ID_EDEFAULT);
				return;
			case RgmPackage.CITATION__CHAPTER:
				setChapter(CHAPTER_EDEFAULT);
				return;
			case RgmPackage.CITATION__PARAGRAPH:
				setParagraph(PARAGRAPH_EDEFAULT);
				return;
			case RgmPackage.CITATION__CITATION:
				setCitation(CITATION_EDEFAULT);
				return;
			case RgmPackage.CITATION__DOCUMENT:
				setDocument((Document)null);
				return;
			case RgmPackage.CITATION__REQUIREMENTS:
				getRequirements().clear();
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
			case RgmPackage.CITATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RgmPackage.CITATION__CHAPTER:
				return CHAPTER_EDEFAULT == null ? chapter != null : !CHAPTER_EDEFAULT.equals(chapter);
			case RgmPackage.CITATION__PARAGRAPH:
				return PARAGRAPH_EDEFAULT == null ? paragraph != null : !PARAGRAPH_EDEFAULT.equals(paragraph);
			case RgmPackage.CITATION__CITATION:
				return CITATION_EDEFAULT == null ? citation != null : !CITATION_EDEFAULT.equals(citation);
			case RgmPackage.CITATION__DOCUMENT:
				return document != null;
			case RgmPackage.CITATION__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
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
		result.append(" (ID: "); //$NON-NLS-1$
		result.append(id);
		result.append(", Chapter: "); //$NON-NLS-1$
		result.append(chapter);
		result.append(", Paragraph: "); //$NON-NLS-1$
		result.append(paragraph);
		result.append(", Citation: "); //$NON-NLS-1$
		result.append(citation);
		result.append(')');
		return result.toString();
	}

} //CitationImpl
