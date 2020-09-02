/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.AltNameType;
import org.crossref.schema._4._4.ContributorRoleType;
import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.NameStyleType;
import org.crossref.schema._4._4.ORCIDType;
import org.crossref.schema._4._4.PersonNameType;
import org.crossref.schema._4._4.SequenceType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl#getORCID <em>ORCID</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl#getAltName <em>Alt Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl#getContributorRole <em>Contributor Role</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonNameTypeImpl extends MinimalEObjectImpl.Container implements PersonNameType {
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
	 * The cached value of the '{@link #getAffiliation() <em>Affiliation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> affiliation;

	/**
	 * The cached value of the '{@link #getORCID() <em>ORCID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORCID()
	 * @generated
	 * @ordered
	 */
	protected ORCIDType oRCID;

	/**
	 * The cached value of the '{@link #getAltName() <em>Alt Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltName()
	 * @generated
	 * @ordered
	 */
	protected AltNameType altName;

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
	protected PersonNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getPersonNameType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__GIVEN_NAME, oldGivenName, givenName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__SURNAME, oldSurname, surname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__SUFFIX, oldSuffix, suffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAffiliation() {
		if (affiliation == null) {
			affiliation = new EDataTypeEList<String>(String.class, this, _4Package.PERSON_NAME_TYPE__AFFILIATION);
		}
		return affiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ORCIDType getORCID() {
		return oRCID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORCID(ORCIDType newORCID, NotificationChain msgs) {
		ORCIDType oldORCID = oRCID;
		oRCID = newORCID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__ORCID, oldORCID, newORCID);
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
	public void setORCID(ORCIDType newORCID) {
		if (newORCID != oRCID) {
			NotificationChain msgs = null;
			if (oRCID != null)
				msgs = ((InternalEObject)oRCID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PERSON_NAME_TYPE__ORCID, null, msgs);
			if (newORCID != null)
				msgs = ((InternalEObject)newORCID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PERSON_NAME_TYPE__ORCID, null, msgs);
			msgs = basicSetORCID(newORCID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__ORCID, newORCID, newORCID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltNameType getAltName() {
		return altName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltName(AltNameType newAltName, NotificationChain msgs) {
		AltNameType oldAltName = altName;
		altName = newAltName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__ALT_NAME, oldAltName, newAltName);
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
	public void setAltName(AltNameType newAltName) {
		if (newAltName != altName) {
			NotificationChain msgs = null;
			if (altName != null)
				msgs = ((InternalEObject)altName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PERSON_NAME_TYPE__ALT_NAME, null, msgs);
			if (newAltName != null)
				msgs = ((InternalEObject)newAltName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PERSON_NAME_TYPE__ALT_NAME, null, msgs);
			msgs = basicSetAltName(newAltName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__ALT_NAME, newAltName, newAltName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__CONTRIBUTOR_ROLE, oldContributorRole, contributorRole, !oldContributorRoleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PERSON_NAME_TYPE__CONTRIBUTOR_ROLE, oldContributorRole, CONTRIBUTOR_ROLE_EDEFAULT, oldContributorRoleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PERSON_NAME_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__NAME_STYLE, oldNameStyle, nameStyle, !oldNameStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PERSON_NAME_TYPE__NAME_STYLE, oldNameStyle, NAME_STYLE_EDEFAULT, oldNameStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PERSON_NAME_TYPE__SEQUENCE, oldSequence, sequence, !oldSequenceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PERSON_NAME_TYPE__SEQUENCE, oldSequence, SEQUENCE_EDEFAULT, oldSequenceESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.PERSON_NAME_TYPE__ORCID:
				return basicSetORCID(null, msgs);
			case _4Package.PERSON_NAME_TYPE__ALT_NAME:
				return basicSetAltName(null, msgs);
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
			case _4Package.PERSON_NAME_TYPE__GIVEN_NAME:
				return getGivenName();
			case _4Package.PERSON_NAME_TYPE__SURNAME:
				return getSurname();
			case _4Package.PERSON_NAME_TYPE__SUFFIX:
				return getSuffix();
			case _4Package.PERSON_NAME_TYPE__AFFILIATION:
				return getAffiliation();
			case _4Package.PERSON_NAME_TYPE__ORCID:
				return getORCID();
			case _4Package.PERSON_NAME_TYPE__ALT_NAME:
				return getAltName();
			case _4Package.PERSON_NAME_TYPE__CONTRIBUTOR_ROLE:
				return getContributorRole();
			case _4Package.PERSON_NAME_TYPE__LANGUAGE:
				return getLanguage();
			case _4Package.PERSON_NAME_TYPE__NAME_STYLE:
				return getNameStyle();
			case _4Package.PERSON_NAME_TYPE__SEQUENCE:
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
			case _4Package.PERSON_NAME_TYPE__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case _4Package.PERSON_NAME_TYPE__SURNAME:
				setSurname((String)newValue);
				return;
			case _4Package.PERSON_NAME_TYPE__SUFFIX:
				setSuffix((String)newValue);
				return;
			case _4Package.PERSON_NAME_TYPE__AFFILIATION:
				getAffiliation().clear();
				getAffiliation().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.PERSON_NAME_TYPE__ORCID:
				setORCID((ORCIDType)newValue);
				return;
			case _4Package.PERSON_NAME_TYPE__ALT_NAME:
				setAltName((AltNameType)newValue);
				return;
			case _4Package.PERSON_NAME_TYPE__CONTRIBUTOR_ROLE:
				setContributorRole((ContributorRoleType)newValue);
				return;
			case _4Package.PERSON_NAME_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _4Package.PERSON_NAME_TYPE__NAME_STYLE:
				setNameStyle((NameStyleType)newValue);
				return;
			case _4Package.PERSON_NAME_TYPE__SEQUENCE:
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
			case _4Package.PERSON_NAME_TYPE__GIVEN_NAME:
				setGivenName(GIVEN_NAME_EDEFAULT);
				return;
			case _4Package.PERSON_NAME_TYPE__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case _4Package.PERSON_NAME_TYPE__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
				return;
			case _4Package.PERSON_NAME_TYPE__AFFILIATION:
				getAffiliation().clear();
				return;
			case _4Package.PERSON_NAME_TYPE__ORCID:
				setORCID((ORCIDType)null);
				return;
			case _4Package.PERSON_NAME_TYPE__ALT_NAME:
				setAltName((AltNameType)null);
				return;
			case _4Package.PERSON_NAME_TYPE__CONTRIBUTOR_ROLE:
				unsetContributorRole();
				return;
			case _4Package.PERSON_NAME_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case _4Package.PERSON_NAME_TYPE__NAME_STYLE:
				unsetNameStyle();
				return;
			case _4Package.PERSON_NAME_TYPE__SEQUENCE:
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
			case _4Package.PERSON_NAME_TYPE__GIVEN_NAME:
				return GIVEN_NAME_EDEFAULT == null ? givenName != null : !GIVEN_NAME_EDEFAULT.equals(givenName);
			case _4Package.PERSON_NAME_TYPE__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case _4Package.PERSON_NAME_TYPE__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
			case _4Package.PERSON_NAME_TYPE__AFFILIATION:
				return affiliation != null && !affiliation.isEmpty();
			case _4Package.PERSON_NAME_TYPE__ORCID:
				return oRCID != null;
			case _4Package.PERSON_NAME_TYPE__ALT_NAME:
				return altName != null;
			case _4Package.PERSON_NAME_TYPE__CONTRIBUTOR_ROLE:
				return isSetContributorRole();
			case _4Package.PERSON_NAME_TYPE__LANGUAGE:
				return isSetLanguage();
			case _4Package.PERSON_NAME_TYPE__NAME_STYLE:
				return isSetNameStyle();
			case _4Package.PERSON_NAME_TYPE__SEQUENCE:
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
		result.append(" (givenName: ");
		result.append(givenName);
		result.append(", surname: ");
		result.append(surname);
		result.append(", suffix: ");
		result.append(suffix);
		result.append(", affiliation: ");
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

} //PersonNameTypeImpl
