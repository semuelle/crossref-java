/**
 */
package org.niso.schemas.ali._1._0;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.niso.schemas.ali._1._0._0Package
 * @generated
 */
public interface _0Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_0Factory eINSTANCE = org.niso.schemas.ali._1._0.impl._0FactoryImpl.init();

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
	_0Package get_0Package();

} //_0Factory
