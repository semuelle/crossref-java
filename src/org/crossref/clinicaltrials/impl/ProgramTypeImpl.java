/**
 */
package org.crossref.clinicaltrials.impl;

import java.util.Collection;

import org.crossref.clinicaltrials.ClinicalTrialNumberType;
import org.crossref.clinicaltrials.ClinicaltrialsPackage;
import org.crossref.clinicaltrials.ProgramType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.clinicaltrials.impl.ProgramTypeImpl#getClinicalTrialNumber <em>Clinical Trial Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramTypeImpl extends MinimalEObjectImpl.Container implements ProgramType {
	/**
	 * The cached value of the '{@link #getClinicalTrialNumber() <em>Clinical Trial Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalTrialNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalTrialNumberType> clinicalTrialNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClinicaltrialsPackage.Literals.PROGRAM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClinicalTrialNumberType> getClinicalTrialNumber() {
		if (clinicalTrialNumber == null) {
			clinicalTrialNumber = new EObjectContainmentEList<ClinicalTrialNumberType>(ClinicalTrialNumberType.class, this, ClinicaltrialsPackage.PROGRAM_TYPE__CLINICAL_TRIAL_NUMBER);
		}
		return clinicalTrialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClinicaltrialsPackage.PROGRAM_TYPE__CLINICAL_TRIAL_NUMBER:
				return ((InternalEList<?>)getClinicalTrialNumber()).basicRemove(otherEnd, msgs);
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
			case ClinicaltrialsPackage.PROGRAM_TYPE__CLINICAL_TRIAL_NUMBER:
				return getClinicalTrialNumber();
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
			case ClinicaltrialsPackage.PROGRAM_TYPE__CLINICAL_TRIAL_NUMBER:
				getClinicalTrialNumber().clear();
				getClinicalTrialNumber().addAll((Collection<? extends ClinicalTrialNumberType>)newValue);
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
			case ClinicaltrialsPackage.PROGRAM_TYPE__CLINICAL_TRIAL_NUMBER:
				getClinicalTrialNumber().clear();
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
			case ClinicaltrialsPackage.PROGRAM_TYPE__CLINICAL_TRIAL_NUMBER:
				return clinicalTrialNumber != null && !clinicalTrialNumber.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramTypeImpl
