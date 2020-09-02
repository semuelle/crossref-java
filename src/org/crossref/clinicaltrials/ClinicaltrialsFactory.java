/**
 */
package org.crossref.clinicaltrials;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage
 * @generated
 */
public interface ClinicaltrialsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClinicaltrialsFactory eINSTANCE = org.crossref.clinicaltrials.impl.ClinicaltrialsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Clinical Trial Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Trial Number Type</em>'.
	 * @generated
	 */
	ClinicalTrialNumberType createClinicalTrialNumberType();

	/**
	 * Returns a new object of class '<em>Program Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Type</em>'.
	 * @generated
	 */
	ProgramType createProgramType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClinicaltrialsPackage getClinicaltrialsPackage();

} //ClinicaltrialsFactory
