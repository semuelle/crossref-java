/**
 */
package org.crossref.schema._4._4.impl;

import gov.nih.nlm.ncbi.jats1.AbstractType;

import java.math.BigInteger;

import java.util.Collection;

import org.crossref.fundref.ProgramType;

import org.crossref.schema._4._4.AcceptanceDateType;
import org.crossref.schema._4._4.ArchiveLocationsType;
import org.crossref.schema._4._4.CitationListType;
import org.crossref.schema._4._4.ComponentListType;
import org.crossref.schema._4._4.ComponentTypeType;
import org.crossref.schema._4._4.ContentItemType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.CrossmarkType;
import org.crossref.schema._4._4.DoiDataType;
import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.PagesType;
import org.crossref.schema._4._4.PublicationDateType;
import org.crossref.schema._4._4.PublicationTypeType;
import org.crossref.schema._4._4.PublisherItemType;
import org.crossref.schema._4._4.ReferenceDistributionOptsType;
import org.crossref.schema._4._4.ScnPoliciesType;
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
 * An implementation of the model object '<em><b>Content Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getComponentNumber <em>Component Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getAcceptanceDate <em>Acceptance Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getCrossmark <em>Crossmark</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getProgram2 <em>Program2</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getProgram3 <em>Program3</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getScnPolicies <em>Scn Policies</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getCitationList <em>Citation List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getLevelSequenceNumber <em>Level Sequence Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getPublicationType <em>Publication Type</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentItemTypeImpl extends MinimalEObjectImpl.Container implements ContentItemType {
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
	 * The default value of the '{@link #getComponentNumber() <em>Component Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentNumber() <em>Component Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentNumber()
	 * @generated
	 * @ordered
	 */
	protected String componentNumber = COMPONENT_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getAcceptanceDate() <em>Acceptance Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceDate()
	 * @generated
	 * @ordered
	 */
	protected AcceptanceDateType acceptanceDate;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected PagesType pages;

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
	 * The cached value of the '{@link #getProgram2() <em>Program2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram2()
	 * @generated
	 * @ordered
	 */
	protected org.crossref.clinicaltrials.ProgramType program2;

	/**
	 * The cached value of the '{@link #getProgram3() <em>Program3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram3()
	 * @generated
	 * @ordered
	 */
	protected org.crossref.relations.ProgramType program3;

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
	 * The cached value of the '{@link #getScnPolicies() <em>Scn Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScnPolicies()
	 * @generated
	 * @ordered
	 */
	protected ScnPoliciesType scnPolicies;

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
	 * The cached value of the '{@link #getCitationList() <em>Citation List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitationList()
	 * @generated
	 * @ordered
	 */
	protected CitationListType citationList;

	/**
	 * The cached value of the '{@link #getComponentList() <em>Component List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentList()
	 * @generated
	 * @ordered
	 */
	protected ComponentListType componentList;

	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentTypeType COMPONENT_TYPE_EDEFAULT = ComponentTypeType.CHAPTER;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected ComponentTypeType componentType = COMPONENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Component Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean componentTypeESet;

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
	 * The default value of the '{@link #getLevelSequenceNumber() <em>Level Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LEVEL_SEQUENCE_NUMBER_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getLevelSequenceNumber() <em>Level Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger levelSequenceNumber = LEVEL_SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Level Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelSequenceNumberESet;

	/**
	 * The default value of the '{@link #getPublicationType() <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationType()
	 * @generated
	 * @ordered
	 */
	protected static final PublicationTypeType PUBLICATION_TYPE_EDEFAULT = PublicationTypeType.FULL_TEXT;

	/**
	 * The cached value of the '{@link #getPublicationType() <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationType()
	 * @generated
	 * @ordered
	 */
	protected PublicationTypeType publicationType = PUBLICATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Publication Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publicationTypeESet;

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
	protected ContentItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getContentItemType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__CONTRIBUTORS, oldContributors, newContributors);
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
				msgs = ((InternalEObject)contributors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__CONTRIBUTORS, null, msgs);
			if (newContributors != null)
				msgs = ((InternalEObject)newContributors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__CONTRIBUTORS, null, msgs);
			msgs = basicSetContributors(newContributors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__CONTRIBUTORS, newContributors, newContributors));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__TITLES, oldTitles, newTitles);
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
				msgs = ((InternalEObject)titles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__TITLES, null, msgs);
			if (newTitles != null)
				msgs = ((InternalEObject)newTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__TITLES, null, msgs);
			msgs = basicSetTitles(newTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__TITLES, newTitles, newTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractType> getAbstract() {
		if (abstract_ == null) {
			abstract_ = new EObjectContainmentEList<AbstractType>(AbstractType.class, this, _4Package.CONTENT_ITEM_TYPE__ABSTRACT);
		}
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentNumber() {
		return componentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentNumber(String newComponentNumber) {
		String oldComponentNumber = componentNumber;
		componentNumber = newComponentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__COMPONENT_NUMBER, oldComponentNumber, componentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublicationDateType> getPublicationDate() {
		if (publicationDate == null) {
			publicationDate = new EObjectContainmentEList<PublicationDateType>(PublicationDateType.class, this, _4Package.CONTENT_ITEM_TYPE__PUBLICATION_DATE);
		}
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcceptanceDateType getAcceptanceDate() {
		return acceptanceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptanceDate(AcceptanceDateType newAcceptanceDate, NotificationChain msgs) {
		AcceptanceDateType oldAcceptanceDate = acceptanceDate;
		acceptanceDate = newAcceptanceDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__ACCEPTANCE_DATE, oldAcceptanceDate, newAcceptanceDate);
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
	public void setAcceptanceDate(AcceptanceDateType newAcceptanceDate) {
		if (newAcceptanceDate != acceptanceDate) {
			NotificationChain msgs = null;
			if (acceptanceDate != null)
				msgs = ((InternalEObject)acceptanceDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__ACCEPTANCE_DATE, null, msgs);
			if (newAcceptanceDate != null)
				msgs = ((InternalEObject)newAcceptanceDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__ACCEPTANCE_DATE, null, msgs);
			msgs = basicSetAcceptanceDate(newAcceptanceDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__ACCEPTANCE_DATE, newAcceptanceDate, newAcceptanceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PagesType getPages() {
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPages(PagesType newPages, NotificationChain msgs) {
		PagesType oldPages = pages;
		pages = newPages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PAGES, oldPages, newPages);
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
	public void setPages(PagesType newPages) {
		if (newPages != pages) {
			NotificationChain msgs = null;
			if (pages != null)
				msgs = ((InternalEObject)pages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PAGES, null, msgs);
			if (newPages != null)
				msgs = ((InternalEObject)newPages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PAGES, null, msgs);
			msgs = basicSetPages(newPages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PAGES, newPages, newPages));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PUBLISHER_ITEM, oldPublisherItem, newPublisherItem);
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
				msgs = ((InternalEObject)publisherItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PUBLISHER_ITEM, null, msgs);
			if (newPublisherItem != null)
				msgs = ((InternalEObject)newPublisherItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PUBLISHER_ITEM, null, msgs);
			msgs = basicSetPublisherItem(newPublisherItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PUBLISHER_ITEM, newPublisherItem, newPublisherItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__CROSSMARK, oldCrossmark, newCrossmark);
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
				msgs = ((InternalEObject)crossmark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__CROSSMARK, null, msgs);
			if (newCrossmark != null)
				msgs = ((InternalEObject)newCrossmark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__CROSSMARK, null, msgs);
			msgs = basicSetCrossmark(newCrossmark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__CROSSMARK, newCrossmark, newCrossmark));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PROGRAM, oldProgram, newProgram);
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
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PROGRAM, newProgram, newProgram));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PROGRAM1, oldProgram1, newProgram1);
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
				msgs = ((InternalEObject)program1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PROGRAM1, null, msgs);
			if (newProgram1 != null)
				msgs = ((InternalEObject)newProgram1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PROGRAM1, null, msgs);
			msgs = basicSetProgram1(newProgram1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PROGRAM1, newProgram1, newProgram1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.clinicaltrials.ProgramType getProgram2() {
		return program2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram2(org.crossref.clinicaltrials.ProgramType newProgram2, NotificationChain msgs) {
		org.crossref.clinicaltrials.ProgramType oldProgram2 = program2;
		program2 = newProgram2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PROGRAM2, oldProgram2, newProgram2);
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
	public void setProgram2(org.crossref.clinicaltrials.ProgramType newProgram2) {
		if (newProgram2 != program2) {
			NotificationChain msgs = null;
			if (program2 != null)
				msgs = ((InternalEObject)program2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PROGRAM2, null, msgs);
			if (newProgram2 != null)
				msgs = ((InternalEObject)newProgram2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PROGRAM2, null, msgs);
			msgs = basicSetProgram2(newProgram2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PROGRAM2, newProgram2, newProgram2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.relations.ProgramType getProgram3() {
		return program3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram3(org.crossref.relations.ProgramType newProgram3, NotificationChain msgs) {
		org.crossref.relations.ProgramType oldProgram3 = program3;
		program3 = newProgram3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PROGRAM3, oldProgram3, newProgram3);
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
	public void setProgram3(org.crossref.relations.ProgramType newProgram3) {
		if (newProgram3 != program3) {
			NotificationChain msgs = null;
			if (program3 != null)
				msgs = ((InternalEObject)program3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PROGRAM3, null, msgs);
			if (newProgram3 != null)
				msgs = ((InternalEObject)newProgram3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__PROGRAM3, null, msgs);
			msgs = basicSetProgram3(newProgram3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PROGRAM3, newProgram3, newProgram3));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__ARCHIVE_LOCATIONS, oldArchiveLocations, newArchiveLocations);
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
				msgs = ((InternalEObject)archiveLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			if (newArchiveLocations != null)
				msgs = ((InternalEObject)newArchiveLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__ARCHIVE_LOCATIONS, null, msgs);
			msgs = basicSetArchiveLocations(newArchiveLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__ARCHIVE_LOCATIONS, newArchiveLocations, newArchiveLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScnPoliciesType getScnPolicies() {
		return scnPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScnPolicies(ScnPoliciesType newScnPolicies, NotificationChain msgs) {
		ScnPoliciesType oldScnPolicies = scnPolicies;
		scnPolicies = newScnPolicies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__SCN_POLICIES, oldScnPolicies, newScnPolicies);
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
	public void setScnPolicies(ScnPoliciesType newScnPolicies) {
		if (newScnPolicies != scnPolicies) {
			NotificationChain msgs = null;
			if (scnPolicies != null)
				msgs = ((InternalEObject)scnPolicies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__SCN_POLICIES, null, msgs);
			if (newScnPolicies != null)
				msgs = ((InternalEObject)newScnPolicies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__SCN_POLICIES, null, msgs);
			msgs = basicSetScnPolicies(newScnPolicies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__SCN_POLICIES, newScnPolicies, newScnPolicies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__DOI_DATA, oldDoiData, newDoiData);
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
				msgs = ((InternalEObject)doiData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__DOI_DATA, null, msgs);
			if (newDoiData != null)
				msgs = ((InternalEObject)newDoiData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__DOI_DATA, null, msgs);
			msgs = basicSetDoiData(newDoiData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__DOI_DATA, newDoiData, newDoiData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationListType getCitationList() {
		return citationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitationList(CitationListType newCitationList, NotificationChain msgs) {
		CitationListType oldCitationList = citationList;
		citationList = newCitationList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__CITATION_LIST, oldCitationList, newCitationList);
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
	public void setCitationList(CitationListType newCitationList) {
		if (newCitationList != citationList) {
			NotificationChain msgs = null;
			if (citationList != null)
				msgs = ((InternalEObject)citationList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__CITATION_LIST, null, msgs);
			if (newCitationList != null)
				msgs = ((InternalEObject)newCitationList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__CITATION_LIST, null, msgs);
			msgs = basicSetCitationList(newCitationList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__CITATION_LIST, newCitationList, newCitationList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentListType getComponentList() {
		return componentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentList(ComponentListType newComponentList, NotificationChain msgs) {
		ComponentListType oldComponentList = componentList;
		componentList = newComponentList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__COMPONENT_LIST, oldComponentList, newComponentList);
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
	public void setComponentList(ComponentListType newComponentList) {
		if (newComponentList != componentList) {
			NotificationChain msgs = null;
			if (componentList != null)
				msgs = ((InternalEObject)componentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__COMPONENT_LIST, null, msgs);
			if (newComponentList != null)
				msgs = ((InternalEObject)newComponentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONTENT_ITEM_TYPE__COMPONENT_LIST, null, msgs);
			msgs = basicSetComponentList(newComponentList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__COMPONENT_LIST, newComponentList, newComponentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentTypeType getComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentType(ComponentTypeType newComponentType) {
		ComponentTypeType oldComponentType = componentType;
		componentType = newComponentType == null ? COMPONENT_TYPE_EDEFAULT : newComponentType;
		boolean oldComponentTypeESet = componentTypeESet;
		componentTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__COMPONENT_TYPE, oldComponentType, componentType, !oldComponentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetComponentType() {
		ComponentTypeType oldComponentType = componentType;
		boolean oldComponentTypeESet = componentTypeESet;
		componentType = COMPONENT_TYPE_EDEFAULT;
		componentTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.CONTENT_ITEM_TYPE__COMPONENT_TYPE, oldComponentType, COMPONENT_TYPE_EDEFAULT, oldComponentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetComponentType() {
		return componentTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.CONTENT_ITEM_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
	public BigInteger getLevelSequenceNumber() {
		return levelSequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevelSequenceNumber(BigInteger newLevelSequenceNumber) {
		BigInteger oldLevelSequenceNumber = levelSequenceNumber;
		levelSequenceNumber = newLevelSequenceNumber;
		boolean oldLevelSequenceNumberESet = levelSequenceNumberESet;
		levelSequenceNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__LEVEL_SEQUENCE_NUMBER, oldLevelSequenceNumber, levelSequenceNumber, !oldLevelSequenceNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLevelSequenceNumber() {
		BigInteger oldLevelSequenceNumber = levelSequenceNumber;
		boolean oldLevelSequenceNumberESet = levelSequenceNumberESet;
		levelSequenceNumber = LEVEL_SEQUENCE_NUMBER_EDEFAULT;
		levelSequenceNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.CONTENT_ITEM_TYPE__LEVEL_SEQUENCE_NUMBER, oldLevelSequenceNumber, LEVEL_SEQUENCE_NUMBER_EDEFAULT, oldLevelSequenceNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLevelSequenceNumber() {
		return levelSequenceNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationTypeType getPublicationType() {
		return publicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicationType(PublicationTypeType newPublicationType) {
		PublicationTypeType oldPublicationType = publicationType;
		publicationType = newPublicationType == null ? PUBLICATION_TYPE_EDEFAULT : newPublicationType;
		boolean oldPublicationTypeESet = publicationTypeESet;
		publicationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__PUBLICATION_TYPE, oldPublicationType, publicationType, !oldPublicationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPublicationType() {
		PublicationTypeType oldPublicationType = publicationType;
		boolean oldPublicationTypeESet = publicationTypeESet;
		publicationType = PUBLICATION_TYPE_EDEFAULT;
		publicationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.CONTENT_ITEM_TYPE__PUBLICATION_TYPE, oldPublicationType, PUBLICATION_TYPE_EDEFAULT, oldPublicationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPublicationType() {
		return publicationTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONTENT_ITEM_TYPE__REFERENCE_DISTRIBUTION_OPTS, oldReferenceDistributionOpts, referenceDistributionOpts, !oldReferenceDistributionOptsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.CONTENT_ITEM_TYPE__REFERENCE_DISTRIBUTION_OPTS, oldReferenceDistributionOpts, REFERENCE_DISTRIBUTION_OPTS_EDEFAULT, oldReferenceDistributionOptsESet));
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
			case _4Package.CONTENT_ITEM_TYPE__CONTRIBUTORS:
				return basicSetContributors(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__TITLES:
				return basicSetTitles(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case _4Package.CONTENT_ITEM_TYPE__PUBLICATION_DATE:
				return ((InternalEList<?>)getPublicationDate()).basicRemove(otherEnd, msgs);
			case _4Package.CONTENT_ITEM_TYPE__ACCEPTANCE_DATE:
				return basicSetAcceptanceDate(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__PAGES:
				return basicSetPages(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__PUBLISHER_ITEM:
				return basicSetPublisherItem(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__CROSSMARK:
				return basicSetCrossmark(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM:
				return basicSetProgram(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM1:
				return basicSetProgram1(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM2:
				return basicSetProgram2(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM3:
				return basicSetProgram3(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__ARCHIVE_LOCATIONS:
				return basicSetArchiveLocations(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__SCN_POLICIES:
				return basicSetScnPolicies(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__DOI_DATA:
				return basicSetDoiData(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__CITATION_LIST:
				return basicSetCitationList(null, msgs);
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_LIST:
				return basicSetComponentList(null, msgs);
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
			case _4Package.CONTENT_ITEM_TYPE__CONTRIBUTORS:
				return getContributors();
			case _4Package.CONTENT_ITEM_TYPE__TITLES:
				return getTitles();
			case _4Package.CONTENT_ITEM_TYPE__ABSTRACT:
				return getAbstract();
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_NUMBER:
				return getComponentNumber();
			case _4Package.CONTENT_ITEM_TYPE__PUBLICATION_DATE:
				return getPublicationDate();
			case _4Package.CONTENT_ITEM_TYPE__ACCEPTANCE_DATE:
				return getAcceptanceDate();
			case _4Package.CONTENT_ITEM_TYPE__PAGES:
				return getPages();
			case _4Package.CONTENT_ITEM_TYPE__PUBLISHER_ITEM:
				return getPublisherItem();
			case _4Package.CONTENT_ITEM_TYPE__CROSSMARK:
				return getCrossmark();
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM:
				return getProgram();
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM1:
				return getProgram1();
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM2:
				return getProgram2();
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM3:
				return getProgram3();
			case _4Package.CONTENT_ITEM_TYPE__ARCHIVE_LOCATIONS:
				return getArchiveLocations();
			case _4Package.CONTENT_ITEM_TYPE__SCN_POLICIES:
				return getScnPolicies();
			case _4Package.CONTENT_ITEM_TYPE__DOI_DATA:
				return getDoiData();
			case _4Package.CONTENT_ITEM_TYPE__CITATION_LIST:
				return getCitationList();
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_LIST:
				return getComponentList();
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_TYPE:
				return getComponentType();
			case _4Package.CONTENT_ITEM_TYPE__LANGUAGE:
				return getLanguage();
			case _4Package.CONTENT_ITEM_TYPE__LEVEL_SEQUENCE_NUMBER:
				return getLevelSequenceNumber();
			case _4Package.CONTENT_ITEM_TYPE__PUBLICATION_TYPE:
				return getPublicationType();
			case _4Package.CONTENT_ITEM_TYPE__REFERENCE_DISTRIBUTION_OPTS:
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
			case _4Package.CONTENT_ITEM_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__TITLES:
				setTitles((TitlesType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_NUMBER:
				setComponentNumber((String)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PUBLICATION_DATE:
				getPublicationDate().clear();
				getPublicationDate().addAll((Collection<? extends PublicationDateType>)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__ACCEPTANCE_DATE:
				setAcceptanceDate((AcceptanceDateType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PAGES:
				setPages((PagesType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PUBLISHER_ITEM:
				setPublisherItem((PublisherItemType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__CROSSMARK:
				setCrossmark((CrossmarkType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM:
				setProgram((ProgramType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM1:
				setProgram1((org.crossref.access.indicators.ProgramType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM2:
				setProgram2((org.crossref.clinicaltrials.ProgramType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM3:
				setProgram3((org.crossref.relations.ProgramType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__SCN_POLICIES:
				setScnPolicies((ScnPoliciesType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__DOI_DATA:
				setDoiData((DoiDataType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__CITATION_LIST:
				setCitationList((CitationListType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_LIST:
				setComponentList((ComponentListType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_TYPE:
				setComponentType((ComponentTypeType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__LEVEL_SEQUENCE_NUMBER:
				setLevelSequenceNumber((BigInteger)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PUBLICATION_TYPE:
				setPublicationType((PublicationTypeType)newValue);
				return;
			case _4Package.CONTENT_ITEM_TYPE__REFERENCE_DISTRIBUTION_OPTS:
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
			case _4Package.CONTENT_ITEM_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__TITLES:
				setTitles((TitlesType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_NUMBER:
				setComponentNumber(COMPONENT_NUMBER_EDEFAULT);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PUBLICATION_DATE:
				getPublicationDate().clear();
				return;
			case _4Package.CONTENT_ITEM_TYPE__ACCEPTANCE_DATE:
				setAcceptanceDate((AcceptanceDateType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PAGES:
				setPages((PagesType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PUBLISHER_ITEM:
				setPublisherItem((PublisherItemType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__CROSSMARK:
				setCrossmark((CrossmarkType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM:
				setProgram((ProgramType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM1:
				setProgram1((org.crossref.access.indicators.ProgramType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM2:
				setProgram2((org.crossref.clinicaltrials.ProgramType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM3:
				setProgram3((org.crossref.relations.ProgramType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__SCN_POLICIES:
				setScnPolicies((ScnPoliciesType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__DOI_DATA:
				setDoiData((DoiDataType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__CITATION_LIST:
				setCitationList((CitationListType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_LIST:
				setComponentList((ComponentListType)null);
				return;
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_TYPE:
				unsetComponentType();
				return;
			case _4Package.CONTENT_ITEM_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case _4Package.CONTENT_ITEM_TYPE__LEVEL_SEQUENCE_NUMBER:
				unsetLevelSequenceNumber();
				return;
			case _4Package.CONTENT_ITEM_TYPE__PUBLICATION_TYPE:
				unsetPublicationType();
				return;
			case _4Package.CONTENT_ITEM_TYPE__REFERENCE_DISTRIBUTION_OPTS:
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
			case _4Package.CONTENT_ITEM_TYPE__CONTRIBUTORS:
				return contributors != null;
			case _4Package.CONTENT_ITEM_TYPE__TITLES:
				return titles != null;
			case _4Package.CONTENT_ITEM_TYPE__ABSTRACT:
				return abstract_ != null && !abstract_.isEmpty();
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_NUMBER:
				return COMPONENT_NUMBER_EDEFAULT == null ? componentNumber != null : !COMPONENT_NUMBER_EDEFAULT.equals(componentNumber);
			case _4Package.CONTENT_ITEM_TYPE__PUBLICATION_DATE:
				return publicationDate != null && !publicationDate.isEmpty();
			case _4Package.CONTENT_ITEM_TYPE__ACCEPTANCE_DATE:
				return acceptanceDate != null;
			case _4Package.CONTENT_ITEM_TYPE__PAGES:
				return pages != null;
			case _4Package.CONTENT_ITEM_TYPE__PUBLISHER_ITEM:
				return publisherItem != null;
			case _4Package.CONTENT_ITEM_TYPE__CROSSMARK:
				return crossmark != null;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM:
				return program != null;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM1:
				return program1 != null;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM2:
				return program2 != null;
			case _4Package.CONTENT_ITEM_TYPE__PROGRAM3:
				return program3 != null;
			case _4Package.CONTENT_ITEM_TYPE__ARCHIVE_LOCATIONS:
				return archiveLocations != null;
			case _4Package.CONTENT_ITEM_TYPE__SCN_POLICIES:
				return scnPolicies != null;
			case _4Package.CONTENT_ITEM_TYPE__DOI_DATA:
				return doiData != null;
			case _4Package.CONTENT_ITEM_TYPE__CITATION_LIST:
				return citationList != null;
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_LIST:
				return componentList != null;
			case _4Package.CONTENT_ITEM_TYPE__COMPONENT_TYPE:
				return isSetComponentType();
			case _4Package.CONTENT_ITEM_TYPE__LANGUAGE:
				return isSetLanguage();
			case _4Package.CONTENT_ITEM_TYPE__LEVEL_SEQUENCE_NUMBER:
				return isSetLevelSequenceNumber();
			case _4Package.CONTENT_ITEM_TYPE__PUBLICATION_TYPE:
				return isSetPublicationType();
			case _4Package.CONTENT_ITEM_TYPE__REFERENCE_DISTRIBUTION_OPTS:
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
		result.append(" (componentNumber: ");
		result.append(componentNumber);
		result.append(", componentType: ");
		if (componentTypeESet) result.append(componentType); else result.append("<unset>");
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", levelSequenceNumber: ");
		if (levelSequenceNumberESet) result.append(levelSequenceNumber); else result.append("<unset>");
		result.append(", publicationType: ");
		if (publicationTypeESet) result.append(publicationType); else result.append("<unset>");
		result.append(", referenceDistributionOpts: ");
		if (referenceDistributionOptsESet) result.append(referenceDistributionOpts); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ContentItemTypeImpl
