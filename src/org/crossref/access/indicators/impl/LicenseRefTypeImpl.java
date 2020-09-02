/**
 */
package org.crossref.access.indicators.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.crossref.access.indicators.AppliesToType;
import org.crossref.access.indicators.IndicatorsPackage;
import org.crossref.access.indicators.LicenseRefType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>License Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.access.indicators.impl.LicenseRefTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.access.indicators.impl.LicenseRefTypeImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.crossref.access.indicators.impl.LicenseRefTypeImpl#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicenseRefTypeImpl extends MinimalEObjectImpl.Container implements LicenseRefType {
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
	 * The default value of the '{@link #getAppliesTo() <em>Applies To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected static final AppliesToType APPLIES_TO_EDEFAULT = AppliesToType.VOR;

	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected AppliesToType appliesTo = APPLIES_TO_EDEFAULT;

	/**
	 * This is true if the Applies To attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appliesToESet;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startDate = START_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IndicatorsPackage.Literals.LICENSE_REF_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.LICENSE_REF_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppliesToType getAppliesTo() {
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppliesTo(AppliesToType newAppliesTo) {
		AppliesToType oldAppliesTo = appliesTo;
		appliesTo = newAppliesTo == null ? APPLIES_TO_EDEFAULT : newAppliesTo;
		boolean oldAppliesToESet = appliesToESet;
		appliesToESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.LICENSE_REF_TYPE__APPLIES_TO, oldAppliesTo, appliesTo, !oldAppliesToESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAppliesTo() {
		AppliesToType oldAppliesTo = appliesTo;
		boolean oldAppliesToESet = appliesToESet;
		appliesTo = APPLIES_TO_EDEFAULT;
		appliesToESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IndicatorsPackage.LICENSE_REF_TYPE__APPLIES_TO, oldAppliesTo, APPLIES_TO_EDEFAULT, oldAppliesToESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAppliesTo() {
		return appliesToESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(XMLGregorianCalendar newStartDate) {
		XMLGregorianCalendar oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.LICENSE_REF_TYPE__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IndicatorsPackage.LICENSE_REF_TYPE__VALUE:
				return getValue();
			case IndicatorsPackage.LICENSE_REF_TYPE__APPLIES_TO:
				return getAppliesTo();
			case IndicatorsPackage.LICENSE_REF_TYPE__START_DATE:
				return getStartDate();
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
			case IndicatorsPackage.LICENSE_REF_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case IndicatorsPackage.LICENSE_REF_TYPE__APPLIES_TO:
				setAppliesTo((AppliesToType)newValue);
				return;
			case IndicatorsPackage.LICENSE_REF_TYPE__START_DATE:
				setStartDate((XMLGregorianCalendar)newValue);
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
			case IndicatorsPackage.LICENSE_REF_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case IndicatorsPackage.LICENSE_REF_TYPE__APPLIES_TO:
				unsetAppliesTo();
				return;
			case IndicatorsPackage.LICENSE_REF_TYPE__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
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
			case IndicatorsPackage.LICENSE_REF_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case IndicatorsPackage.LICENSE_REF_TYPE__APPLIES_TO:
				return isSetAppliesTo();
			case IndicatorsPackage.LICENSE_REF_TYPE__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
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
		result.append(", appliesTo: ");
		if (appliesToESet) result.append(appliesTo); else result.append("<unset>");
		result.append(", startDate: ");
		result.append(startDate);
		result.append(')');
		return result.toString();
	}

} //LicenseRefTypeImpl
