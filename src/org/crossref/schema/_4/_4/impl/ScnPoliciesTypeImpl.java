/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.ScnPoliciesType;
import org.crossref.schema._4._4.ScnPolicySetType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scn Policies Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ScnPoliciesTypeImpl#getScnPolicySet <em>Scn Policy Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScnPoliciesTypeImpl extends MinimalEObjectImpl.Container implements ScnPoliciesType {
	/**
	 * The cached value of the '{@link #getScnPolicySet() <em>Scn Policy Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScnPolicySet()
	 * @generated
	 * @ordered
	 */
	protected EList<ScnPolicySetType> scnPolicySet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScnPoliciesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getScnPoliciesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScnPolicySetType> getScnPolicySet() {
		if (scnPolicySet == null) {
			scnPolicySet = new EObjectContainmentEList<ScnPolicySetType>(ScnPolicySetType.class, this, _4Package.SCN_POLICIES_TYPE__SCN_POLICY_SET);
		}
		return scnPolicySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.SCN_POLICIES_TYPE__SCN_POLICY_SET:
				return ((InternalEList<?>)getScnPolicySet()).basicRemove(otherEnd, msgs);
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
			case _4Package.SCN_POLICIES_TYPE__SCN_POLICY_SET:
				return getScnPolicySet();
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
			case _4Package.SCN_POLICIES_TYPE__SCN_POLICY_SET:
				getScnPolicySet().clear();
				getScnPolicySet().addAll((Collection<? extends ScnPolicySetType>)newValue);
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
			case _4Package.SCN_POLICIES_TYPE__SCN_POLICY_SET:
				getScnPolicySet().clear();
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
			case _4Package.SCN_POLICIES_TYPE__SCN_POLICY_SET:
				return scnPolicySet != null && !scnPolicySet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScnPoliciesTypeImpl
