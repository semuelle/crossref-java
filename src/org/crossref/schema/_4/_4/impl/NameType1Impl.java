/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.NameStyleType2;
import org.crossref.schema._4._4.NameType1;
import org.crossref.schema._4._4.PrefixType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.NameType1Impl#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.NameType1Impl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.NameType1Impl#getGivenName1 <em>Given Name1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.NameType1Impl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.NameType1Impl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.NameType1Impl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.NameType1Impl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.NameType1Impl#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.NameType1Impl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameType1Impl extends MinimalEObjectImpl.Container implements NameType1 {
	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected String givenName = GIVEN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGivenName1() <em>Given Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName1()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGivenName1() <em>Given Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName1()
	 * @generated
	 * @ordered
	 */
	protected String givenName1 = GIVEN_NAME1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected PrefixType prefix;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Object contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final LanguageType LANGUAGE_EDEFAULT = LanguageType.AA;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LanguageType language = LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean languageESet;

	/**
	 * The default value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStyle()
	 * @generated
	 * @ordered
	 */
	protected static final NameStyleType2 NAME_STYLE_EDEFAULT = NameStyleType2.WESTERN;

	/**
	 * The cached value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStyle()
	 * @generated
	 * @ordered
	 */
	protected NameStyleType2 nameStyle = NAME_STYLE_EDEFAULT;

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
	protected static final Object SPECIFIC_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected Object specificUse = SPECIFIC_USE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getNameType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.NAME_TYPE1__SURNAME, oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGivenName() {
		return givenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGivenName(String newGivenName) {
		String oldGivenName = givenName;
		givenName = newGivenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.NAME_TYPE1__GIVEN_NAME, oldGivenName, givenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGivenName1() {
		return givenName1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGivenName1(String newGivenName1) {
		String oldGivenName1 = givenName1;
		givenName1 = newGivenName1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.NAME_TYPE1__GIVEN_NAME1, oldGivenName1, givenName1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixType getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(PrefixType newPrefix, NotificationChain msgs) {
		PrefixType oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.NAME_TYPE1__PREFIX, oldPrefix, newPrefix);
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
	public void setPrefix(PrefixType newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.NAME_TYPE1__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.NAME_TYPE1__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.NAME_TYPE1__PREFIX, newPrefix, newPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffix(String newSuffix) {
		String oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.NAME_TYPE1__SUFFIX, oldSuffix, suffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(Object newContentType) {
		Object oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.NAME_TYPE1__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageType getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(LanguageType newLanguage) {
		LanguageType oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		boolean oldLanguageESet = languageESet;
		languageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.NAME_TYPE1__LANGUAGE, oldLanguage, language, !oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLanguage() {
		LanguageType oldLanguage = language;
		boolean oldLanguageESet = languageESet;
		language = LANGUAGE_EDEFAULT;
		languageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.NAME_TYPE1__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLanguage() {
		return languageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameStyleType2 getNameStyle() {
		return nameStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameStyle(NameStyleType2 newNameStyle) {
		NameStyleType2 oldNameStyle = nameStyle;
		nameStyle = newNameStyle == null ? NAME_STYLE_EDEFAULT : newNameStyle;
		boolean oldNameStyleESet = nameStyleESet;
		nameStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.NAME_TYPE1__NAME_STYLE, oldNameStyle, nameStyle, !oldNameStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNameStyle() {
		NameStyleType2 oldNameStyle = nameStyle;
		boolean oldNameStyleESet = nameStyleESet;
		nameStyle = NAME_STYLE_EDEFAULT;
		nameStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.NAME_TYPE1__NAME_STYLE, oldNameStyle, NAME_STYLE_EDEFAULT, oldNameStyleESet));
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
	public Object getSpecificUse() {
		return specificUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecificUse(Object newSpecificUse) {
		Object oldSpecificUse = specificUse;
		specificUse = newSpecificUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.NAME_TYPE1__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.NAME_TYPE1__PREFIX:
				return basicSetPrefix(null, msgs);
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
			case _4Package.NAME_TYPE1__SURNAME:
				return getSurname();
			case _4Package.NAME_TYPE1__GIVEN_NAME:
				return getGivenName();
			case _4Package.NAME_TYPE1__GIVEN_NAME1:
				return getGivenName1();
			case _4Package.NAME_TYPE1__PREFIX:
				return getPrefix();
			case _4Package.NAME_TYPE1__SUFFIX:
				return getSuffix();
			case _4Package.NAME_TYPE1__CONTENT_TYPE:
				return getContentType();
			case _4Package.NAME_TYPE1__LANGUAGE:
				return getLanguage();
			case _4Package.NAME_TYPE1__NAME_STYLE:
				return getNameStyle();
			case _4Package.NAME_TYPE1__SPECIFIC_USE:
				return getSpecificUse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _4Package.NAME_TYPE1__SURNAME:
				setSurname((String)newValue);
				return;
			case _4Package.NAME_TYPE1__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case _4Package.NAME_TYPE1__GIVEN_NAME1:
				setGivenName1((String)newValue);
				return;
			case _4Package.NAME_TYPE1__PREFIX:
				setPrefix((PrefixType)newValue);
				return;
			case _4Package.NAME_TYPE1__SUFFIX:
				setSuffix((String)newValue);
				return;
			case _4Package.NAME_TYPE1__CONTENT_TYPE:
				setContentType(newValue);
				return;
			case _4Package.NAME_TYPE1__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _4Package.NAME_TYPE1__NAME_STYLE:
				setNameStyle((NameStyleType2)newValue);
				return;
			case _4Package.NAME_TYPE1__SPECIFIC_USE:
				setSpecificUse(newValue);
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
			case _4Package.NAME_TYPE1__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case _4Package.NAME_TYPE1__GIVEN_NAME:
				setGivenName(GIVEN_NAME_EDEFAULT);
				return;
			case _4Package.NAME_TYPE1__GIVEN_NAME1:
				setGivenName1(GIVEN_NAME1_EDEFAULT);
				return;
			case _4Package.NAME_TYPE1__PREFIX:
				setPrefix((PrefixType)null);
				return;
			case _4Package.NAME_TYPE1__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
				return;
			case _4Package.NAME_TYPE1__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case _4Package.NAME_TYPE1__LANGUAGE:
				unsetLanguage();
				return;
			case _4Package.NAME_TYPE1__NAME_STYLE:
				unsetNameStyle();
				return;
			case _4Package.NAME_TYPE1__SPECIFIC_USE:
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
			case _4Package.NAME_TYPE1__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case _4Package.NAME_TYPE1__GIVEN_NAME:
				return GIVEN_NAME_EDEFAULT == null ? givenName != null : !GIVEN_NAME_EDEFAULT.equals(givenName);
			case _4Package.NAME_TYPE1__GIVEN_NAME1:
				return GIVEN_NAME1_EDEFAULT == null ? givenName1 != null : !GIVEN_NAME1_EDEFAULT.equals(givenName1);
			case _4Package.NAME_TYPE1__PREFIX:
				return prefix != null;
			case _4Package.NAME_TYPE1__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
			case _4Package.NAME_TYPE1__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case _4Package.NAME_TYPE1__LANGUAGE:
				return isSetLanguage();
			case _4Package.NAME_TYPE1__NAME_STYLE:
				return isSetNameStyle();
			case _4Package.NAME_TYPE1__SPECIFIC_USE:
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
		result.append(" (surname: ");
		result.append(surname);
		result.append(", givenName: ");
		result.append(givenName);
		result.append(", givenName1: ");
		result.append(givenName1);
		result.append(", suffix: ");
		result.append(suffix);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", nameStyle: ");
		if (nameStyleESet) result.append(nameStyle); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //NameType1Impl
