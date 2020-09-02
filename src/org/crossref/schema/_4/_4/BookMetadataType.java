/**
 */
package org.crossref.schema._4._4;

import gov.nih.nlm.ncbi.jats1.AbstractType;

import org.crossref.fundref.ProgramType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getEditionNumber <em>Edition Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getAcceptanceDate <em>Acceptance Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getNoisbn <em>Noisbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getCrossmark <em>Crossmark</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getProgram2 <em>Program2</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getCitationList <em>Citation List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getBookMetadataType()
 * @model extendedMetaData="name='book_metadata_._type' kind='elementOnly'"
 * @generated
 */
public interface BookMetadataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for all who contributed to authoring or editing an
	 * 				entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributors</em>' containment reference.
	 * @see #setContributors(ContributorsType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Contributors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributorsType getContributors();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getContributors <em>Contributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributors</em>' containment reference.
	 * @see #getContributors()
	 * @generated
	 */
	void setContributors(ContributorsType value);

	/**
	 * Returns the value of the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for the title and original language title
	 * 				elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Titles</em>' containment reference.
	 * @see #setTitles(TitlesType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Titles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='titles' namespace='##targetNamespace'"
	 * @generated
	 */
	TitlesType getTitles();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getTitles <em>Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titles</em>' containment reference.
	 * @see #getTitles()
	 * @generated
	 */
	void setTitles(TitlesType value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AbstractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Abstract</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='http://www.ncbi.nlm.nih.gov/JATS1'"
	 * @generated
	 */
	EList<AbstractType> getAbstract();

	/**
	 * Returns the value of the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The edition number of a book. edition_number should include only a
	 * 				number and not additional text such as "edition". For example, you should submit
	 * 				"3", not "third edition" or "3rd edition". Roman numerals are acceptable. Publishers
	 * 				will update a print edition with a new edition number when more than ten percent of
	 * 				the content has changed. However, publishers expect to continuously update online
	 * 				editions of books without changing the edition number. 
	 *   <i>The ability to update the
	 * 					electronic version independent of the print version could be problematic for
	 * 					researchers. For example, if a research article cites the print version of a
	 * 					chapter, and a researcher subsequently links to the online version of the same
	 * 					chapter, the content may be different from the print version without the typical
	 * 					indication of a new edition. This topic requires further discussion outside of
	 * 					the scope of this specification.</i>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edition Number</em>' attribute.
	 * @see #setEditionNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_EditionNumber()
	 * @model dataType="org.crossref.schema._4._4.EditionNumberType"
	 *        extendedMetaData="kind='element' name='edition_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEditionNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getEditionNumber <em>Edition Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition Number</em>' attribute.
	 * @see #getEditionNumber()
	 * @generated
	 */
	void setEditionNumber(String value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.PublicationDateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of publication. In all cases, multiple dates are allowed to
	 * 				allow for different dates of publication for online and print versions. This element
	 * 				was previously called date, but was renamed publication_date to distinguish more
	 * 				clearly from conference_date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Date</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_PublicationDate()
	 * @model containment="true" required="true" upper="10"
	 *        extendedMetaData="kind='element' name='publication_date' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PublicationDateType> getPublicationDate();

	/**
	 * Returns the value of the '<em><b>Acceptance Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date a manuscript was accepted for
	 * 				publication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acceptance Date</em>' containment reference.
	 * @see #setAcceptanceDate(AcceptanceDateType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_AcceptanceDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acceptance_date' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptanceDateType getAcceptanceDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getAcceptanceDate <em>Acceptance Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Date</em>' containment reference.
	 * @see #getAcceptanceDate()
	 * @generated
	 */
	void setAcceptanceDate(AcceptanceDateType value);

	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.IsbnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ISBN assigned to an entity. If a multi-volume work has one ISBN
	 * 				per volume and a unique ISBN for the series, all may be registered. The ISBN for the
	 * 				series must be in series_metadata, and the ISBN for each volume in
	 * 				proceedings_metadata, or book_metadata, respectively. The text "ISBN" should not be
	 * 				included in the ISBN element in Crossref submissions. Although not required, the
	 * 				ISBN number should retain spaces or hyphens that appear in the formatted number
	 * 				because they aid in human-readability. For more information, please see
	 * 				http://www.isbn.org/standards/home/isbn/international/hyphenation- instructions.asp
	 * 				or http://www.isbn.org.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isbn</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Isbn()
	 * @model containment="true" upper="6"
	 *        extendedMetaData="kind='element' name='isbn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IsbnType> getIsbn();

	/**
	 * Returns the value of the '<em><b>Noisbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies books or conference proceedings that have no ISBN
	 * 				assigned. In very limited cases a book may never have an ISBN, this is particularly
	 * 				true for older texts. Conference proceedings, however, may regularly have a volume
	 * 				number but no ISBN or volume title. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noisbn</em>' containment reference.
	 * @see #setNoisbn(NoisbnType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Noisbn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noisbn' namespace='##targetNamespace'"
	 * @generated
	 */
	NoisbnType getNoisbn();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getNoisbn <em>Noisbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noisbn</em>' containment reference.
	 * @see #getNoisbn()
	 * @generated
	 */
	void setNoisbn(NoisbnType value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for information about the publisher of a book or
	 * 				conference proceedings. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(PublisherType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Publisher()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherType getPublisher();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(PublisherType value);

	/**
	 * Returns the value of the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for item identification numbers set by a publisher.
	 * 				item_number within publisher_item may also be used to provide an article number when
	 * 				a first_page is not available or applicable. In certain cases it may be deemed
	 * 				in-appropriate to 'misuse' the first_page element to provide a value that has
	 * 				meaning in an on-line only publication and does not convey an form of page number.
	 * 				In these circumstances the attribute <item_number
	 * 				item_number_type="article-number"> will instruct the Crossref system to treat the
	 * 				value of item_number in the same manner as first_page. This value then becomes a
	 * 				critical part of the query process. If both <item_number
	 * 				item_number_type="article-number"> and first_page are present, first_page will
	 * 				take precedence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Item</em>' containment reference.
	 * @see #setPublisherItem(PublisherItemType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_PublisherItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher_item' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherItemType getPublisherItem();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getPublisherItem <em>Publisher Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Item</em>' containment reference.
	 * @see #getPublisherItem()
	 * @generated
	 */
	void setPublisherItem(PublisherItemType value);

	/**
	 * Returns the value of the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for CrossMark data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crossmark</em>' containment reference.
	 * @see #setCrossmark(CrossmarkType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Crossmark()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crossmark' namespace='##targetNamespace'"
	 * @generated
	 */
	CrossmarkType getCrossmark();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getCrossmark <em>Crossmark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossmark</em>' containment reference.
	 * @see #getCrossmark()
	 * @generated
	 */
	void setCrossmark(CrossmarkType value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 FundRef documentation and examples: http://help.crossref.org/#fundref
	 *                 
	 *                 As part of CrossMark metadata, a deposit may contain what is called FundRef info. This details the funding behind a published article. The schema is a sequence of nested <assertion> tags. 
	 *                 
	 *                 If a DOI is not participating in CrossMark, FundRef data may be deposited as part of the <journal_article> metadata.
	 *                     
	 *                     Note: Some rules will be enforced by the deposit logic (e.g. not the schema). 
	 *                     
	 *                     FundRef data includes one or more award numbers (award_number), each of which may have one or more funders (funder_name). Each funder may have one or more optional identifiers (funder_identifier).
	 *                     
	 *                     A FundRef deposit begins with a <fr:program> tag within the <crossmark> structure (where fr is the namespace for the FundRef program).
	 *                         
	 *                         The <program> element is an implicit funder_group and will typically contain:
	 *                             
	 *                             A) one or more funder_name assertions and an award_number assertion.
	 *                             
	 *                             or
	 *                             
	 *                             B) one or more funder_group assertions where each funder_group should contain one or more funder_name assertions and at least one award_number assertion.
	 *                             
	 *                             Multiple 'award_number's may be included in a single program or fundgroup. Deposits without an award_number will be accepted, but award_number should be provided whenever possible. Items with several award numbers associated with a single funding organization should be grouped together by enclosing the "funder_name", "funder_identifier", and award_number(s) within a "fundgroup" assertion.    
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Program()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/fundref.xsd'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of license metadata. The license_ref value will
	 *                 be a URL. Values for the "applies_to" attribute are vor (version of record),am
	 *                 (accepted manuscript), and tdm (text and data mining).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program1</em>' containment reference.
	 * @see #setProgram1(org.crossref.access.indicators.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Program1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/AccessIndicators.xsd'"
	 * @generated
	 */
	org.crossref.access.indicators.ProgramType getProgram1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getProgram1 <em>Program1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program1</em>' containment reference.
	 * @see #getProgram1()
	 * @generated
	 */
	void setProgram1(org.crossref.access.indicators.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wrapper element for relationship metadata
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program2</em>' containment reference.
	 * @see #setProgram2(org.crossref.relations.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Program2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/relations.xsd'"
	 * @generated
	 */
	org.crossref.relations.ProgramType getProgram2();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getProgram2 <em>Program2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program2</em>' containment reference.
	 * @see #getProgram2()
	 * @generated
	 */
	void setProgram2(org.crossref.relations.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for archive. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Locations</em>' containment reference.
	 * @see #setArchiveLocations(ArchiveLocationsType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_ArchiveLocations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='archive_locations' namespace='##targetNamespace'"
	 * @generated
	 */
	ArchiveLocationsType getArchiveLocations();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getArchiveLocations <em>Archive Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Locations</em>' containment reference.
	 * @see #getArchiveLocations()
	 * @generated
	 */
	void setArchiveLocations(ArchiveLocationsType value);

	/**
	 * Returns the value of the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for elements related directly to a DOI. doi_data
	 * 				contains the doi, timestamp (version) and corresponding resource (URI) data for the
	 * 				doi. Cases of single-resolution (i.e. one DOI with a single corresponding URI)
	 * 				should be tagged with a doi/resource pair in doi_data. If additional resources are
	 * 				to be proved the <collection> element may also be used. The single URL
	 * 				provided in the <resource> is mandatory and serves as the single resolution
	 * 				target for the DOI. Note: A timestamp value placed inside doi_data will override any
	 * 				timestamp value placed in the <head> element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi Data</em>' containment reference.
	 * @see #setDoiData(DoiDataType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_DoiData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doi_data' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiDataType getDoiData();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getDoiData <em>Doi Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Data</em>' containment reference.
	 * @see #getDoiData()
	 * @generated
	 */
	void setDoiData(DoiDataType value);

	/**
	 * Returns the value of the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of articles, books, and other items cited by the parent item
	 * 				for which the DOI in the doi_data is being deposited. Some articles may have
	 * 				multiple lists of citations (e.g. main reference list, appendix reference list,
	 * 				etc.). All citations for one article should be included in a single citation_list
	 * 				regardless of whether one or more citation lists were in the original item. When
	 * 				combining multiple reference lists from an item into one citation_list element, but
	 * 				sure to give each citation a unique key attribute value. For example, if an appendix
	 * 				in an item has a separate citation list that restarts numbering at 1, these
	 * 				citations should be given key attributes such as "ab1" rather than "b1". Some
	 * 				articles may contain "Further Reading" or "Bibliography" lists. The distinguishing
	 * 				factor in these lists is that the references have not been cited from the
	 * 				article—they only provide a list of additional related reading material. It will be
	 * 				left to the discretion of the publisher if these items are to be considered
	 * 				citations and should be deposited. NOTE: If a citation_list element is given and is
	 * 				empty then all citations for the given DOI will be deleted, otherwise any existing
	 * 				citations for the given DOI are left intact in the database. It is quite common that
	 * 				a publisher wants to fix the DOI's metadata without resubmitting the citations.
	 * 				Leaving out the citation_list element will do that. Also note that any given
	 * 				citations will override older citations for the given DOI so citation_lists are not
	 * 				cumulative over multiple records or submissions. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citation List</em>' containment reference.
	 * @see #setCitationList(CitationListType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_CitationList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citation_list' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationListType getCitationList();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getCitationList <em>Citation List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation List</em>' containment reference.
	 * @see #getCitationList()
	 * @generated
	 */
	void setCitationList(CitationListType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see org.crossref.schema._4._4.LanguageType
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #setLanguage(LanguageType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see org.crossref.schema._4._4.LanguageType
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	boolean isSetLanguage();

	/**
	 * Returns the value of the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.ReferenceDistributionOptsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Distribution Opts</em>' attribute.
	 * @see org.crossref.schema._4._4.ReferenceDistributionOptsType
	 * @see #isSetReferenceDistributionOpts()
	 * @see #unsetReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @see org.crossref.schema._4._4._4Package#getBookMetadataType_ReferenceDistributionOpts()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='reference_distribution_opts'"
	 * @generated
	 */
	ReferenceDistributionOptsType getReferenceDistributionOpts();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Distribution Opts</em>' attribute.
	 * @see org.crossref.schema._4._4.ReferenceDistributionOptsType
	 * @see #isSetReferenceDistributionOpts()
	 * @see #unsetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @generated
	 */
	void setReferenceDistributionOpts(ReferenceDistributionOptsType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @generated
	 */
	void unsetReferenceDistributionOpts();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.BookMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Distribution Opts</em>' attribute is set.
	 * @see #unsetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @generated
	 */
	boolean isSetReferenceDistributionOpts();

} // BookMetadataType
