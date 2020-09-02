/**
 */
package org.crossref.schema._4._4.impl;

import java.math.BigInteger;

import org.crossref.access.indicators.ProgramType;

import org.crossref.schema._4._4.ComponentType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.DescriptionType;
import org.crossref.schema._4._4.DoiDataType;
import org.crossref.schema._4._4.FormatType;
import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.ParentRelationType;
import org.crossref.schema._4._4.PublicationDateType;
import org.crossref.schema._4._4.TitlesType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getComponentSize <em>Component Size</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getParentRelation <em>Parent Relation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ComponentTypeImpl#getRegAgency <em>Reg Agency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends MinimalEObjectImpl.Container implements ComponentType {
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
	 * The cached value of the '{@link #getContributors() <em>Contributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors()
	 * @generated
	 * @ordered
	 */
	protected ContributorsType contributors;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected PublicationDateType publicationDate;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected FormatType format;

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
	 * The cached value of the '{@link #getDoiData() <em>Doi Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoiData()
	 * @generated
	 * @ordered
	 */
	protected DoiDataType doiData;

	/**
	 * The default value of the '{@link #getDoi() <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoi()
	 * @generated
	 * @ordered
	 */
	protected static final String DOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoi() <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoi()
	 * @generated
	 * @ordered
	 */
	protected String doi = DOI_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentSize() <em>Component Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COMPONENT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentSize() <em>Component Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger componentSize = COMPONENT_SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getParentRelation() <em>Parent Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRelation()
	 * @generated
	 * @ordered
	 */
	protected static final ParentRelationType PARENT_RELATION_EDEFAULT = ParentRelationType.IS_PART_OF;

	/**
	 * The cached value of the '{@link #getParentRelation() <em>Parent Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRelation()
	 * @generated
	 * @ordered
	 */
	protected ParentRelationType parentRelation = PARENT_RELATION_EDEFAULT;

	/**
	 * This is true if the Parent Relation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parentRelationESet;

	/**
	 * The default value of the '{@link #getRegAgency() <em>Reg Agency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegAgency()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_AGENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegAgency() <em>Reg Agency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegAgency()
	 * @generated
	 * @ordered
	 */
	protected String regAgency = REG_AGENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getComponentType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__TITLES, oldTitles, newTitles);
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
				msgs = ((InternalEObject)titles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__TITLES, null, msgs);
			if (newTitles != null)
				msgs = ((InternalEObject)newTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__TITLES, null, msgs);
			msgs = basicSetTitles(newTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__TITLES, newTitles, newTitles));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__CONTRIBUTORS, oldContributors, newContributors);
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
				msgs = ((InternalEObject)contributors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__CONTRIBUTORS, null, msgs);
			if (newContributors != null)
				msgs = ((InternalEObject)newContributors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__CONTRIBUTORS, null, msgs);
			msgs = basicSetContributors(newContributors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__CONTRIBUTORS, newContributors, newContributors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationDateType getPublicationDate() {
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicationDate(PublicationDateType newPublicationDate, NotificationChain msgs) {
		PublicationDateType oldPublicationDate = publicationDate;
		publicationDate = newPublicationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__PUBLICATION_DATE, oldPublicationDate, newPublicationDate);
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
	public void setPublicationDate(PublicationDateType newPublicationDate) {
		if (newPublicationDate != publicationDate) {
			NotificationChain msgs = null;
			if (publicationDate != null)
				msgs = ((InternalEObject)publicationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__PUBLICATION_DATE, null, msgs);
			if (newPublicationDate != null)
				msgs = ((InternalEObject)newPublicationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__PUBLICATION_DATE, null, msgs);
			msgs = basicSetPublicationDate(newPublicationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__PUBLICATION_DATE, newPublicationDate, newPublicationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormatType getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormat(FormatType newFormat, NotificationChain msgs) {
		FormatType oldFormat = format;
		format = newFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__FORMAT, oldFormat, newFormat);
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
	public void setFormat(FormatType newFormat) {
		if (newFormat != format) {
			NotificationChain msgs = null;
			if (format != null)
				msgs = ((InternalEObject)format).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__FORMAT, null, msgs);
			if (newFormat != null)
				msgs = ((InternalEObject)newFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__FORMAT, null, msgs);
			msgs = basicSetFormat(newFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__FORMAT, newFormat, newFormat));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__PROGRAM, oldProgram, newProgram);
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
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__PROGRAM, newProgram, newProgram));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__DOI_DATA, oldDoiData, newDoiData);
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
				msgs = ((InternalEObject)doiData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__DOI_DATA, null, msgs);
			if (newDoiData != null)
				msgs = ((InternalEObject)newDoiData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.COMPONENT_TYPE__DOI_DATA, null, msgs);
			msgs = basicSetDoiData(newDoiData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__DOI_DATA, newDoiData, newDoiData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoi() {
		return doi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoi(String newDoi) {
		String oldDoi = doi;
		doi = newDoi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__DOI, oldDoi, doi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getComponentSize() {
		return componentSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentSize(BigInteger newComponentSize) {
		BigInteger oldComponentSize = componentSize;
		componentSize = newComponentSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__COMPONENT_SIZE, oldComponentSize, componentSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.COMPONENT_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
	public ParentRelationType getParentRelation() {
		return parentRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentRelation(ParentRelationType newParentRelation) {
		ParentRelationType oldParentRelation = parentRelation;
		parentRelation = newParentRelation == null ? PARENT_RELATION_EDEFAULT : newParentRelation;
		boolean oldParentRelationESet = parentRelationESet;
		parentRelationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__PARENT_RELATION, oldParentRelation, parentRelation, !oldParentRelationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetParentRelation() {
		ParentRelationType oldParentRelation = parentRelation;
		boolean oldParentRelationESet = parentRelationESet;
		parentRelation = PARENT_RELATION_EDEFAULT;
		parentRelationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.COMPONENT_TYPE__PARENT_RELATION, oldParentRelation, PARENT_RELATION_EDEFAULT, oldParentRelationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetParentRelation() {
		return parentRelationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegAgency() {
		return regAgency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegAgency(String newRegAgency) {
		String oldRegAgency = regAgency;
		regAgency = newRegAgency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.COMPONENT_TYPE__REG_AGENCY, oldRegAgency, regAgency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.COMPONENT_TYPE__TITLES:
				return basicSetTitles(null, msgs);
			case _4Package.COMPONENT_TYPE__CONTRIBUTORS:
				return basicSetContributors(null, msgs);
			case _4Package.COMPONENT_TYPE__PUBLICATION_DATE:
				return basicSetPublicationDate(null, msgs);
			case _4Package.COMPONENT_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case _4Package.COMPONENT_TYPE__FORMAT:
				return basicSetFormat(null, msgs);
			case _4Package.COMPONENT_TYPE__PROGRAM:
				return basicSetProgram(null, msgs);
			case _4Package.COMPONENT_TYPE__DOI_DATA:
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
			case _4Package.COMPONENT_TYPE__TITLES:
				return getTitles();
			case _4Package.COMPONENT_TYPE__CONTRIBUTORS:
				return getContributors();
			case _4Package.COMPONENT_TYPE__PUBLICATION_DATE:
				return getPublicationDate();
			case _4Package.COMPONENT_TYPE__DESCRIPTION:
				return getDescription();
			case _4Package.COMPONENT_TYPE__FORMAT:
				return getFormat();
			case _4Package.COMPONENT_TYPE__PROGRAM:
				return getProgram();
			case _4Package.COMPONENT_TYPE__DOI_DATA:
				return getDoiData();
			case _4Package.COMPONENT_TYPE__DOI:
				return getDoi();
			case _4Package.COMPONENT_TYPE__COMPONENT_SIZE:
				return getComponentSize();
			case _4Package.COMPONENT_TYPE__LANGUAGE:
				return getLanguage();
			case _4Package.COMPONENT_TYPE__PARENT_RELATION:
				return getParentRelation();
			case _4Package.COMPONENT_TYPE__REG_AGENCY:
				return getRegAgency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _4Package.COMPONENT_TYPE__TITLES:
				setTitles((TitlesType)newValue);
				return;
			case _4Package.COMPONENT_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)newValue);
				return;
			case _4Package.COMPONENT_TYPE__PUBLICATION_DATE:
				setPublicationDate((PublicationDateType)newValue);
				return;
			case _4Package.COMPONENT_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case _4Package.COMPONENT_TYPE__FORMAT:
				setFormat((FormatType)newValue);
				return;
			case _4Package.COMPONENT_TYPE__PROGRAM:
				setProgram((ProgramType)newValue);
				return;
			case _4Package.COMPONENT_TYPE__DOI_DATA:
				setDoiData((DoiDataType)newValue);
				return;
			case _4Package.COMPONENT_TYPE__DOI:
				setDoi((String)newValue);
				return;
			case _4Package.COMPONENT_TYPE__COMPONENT_SIZE:
				setComponentSize((BigInteger)newValue);
				return;
			case _4Package.COMPONENT_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _4Package.COMPONENT_TYPE__PARENT_RELATION:
				setParentRelation((ParentRelationType)newValue);
				return;
			case _4Package.COMPONENT_TYPE__REG_AGENCY:
				setRegAgency((String)newValue);
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
			case _4Package.COMPONENT_TYPE__TITLES:
				setTitles((TitlesType)null);
				return;
			case _4Package.COMPONENT_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)null);
				return;
			case _4Package.COMPONENT_TYPE__PUBLICATION_DATE:
				setPublicationDate((PublicationDateType)null);
				return;
			case _4Package.COMPONENT_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case _4Package.COMPONENT_TYPE__FORMAT:
				setFormat((FormatType)null);
				return;
			case _4Package.COMPONENT_TYPE__PROGRAM:
				setProgram((ProgramType)null);
				return;
			case _4Package.COMPONENT_TYPE__DOI_DATA:
				setDoiData((DoiDataType)null);
				return;
			case _4Package.COMPONENT_TYPE__DOI:
				setDoi(DOI_EDEFAULT);
				return;
			case _4Package.COMPONENT_TYPE__COMPONENT_SIZE:
				setComponentSize(COMPONENT_SIZE_EDEFAULT);
				return;
			case _4Package.COMPONENT_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case _4Package.COMPONENT_TYPE__PARENT_RELATION:
				unsetParentRelation();
				return;
			case _4Package.COMPONENT_TYPE__REG_AGENCY:
				setRegAgency(REG_AGENCY_EDEFAULT);
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
			case _4Package.COMPONENT_TYPE__TITLES:
				return titles != null;
			case _4Package.COMPONENT_TYPE__CONTRIBUTORS:
				return contributors != null;
			case _4Package.COMPONENT_TYPE__PUBLICATION_DATE:
				return publicationDate != null;
			case _4Package.COMPONENT_TYPE__DESCRIPTION:
				return description != null;
			case _4Package.COMPONENT_TYPE__FORMAT:
				return format != null;
			case _4Package.COMPONENT_TYPE__PROGRAM:
				return program != null;
			case _4Package.COMPONENT_TYPE__DOI_DATA:
				return doiData != null;
			case _4Package.COMPONENT_TYPE__DOI:
				return DOI_EDEFAULT == null ? doi != null : !DOI_EDEFAULT.equals(doi);
			case _4Package.COMPONENT_TYPE__COMPONENT_SIZE:
				return COMPONENT_SIZE_EDEFAULT == null ? componentSize != null : !COMPONENT_SIZE_EDEFAULT.equals(componentSize);
			case _4Package.COMPONENT_TYPE__LANGUAGE:
				return isSetLanguage();
			case _4Package.COMPONENT_TYPE__PARENT_RELATION:
				return isSetParentRelation();
			case _4Package.COMPONENT_TYPE__REG_AGENCY:
				return REG_AGENCY_EDEFAULT == null ? regAgency != null : !REG_AGENCY_EDEFAULT.equals(regAgency);
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
		result.append(" (doi: ");
		result.append(doi);
		result.append(", componentSize: ");
		result.append(componentSize);
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", parentRelation: ");
		if (parentRelationESet) result.append(parentRelation); else result.append("<unset>");
		result.append(", regAgency: ");
		result.append(regAgency);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
