/**
 */
package org.crossref.schema._4._4.impl;

import java.math.BigInteger;

import org.crossref.schema._4._4.DateT;
import org.crossref.schema._4._4.MediaTypeType1;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.DateTImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DateTImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DateTImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DateTImpl#getMediaType <em>Media Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateTImpl extends MinimalEObjectImpl.Container implements DateT {
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
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final MediaTypeType1 MEDIA_TYPE_EDEFAULT = MediaTypeType1.PRINT;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected MediaTypeType1 mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * This is true if the Media Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mediaTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getDateT();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DATE_T__MONTH, oldMonth, month));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DATE_T__DAY, oldDay, day));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DATE_T__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediaTypeType1 getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaType(MediaTypeType1 newMediaType) {
		MediaTypeType1 oldMediaType = mediaType;
		mediaType = newMediaType == null ? MEDIA_TYPE_EDEFAULT : newMediaType;
		boolean oldMediaTypeESet = mediaTypeESet;
		mediaTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DATE_T__MEDIA_TYPE, oldMediaType, mediaType, !oldMediaTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMediaType() {
		MediaTypeType1 oldMediaType = mediaType;
		boolean oldMediaTypeESet = mediaTypeESet;
		mediaType = MEDIA_TYPE_EDEFAULT;
		mediaTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.DATE_T__MEDIA_TYPE, oldMediaType, MEDIA_TYPE_EDEFAULT, oldMediaTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMediaType() {
		return mediaTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.DATE_T__MONTH:
				return getMonth();
			case _4Package.DATE_T__DAY:
				return getDay();
			case _4Package.DATE_T__YEAR:
				return getYear();
			case _4Package.DATE_T__MEDIA_TYPE:
				return getMediaType();
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
			case _4Package.DATE_T__MONTH:
				setMonth((BigInteger)newValue);
				return;
			case _4Package.DATE_T__DAY:
				setDay((BigInteger)newValue);
				return;
			case _4Package.DATE_T__YEAR:
				setYear((BigInteger)newValue);
				return;
			case _4Package.DATE_T__MEDIA_TYPE:
				setMediaType((MediaTypeType1)newValue);
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
			case _4Package.DATE_T__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case _4Package.DATE_T__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case _4Package.DATE_T__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case _4Package.DATE_T__MEDIA_TYPE:
				unsetMediaType();
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
			case _4Package.DATE_T__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case _4Package.DATE_T__DAY:
				return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
			case _4Package.DATE_T__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case _4Package.DATE_T__MEDIA_TYPE:
				return isSetMediaType();
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
		result.append(", mediaType: ");
		if (mediaTypeESet) result.append(mediaType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DateTImpl
