/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.CrossmarkDomainType;
import org.crossref.schema._4._4.CrossmarkDomainsType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crossmark Domains Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.CrossmarkDomainsTypeImpl#getCrossmarkDomain <em>Crossmark Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossmarkDomainsTypeImpl extends MinimalEObjectImpl.Container implements CrossmarkDomainsType {
	/**
	 * The cached value of the '{@link #getCrossmarkDomain() <em>Crossmark Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossmarkDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossmarkDomainType> crossmarkDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossmarkDomainsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getCrossmarkDomainsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossmarkDomainType> getCrossmarkDomain() {
		if (crossmarkDomain == null) {
			crossmarkDomain = new EObjectContainmentEList<CrossmarkDomainType>(CrossmarkDomainType.class, this, _4Package.CROSSMARK_DOMAINS_TYPE__CROSSMARK_DOMAIN);
		}
		return crossmarkDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.CROSSMARK_DOMAINS_TYPE__CROSSMARK_DOMAIN:
				return ((InternalEList<?>)getCrossmarkDomain()).basicRemove(otherEnd, msgs);
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
			case _4Package.CROSSMARK_DOMAINS_TYPE__CROSSMARK_DOMAIN:
				return getCrossmarkDomain();
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
			case _4Package.CROSSMARK_DOMAINS_TYPE__CROSSMARK_DOMAIN:
				getCrossmarkDomain().clear();
				getCrossmarkDomain().addAll((Collection<? extends CrossmarkDomainType>)newValue);
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
			case _4Package.CROSSMARK_DOMAINS_TYPE__CROSSMARK_DOMAIN:
				getCrossmarkDomain().clear();
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
			case _4Package.CROSSMARK_DOMAINS_TYPE__CROSSMARK_DOMAIN:
				return crossmarkDomain != null && !crossmarkDomain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CrossmarkDomainsTypeImpl
