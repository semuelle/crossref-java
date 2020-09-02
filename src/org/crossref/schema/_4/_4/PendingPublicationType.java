/**
 */
package org.crossref.schema._4._4;

import gov.nih.nlm.ncbi.jats1.AbstractType;

import org.crossref.fundref.ProgramType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pending Publication Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getPublication <em>Publication</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getAcceptanceDate <em>Acceptance Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getItemNumber <em>Item Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getIntentStatement <em>Intent Statement</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getCrossmark <em>Crossmark</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getProgram2 <em>Program2</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PendingPublicationType#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType()
 * @model extendedMetaData="name='pending_publication_._type' kind='elementOnly'"
 * @generated
 */
public interface PendingPublicationType extends EObject {
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
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Contributors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributorsType getContributors();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getContributors <em>Contributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributors</em>' containment reference.
	 * @see #getContributors()
	 * @generated
	 */
	void setContributors(ContributorsType value);

	/**
	 * Returns the value of the '<em><b>Publication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to define a publication (book, journal, etc) for pending
	 * 				publication content. A title must be supplied, as well as an ISSN, ISBN, or
	 * 				title-level DOI 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication</em>' containment reference.
	 * @see #setPublication(PublicationType)
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Publication()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='publication' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationType getPublication();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getPublication <em>Publication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication</em>' containment reference.
	 * @see #getPublication()
	 * @generated
	 */
	void setPublication(PublicationType value);

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
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Titles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='titles' namespace='##targetNamespace'"
	 * @generated
	 */
	TitlesType getTitles();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getTitles <em>Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titles</em>' containment reference.
	 * @see #getTitles()
	 * @generated
	 */
	void setTitles(TitlesType value);

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
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_AcceptanceDate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='acceptance_date' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptanceDateType getAcceptanceDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getAcceptanceDate <em>Acceptance Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Date</em>' containment reference.
	 * @see #getAcceptanceDate()
	 * @generated
	 */
	void setAcceptanceDate(AcceptanceDateType value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.InstitutionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wrapper element for information about an organization that sponsored
	 * 				or hosted an item but is not the publisher of the item. The institution element
	 * 				should be used to deposit metadata about an organization that sponsored or hosted
	 * 				the research or development of the published material but was not actually the
	 * 				publisher of the information. The institution is distinctly different from the
	 * 				publisher because it may not be a publishing organization. It is typically an
	 * 				organization such as a university, corporation, government agency, NGO or consortia.
	 * 				If the content was published by an organization other than the sponsor, the use of
	 * 				both the publisher and institution elements is encouraged because authors may cite
	 * 				either one in a reference, and the availability of both may allow for more precise
	 * 				matching in queries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Institution()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='institution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstitutionType> getInstitution();

	/**
	 * Returns the value of the '<em><b>Item Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ItemNumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A publisher identifier that can be used to uniquely identify the
	 * 				entity being registered. This identifier is a publisher-assigned number that
	 * 				uniquely identifies the entity being registered. This element should be used for
	 * 				identifiers based on publisher internal standards. Use identifier for a publisher
	 * 				identifier that is based on a public standard such as PII or SICI. If the
	 * 				item_number and identifier are identical, there is no need to submit both. In this
	 * 				case, the preferred element to use is identifier. Data may be alpha, numeric or a
	 * 				combination. item_number has an optional attribute, item_number_type. It is assigned
	 * 				by the publisher to provide context for the data in item_number. If item_number
	 * 				contains only a publisher's tracking number, this attribute need not be supplied. If
	 * 				the item_number contains other data, this attribute can be used to define the
	 * 				content. For example, if a journal is published online (i.e. it has no page
	 * 				numbers), and each article on the table of contents is assigned a sequential number,
	 * 				this article number can be placed in item_number, and the item_number_type attribute
	 * 				can be set to "article_number". Although Crossref has not provided a set of
	 * 				enumerated types for this attribute, please check with Crossref before using this
	 * 				attribute to determine if a standard attribute has already been defined for your
	 * 				specific needs. If a dissertation DAI has been assigned, it should be deposited in
	 * 				the identifier element with the id_type attribute set to "dai". If an institution
	 * 				has its own numbering system, it should be deposited in item_number, and the
	 * 				item_number_type should be set to "institution" If the report number of an item
	 * 				follows Z39.23, the number should be deposited in the identifier element with the
	 * 				id_type attribute set to "Z39.23". If a report number uses its own numbering system,
	 * 				it should be deposited in the identifier element, and the id_type should be set to
	 * 				"report-number" The designation for a standard should be placed inside the
	 * 				identifier element with the id_type attribute set to "ISO-std-ref" or
	 * 				"std-designation" (more generic label)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Number</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_ItemNumber()
	 * @model containment="true" upper="3"
	 *        extendedMetaData="kind='element' name='item_number' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemNumberType> getItemNumber();

	/**
	 * Returns the value of the '<em><b>Intent Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Publisher's custom statement for their intent to publish content for
	 * 				which a pre-register DOI has been created
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intent Statement</em>' containment reference.
	 * @see #setIntentStatement(IntentStatementType)
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_IntentStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intent_statement' namespace='##targetNamespace'"
	 * @generated
	 */
	IntentStatementType getIntentStatement();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getIntentStatement <em>Intent Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent Statement</em>' containment reference.
	 * @see #getIntentStatement()
	 * @generated
	 */
	void setIntentStatement(IntentStatementType value);

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
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='http://www.ncbi.nlm.nih.gov/JATS1'"
	 * @generated
	 */
	EList<AbstractType> getAbstract();

	/**
	 * Returns the value of the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for CrossMark data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crossmark</em>' containment reference.
	 * @see #setCrossmark(CrossmarkType)
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Crossmark()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crossmark' namespace='##targetNamespace'"
	 * @generated
	 */
	CrossmarkType getCrossmark();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getCrossmark <em>Crossmark</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Program()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/fundref.xsd'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getProgram <em>Program</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Program1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/AccessIndicators.xsd'"
	 * @generated
	 */
	org.crossref.access.indicators.ProgramType getProgram1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getProgram1 <em>Program1</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Program2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/relations.xsd'"
	 * @generated
	 */
	org.crossref.relations.ProgramType getProgram2();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getProgram2 <em>Program2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program2</em>' containment reference.
	 * @see #getProgram2()
	 * @generated
	 */
	void setProgram2(org.crossref.relations.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DOI for an entity being registered with Crossref. In 2008 Crossref
	 * 				restricted DOI suffix characters to the following: "a-z", "A-Z", "0-9" and "-._;()/"
	 * 				Existing DOIs with suffix characters outside of the allowed set are still supported.
	 * 				For additional information on DOI syntax, see
	 * 				https://support.crossref.org/hc/en-us/articles/214669823
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi</em>' attribute.
	 * @see #setDoi(String)
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Doi()
	 * @model dataType="org.crossref.schema._4._4.DoiType" required="true"
	 *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDoi();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getDoi <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi</em>' attribute.
	 * @see #getDoi()
	 * @generated
	 */
	void setDoi(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getPendingPublicationType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getLanguage <em>Language</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.PendingPublicationType#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	boolean isSetLanguage();

} // PendingPublicationType
