/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.ComponentListType;
import org.crossref.schema._4._4.SaComponentType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sa Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.SaComponentTypeImpl#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SaComponentTypeImpl#getParentDoi <em>Parent Doi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaComponentTypeImpl extends MinimalEObjectImpl.Container implements SaComponentType {
	/**
	 * The cached value of the '{@link #getComponentList() <em>Component List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentList()
	 * @generated
	 * @ordered
	 */
	protected ComponentListType componentList;

	/**
	 * The default value of the '{@link #getParentDoi() <em>Parent Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDoi()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_DOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentDoi() <em>Parent Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDoi()
	 * @generated
	 * @ordered
	 */
	protected String parentDoi = PARENT_DOI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getSaComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentListType getComponentList() {
		return componentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentList(ComponentListType newComponentList, NotificationChain msgs) {
		ComponentListType oldComponentList = componentList;
		componentList = newComponentList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SA_COMPONENT_TYPE__COMPONENT_LIST, oldComponentList, newComponentList);
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
	public void setComponentList(ComponentListType newComponentList) {
		if (newComponentList != componentList) {
			NotificationChain msgs = null;
			if (componentList != null)
				msgs = ((InternalEObject)componentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SA_COMPONENT_TYPE__COMPONENT_LIST, null, msgs);
			if (newComponentList != null)
				msgs = ((InternalEObject)newComponentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SA_COMPONENT_TYPE__COMPONENT_LIST, null, msgs);
			msgs = basicSetComponentList(newComponentList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SA_COMPONENT_TYPE__COMPONENT_LIST, newComponentList, newComponentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentDoi() {
		return parentDoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentDoi(String newParentDoi) {
		String oldParentDoi = parentDoi;
		parentDoi = newParentDoi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SA_COMPONENT_TYPE__PARENT_DOI, oldParentDoi, parentDoi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.SA_COMPONENT_TYPE__COMPONENT_LIST:
				return basicSetComponentList(null, msgs);
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
			case _4Package.SA_COMPONENT_TYPE__COMPONENT_LIST:
				return getComponentList();
			case _4Package.SA_COMPONENT_TYPE__PARENT_DOI:
				return getParentDoi();
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
			case _4Package.SA_COMPONENT_TYPE__COMPONENT_LIST:
				setComponentList((ComponentListType)newValue);
				return;
			case _4Package.SA_COMPONENT_TYPE__PARENT_DOI:
				setParentDoi((String)newValue);
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
			case _4Package.SA_COMPONENT_TYPE__COMPONENT_LIST:
				setComponentList((ComponentListType)null);
				return;
			case _4Package.SA_COMPONENT_TYPE__PARENT_DOI:
				setParentDoi(PARENT_DOI_EDEFAULT);
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
			case _4Package.SA_COMPONENT_TYPE__COMPONENT_LIST:
				return componentList != null;
			case _4Package.SA_COMPONENT_TYPE__PARENT_DOI:
				return PARENT_DOI_EDEFAULT == null ? parentDoi != null : !PARENT_DOI_EDEFAULT.equals(parentDoi);
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
		result.append(" (parentDoi: ");
		result.append(parentDoi);
		result.append(')');
		return result.toString();
	}

} //SaComponentTypeImpl
