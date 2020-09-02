/**
 */
package org.crossref.access.indicators;

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
 *   <li>{@link org.crossref.access.indicators.ProgramType#getFreeToRead <em>Free To Read</em>}</li>
 *   <li>{@link org.crossref.access.indicators.ProgramType#getLicenseRef <em>License Ref</em>}</li>
 *   <li>{@link org.crossref.access.indicators.ProgramType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.crossref.access.indicators.IndicatorsPackage#getProgramType()
 * @model extendedMetaData="name='program_._type' kind='elementOnly'"
 * @generated
 */
public interface ProgramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Free To Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free To Read</em>' containment reference.
	 * @see #setFreeToRead(FreeToReadType)
	 * @see org.crossref.access.indicators.IndicatorsPackage#getProgramType_FreeToRead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='free_to_read' namespace='##targetNamespace'"
	 * @generated
	 */
	FreeToReadType getFreeToRead();

	/**
	 * Sets the value of the '{@link org.crossref.access.indicators.ProgramType#getFreeToRead <em>Free To Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free To Read</em>' containment reference.
	 * @see #getFreeToRead()
	 * @generated
	 */
	void setFreeToRead(FreeToReadType value);

	/**
	 * Returns the value of the '<em><b>License Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.access.indicators.LicenseRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Ref</em>' containment reference list.
	 * @see org.crossref.access.indicators.IndicatorsPackage#getProgramType_LicenseRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='license_ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LicenseRefType> getLicenseRef();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"AccessIndicators"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.crossref.access.indicators.IndicatorsPackage#getProgramType_Name()
	 * @model default="AccessIndicators" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.crossref.access.indicators.ProgramType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.crossref.access.indicators.ProgramType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.crossref.access.indicators.ProgramType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // ProgramType
