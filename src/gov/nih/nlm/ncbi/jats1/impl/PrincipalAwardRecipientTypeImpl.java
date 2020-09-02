/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ContribIdType;
import gov.nih.nlm.ncbi.jats1.InstitutionType;
import gov.nih.nlm.ncbi.jats1.InstitutionWrapType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.NameAlternativesType;
import gov.nih.nlm.ncbi.jats1.NameType;
import gov.nih.nlm.ncbi.jats1.PrincipalAwardRecipientType;
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
 * An implementation of the model object '<em><b>Principal Award Recipient Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getPrincipalAwardRecipientElements <em>Principal Award Recipient Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getContribId <em>Contrib Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getNameAlternatives <em>Name Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getStringName <em>String Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrincipalAwardRecipientTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrincipalAwardRecipientTypeImpl extends MinimalEObjectImpl.Container implements PrincipalAwardRecipientType {
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
	protected PrincipalAwardRecipientTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getPrincipalAwardRecipientType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPrincipalAwardRecipientElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getPrincipalAwardRecipientType_PrincipalAwardRecipientElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContribIdType> getContribId() {
		return getPrincipalAwardRecipientElements().list(Jats1Package.eINSTANCE.getPrincipalAwardRecipientType_ContribId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameType> getName() {
		return getPrincipalAwardRecipientElements().list(Jats1Package.eINSTANCE.getPrincipalAwardRecipientType_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameAlternativesType> getNameAlternatives() {
		return getPrincipalAwardRecipientElements().list(Jats1Package.eINSTANCE.getPrincipalAwardRecipientType_NameAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		return getPrincipalAwardRecipientElements().list(Jats1Package.eINSTANCE.getPrincipalAwardRecipientType_Institution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionWrapType> getInstitutionWrap() {
		return getPrincipalAwardRecipientElements().list(Jats1Package.eINSTANCE.getPrincipalAwardRecipientType_InstitutionWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringNameType> getStringName() {
		return getPrincipalAwardRecipientElements().list(Jats1Package.eINSTANCE.getPrincipalAwardRecipientType_StringName());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__PRINCIPAL_AWARD_RECIPIENT_ELEMENTS:
				return ((InternalEList<?>)getPrincipalAwardRecipientElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__CONTRIB_ID:
				return ((InternalEList<?>)getContribId()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__NAME_ALTERNATIVES:
				return ((InternalEList<?>)getNameAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__INSTITUTION_WRAP:
				return ((InternalEList<?>)getInstitutionWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__STRING_NAME:
				return ((InternalEList<?>)getStringName()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__PRINCIPAL_AWARD_RECIPIENT_ELEMENTS:
				if (coreType) return getPrincipalAwardRecipientElements();
				return ((FeatureMap.Internal)getPrincipalAwardRecipientElements()).getWrapper();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__CONTRIB_ID:
				return getContribId();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__NAME:
				return getName();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__NAME_ALTERNATIVES:
				return getNameAlternatives();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__INSTITUTION:
				return getInstitution();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__INSTITUTION_WRAP:
				return getInstitutionWrap();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__STRING_NAME:
				return getStringName();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__BASE:
				return getBase();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__ID:
				return getId();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__LANG:
				return getLang();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__PRINCIPAL_AWARD_RECIPIENT_ELEMENTS:
				((FeatureMap.Internal)getPrincipalAwardRecipientElements()).set(newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__CONTRIB_ID:
				getContribId().clear();
				getContribId().addAll((Collection<? extends ContribIdType>)newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends NameType>)newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__NAME_ALTERNATIVES:
				getNameAlternatives().clear();
				getNameAlternatives().addAll((Collection<? extends NameAlternativesType>)newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				getInstitutionWrap().addAll((Collection<? extends InstitutionWrapType>)newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__STRING_NAME:
				getStringName().clear();
				getStringName().addAll((Collection<? extends StringNameType>)newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__PRINCIPAL_AWARD_RECIPIENT_ELEMENTS:
				getPrincipalAwardRecipientElements().clear();
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__CONTRIB_ID:
				getContribId().clear();
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__NAME:
				getName().clear();
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__NAME_ALTERNATIVES:
				getNameAlternatives().clear();
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__STRING_NAME:
				getStringName().clear();
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__PRINCIPAL_AWARD_RECIPIENT_ELEMENTS:
				return !getPrincipalAwardRecipientElements().isEmpty();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__CONTRIB_ID:
				return !getContribId().isEmpty();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__NAME:
				return !getName().isEmpty();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__NAME_ALTERNATIVES:
				return !getNameAlternatives().isEmpty();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__INSTITUTION:
				return !getInstitution().isEmpty();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__INSTITUTION_WRAP:
				return !getInstitutionWrap().isEmpty();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__STRING_NAME:
				return !getStringName().isEmpty();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE__SPECIFIC_USE:
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
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //PrincipalAwardRecipientTypeImpl
