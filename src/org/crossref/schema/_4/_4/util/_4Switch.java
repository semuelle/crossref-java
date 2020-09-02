/**
 */
package org.crossref.schema._4._4.util;

import org.crossref.schema._4._4.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package
 * @generated
 */
public class _4Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _4Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _4Switch() {
		if (modelPackage == null) {
			modelPackage = _4Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _4Package.ACCEPTANCE_DATE_TYPE: {
				AcceptanceDateType acceptanceDateType = (AcceptanceDateType)theEObject;
				T result = caseAcceptanceDateType(acceptanceDateType);
				if (result == null) result = caseDateT(acceptanceDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ALT_NAME_TYPE: {
				AltNameType altNameType = (AltNameType)theEObject;
				T result = caseAltNameType(altNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ANONYMOUS_TYPE: {
				AnonymousType anonymousType = (AnonymousType)theEObject;
				T result = caseAnonymousType(anonymousType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.APPROVAL_DATE_TYPE: {
				ApprovalDateType approvalDateType = (ApprovalDateType)theEObject;
				T result = caseApprovalDateType(approvalDateType);
				if (result == null) result = caseDateT(approvalDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ARCHIVE_LOCATIONS_TYPE: {
				ArchiveLocationsType archiveLocationsType = (ArchiveLocationsType)theEObject;
				T result = caseArchiveLocationsType(archiveLocationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ARCHIVE_TYPE: {
				ArchiveType archiveType = (ArchiveType)theEObject;
				T result = caseArchiveType(archiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ASSERTION_TYPE: {
				AssertionType assertionType = (AssertionType)theEObject;
				T result = caseAssertionType(assertionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ATYPE: {
				AType aType = (AType)theEObject;
				T result = caseAType(aType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.BODY_TYPE: {
				BodyType bodyType = (BodyType)theEObject;
				T result = caseBodyType(bodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.BOOK_METADATA_TYPE: {
				BookMetadataType bookMetadataType = (BookMetadataType)theEObject;
				T result = caseBookMetadataType(bookMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.BOOK_SERIES_METADATA_TYPE: {
				BookSeriesMetadataType bookSeriesMetadataType = (BookSeriesMetadataType)theEObject;
				T result = caseBookSeriesMetadataType(bookSeriesMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.BOOK_SET_METADATA_TYPE: {
				BookSetMetadataType bookSetMetadataType = (BookSetMetadataType)theEObject;
				T result = caseBookSetMetadataType(bookSetMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.BOOK_TYPE: {
				BookType bookType = (BookType)theEObject;
				T result = caseBookType(bookType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CITATION_LIST_TYPE: {
				CitationListType citationListType = (CitationListType)theEObject;
				T result = caseCitationListType(citationListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CITATION_T: {
				CitationT citationT = (CitationT)theEObject;
				T result = caseCitationT(citationT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CITATION_TYPE: {
				CitationType citationType = (CitationType)theEObject;
				T result = caseCitationType(citationType);
				if (result == null) result = caseCitationT(citationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.COLLECTION_TYPE: {
				CollectionType collectionType = (CollectionType)theEObject;
				T result = caseCollectionType(collectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.COMPETING_INTEREST_STATEMENT_TYPE: {
				CompetingInterestStatementType competingInterestStatementType = (CompetingInterestStatementType)theEObject;
				T result = caseCompetingInterestStatementType(competingInterestStatementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.COMPONENT_LIST_TYPE: {
				ComponentListType componentListType = (ComponentListType)theEObject;
				T result = caseComponentListType(componentListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.COMPONENT_TYPE: {
				ComponentType componentType = (ComponentType)theEObject;
				T result = caseComponentType(componentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CONFERENCE_DATE_TYPE: {
				ConferenceDateType conferenceDateType = (ConferenceDateType)theEObject;
				T result = caseConferenceDateType(conferenceDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CONFERENCE_PAPER_TYPE: {
				ConferencePaperType conferencePaperType = (ConferencePaperType)theEObject;
				T result = caseConferencePaperType(conferencePaperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CONFERENCE_TYPE: {
				ConferenceType conferenceType = (ConferenceType)theEObject;
				T result = caseConferenceType(conferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CONTENT_DATE_TYPE: {
				ContentDateType contentDateType = (ContentDateType)theEObject;
				T result = caseContentDateType(contentDateType);
				if (result == null) result = caseDateT(contentDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CONTENT_ITEM_TYPE: {
				ContentItemType contentItemType = (ContentItemType)theEObject;
				T result = caseContentItemType(contentItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CONTRIBUTORS_TYPE: {
				ContributorsType contributorsType = (ContributorsType)theEObject;
				T result = caseContributorsType(contributorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CREATION_DATE_TYPE: {
				CreationDateType creationDateType = (CreationDateType)theEObject;
				T result = caseCreationDateType(creationDateType);
				if (result == null) result = caseDateT(creationDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CROSSMARK_DOMAINS_TYPE: {
				CrossmarkDomainsType crossmarkDomainsType = (CrossmarkDomainsType)theEObject;
				T result = caseCrossmarkDomainsType(crossmarkDomainsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CROSSMARK_DOMAIN_TYPE: {
				CrossmarkDomainType crossmarkDomainType = (CrossmarkDomainType)theEObject;
				T result = caseCrossmarkDomainType(crossmarkDomainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CROSSMARK_TYPE: {
				CrossmarkType crossmarkType = (CrossmarkType)theEObject;
				T result = caseCrossmarkType(crossmarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.CUSTOM_METADATA_TYPE: {
				CustomMetadataType customMetadataType = (CustomMetadataType)theEObject;
				T result = caseCustomMetadataType(customMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DATABASE_DATE_TYPE: {
				DatabaseDateType databaseDateType = (DatabaseDateType)theEObject;
				T result = caseDatabaseDateType(databaseDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DATABASE_METADATA_TYPE: {
				DatabaseMetadataType databaseMetadataType = (DatabaseMetadataType)theEObject;
				T result = caseDatabaseMetadataType(databaseMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DATABASE_TYPE: {
				DatabaseType databaseType = (DatabaseType)theEObject;
				T result = caseDatabaseType(databaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DATASET_TYPE: {
				DatasetType datasetType = (DatasetType)theEObject;
				T result = caseDatasetType(datasetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DATE_T: {
				DateT dateT = (DateT)theEObject;
				T result = caseDateT(dateT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DEGREES_TYPE: {
				DegreesType degreesType = (DegreesType)theEObject;
				T result = caseDegreesType(degreesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DEPOSITOR_TYPE: {
				DepositorType depositorType = (DepositorType)theEObject;
				T result = caseDepositorType(depositorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DESIGNATORS_TYPE: {
				DesignatorsType designatorsType = (DesignatorsType)theEObject;
				T result = caseDesignatorsType(designatorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DISSERTATION_TYPE: {
				DissertationType dissertationType = (DissertationType)theEObject;
				T result = caseDissertationType(dissertationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DOI_BATCH_TYPE: {
				DoiBatchType doiBatchType = (DoiBatchType)theEObject;
				T result = caseDoiBatchType(doiBatchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.DOI_DATA_TYPE: {
				DoiDataType doiDataType = (DoiDataType)theEObject;
				T result = caseDoiDataType(doiDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.EVENT_METADATA_TYPE: {
				EventMetadataType eventMetadataType = (EventMetadataType)theEObject;
				T result = caseEventMetadataType(eventMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.FORMAT_TYPE: {
				FormatType formatType = (FormatType)theEObject;
				T result = caseFormatType(formatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.HEAD_TYPE: {
				HeadType headType = (HeadType)theEObject;
				T result = caseHeadType(headType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.IDENTIFIER_TYPE: {
				IdentifierType identifierType = (IdentifierType)theEObject;
				T result = caseIdentifierType(identifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.INSTITUTION_TYPE: {
				InstitutionType institutionType = (InstitutionType)theEObject;
				T result = caseInstitutionType(institutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.INTENT_STATEMENT_TYPE: {
				IntentStatementType intentStatementType = (IntentStatementType)theEObject;
				T result = caseIntentStatementType(intentStatementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ISBN_TYPE: {
				IsbnType isbnType = (IsbnType)theEObject;
				T result = caseIsbnType(isbnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ISSN_TYPE: {
				IssnType issnType = (IssnType)theEObject;
				T result = caseIssnType(issnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ITEM_NUMBER_TYPE: {
				ItemNumberType itemNumberType = (ItemNumberType)theEObject;
				T result = caseItemNumberType(itemNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ITEM_TYPE: {
				ItemType itemType = (ItemType)theEObject;
				T result = caseItemType(itemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.JOURNAL_ARTICLE_TYPE: {
				JournalArticleType journalArticleType = (JournalArticleType)theEObject;
				T result = caseJournalArticleType(journalArticleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.JOURNAL_ISSUE_TYPE: {
				JournalIssueType journalIssueType = (JournalIssueType)theEObject;
				T result = caseJournalIssueType(journalIssueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.JOURNAL_METADATA_TYPE: {
				JournalMetadataType journalMetadataType = (JournalMetadataType)theEObject;
				T result = caseJournalMetadataType(journalMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.JOURNAL_TYPE: {
				JournalType journalType = (JournalType)theEObject;
				T result = caseJournalType(journalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.JOURNAL_VOLUME_TYPE: {
				JournalVolumeType journalVolumeType = (JournalVolumeType)theEObject;
				T result = caseJournalVolumeType(journalVolumeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.NAME_TYPE1: {
				NameType1 nameType1 = (NameType1)theEObject;
				T result = caseNameType1(nameType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.NOISBN_TYPE: {
				NoisbnType noisbnType = (NoisbnType)theEObject;
				T result = caseNoisbnType(noisbnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ORCID_TYPE: {
				ORCIDType orcidType = (ORCIDType)theEObject;
				T result = caseORCIDType(orcidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ORGANIZATION_TYPE: {
				OrganizationType organizationType = (OrganizationType)theEObject;
				T result = caseOrganizationType(organizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE: {
				OriginalLanguageTitleType originalLanguageTitleType = (OriginalLanguageTitleType)theEObject;
				T result = caseOriginalLanguageTitleType(originalLanguageTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PAGES_TYPE: {
				PagesType pagesType = (PagesType)theEObject;
				T result = casePagesType(pagesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PEER_REVIEW_TYPE: {
				PeerReviewType peerReviewType = (PeerReviewType)theEObject;
				T result = casePeerReviewType(peerReviewType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PENDING_PUBLICATION_TYPE: {
				PendingPublicationType pendingPublicationType = (PendingPublicationType)theEObject;
				T result = casePendingPublicationType(pendingPublicationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PERSON_NAME_TYPE: {
				PersonNameType personNameType = (PersonNameType)theEObject;
				T result = casePersonNameType(personNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.POSTED_CONTENT_TYPE: {
				PostedContentType postedContentType = (PostedContentType)theEObject;
				T result = casePostedContentType(postedContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.POSTED_DATE_TYPE: {
				PostedDateType postedDateType = (PostedDateType)theEObject;
				T result = casePostedDateType(postedDateType);
				if (result == null) result = caseDateT(postedDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PREFIX_TYPE: {
				PrefixType prefixType = (PrefixType)theEObject;
				T result = casePrefixType(prefixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PROCEEDINGS_METADATA_TYPE: {
				ProceedingsMetadataType proceedingsMetadataType = (ProceedingsMetadataType)theEObject;
				T result = caseProceedingsMetadataType(proceedingsMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PROCEEDINGS_SERIES_METADATA_TYPE: {
				ProceedingsSeriesMetadataType proceedingsSeriesMetadataType = (ProceedingsSeriesMetadataType)theEObject;
				T result = caseProceedingsSeriesMetadataType(proceedingsSeriesMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PUBLICATION_DATE_TYPE: {
				PublicationDateType publicationDateType = (PublicationDateType)theEObject;
				T result = casePublicationDateType(publicationDateType);
				if (result == null) result = caseDateT(publicationDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PUBLICATION_TYPE: {
				PublicationType publicationType = (PublicationType)theEObject;
				T result = casePublicationType(publicationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PUBLISHER_ITEM_TYPE: {
				PublisherItemType publisherItemType = (PublisherItemType)theEObject;
				T result = casePublisherItemType(publisherItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.PUBLISHER_TYPE: {
				PublisherType publisherType = (PublisherType)theEObject;
				T result = casePublisherType(publisherType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.REPORT_PAPER_METADATA_TYPE: {
				ReportPaperMetadataType reportPaperMetadataType = (ReportPaperMetadataType)theEObject;
				T result = caseReportPaperMetadataType(reportPaperMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.REPORT_PAPER_SERIES_METADATA_TYPE: {
				ReportPaperSeriesMetadataType reportPaperSeriesMetadataType = (ReportPaperSeriesMetadataType)theEObject;
				T result = caseReportPaperSeriesMetadataType(reportPaperSeriesMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.REPORT_PAPER_TYPE: {
				ReportPaperType reportPaperType = (ReportPaperType)theEObject;
				T result = caseReportPaperType(reportPaperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.RESOURCE_TYPE: {
				ResourceType resourceType = (ResourceType)theEObject;
				T result = caseResourceType(resourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.REVIEW_DATE_TYPE: {
				ReviewDateType reviewDateType = (ReviewDateType)theEObject;
				T result = caseReviewDateType(reviewDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.SA_COMPONENT_TYPE: {
				SaComponentType saComponentType = (SaComponentType)theEObject;
				T result = caseSaComponentType(saComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.SCN_POLICIES_TYPE: {
				ScnPoliciesType scnPoliciesType = (ScnPoliciesType)theEObject;
				T result = caseScnPoliciesType(scnPoliciesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.SCN_POLICY_REF_TYPE: {
				ScnPolicyRefType scnPolicyRefType = (ScnPolicyRefType)theEObject;
				T result = caseScnPolicyRefType(scnPolicyRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.SCN_POLICY_SET_TYPE: {
				ScnPolicySetType scnPolicySetType = (ScnPolicySetType)theEObject;
				T result = caseScnPolicySetType(scnPolicySetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.SERIES_METADATA_TYPE: {
				SeriesMetadataType seriesMetadataType = (SeriesMetadataType)theEObject;
				T result = caseSeriesMetadataType(seriesMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.SET_METADATA_TYPE: {
				SetMetadataType setMetadataType = (SetMetadataType)theEObject;
				T result = caseSetMetadataType(setMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.STANDARD_METADATA_TYPE: {
				StandardMetadataType standardMetadataType = (StandardMetadataType)theEObject;
				T result = caseStandardMetadataType(standardMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.STANDARDS_BODY_TYPE: {
				StandardsBodyType standardsBodyType = (StandardsBodyType)theEObject;
				T result = caseStandardsBodyType(standardsBodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.STANDARD_TYPE: {
				StandardType standardType = (StandardType)theEObject;
				T result = caseStandardType(standardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE: {
				StdAltAsPublishedType stdAltAsPublishedType = (StdAltAsPublishedType)theEObject;
				T result = caseStdAltAsPublishedType(stdAltAsPublishedType);
				if (result == null) result = caseStdDesignatorT(stdAltAsPublishedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.STD_AS_PUBLISHED_TYPE: {
				StdAsPublishedType stdAsPublishedType = (StdAsPublishedType)theEObject;
				T result = caseStdAsPublishedType(stdAsPublishedType);
				if (result == null) result = caseStdDesignatorT(stdAsPublishedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.STD_DESIGNATOR_T: {
				StdDesignatorT stdDesignatorT = (StdDesignatorT)theEObject;
				T result = caseStdDesignatorT(stdDesignatorT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.STD_SET_DESIGNATOR_TYPE: {
				StdSetDesignatorType stdSetDesignatorType = (StdSetDesignatorType)theEObject;
				T result = caseStdSetDesignatorType(stdSetDesignatorType);
				if (result == null) result = caseStdDesignatorT(stdSetDesignatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.STD_UNDATED_DESIGNATOR_TYPE: {
				StdUndatedDesignatorType stdUndatedDesignatorType = (StdUndatedDesignatorType)theEObject;
				T result = caseStdUndatedDesignatorType(stdUndatedDesignatorType);
				if (result == null) result = caseStdDesignatorT(stdUndatedDesignatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.STRING_NAME_TYPE: {
				StringNameType stringNameType = (StringNameType)theEObject;
				T result = caseStringNameType(stringNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.SUBTITLE_TYPE: {
				SubtitleType subtitleType = (SubtitleType)theEObject;
				T result = caseSubtitleType(subtitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.TITLES_TYPE: {
				TitlesType titlesType = (TitlesType)theEObject;
				T result = caseTitlesType(titlesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.TITLE_TYPE: {
				TitleType titleType = (TitleType)theEObject;
				T result = caseTitleType(titleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.UNASSIGNED_CONTENT_TYPE: {
				UnassignedContentType unassignedContentType = (UnassignedContentType)theEObject;
				T result = caseUnassignedContentType(unassignedContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.UNSTRUCTURED_CITATION_TYPE: {
				UnstructuredCitationType unstructuredCitationType = (UnstructuredCitationType)theEObject;
				T result = caseUnstructuredCitationType(unstructuredCitationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.UPDATE_DATE_TYPE: {
				UpdateDateType updateDateType = (UpdateDateType)theEObject;
				T result = caseUpdateDateType(updateDateType);
				if (result == null) result = caseDateT(updateDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.UPDATES_TYPE: {
				UpdatesType updatesType = (UpdatesType)theEObject;
				T result = caseUpdatesType(updatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.UPDATE_TYPE: {
				UpdateType updateType = (UpdateType)theEObject;
				T result = caseUpdateType(updateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _4Package.XREF_FACES: {
				XrefFaces xrefFaces = (XrefFaces)theEObject;
				T result = caseXrefFaces(xrefFaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceptance Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceptance Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptanceDateType(AcceptanceDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltNameType(AltNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousType(AnonymousType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approval Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approval Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApprovalDateType(ApprovalDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive Locations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive Locations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchiveLocationsType(ArchiveLocationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchiveType(ArchiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionType(AssertionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAType(AType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyType(BodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookMetadataType(BookMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book Series Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book Series Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookSeriesMetadataType(BookSeriesMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book Set Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book Set Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookSetMetadataType(BookSetMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookType(BookType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citation List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citation List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitationListType(CitationListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citation T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citation T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitationT(CitationT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitationType(CitationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Competing Interest Statement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Competing Interest Statement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompetingInterestStatementType(CompetingInterestStatementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentListType(ComponentListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conference Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conference Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConferenceDateType(ConferenceDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conference Paper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conference Paper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConferencePaperType(ConferencePaperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConferenceType(ConferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentDateType(ContentDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentItemType(ContentItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contributors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contributors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributorsType(ContributorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreationDateType(CreationDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crossmark Domains Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crossmark Domains Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossmarkDomainsType(CrossmarkDomainsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crossmark Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crossmark Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossmarkDomainType(CrossmarkDomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crossmark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crossmark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossmarkType(CrossmarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomMetadataType(CustomMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseDateType(DatabaseDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseMetadataType(DatabaseMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseType(DatabaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetType(DatasetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateT(DateT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degrees Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degrees Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegreesType(DegreesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depositor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depositor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepositorType(DepositorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionType(DescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Designators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Designators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignatorsType(DesignatorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dissertation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dissertation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDissertationType(DissertationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doi Batch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doi Batch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoiBatchType(DoiBatchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doi Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doi Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoiDataType(DoiDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventMetadataType(EventMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Format Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Format Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormatType(FormatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadType(HeadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierType(IdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Institution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Institution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstitutionType(InstitutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Statement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Statement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentStatementType(IntentStatementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Isbn Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Isbn Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsbnType(IsbnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issn Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issn Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssnType(IssnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemNumberType(ItemNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemType(ItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Article Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Article Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalArticleType(JournalArticleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Issue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalIssueType(JournalIssueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalMetadataType(JournalMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalType(JournalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Volume Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalVolumeType(JournalVolumeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameType1(NameType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noisbn Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noisbn Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoisbnType(NoisbnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ORCID Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ORCID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORCIDType(ORCIDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationType(OrganizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Original Language Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Original Language Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOriginalLanguageTitleType(OriginalLanguageTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pages Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pages Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagesType(PagesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Peer Review Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Peer Review Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeerReviewType(PeerReviewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pending Publication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pending Publication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePendingPublicationType(PendingPublicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonNameType(PersonNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Posted Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Posted Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostedContentType(PostedContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Posted Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Posted Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostedDateType(PostedDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefixType(PrefixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proceedings Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proceedings Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceedingsMetadataType(ProceedingsMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proceedings Series Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proceedings Series Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceedingsSeriesMetadataType(ProceedingsSeriesMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationDateType(PublicationDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationType(PublicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisherItemType(PublisherItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisherType(PublisherType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Paper Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Paper Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportPaperMetadataType(ReportPaperMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Paper Series Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Paper Series Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportPaperSeriesMetadataType(ReportPaperSeriesMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Paper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Paper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportPaperType(ReportPaperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceType(ResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewDateType(ReviewDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sa Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sa Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaComponentType(SaComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scn Policies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scn Policies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScnPoliciesType(ScnPoliciesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scn Policy Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scn Policy Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScnPolicyRefType(ScnPolicyRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scn Policy Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scn Policy Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScnPolicySetType(ScnPolicySetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesMetadataType(SeriesMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetMetadataType(SetMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardMetadataType(StandardMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standards Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standards Body Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardsBodyType(StandardsBodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardType(StandardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Std Alt As Published Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Std Alt As Published Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStdAltAsPublishedType(StdAltAsPublishedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Std As Published Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Std As Published Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStdAsPublishedType(StdAsPublishedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Std Designator T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Std Designator T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStdDesignatorT(StdDesignatorT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Std Set Designator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Std Set Designator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStdSetDesignatorType(StdSetDesignatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Std Undated Designator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Std Undated Designator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStdUndatedDesignatorType(StdUndatedDesignatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringNameType(StringNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtitleType(SubtitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitlesType(TitlesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleType(TitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unassigned Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unassigned Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnassignedContentType(UnassignedContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Citation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Citation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredCitationType(UnstructuredCitationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateDateType(UpdateDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Updates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Updates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatesType(UpdatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateType(UpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xref Faces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xref Faces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXrefFaces(XrefFaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //_4Switch
