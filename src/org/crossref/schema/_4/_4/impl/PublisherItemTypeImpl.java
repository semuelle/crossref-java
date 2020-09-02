/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.IdentifierType;
import org.crossref.schema._4._4.ItemNumberType;
import org.crossref.schema._4._4.PublisherItemType;
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
 * An implementation of the model object '<em><b>Publisher Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.PublisherItemTypeImpl#getItemNumber <em>Item Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PublisherItemTypeImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublisherItemTypeImpl extends MinimalEObjectImpl.Container implements PublisherItemType {
	/**
	 * The cached value of the '{@link #getItemNumber() <em>Item Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemNumberType> itemNumber;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierType> identifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getPublisherItemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemNumberType> getItemNumber() {
		if (itemNumber == null) {
			itemNumber = new EObjectContainmentEList<ItemNumberType>(ItemNumberType.class, this, _4Package.PUBLISHER_ITEM_TYPE__ITEM_NUMBER);
		}
		return itemNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdentifierType> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<IdentifierType>(IdentifierType.class, this, _4Package.PUBLISHER_ITEM_TYPE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.PUBLISHER_ITEM_TYPE__ITEM_NUMBER:
				return ((InternalEList<?>)getItemNumber()).basicRemove(otherEnd, msgs);
			case _4Package.PUBLISHER_ITEM_TYPE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
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
			case _4Package.PUBLISHER_ITEM_TYPE__ITEM_NUMBER:
				return getItemNumber();
			case _4Package.PUBLISHER_ITEM_TYPE__IDENTIFIER:
				return getIdentifier();
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
			case _4Package.PUBLISHER_ITEM_TYPE__ITEM_NUMBER:
				getItemNumber().clear();
				getItemNumber().addAll((Collection<? extends ItemNumberType>)newValue);
				return;
			case _4Package.PUBLISHER_ITEM_TYPE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends IdentifierType>)newValue);
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
			case _4Package.PUBLISHER_ITEM_TYPE__ITEM_NUMBER:
				getItemNumber().clear();
				return;
			case _4Package.PUBLISHER_ITEM_TYPE__IDENTIFIER:
				getIdentifier().clear();
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
			case _4Package.PUBLISHER_ITEM_TYPE__ITEM_NUMBER:
				return itemNumber != null && !itemNumber.isEmpty();
			case _4Package.PUBLISHER_ITEM_TYPE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PublisherItemTypeImpl
