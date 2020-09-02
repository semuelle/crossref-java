/**
 */
package org.niso.schemas.ali._1._0;

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
 *   <li>{@link org.niso.schemas.ali._1._0.LicenseRefType#getValue <em>Value</em>}</li>
 *   <li>{@link org.niso.schemas.ali._1._0.LicenseRefType#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @see org.niso.schemas.ali._1._0._0Package#getLicenseRefType()
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
	 * @see org.niso.schemas.ali._1._0._0Package#getLicenseRefType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.niso.schemas.ali._1._0.LicenseRefType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(XMLGregorianCalendar)
	 * @see org.niso.schemas.ali._1._0._0Package#getLicenseRefType_StartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='start_date'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link org.niso.schemas.ali._1._0.LicenseRefType#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(XMLGregorianCalendar value);

} // LicenseRefType
