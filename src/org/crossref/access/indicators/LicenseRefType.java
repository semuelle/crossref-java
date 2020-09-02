/**
 */
package org.crossref.access.indicators;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.access.indicators.LicenseRefType#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.access.indicators.LicenseRefType#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.crossref.access.indicators.LicenseRefType#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @see org.crossref.access.indicators.IndicatorsPackage#getLicenseRefType()
 * @model extendedMetaData="name='license_ref_._type' kind='simple'"
 * @generated
 */
public interface LicenseRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.crossref.access.indicators.IndicatorsPackage#getLicenseRefType_Value()
	 * @model dataType="org.crossref.access.indicators.LicenseRefT"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.crossref.access.indicators.LicenseRefType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.access.indicators.AppliesToType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' attribute.
	 * @see org.crossref.access.indicators.AppliesToType
	 * @see #isSetAppliesTo()
	 * @see #unsetAppliesTo()
	 * @see #setAppliesTo(AppliesToType)
	 * @see org.crossref.access.indicators.IndicatorsPackage#getLicenseRefType_AppliesTo()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='applies_to'"
	 * @generated
	 */
	AppliesToType getAppliesTo();

	/**
	 * Sets the value of the '{@link org.crossref.access.indicators.LicenseRefType#getAppliesTo <em>Applies To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To</em>' attribute.
	 * @see org.crossref.access.indicators.AppliesToType
	 * @see #isSetAppliesTo()
	 * @see #unsetAppliesTo()
	 * @see #getAppliesTo()
	 * @generated
	 */
	void setAppliesTo(AppliesToType value);

	/**
	 * Unsets the value of the '{@link org.crossref.access.indicators.LicenseRefType#getAppliesTo <em>Applies To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppliesTo()
	 * @see #getAppliesTo()
	 * @see #setAppliesTo(AppliesToType)
	 * @generated
	 */
	void unsetAppliesTo();

	/**
	 * Returns whether the value of the '{@link org.crossref.access.indicators.LicenseRefType#getAppliesTo <em>Applies To</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applies To</em>' attribute is set.
	 * @see #unsetAppliesTo()
	 * @see #getAppliesTo()
	 * @see #setAppliesTo(AppliesToType)
	 * @generated
	 */
	boolean isSetAppliesTo();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(XMLGregorianCalendar)
	 * @see org.crossref.access.indicators.IndicatorsPackage#getLicenseRefType_StartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='start_date'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link org.crossref.access.indicators.LicenseRefType#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(XMLGregorianCalendar value);

} // LicenseRefType
