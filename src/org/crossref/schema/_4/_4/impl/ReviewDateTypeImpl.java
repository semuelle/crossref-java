/**
 */
package org.crossref.schema._4._4.impl;

import java.math.BigInteger;

import org.crossref.schema._4._4.ReviewDateType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Review Date Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ReviewDateTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ReviewDateTypeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ReviewDateTypeImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReviewDateTypeImpl extends MinimalEObjectImpl.Container implements ReviewDateType {
	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected BigInteger day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected BigInteger year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewDateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getReviewDateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonth(BigInteger newMonth) {
		BigInteger oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.REVIEW_DATE_TYPE__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(BigInteger newDay) {
		BigInteger oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.REVIEW_DATE_TYPE__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(BigInteger newYear) {
		BigInteger oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.REVIEW_DATE_TYPE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.REVIEW_DATE_TYPE__MONTH:
				return getMonth();
			case _4Package.REVIEW_DATE_TYPE__DAY:
				return getDay();
			case _4Package.REVIEW_DATE_TYPE__YEAR:
				return getYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _4Package.REVIEW_DATE_TYPE__MONTH:
				setMonth((BigInteger)newValue);
				return;
			case _4Package.REVIEW_DATE_TYPE__DAY:
				setDay((BigInteger)newValue);
				return;
			case _4Package.REVIEW_DATE_TYPE__YEAR:
				setYear((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _4Package.REVIEW_DATE_TYPE__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case _4Package.REVIEW_DATE_TYPE__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case _4Package.REVIEW_DATE_TYPE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _4Package.REVIEW_DATE_TYPE__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case _4Package.REVIEW_DATE_TYPE__DAY:
				return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
			case _4Package.REVIEW_DATE_TYPE__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (month: ");
		result.append(month);
		result.append(", day: ");
		result.append(day);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //ReviewDateTypeImpl
