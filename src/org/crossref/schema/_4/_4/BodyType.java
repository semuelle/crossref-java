/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getJournal <em>Journal</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getBook <em>Book</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getConference <em>Conference</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getSaComponent <em>Sa Component</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getDissertation <em>Dissertation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getReportPaper <em>Report Paper</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getStandard <em>Standard</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getPeerReview <em>Peer Review</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getPendingPublication <em>Pending Publication</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BodyType#getPostedContent <em>Posted Content</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getBodyType()
 * @model extendedMetaData="name='body_._type' kind='elementOnly'"
 * @generated
 */
public interface BodyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Journal</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.JournalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for all information about a single journal and the
	 * 				articles being registered within the journal. journal is the core container for
	 * 				information about a single journal and articles submitted for registration from that
	 * 				journal. Within a journal instance, you may register articles from a single issue,
	 * 				detailed in journal_issue. If you want to register items from more than one issue,
	 * 				you must use multiple journal instances, which can be done within a single batch
	 * 				submission. If you have articles that have not been assigned to an issue, you may
	 * 				register them within a single journal instance. In this case, do not include a
	 * 				journal_issue. You may chose to submit only top level journal_metadata and
	 * 				journal_issue metadata for any journal or issue, allowing you to register DOIs for
	 * 				an entire journal, or any issue or volume within a journal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_Journal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='journal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JournalType> getJournal();

	/**
	 * Returns the value of the '<em><b>Book</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.BookType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for all information about a single book. book is the
	 * 				core container for information about a specific book. Books may be in the form of
	 * 				edited books (i.e. a contributed volume with one or more editors), monographs
	 * 				(single-authored works), or reference works (e.g. encyclopedias). If a book contains
	 * 				multiple volumes, each volume must be contained in a unique book element. You may
	 * 				chose to submit only top level contributors and book_metadata for any book, or you
	 * 				may chose to submit these elements along with metadata for each content_item. A
	 * 				content item is typically any entity that is listed on the table of contents such as
	 * 				a chapter, section, etc. It is not necessary to submit metadata for all items listed
	 * 				on the table of contents. You may chose to drop items of lesser significance such as
	 * 				front and back matter. Book-level metadata is captured within book_metadata,
	 * 				book_series_metadata, or book_set_metadata. If a books is a single-volume work, use
	 * 				book_metadata. If the book is a volume from a multi-volume work that is also a
	 * 				serial publication (and therefore has an ISSN), use book_series_metadata. If the
	 * 				book is a volume of non-serial publication, then it is considered a set and you
	 * 				should use book_set_metadata book_type should be set to "monograph" when the same
	 * 				author or authors wrote the majority of the content. It should be set to
	 * 				"edited_book" when a book primarily consists of contributed chapters, each chapter
	 * 				written by different authors. It should be set to "reference" for major reference
	 * 				works such as encyclopedias. Use "other" when the author of the content does not fit
	 * 				any of the other categories.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Book</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_Book()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='book' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BookType> getBook();

	/**
	 * Returns the value of the '<em><b>Conference</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ConferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for all information about a single conference and its
	 * 				proceedings. conference is the core container for information about a single
	 * 				conference and its proceedings. If a conference proceedings spans multiple volumes,
	 * 				each volume must be contained in a unique conference element. You may choose to
	 * 				submit only top level contributors, event_metadata and proceedings_metadata for any
	 * 				conference, or you may choose to submit these elements along with metadata for each
	 * 				conference_paper. It is not necessary to submit metadata for all items listed on the
	 * 				proceedings table of contents. You may chose to drop items of lesser significance
	 * 				such as front and back matter. NOTE: The Crossref system currently uses the
	 * 				proceedings_title and conference_acronym in the query matching process. This system
	 * 				can cause problems when the proceedings have a simple non-changing title (e.g
	 * 				PRoceedings of SPIE) and the conference event name, conference_name, is used to
	 * 				differentiate conference topics (e.g. Optoelectronic Integrated Circuits II). To
	 * 				avoid this problem, Crossref recommends that you make sure the conference_acronym
	 * 				accurately reflects the event name (e.g OpIC II in this
	 * 				example).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_Conference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConferenceType> getConference();

	/**
	 * Returns the value of the '<em><b>Sa Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.SaComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element for depositing a stand alone component. The parent DOI
	 * 				must already exist (created in an earlier deposit or via some other registration
	 * 				process).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sa Component</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_SaComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sa_component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SaComponentType> getSaComponent();

	/**
	 * Returns the value of the '<em><b>Dissertation</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.DissertationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dissertation is the top level element for deposit of metadata about
	 * 				one or more dissertations. The dissertation element does not have publisher, or issn
	 * 				elements. It is expected that the dissertation element will be used for deposit of
	 * 				items that have not been published in books or journals. If a dissertation is
	 * 				published as a book or within a serial, it should be deposited using the top-level
	 * 				element for the appropriate publication type. If a DAI has been assigned, it should
	 * 				be deposited in the identifier element with the id_type attribute set to "dai". If
	 * 				an institution has its own numbering system, it should be deposited in item_number,
	 * 				and the item_number_type should be set to "institution"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dissertation</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_Dissertation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dissertation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DissertationType> getDissertation();

	/**
	 * Returns the value of the '<em><b>Report Paper</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ReportPaperType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * report-paper is the top level element for deposit of metadata about
	 * 				one or more reports or working papers. component_list is included in report-paper to
	 * 				handle items that have components but do not have content_item elements (i.e. a
	 * 				report that is not divided into multiple chapters). If an item has content_item
	 * 				elements, then component_list inside of content_item must be used rather than the
	 * 				element available in report-paper 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Paper</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_ReportPaper()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='report-paper' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReportPaperType> getReportPaper();

	/**
	 * Returns the value of the '<em><b>Standard</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.StandardType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * standard is the top level element for deposit of metadata about
	 * 				standards developed by Standards Development Organizations (SDOs) or Consortia.
	 * 				Crossref does not determine if a new DOI should be created for each revision or
	 * 				reaffirmation of a standard. The decision will be left to the individual standards
	 * 				organizations. As of schema version 4.3.3, Crossref recommends that the full
	 * 				standard designation be placed in the as_published element (within
	 * 				standard_designator). For backwards compatibility, the full designation may also be
	 * 				included in the identifier element with the id_type attribute set to "ISO-std-ref".
	 * 				In addition, Crossref requires that the publisher of the standard be included in
	 * 				standards_body_name, and the acronym within standards_acronym. The as_published and
	 * 				standards_acronym elements will be combined to identify a standard for query
	 * 				matching. component_list is included in standard to handle items that have
	 * 				components but do not have content_item elements (i.e. a standard that is not
	 * 				divided into multiple chapters). If an item has content_item elements, then
	 * 				component_list inside of content_item must be used rather than the parent standard
	 * 				element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_Standard()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standard' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StandardType> getStandard();

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * database is the top level element for deposit of metadata about one
	 * 				or more datasets or records in a database. Database structures allow for the
	 * 				assignment of DOIs to entire databases at the aggregate level and at two lower
	 * 				levels. The top level may be a physical/functional database or a logical abstration
	 * 				acting as a collection much the same as a journal is a collection of articles. The
	 * 				need to assign specific fields of metadata at each level depends on the nature of
	 * 				the top most level (e.g. publication date may be appropriate at the top level for a
	 * 				physical object but only at lower levels for an abstract top level object) The first
	 * 				sub-level is the dataset which may be a basic record of the top level object or a
	 * 				collection in its own right. In either case dataset must represent a physical
	 * 				construct. A third level is provided in the component_list. NOTE: component_list in
	 * 				<database> (rather than in dataset may be used as a second level when no third
	 * 				level is required and the second level objects derive most of their qualities from
	 * 				the parent. NOTE: This model is not intended to show relationships between different
	 * 				dataset entries in the form of a relational database. However in the future it is
	 * 				possible that multiple resolution may be used to express such
	 * 				relationships
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_Database()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatabaseType> getDatabase();

	/**
	 * Returns the value of the '<em><b>Peer Review</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.PeerReviewType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The peer_review content type is intended for assigning DOIs to the
	 * 				reports and other artifacts associated with the review of published content.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Review</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_PeerReview()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='peer_review' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PeerReviewType> getPeerReview();

	/**
	 * Returns the value of the '<em><b>Pending Publication</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.PendingPublicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Pending publication (formeraly knows as Pre-register or early
	 * 				content registration) DOIs are used to create a DOI for a content item that is not
	 * 				yet available online or in print. The intended use is for a pubisher to create the
	 * 				DOI upon manuscript acceptance where publication might not occur for some period.
	 * 				This establishes the acceptance date and intent to publish and provides on online
	 * 				presence that allows confirmation of intent to publish. The URL for early content
	 * 				DOIs will point to a page maintained by Crossref. Early content registration is
	 * 				intended for titles that have already been deposited at Crossref. Therefor the
	 * 				publication data provided must identify a title (journal or book) that already
	 * 				exists within the Crossref system 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pending Publication</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_PendingPublication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pending_publication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PendingPublicationType> getPendingPublication();

	/**
	 * Returns the value of the '<em><b>Posted Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.PostedContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Posted-content is for the assignment of DOIs to content that may
	 * 				subsequently be formally published. Non-DOI identifiers associated with the content
	 * 				may be recorded in the item_number element. We encourage the inclussion of an
	 * 				abstract. The relation program (rel:program) should be used to link this content
	 * 				item to other DOIs including the DOI of the published version of record. Pre-print
	 * 				should not be used to assign DOIs to accepted manuscripts. A DOI may be assigned to
	 * 				an accepted manuscript using the content type appropriate for early registration.
	 * 				DOIs assigned to accepted manuscripts should be reused (e.g. reassigned to the
	 * 				published article). POsted-contnet DOIs must be continuously supported by
	 * 				maintaining their metadata and the URL at which the content is available.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Posted Content</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBodyType_PostedContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='posted_content' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PostedContentType> getPostedContent();

} // BodyType
