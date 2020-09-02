/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AddrLineType;
import gov.nih.nlm.ncbi.jats1.CityType;
import gov.nih.nlm.ncbi.jats1.ConfLocType;
import gov.nih.nlm.ncbi.jats1.CountryType;
import gov.nih.nlm.ncbi.jats1.FaxType;
import gov.nih.nlm.ncbi.jats1.InstitutionType;
import gov.nih.nlm.ncbi.jats1.InstitutionWrapType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.PhoneType;
import gov.nih.nlm.ncbi.jats1.PostalCodeType;
import gov.nih.nlm.ncbi.jats1.StateType;

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
 * An implementation of the model object '<em><b>Conf Loc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getAddressClass <em>Address Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getAddrLine <em>Addr Line</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getCity <em>City</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConfLocTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfLocTypeImpl extends MinimalEObjectImpl.Container implements ConfLocType {
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
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

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
	protected ConfLocTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getConfLocType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.CONF_LOC_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAddressClass() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getConfLocType_AddressClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddrLineType> getAddrLine() {
		return getAddressClass().list(Jats1Package.eINSTANCE.getConfLocType_AddrLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CityType> getCity() {
		return getAddressClass().list(Jats1Package.eINSTANCE.getConfLocType_City());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CountryType> getCountry() {
		return getAddressClass().list(Jats1Package.eINSTANCE.getConfLocType_Country());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FaxType> getFax() {
		return getAddressClass().list(Jats1Package.eINSTANCE.getConfLocType_Fax());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		return getAddressClass().list(Jats1Package.eINSTANCE.getConfLocType_Institution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionWrapType> getInstitutionWrap() {
		return getAddressClass().list(Jats1Package.eINSTANCE.getConfLocType_InstitutionWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhoneType> getPhone() {
		return getAddressClass().list(Jats1Package.eINSTANCE.getConfLocType_Phone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PostalCodeType> getPostalCode() {
		return getAddressClass().list(Jats1Package.eINSTANCE.getConfLocType_PostalCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateType> getState() {
		return getAddressClass().list(Jats1Package.eINSTANCE.getConfLocType_State());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONF_LOC_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONF_LOC_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONF_LOC_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONF_LOC_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONF_LOC_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.CONF_LOC_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONF_LOC_TYPE__ADDRESS_CLASS:
				return ((InternalEList<?>)getAddressClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONF_LOC_TYPE__ADDR_LINE:
				return ((InternalEList<?>)getAddrLine()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONF_LOC_TYPE__CITY:
				return ((InternalEList<?>)getCity()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONF_LOC_TYPE__COUNTRY:
				return ((InternalEList<?>)getCountry()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONF_LOC_TYPE__FAX:
				return ((InternalEList<?>)getFax()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONF_LOC_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONF_LOC_TYPE__INSTITUTION_WRAP:
				return ((InternalEList<?>)getInstitutionWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONF_LOC_TYPE__PHONE:
				return ((InternalEList<?>)getPhone()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONF_LOC_TYPE__POSTAL_CODE:
				return ((InternalEList<?>)getPostalCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONF_LOC_TYPE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.CONF_LOC_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.CONF_LOC_TYPE__ADDRESS_CLASS:
				if (coreType) return getAddressClass();
				return ((FeatureMap.Internal)getAddressClass()).getWrapper();
			case Jats1Package.CONF_LOC_TYPE__ADDR_LINE:
				return getAddrLine();
			case Jats1Package.CONF_LOC_TYPE__CITY:
				return getCity();
			case Jats1Package.CONF_LOC_TYPE__COUNTRY:
				return getCountry();
			case Jats1Package.CONF_LOC_TYPE__FAX:
				return getFax();
			case Jats1Package.CONF_LOC_TYPE__INSTITUTION:
				return getInstitution();
			case Jats1Package.CONF_LOC_TYPE__INSTITUTION_WRAP:
				return getInstitutionWrap();
			case Jats1Package.CONF_LOC_TYPE__PHONE:
				return getPhone();
			case Jats1Package.CONF_LOC_TYPE__POSTAL_CODE:
				return getPostalCode();
			case Jats1Package.CONF_LOC_TYPE__STATE:
				return getState();
			case Jats1Package.CONF_LOC_TYPE__BASE:
				return getBase();
			case Jats1Package.CONF_LOC_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.CONF_LOC_TYPE__ID:
				return getId();
			case Jats1Package.CONF_LOC_TYPE__LANG:
				return getLang();
			case Jats1Package.CONF_LOC_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CONF_LOC_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__ADDRESS_CLASS:
				((FeatureMap.Internal)getAddressClass()).set(newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__ADDR_LINE:
				getAddrLine().clear();
				getAddrLine().addAll((Collection<? extends AddrLineType>)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__CITY:
				getCity().clear();
				getCity().addAll((Collection<? extends CityType>)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends CountryType>)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__FAX:
				getFax().clear();
				getFax().addAll((Collection<? extends FaxType>)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				getInstitutionWrap().addAll((Collection<? extends InstitutionWrapType>)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__PHONE:
				getPhone().clear();
				getPhone().addAll((Collection<? extends PhoneType>)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__POSTAL_CODE:
				getPostalCode().clear();
				getPostalCode().addAll((Collection<? extends PostalCodeType>)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends StateType>)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.CONF_LOC_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CONF_LOC_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__ADDRESS_CLASS:
				getAddressClass().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__ADDR_LINE:
				getAddrLine().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__CITY:
				getCity().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__COUNTRY:
				getCountry().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__FAX:
				getFax().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__PHONE:
				getPhone().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__POSTAL_CODE:
				getPostalCode().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__STATE:
				getState().clear();
				return;
			case Jats1Package.CONF_LOC_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.CONF_LOC_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.CONF_LOC_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.CONF_LOC_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.CONF_LOC_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CONF_LOC_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.CONF_LOC_TYPE__ADDRESS_CLASS:
				return !getAddressClass().isEmpty();
			case Jats1Package.CONF_LOC_TYPE__ADDR_LINE:
				return !getAddrLine().isEmpty();
			case Jats1Package.CONF_LOC_TYPE__CITY:
				return !getCity().isEmpty();
			case Jats1Package.CONF_LOC_TYPE__COUNTRY:
				return !getCountry().isEmpty();
			case Jats1Package.CONF_LOC_TYPE__FAX:
				return !getFax().isEmpty();
			case Jats1Package.CONF_LOC_TYPE__INSTITUTION:
				return !getInstitution().isEmpty();
			case Jats1Package.CONF_LOC_TYPE__INSTITUTION_WRAP:
				return !getInstitutionWrap().isEmpty();
			case Jats1Package.CONF_LOC_TYPE__PHONE:
				return !getPhone().isEmpty();
			case Jats1Package.CONF_LOC_TYPE__POSTAL_CODE:
				return !getPostalCode().isEmpty();
			case Jats1Package.CONF_LOC_TYPE__STATE:
				return !getState().isEmpty();
			case Jats1Package.CONF_LOC_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.CONF_LOC_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.CONF_LOC_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.CONF_LOC_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.CONF_LOC_TYPE__SPECIFIC_USE:
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
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //ConfLocTypeImpl
