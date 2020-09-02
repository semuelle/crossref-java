/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.DegreesType;
import gov.nih.nlm.ncbi.jats1.GivenNamesType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.NameStyleType;
import gov.nih.nlm.ncbi.jats1.PrefixType;
import gov.nih.nlm.ncbi.jats1.StringNameType;
import gov.nih.nlm.ncbi.jats1.SuffixType;
import gov.nih.nlm.ncbi.jats1.SurnameType;

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
 * An implementation of the model object '<em><b>String Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getPersonNameClass <em>Person Name Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getGivenNames <em>Given Names</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringNameTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringNameTypeImpl extends MinimalEObjectImpl.Container implements StringNameType {
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
	 * The default value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStyle()
	 * @generated
	 * @ordered
	 */
	protected static final NameStyleType NAME_STYLE_EDEFAULT = NameStyleType.WESTERN;

	/**
	 * The cached value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStyle()
	 * @generated
	 * @ordered
	 */
	protected NameStyleType nameStyle = NAME_STYLE_EDEFAULT;

	/**
	 * This is true if the Name Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameStyleESet;

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
	protected StringNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getStringNameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.STRING_NAME_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPersonNameClass() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getStringNameType_PersonNameClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreesType> getDegrees() {
		return getPersonNameClass().list(Jats1Package.eINSTANCE.getStringNameType_Degrees());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GivenNamesType> getGivenNames() {
		return getPersonNameClass().list(Jats1Package.eINSTANCE.getStringNameType_GivenNames());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrefixType> getPrefix() {
		return getPersonNameClass().list(Jats1Package.eINSTANCE.getStringNameType_Prefix());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SurnameType> getSurname() {
		return getPersonNameClass().list(Jats1Package.eINSTANCE.getStringNameType_Surname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuffixType> getSuffix() {
		return getPersonNameClass().list(Jats1Package.eINSTANCE.getStringNameType_Suffix());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_NAME_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_NAME_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_NAME_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_NAME_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameStyleType getNameStyle() {
		return nameStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameStyle(NameStyleType newNameStyle) {
		NameStyleType oldNameStyle = nameStyle;
		nameStyle = newNameStyle == null ? NAME_STYLE_EDEFAULT : newNameStyle;
		boolean oldNameStyleESet = nameStyleESet;
		nameStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_NAME_TYPE__NAME_STYLE, oldNameStyle, nameStyle, !oldNameStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNameStyle() {
		NameStyleType oldNameStyle = nameStyle;
		boolean oldNameStyleESet = nameStyleESet;
		nameStyle = NAME_STYLE_EDEFAULT;
		nameStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.STRING_NAME_TYPE__NAME_STYLE, oldNameStyle, NAME_STYLE_EDEFAULT, oldNameStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNameStyle() {
		return nameStyleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_NAME_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.STRING_NAME_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_NAME_TYPE__PERSON_NAME_CLASS:
				return ((InternalEList<?>)getPersonNameClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_NAME_TYPE__DEGREES:
				return ((InternalEList<?>)getDegrees()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_NAME_TYPE__GIVEN_NAMES:
				return ((InternalEList<?>)getGivenNames()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_NAME_TYPE__PREFIX:
				return ((InternalEList<?>)getPrefix()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_NAME_TYPE__SURNAME:
				return ((InternalEList<?>)getSurname()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_NAME_TYPE__SUFFIX:
				return ((InternalEList<?>)getSuffix()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.STRING_NAME_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.STRING_NAME_TYPE__PERSON_NAME_CLASS:
				if (coreType) return getPersonNameClass();
				return ((FeatureMap.Internal)getPersonNameClass()).getWrapper();
			case Jats1Package.STRING_NAME_TYPE__DEGREES:
				return getDegrees();
			case Jats1Package.STRING_NAME_TYPE__GIVEN_NAMES:
				return getGivenNames();
			case Jats1Package.STRING_NAME_TYPE__PREFIX:
				return getPrefix();
			case Jats1Package.STRING_NAME_TYPE__SURNAME:
				return getSurname();
			case Jats1Package.STRING_NAME_TYPE__SUFFIX:
				return getSuffix();
			case Jats1Package.STRING_NAME_TYPE__BASE:
				return getBase();
			case Jats1Package.STRING_NAME_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.STRING_NAME_TYPE__ID:
				return getId();
			case Jats1Package.STRING_NAME_TYPE__LANG:
				return getLang();
			case Jats1Package.STRING_NAME_TYPE__NAME_STYLE:
				return getNameStyle();
			case Jats1Package.STRING_NAME_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STRING_NAME_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__PERSON_NAME_CLASS:
				((FeatureMap.Internal)getPersonNameClass()).set(newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__DEGREES:
				getDegrees().clear();
				getDegrees().addAll((Collection<? extends DegreesType>)newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__GIVEN_NAMES:
				getGivenNames().clear();
				getGivenNames().addAll((Collection<? extends GivenNamesType>)newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__PREFIX:
				getPrefix().clear();
				getPrefix().addAll((Collection<? extends PrefixType>)newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__SURNAME:
				getSurname().clear();
				getSurname().addAll((Collection<? extends SurnameType>)newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__SUFFIX:
				getSuffix().clear();
				getSuffix().addAll((Collection<? extends SuffixType>)newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__NAME_STYLE:
				setNameStyle((NameStyleType)newValue);
				return;
			case Jats1Package.STRING_NAME_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STRING_NAME_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.STRING_NAME_TYPE__PERSON_NAME_CLASS:
				getPersonNameClass().clear();
				return;
			case Jats1Package.STRING_NAME_TYPE__DEGREES:
				getDegrees().clear();
				return;
			case Jats1Package.STRING_NAME_TYPE__GIVEN_NAMES:
				getGivenNames().clear();
				return;
			case Jats1Package.STRING_NAME_TYPE__PREFIX:
				getPrefix().clear();
				return;
			case Jats1Package.STRING_NAME_TYPE__SURNAME:
				getSurname().clear();
				return;
			case Jats1Package.STRING_NAME_TYPE__SUFFIX:
				getSuffix().clear();
				return;
			case Jats1Package.STRING_NAME_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.STRING_NAME_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.STRING_NAME_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.STRING_NAME_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.STRING_NAME_TYPE__NAME_STYLE:
				unsetNameStyle();
				return;
			case Jats1Package.STRING_NAME_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STRING_NAME_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.STRING_NAME_TYPE__PERSON_NAME_CLASS:
				return !getPersonNameClass().isEmpty();
			case Jats1Package.STRING_NAME_TYPE__DEGREES:
				return !getDegrees().isEmpty();
			case Jats1Package.STRING_NAME_TYPE__GIVEN_NAMES:
				return !getGivenNames().isEmpty();
			case Jats1Package.STRING_NAME_TYPE__PREFIX:
				return !getPrefix().isEmpty();
			case Jats1Package.STRING_NAME_TYPE__SURNAME:
				return !getSurname().isEmpty();
			case Jats1Package.STRING_NAME_TYPE__SUFFIX:
				return !getSuffix().isEmpty();
			case Jats1Package.STRING_NAME_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.STRING_NAME_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.STRING_NAME_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.STRING_NAME_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.STRING_NAME_TYPE__NAME_STYLE:
				return isSetNameStyle();
			case Jats1Package.STRING_NAME_TYPE__SPECIFIC_USE:
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
		result.append(", nameStyle: ");
		if (nameStyleESet) result.append(nameStyle); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //StringNameTypeImpl
