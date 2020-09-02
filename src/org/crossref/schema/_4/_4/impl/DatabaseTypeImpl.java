/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.ComponentListType;
import org.crossref.schema._4._4.DatabaseMetadataType;
import org.crossref.schema._4._4.DatabaseType;
import org.crossref.schema._4._4.DatasetType;
import org.crossref.schema._4._4._4Package;

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
 * An implementation of the model object '<em><b>Database Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.DatabaseTypeImpl#getDatabaseMetadata <em>Database Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DatabaseTypeImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DatabaseTypeImpl#getComponentList <em>Component List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseTypeImpl extends MinimalEObjectImpl.Container implements DatabaseType {
	/**
	 * The cached value of the '{@link #getDatabaseMetadata() <em>Database Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseMetadata()
	 * @generated
	 * @ordered
	 */
	protected DatabaseMetadataType databaseMetadata;

	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetType> dataset;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getDatabaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseMetadataType getDatabaseMetadata() {
		return databaseMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseMetadata(DatabaseMetadataType newDatabaseMetadata, NotificationChain msgs) {
		DatabaseMetadataType oldDatabaseMetadata = databaseMetadata;
		databaseMetadata = newDatabaseMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.DATABASE_TYPE__DATABASE_METADATA, oldDatabaseMetadata, newDatabaseMetadata);
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
	public void setDatabaseMetadata(DatabaseMetadataType newDatabaseMetadata) {
		if (newDatabaseMetadata != databaseMetadata) {
			NotificationChain msgs = null;
			if (databaseMetadata != null)
				msgs = ((InternalEObject)databaseMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.DATABASE_TYPE__DATABASE_METADATA, null, msgs);
			if (newDatabaseMetadata != null)
				msgs = ((InternalEObject)newDatabaseMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.DATABASE_TYPE__DATABASE_METADATA, null, msgs);
			msgs = basicSetDatabaseMetadata(newDatabaseMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DATABASE_TYPE__DATABASE_METADATA, newDatabaseMetadata, newDatabaseMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatasetType> getDataset() {
		if (dataset == null) {
			dataset = new EObjectContainmentEList<DatasetType>(DatasetType.class, this, _4Package.DATABASE_TYPE__DATASET);
		}
		return dataset;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.DATABASE_TYPE__COMPONENT_LIST, oldComponentList, newComponentList);
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
				msgs = ((InternalEObject)componentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.DATABASE_TYPE__COMPONENT_LIST, null, msgs);
			if (newComponentList != null)
				msgs = ((InternalEObject)newComponentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.DATABASE_TYPE__COMPONENT_LIST, null, msgs);
			msgs = basicSetComponentList(newComponentList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DATABASE_TYPE__COMPONENT_LIST, newComponentList, newComponentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.DATABASE_TYPE__DATABASE_METADATA:
				return basicSetDatabaseMetadata(null, msgs);
			case _4Package.DATABASE_TYPE__DATASET:
				return ((InternalEList<?>)getDataset()).basicRemove(otherEnd, msgs);
			case _4Package.DATABASE_TYPE__COMPONENT_LIST:
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
			case _4Package.DATABASE_TYPE__DATABASE_METADATA:
				return getDatabaseMetadata();
			case _4Package.DATABASE_TYPE__DATASET:
				return getDataset();
			case _4Package.DATABASE_TYPE__COMPONENT_LIST:
				return getComponentList();
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
			case _4Package.DATABASE_TYPE__DATABASE_METADATA:
				setDatabaseMetadata((DatabaseMetadataType)newValue);
				return;
			case _4Package.DATABASE_TYPE__DATASET:
				getDataset().clear();
				getDataset().addAll((Collection<? extends DatasetType>)newValue);
				return;
			case _4Package.DATABASE_TYPE__COMPONENT_LIST:
				setComponentList((ComponentListType)newValue);
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
			case _4Package.DATABASE_TYPE__DATABASE_METADATA:
				setDatabaseMetadata((DatabaseMetadataType)null);
				return;
			case _4Package.DATABASE_TYPE__DATASET:
				getDataset().clear();
				return;
			case _4Package.DATABASE_TYPE__COMPONENT_LIST:
				setComponentList((ComponentListType)null);
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
			case _4Package.DATABASE_TYPE__DATABASE_METADATA:
				return databaseMetadata != null;
			case _4Package.DATABASE_TYPE__DATASET:
				return dataset != null && !dataset.isEmpty();
			case _4Package.DATABASE_TYPE__COMPONENT_LIST:
				return componentList != null;
		}
		return super.eIsSet(featureID);
	}

} //DatabaseTypeImpl
