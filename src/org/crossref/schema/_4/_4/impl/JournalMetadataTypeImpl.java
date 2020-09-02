/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.ArchiveLocationsType;
import org.crossref.schema._4._4.DoiDataType;
import org.crossref.schema._4._4.IssnType;
import org.crossref.schema._4._4.JournalMetadataType;
import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.ReferenceDistributionOptsType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journal Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalMetadataTypeImpl#getFullTitle <em>Full Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalMetadataTypeImpl#getAbbrevTitle <em>Abbrev Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalMetadataTypeImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalMetadataTypeImpl#getCoden <em>Coden</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalMetadataTypeImpl#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalMetadataTypeImpl#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalMetadataTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalMetadataTypeImpl#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JournalMetadataTypeImpl extends MinimalEObjectImpl.Container implements JournalMetadataType {
	/**
	 * The cached value of the '{@link #getFullTitle() <em>Full Title</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fullTitle;

	/**
	 * The cached value of the '{@link #getAbbrevTitle() <em>Abbrev Title</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbrevTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<String> abbrevTitle;

	/**
	 * The cached value of the '{@link #getIssn() <em>Issn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssn()
	 * @generated
	 * @ordered
	 */
	protected EList<IssnType> issn;

	/**
	 * The default value of the '{@link #getCoden() <em>Coden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoden()
	 * @generated
	 * @ordered
	 */
	protected static final String CODEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoden() <em>Coden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoden()
	 * @generated
	 * @ordered
	 */
	protected String coden = CODEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArchiveLocations() <em>Archive Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveLocations()
	 * @generated
	 * @ordered
	 */
	protected ArchiveLocationsType archiveLocations;

	/**
	 * The cached value of the '{@link #getDoiData() <em>Doi Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoiData()
	 * @generated
	 * @ordered
	 */
	protected DoiDataType doiData;

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
	 * The default value of the '{@link #getReferenceDistributionOpts() <em>Reference Distribution Opts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDistributionOpts()
	 * @generated
	 * @ordered
	 */
	protected static final ReferenceDistributionOptsType REFERENCE_DISTRIBUTION_OPTS_EDEFAULT = ReferenceDistributionOptsType.NONE;

	/**
	 * The cached value of the '{@link #getReferenceDistributionOpts() <em>Reference Distribution Opts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDistributionOpts()
	 * @generated
	 * @ordered
	 */
	protected ReferenceDistributionOptsType referenceDistributionOpts = REFERENCE_DISTRIBUTION_OPTS_EDEFAULT;

	/**
	 * This is true if the Reference Distribution Opts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceDistributionOptsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JournalMetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getJournalMetadataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFullTitle() {
		if (fullTitle == null) {
			fullTitle = new EDataTypeEList<String>(String.class, this, _4Package.JOURNAL_METADATA_TYPE__FULL_TITLE);
		}
		return fullTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAbbrevTitle() {
		if (abbrevTitle == null) {
			abbrevTitle = new EDataTypeEList<String>(String.class, this, _4Package.JOURNAL_METADATA_TYPE__ABBREV_TITLE);
		}
		return abbrevTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssnType> getIssn() {
		if (issn == null) {
			issn = new EObjectContainmentEList<IssnType>(IssnType.class, this, _4Package.JOURNAL_METADATA_TYPE__ISSN);
		}
		return issn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCoden() {
		return coden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoden(String newCoden) {
		String oldCoden = coden;
		coden = newCoden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_METADATA_TYPE__CODEN, oldCoden, coden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchiveLocationsType getArchiveLocations() {
		return archiveLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchiveLocations(ArchiveLocationsType newArchiveLocations, NotificationChain msgs) {
		ArchiveLocationsType oldArchiveLocations = archiveLocations;
		archiveLocations = newArchiveLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_METADATA_TYPE__ARCHIVE_LOCATIONS, oldArchiveLocations, newArchiveLocations);
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
	public void setArchiveLocations(ArchiveLocationsType newArchiveLocations) {
		if (newArchiveLocations != archiveLocations) {
			NotificationChain msgs = null;
			if (archiveLocations != null)
				msgs = ((InternalEObject)archiveLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_METADATA_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			if (newArchiveLocations != null)
				msgs = ((InternalEObject)newArchiveLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_METADATA_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			msgs = basicSetArchiveLocations(newArchiveLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_METADATA_TYPE__ARCHIVE_LOCATIONS, newArchiveLocations, newArchiveLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoiDataType getDoiData() {
		return doiData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoiData(DoiDataType newDoiData, NotificationChain msgs) {
		DoiDataType oldDoiData = doiData;
		doiData = newDoiData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_METADATA_TYPE__DOI_DATA, oldDoiData, newDoiData);
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
	public void setDoiData(DoiDataType newDoiData) {
		if (newDoiData != doiData) {
			NotificationChain msgs = null;
			if (doiData != null)
				msgs = ((InternalEObject)doiData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_METADATA_TYPE__DOI_DATA, null, msgs);
			if (newDoiData != null)
				msgs = ((InternalEObject)newDoiData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_METADATA_TYPE__DOI_DATA, null, msgs);
			msgs = basicSetDoiData(newDoiData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_METADATA_TYPE__DOI_DATA, newDoiData, newDoiData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_METADATA_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.JOURNAL_METADATA_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
	public ReferenceDistributionOptsType getReferenceDistributionOpts() {
		return referenceDistributionOpts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceDistributionOpts(ReferenceDistributionOptsType newReferenceDistributionOpts) {
		ReferenceDistributionOptsType oldReferenceDistributionOpts = referenceDistributionOpts;
		referenceDistributionOpts = newReferenceDistributionOpts == null ? REFERENCE_DISTRIBUTION_OPTS_EDEFAULT : newReferenceDistributionOpts;
		boolean oldReferenceDistributionOptsESet = referenceDistributionOptsESet;
		referenceDistributionOptsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS, oldReferenceDistributionOpts, referenceDistributionOpts, !oldReferenceDistributionOptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReferenceDistributionOpts() {
		ReferenceDistributionOptsType oldReferenceDistributionOpts = referenceDistributionOpts;
		boolean oldReferenceDistributionOptsESet = referenceDistributionOptsESet;
		referenceDistributionOpts = REFERENCE_DISTRIBUTION_OPTS_EDEFAULT;
		referenceDistributionOptsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.JOURNAL_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS, oldReferenceDistributionOpts, REFERENCE_DISTRIBUTION_OPTS_EDEFAULT, oldReferenceDistributionOptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReferenceDistributionOpts() {
		return referenceDistributionOptsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.JOURNAL_METADATA_TYPE__ISSN:
				return ((InternalEList<?>)getIssn()).basicRemove(otherEnd, msgs);
			case _4Package.JOURNAL_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return basicSetArchiveLocations(null, msgs);
			case _4Package.JOURNAL_METADATA_TYPE__DOI_DATA:
				return basicSetDoiData(null, msgs);
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
			case _4Package.JOURNAL_METADATA_TYPE__FULL_TITLE:
				return getFullTitle();
			case _4Package.JOURNAL_METADATA_TYPE__ABBREV_TITLE:
				return getAbbrevTitle();
			case _4Package.JOURNAL_METADATA_TYPE__ISSN:
				return getIssn();
			case _4Package.JOURNAL_METADATA_TYPE__CODEN:
				return getCoden();
			case _4Package.JOURNAL_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return getArchiveLocations();
			case _4Package.JOURNAL_METADATA_TYPE__DOI_DATA:
				return getDoiData();
			case _4Package.JOURNAL_METADATA_TYPE__LANGUAGE:
				return getLanguage();
			case _4Package.JOURNAL_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS:
				return getReferenceDistributionOpts();
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
			case _4Package.JOURNAL_METADATA_TYPE__FULL_TITLE:
				getFullTitle().clear();
				getFullTitle().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.JOURNAL_METADATA_TYPE__ABBREV_TITLE:
				getAbbrevTitle().clear();
				getAbbrevTitle().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.JOURNAL_METADATA_TYPE__ISSN:
				getIssn().clear();
				getIssn().addAll((Collection<? extends IssnType>)newValue);
				return;
			case _4Package.JOURNAL_METADATA_TYPE__CODEN:
				setCoden((String)newValue);
				return;
			case _4Package.JOURNAL_METADATA_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)newValue);
				return;
			case _4Package.JOURNAL_METADATA_TYPE__DOI_DATA:
				setDoiData((DoiDataType)newValue);
				return;
			case _4Package.JOURNAL_METADATA_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _4Package.JOURNAL_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS:
				setReferenceDistributionOpts((ReferenceDistributionOptsType)newValue);
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
			case _4Package.JOURNAL_METADATA_TYPE__FULL_TITLE:
				getFullTitle().clear();
				return;
			case _4Package.JOURNAL_METADATA_TYPE__ABBREV_TITLE:
				getAbbrevTitle().clear();
				return;
			case _4Package.JOURNAL_METADATA_TYPE__ISSN:
				getIssn().clear();
				return;
			case _4Package.JOURNAL_METADATA_TYPE__CODEN:
				setCoden(CODEN_EDEFAULT);
				return;
			case _4Package.JOURNAL_METADATA_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)null);
				return;
			case _4Package.JOURNAL_METADATA_TYPE__DOI_DATA:
				setDoiData((DoiDataType)null);
				return;
			case _4Package.JOURNAL_METADATA_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case _4Package.JOURNAL_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS:
				unsetReferenceDistributionOpts();
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
			case _4Package.JOURNAL_METADATA_TYPE__FULL_TITLE:
				return fullTitle != null && !fullTitle.isEmpty();
			case _4Package.JOURNAL_METADATA_TYPE__ABBREV_TITLE:
				return abbrevTitle != null && !abbrevTitle.isEmpty();
			case _4Package.JOURNAL_METADATA_TYPE__ISSN:
				return issn != null && !issn.isEmpty();
			case _4Package.JOURNAL_METADATA_TYPE__CODEN:
				return CODEN_EDEFAULT == null ? coden != null : !CODEN_EDEFAULT.equals(coden);
			case _4Package.JOURNAL_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return archiveLocations != null;
			case _4Package.JOURNAL_METADATA_TYPE__DOI_DATA:
				return doiData != null;
			case _4Package.JOURNAL_METADATA_TYPE__LANGUAGE:
				return isSetLanguage();
			case _4Package.JOURNAL_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS:
				return isSetReferenceDistributionOpts();
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
		result.append(" (fullTitle: ");
		result.append(fullTitle);
		result.append(", abbrevTitle: ");
		result.append(abbrevTitle);
		result.append(", coden: ");
		result.append(coden);
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", referenceDistributionOpts: ");
		if (referenceDistributionOptsESet) result.append(referenceDistributionOpts); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //JournalMetadataTypeImpl
