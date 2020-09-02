/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.ArchiveLocationsType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.DoiDataType;
import org.crossref.schema._4._4.IsbnType;
import org.crossref.schema._4._4.NoisbnType;
import org.crossref.schema._4._4.PublisherItemType;
import org.crossref.schema._4._4.SetMetadataType;
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
 * An implementation of the model object '<em><b>Set Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.SetMetadataTypeImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SetMetadataTypeImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SetMetadataTypeImpl#getNoisbn <em>Noisbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SetMetadataTypeImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SetMetadataTypeImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SetMetadataTypeImpl#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SetMetadataTypeImpl#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SetMetadataTypeImpl#getDoiData <em>Doi Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetMetadataTypeImpl extends MinimalEObjectImpl.Container implements SetMetadataType {
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
	 * The cached value of the '{@link #getIsbn() <em>Isbn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected EList<IsbnType> isbn;

	/**
	 * The cached value of the '{@link #getNoisbn() <em>Noisbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoisbn()
	 * @generated
	 * @ordered
	 */
	protected NoisbnType noisbn;

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
	 * The default value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected String partNumber = PART_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublisherItem() <em>Publisher Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherItem()
	 * @generated
	 * @ordered
	 */
	protected PublisherItemType publisherItem;

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
	protected SetMetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getSetMetadataType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__TITLES, oldTitles, newTitles);
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
				msgs = ((InternalEObject)titles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__TITLES, null, msgs);
			if (newTitles != null)
				msgs = ((InternalEObject)newTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__TITLES, null, msgs);
			msgs = basicSetTitles(newTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__TITLES, newTitles, newTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IsbnType> getIsbn() {
		if (isbn == null) {
			isbn = new EObjectContainmentEList<IsbnType>(IsbnType.class, this, _4Package.SET_METADATA_TYPE__ISBN);
		}
		return isbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoisbnType getNoisbn() {
		return noisbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoisbn(NoisbnType newNoisbn, NotificationChain msgs) {
		NoisbnType oldNoisbn = noisbn;
		noisbn = newNoisbn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__NOISBN, oldNoisbn, newNoisbn);
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
	public void setNoisbn(NoisbnType newNoisbn) {
		if (newNoisbn != noisbn) {
			NotificationChain msgs = null;
			if (noisbn != null)
				msgs = ((InternalEObject)noisbn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__NOISBN, null, msgs);
			if (newNoisbn != null)
				msgs = ((InternalEObject)newNoisbn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__NOISBN, null, msgs);
			msgs = basicSetNoisbn(newNoisbn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__NOISBN, newNoisbn, newNoisbn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__CONTRIBUTORS, oldContributors, newContributors);
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
				msgs = ((InternalEObject)contributors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__CONTRIBUTORS, null, msgs);
			if (newContributors != null)
				msgs = ((InternalEObject)newContributors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__CONTRIBUTORS, null, msgs);
			msgs = basicSetContributors(newContributors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__CONTRIBUTORS, newContributors, newContributors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartNumber(String newPartNumber) {
		String oldPartNumber = partNumber;
		partNumber = newPartNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__PART_NUMBER, oldPartNumber, partNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherItemType getPublisherItem() {
		return publisherItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisherItem(PublisherItemType newPublisherItem, NotificationChain msgs) {
		PublisherItemType oldPublisherItem = publisherItem;
		publisherItem = newPublisherItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__PUBLISHER_ITEM, oldPublisherItem, newPublisherItem);
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
	public void setPublisherItem(PublisherItemType newPublisherItem) {
		if (newPublisherItem != publisherItem) {
			NotificationChain msgs = null;
			if (publisherItem != null)
				msgs = ((InternalEObject)publisherItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__PUBLISHER_ITEM, null, msgs);
			if (newPublisherItem != null)
				msgs = ((InternalEObject)newPublisherItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__PUBLISHER_ITEM, null, msgs);
			msgs = basicSetPublisherItem(newPublisherItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__PUBLISHER_ITEM, newPublisherItem, newPublisherItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__ARCHIVE_LOCATIONS, oldArchiveLocations, newArchiveLocations);
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
				msgs = ((InternalEObject)archiveLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			if (newArchiveLocations != null)
				msgs = ((InternalEObject)newArchiveLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			msgs = basicSetArchiveLocations(newArchiveLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__ARCHIVE_LOCATIONS, newArchiveLocations, newArchiveLocations));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__DOI_DATA, oldDoiData, newDoiData);
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
				msgs = ((InternalEObject)doiData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__DOI_DATA, null, msgs);
			if (newDoiData != null)
				msgs = ((InternalEObject)newDoiData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SET_METADATA_TYPE__DOI_DATA, null, msgs);
			msgs = basicSetDoiData(newDoiData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SET_METADATA_TYPE__DOI_DATA, newDoiData, newDoiData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.SET_METADATA_TYPE__TITLES:
				return basicSetTitles(null, msgs);
			case _4Package.SET_METADATA_TYPE__ISBN:
				return ((InternalEList<?>)getIsbn()).basicRemove(otherEnd, msgs);
			case _4Package.SET_METADATA_TYPE__NOISBN:
				return basicSetNoisbn(null, msgs);
			case _4Package.SET_METADATA_TYPE__CONTRIBUTORS:
				return basicSetContributors(null, msgs);
			case _4Package.SET_METADATA_TYPE__PUBLISHER_ITEM:
				return basicSetPublisherItem(null, msgs);
			case _4Package.SET_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return basicSetArchiveLocations(null, msgs);
			case _4Package.SET_METADATA_TYPE__DOI_DATA:
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
			case _4Package.SET_METADATA_TYPE__TITLES:
				return getTitles();
			case _4Package.SET_METADATA_TYPE__ISBN:
				return getIsbn();
			case _4Package.SET_METADATA_TYPE__NOISBN:
				return getNoisbn();
			case _4Package.SET_METADATA_TYPE__CONTRIBUTORS:
				return getContributors();
			case _4Package.SET_METADATA_TYPE__PART_NUMBER:
				return getPartNumber();
			case _4Package.SET_METADATA_TYPE__PUBLISHER_ITEM:
				return getPublisherItem();
			case _4Package.SET_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return getArchiveLocations();
			case _4Package.SET_METADATA_TYPE__DOI_DATA:
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
			case _4Package.SET_METADATA_TYPE__TITLES:
				setTitles((TitlesType)newValue);
				return;
			case _4Package.SET_METADATA_TYPE__ISBN:
				getIsbn().clear();
				getIsbn().addAll((Collection<? extends IsbnType>)newValue);
				return;
			case _4Package.SET_METADATA_TYPE__NOISBN:
				setNoisbn((NoisbnType)newValue);
				return;
			case _4Package.SET_METADATA_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)newValue);
				return;
			case _4Package.SET_METADATA_TYPE__PART_NUMBER:
				setPartNumber((String)newValue);
				return;
			case _4Package.SET_METADATA_TYPE__PUBLISHER_ITEM:
				setPublisherItem((PublisherItemType)newValue);
				return;
			case _4Package.SET_METADATA_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)newValue);
				return;
			case _4Package.SET_METADATA_TYPE__DOI_DATA:
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
			case _4Package.SET_METADATA_TYPE__TITLES:
				setTitles((TitlesType)null);
				return;
			case _4Package.SET_METADATA_TYPE__ISBN:
				getIsbn().clear();
				return;
			case _4Package.SET_METADATA_TYPE__NOISBN:
				setNoisbn((NoisbnType)null);
				return;
			case _4Package.SET_METADATA_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)null);
				return;
			case _4Package.SET_METADATA_TYPE__PART_NUMBER:
				setPartNumber(PART_NUMBER_EDEFAULT);
				return;
			case _4Package.SET_METADATA_TYPE__PUBLISHER_ITEM:
				setPublisherItem((PublisherItemType)null);
				return;
			case _4Package.SET_METADATA_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)null);
				return;
			case _4Package.SET_METADATA_TYPE__DOI_DATA:
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
			case _4Package.SET_METADATA_TYPE__TITLES:
				return titles != null;
			case _4Package.SET_METADATA_TYPE__ISBN:
				return isbn != null && !isbn.isEmpty();
			case _4Package.SET_METADATA_TYPE__NOISBN:
				return noisbn != null;
			case _4Package.SET_METADATA_TYPE__CONTRIBUTORS:
				return contributors != null;
			case _4Package.SET_METADATA_TYPE__PART_NUMBER:
				return PART_NUMBER_EDEFAULT == null ? partNumber != null : !PART_NUMBER_EDEFAULT.equals(partNumber);
			case _4Package.SET_METADATA_TYPE__PUBLISHER_ITEM:
				return publisherItem != null;
			case _4Package.SET_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return archiveLocations != null;
			case _4Package.SET_METADATA_TYPE__DOI_DATA:
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
		result.append(" (partNumber: ");
		result.append(partNumber);
		result.append(')');
		return result.toString();
	}

} //SetMetadataTypeImpl
