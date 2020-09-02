/**
 */
package org.crossref.schema._4._4.util;

import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.crossref.schema._4._4.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package
 * @generated
 */
public class _4Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final _4Validator INSTANCE = new _4Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.crossref.schema._4._4";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _4Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return _4Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case _4Package.ACCEPTANCE_DATE_TYPE:
				return validateAcceptanceDateType((AcceptanceDateType)value, diagnostics, context);
			case _4Package.ALT_NAME_TYPE:
				return validateAltNameType((AltNameType)value, diagnostics, context);
			case _4Package.ANONYMOUS_TYPE:
				return validateAnonymousType((AnonymousType)value, diagnostics, context);
			case _4Package.APPROVAL_DATE_TYPE:
				return validateApprovalDateType((ApprovalDateType)value, diagnostics, context);
			case _4Package.ARCHIVE_LOCATIONS_TYPE:
				return validateArchiveLocationsType((ArchiveLocationsType)value, diagnostics, context);
			case _4Package.ARCHIVE_TYPE:
				return validateArchiveType((ArchiveType)value, diagnostics, context);
			case _4Package.ASSERTION_TYPE:
				return validateAssertionType((AssertionType)value, diagnostics, context);
			case _4Package.ATYPE:
				return validateAType((AType)value, diagnostics, context);
			case _4Package.BODY_TYPE:
				return validateBodyType((BodyType)value, diagnostics, context);
			case _4Package.BOOK_METADATA_TYPE:
				return validateBookMetadataType((BookMetadataType)value, diagnostics, context);
			case _4Package.BOOK_SERIES_METADATA_TYPE:
				return validateBookSeriesMetadataType((BookSeriesMetadataType)value, diagnostics, context);
			case _4Package.BOOK_SET_METADATA_TYPE:
				return validateBookSetMetadataType((BookSetMetadataType)value, diagnostics, context);
			case _4Package.BOOK_TYPE:
				return validateBookType((BookType)value, diagnostics, context);
			case _4Package.CITATION_LIST_TYPE:
				return validateCitationListType((CitationListType)value, diagnostics, context);
			case _4Package.CITATION_T:
				return validateCitationT((CitationT)value, diagnostics, context);
			case _4Package.CITATION_TYPE:
				return validateCitationType((CitationType)value, diagnostics, context);
			case _4Package.COLLECTION_TYPE:
				return validateCollectionType((CollectionType)value, diagnostics, context);
			case _4Package.COMPETING_INTEREST_STATEMENT_TYPE:
				return validateCompetingInterestStatementType((CompetingInterestStatementType)value, diagnostics, context);
			case _4Package.COMPONENT_LIST_TYPE:
				return validateComponentListType((ComponentListType)value, diagnostics, context);
			case _4Package.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case _4Package.CONFERENCE_DATE_TYPE:
				return validateConferenceDateType((ConferenceDateType)value, diagnostics, context);
			case _4Package.CONFERENCE_PAPER_TYPE:
				return validateConferencePaperType((ConferencePaperType)value, diagnostics, context);
			case _4Package.CONFERENCE_TYPE:
				return validateConferenceType((ConferenceType)value, diagnostics, context);
			case _4Package.CONTENT_DATE_TYPE:
				return validateContentDateType((ContentDateType)value, diagnostics, context);
			case _4Package.CONTENT_ITEM_TYPE:
				return validateContentItemType((ContentItemType)value, diagnostics, context);
			case _4Package.CONTRIBUTORS_TYPE:
				return validateContributorsType((ContributorsType)value, diagnostics, context);
			case _4Package.CREATION_DATE_TYPE:
				return validateCreationDateType((CreationDateType)value, diagnostics, context);
			case _4Package.CROSSMARK_DOMAINS_TYPE:
				return validateCrossmarkDomainsType((CrossmarkDomainsType)value, diagnostics, context);
			case _4Package.CROSSMARK_DOMAIN_TYPE:
				return validateCrossmarkDomainType((CrossmarkDomainType)value, diagnostics, context);
			case _4Package.CROSSMARK_TYPE:
				return validateCrossmarkType((CrossmarkType)value, diagnostics, context);
			case _4Package.CUSTOM_METADATA_TYPE:
				return validateCustomMetadataType((CustomMetadataType)value, diagnostics, context);
			case _4Package.DATABASE_DATE_TYPE:
				return validateDatabaseDateType((DatabaseDateType)value, diagnostics, context);
			case _4Package.DATABASE_METADATA_TYPE:
				return validateDatabaseMetadataType((DatabaseMetadataType)value, diagnostics, context);
			case _4Package.DATABASE_TYPE:
				return validateDatabaseType((DatabaseType)value, diagnostics, context);
			case _4Package.DATASET_TYPE:
				return validateDatasetType((DatasetType)value, diagnostics, context);
			case _4Package.DATE_T:
				return validateDateT((DateT)value, diagnostics, context);
			case _4Package.DEGREES_TYPE:
				return validateDegreesType((DegreesType)value, diagnostics, context);
			case _4Package.DEPOSITOR_TYPE:
				return validateDepositorType((DepositorType)value, diagnostics, context);
			case _4Package.DESCRIPTION_TYPE:
				return validateDescriptionType((DescriptionType)value, diagnostics, context);
			case _4Package.DESIGNATORS_TYPE:
				return validateDesignatorsType((DesignatorsType)value, diagnostics, context);
			case _4Package.DISSERTATION_TYPE:
				return validateDissertationType((DissertationType)value, diagnostics, context);
			case _4Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case _4Package.DOI_BATCH_TYPE:
				return validateDoiBatchType((DoiBatchType)value, diagnostics, context);
			case _4Package.DOI_DATA_TYPE:
				return validateDoiDataType((DoiDataType)value, diagnostics, context);
			case _4Package.EVENT_METADATA_TYPE:
				return validateEventMetadataType((EventMetadataType)value, diagnostics, context);
			case _4Package.FORMAT_TYPE:
				return validateFormatType((FormatType)value, diagnostics, context);
			case _4Package.HEAD_TYPE:
				return validateHeadType((HeadType)value, diagnostics, context);
			case _4Package.IDENTIFIER_TYPE:
				return validateIdentifierType((IdentifierType)value, diagnostics, context);
			case _4Package.INSTITUTION_TYPE:
				return validateInstitutionType((InstitutionType)value, diagnostics, context);
			case _4Package.INTENT_STATEMENT_TYPE:
				return validateIntentStatementType((IntentStatementType)value, diagnostics, context);
			case _4Package.ISBN_TYPE:
				return validateIsbnType((IsbnType)value, diagnostics, context);
			case _4Package.ISSN_TYPE:
				return validateIssnType((IssnType)value, diagnostics, context);
			case _4Package.ITEM_NUMBER_TYPE:
				return validateItemNumberType((ItemNumberType)value, diagnostics, context);
			case _4Package.ITEM_TYPE:
				return validateItemType((ItemType)value, diagnostics, context);
			case _4Package.JOURNAL_ARTICLE_TYPE:
				return validateJournalArticleType((JournalArticleType)value, diagnostics, context);
			case _4Package.JOURNAL_ISSUE_TYPE:
				return validateJournalIssueType((JournalIssueType)value, diagnostics, context);
			case _4Package.JOURNAL_METADATA_TYPE:
				return validateJournalMetadataType((JournalMetadataType)value, diagnostics, context);
			case _4Package.JOURNAL_TYPE:
				return validateJournalType((JournalType)value, diagnostics, context);
			case _4Package.JOURNAL_VOLUME_TYPE:
				return validateJournalVolumeType((JournalVolumeType)value, diagnostics, context);
			case _4Package.NAME_TYPE1:
				return validateNameType1((NameType1)value, diagnostics, context);
			case _4Package.NOISBN_TYPE:
				return validateNoisbnType((NoisbnType)value, diagnostics, context);
			case _4Package.ORCID_TYPE:
				return validateORCIDType((ORCIDType)value, diagnostics, context);
			case _4Package.ORGANIZATION_TYPE:
				return validateOrganizationType((OrganizationType)value, diagnostics, context);
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE:
				return validateOriginalLanguageTitleType((OriginalLanguageTitleType)value, diagnostics, context);
			case _4Package.PAGES_TYPE:
				return validatePagesType((PagesType)value, diagnostics, context);
			case _4Package.PEER_REVIEW_TYPE:
				return validatePeerReviewType((PeerReviewType)value, diagnostics, context);
			case _4Package.PENDING_PUBLICATION_TYPE:
				return validatePendingPublicationType((PendingPublicationType)value, diagnostics, context);
			case _4Package.PERSON_NAME_TYPE:
				return validatePersonNameType((PersonNameType)value, diagnostics, context);
			case _4Package.POSTED_CONTENT_TYPE:
				return validatePostedContentType((PostedContentType)value, diagnostics, context);
			case _4Package.POSTED_DATE_TYPE:
				return validatePostedDateType((PostedDateType)value, diagnostics, context);
			case _4Package.PREFIX_TYPE:
				return validatePrefixType((PrefixType)value, diagnostics, context);
			case _4Package.PROCEEDINGS_METADATA_TYPE:
				return validateProceedingsMetadataType((ProceedingsMetadataType)value, diagnostics, context);
			case _4Package.PROCEEDINGS_SERIES_METADATA_TYPE:
				return validateProceedingsSeriesMetadataType((ProceedingsSeriesMetadataType)value, diagnostics, context);
			case _4Package.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case _4Package.PUBLICATION_DATE_TYPE:
				return validatePublicationDateType((PublicationDateType)value, diagnostics, context);
			case _4Package.PUBLICATION_TYPE:
				return validatePublicationType((PublicationType)value, diagnostics, context);
			case _4Package.PUBLISHER_ITEM_TYPE:
				return validatePublisherItemType((PublisherItemType)value, diagnostics, context);
			case _4Package.PUBLISHER_TYPE:
				return validatePublisherType((PublisherType)value, diagnostics, context);
			case _4Package.REPORT_PAPER_METADATA_TYPE:
				return validateReportPaperMetadataType((ReportPaperMetadataType)value, diagnostics, context);
			case _4Package.REPORT_PAPER_SERIES_METADATA_TYPE:
				return validateReportPaperSeriesMetadataType((ReportPaperSeriesMetadataType)value, diagnostics, context);
			case _4Package.REPORT_PAPER_TYPE:
				return validateReportPaperType((ReportPaperType)value, diagnostics, context);
			case _4Package.RESOURCE_TYPE:
				return validateResourceType((ResourceType)value, diagnostics, context);
			case _4Package.REVIEW_DATE_TYPE:
				return validateReviewDateType((ReviewDateType)value, diagnostics, context);
			case _4Package.SA_COMPONENT_TYPE:
				return validateSaComponentType((SaComponentType)value, diagnostics, context);
			case _4Package.SCN_POLICIES_TYPE:
				return validateScnPoliciesType((ScnPoliciesType)value, diagnostics, context);
			case _4Package.SCN_POLICY_REF_TYPE:
				return validateScnPolicyRefType((ScnPolicyRefType)value, diagnostics, context);
			case _4Package.SCN_POLICY_SET_TYPE:
				return validateScnPolicySetType((ScnPolicySetType)value, diagnostics, context);
			case _4Package.SERIES_METADATA_TYPE:
				return validateSeriesMetadataType((SeriesMetadataType)value, diagnostics, context);
			case _4Package.SET_METADATA_TYPE:
				return validateSetMetadataType((SetMetadataType)value, diagnostics, context);
			case _4Package.STANDARD_METADATA_TYPE:
				return validateStandardMetadataType((StandardMetadataType)value, diagnostics, context);
			case _4Package.STANDARDS_BODY_TYPE:
				return validateStandardsBodyType((StandardsBodyType)value, diagnostics, context);
			case _4Package.STANDARD_TYPE:
				return validateStandardType((StandardType)value, diagnostics, context);
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE:
				return validateStdAltAsPublishedType((StdAltAsPublishedType)value, diagnostics, context);
			case _4Package.STD_AS_PUBLISHED_TYPE:
				return validateStdAsPublishedType((StdAsPublishedType)value, diagnostics, context);
			case _4Package.STD_DESIGNATOR_T:
				return validateStdDesignatorT((StdDesignatorT)value, diagnostics, context);
			case _4Package.STD_SET_DESIGNATOR_TYPE:
				return validateStdSetDesignatorType((StdSetDesignatorType)value, diagnostics, context);
			case _4Package.STD_UNDATED_DESIGNATOR_TYPE:
				return validateStdUndatedDesignatorType((StdUndatedDesignatorType)value, diagnostics, context);
			case _4Package.STRING_NAME_TYPE:
				return validateStringNameType((StringNameType)value, diagnostics, context);
			case _4Package.SUBTITLE_TYPE:
				return validateSubtitleType((SubtitleType)value, diagnostics, context);
			case _4Package.TITLES_TYPE:
				return validateTitlesType((TitlesType)value, diagnostics, context);
			case _4Package.TITLE_TYPE:
				return validateTitleType((TitleType)value, diagnostics, context);
			case _4Package.UNASSIGNED_CONTENT_TYPE:
				return validateUnassignedContentType((UnassignedContentType)value, diagnostics, context);
			case _4Package.UNSTRUCTURED_CITATION_TYPE:
				return validateUnstructuredCitationType((UnstructuredCitationType)value, diagnostics, context);
			case _4Package.UPDATE_DATE_TYPE:
				return validateUpdateDateType((UpdateDateType)value, diagnostics, context);
			case _4Package.UPDATES_TYPE:
				return validateUpdatesType((UpdatesType)value, diagnostics, context);
			case _4Package.UPDATE_TYPE:
				return validateUpdateType((UpdateType)value, diagnostics, context);
			case _4Package.XREF_FACES:
				return validateXrefFaces((XrefFaces)value, diagnostics, context);
			case _4Package.BOOK_TYPE_TYPE:
				return validateBookTypeType((BookTypeType)value, diagnostics, context);
			case _4Package.CM_UPDATE_TYPE:
				return validateCmUpdateType((CmUpdateType)value, diagnostics, context);
			case _4Package.COMPONENT_TYPE_TYPE:
				return validateComponentTypeType((ComponentTypeType)value, diagnostics, context);
			case _4Package.CONTENT_VERSION_TYPE:
				return validateContentVersionType((ContentVersionType)value, diagnostics, context);
			case _4Package.CONTRIBUTOR_ROLE_TYPE:
				return validateContributorRoleType((ContributorRoleType)value, diagnostics, context);
			case _4Package.COUNTRY_TYPE:
				return validateCountryType((CountryType)value, diagnostics, context);
			case _4Package.CRAWLER_TYPE:
				return validateCrawlerType((CrawlerType)value, diagnostics, context);
			case _4Package.DATASET_TYPE_TYPE:
				return validateDatasetTypeType((DatasetTypeType)value, diagnostics, context);
			case _4Package.ID_TYPE_TYPE:
				return validateIdTypeType((IdTypeType)value, diagnostics, context);
			case _4Package.LANGUAGE_TYPE:
				return validateLanguageType((LanguageType)value, diagnostics, context);
			case _4Package.LINK_HEADER_RELATIONSHIP_TYPE:
				return validateLinkHeaderRelationshipType((LinkHeaderRelationshipType)value, diagnostics, context);
			case _4Package.MEDIA_TYPE_TYPE:
				return validateMediaTypeType((MediaTypeType)value, diagnostics, context);
			case _4Package.MEDIA_TYPE_TYPE1:
				return validateMediaTypeType1((MediaTypeType1)value, diagnostics, context);
			case _4Package.MIME_TYPE_TYPE:
				return validateMimeTypeType((MimeTypeType)value, diagnostics, context);
			case _4Package.MULTI_RESOLUTION_TYPE:
				return validateMultiResolutionType((MultiResolutionType)value, diagnostics, context);
			case _4Package.NAME_STYLE_TYPE:
				return validateNameStyleType((NameStyleType)value, diagnostics, context);
			case _4Package.NAME_STYLE_TYPE1:
				return validateNameStyleType1((NameStyleType1)value, diagnostics, context);
			case _4Package.NAME_STYLE_TYPE2:
				return validateNameStyleType2((NameStyleType2)value, diagnostics, context);
			case _4Package.NAME_TYPE:
				return validateNameType((NameType)value, diagnostics, context);
			case _4Package.PARENT_RELATION_TYPE:
				return validateParentRelationType((ParentRelationType)value, diagnostics, context);
			case _4Package.PROPERTY_TYPE1:
				return validatePropertyType1((PropertyType1)value, diagnostics, context);
			case _4Package.PUBLICATION_STATUS_TYPE:
				return validatePublicationStatusType((PublicationStatusType)value, diagnostics, context);
			case _4Package.PUBLICATION_TYPE_TYPE:
				return validatePublicationTypeType((PublicationTypeType)value, diagnostics, context);
			case _4Package.REASON_TYPE1:
				return validateReasonType1((ReasonType1)value, diagnostics, context);
			case _4Package.REASON_TYPE_ITEM:
				return validateReasonTypeItem((ReasonTypeItem)value, diagnostics, context);
			case _4Package.RECOMMENDATION_TYPE:
				return validateRecommendationType((RecommendationType)value, diagnostics, context);
			case _4Package.REFERENCE_DISTRIBUTION_OPTS_TYPE:
				return validateReferenceDistributionOptsType((ReferenceDistributionOptsType)value, diagnostics, context);
			case _4Package.SEQUENCE_TYPE:
				return validateSequenceType((SequenceType)value, diagnostics, context);
			case _4Package.STAGE_TYPE:
				return validateStageType((StageType)value, diagnostics, context);
			case _4Package.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case _4Package.TYPE_TYPE1:
				return validateTypeType1((TypeType1)value, diagnostics, context);
			case _4Package.TYPE_TYPE2:
				return validateTypeType2((TypeType2)value, diagnostics, context);
			case _4Package.ABBREV_TITLE_TYPE:
				return validateAbbrevTitleType((String)value, diagnostics, context);
			case _4Package.AFFILIATION_TYPE:
				return validateAffiliationType((String)value, diagnostics, context);
			case _4Package.APPROVED_MONTH_TYPE:
				return validateApprovedMonthType((BigInteger)value, diagnostics, context);
			case _4Package.APPROVED_YEAR_TYPE:
				return validateApprovedYearType((XMLGregorianCalendar)value, diagnostics, context);
			case _4Package.BOOK_TYPE_TYPE_OBJECT:
				return validateBookTypeTypeObject((BookTypeType)value, diagnostics, context);
			case _4Package.CM_ASSERTION:
				return validateCmAssertion((String)value, diagnostics, context);
			case _4Package.CM_ASSERTION_GROUP_LABEL:
				return validateCmAssertionGroupLabel((String)value, diagnostics, context);
			case _4Package.CM_ASSERTION_GROUP_NAME:
				return validateCmAssertionGroupName((String)value, diagnostics, context);
			case _4Package.CM_ASSERTION_LABEL:
				return validateCmAssertionLabel((String)value, diagnostics, context);
			case _4Package.CM_ASSERTION_NAME:
				return validateCmAssertionName((String)value, diagnostics, context);
			case _4Package.CM_DOMAIN:
				return validateCmDomain((String)value, diagnostics, context);
			case _4Package.CM_UPDATE_TYPE_OBJECT:
				return validateCmUpdateTypeObject((CmUpdateType)value, diagnostics, context);
			case _4Package.CODEN_TYPE:
				return validateCodenType((String)value, diagnostics, context);
			case _4Package.COMPONENT_NUMBER_TYPE:
				return validateComponentNumberType((String)value, diagnostics, context);
			case _4Package.COMPONENT_SIZE_TYPE:
				return validateComponentSizeType((BigInteger)value, diagnostics, context);
			case _4Package.COMPONENT_TYPE_TYPE_OBJECT:
				return validateComponentTypeTypeObject((ComponentTypeType)value, diagnostics, context);
			case _4Package.CONFERENCE_ACRONYM_TYPE:
				return validateConferenceAcronymType((String)value, diagnostics, context);
			case _4Package.CONFERENCE_DATE_T:
				return validateConferenceDateT((String)value, diagnostics, context);
			case _4Package.CONFERENCE_LOCATION_TYPE:
				return validateConferenceLocationType((String)value, diagnostics, context);
			case _4Package.CONFERENCE_NAME_TYPE:
				return validateConferenceNameType((String)value, diagnostics, context);
			case _4Package.CONFERENCE_NUMBER_TYPE:
				return validateConferenceNumberType((String)value, diagnostics, context);
			case _4Package.CONFERENCE_SPONSOR_TYPE:
				return validateConferenceSponsorType((String)value, diagnostics, context);
			case _4Package.CONFERENCE_THEME_TYPE:
				return validateConferenceThemeType((String)value, diagnostics, context);
			case _4Package.CONTENT_VERSION_TYPE_OBJECT:
				return validateContentVersionTypeObject((ContentVersionType)value, diagnostics, context);
			case _4Package.CONTRACT_NUMBER_TYPE:
				return validateContractNumberType((String)value, diagnostics, context);
			case _4Package.CONTRIBUTOR_ROLE_TYPE_OBJECT:
				return validateContributorRoleTypeObject((ContributorRoleType)value, diagnostics, context);
			case _4Package.COUNTRY_TYPE_OBJECT:
				return validateCountryTypeObject((CountryType)value, diagnostics, context);
			case _4Package.CRAWLER_TYPE_OBJECT:
				return validateCrawlerTypeObject((CrawlerType)value, diagnostics, context);
			case _4Package.DATASET_TYPE_TYPE_OBJECT:
				return validateDatasetTypeTypeObject((DatasetTypeType)value, diagnostics, context);
			case _4Package.DEGREE_TYPE:
				return validateDegreeType((String)value, diagnostics, context);
			case _4Package.DEPOSITOR_NAME_TYPE:
				return validateDepositorNameType((String)value, diagnostics, context);
			case _4Package.DOI_BATCH_ID_TYPE:
				return validateDoiBatchIdType((String)value, diagnostics, context);
			case _4Package.DOI_T:
				return validateDoiT((String)value, diagnostics, context);
			case _4Package.DOI_TYPE:
				return validateDoiType((String)value, diagnostics, context);
			case _4Package.EDITION_NUMBER_TYPE:
				return validateEditionNumberType((String)value, diagnostics, context);
			case _4Package.EMAIL_ADDRESS_TYPE:
				return validateEmailAddressType((String)value, diagnostics, context);
			case _4Package.FIRST_PAGE_TYPE:
				return validateFirstPageType((String)value, diagnostics, context);
			case _4Package.FORMAT_T:
				return validateFormatT((String)value, diagnostics, context);
			case _4Package.FULL_TITLE_TYPE:
				return validateFullTitleType((String)value, diagnostics, context);
			case _4Package.GIVEN_NAME_TYPE:
				return validateGivenNameType((String)value, diagnostics, context);
			case _4Package.GROUP_TITLE_TYPE:
				return validateGroupTitleType((String)value, diagnostics, context);
			case _4Package.IDENTIFIER_T:
				return validateIdentifierT((String)value, diagnostics, context);
			case _4Package.ID_TYPE_TYPE_OBJECT:
				return validateIdTypeTypeObject((IdTypeType)value, diagnostics, context);
			case _4Package.INSTITUTION_ACRONYM_TYPE:
				return validateInstitutionAcronymType((String)value, diagnostics, context);
			case _4Package.INSTITUTION_DEPARTMENT_TYPE:
				return validateInstitutionDepartmentType((String)value, diagnostics, context);
			case _4Package.INSTITUTION_NAME_TYPE:
				return validateInstitutionNameType((String)value, diagnostics, context);
			case _4Package.INSTITUTION_PLACE_TYPE:
				return validateInstitutionPlaceType((String)value, diagnostics, context);
			case _4Package.ISBN_T:
				return validateIsbnT((String)value, diagnostics, context);
			case _4Package.ISSN_T:
				return validateIssnT((String)value, diagnostics, context);
			case _4Package.ISSUE_TYPE:
				return validateIssueType((String)value, diagnostics, context);
			case _4Package.ITEM_NUMBER_T:
				return validateItemNumberT((String)value, diagnostics, context);
			case _4Package.KEY_TYPE:
				return validateKeyType((String)value, diagnostics, context);
			case _4Package.LABEL_TYPE:
				return validateLabelType((String)value, diagnostics, context);
			case _4Package.LANGUAGE_TYPE_OBJECT:
				return validateLanguageTypeObject((LanguageType)value, diagnostics, context);
			case _4Package.LAST_PAGE_TYPE:
				return validateLastPageType((String)value, diagnostics, context);
			case _4Package.LEVEL_SEQUENCE_NUMBER_TYPE:
				return validateLevelSequenceNumberType((BigInteger)value, diagnostics, context);
			case _4Package.LINK_HEADER_RELATIONSHIP_TYPE_OBJECT:
				return validateLinkHeaderRelationshipTypeObject((LinkHeaderRelationshipType)value, diagnostics, context);
			case _4Package.MEDIA_TYPE_TYPE_OBJECT:
				return validateMediaTypeTypeObject((MediaTypeType)value, diagnostics, context);
			case _4Package.MEDIA_TYPE_TYPE_OBJECT1:
				return validateMediaTypeTypeObject1((MediaTypeType1)value, diagnostics, context);
			case _4Package.MIME_TYPE_TYPE_OBJECT:
				return validateMimeTypeTypeObject((MimeTypeType)value, diagnostics, context);
			case _4Package.MULTI_RESOLUTION_TYPE_OBJECT:
				return validateMultiResolutionTypeObject((MultiResolutionType)value, diagnostics, context);
			case _4Package.NAME_STYLE_TYPE_OBJECT:
				return validateNameStyleTypeObject((NameStyleType)value, diagnostics, context);
			case _4Package.NAME_STYLE_TYPE_OBJECT1:
				return validateNameStyleTypeObject1((NameStyleType1)value, diagnostics, context);
			case _4Package.NAME_STYLE_TYPE_OBJECT2:
				return validateNameStyleTypeObject2((NameStyleType2)value, diagnostics, context);
			case _4Package.NAME_TYPE_OBJECT:
				return validateNameTypeObject((NameType)value, diagnostics, context);
			case _4Package.ORCID_T:
				return validateOrcidT((String)value, diagnostics, context);
			case _4Package.ORGANIZATION_T:
				return validateOrganizationT((String)value, diagnostics, context);
			case _4Package.OTHER_PAGES_TYPE:
				return validateOtherPagesType((String)value, diagnostics, context);
			case _4Package.PARENT_DOI_TYPE:
				return validateParentDoiType((String)value, diagnostics, context);
			case _4Package.PARENT_RELATION_TYPE_OBJECT:
				return validateParentRelationTypeObject((ParentRelationType)value, diagnostics, context);
			case _4Package.PART_NUMBER_TYPE:
				return validatePartNumberType((String)value, diagnostics, context);
			case _4Package.PROCEEDINGS_SUBJECT_TYPE:
				return validateProceedingsSubjectType((String)value, diagnostics, context);
			case _4Package.PROCEEDINGS_TITLE_TYPE:
				return validateProceedingsTitleType((String)value, diagnostics, context);
			case _4Package.PROPERTY_T:
				return validatePropertyT((String)value, diagnostics, context);
			case _4Package.PROPERTY_TYPE_OBJECT:
				return validatePropertyTypeObject((PropertyType1)value, diagnostics, context);
			case _4Package.PUBLICATION_STATUS_TYPE_OBJECT:
				return validatePublicationStatusTypeObject((PublicationStatusType)value, diagnostics, context);
			case _4Package.PUBLICATION_TYPE_TYPE_OBJECT:
				return validatePublicationTypeTypeObject((PublicationTypeType)value, diagnostics, context);
			case _4Package.PUBLISHER_NAME_TYPE:
				return validatePublisherNameType((String)value, diagnostics, context);
			case _4Package.PUBLISHER_PLACE_TYPE:
				return validatePublisherPlaceType((String)value, diagnostics, context);
			case _4Package.REASON_TYPE:
				return validateReasonType((List<?>)value, diagnostics, context);
			case _4Package.REASON_TYPE_ITEM_OBJECT:
				return validateReasonTypeItemObject((ReasonTypeItem)value, diagnostics, context);
			case _4Package.REASON_TYPE_OBJECT:
				return validateReasonTypeObject((ReasonType1)value, diagnostics, context);
			case _4Package.RECOMMENDATION_TYPE_OBJECT:
				return validateRecommendationTypeObject((RecommendationType)value, diagnostics, context);
			case _4Package.REFERENCE_DISTRIBUTION_OPTS_TYPE_OBJECT:
				return validateReferenceDistributionOptsTypeObject((ReferenceDistributionOptsType)value, diagnostics, context);
			case _4Package.REG_AGENCY_TYPE:
				return validateRegAgencyType((String)value, diagnostics, context);
			case _4Package.REGISTRANT_TYPE:
				return validateRegistrantType((String)value, diagnostics, context);
			case _4Package.RESOURCE_T:
				return validateResourceT((String)value, diagnostics, context);
			case _4Package.SEQUENCE_TYPE_OBJECT:
				return validateSequenceTypeObject((SequenceType)value, diagnostics, context);
			case _4Package.SERIES_NUMBER_TYPE:
				return validateSeriesNumberType((String)value, diagnostics, context);
			case _4Package.SPECIAL_NUMBERING_TYPE:
				return validateSpecialNumberingType((String)value, diagnostics, context);
			case _4Package.STAGE_TYPE_OBJECT:
				return validateStageTypeObject((StageType)value, diagnostics, context);
			case _4Package.STD_DESIGNATORVALUE_T:
				return validateStdDesignatorvalueT((String)value, diagnostics, context);
			case _4Package.SUFFIX_TYPE:
				return validateSuffixType((String)value, diagnostics, context);
			case _4Package.SURNAME_TYPE:
				return validateSurnameType((String)value, diagnostics, context);
			case _4Package.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case _4Package.TYPE_TYPE_OBJECT1:
				return validateTypeTypeObject1((TypeType1)value, diagnostics, context);
			case _4Package.TYPE_TYPE_OBJECT2:
				return validateTypeTypeObject2((TypeType2)value, diagnostics, context);
			case _4Package.VOLUME_TYPE:
				return validateVolumeType((String)value, diagnostics, context);
			case _4Package.XREF_DAY:
				return validateXrefDay((BigInteger)value, diagnostics, context);
			case _4Package.XREF_MONTH:
				return validateXrefMonth((BigInteger)value, diagnostics, context);
			case _4Package.XREF_YEAR:
				return validateXrefYear((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptanceDateType(AcceptanceDateType acceptanceDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acceptanceDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltNameType(AltNameType altNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(altNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnonymousType(AnonymousType anonymousType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anonymousType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovalDateType(ApprovalDateType approvalDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(approvalDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchiveLocationsType(ArchiveLocationsType archiveLocationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(archiveLocationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchiveType(ArchiveType archiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(archiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionType(AssertionType assertionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAType(AType aType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyType(BodyType bodyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookMetadataType(BookMetadataType bookMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookSeriesMetadataType(BookSeriesMetadataType bookSeriesMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookSeriesMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookSetMetadataType(BookSetMetadataType bookSetMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookSetMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookType(BookType bookType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationListType(CitationListType citationListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationT(CitationT citationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationType(CitationType citationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionType(CollectionType collectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompetingInterestStatementType(CompetingInterestStatementType competingInterestStatementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(competingInterestStatementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentListType(ComponentListType componentListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceDateType(ConferenceDateType conferenceDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conferenceDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferencePaperType(ConferencePaperType conferencePaperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conferencePaperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceType(ConferenceType conferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentDateType(ContentDateType contentDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentItemType(ContentItemType contentItemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributorsType(ContributorsType contributorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contributorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreationDateType(CreationDateType creationDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creationDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossmarkDomainsType(CrossmarkDomainsType crossmarkDomainsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossmarkDomainsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossmarkDomainType(CrossmarkDomainType crossmarkDomainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossmarkDomainType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossmarkType(CrossmarkType crossmarkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossmarkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomMetadataType(CustomMetadataType customMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseDateType(DatabaseDateType databaseDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseMetadataType(DatabaseMetadataType databaseMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseType(DatabaseType databaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetType(DatasetType datasetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datasetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateT(DateT dateT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreesType(DegreesType degreesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degreesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepositorType(DepositorType depositorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(depositorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType(DescriptionType descriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignatorsType(DesignatorsType designatorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designatorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDissertationType(DissertationType dissertationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dissertationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoiBatchType(DoiBatchType doiBatchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doiBatchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoiDataType(DoiDataType doiDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doiDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventMetadataType(EventMetadataType eventMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatType(FormatType formatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadType(HeadType headType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierType(IdentifierType identifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionType(InstitutionType institutionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(institutionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntentStatementType(IntentStatementType intentStatementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intentStatementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsbnType(IsbnType isbnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isbnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssnType(IssnType issnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemNumberType(ItemNumberType itemNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemType(ItemType itemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJournalArticleType(JournalArticleType journalArticleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(journalArticleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJournalIssueType(JournalIssueType journalIssueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(journalIssueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJournalMetadataType(JournalMetadataType journalMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(journalMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJournalType(JournalType journalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(journalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJournalVolumeType(JournalVolumeType journalVolumeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(journalVolumeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType1(NameType1 nameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoisbnType(NoisbnType noisbnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noisbnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateORCIDType(ORCIDType orcidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orcidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationType(OrganizationType organizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOriginalLanguageTitleType(OriginalLanguageTitleType originalLanguageTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(originalLanguageTitleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagesType(PagesType pagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pagesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeerReviewType(PeerReviewType peerReviewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(peerReviewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePendingPublicationType(PendingPublicationType pendingPublicationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pendingPublicationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonNameType(PersonNameType personNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostedContentType(PostedContentType postedContentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postedContentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostedDateType(PostedDateType postedDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postedDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixType(PrefixType prefixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prefixType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceedingsMetadataType(ProceedingsMetadataType proceedingsMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proceedingsMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceedingsSeriesMetadataType(ProceedingsSeriesMetadataType proceedingsSeriesMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proceedingsSeriesMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationDateType(PublicationDateType publicationDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationType(PublicationType publicationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisherItemType(PublisherItemType publisherItemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publisherItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisherType(PublisherType publisherType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publisherType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportPaperMetadataType(ReportPaperMetadataType reportPaperMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportPaperMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportPaperSeriesMetadataType(ReportPaperSeriesMetadataType reportPaperSeriesMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportPaperSeriesMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportPaperType(ReportPaperType reportPaperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportPaperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceType(ResourceType resourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewDateType(ReviewDateType reviewDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reviewDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSaComponentType(SaComponentType saComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(saComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScnPoliciesType(ScnPoliciesType scnPoliciesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scnPoliciesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScnPolicyRefType(ScnPolicyRefType scnPolicyRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scnPolicyRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScnPolicySetType(ScnPolicySetType scnPolicySetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scnPolicySetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesMetadataType(SeriesMetadataType seriesMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(seriesMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetMetadataType(SetMetadataType setMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardMetadataType(StandardMetadataType standardMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardsBodyType(StandardsBodyType standardsBodyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardsBodyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardType(StandardType standardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStdAltAsPublishedType(StdAltAsPublishedType stdAltAsPublishedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stdAltAsPublishedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStdAsPublishedType(StdAsPublishedType stdAsPublishedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stdAsPublishedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStdDesignatorT(StdDesignatorT stdDesignatorT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stdDesignatorT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStdSetDesignatorType(StdSetDesignatorType stdSetDesignatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stdSetDesignatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStdUndatedDesignatorType(StdUndatedDesignatorType stdUndatedDesignatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stdUndatedDesignatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringNameType(StringNameType stringNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubtitleType(SubtitleType subtitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subtitleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitlesType(TitlesType titlesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(titlesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleType(TitleType titleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(titleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnassignedContentType(UnassignedContentType unassignedContentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unassignedContentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredCitationType(UnstructuredCitationType unstructuredCitationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unstructuredCitationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateDateType(UpdateDateType updateDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdatesType(UpdatesType updatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateType(UpdateType updateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefFaces(XrefFaces xrefFaces, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xrefFaces, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookTypeType(BookTypeType bookTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmUpdateType(CmUpdateType cmUpdateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentTypeType(ComponentTypeType componentTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentVersionType(ContentVersionType contentVersionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributorRoleType(ContributorRoleType contributorRoleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryType(CountryType countryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrawlerType(CrawlerType crawlerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetTypeType(DatasetTypeType datasetTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdTypeType(IdTypeType idTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageType(LanguageType languageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkHeaderRelationshipType(LinkHeaderRelationshipType linkHeaderRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaTypeType(MediaTypeType mediaTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaTypeType1(MediaTypeType1 mediaTypeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeTypeType(MimeTypeType mimeTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiResolutionType(MultiResolutionType multiResolutionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameStyleType(NameStyleType nameStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameStyleType1(NameStyleType1 nameStyleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameStyleType2(NameStyleType2 nameStyleType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(NameType nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentRelationType(ParentRelationType parentRelationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType1(PropertyType1 propertyType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationStatusType(PublicationStatusType publicationStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationTypeType(PublicationTypeType publicationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonType1(ReasonType1 reasonType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonTypeItem(ReasonTypeItem reasonTypeItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecommendationType(RecommendationType recommendationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceDistributionOptsType(ReferenceDistributionOptsType referenceDistributionOptsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceType(SequenceType sequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStageType(StageType stageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1(TypeType1 typeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType2(TypeType2 typeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbbrevTitleType(String abbrevTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAbbrevTitleType_MinLength(abbrevTitleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbbrevTitleType_MaxLength(abbrevTitleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Abbrev Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbbrevTitleType_MinLength(String abbrevTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = abbrevTitleType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getAbbrevTitleType(), abbrevTitleType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Abbrev Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbbrevTitleType_MaxLength(String abbrevTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = abbrevTitleType.length();
		boolean result = length <= 150;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getAbbrevTitleType(), abbrevTitleType, length, 150, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffiliationType(String affiliationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAffiliationType_MinLength(affiliationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateAffiliationType_MaxLength(affiliationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Affiliation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffiliationType_MinLength(String affiliationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = affiliationType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getAffiliationType(), affiliationType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Affiliation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffiliationType_MaxLength(String affiliationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = affiliationType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getAffiliationType(), affiliationType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovedMonthType(BigInteger approvedMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateApprovedMonthType_Min(approvedMonthType, diagnostics, context);
		if (result || diagnostics != null) result &= validateApprovedMonthType_TotalDigits(approvedMonthType, diagnostics, context);
		if (result || diagnostics != null) result &= validateApprovedMonthType_Max(approvedMonthType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateApprovedMonthType_TotalDigits
	 */
	public static final BigInteger APPROVED_MONTH_TYPE__TOTAL_DIGITS__UPPER_BOUND = new BigInteger("100");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateApprovedMonthType_TotalDigits
	 */
	public static final BigInteger APPROVED_MONTH_TYPE__TOTAL_DIGITS__LOWER_BOUND = new BigInteger("-100");

	/**
	 * Validates the TotalDigits constraint of '<em>Approved Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovedMonthType_TotalDigits(BigInteger approvedMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = approvedMonthType.compareTo(APPROVED_MONTH_TYPE__TOTAL_DIGITS__LOWER_BOUND) > 0 && approvedMonthType.compareTo(APPROVED_MONTH_TYPE__TOTAL_DIGITS__UPPER_BOUND) < 0;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(_4Package.eINSTANCE.getApprovedMonthType(), approvedMonthType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateApprovedMonthType_Min
	 */
	public static final BigInteger APPROVED_MONTH_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Approved Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovedMonthType_Min(BigInteger approvedMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = approvedMonthType.compareTo(APPROVED_MONTH_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_4Package.eINSTANCE.getApprovedMonthType(), approvedMonthType, APPROVED_MONTH_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateApprovedMonthType_Max
	 */
	public static final BigInteger APPROVED_MONTH_TYPE__MAX__VALUE = new BigInteger("12");

	/**
	 * Validates the Max constraint of '<em>Approved Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovedMonthType_Max(BigInteger approvedMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = approvedMonthType.compareTo(APPROVED_MONTH_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_4Package.eINSTANCE.getApprovedMonthType(), approvedMonthType, APPROVED_MONTH_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovedYearType(XMLGregorianCalendar approvedYearType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookTypeTypeObject(BookTypeType bookTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertion(String cmAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCmAssertion_MinLength(cmAssertion, diagnostics, context);
		if (result || diagnostics != null) result &= validateCmAssertion_MaxLength(cmAssertion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Cm Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertion_MinLength(String cmAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmAssertion.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getCmAssertion(), cmAssertion, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Cm Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertion_MaxLength(String cmAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmAssertion.length();
		boolean result = length <= 1024;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getCmAssertion(), cmAssertion, length, 1024, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionGroupLabel(String cmAssertionGroupLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCmAssertionGroupLabel_MinLength(cmAssertionGroupLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateCmAssertionGroupLabel_MaxLength(cmAssertionGroupLabel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Cm Assertion Group Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionGroupLabel_MinLength(String cmAssertionGroupLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmAssertionGroupLabel.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getCmAssertionGroupLabel(), cmAssertionGroupLabel, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Cm Assertion Group Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionGroupLabel_MaxLength(String cmAssertionGroupLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmAssertionGroupLabel.length();
		boolean result = length <= 150;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getCmAssertionGroupLabel(), cmAssertionGroupLabel, length, 150, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionGroupName(String cmAssertionGroupName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNCName_Pattern(cmAssertionGroupName, diagnostics, context);
		if (result || diagnostics != null) result &= validateCmAssertionGroupName_MinLength(cmAssertionGroupName, diagnostics, context);
		if (result || diagnostics != null) result &= validateCmAssertionGroupName_MaxLength(cmAssertionGroupName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Cm Assertion Group Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionGroupName_MinLength(String cmAssertionGroupName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmAssertionGroupName.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getCmAssertionGroupName(), cmAssertionGroupName, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Cm Assertion Group Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionGroupName_MaxLength(String cmAssertionGroupName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmAssertionGroupName.length();
		boolean result = length <= 150;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getCmAssertionGroupName(), cmAssertionGroupName, length, 150, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionLabel(String cmAssertionLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCmAssertionLabel_MinLength(cmAssertionLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateCmAssertionLabel_MaxLength(cmAssertionLabel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Cm Assertion Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionLabel_MinLength(String cmAssertionLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmAssertionLabel.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getCmAssertionLabel(), cmAssertionLabel, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Cm Assertion Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionLabel_MaxLength(String cmAssertionLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmAssertionLabel.length();
		boolean result = length <= 150;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getCmAssertionLabel(), cmAssertionLabel, length, 150, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionName(String cmAssertionName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNCName_Pattern(cmAssertionName, diagnostics, context);
		if (result || diagnostics != null) result &= validateCmAssertionName_MinLength(cmAssertionName, diagnostics, context);
		if (result || diagnostics != null) result &= validateCmAssertionName_MaxLength(cmAssertionName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Cm Assertion Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionName_MinLength(String cmAssertionName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmAssertionName.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getCmAssertionName(), cmAssertionName, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Cm Assertion Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmAssertionName_MaxLength(String cmAssertionName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmAssertionName.length();
		boolean result = length <= 150;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getCmAssertionName(), cmAssertionName, length, 150, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmDomain(String cmDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCmDomain_Pattern(cmDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateCmDomain_MinLength(cmDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateCmDomain_MaxLength(cmDomain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCmDomain_Pattern
	 */
	public static final  PatternMatcher [][] CM_DOMAIN__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z0-9_]+([-.][A-Za-z0-9_]+)*\\.[A-Za-z0-9_]+([-.][A-Za-z0-9_]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Cm Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmDomain_Pattern(String cmDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_4Package.eINSTANCE.getCmDomain(), cmDomain, CM_DOMAIN__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Cm Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmDomain_MinLength(String cmDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmDomain.length();
		boolean result = length >= 4;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getCmDomain(), cmDomain, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Cm Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmDomain_MaxLength(String cmDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmDomain.length();
		boolean result = length <= 1024;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getCmDomain(), cmDomain, length, 1024, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmUpdateTypeObject(CmUpdateType cmUpdateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodenType(String codenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCodenType_MinLength(codenType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodenType_MaxLength(codenType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Coden Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodenType_MinLength(String codenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = codenType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getCodenType(), codenType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Coden Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodenType_MaxLength(String codenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = codenType.length();
		boolean result = length <= 6;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getCodenType(), codenType, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentNumberType(String componentNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateComponentNumberType_MinLength(componentNumberType, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentNumberType_MaxLength(componentNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Component Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentNumberType_MinLength(String componentNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = componentNumberType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getComponentNumberType(), componentNumberType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Component Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentNumberType_MaxLength(String componentNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = componentNumberType.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getComponentNumberType(), componentNumberType, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSizeType(BigInteger componentSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(componentSizeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentTypeTypeObject(ComponentTypeType componentTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceAcronymType(String conferenceAcronymType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConferenceAcronymType_MinLength(conferenceAcronymType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConferenceAcronymType_MaxLength(conferenceAcronymType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Conference Acronym Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceAcronymType_MinLength(String conferenceAcronymType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceAcronymType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getConferenceAcronymType(), conferenceAcronymType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Conference Acronym Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceAcronymType_MaxLength(String conferenceAcronymType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceAcronymType.length();
		boolean result = length <= 127;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getConferenceAcronymType(), conferenceAcronymType, length, 127, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceDateT(String conferenceDateT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConferenceDateT_MinLength(conferenceDateT, diagnostics, context);
		if (result || diagnostics != null) result &= validateConferenceDateT_MaxLength(conferenceDateT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Conference Date T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceDateT_MinLength(String conferenceDateT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceDateT.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getConferenceDateT(), conferenceDateT, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Conference Date T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceDateT_MaxLength(String conferenceDateT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceDateT.length();
		boolean result = length <= 100;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getConferenceDateT(), conferenceDateT, length, 100, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceLocationType(String conferenceLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConferenceLocationType_MinLength(conferenceLocationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConferenceLocationType_MaxLength(conferenceLocationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Conference Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceLocationType_MinLength(String conferenceLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceLocationType.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getConferenceLocationType(), conferenceLocationType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Conference Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceLocationType_MaxLength(String conferenceLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceLocationType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getConferenceLocationType(), conferenceLocationType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceNameType(String conferenceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConferenceNameType_MinLength(conferenceNameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConferenceNameType_MaxLength(conferenceNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Conference Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceNameType_MinLength(String conferenceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceNameType.length();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getConferenceNameType(), conferenceNameType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Conference Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceNameType_MaxLength(String conferenceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceNameType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getConferenceNameType(), conferenceNameType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceNumberType(String conferenceNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConferenceNumberType_MinLength(conferenceNumberType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConferenceNumberType_MaxLength(conferenceNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Conference Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceNumberType_MinLength(String conferenceNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceNumberType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getConferenceNumberType(), conferenceNumberType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Conference Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceNumberType_MaxLength(String conferenceNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceNumberType.length();
		boolean result = length <= 15;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getConferenceNumberType(), conferenceNumberType, length, 15, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceSponsorType(String conferenceSponsorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConferenceSponsorType_MinLength(conferenceSponsorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConferenceSponsorType_MaxLength(conferenceSponsorType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Conference Sponsor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceSponsorType_MinLength(String conferenceSponsorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceSponsorType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getConferenceSponsorType(), conferenceSponsorType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Conference Sponsor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceSponsorType_MaxLength(String conferenceSponsorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceSponsorType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getConferenceSponsorType(), conferenceSponsorType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceThemeType(String conferenceThemeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConferenceThemeType_MinLength(conferenceThemeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConferenceThemeType_MaxLength(conferenceThemeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Conference Theme Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceThemeType_MinLength(String conferenceThemeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceThemeType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getConferenceThemeType(), conferenceThemeType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Conference Theme Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConferenceThemeType_MaxLength(String conferenceThemeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = conferenceThemeType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getConferenceThemeType(), conferenceThemeType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentVersionTypeObject(ContentVersionType contentVersionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractNumberType(String contractNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateContractNumberType_MinLength(contractNumberType, diagnostics, context);
		if (result || diagnostics != null) result &= validateContractNumberType_MaxLength(contractNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Contract Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractNumberType_MinLength(String contractNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = contractNumberType.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getContractNumberType(), contractNumberType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Contract Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractNumberType_MaxLength(String contractNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = contractNumberType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getContractNumberType(), contractNumberType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributorRoleTypeObject(ContributorRoleType contributorRoleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryTypeObject(CountryType countryTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrawlerTypeObject(CrawlerType crawlerTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetTypeTypeObject(DatasetTypeType datasetTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeType(String degreeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDegreeType_MinLength(degreeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDegreeType_MaxLength(degreeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Degree Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeType_MinLength(String degreeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = degreeType.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getDegreeType(), degreeType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Degree Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeType_MaxLength(String degreeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = degreeType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getDegreeType(), degreeType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepositorNameType(String depositorNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDepositorNameType_MinLength(depositorNameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepositorNameType_MaxLength(depositorNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Depositor Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepositorNameType_MinLength(String depositorNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = depositorNameType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getDepositorNameType(), depositorNameType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Depositor Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepositorNameType_MaxLength(String depositorNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = depositorNameType.length();
		boolean result = length <= 130;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getDepositorNameType(), depositorNameType, length, 130, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoiBatchIdType(String doiBatchIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoiBatchIdType_MinLength(doiBatchIdType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoiBatchIdType_MaxLength(doiBatchIdType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Doi Batch Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoiBatchIdType_MinLength(String doiBatchIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = doiBatchIdType.length();
		boolean result = length >= 4;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getDoiBatchIdType(), doiBatchIdType, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Doi Batch Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoiBatchIdType_MaxLength(String doiBatchIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = doiBatchIdType.length();
		boolean result = length <= 100;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getDoiBatchIdType(), doiBatchIdType, length, 100, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoiT(String doiT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoiT_Pattern(doiT, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoiT_MinLength(doiT, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoiT_MaxLength(doiT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDoiT_Pattern
	 */
	public static final  PatternMatcher [][] DOI_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("10\\.[0-9]{4,9}/.{1,200}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Doi T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoiT_Pattern(String doiT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_4Package.eINSTANCE.getDoiT(), doiT, DOI_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Doi T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoiT_MinLength(String doiT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = doiT.length();
		boolean result = length >= 6;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getDoiT(), doiT, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Doi T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoiT_MaxLength(String doiT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = doiT.length();
		boolean result = length <= 2048;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getDoiT(), doiT, length, 2048, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoiType(String doiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoiT_Pattern(doiType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoiT_MinLength(doiType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoiT_MaxLength(doiType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditionNumberType(String editionNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEditionNumberType_MinLength(editionNumberType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEditionNumberType_MaxLength(editionNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Edition Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditionNumberType_MinLength(String editionNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = editionNumberType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getEditionNumberType(), editionNumberType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Edition Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditionNumberType_MaxLength(String editionNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = editionNumberType.length();
		boolean result = length <= 15;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getEditionNumberType(), editionNumberType, length, 15, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddressType(String emailAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEmailAddressType_Pattern(emailAddressType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmailAddressType_MinLength(emailAddressType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmailAddressType_MaxLength(emailAddressType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEmailAddressType_Pattern
	 */
	public static final  PatternMatcher [][] EMAIL_ADDRESS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\p{L}\\p{N}!/+\\-_]+(\\.[\\p{L}\\p{N}!/+\\-_]+)*@[\\p{L}\\p{N}!/+\\-_]+(\\.[\\p{L}_-]+)+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Email Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddressType_Pattern(String emailAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_4Package.eINSTANCE.getEmailAddressType(), emailAddressType, EMAIL_ADDRESS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Email Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddressType_MinLength(String emailAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = emailAddressType.length();
		boolean result = length >= 6;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getEmailAddressType(), emailAddressType, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Email Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddressType_MaxLength(String emailAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = emailAddressType.length();
		boolean result = length <= 200;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getEmailAddressType(), emailAddressType, length, 200, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstPageType(String firstPageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFirstPageType_MinLength(firstPageType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFirstPageType_MaxLength(firstPageType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>First Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstPageType_MinLength(String firstPageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = firstPageType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getFirstPageType(), firstPageType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>First Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstPageType_MaxLength(String firstPageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = firstPageType.length();
		boolean result = length <= 32;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getFirstPageType(), firstPageType, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatT(String formatT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFormatT_MinLength(formatT, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormatT_MaxLength(formatT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Format T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatT_MinLength(String formatT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = formatT.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getFormatT(), formatT, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Format T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatT_MaxLength(String formatT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = formatT.length();
		boolean result = length <= 130;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getFormatT(), formatT, length, 130, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFullTitleType(String fullTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFullTitleType_MinLength(fullTitleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFullTitleType_MaxLength(fullTitleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Full Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFullTitleType_MinLength(String fullTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = fullTitleType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getFullTitleType(), fullTitleType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Full Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFullTitleType_MaxLength(String fullTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = fullTitleType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getFullTitleType(), fullTitleType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGivenNameType(String givenNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGivenNameType_Pattern(givenNameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateGivenNameType_MinLength(givenNameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateGivenNameType_MaxLength(givenNameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGivenNameType_Pattern
	 */
	public static final  PatternMatcher [][] GIVEN_NAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\d\\?]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Given Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGivenNameType_Pattern(String givenNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_4Package.eINSTANCE.getGivenNameType(), givenNameType, GIVEN_NAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Given Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGivenNameType_MinLength(String givenNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = givenNameType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getGivenNameType(), givenNameType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Given Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGivenNameType_MaxLength(String givenNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = givenNameType.length();
		boolean result = length <= 60;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getGivenNameType(), givenNameType, length, 60, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupTitleType(String groupTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGroupTitleType_MinLength(groupTitleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateGroupTitleType_MaxLength(groupTitleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Group Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupTitleType_MinLength(String groupTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = groupTitleType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getGroupTitleType(), groupTitleType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Group Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupTitleType_MaxLength(String groupTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = groupTitleType.length();
		boolean result = length <= 1024;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getGroupTitleType(), groupTitleType, length, 1024, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierT(String identifierT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdentifierT_MinLength(identifierT, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifierT_MaxLength(identifierT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Identifier T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierT_MinLength(String identifierT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = identifierT.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getIdentifierT(), identifierT, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Identifier T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierT_MaxLength(String identifierT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = identifierT.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getIdentifierT(), identifierT, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdTypeTypeObject(IdTypeType idTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionAcronymType(String institutionAcronymType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInstitutionAcronymType_MinLength(institutionAcronymType, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstitutionAcronymType_MaxLength(institutionAcronymType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Institution Acronym Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionAcronymType_MinLength(String institutionAcronymType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = institutionAcronymType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getInstitutionAcronymType(), institutionAcronymType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Institution Acronym Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionAcronymType_MaxLength(String institutionAcronymType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = institutionAcronymType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getInstitutionAcronymType(), institutionAcronymType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionDepartmentType(String institutionDepartmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInstitutionDepartmentType_MinLength(institutionDepartmentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstitutionDepartmentType_MaxLength(institutionDepartmentType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Institution Department Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionDepartmentType_MinLength(String institutionDepartmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = institutionDepartmentType.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getInstitutionDepartmentType(), institutionDepartmentType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Institution Department Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionDepartmentType_MaxLength(String institutionDepartmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = institutionDepartmentType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getInstitutionDepartmentType(), institutionDepartmentType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionNameType(String institutionNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInstitutionNameType_MinLength(institutionNameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstitutionNameType_MaxLength(institutionNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Institution Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionNameType_MinLength(String institutionNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = institutionNameType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getInstitutionNameType(), institutionNameType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Institution Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionNameType_MaxLength(String institutionNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = institutionNameType.length();
		boolean result = length <= 1024;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getInstitutionNameType(), institutionNameType, length, 1024, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionPlaceType(String institutionPlaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInstitutionPlaceType_MinLength(institutionPlaceType, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstitutionPlaceType_MaxLength(institutionPlaceType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Institution Place Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionPlaceType_MinLength(String institutionPlaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = institutionPlaceType.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getInstitutionPlaceType(), institutionPlaceType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Institution Place Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitutionPlaceType_MaxLength(String institutionPlaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = institutionPlaceType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getInstitutionPlaceType(), institutionPlaceType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsbnT(String isbnT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIsbnT_Pattern(isbnT, diagnostics, context);
		if (result || diagnostics != null) result &= validateIsbnT_MinLength(isbnT, diagnostics, context);
		if (result || diagnostics != null) result &= validateIsbnT_MaxLength(isbnT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIsbnT_Pattern
	 */
	public static final  PatternMatcher [][] ISBN_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(978-)?\\d[\\d \\-]+[\\dX]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Isbn T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsbnT_Pattern(String isbnT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_4Package.eINSTANCE.getIsbnT(), isbnT, ISBN_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Isbn T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsbnT_MinLength(String isbnT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = isbnT.length();
		boolean result = length >= 10;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getIsbnT(), isbnT, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Isbn T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsbnT_MaxLength(String isbnT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = isbnT.length();
		boolean result = length <= 17;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getIsbnT(), isbnT, length, 17, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssnT(String issnT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIssnT_Pattern(issnT, diagnostics, context);
		if (result || diagnostics != null) result &= validateIssnT_MinLength(issnT, diagnostics, context);
		if (result || diagnostics != null) result &= validateIssnT_MaxLength(issnT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIssnT_Pattern
	 */
	public static final  PatternMatcher [][] ISSN_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\d{4}-?\\d{3}[\\dX]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Issn T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssnT_Pattern(String issnT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_4Package.eINSTANCE.getIssnT(), issnT, ISSN_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Issn T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssnT_MinLength(String issnT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = issnT.length();
		boolean result = length >= 8;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getIssnT(), issnT, length, 8, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Issn T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssnT_MaxLength(String issnT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = issnT.length();
		boolean result = length <= 9;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getIssnT(), issnT, length, 9, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueType(String issueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIssueType_MinLength(issueType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIssueType_MaxLength(issueType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueType_MinLength(String issueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = issueType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getIssueType(), issueType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueType_MaxLength(String issueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = issueType.length();
		boolean result = length <= 32;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getIssueType(), issueType, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemNumberT(String itemNumberT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateItemNumberT_MinLength(itemNumberT, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemNumberT_MaxLength(itemNumberT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Item Number T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemNumberT_MinLength(String itemNumberT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = itemNumberT.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getItemNumberT(), itemNumberT, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Item Number T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemNumberT_MaxLength(String itemNumberT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = itemNumberT.length();
		boolean result = length <= 32;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getItemNumberT(), itemNumberT, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyType(String keyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateKeyType_MinLength(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validateKeyType_MaxLength(keyType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyType_MinLength(String keyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = keyType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getKeyType(), keyType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyType_MaxLength(String keyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = keyType.length();
		boolean result = length <= 128;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getKeyType(), keyType, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType(String labelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLabelType_MinLength(labelType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLabelType_MaxLength(labelType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType_MinLength(String labelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = labelType.length();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getLabelType(), labelType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType_MaxLength(String labelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = labelType.length();
		boolean result = length <= 128;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getLabelType(), labelType, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageTypeObject(LanguageType languageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastPageType(String lastPageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLastPageType_MinLength(lastPageType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLastPageType_MaxLength(lastPageType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Last Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastPageType_MinLength(String lastPageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = lastPageType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getLastPageType(), lastPageType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Last Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastPageType_MaxLength(String lastPageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = lastPageType.length();
		boolean result = length <= 32;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getLastPageType(), lastPageType, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelSequenceNumberType(BigInteger levelSequenceNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLevelSequenceNumberType_Min(levelSequenceNumberType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLevelSequenceNumberType_TotalDigits(levelSequenceNumberType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLevelSequenceNumberType_Max(levelSequenceNumberType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLevelSequenceNumberType_TotalDigits
	 */
	public static final BigInteger LEVEL_SEQUENCE_NUMBER_TYPE__TOTAL_DIGITS__UPPER_BOUND = new BigInteger("10");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLevelSequenceNumberType_TotalDigits
	 */
	public static final BigInteger LEVEL_SEQUENCE_NUMBER_TYPE__TOTAL_DIGITS__LOWER_BOUND = new BigInteger("-10");

	/**
	 * Validates the TotalDigits constraint of '<em>Level Sequence Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelSequenceNumberType_TotalDigits(BigInteger levelSequenceNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = levelSequenceNumberType.compareTo(LEVEL_SEQUENCE_NUMBER_TYPE__TOTAL_DIGITS__LOWER_BOUND) > 0 && levelSequenceNumberType.compareTo(LEVEL_SEQUENCE_NUMBER_TYPE__TOTAL_DIGITS__UPPER_BOUND) < 0;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(_4Package.eINSTANCE.getLevelSequenceNumberType(), levelSequenceNumberType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLevelSequenceNumberType_Min
	 */
	public static final BigInteger LEVEL_SEQUENCE_NUMBER_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Level Sequence Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelSequenceNumberType_Min(BigInteger levelSequenceNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = levelSequenceNumberType.compareTo(LEVEL_SEQUENCE_NUMBER_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_4Package.eINSTANCE.getLevelSequenceNumberType(), levelSequenceNumberType, LEVEL_SEQUENCE_NUMBER_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLevelSequenceNumberType_Max
	 */
	public static final BigInteger LEVEL_SEQUENCE_NUMBER_TYPE__MAX__VALUE = new BigInteger("9");

	/**
	 * Validates the Max constraint of '<em>Level Sequence Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelSequenceNumberType_Max(BigInteger levelSequenceNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = levelSequenceNumberType.compareTo(LEVEL_SEQUENCE_NUMBER_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_4Package.eINSTANCE.getLevelSequenceNumberType(), levelSequenceNumberType, LEVEL_SEQUENCE_NUMBER_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkHeaderRelationshipTypeObject(LinkHeaderRelationshipType linkHeaderRelationshipTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaTypeTypeObject(MediaTypeType mediaTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaTypeTypeObject1(MediaTypeType1 mediaTypeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeTypeTypeObject(MimeTypeType mimeTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiResolutionTypeObject(MultiResolutionType multiResolutionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameStyleTypeObject(NameStyleType nameStyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameStyleTypeObject1(NameStyleType1 nameStyleTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameStyleTypeObject2(NameStyleType2 nameStyleTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameTypeObject(NameType nameTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrcidT(String orcidT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOrcidT_Pattern(orcidT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOrcidT_Pattern
	 */
	public static final  PatternMatcher [][] ORCID_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("https?://orcid.org/[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{3}[X0-9]{1}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Orcid T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrcidT_Pattern(String orcidT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_4Package.eINSTANCE.getOrcidT(), orcidT, ORCID_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationT(String organizationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOrganizationT_MinLength(organizationT, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrganizationT_MaxLength(organizationT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Organization T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationT_MinLength(String organizationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = organizationT.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getOrganizationT(), organizationT, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Organization T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationT_MaxLength(String organizationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = organizationT.length();
		boolean result = length <= 511;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getOrganizationT(), organizationT, length, 511, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPagesType(String otherPagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOtherPagesType_MinLength(otherPagesType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOtherPagesType_MaxLength(otherPagesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Other Pages Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPagesType_MinLength(String otherPagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = otherPagesType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getOtherPagesType(), otherPagesType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Other Pages Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPagesType_MaxLength(String otherPagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = otherPagesType.length();
		boolean result = length <= 100;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getOtherPagesType(), otherPagesType, length, 100, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentDoiType(String parentDoiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateParentDoiType_MinLength(parentDoiType, diagnostics, context);
		if (result || diagnostics != null) result &= validateParentDoiType_MaxLength(parentDoiType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Parent Doi Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentDoiType_MinLength(String parentDoiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = parentDoiType.length();
		boolean result = length >= 6;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getParentDoiType(), parentDoiType, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Parent Doi Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentDoiType_MaxLength(String parentDoiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = parentDoiType.length();
		boolean result = length <= 2048;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getParentDoiType(), parentDoiType, length, 2048, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentRelationTypeObject(ParentRelationType parentRelationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartNumberType(String partNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePartNumberType_MinLength(partNumberType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartNumberType_MaxLength(partNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Part Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartNumberType_MinLength(String partNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = partNumberType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getPartNumberType(), partNumberType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Part Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartNumberType_MaxLength(String partNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = partNumberType.length();
		boolean result = length <= 15;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getPartNumberType(), partNumberType, length, 15, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceedingsSubjectType(String proceedingsSubjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateProceedingsSubjectType_MinLength(proceedingsSubjectType, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceedingsSubjectType_MaxLength(proceedingsSubjectType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Proceedings Subject Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceedingsSubjectType_MinLength(String proceedingsSubjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = proceedingsSubjectType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getProceedingsSubjectType(), proceedingsSubjectType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Proceedings Subject Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceedingsSubjectType_MaxLength(String proceedingsSubjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = proceedingsSubjectType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getProceedingsSubjectType(), proceedingsSubjectType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceedingsTitleType(String proceedingsTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateProceedingsTitleType_MinLength(proceedingsTitleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceedingsTitleType_MaxLength(proceedingsTitleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Proceedings Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceedingsTitleType_MinLength(String proceedingsTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = proceedingsTitleType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getProceedingsTitleType(), proceedingsTitleType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Proceedings Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceedingsTitleType_MaxLength(String proceedingsTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = proceedingsTitleType.length();
		boolean result = length <= 511;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getProceedingsTitleType(), proceedingsTitleType, length, 511, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyT(String propertyT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePropertyT_MinLength(propertyT, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyT_MaxLength(propertyT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Property T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyT_MinLength(String propertyT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = propertyT.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getPropertyT(), propertyT, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Property T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyT_MaxLength(String propertyT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = propertyT.length();
		boolean result = length <= 2048;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getPropertyT(), propertyT, length, 2048, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeObject(PropertyType1 propertyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationStatusTypeObject(PublicationStatusType publicationStatusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationTypeTypeObject(PublicationTypeType publicationTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisherNameType(String publisherNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePublisherNameType_MinLength(publisherNameType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePublisherNameType_MaxLength(publisherNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Publisher Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisherNameType_MinLength(String publisherNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = publisherNameType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getPublisherNameType(), publisherNameType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Publisher Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisherNameType_MaxLength(String publisherNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = publisherNameType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getPublisherNameType(), publisherNameType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisherPlaceType(String publisherPlaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePublisherPlaceType_MinLength(publisherPlaceType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePublisherPlaceType_MaxLength(publisherPlaceType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Publisher Place Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisherPlaceType_MinLength(String publisherPlaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = publisherPlaceType.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getPublisherPlaceType(), publisherPlaceType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Publisher Place Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisherPlaceType_MaxLength(String publisherPlaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = publisherPlaceType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getPublisherPlaceType(), publisherPlaceType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonType(List<?> reasonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateReasonType_ItemType(reasonType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Reason Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonType_ItemType(List<?> reasonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = reasonType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (_4Package.eINSTANCE.getReasonTypeItem().isInstance(item)) {
				result &= validateReasonTypeItem((ReasonTypeItem)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(_4Package.eINSTANCE.getReasonTypeItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonTypeItemObject(ReasonTypeItem reasonTypeItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonTypeObject(ReasonType1 reasonTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecommendationTypeObject(RecommendationType recommendationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceDistributionOptsTypeObject(ReferenceDistributionOptsType referenceDistributionOptsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegAgencyType(String regAgencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistrantType(String registrantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRegistrantType_MinLength(registrantType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegistrantType_MaxLength(registrantType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Registrant Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistrantType_MinLength(String registrantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = registrantType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getRegistrantType(), registrantType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Registrant Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistrantType_MaxLength(String registrantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = registrantType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getRegistrantType(), registrantType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceT(String resourceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateResourceT_Pattern(resourceT, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceT_MinLength(resourceT, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceT_MaxLength(resourceT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateResourceT_Pattern
	 */
	public static final  PatternMatcher [][] RESOURCE_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([hH][tT][tT][pP]|[hH][tT][tT][pP][sS]|[fF][tT][pP])://.*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Resource T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceT_Pattern(String resourceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_4Package.eINSTANCE.getResourceT(), resourceT, RESOURCE_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Resource T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceT_MinLength(String resourceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = resourceT.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getResourceT(), resourceT, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Resource T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceT_MaxLength(String resourceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = resourceT.length();
		boolean result = length <= 2048;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getResourceT(), resourceT, length, 2048, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceTypeObject(SequenceType sequenceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesNumberType(String seriesNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSeriesNumberType_MinLength(seriesNumberType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeriesNumberType_MaxLength(seriesNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Series Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesNumberType_MinLength(String seriesNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = seriesNumberType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getSeriesNumberType(), seriesNumberType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Series Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesNumberType_MaxLength(String seriesNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = seriesNumberType.length();
		boolean result = length <= 15;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getSeriesNumberType(), seriesNumberType, length, 15, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialNumberingType(String specialNumberingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSpecialNumberingType_MinLength(specialNumberingType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialNumberingType_MaxLength(specialNumberingType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Special Numbering Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialNumberingType_MinLength(String specialNumberingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = specialNumberingType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getSpecialNumberingType(), specialNumberingType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Special Numbering Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialNumberingType_MaxLength(String specialNumberingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = specialNumberingType.length();
		boolean result = length <= 15;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getSpecialNumberingType(), specialNumberingType, length, 15, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStageTypeObject(StageType stageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStdDesignatorvalueT(String stdDesignatorvalueT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStdDesignatorvalueT_MinLength(stdDesignatorvalueT, diagnostics, context);
		if (result || diagnostics != null) result &= validateStdDesignatorvalueT_MaxLength(stdDesignatorvalueT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Std Designatorvalue T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStdDesignatorvalueT_MinLength(String stdDesignatorvalueT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = stdDesignatorvalueT.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getStdDesignatorvalueT(), stdDesignatorvalueT, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Std Designatorvalue T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStdDesignatorvalueT_MaxLength(String stdDesignatorvalueT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = stdDesignatorvalueT.length();
		boolean result = length <= 150;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getStdDesignatorvalueT(), stdDesignatorvalueT, length, 150, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuffixType(String suffixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSuffixType_MinLength(suffixType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSuffixType_MaxLength(suffixType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Suffix Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuffixType_MinLength(String suffixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = suffixType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getSuffixType(), suffixType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Suffix Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuffixType_MaxLength(String suffixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = suffixType.length();
		boolean result = length <= 10;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getSuffixType(), suffixType, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurnameType(String surnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSurnameType_Pattern(surnameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSurnameType_MinLength(surnameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSurnameType_MaxLength(surnameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSurnameType_Pattern
	 */
	public static final  PatternMatcher [][] SURNAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\d\\?]*[^\\?\\s]+[^\\d]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Surname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurnameType_Pattern(String surnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_4Package.eINSTANCE.getSurnameType(), surnameType, SURNAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Surname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurnameType_MinLength(String surnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = surnameType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getSurnameType(), surnameType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Surname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurnameType_MaxLength(String surnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = surnameType.length();
		boolean result = length <= 60;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getSurnameType(), surnameType, length, 60, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject1(TypeType1 typeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject2(TypeType2 typeTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeType(String volumeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVolumeType_MinLength(volumeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateVolumeType_MaxLength(volumeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeType_MinLength(String volumeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = volumeType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_4Package.eINSTANCE.getVolumeType(), volumeType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeType_MaxLength(String volumeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = volumeType.length();
		boolean result = length <= 32;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_4Package.eINSTANCE.getVolumeType(), volumeType, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefDay(BigInteger xrefDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateXrefDay_Min(xrefDay, diagnostics, context);
		if (result || diagnostics != null) result &= validateXrefDay_TotalDigits(xrefDay, diagnostics, context);
		if (result || diagnostics != null) result &= validateXrefDay_Max(xrefDay, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefDay_TotalDigits
	 */
	public static final BigInteger XREF_DAY__TOTAL_DIGITS__UPPER_BOUND = new BigInteger("100");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefDay_TotalDigits
	 */
	public static final BigInteger XREF_DAY__TOTAL_DIGITS__LOWER_BOUND = new BigInteger("-100");

	/**
	 * Validates the TotalDigits constraint of '<em>Xref Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefDay_TotalDigits(BigInteger xrefDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xrefDay.compareTo(XREF_DAY__TOTAL_DIGITS__LOWER_BOUND) > 0 && xrefDay.compareTo(XREF_DAY__TOTAL_DIGITS__UPPER_BOUND) < 0;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(_4Package.eINSTANCE.getXrefDay(), xrefDay, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefDay_Min
	 */
	public static final BigInteger XREF_DAY__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Xref Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefDay_Min(BigInteger xrefDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xrefDay.compareTo(XREF_DAY__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_4Package.eINSTANCE.getXrefDay(), xrefDay, XREF_DAY__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefDay_Max
	 */
	public static final BigInteger XREF_DAY__MAX__VALUE = new BigInteger("31");

	/**
	 * Validates the Max constraint of '<em>Xref Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefDay_Max(BigInteger xrefDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xrefDay.compareTo(XREF_DAY__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_4Package.eINSTANCE.getXrefDay(), xrefDay, XREF_DAY__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefMonth(BigInteger xrefMonth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateXrefMonth_Min(xrefMonth, diagnostics, context);
		if (result || diagnostics != null) result &= validateXrefMonth_TotalDigits(xrefMonth, diagnostics, context);
		if (result || diagnostics != null) result &= validateXrefMonth_Max(xrefMonth, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefMonth_TotalDigits
	 */
	public static final BigInteger XREF_MONTH__TOTAL_DIGITS__UPPER_BOUND = new BigInteger("100");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefMonth_TotalDigits
	 */
	public static final BigInteger XREF_MONTH__TOTAL_DIGITS__LOWER_BOUND = new BigInteger("-100");

	/**
	 * Validates the TotalDigits constraint of '<em>Xref Month</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefMonth_TotalDigits(BigInteger xrefMonth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xrefMonth.compareTo(XREF_MONTH__TOTAL_DIGITS__LOWER_BOUND) > 0 && xrefMonth.compareTo(XREF_MONTH__TOTAL_DIGITS__UPPER_BOUND) < 0;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(_4Package.eINSTANCE.getXrefMonth(), xrefMonth, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefMonth_Min
	 */
	public static final BigInteger XREF_MONTH__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Xref Month</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefMonth_Min(BigInteger xrefMonth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xrefMonth.compareTo(XREF_MONTH__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_4Package.eINSTANCE.getXrefMonth(), xrefMonth, XREF_MONTH__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefMonth_Max
	 */
	public static final BigInteger XREF_MONTH__MAX__VALUE = new BigInteger("34");

	/**
	 * Validates the Max constraint of '<em>Xref Month</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefMonth_Max(BigInteger xrefMonth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xrefMonth.compareTo(XREF_MONTH__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_4Package.eINSTANCE.getXrefMonth(), xrefMonth, XREF_MONTH__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefYear(BigInteger xrefYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateXrefYear_Min(xrefYear, diagnostics, context);
		if (result || diagnostics != null) result &= validateXrefYear_TotalDigits(xrefYear, diagnostics, context);
		if (result || diagnostics != null) result &= validateXrefYear_Max(xrefYear, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefYear_TotalDigits
	 */
	public static final BigInteger XREF_YEAR__TOTAL_DIGITS__UPPER_BOUND = new BigInteger("10000");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefYear_TotalDigits
	 */
	public static final BigInteger XREF_YEAR__TOTAL_DIGITS__LOWER_BOUND = new BigInteger("-10000");

	/**
	 * Validates the TotalDigits constraint of '<em>Xref Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefYear_TotalDigits(BigInteger xrefYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xrefYear.compareTo(XREF_YEAR__TOTAL_DIGITS__LOWER_BOUND) > 0 && xrefYear.compareTo(XREF_YEAR__TOTAL_DIGITS__UPPER_BOUND) < 0;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(_4Package.eINSTANCE.getXrefYear(), xrefYear, 4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefYear_Min
	 */
	public static final BigInteger XREF_YEAR__MIN__VALUE = new BigInteger("1400");

	/**
	 * Validates the Min constraint of '<em>Xref Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefYear_Min(BigInteger xrefYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xrefYear.compareTo(XREF_YEAR__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_4Package.eINSTANCE.getXrefYear(), xrefYear, XREF_YEAR__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXrefYear_Max
	 */
	public static final BigInteger XREF_YEAR__MAX__VALUE = new BigInteger("2200");

	/**
	 * Validates the Max constraint of '<em>Xref Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefYear_Max(BigInteger xrefYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xrefYear.compareTo(XREF_YEAR__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_4Package.eINSTANCE.getXrefYear(), xrefYear, XREF_YEAR__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //_4Validator
