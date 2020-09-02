/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.IsbnType;
import org.crossref.schema._4._4.MediaTypeType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Isbn Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.IsbnTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.IsbnTypeImpl#getMediaType <em>Media Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsbnTypeImpl extends MinimalEObjectImpl.Container implements IsbnType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final MediaTypeType MEDIA_TYPE_EDEFAULT = MediaTypeType.PRINT;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected MediaTypeType mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * This is true if the Media Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mediaTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsbnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getIsbnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ISBN_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediaTypeType getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaType(MediaTypeType newMediaType) {
		MediaTypeType oldMediaType = mediaType;
		mediaType = newMediaType == null ? MEDIA_TYPE_EDEFAULT : newMediaType;
		boolean oldMediaTypeESet = mediaTypeESet;
		mediaTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ISBN_TYPE__MEDIA_TYPE, oldMediaType, mediaType, !oldMediaTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMediaType() {
		MediaTypeType oldMediaType = mediaType;
		boolean oldMediaTypeESet = mediaTypeESet;
		mediaType = MEDIA_TYPE_EDEFAULT;
		mediaTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.ISBN_TYPE__MEDIA_TYPE, oldMediaType, MEDIA_TYPE_EDEFAULT, oldMediaTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMediaType() {
		return mediaTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.ISBN_TYPE__VALUE:
				return getValue();
			case _4Package.ISBN_TYPE__MEDIA_TYPE:
				return getMediaType();
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
			case _4Package.ISBN_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case _4Package.ISBN_TYPE__MEDIA_TYPE:
				setMediaType((MediaTypeType)newValue);
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
			case _4Package.ISBN_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case _4Package.ISBN_TYPE__MEDIA_TYPE:
				unsetMediaType();
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
			case _4Package.ISBN_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case _4Package.ISBN_TYPE__MEDIA_TYPE:
				return isSetMediaType();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", mediaType: ");
		if (mediaTypeESet) result.append(mediaType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IsbnTypeImpl
