/**
 */
package org.crossref.schema._4._4.impl;

import gov.nih.nlm.ncbi.jats1.AbstractType;

import java.util.Collection;

import org.crossref.fundref.ProgramType;

import org.crossref.schema._4._4.ArchiveLocationsType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.CrossmarkType;
import org.crossref.schema._4._4.DoiDataType;
import org.crossref.schema._4._4.IssnType;
import org.crossref.schema._4._4.PublisherItemType;
import org.crossref.schema._4._4.SeriesMetadataType;
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
 * An implementation of the model object '<em><b>Series Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getCoden <em>Coden</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getCrossmark <em>Crossmark</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl#getDoiData <em>Doi Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeriesMetadataTypeImpl extends MinimalEObjectImpl.Container implements SeriesMetadataType {
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
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractType> abstract_;

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
	 * The default value of the '{@link #getSeriesNumber() <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIES_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeriesNumber() <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesNumber()
	 * @generated
	 * @ordered
	 */
	protected String seriesNumber = SERIES_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getCrossmark() <em>Crossmark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossmark()
	 * @generated
	 * @ordered
	 */
	protected CrossmarkType crossmark;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected ProgramType program;

	/**
	 * The cached value of the '{@link #getProgram1() <em>Program1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram1()
	 * @generated
	 * @ordered
	 */
	protected org.crossref.access.indicators.ProgramType program1;

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
	protected SeriesMetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getSeriesMetadataType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__CONTRIBUTORS, oldContributors, newContributors);
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
				msgs = ((InternalEObject)contributors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__CONTRIBUTORS, null, msgs);
			if (newContributors != null)
				msgs = ((InternalEObject)newContributors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__CONTRIBUTORS, null, msgs);
			msgs = basicSetContributors(newContributors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__CONTRIBUTORS, newContributors, newContributors));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__TITLES, oldTitles, newTitles);
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
				msgs = ((InternalEObject)titles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__TITLES, null, msgs);
			if (newTitles != null)
				msgs = ((InternalEObject)newTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__TITLES, null, msgs);
			msgs = basicSetTitles(newTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__TITLES, newTitles, newTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractType> getAbstract() {
		if (abstract_ == null) {
			abstract_ = new EObjectContainmentEList<AbstractType>(AbstractType.class, this, _4Package.SERIES_METADATA_TYPE__ABSTRACT);
		}
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssnType> getIssn() {
		if (issn == null) {
			issn = new EObjectContainmentEList<IssnType>(IssnType.class, this, _4Package.SERIES_METADATA_TYPE__ISSN);
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__CODEN, oldCoden, coden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeriesNumber() {
		return seriesNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeriesNumber(String newSeriesNumber) {
		String oldSeriesNumber = seriesNumber;
		seriesNumber = newSeriesNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__SERIES_NUMBER, oldSeriesNumber, seriesNumber));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__PUBLISHER_ITEM, oldPublisherItem, newPublisherItem);
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
				msgs = ((InternalEObject)publisherItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__PUBLISHER_ITEM, null, msgs);
			if (newPublisherItem != null)
				msgs = ((InternalEObject)newPublisherItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__PUBLISHER_ITEM, null, msgs);
			msgs = basicSetPublisherItem(newPublisherItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__PUBLISHER_ITEM, newPublisherItem, newPublisherItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossmarkType getCrossmark() {
		return crossmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrossmark(CrossmarkType newCrossmark, NotificationChain msgs) {
		CrossmarkType oldCrossmark = crossmark;
		crossmark = newCrossmark;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__CROSSMARK, oldCrossmark, newCrossmark);
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
	public void setCrossmark(CrossmarkType newCrossmark) {
		if (newCrossmark != crossmark) {
			NotificationChain msgs = null;
			if (crossmark != null)
				msgs = ((InternalEObject)crossmark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__CROSSMARK, null, msgs);
			if (newCrossmark != null)
				msgs = ((InternalEObject)newCrossmark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__CROSSMARK, null, msgs);
			msgs = basicSetCrossmark(newCrossmark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__CROSSMARK, newCrossmark, newCrossmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramType getProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(ProgramType newProgram, NotificationChain msgs) {
		ProgramType oldProgram = program;
		program = newProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__PROGRAM, oldProgram, newProgram);
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
	public void setProgram(ProgramType newProgram) {
		if (newProgram != program) {
			NotificationChain msgs = null;
			if (program != null)
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.access.indicators.ProgramType getProgram1() {
		return program1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram1(org.crossref.access.indicators.ProgramType newProgram1, NotificationChain msgs) {
		org.crossref.access.indicators.ProgramType oldProgram1 = program1;
		program1 = newProgram1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__PROGRAM1, oldProgram1, newProgram1);
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
	public void setProgram1(org.crossref.access.indicators.ProgramType newProgram1) {
		if (newProgram1 != program1) {
			NotificationChain msgs = null;
			if (program1 != null)
				msgs = ((InternalEObject)program1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__PROGRAM1, null, msgs);
			if (newProgram1 != null)
				msgs = ((InternalEObject)newProgram1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__PROGRAM1, null, msgs);
			msgs = basicSetProgram1(newProgram1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__PROGRAM1, newProgram1, newProgram1));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS, oldArchiveLocations, newArchiveLocations);
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
				msgs = ((InternalEObject)archiveLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			if (newArchiveLocations != null)
				msgs = ((InternalEObject)newArchiveLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			msgs = basicSetArchiveLocations(newArchiveLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS, newArchiveLocations, newArchiveLocations));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__DOI_DATA, oldDoiData, newDoiData);
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
				msgs = ((InternalEObject)doiData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__DOI_DATA, null, msgs);
			if (newDoiData != null)
				msgs = ((InternalEObject)newDoiData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.SERIES_METADATA_TYPE__DOI_DATA, null, msgs);
			msgs = basicSetDoiData(newDoiData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.SERIES_METADATA_TYPE__DOI_DATA, newDoiData, newDoiData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.SERIES_METADATA_TYPE__CONTRIBUTORS:
				return basicSetContributors(null, msgs);
			case _4Package.SERIES_METADATA_TYPE__TITLES:
				return basicSetTitles(null, msgs);
			case _4Package.SERIES_METADATA_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case _4Package.SERIES_METADATA_TYPE__ISSN:
				return ((InternalEList<?>)getIssn()).basicRemove(otherEnd, msgs);
			case _4Package.SERIES_METADATA_TYPE__PUBLISHER_ITEM:
				return basicSetPublisherItem(null, msgs);
			case _4Package.SERIES_METADATA_TYPE__CROSSMARK:
				return basicSetCrossmark(null, msgs);
			case _4Package.SERIES_METADATA_TYPE__PROGRAM:
				return basicSetProgram(null, msgs);
			case _4Package.SERIES_METADATA_TYPE__PROGRAM1:
				return basicSetProgram1(null, msgs);
			case _4Package.SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return basicSetArchiveLocations(null, msgs);
			case _4Package.SERIES_METADATA_TYPE__DOI_DATA:
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
			case _4Package.SERIES_METADATA_TYPE__CONTRIBUTORS:
				return getContributors();
			case _4Package.SERIES_METADATA_TYPE__TITLES:
				return getTitles();
			case _4Package.SERIES_METADATA_TYPE__ABSTRACT:
				return getAbstract();
			case _4Package.SERIES_METADATA_TYPE__ISSN:
				return getIssn();
			case _4Package.SERIES_METADATA_TYPE__CODEN:
				return getCoden();
			case _4Package.SERIES_METADATA_TYPE__SERIES_NUMBER:
				return getSeriesNumber();
			case _4Package.SERIES_METADATA_TYPE__PUBLISHER_ITEM:
				return getPublisherItem();
			case _4Package.SERIES_METADATA_TYPE__CROSSMARK:
				return getCrossmark();
			case _4Package.SERIES_METADATA_TYPE__PROGRAM:
				return getProgram();
			case _4Package.SERIES_METADATA_TYPE__PROGRAM1:
				return getProgram1();
			case _4Package.SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return getArchiveLocations();
			case _4Package.SERIES_METADATA_TYPE__DOI_DATA:
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
			case _4Package.SERIES_METADATA_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__TITLES:
				setTitles((TitlesType)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__ISSN:
				getIssn().clear();
				getIssn().addAll((Collection<? extends IssnType>)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__CODEN:
				setCoden((String)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__SERIES_NUMBER:
				setSeriesNumber((String)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__PUBLISHER_ITEM:
				setPublisherItem((PublisherItemType)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__CROSSMARK:
				setCrossmark((CrossmarkType)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__PROGRAM:
				setProgram((ProgramType)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__PROGRAM1:
				setProgram1((org.crossref.access.indicators.ProgramType)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)newValue);
				return;
			case _4Package.SERIES_METADATA_TYPE__DOI_DATA:
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
			case _4Package.SERIES_METADATA_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)null);
				return;
			case _4Package.SERIES_METADATA_TYPE__TITLES:
				setTitles((TitlesType)null);
				return;
			case _4Package.SERIES_METADATA_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case _4Package.SERIES_METADATA_TYPE__ISSN:
				getIssn().clear();
				return;
			case _4Package.SERIES_METADATA_TYPE__CODEN:
				setCoden(CODEN_EDEFAULT);
				return;
			case _4Package.SERIES_METADATA_TYPE__SERIES_NUMBER:
				setSeriesNumber(SERIES_NUMBER_EDEFAULT);
				return;
			case _4Package.SERIES_METADATA_TYPE__PUBLISHER_ITEM:
				setPublisherItem((PublisherItemType)null);
				return;
			case _4Package.SERIES_METADATA_TYPE__CROSSMARK:
				setCrossmark((CrossmarkType)null);
				return;
			case _4Package.SERIES_METADATA_TYPE__PROGRAM:
				setProgram((ProgramType)null);
				return;
			case _4Package.SERIES_METADATA_TYPE__PROGRAM1:
				setProgram1((org.crossref.access.indicators.ProgramType)null);
				return;
			case _4Package.SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)null);
				return;
			case _4Package.SERIES_METADATA_TYPE__DOI_DATA:
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
			case _4Package.SERIES_METADATA_TYPE__CONTRIBUTORS:
				return contributors != null;
			case _4Package.SERIES_METADATA_TYPE__TITLES:
				return titles != null;
			case _4Package.SERIES_METADATA_TYPE__ABSTRACT:
				return abstract_ != null && !abstract_.isEmpty();
			case _4Package.SERIES_METADATA_TYPE__ISSN:
				return issn != null && !issn.isEmpty();
			case _4Package.SERIES_METADATA_TYPE__CODEN:
				return CODEN_EDEFAULT == null ? coden != null : !CODEN_EDEFAULT.equals(coden);
			case _4Package.SERIES_METADATA_TYPE__SERIES_NUMBER:
				return SERIES_NUMBER_EDEFAULT == null ? seriesNumber != null : !SERIES_NUMBER_EDEFAULT.equals(seriesNumber);
			case _4Package.SERIES_METADATA_TYPE__PUBLISHER_ITEM:
				return publisherItem != null;
			case _4Package.SERIES_METADATA_TYPE__CROSSMARK:
				return crossmark != null;
			case _4Package.SERIES_METADATA_TYPE__PROGRAM:
				return program != null;
			case _4Package.SERIES_METADATA_TYPE__PROGRAM1:
				return program1 != null;
			case _4Package.SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS:
				return archiveLocations != null;
			case _4Package.SERIES_METADATA_TYPE__DOI_DATA:
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
		result.append(" (coden: ");
		result.append(coden);
		result.append(", seriesNumber: ");
		result.append(seriesNumber);
		result.append(')');
		return result.toString();
	}

} //SeriesMetadataTypeImpl
