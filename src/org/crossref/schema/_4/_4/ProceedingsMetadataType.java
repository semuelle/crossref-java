/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proceedings Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getProceedingsTitle <em>Proceedings Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getProceedingsSubject <em>Proceedings Subject</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getNoisbn <em>Noisbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ProceedingsMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType()
 * @model extendedMetaData="name='proceedings_metadata_._type' kind='elementOnly'"
 * @generated
 */
public interface ProceedingsMetadataType extends EObject {
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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_ProceedingsTitle()
	 * @model dataType="org.crossref.schema._4._4.ProceedingsTitleType" required="true"
	 *        extendedMetaData="kind='element' name='proceedings_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProceedingsTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getProceedingsTitle <em>Proceedings Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proceedings Title</em>' attribute.
	 * @see #getProceedingsTitle()
	 * @generated
	 */
	void setProceedingsTitle(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_ProceedingsSubject()
	 * @model dataType="org.crossref.schema._4._4.ProceedingsSubjectType"
	 *        extendedMetaData="kind='element' name='proceedings_subject' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProceedingsSubject();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getProceedingsSubject <em>Proceedings Subject</em>}' attribute.
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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_Publisher()
	 * @model containment="true" required="true" upper="5"
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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_PublicationDate()
	 * @model containment="true" required="true" upper="10"
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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_Isbn()
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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_Noisbn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noisbn' namespace='##targetNamespace'"
	 * @generated
	 */
	NoisbnType getNoisbn();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getNoisbn <em>Noisbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noisbn</em>' containment reference.
	 * @see #getNoisbn()
	 * @generated
	 */
	void setNoisbn(NoisbnType value);

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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_PublisherItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher_item' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherItemType getPublisherItem();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getPublisherItem <em>Publisher Item</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_ArchiveLocations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='archive_locations' namespace='##targetNamespace'"
	 * @generated
	 */
	ArchiveLocationsType getArchiveLocations();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getArchiveLocations <em>Archive Locations</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_DoiData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doi_data' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiDataType getDoiData();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getDoiData <em>Doi Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Data</em>' containment reference.
	 * @see #getDoiData()
	 * @generated
	 */
	void setDoiData(DoiDataType value);

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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getLanguage <em>Language</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getLanguage <em>Language</em>}' attribute is set.
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
	 * @see org.crossref.schema._4._4._4Package#getProceedingsMetadataType_ReferenceDistributionOpts()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='reference_distribution_opts'"
	 * @generated
	 */
	ReferenceDistributionOptsType getReferenceDistributionOpts();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @generated
	 */
	void unsetReferenceDistributionOpts();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Distribution Opts</em>' attribute is set.
	 * @see #unsetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @generated
	 */
	boolean isSetReferenceDistributionOpts();

} // ProceedingsMetadataType
