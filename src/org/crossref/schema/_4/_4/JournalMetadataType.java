/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.JournalMetadataType#getFullTitle <em>Full Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalMetadataType#getAbbrevTitle <em>Abbrev Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalMetadataType#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalMetadataType#getCoden <em>Coden</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalMetadataType#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalMetadataType#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalMetadataType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getJournalMetadataType()
 * @model extendedMetaData="name='journal_metadata_._type' kind='elementOnly'"
 * @generated
 */
public interface JournalMetadataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full title by which a journal is commonly known or cited.
	 * 				full_title and abbrev_title must both be submitted even if they are identical. Note:
	 * 				In version 4.1.0 and later, this element is allowed up to 10 times to allow for a)
	 * 				journal name changes over time, b) translated journal names (e.g. the Japanese name
	 * 				and the English equivalent), and c) common author mis-spellings of a given journal
	 * 				name. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Title</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getJournalMetadataType_FullTitle()
	 * @model unique="false" dataType="org.crossref.schema._4._4.FullTitleType" required="true" upper="10"
	 *        extendedMetaData="kind='element' name='full_title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFullTitle();

	/**
	 * Returns the value of the '<em><b>Abbrev Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  This element contains the common abbreviation or abbreviations used
	 * 				when citing this journal. It is preferred, but not required, that periods be
	 * 				included after abbreviated words within the title. full_title and abbrev_title must
	 * 				both be submitted, and they can be identical. If you do not know the abbreviated
	 * 				title for a specific journal, please supply the full title in the abbrev_title
	 * 				element. Note: In version 4.1.0 and later, this element is no longer required in
	 * 				journal_metadata because some journals do not have abbreviated journal names.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abbrev Title</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getJournalMetadataType_AbbrevTitle()
	 * @model unique="false" dataType="org.crossref.schema._4._4.AbbrevTitleType" upper="10"
	 *        extendedMetaData="kind='element' name='abbrev_title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAbbrevTitle();

	/**
	 * Returns the value of the '<em><b>Issn</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.IssnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ISSN assigned to an entity. The ISSN must consist of eight digits
	 * 				(where the last digit may be an X), or it must consist of eight digits in two groups
	 * 				of four with a hyphen between the two groups. Spaces or other delimiters should not
	 * 				be included in an ISSN. For more information, please see
	 * 				http://www.issn.org:8080/English/pub/getting- checking/checking or
	 * 				http://www.issn.org. The text "ISSN" should not be included in the issn element in
	 * 				Crossref submissions. Crossref validates all ISSNs supplied in deposits, only valid
	 * 				ISSNs will be accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issn</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getJournalMetadataType_Issn()
	 * @model containment="true" upper="6"
	 *        extendedMetaData="kind='element' name='issn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IssnType> getIssn();

	/**
	 * Returns the value of the '<em><b>Coden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coden assigned to a journal or conference
	 * 				proceedings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coden</em>' attribute.
	 * @see #setCoden(String)
	 * @see org.crossref.schema._4._4._4Package#getJournalMetadataType_Coden()
	 * @model dataType="org.crossref.schema._4._4.CodenType"
	 *        extendedMetaData="kind='element' name='coden' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCoden();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalMetadataType#getCoden <em>Coden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coden</em>' attribute.
	 * @see #getCoden()
	 * @generated
	 */
	void setCoden(String value);

	/**
	 * Returns the value of the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for archive. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Locations</em>' containment reference.
	 * @see #setArchiveLocations(ArchiveLocationsType)
	 * @see org.crossref.schema._4._4._4Package#getJournalMetadataType_ArchiveLocations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='archive_locations' namespace='##targetNamespace'"
	 * @generated
	 */
	ArchiveLocationsType getArchiveLocations();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalMetadataType#getArchiveLocations <em>Archive Locations</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getJournalMetadataType_DoiData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doi_data' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiDataType getDoiData();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalMetadataType#getDoiData <em>Doi Data</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getJournalMetadataType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalMetadataType#getLanguage <em>Language</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.JournalMetadataType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.JournalMetadataType#getLanguage <em>Language</em>}' attribute is set.
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
	 * @see org.crossref.schema._4._4._4Package#getJournalMetadataType_ReferenceDistributionOpts()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='reference_distribution_opts'"
	 * @generated
	 */
	ReferenceDistributionOptsType getReferenceDistributionOpts();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.JournalMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @generated
	 */
	void unsetReferenceDistributionOpts();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.JournalMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Distribution Opts</em>' attribute is set.
	 * @see #unsetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @generated
	 */
	boolean isSetReferenceDistributionOpts();

} // JournalMetadataType
