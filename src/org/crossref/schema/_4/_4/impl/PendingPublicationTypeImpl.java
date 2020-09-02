/**
 */
package org.crossref.schema._4._4.impl;

import gov.nih.nlm.ncbi.jats1.AbstractType;

import java.util.Collection;

import org.crossref.fundref.ProgramType;

import org.crossref.schema._4._4.AcceptanceDateType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.CrossmarkType;
import org.crossref.schema._4._4.InstitutionType;
import org.crossref.schema._4._4.IntentStatementType;
import org.crossref.schema._4._4.ItemNumberType;
import org.crossref.schema._4._4.LanguageType;
import org.crossref.schema._4._4.PendingPublicationType;
import org.crossref.schema._4._4.PublicationType;
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
 * An implementation of the model object '<em><b>Pending Publication Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getPublication <em>Publication</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getAcceptanceDate <em>Acceptance Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getItemNumber <em>Item Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getIntentStatement <em>Intent Statement</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getCrossmark <em>Crossmark</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getProgram2 <em>Program2</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PendingPublicationTypeImpl extends MinimalEObjectImpl.Container implements PendingPublicationType {
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
	 * The cached value of the '{@link #getPublication() <em>Publication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublication()
	 * @generated
	 * @ordered
	 */
	protected PublicationType publication;

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
	 * The cached value of the '{@link #getIntentStatement() <em>Intent Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentStatement()
	 * @generated
	 * @ordered
	 */
	protected IntentStatementType intentStatement;

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
	protected org.crossref.relations.ProgramType program2;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PendingPublicationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getPendingPublicationType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__CONTRIBUTORS, oldContributors, newContributors);
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
				msgs = ((InternalEObject)contributors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__CONTRIBUTORS, null, msgs);
			if (newContributors != null)
				msgs = ((InternalEObject)newContributors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__CONTRIBUTORS, null, msgs);
			msgs = basicSetContributors(newContributors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__CONTRIBUTORS, newContributors, newContributors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationType getPublication() {
		return publication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublication(PublicationType newPublication, NotificationChain msgs) {
		PublicationType oldPublication = publication;
		publication = newPublication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__PUBLICATION, oldPublication, newPublication);
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
	public void setPublication(PublicationType newPublication) {
		if (newPublication != publication) {
			NotificationChain msgs = null;
			if (publication != null)
				msgs = ((InternalEObject)publication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__PUBLICATION, null, msgs);
			if (newPublication != null)
				msgs = ((InternalEObject)newPublication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__PUBLICATION, null, msgs);
			msgs = basicSetPublication(newPublication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__PUBLICATION, newPublication, newPublication));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__TITLES, oldTitles, newTitles);
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
				msgs = ((InternalEObject)titles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__TITLES, null, msgs);
			if (newTitles != null)
				msgs = ((InternalEObject)newTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__TITLES, null, msgs);
			msgs = basicSetTitles(newTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__TITLES, newTitles, newTitles));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__ACCEPTANCE_DATE, oldAcceptanceDate, newAcceptanceDate);
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
				msgs = ((InternalEObject)acceptanceDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__ACCEPTANCE_DATE, null, msgs);
			if (newAcceptanceDate != null)
				msgs = ((InternalEObject)newAcceptanceDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__ACCEPTANCE_DATE, null, msgs);
			msgs = basicSetAcceptanceDate(newAcceptanceDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__ACCEPTANCE_DATE, newAcceptanceDate, newAcceptanceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		if (institution == null) {
			institution = new EObjectContainmentEList<InstitutionType>(InstitutionType.class, this, _4Package.PENDING_PUBLICATION_TYPE__INSTITUTION);
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
			itemNumber = new EObjectContainmentEList<ItemNumberType>(ItemNumberType.class, this, _4Package.PENDING_PUBLICATION_TYPE__ITEM_NUMBER);
		}
		return itemNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntentStatementType getIntentStatement() {
		return intentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntentStatement(IntentStatementType newIntentStatement, NotificationChain msgs) {
		IntentStatementType oldIntentStatement = intentStatement;
		intentStatement = newIntentStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__INTENT_STATEMENT, oldIntentStatement, newIntentStatement);
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
	public void setIntentStatement(IntentStatementType newIntentStatement) {
		if (newIntentStatement != intentStatement) {
			NotificationChain msgs = null;
			if (intentStatement != null)
				msgs = ((InternalEObject)intentStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__INTENT_STATEMENT, null, msgs);
			if (newIntentStatement != null)
				msgs = ((InternalEObject)newIntentStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__INTENT_STATEMENT, null, msgs);
			msgs = basicSetIntentStatement(newIntentStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__INTENT_STATEMENT, newIntentStatement, newIntentStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractType> getAbstract() {
		if (abstract_ == null) {
			abstract_ = new EObjectContainmentEList<AbstractType>(AbstractType.class, this, _4Package.PENDING_PUBLICATION_TYPE__ABSTRACT);
		}
		return abstract_;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__CROSSMARK, oldCrossmark, newCrossmark);
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
				msgs = ((InternalEObject)crossmark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__CROSSMARK, null, msgs);
			if (newCrossmark != null)
				msgs = ((InternalEObject)newCrossmark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__CROSSMARK, null, msgs);
			msgs = basicSetCrossmark(newCrossmark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__CROSSMARK, newCrossmark, newCrossmark));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__PROGRAM, oldProgram, newProgram);
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
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__PROGRAM, newProgram, newProgram));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__PROGRAM1, oldProgram1, newProgram1);
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
				msgs = ((InternalEObject)program1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__PROGRAM1, null, msgs);
			if (newProgram1 != null)
				msgs = ((InternalEObject)newProgram1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__PROGRAM1, null, msgs);
			msgs = basicSetProgram1(newProgram1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__PROGRAM1, newProgram1, newProgram1));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__PROGRAM2, oldProgram2, newProgram2);
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
				msgs = ((InternalEObject)program2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__PROGRAM2, null, msgs);
			if (newProgram2 != null)
				msgs = ((InternalEObject)newProgram2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.PENDING_PUBLICATION_TYPE__PROGRAM2, null, msgs);
			msgs = basicSetProgram2(newProgram2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__PROGRAM2, newProgram2, newProgram2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__DOI, oldDoi, doi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PENDING_PUBLICATION_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.PENDING_PUBLICATION_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.PENDING_PUBLICATION_TYPE__CONTRIBUTORS:
				return basicSetContributors(null, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__PUBLICATION:
				return basicSetPublication(null, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__TITLES:
				return basicSetTitles(null, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__ACCEPTANCE_DATE:
				return basicSetAcceptanceDate(null, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__ITEM_NUMBER:
				return ((InternalEList<?>)getItemNumber()).basicRemove(otherEnd, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__INTENT_STATEMENT:
				return basicSetIntentStatement(null, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__CROSSMARK:
				return basicSetCrossmark(null, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM:
				return basicSetProgram(null, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM1:
				return basicSetProgram1(null, msgs);
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM2:
				return basicSetProgram2(null, msgs);
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
			case _4Package.PENDING_PUBLICATION_TYPE__CONTRIBUTORS:
				return getContributors();
			case _4Package.PENDING_PUBLICATION_TYPE__PUBLICATION:
				return getPublication();
			case _4Package.PENDING_PUBLICATION_TYPE__TITLES:
				return getTitles();
			case _4Package.PENDING_PUBLICATION_TYPE__ACCEPTANCE_DATE:
				return getAcceptanceDate();
			case _4Package.PENDING_PUBLICATION_TYPE__INSTITUTION:
				return getInstitution();
			case _4Package.PENDING_PUBLICATION_TYPE__ITEM_NUMBER:
				return getItemNumber();
			case _4Package.PENDING_PUBLICATION_TYPE__INTENT_STATEMENT:
				return getIntentStatement();
			case _4Package.PENDING_PUBLICATION_TYPE__ABSTRACT:
				return getAbstract();
			case _4Package.PENDING_PUBLICATION_TYPE__CROSSMARK:
				return getCrossmark();
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM:
				return getProgram();
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM1:
				return getProgram1();
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM2:
				return getProgram2();
			case _4Package.PENDING_PUBLICATION_TYPE__DOI:
				return getDoi();
			case _4Package.PENDING_PUBLICATION_TYPE__LANGUAGE:
				return getLanguage();
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
			case _4Package.PENDING_PUBLICATION_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__PUBLICATION:
				setPublication((PublicationType)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__TITLES:
				setTitles((TitlesType)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__ACCEPTANCE_DATE:
				setAcceptanceDate((AcceptanceDateType)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__ITEM_NUMBER:
				getItemNumber().clear();
				getItemNumber().addAll((Collection<? extends ItemNumberType>)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__INTENT_STATEMENT:
				setIntentStatement((IntentStatementType)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__CROSSMARK:
				setCrossmark((CrossmarkType)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM:
				setProgram((ProgramType)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM1:
				setProgram1((org.crossref.access.indicators.ProgramType)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM2:
				setProgram2((org.crossref.relations.ProgramType)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__DOI:
				setDoi((String)newValue);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
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
			case _4Package.PENDING_PUBLICATION_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)null);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__PUBLICATION:
				setPublication((PublicationType)null);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__TITLES:
				setTitles((TitlesType)null);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__ACCEPTANCE_DATE:
				setAcceptanceDate((AcceptanceDateType)null);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__ITEM_NUMBER:
				getItemNumber().clear();
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__INTENT_STATEMENT:
				setIntentStatement((IntentStatementType)null);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__CROSSMARK:
				setCrossmark((CrossmarkType)null);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM:
				setProgram((ProgramType)null);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM1:
				setProgram1((org.crossref.access.indicators.ProgramType)null);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM2:
				setProgram2((org.crossref.relations.ProgramType)null);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__DOI:
				setDoi(DOI_EDEFAULT);
				return;
			case _4Package.PENDING_PUBLICATION_TYPE__LANGUAGE:
				unsetLanguage();
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
			case _4Package.PENDING_PUBLICATION_TYPE__CONTRIBUTORS:
				return contributors != null;
			case _4Package.PENDING_PUBLICATION_TYPE__PUBLICATION:
				return publication != null;
			case _4Package.PENDING_PUBLICATION_TYPE__TITLES:
				return titles != null;
			case _4Package.PENDING_PUBLICATION_TYPE__ACCEPTANCE_DATE:
				return acceptanceDate != null;
			case _4Package.PENDING_PUBLICATION_TYPE__INSTITUTION:
				return institution != null && !institution.isEmpty();
			case _4Package.PENDING_PUBLICATION_TYPE__ITEM_NUMBER:
				return itemNumber != null && !itemNumber.isEmpty();
			case _4Package.PENDING_PUBLICATION_TYPE__INTENT_STATEMENT:
				return intentStatement != null;
			case _4Package.PENDING_PUBLICATION_TYPE__ABSTRACT:
				return abstract_ != null && !abstract_.isEmpty();
			case _4Package.PENDING_PUBLICATION_TYPE__CROSSMARK:
				return crossmark != null;
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM:
				return program != null;
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM1:
				return program1 != null;
			case _4Package.PENDING_PUBLICATION_TYPE__PROGRAM2:
				return program2 != null;
			case _4Package.PENDING_PUBLICATION_TYPE__DOI:
				return DOI_EDEFAULT == null ? doi != null : !DOI_EDEFAULT.equals(doi);
			case _4Package.PENDING_PUBLICATION_TYPE__LANGUAGE:
				return isSetLanguage();
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
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PendingPublicationTypeImpl
