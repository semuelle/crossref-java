/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.IsbnType;
import org.crossref.schema._4._4.IssnType;
import org.crossref.schema._4._4.PublicationType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.PublicationTypeImpl#getFullTitle <em>Full Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PublicationTypeImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PublicationTypeImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PublicationTypeImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PublicationTypeImpl#getIssn1 <em>Issn1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PublicationTypeImpl#getIsbn1 <em>Isbn1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicationTypeImpl extends MinimalEObjectImpl.Container implements PublicationType {
	/**
	 * The cached value of the '{@link #getFullTitle() <em>Full Title</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fullTitle;

	/**
	 * The cached value of the '{@link #getIssn() <em>Issn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssn()
	 * @generated
	 * @ordered
	 */
	protected IssnType issn;

	/**
	 * The cached value of the '{@link #getIsbn() <em>Isbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected IsbnType isbn;

	/**
	 * The default value of the '{@link #getDoi() <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoi()
	 * @generated
	 * @ordered
	 */
	protected static final String DOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoi() <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoi()
	 * @generated
	 * @ordered
	 */
	protected String doi = DOI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssn1() <em>Issn1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssn1()
	 * @generated
	 * @ordered
	 */
	protected IssnType issn1;

	/**
	 * The cached value of the '{@link #getIsbn1() <em>Isbn1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn1()
	 * @generated
	 * @ordered
	 */
	protected IsbnType isbn1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getPublicationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFullTitle() {
		if (fullTitle == null) {
			fullTitle = new EDataTypeEList<String>(String.class, this, _4Package.PUBLICATION_TYPE__FULL_TITLE);
		}
		return fullTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssnType getIssn() {
		return issn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssn(IssnType newIssn, NotificationChain msgs) {
		IssnType oldIssn = issn;
		issn = newIssn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PUBLICATION_TYPE__ISSN, oldIssn, newIssn);
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
	public void setIssn(IssnType newIssn) {
		if (newIssn != issn) {
			NotificationChain msgs = null;
			if (issn != null)
				msgs = ((InternalEObject)issn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PUBLICATION_TYPE__ISSN, null, msgs);
			if (newIssn != null)
				msgs = ((InternalEObject)newIssn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PUBLICATION_TYPE__ISSN, null, msgs);
			msgs = basicSetIssn(newIssn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PUBLICATION_TYPE__ISSN, newIssn, newIssn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsbnType getIsbn() {
		return isbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsbn(IsbnType newIsbn, NotificationChain msgs) {
		IsbnType oldIsbn = isbn;
		isbn = newIsbn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PUBLICATION_TYPE__ISBN, oldIsbn, newIsbn);
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
	public void setIsbn(IsbnType newIsbn) {
		if (newIsbn != isbn) {
			NotificationChain msgs = null;
			if (isbn != null)
				msgs = ((InternalEObject)isbn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PUBLICATION_TYPE__ISBN, null, msgs);
			if (newIsbn != null)
				msgs = ((InternalEObject)newIsbn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PUBLICATION_TYPE__ISBN, null, msgs);
			msgs = basicSetIsbn(newIsbn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PUBLICATION_TYPE__ISBN, newIsbn, newIsbn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoi() {
		return doi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoi(String newDoi) {
		String oldDoi = doi;
		doi = newDoi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PUBLICATION_TYPE__DOI, oldDoi, doi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssnType getIssn1() {
		return issn1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssn1(IssnType newIssn1, NotificationChain msgs) {
		IssnType oldIssn1 = issn1;
		issn1 = newIssn1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PUBLICATION_TYPE__ISSN1, oldIssn1, newIssn1);
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
	public void setIssn1(IssnType newIssn1) {
		if (newIssn1 != issn1) {
			NotificationChain msgs = null;
			if (issn1 != null)
				msgs = ((InternalEObject)issn1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PUBLICATION_TYPE__ISSN1, null, msgs);
			if (newIssn1 != null)
				msgs = ((InternalEObject)newIssn1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PUBLICATION_TYPE__ISSN1, null, msgs);
			msgs = basicSetIssn1(newIssn1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PUBLICATION_TYPE__ISSN1, newIssn1, newIssn1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsbnType getIsbn1() {
		return isbn1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsbn1(IsbnType newIsbn1, NotificationChain msgs) {
		IsbnType oldIsbn1 = isbn1;
		isbn1 = newIsbn1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PUBLICATION_TYPE__ISBN1, oldIsbn1, newIsbn1);
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
	public void setIsbn1(IsbnType newIsbn1) {
		if (newIsbn1 != isbn1) {
			NotificationChain msgs = null;
			if (isbn1 != null)
				msgs = ((InternalEObject)isbn1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PUBLICATION_TYPE__ISBN1, null, msgs);
			if (newIsbn1 != null)
				msgs = ((InternalEObject)newIsbn1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PUBLICATION_TYPE__ISBN1, null, msgs);
			msgs = basicSetIsbn1(newIsbn1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PUBLICATION_TYPE__ISBN1, newIsbn1, newIsbn1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.PUBLICATION_TYPE__ISSN:
				return basicSetIssn(null, msgs);
			case _4Package.PUBLICATION_TYPE__ISBN:
				return basicSetIsbn(null, msgs);
			case _4Package.PUBLICATION_TYPE__ISSN1:
				return basicSetIssn1(null, msgs);
			case _4Package.PUBLICATION_TYPE__ISBN1:
				return basicSetIsbn1(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.PUBLICATION_TYPE__FULL_TITLE:
				return getFullTitle();
			case _4Package.PUBLICATION_TYPE__ISSN:
				return getIssn();
			case _4Package.PUBLICATION_TYPE__ISBN:
				return getIsbn();
			case _4Package.PUBLICATION_TYPE__DOI:
				return getDoi();
			case _4Package.PUBLICATION_TYPE__ISSN1:
				return getIssn1();
			case _4Package.PUBLICATION_TYPE__ISBN1:
				return getIsbn1();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case _4Package.PUBLICATION_TYPE__FULL_TITLE:
				getFullTitle().clear();
				getFullTitle().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.PUBLICATION_TYPE__ISSN:
				setIssn((IssnType)newValue);
				return;
			case _4Package.PUBLICATION_TYPE__ISBN:
				setIsbn((IsbnType)newValue);
				return;
			case _4Package.PUBLICATION_TYPE__DOI:
				setDoi((String)newValue);
				return;
			case _4Package.PUBLICATION_TYPE__ISSN1:
				setIssn1((IssnType)newValue);
				return;
			case _4Package.PUBLICATION_TYPE__ISBN1:
				setIsbn1((IsbnType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _4Package.PUBLICATION_TYPE__FULL_TITLE:
				getFullTitle().clear();
				return;
			case _4Package.PUBLICATION_TYPE__ISSN:
				setIssn((IssnType)null);
				return;
			case _4Package.PUBLICATION_TYPE__ISBN:
				setIsbn((IsbnType)null);
				return;
			case _4Package.PUBLICATION_TYPE__DOI:
				setDoi(DOI_EDEFAULT);
				return;
			case _4Package.PUBLICATION_TYPE__ISSN1:
				setIssn1((IssnType)null);
				return;
			case _4Package.PUBLICATION_TYPE__ISBN1:
				setIsbn1((IsbnType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _4Package.PUBLICATION_TYPE__FULL_TITLE:
				return fullTitle != null && !fullTitle.isEmpty();
			case _4Package.PUBLICATION_TYPE__ISSN:
				return issn != null;
			case _4Package.PUBLICATION_TYPE__ISBN:
				return isbn != null;
			case _4Package.PUBLICATION_TYPE__DOI:
				return DOI_EDEFAULT == null ? doi != null : !DOI_EDEFAULT.equals(doi);
			case _4Package.PUBLICATION_TYPE__ISSN1:
				return issn1 != null;
			case _4Package.PUBLICATION_TYPE__ISBN1:
				return isbn1 != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (fullTitle: ");
		result.append(fullTitle);
		result.append(", doi: ");
		result.append(doi);
		result.append(')');
		return result.toString();
	}

} //PublicationTypeImpl
