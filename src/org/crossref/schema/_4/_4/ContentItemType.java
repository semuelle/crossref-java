/**
 */
package org.crossref.schema._4._4;

import gov.nih.nlm.ncbi.jats1.AbstractType;

import java.math.BigInteger;

import org.crossref.fundref.ProgramType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getComponentNumber <em>Component Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getAcceptanceDate <em>Acceptance Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getPages <em>Pages</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getCrossmark <em>Crossmark</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getProgram2 <em>Program2</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getProgram3 <em>Program3</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getScnPolicies <em>Scn Policies</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getCitationList <em>Citation List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getLevelSequenceNumber <em>Level Sequence Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getPublicationType <em>Publication Type</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContentItemType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getContentItemType()
 * @model extendedMetaData="name='content_item_._type' kind='elementOnly'"
 * @generated
 */
public interface ContentItemType extends EObject {
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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_Contributors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributorsType getContributors();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getContributors <em>Contributors</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_Titles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='titles' namespace='##targetNamespace'"
	 * @generated
	 */
	TitlesType getTitles();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getTitles <em>Titles</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='http://www.ncbi.nlm.nih.gov/JATS1'"
	 * @generated
	 */
	EList<AbstractType> getAbstract();

	/**
	 * Returns the value of the '<em><b>Component Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The chapter, section, part, etc. number for a content item in a book.
	 * 				Unlike volume and edition_number, component_number should include any additional
	 * 				text that helps identify the type of component. In the example above, the text
	 * 				"Section 8" appeared on the table of contents and it is reflected here. "8" is also
	 * 				acceptable, however the former treatment is preferred. The type of the component is
	 * 				given the component_type attribute of content_item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Number</em>' attribute.
	 * @see #setComponentNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_ComponentNumber()
	 * @model dataType="org.crossref.schema._4._4.ComponentNumberType"
	 *        extendedMetaData="kind='element' name='component_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComponentNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getComponentNumber <em>Component Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Number</em>' attribute.
	 * @see #getComponentNumber()
	 * @generated
	 */
	void setComponentNumber(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_PublicationDate()
	 * @model containment="true" upper="10"
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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_AcceptanceDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acceptance_date' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptanceDateType getAcceptanceDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getAcceptanceDate <em>Acceptance Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Date</em>' containment reference.
	 * @see #getAcceptanceDate()
	 * @generated
	 */
	void setAcceptanceDate(AcceptanceDateType value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for information about page ranges. When an entity has
	 * 				non-contiguous page information, you should capture the first page range in
	 * 				first_page and last_page. Any additional page information should be captured in
	 * 				other_pages. Punctuation is only allowed in other_pages. It should not appear in
	 * 				first_page and last_page. Page number letter prefixes or suffixes should be
	 * 				included. Roman numeral pages are permitted in both upper case and lower case. Data
	 * 				may be alpha, numeric or a combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference.
	 * @see #setPages(PagesType)
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_Pages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pages' namespace='##targetNamespace'"
	 * @generated
	 */
	PagesType getPages();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getPages <em>Pages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' containment reference.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(PagesType value);

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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_PublisherItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher_item' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherItemType getPublisherItem();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getPublisherItem <em>Publisher Item</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_Crossmark()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crossmark' namespace='##targetNamespace'"
	 * @generated
	 */
	CrossmarkType getCrossmark();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getCrossmark <em>Crossmark</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_Program()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/fundref.xsd'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getProgram <em>Program</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_Program1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/AccessIndicators.xsd'"
	 * @generated
	 */
	org.crossref.access.indicators.ProgramType getProgram1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getProgram1 <em>Program1</em>}' containment reference.
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
	 * Accommodates deposit of linked clincal trials metadata. The clinical-trial-number value will
	 *                 be a string that must match a specific pattern appropriate for a given clinical trial registry. The
	 *                 registry is identified in the required attribute 'registry' and must be the DOI of a recognized registry
	 *                 (see http://dx.doi.org/10.18810/registries)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program2</em>' containment reference.
	 * @see #setProgram2(org.crossref.clinicaltrials.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_Program2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/clinicaltrials.xsd'"
	 * @generated
	 */
	org.crossref.clinicaltrials.ProgramType getProgram2();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getProgram2 <em>Program2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program2</em>' containment reference.
	 * @see #getProgram2()
	 * @generated
	 */
	void setProgram2(org.crossref.clinicaltrials.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wrapper element for relationship metadata
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program3</em>' containment reference.
	 * @see #setProgram3(org.crossref.relations.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_Program3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/relations.xsd'"
	 * @generated
	 */
	org.crossref.relations.ProgramType getProgram3();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getProgram3 <em>Program3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program3</em>' containment reference.
	 * @see #getProgram3()
	 * @generated
	 */
	void setProgram3(org.crossref.relations.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for archive. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Locations</em>' containment reference.
	 * @see #setArchiveLocations(ArchiveLocationsType)
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_ArchiveLocations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='archive_locations' namespace='##targetNamespace'"
	 * @generated
	 */
	ArchiveLocationsType getArchiveLocations();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getArchiveLocations <em>Archive Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Locations</em>' containment reference.
	 * @see #getArchiveLocations()
	 * @generated
	 */
	void setArchiveLocations(ArchiveLocationsType value);

	/**
	 * Returns the value of the '<em><b>Scn Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A wrapper for Scholarly Sharing Network (SCN) policy
	 * 				information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scn Policies</em>' containment reference.
	 * @see #setScnPolicies(ScnPoliciesType)
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_ScnPolicies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scn_policies' namespace='##targetNamespace'"
	 * @generated
	 */
	ScnPoliciesType getScnPolicies();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getScnPolicies <em>Scn Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scn Policies</em>' containment reference.
	 * @see #getScnPolicies()
	 * @generated
	 */
	void setScnPolicies(ScnPoliciesType value);

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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_DoiData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doi_data' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiDataType getDoiData();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getDoiData <em>Doi Data</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_CitationList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citation_list' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationListType getCitationList();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getCitationList <em>Citation List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation List</em>' containment reference.
	 * @see #getCitationList()
	 * @generated
	 */
	void setCitationList(CitationListType value);

	/**
	 * Returns the value of the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The wrapper element for including a group of components under a
	 * 				journal article, conference proceeding, book chapter, stand alone component,
	 * 				dissertation, technical report or working paper, standard, or
	 * 				database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component List</em>' containment reference.
	 * @see #setComponentList(ComponentListType)
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_ComponentList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component_list' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentListType getComponentList();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getComponentList <em>Component List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component List</em>' containment reference.
	 * @see #getComponentList()
	 * @generated
	 */
	void setComponentList(ComponentListType value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.ComponentTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see org.crossref.schema._4._4.ComponentTypeType
	 * @see #isSetComponentType()
	 * @see #unsetComponentType()
	 * @see #setComponentType(ComponentTypeType)
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_ComponentType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='component_type'"
	 * @generated
	 */
	ComponentTypeType getComponentType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see org.crossref.schema._4._4.ComponentTypeType
	 * @see #isSetComponentType()
	 * @see #unsetComponentType()
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentTypeType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComponentType()
	 * @see #getComponentType()
	 * @see #setComponentType(ComponentTypeType)
	 * @generated
	 */
	void unsetComponentType();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ContentItemType#getComponentType <em>Component Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Component Type</em>' attribute is set.
	 * @see #unsetComponentType()
	 * @see #getComponentType()
	 * @see #setComponentType(ComponentTypeType)
	 * @generated
	 */
	boolean isSetComponentType();

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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getLanguage <em>Language</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ContentItemType#getLanguage <em>Language</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Level Sequence Number</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Sequence Number</em>' attribute.
	 * @see #isSetLevelSequenceNumber()
	 * @see #unsetLevelSequenceNumber()
	 * @see #setLevelSequenceNumber(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_LevelSequenceNumber()
	 * @model default="1" unsettable="true" dataType="org.crossref.schema._4._4.LevelSequenceNumberType"
	 *        extendedMetaData="kind='attribute' name='level_sequence_number'"
	 * @generated
	 */
	BigInteger getLevelSequenceNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getLevelSequenceNumber <em>Level Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Sequence Number</em>' attribute.
	 * @see #isSetLevelSequenceNumber()
	 * @see #unsetLevelSequenceNumber()
	 * @see #getLevelSequenceNumber()
	 * @generated
	 */
	void setLevelSequenceNumber(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getLevelSequenceNumber <em>Level Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevelSequenceNumber()
	 * @see #getLevelSequenceNumber()
	 * @see #setLevelSequenceNumber(BigInteger)
	 * @generated
	 */
	void unsetLevelSequenceNumber();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ContentItemType#getLevelSequenceNumber <em>Level Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Level Sequence Number</em>' attribute is set.
	 * @see #unsetLevelSequenceNumber()
	 * @see #getLevelSequenceNumber()
	 * @see #setLevelSequenceNumber(BigInteger)
	 * @generated
	 */
	boolean isSetLevelSequenceNumber();

	/**
	 * Returns the value of the '<em><b>Publication Type</b></em>' attribute.
	 * The default value is <code>"full_text"</code>.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.PublicationTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Type</em>' attribute.
	 * @see org.crossref.schema._4._4.PublicationTypeType
	 * @see #isSetPublicationType()
	 * @see #unsetPublicationType()
	 * @see #setPublicationType(PublicationTypeType)
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_PublicationType()
	 * @model default="full_text" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='publication_type'"
	 * @generated
	 */
	PublicationTypeType getPublicationType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getPublicationType <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Type</em>' attribute.
	 * @see org.crossref.schema._4._4.PublicationTypeType
	 * @see #isSetPublicationType()
	 * @see #unsetPublicationType()
	 * @see #getPublicationType()
	 * @generated
	 */
	void setPublicationType(PublicationTypeType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getPublicationType <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublicationType()
	 * @see #getPublicationType()
	 * @see #setPublicationType(PublicationTypeType)
	 * @generated
	 */
	void unsetPublicationType();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ContentItemType#getPublicationType <em>Publication Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Publication Type</em>' attribute is set.
	 * @see #unsetPublicationType()
	 * @see #getPublicationType()
	 * @see #setPublicationType(PublicationTypeType)
	 * @generated
	 */
	boolean isSetPublicationType();

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
	 * @see org.crossref.schema._4._4._4Package#getContentItemType_ReferenceDistributionOpts()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='reference_distribution_opts'"
	 * @generated
	 */
	ReferenceDistributionOptsType getReferenceDistributionOpts();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ContentItemType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @generated
	 */
	void unsetReferenceDistributionOpts();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ContentItemType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Distribution Opts</em>' attribute is set.
	 * @see #unsetReferenceDistributionOpts()
	 * @see #getReferenceDistributionOpts()
	 * @see #setReferenceDistributionOpts(ReferenceDistributionOptsType)
	 * @generated
	 */
	boolean isSetReferenceDistributionOpts();

} // ContentItemType
