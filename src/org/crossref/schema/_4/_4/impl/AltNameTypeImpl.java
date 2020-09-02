/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.AltNameType;
import org.crossref.schema._4._4.NameType1;
import org.crossref.schema._4._4.StringNameType;
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
 * An implementation of the model object '<em><b>Alt Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.AltNameTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AltNameTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AltNameTypeImpl#getStringName <em>String Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AltNameTypeImpl extends MinimalEObjectImpl.Container implements AltNameType {
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
	protected AltNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getAltNameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, _4Package.ALT_NAME_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameType1> getName() {
		return getGroup().list(_4Package.eINSTANCE.getAltNameType_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringNameType> getStringName() {
		return getGroup().list(_4Package.eINSTANCE.getAltNameType_StringName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.ALT_NAME_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _4Package.ALT_NAME_TYPE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case _4Package.ALT_NAME_TYPE__STRING_NAME:
				return ((InternalEList<?>)getStringName()).basicRemove(otherEnd, msgs);
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
			case _4Package.ALT_NAME_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _4Package.ALT_NAME_TYPE__NAME:
				return getName();
			case _4Package.ALT_NAME_TYPE__STRING_NAME:
				return getStringName();
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
			case _4Package.ALT_NAME_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _4Package.ALT_NAME_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends NameType1>)newValue);
				return;
			case _4Package.ALT_NAME_TYPE__STRING_NAME:
				getStringName().clear();
				getStringName().addAll((Collection<? extends StringNameType>)newValue);
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
			case _4Package.ALT_NAME_TYPE__GROUP:
				getGroup().clear();
				return;
			case _4Package.ALT_NAME_TYPE__NAME:
				getName().clear();
				return;
			case _4Package.ALT_NAME_TYPE__STRING_NAME:
				getStringName().clear();
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
			case _4Package.ALT_NAME_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case _4Package.ALT_NAME_TYPE__NAME:
				return !getName().isEmpty();
			case _4Package.ALT_NAME_TYPE__STRING_NAME:
				return !getStringName().isEmpty();
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

} //AltNameTypeImpl
