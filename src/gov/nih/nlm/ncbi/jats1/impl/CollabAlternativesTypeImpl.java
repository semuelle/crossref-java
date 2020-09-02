/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.CollabAlternativesType;
import gov.nih.nlm.ncbi.jats1.CollabType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;

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
 * An implementation of the model object '<em><b>Collab Alternatives Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabAlternativesTypeImpl#getCollabClass <em>Collab Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabAlternativesTypeImpl#getCollab <em>Collab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabAlternativesTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabAlternativesTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollabAlternativesTypeImpl extends MinimalEObjectImpl.Container implements CollabAlternativesType {
	/**
	 * The cached value of the '{@link #getCollabClass() <em>Collab Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollabClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap collabClass;

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
	protected CollabAlternativesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getCollabAlternativesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCollabClass() {
		if (collabClass == null) {
			collabClass = new BasicFeatureMap(this, Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB_CLASS);
		}
		return collabClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabType> getCollab() {
		return getCollabClass().list(Jats1Package.eINSTANCE.getCollabAlternativesType_Collab());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_ALTERNATIVES_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_ALTERNATIVES_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB_CLASS:
				return ((InternalEList<?>)getCollabClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB:
				return ((InternalEList<?>)getCollab()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB_CLASS:
				if (coreType) return getCollabClass();
				return ((FeatureMap.Internal)getCollabClass()).getWrapper();
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB:
				return getCollab();
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__BASE:
				return getBase();
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__ID:
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
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB_CLASS:
				((FeatureMap.Internal)getCollabClass()).set(newValue);
				return;
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB:
				getCollab().clear();
				getCollab().addAll((Collection<? extends CollabType>)newValue);
				return;
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__ID:
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
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB_CLASS:
				getCollabClass().clear();
				return;
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB:
				getCollab().clear();
				return;
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__ID:
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
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB_CLASS:
				return collabClass != null && !collabClass.isEmpty();
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__COLLAB:
				return !getCollab().isEmpty();
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE__ID:
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
		result.append(" (collabClass: ");
		result.append(collabClass);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CollabAlternativesTypeImpl
