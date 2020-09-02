/**
 */
package org.crossref.schema._4._4.impl;

import java.math.BigInteger;

import org.crossref.schema._4._4.ConferenceDateType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference Date Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceDateTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceDateTypeImpl#getEndDay <em>End Day</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceDateTypeImpl#getEndMonth <em>End Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceDateTypeImpl#getEndYear <em>End Year</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceDateTypeImpl#getStartDay <em>Start Day</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceDateTypeImpl#getStartMonth <em>Start Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceDateTypeImpl#getStartYear <em>Start Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConferenceDateTypeImpl extends MinimalEObjectImpl.Container implements ConferenceDateType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDay() <em>End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDay() <em>End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDay()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endDay = END_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndMonth() <em>End Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndMonth() <em>End Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endMonth = END_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndYear() <em>End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndYear()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndYear() <em>End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndYear()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endYear = END_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDay() <em>Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDay() <em>Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDay()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startDay = START_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartMonth() <em>Start Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartMonth() <em>Start Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startMonth = START_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startYear = START_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceDateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getConferenceDateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_DATE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getEndDay() {
		return endDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDay(BigInteger newEndDay) {
		BigInteger oldEndDay = endDay;
		endDay = newEndDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_DATE_TYPE__END_DAY, oldEndDay, endDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getEndMonth() {
		return endMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndMonth(BigInteger newEndMonth) {
		BigInteger oldEndMonth = endMonth;
		endMonth = newEndMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_DATE_TYPE__END_MONTH, oldEndMonth, endMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getEndYear() {
		return endYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndYear(BigInteger newEndYear) {
		BigInteger oldEndYear = endYear;
		endYear = newEndYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_DATE_TYPE__END_YEAR, oldEndYear, endYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStartDay() {
		return startDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDay(BigInteger newStartDay) {
		BigInteger oldStartDay = startDay;
		startDay = newStartDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_DATE_TYPE__START_DAY, oldStartDay, startDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStartMonth() {
		return startMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartMonth(BigInteger newStartMonth) {
		BigInteger oldStartMonth = startMonth;
		startMonth = newStartMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_DATE_TYPE__START_MONTH, oldStartMonth, startMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStartYear() {
		return startYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartYear(BigInteger newStartYear) {
		BigInteger oldStartYear = startYear;
		startYear = newStartYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_DATE_TYPE__START_YEAR, oldStartYear, startYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.CONFERENCE_DATE_TYPE__VALUE:
				return getValue();
			case _4Package.CONFERENCE_DATE_TYPE__END_DAY:
				return getEndDay();
			case _4Package.CONFERENCE_DATE_TYPE__END_MONTH:
				return getEndMonth();
			case _4Package.CONFERENCE_DATE_TYPE__END_YEAR:
				return getEndYear();
			case _4Package.CONFERENCE_DATE_TYPE__START_DAY:
				return getStartDay();
			case _4Package.CONFERENCE_DATE_TYPE__START_MONTH:
				return getStartMonth();
			case _4Package.CONFERENCE_DATE_TYPE__START_YEAR:
				return getStartYear();
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
			case _4Package.CONFERENCE_DATE_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__END_DAY:
				setEndDay((BigInteger)newValue);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__END_MONTH:
				setEndMonth((BigInteger)newValue);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__END_YEAR:
				setEndYear((BigInteger)newValue);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__START_DAY:
				setStartDay((BigInteger)newValue);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__START_MONTH:
				setStartMonth((BigInteger)newValue);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__START_YEAR:
				setStartYear((BigInteger)newValue);
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
			case _4Package.CONFERENCE_DATE_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__END_DAY:
				setEndDay(END_DAY_EDEFAULT);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__END_MONTH:
				setEndMonth(END_MONTH_EDEFAULT);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__END_YEAR:
				setEndYear(END_YEAR_EDEFAULT);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__START_DAY:
				setStartDay(START_DAY_EDEFAULT);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__START_MONTH:
				setStartMonth(START_MONTH_EDEFAULT);
				return;
			case _4Package.CONFERENCE_DATE_TYPE__START_YEAR:
				setStartYear(START_YEAR_EDEFAULT);
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
			case _4Package.CONFERENCE_DATE_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case _4Package.CONFERENCE_DATE_TYPE__END_DAY:
				return END_DAY_EDEFAULT == null ? endDay != null : !END_DAY_EDEFAULT.equals(endDay);
			case _4Package.CONFERENCE_DATE_TYPE__END_MONTH:
				return END_MONTH_EDEFAULT == null ? endMonth != null : !END_MONTH_EDEFAULT.equals(endMonth);
			case _4Package.CONFERENCE_DATE_TYPE__END_YEAR:
				return END_YEAR_EDEFAULT == null ? endYear != null : !END_YEAR_EDEFAULT.equals(endYear);
			case _4Package.CONFERENCE_DATE_TYPE__START_DAY:
				return START_DAY_EDEFAULT == null ? startDay != null : !START_DAY_EDEFAULT.equals(startDay);
			case _4Package.CONFERENCE_DATE_TYPE__START_MONTH:
				return START_MONTH_EDEFAULT == null ? startMonth != null : !START_MONTH_EDEFAULT.equals(startMonth);
			case _4Package.CONFERENCE_DATE_TYPE__START_YEAR:
				return START_YEAR_EDEFAULT == null ? startYear != null : !START_YEAR_EDEFAULT.equals(startYear);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", endDay: ");
		result.append(endDay);
		result.append(", endMonth: ");
		result.append(endMonth);
		result.append(", endYear: ");
		result.append(endYear);
		result.append(", startDay: ");
		result.append(startDay);
		result.append(", startMonth: ");
		result.append(startMonth);
		result.append(", startYear: ");
		result.append(startYear);
		result.append(')');
		return result.toString();
	}

} //ConferenceDateTypeImpl
