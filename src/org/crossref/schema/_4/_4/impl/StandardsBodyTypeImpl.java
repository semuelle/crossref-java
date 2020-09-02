/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.StandardsBodyType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standards Body Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.StandardsBodyTypeImpl#getStandardsBodyName <em>Standards Body Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StandardsBodyTypeImpl#getStandardsBodyAcronym <em>Standards Body Acronym</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardsBodyTypeImpl extends MinimalEObjectImpl.Container implements StandardsBodyType {
	/**
	 * The cached value of the '{@link #getStandardsBodyName() <em>Standards Body Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardsBodyName()
	 * @generated
	 * @ordered
	 */
	protected EObject standardsBodyName;

	/**
	 * The cached value of the '{@link #getStandardsBodyAcronym() <em>Standards Body Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardsBodyAcronym()
	 * @generated
	 * @ordered
	 */
	protected EObject standardsBodyAcronym;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardsBodyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getStandardsBodyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getStandardsBodyName() {
		return standardsBodyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardsBodyName(EObject newStandardsBodyName, NotificationChain msgs) {
		EObject oldStandardsBodyName = standardsBodyName;
		standardsBodyName = newStandardsBodyName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_NAME, oldStandardsBodyName, newStandardsBodyName);
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
	public void setStandardsBodyName(EObject newStandardsBodyName) {
		if (newStandardsBodyName != standardsBodyName) {
			NotificationChain msgs = null;
			if (standardsBodyName != null)
				msgs = ((InternalEObject)standardsBodyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_NAME, null, msgs);
			if (newStandardsBodyName != null)
				msgs = ((InternalEObject)newStandardsBodyName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_NAME, null, msgs);
			msgs = basicSetStandardsBodyName(newStandardsBodyName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_NAME, newStandardsBodyName, newStandardsBodyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getStandardsBodyAcronym() {
		return standardsBodyAcronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardsBodyAcronym(EObject newStandardsBodyAcronym, NotificationChain msgs) {
		EObject oldStandardsBodyAcronym = standardsBodyAcronym;
		standardsBodyAcronym = newStandardsBodyAcronym;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_ACRONYM, oldStandardsBodyAcronym, newStandardsBodyAcronym);
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
	public void setStandardsBodyAcronym(EObject newStandardsBodyAcronym) {
		if (newStandardsBodyAcronym != standardsBodyAcronym) {
			NotificationChain msgs = null;
			if (standardsBodyAcronym != null)
				msgs = ((InternalEObject)standardsBodyAcronym).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_ACRONYM, null, msgs);
			if (newStandardsBodyAcronym != null)
				msgs = ((InternalEObject)newStandardsBodyAcronym).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_ACRONYM, null, msgs);
			msgs = basicSetStandardsBodyAcronym(newStandardsBodyAcronym, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_ACRONYM, newStandardsBodyAcronym, newStandardsBodyAcronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_NAME:
				return basicSetStandardsBodyName(null, msgs);
			case _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_ACRONYM:
				return basicSetStandardsBodyAcronym(null, msgs);
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
			case _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_NAME:
				return getStandardsBodyName();
			case _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_ACRONYM:
				return getStandardsBodyAcronym();
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
			case _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_NAME:
				setStandardsBodyName((EObject)newValue);
				return;
			case _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_ACRONYM:
				setStandardsBodyAcronym((EObject)newValue);
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
			case _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_NAME:
				setStandardsBodyName((EObject)null);
				return;
			case _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_ACRONYM:
				setStandardsBodyAcronym((EObject)null);
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
			case _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_NAME:
				return standardsBodyName != null;
			case _4Package.STANDARDS_BODY_TYPE__STANDARDS_BODY_ACRONYM:
				return standardsBodyAcronym != null;
		}
		return super.eIsSet(featureID);
	}

} //StandardsBodyTypeImpl
