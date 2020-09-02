/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AffAlternativesType;
import gov.nih.nlm.ncbi.jats1.AffType;
import gov.nih.nlm.ncbi.jats1.AnonymousType;
import gov.nih.nlm.ncbi.jats1.CollabAlternativesType;
import gov.nih.nlm.ncbi.jats1.CollabType;
import gov.nih.nlm.ncbi.jats1.EtalType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.NameAlternativesType;
import gov.nih.nlm.ncbi.jats1.NameType;
import gov.nih.nlm.ncbi.jats1.PersonGroupType;
import gov.nih.nlm.ncbi.jats1.PersonGroupTypeType;
import gov.nih.nlm.ncbi.jats1.RoleType;
import gov.nih.nlm.ncbi.jats1.StringNameType;

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
 * An implementation of the model object '<em><b>Person Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getPersonGroupElements <em>Person Group Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getCollab <em>Collab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getCollabAlternatives <em>Collab Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getNameAlternatives <em>Name Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getStringName <em>String Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getAff <em>Aff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getAffAlternatives <em>Aff Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getEtal <em>Etal</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getPersonGroupType <em>Person Group Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PersonGroupTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonGroupTypeImpl extends MinimalEObjectImpl.Container implements PersonGroupType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

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
	 * The default value of the '{@link #getPersonGroupType() <em>Person Group Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonGroupType()
	 * @generated
	 * @ordered
	 */
	protected static final PersonGroupTypeType PERSON_GROUP_TYPE_EDEFAULT = PersonGroupTypeType.ALLAUTHORS;

	/**
	 * The cached value of the '{@link #getPersonGroupType() <em>Person Group Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonGroupType()
	 * @generated
	 * @ordered
	 */
	protected PersonGroupTypeType personGroupType = PERSON_GROUP_TYPE_EDEFAULT;

	/**
	 * This is true if the Person Group Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean personGroupTypeESet;

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
	protected PersonGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getPersonGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.PERSON_GROUP_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPersonGroupElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getPersonGroupType_PersonGroupElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnonymousType> getAnonymous() {
		return getPersonGroupElements().list(Jats1Package.eINSTANCE.getPersonGroupType_Anonymous());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabType> getCollab() {
		return getPersonGroupElements().list(Jats1Package.eINSTANCE.getPersonGroupType_Collab());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabAlternativesType> getCollabAlternatives() {
		return getPersonGroupElements().list(Jats1Package.eINSTANCE.getPersonGroupType_CollabAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameType> getName() {
		return getPersonGroupElements().list(Jats1Package.eINSTANCE.getPersonGroupType_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameAlternativesType> getNameAlternatives() {
		return getPersonGroupElements().list(Jats1Package.eINSTANCE.getPersonGroupType_NameAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringNameType> getStringName() {
		return getPersonGroupElements().list(Jats1Package.eINSTANCE.getPersonGroupType_StringName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffType> getAff() {
		return getPersonGroupElements().list(Jats1Package.eINSTANCE.getPersonGroupType_Aff());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffAlternativesType> getAffAlternatives() {
		return getPersonGroupElements().list(Jats1Package.eINSTANCE.getPersonGroupType_AffAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EtalType> getEtal() {
		return getPersonGroupElements().list(Jats1Package.eINSTANCE.getPersonGroupType_Etal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleType> getRole() {
		return getPersonGroupElements().list(Jats1Package.eINSTANCE.getPersonGroupType_Role());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PERSON_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PERSON_GROUP_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PERSON_GROUP_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonGroupTypeType getPersonGroupType() {
		return personGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonGroupType(PersonGroupTypeType newPersonGroupType) {
		PersonGroupTypeType oldPersonGroupType = personGroupType;
		personGroupType = newPersonGroupType == null ? PERSON_GROUP_TYPE_EDEFAULT : newPersonGroupType;
		boolean oldPersonGroupTypeESet = personGroupTypeESet;
		personGroupTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_TYPE, oldPersonGroupType, personGroupType, !oldPersonGroupTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPersonGroupType() {
		PersonGroupTypeType oldPersonGroupType = personGroupType;
		boolean oldPersonGroupTypeESet = personGroupTypeESet;
		personGroupType = PERSON_GROUP_TYPE_EDEFAULT;
		personGroupTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_TYPE, oldPersonGroupType, PERSON_GROUP_TYPE_EDEFAULT, oldPersonGroupTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPersonGroupType() {
		return personGroupTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PERSON_GROUP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.PERSON_GROUP_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_ELEMENTS:
				return ((InternalEList<?>)getPersonGroupElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__ANONYMOUS:
				return ((InternalEList<?>)getAnonymous()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__COLLAB:
				return ((InternalEList<?>)getCollab()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__COLLAB_ALTERNATIVES:
				return ((InternalEList<?>)getCollabAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__NAME_ALTERNATIVES:
				return ((InternalEList<?>)getNameAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__STRING_NAME:
				return ((InternalEList<?>)getStringName()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__AFF:
				return ((InternalEList<?>)getAff()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__AFF_ALTERNATIVES:
				return ((InternalEList<?>)getAffAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__ETAL:
				return ((InternalEList<?>)getEtal()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERSON_GROUP_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.PERSON_GROUP_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_ELEMENTS:
				if (coreType) return getPersonGroupElements();
				return ((FeatureMap.Internal)getPersonGroupElements()).getWrapper();
			case Jats1Package.PERSON_GROUP_TYPE__ANONYMOUS:
				return getAnonymous();
			case Jats1Package.PERSON_GROUP_TYPE__COLLAB:
				return getCollab();
			case Jats1Package.PERSON_GROUP_TYPE__COLLAB_ALTERNATIVES:
				return getCollabAlternatives();
			case Jats1Package.PERSON_GROUP_TYPE__NAME:
				return getName();
			case Jats1Package.PERSON_GROUP_TYPE__NAME_ALTERNATIVES:
				return getNameAlternatives();
			case Jats1Package.PERSON_GROUP_TYPE__STRING_NAME:
				return getStringName();
			case Jats1Package.PERSON_GROUP_TYPE__AFF:
				return getAff();
			case Jats1Package.PERSON_GROUP_TYPE__AFF_ALTERNATIVES:
				return getAffAlternatives();
			case Jats1Package.PERSON_GROUP_TYPE__ETAL:
				return getEtal();
			case Jats1Package.PERSON_GROUP_TYPE__ROLE:
				return getRole();
			case Jats1Package.PERSON_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.PERSON_GROUP_TYPE__ID:
				return getId();
			case Jats1Package.PERSON_GROUP_TYPE__LANG:
				return getLang();
			case Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_TYPE:
				return getPersonGroupType();
			case Jats1Package.PERSON_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PERSON_GROUP_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_ELEMENTS:
				((FeatureMap.Internal)getPersonGroupElements()).set(newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__ANONYMOUS:
				getAnonymous().clear();
				getAnonymous().addAll((Collection<? extends AnonymousType>)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__COLLAB:
				getCollab().clear();
				getCollab().addAll((Collection<? extends CollabType>)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__COLLAB_ALTERNATIVES:
				getCollabAlternatives().clear();
				getCollabAlternatives().addAll((Collection<? extends CollabAlternativesType>)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends NameType>)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__NAME_ALTERNATIVES:
				getNameAlternatives().clear();
				getNameAlternatives().addAll((Collection<? extends NameAlternativesType>)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__STRING_NAME:
				getStringName().clear();
				getStringName().addAll((Collection<? extends StringNameType>)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__AFF:
				getAff().clear();
				getAff().addAll((Collection<? extends AffType>)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				getAffAlternatives().addAll((Collection<? extends AffAlternativesType>)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__ETAL:
				getEtal().clear();
				getEtal().addAll((Collection<? extends EtalType>)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends RoleType>)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_TYPE:
				setPersonGroupType((PersonGroupTypeType)newValue);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PERSON_GROUP_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_ELEMENTS:
				getPersonGroupElements().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__ANONYMOUS:
				getAnonymous().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__COLLAB:
				getCollab().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__COLLAB_ALTERNATIVES:
				getCollabAlternatives().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__NAME:
				getName().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__NAME_ALTERNATIVES:
				getNameAlternatives().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__STRING_NAME:
				getStringName().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__AFF:
				getAff().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__ETAL:
				getEtal().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__ROLE:
				getRole().clear();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_TYPE:
				unsetPersonGroupType();
				return;
			case Jats1Package.PERSON_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PERSON_GROUP_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_ELEMENTS:
				return !getPersonGroupElements().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__ANONYMOUS:
				return !getAnonymous().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__COLLAB:
				return !getCollab().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__COLLAB_ALTERNATIVES:
				return !getCollabAlternatives().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__NAME:
				return !getName().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__NAME_ALTERNATIVES:
				return !getNameAlternatives().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__STRING_NAME:
				return !getStringName().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__AFF:
				return !getAff().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__AFF_ALTERNATIVES:
				return !getAffAlternatives().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__ETAL:
				return !getEtal().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__ROLE:
				return !getRole().isEmpty();
			case Jats1Package.PERSON_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.PERSON_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.PERSON_GROUP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.PERSON_GROUP_TYPE__PERSON_GROUP_TYPE:
				return isSetPersonGroupType();
			case Jats1Package.PERSON_GROUP_TYPE__SPECIFIC_USE:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", personGroupType: ");
		if (personGroupTypeESet) result.append(personGroupType); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //PersonGroupTypeImpl
