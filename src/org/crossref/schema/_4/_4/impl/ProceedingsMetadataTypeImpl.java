/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.ArchiveLocationsType;
import org.crossref.schema._4._4.DoiDataType;
import org.crossref.schema._4._4.IsbnType;
import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.NoisbnType;
import org.crossref.schema._4._4.ProceedingsMetadataType;
import org.crossref.schema._4._4.PublicationDateType;
import org.crossref.schema._4._4.PublisherItemType;
import org.crossref.schema._4._4.PublisherType;
import org.crossref.schema._4._4.ReferenceDistributionOptsType;
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
 * An implementation of the model object '<em><b>Proceedings Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getProceedingsTitle <em>Proceedings Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getProceedingsSubject <em>Proceedings Subject</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getNoisbn <em>Noisbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProceedingsMetadataTypeImpl extends MinimalEObjectImpl.Container implements ProceedingsMetadataType {
	/**
	 * The default value of the '{@link #getProceedingsTitle() <em>Proceedings Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedingsTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEEDINGS_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProceedingsTitle() <em>Proceedings Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedingsTitle()
	 * @generated
	 * @ordered
	 */
	protected String proceedingsTitle = PROCEEDINGS_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProceedingsSubject() <em>Proceedings Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedingsSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEEDINGS_SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProceedingsSubject() <em>Proceedings Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedingsSubject()
	 * @generated
	 * @ordered
	 */
	protected String proceedingsSubject = PROCEEDINGS_SUBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected EList<PublisherType> publisher;

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
	protected ProceedingsMetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getProceedingsMetadataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProceedingsTitle() {
		return proceedingsTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProceedingsTitle(String newProceedingsTitle) {
		String oldProceedingsTitle = proceedingsTitle;
		proceedingsTitle = newProceedingsTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_TITLE, oldProceedingsTitle, proceedingsTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProceedingsSubject() {
		return proceedingsSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProceedingsSubject(String newProceedingsSubject) {
		String oldProceedingsSubject = proceedingsSubject;
		proceedingsSubject = newProceedingsSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_SUBJECT, oldProceedingsSubject, proceedingsSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublisherType> getPublisher() {
		if (publisher == null) {
			publisher = new EObjectContainmentEList<PublisherType>(PublisherType.class, this, _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER);
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublicationDateType> getPublicationDate() {
		if (publicationDate == null) {
			publicationDate = new EObjectContainmentEList<PublicationDateType>(PublicationDateType.class, this, _4Package.PROCEEDINGS_METADATA_TYPE__PUBLICATION_DATE);
		}
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IsbnType> getIsbn() {
		if (isbn == null) {
			isbn = new EObjectContainmentEList<IsbnType>(IsbnType.class, this, _4Package.PROCEEDINGS_METADATA_TYPE__ISBN);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__NOISBN, oldNoisbn, newNoisbn);
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
				msgs = ((InternalEObject)noisbn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PROCEEDINGS_METADATA_TYPE__NOISBN, null, msgs);
			if (newNoisbn != null)
				msgs = ((InternalEObject)newNoisbn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PROCEEDINGS_METADATA_TYPE__NOISBN, null, msgs);
			msgs = basicSetNoisbn(newNoisbn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__NOISBN, newNoisbn, newNoisbn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER_ITEM, oldPublisherItem, newPublisherItem);
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
				msgs = ((InternalEObject)publisherItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER_ITEM, null, msgs);
			if (newPublisherItem != null)
				msgs = ((InternalEObject)newPublisherItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER_ITEM, null, msgs);
			msgs = basicSetPublisherItem(newPublisherItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER_ITEM, newPublisherItem, newPublisherItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__ARCHIVE_LOCATIONS, oldArchiveLocations, newArchiveLocations);
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
				msgs = ((InternalEObject)archiveLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PROCEEDINGS_METADATA_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			if (newArchiveLocations != null)
				msgs = ((InternalEObject)newArchiveLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PROCEEDINGS_METADATA_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			msgs = basicSetArchiveLocations(newArchiveLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__ARCHIVE_LOCATIONS, newArchiveLocations, newArchiveLocations));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__DOI_DATA, oldDoiData, newDoiData);
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
				msgs = ((InternalEObject)doiData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PROCEEDINGS_METADATA_TYPE__DOI_DATA, null, msgs);
			if (newDoiData != null)
				msgs = ((InternalEObject)newDoiData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PROCEEDINGS_METADATA_TYPE__DOI_DATA, null, msgs);
			msgs = basicSetDoiData(newDoiData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__DOI_DATA, newDoiData, newDoiData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PROCEEDINGS_METADATA_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PROCEEDINGS_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS, oldReferenceDistributionOpts, referenceDistributionOpts, !oldReferenceDistributionOptsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PROCEEDINGS_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS, oldReferenceDistributionOpts, REFERENCE_DISTRIBUTION_OPTS_EDEFAULT, oldReferenceDistributionOptsESet));
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
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER:
				return ((InternalEList<?>)getPublisher()).basicRemove(otherEnd, msgs);
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLICATION_DATE:
				return ((InternalEList<?>)getPublicationDate()).basicRemove(otherEnd, msgs);
			case _4Package.PROCEEDINGS_METADATA_TYPE__ISBN:
				return ((InternalEList<?>)getIsbn()).basicRemove(otherEnd, msgs);
			case _4Package.PROCEEDINGS_METADATA_TYPE__NOISBN:
				return basicSetNoisbn(null, msgs);
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER_ITEM:
				return basicSetPublisherItem(null, msgs);
			case _4Package.PROCEEDINGS_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return basicSetArchiveLocations(null, msgs);
			case _4Package.PROCEEDINGS_METADATA_TYPE__DOI_DATA:
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
			case _4Package.PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_TITLE:
				return getProceedingsTitle();
			case _4Package.PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_SUBJECT:
				return getProceedingsSubject();
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER:
				return getPublisher();
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLICATION_DATE:
				return getPublicationDate();
			case _4Package.PROCEEDINGS_METADATA_TYPE__ISBN:
				return getIsbn();
			case _4Package.PROCEEDINGS_METADATA_TYPE__NOISBN:
				return getNoisbn();
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER_ITEM:
				return getPublisherItem();
			case _4Package.PROCEEDINGS_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return getArchiveLocations();
			case _4Package.PROCEEDINGS_METADATA_TYPE__DOI_DATA:
				return getDoiData();
			case _4Package.PROCEEDINGS_METADATA_TYPE__LANGUAGE:
				return getLanguage();
			case _4Package.PROCEEDINGS_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS:
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
			case _4Package.PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_TITLE:
				setProceedingsTitle((String)newValue);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_SUBJECT:
				setProceedingsSubject((String)newValue);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER:
				getPublisher().clear();
				getPublisher().addAll((Collection<? extends PublisherType>)newValue);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLICATION_DATE:
				getPublicationDate().clear();
				getPublicationDate().addAll((Collection<? extends PublicationDateType>)newValue);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__ISBN:
				getIsbn().clear();
				getIsbn().addAll((Collection<? extends IsbnType>)newValue);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__NOISBN:
				setNoisbn((NoisbnType)newValue);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER_ITEM:
				setPublisherItem((PublisherItemType)newValue);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)newValue);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__DOI_DATA:
				setDoiData((DoiDataType)newValue);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS:
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
			case _4Package.PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_TITLE:
				setProceedingsTitle(PROCEEDINGS_TITLE_EDEFAULT);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_SUBJECT:
				setProceedingsSubject(PROCEEDINGS_SUBJECT_EDEFAULT);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER:
				getPublisher().clear();
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLICATION_DATE:
				getPublicationDate().clear();
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__ISBN:
				getIsbn().clear();
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__NOISBN:
				setNoisbn((NoisbnType)null);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER_ITEM:
				setPublisherItem((PublisherItemType)null);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)null);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__DOI_DATA:
				setDoiData((DoiDataType)null);
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case _4Package.PROCEEDINGS_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS:
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
			case _4Package.PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_TITLE:
				return PROCEEDINGS_TITLE_EDEFAULT == null ? proceedingsTitle != null : !PROCEEDINGS_TITLE_EDEFAULT.equals(proceedingsTitle);
			case _4Package.PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_SUBJECT:
				return PROCEEDINGS_SUBJECT_EDEFAULT == null ? proceedingsSubject != null : !PROCEEDINGS_SUBJECT_EDEFAULT.equals(proceedingsSubject);
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER:
				return publisher != null && !publisher.isEmpty();
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLICATION_DATE:
				return publicationDate != null && !publicationDate.isEmpty();
			case _4Package.PROCEEDINGS_METADATA_TYPE__ISBN:
				return isbn != null && !isbn.isEmpty();
			case _4Package.PROCEEDINGS_METADATA_TYPE__NOISBN:
				return noisbn != null;
			case _4Package.PROCEEDINGS_METADATA_TYPE__PUBLISHER_ITEM:
				return publisherItem != null;
			case _4Package.PROCEEDINGS_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return archiveLocations != null;
			case _4Package.PROCEEDINGS_METADATA_TYPE__DOI_DATA:
				return doiData != null;
			case _4Package.PROCEEDINGS_METADATA_TYPE__LANGUAGE:
				return isSetLanguage();
			case _4Package.PROCEEDINGS_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS:
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
		result.append(" (proceedingsTitle: ");
		result.append(proceedingsTitle);
		result.append(", proceedingsSubject: ");
		result.append(proceedingsSubject);
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", referenceDistributionOpts: ");
		if (referenceDistributionOptsESet) result.append(referenceDistributionOpts); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProceedingsMetadataTypeImpl
