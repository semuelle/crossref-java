/**
 */
package org.crossref.relations.impl;

import java.util.Collection;

import org.crossref.relations.DescriptionType;
import org.crossref.relations.LanguageType;
import org.crossref.relations.RelationsPackage;
import org.crossref.relations.XrefFaces;

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
 * An implementation of the model object '<em><b>Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getFaceMarkup <em>Face Markup</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DescriptionTypeImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionTypeImpl extends MinimalEObjectImpl.Container implements DescriptionType {
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
	protected DescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.DESCRIPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, RelationsPackage.DESCRIPTION_TYPE__MIXED);
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
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(RelationsPackage.Literals.DESCRIPTION_TYPE__FACE_MARKUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getB() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getI() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__I);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getEm() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__EM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getStrong() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__STRONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getU() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__U);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getOvl() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__OVL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getSup() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__SUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getSub() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getScp() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__SCP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getTt() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__TT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getFont() {
		return getFaceMarkup().list(RelationsPackage.Literals.DESCRIPTION_TYPE__FONT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.DESCRIPTION_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RelationsPackage.DESCRIPTION_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
			case RelationsPackage.DESCRIPTION_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__FACE_MARKUP:
				return ((InternalEList<?>)getFaceMarkup()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__U:
				return ((InternalEList<?>)getU()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__OVL:
				return ((InternalEList<?>)getOvl()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__SCP:
				return ((InternalEList<?>)getScp()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DESCRIPTION_TYPE__FONT:
				return ((InternalEList<?>)getFont()).basicRemove(otherEnd, msgs);
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
			case RelationsPackage.DESCRIPTION_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case RelationsPackage.DESCRIPTION_TYPE__FACE_MARKUP:
				if (coreType) return getFaceMarkup();
				return ((FeatureMap.Internal)getFaceMarkup()).getWrapper();
			case RelationsPackage.DESCRIPTION_TYPE__B:
				return getB();
			case RelationsPackage.DESCRIPTION_TYPE__I:
				return getI();
			case RelationsPackage.DESCRIPTION_TYPE__EM:
				return getEm();
			case RelationsPackage.DESCRIPTION_TYPE__STRONG:
				return getStrong();
			case RelationsPackage.DESCRIPTION_TYPE__U:
				return getU();
			case RelationsPackage.DESCRIPTION_TYPE__OVL:
				return getOvl();
			case RelationsPackage.DESCRIPTION_TYPE__SUP:
				return getSup();
			case RelationsPackage.DESCRIPTION_TYPE__SUB:
				return getSub();
			case RelationsPackage.DESCRIPTION_TYPE__SCP:
				return getScp();
			case RelationsPackage.DESCRIPTION_TYPE__TT:
				return getTt();
			case RelationsPackage.DESCRIPTION_TYPE__FONT:
				return getFont();
			case RelationsPackage.DESCRIPTION_TYPE__LANGUAGE:
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
			case RelationsPackage.DESCRIPTION_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__FACE_MARKUP:
				((FeatureMap.Internal)getFaceMarkup()).set(newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__B:
				getB().clear();
				getB().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__I:
				getI().clear();
				getI().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__U:
				getU().clear();
				getU().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__OVL:
				getOvl().clear();
				getOvl().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__SCP:
				getScp().clear();
				getScp().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__FONT:
				getFont().clear();
				getFont().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case RelationsPackage.DESCRIPTION_TYPE__LANGUAGE:
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
			case RelationsPackage.DESCRIPTION_TYPE__MIXED:
				getMixed().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__FACE_MARKUP:
				getFaceMarkup().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__B:
				getB().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__I:
				getI().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__EM:
				getEm().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__STRONG:
				getStrong().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__U:
				getU().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__OVL:
				getOvl().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__SUP:
				getSup().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__SUB:
				getSub().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__SCP:
				getScp().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__TT:
				getTt().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__FONT:
				getFont().clear();
				return;
			case RelationsPackage.DESCRIPTION_TYPE__LANGUAGE:
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
			case RelationsPackage.DESCRIPTION_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__FACE_MARKUP:
				return !getFaceMarkup().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__B:
				return !getB().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__I:
				return !getI().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__EM:
				return !getEm().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__STRONG:
				return !getStrong().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__U:
				return !getU().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__OVL:
				return !getOvl().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__SUP:
				return !getSup().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__SUB:
				return !getSub().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__SCP:
				return !getScp().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__TT:
				return !getTt().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__FONT:
				return !getFont().isEmpty();
			case RelationsPackage.DESCRIPTION_TYPE__LANGUAGE:
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

} //DescriptionTypeImpl
