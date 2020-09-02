/**
 */
package org.niso.schemas.ali._1._0;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free To Read Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.niso.schemas.ali._1._0.FreeToReadType#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.niso.schemas.ali._1._0.FreeToReadType#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @see org.niso.schemas.ali._1._0._0Package#getFreeToReadType()
 * @model extendedMetaData="name='free_to_read_._type' kind='empty'"
 * @generated
 */
public interface FreeToReadType extends EObject {
	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(XMLGregorianCalendar)
	 * @see org.niso.schemas.ali._1._0._0Package#getFreeToReadType_EndDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='end_date'"
	 * @generated
	 */
	XMLGregorianCalendar getEndDate();

	/**
	 * Sets the value of the '{@link org.niso.schemas.ali._1._0.FreeToReadType#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(XMLGregorianCalendar)
	 * @see org.niso.schemas.ali._1._0._0Package#getFreeToReadType_StartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='attribute' name='start_date'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link org.niso.schemas.ali._1._0.FreeToReadType#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(XMLGregorianCalendar value);

} // FreeToReadType
