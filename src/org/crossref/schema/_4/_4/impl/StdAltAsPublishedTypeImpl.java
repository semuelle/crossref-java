/**
 */
package org.crossref.schema._4._4.impl;

import java.math.BigInteger;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.crossref.schema._4._4.ReasonTypeItem;
import org.crossref.schema._4._4.StdAltAsPublishedType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Std Alt As Published Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.StdAltAsPublishedTypeImpl#getApprovedMonth <em>Approved Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StdAltAsPublishedTypeImpl#getApprovedYear <em>Approved Year</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StdAltAsPublishedTypeImpl#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StdAltAsPublishedTypeImpl extends StdDesignatorTImpl implements StdAltAsPublishedType {
	/**
	 * The default value of the '{@link #getApprovedMonth() <em>Approved Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger APPROVED_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovedMonth() <em>Approved Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger approvedMonth = APPROVED_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovedYear() <em>Approved Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedYear()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar APPROVED_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovedYear() <em>Approved Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedYear()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar approvedYear = APPROVED_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final List<ReasonTypeItem> REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected List<ReasonTypeItem> reason = REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StdAltAsPublishedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getStdAltAsPublishedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getApprovedMonth() {
		return approvedMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovedMonth(BigInteger newApprovedMonth) {
		BigInteger oldApprovedMonth = approvedMonth;
		approvedMonth = newApprovedMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STD_ALT_AS_PUBLISHED_TYPE__APPROVED_MONTH, oldApprovedMonth, approvedMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getApprovedYear() {
		return approvedYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovedYear(XMLGregorianCalendar newApprovedYear) {
		XMLGregorianCalendar oldApprovedYear = approvedYear;
		approvedYear = newApprovedYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STD_ALT_AS_PUBLISHED_TYPE__APPROVED_YEAR, oldApprovedYear, approvedYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<ReasonTypeItem> getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReason(List<ReasonTypeItem> newReason) {
		List<ReasonTypeItem> oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STD_ALT_AS_PUBLISHED_TYPE__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__APPROVED_MONTH:
				return getApprovedMonth();
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__APPROVED_YEAR:
				return getApprovedYear();
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__REASON:
				return getReason();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__APPROVED_MONTH:
				setApprovedMonth((BigInteger)newValue);
				return;
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__APPROVED_YEAR:
				setApprovedYear((XMLGregorianCalendar)newValue);
				return;
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__REASON:
				setReason((List<ReasonTypeItem>)newValue);
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
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__APPROVED_MONTH:
				setApprovedMonth(APPROVED_MONTH_EDEFAULT);
				return;
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__APPROVED_YEAR:
				setApprovedYear(APPROVED_YEAR_EDEFAULT);
				return;
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__REASON:
				setReason(REASON_EDEFAULT);
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
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__APPROVED_MONTH:
				return APPROVED_MONTH_EDEFAULT == null ? approvedMonth != null : !APPROVED_MONTH_EDEFAULT.equals(approvedMonth);
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__APPROVED_YEAR:
				return APPROVED_YEAR_EDEFAULT == null ? approvedYear != null : !APPROVED_YEAR_EDEFAULT.equals(approvedYear);
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
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
		result.append(" (approvedMonth: ");
		result.append(approvedMonth);
		result.append(", approvedYear: ");
		result.append(approvedYear);
		result.append(", reason: ");
		result.append(reason);
		result.append(')');
		return result.toString();
	}

} //StdAltAsPublishedTypeImpl
