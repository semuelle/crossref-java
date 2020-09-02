/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbstractType;
import gov.nih.nlm.ncbi.jats1.ContribGroupType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.KwdGroupType;
import gov.nih.nlm.ncbi.jats1.PermissionsType;
import gov.nih.nlm.ncbi.jats1.SecMetaType;

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
 * An implementation of the model object '<em><b>Sec Meta Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SecMetaTypeImpl#getContribGroupClass <em>Contrib Group Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SecMetaTypeImpl#getContribGroup <em>Contrib Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SecMetaTypeImpl#getAbstractClass <em>Abstract Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SecMetaTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SecMetaTypeImpl#getKwdGroupClass <em>Kwd Group Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SecMetaTypeImpl#getKwdGroup <em>Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SecMetaTypeImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SecMetaTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SecMetaTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecMetaTypeImpl extends MinimalEObjectImpl.Container implements SecMetaType {
	/**
	 * The cached value of the '{@link #getContribGroupClass() <em>Contrib Group Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribGroupClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contribGroupClass;

	/**
	 * The cached value of the '{@link #getAbstractClass() <em>Abstract Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractClass;

	/**
	 * The cached value of the '{@link #getKwdGroupClass() <em>Kwd Group Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKwdGroupClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap kwdGroupClass;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected PermissionsType permissions;

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
	protected SecMetaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getSecMetaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getContribGroupClass() {
		if (contribGroupClass == null) {
			contribGroupClass = new BasicFeatureMap(this, Jats1Package.SEC_META_TYPE__CONTRIB_GROUP_CLASS);
		}
		return contribGroupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContribGroupType> getContribGroup() {
		return getContribGroupClass().list(Jats1Package.eINSTANCE.getSecMetaType_ContribGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractClass() {
		if (abstractClass == null) {
			abstractClass = new BasicFeatureMap(this, Jats1Package.SEC_META_TYPE__ABSTRACT_CLASS);
		}
		return abstractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractType> getAbstract() {
		return getAbstractClass().list(Jats1Package.eINSTANCE.getSecMetaType_Abstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getKwdGroupClass() {
		if (kwdGroupClass == null) {
			kwdGroupClass = new BasicFeatureMap(this, Jats1Package.SEC_META_TYPE__KWD_GROUP_CLASS);
		}
		return kwdGroupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KwdGroupType> getKwdGroup() {
		return getKwdGroupClass().list(Jats1Package.eINSTANCE.getSecMetaType_KwdGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsType getPermissions() {
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermissions(PermissionsType newPermissions, NotificationChain msgs) {
		PermissionsType oldPermissions = permissions;
		permissions = newPermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.SEC_META_TYPE__PERMISSIONS, oldPermissions, newPermissions);
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
	public void setPermissions(PermissionsType newPermissions) {
		if (newPermissions != permissions) {
			NotificationChain msgs = null;
			if (permissions != null)
				msgs = ((InternalEObject)permissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.SEC_META_TYPE__PERMISSIONS, null, msgs);
			if (newPermissions != null)
				msgs = ((InternalEObject)newPermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.SEC_META_TYPE__PERMISSIONS, null, msgs);
			msgs = basicSetPermissions(newPermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SEC_META_TYPE__PERMISSIONS, newPermissions, newPermissions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SEC_META_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SEC_META_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.SEC_META_TYPE__CONTRIB_GROUP_CLASS:
				return ((InternalEList<?>)getContribGroupClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEC_META_TYPE__CONTRIB_GROUP:
				return ((InternalEList<?>)getContribGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEC_META_TYPE__ABSTRACT_CLASS:
				return ((InternalEList<?>)getAbstractClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEC_META_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEC_META_TYPE__KWD_GROUP_CLASS:
				return ((InternalEList<?>)getKwdGroupClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEC_META_TYPE__KWD_GROUP:
				return ((InternalEList<?>)getKwdGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEC_META_TYPE__PERMISSIONS:
				return basicSetPermissions(null, msgs);
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
			case Jats1Package.SEC_META_TYPE__CONTRIB_GROUP_CLASS:
				if (coreType) return getContribGroupClass();
				return ((FeatureMap.Internal)getContribGroupClass()).getWrapper();
			case Jats1Package.SEC_META_TYPE__CONTRIB_GROUP:
				return getContribGroup();
			case Jats1Package.SEC_META_TYPE__ABSTRACT_CLASS:
				if (coreType) return getAbstractClass();
				return ((FeatureMap.Internal)getAbstractClass()).getWrapper();
			case Jats1Package.SEC_META_TYPE__ABSTRACT:
				return getAbstract();
			case Jats1Package.SEC_META_TYPE__KWD_GROUP_CLASS:
				if (coreType) return getKwdGroupClass();
				return ((FeatureMap.Internal)getKwdGroupClass()).getWrapper();
			case Jats1Package.SEC_META_TYPE__KWD_GROUP:
				return getKwdGroup();
			case Jats1Package.SEC_META_TYPE__PERMISSIONS:
				return getPermissions();
			case Jats1Package.SEC_META_TYPE__BASE:
				return getBase();
			case Jats1Package.SEC_META_TYPE__ID:
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
			case Jats1Package.SEC_META_TYPE__CONTRIB_GROUP_CLASS:
				((FeatureMap.Internal)getContribGroupClass()).set(newValue);
				return;
			case Jats1Package.SEC_META_TYPE__CONTRIB_GROUP:
				getContribGroup().clear();
				getContribGroup().addAll((Collection<? extends ContribGroupType>)newValue);
				return;
			case Jats1Package.SEC_META_TYPE__ABSTRACT_CLASS:
				((FeatureMap.Internal)getAbstractClass()).set(newValue);
				return;
			case Jats1Package.SEC_META_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case Jats1Package.SEC_META_TYPE__KWD_GROUP_CLASS:
				((FeatureMap.Internal)getKwdGroupClass()).set(newValue);
				return;
			case Jats1Package.SEC_META_TYPE__KWD_GROUP:
				getKwdGroup().clear();
				getKwdGroup().addAll((Collection<? extends KwdGroupType>)newValue);
				return;
			case Jats1Package.SEC_META_TYPE__PERMISSIONS:
				setPermissions((PermissionsType)newValue);
				return;
			case Jats1Package.SEC_META_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.SEC_META_TYPE__ID:
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
			case Jats1Package.SEC_META_TYPE__CONTRIB_GROUP_CLASS:
				getContribGroupClass().clear();
				return;
			case Jats1Package.SEC_META_TYPE__CONTRIB_GROUP:
				getContribGroup().clear();
				return;
			case Jats1Package.SEC_META_TYPE__ABSTRACT_CLASS:
				getAbstractClass().clear();
				return;
			case Jats1Package.SEC_META_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case Jats1Package.SEC_META_TYPE__KWD_GROUP_CLASS:
				getKwdGroupClass().clear();
				return;
			case Jats1Package.SEC_META_TYPE__KWD_GROUP:
				getKwdGroup().clear();
				return;
			case Jats1Package.SEC_META_TYPE__PERMISSIONS:
				setPermissions((PermissionsType)null);
				return;
			case Jats1Package.SEC_META_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.SEC_META_TYPE__ID:
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
			case Jats1Package.SEC_META_TYPE__CONTRIB_GROUP_CLASS:
				return contribGroupClass != null && !contribGroupClass.isEmpty();
			case Jats1Package.SEC_META_TYPE__CONTRIB_GROUP:
				return !getContribGroup().isEmpty();
			case Jats1Package.SEC_META_TYPE__ABSTRACT_CLASS:
				return abstractClass != null && !abstractClass.isEmpty();
			case Jats1Package.SEC_META_TYPE__ABSTRACT:
				return !getAbstract().isEmpty();
			case Jats1Package.SEC_META_TYPE__KWD_GROUP_CLASS:
				return kwdGroupClass != null && !kwdGroupClass.isEmpty();
			case Jats1Package.SEC_META_TYPE__KWD_GROUP:
				return !getKwdGroup().isEmpty();
			case Jats1Package.SEC_META_TYPE__PERMISSIONS:
				return permissions != null;
			case Jats1Package.SEC_META_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.SEC_META_TYPE__ID:
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
		result.append(" (contribGroupClass: ");
		result.append(contribGroupClass);
		result.append(", abstractClass: ");
		result.append(abstractClass);
		result.append(", kwdGroupClass: ");
		result.append(kwdGroupClass);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SecMetaTypeImpl
