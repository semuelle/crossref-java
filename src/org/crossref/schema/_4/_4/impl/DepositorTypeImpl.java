/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.DepositorType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depositor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.DepositorTypeImpl#getDepositorName <em>Depositor Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DepositorTypeImpl#getEmailAddress <em>Email Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepositorTypeImpl extends MinimalEObjectImpl.Container implements DepositorType {
	/**
	 * The default value of the '{@link #getDepositorName() <em>Depositor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositorName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPOSITOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepositorName() <em>Depositor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositorName()
	 * @generated
	 * @ordered
	 */
	protected String depositorName = DEPOSITOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected String emailAddress = EMAIL_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepositorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getDepositorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDepositorName() {
		return depositorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepositorName(String newDepositorName) {
		String oldDepositorName = depositorName;
		depositorName = newDepositorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DEPOSITOR_TYPE__DEPOSITOR_NAME, oldDepositorName, depositorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailAddress(String newEmailAddress) {
		String oldEmailAddress = emailAddress;
		emailAddress = newEmailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DEPOSITOR_TYPE__EMAIL_ADDRESS, oldEmailAddress, emailAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.DEPOSITOR_TYPE__DEPOSITOR_NAME:
				return getDepositorName();
			case _4Package.DEPOSITOR_TYPE__EMAIL_ADDRESS:
				return getEmailAddress();
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
			case _4Package.DEPOSITOR_TYPE__DEPOSITOR_NAME:
				setDepositorName((String)newValue);
				return;
			case _4Package.DEPOSITOR_TYPE__EMAIL_ADDRESS:
				setEmailAddress((String)newValue);
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
			case _4Package.DEPOSITOR_TYPE__DEPOSITOR_NAME:
				setDepositorName(DEPOSITOR_NAME_EDEFAULT);
				return;
			case _4Package.DEPOSITOR_TYPE__EMAIL_ADDRESS:
				setEmailAddress(EMAIL_ADDRESS_EDEFAULT);
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
			case _4Package.DEPOSITOR_TYPE__DEPOSITOR_NAME:
				return DEPOSITOR_NAME_EDEFAULT == null ? depositorName != null : !DEPOSITOR_NAME_EDEFAULT.equals(depositorName);
			case _4Package.DEPOSITOR_TYPE__EMAIL_ADDRESS:
				return EMAIL_ADDRESS_EDEFAULT == null ? emailAddress != null : !EMAIL_ADDRESS_EDEFAULT.equals(emailAddress);
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
		result.append(" (depositorName: ");
		result.append(depositorName);
		result.append(", emailAddress: ");
		result.append(emailAddress);
		result.append(')');
		return result.toString();
	}

} //DepositorTypeImpl
