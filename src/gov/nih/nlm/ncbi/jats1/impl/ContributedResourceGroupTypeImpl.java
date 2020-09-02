/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AwardGroupType;
import gov.nih.nlm.ncbi.jats1.ContributedResourceGroupType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.ResourceGroupType;
import gov.nih.nlm.ncbi.jats1.SupportDescriptionType;

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
 * An implementation of the model object '<em><b>Contributed Resource Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContributedResourceGroupTypeImpl#getAwardGroup <em>Award Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContributedResourceGroupTypeImpl#getSupportDescription <em>Support Description</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContributedResourceGroupTypeImpl#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContributedResourceGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContributedResourceGroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContributedResourceGroupTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContributedResourceGroupTypeImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContributedResourceGroupTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributedResourceGroupTypeImpl extends MinimalEObjectImpl.Container implements ContributedResourceGroupType {
	/**
	 * The cached value of the '{@link #getAwardGroup() <em>Award Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwardGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<AwardGroupType> awardGroup;

	/**
	 * The cached value of the '{@link #getSupportDescription() <em>Support Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportDescriptionType> supportDescription;

	/**
	 * The cached value of the '{@link #getResourceGroup() <em>Resource Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroupType> resourceGroup;

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
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected Object lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected String resourceType = RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFIC_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected String specificUse = SPECIFIC_USE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributedResourceGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getContributedResourceGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AwardGroupType> getAwardGroup() {
		if (awardGroup == null) {
			awardGroup = new EObjectContainmentEList<AwardGroupType>(AwardGroupType.class, this, Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__AWARD_GROUP);
		}
		return awardGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupportDescriptionType> getSupportDescription() {
		if (supportDescription == null) {
			supportDescription = new EObjectContainmentEList<SupportDescriptionType>(SupportDescriptionType.class, this, Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SUPPORT_DESCRIPTION);
		}
		return supportDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceGroupType> getResourceGroup() {
		if (resourceGroup == null) {
			resourceGroup = new EObjectContainmentEList<ResourceGroupType>(ResourceGroupType.class, this, Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_GROUP);
		}
		return resourceGroup;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang(Object newLang) {
		Object oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType(String newResourceType) {
		String oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecificUse() {
		return specificUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecificUse(String newSpecificUse) {
		String oldSpecificUse = specificUse;
		specificUse = newSpecificUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__AWARD_GROUP:
				return ((InternalEList<?>)getAwardGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SUPPORT_DESCRIPTION:
				return ((InternalEList<?>)getSupportDescription()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_GROUP:
				return ((InternalEList<?>)getResourceGroup()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__AWARD_GROUP:
				return getAwardGroup();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SUPPORT_DESCRIPTION:
				return getSupportDescription();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_GROUP:
				return getResourceGroup();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__ID:
				return getId();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__LANG:
				return getLang();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_TYPE:
				return getResourceType();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SPECIFIC_USE:
				return getSpecificUse();
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
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__AWARD_GROUP:
				getAwardGroup().clear();
				getAwardGroup().addAll((Collection<? extends AwardGroupType>)newValue);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SUPPORT_DESCRIPTION:
				getSupportDescription().clear();
				getSupportDescription().addAll((Collection<? extends SupportDescriptionType>)newValue);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_GROUP:
				getResourceGroup().clear();
				getResourceGroup().addAll((Collection<? extends ResourceGroupType>)newValue);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_TYPE:
				setResourceType((String)newValue);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
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
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__AWARD_GROUP:
				getAwardGroup().clear();
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SUPPORT_DESCRIPTION:
				getSupportDescription().clear();
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_GROUP:
				getResourceGroup().clear();
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
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
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__AWARD_GROUP:
				return awardGroup != null && !awardGroup.isEmpty();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SUPPORT_DESCRIPTION:
				return supportDescription != null && !supportDescription.isEmpty();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_GROUP:
				return resourceGroup != null && !resourceGroup.isEmpty();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__RESOURCE_TYPE:
				return RESOURCE_TYPE_EDEFAULT == null ? resourceType != null : !RESOURCE_TYPE_EDEFAULT.equals(resourceType);
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
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
		result.append(", lang: ");
		result.append(lang);
		result.append(", resourceType: ");
		result.append(resourceType);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //ContributedResourceGroupTypeImpl
