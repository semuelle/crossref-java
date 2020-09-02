/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proceedings Series Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getSeriesMetadata <em>Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsTitle <em>Proceedings Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getVolume1 <em>Volume1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsSubject <em>Proceedings Subject</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getNoisbn <em>Noisbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsSubject1 <em>Proceedings Subject1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublisher1 <em>Publisher1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublicationDate1 <em>Publication Date1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType()
 * @model extendedMetaData="name='proceedings_series_metadata_._type' kind='elementOnly'"
 * @generated
 */
public interface ProceedingsSeriesMetadataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for metadata about a series publication. When a book,
	 * 				conference proceeding, or report consists of multiple volumes, series_metadata is
	 * 				used to describe information about the entire series. If a work spans multiple
	 * 				volumes, you should use titles in series_metadata. If a work spans multiple volumes
	 * 				with a unique title for each volume and the whole series, you should specify the
	 * 				series title in titles in series_metadata and the volume title in titles in
	 * 				book_series_metadata. If a unique ISBN has been assigned to the entire series (as
	 * 				opposed to the individual volumes), it should given in series_metadata. You may
	 * 				assign and register a DOI that encompasses an entire series by adding doi_data in
	 * 				series_metadata. This element is optional for a series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Metadata</em>' containment reference.
	 * @see #setSeriesMetadata(SeriesMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_SeriesMetadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='series_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	SeriesMetadataType getSeriesMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getSeriesMetadata <em>Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Metadata</em>' containment reference.
	 * @see #getSeriesMetadata()
	 * @generated
	 */
	void setSeriesMetadata(SeriesMetadataType value);

	/**
	 * Returns the value of the '<em><b>Proceedings Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the conference proceedings as printed on title page of
	 * 				the published conference proceedings. proceedings_title is the undifferentiated
	 * 				title of a conference proceedings. It should generally be the title as it appears on
	 * 				the cover of the printed proceedings. In some cases, proceedings_title may differ
	 * 				from conference_name only in that the text "Proceedings of" often appears at the
	 * 				start of the proceedings_title, and it this text should never be included in
	 * 				conference_name. In other cases, the proceedings_title and conference_name may be
	 * 				quite different.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proceedings Title</em>' attribute.
	 * @see #setProceedingsTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_ProceedingsTitle()
	 * @model dataType="org.crossref.schema._4._4.ProceedingsTitleType"
	 *        extendedMetaData="kind='element' name='proceedings_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProceedingsTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsTitle <em>Proceedings Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proceedings Title</em>' attribute.
	 * @see #getProceedingsTitle()
	 * @generated
	 */
	void setProceedingsTitle(String value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The volume number of a published journal, or the number of a printed
	 * 				volume for a book or conference proceedings. A journal volume is contained in the
	 * 				journal_volume element to allow for the assignment of a DOI to an entire journal
	 * 				volume. Do not include the words "Volume" or "vol." in this element. Data may be
	 * 				alpha, numeric or a combination. Roman numerals are acceptable. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(String)
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_Volume()
	 * @model dataType="org.crossref.schema._4._4.VolumeType"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVolume();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(String value);

	/**
	 * Returns the value of the '<em><b>Volume1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The volume number of a published journal, or the number of a printed
	 * 				volume for a book or conference proceedings. A journal volume is contained in the
	 * 				journal_volume element to allow for the assignment of a DOI to an entire journal
	 * 				volume. Do not include the words "Volume" or "vol." in this element. Data may be
	 * 				alpha, numeric or a combination. Roman numerals are acceptable. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume1</em>' attribute.
	 * @see #setVolume1(String)
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_Volume1()
	 * @model dataType="org.crossref.schema._4._4.VolumeType"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVolume1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getVolume1 <em>Volume1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume1</em>' attribute.
	 * @see #getVolume1()
	 * @generated
	 */
	void setVolume1(String value);

	/**
	 * Returns the value of the '<em><b>Proceedings Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject of the printed conference proceedings, e.g. "Computer
	 * 				Graphics" is the subject matter of SIGGRAPH. This element is useful because an
	 * 				author may cite a conference paper by the conference subject. For example,
	 * 				"Proceedings of the 1999 ACM Conference on Computer Graphics"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proceedings Subject</em>' attribute.
	 * @see #setProceedingsSubject(String)
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_ProceedingsSubject()
	 * @model dataType="org.crossref.schema._4._4.ProceedingsSubjectType"
	 *        extendedMetaData="kind='element' name='proceedings_subject' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProceedingsSubject();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsSubject <em>Proceedings Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proceedings Subject</em>' attribute.
	 * @see #getProceedingsSubject()
	 * @generated
	 */
	void setProceedingsSubject(String value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.PublisherType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for information about the publisher of a book or
	 * 				conference proceedings. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_Publisher()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PublisherType> getPublisher();

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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_PublicationDate()
	 * @model containment="true" upper="10"
	 *        extendedMetaData="kind='element' name='publication_date' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PublicationDateType> getPublicationDate();

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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_Isbn()
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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_Noisbn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noisbn' namespace='##targetNamespace'"
	 * @generated
	 */
	NoisbnType getNoisbn();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getNoisbn <em>Noisbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noisbn</em>' containment reference.
	 * @see #getNoisbn()
	 * @generated
	 */
	void setNoisbn(NoisbnType value);

	/**
	 * Returns the value of the '<em><b>Proceedings Subject1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject of the printed conference proceedings, e.g. "Computer
	 * 				Graphics" is the subject matter of SIGGRAPH. This element is useful because an
	 * 				author may cite a conference paper by the conference subject. For example,
	 * 				"Proceedings of the 1999 ACM Conference on Computer Graphics"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proceedings Subject1</em>' attribute.
	 * @see #setProceedingsSubject1(String)
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_ProceedingsSubject1()
	 * @model dataType="org.crossref.schema._4._4.ProceedingsSubjectType"
	 *        extendedMetaData="kind='element' name='proceedings_subject' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProceedingsSubject1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsSubject1 <em>Proceedings Subject1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proceedings Subject1</em>' attribute.
	 * @see #getProceedingsSubject1()
	 * @generated
	 */
	void setProceedingsSubject1(String value);

	/**
	 * Returns the value of the '<em><b>Publisher1</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.PublisherType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for information about the publisher of a book or
	 * 				conference proceedings. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher1</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_Publisher1()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PublisherType> getPublisher1();

	/**
	 * Returns the value of the '<em><b>Publication Date1</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.PublicationDateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of publication. In all cases, multiple dates are allowed to
	 * 				allow for different dates of publication for online and print versions. This element
	 * 				was previously called date, but was renamed publication_date to distinguish more
	 * 				clearly from conference_date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Date1</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_PublicationDate1()
	 * @model containment="true" upper="10"
	 *        extendedMetaData="kind='element' name='publication_date' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PublicationDateType> getPublicationDate1();

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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_PublisherItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher_item' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherItemType getPublisherItem();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublisherItem <em>Publisher Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Item</em>' containment reference.
	 * @see #getPublisherItem()
	 * @generated
	 */
	void setPublisherItem(PublisherItemType value);

	/**
	 * Returns the value of the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for archive. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Locations</em>' containment reference.
	 * @see #setArchiveLocations(ArchiveLocationsType)
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_ArchiveLocations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='archive_locations' namespace='##targetNamespace'"
	 * @generated
	 */
	ArchiveLocationsType getArchiveLocations();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getArchiveLocations <em>Archive Locations</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_DoiData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doi_data' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiDataType getDoiData();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getDoiData <em>Doi Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Data</em>' containment reference.
	 * @see #getDoiData()
	 * @generated
	 */
	void setDoiData(DoiDataType value);

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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsSeriesMetadataType_ReferenceDistributionOpts()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='reference_distribution_opts'"
	 * @generated
	 */
	ReferenceDistributionOptsType getReferenceDistributionOpts();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @generated
	 */
	void unsetReferenceDistributionOpts();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Distribution Opts</em>' attribute is set.
	 * @see #unsetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @generated
	 */
	boolean isSetReferenceDistributionOpts();

} // ProceedingsSeriesMetadataType
