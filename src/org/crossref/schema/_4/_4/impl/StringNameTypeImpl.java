/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.DegreesType;
import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.NameStyleType1;
import org.crossref.schema._4._4.PrefixType;
import org.crossref.schema._4._4.StringNameType;
import org.crossref.schema._4._4._4Package;

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
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StringNameTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
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
	protected static final NameStyleType1 NAME_STYLE_EDEFAULT = NameStyleType1.WESTERN;

	/**
	 * The cached value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStyle()
	 * @generated
	 * @ordered
	 */
	protected NameStyleType1 nameStyle = NAME_STYLE_EDEFAULT;

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
		return _4Package.eINSTANCE.getStringNameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _4Package.STRING_NAME_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(_4Package.eINSTANCE.getStringNameType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreesType> getDegrees() {
		return getGroup().list(_4Package.eINSTANCE.getStringNameType_Degrees());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getGivenName() {
		return getGroup().list(_4Package.eINSTANCE.getStringNameType_GivenName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrefixType> getPrefix() {
		return getGroup().list(_4Package.eINSTANCE.getStringNameType_Prefix());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSurname() {
		return getGroup().list(_4Package.eINSTANCE.getStringNameType_Surname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSuffix() {
		return getGroup().list(_4Package.eINSTANCE.getStringNameType_Suffix());
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STRING_NAME_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STRING_NAME_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.STRING_NAME_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
	public NameStyleType1 getNameStyle() {
		return nameStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameStyle(NameStyleType1 newNameStyle) {
		NameStyleType1 oldNameStyle = nameStyle;
		nameStyle = newNameStyle == null ? NAME_STYLE_EDEFAULT : newNameStyle;
		boolean oldNameStyleESet = nameStyleESet;
		nameStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STRING_NAME_TYPE__NAME_STYLE, oldNameStyle, nameStyle, !oldNameStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNameStyle() {
		NameStyleType1 oldNameStyle = nameStyle;
		boolean oldNameStyleESet = nameStyleESet;
		nameStyle = NAME_STYLE_EDEFAULT;
		nameStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.STRING_NAME_TYPE__NAME_STYLE, oldNameStyle, NAME_STYLE_EDEFAULT, oldNameStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STRING_NAME_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.STRING_NAME_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _4Package.STRING_NAME_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _4Package.STRING_NAME_TYPE__DEGREES:
				return ((InternalEList<?>)getDegrees()).basicRemove(otherEnd, msgs);
			case _4Package.STRING_NAME_TYPE__PREFIX:
				return ((InternalEList<?>)getPrefix()).basicRemove(otherEnd, msgs);
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
			case _4Package.STRING_NAME_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _4Package.STRING_NAME_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _4Package.STRING_NAME_TYPE__DEGREES:
				return getDegrees();
			case _4Package.STRING_NAME_TYPE__GIVEN_NAME:
				return getGivenName();
			case _4Package.STRING_NAME_TYPE__PREFIX:
				return getPrefix();
			case _4Package.STRING_NAME_TYPE__SURNAME:
				return getSurname();
			case _4Package.STRING_NAME_TYPE__SUFFIX:
				return getSuffix();
			case _4Package.STRING_NAME_TYPE__CONTENT_TYPE:
				return getContentType();
			case _4Package.STRING_NAME_TYPE__LANGUAGE:
				return getLanguage();
			case _4Package.STRING_NAME_TYPE__NAME_STYLE:
				return getNameStyle();
			case _4Package.STRING_NAME_TYPE__SPECIFIC_USE:
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
			case _4Package.STRING_NAME_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _4Package.STRING_NAME_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _4Package.STRING_NAME_TYPE__DEGREES:
				getDegrees().clear();
				getDegrees().addAll((Collection<? extends DegreesType>)newValue);
				return;
			case _4Package.STRING_NAME_TYPE__GIVEN_NAME:
				getGivenName().clear();
				getGivenName().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.STRING_NAME_TYPE__PREFIX:
				getPrefix().clear();
				getPrefix().addAll((Collection<? extends PrefixType>)newValue);
				return;
			case _4Package.STRING_NAME_TYPE__SURNAME:
				getSurname().clear();
				getSurname().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.STRING_NAME_TYPE__SUFFIX:
				getSuffix().clear();
				getSuffix().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.STRING_NAME_TYPE__CONTENT_TYPE:
				setContentType(newValue);
				return;
			case _4Package.STRING_NAME_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _4Package.STRING_NAME_TYPE__NAME_STYLE:
				setNameStyle((NameStyleType1)newValue);
				return;
			case _4Package.STRING_NAME_TYPE__SPECIFIC_USE:
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
			case _4Package.STRING_NAME_TYPE__MIXED:
				getMixed().clear();
				return;
			case _4Package.STRING_NAME_TYPE__GROUP:
				getGroup().clear();
				return;
			case _4Package.STRING_NAME_TYPE__DEGREES:
				getDegrees().clear();
				return;
			case _4Package.STRING_NAME_TYPE__GIVEN_NAME:
				getGivenName().clear();
				return;
			case _4Package.STRING_NAME_TYPE__PREFIX:
				getPrefix().clear();
				return;
			case _4Package.STRING_NAME_TYPE__SURNAME:
				getSurname().clear();
				return;
			case _4Package.STRING_NAME_TYPE__SUFFIX:
				getSuffix().clear();
				return;
			case _4Package.STRING_NAME_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case _4Package.STRING_NAME_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case _4Package.STRING_NAME_TYPE__NAME_STYLE:
				unsetNameStyle();
				return;
			case _4Package.STRING_NAME_TYPE__SPECIFIC_USE:
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
			case _4Package.STRING_NAME_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _4Package.STRING_NAME_TYPE__GROUP:
				return !getGroup().isEmpty();
			case _4Package.STRING_NAME_TYPE__DEGREES:
				return !getDegrees().isEmpty();
			case _4Package.STRING_NAME_TYPE__GIVEN_NAME:
				return !getGivenName().isEmpty();
			case _4Package.STRING_NAME_TYPE__PREFIX:
				return !getPrefix().isEmpty();
			case _4Package.STRING_NAME_TYPE__SURNAME:
				return !getSurname().isEmpty();
			case _4Package.STRING_NAME_TYPE__SUFFIX:
				return !getSuffix().isEmpty();
			case _4Package.STRING_NAME_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case _4Package.STRING_NAME_TYPE__LANGUAGE:
				return isSetLanguage();
			case _4Package.STRING_NAME_TYPE__NAME_STYLE:
				return isSetNameStyle();
			case _4Package.STRING_NAME_TYPE__SPECIFIC_USE:
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

} //StringNameTypeImpl
