/**
 */
package org.crossref.schema._4._4;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getA <em>A</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getAbbrevTitle <em>Abbrev Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getAcceptanceDate <em>Acceptance Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getAltName <em>Alt Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getArchive <em>Archive</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getBody <em>Body</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getBook <em>Book</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getBookMetadata <em>Book Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getBookSeriesMetadata <em>Book Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getBookSetMetadata <em>Book Set Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCitationList <em>Citation List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCoden <em>Coden</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCompetingInterestStatement <em>Competing Interest Statement</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getComponent <em>Component</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getComponentNumber <em>Component Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getConference <em>Conference</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getConferenceAcronym <em>Conference Acronym</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getConferenceDate <em>Conference Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getConferenceLocation <em>Conference Location</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getConferenceName <em>Conference Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getConferenceNumber <em>Conference Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getConferencePaper <em>Conference Paper</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getConferenceSponsor <em>Conference Sponsor</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getConferenceTheme <em>Conference Theme</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getContentDate <em>Content Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getContentItem <em>Content Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getContractNumber <em>Contract Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCrossmark <em>Crossmark</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkDomain <em>Crossmark Domain</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#isCrossmarkDomainExclusive <em>Crossmark Domain Exclusive</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkDomains <em>Crossmark Domains</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkPolicy <em>Crossmark Policy</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkVersion <em>Crossmark Version</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCustomMetadata <em>Custom Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getCYear <em>CYear</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDatabaseDate <em>Database Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDatabaseMetadata <em>Database Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDay <em>Day</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDepositor <em>Depositor</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDepositorName <em>Depositor Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDesignators <em>Designators</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDissertation <em>Dissertation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDoiBatch <em>Doi Batch</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDoiBatchId <em>Doi Batch Id</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getEditionNumber <em>Edition Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getEventMetadata <em>Event Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getFirstPage <em>First Page</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getFormat <em>Format</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getFullTitle <em>Full Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getGroupTitle <em>Group Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getHead <em>Head</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionAcronym <em>Institution Acronym</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionDepartment <em>Institution Department</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionName <em>Institution Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionPlace <em>Institution Place</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getIntentStatement <em>Intent Statement</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getItem <em>Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getItemNumber <em>Item Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getJournal <em>Journal</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getJournalArticle <em>Journal Article</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getJournalIssue <em>Journal Issue</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getJournalMetadata <em>Journal Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getJournalTitle <em>Journal Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getJournalVolume <em>Journal Volume</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getLastPage <em>Last Page</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getMonth <em>Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getNoisbn <em>Noisbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getORCID <em>ORCID</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getOriginalLanguageTitle <em>Original Language Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getOtherPages <em>Other Pages</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPages <em>Pages</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPeerReview <em>Peer Review</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPendingPublication <em>Pending Publication</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPostedContent <em>Posted Content</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsMetadata <em>Proceedings Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsSeriesMetadata <em>Proceedings Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsSubject <em>Proceedings Subject</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsTitle <em>Proceedings Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPublication <em>Publication</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getPublisherPlace <em>Publisher Place</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getRegistrant <em>Registrant</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getReportPaper <em>Report Paper</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getReportPaperMetadata <em>Report Paper Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getReportPaperSeriesMetadata <em>Report Paper Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getResource <em>Resource</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getRunningNumber <em>Running Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSaComponent <em>Sa Component</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getScnPolicies <em>Scn Policies</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getScnPolicyRef <em>Scn Policy Ref</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getScnPolicySet <em>Scn Policy Set</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSeriesMetadata <em>Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSeriesTitle <em>Series Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSetMetadata <em>Set Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSpecialNumbering <em>Special Numbering</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStandard <em>Standard</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStandardMetadata <em>Standard Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStandardsBody <em>Standards Body</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStandardsBodyAcronym <em>Standards Body Acronym</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStandardsBodyName <em>Standards Body Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdAdoptedFrom <em>Std Adopted From</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdAltAsPublished <em>Std Alt As Published</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdAltScript <em>Std Alt Script</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdAsPublished <em>Std As Published</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdDesignator <em>Std Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdFamilyDesignator <em>Std Family Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdRevisionOf <em>Std Revision Of</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdSetDesignator <em>Std Set Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdSupersedes <em>Std Supersedes</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdUndatedDesignator <em>Std Undated Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStdVariantForm <em>Std Variant Form</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStringName <em>String Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getUnassignedContent <em>Unassigned Content</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getUnstructuredCitation <em>Unstructured Citation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getUpdates <em>Updates</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getVolumeTitle <em>Volume Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DocumentRoot#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  content is "Inline" except that anchors shouldn't be nested
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>A</em>' containment reference.
	 * @see #setA(AType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_A()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace'"
	 * @generated
	 */
	AType getA();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getA <em>A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' containment reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(AType value);

	/**
	 * Returns the value of the '<em><b>Abbrev Title</b></em>' attribute.
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
	 * @return the value of the '<em>Abbrev Title</em>' attribute.
	 * @see #setAbbrevTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_AbbrevTitle()
	 * @model unique="false" dataType="org.crossref.schema._4._4.AbbrevTitleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbrev_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbbrevTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getAbbrevTitle <em>Abbrev Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbrev Title</em>' attribute.
	 * @see #getAbbrevTitle()
	 * @generated
	 */
	void setAbbrevTitle(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_AcceptanceDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acceptance_date' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptanceDateType getAcceptanceDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getAcceptanceDate <em>Acceptance Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Date</em>' containment reference.
	 * @see #getAcceptanceDate()
	 * @generated
	 */
	void setAcceptanceDate(AcceptanceDateType value);

	/**
	 * Returns the value of the '<em><b>Affiliation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The institution(s) with which a contributor is affiliated. This
	 * 				element may hold the name and location of an affiliation with which a contributor is
	 * 				affiliated. Please note the following points when using this element: 1. A
	 * 				contributor may have up to five affiliations. Each affiliation should be in a unique
	 * 				<affiliation> element. The following is correct: <affiliation>University
	 * 				of New Mexico</affiliation> <affiliation>Sandia National
	 * 				Laboratories</affiliation> The following is NOT correct
	 * 				<affiliation>University of New Mexico; Sandia National
	 * 				Laboratories</affiliation> 2. The name of the institution is required in this
	 * 				element. The location is optional. Both of the following are correct:
	 * 				<affiliation>Harvard University</affiliation> <affiliation>Harvard
	 * 				University, Cambridge, MA</affiliation> 3. Additional address information such
	 * 				as a URL or email address should NOT be deposited in this element 4. Visual linking
	 * 				indicators used in publication to connect authors with their affiliations such as
	 * 				footnote symbols or initials should NOT be included in the <affiliation>
	 * 				element 5. If you have only a single string that has the affiliation for multiple
	 * 				contributors to a work and that string is not broken out into the individual
	 * 				affliations for each author, please do NOT deposit the affilation information. This
	 * 				element is to be used only for affiliation information that is directly connected to
	 * 				the author with whom this information is included within the person_name element.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affiliation</em>' attribute.
	 * @see #setAffiliation(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Affiliation()
	 * @model unique="false" dataType="org.crossref.schema._4._4.AffiliationType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='affiliation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAffiliation();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getAffiliation <em>Affiliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliation</em>' attribute.
	 * @see #getAffiliation()
	 * @generated
	 */
	void setAffiliation(String value);

	/**
	 * Returns the value of the '<em><b>Alt Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Name</em>' containment reference.
	 * @see #setAltName(AltNameType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_AltName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alt-name' namespace='##targetNamespace'"
	 * @generated
	 */
	AltNameType getAltName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getAltName <em>Alt Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Name</em>' containment reference.
	 * @see #getAltName()
	 * @generated
	 */
	void setAltName(AltNameType value);

	/**
	 * Returns the value of the '<em><b>Anonymous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anonymous</em>' containment reference.
	 * @see #setAnonymous(AnonymousType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Anonymous()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anonymous' namespace='##targetNamespace'"
	 * @generated
	 */
	AnonymousType getAnonymous();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getAnonymous <em>Anonymous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous</em>' containment reference.
	 * @see #getAnonymous()
	 * @generated
	 */
	void setAnonymous(AnonymousType value);

	/**
	 * Returns the value of the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The date on which a dissertation was accepted by the institution
	 * 				awarding the degree, a report was approved, or a standard was accepted.
	 * 				approval_date includes the same elements as publication_date, but it has no
	 * 				attributes. It is a distinct element from publication_date to reflect that an
	 * 				important but different semantic meeting from publication_date 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Date</em>' containment reference.
	 * @see #setApprovalDate(ApprovalDateType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ApprovalDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='approval_date' namespace='##targetNamespace'"
	 * @generated
	 */
	ApprovalDateType getApprovalDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getApprovalDate <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Date</em>' containment reference.
	 * @see #getApprovalDate()
	 * @generated
	 */
	void setApprovalDate(ApprovalDateType value);

	/**
	 * Returns the value of the '<em><b>Archive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to indicate the designated archiving organization(s) for an
	 * 				item. Values for the name attribute are CLOCKSS, LOCKSS Portico, KB, DWT (Deep Web
	 * 				Technologies), Internet Archive
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive</em>' containment reference.
	 * @see #setArchive(ArchiveType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Archive()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='archive' namespace='##targetNamespace'"
	 * @generated
	 */
	ArchiveType getArchive();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getArchive <em>Archive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive</em>' containment reference.
	 * @see #getArchive()
	 * @generated
	 */
	void setArchive(ArchiveType value);

	/**
	 * Returns the value of the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for archive. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Locations</em>' containment reference.
	 * @see #setArchiveLocations(ArchiveLocationsType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ArchiveLocations()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='archive_locations' namespace='##targetNamespace'"
	 * @generated
	 */
	ArchiveLocationsType getArchiveLocations();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getArchiveLocations <em>Archive Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Locations</em>' containment reference.
	 * @see #getArchiveLocations()
	 * @generated
	 */
	void setArchiveLocations(ArchiveLocationsType value);

	/**
	 * Returns the value of the '<em><b>Article Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Article title in a citation. Use care to remove face markup (such as
	 * 				italic applied to genus or species names) from article titles as this markup is not
	 * 				supported by Crossref.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Title</em>' attribute.
	 * @see #setArticleTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ArticleTitle()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArticleTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getArticleTitle <em>Article Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Title</em>' attribute.
	 * @see #getArticleTitle()
	 * @generated
	 */
	void setArticleTitle(String value);

	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An assertion is a piece of custom, non-bibliographic metadata that
	 * 				the publisher is asserting about the content to which the CrossMark refers.
	 * 				assertion attributes: explanation: If the publisher wants to provide a further
	 * 				explanation of what the particular "assertion" means, they can link to such an
	 * 				explanation by providing an appropriate url on the "explanation" attribute.
	 * 				group_label: This is the human-readable form of the "group_name" attribute. This is
	 * 				what will be displayed in the group headings on the CrossMark metadata record
	 * 				dialog. group_name: Some assertions could be logically "grouped" together in the
	 * 				CrossMark dialog. For instance, if the publisher is recording several pieces of
	 * 				metadata related to funding sources (source name, percentage, grant number), they
	 * 				may want to make sure that these three assertions are grouped next to each-other in
	 * 				the CrossMark dialog. The group_name attribute is the machine-readable value that
	 * 				will be used for grouping such assertions. label: This is the human-readable version
	 * 				of the name attribute which will be displayed in the CrossMark dialog. If this
	 * 				attribute is missing, then the value of the assertion will *not* be displayed in the
	 * 				dialog. Publishers may want to "hide" assertions this way in cases where the
	 * 				assertion value is too large or too complex to display in the dialog, but where the
	 * 				assertion is nonetheless valuable enough to include in API queries and metadata
	 * 				dumps (e.g. detailed licensing terms). name: This is the machine-readable name of
	 * 				the assertion. Use the "label" attribute to provide a human-readable version of the
	 * 				name. order: The publisher may want to control the order in which assertions are
	 * 				displayed to the user in the CrossMark dialog. All assertions will be sorted by this
	 * 				element if it is present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference.
	 * @see #setAssertion(AssertionType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Assertion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assertion' namespace='##targetNamespace'"
	 * @generated
	 */
	AssertionType getAssertion();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getAssertion <em>Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' containment reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(AssertionType value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   First author in a citation. Only used in the citation element. The
	 * 				author element tags one author name in a citation without the hierarchy required by
	 * 				the contributors or person_name elements Only the first author should be deposited
	 * 				for each item. The author surname is required. Author initials may be added but are
	 * 				not recommended because queries work best when only the last name is provided. For
	 * 				example, the author "John Doe" can be deposited as 
	 *   <author>Doe</author>
	 *    or
	 * 					
	 *   <author>Doe J</author>
	 *   , but the former style is recommended. If the author of a
	 * 				work is an organization rather than a person, the organization may be deposited as
	 * 				in: 
	 *   <author>World Health Organization</author>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Author()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference.
	 * @see #setB(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_B()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getB();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getB <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' containment reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for the main body of a DOI record submission. The body
	 * 				contains a set of journal, book, conference proceedings or stand alone component
	 * 				records. It is not possible to mix genres within a single DOI submission. It is
	 * 				possible to include records for multiple journals, books, conferences, or stand
	 * 				alone components in a single submission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodyType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Body()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyType getBody();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodyType value);

	/**
	 * Returns the value of the '<em><b>Book</b></em>' containment reference.
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
	 * @return the value of the '<em>Book</em>' containment reference.
	 * @see #setBook(BookType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Book()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='book' namespace='##targetNamespace'"
	 * @generated
	 */
	BookType getBook();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getBook <em>Book</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book</em>' containment reference.
	 * @see #getBook()
	 * @generated
	 */
	void setBook(BookType value);

	/**
	 * Returns the value of the '<em><b>Book Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to a monograph. It does
	 * 				not include metadata about individual chapters. The language of the book should be
	 * 				specified in the book_metadata language attribute. If a book contains items in
	 * 				multiple languages this attribute should be set for the predominant language of the
	 * 				book. Individual items may have their language specified in content_item. If all
	 * 				content items are the same language, it is only necessary to specify the language of
	 * 				the book in this element. The contributors are the author(s) or editor(s) of the
	 * 				entire work. When using book_metadata, specify the title of the book within
	 * 				book_metadata. edition_number, when given, should include only a number and not
	 * 				additional text such as "edition" or "ed". publisher_item, when given, specifies
	 * 				this information for the entire book or volume. This element also appears in
	 * 				content_item. doi_data is required for each book or volume that you submit. It is
	 * 				not possible to submit DOI information for individual chapters without assigning a
	 * 				DOI to the entire work. Note: citation_list should only be used in book_metadata
	 * 				instead of content_item when the reference list is a separate section of the book,
	 * 				and content_items are not included in the deposit (e.g. you are depositing a book
	 * 				with a bibliography, but not the chapters of the book) In very limited circumstances
	 * 				a book may be deposited without an ISBN, in which case the noisbn element must be
	 * 				supplied to explicitly declare that an ISBN is not accidentily omitted. Great care
	 * 				should be taken when choossing to use noisbn since it may adversely effect matching.
	 * 				This provision is primarily being made to allow for the deposit of DOIs for
	 * 				historical volumes that are difficult to obtain ISBNs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Book Metadata</em>' containment reference.
	 * @see #setBookMetadata(BookMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_BookMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='book_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	BookMetadataType getBookMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getBookMetadata <em>Book Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Metadata</em>' containment reference.
	 * @see #getBookMetadata()
	 * @generated
	 */
	void setBookMetadata(BookMetadataType value);

	/**
	 * Returns the value of the '<em><b>Book Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to an individual volume
	 * 				of a book series. It does not include metadata about individual chapters. The
	 * 				language of the book should be specified in the book_series_metadata language
	 * 				attribute. If a book contains items in multiple languages this attribute should be
	 * 				set for the predominant language of the book. Individual items may have their
	 * 				language specified in content_item. If all content items are the same language, it
	 * 				is only necessary to specify the language of the book in this element. The
	 * 				contributors are the author(s) or editor(s) of the entire work. If a multi- volume
	 * 				work has separate editors for each volume, those editors should be specified in this
	 * 				element, and the series editors are listed in the series_metadata contributors.
	 * 				Series titles should be specified within series_metadata. Volume titles (when
	 * 				present) are captured in book_series_metadata. If the volumes of a series only have
	 * 				volume numbers and not individual titles, you may specify the volume number within
	 * 				volume_metadata, and no title is required. volume and edition_number, when given,
	 * 				should include only a number and not additional text such as "volume" or "edition".
	 * 				For example, you should submit "3", not "third edition". If a work spans multiple
	 * 				volumes with a unique ISBN for each volume and the whole series, you should specify
	 * 				the series ISBN in isbn in series_metadata and the volume ISBN in isbn in
	 * 				book_series_metadata. WARNING: Care must be taken when submitting books with series.
	 * 				If a series title is submitted and no book title is supplied but an ISBN is supplied
	 * 				at the book_series_metadata level and not with the series title, the Crossref system
	 * 				will index a series title with no ISBN and an ISBN with no title. Please take care
	 * 				to associate the ISBN at the correct level of the XML hierarchy. publisher_item,
	 * 				when given, specifies this information for the entire book or volume. This element
	 * 				also appears in content_item. doi_data is required for each book or volume that you
	 * 				submit. It is not possible to submit DOI information for individual chapters without
	 * 				assigning a DOI to the entire work. Note: citation_list should only be used in
	 * 				book_series_metadata instead of content_item when the reference list is a separate
	 * 				section of the book, and content_items are not included in the deposit (e.g. you are
	 * 				depositing a book with a bibliography, but not the chapters of the book) Normally
	 * 				book content that is published as a series is required to have a series title with
	 * 				an ISSN and a book title and/or a book volume number along with a book ISBN. An
	 * 				exception is when book chapters are published on line first prior to being assigned
	 * 				to a specific book in which case only the series title (and ISSN) is known at time
	 * 				of DOI registration. Element unassigned_content is used as a placeholder to force
	 * 				recognition of this condition and thus prevent accidental omission of book level
	 * 				title information. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Book Series Metadata</em>' containment reference.
	 * @see #setBookSeriesMetadata(BookSeriesMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_BookSeriesMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='book_series_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	BookSeriesMetadataType getBookSeriesMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getBookSeriesMetadata <em>Book Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Series Metadata</em>' containment reference.
	 * @see #getBookSeriesMetadata()
	 * @generated
	 */
	void setBookSeriesMetadata(BookSeriesMetadataType value);

	/**
	 * Returns the value of the '<em><b>Book Set Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to an individual volume
	 * 				of a book set. It does not include metadata about individual chapters. A set is a
	 * 				finite series, and does not have an ISSN The language of the book should be
	 * 				specified in the book_set_metadata language attribute. If a book contains items in
	 * 				multiple languages this attribute should be set for the predominant language of the
	 * 				book. Individual items may have their language specified in content_item. If all
	 * 				content items are the same language, it is only necessary to specify the language of
	 * 				the book in this element. The contributors are the author(s) or editor(s) of the
	 * 				entire work. If a multi- volume work has separate editors for each volume, those
	 * 				editors should be specified in this element, and the series editors are listed in
	 * 				the series_metadata contributors. When using book_set_metadata, specify the title of
	 * 				the entire set and the isbn of the set. Specify the title of the volume in
	 * 				volume_metadata. If the volumes of a set only have volume numbers and not individual
	 * 				titles, you may specify the volume number within volume_metadata, and no title is
	 * 				required. volume and edition_number, when given, should include only a number and
	 * 				not additional text such as "volume" or "edition". For example, you should submit
	 * 				"3", not "third edition". If a work spans multiple volumes with a unique ISBN for
	 * 				each volume and the whole series, you should specify the series ISBN in isbn in
	 * 				series_metadata and the volume ISBN in isbn in book_series_metadata. publisher_item,
	 * 				when given, specifies this information for the entire book or volume. This element
	 * 				also appears in content_item. doi_data is required for each book or volume that you
	 * 				submit. It is not possible to submit DOI information for individual chapters without
	 * 				assigning a DOI to the entire work. Note: citation_list should only be used in
	 * 				book_series_metadata instead of content_item when the reference list is a separate
	 * 				section of the book, and content_items are not included in the deposit (e.g. you are
	 * 				depositing a book with a bibliography, but not the chapters of the
	 * 				book)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Book Set Metadata</em>' containment reference.
	 * @see #setBookSetMetadata(BookSetMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_BookSetMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='book_set_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	BookSetMetadataType getBookSetMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getBookSetMetadata <em>Book Set Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Set Metadata</em>' containment reference.
	 * @see #getBookSetMetadata()
	 * @generated
	 */
	void setBookSetMetadata(BookSetMetadataType value);

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * citation is used to deposit each citation in the reference list of
	 * 				the item for which the DOI is being deposited. For details see:
	 * 				https://crossref.zendesk.com/hc/en-us/articles/215578403 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(CitationType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Citation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citation' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationType getCitation();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(CitationType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_CitationList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citation_list' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationListType getCitationList();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCitationList <em>Citation List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation List</em>' containment reference.
	 * @see #getCitationList()
	 * @generated
	 */
	void setCitationList(CitationListType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Coden()
	 * @model unique="false" dataType="org.crossref.schema._4._4.CodenType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coden' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCoden();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCoden <em>Coden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coden</em>' attribute.
	 * @see #getCoden()
	 * @generated
	 */
	void setCoden(String value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  A collection is a container for one or more items each holding a doi
	 * 				or a resource (URI) which is related to the DOI in the ancestor <doi_data>
	 * 				element. A collection must be qualified by a property attibute or the
	 * 				multi-resolution attribute. property attributes: list-based: uses an interim page
	 * 				and presents the list of items to the user (via Multiple Resolution) country-based:
	 * 				proxy picks destination based on the country code of the user's location
	 * 				crawler-based: identifies resource to be crawled by the specified crawlers.
	 * 				text-mining: identifies resource to be used for text and data mining unspecified:
	 * 				identifies resource with unspecified usage syndication: identifies resource to be
	 * 				used for syndication link-header: identifies resource to be used as an endpoint The
	 * 				multi-resolution attribute may be used to lock or unlock DOIs for multiple
	 * 				resolution. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(CollectionType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Collection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace'"
	 * @generated
	 */
	CollectionType getCollection();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(CollectionType value);

	/**
	 * Returns the value of the '<em><b>Competing Interest Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statement of competing interest supplied by a review author during
	 * 				the review process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Competing Interest Statement</em>' containment reference.
	 * @see #setCompetingInterestStatement(CompetingInterestStatementType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_CompetingInterestStatement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='competing_interest_statement' namespace='##targetNamespace'"
	 * @generated
	 */
	CompetingInterestStatementType getCompetingInterestStatement();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCompetingInterestStatement <em>Competing Interest Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Competing Interest Statement</em>' containment reference.
	 * @see #getCompetingInterestStatement()
	 * @generated
	 */
	void setCompetingInterestStatement(CompetingInterestStatementType value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container element that allows registration of supplemental
	 * 				information for a journal article, book chapter, or conference paper such as
	 * 				figures, tables, videos, or data sets. Currently, the deposit of components
	 * 				primarily achieves only the first objective as the Crossref system is not setup yet
	 * 				to support queries for components. The metadata associated with a component is
	 * 				intended to enable simple lookup searches of components in the future. When
	 * 				deposited as part of the metadata for a higher level work the parent DOI is
	 * 				implicitly known via the XML hierarchy. When deposited separately the DOI of the
	 * 				higher level work must be provided explicitly (see sa_component) All descriptive
	 * 				elements are optional allowing for the creation of simple anonymous DOIs. The
	 * 				'parent_relation' attribute is mandatory and refers to the DOI described in the
	 * 				component's direct parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(ComponentType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Component()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentType getComponent();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ComponentList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='component_list' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentListType getComponentList();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getComponentList <em>Component List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component List</em>' containment reference.
	 * @see #getComponentList()
	 * @generated
	 */
	void setComponentList(ComponentListType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ComponentNumber()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ComponentNumberType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='component_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComponentNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getComponentNumber <em>Component Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Number</em>' attribute.
	 * @see #getComponentNumber()
	 * @generated
	 */
	void setComponentNumber(String value);

	/**
	 * Returns the value of the '<em><b>Conference</b></em>' containment reference.
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
	 * @return the value of the '<em>Conference</em>' containment reference.
	 * @see #setConference(ConferenceType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Conference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conference' namespace='##targetNamespace'"
	 * @generated
	 */
	ConferenceType getConference();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getConference <em>Conference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference</em>' containment reference.
	 * @see #getConference()
	 * @generated
	 */
	void setConference(ConferenceType value);

	/**
	 * Returns the value of the '<em><b>Conference Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The popularly known as or jargon name (e.g. SIGGRAPH for "Special
	 * 				Interest Group on Computer Graphics"). Authors commonly cite the conference acronym
	 * 				rather than the full conference or proceedings name, so it is best to include this
	 * 				element when it is available. The conference acronym often includes the year of the
	 * 				conference (e.g. SGML '97) or, less often, the conference number. It is preferred,
	 * 				but not required, that submission of metadata exclude number or year information
	 * 				from the conference acronym. It is better to include such information in
	 * 				conference_number, or conference_date, respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Acronym</em>' attribute.
	 * @see #setConferenceAcronym(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ConferenceAcronym()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ConferenceAcronymType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conference_acronym' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceAcronym();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceAcronym <em>Conference Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Acronym</em>' attribute.
	 * @see #getConferenceAcronym()
	 * @generated
	 */
	void setConferenceAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Conference Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The start and end dates of a conference event. conference_date may be
	 * 				used in three ways: 1. If publishers that do not have parsed date values, provide
	 * 				just text with the conference dates. The date text should be taken from the
	 * 				proceedings title page. 2. If publishers have parsed date values, provide them in
	 * 				the attributes. 3. If both parsed date values and the date text are available, both
	 * 				should be provided. This is the preferred tagging for conference_date. For example:
	 * 					
	 *   <conference_date end_day="17" end_month="01" end_year="1997" start_day="15" start_month="01" start_year="1997" xmlns="http://www.crossref.org/schema/4.4.2">Jan. 15-17, 1997</conference_date>
	 *   			
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Date</em>' containment reference.
	 * @see #setConferenceDate(ConferenceDateType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ConferenceDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conference_date' namespace='##targetNamespace'"
	 * @generated
	 */
	ConferenceDateType getConferenceDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceDate <em>Conference Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Date</em>' containment reference.
	 * @see #getConferenceDate()
	 * @generated
	 */
	void setConferenceDate(ConferenceDateType value);

	/**
	 * Returns the value of the '<em><b>Conference Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location of the conference. The city and country of the
	 * 				conference. If the conference is in the United States, the appropriate state should
	 * 				also be provided, and the country may be omitted. If the conference is in Canada,
	 * 				the province should be provided, and the country may be omitted. The specific venue
	 * 				or address within a city (e.g. conference center, hotel, etc.) should not be
	 * 				provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Location</em>' attribute.
	 * @see #setConferenceLocation(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ConferenceLocation()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ConferenceLocationType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conference_location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceLocation();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceLocation <em>Conference Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Location</em>' attribute.
	 * @see #getConferenceLocation()
	 * @generated
	 */
	void setConferenceLocation(String value);

	/**
	 * Returns the value of the '<em><b>Conference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The official name of the conference. conference_name does not include
	 * 				"Proceedings of". For example, "The 23rd Annual Meeting of the American Society for
	 * 				Information Science" is a correct conference name. It is quite common for a
	 * 				conference name to include the conference number or subject. When any of these
	 * 				metadata items appear in the conference name, they should be included in this
	 * 				element, and also in the respective sub-element, conference_number or
	 * 				proceedings_subject. The following example shows incorrect tagging of a conference
	 * 				name and then the corrected version: INCORRECT: 
	 *   <event_metadata xmlns="http://www.crossref.org/schema/4.4.2">
	 *     					
	 *     <conference_name>the second international conference</conference_name>
	 *     					
	 *     <conference_acronym>IEA/AIE '89</conference_acronym>
	 *     					
	 *     <conference_number>1989</conference_number>
	 *     					
	 *     <conference_location>Tullahoma, TN</conference_location>
	 *     					
	 *     <conference_date start_year="1989"/>
	 *     				
	 *   </event_metadata>
	 *   				
	 *   <proceedings_metadata language="en" xmlns="http://www.crossref.org/schema/4.4.2">
	 *     					
	 *     <proceedings_title>Proceedings of the second international conference on
	 * 						Industrial and engineering applications of artificial intelligence and
	 * 						expert systems - IEA/AIE'89</proceedings_title>
	 *     					
	 *     <proceedings_subject>Industrial and engineering applications of artificial
	 * 						intelligence and expert systems</proceedings_subject>
	 *     				
	 *   </proceedings_metadata>
	 *    CORRECT: 
	 *   <event_metadata xmlns="http://www.crossref.org/schema/4.4.2">
	 *     					
	 *     <conference_name>The second international conference on Industrial and
	 * 						engineering applications of artificial intelligence and expert
	 * 						systems</conference_name>
	 *     					
	 *     <conference_acronym>IEA/AIE '89</conference_acronym>
	 *     					
	 *     <conference_number>2</conference_number>
	 *     					
	 *     <conference_location>Tullahoma, TN</conference_location>
	 *     					
	 *     <conference_date start_year="1989"/>
	 *     				
	 *   </event_metadata>
	 *   				
	 *   <proceedings_metadata language="en" xmlns="http://www.crossref.org/schema/4.4.2">
	 *     					
	 *     <proceedings_title>Proceedings of the second international conference on
	 * 						Industrial and engineering applications of artificial intelligence and
	 * 						expert systems - IEA/AIE '89</proceedings_title>
	 *     					
	 *     <proceedings_subject>Industrial and engineering applications of artificial
	 * 						intelligence and expert systems</proceedings_subject>
	 *     				
	 *   </proceedings_metadata>
	 *    Authors commonly cite a conference by the official name, so
	 * 				it is important to provide this information as accurately as
	 * 				possible.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Name</em>' attribute.
	 * @see #setConferenceName(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ConferenceName()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ConferenceNameType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conference_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceName <em>Conference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Name</em>' attribute.
	 * @see #getConferenceName()
	 * @generated
	 */
	void setConferenceName(String value);

	/**
	 * Returns the value of the '<em><b>Conference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The number of a conference. conference_number should include only the
	 * 				number of the conference without any extra text. For example, "The 24th Annual
	 * 				Conference on..." should be tagged as shown in the example above, and "th" should
	 * 				not be included. Roman numerals are acceptable. When a conference is named such that
	 * 				the year of the conference indicates the number (e.g. "SGML 1994"), the year appears
	 * 				in conference_name, conference_date, and conference_number, as in:
	 * 					
	 *   <conference_name xmlns="http://www.crossref.org/schema/4.4.2">SGML 1994</conference_name>
	 *   				
	 *   <conference_acronym xmlns="http://www.crossref.org/schema/4.4.2">SGML</conference_acronym>
	 *   				
	 *   <conference_number xmlns="http://www.crossref.org/schema/4.4.2">1994</conference_number>
	 *   				
	 *   <conference_date end_day="10" end_month="11" end_year="1994" start_day="07" start_month="11" start_year="1994" xmlns="http://www.crossref.org/schema/4.4.2">November 7-10, 1994</conference_date>
	 *   			
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Number</em>' attribute.
	 * @see #setConferenceNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ConferenceNumber()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ConferenceNumberType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conference_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceNumber <em>Conference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Number</em>' attribute.
	 * @see #getConferenceNumber()
	 * @generated
	 */
	void setConferenceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Conference Paper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for all information about a single conference paper. A
	 * 				conference paper is required to have contributors, title and doi_data. All other
	 * 				information is optional. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Paper</em>' containment reference.
	 * @see #setConferencePaper(ConferencePaperType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ConferencePaper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conference_paper' namespace='##targetNamespace'"
	 * @generated
	 */
	ConferencePaperType getConferencePaper();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getConferencePaper <em>Conference Paper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Paper</em>' containment reference.
	 * @see #getConferencePaper()
	 * @generated
	 */
	void setConferencePaper(ConferencePaperType value);

	/**
	 * Returns the value of the '<em><b>Conference Sponsor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sponsoring organization(s) of a conference. Multiple sponsors may
	 * 				be given if a conference is hosted by more than one
	 * 				organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Sponsor</em>' attribute.
	 * @see #setConferenceSponsor(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ConferenceSponsor()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ConferenceSponsorType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conference_sponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceSponsor();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceSponsor <em>Conference Sponsor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Sponsor</em>' attribute.
	 * @see #getConferenceSponsor()
	 * @generated
	 */
	void setConferenceSponsor(String value);

	/**
	 * Returns the value of the '<em><b>Conference Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The theme is the slogan or special emphasis of a conference in a
	 * 				particular year. The theme is the slogan of the conference. It differs from the
	 * 				subject of a conference in that the subject is stable over the years while the theme
	 * 				may vary from year to year. For example, the American Society for Information
	 * 				Science and Technology conference theme was "Knowledge: Creation, Organization and
	 * 				Use" in 1999 and "Defining Information Architecture" in 2000.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Theme</em>' attribute.
	 * @see #setConferenceTheme(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ConferenceTheme()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ConferenceThemeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conference_theme' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceTheme();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceTheme <em>Conference Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Theme</em>' attribute.
	 * @see #getConferenceTheme()
	 * @generated
	 */
	void setConferenceTheme(String value);

	/**
	 * Returns the value of the '<em><b>Content Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date a content item was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Date</em>' containment reference.
	 * @see #setContentDate(ContentDateType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ContentDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='content_date' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentDateType getContentDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getContentDate <em>Content Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Date</em>' containment reference.
	 * @see #getContentDate()
	 * @generated
	 */
	void setContentDate(ContentDateType value);

	/**
	 * Returns the value of the '<em><b>Content Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity in a book, such as a chapter, for which a DOI is being
	 * 				registered. A content item is typically an entity listed on the table of contents.
	 * 				There need not be a one-to-one correlation between content listings and content
	 * 				items (e.g. you may choose not to register front and back matter items listed in the
	 * 				table of contents). The language of a content_item only need be set if it differs
	 * 				from the language of book_metadata. The component_type indicates the type of content
	 * 				item you are registering. Please see the example of a book submission in this
	 * 				documentation for a better understanding of how this attribute may be used in nested
	 * 				tables of contents. level_sequence_number indicates the level of nesting for content
	 * 				items. For example, you may use it to indicate when one content item, such as a
	 * 				chapter, is actually inside another content item, such as a section. Please see the
	 * 				example of a book submission in this documentation for a better understanding of how
	 * 				this attribute may be used in nested tables of contents. Note: Because the Crossref
	 * 				schema uses a flat model to indicate hierarchically nested content items, there is
	 * 				an implicit assumption that content items will be listed in the Crossref submission
	 * 				in the same order in which they appear in the table of contents. Please follow this
	 * 				protocol when submitting DOI data for books. This order is not required for journal
	 * 				and conference data. contributors for a content_item need not be listed if all items
	 * 				in a book have the same contributors listed in book_metadata. In other words,
	 * 				contributors must be listed for edited books, but they should not be listed for each
	 * 				content_item in a monograph. The exception case is when a content item such as a
	 * 				Preface or Forward for a monograph has a different author from that of the
	 * 				monograph. In this case, the contributors should be given. The title of each content
	 * 				item must be submitted. If, however, you are submitted data for a monograph that
	 * 				simply has "Chapter 1", "Chapter 2", etc., you should put this information in
	 * 				component_number, not titles. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Item</em>' containment reference.
	 * @see #setContentItem(ContentItemType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ContentItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='content_item' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentItemType getContentItem();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getContentItem <em>Content Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Item</em>' containment reference.
	 * @see #getContentItem()
	 * @generated
	 */
	void setContentItem(ContentItemType value);

	/**
	 * Returns the value of the '<em><b>Contract Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract number under which a report or paper was
	 * 				written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract Number</em>' attribute.
	 * @see #setContractNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ContractNumber()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ContractNumberType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contract_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContractNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getContractNumber <em>Contract Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Number</em>' attribute.
	 * @see #getContractNumber()
	 * @generated
	 */
	void setContractNumber(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Contributors()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributorsType getContributors();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getContributors <em>Contributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributors</em>' containment reference.
	 * @see #getContributors()
	 * @generated
	 */
	void setContributors(ContributorsType value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date a database or dataset item was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' containment reference.
	 * @see #setCreationDate(CreationDateType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_CreationDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creation_date' namespace='##targetNamespace'"
	 * @generated
	 */
	CreationDateType getCreationDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCreationDate <em>Creation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' containment reference.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(CreationDateType value);

	/**
	 * Returns the value of the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for CrossMark data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crossmark</em>' containment reference.
	 * @see #setCrossmark(CrossmarkType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Crossmark()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='crossmark' namespace='##targetNamespace'"
	 * @generated
	 */
	CrossmarkType getCrossmark();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCrossmark <em>Crossmark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossmark</em>' containment reference.
	 * @see #getCrossmark()
	 * @generated
	 */
	void setCrossmark(CrossmarkType value);

	/**
	 * Returns the value of the '<em><b>Crossmark Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This should be a simple Internet domain name or subdomain name (e.g.
	 * 				www.psychoceramics.org or psychoceramics.org). It is used to identify when a
	 * 				referring URL is coming from a CrossMark domain. A "crossmark_domain" is made up of
	 * 				two subelements; a "domain" and a "filter". The domain is required but the filter is
	 * 				optional and is only needed for use in situations where content from multiple
	 * 				publishers/publications is on the same host with the same domain name (e.g. an
	 * 				aggregator) and one needs to use the referrer's URI "path" to further determine
	 * 				whether the content in a crossmark domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crossmark Domain</em>' containment reference.
	 * @see #setCrossmarkDomain(CrossmarkDomainType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_CrossmarkDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='crossmark_domain' namespace='##targetNamespace'"
	 * @generated
	 */
	CrossmarkDomainType getCrossmarkDomain();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkDomain <em>Crossmark Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossmark Domain</em>' containment reference.
	 * @see #getCrossmarkDomain()
	 * @generated
	 */
	void setCrossmarkDomain(CrossmarkDomainType value);

	/**
	 * Returns the value of the '<em><b>Crossmark Domain Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crossmark Domain Exclusive</em>' attribute.
	 * @see #setCrossmarkDomainExclusive(boolean)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_CrossmarkDomainExclusive()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='crossmark_domain_exclusive' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCrossmarkDomainExclusive();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#isCrossmarkDomainExclusive <em>Crossmark Domain Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossmark Domain Exclusive</em>' attribute.
	 * @see #isCrossmarkDomainExclusive()
	 * @generated
	 */
	void setCrossmarkDomainExclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Crossmark Domains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for crossmark_domain. A list of domains where the
	 * 				publisher maintains updates and corrections to their content. Minimally, one of
	 * 				these should include the Internet domain name of the publisher's web site(s), but
	 * 				the publisher might also decide to include 3rd party aggregators (e.g. Ebsco,
	 * 				IngentaConnect) or archives with which the publisher has agreements to update the
	 * 				content 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crossmark Domains</em>' containment reference.
	 * @see #setCrossmarkDomains(CrossmarkDomainsType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_CrossmarkDomains()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='crossmark_domains' namespace='##targetNamespace'"
	 * @generated
	 */
	CrossmarkDomainsType getCrossmarkDomains();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkDomains <em>Crossmark Domains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossmark Domains</em>' containment reference.
	 * @see #getCrossmarkDomains()
	 * @generated
	 */
	void setCrossmarkDomains(CrossmarkDomainsType value);

	/**
	 * Returns the value of the '<em><b>Crossmark Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A DOI which points to a publisher's CrossMark policy document.
	 * 				Publishers might have different policies for different
	 * 				publications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crossmark Policy</em>' attribute.
	 * @see #setCrossmarkPolicy(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_CrossmarkPolicy()
	 * @model unique="false" dataType="org.crossref.schema._4._4.DoiT" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='crossmark_policy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCrossmarkPolicy();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkPolicy <em>Crossmark Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossmark Policy</em>' attribute.
	 * @see #getCrossmarkPolicy()
	 * @generated
	 */
	void setCrossmarkPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Crossmark Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crossmark Version</em>' attribute.
	 * @see #setCrossmarkVersion(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_CrossmarkVersion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='crossmark_version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCrossmarkVersion();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkVersion <em>Crossmark Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossmark Version</em>' attribute.
	 * @see #getCrossmarkVersion()
	 * @generated
	 */
	void setCrossmarkVersion(String value);

	/**
	 * Returns the value of the '<em><b>Custom Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional element. Publishers are encouraged to provided any
	 * 				non-bibliographical metadata that they feel might help the researcher evaluate and
	 * 				make better use of the content that the Crossmark record refers to. For example,
	 * 				publishers might want to provide funding information, clinical trial numbers,
	 * 				information about the peer-review process or a summary of the publication history of
	 * 				the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Metadata</em>' containment reference.
	 * @see #setCustomMetadata(CustomMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_CustomMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomMetadataType getCustomMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCustomMetadata <em>Custom Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Metadata</em>' containment reference.
	 * @see #getCustomMetadata()
	 * @generated
	 */
	void setCustomMetadata(CustomMetadataType value);

	/**
	 * Returns the value of the '<em><b>CYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Year of publication in citation. Unlike the year element, cYear has a
	 * 				loose text model that can accommodate non-standard years such as year ranges such as
	 * 				"1998-1999". Note that years such as "1998a" or "1999b" should be deposited without
	 * 				the letter, e.g. "1998" or "1999". The letter is used for internal source document
	 * 				linking in name/date (Harvard) style documents rather than external cross reference
	 * 				linking to the original item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CYear</em>' attribute.
	 * @see #setCYear(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_CYear()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cYear' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCYear();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getCYear <em>CYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CYear</em>' attribute.
	 * @see #getCYear()
	 * @generated
	 */
	void setCYear(String value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
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
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(DatabaseType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Database()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseType getDatabase();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Database Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * database_date records key dates in the life of a database or dataset
	 * 				item. Within database_date, creation_date is the date the item was first created,
	 * 				publication_date is the date the item was first published, and update_date is the
	 * 				date the item was last updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database Date</em>' containment reference.
	 * @see #setDatabaseDate(DatabaseDateType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_DatabaseDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database_date' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseDateType getDatabaseDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDatabaseDate <em>Database Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Date</em>' containment reference.
	 * @see #getDatabaseDate()
	 * @generated
	 */
	void setDatabaseDate(DatabaseDateType value);

	/**
	 * Returns the value of the '<em><b>Database Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * database_metadata contains metadata about the database. contributors
	 * 				contains the author(s) of the database. In most cases, it is expected that the
	 * 				organization element will be used rather than person_name element for the primary
	 * 				database authoring information. contributors should not be confused with publisher
	 * 				and institution. In many cases, databases are more likely to have one or both of the
	 * 				latter elements rather than contributors at the top level (dataset elements are more
	 * 				likely to have contributors). In most cases, the institution element may be the best
	 * 				choice to deposit the database host organization because it includes the
	 * 				institution_acronym element along with the name. The titles element is used to
	 * 				capture the name of the database. The description element can be used to capture a
	 * 				fuller description of the nature of the database than might be inferred from the
	 * 				title. database_date should be used to capture the date that a database was first
	 * 				created. Whenever updated records are deposited with Crossref, the update_date
	 * 				should be set to the date of the most recent Crossref deposit. publisher_item may be
	 * 				used to record an identifying number for the database other than the
	 * 				DOI.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database Metadata</em>' containment reference.
	 * @see #setDatabaseMetadata(DatabaseMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_DatabaseMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseMetadataType getDatabaseMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDatabaseMetadata <em>Database Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Metadata</em>' containment reference.
	 * @see #getDatabaseMetadata()
	 * @generated
	 */
	void setDatabaseMetadata(DatabaseMetadataType value);

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dataset is used to capture information about one or more database
	 * 				records or collections. The dataset_type attribute should be set to either "record"
	 * 				or "collection" to indicate the type of deposit. The default value of this attribute
	 * 				is "record". dataset entries are not intended to contain the entire database record
	 * 				or collection. They are only intended to contain the metadata for each database
	 * 				record or collection. The metadata can include: contributors: the author(s) of a
	 * 				database record or collection titles: the title of a database record or collection
	 * 				database_date: the creation date, publication date (if different from the creation
	 * 				date) and the date of last update of the record publisher_item: the record number of
	 * 				the dataset item. In this context, publisher_item can be used for the record number
	 * 				of each item in the database. description: a brief summary description of the
	 * 				contents of the database format: the format type of the dataset item if it includes
	 * 				files rather than just text. Note the format element here should not be used to
	 * 				describe the format of items deposited as part of the component_list doi_data: the
	 * 				doi of the item. citation_list: a list of items (e.g. journal articles) cited by the
	 * 				dataset item. For example, dataset entry from a taxonomy might cite the article in
	 * 				which a species was first identified. component_list: a list of components included
	 * 				in the dataset item such as supporting figures 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference.
	 * @see #setDataset(DatasetType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Dataset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataset' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasetType getDataset();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDataset <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' containment reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(DatasetType value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Day of publication. The should must be expressed with a leading zero
	 * 				if it is less than 10 (e.g. submit "05", not "5").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Day()
	 * @model unique="false" dataType="org.crossref.schema._4._4.XrefDay" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='day' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDay();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The degree(s) awarded for a dissertation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #setDegree(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Degree()
	 * @model unique="false" dataType="org.crossref.schema._4._4.DegreeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='degree' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDegree();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(String value);

	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' containment reference.
	 * @see #setDegrees(DegreesType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Degrees()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='degrees' namespace='##targetNamespace'"
	 * @generated
	 */
	DegreesType getDegrees();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDegrees <em>Degrees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' containment reference.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(DegreesType value);

	/**
	 * Returns the value of the '<em><b>Depositor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the organization submitting DOI metadata to
	 * 				Crossref
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depositor</em>' containment reference.
	 * @see #setDepositor(DepositorType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Depositor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='depositor' namespace='##targetNamespace'"
	 * @generated
	 */
	DepositorType getDepositor();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDepositor <em>Depositor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depositor</em>' containment reference.
	 * @see #getDepositor()
	 * @generated
	 */
	void setDepositor(DepositorType value);

	/**
	 * Returns the value of the '<em><b>Depositor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the organization registering the DOIs. The name placed in
	 * 				this element should match the name under which a depositing organization has
	 * 				registered with Crossref.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depositor Name</em>' attribute.
	 * @see #setDepositorName(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_DepositorName()
	 * @model unique="false" dataType="org.crossref.schema._4._4.DepositorNameType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='depositor_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDepositorName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDepositorName <em>Depositor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depositor Name</em>' attribute.
	 * @see #getDepositorName()
	 * @generated
	 */
	void setDepositorName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A narrative description of a file (e.g. a figure caption or video
	 * 				description) which may be independent of the host document context. The description
	 * 				element may be present more than once to provide alternative language
	 * 				values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Designators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A wrapper for designators or other primary identifiers for a
	 * 				standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designators</em>' containment reference.
	 * @see #setDesignators(DesignatorsType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Designators()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='designators' namespace='##targetNamespace'"
	 * @generated
	 */
	DesignatorsType getDesignators();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDesignators <em>Designators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designators</em>' containment reference.
	 * @see #getDesignators()
	 * @generated
	 */
	void setDesignators(DesignatorsType value);

	/**
	 * Returns the value of the '<em><b>Dissertation</b></em>' containment reference.
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
	 * @return the value of the '<em>Dissertation</em>' containment reference.
	 * @see #setDissertation(DissertationType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Dissertation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dissertation' namespace='##targetNamespace'"
	 * @generated
	 */
	DissertationType getDissertation();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDissertation <em>Dissertation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissertation</em>' containment reference.
	 * @see #getDissertation()
	 * @generated
	 */
	void setDissertation(DissertationType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Doi()
	 * @model unique="false" dataType="org.crossref.schema._4._4.DoiType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDoi();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDoi <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi</em>' attribute.
	 * @see #getDoi()
	 * @generated
	 */
	void setDoi(String value);

	/**
	 * Returns the value of the '<em><b>Doi Batch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top level element for a metadata submission to Crossref. This element
	 * 				indicates the start and end of the XML file. The version number is fixed to the
	 * 				version of the schema. Be sure to set the name space attributes as shown above in
	 * 				order for the Xerces parser to process the instance correctly. For the purposes of
	 * 				parsing, you may also set xsi:schemaLocation to http://www.crossref.org/schema/4.x.x
	 * 				http://www.crossref.org /schema/4.x.x/crossref.xsd. A copy of the schema is located
	 * 				on the Crossref server at this URL and will remain constant for a given version of
	 * 				the schema. This location permits you to have a constant location for the schema for
	 * 				parsing without relying on a hardwired local directory on your development platform.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi Batch</em>' containment reference.
	 * @see #setDoiBatch(DoiBatchType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_DoiBatch()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doi_batch' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiBatchType getDoiBatch();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDoiBatch <em>Doi Batch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Batch</em>' containment reference.
	 * @see #getDoiBatch()
	 * @generated
	 */
	void setDoiBatch(DoiBatchType value);

	/**
	 * Returns the value of the '<em><b>Doi Batch Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Publisher generated ID that uniquely identifies the DOI submission
	 * 				batch. It will be used as a reference in error messages sent by the MDDB, and can be
	 * 				used for submission tracking. The publisher must ensure that this number is unique
	 * 				for every submission to Crossref. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi Batch Id</em>' attribute.
	 * @see #setDoiBatchId(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_DoiBatchId()
	 * @model unique="false" dataType="org.crossref.schema._4._4.DoiBatchIdType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doi_batch_id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDoiBatchId();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDoiBatchId <em>Doi Batch Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Batch Id</em>' attribute.
	 * @see #getDoiBatchId()
	 * @generated
	 */
	void setDoiBatchId(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_DoiData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doi_data' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiDataType getDoiData();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDoiData <em>Doi Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Data</em>' containment reference.
	 * @see #getDoiData()
	 * @generated
	 */
	void setDoiData(DoiDataType value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required element. This should be a simple Internet domain name or
	 * 				subdomain name (e.g. www.psychoceramics.org or psychoceramics.org). It is used to
	 * 				identify when a referring URL is coming from a CrossMark domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Domain()
	 * @model unique="false" dataType="org.crossref.schema._4._4.CmDomain" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_EditionNumber()
	 * @model unique="false" dataType="org.crossref.schema._4._4.EditionNumberType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='edition_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEditionNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getEditionNumber <em>Edition Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition Number</em>' attribute.
	 * @see #getEditionNumber()
	 * @generated
	 */
	void setEditionNumber(String value);

	/**
	 * Returns the value of the '<em><b>Elocation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * article number or other page identifier for an article that does not
	 * 				have page numbers, used typically for electronic-only journals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elocation Id</em>' attribute.
	 * @see #setElocationId(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ElocationId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elocation_id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getElocationId();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getElocationId <em>Elocation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elocation Id</em>' attribute.
	 * @see #getElocationId()
	 * @generated
	 */
	void setElocationId(String value);

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Em</em>' containment reference.
	 * @see #setEm(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Em()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getEm();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getEm <em>Em</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Em</em>' containment reference.
	 * @see #getEm()
	 * @generated
	 */
	void setEm(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e-mail address to which batch success and/or error messages are sent.
	 * 				It is recommended that this address be unique to a position within the organization
	 * 				submitting data (e.g. "doi@...") rather than unique to a person. In this way, the
	 * 				alias for delivery of this mail can be changed as responsibility for submission of
	 * 				DOI data within the organization changes from one person to another.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute.
	 * @see #setEmailAddress(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_EmailAddress()
	 * @model unique="false" dataType="org.crossref.schema._4._4.EmailAddressType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email_address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmailAddress();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(String value);

	/**
	 * Returns the value of the '<em><b>Event Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to a conference event.
	 * 				event_metadata captures information about a conference event. Data about conference
	 * 				proceedings is captured in proceedings_metadata. NOTE: The Crossref system currently
	 * 				uses the proceedings_title and conference_acronym in the query matching process.
	 * 				This system can cause problems when the proceedings have a simple non-changing title
	 * 				(e.g PRoceedings of SPIE) and the conference event name, conference_name, is used to
	 * 				differentiate conference topics (e.g. Optoelectronic Integrated Circuits II). To
	 * 				avoid this problem, Crossref recommends that you make sure the conference_acronym
	 * 				accurately reflects the event name (e.g OpIC II in this
	 * 				example).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Metadata</em>' containment reference.
	 * @see #setEventMetadata(EventMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_EventMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	EventMetadataType getEventMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getEventMetadata <em>Event Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Metadata</em>' containment reference.
	 * @see #getEventMetadata()
	 * @generated
	 */
	void setEventMetadata(EventMetadataType value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional element. The filter element is used to disambiguate content
	 * 				in situations where multiple publishers share the same host (e.g. when on an
	 * 				aggregated platform). It should contain a substring of the path that can be used to
	 * 				uniquely identify a publisher's or publication's content. For instance, using the
	 * 				string "alpsp" here would help the CrossMark system distinguish between ALPSP
	 * 				publications on the ingentaconnect host and other publications on the same
	 * 				host.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Filter()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

	/**
	 * Returns the value of the '<em><b>First Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First page number where an entity is located. Data may be alpha,
	 * 				numeric or a combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Page</em>' attribute.
	 * @see #setFirstPage(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_FirstPage()
	 * @model unique="false" dataType="org.crossref.schema._4._4.FirstPageType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='first_page' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstPage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getFirstPage <em>First Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page</em>' attribute.
	 * @see #getFirstPage()
	 * @generated
	 */
	void setFirstPage(String value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Font()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getFont();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A narrative description of a component's file format and/or the file
	 * 				extension (for mime types refer to http://www.iana.org/assignments/media-types/) The
	 * 				format element may contain only the mime_type attribute, or in addition it may
	 * 				contain a narrative description of the file format. Be sure to use the narrative
	 * 				portion to description only the format of the component and not the actual content
	 * 				of the component (use description to describe the component's
	 * 				content).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(FormatType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Format()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatType value);

	/**
	 * Returns the value of the '<em><b>Full Title</b></em>' attribute.
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
	 * @return the value of the '<em>Full Title</em>' attribute.
	 * @see #setFullTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_FullTitle()
	 * @model unique="false" dataType="org.crossref.schema._4._4.FullTitleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='full_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFullTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getFullTitle <em>Full Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Title</em>' attribute.
	 * @see #getFullTitle()
	 * @generated
	 */
	void setFullTitle(String value);

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A contributor's given name. The given_name, combined with surname,
	 * 				forms the name of an author or editor. given_name may be submitted as either
	 * 				initials or a full name. Do not place given_name within the surname unless it is
	 * 				unclear how to distinguish the given name from the surname, as may be the case in
	 * 				non-Western names. Do not include titles such as "Dr.", "Prof.", or "President" in
	 * 				given_name. These titles should not be submitted to Crossref.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #setGivenName(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_GivenName()
	 * @model unique="false" dataType="org.crossref.schema._4._4.GivenNameType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='given_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Returns the value of the '<em><b>Group Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prepublication content items may be organzed into groupings within a
	 * 				given publisher. This element provides for naming the group. It is expected that
	 * 				publishers will have a small number of groups each of which reflect a topic or
	 * 				subject area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Title</em>' attribute.
	 * @see #setGroupTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_GroupTitle()
	 * @model unique="false" dataType="org.crossref.schema._4._4.GroupTitleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getGroupTitle <em>Group Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Title</em>' attribute.
	 * @see #getGroupTitle()
	 * @generated
	 */
	void setGroupTitle(String value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for information related to the DOI batch submission.
	 * 				This element uniquely identifies the batch deposit to Crossref and contains
	 * 				information that will be used as a reference in error messages sent by the MDDB.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(HeadType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Head()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='head' namespace='##targetNamespace'"
	 * @generated
	 */
	HeadType getHead();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(HeadType value);

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference.
	 * @see #setI(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_I()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getI();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getI <em>I</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I</em>' containment reference.
	 * @see #getI()
	 * @generated
	 */
	void setI(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A public standard identifier that can be used to uniquely identify
	 * 				the entity being registered. This identifier is a publisher-assigned number that
	 * 				uniquely identifies the entity being registered. This element should be used for
	 * 				identifiers based on public standards. Use item_number for a publisher identifier
	 * 				that is based on a publisher's internal systems rather than on a public standard.
	 * 				The supported standards are: PII - Publisher Item Identifier SICI - Serial Item and
	 * 				Contribution Identifier DOI - Digital Object Identifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(IdentifierType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Identifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierType getIdentifier();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(IdentifierType value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' containment reference.
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
	 * @return the value of the '<em>Institution</em>' containment reference.
	 * @see #setInstitution(InstitutionType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Institution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution' namespace='##targetNamespace'"
	 * @generated
	 */
	InstitutionType getInstitution();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getInstitution <em>Institution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' containment reference.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(InstitutionType value);

	/**
	 * Returns the value of the '<em><b>Institution Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The acronym of the institution. Note that authors often cite with
	 * 				acronyms and this information can be important in matching a query Examples: WHO,
	 * 				UCDavis, UCD Note: as shown above, an institution may be know by multiple acronyms,
	 * 				in which case all common acronyms should be deposited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Acronym</em>' attribute.
	 * @see #setInstitutionAcronym(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_InstitutionAcronym()
	 * @model unique="false" dataType="org.crossref.schema._4._4.InstitutionAcronymType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution_acronym' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstitutionAcronym();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionAcronym <em>Institution Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution Acronym</em>' attribute.
	 * @see #getInstitutionAcronym()
	 * @generated
	 */
	void setInstitutionAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Institution Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The department within an institution. institution_department gives
	 * 				the department within an institution. A common use is the department under which a
	 * 				dissertation was completed. Note that the institution_department is repeatable. If
	 * 				multiple departments are to be deposited, each one should be given in a unique
	 * 				institution_department element. Example: Department of Psychology
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Department</em>' attribute.
	 * @see #setInstitutionDepartment(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_InstitutionDepartment()
	 * @model unique="false" dataType="org.crossref.schema._4._4.InstitutionDepartmentType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution_department' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstitutionDepartment();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionDepartment <em>Institution Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution Department</em>' attribute.
	 * @see #getInstitutionDepartment()
	 * @generated
	 */
	void setInstitutionDepartment(String value);

	/**
	 * Returns the value of the '<em><b>Institution Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full name of an institution. Examples are: World Health
	 * 				Organization; University of California, Davis. Corresponding institution_acronym
	 * 				content for these organizations would be WHO and UCD,
	 * 				respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Name</em>' attribute.
	 * @see #setInstitutionName(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_InstitutionName()
	 * @model unique="false" dataType="org.crossref.schema._4._4.InstitutionNameType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstitutionName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionName <em>Institution Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution Name</em>' attribute.
	 * @see #getInstitutionName()
	 * @generated
	 */
	void setInstitutionName(String value);

	/**
	 * Returns the value of the '<em><b>Institution Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primary city location of the institution. institution_place gives
	 * 				the primary city location of the institution. When the location is a major city
	 * 				(e.g. New York, Amsterdam), no qualifying country or U.S. state need be given. If
	 * 				the city is not a major city, the appropriate country and/or state or province
	 * 				should be added.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Place</em>' attribute.
	 * @see #setInstitutionPlace(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_InstitutionPlace()
	 * @model unique="false" dataType="org.crossref.schema._4._4.InstitutionPlaceType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution_place' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstitutionPlace();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionPlace <em>Institution Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution Place</em>' attribute.
	 * @see #getInstitutionPlace()
	 * @generated
	 */
	void setInstitutionPlace(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_IntentStatement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intent_statement' namespace='##targetNamespace'"
	 * @generated
	 */
	IntentStatementType getIntentStatement();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getIntentStatement <em>Intent Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent Statement</em>' containment reference.
	 * @see #getIntentStatement()
	 * @generated
	 */
	void setIntentStatement(IntentStatementType value);

	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' containment reference.
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
	 * @return the value of the '<em>Isbn</em>' containment reference.
	 * @see #setIsbn(IsbnType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Isbn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isbn' namespace='##targetNamespace'"
	 * @generated
	 */
	IsbnType getIsbn();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getIsbn <em>Isbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isbn</em>' containment reference.
	 * @see #getIsbn()
	 * @generated
	 */
	void setIsbn(IsbnType value);

	/**
	 * Returns the value of the '<em><b>Issn</b></em>' containment reference.
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
	 * @return the value of the '<em>Issn</em>' containment reference.
	 * @see #setIssn(IssnType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Issn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issn' namespace='##targetNamespace'"
	 * @generated
	 */
	IssnType getIssn();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getIssn <em>Issn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issn</em>' containment reference.
	 * @see #getIssn()
	 * @generated
	 */
	void setIssn(IssnType value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The issue number in which an article is published. Only one issue
	 * 				name should be used for the issue. The issue number takes precedence over any other
	 * 				name. For example, if an issue has only a seasonal name, then the season should be
	 * 				listed in issue. However, if an issue has a number and a season, then only the
	 * 				number should be listed in issue, and the season should be placed in month (see the
	 * 				table in month, below, for proper encoding of the season) if the specific month of
	 * 				publication is not known. Do not include the words "issue", "No" or "number" in this
	 * 				element. When submitting DOIs for journal articles published online ahead of print,
	 * 				you should submit the issue number, when known, even if the pagination information
	 * 				for the entity is not yet known. Data may be alpha, numeric or a combination.
	 * 				Examples: 74(3):1999 
	 *   <journal_issue>
	 *     					
	 *     <publication_date media_type="print">
	 *       						
	 *       <year>1999</year>
	 *       					
	 *     </publication_date>
	 *     					
	 *     <journal_volume>
	 *       						
	 *       <volume>74</volume>
	 *       					
	 *     </journal_volume>
	 *     					
	 *     <issue>3</issue>
	 *     				
	 *   </journal_issue>
	 *    Volume 74, Spring 1999 
	 *   <journal_issue>
	 *     					
	 *     <publication_date media_type="print">
	 *       						
	 *       <year>1999</year>
	 *       					
	 *     </publication_date>
	 *     					
	 *     <journal_volume>
	 *       						
	 *       <volume>74</volume>
	 *       					
	 *     </journal_volume>
	 *     					
	 *     <issue>Spring</issue>
	 *     				
	 *   </journal_issue>
	 *    Volume 74, issue 3 Spring 1999 
	 *   <journal_issue>
	 *     					
	 *     <publication_date media_type="print">
	 *       						
	 *       <month>21</month>
	 *       						
	 *       <year>1999</year>
	 *       					
	 *     </publication_date>
	 *     					
	 *     <journal_volume>
	 *       						
	 *       <volume>74</volume>
	 *       					
	 *     </journal_volume>
	 *     					
	 *     <issue>3</issue>
	 *     				
	 *   </journal_issue>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue</em>' attribute.
	 * @see #setIssue(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Issue()
	 * @model unique="false" dataType="org.crossref.schema._4._4.IssueType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIssue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container used to associate a collection, doi, or resource (URI)
	 * 				with zero or more property elements. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(ItemType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Item()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemType getItem();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(ItemType value);

	/**
	 * Returns the value of the '<em><b>Item Number</b></em>' containment reference.
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
	 * @return the value of the '<em>Item Number</em>' containment reference.
	 * @see #setItemNumber(ItemNumberType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ItemNumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='item_number' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemNumberType getItemNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getItemNumber <em>Item Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Number</em>' containment reference.
	 * @see #getItemNumber()
	 * @generated
	 */
	void setItemNumber(ItemNumberType value);

	/**
	 * Returns the value of the '<em><b>Journal</b></em>' containment reference.
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
	 * @return the value of the '<em>Journal</em>' containment reference.
	 * @see #setJournal(JournalType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Journal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalType getJournal();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getJournal <em>Journal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal</em>' containment reference.
	 * @see #getJournal()
	 * @generated
	 */
	void setJournal(JournalType value);

	/**
	 * Returns the value of the '<em><b>Journal Article</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for all information about a single journal article. A
	 * 				journal article is required to have title and doi_data. All other information is
	 * 				optional. When registering items that do not have titles, use the appropriate
	 * 				heading from the journal section or table of contents (e.g. "Errata") in title.
	 * 				journal_article allows for multiple titles per entity. In some cases it may be
	 * 				helpful to submit multiple titles. For example, if an erratum carries title of the
	 * 				original article a nd the heading "Errata", both should be submitted by using two
	 * 				titles elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Article</em>' containment reference.
	 * @see #setJournalArticle(JournalArticleType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_JournalArticle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal_article' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalArticleType getJournalArticle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getJournalArticle <em>Journal Article</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Article</em>' containment reference.
	 * @see #getJournalArticle()
	 * @generated
	 */
	void setJournalArticle(JournalArticleType value);

	/**
	 * Returns the value of the '<em><b>Journal Issue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for metadata that defines a single issue of a journal.
	 * 				Special issue numbering information for a journal should be placed in
	 * 				special_numbering. You may register a DOI for an entire issue by including doi_data
	 * 				in journal_issue. The URI should resolve to the table of contents for the issue.
	 * 				contributors is included in journal_issue to allow inclusion of editors of special
	 * 				issues. This element allows linking from a reference such as: R.Glaser, L.Bond
	 * 				(Eds.), Testing: concepts and research, American Psychologist 36 (10-12) (1981)
	 * 				(special issue). You should not include contributors for the regular editors of
	 * 				regular issues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Issue</em>' containment reference.
	 * @see #setJournalIssue(JournalIssueType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_JournalIssue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal_issue' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalIssueType getJournalIssue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getJournalIssue <em>Journal Issue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Issue</em>' containment reference.
	 * @see #getJournalIssue()
	 * @generated
	 */
	void setJournalIssue(JournalIssueType value);

	/**
	 * Returns the value of the '<em><b>Journal Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for metadata that defines a
	 * 				journal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Metadata</em>' containment reference.
	 * @see #setJournalMetadata(JournalMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_JournalMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalMetadataType getJournalMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getJournalMetadata <em>Journal Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Metadata</em>' containment reference.
	 * @see #getJournalMetadata()
	 * @generated
	 */
	void setJournalMetadata(JournalMetadataType value);

	/**
	 * Returns the value of the '<em><b>Journal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   Journal title in a citation. Only used in the citation element.
	 * 				Journal title in citation deposits is used for both abbreviated and spelled out
	 * 				journal names. No attribute is required to distinguish between name types. Both
	 * 					
	 *   <journal_title>Proc. Natl. Acad. Sci. U.S.A.</journal_title>
	 *    and
	 * 					
	 *   <journal_title>Proceedings of the National Academy of Sciences of the United
	 * 					States of America</journal_title>
	 *    are valid journal titles to use in this
	 * 				element.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Title</em>' attribute.
	 * @see #setJournalTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_JournalTitle()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJournalTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getJournalTitle <em>Journal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Title</em>' attribute.
	 * @see #getJournalTitle()
	 * @generated
	 */
	void setJournalTitle(String value);

	/**
	 * Returns the value of the '<em><b>Journal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for the journal volume and DOI assigned to an entire
	 * 				journal volume. You may register a DOI for an entire volume by including doi_data in
	 * 				journal_volume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Volume</em>' containment reference.
	 * @see #setJournalVolume(JournalVolumeType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_JournalVolume()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal_volume' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalVolumeType getJournalVolume();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getJournalVolume <em>Journal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Volume</em>' containment reference.
	 * @see #getJournalVolume()
	 * @generated
	 */
	void setJournalVolume(JournalVolumeType value);

	/**
	 * Returns the value of the '<em><b>Last Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The last page number of an entity. last_page should not be used when
	 * 				the last page number is the same as the first page number (i.e. when the entire
	 * 				entity fits on one page). Do not include punctuation for a page range in last_page.
	 * 				If the entity has non-contiguous paging, use last_page for the last page of the
	 * 				first range and place all other page information into other_pages. Data may be
	 * 				alpha, numeric or a combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Page</em>' attribute.
	 * @see #setLastPage(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_LastPage()
	 * @model unique="false" dataType="org.crossref.schema._4._4.LastPageType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='last_page' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLastPage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getLastPage <em>Last Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page</em>' attribute.
	 * @see #getLastPage()
	 * @generated
	 */
	void setLastPage(String value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Month of publication. The month must be expressed in numeric format
	 * 				rather spelling out the name (e.g.. submit "10", not "October"). The month must be
	 * 				expressed with a leading zero if it is less than 10 (e.g. submit "05", not "5").
	 * 				When a journal issue has both an issue number and a season, the issue number should
	 * 				be placed in issue. If the month of publication is not known, the season should be
	 * 				placed in month as a two-digit value as follows: Season Value Spring 21 Summer 22
	 * 				Autumn 23 Winter 24 First Quarter 31 Second Quarter 32 Third Quarter 33 Fourth
	 * 				Quarter 34 In cases when an issue covers multiple months, e.g. "March-April",
	 * 				include only the digits for the first month of the range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Month()
	 * @model unique="false" dataType="org.crossref.schema._4._4.XrefMonth" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMonth();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType1)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Name()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType1 getName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType1 value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Noisbn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='noisbn' namespace='##targetNamespace'"
	 * @generated
	 */
	NoisbnType getNoisbn();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getNoisbn <em>Noisbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noisbn</em>' containment reference.
	 * @see #getNoisbn()
	 * @generated
	 */
	void setNoisbn(NoisbnType value);

	/**
	 * Returns the value of the '<em><b>ORCID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ORCID for an author. The schema performs basic pattern
	 * 				validation, checksum validation is performed upon deposit via a system
	 * 				check.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ORCID</em>' containment reference.
	 * @see #setORCID(ORCIDType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ORCID()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ORCID' namespace='##targetNamespace'"
	 * @generated
	 */
	ORCIDType getORCID();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getORCID <em>ORCID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ORCID</em>' containment reference.
	 * @see #getORCID()
	 * @generated
	 */
	void setORCID(ORCIDType value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an organization (as opposed to a person) that contributed
	 * 				to authoring an entity. If multiple organizations authored an entity, each one
	 * 				should be captured in a unique organization element. If an entity was authored by
	 * 				individuals in addition to one or more organizations, person_name and organization
	 * 				may be freely intermixed within contributors. contributor_role should be set, as
	 * 				appropriate, to author or editor. When a contributor translated a work, set
	 * 				contributor_role to "translator". "chair" should only be used for conference
	 * 				proceedings to indicate a conference chair.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(OrganizationType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Organization()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationType getOrganization();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationType value);

	/**
	 * Returns the value of the '<em><b>Original Language Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of an entity in its original language if the registration
	 * 				is for a translation of a work. When providing the original language of a title, you
	 * 				should set the language attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Language Title</em>' containment reference.
	 * @see #setOriginalLanguageTitle(OriginalLanguageTitleType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_OriginalLanguageTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='original_language_title' namespace='##targetNamespace'"
	 * @generated
	 */
	OriginalLanguageTitleType getOriginalLanguageTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getOriginalLanguageTitle <em>Original Language Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Language Title</em>' containment reference.
	 * @see #getOriginalLanguageTitle()
	 * @generated
	 */
	void setOriginalLanguageTitle(OriginalLanguageTitleType value);

	/**
	 * Returns the value of the '<em><b>Other Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to capture additional page information when items do not
	 * 				encompass contiguous page ranges. When an entity has non-contiguous page
	 * 				information, you should capture the first page range in first_page and last_page.
	 * 				Any additional page information should be captured in other_pages. You should
	 * 				include commas or hyphens to express discrete pages or page ranges. endash entities
	 * 				should be converted to ASCII hyphens. Spaces should not be included. Note that
	 * 				punctuation should never appear in first_page and last_page. Data may be alpha,
	 * 				numeric or a combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Pages</em>' attribute.
	 * @see #setOtherPages(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_OtherPages()
	 * @model unique="false" dataType="org.crossref.schema._4._4.OtherPagesType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='other_pages' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOtherPages();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getOtherPages <em>Other Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Pages</em>' attribute.
	 * @see #getOtherPages()
	 * @generated
	 */
	void setOtherPages(String value);

	/**
	 * Returns the value of the '<em><b>Ovl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ovl</em>' containment reference.
	 * @see #setOvl(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Ovl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ovl' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getOvl();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getOvl <em>Ovl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ovl</em>' containment reference.
	 * @see #getOvl()
	 * @generated
	 */
	void setOvl(XrefFaces value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Pages()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pages' namespace='##targetNamespace'"
	 * @generated
	 */
	PagesType getPages();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPages <em>Pages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' containment reference.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(PagesType value);

	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The part number of a given volume. Deposited within
	 * 				book_set_metadata. In some cases, a book set will have multiple parts, and then one
	 * 				or more volumes within each part. The part number of a given volume should be
	 * 				deposited in this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Number</em>' attribute.
	 * @see #setPartNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_PartNumber()
	 * @model unique="false" dataType="org.crossref.schema._4._4.PartNumberType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='part_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPartNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPartNumber <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' attribute.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>Peer Review</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The peer_review content type is intended for assigning DOIs to the
	 * 				reports and other artifacts associated with the review of published content.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Review</em>' containment reference.
	 * @see #setPeerReview(PeerReviewType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_PeerReview()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='peer_review' namespace='##targetNamespace'"
	 * @generated
	 */
	PeerReviewType getPeerReview();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPeerReview <em>Peer Review</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer Review</em>' containment reference.
	 * @see #getPeerReview()
	 * @generated
	 */
	void setPeerReview(PeerReviewType value);

	/**
	 * Returns the value of the '<em><b>Pending Publication</b></em>' containment reference.
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
	 * @return the value of the '<em>Pending Publication</em>' containment reference.
	 * @see #setPendingPublication(PendingPublicationType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_PendingPublication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pending_publication' namespace='##targetNamespace'"
	 * @generated
	 */
	PendingPublicationType getPendingPublication();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPendingPublication <em>Pending Publication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending Publication</em>' containment reference.
	 * @see #getPendingPublication()
	 * @generated
	 */
	void setPendingPublication(PendingPublicationType value);

	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a person (as opposed to an organization) that contributed
	 * 				to authoring an entity. Authors with name suffixes should have the suffix captured
	 * 				in suffix, not in surname. Author prefixes such as "Dr.", "Prof.", or "President"
	 * 				should not be included in person_name or any other element. Author degrees (e.g.
	 * 				M.D., Ph.D.) also should not be included in Crossref submissions. contributor_role
	 * 				should be set, as appropriate, to author or editor. When a contributor translated a
	 * 				work, set contributor_role to "translator". "chair" should only be used for
	 * 				conference proceedings to indicate a conference chair.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name</em>' containment reference.
	 * @see #setPersonName(PersonNameType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_PersonName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person_name' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonNameType getPersonName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPersonName <em>Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name</em>' containment reference.
	 * @see #getPersonName()
	 * @generated
	 */
	void setPersonName(PersonNameType value);

	/**
	 * Returns the value of the '<em><b>Posted Content</b></em>' containment reference.
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
	 * @return the value of the '<em>Posted Content</em>' containment reference.
	 * @see #setPostedContent(PostedContentType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_PostedContent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='posted_content' namespace='##targetNamespace'"
	 * @generated
	 */
	PostedContentType getPostedContent();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPostedContent <em>Posted Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Content</em>' containment reference.
	 * @see #getPostedContent()
	 * @generated
	 */
	void setPostedContent(PostedContentType value);

	/**
	 * Returns the value of the '<em><b>Posted Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date a pre-print was posted to a repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Posted Date</em>' containment reference.
	 * @see #setPostedDate(PostedDateType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_PostedDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='posted_date' namespace='##targetNamespace'"
	 * @generated
	 */
	PostedDateType getPostedDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPostedDate <em>Posted Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Date</em>' containment reference.
	 * @see #getPostedDate()
	 * @generated
	 */
	void setPostedDate(PostedDateType value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(PrefixType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Prefix()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	PrefixType getPrefix();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(PrefixType value);

	/**
	 * Returns the value of the '<em><b>Proceedings Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to a non-series
	 * 				conference proceeding. proceedings_metadata captures information about conference
	 * 				proceedings. Data about conference events is captured in
	 * 				event_metadata
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proceedings Metadata</em>' containment reference.
	 * @see #setProceedingsMetadata(ProceedingsMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ProceedingsMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='proceedings_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ProceedingsMetadataType getProceedingsMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsMetadata <em>Proceedings Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proceedings Metadata</em>' containment reference.
	 * @see #getProceedingsMetadata()
	 * @generated
	 */
	void setProceedingsMetadata(ProceedingsMetadataType value);

	/**
	 * Returns the value of the '<em><b>Proceedings Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to a specific conference
	 * 				proceeding that is part of a series. A conference proceedings published as a series
	 * 				can sometimes look just like a journnal in that there is no volume information (no
	 * 				volume title, no ISBN). In these cases the conference proceeding may be deposited as
	 * 				a journal (which more accurately should have been called a 'series_publication'). To
	 * 				allow for the use of a consistent XML heirarchy we will allow a
	 * 				proceedings_series_metadata root element to also describe such a publication. Note:
	 * 				this structure is organized to allow backward compatibility with previous schema
	 * 				versions by maintaining the prior sequence of elements. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proceedings Series Metadata</em>' containment reference.
	 * @see #setProceedingsSeriesMetadata(ProceedingsSeriesMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ProceedingsSeriesMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='proceedings_series_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ProceedingsSeriesMetadataType getProceedingsSeriesMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsSeriesMetadata <em>Proceedings Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proceedings Series Metadata</em>' containment reference.
	 * @see #getProceedingsSeriesMetadata()
	 * @generated
	 */
	void setProceedingsSeriesMetadata(ProceedingsSeriesMetadataType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ProceedingsSubject()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ProceedingsSubjectType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='proceedings_subject' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProceedingsSubject();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsSubject <em>Proceedings Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proceedings Subject</em>' attribute.
	 * @see #getProceedingsSubject()
	 * @generated
	 */
	void setProceedingsSubject(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ProceedingsTitle()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ProceedingsTitleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='proceedings_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProceedingsTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsTitle <em>Proceedings Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proceedings Title</em>' attribute.
	 * @see #getProceedingsTitle()
	 * @generated
	 */
	void setProceedingsTitle(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * property elements qualify the semantic meaning of a item or
	 * 				collection. property elements consist of a type/value pair where the property type
	 * 				is found in the type attribute and the value is found in the element content. The
	 * 				property element is not currently in use. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Property()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyType getProperty();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Publication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publication' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationType getPublication();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPublication <em>Publication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication</em>' containment reference.
	 * @see #getPublication()
	 * @generated
	 */
	void setPublication(PublicationType value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of publication. In all cases, multiple dates are allowed to
	 * 				allow for different dates of publication for online and print versions. This element
	 * 				was previously called date, but was renamed publication_date to distinguish more
	 * 				clearly from conference_date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Date</em>' containment reference.
	 * @see #setPublicationDate(PublicationDateType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_PublicationDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publication_date' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationDateType getPublicationDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPublicationDate <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' containment reference.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(PublicationDateType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Publisher()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherType getPublisher();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_PublisherItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher_item' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherItemType getPublisherItem();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPublisherItem <em>Publisher Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Item</em>' containment reference.
	 * @see #getPublisherItem()
	 * @generated
	 */
	void setPublisherItem(PublisherItemType value);

	/**
	 * Returns the value of the '<em><b>Publisher Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the publisher of a book or conference proceedings.
	 * 				publisher_name is the imprint of the publication (what the author will likely cite),
	 * 				not the organization registering the DOI, if for any reason they are different. When
	 * 				registering a translation, the translation publisher, not the original publisher,
	 * 				should be given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Name</em>' attribute.
	 * @see #setPublisherName(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_PublisherName()
	 * @model unique="false" dataType="org.crossref.schema._4._4.PublisherNameType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublisherName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPublisherName <em>Publisher Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Name</em>' attribute.
	 * @see #getPublisherName()
	 * @generated
	 */
	void setPublisherName(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The city where the publisher of this work is located. publisher_place
	 * 				gives the primary city location of the publisher. When the location is a major city
	 * 				(e.g. New York, Amsterdam), no qualifying country, U.S. state, or Canadian province
	 * 				need be given. If the city is not a major city, the appropriate country, U.S. state,
	 * 				or Canadian province should be added.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Place</em>' attribute.
	 * @see #setPublisherPlace(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_PublisherPlace()
	 * @model unique="false" dataType="org.crossref.schema._4._4.PublisherPlaceType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher_place' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublisherPlace();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getPublisherPlace <em>Publisher Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Place</em>' attribute.
	 * @see #getPublisherPlace()
	 * @generated
	 */
	void setPublisherPlace(String value);

	/**
	 * Returns the value of the '<em><b>Registrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that owns the information being registered.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registrant</em>' attribute.
	 * @see #setRegistrant(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Registrant()
	 * @model unique="false" dataType="org.crossref.schema._4._4.RegistrantType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='registrant' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegistrant();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getRegistrant <em>Registrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registrant</em>' attribute.
	 * @see #getRegistrant()
	 * @generated
	 */
	void setRegistrant(String value);

	/**
	 * Returns the value of the '<em><b>Report Paper</b></em>' containment reference.
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
	 * @return the value of the '<em>Report Paper</em>' containment reference.
	 * @see #setReportPaper(ReportPaperType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ReportPaper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='report-paper' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportPaperType getReportPaper();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getReportPaper <em>Report Paper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Paper</em>' containment reference.
	 * @see #getReportPaper()
	 * @generated
	 */
	void setReportPaper(ReportPaperType value);

	/**
	 * Returns the value of the '<em><b>Report Paper Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * report-paper_metadata is used as a wrapper for the metadata related
	 * 				to a Technical Report or Working Paper. report-paper_metadata is almost identical to
	 * 				book_metadata. It differs only in that report-paper_metadata removes the volume
	 * 				number and adds the elements institution and contract_number. Please see the
	 * 				comments for book_metadata about the usage of most elements in report-
	 * 				paper_metadata. Reports and Working Papers are often sponsored by either
	 * 				universities or by a non-academic organization (corporate or government). Such
	 * 				institutions are not typically considered "publishers" and so the item may be
	 * 				deposited using the institution element. Multiple element instances are permitted so
	 * 				the sponsoring institution and publishing institution can both be deposited as
	 * 				authors may cite either. If the report number of an item follows Z39.23, the number
	 * 				should be deposited in the identifier element with the id_type attribute set to
	 * 				"Z39.23". If a report number uses its own numbering system, it should be deposited
	 * 				in item_number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Paper Metadata</em>' containment reference.
	 * @see #setReportPaperMetadata(ReportPaperMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ReportPaperMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='report-paper_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportPaperMetadataType getReportPaperMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getReportPaperMetadata <em>Report Paper Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Paper Metadata</em>' containment reference.
	 * @see #getReportPaperMetadata()
	 * @generated
	 */
	void setReportPaperMetadata(ReportPaperMetadataType value);

	/**
	 * Returns the value of the '<em><b>Report Paper Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * report-paper_series_metadata is used as a wrapper for the metadata
	 * 				related to a Technical Report or Working Paper that is part of a series.
	 * 				report-paper_series_metadata is almost identical to book_series_metadata. It differs
	 * 				only in that report-paper_metadata removes the volume number and adds the elements
	 * 				institution and contract_number. Please see the comments for book_series_metadata
	 * 				about the usage of most elements in report- paper_series_metadata. Reports and
	 * 				Working Papers are often sponsored by either universities or by a non-academic
	 * 				organization (corporate or government). Such institutions are not typically
	 * 				considered "publishers" and so the item may be deposited using the institution
	 * 				element. Multiple element instances are permitted so the sponsoring institution and
	 * 				publishing institution can both be deposited as authors may cite either. If the
	 * 				report number of an item follows Z39.23, the number should be deposited in the
	 * 				identifier element with the id_type attribute set to "Z39.23". If a report number
	 * 				uses its own numbering system, it should be deposited in
	 * 				item_number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Paper Series Metadata</em>' containment reference.
	 * @see #setReportPaperSeriesMetadata(ReportPaperSeriesMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ReportPaperSeriesMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='report-paper_series_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportPaperSeriesMetadataType getReportPaperSeriesMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getReportPaperSeriesMetadata <em>Report Paper Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Paper Series Metadata</em>' containment reference.
	 * @see #getReportPaperSeriesMetadata()
	 * @generated
	 */
	void setReportPaperSeriesMetadata(ReportPaperSeriesMetadataType value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element that contains a URI associated with a DOI. URLs are
	 * 				referred to as resources in the 2.0 Crossref schema because they can be any valid
	 * 				URI. Cases of single-resolution (i.e. one DOI with a single corresponding URI)
	 * 				should be tagged with a doi/resource pair in doi_data. Only one resource is allowed
	 * 				per doi_data, the exception being resource elements within a collection element.
	 * 				Values for the "content_version" attribute are vor (version of record) and am
	 * 				(advance manuscript). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(ResourceType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Resource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceType getResource();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date a review was published to a repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Review Date</em>' containment reference.
	 * @see #setReviewDate(ReviewDateType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ReviewDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='review_date' namespace='##targetNamespace'"
	 * @generated
	 */
	ReviewDateType getReviewDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getReviewDate <em>Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Date</em>' containment reference.
	 * @see #getReviewDate()
	 * @generated
	 */
	void setReviewDate(ReviewDateType value);

	/**
	 * Returns the value of the '<em><b>Running Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Running numbers to specify the various reports (ex: RC1 to RC4)
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Running Number</em>' attribute.
	 * @see #setRunningNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_RunningNumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='running_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRunningNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getRunningNumber <em>Running Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Number</em>' attribute.
	 * @see #getRunningNumber()
	 * @generated
	 */
	void setRunningNumber(String value);

	/**
	 * Returns the value of the '<em><b>Sa Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element for depositing a stand alone component. The parent DOI
	 * 				must already exist (created in an earlier deposit or via some other registration
	 * 				process).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sa Component</em>' containment reference.
	 * @see #setSaComponent(SaComponentType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_SaComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sa_component' namespace='##targetNamespace'"
	 * @generated
	 */
	SaComponentType getSaComponent();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSaComponent <em>Sa Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sa Component</em>' containment reference.
	 * @see #getSaComponent()
	 * @generated
	 */
	void setSaComponent(SaComponentType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ScnPolicies()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scn_policies' namespace='##targetNamespace'"
	 * @generated
	 */
	ScnPoliciesType getScnPolicies();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getScnPolicies <em>Scn Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scn Policies</em>' containment reference.
	 * @see #getScnPolicies()
	 * @generated
	 */
	void setScnPolicies(ScnPoliciesType value);

	/**
	 * Returns the value of the '<em><b>Scn Policy Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual SCN policy
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scn Policy Ref</em>' containment reference.
	 * @see #setScnPolicyRef(ScnPolicyRefType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ScnPolicyRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scn_policy_ref' namespace='##targetNamespace'"
	 * @generated
	 */
	ScnPolicyRefType getScnPolicyRef();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getScnPolicyRef <em>Scn Policy Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scn Policy Ref</em>' containment reference.
	 * @see #getScnPolicyRef()
	 * @generated
	 */
	void setScnPolicyRef(ScnPolicyRefType value);

	/**
	 * Returns the value of the '<em><b>Scn Policy Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A group of related SCN policies
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scn Policy Set</em>' containment reference.
	 * @see #setScnPolicySet(ScnPolicySetType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_ScnPolicySet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scn_policy_set' namespace='##targetNamespace'"
	 * @generated
	 */
	ScnPolicySetType getScnPolicySet();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getScnPolicySet <em>Scn Policy Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scn Policy Set</em>' containment reference.
	 * @see #getScnPolicySet()
	 * @generated
	 */
	void setScnPolicySet(ScnPolicySetType value);

	/**
	 * Returns the value of the '<em><b>Scp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scp</em>' containment reference.
	 * @see #setScp(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Scp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scp' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getScp();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getScp <em>Scp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scp</em>' containment reference.
	 * @see #getScp()
	 * @generated
	 */
	void setScp(XrefFaces value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_SeriesMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='series_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	SeriesMetadataType getSeriesMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSeriesMetadata <em>Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Metadata</em>' containment reference.
	 * @see #getSeriesMetadata()
	 * @generated
	 */
	void setSeriesMetadata(SeriesMetadataType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_SeriesNumber()
	 * @model unique="false" dataType="org.crossref.schema._4._4.SeriesNumberType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='series_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSeriesNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSeriesNumber <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Number</em>' attribute.
	 * @see #getSeriesNumber()
	 * @generated
	 */
	void setSeriesNumber(String value);

	/**
	 * Returns the value of the '<em><b>Series Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Book series title in a citation. Only used in the citation element.
	 * 				series_title is an element for the deposit of book or conference series titles in
	 * 				citations without the hierarchy required by the series_metadata element. Note that
	 * 				face markup is not permitted when this element is deposited as part of a
	 * 				citation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Title</em>' attribute.
	 * @see #setSeriesTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_SeriesTitle()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='series_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSeriesTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSeriesTitle <em>Series Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Title</em>' attribute.
	 * @see #getSeriesTitle()
	 * @generated
	 */
	void setSeriesTitle(String value);

	/**
	 * Returns the value of the '<em><b>Set Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  When a book consists of multiple volumes that are not part of a
	 * 				serial publication (series), set_metadata is used to describe information about the
	 * 				entire set. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Metadata</em>' containment reference.
	 * @see #setSetMetadata(SetMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_SetMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='set_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	SetMetadataType getSetMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSetMetadata <em>Set Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Metadata</em>' containment reference.
	 * @see #getSetMetadata()
	 * @generated
	 */
	void setSetMetadata(SetMetadataType value);

	/**
	 * Returns the value of the '<em><b>Special Numbering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue level numbering for supplements or special issues. Text
	 * 				defining the type of special issue (e.g. "suppl") should be included in this element
	 * 				along with the number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Numbering</em>' attribute.
	 * @see #setSpecialNumbering(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_SpecialNumbering()
	 * @model unique="false" dataType="org.crossref.schema._4._4.SpecialNumberingType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='special_numbering' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpecialNumbering();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSpecialNumbering <em>Special Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Numbering</em>' attribute.
	 * @see #getSpecialNumbering()
	 * @generated
	 */
	void setSpecialNumbering(String value);

	/**
	 * Returns the value of the '<em><b>Standard</b></em>' containment reference.
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
	 * @return the value of the '<em>Standard</em>' containment reference.
	 * @see #setStandard(StandardType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Standard()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='standard' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardType getStandard();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStandard <em>Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' containment reference.
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(StandardType value);

	/**
	 * Returns the value of the '<em><b>Standard Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard_metadata is used as a wrapper for the metadata related to a
	 * 				Standard that is not part of a series. standard_metadata is similar to
	 * 				book_metadata. It differs in that standard_metadata adds the elements institution
	 * 				and approval_date. contributors contains the author(s) of the standard. In most
	 * 				cases, it is expected that the organization element will be used rather than
	 * 				person_name element for standards. However in some cases, standards are cited by
	 * 				their individual authors. In such cases, individual authors should be deposited with
	 * 				person_name, and the SDO or consortia name should be deposited with the organization
	 * 				element in contributors and also the standards_body_name element in standards_body
	 * 				Note that when the organization element is used in contributors, it should have the
	 * 				name of the committee (when appropriate) that developed the standard, not the name
	 * 				of the Standards Development Organization (SDO) or consortia. The SDO or consortia
	 * 				name should be placed in the publisher or standards_body element (as appropriate)
	 * 				Standards more often have version numbers than edition numbers. However the
	 * 				edition_number element can be used for deposit of the version number of a standard
	 * 				approval_date should be used for the date that a standard has been accepted or
	 * 				re-affirmed if different from the date of publication. Both may be provided even if
	 * 				identical Within publisher_item, the designation should be placed inside the
	 * 				item_number element, and the id_type should be set to "designation" to indicate a
	 * 				standard designation. Standards are typically sponsored or hosted by SDOs or
	 * 				Consortia. In some cases standards are published by a traditional publisher rather
	 * 				than by the owning organization. Such cases may be deposited with one or more
	 * 				publishers. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Metadata</em>' containment reference.
	 * @see #setStandardMetadata(StandardMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StandardMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='standard_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardMetadataType getStandardMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStandardMetadata <em>Standard Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Metadata</em>' containment reference.
	 * @see #getStandardMetadata()
	 * @generated
	 */
	void setStandardMetadata(StandardMetadataType value);

	/**
	 * Returns the value of the '<em><b>Standards Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A wrapper for standards body information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standards Body</em>' containment reference.
	 * @see #setStandardsBody(StandardsBodyType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StandardsBody()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='standards_body' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardsBodyType getStandardsBody();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStandardsBody <em>Standards Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standards Body</em>' containment reference.
	 * @see #getStandardsBody()
	 * @generated
	 */
	void setStandardsBody(StandardsBodyType value);

	/**
	 * Returns the value of the '<em><b>Standards Body Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acronym for standards body. Will be used for query matching -
	 * 				required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standards Body Acronym</em>' containment reference.
	 * @see #setStandardsBodyAcronym(EObject)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StandardsBodyAcronym()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='standards_body_acronym' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getStandardsBodyAcronym();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStandardsBodyAcronym <em>Standards Body Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standards Body Acronym</em>' containment reference.
	 * @see #getStandardsBodyAcronym()
	 * @generated
	 */
	void setStandardsBodyAcronym(EObject value);

	/**
	 * Returns the value of the '<em><b>Standards Body Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the standards organization / publisher.
	 * 				Required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standards Body Name</em>' containment reference.
	 * @see #setStandardsBodyName(EObject)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StandardsBodyName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='standards_body_name' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getStandardsBodyName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStandardsBodyName <em>Standards Body Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standards Body Name</em>' containment reference.
	 * @see #getStandardsBodyName()
	 * @generated
	 */
	void setStandardsBodyName(EObject value);

	/**
	 * Returns the value of the '<em><b>Std Adopted From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designator for standard from which the current deposit is adopted.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Adopted From</em>' attribute.
	 * @see #setStdAdoptedFrom(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdAdoptedFrom()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_adopted_from' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStdAdoptedFrom();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdAdoptedFrom <em>Std Adopted From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Adopted From</em>' attribute.
	 * @see #getStdAdoptedFrom()
	 * @generated
	 */
	void setStdAdoptedFrom(String value);

	/**
	 * Returns the value of the '<em><b>Std Alt As Published</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Alt As Published</em>' containment reference.
	 * @see #setStdAltAsPublished(StdAltAsPublishedType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdAltAsPublished()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_alt_as_published' namespace='##targetNamespace'"
	 * @generated
	 */
	StdAltAsPublishedType getStdAltAsPublished();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdAltAsPublished <em>Std Alt As Published</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Alt As Published</em>' containment reference.
	 * @see #getStdAltAsPublished()
	 * @generated
	 */
	void setStdAltAsPublished(StdAltAsPublishedType value);

	/**
	 * Returns the value of the '<em><b>Std Alt Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Alt Script</em>' attribute.
	 * @see #setStdAltScript(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdAltScript()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_alt_script' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStdAltScript();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdAltScript <em>Std Alt Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Alt Script</em>' attribute.
	 * @see #getStdAltScript()
	 * @generated
	 */
	void setStdAltScript(String value);

	/**
	 * Returns the value of the '<em><b>Std As Published</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designator or other primary identifier for the standard being
	 * 				deposited. Required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std As Published</em>' containment reference.
	 * @see #setStdAsPublished(StdAsPublishedType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdAsPublished()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_as_published' namespace='##targetNamespace'"
	 * @generated
	 */
	StdAsPublishedType getStdAsPublished();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdAsPublished <em>Std As Published</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std As Published</em>' containment reference.
	 * @see #getStdAsPublished()
	 * @generated
	 */
	void setStdAsPublished(StdAsPublishedType value);

	/**
	 * Returns the value of the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Designator</em>' attribute.
	 * @see #setStdDesignator(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdDesignator()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_designator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStdDesignator();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdDesignator <em>Std Designator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Designator</em>' attribute.
	 * @see #getStdDesignator()
	 * @generated
	 */
	void setStdDesignator(String value);

	/**
	 * Returns the value of the '<em><b>Std Family Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides for defining a DOI for a broad grouping of standards.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Family Designator</em>' containment reference.
	 * @see #setStdFamilyDesignator(StdDesignatorT)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdFamilyDesignator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_family_designator' namespace='##targetNamespace'"
	 * @generated
	 */
	StdDesignatorT getStdFamilyDesignator();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdFamilyDesignator <em>Std Family Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Family Designator</em>' containment reference.
	 * @see #getStdFamilyDesignator()
	 * @generated
	 */
	void setStdFamilyDesignator(StdDesignatorT value);

	/**
	 * Returns the value of the '<em><b>Std Revision Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designator for the previous revision of the standard being deposited.
	 * 				(note: use alt_as_published for revisions within designators having common stem)
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Revision Of</em>' attribute.
	 * @see #setStdRevisionOf(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdRevisionOf()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_revision_of' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStdRevisionOf();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdRevisionOf <em>Std Revision Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Revision Of</em>' attribute.
	 * @see #getStdRevisionOf()
	 * @generated
	 */
	void setStdRevisionOf(String value);

	/**
	 * Returns the value of the '<em><b>Std Set Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides for defining a DOI for a set of standards (sometimes know as
	 * 				truncated form). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Set Designator</em>' containment reference.
	 * @see #setStdSetDesignator(StdSetDesignatorType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdSetDesignator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_set_designator' namespace='##targetNamespace'"
	 * @generated
	 */
	StdSetDesignatorType getStdSetDesignator();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdSetDesignator <em>Std Set Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Set Designator</em>' containment reference.
	 * @see #getStdSetDesignator()
	 * @generated
	 */
	void setStdSetDesignator(StdSetDesignatorType value);

	/**
	 * Returns the value of the '<em><b>Std Supersedes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designator for standard being replaced by the standard being
	 * 				deposited. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Supersedes</em>' attribute.
	 * @see #setStdSupersedes(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdSupersedes()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_supersedes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStdSupersedes();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdSupersedes <em>Std Supersedes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Supersedes</em>' attribute.
	 * @see #getStdSupersedes()
	 * @generated
	 */
	void setStdSupersedes(String value);

	/**
	 * Returns the value of the '<em><b>Std Undated Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides for defining a DOI for a group of closely related standard
	 * 				documents (undated form is a stem for any dated form) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Undated Designator</em>' containment reference.
	 * @see #setStdUndatedDesignator(StdUndatedDesignatorType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdUndatedDesignator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_undated_designator' namespace='##targetNamespace'"
	 * @generated
	 */
	StdUndatedDesignatorType getStdUndatedDesignator();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdUndatedDesignator <em>Std Undated Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Undated Designator</em>' containment reference.
	 * @see #getStdUndatedDesignator()
	 * @generated
	 */
	void setStdUndatedDesignator(StdUndatedDesignatorType value);

	/**
	 * Returns the value of the '<em><b>Std Variant Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Variant Form</em>' attribute.
	 * @see #setStdVariantForm(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StdVariantForm()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std_variant_form' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStdVariantForm();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStdVariantForm <em>Std Variant Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Variant Form</em>' attribute.
	 * @see #getStdVariantForm()
	 * @generated
	 */
	void setStdVariantForm(String value);

	/**
	 * Returns the value of the '<em><b>String Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Name</em>' containment reference.
	 * @see #setStringName(StringNameType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_StringName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string-name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringNameType getStringName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStringName <em>String Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Name</em>' containment reference.
	 * @see #getStringName()
	 * @generated
	 */
	void setStringName(StringNameType value);

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference.
	 * @see #setStrong(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Strong()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getStrong();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getStrong <em>Strong</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strong</em>' containment reference.
	 * @see #getStrong()
	 * @generated
	 */
	void setStrong(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference.
	 * @see #setSub(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Sub()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getSub();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSub <em>Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' containment reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The sub-title portion of an entity title. When possible, it is better
	 * 				to tag a title and subtitle with separate elements. If this information is not
	 * 				available, it is acceptable to submit the title and subtitle all within the title
	 * 				element with punctuation (preferably a colon) used to separate the subtitle from the
	 * 				title. When a subtitle is tagged, the space and punctuation between the title and
	 * 				subtitle text should not be included. The following examples illustrate correct and
	 * 				incorrect tagging practices: Correct and optimal tagging: 
	 *   <title>The Human
	 * 					Brain</title>
	 *   				
	 *   <subtitle>A Handbook</subtitle>
	 *    Correct but not optimal tagging: 
	 *   <title>The Human
	 * 					Brain: A Handbook</title>
	 *    Incorrect: 
	 *   <title>The Human Brain: </title>
	 *   				
	 *   <subtitle>A Handbook</subtitle>
	 *   				
	 *   <title>The Human Brain</title>
	 *   				
	 *   <subtitle>: A Handbook</subtitle>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(SubtitleType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Subtitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtitleType getSubtitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(SubtitleType value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The suffix of an author name, e.g. junior or senior. A name suffix,
	 * 				that typically denotes a generation distinction, is tagged with suffix. Author
	 * 				degrees (e.g. M.D., Ph.D.) should not be included in Crossref
	 * 				submissions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Suffix()
	 * @model unique="false" dataType="org.crossref.schema._4._4.SuffixType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='suffix' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference.
	 * @see #setSup(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Sup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getSup();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSup <em>Sup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sup</em>' containment reference.
	 * @see #getSup()
	 * @generated
	 */
	void setSup(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The surname of an author or editor. The surname, combined with
	 * 				given_name, forms the name of an author or editor. Whenever possible, the given name
	 * 				should not be included in the surname element. In cases where the given name is not
	 * 				clear, as may happen with non-Western names or some societies in which surnames are
	 * 				not distinguished, you may place the entire name in surname, e.g.: 
	 *   <surname>Leonardo
	 * 					da Vinci</surname>
	 *    If an author is an organization, you should use organization,
	 * 				not surname. Suffixes should be tagged with suffix. Author degrees (e.g. M.D.,
	 * 				Ph.D.) should not be included in Crossref submissions.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Surname()
	 * @model unique="false" dataType="org.crossref.schema._4._4.SurnameType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='surname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates version of a batch file instance or DOI. timestamp is used
	 * 				to uniquely identify batch files and DOI values when a DOI has been updated one or
	 * 				more times. timestamp is an integer representation of date and time that serves as a
	 * 				version number for the record that is being deposited. Because Crossref uses it as a
	 * 				version number, the format need not follow any public standard and therefore the
	 * 				publisher can determine the internal format. The schema format is a double of at
	 * 				least 64 bits, insuring that a fully qualified date/time stamp of 19 digits can be
	 * 				submitted. When depositing data, Crossref will check to see if a DOI has already
	 * 				been deposited for the specific doi value. If the newer data carries a time stamp
	 * 				value that is equal to or greater than the old data based on a strict numeric
	 * 				comparison, the new data will replace the old data. If the new data value is less
	 * 				than the old data value, the new data will not replace the old data. timestamp is
	 * 				optional in doi_data and required in head. The value from the head instance
	 * 				timestamp will be used for all instances of doi_data that do not include a timestamp
	 * 				element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Timestamp()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTimestamp();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the entity being registered. When a title contains a
	 * 				subtitle, it is preferable to capture the subtitle portion in the subtitle element.
	 * 				Only minimal face markup is supported, see
	 * 				https://support.crossref.org/hc/en-us/articles/214532023
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Titles()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='titles' namespace='##targetNamespace'"
	 * @generated
	 */
	TitlesType getTitles();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getTitles <em>Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titles</em>' containment reference.
	 * @see #getTitles()
	 * @generated
	 */
	void setTitles(TitlesType value);

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference.
	 * @see #setTt(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Tt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getTt();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getTt <em>Tt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tt</em>' containment reference.
	 * @see #getTt()
	 * @generated
	 */
	void setTt(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' containment reference.
	 * @see #setU(XrefFaces)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_U()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='u' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getU();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getU <em>U</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U</em>' containment reference.
	 * @see #getU()
	 * @generated
	 */
	void setU(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Unassigned Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Normally book content that is published as a series is required to
	 * 				have a series title with an ISSN and a book title and/or a book volume number along
	 * 				with a book ISBN. An exception is when book chapters are published on line first
	 * 				prior to being assigned to a specific book in which case only the series title (and
	 * 				ISSN) is known at time of DOI registration. Element unassigned_content is used as a
	 * 				placeholder to force recognition of this condition and thus prevent accidental
	 * 				omission of book level title information. When unassigned_content is present the
	 * 				system will allow omission of the ISBN. If unassigned_content is not present the
	 * 				system will require an ISBN for the book title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unassigned Content</em>' containment reference.
	 * @see #setUnassignedContent(UnassignedContentType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_UnassignedContent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unassigned_content' namespace='##targetNamespace'"
	 * @generated
	 */
	UnassignedContentType getUnassignedContent();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getUnassignedContent <em>Unassigned Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unassigned Content</em>' containment reference.
	 * @see #getUnassignedContent()
	 * @generated
	 */
	void setUnassignedContent(UnassignedContentType value);

	/**
	 * Returns the value of the '<em><b>Unstructured Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A citation to an item that is not structured with the Crossref citation model.  'unstructured_citation' supports deposit of references for which no structural information is available. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unstructured Citation</em>' containment reference.
	 * @see #setUnstructuredCitation(UnstructuredCitationType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_UnstructuredCitation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unstructured_citation' namespace='##targetNamespace'"
	 * @generated
	 */
	UnstructuredCitationType getUnstructuredCitation();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getUnstructuredCitation <em>Unstructured Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unstructured Citation</em>' containment reference.
	 * @see #getUnstructuredCitation()
	 * @generated
	 */
	void setUnstructuredCitation(UnstructuredCitationType value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DOI of the content being updated (e.g. corrected, retracted,
	 * 				etc.) In the CrossMark Terms and Conditions "updates" are defined as changes that
	 * 				are likely to "change the reader’s interpretation or crediting of the work." That
	 * 				is, *editorially significant* changes. "Updates" should not include minor changes to
	 * 				spelling, punctuation, formatting, etc. Attributes: label: Required attribute. This
	 * 				should be a human-readable version of the "type" attribute. This is what gets
	 * 				displayed in the CrossMark dialog when there is an update. type: Required attribute.
	 * 				This attribute should be used to give the machine-readable name of the update type.
	 * 				The human-readable version of the type should be but in the "label" attribute. There
	 * 				are many "types" of updates. "Corrections, "clarifications", "retractions" and
	 * 				"withdrawals" are just a few of the better-known types. For these common types we
	 * 				recommend you use the values "correction", "clarification", "retraction" and
	 * 				"withdrawal" respectively as per your editorial policy. However, different
	 * 				publishers sometimes have to support different, custom update types- for instance,
	 * 				"protocol amendments", "letters of concern", "comments", etc. The attribute supports
	 * 				custom types as well. date: The date of the update will be displayed in the
	 * 				CrossMark dialog and can help the researcher easily tell whther they are likley to
	 * 				have seen the update.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update</em>' containment reference.
	 * @see #setUpdate(UpdateType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Update()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='update' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateType getUpdate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getUpdate <em>Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' containment reference.
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(UpdateType value);

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date a database or dataset item was updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Date</em>' containment reference.
	 * @see #setUpdateDate(UpdateDateType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_UpdateDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='update_date' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateDateType getUpdateDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getUpdateDate <em>Update Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' containment reference.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(UpdateDateType value);

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional element. A document might provide updates (e.g. corrections,
	 * 				clarifications, retractions) to several other documents. When this is the case, the
	 * 				DOIs of the documents that are being *updated* should be listed
	 * 				here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Updates</em>' containment reference.
	 * @see #setUpdates(UpdatesType)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Updates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='updates' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdatesType getUpdates();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getUpdates <em>Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updates</em>' containment reference.
	 * @see #getUpdates()
	 * @generated
	 */
	void setUpdates(UpdatesType value);

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
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Volume()
	 * @model unique="false" dataType="org.crossref.schema._4._4.VolumeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVolume();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(String value);

	/**
	 * Returns the value of the '<em><b>Volume Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Book volume title in a citation. Only used in the citation element.
	 * 				volume_title is an element for the deposit of book or conference volume titles in
	 * 				citations without the hierarchy required by the titles element. Note that face
	 * 				markup is not permitted when this element is deposited as part of a
	 * 				citation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Title</em>' attribute.
	 * @see #setVolumeTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_VolumeTitle()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVolumeTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getVolumeTitle <em>Volume Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Title</em>' attribute.
	 * @see #getVolumeTitle()
	 * @generated
	 */
	void setVolumeTitle(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Year of publication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getDocumentRoot_Year()
	 * @model unique="false" dataType="org.crossref.schema._4._4.XrefYear" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getYear();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DocumentRoot#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(BigInteger value);

} // DocumentRoot
