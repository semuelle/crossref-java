/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.CollectionType;
import org.crossref.schema._4._4.ItemType;
import org.crossref.schema._4._4.MultiResolutionType;
import org.crossref.schema._4._4.PropertyType1;
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
 * An implementation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.CollectionTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CollectionTypeImpl#getMultiResolution <em>Multi Resolution</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CollectionTypeImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionTypeImpl extends MinimalEObjectImpl.Container implements CollectionType {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> item;

	/**
	 * The default value of the '{@link #getMultiResolution() <em>Multi Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiResolution()
	 * @generated
	 * @ordered
	 */
	protected static final MultiResolutionType MULTI_RESOLUTION_EDEFAULT = MultiResolutionType.LOCK;

	/**
	 * The cached value of the '{@link #getMultiResolution() <em>Multi Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiResolution()
	 * @generated
	 * @ordered
	 */
	protected MultiResolutionType multiResolution = MULTI_RESOLUTION_EDEFAULT;

	/**
	 * This is true if the Multi Resolution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiResolutionESet;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyType1 PROPERTY_EDEFAULT = PropertyType1.LIST_BASED;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyType1 property = PROPERTY_EDEFAULT;

	/**
	 * This is true if the Property attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getCollectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, _4Package.COLLECTION_TYPE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiResolutionType getMultiResolution() {
		return multiResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiResolution(MultiResolutionType newMultiResolution) {
		MultiResolutionType oldMultiResolution = multiResolution;
		multiResolution = newMultiResolution == null ? MULTI_RESOLUTION_EDEFAULT : newMultiResolution;
		boolean oldMultiResolutionESet = multiResolutionESet;
		multiResolutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COLLECTION_TYPE__MULTI_RESOLUTION, oldMultiResolution, multiResolution, !oldMultiResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMultiResolution() {
		MultiResolutionType oldMultiResolution = multiResolution;
		boolean oldMultiResolutionESet = multiResolutionESet;
		multiResolution = MULTI_RESOLUTION_EDEFAULT;
		multiResolutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.COLLECTION_TYPE__MULTI_RESOLUTION, oldMultiResolution, MULTI_RESOLUTION_EDEFAULT, oldMultiResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMultiResolution() {
		return multiResolutionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType1 getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(PropertyType1 newProperty) {
		PropertyType1 oldProperty = property;
		property = newProperty == null ? PROPERTY_EDEFAULT : newProperty;
		boolean oldPropertyESet = propertyESet;
		propertyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COLLECTION_TYPE__PROPERTY, oldProperty, property, !oldPropertyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProperty() {
		PropertyType1 oldProperty = property;
		boolean oldPropertyESet = propertyESet;
		property = PROPERTY_EDEFAULT;
		propertyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.COLLECTION_TYPE__PROPERTY, oldProperty, PROPERTY_EDEFAULT, oldPropertyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProperty() {
		return propertyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.COLLECTION_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case _4Package.COLLECTION_TYPE__ITEM:
				return getItem();
			case _4Package.COLLECTION_TYPE__MULTI_RESOLUTION:
				return getMultiResolution();
			case _4Package.COLLECTION_TYPE__PROPERTY:
				return getProperty();
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
			case _4Package.COLLECTION_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _4Package.COLLECTION_TYPE__MULTI_RESOLUTION:
				setMultiResolution((MultiResolutionType)newValue);
				return;
			case _4Package.COLLECTION_TYPE__PROPERTY:
				setProperty((PropertyType1)newValue);
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
			case _4Package.COLLECTION_TYPE__ITEM:
				getItem().clear();
				return;
			case _4Package.COLLECTION_TYPE__MULTI_RESOLUTION:
				unsetMultiResolution();
				return;
			case _4Package.COLLECTION_TYPE__PROPERTY:
				unsetProperty();
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
			case _4Package.COLLECTION_TYPE__ITEM:
				return item != null && !item.isEmpty();
			case _4Package.COLLECTION_TYPE__MULTI_RESOLUTION:
				return isSetMultiResolution();
			case _4Package.COLLECTION_TYPE__PROPERTY:
				return isSetProperty();
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
		result.append(" (multiResolution: ");
		if (multiResolutionESet) result.append(multiResolution); else result.append("<unset>");
		result.append(", property: ");
		if (propertyESet) result.append(property); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CollectionTypeImpl
