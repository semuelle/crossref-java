/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.OriginalLanguageTitleType;
import org.crossref.schema._4._4.XrefFaces;
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

import org.w3._1998.math.math.ml.MathType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Original Language Title Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getFaceMarkup <em>Face Markup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OriginalLanguageTitleTypeImpl extends MinimalEObjectImpl.Container implements OriginalLanguageTitleType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OriginalLanguageTitleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getOriginalLanguageTitleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFaceMarkup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(_4Package.eINSTANCE.getOriginalLanguageTitleType_FaceMarkup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getB() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getI() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getEm() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getStrong() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getU() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_U());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getOvl() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_Ovl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getSup() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getSub() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getScp() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_Scp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getTt() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getFont() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_Font());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getOriginalLanguageTitleType_Math());
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__FACE_MARKUP:
				return ((InternalEList<?>)getFaceMarkup()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__U:
				return ((InternalEList<?>)getU()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__OVL:
				return ((InternalEList<?>)getOvl()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SCP:
				return ((InternalEList<?>)getScp()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__FONT:
				return ((InternalEList<?>)getFont()).basicRemove(otherEnd, msgs);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
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
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__FACE_MARKUP:
				if (coreType) return getFaceMarkup();
				return ((FeatureMap.Internal)getFaceMarkup()).getWrapper();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__B:
				return getB();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__I:
				return getI();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__EM:
				return getEm();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__STRONG:
				return getStrong();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__U:
				return getU();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__OVL:
				return getOvl();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SUP:
				return getSup();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SUB:
				return getSub();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SCP:
				return getScp();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__TT:
				return getTt();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__FONT:
				return getFont();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MATH:
				return getMath();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__LANGUAGE:
				return getLanguage();
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
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__FACE_MARKUP:
				((FeatureMap.Internal)getFaceMarkup()).set(newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__B:
				getB().clear();
				getB().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__I:
				getI().clear();
				getI().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__U:
				getU().clear();
				getU().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__OVL:
				getOvl().clear();
				getOvl().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SCP:
				getScp().clear();
				getScp().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__FONT:
				getFont().clear();
				getFont().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
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
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MIXED:
				getMixed().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__FACE_MARKUP:
				getFaceMarkup().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__B:
				getB().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__I:
				getI().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__EM:
				getEm().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__STRONG:
				getStrong().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__U:
				getU().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__OVL:
				getOvl().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SUP:
				getSup().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SUB:
				getSub().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SCP:
				getScp().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__TT:
				getTt().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__FONT:
				getFont().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MATH:
				getMath().clear();
				return;
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__LANGUAGE:
				unsetLanguage();
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
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__FACE_MARKUP:
				return !getFaceMarkup().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__B:
				return !getB().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__I:
				return !getI().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__EM:
				return !getEm().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__STRONG:
				return !getStrong().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__U:
				return !getU().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__OVL:
				return !getOvl().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SUP:
				return !getSup().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SUB:
				return !getSub().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__SCP:
				return !getScp().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__TT:
				return !getTt().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__FONT:
				return !getFont().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__MATH:
				return !getMath().isEmpty();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE__LANGUAGE:
				return isSetLanguage();
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
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OriginalLanguageTitleTypeImpl
