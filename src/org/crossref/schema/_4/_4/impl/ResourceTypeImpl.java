/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.ContentVersionType;
import org.crossref.schema._4._4.MimeTypeType;
import org.crossref.schema._4._4.ResourceType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ResourceTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ResourceTypeImpl#getContentVersion <em>Content Version</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ResourceTypeImpl#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTypeImpl extends MinimalEObjectImpl.Container implements ResourceType {
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
	 * The default value of the '{@link #getContentVersion() <em>Content Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final ContentVersionType CONTENT_VERSION_EDEFAULT = ContentVersionType.VOR;

	/**
	 * The cached value of the '{@link #getContentVersion() <em>Content Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVersion()
	 * @generated
	 * @ordered
	 */
	protected ContentVersionType contentVersion = CONTENT_VERSION_EDEFAULT;

	/**
	 * This is true if the Content Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contentVersionESet;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final MimeTypeType MIME_TYPE_EDEFAULT = MimeTypeType.TEXT_CSS;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected MimeTypeType mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * This is true if the Mime Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mimeTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getResourceType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.RESOURCE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentVersionType getContentVersion() {
		return contentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentVersion(ContentVersionType newContentVersion) {
		ContentVersionType oldContentVersion = contentVersion;
		contentVersion = newContentVersion == null ? CONTENT_VERSION_EDEFAULT : newContentVersion;
		boolean oldContentVersionESet = contentVersionESet;
		contentVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.RESOURCE_TYPE__CONTENT_VERSION, oldContentVersion, contentVersion, !oldContentVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetContentVersion() {
		ContentVersionType oldContentVersion = contentVersion;
		boolean oldContentVersionESet = contentVersionESet;
		contentVersion = CONTENT_VERSION_EDEFAULT;
		contentVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.RESOURCE_TYPE__CONTENT_VERSION, oldContentVersion, CONTENT_VERSION_EDEFAULT, oldContentVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContentVersion() {
		return contentVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeTypeType getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeType(MimeTypeType newMimeType) {
		MimeTypeType oldMimeType = mimeType;
		mimeType = newMimeType == null ? MIME_TYPE_EDEFAULT : newMimeType;
		boolean oldMimeTypeESet = mimeTypeESet;
		mimeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.RESOURCE_TYPE__MIME_TYPE, oldMimeType, mimeType, !oldMimeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMimeType() {
		MimeTypeType oldMimeType = mimeType;
		boolean oldMimeTypeESet = mimeTypeESet;
		mimeType = MIME_TYPE_EDEFAULT;
		mimeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.RESOURCE_TYPE__MIME_TYPE, oldMimeType, MIME_TYPE_EDEFAULT, oldMimeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMimeType() {
		return mimeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.RESOURCE_TYPE__VALUE:
				return getValue();
			case _4Package.RESOURCE_TYPE__CONTENT_VERSION:
				return getContentVersion();
			case _4Package.RESOURCE_TYPE__MIME_TYPE:
				return getMimeType();
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
			case _4Package.RESOURCE_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case _4Package.RESOURCE_TYPE__CONTENT_VERSION:
				setContentVersion((ContentVersionType)newValue);
				return;
			case _4Package.RESOURCE_TYPE__MIME_TYPE:
				setMimeType((MimeTypeType)newValue);
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
			case _4Package.RESOURCE_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case _4Package.RESOURCE_TYPE__CONTENT_VERSION:
				unsetContentVersion();
				return;
			case _4Package.RESOURCE_TYPE__MIME_TYPE:
				unsetMimeType();
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
			case _4Package.RESOURCE_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case _4Package.RESOURCE_TYPE__CONTENT_VERSION:
				return isSetContentVersion();
			case _4Package.RESOURCE_TYPE__MIME_TYPE:
				return isSetMimeType();
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
		result.append(", contentVersion: ");
		if (contentVersionESet) result.append(contentVersion); else result.append("<unset>");
		result.append(", mimeType: ");
		if (mimeTypeESet) result.append(mimeType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResourceTypeImpl
