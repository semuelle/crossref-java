/**
 */
package org.crossref.schema._4._4;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Review Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ReviewDateType#getMonth <em>Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ReviewDateType#getDay <em>Day</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ReviewDateType#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getReviewDateType()
 * @model extendedMetaData="name='review_date_._type' kind='elementOnly'"
 * @generated
 */
public interface ReviewDateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Month of publication. The month must be expressed in numeric format
	 * 				rather spelling out the name (e.g.. submit "10", not "October"). The month must be
	 * 				expressed with a leading zero if it is less than 10 (e.g. submit "05", not "5").
	 * 				When a journal issue has both an issue number and a season, the issue number should
	 * 				be placed in issue. If the month of publication is not known, the season should be
	 * 				placed in month as a two-digit value as follows: Season Value Spring 21 Summer 22
	 * 				Autumn 23 Winter 24 First Quarter 31 Second Quarter 32 Third Quarter 33 Fourth
	 * 				Quarter 34 In cases when an issue covers multiple months, e.g. "March-April",
	 * 				include only the digits for the first month of the range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getReviewDateType_Month()
	 * @model dataType="org.crossref.schema._4._4.XrefMonth" required="true"
	 *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMonth();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ReviewDateType#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Day of publication. The should must be expressed with a leading zero
	 * 				if it is less than 10 (e.g. submit "05", not "5").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getReviewDateType_Day()
	 * @model dataType="org.crossref.schema._4._4.XrefDay" required="true"
	 *        extendedMetaData="kind='element' name='day' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDay();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ReviewDateType#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Year of publication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getReviewDateType_Year()
	 * @model dataType="org.crossref.schema._4._4.XrefYear" required="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getYear();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ReviewDateType#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(BigInteger value);

} // ReviewDateType
