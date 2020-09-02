/**
 */
package org.crossref.schema._4._4;

import java.math.BigInteger;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Std Alt As Published Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.StdAltAsPublishedType#getApprovedMonth <em>Approved Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StdAltAsPublishedType#getApprovedYear <em>Approved Year</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StdAltAsPublishedType#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getStdAltAsPublishedType()
 * @model extendedMetaData="name='std_alt_as_published_._type' kind='elementOnly'"
 * @generated
 */
public interface StdAltAsPublishedType extends StdDesignatorT {
	/**
	 * Returns the value of the '<em><b>Approved Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Month</em>' attribute.
	 * @see #setApprovedMonth(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getStdAltAsPublishedType_ApprovedMonth()
	 * @model dataType="org.crossref.schema._4._4.ApprovedMonthType"
	 *        extendedMetaData="kind='attribute' name='approvedMonth'"
	 * @generated
	 */
	BigInteger getApprovedMonth();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StdAltAsPublishedType#getApprovedMonth <em>Approved Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved Month</em>' attribute.
	 * @see #getApprovedMonth()
	 * @generated
	 */
	void setApprovedMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Approved Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Year</em>' attribute.
	 * @see #setApprovedYear(XMLGregorianCalendar)
	 * @see org.crossref.schema._4._4._4Package#getStdAltAsPublishedType_ApprovedYear()
	 * @model dataType="org.crossref.schema._4._4.ApprovedYearType" required="true"
	 *        extendedMetaData="kind='attribute' name='approvedYear'"
	 * @generated
	 */
	XMLGregorianCalendar getApprovedYear();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StdAltAsPublishedType#getApprovedYear <em>Approved Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved Year</em>' attribute.
	 * @see #getApprovedYear()
	 * @generated
	 */
	void setApprovedYear(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(List)
	 * @see org.crossref.schema._4._4._4Package#getStdAltAsPublishedType_Reason()
	 * @model dataType="org.crossref.schema._4._4.ReasonType" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='reason'"
	 * @generated
	 */
	List<ReasonTypeItem> getReason();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StdAltAsPublishedType#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(List<ReasonTypeItem> value);

} // StdAltAsPublishedType
