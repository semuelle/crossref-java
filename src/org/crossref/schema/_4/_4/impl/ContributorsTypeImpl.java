/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.AnonymousType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.OrganizationType;
import org.crossref.schema._4._4.PersonNameType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contributors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ContributorsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContributorsTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContributorsTypeImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContributorsTypeImpl#getAnonymous <em>Anonymous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributorsTypeImpl extends MinimalEObjectImpl.Container implements ContributorsType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getContributorsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, _4Package.CONTRIBUTORS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrganizationType> getOrganization() {
		return getGroup().list(_4Package.eINSTANCE.getContributorsType_Organization());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonNameType> getPersonName() {
		return getGroup().list(_4Package.eINSTANCE.getContributorsType_PersonName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnonymousType> getAnonymous() {
		return getGroup().list(_4Package.eINSTANCE.getContributorsType_Anonymous());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.CONTRIBUTORS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _4Package.CONTRIBUTORS_TYPE__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case _4Package.CONTRIBUTORS_TYPE__PERSON_NAME:
				return ((InternalEList<?>)getPersonName()).basicRemove(otherEnd, msgs);
			case _4Package.CONTRIBUTORS_TYPE__ANONYMOUS:
				return ((InternalEList<?>)getAnonymous()).basicRemove(otherEnd, msgs);
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
			case _4Package.CONTRIBUTORS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _4Package.CONTRIBUTORS_TYPE__ORGANIZATION:
				return getOrganization();
			case _4Package.CONTRIBUTORS_TYPE__PERSON_NAME:
				return getPersonName();
			case _4Package.CONTRIBUTORS_TYPE__ANONYMOUS:
				return getAnonymous();
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
			case _4Package.CONTRIBUTORS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _4Package.CONTRIBUTORS_TYPE__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _4Package.CONTRIBUTORS_TYPE__PERSON_NAME:
				getPersonName().clear();
				getPersonName().addAll((Collection<? extends PersonNameType>)newValue);
				return;
			case _4Package.CONTRIBUTORS_TYPE__ANONYMOUS:
				getAnonymous().clear();
				getAnonymous().addAll((Collection<? extends AnonymousType>)newValue);
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
			case _4Package.CONTRIBUTORS_TYPE__GROUP:
				getGroup().clear();
				return;
			case _4Package.CONTRIBUTORS_TYPE__ORGANIZATION:
				getOrganization().clear();
				return;
			case _4Package.CONTRIBUTORS_TYPE__PERSON_NAME:
				getPersonName().clear();
				return;
			case _4Package.CONTRIBUTORS_TYPE__ANONYMOUS:
				getAnonymous().clear();
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
			case _4Package.CONTRIBUTORS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case _4Package.CONTRIBUTORS_TYPE__ORGANIZATION:
				return !getOrganization().isEmpty();
			case _4Package.CONTRIBUTORS_TYPE__PERSON_NAME:
				return !getPersonName().isEmpty();
			case _4Package.CONTRIBUTORS_TYPE__ANONYMOUS:
				return !getAnonymous().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ContributorsTypeImpl
