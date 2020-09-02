/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.EventType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.PubHistoryType;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Pub History Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PubHistoryTypeImpl#getEventClass <em>Event Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PubHistoryTypeImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PubHistoryTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PubHistoryTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PubHistoryTypeImpl extends MinimalEObjectImpl.Container implements PubHistoryType {
	/**
	 * The cached value of the '{@link #getEventClass() <em>Event Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap eventClass;

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
	protected PubHistoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getPubHistoryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getEventClass() {
		if (eventClass == null) {
			eventClass = new BasicFeatureMap(this, Jats1Package.PUB_HISTORY_TYPE__EVENT_CLASS);
		}
		return eventClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventType> getEvent() {
		return getEventClass().list(Jats1Package.eINSTANCE.getPubHistoryType_Event());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PUB_HISTORY_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PUB_HISTORY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.PUB_HISTORY_TYPE__EVENT_CLASS:
				return ((InternalEList<?>)getEventClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.PUB_HISTORY_TYPE__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.PUB_HISTORY_TYPE__EVENT_CLASS:
				if (coreType) return getEventClass();
				return ((FeatureMap.Internal)getEventClass()).getWrapper();
			case Jats1Package.PUB_HISTORY_TYPE__EVENT:
				return getEvent();
			case Jats1Package.PUB_HISTORY_TYPE__BASE:
				return getBase();
			case Jats1Package.PUB_HISTORY_TYPE__ID:
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
			case Jats1Package.PUB_HISTORY_TYPE__EVENT_CLASS:
				((FeatureMap.Internal)getEventClass()).set(newValue);
				return;
			case Jats1Package.PUB_HISTORY_TYPE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EventType>)newValue);
				return;
			case Jats1Package.PUB_HISTORY_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.PUB_HISTORY_TYPE__ID:
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
			case Jats1Package.PUB_HISTORY_TYPE__EVENT_CLASS:
				getEventClass().clear();
				return;
			case Jats1Package.PUB_HISTORY_TYPE__EVENT:
				getEvent().clear();
				return;
			case Jats1Package.PUB_HISTORY_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.PUB_HISTORY_TYPE__ID:
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
			case Jats1Package.PUB_HISTORY_TYPE__EVENT_CLASS:
				return eventClass != null && !eventClass.isEmpty();
			case Jats1Package.PUB_HISTORY_TYPE__EVENT:
				return !getEvent().isEmpty();
			case Jats1Package.PUB_HISTORY_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.PUB_HISTORY_TYPE__ID:
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
		result.append(" (eventClass: ");
		result.append(eventClass);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PubHistoryTypeImpl
