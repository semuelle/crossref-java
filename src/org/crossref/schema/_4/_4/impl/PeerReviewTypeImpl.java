/**
 */
package org.crossref.schema._4._4.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.crossref.access.indicators.ProgramType;

import org.crossref.schema._4._4.CompetingInterestStatementType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.DoiDataType;
import org.crossref.schema._4._4.InstitutionType;
import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.PeerReviewType;
import org.crossref.schema._4._4.RecommendationType;
import org.crossref.schema._4._4.ReviewDateType;
import org.crossref.schema._4._4.ScnPoliciesType;
import org.crossref.schema._4._4.StageType;
import org.crossref.schema._4._4.TitlesType;
import org.crossref.schema._4._4.TypeType2;
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
 * An implementation of the model object '<em><b>Peer Review Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getCompetingInterestStatement <em>Competing Interest Statement</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getRunningNumber <em>Running Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getScnPolicies <em>Scn Policies</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getRevisionRound <em>Revision Round</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeerReviewTypeImpl extends MinimalEObjectImpl.Container implements PeerReviewType {
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
	 * The cached value of the '{@link #getReviewDate() <em>Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected ReviewDateType reviewDate;

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
	 * The cached value of the '{@link #getCompetingInterestStatement() <em>Competing Interest Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompetingInterestStatement()
	 * @generated
	 * @ordered
	 */
	protected CompetingInterestStatementType competingInterestStatement;

	/**
	 * The default value of the '{@link #getRunningNumber() <em>Running Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNNING_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunningNumber() <em>Running Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningNumber()
	 * @generated
	 * @ordered
	 */
	protected String runningNumber = RUNNING_NUMBER_EDEFAULT;

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
	protected org.crossref.relations.ProgramType program1;

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
	 * The default value of the '{@link #getRecommendation() <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendation()
	 * @generated
	 * @ordered
	 */
	protected static final RecommendationType RECOMMENDATION_EDEFAULT = RecommendationType.MAJOR_REVISION;

	/**
	 * The cached value of the '{@link #getRecommendation() <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendation()
	 * @generated
	 * @ordered
	 */
	protected RecommendationType recommendation = RECOMMENDATION_EDEFAULT;

	/**
	 * This is true if the Recommendation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recommendationESet;

	/**
	 * The default value of the '{@link #getRevisionRound() <em>Revision Round</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionRound()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REVISION_ROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionRound() <em>Revision Round</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionRound()
	 * @generated
	 * @ordered
	 */
	protected BigInteger revisionRound = REVISION_ROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final StageType STAGE_EDEFAULT = StageType.PRE_PUBLICATION;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected StageType stage = STAGE_EDEFAULT;

	/**
	 * This is true if the Stage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stageESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType2 TYPE_EDEFAULT = TypeType2.REFEREE_REPORT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType2 type = TYPE_EDEFAULT;

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
	protected PeerReviewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getPeerReviewType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__CONTRIBUTORS, oldContributors, newContributors);
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
				msgs = ((InternalEObject)contributors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__CONTRIBUTORS, null, msgs);
			if (newContributors != null)
				msgs = ((InternalEObject)newContributors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__CONTRIBUTORS, null, msgs);
			msgs = basicSetContributors(newContributors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__CONTRIBUTORS, newContributors, newContributors));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__TITLES, oldTitles, newTitles);
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
				msgs = ((InternalEObject)titles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__TITLES, null, msgs);
			if (newTitles != null)
				msgs = ((InternalEObject)newTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__TITLES, null, msgs);
			msgs = basicSetTitles(newTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__TITLES, newTitles, newTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewDateType getReviewDate() {
		return reviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReviewDate(ReviewDateType newReviewDate, NotificationChain msgs) {
		ReviewDateType oldReviewDate = reviewDate;
		reviewDate = newReviewDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__REVIEW_DATE, oldReviewDate, newReviewDate);
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
	public void setReviewDate(ReviewDateType newReviewDate) {
		if (newReviewDate != reviewDate) {
			NotificationChain msgs = null;
			if (reviewDate != null)
				msgs = ((InternalEObject)reviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__REVIEW_DATE, null, msgs);
			if (newReviewDate != null)
				msgs = ((InternalEObject)newReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__REVIEW_DATE, null, msgs);
			msgs = basicSetReviewDate(newReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__REVIEW_DATE, newReviewDate, newReviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		if (institution == null) {
			institution = new EObjectContainmentEList<InstitutionType>(InstitutionType.class, this, _4Package.PEER_REVIEW_TYPE__INSTITUTION);
		}
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompetingInterestStatementType getCompetingInterestStatement() {
		return competingInterestStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompetingInterestStatement(CompetingInterestStatementType newCompetingInterestStatement, NotificationChain msgs) {
		CompetingInterestStatementType oldCompetingInterestStatement = competingInterestStatement;
		competingInterestStatement = newCompetingInterestStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__COMPETING_INTEREST_STATEMENT, oldCompetingInterestStatement, newCompetingInterestStatement);
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
	public void setCompetingInterestStatement(CompetingInterestStatementType newCompetingInterestStatement) {
		if (newCompetingInterestStatement != competingInterestStatement) {
			NotificationChain msgs = null;
			if (competingInterestStatement != null)
				msgs = ((InternalEObject)competingInterestStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__COMPETING_INTEREST_STATEMENT, null, msgs);
			if (newCompetingInterestStatement != null)
				msgs = ((InternalEObject)newCompetingInterestStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__COMPETING_INTEREST_STATEMENT, null, msgs);
			msgs = basicSetCompetingInterestStatement(newCompetingInterestStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__COMPETING_INTEREST_STATEMENT, newCompetingInterestStatement, newCompetingInterestStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunningNumber() {
		return runningNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunningNumber(String newRunningNumber) {
		String oldRunningNumber = runningNumber;
		runningNumber = newRunningNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__RUNNING_NUMBER, oldRunningNumber, runningNumber));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__PROGRAM, oldProgram, newProgram);
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
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.relations.ProgramType getProgram1() {
		return program1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram1(org.crossref.relations.ProgramType newProgram1, NotificationChain msgs) {
		org.crossref.relations.ProgramType oldProgram1 = program1;
		program1 = newProgram1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__PROGRAM1, oldProgram1, newProgram1);
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
	public void setProgram1(org.crossref.relations.ProgramType newProgram1) {
		if (newProgram1 != program1) {
			NotificationChain msgs = null;
			if (program1 != null)
				msgs = ((InternalEObject)program1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__PROGRAM1, null, msgs);
			if (newProgram1 != null)
				msgs = ((InternalEObject)newProgram1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__PROGRAM1, null, msgs);
			msgs = basicSetProgram1(newProgram1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__PROGRAM1, newProgram1, newProgram1));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__SCN_POLICIES, oldScnPolicies, newScnPolicies);
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
				msgs = ((InternalEObject)scnPolicies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__SCN_POLICIES, null, msgs);
			if (newScnPolicies != null)
				msgs = ((InternalEObject)newScnPolicies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__SCN_POLICIES, null, msgs);
			msgs = basicSetScnPolicies(newScnPolicies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__SCN_POLICIES, newScnPolicies, newScnPolicies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__DOI_DATA, oldDoiData, newDoiData);
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
				msgs = ((InternalEObject)doiData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__DOI_DATA, null, msgs);
			if (newDoiData != null)
				msgs = ((InternalEObject)newDoiData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PEER_REVIEW_TYPE__DOI_DATA, null, msgs);
			msgs = basicSetDoiData(newDoiData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__DOI_DATA, newDoiData, newDoiData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PEER_REVIEW_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
	public RecommendationType getRecommendation() {
		return recommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecommendation(RecommendationType newRecommendation) {
		RecommendationType oldRecommendation = recommendation;
		recommendation = newRecommendation == null ? RECOMMENDATION_EDEFAULT : newRecommendation;
		boolean oldRecommendationESet = recommendationESet;
		recommendationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__RECOMMENDATION, oldRecommendation, recommendation, !oldRecommendationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRecommendation() {
		RecommendationType oldRecommendation = recommendation;
		boolean oldRecommendationESet = recommendationESet;
		recommendation = RECOMMENDATION_EDEFAULT;
		recommendationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PEER_REVIEW_TYPE__RECOMMENDATION, oldRecommendation, RECOMMENDATION_EDEFAULT, oldRecommendationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRecommendation() {
		return recommendationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getRevisionRound() {
		return revisionRound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionRound(BigInteger newRevisionRound) {
		BigInteger oldRevisionRound = revisionRound;
		revisionRound = newRevisionRound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__REVISION_ROUND, oldRevisionRound, revisionRound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StageType getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStage(StageType newStage) {
		StageType oldStage = stage;
		stage = newStage == null ? STAGE_EDEFAULT : newStage;
		boolean oldStageESet = stageESet;
		stageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__STAGE, oldStage, stage, !oldStageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStage() {
		StageType oldStage = stage;
		boolean oldStageESet = stageESet;
		stage = STAGE_EDEFAULT;
		stageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PEER_REVIEW_TYPE__STAGE, oldStage, STAGE_EDEFAULT, oldStageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStage() {
		return stageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType2 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType2 newType) {
		TypeType2 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PEER_REVIEW_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType2 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PEER_REVIEW_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case _4Package.PEER_REVIEW_TYPE__CONTRIBUTORS:
				return basicSetContributors(null, msgs);
			case _4Package.PEER_REVIEW_TYPE__TITLES:
				return basicSetTitles(null, msgs);
			case _4Package.PEER_REVIEW_TYPE__REVIEW_DATE:
				return basicSetReviewDate(null, msgs);
			case _4Package.PEER_REVIEW_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case _4Package.PEER_REVIEW_TYPE__COMPETING_INTEREST_STATEMENT:
				return basicSetCompetingInterestStatement(null, msgs);
			case _4Package.PEER_REVIEW_TYPE__PROGRAM:
				return basicSetProgram(null, msgs);
			case _4Package.PEER_REVIEW_TYPE__PROGRAM1:
				return basicSetProgram1(null, msgs);
			case _4Package.PEER_REVIEW_TYPE__SCN_POLICIES:
				return basicSetScnPolicies(null, msgs);
			case _4Package.PEER_REVIEW_TYPE__DOI_DATA:
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
			case _4Package.PEER_REVIEW_TYPE__CONTRIBUTORS:
				return getContributors();
			case _4Package.PEER_REVIEW_TYPE__TITLES:
				return getTitles();
			case _4Package.PEER_REVIEW_TYPE__REVIEW_DATE:
				return getReviewDate();
			case _4Package.PEER_REVIEW_TYPE__INSTITUTION:
				return getInstitution();
			case _4Package.PEER_REVIEW_TYPE__COMPETING_INTEREST_STATEMENT:
				return getCompetingInterestStatement();
			case _4Package.PEER_REVIEW_TYPE__RUNNING_NUMBER:
				return getRunningNumber();
			case _4Package.PEER_REVIEW_TYPE__PROGRAM:
				return getProgram();
			case _4Package.PEER_REVIEW_TYPE__PROGRAM1:
				return getProgram1();
			case _4Package.PEER_REVIEW_TYPE__SCN_POLICIES:
				return getScnPolicies();
			case _4Package.PEER_REVIEW_TYPE__DOI_DATA:
				return getDoiData();
			case _4Package.PEER_REVIEW_TYPE__LANGUAGE:
				return getLanguage();
			case _4Package.PEER_REVIEW_TYPE__RECOMMENDATION:
				return getRecommendation();
			case _4Package.PEER_REVIEW_TYPE__REVISION_ROUND:
				return getRevisionRound();
			case _4Package.PEER_REVIEW_TYPE__STAGE:
				return getStage();
			case _4Package.PEER_REVIEW_TYPE__TYPE:
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
			case _4Package.PEER_REVIEW_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__TITLES:
				setTitles((TitlesType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__REVIEW_DATE:
				setReviewDate((ReviewDateType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__COMPETING_INTEREST_STATEMENT:
				setCompetingInterestStatement((CompetingInterestStatementType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__RUNNING_NUMBER:
				setRunningNumber((String)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__PROGRAM:
				setProgram((ProgramType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__PROGRAM1:
				setProgram1((org.crossref.relations.ProgramType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__SCN_POLICIES:
				setScnPolicies((ScnPoliciesType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__DOI_DATA:
				setDoiData((DoiDataType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__RECOMMENDATION:
				setRecommendation((RecommendationType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__REVISION_ROUND:
				setRevisionRound((BigInteger)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__STAGE:
				setStage((StageType)newValue);
				return;
			case _4Package.PEER_REVIEW_TYPE__TYPE:
				setType((TypeType2)newValue);
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
			case _4Package.PEER_REVIEW_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)null);
				return;
			case _4Package.PEER_REVIEW_TYPE__TITLES:
				setTitles((TitlesType)null);
				return;
			case _4Package.PEER_REVIEW_TYPE__REVIEW_DATE:
				setReviewDate((ReviewDateType)null);
				return;
			case _4Package.PEER_REVIEW_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case _4Package.PEER_REVIEW_TYPE__COMPETING_INTEREST_STATEMENT:
				setCompetingInterestStatement((CompetingInterestStatementType)null);
				return;
			case _4Package.PEER_REVIEW_TYPE__RUNNING_NUMBER:
				setRunningNumber(RUNNING_NUMBER_EDEFAULT);
				return;
			case _4Package.PEER_REVIEW_TYPE__PROGRAM:
				setProgram((ProgramType)null);
				return;
			case _4Package.PEER_REVIEW_TYPE__PROGRAM1:
				setProgram1((org.crossref.relations.ProgramType)null);
				return;
			case _4Package.PEER_REVIEW_TYPE__SCN_POLICIES:
				setScnPolicies((ScnPoliciesType)null);
				return;
			case _4Package.PEER_REVIEW_TYPE__DOI_DATA:
				setDoiData((DoiDataType)null);
				return;
			case _4Package.PEER_REVIEW_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case _4Package.PEER_REVIEW_TYPE__RECOMMENDATION:
				unsetRecommendation();
				return;
			case _4Package.PEER_REVIEW_TYPE__REVISION_ROUND:
				setRevisionRound(REVISION_ROUND_EDEFAULT);
				return;
			case _4Package.PEER_REVIEW_TYPE__STAGE:
				unsetStage();
				return;
			case _4Package.PEER_REVIEW_TYPE__TYPE:
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
			case _4Package.PEER_REVIEW_TYPE__CONTRIBUTORS:
				return contributors != null;
			case _4Package.PEER_REVIEW_TYPE__TITLES:
				return titles != null;
			case _4Package.PEER_REVIEW_TYPE__REVIEW_DATE:
				return reviewDate != null;
			case _4Package.PEER_REVIEW_TYPE__INSTITUTION:
				return institution != null && !institution.isEmpty();
			case _4Package.PEER_REVIEW_TYPE__COMPETING_INTEREST_STATEMENT:
				return competingInterestStatement != null;
			case _4Package.PEER_REVIEW_TYPE__RUNNING_NUMBER:
				return RUNNING_NUMBER_EDEFAULT == null ? runningNumber != null : !RUNNING_NUMBER_EDEFAULT.equals(runningNumber);
			case _4Package.PEER_REVIEW_TYPE__PROGRAM:
				return program != null;
			case _4Package.PEER_REVIEW_TYPE__PROGRAM1:
				return program1 != null;
			case _4Package.PEER_REVIEW_TYPE__SCN_POLICIES:
				return scnPolicies != null;
			case _4Package.PEER_REVIEW_TYPE__DOI_DATA:
				return doiData != null;
			case _4Package.PEER_REVIEW_TYPE__LANGUAGE:
				return isSetLanguage();
			case _4Package.PEER_REVIEW_TYPE__RECOMMENDATION:
				return isSetRecommendation();
			case _4Package.PEER_REVIEW_TYPE__REVISION_ROUND:
				return REVISION_ROUND_EDEFAULT == null ? revisionRound != null : !REVISION_ROUND_EDEFAULT.equals(revisionRound);
			case _4Package.PEER_REVIEW_TYPE__STAGE:
				return isSetStage();
			case _4Package.PEER_REVIEW_TYPE__TYPE:
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
		result.append(" (runningNumber: ");
		result.append(runningNumber);
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", recommendation: ");
		if (recommendationESet) result.append(recommendation); else result.append("<unset>");
		result.append(", revisionRound: ");
		result.append(revisionRound);
		result.append(", stage: ");
		if (stageESet) result.append(stage); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PeerReviewTypeImpl
