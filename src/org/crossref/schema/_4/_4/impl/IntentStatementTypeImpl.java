/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.AType;
import org.crossref.schema._4._4.IntentStatementType;
import org.crossref.schema._4._4.LanguageType;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Statement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.IntentStatementTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.IntentStatementTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.IntentStatementTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.IntentStatementTypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.IntentStatementTypeImpl#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.IntentStatementTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.IntentStatementTypeImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntentStatementTypeImpl extends MinimalEObjectImpl.Container implements IntentStatementType {
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
	protected IntentStatementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getIntentStatementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _4Package.INTENT_STATEMENT_TYPE__MIXED);
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
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(_4Package.eINSTANCE.getIntentStatementType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getB() {
		return getGroup().list(_4Package.eINSTANCE.getIntentStatementType_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getI() {
		return getGroup().list(_4Package.eINSTANCE.getIntentStatementType_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getU() {
		return getGroup().list(_4Package.eINSTANCE.getIntentStatementType_U());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AType> getA() {
		return getGroup().list(_4Package.eINSTANCE.getIntentStatementType_A());
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.INTENT_STATEMENT_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.INTENT_STATEMENT_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
			case _4Package.INTENT_STATEMENT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _4Package.INTENT_STATEMENT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _4Package.INTENT_STATEMENT_TYPE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case _4Package.INTENT_STATEMENT_TYPE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case _4Package.INTENT_STATEMENT_TYPE__U:
				return ((InternalEList<?>)getU()).basicRemove(otherEnd, msgs);
			case _4Package.INTENT_STATEMENT_TYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
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
			case _4Package.INTENT_STATEMENT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _4Package.INTENT_STATEMENT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _4Package.INTENT_STATEMENT_TYPE__B:
				return getB();
			case _4Package.INTENT_STATEMENT_TYPE__I:
				return getI();
			case _4Package.INTENT_STATEMENT_TYPE__U:
				return getU();
			case _4Package.INTENT_STATEMENT_TYPE__A:
				return getA();
			case _4Package.INTENT_STATEMENT_TYPE__LANGUAGE:
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
			case _4Package.INTENT_STATEMENT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _4Package.INTENT_STATEMENT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _4Package.INTENT_STATEMENT_TYPE__B:
				getB().clear();
				getB().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.INTENT_STATEMENT_TYPE__I:
				getI().clear();
				getI().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.INTENT_STATEMENT_TYPE__U:
				getU().clear();
				getU().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.INTENT_STATEMENT_TYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case _4Package.INTENT_STATEMENT_TYPE__LANGUAGE:
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
			case _4Package.INTENT_STATEMENT_TYPE__MIXED:
				getMixed().clear();
				return;
			case _4Package.INTENT_STATEMENT_TYPE__GROUP:
				getGroup().clear();
				return;
			case _4Package.INTENT_STATEMENT_TYPE__B:
				getB().clear();
				return;
			case _4Package.INTENT_STATEMENT_TYPE__I:
				getI().clear();
				return;
			case _4Package.INTENT_STATEMENT_TYPE__U:
				getU().clear();
				return;
			case _4Package.INTENT_STATEMENT_TYPE__A:
				getA().clear();
				return;
			case _4Package.INTENT_STATEMENT_TYPE__LANGUAGE:
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
			case _4Package.INTENT_STATEMENT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _4Package.INTENT_STATEMENT_TYPE__GROUP:
				return !getGroup().isEmpty();
			case _4Package.INTENT_STATEMENT_TYPE__B:
				return !getB().isEmpty();
			case _4Package.INTENT_STATEMENT_TYPE__I:
				return !getI().isEmpty();
			case _4Package.INTENT_STATEMENT_TYPE__U:
				return !getU().isEmpty();
			case _4Package.INTENT_STATEMENT_TYPE__A:
				return !getA().isEmpty();
			case _4Package.INTENT_STATEMENT_TYPE__LANGUAGE:
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

} //IntentStatementTypeImpl
