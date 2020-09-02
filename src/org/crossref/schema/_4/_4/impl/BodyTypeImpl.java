/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.BodyType;
import org.crossref.schema._4._4.BookType;
import org.crossref.schema._4._4.ConferenceType;
import org.crossref.schema._4._4.DatabaseType;
import org.crossref.schema._4._4.DissertationType;
import org.crossref.schema._4._4.JournalType;
import org.crossref.schema._4._4.PeerReviewType;
import org.crossref.schema._4._4.PendingPublicationType;
import org.crossref.schema._4._4.PostedContentType;
import org.crossref.schema._4._4.ReportPaperType;
import org.crossref.schema._4._4.SaComponentType;
import org.crossref.schema._4._4.StandardType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getJournal <em>Journal</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getBook <em>Book</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getConference <em>Conference</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getSaComponent <em>Sa Component</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getDissertation <em>Dissertation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getReportPaper <em>Report Paper</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getPeerReview <em>Peer Review</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getPendingPublication <em>Pending Publication</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BodyTypeImpl#getPostedContent <em>Posted Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyTypeImpl extends MinimalEObjectImpl.Container implements BodyType {
	/**
	 * The cached value of the '{@link #getJournal() <em>Journal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournal()
	 * @generated
	 * @ordered
	 */
	protected EList<JournalType> journal;

	/**
	 * The cached value of the '{@link #getBook() <em>Book</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBook()
	 * @generated
	 * @ordered
	 */
	protected EList<BookType> book;

	/**
	 * The cached value of the '{@link #getConference() <em>Conference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConference()
	 * @generated
	 * @ordered
	 */
	protected EList<ConferenceType> conference;

	/**
	 * The cached value of the '{@link #getSaComponent() <em>Sa Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SaComponentType> saComponent;

	/**
	 * The cached value of the '{@link #getDissertation() <em>Dissertation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissertation()
	 * @generated
	 * @ordered
	 */
	protected EList<DissertationType> dissertation;

	/**
	 * The cached value of the '{@link #getReportPaper() <em>Report Paper</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportPaper()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportPaperType> reportPaper;

	/**
	 * The cached value of the '{@link #getStandard() <em>Standard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected EList<StandardType> standard;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseType> database;

	/**
	 * The cached value of the '{@link #getPeerReview() <em>Peer Review</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerReview()
	 * @generated
	 * @ordered
	 */
	protected EList<PeerReviewType> peerReview;

	/**
	 * The cached value of the '{@link #getPendingPublication() <em>Pending Publication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingPublication()
	 * @generated
	 * @ordered
	 */
	protected EList<PendingPublicationType> pendingPublication;

	/**
	 * The cached value of the '{@link #getPostedContent() <em>Posted Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedContent()
	 * @generated
	 * @ordered
	 */
	protected EList<PostedContentType> postedContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getBodyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JournalType> getJournal() {
		if (journal == null) {
			journal = new EObjectContainmentEList<JournalType>(JournalType.class, this, _4Package.BODY_TYPE__JOURNAL);
		}
		return journal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BookType> getBook() {
		if (book == null) {
			book = new EObjectContainmentEList<BookType>(BookType.class, this, _4Package.BODY_TYPE__BOOK);
		}
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConferenceType> getConference() {
		if (conference == null) {
			conference = new EObjectContainmentEList<ConferenceType>(ConferenceType.class, this, _4Package.BODY_TYPE__CONFERENCE);
		}
		return conference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SaComponentType> getSaComponent() {
		if (saComponent == null) {
			saComponent = new EObjectContainmentEList<SaComponentType>(SaComponentType.class, this, _4Package.BODY_TYPE__SA_COMPONENT);
		}
		return saComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DissertationType> getDissertation() {
		if (dissertation == null) {
			dissertation = new EObjectContainmentEList<DissertationType>(DissertationType.class, this, _4Package.BODY_TYPE__DISSERTATION);
		}
		return dissertation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReportPaperType> getReportPaper() {
		if (reportPaper == null) {
			reportPaper = new EObjectContainmentEList<ReportPaperType>(ReportPaperType.class, this, _4Package.BODY_TYPE__REPORT_PAPER);
		}
		return reportPaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StandardType> getStandard() {
		if (standard == null) {
			standard = new EObjectContainmentEList<StandardType>(StandardType.class, this, _4Package.BODY_TYPE__STANDARD);
		}
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatabaseType> getDatabase() {
		if (database == null) {
			database = new EObjectContainmentEList<DatabaseType>(DatabaseType.class, this, _4Package.BODY_TYPE__DATABASE);
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PeerReviewType> getPeerReview() {
		if (peerReview == null) {
			peerReview = new EObjectContainmentEList<PeerReviewType>(PeerReviewType.class, this, _4Package.BODY_TYPE__PEER_REVIEW);
		}
		return peerReview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PendingPublicationType> getPendingPublication() {
		if (pendingPublication == null) {
			pendingPublication = new EObjectContainmentEList<PendingPublicationType>(PendingPublicationType.class, this, _4Package.BODY_TYPE__PENDING_PUBLICATION);
		}
		return pendingPublication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PostedContentType> getPostedContent() {
		if (postedContent == null) {
			postedContent = new EObjectContainmentEList<PostedContentType>(PostedContentType.class, this, _4Package.BODY_TYPE__POSTED_CONTENT);
		}
		return postedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.BODY_TYPE__JOURNAL:
				return ((InternalEList<?>)getJournal()).basicRemove(otherEnd, msgs);
			case _4Package.BODY_TYPE__BOOK:
				return ((InternalEList<?>)getBook()).basicRemove(otherEnd, msgs);
			case _4Package.BODY_TYPE__CONFERENCE:
				return ((InternalEList<?>)getConference()).basicRemove(otherEnd, msgs);
			case _4Package.BODY_TYPE__SA_COMPONENT:
				return ((InternalEList<?>)getSaComponent()).basicRemove(otherEnd, msgs);
			case _4Package.BODY_TYPE__DISSERTATION:
				return ((InternalEList<?>)getDissertation()).basicRemove(otherEnd, msgs);
			case _4Package.BODY_TYPE__REPORT_PAPER:
				return ((InternalEList<?>)getReportPaper()).basicRemove(otherEnd, msgs);
			case _4Package.BODY_TYPE__STANDARD:
				return ((InternalEList<?>)getStandard()).basicRemove(otherEnd, msgs);
			case _4Package.BODY_TYPE__DATABASE:
				return ((InternalEList<?>)getDatabase()).basicRemove(otherEnd, msgs);
			case _4Package.BODY_TYPE__PEER_REVIEW:
				return ((InternalEList<?>)getPeerReview()).basicRemove(otherEnd, msgs);
			case _4Package.BODY_TYPE__PENDING_PUBLICATION:
				return ((InternalEList<?>)getPendingPublication()).basicRemove(otherEnd, msgs);
			case _4Package.BODY_TYPE__POSTED_CONTENT:
				return ((InternalEList<?>)getPostedContent()).basicRemove(otherEnd, msgs);
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
			case _4Package.BODY_TYPE__JOURNAL:
				return getJournal();
			case _4Package.BODY_TYPE__BOOK:
				return getBook();
			case _4Package.BODY_TYPE__CONFERENCE:
				return getConference();
			case _4Package.BODY_TYPE__SA_COMPONENT:
				return getSaComponent();
			case _4Package.BODY_TYPE__DISSERTATION:
				return getDissertation();
			case _4Package.BODY_TYPE__REPORT_PAPER:
				return getReportPaper();
			case _4Package.BODY_TYPE__STANDARD:
				return getStandard();
			case _4Package.BODY_TYPE__DATABASE:
				return getDatabase();
			case _4Package.BODY_TYPE__PEER_REVIEW:
				return getPeerReview();
			case _4Package.BODY_TYPE__PENDING_PUBLICATION:
				return getPendingPublication();
			case _4Package.BODY_TYPE__POSTED_CONTENT:
				return getPostedContent();
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
			case _4Package.BODY_TYPE__JOURNAL:
				getJournal().clear();
				getJournal().addAll((Collection<? extends JournalType>)newValue);
				return;
			case _4Package.BODY_TYPE__BOOK:
				getBook().clear();
				getBook().addAll((Collection<? extends BookType>)newValue);
				return;
			case _4Package.BODY_TYPE__CONFERENCE:
				getConference().clear();
				getConference().addAll((Collection<? extends ConferenceType>)newValue);
				return;
			case _4Package.BODY_TYPE__SA_COMPONENT:
				getSaComponent().clear();
				getSaComponent().addAll((Collection<? extends SaComponentType>)newValue);
				return;
			case _4Package.BODY_TYPE__DISSERTATION:
				getDissertation().clear();
				getDissertation().addAll((Collection<? extends DissertationType>)newValue);
				return;
			case _4Package.BODY_TYPE__REPORT_PAPER:
				getReportPaper().clear();
				getReportPaper().addAll((Collection<? extends ReportPaperType>)newValue);
				return;
			case _4Package.BODY_TYPE__STANDARD:
				getStandard().clear();
				getStandard().addAll((Collection<? extends StandardType>)newValue);
				return;
			case _4Package.BODY_TYPE__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends DatabaseType>)newValue);
				return;
			case _4Package.BODY_TYPE__PEER_REVIEW:
				getPeerReview().clear();
				getPeerReview().addAll((Collection<? extends PeerReviewType>)newValue);
				return;
			case _4Package.BODY_TYPE__PENDING_PUBLICATION:
				getPendingPublication().clear();
				getPendingPublication().addAll((Collection<? extends PendingPublicationType>)newValue);
				return;
			case _4Package.BODY_TYPE__POSTED_CONTENT:
				getPostedContent().clear();
				getPostedContent().addAll((Collection<? extends PostedContentType>)newValue);
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
			case _4Package.BODY_TYPE__JOURNAL:
				getJournal().clear();
				return;
			case _4Package.BODY_TYPE__BOOK:
				getBook().clear();
				return;
			case _4Package.BODY_TYPE__CONFERENCE:
				getConference().clear();
				return;
			case _4Package.BODY_TYPE__SA_COMPONENT:
				getSaComponent().clear();
				return;
			case _4Package.BODY_TYPE__DISSERTATION:
				getDissertation().clear();
				return;
			case _4Package.BODY_TYPE__REPORT_PAPER:
				getReportPaper().clear();
				return;
			case _4Package.BODY_TYPE__STANDARD:
				getStandard().clear();
				return;
			case _4Package.BODY_TYPE__DATABASE:
				getDatabase().clear();
				return;
			case _4Package.BODY_TYPE__PEER_REVIEW:
				getPeerReview().clear();
				return;
			case _4Package.BODY_TYPE__PENDING_PUBLICATION:
				getPendingPublication().clear();
				return;
			case _4Package.BODY_TYPE__POSTED_CONTENT:
				getPostedContent().clear();
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
			case _4Package.BODY_TYPE__JOURNAL:
				return journal != null && !journal.isEmpty();
			case _4Package.BODY_TYPE__BOOK:
				return book != null && !book.isEmpty();
			case _4Package.BODY_TYPE__CONFERENCE:
				return conference != null && !conference.isEmpty();
			case _4Package.BODY_TYPE__SA_COMPONENT:
				return saComponent != null && !saComponent.isEmpty();
			case _4Package.BODY_TYPE__DISSERTATION:
				return dissertation != null && !dissertation.isEmpty();
			case _4Package.BODY_TYPE__REPORT_PAPER:
				return reportPaper != null && !reportPaper.isEmpty();
			case _4Package.BODY_TYPE__STANDARD:
				return standard != null && !standard.isEmpty();
			case _4Package.BODY_TYPE__DATABASE:
				return database != null && !database.isEmpty();
			case _4Package.BODY_TYPE__PEER_REVIEW:
				return peerReview != null && !peerReview.isEmpty();
			case _4Package.BODY_TYPE__PENDING_PUBLICATION:
				return pendingPublication != null && !pendingPublication.isEmpty();
			case _4Package.BODY_TYPE__POSTED_CONTENT:
				return postedContent != null && !postedContent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyTypeImpl
