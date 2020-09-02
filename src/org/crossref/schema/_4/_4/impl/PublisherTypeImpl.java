/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.PublisherType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.PublisherTypeImpl#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PublisherTypeImpl#getPublisherPlace <em>Publisher Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublisherTypeImpl extends MinimalEObjectImpl.Container implements PublisherType {
	/**
	 * The default value of the '{@link #getPublisherName() <em>Publisher Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherName()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherName() <em>Publisher Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherName()
	 * @generated
	 * @ordered
	 */
	protected String publisherName = PUBLISHER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherPlace() <em>Publisher Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherPlace() <em>Publisher Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherPlace()
	 * @generated
	 * @ordered
	 */
	protected String publisherPlace = PUBLISHER_PLACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getPublisherType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublisherName() {
		return publisherName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisherName(String newPublisherName) {
		String oldPublisherName = publisherName;
		publisherName = newPublisherName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PUBLISHER_TYPE__PUBLISHER_NAME, oldPublisherName, publisherName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublisherPlace() {
		return publisherPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisherPlace(String newPublisherPlace) {
		String oldPublisherPlace = publisherPlace;
		publisherPlace = newPublisherPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PUBLISHER_TYPE__PUBLISHER_PLACE, oldPublisherPlace, publisherPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.PUBLISHER_TYPE__PUBLISHER_NAME:
				return getPublisherName();
			case _4Package.PUBLISHER_TYPE__PUBLISHER_PLACE:
				return getPublisherPlace();
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
			case _4Package.PUBLISHER_TYPE__PUBLISHER_NAME:
				setPublisherName((String)newValue);
				return;
			case _4Package.PUBLISHER_TYPE__PUBLISHER_PLACE:
				setPublisherPlace((String)newValue);
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
			case _4Package.PUBLISHER_TYPE__PUBLISHER_NAME:
				setPublisherName(PUBLISHER_NAME_EDEFAULT);
				return;
			case _4Package.PUBLISHER_TYPE__PUBLISHER_PLACE:
				setPublisherPlace(PUBLISHER_PLACE_EDEFAULT);
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
			case _4Package.PUBLISHER_TYPE__PUBLISHER_NAME:
				return PUBLISHER_NAME_EDEFAULT == null ? publisherName != null : !PUBLISHER_NAME_EDEFAULT.equals(publisherName);
			case _4Package.PUBLISHER_TYPE__PUBLISHER_PLACE:
				return PUBLISHER_PLACE_EDEFAULT == null ? publisherPlace != null : !PUBLISHER_PLACE_EDEFAULT.equals(publisherPlace);
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
		result.append(" (publisherName: ");
		result.append(publisherName);
		result.append(", publisherPlace: ");
		result.append(publisherPlace);
		result.append(')');
		return result.toString();
	}

} //PublisherTypeImpl
