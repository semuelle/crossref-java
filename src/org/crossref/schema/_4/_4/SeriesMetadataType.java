/**
 */
package org.crossref.schema._4._4;

import gov.nih.nlm.ncbi.jats1.AbstractType;

import org.crossref.fundref.ProgramType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Series Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getCoden <em>Coden</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getCrossmark <em>Crossmark</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SeriesMetadataType#getDoiData <em>Doi Data</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType()
 * @model extendedMetaData="name='series_metadata_._type' kind='elementOnly'"
 * @generated
 */
public interface SeriesMetadataType extends EObject {
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
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_Contributors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributorsType getContributors();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SeriesMetadataType#getContributors <em>Contributors</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_Titles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='titles' namespace='##targetNamespace'"
	 * @generated
	 */
	TitlesType getTitles();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SeriesMetadataType#getTitles <em>Titles</em>}' containment reference.
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
	 * The abstract element allows depositors to include
	 * 							abstracts extracted from NLM or JATS XML in Crossref deposits. The jats:
	 * 							namespace prefix must be included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='http://www.ncbi.nlm.nih.gov/JATS1'"
	 * @generated
	 */
	EList<AbstractType> getAbstract();

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
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_Issn()
	 * @model containment="true" required="true" upper="6"
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
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_Coden()
	 * @model dataType="org.crossref.schema._4._4.CodenType"
	 *        extendedMetaData="kind='element' name='coden' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCoden();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SeriesMetadataType#getCoden <em>Coden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coden</em>' attribute.
	 * @see #getCoden()
	 * @generated
	 */
	void setCoden(String value);

	/**
	 * Returns the value of the '<em><b>Series Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The series number within a specific published conference discipline.
	 * 				The series number is different from the volume number. A volume number is the number
	 * 				of a book in a physically printed set and typically appears in sequence. The series
	 * 				number is not tied to the physical manifestation of the printed volume and need not
	 * 				be strictly in sequence. It is most commonly used in "Lectures" published by
	 * 				Springer-Verlag. This element is available in series_metadata, however it should
	 * 				only be used for conference proceedings, not for books.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Number</em>' attribute.
	 * @see #setSeriesNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_SeriesNumber()
	 * @model dataType="org.crossref.schema._4._4.SeriesNumberType"
	 *        extendedMetaData="kind='element' name='series_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSeriesNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SeriesMetadataType#getSeriesNumber <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Number</em>' attribute.
	 * @see #getSeriesNumber()
	 * @generated
	 */
	void setSeriesNumber(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_PublisherItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher_item' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherItemType getPublisherItem();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SeriesMetadataType#getPublisherItem <em>Publisher Item</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_Crossmark()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crossmark' namespace='##targetNamespace'"
	 * @generated
	 */
	CrossmarkType getCrossmark();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SeriesMetadataType#getCrossmark <em>Crossmark</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_Program()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/fundref.xsd'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SeriesMetadataType#getProgram <em>Program</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_Program1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/AccessIndicators.xsd'"
	 * @generated
	 */
	org.crossref.access.indicators.ProgramType getProgram1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SeriesMetadataType#getProgram1 <em>Program1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program1</em>' containment reference.
	 * @see #getProgram1()
	 * @generated
	 */
	void setProgram1(org.crossref.access.indicators.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for archive. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Locations</em>' containment reference.
	 * @see #setArchiveLocations(ArchiveLocationsType)
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_ArchiveLocations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='archive_locations' namespace='##targetNamespace'"
	 * @generated
	 */
	ArchiveLocationsType getArchiveLocations();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SeriesMetadataType#getArchiveLocations <em>Archive Locations</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getSeriesMetadataType_DoiData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doi_data' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiDataType getDoiData();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SeriesMetadataType#getDoiData <em>Doi Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Data</em>' containment reference.
	 * @see #getDoiData()
	 * @generated
	 */
	void setDoiData(DoiDataType value);

} // SeriesMetadataType
