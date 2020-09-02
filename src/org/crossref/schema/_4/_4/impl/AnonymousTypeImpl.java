/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.AnonymousType;
import org.crossref.schema._4._4.ContributorRoleType;
import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.NameStyleType;
import org.crossref.schema._4._4.SequenceType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.AnonymousTypeImpl#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AnonymousTypeImpl#getContributorRole <em>Contributor Role</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AnonymousTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AnonymousTypeImpl#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AnonymousTypeImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousTypeImpl extends MinimalEObjectImpl.Container implements AnonymousType {
	/**
	 * The cached value of the '{@link #getAffiliation() <em>Affiliation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> affiliation;

	/**
	 * The default value of the '{@link #getContributorRole() <em>Contributor Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributorRole()
	 * @generated
	 * @ordered
	 */
	protected static final ContributorRoleType CONTRIBUTOR_ROLE_EDEFAULT = ContributorRoleType.AUTHOR;

	/**
	 * The cached value of the '{@link #getContributorRole() <em>Contributor Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributorRole()
	 * @generated
	 * @ordered
	 */
	protected ContributorRoleType contributorRole = CONTRIBUTOR_ROLE_EDEFAULT;

	/**
	 * This is true if the Contributor Role attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contributorRoleESet;

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
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final SequenceType SEQUENCE_EDEFAULT = SequenceType.FIRST;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected SequenceType sequence = SEQUENCE_EDEFAULT;

	/**
	 * This is true if the Sequence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getAnonymousType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAffiliation() {
		if (affiliation == null) {
			affiliation = new EDataTypeEList<String>(String.class, this, _4Package.ANONYMOUS_TYPE__AFFILIATION);
		}
		return affiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContributorRoleType getContributorRole() {
		return contributorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContributorRole(ContributorRoleType newContributorRole) {
		ContributorRoleType oldContributorRole = contributorRole;
		contributorRole = newContributorRole == null ? CONTRIBUTOR_ROLE_EDEFAULT : newContributorRole;
		boolean oldContributorRoleESet = contributorRoleESet;
		contributorRoleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ANONYMOUS_TYPE__CONTRIBUTOR_ROLE, oldContributorRole, contributorRole, !oldContributorRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetContributorRole() {
		ContributorRoleType oldContributorRole = contributorRole;
		boolean oldContributorRoleESet = contributorRoleESet;
		contributorRole = CONTRIBUTOR_ROLE_EDEFAULT;
		contributorRoleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.ANONYMOUS_TYPE__CONTRIBUTOR_ROLE, oldContributorRole, CONTRIBUTOR_ROLE_EDEFAULT, oldContributorRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContributorRole() {
		return contributorRoleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ANONYMOUS_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.ANONYMOUS_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ANONYMOUS_TYPE__NAME_STYLE, oldNameStyle, nameStyle, !oldNameStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.ANONYMOUS_TYPE__NAME_STYLE, oldNameStyle, NAME_STYLE_EDEFAULT, oldNameStyleESet));
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
	public SequenceType getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequence(SequenceType newSequence) {
		SequenceType oldSequence = sequence;
		sequence = newSequence == null ? SEQUENCE_EDEFAULT : newSequence;
		boolean oldSequenceESet = sequenceESet;
		sequenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ANONYMOUS_TYPE__SEQUENCE, oldSequence, sequence, !oldSequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSequence() {
		SequenceType oldSequence = sequence;
		boolean oldSequenceESet = sequenceESet;
		sequence = SEQUENCE_EDEFAULT;
		sequenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.ANONYMOUS_TYPE__SEQUENCE, oldSequence, SEQUENCE_EDEFAULT, oldSequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSequence() {
		return sequenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.ANONYMOUS_TYPE__AFFILIATION:
				return getAffiliation();
			case _4Package.ANONYMOUS_TYPE__CONTRIBUTOR_ROLE:
				return getContributorRole();
			case _4Package.ANONYMOUS_TYPE__LANGUAGE:
				return getLanguage();
			case _4Package.ANONYMOUS_TYPE__NAME_STYLE:
				return getNameStyle();
			case _4Package.ANONYMOUS_TYPE__SEQUENCE:
				return getSequence();
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
			case _4Package.ANONYMOUS_TYPE__AFFILIATION:
				getAffiliation().clear();
				getAffiliation().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.ANONYMOUS_TYPE__CONTRIBUTOR_ROLE:
				setContributorRole((ContributorRoleType)newValue);
				return;
			case _4Package.ANONYMOUS_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _4Package.ANONYMOUS_TYPE__NAME_STYLE:
				setNameStyle((NameStyleType)newValue);
				return;
			case _4Package.ANONYMOUS_TYPE__SEQUENCE:
				setSequence((SequenceType)newValue);
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
			case _4Package.ANONYMOUS_TYPE__AFFILIATION:
				getAffiliation().clear();
				return;
			case _4Package.ANONYMOUS_TYPE__CONTRIBUTOR_ROLE:
				unsetContributorRole();
				return;
			case _4Package.ANONYMOUS_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case _4Package.ANONYMOUS_TYPE__NAME_STYLE:
				unsetNameStyle();
				return;
			case _4Package.ANONYMOUS_TYPE__SEQUENCE:
				unsetSequence();
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
			case _4Package.ANONYMOUS_TYPE__AFFILIATION:
				return affiliation != null && !affiliation.isEmpty();
			case _4Package.ANONYMOUS_TYPE__CONTRIBUTOR_ROLE:
				return isSetContributorRole();
			case _4Package.ANONYMOUS_TYPE__LANGUAGE:
				return isSetLanguage();
			case _4Package.ANONYMOUS_TYPE__NAME_STYLE:
				return isSetNameStyle();
			case _4Package.ANONYMOUS_TYPE__SEQUENCE:
				return isSetSequence();
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
		result.append(" (affiliation: ");
		result.append(affiliation);
		result.append(", contributorRole: ");
		if (contributorRoleESet) result.append(contributorRole); else result.append("<unset>");
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", nameStyle: ");
		if (nameStyleESet) result.append(nameStyle); else result.append("<unset>");
		result.append(", sequence: ");
		if (sequenceESet) result.append(sequence); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AnonymousTypeImpl
