/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.InstitutionType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Institution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.InstitutionTypeImpl#getInstitutionName <em>Institution Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.InstitutionTypeImpl#getInstitutionAcronym <em>Institution Acronym</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.InstitutionTypeImpl#getInstitutionPlace <em>Institution Place</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.InstitutionTypeImpl#getInstitutionDepartment <em>Institution Department</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstitutionTypeImpl extends MinimalEObjectImpl.Container implements InstitutionType {
	/**
	 * The default value of the '{@link #getInstitutionName() <em>Institution Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitutionName() <em>Institution Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionName()
	 * @generated
	 * @ordered
	 */
	protected String institutionName = INSTITUTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstitutionAcronym() <em>Institution Acronym</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionAcronym()
	 * @generated
	 * @ordered
	 */
	protected EList<String> institutionAcronym;

	/**
	 * The cached value of the '{@link #getInstitutionPlace() <em>Institution Place</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<String> institutionPlace;

	/**
	 * The cached value of the '{@link #getInstitutionDepartment() <em>Institution Department</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionDepartment()
	 * @generated
	 * @ordered
	 */
	protected EList<String> institutionDepartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstitutionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getInstitutionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitutionName() {
		return institutionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitutionName(String newInstitutionName) {
		String oldInstitutionName = institutionName;
		institutionName = newInstitutionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.INSTITUTION_TYPE__INSTITUTION_NAME, oldInstitutionName, institutionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInstitutionAcronym() {
		if (institutionAcronym == null) {
			institutionAcronym = new EDataTypeEList<String>(String.class, this, _4Package.INSTITUTION_TYPE__INSTITUTION_ACRONYM);
		}
		return institutionAcronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInstitutionPlace() {
		if (institutionPlace == null) {
			institutionPlace = new EDataTypeEList<String>(String.class, this, _4Package.INSTITUTION_TYPE__INSTITUTION_PLACE);
		}
		return institutionPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInstitutionDepartment() {
		if (institutionDepartment == null) {
			institutionDepartment = new EDataTypeEList<String>(String.class, this, _4Package.INSTITUTION_TYPE__INSTITUTION_DEPARTMENT);
		}
		return institutionDepartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.INSTITUTION_TYPE__INSTITUTION_NAME:
				return getInstitutionName();
			case _4Package.INSTITUTION_TYPE__INSTITUTION_ACRONYM:
				return getInstitutionAcronym();
			case _4Package.INSTITUTION_TYPE__INSTITUTION_PLACE:
				return getInstitutionPlace();
			case _4Package.INSTITUTION_TYPE__INSTITUTION_DEPARTMENT:
				return getInstitutionDepartment();
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
			case _4Package.INSTITUTION_TYPE__INSTITUTION_NAME:
				setInstitutionName((String)newValue);
				return;
			case _4Package.INSTITUTION_TYPE__INSTITUTION_ACRONYM:
				getInstitutionAcronym().clear();
				getInstitutionAcronym().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.INSTITUTION_TYPE__INSTITUTION_PLACE:
				getInstitutionPlace().clear();
				getInstitutionPlace().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.INSTITUTION_TYPE__INSTITUTION_DEPARTMENT:
				getInstitutionDepartment().clear();
				getInstitutionDepartment().addAll((Collection<? extends String>)newValue);
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
			case _4Package.INSTITUTION_TYPE__INSTITUTION_NAME:
				setInstitutionName(INSTITUTION_NAME_EDEFAULT);
				return;
			case _4Package.INSTITUTION_TYPE__INSTITUTION_ACRONYM:
				getInstitutionAcronym().clear();
				return;
			case _4Package.INSTITUTION_TYPE__INSTITUTION_PLACE:
				getInstitutionPlace().clear();
				return;
			case _4Package.INSTITUTION_TYPE__INSTITUTION_DEPARTMENT:
				getInstitutionDepartment().clear();
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
			case _4Package.INSTITUTION_TYPE__INSTITUTION_NAME:
				return INSTITUTION_NAME_EDEFAULT == null ? institutionName != null : !INSTITUTION_NAME_EDEFAULT.equals(institutionName);
			case _4Package.INSTITUTION_TYPE__INSTITUTION_ACRONYM:
				return institutionAcronym != null && !institutionAcronym.isEmpty();
			case _4Package.INSTITUTION_TYPE__INSTITUTION_PLACE:
				return institutionPlace != null && !institutionPlace.isEmpty();
			case _4Package.INSTITUTION_TYPE__INSTITUTION_DEPARTMENT:
				return institutionDepartment != null && !institutionDepartment.isEmpty();
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
		result.append(" (institutionName: ");
		result.append(institutionName);
		result.append(", institutionAcronym: ");
		result.append(institutionAcronym);
		result.append(", institutionPlace: ");
		result.append(institutionPlace);
		result.append(", institutionDepartment: ");
		result.append(institutionDepartment);
		result.append(')');
		return result.toString();
	}

} //InstitutionTypeImpl
