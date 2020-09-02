/**
 */
package org.crossref.schema._4._4;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ConferenceDateType#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ConferenceDateType#getEndDay <em>End Day</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ConferenceDateType#getEndMonth <em>End Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ConferenceDateType#getEndYear <em>End Year</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ConferenceDateType#getStartDay <em>Start Day</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ConferenceDateType#getStartMonth <em>Start Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ConferenceDateType#getStartYear <em>Start Year</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getConferenceDateType()
 * @model extendedMetaData="name='conference_date_._type' kind='simple'"
 * @generated
 */
public interface ConferenceDateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.crossref.schema._4._4._4Package#getConferenceDateType_Value()
	 * @model dataType="org.crossref.schema._4._4.ConferenceDateT"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceDateType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>End Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Day</em>' attribute.
	 * @see #setEndDay(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getConferenceDateType_EndDay()
	 * @model dataType="org.crossref.schema._4._4.XrefDay"
	 *        extendedMetaData="kind='attribute' name='end_day'"
	 * @generated
	 */
	BigInteger getEndDay();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceDateType#getEndDay <em>End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Day</em>' attribute.
	 * @see #getEndDay()
	 * @generated
	 */
	void setEndDay(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Month</em>' attribute.
	 * @see #setEndMonth(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getConferenceDateType_EndMonth()
	 * @model dataType="org.crossref.schema._4._4.XrefMonth"
	 *        extendedMetaData="kind='attribute' name='end_month'"
	 * @generated
	 */
	BigInteger getEndMonth();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceDateType#getEndMonth <em>End Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Month</em>' attribute.
	 * @see #getEndMonth()
	 * @generated
	 */
	void setEndMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Year</em>' attribute.
	 * @see #setEndYear(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getConferenceDateType_EndYear()
	 * @model dataType="org.crossref.schema._4._4.XrefYear"
	 *        extendedMetaData="kind='attribute' name='end_year'"
	 * @generated
	 */
	BigInteger getEndYear();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceDateType#getEndYear <em>End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Year</em>' attribute.
	 * @see #getEndYear()
	 * @generated
	 */
	void setEndYear(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Day</em>' attribute.
	 * @see #setStartDay(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getConferenceDateType_StartDay()
	 * @model dataType="org.crossref.schema._4._4.XrefDay"
	 *        extendedMetaData="kind='attribute' name='start_day'"
	 * @generated
	 */
	BigInteger getStartDay();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceDateType#getStartDay <em>Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Day</em>' attribute.
	 * @see #getStartDay()
	 * @generated
	 */
	void setStartDay(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Month</em>' attribute.
	 * @see #setStartMonth(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getConferenceDateType_StartMonth()
	 * @model dataType="org.crossref.schema._4._4.XrefMonth"
	 *        extendedMetaData="kind='attribute' name='start_month'"
	 * @generated
	 */
	BigInteger getStartMonth();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceDateType#getStartMonth <em>Start Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Month</em>' attribute.
	 * @see #getStartMonth()
	 * @generated
	 */
	void setStartMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Year</em>' attribute.
	 * @see #setStartYear(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getConferenceDateType_StartYear()
	 * @model dataType="org.crossref.schema._4._4.XrefYear"
	 *        extendedMetaData="kind='attribute' name='start_year'"
	 * @generated
	 */
	BigInteger getStartYear();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceDateType#getStartYear <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Year</em>' attribute.
	 * @see #getStartYear()
	 * @generated
	 */
	void setStartYear(BigInteger value);

} // ConferenceDateType
