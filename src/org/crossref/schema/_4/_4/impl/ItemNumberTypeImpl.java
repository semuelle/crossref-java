/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.ItemNumberType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ItemNumberTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ItemNumberTypeImpl#getItemNumberType <em>Item Number Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemNumberTypeImpl extends MinimalEObjectImpl.Container implements ItemNumberType {
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
	 * The default value of the '{@link #getItemNumberType() <em>Item Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemNumberType()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_NUMBER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemNumberType() <em>Item Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemNumberType()
	 * @generated
	 * @ordered
	 */
	protected String itemNumberType = ITEM_NUMBER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getItemNumberType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ITEM_NUMBER_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemNumberType() {
		return itemNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemNumberType(String newItemNumberType) {
		String oldItemNumberType = itemNumberType;
		itemNumberType = newItemNumberType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ITEM_NUMBER_TYPE__ITEM_NUMBER_TYPE, oldItemNumberType, itemNumberType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.ITEM_NUMBER_TYPE__VALUE:
				return getValue();
			case _4Package.ITEM_NUMBER_TYPE__ITEM_NUMBER_TYPE:
				return getItemNumberType();
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
			case _4Package.ITEM_NUMBER_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case _4Package.ITEM_NUMBER_TYPE__ITEM_NUMBER_TYPE:
				setItemNumberType((String)newValue);
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
			case _4Package.ITEM_NUMBER_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case _4Package.ITEM_NUMBER_TYPE__ITEM_NUMBER_TYPE:
				setItemNumberType(ITEM_NUMBER_TYPE_EDEFAULT);
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
			case _4Package.ITEM_NUMBER_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case _4Package.ITEM_NUMBER_TYPE__ITEM_NUMBER_TYPE:
				return ITEM_NUMBER_TYPE_EDEFAULT == null ? itemNumberType != null : !ITEM_NUMBER_TYPE_EDEFAULT.equals(itemNumberType);
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
		result.append(", itemNumberType: ");
		result.append(itemNumberType);
		result.append(')');
		return result.toString();
	}

} //ItemNumberTypeImpl
