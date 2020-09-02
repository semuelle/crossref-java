/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.CitationT;
import org.crossref.schema._4._4.IsbnType;
import org.crossref.schema._4._4.IssnType;
import org.crossref.schema._4._4.StandardsBodyType;
import org.crossref.schema._4._4.UnstructuredCitationType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getJournalTitle <em>Journal Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getFirstPage <em>First Page</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getCYear <em>CYear</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getSeriesTitle <em>Series Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getVolumeTitle <em>Volume Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getEditionNumber <em>Edition Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getComponentNumber <em>Component Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getStdDesignator <em>Std Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getStandardsBody <em>Standards Body</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CitationTImpl#getUnstructuredCitation <em>Unstructured Citation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationTImpl extends MinimalEObjectImpl.Container implements CitationT {
	/**
	 * The cached value of the '{@link #getIssn() <em>Issn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssn()
	 * @generated
	 * @ordered
	 */
	protected IssnType issn;

	/**
	 * The default value of the '{@link #getJournalTitle() <em>Journal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNAL_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJournalTitle() <em>Journal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalTitle()
	 * @generated
	 * @ordered
	 */
	protected String journalTitle = JOURNAL_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected String volume = VOLUME_EDEFAULT;

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
	 * The default value of the '{@link #getFirstPage() <em>First Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPage()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstPage() <em>First Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPage()
	 * @generated
	 * @ordered
	 */
	protected String firstPage = FIRST_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElocationId() <em>Elocation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElocationId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELOCATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElocationId() <em>Elocation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElocationId()
	 * @generated
	 * @ordered
	 */
	protected String elocationId = ELOCATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCYear() <em>CYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCYear()
	 * @generated
	 * @ordered
	 */
	protected static final String CYEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCYear() <em>CYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCYear()
	 * @generated
	 * @ordered
	 */
	protected String cYear = CYEAR_EDEFAULT;

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
	 * The cached value of the '{@link #getIsbn() <em>Isbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected IsbnType isbn;

	/**
	 * The default value of the '{@link #getSeriesTitle() <em>Series Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIES_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeriesTitle() <em>Series Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesTitle()
	 * @generated
	 * @ordered
	 */
	protected String seriesTitle = SERIES_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumeTitle() <em>Volume Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolumeTitle() <em>Volume Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeTitle()
	 * @generated
	 * @ordered
	 */
	protected String volumeTitle = VOLUME_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditionNumber() <em>Edition Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditionNumber() <em>Edition Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionNumber()
	 * @generated
	 * @ordered
	 */
	protected String editionNumber = EDITION_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getArticleTitle() <em>Article Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTICLE_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArticleTitle() <em>Article Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleTitle()
	 * @generated
	 * @ordered
	 */
	protected String articleTitle = ARTICLE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStdDesignator() <em>Std Designator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdDesignator()
	 * @generated
	 * @ordered
	 */
	protected static final String STD_DESIGNATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStdDesignator() <em>Std Designator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdDesignator()
	 * @generated
	 * @ordered
	 */
	protected String stdDesignator = STD_DESIGNATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStandardsBody() <em>Standards Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardsBody()
	 * @generated
	 * @ordered
	 */
	protected StandardsBodyType standardsBody;

	/**
	 * The cached value of the '{@link #getUnstructuredCitation() <em>Unstructured Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnstructuredCitation()
	 * @generated
	 * @ordered
	 */
	protected UnstructuredCitationType unstructuredCitation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getCitationT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssnType getIssn() {
		return issn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssn(IssnType newIssn, NotificationChain msgs) {
		IssnType oldIssn = issn;
		issn = newIssn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__ISSN, oldIssn, newIssn);
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
	public void setIssn(IssnType newIssn) {
		if (newIssn != issn) {
			NotificationChain msgs = null;
			if (issn != null)
				msgs = ((InternalEObject)issn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CITATION_T__ISSN, null, msgs);
			if (newIssn != null)
				msgs = ((InternalEObject)newIssn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CITATION_T__ISSN, null, msgs);
			msgs = basicSetIssn(newIssn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__ISSN, newIssn, newIssn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJournalTitle() {
		return journalTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalTitle(String newJournalTitle) {
		String oldJournalTitle = journalTitle;
		journalTitle = newJournalTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__JOURNAL_TITLE, oldJournalTitle, journalTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolume(String newVolume) {
		String oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__VOLUME, oldVolume, volume));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__ISSUE, oldIssue, issue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstPage() {
		return firstPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstPage(String newFirstPage) {
		String oldFirstPage = firstPage;
		firstPage = newFirstPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__FIRST_PAGE, oldFirstPage, firstPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElocationId() {
		return elocationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElocationId(String newElocationId) {
		String oldElocationId = elocationId;
		elocationId = newElocationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__ELOCATION_ID, oldElocationId, elocationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCYear() {
		return cYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCYear(String newCYear) {
		String oldCYear = cYear;
		cYear = newCYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__CYEAR, oldCYear, cYear));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__DOI, oldDoi, doi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsbnType getIsbn() {
		return isbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsbn(IsbnType newIsbn, NotificationChain msgs) {
		IsbnType oldIsbn = isbn;
		isbn = newIsbn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__ISBN, oldIsbn, newIsbn);
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
	public void setIsbn(IsbnType newIsbn) {
		if (newIsbn != isbn) {
			NotificationChain msgs = null;
			if (isbn != null)
				msgs = ((InternalEObject)isbn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CITATION_T__ISBN, null, msgs);
			if (newIsbn != null)
				msgs = ((InternalEObject)newIsbn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CITATION_T__ISBN, null, msgs);
			msgs = basicSetIsbn(newIsbn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__ISBN, newIsbn, newIsbn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeriesTitle() {
		return seriesTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeriesTitle(String newSeriesTitle) {
		String oldSeriesTitle = seriesTitle;
		seriesTitle = newSeriesTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__SERIES_TITLE, oldSeriesTitle, seriesTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVolumeTitle() {
		return volumeTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeTitle(String newVolumeTitle) {
		String oldVolumeTitle = volumeTitle;
		volumeTitle = newVolumeTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__VOLUME_TITLE, oldVolumeTitle, volumeTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEditionNumber() {
		return editionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditionNumber(String newEditionNumber) {
		String oldEditionNumber = editionNumber;
		editionNumber = newEditionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__EDITION_NUMBER, oldEditionNumber, editionNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__COMPONENT_NUMBER, oldComponentNumber, componentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArticleTitle() {
		return articleTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleTitle(String newArticleTitle) {
		String oldArticleTitle = articleTitle;
		articleTitle = newArticleTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__ARTICLE_TITLE, oldArticleTitle, articleTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStdDesignator() {
		return stdDesignator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdDesignator(String newStdDesignator) {
		String oldStdDesignator = stdDesignator;
		stdDesignator = newStdDesignator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__STD_DESIGNATOR, oldStdDesignator, stdDesignator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardsBodyType getStandardsBody() {
		return standardsBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardsBody(StandardsBodyType newStandardsBody, NotificationChain msgs) {
		StandardsBodyType oldStandardsBody = standardsBody;
		standardsBody = newStandardsBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__STANDARDS_BODY, oldStandardsBody, newStandardsBody);
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
	public void setStandardsBody(StandardsBodyType newStandardsBody) {
		if (newStandardsBody != standardsBody) {
			NotificationChain msgs = null;
			if (standardsBody != null)
				msgs = ((InternalEObject)standardsBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CITATION_T__STANDARDS_BODY, null, msgs);
			if (newStandardsBody != null)
				msgs = ((InternalEObject)newStandardsBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CITATION_T__STANDARDS_BODY, null, msgs);
			msgs = basicSetStandardsBody(newStandardsBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__STANDARDS_BODY, newStandardsBody, newStandardsBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredCitationType getUnstructuredCitation() {
		return unstructuredCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnstructuredCitation(UnstructuredCitationType newUnstructuredCitation, NotificationChain msgs) {
		UnstructuredCitationType oldUnstructuredCitation = unstructuredCitation;
		unstructuredCitation = newUnstructuredCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__UNSTRUCTURED_CITATION, oldUnstructuredCitation, newUnstructuredCitation);
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
	public void setUnstructuredCitation(UnstructuredCitationType newUnstructuredCitation) {
		if (newUnstructuredCitation != unstructuredCitation) {
			NotificationChain msgs = null;
			if (unstructuredCitation != null)
				msgs = ((InternalEObject)unstructuredCitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CITATION_T__UNSTRUCTURED_CITATION, null, msgs);
			if (newUnstructuredCitation != null)
				msgs = ((InternalEObject)newUnstructuredCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CITATION_T__UNSTRUCTURED_CITATION, null, msgs);
			msgs = basicSetUnstructuredCitation(newUnstructuredCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CITATION_T__UNSTRUCTURED_CITATION, newUnstructuredCitation, newUnstructuredCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.CITATION_T__ISSN:
				return basicSetIssn(null, msgs);
			case _4Package.CITATION_T__ISBN:
				return basicSetIsbn(null, msgs);
			case _4Package.CITATION_T__STANDARDS_BODY:
				return basicSetStandardsBody(null, msgs);
			case _4Package.CITATION_T__UNSTRUCTURED_CITATION:
				return basicSetUnstructuredCitation(null, msgs);
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
			case _4Package.CITATION_T__ISSN:
				return getIssn();
			case _4Package.CITATION_T__JOURNAL_TITLE:
				return getJournalTitle();
			case _4Package.CITATION_T__AUTHOR:
				return getAuthor();
			case _4Package.CITATION_T__VOLUME:
				return getVolume();
			case _4Package.CITATION_T__ISSUE:
				return getIssue();
			case _4Package.CITATION_T__FIRST_PAGE:
				return getFirstPage();
			case _4Package.CITATION_T__ELOCATION_ID:
				return getElocationId();
			case _4Package.CITATION_T__CYEAR:
				return getCYear();
			case _4Package.CITATION_T__DOI:
				return getDoi();
			case _4Package.CITATION_T__ISBN:
				return getIsbn();
			case _4Package.CITATION_T__SERIES_TITLE:
				return getSeriesTitle();
			case _4Package.CITATION_T__VOLUME_TITLE:
				return getVolumeTitle();
			case _4Package.CITATION_T__EDITION_NUMBER:
				return getEditionNumber();
			case _4Package.CITATION_T__COMPONENT_NUMBER:
				return getComponentNumber();
			case _4Package.CITATION_T__ARTICLE_TITLE:
				return getArticleTitle();
			case _4Package.CITATION_T__STD_DESIGNATOR:
				return getStdDesignator();
			case _4Package.CITATION_T__STANDARDS_BODY:
				return getStandardsBody();
			case _4Package.CITATION_T__UNSTRUCTURED_CITATION:
				return getUnstructuredCitation();
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
			case _4Package.CITATION_T__ISSN:
				setIssn((IssnType)newValue);
				return;
			case _4Package.CITATION_T__JOURNAL_TITLE:
				setJournalTitle((String)newValue);
				return;
			case _4Package.CITATION_T__AUTHOR:
				setAuthor((String)newValue);
				return;
			case _4Package.CITATION_T__VOLUME:
				setVolume((String)newValue);
				return;
			case _4Package.CITATION_T__ISSUE:
				setIssue((String)newValue);
				return;
			case _4Package.CITATION_T__FIRST_PAGE:
				setFirstPage((String)newValue);
				return;
			case _4Package.CITATION_T__ELOCATION_ID:
				setElocationId((String)newValue);
				return;
			case _4Package.CITATION_T__CYEAR:
				setCYear((String)newValue);
				return;
			case _4Package.CITATION_T__DOI:
				setDoi((String)newValue);
				return;
			case _4Package.CITATION_T__ISBN:
				setIsbn((IsbnType)newValue);
				return;
			case _4Package.CITATION_T__SERIES_TITLE:
				setSeriesTitle((String)newValue);
				return;
			case _4Package.CITATION_T__VOLUME_TITLE:
				setVolumeTitle((String)newValue);
				return;
			case _4Package.CITATION_T__EDITION_NUMBER:
				setEditionNumber((String)newValue);
				return;
			case _4Package.CITATION_T__COMPONENT_NUMBER:
				setComponentNumber((String)newValue);
				return;
			case _4Package.CITATION_T__ARTICLE_TITLE:
				setArticleTitle((String)newValue);
				return;
			case _4Package.CITATION_T__STD_DESIGNATOR:
				setStdDesignator((String)newValue);
				return;
			case _4Package.CITATION_T__STANDARDS_BODY:
				setStandardsBody((StandardsBodyType)newValue);
				return;
			case _4Package.CITATION_T__UNSTRUCTURED_CITATION:
				setUnstructuredCitation((UnstructuredCitationType)newValue);
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
			case _4Package.CITATION_T__ISSN:
				setIssn((IssnType)null);
				return;
			case _4Package.CITATION_T__JOURNAL_TITLE:
				setJournalTitle(JOURNAL_TITLE_EDEFAULT);
				return;
			case _4Package.CITATION_T__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case _4Package.CITATION_T__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case _4Package.CITATION_T__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case _4Package.CITATION_T__FIRST_PAGE:
				setFirstPage(FIRST_PAGE_EDEFAULT);
				return;
			case _4Package.CITATION_T__ELOCATION_ID:
				setElocationId(ELOCATION_ID_EDEFAULT);
				return;
			case _4Package.CITATION_T__CYEAR:
				setCYear(CYEAR_EDEFAULT);
				return;
			case _4Package.CITATION_T__DOI:
				setDoi(DOI_EDEFAULT);
				return;
			case _4Package.CITATION_T__ISBN:
				setIsbn((IsbnType)null);
				return;
			case _4Package.CITATION_T__SERIES_TITLE:
				setSeriesTitle(SERIES_TITLE_EDEFAULT);
				return;
			case _4Package.CITATION_T__VOLUME_TITLE:
				setVolumeTitle(VOLUME_TITLE_EDEFAULT);
				return;
			case _4Package.CITATION_T__EDITION_NUMBER:
				setEditionNumber(EDITION_NUMBER_EDEFAULT);
				return;
			case _4Package.CITATION_T__COMPONENT_NUMBER:
				setComponentNumber(COMPONENT_NUMBER_EDEFAULT);
				return;
			case _4Package.CITATION_T__ARTICLE_TITLE:
				setArticleTitle(ARTICLE_TITLE_EDEFAULT);
				return;
			case _4Package.CITATION_T__STD_DESIGNATOR:
				setStdDesignator(STD_DESIGNATOR_EDEFAULT);
				return;
			case _4Package.CITATION_T__STANDARDS_BODY:
				setStandardsBody((StandardsBodyType)null);
				return;
			case _4Package.CITATION_T__UNSTRUCTURED_CITATION:
				setUnstructuredCitation((UnstructuredCitationType)null);
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
			case _4Package.CITATION_T__ISSN:
				return issn != null;
			case _4Package.CITATION_T__JOURNAL_TITLE:
				return JOURNAL_TITLE_EDEFAULT == null ? journalTitle != null : !JOURNAL_TITLE_EDEFAULT.equals(journalTitle);
			case _4Package.CITATION_T__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case _4Package.CITATION_T__VOLUME:
				return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
			case _4Package.CITATION_T__ISSUE:
				return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
			case _4Package.CITATION_T__FIRST_PAGE:
				return FIRST_PAGE_EDEFAULT == null ? firstPage != null : !FIRST_PAGE_EDEFAULT.equals(firstPage);
			case _4Package.CITATION_T__ELOCATION_ID:
				return ELOCATION_ID_EDEFAULT == null ? elocationId != null : !ELOCATION_ID_EDEFAULT.equals(elocationId);
			case _4Package.CITATION_T__CYEAR:
				return CYEAR_EDEFAULT == null ? cYear != null : !CYEAR_EDEFAULT.equals(cYear);
			case _4Package.CITATION_T__DOI:
				return DOI_EDEFAULT == null ? doi != null : !DOI_EDEFAULT.equals(doi);
			case _4Package.CITATION_T__ISBN:
				return isbn != null;
			case _4Package.CITATION_T__SERIES_TITLE:
				return SERIES_TITLE_EDEFAULT == null ? seriesTitle != null : !SERIES_TITLE_EDEFAULT.equals(seriesTitle);
			case _4Package.CITATION_T__VOLUME_TITLE:
				return VOLUME_TITLE_EDEFAULT == null ? volumeTitle != null : !VOLUME_TITLE_EDEFAULT.equals(volumeTitle);
			case _4Package.CITATION_T__EDITION_NUMBER:
				return EDITION_NUMBER_EDEFAULT == null ? editionNumber != null : !EDITION_NUMBER_EDEFAULT.equals(editionNumber);
			case _4Package.CITATION_T__COMPONENT_NUMBER:
				return COMPONENT_NUMBER_EDEFAULT == null ? componentNumber != null : !COMPONENT_NUMBER_EDEFAULT.equals(componentNumber);
			case _4Package.CITATION_T__ARTICLE_TITLE:
				return ARTICLE_TITLE_EDEFAULT == null ? articleTitle != null : !ARTICLE_TITLE_EDEFAULT.equals(articleTitle);
			case _4Package.CITATION_T__STD_DESIGNATOR:
				return STD_DESIGNATOR_EDEFAULT == null ? stdDesignator != null : !STD_DESIGNATOR_EDEFAULT.equals(stdDesignator);
			case _4Package.CITATION_T__STANDARDS_BODY:
				return standardsBody != null;
			case _4Package.CITATION_T__UNSTRUCTURED_CITATION:
				return unstructuredCitation != null;
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
		result.append(" (journalTitle: ");
		result.append(journalTitle);
		result.append(", author: ");
		result.append(author);
		result.append(", volume: ");
		result.append(volume);
		result.append(", issue: ");
		result.append(issue);
		result.append(", firstPage: ");
		result.append(firstPage);
		result.append(", elocationId: ");
		result.append(elocationId);
		result.append(", cYear: ");
		result.append(cYear);
		result.append(", doi: ");
		result.append(doi);
		result.append(", seriesTitle: ");
		result.append(seriesTitle);
		result.append(", volumeTitle: ");
		result.append(volumeTitle);
		result.append(", editionNumber: ");
		result.append(editionNumber);
		result.append(", componentNumber: ");
		result.append(componentNumber);
		result.append(", articleTitle: ");
		result.append(articleTitle);
		result.append(", stdDesignator: ");
		result.append(stdDesignator);
		result.append(')');
		return result.toString();
	}

} //CitationTImpl
