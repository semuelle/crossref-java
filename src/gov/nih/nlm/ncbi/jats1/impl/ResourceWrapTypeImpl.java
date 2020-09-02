/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.ResourceIdType;
import gov.nih.nlm.ncbi.jats1.ResourceNameType;
import gov.nih.nlm.ncbi.jats1.ResourceWrapType;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Resource Wrap Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceWrapTypeImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceWrapTypeImpl#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceWrapTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceWrapTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceWrapTypeImpl extends MinimalEObjectImpl.Container implements ResourceWrapType {
	/**
	 * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected ResourceNameType resourceName;

	/**
	 * The cached value of the '{@link #getResourceId() <em>Resource Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceId()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceIdType> resourceId;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceWrapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getResourceWrapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceNameType getResourceName() {
		return resourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceName(ResourceNameType newResourceName, NotificationChain msgs) {
		ResourceNameType oldResourceName = resourceName;
		resourceName = newResourceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_NAME, oldResourceName, newResourceName);
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
	public void setResourceName(ResourceNameType newResourceName) {
		if (newResourceName != resourceName) {
			NotificationChain msgs = null;
			if (resourceName != null)
				msgs = ((InternalEObject)resourceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_NAME, null, msgs);
			if (newResourceName != null)
				msgs = ((InternalEObject)newResourceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_NAME, null, msgs);
			msgs = basicSetResourceName(newResourceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_NAME, newResourceName, newResourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceIdType> getResourceId() {
		if (resourceId == null) {
			resourceId = new EObjectContainmentEList<ResourceIdType>(ResourceIdType.class, this, Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_ID);
		}
		return resourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_WRAP_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_WRAP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_NAME:
				return basicSetResourceName(null, msgs);
			case Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_ID:
				return ((InternalEList<?>)getResourceId()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_NAME:
				return getResourceName();
			case Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_ID:
				return getResourceId();
			case Jats1Package.RESOURCE_WRAP_TYPE__BASE:
				return getBase();
			case Jats1Package.RESOURCE_WRAP_TYPE__ID:
				return getId();
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
			case Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_NAME:
				setResourceName((ResourceNameType)newValue);
				return;
			case Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_ID:
				getResourceId().clear();
				getResourceId().addAll((Collection<? extends ResourceIdType>)newValue);
				return;
			case Jats1Package.RESOURCE_WRAP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.RESOURCE_WRAP_TYPE__ID:
				setId((String)newValue);
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
			case Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_NAME:
				setResourceName((ResourceNameType)null);
				return;
			case Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_ID:
				getResourceId().clear();
				return;
			case Jats1Package.RESOURCE_WRAP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.RESOURCE_WRAP_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_NAME:
				return resourceName != null;
			case Jats1Package.RESOURCE_WRAP_TYPE__RESOURCE_ID:
				return resourceId != null && !resourceId.isEmpty();
			case Jats1Package.RESOURCE_WRAP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.RESOURCE_WRAP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ResourceWrapTypeImpl
