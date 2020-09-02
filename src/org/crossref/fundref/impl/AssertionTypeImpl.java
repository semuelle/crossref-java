/**
 */
package org.crossref.fundref.impl;

import java.util.Collection;

import org.crossref.fundref.AssertionType;
import org.crossref.fundref.FundrefPackage;
import org.crossref.fundref.NameType;
import org.crossref.fundref.ProviderType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.fundref.impl.AssertionTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.fundref.impl.AssertionTypeImpl#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.crossref.fundref.impl.AssertionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.crossref.fundref.impl.AssertionTypeImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertionTypeImpl extends MinimalEObjectImpl.Container implements AssertionType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final NameType NAME_EDEFAULT = NameType.FUNDGROUP;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderType PROVIDER_EDEFAULT = ProviderType.PUBLISHER;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected ProviderType provider = PROVIDER_EDEFAULT;

	/**
	 * This is true if the Provider attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean providerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FundrefPackage.Literals.ASSERTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, FundrefPackage.ASSERTION_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssertionType> getAssertion() {
		return getMixed().list(FundrefPackage.Literals.ASSERTION_TYPE__ASSERTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(NameType newName) {
		NameType oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FundrefPackage.ASSERTION_TYPE__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetName() {
		NameType oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FundrefPackage.ASSERTION_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
	public ProviderType getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(ProviderType newProvider) {
		ProviderType oldProvider = provider;
		provider = newProvider == null ? PROVIDER_EDEFAULT : newProvider;
		boolean oldProviderESet = providerESet;
		providerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FundrefPackage.ASSERTION_TYPE__PROVIDER, oldProvider, provider, !oldProviderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProvider() {
		ProviderType oldProvider = provider;
		boolean oldProviderESet = providerESet;
		provider = PROVIDER_EDEFAULT;
		providerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FundrefPackage.ASSERTION_TYPE__PROVIDER, oldProvider, PROVIDER_EDEFAULT, oldProviderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProvider() {
		return providerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FundrefPackage.ASSERTION_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case FundrefPackage.ASSERTION_TYPE__ASSERTION:
				return ((InternalEList<?>)getAssertion()).basicRemove(otherEnd, msgs);
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
			case FundrefPackage.ASSERTION_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case FundrefPackage.ASSERTION_TYPE__ASSERTION:
				return getAssertion();
			case FundrefPackage.ASSERTION_TYPE__NAME:
				return getName();
			case FundrefPackage.ASSERTION_TYPE__PROVIDER:
				return getProvider();
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
			case FundrefPackage.ASSERTION_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case FundrefPackage.ASSERTION_TYPE__ASSERTION:
				getAssertion().clear();
				getAssertion().addAll((Collection<? extends AssertionType>)newValue);
				return;
			case FundrefPackage.ASSERTION_TYPE__NAME:
				setName((NameType)newValue);
				return;
			case FundrefPackage.ASSERTION_TYPE__PROVIDER:
				setProvider((ProviderType)newValue);
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
			case FundrefPackage.ASSERTION_TYPE__MIXED:
				getMixed().clear();
				return;
			case FundrefPackage.ASSERTION_TYPE__ASSERTION:
				getAssertion().clear();
				return;
			case FundrefPackage.ASSERTION_TYPE__NAME:
				unsetName();
				return;
			case FundrefPackage.ASSERTION_TYPE__PROVIDER:
				unsetProvider();
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
			case FundrefPackage.ASSERTION_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case FundrefPackage.ASSERTION_TYPE__ASSERTION:
				return !getAssertion().isEmpty();
			case FundrefPackage.ASSERTION_TYPE__NAME:
				return isSetName();
			case FundrefPackage.ASSERTION_TYPE__PROVIDER:
				return isSetProvider();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", provider: ");
		if (providerESet) result.append(provider); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AssertionTypeImpl
