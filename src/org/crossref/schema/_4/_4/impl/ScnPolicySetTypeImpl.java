/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.crossref.schema._4._4.ScnPolicyRefType;
import org.crossref.schema._4._4.ScnPolicySetType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scn Policy Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ScnPolicySetTypeImpl#getScnPolicyRef <em>Scn Policy Ref</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ScnPolicySetTypeImpl#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScnPolicySetTypeImpl extends MinimalEObjectImpl.Container implements ScnPolicySetType {
	/**
	 * The cached value of the '{@link #getScnPolicyRef() <em>Scn Policy Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScnPolicyRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ScnPolicyRefType> scnPolicyRef;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startDate = START_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScnPolicySetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getScnPolicySetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScnPolicyRefType> getScnPolicyRef() {
		if (scnPolicyRef == null) {
			scnPolicyRef = new EObjectContainmentEList<ScnPolicyRefType>(ScnPolicyRefType.class, this, _4Package.SCN_POLICY_SET_TYPE__SCN_POLICY_REF);
		}
		return scnPolicyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(XMLGregorianCalendar newStartDate) {
		XMLGregorianCalendar oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SCN_POLICY_SET_TYPE__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.SCN_POLICY_SET_TYPE__SCN_POLICY_REF:
				return ((InternalEList<?>)getScnPolicyRef()).basicRemove(otherEnd, msgs);
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
			case _4Package.SCN_POLICY_SET_TYPE__SCN_POLICY_REF:
				return getScnPolicyRef();
			case _4Package.SCN_POLICY_SET_TYPE__START_DATE:
				return getStartDate();
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
			case _4Package.SCN_POLICY_SET_TYPE__SCN_POLICY_REF:
				getScnPolicyRef().clear();
				getScnPolicyRef().addAll((Collection<? extends ScnPolicyRefType>)newValue);
				return;
			case _4Package.SCN_POLICY_SET_TYPE__START_DATE:
				setStartDate((XMLGregorianCalendar)newValue);
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
			case _4Package.SCN_POLICY_SET_TYPE__SCN_POLICY_REF:
				getScnPolicyRef().clear();
				return;
			case _4Package.SCN_POLICY_SET_TYPE__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
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
			case _4Package.SCN_POLICY_SET_TYPE__SCN_POLICY_REF:
				return scnPolicyRef != null && !scnPolicyRef.isEmpty();
			case _4Package.SCN_POLICY_SET_TYPE__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(')');
		return result.toString();
	}

} //ScnPolicySetTypeImpl
