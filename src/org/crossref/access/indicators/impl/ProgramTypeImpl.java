/**
 */
package org.crossref.access.indicators.impl;

import java.util.Collection;

import org.crossref.access.indicators.FreeToReadType;
import org.crossref.access.indicators.IndicatorsPackage;
import org.crossref.access.indicators.LicenseRefType;
import org.crossref.access.indicators.ProgramType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.access.indicators.impl.ProgramTypeImpl#getFreeToRead <em>Free To Read</em>}</li>
 *   <li>{@link org.crossref.access.indicators.impl.ProgramTypeImpl#getLicenseRef <em>License Ref</em>}</li>
 *   <li>{@link org.crossref.access.indicators.impl.ProgramTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramTypeImpl extends MinimalEObjectImpl.Container implements ProgramType {
	/**
	 * The cached value of the '{@link #getFreeToRead() <em>Free To Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeToRead()
	 * @generated
	 * @ordered
	 */
	protected FreeToReadType freeToRead;

	/**
	 * The cached value of the '{@link #getLicenseRef() <em>License Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseRef()
	 * @generated
	 * @ordered
	 */
	protected EList<LicenseRefType> licenseRef;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "AccessIndicators";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IndicatorsPackage.Literals.PROGRAM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreeToReadType getFreeToRead() {
		return freeToRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreeToRead(FreeToReadType newFreeToRead, NotificationChain msgs) {
		FreeToReadType oldFreeToRead = freeToRead;
		freeToRead = newFreeToRead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.PROGRAM_TYPE__FREE_TO_READ, oldFreeToRead, newFreeToRead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreeToRead(FreeToReadType newFreeToRead) {
		if (newFreeToRead != freeToRead) {
			NotificationChain msgs = null;
			if (freeToRead != null)
				msgs = ((InternalEObject)freeToRead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.PROGRAM_TYPE__FREE_TO_READ, null, msgs);
			if (newFreeToRead != null)
				msgs = ((InternalEObject)newFreeToRead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.PROGRAM_TYPE__FREE_TO_READ, null, msgs);
			msgs = basicSetFreeToRead(newFreeToRead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.PROGRAM_TYPE__FREE_TO_READ, newFreeToRead, newFreeToRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LicenseRefType> getLicenseRef() {
		if (licenseRef == null) {
			licenseRef = new EObjectContainmentEList<LicenseRefType>(LicenseRefType.class, this, IndicatorsPackage.PROGRAM_TYPE__LICENSE_REF);
		}
		return licenseRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.PROGRAM_TYPE__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IndicatorsPackage.PROGRAM_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IndicatorsPackage.PROGRAM_TYPE__FREE_TO_READ:
				return basicSetFreeToRead(null, msgs);
			case IndicatorsPackage.PROGRAM_TYPE__LICENSE_REF:
				return ((InternalEList<?>)getLicenseRef()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IndicatorsPackage.PROGRAM_TYPE__FREE_TO_READ:
				return getFreeToRead();
			case IndicatorsPackage.PROGRAM_TYPE__LICENSE_REF:
				return getLicenseRef();
			case IndicatorsPackage.PROGRAM_TYPE__NAME:
				return getName();
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
			case IndicatorsPackage.PROGRAM_TYPE__FREE_TO_READ:
				setFreeToRead((FreeToReadType)newValue);
				return;
			case IndicatorsPackage.PROGRAM_TYPE__LICENSE_REF:
				getLicenseRef().clear();
				getLicenseRef().addAll((Collection<? extends LicenseRefType>)newValue);
				return;
			case IndicatorsPackage.PROGRAM_TYPE__NAME:
				setName((String)newValue);
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
			case IndicatorsPackage.PROGRAM_TYPE__FREE_TO_READ:
				setFreeToRead((FreeToReadType)null);
				return;
			case IndicatorsPackage.PROGRAM_TYPE__LICENSE_REF:
				getLicenseRef().clear();
				return;
			case IndicatorsPackage.PROGRAM_TYPE__NAME:
				unsetName();
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
			case IndicatorsPackage.PROGRAM_TYPE__FREE_TO_READ:
				return freeToRead != null;
			case IndicatorsPackage.PROGRAM_TYPE__LICENSE_REF:
				return licenseRef != null && !licenseRef.isEmpty();
			case IndicatorsPackage.PROGRAM_TYPE__NAME:
				return isSetName();
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProgramTypeImpl
