/**
 */
package org.crossref.schema._4._4.impl;

import java.math.BigInteger;

import org.crossref.schema._4._4.AType;
import org.crossref.schema._4._4.AcceptanceDateType;
import org.crossref.schema._4._4.AltNameType;
import org.crossref.schema._4._4.AnonymousType;
import org.crossref.schema._4._4.ApprovalDateType;
import org.crossref.schema._4._4.ArchiveLocationsType;
import org.crossref.schema._4._4.ArchiveType;
import org.crossref.schema._4._4.AssertionType;
import org.crossref.schema._4._4.BodyType;
import org.crossref.schema._4._4.BookMetadataType;
import org.crossref.schema._4._4.BookSeriesMetadataType;
import org.crossref.schema._4._4.BookSetMetadataType;
import org.crossref.schema._4._4.BookType;
import org.crossref.schema._4._4.CitationListType;
import org.crossref.schema._4._4.CitationType;
import org.crossref.schema._4._4.CollectionType;
import org.crossref.schema._4._4.CompetingInterestStatementType;
import org.crossref.schema._4._4.ComponentListType;
import org.crossref.schema._4._4.ComponentType;
import org.crossref.schema._4._4.ConferenceDateType;
import org.crossref.schema._4._4.ConferencePaperType;
import org.crossref.schema._4._4.ConferenceType;
import org.crossref.schema._4._4.ContentDateType;
import org.crossref.schema._4._4.ContentItemType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.CreationDateType;
import org.crossref.schema._4._4.CrossmarkDomainType;
import org.crossref.schema._4._4.CrossmarkDomainsType;
import org.crossref.schema._4._4.CrossmarkType;
import org.crossref.schema._4._4.CustomMetadataType;
import org.crossref.schema._4._4.DatabaseDateType;
import org.crossref.schema._4._4.DatabaseMetadataType;
import org.crossref.schema._4._4.DatabaseType;
import org.crossref.schema._4._4.DatasetType;
import org.crossref.schema._4._4.DegreesType;
import org.crossref.schema._4._4.DepositorType;
import org.crossref.schema._4._4.DescriptionType;
import org.crossref.schema._4._4.DesignatorsType;
import org.crossref.schema._4._4.DissertationType;
import org.crossref.schema._4._4.DocumentRoot;
import org.crossref.schema._4._4.DoiBatchType;
import org.crossref.schema._4._4.DoiDataType;
import org.crossref.schema._4._4.EventMetadataType;
import org.crossref.schema._4._4.FormatType;
import org.crossref.schema._4._4.HeadType;
import org.crossref.schema._4._4.IdentifierType;
import org.crossref.schema._4._4.InstitutionType;
import org.crossref.schema._4._4.IntentStatementType;
import org.crossref.schema._4._4.IsbnType;
import org.crossref.schema._4._4.IssnType;
import org.crossref.schema._4._4.ItemNumberType;
import org.crossref.schema._4._4.ItemType;
import org.crossref.schema._4._4.JournalArticleType;
import org.crossref.schema._4._4.JournalIssueType;
import org.crossref.schema._4._4.JournalMetadataType;
import org.crossref.schema._4._4.JournalType;
import org.crossref.schema._4._4.JournalVolumeType;
import org.crossref.schema._4._4.NameType1;
import org.crossref.schema._4._4.NoisbnType;
import org.crossref.schema._4._4.ORCIDType;
import org.crossref.schema._4._4.OrganizationType;
import org.crossref.schema._4._4.OriginalLanguageTitleType;
import org.crossref.schema._4._4.PagesType;
import org.crossref.schema._4._4.PeerReviewType;
import org.crossref.schema._4._4.PendingPublicationType;
import org.crossref.schema._4._4.PersonNameType;
import org.crossref.schema._4._4.PostedContentType;
import org.crossref.schema._4._4.PostedDateType;
import org.crossref.schema._4._4.PrefixType;
import org.crossref.schema._4._4.ProceedingsMetadataType;
import org.crossref.schema._4._4.ProceedingsSeriesMetadataType;
import org.crossref.schema._4._4.PropertyType;
import org.crossref.schema._4._4.PublicationDateType;
import org.crossref.schema._4._4.PublicationType;
import org.crossref.schema._4._4.PublisherItemType;
import org.crossref.schema._4._4.PublisherType;
import org.crossref.schema._4._4.ReportPaperMetadataType;
import org.crossref.schema._4._4.ReportPaperSeriesMetadataType;
import org.crossref.schema._4._4.ReportPaperType;
import org.crossref.schema._4._4.ResourceType;
import org.crossref.schema._4._4.ReviewDateType;
import org.crossref.schema._4._4.SaComponentType;
import org.crossref.schema._4._4.ScnPoliciesType;
import org.crossref.schema._4._4.ScnPolicyRefType;
import org.crossref.schema._4._4.ScnPolicySetType;
import org.crossref.schema._4._4.SeriesMetadataType;
import org.crossref.schema._4._4.SetMetadataType;
import org.crossref.schema._4._4.StandardMetadataType;
import org.crossref.schema._4._4.StandardType;
import org.crossref.schema._4._4.StandardsBodyType;
import org.crossref.schema._4._4.StdAltAsPublishedType;
import org.crossref.schema._4._4.StdAsPublishedType;
import org.crossref.schema._4._4.StdDesignatorT;
import org.crossref.schema._4._4.StdSetDesignatorType;
import org.crossref.schema._4._4.StdUndatedDesignatorType;
import org.crossref.schema._4._4.StringNameType;
import org.crossref.schema._4._4.SubtitleType;
import org.crossref.schema._4._4.TitleType;
import org.crossref.schema._4._4.TitlesType;
import org.crossref.schema._4._4.UnassignedContentType;
import org.crossref.schema._4._4.UnstructuredCitationType;
import org.crossref.schema._4._4.UpdateDateType;
import org.crossref.schema._4._4.UpdateType;
import org.crossref.schema._4._4.UpdatesType;
import org.crossref.schema._4._4.XrefFaces;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getA <em>A</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getAbbrevTitle <em>Abbrev Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getAcceptanceDate <em>Acceptance Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getAltName <em>Alt Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getArchive <em>Archive</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getBook <em>Book</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getBookMetadata <em>Book Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getBookSeriesMetadata <em>Book Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getBookSetMetadata <em>Book Set Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCitationList <em>Citation List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCoden <em>Coden</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCompetingInterestStatement <em>Competing Interest Statement</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getComponentNumber <em>Component Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getConference <em>Conference</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getConferenceAcronym <em>Conference Acronym</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getConferenceDate <em>Conference Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getConferenceLocation <em>Conference Location</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getConferenceName <em>Conference Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getConferenceNumber <em>Conference Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getConferencePaper <em>Conference Paper</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getConferenceSponsor <em>Conference Sponsor</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getConferenceTheme <em>Conference Theme</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getContentDate <em>Content Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getContentItem <em>Content Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getContractNumber <em>Contract Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCrossmark <em>Crossmark</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCrossmarkDomain <em>Crossmark Domain</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#isCrossmarkDomainExclusive <em>Crossmark Domain Exclusive</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCrossmarkDomains <em>Crossmark Domains</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCrossmarkPolicy <em>Crossmark Policy</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCrossmarkVersion <em>Crossmark Version</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCustomMetadata <em>Custom Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getCYear <em>CYear</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDatabaseDate <em>Database Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDatabaseMetadata <em>Database Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDepositor <em>Depositor</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDepositorName <em>Depositor Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDesignators <em>Designators</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDissertation <em>Dissertation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDoiBatch <em>Doi Batch</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDoiBatchId <em>Doi Batch Id</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getEditionNumber <em>Edition Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getEventMetadata <em>Event Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getFirstPage <em>First Page</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getFullTitle <em>Full Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getGroupTitle <em>Group Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getInstitutionAcronym <em>Institution Acronym</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getInstitutionDepartment <em>Institution Department</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getInstitutionName <em>Institution Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getInstitutionPlace <em>Institution Place</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getIntentStatement <em>Intent Statement</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getItemNumber <em>Item Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getJournal <em>Journal</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getJournalArticle <em>Journal Article</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getJournalIssue <em>Journal Issue</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getJournalMetadata <em>Journal Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getJournalTitle <em>Journal Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getJournalVolume <em>Journal Volume</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getLastPage <em>Last Page</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getNoisbn <em>Noisbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getORCID <em>ORCID</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getOriginalLanguageTitle <em>Original Language Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getOtherPages <em>Other Pages</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPeerReview <em>Peer Review</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPendingPublication <em>Pending Publication</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPostedContent <em>Posted Content</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getProceedingsMetadata <em>Proceedings Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getProceedingsSeriesMetadata <em>Proceedings Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getProceedingsSubject <em>Proceedings Subject</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getProceedingsTitle <em>Proceedings Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPublication <em>Publication</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPublisherItem <em>Publisher Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getPublisherPlace <em>Publisher Place</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getRegistrant <em>Registrant</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getReportPaper <em>Report Paper</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getReportPaperMetadata <em>Report Paper Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getReportPaperSeriesMetadata <em>Report Paper Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getRunningNumber <em>Running Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSaComponent <em>Sa Component</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getScnPolicies <em>Scn Policies</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getScnPolicyRef <em>Scn Policy Ref</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getScnPolicySet <em>Scn Policy Set</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSeriesMetadata <em>Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSeriesTitle <em>Series Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSetMetadata <em>Set Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSpecialNumbering <em>Special Numbering</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStandardMetadata <em>Standard Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStandardsBody <em>Standards Body</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStandardsBodyAcronym <em>Standards Body Acronym</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStandardsBodyName <em>Standards Body Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdAdoptedFrom <em>Std Adopted From</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdAltAsPublished <em>Std Alt As Published</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdAltScript <em>Std Alt Script</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdAsPublished <em>Std As Published</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdDesignator <em>Std Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdFamilyDesignator <em>Std Family Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdRevisionOf <em>Std Revision Of</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdSetDesignator <em>Std Set Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdSupersedes <em>Std Supersedes</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdUndatedDesignator <em>Std Undated Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStdVariantForm <em>Std Variant Form</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStringName <em>String Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getUnassignedContent <em>Unassigned Content</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getUnstructuredCitation <em>Unstructured Citation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getUpdates <em>Updates</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getVolumeTitle <em>Volume Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DocumentRootImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAbbrevTitle() <em>Abbrev Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbrevTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREV_TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAffiliation() <em>Affiliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliation()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFILIATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getArticleTitle() <em>Article Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTICLE_TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCoden() <em>Coden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoden()
	 * @generated
	 * @ordered
	 */
	protected static final String CODEN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getComponentNumber() <em>Component Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConferenceAcronym() <em>Conference Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceAcronym()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_ACRONYM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConferenceLocation() <em>Conference Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConferenceName() <em>Conference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConferenceNumber() <em>Conference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConferenceSponsor() <em>Conference Sponsor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceSponsor()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_SPONSOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConferenceTheme() <em>Conference Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceTheme()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_THEME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContractNumber() <em>Contract Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isCrossmarkDomainExclusive() <em>Crossmark Domain Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrossmarkDomainExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CROSSMARK_DOMAIN_EXCLUSIVE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getCrossmarkPolicy() <em>Crossmark Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossmarkPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String CROSSMARK_POLICY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCrossmarkVersion() <em>Crossmark Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossmarkVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CROSSMARK_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCYear() <em>CYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCYear()
	 * @generated
	 * @ordered
	 */
	protected static final String CYEAR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DAY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGREE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDepositorName() <em>Depositor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositorName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPOSITOR_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDoi() <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoi()
	 * @generated
	 * @ordered
	 */
	protected static final String DOI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDoiBatchId() <em>Doi Batch Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoiBatchId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOI_BATCH_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEditionNumber() <em>Edition Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITION_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getElocationId() <em>Elocation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElocationId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELOCATION_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFirstPage() <em>First Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPage()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFullTitle() <em>Full Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGroupTitle() <em>Group Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInstitutionAcronym() <em>Institution Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionAcronym()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_ACRONYM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInstitutionDepartment() <em>Institution Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionDepartment()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_DEPARTMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInstitutionName() <em>Institution Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInstitutionPlace() <em>Institution Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_PLACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getJournalTitle() <em>Journal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNAL_TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastPage() <em>Last Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPage()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MONTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOtherPages() <em>Other Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPages()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PAGES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProceedingsSubject() <em>Proceedings Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedingsSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEEDINGS_SUBJECT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProceedingsTitle() <em>Proceedings Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedingsTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEEDINGS_TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPublisherName() <em>Publisher Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherName()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPublisherPlace() <em>Publisher Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_PLACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRegistrant() <em>Registrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrant()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRANT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRunningNumber() <em>Running Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNNING_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSeriesNumber() <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIES_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSeriesTitle() <em>Series Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIES_TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSpecialNumbering() <em>Special Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialNumbering()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_NUMBERING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStdAdoptedFrom() <em>Std Adopted From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdAdoptedFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String STD_ADOPTED_FROM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStdAltScript() <em>Std Alt Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdAltScript()
	 * @generated
	 * @ordered
	 */
	protected static final String STD_ALT_SCRIPT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStdDesignator() <em>Std Designator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdDesignator()
	 * @generated
	 * @ordered
	 */
	protected static final String STD_DESIGNATOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStdRevisionOf() <em>Std Revision Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdRevisionOf()
	 * @generated
	 * @ordered
	 */
	protected static final String STD_REVISION_OF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStdSupersedes() <em>Std Supersedes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdSupersedes()
	 * @generated
	 * @ordered
	 */
	protected static final String STD_SUPERSEDES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStdVariantForm() <em>Std Variant Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdVariantForm()
	 * @generated
	 * @ordered
	 */
	protected static final String STD_VARIANT_FORM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TIMESTAMP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVolumeTitle() <em>Volume Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger YEAR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _4Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _4Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _4Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AType getA() {
		return (AType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_A(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA(AType newA, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_A(), newA, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA(AType newA) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_A(), newA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbbrevTitle() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_AbbrevTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbrevTitle(String newAbbrevTitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_AbbrevTitle(), newAbbrevTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcceptanceDateType getAcceptanceDate() {
		return (AcceptanceDateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_AcceptanceDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptanceDate(AcceptanceDateType newAcceptanceDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_AcceptanceDate(), newAcceptanceDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcceptanceDate(AcceptanceDateType newAcceptanceDate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_AcceptanceDate(), newAcceptanceDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAffiliation() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Affiliation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffiliation(String newAffiliation) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Affiliation(), newAffiliation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltNameType getAltName() {
		return (AltNameType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_AltName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltName(AltNameType newAltName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_AltName(), newAltName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltName(AltNameType newAltName) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_AltName(), newAltName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousType getAnonymous() {
		return (AnonymousType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Anonymous(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymous(AnonymousType newAnonymous, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Anonymous(), newAnonymous, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnonymous(AnonymousType newAnonymous) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Anonymous(), newAnonymous);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApprovalDateType getApprovalDate() {
		return (ApprovalDateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ApprovalDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovalDate(ApprovalDateType newApprovalDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ApprovalDate(), newApprovalDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalDate(ApprovalDateType newApprovalDate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ApprovalDate(), newApprovalDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchiveType getArchive() {
		return (ArchiveType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Archive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchive(ArchiveType newArchive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Archive(), newArchive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchive(ArchiveType newArchive) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Archive(), newArchive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchiveLocationsType getArchiveLocations() {
		return (ArchiveLocationsType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ArchiveLocations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchiveLocations(ArchiveLocationsType newArchiveLocations, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ArchiveLocations(), newArchiveLocations, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchiveLocations(ArchiveLocationsType newArchiveLocations) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ArchiveLocations(), newArchiveLocations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArticleTitle() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ArticleTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleTitle(String newArticleTitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ArticleTitle(), newArticleTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionType getAssertion() {
		return (AssertionType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Assertion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssertion(AssertionType newAssertion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Assertion(), newAssertion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssertion(AssertionType newAssertion) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Assertion(), newAssertion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Author(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Author(), newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getB() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_B(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetB(XrefFaces newB, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_B(), newB, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setB(XrefFaces newB) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_B(), newB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyType getBody() {
		return (BodyType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Body(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(BodyType newBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Body(), newBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(BodyType newBody) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Body(), newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookType getBook() {
		return (BookType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Book(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBook(BookType newBook, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Book(), newBook, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBook(BookType newBook) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Book(), newBook);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookMetadataType getBookMetadata() {
		return (BookMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_BookMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookMetadata(BookMetadataType newBookMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_BookMetadata(), newBookMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBookMetadata(BookMetadataType newBookMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_BookMetadata(), newBookMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookSeriesMetadataType getBookSeriesMetadata() {
		return (BookSeriesMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_BookSeriesMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookSeriesMetadata(BookSeriesMetadataType newBookSeriesMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_BookSeriesMetadata(), newBookSeriesMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBookSeriesMetadata(BookSeriesMetadataType newBookSeriesMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_BookSeriesMetadata(), newBookSeriesMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookSetMetadataType getBookSetMetadata() {
		return (BookSetMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_BookSetMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookSetMetadata(BookSetMetadataType newBookSetMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_BookSetMetadata(), newBookSetMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBookSetMetadata(BookSetMetadataType newBookSetMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_BookSetMetadata(), newBookSetMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationType getCitation() {
		return (CitationType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Citation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(CitationType newCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Citation(), newCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitation(CitationType newCitation) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Citation(), newCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationListType getCitationList() {
		return (CitationListType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_CitationList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitationList(CitationListType newCitationList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_CitationList(), newCitationList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitationList(CitationListType newCitationList) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_CitationList(), newCitationList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCoden() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Coden(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoden(String newCoden) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Coden(), newCoden);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionType getCollection() {
		return (CollectionType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Collection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(CollectionType newCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Collection(), newCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollection(CollectionType newCollection) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Collection(), newCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompetingInterestStatementType getCompetingInterestStatement() {
		return (CompetingInterestStatementType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_CompetingInterestStatement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompetingInterestStatement(CompetingInterestStatementType newCompetingInterestStatement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_CompetingInterestStatement(), newCompetingInterestStatement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompetingInterestStatement(CompetingInterestStatementType newCompetingInterestStatement) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_CompetingInterestStatement(), newCompetingInterestStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentType getComponent() {
		return (ComponentType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Component(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(ComponentType newComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Component(), newComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(ComponentType newComponent) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Component(), newComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentListType getComponentList() {
		return (ComponentListType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ComponentList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentList(ComponentListType newComponentList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ComponentList(), newComponentList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentList(ComponentListType newComponentList) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ComponentList(), newComponentList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentNumber() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ComponentNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentNumber(String newComponentNumber) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ComponentNumber(), newComponentNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConferenceType getConference() {
		return (ConferenceType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Conference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConference(ConferenceType newConference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Conference(), newConference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConference(ConferenceType newConference) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Conference(), newConference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceAcronym() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ConferenceAcronym(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceAcronym(String newConferenceAcronym) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ConferenceAcronym(), newConferenceAcronym);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConferenceDateType getConferenceDate() {
		return (ConferenceDateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ConferenceDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConferenceDate(ConferenceDateType newConferenceDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ConferenceDate(), newConferenceDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceDate(ConferenceDateType newConferenceDate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ConferenceDate(), newConferenceDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceLocation() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ConferenceLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceLocation(String newConferenceLocation) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ConferenceLocation(), newConferenceLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceName() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ConferenceName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceName(String newConferenceName) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ConferenceName(), newConferenceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceNumber() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ConferenceNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceNumber(String newConferenceNumber) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ConferenceNumber(), newConferenceNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConferencePaperType getConferencePaper() {
		return (ConferencePaperType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ConferencePaper(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConferencePaper(ConferencePaperType newConferencePaper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ConferencePaper(), newConferencePaper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferencePaper(ConferencePaperType newConferencePaper) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ConferencePaper(), newConferencePaper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceSponsor() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ConferenceSponsor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceSponsor(String newConferenceSponsor) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ConferenceSponsor(), newConferenceSponsor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceTheme() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ConferenceTheme(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceTheme(String newConferenceTheme) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ConferenceTheme(), newConferenceTheme);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentDateType getContentDate() {
		return (ContentDateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ContentDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentDate(ContentDateType newContentDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ContentDate(), newContentDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentDate(ContentDateType newContentDate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ContentDate(), newContentDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentItemType getContentItem() {
		return (ContentItemType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ContentItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentItem(ContentItemType newContentItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ContentItem(), newContentItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentItem(ContentItemType newContentItem) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ContentItem(), newContentItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContractNumber() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ContractNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContractNumber(String newContractNumber) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ContractNumber(), newContractNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContributorsType getContributors() {
		return (ContributorsType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Contributors(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributors(ContributorsType newContributors, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Contributors(), newContributors, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContributors(ContributorsType newContributors) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Contributors(), newContributors);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreationDateType getCreationDate() {
		return (CreationDateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_CreationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationDate(CreationDateType newCreationDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_CreationDate(), newCreationDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(CreationDateType newCreationDate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_CreationDate(), newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossmarkType getCrossmark() {
		return (CrossmarkType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Crossmark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrossmark(CrossmarkType newCrossmark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Crossmark(), newCrossmark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossmark(CrossmarkType newCrossmark) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Crossmark(), newCrossmark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossmarkDomainType getCrossmarkDomain() {
		return (CrossmarkDomainType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_CrossmarkDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrossmarkDomain(CrossmarkDomainType newCrossmarkDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_CrossmarkDomain(), newCrossmarkDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossmarkDomain(CrossmarkDomainType newCrossmarkDomain) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_CrossmarkDomain(), newCrossmarkDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCrossmarkDomainExclusive() {
		return (Boolean)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_CrossmarkDomainExclusive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossmarkDomainExclusive(boolean newCrossmarkDomainExclusive) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_CrossmarkDomainExclusive(), newCrossmarkDomainExclusive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossmarkDomainsType getCrossmarkDomains() {
		return (CrossmarkDomainsType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_CrossmarkDomains(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrossmarkDomains(CrossmarkDomainsType newCrossmarkDomains, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_CrossmarkDomains(), newCrossmarkDomains, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossmarkDomains(CrossmarkDomainsType newCrossmarkDomains) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_CrossmarkDomains(), newCrossmarkDomains);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCrossmarkPolicy() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_CrossmarkPolicy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossmarkPolicy(String newCrossmarkPolicy) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_CrossmarkPolicy(), newCrossmarkPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCrossmarkVersion() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_CrossmarkVersion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossmarkVersion(String newCrossmarkVersion) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_CrossmarkVersion(), newCrossmarkVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMetadataType getCustomMetadata() {
		return (CustomMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_CustomMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomMetadata(CustomMetadataType newCustomMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_CustomMetadata(), newCustomMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMetadata(CustomMetadataType newCustomMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_CustomMetadata(), newCustomMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCYear() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_CYear(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCYear(String newCYear) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_CYear(), newCYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseType getDatabase() {
		return (DatabaseType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Database(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(DatabaseType newDatabase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Database(), newDatabase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabase(DatabaseType newDatabase) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Database(), newDatabase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseDateType getDatabaseDate() {
		return (DatabaseDateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_DatabaseDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseDate(DatabaseDateType newDatabaseDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_DatabaseDate(), newDatabaseDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseDate(DatabaseDateType newDatabaseDate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_DatabaseDate(), newDatabaseDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseMetadataType getDatabaseMetadata() {
		return (DatabaseMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_DatabaseMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseMetadata(DatabaseMetadataType newDatabaseMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_DatabaseMetadata(), newDatabaseMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseMetadata(DatabaseMetadataType newDatabaseMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_DatabaseMetadata(), newDatabaseMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetType getDataset() {
		return (DatasetType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Dataset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataset(DatasetType newDataset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Dataset(), newDataset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataset(DatasetType newDataset) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Dataset(), newDataset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDay() {
		return (BigInteger)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Day(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(BigInteger newDay) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Day(), newDay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDegree() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Degree(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegree(String newDegree) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Degree(), newDegree);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreesType getDegrees() {
		return (DegreesType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Degrees(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegrees(DegreesType newDegrees, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Degrees(), newDegrees, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegrees(DegreesType newDegrees) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Degrees(), newDegrees);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepositorType getDepositor() {
		return (DepositorType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Depositor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepositor(DepositorType newDepositor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Depositor(), newDepositor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepositor(DepositorType newDepositor) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Depositor(), newDepositor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDepositorName() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_DepositorName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepositorName(String newDepositorName) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_DepositorName(), newDepositorName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionType getDescription() {
		return (DescriptionType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Description(), newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(DescriptionType newDescription) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignatorsType getDesignators() {
		return (DesignatorsType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Designators(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignators(DesignatorsType newDesignators, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Designators(), newDesignators, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignators(DesignatorsType newDesignators) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Designators(), newDesignators);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DissertationType getDissertation() {
		return (DissertationType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Dissertation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDissertation(DissertationType newDissertation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Dissertation(), newDissertation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDissertation(DissertationType newDissertation) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Dissertation(), newDissertation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoi() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Doi(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoi(String newDoi) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Doi(), newDoi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoiBatchType getDoiBatch() {
		return (DoiBatchType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_DoiBatch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoiBatch(DoiBatchType newDoiBatch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_DoiBatch(), newDoiBatch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoiBatch(DoiBatchType newDoiBatch) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_DoiBatch(), newDoiBatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoiBatchId() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_DoiBatchId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoiBatchId(String newDoiBatchId) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_DoiBatchId(), newDoiBatchId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoiDataType getDoiData() {
		return (DoiDataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_DoiData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoiData(DoiDataType newDoiData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_DoiData(), newDoiData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoiData(DoiDataType newDoiData) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_DoiData(), newDoiData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomain() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Domain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(String newDomain) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Domain(), newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEditionNumber() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_EditionNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditionNumber(String newEditionNumber) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_EditionNumber(), newEditionNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElocationId() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ElocationId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElocationId(String newElocationId) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ElocationId(), newElocationId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getEm() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Em(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEm(XrefFaces newEm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Em(), newEm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEm(XrefFaces newEm) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Em(), newEm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailAddress() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_EmailAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailAddress(String newEmailAddress) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_EmailAddress(), newEmailAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventMetadataType getEventMetadata() {
		return (EventMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_EventMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventMetadata(EventMetadataType newEventMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_EventMetadata(), newEventMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventMetadata(EventMetadataType newEventMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_EventMetadata(), newEventMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilter() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Filter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(String newFilter) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Filter(), newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstPage() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_FirstPage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstPage(String newFirstPage) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_FirstPage(), newFirstPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getFont() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Font(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(XrefFaces newFont, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Font(), newFont, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFont(XrefFaces newFont) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Font(), newFont);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormatType getFormat() {
		return (FormatType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Format(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormat(FormatType newFormat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Format(), newFormat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(FormatType newFormat) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Format(), newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFullTitle() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_FullTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullTitle(String newFullTitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_FullTitle(), newFullTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGivenName() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_GivenName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGivenName(String newGivenName) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_GivenName(), newGivenName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupTitle() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_GroupTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupTitle(String newGroupTitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_GroupTitle(), newGroupTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadType getHead() {
		return (HeadType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Head(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(HeadType newHead, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Head(), newHead, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHead(HeadType newHead) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Head(), newHead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getI() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_I(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetI(XrefFaces newI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_I(), newI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setI(XrefFaces newI) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_I(), newI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierType getIdentifier() {
		return (IdentifierType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Identifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(IdentifierType newIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Identifier(), newIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(IdentifierType newIdentifier) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Identifier(), newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstitutionType getInstitution() {
		return (InstitutionType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Institution(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstitution(InstitutionType newInstitution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Institution(), newInstitution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitution(InstitutionType newInstitution) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Institution(), newInstitution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitutionAcronym() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_InstitutionAcronym(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitutionAcronym(String newInstitutionAcronym) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_InstitutionAcronym(), newInstitutionAcronym);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitutionDepartment() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_InstitutionDepartment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitutionDepartment(String newInstitutionDepartment) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_InstitutionDepartment(), newInstitutionDepartment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitutionName() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_InstitutionName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitutionName(String newInstitutionName) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_InstitutionName(), newInstitutionName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitutionPlace() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_InstitutionPlace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitutionPlace(String newInstitutionPlace) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_InstitutionPlace(), newInstitutionPlace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntentStatementType getIntentStatement() {
		return (IntentStatementType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_IntentStatement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntentStatement(IntentStatementType newIntentStatement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_IntentStatement(), newIntentStatement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntentStatement(IntentStatementType newIntentStatement) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_IntentStatement(), newIntentStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsbnType getIsbn() {
		return (IsbnType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Isbn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsbn(IsbnType newIsbn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Isbn(), newIsbn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsbn(IsbnType newIsbn) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Isbn(), newIsbn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssnType getIssn() {
		return (IssnType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Issn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssn(IssnType newIssn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Issn(), newIssn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssn(IssnType newIssn) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Issn(), newIssn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssue() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Issue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssue(String newIssue) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Issue(), newIssue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemType getItem() {
		return (ItemType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Item(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(ItemType newItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Item(), newItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItem(ItemType newItem) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Item(), newItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemNumberType getItemNumber() {
		return (ItemNumberType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ItemNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemNumber(ItemNumberType newItemNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ItemNumber(), newItemNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemNumber(ItemNumberType newItemNumber) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ItemNumber(), newItemNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalType getJournal() {
		return (JournalType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Journal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournal(JournalType newJournal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Journal(), newJournal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournal(JournalType newJournal) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Journal(), newJournal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalArticleType getJournalArticle() {
		return (JournalArticleType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_JournalArticle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalArticle(JournalArticleType newJournalArticle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_JournalArticle(), newJournalArticle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalArticle(JournalArticleType newJournalArticle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_JournalArticle(), newJournalArticle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalIssueType getJournalIssue() {
		return (JournalIssueType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_JournalIssue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalIssue(JournalIssueType newJournalIssue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_JournalIssue(), newJournalIssue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalIssue(JournalIssueType newJournalIssue) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_JournalIssue(), newJournalIssue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalMetadataType getJournalMetadata() {
		return (JournalMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_JournalMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalMetadata(JournalMetadataType newJournalMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_JournalMetadata(), newJournalMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalMetadata(JournalMetadataType newJournalMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_JournalMetadata(), newJournalMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJournalTitle() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_JournalTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalTitle(String newJournalTitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_JournalTitle(), newJournalTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalVolumeType getJournalVolume() {
		return (JournalVolumeType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_JournalVolume(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalVolume(JournalVolumeType newJournalVolume, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_JournalVolume(), newJournalVolume, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalVolume(JournalVolumeType newJournalVolume) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_JournalVolume(), newJournalVolume);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastPage() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_LastPage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastPage(String newLastPage) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_LastPage(), newLastPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMonth() {
		return (BigInteger)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Month(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonth(BigInteger newMonth) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Month(), newMonth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameType1 getName() {
		return (NameType1)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType1 newName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Name(), newName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(NameType1 newName) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoisbnType getNoisbn() {
		return (NoisbnType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Noisbn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoisbn(NoisbnType newNoisbn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Noisbn(), newNoisbn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoisbn(NoisbnType newNoisbn) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Noisbn(), newNoisbn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ORCIDType getORCID() {
		return (ORCIDType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ORCID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORCID(ORCIDType newORCID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ORCID(), newORCID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setORCID(ORCIDType newORCID) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ORCID(), newORCID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationType getOrganization() {
		return (OrganizationType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Organization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(OrganizationType newOrganization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Organization(), newOrganization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganization(OrganizationType newOrganization) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Organization(), newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OriginalLanguageTitleType getOriginalLanguageTitle() {
		return (OriginalLanguageTitleType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_OriginalLanguageTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalLanguageTitle(OriginalLanguageTitleType newOriginalLanguageTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_OriginalLanguageTitle(), newOriginalLanguageTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalLanguageTitle(OriginalLanguageTitleType newOriginalLanguageTitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_OriginalLanguageTitle(), newOriginalLanguageTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPages() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_OtherPages(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPages(String newOtherPages) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_OtherPages(), newOtherPages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getOvl() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Ovl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOvl(XrefFaces newOvl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Ovl(), newOvl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOvl(XrefFaces newOvl) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Ovl(), newOvl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PagesType getPages() {
		return (PagesType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Pages(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPages(PagesType newPages, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Pages(), newPages, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPages(PagesType newPages) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Pages(), newPages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartNumber() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_PartNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartNumber(String newPartNumber) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_PartNumber(), newPartNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeerReviewType getPeerReview() {
		return (PeerReviewType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_PeerReview(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeerReview(PeerReviewType newPeerReview, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_PeerReview(), newPeerReview, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeerReview(PeerReviewType newPeerReview) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_PeerReview(), newPeerReview);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PendingPublicationType getPendingPublication() {
		return (PendingPublicationType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_PendingPublication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPendingPublication(PendingPublicationType newPendingPublication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_PendingPublication(), newPendingPublication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPendingPublication(PendingPublicationType newPendingPublication) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_PendingPublication(), newPendingPublication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonNameType getPersonName() {
		return (PersonNameType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_PersonName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonName(PersonNameType newPersonName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_PersonName(), newPersonName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonName(PersonNameType newPersonName) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_PersonName(), newPersonName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostedContentType getPostedContent() {
		return (PostedContentType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_PostedContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostedContent(PostedContentType newPostedContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_PostedContent(), newPostedContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedContent(PostedContentType newPostedContent) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_PostedContent(), newPostedContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostedDateType getPostedDate() {
		return (PostedDateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_PostedDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostedDate(PostedDateType newPostedDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_PostedDate(), newPostedDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedDate(PostedDateType newPostedDate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_PostedDate(), newPostedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixType getPrefix() {
		return (PrefixType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Prefix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(PrefixType newPrefix, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Prefix(), newPrefix, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(PrefixType newPrefix) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Prefix(), newPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceedingsMetadataType getProceedingsMetadata() {
		return (ProceedingsMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ProceedingsMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProceedingsMetadata(ProceedingsMetadataType newProceedingsMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ProceedingsMetadata(), newProceedingsMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProceedingsMetadata(ProceedingsMetadataType newProceedingsMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ProceedingsMetadata(), newProceedingsMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceedingsSeriesMetadataType getProceedingsSeriesMetadata() {
		return (ProceedingsSeriesMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ProceedingsSeriesMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProceedingsSeriesMetadata(ProceedingsSeriesMetadataType newProceedingsSeriesMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ProceedingsSeriesMetadata(), newProceedingsSeriesMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProceedingsSeriesMetadata(ProceedingsSeriesMetadataType newProceedingsSeriesMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ProceedingsSeriesMetadata(), newProceedingsSeriesMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProceedingsSubject() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ProceedingsSubject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProceedingsSubject(String newProceedingsSubject) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ProceedingsSubject(), newProceedingsSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProceedingsTitle() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ProceedingsTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProceedingsTitle(String newProceedingsTitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ProceedingsTitle(), newProceedingsTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType getProperty() {
		return (PropertyType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Property(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Property(), newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(PropertyType newProperty) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Property(), newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationType getPublication() {
		return (PublicationType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Publication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublication(PublicationType newPublication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Publication(), newPublication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublication(PublicationType newPublication) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Publication(), newPublication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationDateType getPublicationDate() {
		return (PublicationDateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_PublicationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicationDate(PublicationDateType newPublicationDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_PublicationDate(), newPublicationDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicationDate(PublicationDateType newPublicationDate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_PublicationDate(), newPublicationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherType getPublisher() {
		return (PublisherType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Publisher(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(PublisherType newPublisher, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Publisher(), newPublisher, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(PublisherType newPublisher) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Publisher(), newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherItemType getPublisherItem() {
		return (PublisherItemType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_PublisherItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisherItem(PublisherItemType newPublisherItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_PublisherItem(), newPublisherItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisherItem(PublisherItemType newPublisherItem) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_PublisherItem(), newPublisherItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublisherName() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_PublisherName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisherName(String newPublisherName) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_PublisherName(), newPublisherName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublisherPlace() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_PublisherPlace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisherPlace(String newPublisherPlace) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_PublisherPlace(), newPublisherPlace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistrant() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Registrant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistrant(String newRegistrant) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Registrant(), newRegistrant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportPaperType getReportPaper() {
		return (ReportPaperType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ReportPaper(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportPaper(ReportPaperType newReportPaper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ReportPaper(), newReportPaper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportPaper(ReportPaperType newReportPaper) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ReportPaper(), newReportPaper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportPaperMetadataType getReportPaperMetadata() {
		return (ReportPaperMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ReportPaperMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportPaperMetadata(ReportPaperMetadataType newReportPaperMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ReportPaperMetadata(), newReportPaperMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportPaperMetadata(ReportPaperMetadataType newReportPaperMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ReportPaperMetadata(), newReportPaperMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportPaperSeriesMetadataType getReportPaperSeriesMetadata() {
		return (ReportPaperSeriesMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ReportPaperSeriesMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportPaperSeriesMetadata(ReportPaperSeriesMetadataType newReportPaperSeriesMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ReportPaperSeriesMetadata(), newReportPaperSeriesMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportPaperSeriesMetadata(ReportPaperSeriesMetadataType newReportPaperSeriesMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ReportPaperSeriesMetadata(), newReportPaperSeriesMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getResource() {
		return (ResourceType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Resource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(ResourceType newResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Resource(), newResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(ResourceType newResource) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Resource(), newResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewDateType getReviewDate() {
		return (ReviewDateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ReviewDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReviewDate(ReviewDateType newReviewDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ReviewDate(), newReviewDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewDate(ReviewDateType newReviewDate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ReviewDate(), newReviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunningNumber() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_RunningNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunningNumber(String newRunningNumber) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_RunningNumber(), newRunningNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SaComponentType getSaComponent() {
		return (SaComponentType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_SaComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSaComponent(SaComponentType newSaComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_SaComponent(), newSaComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaComponent(SaComponentType newSaComponent) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_SaComponent(), newSaComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScnPoliciesType getScnPolicies() {
		return (ScnPoliciesType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ScnPolicies(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScnPolicies(ScnPoliciesType newScnPolicies, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ScnPolicies(), newScnPolicies, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScnPolicies(ScnPoliciesType newScnPolicies) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ScnPolicies(), newScnPolicies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScnPolicyRefType getScnPolicyRef() {
		return (ScnPolicyRefType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ScnPolicyRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScnPolicyRef(ScnPolicyRefType newScnPolicyRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ScnPolicyRef(), newScnPolicyRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScnPolicyRef(ScnPolicyRefType newScnPolicyRef) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ScnPolicyRef(), newScnPolicyRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScnPolicySetType getScnPolicySet() {
		return (ScnPolicySetType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_ScnPolicySet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScnPolicySet(ScnPolicySetType newScnPolicySet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_ScnPolicySet(), newScnPolicySet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScnPolicySet(ScnPolicySetType newScnPolicySet) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_ScnPolicySet(), newScnPolicySet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getScp() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Scp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScp(XrefFaces newScp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Scp(), newScp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScp(XrefFaces newScp) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Scp(), newScp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesMetadataType getSeriesMetadata() {
		return (SeriesMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_SeriesMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesMetadata(SeriesMetadataType newSeriesMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_SeriesMetadata(), newSeriesMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeriesMetadata(SeriesMetadataType newSeriesMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_SeriesMetadata(), newSeriesMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeriesNumber() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_SeriesNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeriesNumber(String newSeriesNumber) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_SeriesNumber(), newSeriesNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeriesTitle() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_SeriesTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeriesTitle(String newSeriesTitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_SeriesTitle(), newSeriesTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetMetadataType getSetMetadata() {
		return (SetMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_SetMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetMetadata(SetMetadataType newSetMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_SetMetadata(), newSetMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetMetadata(SetMetadataType newSetMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_SetMetadata(), newSetMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecialNumbering() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_SpecialNumbering(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialNumbering(String newSpecialNumbering) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_SpecialNumbering(), newSpecialNumbering);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardType getStandard() {
		return (StandardType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Standard(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandard(StandardType newStandard, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Standard(), newStandard, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandard(StandardType newStandard) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Standard(), newStandard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardMetadataType getStandardMetadata() {
		return (StandardMetadataType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StandardMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardMetadata(StandardMetadataType newStandardMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_StandardMetadata(), newStandardMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardMetadata(StandardMetadataType newStandardMetadata) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StandardMetadata(), newStandardMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardsBodyType getStandardsBody() {
		return (StandardsBodyType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StandardsBody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardsBody(StandardsBodyType newStandardsBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_StandardsBody(), newStandardsBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardsBody(StandardsBodyType newStandardsBody) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StandardsBody(), newStandardsBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getStandardsBodyAcronym() {
		return (EObject)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StandardsBodyAcronym(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardsBodyAcronym(EObject newStandardsBodyAcronym, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_StandardsBodyAcronym(), newStandardsBodyAcronym, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardsBodyAcronym(EObject newStandardsBodyAcronym) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StandardsBodyAcronym(), newStandardsBodyAcronym);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getStandardsBodyName() {
		return (EObject)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StandardsBodyName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardsBodyName(EObject newStandardsBodyName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_StandardsBodyName(), newStandardsBodyName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardsBodyName(EObject newStandardsBodyName) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StandardsBodyName(), newStandardsBodyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStdAdoptedFrom() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdAdoptedFrom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdAdoptedFrom(String newStdAdoptedFrom) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdAdoptedFrom(), newStdAdoptedFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdAltAsPublishedType getStdAltAsPublished() {
		return (StdAltAsPublishedType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdAltAsPublished(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStdAltAsPublished(StdAltAsPublishedType newStdAltAsPublished, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_StdAltAsPublished(), newStdAltAsPublished, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdAltAsPublished(StdAltAsPublishedType newStdAltAsPublished) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdAltAsPublished(), newStdAltAsPublished);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStdAltScript() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdAltScript(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdAltScript(String newStdAltScript) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdAltScript(), newStdAltScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdAsPublishedType getStdAsPublished() {
		return (StdAsPublishedType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdAsPublished(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStdAsPublished(StdAsPublishedType newStdAsPublished, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_StdAsPublished(), newStdAsPublished, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdAsPublished(StdAsPublishedType newStdAsPublished) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdAsPublished(), newStdAsPublished);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStdDesignator() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdDesignator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdDesignator(String newStdDesignator) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdDesignator(), newStdDesignator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdDesignatorT getStdFamilyDesignator() {
		return (StdDesignatorT)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdFamilyDesignator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStdFamilyDesignator(StdDesignatorT newStdFamilyDesignator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_StdFamilyDesignator(), newStdFamilyDesignator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdFamilyDesignator(StdDesignatorT newStdFamilyDesignator) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdFamilyDesignator(), newStdFamilyDesignator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStdRevisionOf() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdRevisionOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdRevisionOf(String newStdRevisionOf) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdRevisionOf(), newStdRevisionOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdSetDesignatorType getStdSetDesignator() {
		return (StdSetDesignatorType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdSetDesignator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStdSetDesignator(StdSetDesignatorType newStdSetDesignator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_StdSetDesignator(), newStdSetDesignator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdSetDesignator(StdSetDesignatorType newStdSetDesignator) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdSetDesignator(), newStdSetDesignator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStdSupersedes() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdSupersedes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdSupersedes(String newStdSupersedes) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdSupersedes(), newStdSupersedes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdUndatedDesignatorType getStdUndatedDesignator() {
		return (StdUndatedDesignatorType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdUndatedDesignator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStdUndatedDesignator(StdUndatedDesignatorType newStdUndatedDesignator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_StdUndatedDesignator(), newStdUndatedDesignator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdUndatedDesignator(StdUndatedDesignatorType newStdUndatedDesignator) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdUndatedDesignator(), newStdUndatedDesignator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStdVariantForm() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StdVariantForm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdVariantForm(String newStdVariantForm) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StdVariantForm(), newStdVariantForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringNameType getStringName() {
		return (StringNameType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_StringName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringName(StringNameType newStringName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_StringName(), newStringName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringName(StringNameType newStringName) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_StringName(), newStringName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getStrong() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Strong(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrong(XrefFaces newStrong, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Strong(), newStrong, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrong(XrefFaces newStrong) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Strong(), newStrong);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getSub() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Sub(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSub(XrefFaces newSub, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Sub(), newSub, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSub(XrefFaces newSub) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Sub(), newSub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubtitleType getSubtitle() {
		return (SubtitleType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Subtitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(SubtitleType newSubtitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Subtitle(), newSubtitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtitle(SubtitleType newSubtitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Subtitle(), newSubtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffix() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Suffix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffix(String newSuffix) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Suffix(), newSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getSup() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Sup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSup(XrefFaces newSup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Sup(), newSup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSup(XrefFaces newSup) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Sup(), newSup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurname() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Surname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurname(String newSurname) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Surname(), newSurname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTimestamp() {
		return (BigInteger)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Timestamp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(BigInteger newTimestamp) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Timestamp(), newTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitle() {
		return (TitleType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Title(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Title(), newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(TitleType newTitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Title(), newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitlesType getTitles() {
		return (TitlesType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Titles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitles(TitlesType newTitles, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Titles(), newTitles, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitles(TitlesType newTitles) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Titles(), newTitles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getTt() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Tt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTt(XrefFaces newTt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Tt(), newTt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTt(XrefFaces newTt) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Tt(), newTt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getU() {
		return (XrefFaces)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_U(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetU(XrefFaces newU, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_U(), newU, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setU(XrefFaces newU) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_U(), newU);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnassignedContentType getUnassignedContent() {
		return (UnassignedContentType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_UnassignedContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnassignedContent(UnassignedContentType newUnassignedContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_UnassignedContent(), newUnassignedContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnassignedContent(UnassignedContentType newUnassignedContent) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_UnassignedContent(), newUnassignedContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredCitationType getUnstructuredCitation() {
		return (UnstructuredCitationType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_UnstructuredCitation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnstructuredCitation(UnstructuredCitationType newUnstructuredCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_UnstructuredCitation(), newUnstructuredCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnstructuredCitation(UnstructuredCitationType newUnstructuredCitation) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_UnstructuredCitation(), newUnstructuredCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateType getUpdate() {
		return (UpdateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Update(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdate(UpdateType newUpdate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Update(), newUpdate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdate(UpdateType newUpdate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Update(), newUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateDateType getUpdateDate() {
		return (UpdateDateType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_UpdateDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateDate(UpdateDateType newUpdateDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_UpdateDate(), newUpdateDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateDate(UpdateDateType newUpdateDate) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_UpdateDate(), newUpdateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdatesType getUpdates() {
		return (UpdatesType)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Updates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdates(UpdatesType newUpdates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_4Package.eINSTANCE.getDocumentRoot_Updates(), newUpdates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdates(UpdatesType newUpdates) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Updates(), newUpdates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVolume() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Volume(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolume(String newVolume) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Volume(), newVolume);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVolumeTitle() {
		return (String)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_VolumeTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeTitle(String newVolumeTitle) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_VolumeTitle(), newVolumeTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getYear() {
		return (BigInteger)getMixed().get(_4Package.eINSTANCE.getDocumentRoot_Year(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(BigInteger newYear) {
		((FeatureMap.Internal)getMixed()).set(_4Package.eINSTANCE.getDocumentRoot_Year(), newYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _4Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _4Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _4Package.DOCUMENT_ROOT__A:
				return basicSetA(null, msgs);
			case _4Package.DOCUMENT_ROOT__ACCEPTANCE_DATE:
				return basicSetAcceptanceDate(null, msgs);
			case _4Package.DOCUMENT_ROOT__ALT_NAME:
				return basicSetAltName(null, msgs);
			case _4Package.DOCUMENT_ROOT__ANONYMOUS:
				return basicSetAnonymous(null, msgs);
			case _4Package.DOCUMENT_ROOT__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case _4Package.DOCUMENT_ROOT__ARCHIVE:
				return basicSetArchive(null, msgs);
			case _4Package.DOCUMENT_ROOT__ARCHIVE_LOCATIONS:
				return basicSetArchiveLocations(null, msgs);
			case _4Package.DOCUMENT_ROOT__ASSERTION:
				return basicSetAssertion(null, msgs);
			case _4Package.DOCUMENT_ROOT__B:
				return basicSetB(null, msgs);
			case _4Package.DOCUMENT_ROOT__BODY:
				return basicSetBody(null, msgs);
			case _4Package.DOCUMENT_ROOT__BOOK:
				return basicSetBook(null, msgs);
			case _4Package.DOCUMENT_ROOT__BOOK_METADATA:
				return basicSetBookMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__BOOK_SERIES_METADATA:
				return basicSetBookSeriesMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__BOOK_SET_METADATA:
				return basicSetBookSetMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__CITATION:
				return basicSetCitation(null, msgs);
			case _4Package.DOCUMENT_ROOT__CITATION_LIST:
				return basicSetCitationList(null, msgs);
			case _4Package.DOCUMENT_ROOT__COLLECTION:
				return basicSetCollection(null, msgs);
			case _4Package.DOCUMENT_ROOT__COMPETING_INTEREST_STATEMENT:
				return basicSetCompetingInterestStatement(null, msgs);
			case _4Package.DOCUMENT_ROOT__COMPONENT:
				return basicSetComponent(null, msgs);
			case _4Package.DOCUMENT_ROOT__COMPONENT_LIST:
				return basicSetComponentList(null, msgs);
			case _4Package.DOCUMENT_ROOT__CONFERENCE:
				return basicSetConference(null, msgs);
			case _4Package.DOCUMENT_ROOT__CONFERENCE_DATE:
				return basicSetConferenceDate(null, msgs);
			case _4Package.DOCUMENT_ROOT__CONFERENCE_PAPER:
				return basicSetConferencePaper(null, msgs);
			case _4Package.DOCUMENT_ROOT__CONTENT_DATE:
				return basicSetContentDate(null, msgs);
			case _4Package.DOCUMENT_ROOT__CONTENT_ITEM:
				return basicSetContentItem(null, msgs);
			case _4Package.DOCUMENT_ROOT__CONTRIBUTORS:
				return basicSetContributors(null, msgs);
			case _4Package.DOCUMENT_ROOT__CREATION_DATE:
				return basicSetCreationDate(null, msgs);
			case _4Package.DOCUMENT_ROOT__CROSSMARK:
				return basicSetCrossmark(null, msgs);
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAIN:
				return basicSetCrossmarkDomain(null, msgs);
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAINS:
				return basicSetCrossmarkDomains(null, msgs);
			case _4Package.DOCUMENT_ROOT__CUSTOM_METADATA:
				return basicSetCustomMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__DATABASE:
				return basicSetDatabase(null, msgs);
			case _4Package.DOCUMENT_ROOT__DATABASE_DATE:
				return basicSetDatabaseDate(null, msgs);
			case _4Package.DOCUMENT_ROOT__DATABASE_METADATA:
				return basicSetDatabaseMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__DATASET:
				return basicSetDataset(null, msgs);
			case _4Package.DOCUMENT_ROOT__DEGREES:
				return basicSetDegrees(null, msgs);
			case _4Package.DOCUMENT_ROOT__DEPOSITOR:
				return basicSetDepositor(null, msgs);
			case _4Package.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case _4Package.DOCUMENT_ROOT__DESIGNATORS:
				return basicSetDesignators(null, msgs);
			case _4Package.DOCUMENT_ROOT__DISSERTATION:
				return basicSetDissertation(null, msgs);
			case _4Package.DOCUMENT_ROOT__DOI_BATCH:
				return basicSetDoiBatch(null, msgs);
			case _4Package.DOCUMENT_ROOT__DOI_DATA:
				return basicSetDoiData(null, msgs);
			case _4Package.DOCUMENT_ROOT__EM:
				return basicSetEm(null, msgs);
			case _4Package.DOCUMENT_ROOT__EVENT_METADATA:
				return basicSetEventMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__FONT:
				return basicSetFont(null, msgs);
			case _4Package.DOCUMENT_ROOT__FORMAT:
				return basicSetFormat(null, msgs);
			case _4Package.DOCUMENT_ROOT__HEAD:
				return basicSetHead(null, msgs);
			case _4Package.DOCUMENT_ROOT__I:
				return basicSetI(null, msgs);
			case _4Package.DOCUMENT_ROOT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case _4Package.DOCUMENT_ROOT__INSTITUTION:
				return basicSetInstitution(null, msgs);
			case _4Package.DOCUMENT_ROOT__INTENT_STATEMENT:
				return basicSetIntentStatement(null, msgs);
			case _4Package.DOCUMENT_ROOT__ISBN:
				return basicSetIsbn(null, msgs);
			case _4Package.DOCUMENT_ROOT__ISSN:
				return basicSetIssn(null, msgs);
			case _4Package.DOCUMENT_ROOT__ITEM:
				return basicSetItem(null, msgs);
			case _4Package.DOCUMENT_ROOT__ITEM_NUMBER:
				return basicSetItemNumber(null, msgs);
			case _4Package.DOCUMENT_ROOT__JOURNAL:
				return basicSetJournal(null, msgs);
			case _4Package.DOCUMENT_ROOT__JOURNAL_ARTICLE:
				return basicSetJournalArticle(null, msgs);
			case _4Package.DOCUMENT_ROOT__JOURNAL_ISSUE:
				return basicSetJournalIssue(null, msgs);
			case _4Package.DOCUMENT_ROOT__JOURNAL_METADATA:
				return basicSetJournalMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__JOURNAL_VOLUME:
				return basicSetJournalVolume(null, msgs);
			case _4Package.DOCUMENT_ROOT__NAME:
				return basicSetName(null, msgs);
			case _4Package.DOCUMENT_ROOT__NOISBN:
				return basicSetNoisbn(null, msgs);
			case _4Package.DOCUMENT_ROOT__ORCID:
				return basicSetORCID(null, msgs);
			case _4Package.DOCUMENT_ROOT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case _4Package.DOCUMENT_ROOT__ORIGINAL_LANGUAGE_TITLE:
				return basicSetOriginalLanguageTitle(null, msgs);
			case _4Package.DOCUMENT_ROOT__OVL:
				return basicSetOvl(null, msgs);
			case _4Package.DOCUMENT_ROOT__PAGES:
				return basicSetPages(null, msgs);
			case _4Package.DOCUMENT_ROOT__PEER_REVIEW:
				return basicSetPeerReview(null, msgs);
			case _4Package.DOCUMENT_ROOT__PENDING_PUBLICATION:
				return basicSetPendingPublication(null, msgs);
			case _4Package.DOCUMENT_ROOT__PERSON_NAME:
				return basicSetPersonName(null, msgs);
			case _4Package.DOCUMENT_ROOT__POSTED_CONTENT:
				return basicSetPostedContent(null, msgs);
			case _4Package.DOCUMENT_ROOT__POSTED_DATE:
				return basicSetPostedDate(null, msgs);
			case _4Package.DOCUMENT_ROOT__PREFIX:
				return basicSetPrefix(null, msgs);
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_METADATA:
				return basicSetProceedingsMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_SERIES_METADATA:
				return basicSetProceedingsSeriesMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case _4Package.DOCUMENT_ROOT__PUBLICATION:
				return basicSetPublication(null, msgs);
			case _4Package.DOCUMENT_ROOT__PUBLICATION_DATE:
				return basicSetPublicationDate(null, msgs);
			case _4Package.DOCUMENT_ROOT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case _4Package.DOCUMENT_ROOT__PUBLISHER_ITEM:
				return basicSetPublisherItem(null, msgs);
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER:
				return basicSetReportPaper(null, msgs);
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER_METADATA:
				return basicSetReportPaperMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER_SERIES_METADATA:
				return basicSetReportPaperSeriesMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__RESOURCE:
				return basicSetResource(null, msgs);
			case _4Package.DOCUMENT_ROOT__REVIEW_DATE:
				return basicSetReviewDate(null, msgs);
			case _4Package.DOCUMENT_ROOT__SA_COMPONENT:
				return basicSetSaComponent(null, msgs);
			case _4Package.DOCUMENT_ROOT__SCN_POLICIES:
				return basicSetScnPolicies(null, msgs);
			case _4Package.DOCUMENT_ROOT__SCN_POLICY_REF:
				return basicSetScnPolicyRef(null, msgs);
			case _4Package.DOCUMENT_ROOT__SCN_POLICY_SET:
				return basicSetScnPolicySet(null, msgs);
			case _4Package.DOCUMENT_ROOT__SCP:
				return basicSetScp(null, msgs);
			case _4Package.DOCUMENT_ROOT__SERIES_METADATA:
				return basicSetSeriesMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__SET_METADATA:
				return basicSetSetMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__STANDARD:
				return basicSetStandard(null, msgs);
			case _4Package.DOCUMENT_ROOT__STANDARD_METADATA:
				return basicSetStandardMetadata(null, msgs);
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY:
				return basicSetStandardsBody(null, msgs);
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY_ACRONYM:
				return basicSetStandardsBodyAcronym(null, msgs);
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY_NAME:
				return basicSetStandardsBodyName(null, msgs);
			case _4Package.DOCUMENT_ROOT__STD_ALT_AS_PUBLISHED:
				return basicSetStdAltAsPublished(null, msgs);
			case _4Package.DOCUMENT_ROOT__STD_AS_PUBLISHED:
				return basicSetStdAsPublished(null, msgs);
			case _4Package.DOCUMENT_ROOT__STD_FAMILY_DESIGNATOR:
				return basicSetStdFamilyDesignator(null, msgs);
			case _4Package.DOCUMENT_ROOT__STD_SET_DESIGNATOR:
				return basicSetStdSetDesignator(null, msgs);
			case _4Package.DOCUMENT_ROOT__STD_UNDATED_DESIGNATOR:
				return basicSetStdUndatedDesignator(null, msgs);
			case _4Package.DOCUMENT_ROOT__STRING_NAME:
				return basicSetStringName(null, msgs);
			case _4Package.DOCUMENT_ROOT__STRONG:
				return basicSetStrong(null, msgs);
			case _4Package.DOCUMENT_ROOT__SUB:
				return basicSetSub(null, msgs);
			case _4Package.DOCUMENT_ROOT__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case _4Package.DOCUMENT_ROOT__SUP:
				return basicSetSup(null, msgs);
			case _4Package.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case _4Package.DOCUMENT_ROOT__TITLES:
				return basicSetTitles(null, msgs);
			case _4Package.DOCUMENT_ROOT__TT:
				return basicSetTt(null, msgs);
			case _4Package.DOCUMENT_ROOT__U:
				return basicSetU(null, msgs);
			case _4Package.DOCUMENT_ROOT__UNASSIGNED_CONTENT:
				return basicSetUnassignedContent(null, msgs);
			case _4Package.DOCUMENT_ROOT__UNSTRUCTURED_CITATION:
				return basicSetUnstructuredCitation(null, msgs);
			case _4Package.DOCUMENT_ROOT__UPDATE:
				return basicSetUpdate(null, msgs);
			case _4Package.DOCUMENT_ROOT__UPDATE_DATE:
				return basicSetUpdateDate(null, msgs);
			case _4Package.DOCUMENT_ROOT__UPDATES:
				return basicSetUpdates(null, msgs);
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
			case _4Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _4Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _4Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _4Package.DOCUMENT_ROOT__A:
				return getA();
			case _4Package.DOCUMENT_ROOT__ABBREV_TITLE:
				return getAbbrevTitle();
			case _4Package.DOCUMENT_ROOT__ACCEPTANCE_DATE:
				return getAcceptanceDate();
			case _4Package.DOCUMENT_ROOT__AFFILIATION:
				return getAffiliation();
			case _4Package.DOCUMENT_ROOT__ALT_NAME:
				return getAltName();
			case _4Package.DOCUMENT_ROOT__ANONYMOUS:
				return getAnonymous();
			case _4Package.DOCUMENT_ROOT__APPROVAL_DATE:
				return getApprovalDate();
			case _4Package.DOCUMENT_ROOT__ARCHIVE:
				return getArchive();
			case _4Package.DOCUMENT_ROOT__ARCHIVE_LOCATIONS:
				return getArchiveLocations();
			case _4Package.DOCUMENT_ROOT__ARTICLE_TITLE:
				return getArticleTitle();
			case _4Package.DOCUMENT_ROOT__ASSERTION:
				return getAssertion();
			case _4Package.DOCUMENT_ROOT__AUTHOR:
				return getAuthor();
			case _4Package.DOCUMENT_ROOT__B:
				return getB();
			case _4Package.DOCUMENT_ROOT__BODY:
				return getBody();
			case _4Package.DOCUMENT_ROOT__BOOK:
				return getBook();
			case _4Package.DOCUMENT_ROOT__BOOK_METADATA:
				return getBookMetadata();
			case _4Package.DOCUMENT_ROOT__BOOK_SERIES_METADATA:
				return getBookSeriesMetadata();
			case _4Package.DOCUMENT_ROOT__BOOK_SET_METADATA:
				return getBookSetMetadata();
			case _4Package.DOCUMENT_ROOT__CITATION:
				return getCitation();
			case _4Package.DOCUMENT_ROOT__CITATION_LIST:
				return getCitationList();
			case _4Package.DOCUMENT_ROOT__CODEN:
				return getCoden();
			case _4Package.DOCUMENT_ROOT__COLLECTION:
				return getCollection();
			case _4Package.DOCUMENT_ROOT__COMPETING_INTEREST_STATEMENT:
				return getCompetingInterestStatement();
			case _4Package.DOCUMENT_ROOT__COMPONENT:
				return getComponent();
			case _4Package.DOCUMENT_ROOT__COMPONENT_LIST:
				return getComponentList();
			case _4Package.DOCUMENT_ROOT__COMPONENT_NUMBER:
				return getComponentNumber();
			case _4Package.DOCUMENT_ROOT__CONFERENCE:
				return getConference();
			case _4Package.DOCUMENT_ROOT__CONFERENCE_ACRONYM:
				return getConferenceAcronym();
			case _4Package.DOCUMENT_ROOT__CONFERENCE_DATE:
				return getConferenceDate();
			case _4Package.DOCUMENT_ROOT__CONFERENCE_LOCATION:
				return getConferenceLocation();
			case _4Package.DOCUMENT_ROOT__CONFERENCE_NAME:
				return getConferenceName();
			case _4Package.DOCUMENT_ROOT__CONFERENCE_NUMBER:
				return getConferenceNumber();
			case _4Package.DOCUMENT_ROOT__CONFERENCE_PAPER:
				return getConferencePaper();
			case _4Package.DOCUMENT_ROOT__CONFERENCE_SPONSOR:
				return getConferenceSponsor();
			case _4Package.DOCUMENT_ROOT__CONFERENCE_THEME:
				return getConferenceTheme();
			case _4Package.DOCUMENT_ROOT__CONTENT_DATE:
				return getContentDate();
			case _4Package.DOCUMENT_ROOT__CONTENT_ITEM:
				return getContentItem();
			case _4Package.DOCUMENT_ROOT__CONTRACT_NUMBER:
				return getContractNumber();
			case _4Package.DOCUMENT_ROOT__CONTRIBUTORS:
				return getContributors();
			case _4Package.DOCUMENT_ROOT__CREATION_DATE:
				return getCreationDate();
			case _4Package.DOCUMENT_ROOT__CROSSMARK:
				return getCrossmark();
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAIN:
				return getCrossmarkDomain();
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAIN_EXCLUSIVE:
				return isCrossmarkDomainExclusive();
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAINS:
				return getCrossmarkDomains();
			case _4Package.DOCUMENT_ROOT__CROSSMARK_POLICY:
				return getCrossmarkPolicy();
			case _4Package.DOCUMENT_ROOT__CROSSMARK_VERSION:
				return getCrossmarkVersion();
			case _4Package.DOCUMENT_ROOT__CUSTOM_METADATA:
				return getCustomMetadata();
			case _4Package.DOCUMENT_ROOT__CYEAR:
				return getCYear();
			case _4Package.DOCUMENT_ROOT__DATABASE:
				return getDatabase();
			case _4Package.DOCUMENT_ROOT__DATABASE_DATE:
				return getDatabaseDate();
			case _4Package.DOCUMENT_ROOT__DATABASE_METADATA:
				return getDatabaseMetadata();
			case _4Package.DOCUMENT_ROOT__DATASET:
				return getDataset();
			case _4Package.DOCUMENT_ROOT__DAY:
				return getDay();
			case _4Package.DOCUMENT_ROOT__DEGREE:
				return getDegree();
			case _4Package.DOCUMENT_ROOT__DEGREES:
				return getDegrees();
			case _4Package.DOCUMENT_ROOT__DEPOSITOR:
				return getDepositor();
			case _4Package.DOCUMENT_ROOT__DEPOSITOR_NAME:
				return getDepositorName();
			case _4Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case _4Package.DOCUMENT_ROOT__DESIGNATORS:
				return getDesignators();
			case _4Package.DOCUMENT_ROOT__DISSERTATION:
				return getDissertation();
			case _4Package.DOCUMENT_ROOT__DOI:
				return getDoi();
			case _4Package.DOCUMENT_ROOT__DOI_BATCH:
				return getDoiBatch();
			case _4Package.DOCUMENT_ROOT__DOI_BATCH_ID:
				return getDoiBatchId();
			case _4Package.DOCUMENT_ROOT__DOI_DATA:
				return getDoiData();
			case _4Package.DOCUMENT_ROOT__DOMAIN:
				return getDomain();
			case _4Package.DOCUMENT_ROOT__EDITION_NUMBER:
				return getEditionNumber();
			case _4Package.DOCUMENT_ROOT__ELOCATION_ID:
				return getElocationId();
			case _4Package.DOCUMENT_ROOT__EM:
				return getEm();
			case _4Package.DOCUMENT_ROOT__EMAIL_ADDRESS:
				return getEmailAddress();
			case _4Package.DOCUMENT_ROOT__EVENT_METADATA:
				return getEventMetadata();
			case _4Package.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case _4Package.DOCUMENT_ROOT__FIRST_PAGE:
				return getFirstPage();
			case _4Package.DOCUMENT_ROOT__FONT:
				return getFont();
			case _4Package.DOCUMENT_ROOT__FORMAT:
				return getFormat();
			case _4Package.DOCUMENT_ROOT__FULL_TITLE:
				return getFullTitle();
			case _4Package.DOCUMENT_ROOT__GIVEN_NAME:
				return getGivenName();
			case _4Package.DOCUMENT_ROOT__GROUP_TITLE:
				return getGroupTitle();
			case _4Package.DOCUMENT_ROOT__HEAD:
				return getHead();
			case _4Package.DOCUMENT_ROOT__I:
				return getI();
			case _4Package.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier();
			case _4Package.DOCUMENT_ROOT__INSTITUTION:
				return getInstitution();
			case _4Package.DOCUMENT_ROOT__INSTITUTION_ACRONYM:
				return getInstitutionAcronym();
			case _4Package.DOCUMENT_ROOT__INSTITUTION_DEPARTMENT:
				return getInstitutionDepartment();
			case _4Package.DOCUMENT_ROOT__INSTITUTION_NAME:
				return getInstitutionName();
			case _4Package.DOCUMENT_ROOT__INSTITUTION_PLACE:
				return getInstitutionPlace();
			case _4Package.DOCUMENT_ROOT__INTENT_STATEMENT:
				return getIntentStatement();
			case _4Package.DOCUMENT_ROOT__ISBN:
				return getIsbn();
			case _4Package.DOCUMENT_ROOT__ISSN:
				return getIssn();
			case _4Package.DOCUMENT_ROOT__ISSUE:
				return getIssue();
			case _4Package.DOCUMENT_ROOT__ITEM:
				return getItem();
			case _4Package.DOCUMENT_ROOT__ITEM_NUMBER:
				return getItemNumber();
			case _4Package.DOCUMENT_ROOT__JOURNAL:
				return getJournal();
			case _4Package.DOCUMENT_ROOT__JOURNAL_ARTICLE:
				return getJournalArticle();
			case _4Package.DOCUMENT_ROOT__JOURNAL_ISSUE:
				return getJournalIssue();
			case _4Package.DOCUMENT_ROOT__JOURNAL_METADATA:
				return getJournalMetadata();
			case _4Package.DOCUMENT_ROOT__JOURNAL_TITLE:
				return getJournalTitle();
			case _4Package.DOCUMENT_ROOT__JOURNAL_VOLUME:
				return getJournalVolume();
			case _4Package.DOCUMENT_ROOT__LAST_PAGE:
				return getLastPage();
			case _4Package.DOCUMENT_ROOT__MONTH:
				return getMonth();
			case _4Package.DOCUMENT_ROOT__NAME:
				return getName();
			case _4Package.DOCUMENT_ROOT__NOISBN:
				return getNoisbn();
			case _4Package.DOCUMENT_ROOT__ORCID:
				return getORCID();
			case _4Package.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization();
			case _4Package.DOCUMENT_ROOT__ORIGINAL_LANGUAGE_TITLE:
				return getOriginalLanguageTitle();
			case _4Package.DOCUMENT_ROOT__OTHER_PAGES:
				return getOtherPages();
			case _4Package.DOCUMENT_ROOT__OVL:
				return getOvl();
			case _4Package.DOCUMENT_ROOT__PAGES:
				return getPages();
			case _4Package.DOCUMENT_ROOT__PART_NUMBER:
				return getPartNumber();
			case _4Package.DOCUMENT_ROOT__PEER_REVIEW:
				return getPeerReview();
			case _4Package.DOCUMENT_ROOT__PENDING_PUBLICATION:
				return getPendingPublication();
			case _4Package.DOCUMENT_ROOT__PERSON_NAME:
				return getPersonName();
			case _4Package.DOCUMENT_ROOT__POSTED_CONTENT:
				return getPostedContent();
			case _4Package.DOCUMENT_ROOT__POSTED_DATE:
				return getPostedDate();
			case _4Package.DOCUMENT_ROOT__PREFIX:
				return getPrefix();
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_METADATA:
				return getProceedingsMetadata();
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_SERIES_METADATA:
				return getProceedingsSeriesMetadata();
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_SUBJECT:
				return getProceedingsSubject();
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_TITLE:
				return getProceedingsTitle();
			case _4Package.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case _4Package.DOCUMENT_ROOT__PUBLICATION:
				return getPublication();
			case _4Package.DOCUMENT_ROOT__PUBLICATION_DATE:
				return getPublicationDate();
			case _4Package.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher();
			case _4Package.DOCUMENT_ROOT__PUBLISHER_ITEM:
				return getPublisherItem();
			case _4Package.DOCUMENT_ROOT__PUBLISHER_NAME:
				return getPublisherName();
			case _4Package.DOCUMENT_ROOT__PUBLISHER_PLACE:
				return getPublisherPlace();
			case _4Package.DOCUMENT_ROOT__REGISTRANT:
				return getRegistrant();
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER:
				return getReportPaper();
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER_METADATA:
				return getReportPaperMetadata();
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER_SERIES_METADATA:
				return getReportPaperSeriesMetadata();
			case _4Package.DOCUMENT_ROOT__RESOURCE:
				return getResource();
			case _4Package.DOCUMENT_ROOT__REVIEW_DATE:
				return getReviewDate();
			case _4Package.DOCUMENT_ROOT__RUNNING_NUMBER:
				return getRunningNumber();
			case _4Package.DOCUMENT_ROOT__SA_COMPONENT:
				return getSaComponent();
			case _4Package.DOCUMENT_ROOT__SCN_POLICIES:
				return getScnPolicies();
			case _4Package.DOCUMENT_ROOT__SCN_POLICY_REF:
				return getScnPolicyRef();
			case _4Package.DOCUMENT_ROOT__SCN_POLICY_SET:
				return getScnPolicySet();
			case _4Package.DOCUMENT_ROOT__SCP:
				return getScp();
			case _4Package.DOCUMENT_ROOT__SERIES_METADATA:
				return getSeriesMetadata();
			case _4Package.DOCUMENT_ROOT__SERIES_NUMBER:
				return getSeriesNumber();
			case _4Package.DOCUMENT_ROOT__SERIES_TITLE:
				return getSeriesTitle();
			case _4Package.DOCUMENT_ROOT__SET_METADATA:
				return getSetMetadata();
			case _4Package.DOCUMENT_ROOT__SPECIAL_NUMBERING:
				return getSpecialNumbering();
			case _4Package.DOCUMENT_ROOT__STANDARD:
				return getStandard();
			case _4Package.DOCUMENT_ROOT__STANDARD_METADATA:
				return getStandardMetadata();
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY:
				return getStandardsBody();
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY_ACRONYM:
				return getStandardsBodyAcronym();
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY_NAME:
				return getStandardsBodyName();
			case _4Package.DOCUMENT_ROOT__STD_ADOPTED_FROM:
				return getStdAdoptedFrom();
			case _4Package.DOCUMENT_ROOT__STD_ALT_AS_PUBLISHED:
				return getStdAltAsPublished();
			case _4Package.DOCUMENT_ROOT__STD_ALT_SCRIPT:
				return getStdAltScript();
			case _4Package.DOCUMENT_ROOT__STD_AS_PUBLISHED:
				return getStdAsPublished();
			case _4Package.DOCUMENT_ROOT__STD_DESIGNATOR:
				return getStdDesignator();
			case _4Package.DOCUMENT_ROOT__STD_FAMILY_DESIGNATOR:
				return getStdFamilyDesignator();
			case _4Package.DOCUMENT_ROOT__STD_REVISION_OF:
				return getStdRevisionOf();
			case _4Package.DOCUMENT_ROOT__STD_SET_DESIGNATOR:
				return getStdSetDesignator();
			case _4Package.DOCUMENT_ROOT__STD_SUPERSEDES:
				return getStdSupersedes();
			case _4Package.DOCUMENT_ROOT__STD_UNDATED_DESIGNATOR:
				return getStdUndatedDesignator();
			case _4Package.DOCUMENT_ROOT__STD_VARIANT_FORM:
				return getStdVariantForm();
			case _4Package.DOCUMENT_ROOT__STRING_NAME:
				return getStringName();
			case _4Package.DOCUMENT_ROOT__STRONG:
				return getStrong();
			case _4Package.DOCUMENT_ROOT__SUB:
				return getSub();
			case _4Package.DOCUMENT_ROOT__SUBTITLE:
				return getSubtitle();
			case _4Package.DOCUMENT_ROOT__SUFFIX:
				return getSuffix();
			case _4Package.DOCUMENT_ROOT__SUP:
				return getSup();
			case _4Package.DOCUMENT_ROOT__SURNAME:
				return getSurname();
			case _4Package.DOCUMENT_ROOT__TIMESTAMP:
				return getTimestamp();
			case _4Package.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case _4Package.DOCUMENT_ROOT__TITLES:
				return getTitles();
			case _4Package.DOCUMENT_ROOT__TT:
				return getTt();
			case _4Package.DOCUMENT_ROOT__U:
				return getU();
			case _4Package.DOCUMENT_ROOT__UNASSIGNED_CONTENT:
				return getUnassignedContent();
			case _4Package.DOCUMENT_ROOT__UNSTRUCTURED_CITATION:
				return getUnstructuredCitation();
			case _4Package.DOCUMENT_ROOT__UPDATE:
				return getUpdate();
			case _4Package.DOCUMENT_ROOT__UPDATE_DATE:
				return getUpdateDate();
			case _4Package.DOCUMENT_ROOT__UPDATES:
				return getUpdates();
			case _4Package.DOCUMENT_ROOT__VOLUME:
				return getVolume();
			case _4Package.DOCUMENT_ROOT__VOLUME_TITLE:
				return getVolumeTitle();
			case _4Package.DOCUMENT_ROOT__YEAR:
				return getYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _4Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _4Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _4Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _4Package.DOCUMENT_ROOT__A:
				setA((AType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ABBREV_TITLE:
				setAbbrevTitle((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ACCEPTANCE_DATE:
				setAcceptanceDate((AcceptanceDateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__AFFILIATION:
				setAffiliation((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ALT_NAME:
				setAltName((AltNameType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ANONYMOUS:
				setAnonymous((AnonymousType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__APPROVAL_DATE:
				setApprovalDate((ApprovalDateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ARCHIVE:
				setArchive((ArchiveType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ARTICLE_TITLE:
				setArticleTitle((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ASSERTION:
				setAssertion((AssertionType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__B:
				setB((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__BODY:
				setBody((BodyType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__BOOK:
				setBook((BookType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__BOOK_METADATA:
				setBookMetadata((BookMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__BOOK_SERIES_METADATA:
				setBookSeriesMetadata((BookSeriesMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__BOOK_SET_METADATA:
				setBookSetMetadata((BookSetMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CITATION:
				setCitation((CitationType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CITATION_LIST:
				setCitationList((CitationListType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CODEN:
				setCoden((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__COLLECTION:
				setCollection((CollectionType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__COMPETING_INTEREST_STATEMENT:
				setCompetingInterestStatement((CompetingInterestStatementType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__COMPONENT:
				setComponent((ComponentType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__COMPONENT_LIST:
				setComponentList((ComponentListType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__COMPONENT_NUMBER:
				setComponentNumber((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE:
				setConference((ConferenceType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_ACRONYM:
				setConferenceAcronym((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_DATE:
				setConferenceDate((ConferenceDateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_LOCATION:
				setConferenceLocation((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_NAME:
				setConferenceName((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_NUMBER:
				setConferenceNumber((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_PAPER:
				setConferencePaper((ConferencePaperType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_SPONSOR:
				setConferenceSponsor((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_THEME:
				setConferenceTheme((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONTENT_DATE:
				setContentDate((ContentDateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONTENT_ITEM:
				setContentItem((ContentItemType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONTRACT_NUMBER:
				setContractNumber((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CONTRIBUTORS:
				setContributors((ContributorsType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CREATION_DATE:
				setCreationDate((CreationDateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK:
				setCrossmark((CrossmarkType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAIN:
				setCrossmarkDomain((CrossmarkDomainType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAIN_EXCLUSIVE:
				setCrossmarkDomainExclusive((Boolean)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAINS:
				setCrossmarkDomains((CrossmarkDomainsType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_POLICY:
				setCrossmarkPolicy((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_VERSION:
				setCrossmarkVersion((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CUSTOM_METADATA:
				setCustomMetadata((CustomMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__CYEAR:
				setCYear((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DATABASE:
				setDatabase((DatabaseType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DATABASE_DATE:
				setDatabaseDate((DatabaseDateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DATABASE_METADATA:
				setDatabaseMetadata((DatabaseMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DATASET:
				setDataset((DatasetType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DAY:
				setDay((BigInteger)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DEGREE:
				setDegree((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DEGREES:
				setDegrees((DegreesType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DEPOSITOR:
				setDepositor((DepositorType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DEPOSITOR_NAME:
				setDepositorName((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DESIGNATORS:
				setDesignators((DesignatorsType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DISSERTATION:
				setDissertation((DissertationType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DOI:
				setDoi((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DOI_BATCH:
				setDoiBatch((DoiBatchType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DOI_BATCH_ID:
				setDoiBatchId((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DOI_DATA:
				setDoiData((DoiDataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__DOMAIN:
				setDomain((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__EDITION_NUMBER:
				setEditionNumber((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ELOCATION_ID:
				setElocationId((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__EM:
				setEm((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__EMAIL_ADDRESS:
				setEmailAddress((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__EVENT_METADATA:
				setEventMetadata((EventMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__FILTER:
				setFilter((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__FIRST_PAGE:
				setFirstPage((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__FONT:
				setFont((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__FORMAT:
				setFormat((FormatType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__FULL_TITLE:
				setFullTitle((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__GROUP_TITLE:
				setGroupTitle((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__HEAD:
				setHead((HeadType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__I:
				setI((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((IdentifierType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__INSTITUTION:
				setInstitution((InstitutionType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__INSTITUTION_ACRONYM:
				setInstitutionAcronym((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__INSTITUTION_DEPARTMENT:
				setInstitutionDepartment((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__INSTITUTION_NAME:
				setInstitutionName((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__INSTITUTION_PLACE:
				setInstitutionPlace((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__INTENT_STATEMENT:
				setIntentStatement((IntentStatementType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ISBN:
				setIsbn((IsbnType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ISSN:
				setIssn((IssnType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ISSUE:
				setIssue((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ITEM:
				setItem((ItemType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ITEM_NUMBER:
				setItemNumber((ItemNumberType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL:
				setJournal((JournalType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL_ARTICLE:
				setJournalArticle((JournalArticleType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL_ISSUE:
				setJournalIssue((JournalIssueType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL_METADATA:
				setJournalMetadata((JournalMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL_TITLE:
				setJournalTitle((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL_VOLUME:
				setJournalVolume((JournalVolumeType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__LAST_PAGE:
				setLastPage((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__MONTH:
				setMonth((BigInteger)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__NAME:
				setName((NameType1)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__NOISBN:
				setNoisbn((NoisbnType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ORCID:
				setORCID((ORCIDType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((OrganizationType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__ORIGINAL_LANGUAGE_TITLE:
				setOriginalLanguageTitle((OriginalLanguageTitleType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__OTHER_PAGES:
				setOtherPages((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__OVL:
				setOvl((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PAGES:
				setPages((PagesType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PART_NUMBER:
				setPartNumber((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PEER_REVIEW:
				setPeerReview((PeerReviewType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PENDING_PUBLICATION:
				setPendingPublication((PendingPublicationType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PERSON_NAME:
				setPersonName((PersonNameType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__POSTED_CONTENT:
				setPostedContent((PostedContentType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__POSTED_DATE:
				setPostedDate((PostedDateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PREFIX:
				setPrefix((PrefixType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_METADATA:
				setProceedingsMetadata((ProceedingsMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_SERIES_METADATA:
				setProceedingsSeriesMetadata((ProceedingsSeriesMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_SUBJECT:
				setProceedingsSubject((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_TITLE:
				setProceedingsTitle((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLICATION:
				setPublication((PublicationType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLICATION_DATE:
				setPublicationDate((PublicationDateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((PublisherType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLISHER_ITEM:
				setPublisherItem((PublisherItemType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLISHER_NAME:
				setPublisherName((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLISHER_PLACE:
				setPublisherPlace((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__REGISTRANT:
				setRegistrant((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER:
				setReportPaper((ReportPaperType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER_METADATA:
				setReportPaperMetadata((ReportPaperMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER_SERIES_METADATA:
				setReportPaperSeriesMetadata((ReportPaperSeriesMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__RESOURCE:
				setResource((ResourceType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__REVIEW_DATE:
				setReviewDate((ReviewDateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__RUNNING_NUMBER:
				setRunningNumber((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SA_COMPONENT:
				setSaComponent((SaComponentType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SCN_POLICIES:
				setScnPolicies((ScnPoliciesType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SCN_POLICY_REF:
				setScnPolicyRef((ScnPolicyRefType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SCN_POLICY_SET:
				setScnPolicySet((ScnPolicySetType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SCP:
				setScp((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SERIES_METADATA:
				setSeriesMetadata((SeriesMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SERIES_NUMBER:
				setSeriesNumber((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SERIES_TITLE:
				setSeriesTitle((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SET_METADATA:
				setSetMetadata((SetMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SPECIAL_NUMBERING:
				setSpecialNumbering((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STANDARD:
				setStandard((StandardType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STANDARD_METADATA:
				setStandardMetadata((StandardMetadataType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY:
				setStandardsBody((StandardsBodyType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY_ACRONYM:
				setStandardsBodyAcronym((EObject)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY_NAME:
				setStandardsBodyName((EObject)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_ADOPTED_FROM:
				setStdAdoptedFrom((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_ALT_AS_PUBLISHED:
				setStdAltAsPublished((StdAltAsPublishedType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_ALT_SCRIPT:
				setStdAltScript((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_AS_PUBLISHED:
				setStdAsPublished((StdAsPublishedType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_DESIGNATOR:
				setStdDesignator((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_FAMILY_DESIGNATOR:
				setStdFamilyDesignator((StdDesignatorT)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_REVISION_OF:
				setStdRevisionOf((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_SET_DESIGNATOR:
				setStdSetDesignator((StdSetDesignatorType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_SUPERSEDES:
				setStdSupersedes((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_UNDATED_DESIGNATOR:
				setStdUndatedDesignator((StdUndatedDesignatorType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STD_VARIANT_FORM:
				setStdVariantForm((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STRING_NAME:
				setStringName((StringNameType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__STRONG:
				setStrong((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SUB:
				setSub((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SUBTITLE:
				setSubtitle((SubtitleType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SUFFIX:
				setSuffix((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SUP:
				setSup((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__SURNAME:
				setSurname((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__TIMESTAMP:
				setTimestamp((BigInteger)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__TITLES:
				setTitles((TitlesType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__TT:
				setTt((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__U:
				setU((XrefFaces)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__UNASSIGNED_CONTENT:
				setUnassignedContent((UnassignedContentType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__UNSTRUCTURED_CITATION:
				setUnstructuredCitation((UnstructuredCitationType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__UPDATE:
				setUpdate((UpdateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__UPDATE_DATE:
				setUpdateDate((UpdateDateType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__UPDATES:
				setUpdates((UpdatesType)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__VOLUME:
				setVolume((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__VOLUME_TITLE:
				setVolumeTitle((String)newValue);
				return;
			case _4Package.DOCUMENT_ROOT__YEAR:
				setYear((BigInteger)newValue);
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
			case _4Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _4Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _4Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _4Package.DOCUMENT_ROOT__A:
				setA((AType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ABBREV_TITLE:
				setAbbrevTitle(ABBREV_TITLE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__ACCEPTANCE_DATE:
				setAcceptanceDate((AcceptanceDateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__AFFILIATION:
				setAffiliation(AFFILIATION_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__ALT_NAME:
				setAltName((AltNameType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ANONYMOUS:
				setAnonymous((AnonymousType)null);
				return;
			case _4Package.DOCUMENT_ROOT__APPROVAL_DATE:
				setApprovalDate((ApprovalDateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ARCHIVE:
				setArchive((ArchiveType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ARCHIVE_LOCATIONS:
				setArchiveLocations((ArchiveLocationsType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ARTICLE_TITLE:
				setArticleTitle(ARTICLE_TITLE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__ASSERTION:
				setAssertion((AssertionType)null);
				return;
			case _4Package.DOCUMENT_ROOT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__B:
				setB((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__BODY:
				setBody((BodyType)null);
				return;
			case _4Package.DOCUMENT_ROOT__BOOK:
				setBook((BookType)null);
				return;
			case _4Package.DOCUMENT_ROOT__BOOK_METADATA:
				setBookMetadata((BookMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__BOOK_SERIES_METADATA:
				setBookSeriesMetadata((BookSeriesMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__BOOK_SET_METADATA:
				setBookSetMetadata((BookSetMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CITATION:
				setCitation((CitationType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CITATION_LIST:
				setCitationList((CitationListType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CODEN:
				setCoden(CODEN_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__COLLECTION:
				setCollection((CollectionType)null);
				return;
			case _4Package.DOCUMENT_ROOT__COMPETING_INTEREST_STATEMENT:
				setCompetingInterestStatement((CompetingInterestStatementType)null);
				return;
			case _4Package.DOCUMENT_ROOT__COMPONENT:
				setComponent((ComponentType)null);
				return;
			case _4Package.DOCUMENT_ROOT__COMPONENT_LIST:
				setComponentList((ComponentListType)null);
				return;
			case _4Package.DOCUMENT_ROOT__COMPONENT_NUMBER:
				setComponentNumber(COMPONENT_NUMBER_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE:
				setConference((ConferenceType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_ACRONYM:
				setConferenceAcronym(CONFERENCE_ACRONYM_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_DATE:
				setConferenceDate((ConferenceDateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_LOCATION:
				setConferenceLocation(CONFERENCE_LOCATION_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_NAME:
				setConferenceName(CONFERENCE_NAME_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_NUMBER:
				setConferenceNumber(CONFERENCE_NUMBER_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_PAPER:
				setConferencePaper((ConferencePaperType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_SPONSOR:
				setConferenceSponsor(CONFERENCE_SPONSOR_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_THEME:
				setConferenceTheme(CONFERENCE_THEME_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CONTENT_DATE:
				setContentDate((ContentDateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CONTENT_ITEM:
				setContentItem((ContentItemType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CONTRACT_NUMBER:
				setContractNumber(CONTRACT_NUMBER_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CONTRIBUTORS:
				setContributors((ContributorsType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CREATION_DATE:
				setCreationDate((CreationDateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK:
				setCrossmark((CrossmarkType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAIN:
				setCrossmarkDomain((CrossmarkDomainType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAIN_EXCLUSIVE:
				setCrossmarkDomainExclusive(CROSSMARK_DOMAIN_EXCLUSIVE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAINS:
				setCrossmarkDomains((CrossmarkDomainsType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_POLICY:
				setCrossmarkPolicy(CROSSMARK_POLICY_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_VERSION:
				setCrossmarkVersion(CROSSMARK_VERSION_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__CUSTOM_METADATA:
				setCustomMetadata((CustomMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__CYEAR:
				setCYear(CYEAR_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__DATABASE:
				setDatabase((DatabaseType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DATABASE_DATE:
				setDatabaseDate((DatabaseDateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DATABASE_METADATA:
				setDatabaseMetadata((DatabaseMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DATASET:
				setDataset((DatasetType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__DEGREE:
				setDegree(DEGREE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__DEGREES:
				setDegrees((DegreesType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DEPOSITOR:
				setDepositor((DepositorType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DEPOSITOR_NAME:
				setDepositorName(DEPOSITOR_NAME_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DESIGNATORS:
				setDesignators((DesignatorsType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DISSERTATION:
				setDissertation((DissertationType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DOI:
				setDoi(DOI_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__DOI_BATCH:
				setDoiBatch((DoiBatchType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DOI_BATCH_ID:
				setDoiBatchId(DOI_BATCH_ID_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__DOI_DATA:
				setDoiData((DoiDataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__EDITION_NUMBER:
				setEditionNumber(EDITION_NUMBER_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__ELOCATION_ID:
				setElocationId(ELOCATION_ID_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__EM:
				setEm((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__EMAIL_ADDRESS:
				setEmailAddress(EMAIL_ADDRESS_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__EVENT_METADATA:
				setEventMetadata((EventMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__FIRST_PAGE:
				setFirstPage(FIRST_PAGE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__FONT:
				setFont((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__FORMAT:
				setFormat((FormatType)null);
				return;
			case _4Package.DOCUMENT_ROOT__FULL_TITLE:
				setFullTitle(FULL_TITLE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__GIVEN_NAME:
				setGivenName(GIVEN_NAME_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__GROUP_TITLE:
				setGroupTitle(GROUP_TITLE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__HEAD:
				setHead((HeadType)null);
				return;
			case _4Package.DOCUMENT_ROOT__I:
				setI((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((IdentifierType)null);
				return;
			case _4Package.DOCUMENT_ROOT__INSTITUTION:
				setInstitution((InstitutionType)null);
				return;
			case _4Package.DOCUMENT_ROOT__INSTITUTION_ACRONYM:
				setInstitutionAcronym(INSTITUTION_ACRONYM_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__INSTITUTION_DEPARTMENT:
				setInstitutionDepartment(INSTITUTION_DEPARTMENT_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__INSTITUTION_NAME:
				setInstitutionName(INSTITUTION_NAME_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__INSTITUTION_PLACE:
				setInstitutionPlace(INSTITUTION_PLACE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__INTENT_STATEMENT:
				setIntentStatement((IntentStatementType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ISBN:
				setIsbn((IsbnType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ISSN:
				setIssn((IssnType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__ITEM:
				setItem((ItemType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ITEM_NUMBER:
				setItemNumber((ItemNumberType)null);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL:
				setJournal((JournalType)null);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL_ARTICLE:
				setJournalArticle((JournalArticleType)null);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL_ISSUE:
				setJournalIssue((JournalIssueType)null);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL_METADATA:
				setJournalMetadata((JournalMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL_TITLE:
				setJournalTitle(JOURNAL_TITLE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__JOURNAL_VOLUME:
				setJournalVolume((JournalVolumeType)null);
				return;
			case _4Package.DOCUMENT_ROOT__LAST_PAGE:
				setLastPage(LAST_PAGE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__NAME:
				setName((NameType1)null);
				return;
			case _4Package.DOCUMENT_ROOT__NOISBN:
				setNoisbn((NoisbnType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ORCID:
				setORCID((ORCIDType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((OrganizationType)null);
				return;
			case _4Package.DOCUMENT_ROOT__ORIGINAL_LANGUAGE_TITLE:
				setOriginalLanguageTitle((OriginalLanguageTitleType)null);
				return;
			case _4Package.DOCUMENT_ROOT__OTHER_PAGES:
				setOtherPages(OTHER_PAGES_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__OVL:
				setOvl((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__PAGES:
				setPages((PagesType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PART_NUMBER:
				setPartNumber(PART_NUMBER_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__PEER_REVIEW:
				setPeerReview((PeerReviewType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PENDING_PUBLICATION:
				setPendingPublication((PendingPublicationType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PERSON_NAME:
				setPersonName((PersonNameType)null);
				return;
			case _4Package.DOCUMENT_ROOT__POSTED_CONTENT:
				setPostedContent((PostedContentType)null);
				return;
			case _4Package.DOCUMENT_ROOT__POSTED_DATE:
				setPostedDate((PostedDateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PREFIX:
				setPrefix((PrefixType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_METADATA:
				setProceedingsMetadata((ProceedingsMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_SERIES_METADATA:
				setProceedingsSeriesMetadata((ProceedingsSeriesMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_SUBJECT:
				setProceedingsSubject(PROCEEDINGS_SUBJECT_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_TITLE:
				setProceedingsTitle(PROCEEDINGS_TITLE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLICATION:
				setPublication((PublicationType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLICATION_DATE:
				setPublicationDate((PublicationDateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((PublisherType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLISHER_ITEM:
				setPublisherItem((PublisherItemType)null);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLISHER_NAME:
				setPublisherName(PUBLISHER_NAME_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__PUBLISHER_PLACE:
				setPublisherPlace(PUBLISHER_PLACE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__REGISTRANT:
				setRegistrant(REGISTRANT_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER:
				setReportPaper((ReportPaperType)null);
				return;
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER_METADATA:
				setReportPaperMetadata((ReportPaperMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER_SERIES_METADATA:
				setReportPaperSeriesMetadata((ReportPaperSeriesMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__RESOURCE:
				setResource((ResourceType)null);
				return;
			case _4Package.DOCUMENT_ROOT__REVIEW_DATE:
				setReviewDate((ReviewDateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__RUNNING_NUMBER:
				setRunningNumber(RUNNING_NUMBER_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__SA_COMPONENT:
				setSaComponent((SaComponentType)null);
				return;
			case _4Package.DOCUMENT_ROOT__SCN_POLICIES:
				setScnPolicies((ScnPoliciesType)null);
				return;
			case _4Package.DOCUMENT_ROOT__SCN_POLICY_REF:
				setScnPolicyRef((ScnPolicyRefType)null);
				return;
			case _4Package.DOCUMENT_ROOT__SCN_POLICY_SET:
				setScnPolicySet((ScnPolicySetType)null);
				return;
			case _4Package.DOCUMENT_ROOT__SCP:
				setScp((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__SERIES_METADATA:
				setSeriesMetadata((SeriesMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__SERIES_NUMBER:
				setSeriesNumber(SERIES_NUMBER_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__SERIES_TITLE:
				setSeriesTitle(SERIES_TITLE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__SET_METADATA:
				setSetMetadata((SetMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__SPECIAL_NUMBERING:
				setSpecialNumbering(SPECIAL_NUMBERING_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__STANDARD:
				setStandard((StandardType)null);
				return;
			case _4Package.DOCUMENT_ROOT__STANDARD_METADATA:
				setStandardMetadata((StandardMetadataType)null);
				return;
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY:
				setStandardsBody((StandardsBodyType)null);
				return;
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY_ACRONYM:
				setStandardsBodyAcronym((EObject)null);
				return;
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY_NAME:
				setStandardsBodyName((EObject)null);
				return;
			case _4Package.DOCUMENT_ROOT__STD_ADOPTED_FROM:
				setStdAdoptedFrom(STD_ADOPTED_FROM_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__STD_ALT_AS_PUBLISHED:
				setStdAltAsPublished((StdAltAsPublishedType)null);
				return;
			case _4Package.DOCUMENT_ROOT__STD_ALT_SCRIPT:
				setStdAltScript(STD_ALT_SCRIPT_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__STD_AS_PUBLISHED:
				setStdAsPublished((StdAsPublishedType)null);
				return;
			case _4Package.DOCUMENT_ROOT__STD_DESIGNATOR:
				setStdDesignator(STD_DESIGNATOR_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__STD_FAMILY_DESIGNATOR:
				setStdFamilyDesignator((StdDesignatorT)null);
				return;
			case _4Package.DOCUMENT_ROOT__STD_REVISION_OF:
				setStdRevisionOf(STD_REVISION_OF_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__STD_SET_DESIGNATOR:
				setStdSetDesignator((StdSetDesignatorType)null);
				return;
			case _4Package.DOCUMENT_ROOT__STD_SUPERSEDES:
				setStdSupersedes(STD_SUPERSEDES_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__STD_UNDATED_DESIGNATOR:
				setStdUndatedDesignator((StdUndatedDesignatorType)null);
				return;
			case _4Package.DOCUMENT_ROOT__STD_VARIANT_FORM:
				setStdVariantForm(STD_VARIANT_FORM_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__STRING_NAME:
				setStringName((StringNameType)null);
				return;
			case _4Package.DOCUMENT_ROOT__STRONG:
				setStrong((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__SUB:
				setSub((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__SUBTITLE:
				setSubtitle((SubtitleType)null);
				return;
			case _4Package.DOCUMENT_ROOT__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__SUP:
				setSup((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)null);
				return;
			case _4Package.DOCUMENT_ROOT__TITLES:
				setTitles((TitlesType)null);
				return;
			case _4Package.DOCUMENT_ROOT__TT:
				setTt((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__U:
				setU((XrefFaces)null);
				return;
			case _4Package.DOCUMENT_ROOT__UNASSIGNED_CONTENT:
				setUnassignedContent((UnassignedContentType)null);
				return;
			case _4Package.DOCUMENT_ROOT__UNSTRUCTURED_CITATION:
				setUnstructuredCitation((UnstructuredCitationType)null);
				return;
			case _4Package.DOCUMENT_ROOT__UPDATE:
				setUpdate((UpdateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__UPDATE_DATE:
				setUpdateDate((UpdateDateType)null);
				return;
			case _4Package.DOCUMENT_ROOT__UPDATES:
				setUpdates((UpdatesType)null);
				return;
			case _4Package.DOCUMENT_ROOT__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__VOLUME_TITLE:
				setVolumeTitle(VOLUME_TITLE_EDEFAULT);
				return;
			case _4Package.DOCUMENT_ROOT__YEAR:
				setYear(YEAR_EDEFAULT);
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
			case _4Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _4Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _4Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _4Package.DOCUMENT_ROOT__A:
				return getA() != null;
			case _4Package.DOCUMENT_ROOT__ABBREV_TITLE:
				return ABBREV_TITLE_EDEFAULT == null ? getAbbrevTitle() != null : !ABBREV_TITLE_EDEFAULT.equals(getAbbrevTitle());
			case _4Package.DOCUMENT_ROOT__ACCEPTANCE_DATE:
				return getAcceptanceDate() != null;
			case _4Package.DOCUMENT_ROOT__AFFILIATION:
				return AFFILIATION_EDEFAULT == null ? getAffiliation() != null : !AFFILIATION_EDEFAULT.equals(getAffiliation());
			case _4Package.DOCUMENT_ROOT__ALT_NAME:
				return getAltName() != null;
			case _4Package.DOCUMENT_ROOT__ANONYMOUS:
				return getAnonymous() != null;
			case _4Package.DOCUMENT_ROOT__APPROVAL_DATE:
				return getApprovalDate() != null;
			case _4Package.DOCUMENT_ROOT__ARCHIVE:
				return getArchive() != null;
			case _4Package.DOCUMENT_ROOT__ARCHIVE_LOCATIONS:
				return getArchiveLocations() != null;
			case _4Package.DOCUMENT_ROOT__ARTICLE_TITLE:
				return ARTICLE_TITLE_EDEFAULT == null ? getArticleTitle() != null : !ARTICLE_TITLE_EDEFAULT.equals(getArticleTitle());
			case _4Package.DOCUMENT_ROOT__ASSERTION:
				return getAssertion() != null;
			case _4Package.DOCUMENT_ROOT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? getAuthor() != null : !AUTHOR_EDEFAULT.equals(getAuthor());
			case _4Package.DOCUMENT_ROOT__B:
				return getB() != null;
			case _4Package.DOCUMENT_ROOT__BODY:
				return getBody() != null;
			case _4Package.DOCUMENT_ROOT__BOOK:
				return getBook() != null;
			case _4Package.DOCUMENT_ROOT__BOOK_METADATA:
				return getBookMetadata() != null;
			case _4Package.DOCUMENT_ROOT__BOOK_SERIES_METADATA:
				return getBookSeriesMetadata() != null;
			case _4Package.DOCUMENT_ROOT__BOOK_SET_METADATA:
				return getBookSetMetadata() != null;
			case _4Package.DOCUMENT_ROOT__CITATION:
				return getCitation() != null;
			case _4Package.DOCUMENT_ROOT__CITATION_LIST:
				return getCitationList() != null;
			case _4Package.DOCUMENT_ROOT__CODEN:
				return CODEN_EDEFAULT == null ? getCoden() != null : !CODEN_EDEFAULT.equals(getCoden());
			case _4Package.DOCUMENT_ROOT__COLLECTION:
				return getCollection() != null;
			case _4Package.DOCUMENT_ROOT__COMPETING_INTEREST_STATEMENT:
				return getCompetingInterestStatement() != null;
			case _4Package.DOCUMENT_ROOT__COMPONENT:
				return getComponent() != null;
			case _4Package.DOCUMENT_ROOT__COMPONENT_LIST:
				return getComponentList() != null;
			case _4Package.DOCUMENT_ROOT__COMPONENT_NUMBER:
				return COMPONENT_NUMBER_EDEFAULT == null ? getComponentNumber() != null : !COMPONENT_NUMBER_EDEFAULT.equals(getComponentNumber());
			case _4Package.DOCUMENT_ROOT__CONFERENCE:
				return getConference() != null;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_ACRONYM:
				return CONFERENCE_ACRONYM_EDEFAULT == null ? getConferenceAcronym() != null : !CONFERENCE_ACRONYM_EDEFAULT.equals(getConferenceAcronym());
			case _4Package.DOCUMENT_ROOT__CONFERENCE_DATE:
				return getConferenceDate() != null;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_LOCATION:
				return CONFERENCE_LOCATION_EDEFAULT == null ? getConferenceLocation() != null : !CONFERENCE_LOCATION_EDEFAULT.equals(getConferenceLocation());
			case _4Package.DOCUMENT_ROOT__CONFERENCE_NAME:
				return CONFERENCE_NAME_EDEFAULT == null ? getConferenceName() != null : !CONFERENCE_NAME_EDEFAULT.equals(getConferenceName());
			case _4Package.DOCUMENT_ROOT__CONFERENCE_NUMBER:
				return CONFERENCE_NUMBER_EDEFAULT == null ? getConferenceNumber() != null : !CONFERENCE_NUMBER_EDEFAULT.equals(getConferenceNumber());
			case _4Package.DOCUMENT_ROOT__CONFERENCE_PAPER:
				return getConferencePaper() != null;
			case _4Package.DOCUMENT_ROOT__CONFERENCE_SPONSOR:
				return CONFERENCE_SPONSOR_EDEFAULT == null ? getConferenceSponsor() != null : !CONFERENCE_SPONSOR_EDEFAULT.equals(getConferenceSponsor());
			case _4Package.DOCUMENT_ROOT__CONFERENCE_THEME:
				return CONFERENCE_THEME_EDEFAULT == null ? getConferenceTheme() != null : !CONFERENCE_THEME_EDEFAULT.equals(getConferenceTheme());
			case _4Package.DOCUMENT_ROOT__CONTENT_DATE:
				return getContentDate() != null;
			case _4Package.DOCUMENT_ROOT__CONTENT_ITEM:
				return getContentItem() != null;
			case _4Package.DOCUMENT_ROOT__CONTRACT_NUMBER:
				return CONTRACT_NUMBER_EDEFAULT == null ? getContractNumber() != null : !CONTRACT_NUMBER_EDEFAULT.equals(getContractNumber());
			case _4Package.DOCUMENT_ROOT__CONTRIBUTORS:
				return getContributors() != null;
			case _4Package.DOCUMENT_ROOT__CREATION_DATE:
				return getCreationDate() != null;
			case _4Package.DOCUMENT_ROOT__CROSSMARK:
				return getCrossmark() != null;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAIN:
				return getCrossmarkDomain() != null;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAIN_EXCLUSIVE:
				return isCrossmarkDomainExclusive() != CROSSMARK_DOMAIN_EXCLUSIVE_EDEFAULT;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_DOMAINS:
				return getCrossmarkDomains() != null;
			case _4Package.DOCUMENT_ROOT__CROSSMARK_POLICY:
				return CROSSMARK_POLICY_EDEFAULT == null ? getCrossmarkPolicy() != null : !CROSSMARK_POLICY_EDEFAULT.equals(getCrossmarkPolicy());
			case _4Package.DOCUMENT_ROOT__CROSSMARK_VERSION:
				return CROSSMARK_VERSION_EDEFAULT == null ? getCrossmarkVersion() != null : !CROSSMARK_VERSION_EDEFAULT.equals(getCrossmarkVersion());
			case _4Package.DOCUMENT_ROOT__CUSTOM_METADATA:
				return getCustomMetadata() != null;
			case _4Package.DOCUMENT_ROOT__CYEAR:
				return CYEAR_EDEFAULT == null ? getCYear() != null : !CYEAR_EDEFAULT.equals(getCYear());
			case _4Package.DOCUMENT_ROOT__DATABASE:
				return getDatabase() != null;
			case _4Package.DOCUMENT_ROOT__DATABASE_DATE:
				return getDatabaseDate() != null;
			case _4Package.DOCUMENT_ROOT__DATABASE_METADATA:
				return getDatabaseMetadata() != null;
			case _4Package.DOCUMENT_ROOT__DATASET:
				return getDataset() != null;
			case _4Package.DOCUMENT_ROOT__DAY:
				return DAY_EDEFAULT == null ? getDay() != null : !DAY_EDEFAULT.equals(getDay());
			case _4Package.DOCUMENT_ROOT__DEGREE:
				return DEGREE_EDEFAULT == null ? getDegree() != null : !DEGREE_EDEFAULT.equals(getDegree());
			case _4Package.DOCUMENT_ROOT__DEGREES:
				return getDegrees() != null;
			case _4Package.DOCUMENT_ROOT__DEPOSITOR:
				return getDepositor() != null;
			case _4Package.DOCUMENT_ROOT__DEPOSITOR_NAME:
				return DEPOSITOR_NAME_EDEFAULT == null ? getDepositorName() != null : !DEPOSITOR_NAME_EDEFAULT.equals(getDepositorName());
			case _4Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case _4Package.DOCUMENT_ROOT__DESIGNATORS:
				return getDesignators() != null;
			case _4Package.DOCUMENT_ROOT__DISSERTATION:
				return getDissertation() != null;
			case _4Package.DOCUMENT_ROOT__DOI:
				return DOI_EDEFAULT == null ? getDoi() != null : !DOI_EDEFAULT.equals(getDoi());
			case _4Package.DOCUMENT_ROOT__DOI_BATCH:
				return getDoiBatch() != null;
			case _4Package.DOCUMENT_ROOT__DOI_BATCH_ID:
				return DOI_BATCH_ID_EDEFAULT == null ? getDoiBatchId() != null : !DOI_BATCH_ID_EDEFAULT.equals(getDoiBatchId());
			case _4Package.DOCUMENT_ROOT__DOI_DATA:
				return getDoiData() != null;
			case _4Package.DOCUMENT_ROOT__DOMAIN:
				return DOMAIN_EDEFAULT == null ? getDomain() != null : !DOMAIN_EDEFAULT.equals(getDomain());
			case _4Package.DOCUMENT_ROOT__EDITION_NUMBER:
				return EDITION_NUMBER_EDEFAULT == null ? getEditionNumber() != null : !EDITION_NUMBER_EDEFAULT.equals(getEditionNumber());
			case _4Package.DOCUMENT_ROOT__ELOCATION_ID:
				return ELOCATION_ID_EDEFAULT == null ? getElocationId() != null : !ELOCATION_ID_EDEFAULT.equals(getElocationId());
			case _4Package.DOCUMENT_ROOT__EM:
				return getEm() != null;
			case _4Package.DOCUMENT_ROOT__EMAIL_ADDRESS:
				return EMAIL_ADDRESS_EDEFAULT == null ? getEmailAddress() != null : !EMAIL_ADDRESS_EDEFAULT.equals(getEmailAddress());
			case _4Package.DOCUMENT_ROOT__EVENT_METADATA:
				return getEventMetadata() != null;
			case _4Package.DOCUMENT_ROOT__FILTER:
				return FILTER_EDEFAULT == null ? getFilter() != null : !FILTER_EDEFAULT.equals(getFilter());
			case _4Package.DOCUMENT_ROOT__FIRST_PAGE:
				return FIRST_PAGE_EDEFAULT == null ? getFirstPage() != null : !FIRST_PAGE_EDEFAULT.equals(getFirstPage());
			case _4Package.DOCUMENT_ROOT__FONT:
				return getFont() != null;
			case _4Package.DOCUMENT_ROOT__FORMAT:
				return getFormat() != null;
			case _4Package.DOCUMENT_ROOT__FULL_TITLE:
				return FULL_TITLE_EDEFAULT == null ? getFullTitle() != null : !FULL_TITLE_EDEFAULT.equals(getFullTitle());
			case _4Package.DOCUMENT_ROOT__GIVEN_NAME:
				return GIVEN_NAME_EDEFAULT == null ? getGivenName() != null : !GIVEN_NAME_EDEFAULT.equals(getGivenName());
			case _4Package.DOCUMENT_ROOT__GROUP_TITLE:
				return GROUP_TITLE_EDEFAULT == null ? getGroupTitle() != null : !GROUP_TITLE_EDEFAULT.equals(getGroupTitle());
			case _4Package.DOCUMENT_ROOT__HEAD:
				return getHead() != null;
			case _4Package.DOCUMENT_ROOT__I:
				return getI() != null;
			case _4Package.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier() != null;
			case _4Package.DOCUMENT_ROOT__INSTITUTION:
				return getInstitution() != null;
			case _4Package.DOCUMENT_ROOT__INSTITUTION_ACRONYM:
				return INSTITUTION_ACRONYM_EDEFAULT == null ? getInstitutionAcronym() != null : !INSTITUTION_ACRONYM_EDEFAULT.equals(getInstitutionAcronym());
			case _4Package.DOCUMENT_ROOT__INSTITUTION_DEPARTMENT:
				return INSTITUTION_DEPARTMENT_EDEFAULT == null ? getInstitutionDepartment() != null : !INSTITUTION_DEPARTMENT_EDEFAULT.equals(getInstitutionDepartment());
			case _4Package.DOCUMENT_ROOT__INSTITUTION_NAME:
				return INSTITUTION_NAME_EDEFAULT == null ? getInstitutionName() != null : !INSTITUTION_NAME_EDEFAULT.equals(getInstitutionName());
			case _4Package.DOCUMENT_ROOT__INSTITUTION_PLACE:
				return INSTITUTION_PLACE_EDEFAULT == null ? getInstitutionPlace() != null : !INSTITUTION_PLACE_EDEFAULT.equals(getInstitutionPlace());
			case _4Package.DOCUMENT_ROOT__INTENT_STATEMENT:
				return getIntentStatement() != null;
			case _4Package.DOCUMENT_ROOT__ISBN:
				return getIsbn() != null;
			case _4Package.DOCUMENT_ROOT__ISSN:
				return getIssn() != null;
			case _4Package.DOCUMENT_ROOT__ISSUE:
				return ISSUE_EDEFAULT == null ? getIssue() != null : !ISSUE_EDEFAULT.equals(getIssue());
			case _4Package.DOCUMENT_ROOT__ITEM:
				return getItem() != null;
			case _4Package.DOCUMENT_ROOT__ITEM_NUMBER:
				return getItemNumber() != null;
			case _4Package.DOCUMENT_ROOT__JOURNAL:
				return getJournal() != null;
			case _4Package.DOCUMENT_ROOT__JOURNAL_ARTICLE:
				return getJournalArticle() != null;
			case _4Package.DOCUMENT_ROOT__JOURNAL_ISSUE:
				return getJournalIssue() != null;
			case _4Package.DOCUMENT_ROOT__JOURNAL_METADATA:
				return getJournalMetadata() != null;
			case _4Package.DOCUMENT_ROOT__JOURNAL_TITLE:
				return JOURNAL_TITLE_EDEFAULT == null ? getJournalTitle() != null : !JOURNAL_TITLE_EDEFAULT.equals(getJournalTitle());
			case _4Package.DOCUMENT_ROOT__JOURNAL_VOLUME:
				return getJournalVolume() != null;
			case _4Package.DOCUMENT_ROOT__LAST_PAGE:
				return LAST_PAGE_EDEFAULT == null ? getLastPage() != null : !LAST_PAGE_EDEFAULT.equals(getLastPage());
			case _4Package.DOCUMENT_ROOT__MONTH:
				return MONTH_EDEFAULT == null ? getMonth() != null : !MONTH_EDEFAULT.equals(getMonth());
			case _4Package.DOCUMENT_ROOT__NAME:
				return getName() != null;
			case _4Package.DOCUMENT_ROOT__NOISBN:
				return getNoisbn() != null;
			case _4Package.DOCUMENT_ROOT__ORCID:
				return getORCID() != null;
			case _4Package.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization() != null;
			case _4Package.DOCUMENT_ROOT__ORIGINAL_LANGUAGE_TITLE:
				return getOriginalLanguageTitle() != null;
			case _4Package.DOCUMENT_ROOT__OTHER_PAGES:
				return OTHER_PAGES_EDEFAULT == null ? getOtherPages() != null : !OTHER_PAGES_EDEFAULT.equals(getOtherPages());
			case _4Package.DOCUMENT_ROOT__OVL:
				return getOvl() != null;
			case _4Package.DOCUMENT_ROOT__PAGES:
				return getPages() != null;
			case _4Package.DOCUMENT_ROOT__PART_NUMBER:
				return PART_NUMBER_EDEFAULT == null ? getPartNumber() != null : !PART_NUMBER_EDEFAULT.equals(getPartNumber());
			case _4Package.DOCUMENT_ROOT__PEER_REVIEW:
				return getPeerReview() != null;
			case _4Package.DOCUMENT_ROOT__PENDING_PUBLICATION:
				return getPendingPublication() != null;
			case _4Package.DOCUMENT_ROOT__PERSON_NAME:
				return getPersonName() != null;
			case _4Package.DOCUMENT_ROOT__POSTED_CONTENT:
				return getPostedContent() != null;
			case _4Package.DOCUMENT_ROOT__POSTED_DATE:
				return getPostedDate() != null;
			case _4Package.DOCUMENT_ROOT__PREFIX:
				return getPrefix() != null;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_METADATA:
				return getProceedingsMetadata() != null;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_SERIES_METADATA:
				return getProceedingsSeriesMetadata() != null;
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_SUBJECT:
				return PROCEEDINGS_SUBJECT_EDEFAULT == null ? getProceedingsSubject() != null : !PROCEEDINGS_SUBJECT_EDEFAULT.equals(getProceedingsSubject());
			case _4Package.DOCUMENT_ROOT__PROCEEDINGS_TITLE:
				return PROCEEDINGS_TITLE_EDEFAULT == null ? getProceedingsTitle() != null : !PROCEEDINGS_TITLE_EDEFAULT.equals(getProceedingsTitle());
			case _4Package.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case _4Package.DOCUMENT_ROOT__PUBLICATION:
				return getPublication() != null;
			case _4Package.DOCUMENT_ROOT__PUBLICATION_DATE:
				return getPublicationDate() != null;
			case _4Package.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher() != null;
			case _4Package.DOCUMENT_ROOT__PUBLISHER_ITEM:
				return getPublisherItem() != null;
			case _4Package.DOCUMENT_ROOT__PUBLISHER_NAME:
				return PUBLISHER_NAME_EDEFAULT == null ? getPublisherName() != null : !PUBLISHER_NAME_EDEFAULT.equals(getPublisherName());
			case _4Package.DOCUMENT_ROOT__PUBLISHER_PLACE:
				return PUBLISHER_PLACE_EDEFAULT == null ? getPublisherPlace() != null : !PUBLISHER_PLACE_EDEFAULT.equals(getPublisherPlace());
			case _4Package.DOCUMENT_ROOT__REGISTRANT:
				return REGISTRANT_EDEFAULT == null ? getRegistrant() != null : !REGISTRANT_EDEFAULT.equals(getRegistrant());
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER:
				return getReportPaper() != null;
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER_METADATA:
				return getReportPaperMetadata() != null;
			case _4Package.DOCUMENT_ROOT__REPORT_PAPER_SERIES_METADATA:
				return getReportPaperSeriesMetadata() != null;
			case _4Package.DOCUMENT_ROOT__RESOURCE:
				return getResource() != null;
			case _4Package.DOCUMENT_ROOT__REVIEW_DATE:
				return getReviewDate() != null;
			case _4Package.DOCUMENT_ROOT__RUNNING_NUMBER:
				return RUNNING_NUMBER_EDEFAULT == null ? getRunningNumber() != null : !RUNNING_NUMBER_EDEFAULT.equals(getRunningNumber());
			case _4Package.DOCUMENT_ROOT__SA_COMPONENT:
				return getSaComponent() != null;
			case _4Package.DOCUMENT_ROOT__SCN_POLICIES:
				return getScnPolicies() != null;
			case _4Package.DOCUMENT_ROOT__SCN_POLICY_REF:
				return getScnPolicyRef() != null;
			case _4Package.DOCUMENT_ROOT__SCN_POLICY_SET:
				return getScnPolicySet() != null;
			case _4Package.DOCUMENT_ROOT__SCP:
				return getScp() != null;
			case _4Package.DOCUMENT_ROOT__SERIES_METADATA:
				return getSeriesMetadata() != null;
			case _4Package.DOCUMENT_ROOT__SERIES_NUMBER:
				return SERIES_NUMBER_EDEFAULT == null ? getSeriesNumber() != null : !SERIES_NUMBER_EDEFAULT.equals(getSeriesNumber());
			case _4Package.DOCUMENT_ROOT__SERIES_TITLE:
				return SERIES_TITLE_EDEFAULT == null ? getSeriesTitle() != null : !SERIES_TITLE_EDEFAULT.equals(getSeriesTitle());
			case _4Package.DOCUMENT_ROOT__SET_METADATA:
				return getSetMetadata() != null;
			case _4Package.DOCUMENT_ROOT__SPECIAL_NUMBERING:
				return SPECIAL_NUMBERING_EDEFAULT == null ? getSpecialNumbering() != null : !SPECIAL_NUMBERING_EDEFAULT.equals(getSpecialNumbering());
			case _4Package.DOCUMENT_ROOT__STANDARD:
				return getStandard() != null;
			case _4Package.DOCUMENT_ROOT__STANDARD_METADATA:
				return getStandardMetadata() != null;
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY:
				return getStandardsBody() != null;
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY_ACRONYM:
				return getStandardsBodyAcronym() != null;
			case _4Package.DOCUMENT_ROOT__STANDARDS_BODY_NAME:
				return getStandardsBodyName() != null;
			case _4Package.DOCUMENT_ROOT__STD_ADOPTED_FROM:
				return STD_ADOPTED_FROM_EDEFAULT == null ? getStdAdoptedFrom() != null : !STD_ADOPTED_FROM_EDEFAULT.equals(getStdAdoptedFrom());
			case _4Package.DOCUMENT_ROOT__STD_ALT_AS_PUBLISHED:
				return getStdAltAsPublished() != null;
			case _4Package.DOCUMENT_ROOT__STD_ALT_SCRIPT:
				return STD_ALT_SCRIPT_EDEFAULT == null ? getStdAltScript() != null : !STD_ALT_SCRIPT_EDEFAULT.equals(getStdAltScript());
			case _4Package.DOCUMENT_ROOT__STD_AS_PUBLISHED:
				return getStdAsPublished() != null;
			case _4Package.DOCUMENT_ROOT__STD_DESIGNATOR:
				return STD_DESIGNATOR_EDEFAULT == null ? getStdDesignator() != null : !STD_DESIGNATOR_EDEFAULT.equals(getStdDesignator());
			case _4Package.DOCUMENT_ROOT__STD_FAMILY_DESIGNATOR:
				return getStdFamilyDesignator() != null;
			case _4Package.DOCUMENT_ROOT__STD_REVISION_OF:
				return STD_REVISION_OF_EDEFAULT == null ? getStdRevisionOf() != null : !STD_REVISION_OF_EDEFAULT.equals(getStdRevisionOf());
			case _4Package.DOCUMENT_ROOT__STD_SET_DESIGNATOR:
				return getStdSetDesignator() != null;
			case _4Package.DOCUMENT_ROOT__STD_SUPERSEDES:
				return STD_SUPERSEDES_EDEFAULT == null ? getStdSupersedes() != null : !STD_SUPERSEDES_EDEFAULT.equals(getStdSupersedes());
			case _4Package.DOCUMENT_ROOT__STD_UNDATED_DESIGNATOR:
				return getStdUndatedDesignator() != null;
			case _4Package.DOCUMENT_ROOT__STD_VARIANT_FORM:
				return STD_VARIANT_FORM_EDEFAULT == null ? getStdVariantForm() != null : !STD_VARIANT_FORM_EDEFAULT.equals(getStdVariantForm());
			case _4Package.DOCUMENT_ROOT__STRING_NAME:
				return getStringName() != null;
			case _4Package.DOCUMENT_ROOT__STRONG:
				return getStrong() != null;
			case _4Package.DOCUMENT_ROOT__SUB:
				return getSub() != null;
			case _4Package.DOCUMENT_ROOT__SUBTITLE:
				return getSubtitle() != null;
			case _4Package.DOCUMENT_ROOT__SUFFIX:
				return SUFFIX_EDEFAULT == null ? getSuffix() != null : !SUFFIX_EDEFAULT.equals(getSuffix());
			case _4Package.DOCUMENT_ROOT__SUP:
				return getSup() != null;
			case _4Package.DOCUMENT_ROOT__SURNAME:
				return SURNAME_EDEFAULT == null ? getSurname() != null : !SURNAME_EDEFAULT.equals(getSurname());
			case _4Package.DOCUMENT_ROOT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? getTimestamp() != null : !TIMESTAMP_EDEFAULT.equals(getTimestamp());
			case _4Package.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case _4Package.DOCUMENT_ROOT__TITLES:
				return getTitles() != null;
			case _4Package.DOCUMENT_ROOT__TT:
				return getTt() != null;
			case _4Package.DOCUMENT_ROOT__U:
				return getU() != null;
			case _4Package.DOCUMENT_ROOT__UNASSIGNED_CONTENT:
				return getUnassignedContent() != null;
			case _4Package.DOCUMENT_ROOT__UNSTRUCTURED_CITATION:
				return getUnstructuredCitation() != null;
			case _4Package.DOCUMENT_ROOT__UPDATE:
				return getUpdate() != null;
			case _4Package.DOCUMENT_ROOT__UPDATE_DATE:
				return getUpdateDate() != null;
			case _4Package.DOCUMENT_ROOT__UPDATES:
				return getUpdates() != null;
			case _4Package.DOCUMENT_ROOT__VOLUME:
				return VOLUME_EDEFAULT == null ? getVolume() != null : !VOLUME_EDEFAULT.equals(getVolume());
			case _4Package.DOCUMENT_ROOT__VOLUME_TITLE:
				return VOLUME_TITLE_EDEFAULT == null ? getVolumeTitle() != null : !VOLUME_TITLE_EDEFAULT.equals(getVolumeTitle());
			case _4Package.DOCUMENT_ROOT__YEAR:
				return YEAR_EDEFAULT == null ? getYear() != null : !YEAR_EDEFAULT.equals(getYear());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
