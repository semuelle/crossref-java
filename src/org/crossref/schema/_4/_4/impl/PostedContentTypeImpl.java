/**
 */
package org.crossref.schema._4._4.impl;

import gov.nih.nlm.ncbi.jats1.AbstractType;

import java.util.Collection;

import org.crossref.fundref.ProgramType;

import org.crossref.schema._4._4.AcceptanceDateType;
import org.crossref.schema._4._4.CitationListType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.DoiDataType;
import org.crossref.schema._4._4.InstitutionType;
import org.crossref.schema._4._4.ItemNumberType;
import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.PostedContentType;
import org.crossref.schema._4._4.PostedDateType;
import org.crossref.schema._4._4.ScnPoliciesType;
import org.crossref.schema._4._4.TitlesType;
import org.crossref.schema._4._4.TypeType1;
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
 * An implementation of the model object '<em><b>Posted Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getGroupTitle <em>Group Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getAcceptanceDate <em>Acceptance Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getItemNumber <em>Item Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getProgram2 <em>Program2</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getScnPolicies <em>Scn Policies</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getCitationList <em>Citation List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostedContentTypeImpl extends MinimalEObjectImpl.Container implements PostedContentType {
	/**
	 * The default value of the '{@link #getGroupTitle() <em>Group Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupTitle() <em>Group Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupTitle()
	 * @generated
	 * @ordered
	 */
	protected String groupTitle = GROUP_TITLE_EDEFAULT;

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
	 * The cached value of the '{@link #getPostedDate() <em>Posted Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDate()
	 * @generated
	 * @ordered
	 */
	protected PostedDateType postedDate;

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
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<InstitutionType> institution;

	/**
	 * The cached value of the '{@link #getItemNumber() <em>Item Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemNumberType> itemNumber;

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
	protected org.crossref.relations.ProgramType program2;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType1 TYPE_EDEFAULT = TypeType1.PREPRINT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType1 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostedContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getPostedContentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupTitle() {
		return groupTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupTitle(String newGroupTitle) {
		String oldGroupTitle = groupTitle;
		groupTitle = newGroupTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__GROUP_TITLE, oldGroupTitle, groupTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__CONTRIBUTORS, oldContributors, newContributors);
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
				msgs = ((InternalEObject)contributors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__CONTRIBUTORS, null, msgs);
			if (newContributors != null)
				msgs = ((InternalEObject)newContributors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__CONTRIBUTORS, null, msgs);
			msgs = basicSetContributors(newContributors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__CONTRIBUTORS, newContributors, newContributors));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__TITLES, oldTitles, newTitles);
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
				msgs = ((InternalEObject)titles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__TITLES, null, msgs);
			if (newTitles != null)
				msgs = ((InternalEObject)newTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__TITLES, null, msgs);
			msgs = basicSetTitles(newTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__TITLES, newTitles, newTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostedDateType getPostedDate() {
		return postedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostedDate(PostedDateType newPostedDate, NotificationChain msgs) {
		PostedDateType oldPostedDate = postedDate;
		postedDate = newPostedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__POSTED_DATE, oldPostedDate, newPostedDate);
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
	public void setPostedDate(PostedDateType newPostedDate) {
		if (newPostedDate != postedDate) {
			NotificationChain msgs = null;
			if (postedDate != null)
				msgs = ((InternalEObject)postedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__POSTED_DATE, null, msgs);
			if (newPostedDate != null)
				msgs = ((InternalEObject)newPostedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__POSTED_DATE, null, msgs);
			msgs = basicSetPostedDate(newPostedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__POSTED_DATE, newPostedDate, newPostedDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__ACCEPTANCE_DATE, oldAcceptanceDate, newAcceptanceDate);
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
				msgs = ((InternalEObject)acceptanceDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__ACCEPTANCE_DATE, null, msgs);
			if (newAcceptanceDate != null)
				msgs = ((InternalEObject)newAcceptanceDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__ACCEPTANCE_DATE, null, msgs);
			msgs = basicSetAcceptanceDate(newAcceptanceDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__ACCEPTANCE_DATE, newAcceptanceDate, newAcceptanceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		if (institution == null) {
			institution = new EObjectContainmentEList<InstitutionType>(InstitutionType.class, this, _4Package.POSTED_CONTENT_TYPE__INSTITUTION);
		}
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemNumberType> getItemNumber() {
		if (itemNumber == null) {
			itemNumber = new EObjectContainmentEList<ItemNumberType>(ItemNumberType.class, this, _4Package.POSTED_CONTENT_TYPE__ITEM_NUMBER);
		}
		return itemNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractType> getAbstract() {
		if (abstract_ == null) {
			abstract_ = new EObjectContainmentEList<AbstractType>(AbstractType.class, this, _4Package.POSTED_CONTENT_TYPE__ABSTRACT);
		}
		return abstract_;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__PROGRAM, oldProgram, newProgram);
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
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__PROGRAM, newProgram, newProgram));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__PROGRAM1, oldProgram1, newProgram1);
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
				msgs = ((InternalEObject)program1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__PROGRAM1, null, msgs);
			if (newProgram1 != null)
				msgs = ((InternalEObject)newProgram1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__PROGRAM1, null, msgs);
			msgs = basicSetProgram1(newProgram1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__PROGRAM1, newProgram1, newProgram1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.relations.ProgramType getProgram2() {
		return program2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram2(org.crossref.relations.ProgramType newProgram2, NotificationChain msgs) {
		org.crossref.relations.ProgramType oldProgram2 = program2;
		program2 = newProgram2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__PROGRAM2, oldProgram2, newProgram2);
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
	public void setProgram2(org.crossref.relations.ProgramType newProgram2) {
		if (newProgram2 != program2) {
			NotificationChain msgs = null;
			if (program2 != null)
				msgs = ((InternalEObject)program2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__PROGRAM2, null, msgs);
			if (newProgram2 != null)
				msgs = ((InternalEObject)newProgram2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__PROGRAM2, null, msgs);
			msgs = basicSetProgram2(newProgram2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__PROGRAM2, newProgram2, newProgram2));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__SCN_POLICIES, oldScnPolicies, newScnPolicies);
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
				msgs = ((InternalEObject)scnPolicies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__SCN_POLICIES, null, msgs);
			if (newScnPolicies != null)
				msgs = ((InternalEObject)newScnPolicies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__SCN_POLICIES, null, msgs);
			msgs = basicSetScnPolicies(newScnPolicies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__SCN_POLICIES, newScnPolicies, newScnPolicies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__DOI_DATA, oldDoiData, newDoiData);
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
				msgs = ((InternalEObject)doiData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__DOI_DATA, null, msgs);
			if (newDoiData != null)
				msgs = ((InternalEObject)newDoiData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__DOI_DATA, null, msgs);
			msgs = basicSetDoiData(newDoiData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__DOI_DATA, newDoiData, newDoiData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__CITATION_LIST, oldCitationList, newCitationList);
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
				msgs = ((InternalEObject)citationList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__CITATION_LIST, null, msgs);
			if (newCitationList != null)
				msgs = ((InternalEObject)newCitationList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.POSTED_CONTENT_TYPE__CITATION_LIST, null, msgs);
			msgs = basicSetCitationList(newCitationList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__CITATION_LIST, newCitationList, newCitationList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.POSTED_CONTENT_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
	public TypeType1 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType1 newType) {
		TypeType1 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.POSTED_CONTENT_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType1 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.POSTED_CONTENT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.POSTED_CONTENT_TYPE__CONTRIBUTORS:
				return basicSetContributors(null, msgs);
			case _4Package.POSTED_CONTENT_TYPE__TITLES:
				return basicSetTitles(null, msgs);
			case _4Package.POSTED_CONTENT_TYPE__POSTED_DATE:
				return basicSetPostedDate(null, msgs);
			case _4Package.POSTED_CONTENT_TYPE__ACCEPTANCE_DATE:
				return basicSetAcceptanceDate(null, msgs);
			case _4Package.POSTED_CONTENT_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case _4Package.POSTED_CONTENT_TYPE__ITEM_NUMBER:
				return ((InternalEList<?>)getItemNumber()).basicRemove(otherEnd, msgs);
			case _4Package.POSTED_CONTENT_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM:
				return basicSetProgram(null, msgs);
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM1:
				return basicSetProgram1(null, msgs);
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM2:
				return basicSetProgram2(null, msgs);
			case _4Package.POSTED_CONTENT_TYPE__SCN_POLICIES:
				return basicSetScnPolicies(null, msgs);
			case _4Package.POSTED_CONTENT_TYPE__DOI_DATA:
				return basicSetDoiData(null, msgs);
			case _4Package.POSTED_CONTENT_TYPE__CITATION_LIST:
				return basicSetCitationList(null, msgs);
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
			case _4Package.POSTED_CONTENT_TYPE__GROUP_TITLE:
				return getGroupTitle();
			case _4Package.POSTED_CONTENT_TYPE__CONTRIBUTORS:
				return getContributors();
			case _4Package.POSTED_CONTENT_TYPE__TITLES:
				return getTitles();
			case _4Package.POSTED_CONTENT_TYPE__POSTED_DATE:
				return getPostedDate();
			case _4Package.POSTED_CONTENT_TYPE__ACCEPTANCE_DATE:
				return getAcceptanceDate();
			case _4Package.POSTED_CONTENT_TYPE__INSTITUTION:
				return getInstitution();
			case _4Package.POSTED_CONTENT_TYPE__ITEM_NUMBER:
				return getItemNumber();
			case _4Package.POSTED_CONTENT_TYPE__ABSTRACT:
				return getAbstract();
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM:
				return getProgram();
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM1:
				return getProgram1();
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM2:
				return getProgram2();
			case _4Package.POSTED_CONTENT_TYPE__SCN_POLICIES:
				return getScnPolicies();
			case _4Package.POSTED_CONTENT_TYPE__DOI_DATA:
				return getDoiData();
			case _4Package.POSTED_CONTENT_TYPE__CITATION_LIST:
				return getCitationList();
			case _4Package.POSTED_CONTENT_TYPE__LANGUAGE:
				return getLanguage();
			case _4Package.POSTED_CONTENT_TYPE__TYPE:
				return getType();
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
			case _4Package.POSTED_CONTENT_TYPE__GROUP_TITLE:
				setGroupTitle((String)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__TITLES:
				setTitles((TitlesType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__POSTED_DATE:
				setPostedDate((PostedDateType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__ACCEPTANCE_DATE:
				setAcceptanceDate((AcceptanceDateType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__ITEM_NUMBER:
				getItemNumber().clear();
				getItemNumber().addAll((Collection<? extends ItemNumberType>)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM:
				setProgram((ProgramType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM1:
				setProgram1((org.crossref.access.indicators.ProgramType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM2:
				setProgram2((org.crossref.relations.ProgramType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__SCN_POLICIES:
				setScnPolicies((ScnPoliciesType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__DOI_DATA:
				setDoiData((DoiDataType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__CITATION_LIST:
				setCitationList((CitationListType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _4Package.POSTED_CONTENT_TYPE__TYPE:
				setType((TypeType1)newValue);
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
			case _4Package.POSTED_CONTENT_TYPE__GROUP_TITLE:
				setGroupTitle(GROUP_TITLE_EDEFAULT);
				return;
			case _4Package.POSTED_CONTENT_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)null);
				return;
			case _4Package.POSTED_CONTENT_TYPE__TITLES:
				setTitles((TitlesType)null);
				return;
			case _4Package.POSTED_CONTENT_TYPE__POSTED_DATE:
				setPostedDate((PostedDateType)null);
				return;
			case _4Package.POSTED_CONTENT_TYPE__ACCEPTANCE_DATE:
				setAcceptanceDate((AcceptanceDateType)null);
				return;
			case _4Package.POSTED_CONTENT_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case _4Package.POSTED_CONTENT_TYPE__ITEM_NUMBER:
				getItemNumber().clear();
				return;
			case _4Package.POSTED_CONTENT_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM:
				setProgram((ProgramType)null);
				return;
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM1:
				setProgram1((org.crossref.access.indicators.ProgramType)null);
				return;
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM2:
				setProgram2((org.crossref.relations.ProgramType)null);
				return;
			case _4Package.POSTED_CONTENT_TYPE__SCN_POLICIES:
				setScnPolicies((ScnPoliciesType)null);
				return;
			case _4Package.POSTED_CONTENT_TYPE__DOI_DATA:
				setDoiData((DoiDataType)null);
				return;
			case _4Package.POSTED_CONTENT_TYPE__CITATION_LIST:
				setCitationList((CitationListType)null);
				return;
			case _4Package.POSTED_CONTENT_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case _4Package.POSTED_CONTENT_TYPE__TYPE:
				unsetType();
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
			case _4Package.POSTED_CONTENT_TYPE__GROUP_TITLE:
				return GROUP_TITLE_EDEFAULT == null ? groupTitle != null : !GROUP_TITLE_EDEFAULT.equals(groupTitle);
			case _4Package.POSTED_CONTENT_TYPE__CONTRIBUTORS:
				return contributors != null;
			case _4Package.POSTED_CONTENT_TYPE__TITLES:
				return titles != null;
			case _4Package.POSTED_CONTENT_TYPE__POSTED_DATE:
				return postedDate != null;
			case _4Package.POSTED_CONTENT_TYPE__ACCEPTANCE_DATE:
				return acceptanceDate != null;
			case _4Package.POSTED_CONTENT_TYPE__INSTITUTION:
				return institution != null && !institution.isEmpty();
			case _4Package.POSTED_CONTENT_TYPE__ITEM_NUMBER:
				return itemNumber != null && !itemNumber.isEmpty();
			case _4Package.POSTED_CONTENT_TYPE__ABSTRACT:
				return abstract_ != null && !abstract_.isEmpty();
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM:
				return program != null;
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM1:
				return program1 != null;
			case _4Package.POSTED_CONTENT_TYPE__PROGRAM2:
				return program2 != null;
			case _4Package.POSTED_CONTENT_TYPE__SCN_POLICIES:
				return scnPolicies != null;
			case _4Package.POSTED_CONTENT_TYPE__DOI_DATA:
				return doiData != null;
			case _4Package.POSTED_CONTENT_TYPE__CITATION_LIST:
				return citationList != null;
			case _4Package.POSTED_CONTENT_TYPE__LANGUAGE:
				return isSetLanguage();
			case _4Package.POSTED_CONTENT_TYPE__TYPE:
				return isSetType();
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
		result.append(" (groupTitle: ");
		result.append(groupTitle);
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PostedContentTypeImpl
