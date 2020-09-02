/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.ArchiveLocationsType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.DoiDataType;
import org.crossref.schema._4._4.JournalIssueType;
import org.crossref.schema._4._4.JournalVolumeType;
import org.crossref.schema._4._4.PublicationDateType;
import org.crossref.schema._4._4.TitlesType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journal Issue Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalIssueTypeImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalIssueTypeImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalIssueTypeImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalIssueTypeImpl#getJournalVolume <em>Journal Volume</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalIssueTypeImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalIssueTypeImpl#getSpecialNumbering <em>Special Numbering</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalIssueTypeImpl#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalIssueTypeImpl#getDoiData <em>Doi Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JournalIssueTypeImpl extends MinimalEObjectImpl.Container implements JournalIssueType {
	/**
	 * The cached value of the '{@link #getContributors() <em>Contributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors()
	 * @generated
	 * @ordered
	 */
	protected ContributorsType contributors;

	/**
	 * The cached value of the '{@link #getTitles() <em>Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitles()
	 * @generated
	 * @ordered
	 */
	protected TitlesType titles;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<PublicationDateType> publicationDate;

	/**
	 * The cached value of the '{@link #getJournalVolume() <em>Journal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalVolume()
	 * @generated
	 * @ordered
	 */
	protected JournalVolumeType journalVolume;

	/**
	 * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected String issue = ISSUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecialNumbering() <em>Special Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialNumbering()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_NUMBERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialNumbering() <em>Special Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialNumbering()
	 * @generated
	 * @ordered
	 */
	protected String specialNumbering = SPECIAL_NUMBERING_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JournalIssueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getJournalIssueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContributorsType getContributors() {
		return contributors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributors(ContributorsType newContributors, NotificationChain msgs) {
		ContributorsType oldContributors = contributors;
		contributors = newContributors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__CONTRIBUTORS, oldContributors, newContributors);
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
	public void setContributors(ContributorsType newContributors) {
		if (newContributors != contributors) {
			NotificationChain msgs = null;
			if (contributors != null)
				msgs = ((InternalEObject)contributors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_ISSUE_TYPE__CONTRIBUTORS, null, msgs);
			if (newContributors != null)
				msgs = ((InternalEObject)newContributors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_ISSUE_TYPE__CONTRIBUTORS, null, msgs);
			msgs = basicSetContributors(newContributors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__CONTRIBUTORS, newContributors, newContributors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitlesType getTitles() {
		return titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitles(TitlesType newTitles, NotificationChain msgs) {
		TitlesType oldTitles = titles;
		titles = newTitles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__TITLES, oldTitles, newTitles);
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
	public void setTitles(TitlesType newTitles) {
		if (newTitles != titles) {
			NotificationChain msgs = null;
			if (titles != null)
				msgs = ((InternalEObject)titles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_ISSUE_TYPE__TITLES, null, msgs);
			if (newTitles != null)
				msgs = ((InternalEObject)newTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_ISSUE_TYPE__TITLES, null, msgs);
			msgs = basicSetTitles(newTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__TITLES, newTitles, newTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublicationDateType> getPublicationDate() {
		if (publicationDate == null) {
			publicationDate = new EObjectContainmentEList<PublicationDateType>(PublicationDateType.class, this, _4Package.JOURNAL_ISSUE_TYPE__PUBLICATION_DATE);
		}
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalVolumeType getJournalVolume() {
		return journalVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalVolume(JournalVolumeType newJournalVolume, NotificationChain msgs) {
		JournalVolumeType oldJournalVolume = journalVolume;
		journalVolume = newJournalVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__JOURNAL_VOLUME, oldJournalVolume, newJournalVolume);
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
	public void setJournalVolume(JournalVolumeType newJournalVolume) {
		if (newJournalVolume != journalVolume) {
			NotificationChain msgs = null;
			if (journalVolume != null)
				msgs = ((InternalEObject)journalVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_ISSUE_TYPE__JOURNAL_VOLUME, null, msgs);
			if (newJournalVolume != null)
				msgs = ((InternalEObject)newJournalVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_ISSUE_TYPE__JOURNAL_VOLUME, null, msgs);
			msgs = basicSetJournalVolume(newJournalVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__JOURNAL_VOLUME, newJournalVolume, newJournalVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssue(String newIssue) {
		String oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__ISSUE, oldIssue, issue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecialNumbering() {
		return specialNumbering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialNumbering(String newSpecialNumbering) {
		String oldSpecialNumbering = specialNumbering;
		specialNumbering = newSpecialNumbering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__SPECIAL_NUMBERING, oldSpecialNumbering, specialNumbering));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__ARCHIVE_LOCATIONS, oldArchiveLocations, newArchiveLocations);
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
				msgs = ((InternalEObject)archiveLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_ISSUE_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			if (newArchiveLocations != null)
				msgs = ((InternalEObject)newArchiveLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_ISSUE_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			msgs = basicSetArchiveLocations(newArchiveLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__ARCHIVE_LOCATIONS, newArchiveLocations, newArchiveLocations));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__DOI_DATA, oldDoiData, newDoiData);
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
				msgs = ((InternalEObject)doiData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_ISSUE_TYPE__DOI_DATA, null, msgs);
			if (newDoiData != null)
				msgs = ((InternalEObject)newDoiData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_ISSUE_TYPE__DOI_DATA, null, msgs);
			msgs = basicSetDoiData(newDoiData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_ISSUE_TYPE__DOI_DATA, newDoiData, newDoiData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.JOURNAL_ISSUE_TYPE__CONTRIBUTORS:
				return basicSetContributors(null, msgs);
			case _4Package.JOURNAL_ISSUE_TYPE__TITLES:
				return basicSetTitles(null, msgs);
			case _4Package.JOURNAL_ISSUE_TYPE__PUBLICATION_DATE:
				return ((InternalEList<?>)getPublicationDate()).basicRemove(otherEnd, msgs);
			case _4Package.JOURNAL_ISSUE_TYPE__JOURNAL_VOLUME:
				return basicSetJournalVolume(null, msgs);
			case _4Package.JOURNAL_ISSUE_TYPE__ARCHIVE_LOCATIONS:
				return basicSetArchiveLocations(null, msgs);
			case _4Package.JOURNAL_ISSUE_TYPE__DOI_DATA:
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
			case _4Package.JOURNAL_ISSUE_TYPE__CONTRIBUTORS:
				return getContributors();
			case _4Package.JOURNAL_ISSUE_TYPE__TITLES:
				return getTitles();
			case _4Package.JOURNAL_ISSUE_TYPE__PUBLICATION_DATE:
				return getPublicationDate();
			case _4Package.JOURNAL_ISSUE_TYPE__JOURNAL_VOLUME:
				return getJournalVolume();
			case _4Package.JOURNAL_ISSUE_TYPE__ISSUE:
				return getIssue();
			case _4Package.JOURNAL_ISSUE_TYPE__SPECIAL_NUMBERING:
				return getSpecialNumbering();
			case _4Package.JOURNAL_ISSUE_TYPE__ARCHIVE_LOCATIONS:
				return getArchiveLocations();
			case _4Package.JOURNAL_ISSUE_TYPE__DOI_DATA:
				return getDoiData();
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
			case _4Package.JOURNAL_ISSUE_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)newValue);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__TITLES:
				setTitles((TitlesType)newValue);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__PUBLICATION_DATE:
				getPublicationDate().clear();
				getPublicationDate().addAll((Collection<? extends PublicationDateType>)newValue);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__JOURNAL_VOLUME:
				setJournalVolume((JournalVolumeType)newValue);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__ISSUE:
				setIssue((String)newValue);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__SPECIAL_NUMBERING:
				setSpecialNumbering((String)newValue);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)newValue);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__DOI_DATA:
				setDoiData((DoiDataType)newValue);
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
			case _4Package.JOURNAL_ISSUE_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)null);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__TITLES:
				setTitles((TitlesType)null);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__PUBLICATION_DATE:
				getPublicationDate().clear();
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__JOURNAL_VOLUME:
				setJournalVolume((JournalVolumeType)null);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__SPECIAL_NUMBERING:
				setSpecialNumbering(SPECIAL_NUMBERING_EDEFAULT);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)null);
				return;
			case _4Package.JOURNAL_ISSUE_TYPE__DOI_DATA:
				setDoiData((DoiDataType)null);
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
			case _4Package.JOURNAL_ISSUE_TYPE__CONTRIBUTORS:
				return contributors != null;
			case _4Package.JOURNAL_ISSUE_TYPE__TITLES:
				return titles != null;
			case _4Package.JOURNAL_ISSUE_TYPE__PUBLICATION_DATE:
				return publicationDate != null && !publicationDate.isEmpty();
			case _4Package.JOURNAL_ISSUE_TYPE__JOURNAL_VOLUME:
				return journalVolume != null;
			case _4Package.JOURNAL_ISSUE_TYPE__ISSUE:
				return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
			case _4Package.JOURNAL_ISSUE_TYPE__SPECIAL_NUMBERING:
				return SPECIAL_NUMBERING_EDEFAULT == null ? specialNumbering != null : !SPECIAL_NUMBERING_EDEFAULT.equals(specialNumbering);
			case _4Package.JOURNAL_ISSUE_TYPE__ARCHIVE_LOCATIONS:
				return archiveLocations != null;
			case _4Package.JOURNAL_ISSUE_TYPE__DOI_DATA:
				return doiData != null;
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
		result.append(" (issue: ");
		result.append(issue);
		result.append(", specialNumbering: ");
		result.append(specialNumbering);
		result.append(')');
		return result.toString();
	}

} //JournalIssueTypeImpl
