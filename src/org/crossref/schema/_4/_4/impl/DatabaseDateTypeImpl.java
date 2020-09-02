/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.CreationDateType;
import org.crossref.schema._4._4.DatabaseDateType;
import org.crossref.schema._4._4.PublicationDateType;
import org.crossref.schema._4._4.UpdateDateType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Date Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.DatabaseDateTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DatabaseDateTypeImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DatabaseDateTypeImpl#getUpdateDate <em>Update Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseDateTypeImpl extends MinimalEObjectImpl.Container implements DatabaseDateType {
	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected CreationDateType creationDate;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected PublicationDateType publicationDate;

	/**
	 * The cached value of the '{@link #getUpdateDate() <em>Update Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected UpdateDateType updateDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseDateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getDatabaseDateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreationDateType getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationDate(CreationDateType newCreationDate, NotificationChain msgs) {
		CreationDateType oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.DATABASE_DATE_TYPE__CREATION_DATE, oldCreationDate, newCreationDate);
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
	public void setCreationDate(CreationDateType newCreationDate) {
		if (newCreationDate != creationDate) {
			NotificationChain msgs = null;
			if (creationDate != null)
				msgs = ((InternalEObject)creationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.DATABASE_DATE_TYPE__CREATION_DATE, null, msgs);
			if (newCreationDate != null)
				msgs = ((InternalEObject)newCreationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.DATABASE_DATE_TYPE__CREATION_DATE, null, msgs);
			msgs = basicSetCreationDate(newCreationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DATABASE_DATE_TYPE__CREATION_DATE, newCreationDate, newCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationDateType getPublicationDate() {
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicationDate(PublicationDateType newPublicationDate, NotificationChain msgs) {
		PublicationDateType oldPublicationDate = publicationDate;
		publicationDate = newPublicationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.DATABASE_DATE_TYPE__PUBLICATION_DATE, oldPublicationDate, newPublicationDate);
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
	public void setPublicationDate(PublicationDateType newPublicationDate) {
		if (newPublicationDate != publicationDate) {
			NotificationChain msgs = null;
			if (publicationDate != null)
				msgs = ((InternalEObject)publicationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.DATABASE_DATE_TYPE__PUBLICATION_DATE, null, msgs);
			if (newPublicationDate != null)
				msgs = ((InternalEObject)newPublicationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.DATABASE_DATE_TYPE__PUBLICATION_DATE, null, msgs);
			msgs = basicSetPublicationDate(newPublicationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DATABASE_DATE_TYPE__PUBLICATION_DATE, newPublicationDate, newPublicationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateDateType getUpdateDate() {
		return updateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateDate(UpdateDateType newUpdateDate, NotificationChain msgs) {
		UpdateDateType oldUpdateDate = updateDate;
		updateDate = newUpdateDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.DATABASE_DATE_TYPE__UPDATE_DATE, oldUpdateDate, newUpdateDate);
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
	public void setUpdateDate(UpdateDateType newUpdateDate) {
		if (newUpdateDate != updateDate) {
			NotificationChain msgs = null;
			if (updateDate != null)
				msgs = ((InternalEObject)updateDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.DATABASE_DATE_TYPE__UPDATE_DATE, null, msgs);
			if (newUpdateDate != null)
				msgs = ((InternalEObject)newUpdateDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.DATABASE_DATE_TYPE__UPDATE_DATE, null, msgs);
			msgs = basicSetUpdateDate(newUpdateDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DATABASE_DATE_TYPE__UPDATE_DATE, newUpdateDate, newUpdateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.DATABASE_DATE_TYPE__CREATION_DATE:
				return basicSetCreationDate(null, msgs);
			case _4Package.DATABASE_DATE_TYPE__PUBLICATION_DATE:
				return basicSetPublicationDate(null, msgs);
			case _4Package.DATABASE_DATE_TYPE__UPDATE_DATE:
				return basicSetUpdateDate(null, msgs);
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
			case _4Package.DATABASE_DATE_TYPE__CREATION_DATE:
				return getCreationDate();
			case _4Package.DATABASE_DATE_TYPE__PUBLICATION_DATE:
				return getPublicationDate();
			case _4Package.DATABASE_DATE_TYPE__UPDATE_DATE:
				return getUpdateDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _4Package.DATABASE_DATE_TYPE__CREATION_DATE:
				setCreationDate((CreationDateType)newValue);
				return;
			case _4Package.DATABASE_DATE_TYPE__PUBLICATION_DATE:
				setPublicationDate((PublicationDateType)newValue);
				return;
			case _4Package.DATABASE_DATE_TYPE__UPDATE_DATE:
				setUpdateDate((UpdateDateType)newValue);
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
			case _4Package.DATABASE_DATE_TYPE__CREATION_DATE:
				setCreationDate((CreationDateType)null);
				return;
			case _4Package.DATABASE_DATE_TYPE__PUBLICATION_DATE:
				setPublicationDate((PublicationDateType)null);
				return;
			case _4Package.DATABASE_DATE_TYPE__UPDATE_DATE:
				setUpdateDate((UpdateDateType)null);
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
			case _4Package.DATABASE_DATE_TYPE__CREATION_DATE:
				return creationDate != null;
			case _4Package.DATABASE_DATE_TYPE__PUBLICATION_DATE:
				return publicationDate != null;
			case _4Package.DATABASE_DATE_TYPE__UPDATE_DATE:
				return updateDate != null;
		}
		return super.eIsSet(featureID);
	}

} //DatabaseDateTypeImpl
