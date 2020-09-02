/**
 */
package org.crossref.access.indicators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.crossref.access.indicators.IndicatorsPackage
 * @generated
 */
public interface IndicatorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IndicatorsFactory eINSTANCE = org.crossref.access.indicators.impl.IndicatorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Free To Read Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free To Read Type</em>'.
	 * @generated
	 */
	FreeToReadType createFreeToReadType();

	/**
	 * Returns a new object of class '<em>License Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License Ref Type</em>'.
	 * @generated
	 */
	LicenseRefType createLicenseRefType();

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
	IndicatorsPackage getIndicatorsPackage();

} //IndicatorsFactory
