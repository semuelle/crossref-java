/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.ORCIDType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORCID Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ORCIDTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ORCIDTypeImpl#isAuthenticated <em>Authenticated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORCIDTypeImpl extends MinimalEObjectImpl.Container implements ORCIDType {
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
	 * The default value of the '{@link #isAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHENTICATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected boolean authenticated = AUTHENTICATED_EDEFAULT;

	/**
	 * This is true if the Authenticated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authenticatedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORCIDTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getORCIDType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ORCID_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuthenticated() {
		return authenticated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticated(boolean newAuthenticated) {
		boolean oldAuthenticated = authenticated;
		authenticated = newAuthenticated;
		boolean oldAuthenticatedESet = authenticatedESet;
		authenticatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ORCID_TYPE__AUTHENTICATED, oldAuthenticated, authenticated, !oldAuthenticatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAuthenticated() {
		boolean oldAuthenticated = authenticated;
		boolean oldAuthenticatedESet = authenticatedESet;
		authenticated = AUTHENTICATED_EDEFAULT;
		authenticatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.ORCID_TYPE__AUTHENTICATED, oldAuthenticated, AUTHENTICATED_EDEFAULT, oldAuthenticatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAuthenticated() {
		return authenticatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.ORCID_TYPE__VALUE:
				return getValue();
			case _4Package.ORCID_TYPE__AUTHENTICATED:
				return isAuthenticated();
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
			case _4Package.ORCID_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case _4Package.ORCID_TYPE__AUTHENTICATED:
				setAuthenticated((Boolean)newValue);
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
			case _4Package.ORCID_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case _4Package.ORCID_TYPE__AUTHENTICATED:
				unsetAuthenticated();
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
			case _4Package.ORCID_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case _4Package.ORCID_TYPE__AUTHENTICATED:
				return isSetAuthenticated();
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
		result.append(", authenticated: ");
		if (authenticatedESet) result.append(authenticated); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ORCIDTypeImpl
