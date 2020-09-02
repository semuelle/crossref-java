/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.StdAsPublishedType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Std As Published Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.StdAsPublishedTypeImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StdAsPublishedTypeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StdAsPublishedTypeImpl#getUndated <em>Undated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StdAsPublishedTypeImpl extends StdDesignatorTImpl implements StdAsPublishedType {
	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected String set = SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getUndated() <em>Undated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndated()
	 * @generated
	 * @ordered
	 */
	protected static final String UNDATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUndated() <em>Undated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndated()
	 * @generated
	 * @ordered
	 */
	protected String undated = UNDATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StdAsPublishedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getStdAsPublishedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFamily(String newFamily) {
		String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STD_AS_PUBLISHED_TYPE__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSet(String newSet) {
		String oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STD_AS_PUBLISHED_TYPE__SET, oldSet, set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUndated() {
		return undated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUndated(String newUndated) {
		String oldUndated = undated;
		undated = newUndated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STD_AS_PUBLISHED_TYPE__UNDATED, oldUndated, undated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.STD_AS_PUBLISHED_TYPE__FAMILY:
				return getFamily();
			case _4Package.STD_AS_PUBLISHED_TYPE__SET:
				return getSet();
			case _4Package.STD_AS_PUBLISHED_TYPE__UNDATED:
				return getUndated();
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
			case _4Package.STD_AS_PUBLISHED_TYPE__FAMILY:
				setFamily((String)newValue);
				return;
			case _4Package.STD_AS_PUBLISHED_TYPE__SET:
				setSet((String)newValue);
				return;
			case _4Package.STD_AS_PUBLISHED_TYPE__UNDATED:
				setUndated((String)newValue);
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
			case _4Package.STD_AS_PUBLISHED_TYPE__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case _4Package.STD_AS_PUBLISHED_TYPE__SET:
				setSet(SET_EDEFAULT);
				return;
			case _4Package.STD_AS_PUBLISHED_TYPE__UNDATED:
				setUndated(UNDATED_EDEFAULT);
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
			case _4Package.STD_AS_PUBLISHED_TYPE__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case _4Package.STD_AS_PUBLISHED_TYPE__SET:
				return SET_EDEFAULT == null ? set != null : !SET_EDEFAULT.equals(set);
			case _4Package.STD_AS_PUBLISHED_TYPE__UNDATED:
				return UNDATED_EDEFAULT == null ? undated != null : !UNDATED_EDEFAULT.equals(undated);
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
		result.append(" (family: ");
		result.append(family);
		result.append(", set: ");
		result.append(set);
		result.append(", undated: ");
		result.append(undated);
		result.append(')');
		return result.toString();
	}

} //StdAsPublishedTypeImpl
