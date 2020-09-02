/**
 */
package org.crossref.clinicaltrials;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.clinicaltrials.ProgramType#getClinicalTrialNumber <em>Clinical Trial Number</em>}</li>
 * </ul>
 *
 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getProgramType()
 * @model extendedMetaData="name='program_._type' kind='elementOnly'"
 * @generated
 */
public interface ProgramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Clinical Trial Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.clinicaltrials.ClinicalTrialNumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Trial Number</em>' containment reference list.
	 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getProgramType_ClinicalTrialNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clinical-trial-number' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClinicalTrialNumberType> getClinicalTrialNumber();

} // ProgramType
