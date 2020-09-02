/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AddrLineType;
import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.CityType;
import gov.nih.nlm.ncbi.jats1.CountryType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FaxType;
import gov.nih.nlm.ncbi.jats1.InstitutionType;
import gov.nih.nlm.ncbi.jats1.InstitutionWrapType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.PhoneType;
import gov.nih.nlm.ncbi.jats1.PostalCodeType;
import gov.nih.nlm.ncbi.jats1.StateType;
import gov.nih.nlm.ncbi.jats1.UriType;

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
 * An implementation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getAddressModel <em>Address Model</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getAddrLine <em>Addr Line</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getCity <em>City</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AddressTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressTypeImpl extends MinimalEObjectImpl.Container implements AddressType {
	/**
	 * The cached value of the '{@link #getAddressModel() <em>Address Model</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressModel()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap addressModel;

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
	protected AddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getAddressType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAddressModel() {
		if (addressModel == null) {
			addressModel = new BasicFeatureMap(this, Jats1Package.ADDRESS_TYPE__ADDRESS_MODEL);
		}
		return addressModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddrLineType> getAddrLine() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_AddrLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CityType> getCity() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_City());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CountryType> getCountry() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_Country());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FaxType> getFax() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_Fax());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_Institution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionWrapType> getInstitutionWrap() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_InstitutionWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhoneType> getPhone() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_Phone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PostalCodeType> getPostalCode() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_PostalCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateType> getState() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_State());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getAddressModel().list(Jats1Package.eINSTANCE.getAddressType_Uri());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ADDRESS_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ADDRESS_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ADDRESS_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ADDRESS_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ADDRESS_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ADDRESS_TYPE__ADDRESS_MODEL:
				return ((InternalEList<?>)getAddressModel()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__ADDR_LINE:
				return ((InternalEList<?>)getAddrLine()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__CITY:
				return ((InternalEList<?>)getCity()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__COUNTRY:
				return ((InternalEList<?>)getCountry()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__FAX:
				return ((InternalEList<?>)getFax()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__INSTITUTION_WRAP:
				return ((InternalEList<?>)getInstitutionWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__PHONE:
				return ((InternalEList<?>)getPhone()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__POSTAL_CODE:
				return ((InternalEList<?>)getPostalCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.ADDRESS_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.ADDRESS_TYPE__ADDRESS_MODEL:
				if (coreType) return getAddressModel();
				return ((FeatureMap.Internal)getAddressModel()).getWrapper();
			case Jats1Package.ADDRESS_TYPE__ADDR_LINE:
				return getAddrLine();
			case Jats1Package.ADDRESS_TYPE__CITY:
				return getCity();
			case Jats1Package.ADDRESS_TYPE__COUNTRY:
				return getCountry();
			case Jats1Package.ADDRESS_TYPE__FAX:
				return getFax();
			case Jats1Package.ADDRESS_TYPE__INSTITUTION:
				return getInstitution();
			case Jats1Package.ADDRESS_TYPE__INSTITUTION_WRAP:
				return getInstitutionWrap();
			case Jats1Package.ADDRESS_TYPE__PHONE:
				return getPhone();
			case Jats1Package.ADDRESS_TYPE__POSTAL_CODE:
				return getPostalCode();
			case Jats1Package.ADDRESS_TYPE__STATE:
				return getState();
			case Jats1Package.ADDRESS_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.ADDRESS_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.ADDRESS_TYPE__URI:
				return getUri();
			case Jats1Package.ADDRESS_TYPE__BASE:
				return getBase();
			case Jats1Package.ADDRESS_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.ADDRESS_TYPE__ID:
				return getId();
			case Jats1Package.ADDRESS_TYPE__LANG:
				return getLang();
			case Jats1Package.ADDRESS_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ADDRESS_TYPE__ADDRESS_MODEL:
				((FeatureMap.Internal)getAddressModel()).set(newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__ADDR_LINE:
				getAddrLine().clear();
				getAddrLine().addAll((Collection<? extends AddrLineType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__CITY:
				getCity().clear();
				getCity().addAll((Collection<? extends CityType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends CountryType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__FAX:
				getFax().clear();
				getFax().addAll((Collection<? extends FaxType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				getInstitutionWrap().addAll((Collection<? extends InstitutionWrapType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__PHONE:
				getPhone().clear();
				getPhone().addAll((Collection<? extends PhoneType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__POSTAL_CODE:
				getPostalCode().clear();
				getPostalCode().addAll((Collection<? extends PostalCodeType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends StateType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.ADDRESS_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ADDRESS_TYPE__ADDRESS_MODEL:
				getAddressModel().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__ADDR_LINE:
				getAddrLine().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__CITY:
				getCity().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__COUNTRY:
				getCountry().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__FAX:
				getFax().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__PHONE:
				getPhone().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__POSTAL_CODE:
				getPostalCode().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__STATE:
				getState().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.ADDRESS_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ADDRESS_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.ADDRESS_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.ADDRESS_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.ADDRESS_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ADDRESS_TYPE__ADDRESS_MODEL:
				return addressModel != null && !addressModel.isEmpty();
			case Jats1Package.ADDRESS_TYPE__ADDR_LINE:
				return !getAddrLine().isEmpty();
			case Jats1Package.ADDRESS_TYPE__CITY:
				return !getCity().isEmpty();
			case Jats1Package.ADDRESS_TYPE__COUNTRY:
				return !getCountry().isEmpty();
			case Jats1Package.ADDRESS_TYPE__FAX:
				return !getFax().isEmpty();
			case Jats1Package.ADDRESS_TYPE__INSTITUTION:
				return !getInstitution().isEmpty();
			case Jats1Package.ADDRESS_TYPE__INSTITUTION_WRAP:
				return !getInstitutionWrap().isEmpty();
			case Jats1Package.ADDRESS_TYPE__PHONE:
				return !getPhone().isEmpty();
			case Jats1Package.ADDRESS_TYPE__POSTAL_CODE:
				return !getPostalCode().isEmpty();
			case Jats1Package.ADDRESS_TYPE__STATE:
				return !getState().isEmpty();
			case Jats1Package.ADDRESS_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.ADDRESS_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.ADDRESS_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.ADDRESS_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ADDRESS_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.ADDRESS_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.ADDRESS_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.ADDRESS_TYPE__SPECIFIC_USE:
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
		result.append(" (addressModel: ");
		result.append(addressModel);
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

} //AddressTypeImpl
