/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.InstitutionIdType;
import gov.nih.nlm.ncbi.jats1.InstitutionType;
import gov.nih.nlm.ncbi.jats1.InstitutionWrapType;
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
 * An implementation of the model object '<em><b>Institution Wrap Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionWrapTypeImpl#getInstitutionClass <em>Institution Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionWrapTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionWrapTypeImpl#getInstitutionId <em>Institution Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionWrapTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionWrapTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstitutionWrapTypeImpl extends MinimalEObjectImpl.Container implements InstitutionWrapType {
	/**
	 * The cached value of the '{@link #getInstitutionClass() <em>Institution Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap institutionClass;

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
	protected InstitutionWrapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getInstitutionWrapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getInstitutionClass() {
		if (institutionClass == null) {
			institutionClass = new BasicFeatureMap(this, Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_CLASS);
		}
		return institutionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		return getInstitutionClass().list(Jats1Package.eINSTANCE.getInstitutionWrapType_Institution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionIdType> getInstitutionId() {
		return getInstitutionClass().list(Jats1Package.eINSTANCE.getInstitutionWrapType_InstitutionId());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_WRAP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_WRAP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_CLASS:
				return ((InternalEList<?>)getInstitutionClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_ID:
				return ((InternalEList<?>)getInstitutionId()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_CLASS:
				if (coreType) return getInstitutionClass();
				return ((FeatureMap.Internal)getInstitutionClass()).getWrapper();
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION:
				return getInstitution();
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_ID:
				return getInstitutionId();
			case Jats1Package.INSTITUTION_WRAP_TYPE__BASE:
				return getBase();
			case Jats1Package.INSTITUTION_WRAP_TYPE__ID:
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
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_CLASS:
				((FeatureMap.Internal)getInstitutionClass()).set(newValue);
				return;
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_ID:
				getInstitutionId().clear();
				getInstitutionId().addAll((Collection<? extends InstitutionIdType>)newValue);
				return;
			case Jats1Package.INSTITUTION_WRAP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.INSTITUTION_WRAP_TYPE__ID:
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
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_CLASS:
				getInstitutionClass().clear();
				return;
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_ID:
				getInstitutionId().clear();
				return;
			case Jats1Package.INSTITUTION_WRAP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.INSTITUTION_WRAP_TYPE__ID:
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
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_CLASS:
				return institutionClass != null && !institutionClass.isEmpty();
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION:
				return !getInstitution().isEmpty();
			case Jats1Package.INSTITUTION_WRAP_TYPE__INSTITUTION_ID:
				return !getInstitutionId().isEmpty();
			case Jats1Package.INSTITUTION_WRAP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.INSTITUTION_WRAP_TYPE__ID:
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
		result.append(" (institutionClass: ");
		result.append(institutionClass);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //InstitutionWrapTypeImpl
