/**
 */
package org.crossref.schema._4._4.impl;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.crossref.schema._4._4.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _4FactoryImpl extends EFactoryImpl implements _4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _4Factory init() {
		try {
			_4Factory the_4Factory = (_4Factory)EPackage.Registry.INSTANCE.getEFactory(_4Package.eNS_URI);
			if (the_4Factory != null) {
				return the_4Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _4FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _4Package.ACCEPTANCE_DATE_TYPE: return createAcceptanceDateType();
			case _4Package.ALT_NAME_TYPE: return createAltNameType();
			case _4Package.ANONYMOUS_TYPE: return createAnonymousType();
			case _4Package.APPROVAL_DATE_TYPE: return createApprovalDateType();
			case _4Package.ARCHIVE_LOCATIONS_TYPE: return createArchiveLocationsType();
			case _4Package.ARCHIVE_TYPE: return createArchiveType();
			case _4Package.ASSERTION_TYPE: return createAssertionType();
			case _4Package.ATYPE: return createAType();
			case _4Package.BODY_TYPE: return createBodyType();
			case _4Package.BOOK_METADATA_TYPE: return createBookMetadataType();
			case _4Package.BOOK_SERIES_METADATA_TYPE: return createBookSeriesMetadataType();
			case _4Package.BOOK_SET_METADATA_TYPE: return createBookSetMetadataType();
			case _4Package.BOOK_TYPE: return createBookType();
			case _4Package.CITATION_LIST_TYPE: return createCitationListType();
			case _4Package.CITATION_T: return createCitationT();
			case _4Package.CITATION_TYPE: return createCitationType();
			case _4Package.COLLECTION_TYPE: return createCollectionType();
			case _4Package.COMPETING_INTEREST_STATEMENT_TYPE: return createCompetingInterestStatementType();
			case _4Package.COMPONENT_LIST_TYPE: return createComponentListType();
			case _4Package.COMPONENT_TYPE: return createComponentType();
			case _4Package.CONFERENCE_DATE_TYPE: return createConferenceDateType();
			case _4Package.CONFERENCE_PAPER_TYPE: return createConferencePaperType();
			case _4Package.CONFERENCE_TYPE: return createConferenceType();
			case _4Package.CONTENT_DATE_TYPE: return createContentDateType();
			case _4Package.CONTENT_ITEM_TYPE: return createContentItemType();
			case _4Package.CONTRIBUTORS_TYPE: return createContributorsType();
			case _4Package.CREATION_DATE_TYPE: return createCreationDateType();
			case _4Package.CROSSMARK_DOMAINS_TYPE: return createCrossmarkDomainsType();
			case _4Package.CROSSMARK_DOMAIN_TYPE: return createCrossmarkDomainType();
			case _4Package.CROSSMARK_TYPE: return createCrossmarkType();
			case _4Package.CUSTOM_METADATA_TYPE: return createCustomMetadataType();
			case _4Package.DATABASE_DATE_TYPE: return createDatabaseDateType();
			case _4Package.DATABASE_METADATA_TYPE: return createDatabaseMetadataType();
			case _4Package.DATABASE_TYPE: return createDatabaseType();
			case _4Package.DATASET_TYPE: return createDatasetType();
			case _4Package.DATE_T: return createDateT();
			case _4Package.DEGREES_TYPE: return createDegreesType();
			case _4Package.DEPOSITOR_TYPE: return createDepositorType();
			case _4Package.DESCRIPTION_TYPE: return createDescriptionType();
			case _4Package.DESIGNATORS_TYPE: return createDesignatorsType();
			case _4Package.DISSERTATION_TYPE: return createDissertationType();
			case _4Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _4Package.DOI_BATCH_TYPE: return createDoiBatchType();
			case _4Package.DOI_DATA_TYPE: return createDoiDataType();
			case _4Package.EVENT_METADATA_TYPE: return createEventMetadataType();
			case _4Package.FORMAT_TYPE: return createFormatType();
			case _4Package.HEAD_TYPE: return createHeadType();
			case _4Package.IDENTIFIER_TYPE: return createIdentifierType();
			case _4Package.INSTITUTION_TYPE: return createInstitutionType();
			case _4Package.INTENT_STATEMENT_TYPE: return createIntentStatementType();
			case _4Package.ISBN_TYPE: return createIsbnType();
			case _4Package.ISSN_TYPE: return createIssnType();
			case _4Package.ITEM_NUMBER_TYPE: return createItemNumberType();
			case _4Package.ITEM_TYPE: return createItemType();
			case _4Package.JOURNAL_ARTICLE_TYPE: return createJournalArticleType();
			case _4Package.JOURNAL_ISSUE_TYPE: return createJournalIssueType();
			case _4Package.JOURNAL_METADATA_TYPE: return createJournalMetadataType();
			case _4Package.JOURNAL_TYPE: return createJournalType();
			case _4Package.JOURNAL_VOLUME_TYPE: return createJournalVolumeType();
			case _4Package.NAME_TYPE1: return createNameType1();
			case _4Package.NOISBN_TYPE: return createNoisbnType();
			case _4Package.ORCID_TYPE: return createORCIDType();
			case _4Package.ORGANIZATION_TYPE: return createOrganizationType();
			case _4Package.ORIGINAL_LANGUAGE_TITLE_TYPE: return createOriginalLanguageTitleType();
			case _4Package.PAGES_TYPE: return createPagesType();
			case _4Package.PEER_REVIEW_TYPE: return createPeerReviewType();
			case _4Package.PENDING_PUBLICATION_TYPE: return createPendingPublicationType();
			case _4Package.PERSON_NAME_TYPE: return createPersonNameType();
			case _4Package.POSTED_CONTENT_TYPE: return createPostedContentType();
			case _4Package.POSTED_DATE_TYPE: return createPostedDateType();
			case _4Package.PREFIX_TYPE: return createPrefixType();
			case _4Package.PROCEEDINGS_METADATA_TYPE: return createProceedingsMetadataType();
			case _4Package.PROCEEDINGS_SERIES_METADATA_TYPE: return createProceedingsSeriesMetadataType();
			case _4Package.PROPERTY_TYPE: return createPropertyType();
			case _4Package.PUBLICATION_DATE_TYPE: return createPublicationDateType();
			case _4Package.PUBLICATION_TYPE: return createPublicationType();
			case _4Package.PUBLISHER_ITEM_TYPE: return createPublisherItemType();
			case _4Package.PUBLISHER_TYPE: return createPublisherType();
			case _4Package.REPORT_PAPER_METADATA_TYPE: return createReportPaperMetadataType();
			case _4Package.REPORT_PAPER_SERIES_METADATA_TYPE: return createReportPaperSeriesMetadataType();
			case _4Package.REPORT_PAPER_TYPE: return createReportPaperType();
			case _4Package.RESOURCE_TYPE: return createResourceType();
			case _4Package.REVIEW_DATE_TYPE: return createReviewDateType();
			case _4Package.SA_COMPONENT_TYPE: return createSaComponentType();
			case _4Package.SCN_POLICIES_TYPE: return createScnPoliciesType();
			case _4Package.SCN_POLICY_REF_TYPE: return createScnPolicyRefType();
			case _4Package.SCN_POLICY_SET_TYPE: return createScnPolicySetType();
			case _4Package.SERIES_METADATA_TYPE: return createSeriesMetadataType();
			case _4Package.SET_METADATA_TYPE: return createSetMetadataType();
			case _4Package.STANDARD_METADATA_TYPE: return createStandardMetadataType();
			case _4Package.STANDARDS_BODY_TYPE: return createStandardsBodyType();
			case _4Package.STANDARD_TYPE: return createStandardType();
			case _4Package.STD_ALT_AS_PUBLISHED_TYPE: return createStdAltAsPublishedType();
			case _4Package.STD_AS_PUBLISHED_TYPE: return createStdAsPublishedType();
			case _4Package.STD_DESIGNATOR_T: return createStdDesignatorT();
			case _4Package.STD_SET_DESIGNATOR_TYPE: return createStdSetDesignatorType();
			case _4Package.STD_UNDATED_DESIGNATOR_TYPE: return createStdUndatedDesignatorType();
			case _4Package.STRING_NAME_TYPE: return createStringNameType();
			case _4Package.SUBTITLE_TYPE: return createSubtitleType();
			case _4Package.TITLES_TYPE: return createTitlesType();
			case _4Package.TITLE_TYPE: return createTitleType();
			case _4Package.UNASSIGNED_CONTENT_TYPE: return createUnassignedContentType();
			case _4Package.UNSTRUCTURED_CITATION_TYPE: return createUnstructuredCitationType();
			case _4Package.UPDATE_DATE_TYPE: return createUpdateDateType();
			case _4Package.UPDATES_TYPE: return createUpdatesType();
			case _4Package.UPDATE_TYPE: return createUpdateType();
			case _4Package.XREF_FACES: return createXrefFaces();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _4Package.BOOK_TYPE_TYPE:
				return createBookTypeTypeFromString(eDataType, initialValue);
			case _4Package.CM_UPDATE_TYPE:
				return createCmUpdateTypeFromString(eDataType, initialValue);
			case _4Package.COMPONENT_TYPE_TYPE:
				return createComponentTypeTypeFromString(eDataType, initialValue);
			case _4Package.CONTENT_VERSION_TYPE:
				return createContentVersionTypeFromString(eDataType, initialValue);
			case _4Package.CONTRIBUTOR_ROLE_TYPE:
				return createContributorRoleTypeFromString(eDataType, initialValue);
			case _4Package.COUNTRY_TYPE:
				return createCountryTypeFromString(eDataType, initialValue);
			case _4Package.CRAWLER_TYPE:
				return createCrawlerTypeFromString(eDataType, initialValue);
			case _4Package.DATASET_TYPE_TYPE:
				return createDatasetTypeTypeFromString(eDataType, initialValue);
			case _4Package.ID_TYPE_TYPE:
				return createIdTypeTypeFromString(eDataType, initialValue);
			case _4Package.LANGUAGE_TYPE:
				return createLanguageTypeFromString(eDataType, initialValue);
			case _4Package.LINK_HEADER_RELATIONSHIP_TYPE:
				return createLinkHeaderRelationshipTypeFromString(eDataType, initialValue);
			case _4Package.MEDIA_TYPE_TYPE:
				return createMediaTypeTypeFromString(eDataType, initialValue);
			case _4Package.MEDIA_TYPE_TYPE1:
				return createMediaTypeType1FromString(eDataType, initialValue);
			case _4Package.MIME_TYPE_TYPE:
				return createMimeTypeTypeFromString(eDataType, initialValue);
			case _4Package.MULTI_RESOLUTION_TYPE:
				return createMultiResolutionTypeFromString(eDataType, initialValue);
			case _4Package.NAME_STYLE_TYPE:
				return createNameStyleTypeFromString(eDataType, initialValue);
			case _4Package.NAME_STYLE_TYPE1:
				return createNameStyleType1FromString(eDataType, initialValue);
			case _4Package.NAME_STYLE_TYPE2:
				return createNameStyleType2FromString(eDataType, initialValue);
			case _4Package.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case _4Package.PARENT_RELATION_TYPE:
				return createParentRelationTypeFromString(eDataType, initialValue);
			case _4Package.PROPERTY_TYPE1:
				return createPropertyType1FromString(eDataType, initialValue);
			case _4Package.PUBLICATION_STATUS_TYPE:
				return createPublicationStatusTypeFromString(eDataType, initialValue);
			case _4Package.PUBLICATION_TYPE_TYPE:
				return createPublicationTypeTypeFromString(eDataType, initialValue);
			case _4Package.REASON_TYPE1:
				return createReasonType1FromString(eDataType, initialValue);
			case _4Package.REASON_TYPE_ITEM:
				return createReasonTypeItemFromString(eDataType, initialValue);
			case _4Package.RECOMMENDATION_TYPE:
				return createRecommendationTypeFromString(eDataType, initialValue);
			case _4Package.REFERENCE_DISTRIBUTION_OPTS_TYPE:
				return createReferenceDistributionOptsTypeFromString(eDataType, initialValue);
			case _4Package.SEQUENCE_TYPE:
				return createSequenceTypeFromString(eDataType, initialValue);
			case _4Package.STAGE_TYPE:
				return createStageTypeFromString(eDataType, initialValue);
			case _4Package.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case _4Package.TYPE_TYPE1:
				return createTypeType1FromString(eDataType, initialValue);
			case _4Package.TYPE_TYPE2:
				return createTypeType2FromString(eDataType, initialValue);
			case _4Package.ABBREV_TITLE_TYPE:
				return createAbbrevTitleTypeFromString(eDataType, initialValue);
			case _4Package.AFFILIATION_TYPE:
				return createAffiliationTypeFromString(eDataType, initialValue);
			case _4Package.APPROVED_MONTH_TYPE:
				return createApprovedMonthTypeFromString(eDataType, initialValue);
			case _4Package.APPROVED_YEAR_TYPE:
				return createApprovedYearTypeFromString(eDataType, initialValue);
			case _4Package.BOOK_TYPE_TYPE_OBJECT:
				return createBookTypeTypeObjectFromString(eDataType, initialValue);
			case _4Package.CM_ASSERTION:
				return createCmAssertionFromString(eDataType, initialValue);
			case _4Package.CM_ASSERTION_GROUP_LABEL:
				return createCmAssertionGroupLabelFromString(eDataType, initialValue);
			case _4Package.CM_ASSERTION_GROUP_NAME:
				return createCmAssertionGroupNameFromString(eDataType, initialValue);
			case _4Package.CM_ASSERTION_LABEL:
				return createCmAssertionLabelFromString(eDataType, initialValue);
			case _4Package.CM_ASSERTION_NAME:
				return createCmAssertionNameFromString(eDataType, initialValue);
			case _4Package.CM_DOMAIN:
				return createCmDomainFromString(eDataType, initialValue);
			case _4Package.CM_UPDATE_TYPE_OBJECT:
				return createCmUpdateTypeObjectFromString(eDataType, initialValue);
			case _4Package.CODEN_TYPE:
				return createCodenTypeFromString(eDataType, initialValue);
			case _4Package.COMPONENT_NUMBER_TYPE:
				return createComponentNumberTypeFromString(eDataType, initialValue);
			case _4Package.COMPONENT_SIZE_TYPE:
				return createComponentSizeTypeFromString(eDataType, initialValue);
			case _4Package.COMPONENT_TYPE_TYPE_OBJECT:
				return createComponentTypeTypeObjectFromString(eDataType, initialValue);
			case _4Package.CONFERENCE_ACRONYM_TYPE:
				return createConferenceAcronymTypeFromString(eDataType, initialValue);
			case _4Package.CONFERENCE_DATE_T:
				return createConferenceDateTFromString(eDataType, initialValue);
			case _4Package.CONFERENCE_LOCATION_TYPE:
				return createConferenceLocationTypeFromString(eDataType, initialValue);
			case _4Package.CONFERENCE_NAME_TYPE:
				return createConferenceNameTypeFromString(eDataType, initialValue);
			case _4Package.CONFERENCE_NUMBER_TYPE:
				return createConferenceNumberTypeFromString(eDataType, initialValue);
			case _4Package.CONFERENCE_SPONSOR_TYPE:
				return createConferenceSponsorTypeFromString(eDataType, initialValue);
			case _4Package.CONFERENCE_THEME_TYPE:
				return createConferenceThemeTypeFromString(eDataType, initialValue);
			case _4Package.CONTENT_VERSION_TYPE_OBJECT:
				return createContentVersionTypeObjectFromString(eDataType, initialValue);
			case _4Package.CONTRACT_NUMBER_TYPE:
				return createContractNumberTypeFromString(eDataType, initialValue);
			case _4Package.CONTRIBUTOR_ROLE_TYPE_OBJECT:
				return createContributorRoleTypeObjectFromString(eDataType, initialValue);
			case _4Package.COUNTRY_TYPE_OBJECT:
				return createCountryTypeObjectFromString(eDataType, initialValue);
			case _4Package.CRAWLER_TYPE_OBJECT:
				return createCrawlerTypeObjectFromString(eDataType, initialValue);
			case _4Package.DATASET_TYPE_TYPE_OBJECT:
				return createDatasetTypeTypeObjectFromString(eDataType, initialValue);
			case _4Package.DEGREE_TYPE:
				return createDegreeTypeFromString(eDataType, initialValue);
			case _4Package.DEPOSITOR_NAME_TYPE:
				return createDepositorNameTypeFromString(eDataType, initialValue);
			case _4Package.DOI_BATCH_ID_TYPE:
				return createDoiBatchIdTypeFromString(eDataType, initialValue);
			case _4Package.DOI_T:
				return createDoiTFromString(eDataType, initialValue);
			case _4Package.DOI_TYPE:
				return createDoiTypeFromString(eDataType, initialValue);
			case _4Package.EDITION_NUMBER_TYPE:
				return createEditionNumberTypeFromString(eDataType, initialValue);
			case _4Package.EMAIL_ADDRESS_TYPE:
				return createEmailAddressTypeFromString(eDataType, initialValue);
			case _4Package.FIRST_PAGE_TYPE:
				return createFirstPageTypeFromString(eDataType, initialValue);
			case _4Package.FORMAT_T:
				return createFormatTFromString(eDataType, initialValue);
			case _4Package.FULL_TITLE_TYPE:
				return createFullTitleTypeFromString(eDataType, initialValue);
			case _4Package.GIVEN_NAME_TYPE:
				return createGivenNameTypeFromString(eDataType, initialValue);
			case _4Package.GROUP_TITLE_TYPE:
				return createGroupTitleTypeFromString(eDataType, initialValue);
			case _4Package.IDENTIFIER_T:
				return createIdentifierTFromString(eDataType, initialValue);
			case _4Package.ID_TYPE_TYPE_OBJECT:
				return createIdTypeTypeObjectFromString(eDataType, initialValue);
			case _4Package.INSTITUTION_ACRONYM_TYPE:
				return createInstitutionAcronymTypeFromString(eDataType, initialValue);
			case _4Package.INSTITUTION_DEPARTMENT_TYPE:
				return createInstitutionDepartmentTypeFromString(eDataType, initialValue);
			case _4Package.INSTITUTION_NAME_TYPE:
				return createInstitutionNameTypeFromString(eDataType, initialValue);
			case _4Package.INSTITUTION_PLACE_TYPE:
				return createInstitutionPlaceTypeFromString(eDataType, initialValue);
			case _4Package.ISBN_T:
				return createIsbnTFromString(eDataType, initialValue);
			case _4Package.ISSN_T:
				return createIssnTFromString(eDataType, initialValue);
			case _4Package.ISSUE_TYPE:
				return createIssueTypeFromString(eDataType, initialValue);
			case _4Package.ITEM_NUMBER_T:
				return createItemNumberTFromString(eDataType, initialValue);
			case _4Package.KEY_TYPE:
				return createKeyTypeFromString(eDataType, initialValue);
			case _4Package.LABEL_TYPE:
				return createLabelTypeFromString(eDataType, initialValue);
			case _4Package.LANGUAGE_TYPE_OBJECT:
				return createLanguageTypeObjectFromString(eDataType, initialValue);
			case _4Package.LAST_PAGE_TYPE:
				return createLastPageTypeFromString(eDataType, initialValue);
			case _4Package.LEVEL_SEQUENCE_NUMBER_TYPE:
				return createLevelSequenceNumberTypeFromString(eDataType, initialValue);
			case _4Package.LINK_HEADER_RELATIONSHIP_TYPE_OBJECT:
				return createLinkHeaderRelationshipTypeObjectFromString(eDataType, initialValue);
			case _4Package.MEDIA_TYPE_TYPE_OBJECT:
				return createMediaTypeTypeObjectFromString(eDataType, initialValue);
			case _4Package.MEDIA_TYPE_TYPE_OBJECT1:
				return createMediaTypeTypeObject1FromString(eDataType, initialValue);
			case _4Package.MIME_TYPE_TYPE_OBJECT:
				return createMimeTypeTypeObjectFromString(eDataType, initialValue);
			case _4Package.MULTI_RESOLUTION_TYPE_OBJECT:
				return createMultiResolutionTypeObjectFromString(eDataType, initialValue);
			case _4Package.NAME_STYLE_TYPE_OBJECT:
				return createNameStyleTypeObjectFromString(eDataType, initialValue);
			case _4Package.NAME_STYLE_TYPE_OBJECT1:
				return createNameStyleTypeObject1FromString(eDataType, initialValue);
			case _4Package.NAME_STYLE_TYPE_OBJECT2:
				return createNameStyleTypeObject2FromString(eDataType, initialValue);
			case _4Package.NAME_TYPE_OBJECT:
				return createNameTypeObjectFromString(eDataType, initialValue);
			case _4Package.ORCID_T:
				return createOrcidTFromString(eDataType, initialValue);
			case _4Package.ORGANIZATION_T:
				return createOrganizationTFromString(eDataType, initialValue);
			case _4Package.OTHER_PAGES_TYPE:
				return createOtherPagesTypeFromString(eDataType, initialValue);
			case _4Package.PARENT_DOI_TYPE:
				return createParentDoiTypeFromString(eDataType, initialValue);
			case _4Package.PARENT_RELATION_TYPE_OBJECT:
				return createParentRelationTypeObjectFromString(eDataType, initialValue);
			case _4Package.PART_NUMBER_TYPE:
				return createPartNumberTypeFromString(eDataType, initialValue);
			case _4Package.PROCEEDINGS_SUBJECT_TYPE:
				return createProceedingsSubjectTypeFromString(eDataType, initialValue);
			case _4Package.PROCEEDINGS_TITLE_TYPE:
				return createProceedingsTitleTypeFromString(eDataType, initialValue);
			case _4Package.PROPERTY_T:
				return createPropertyTFromString(eDataType, initialValue);
			case _4Package.PROPERTY_TYPE_OBJECT:
				return createPropertyTypeObjectFromString(eDataType, initialValue);
			case _4Package.PUBLICATION_STATUS_TYPE_OBJECT:
				return createPublicationStatusTypeObjectFromString(eDataType, initialValue);
			case _4Package.PUBLICATION_TYPE_TYPE_OBJECT:
				return createPublicationTypeTypeObjectFromString(eDataType, initialValue);
			case _4Package.PUBLISHER_NAME_TYPE:
				return createPublisherNameTypeFromString(eDataType, initialValue);
			case _4Package.PUBLISHER_PLACE_TYPE:
				return createPublisherPlaceTypeFromString(eDataType, initialValue);
			case _4Package.REASON_TYPE:
				return createReasonTypeFromString(eDataType, initialValue);
			case _4Package.REASON_TYPE_ITEM_OBJECT:
				return createReasonTypeItemObjectFromString(eDataType, initialValue);
			case _4Package.REASON_TYPE_OBJECT:
				return createReasonTypeObjectFromString(eDataType, initialValue);
			case _4Package.RECOMMENDATION_TYPE_OBJECT:
				return createRecommendationTypeObjectFromString(eDataType, initialValue);
			case _4Package.REFERENCE_DISTRIBUTION_OPTS_TYPE_OBJECT:
				return createReferenceDistributionOptsTypeObjectFromString(eDataType, initialValue);
			case _4Package.REG_AGENCY_TYPE:
				return createRegAgencyTypeFromString(eDataType, initialValue);
			case _4Package.REGISTRANT_TYPE:
				return createRegistrantTypeFromString(eDataType, initialValue);
			case _4Package.RESOURCE_T:
				return createResourceTFromString(eDataType, initialValue);
			case _4Package.SEQUENCE_TYPE_OBJECT:
				return createSequenceTypeObjectFromString(eDataType, initialValue);
			case _4Package.SERIES_NUMBER_TYPE:
				return createSeriesNumberTypeFromString(eDataType, initialValue);
			case _4Package.SPECIAL_NUMBERING_TYPE:
				return createSpecialNumberingTypeFromString(eDataType, initialValue);
			case _4Package.STAGE_TYPE_OBJECT:
				return createStageTypeObjectFromString(eDataType, initialValue);
			case _4Package.STD_DESIGNATORVALUE_T:
				return createStdDesignatorvalueTFromString(eDataType, initialValue);
			case _4Package.SUFFIX_TYPE:
				return createSuffixTypeFromString(eDataType, initialValue);
			case _4Package.SURNAME_TYPE:
				return createSurnameTypeFromString(eDataType, initialValue);
			case _4Package.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case _4Package.TYPE_TYPE_OBJECT1:
				return createTypeTypeObject1FromString(eDataType, initialValue);
			case _4Package.TYPE_TYPE_OBJECT2:
				return createTypeTypeObject2FromString(eDataType, initialValue);
			case _4Package.VOLUME_TYPE:
				return createVolumeTypeFromString(eDataType, initialValue);
			case _4Package.XREF_DAY:
				return createXrefDayFromString(eDataType, initialValue);
			case _4Package.XREF_MONTH:
				return createXrefMonthFromString(eDataType, initialValue);
			case _4Package.XREF_YEAR:
				return createXrefYearFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _4Package.BOOK_TYPE_TYPE:
				return convertBookTypeTypeToString(eDataType, instanceValue);
			case _4Package.CM_UPDATE_TYPE:
				return convertCmUpdateTypeToString(eDataType, instanceValue);
			case _4Package.COMPONENT_TYPE_TYPE:
				return convertComponentTypeTypeToString(eDataType, instanceValue);
			case _4Package.CONTENT_VERSION_TYPE:
				return convertContentVersionTypeToString(eDataType, instanceValue);
			case _4Package.CONTRIBUTOR_ROLE_TYPE:
				return convertContributorRoleTypeToString(eDataType, instanceValue);
			case _4Package.COUNTRY_TYPE:
				return convertCountryTypeToString(eDataType, instanceValue);
			case _4Package.CRAWLER_TYPE:
				return convertCrawlerTypeToString(eDataType, instanceValue);
			case _4Package.DATASET_TYPE_TYPE:
				return convertDatasetTypeTypeToString(eDataType, instanceValue);
			case _4Package.ID_TYPE_TYPE:
				return convertIdTypeTypeToString(eDataType, instanceValue);
			case _4Package.LANGUAGE_TYPE:
				return convertLanguageTypeToString(eDataType, instanceValue);
			case _4Package.LINK_HEADER_RELATIONSHIP_TYPE:
				return convertLinkHeaderRelationshipTypeToString(eDataType, instanceValue);
			case _4Package.MEDIA_TYPE_TYPE:
				return convertMediaTypeTypeToString(eDataType, instanceValue);
			case _4Package.MEDIA_TYPE_TYPE1:
				return convertMediaTypeType1ToString(eDataType, instanceValue);
			case _4Package.MIME_TYPE_TYPE:
				return convertMimeTypeTypeToString(eDataType, instanceValue);
			case _4Package.MULTI_RESOLUTION_TYPE:
				return convertMultiResolutionTypeToString(eDataType, instanceValue);
			case _4Package.NAME_STYLE_TYPE:
				return convertNameStyleTypeToString(eDataType, instanceValue);
			case _4Package.NAME_STYLE_TYPE1:
				return convertNameStyleType1ToString(eDataType, instanceValue);
			case _4Package.NAME_STYLE_TYPE2:
				return convertNameStyleType2ToString(eDataType, instanceValue);
			case _4Package.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case _4Package.PARENT_RELATION_TYPE:
				return convertParentRelationTypeToString(eDataType, instanceValue);
			case _4Package.PROPERTY_TYPE1:
				return convertPropertyType1ToString(eDataType, instanceValue);
			case _4Package.PUBLICATION_STATUS_TYPE:
				return convertPublicationStatusTypeToString(eDataType, instanceValue);
			case _4Package.PUBLICATION_TYPE_TYPE:
				return convertPublicationTypeTypeToString(eDataType, instanceValue);
			case _4Package.REASON_TYPE1:
				return convertReasonType1ToString(eDataType, instanceValue);
			case _4Package.REASON_TYPE_ITEM:
				return convertReasonTypeItemToString(eDataType, instanceValue);
			case _4Package.RECOMMENDATION_TYPE:
				return convertRecommendationTypeToString(eDataType, instanceValue);
			case _4Package.REFERENCE_DISTRIBUTION_OPTS_TYPE:
				return convertReferenceDistributionOptsTypeToString(eDataType, instanceValue);
			case _4Package.SEQUENCE_TYPE:
				return convertSequenceTypeToString(eDataType, instanceValue);
			case _4Package.STAGE_TYPE:
				return convertStageTypeToString(eDataType, instanceValue);
			case _4Package.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case _4Package.TYPE_TYPE1:
				return convertTypeType1ToString(eDataType, instanceValue);
			case _4Package.TYPE_TYPE2:
				return convertTypeType2ToString(eDataType, instanceValue);
			case _4Package.ABBREV_TITLE_TYPE:
				return convertAbbrevTitleTypeToString(eDataType, instanceValue);
			case _4Package.AFFILIATION_TYPE:
				return convertAffiliationTypeToString(eDataType, instanceValue);
			case _4Package.APPROVED_MONTH_TYPE:
				return convertApprovedMonthTypeToString(eDataType, instanceValue);
			case _4Package.APPROVED_YEAR_TYPE:
				return convertApprovedYearTypeToString(eDataType, instanceValue);
			case _4Package.BOOK_TYPE_TYPE_OBJECT:
				return convertBookTypeTypeObjectToString(eDataType, instanceValue);
			case _4Package.CM_ASSERTION:
				return convertCmAssertionToString(eDataType, instanceValue);
			case _4Package.CM_ASSERTION_GROUP_LABEL:
				return convertCmAssertionGroupLabelToString(eDataType, instanceValue);
			case _4Package.CM_ASSERTION_GROUP_NAME:
				return convertCmAssertionGroupNameToString(eDataType, instanceValue);
			case _4Package.CM_ASSERTION_LABEL:
				return convertCmAssertionLabelToString(eDataType, instanceValue);
			case _4Package.CM_ASSERTION_NAME:
				return convertCmAssertionNameToString(eDataType, instanceValue);
			case _4Package.CM_DOMAIN:
				return convertCmDomainToString(eDataType, instanceValue);
			case _4Package.CM_UPDATE_TYPE_OBJECT:
				return convertCmUpdateTypeObjectToString(eDataType, instanceValue);
			case _4Package.CODEN_TYPE:
				return convertCodenTypeToString(eDataType, instanceValue);
			case _4Package.COMPONENT_NUMBER_TYPE:
				return convertComponentNumberTypeToString(eDataType, instanceValue);
			case _4Package.COMPONENT_SIZE_TYPE:
				return convertComponentSizeTypeToString(eDataType, instanceValue);
			case _4Package.COMPONENT_TYPE_TYPE_OBJECT:
				return convertComponentTypeTypeObjectToString(eDataType, instanceValue);
			case _4Package.CONFERENCE_ACRONYM_TYPE:
				return convertConferenceAcronymTypeToString(eDataType, instanceValue);
			case _4Package.CONFERENCE_DATE_T:
				return convertConferenceDateTToString(eDataType, instanceValue);
			case _4Package.CONFERENCE_LOCATION_TYPE:
				return convertConferenceLocationTypeToString(eDataType, instanceValue);
			case _4Package.CONFERENCE_NAME_TYPE:
				return convertConferenceNameTypeToString(eDataType, instanceValue);
			case _4Package.CONFERENCE_NUMBER_TYPE:
				return convertConferenceNumberTypeToString(eDataType, instanceValue);
			case _4Package.CONFERENCE_SPONSOR_TYPE:
				return convertConferenceSponsorTypeToString(eDataType, instanceValue);
			case _4Package.CONFERENCE_THEME_TYPE:
				return convertConferenceThemeTypeToString(eDataType, instanceValue);
			case _4Package.CONTENT_VERSION_TYPE_OBJECT:
				return convertContentVersionTypeObjectToString(eDataType, instanceValue);
			case _4Package.CONTRACT_NUMBER_TYPE:
				return convertContractNumberTypeToString(eDataType, instanceValue);
			case _4Package.CONTRIBUTOR_ROLE_TYPE_OBJECT:
				return convertContributorRoleTypeObjectToString(eDataType, instanceValue);
			case _4Package.COUNTRY_TYPE_OBJECT:
				return convertCountryTypeObjectToString(eDataType, instanceValue);
			case _4Package.CRAWLER_TYPE_OBJECT:
				return convertCrawlerTypeObjectToString(eDataType, instanceValue);
			case _4Package.DATASET_TYPE_TYPE_OBJECT:
				return convertDatasetTypeTypeObjectToString(eDataType, instanceValue);
			case _4Package.DEGREE_TYPE:
				return convertDegreeTypeToString(eDataType, instanceValue);
			case _4Package.DEPOSITOR_NAME_TYPE:
				return convertDepositorNameTypeToString(eDataType, instanceValue);
			case _4Package.DOI_BATCH_ID_TYPE:
				return convertDoiBatchIdTypeToString(eDataType, instanceValue);
			case _4Package.DOI_T:
				return convertDoiTToString(eDataType, instanceValue);
			case _4Package.DOI_TYPE:
				return convertDoiTypeToString(eDataType, instanceValue);
			case _4Package.EDITION_NUMBER_TYPE:
				return convertEditionNumberTypeToString(eDataType, instanceValue);
			case _4Package.EMAIL_ADDRESS_TYPE:
				return convertEmailAddressTypeToString(eDataType, instanceValue);
			case _4Package.FIRST_PAGE_TYPE:
				return convertFirstPageTypeToString(eDataType, instanceValue);
			case _4Package.FORMAT_T:
				return convertFormatTToString(eDataType, instanceValue);
			case _4Package.FULL_TITLE_TYPE:
				return convertFullTitleTypeToString(eDataType, instanceValue);
			case _4Package.GIVEN_NAME_TYPE:
				return convertGivenNameTypeToString(eDataType, instanceValue);
			case _4Package.GROUP_TITLE_TYPE:
				return convertGroupTitleTypeToString(eDataType, instanceValue);
			case _4Package.IDENTIFIER_T:
				return convertIdentifierTToString(eDataType, instanceValue);
			case _4Package.ID_TYPE_TYPE_OBJECT:
				return convertIdTypeTypeObjectToString(eDataType, instanceValue);
			case _4Package.INSTITUTION_ACRONYM_TYPE:
				return convertInstitutionAcronymTypeToString(eDataType, instanceValue);
			case _4Package.INSTITUTION_DEPARTMENT_TYPE:
				return convertInstitutionDepartmentTypeToString(eDataType, instanceValue);
			case _4Package.INSTITUTION_NAME_TYPE:
				return convertInstitutionNameTypeToString(eDataType, instanceValue);
			case _4Package.INSTITUTION_PLACE_TYPE:
				return convertInstitutionPlaceTypeToString(eDataType, instanceValue);
			case _4Package.ISBN_T:
				return convertIsbnTToString(eDataType, instanceValue);
			case _4Package.ISSN_T:
				return convertIssnTToString(eDataType, instanceValue);
			case _4Package.ISSUE_TYPE:
				return convertIssueTypeToString(eDataType, instanceValue);
			case _4Package.ITEM_NUMBER_T:
				return convertItemNumberTToString(eDataType, instanceValue);
			case _4Package.KEY_TYPE:
				return convertKeyTypeToString(eDataType, instanceValue);
			case _4Package.LABEL_TYPE:
				return convertLabelTypeToString(eDataType, instanceValue);
			case _4Package.LANGUAGE_TYPE_OBJECT:
				return convertLanguageTypeObjectToString(eDataType, instanceValue);
			case _4Package.LAST_PAGE_TYPE:
				return convertLastPageTypeToString(eDataType, instanceValue);
			case _4Package.LEVEL_SEQUENCE_NUMBER_TYPE:
				return convertLevelSequenceNumberTypeToString(eDataType, instanceValue);
			case _4Package.LINK_HEADER_RELATIONSHIP_TYPE_OBJECT:
				return convertLinkHeaderRelationshipTypeObjectToString(eDataType, instanceValue);
			case _4Package.MEDIA_TYPE_TYPE_OBJECT:
				return convertMediaTypeTypeObjectToString(eDataType, instanceValue);
			case _4Package.MEDIA_TYPE_TYPE_OBJECT1:
				return convertMediaTypeTypeObject1ToString(eDataType, instanceValue);
			case _4Package.MIME_TYPE_TYPE_OBJECT:
				return convertMimeTypeTypeObjectToString(eDataType, instanceValue);
			case _4Package.MULTI_RESOLUTION_TYPE_OBJECT:
				return convertMultiResolutionTypeObjectToString(eDataType, instanceValue);
			case _4Package.NAME_STYLE_TYPE_OBJECT:
				return convertNameStyleTypeObjectToString(eDataType, instanceValue);
			case _4Package.NAME_STYLE_TYPE_OBJECT1:
				return convertNameStyleTypeObject1ToString(eDataType, instanceValue);
			case _4Package.NAME_STYLE_TYPE_OBJECT2:
				return convertNameStyleTypeObject2ToString(eDataType, instanceValue);
			case _4Package.NAME_TYPE_OBJECT:
				return convertNameTypeObjectToString(eDataType, instanceValue);
			case _4Package.ORCID_T:
				return convertOrcidTToString(eDataType, instanceValue);
			case _4Package.ORGANIZATION_T:
				return convertOrganizationTToString(eDataType, instanceValue);
			case _4Package.OTHER_PAGES_TYPE:
				return convertOtherPagesTypeToString(eDataType, instanceValue);
			case _4Package.PARENT_DOI_TYPE:
				return convertParentDoiTypeToString(eDataType, instanceValue);
			case _4Package.PARENT_RELATION_TYPE_OBJECT:
				return convertParentRelationTypeObjectToString(eDataType, instanceValue);
			case _4Package.PART_NUMBER_TYPE:
				return convertPartNumberTypeToString(eDataType, instanceValue);
			case _4Package.PROCEEDINGS_SUBJECT_TYPE:
				return convertProceedingsSubjectTypeToString(eDataType, instanceValue);
			case _4Package.PROCEEDINGS_TITLE_TYPE:
				return convertProceedingsTitleTypeToString(eDataType, instanceValue);
			case _4Package.PROPERTY_T:
				return convertPropertyTToString(eDataType, instanceValue);
			case _4Package.PROPERTY_TYPE_OBJECT:
				return convertPropertyTypeObjectToString(eDataType, instanceValue);
			case _4Package.PUBLICATION_STATUS_TYPE_OBJECT:
				return convertPublicationStatusTypeObjectToString(eDataType, instanceValue);
			case _4Package.PUBLICATION_TYPE_TYPE_OBJECT:
				return convertPublicationTypeTypeObjectToString(eDataType, instanceValue);
			case _4Package.PUBLISHER_NAME_TYPE:
				return convertPublisherNameTypeToString(eDataType, instanceValue);
			case _4Package.PUBLISHER_PLACE_TYPE:
				return convertPublisherPlaceTypeToString(eDataType, instanceValue);
			case _4Package.REASON_TYPE:
				return convertReasonTypeToString(eDataType, instanceValue);
			case _4Package.REASON_TYPE_ITEM_OBJECT:
				return convertReasonTypeItemObjectToString(eDataType, instanceValue);
			case _4Package.REASON_TYPE_OBJECT:
				return convertReasonTypeObjectToString(eDataType, instanceValue);
			case _4Package.RECOMMENDATION_TYPE_OBJECT:
				return convertRecommendationTypeObjectToString(eDataType, instanceValue);
			case _4Package.REFERENCE_DISTRIBUTION_OPTS_TYPE_OBJECT:
				return convertReferenceDistributionOptsTypeObjectToString(eDataType, instanceValue);
			case _4Package.REG_AGENCY_TYPE:
				return convertRegAgencyTypeToString(eDataType, instanceValue);
			case _4Package.REGISTRANT_TYPE:
				return convertRegistrantTypeToString(eDataType, instanceValue);
			case _4Package.RESOURCE_T:
				return convertResourceTToString(eDataType, instanceValue);
			case _4Package.SEQUENCE_TYPE_OBJECT:
				return convertSequenceTypeObjectToString(eDataType, instanceValue);
			case _4Package.SERIES_NUMBER_TYPE:
				return convertSeriesNumberTypeToString(eDataType, instanceValue);
			case _4Package.SPECIAL_NUMBERING_TYPE:
				return convertSpecialNumberingTypeToString(eDataType, instanceValue);
			case _4Package.STAGE_TYPE_OBJECT:
				return convertStageTypeObjectToString(eDataType, instanceValue);
			case _4Package.STD_DESIGNATORVALUE_T:
				return convertStdDesignatorvalueTToString(eDataType, instanceValue);
			case _4Package.SUFFIX_TYPE:
				return convertSuffixTypeToString(eDataType, instanceValue);
			case _4Package.SURNAME_TYPE:
				return convertSurnameTypeToString(eDataType, instanceValue);
			case _4Package.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case _4Package.TYPE_TYPE_OBJECT1:
				return convertTypeTypeObject1ToString(eDataType, instanceValue);
			case _4Package.TYPE_TYPE_OBJECT2:
				return convertTypeTypeObject2ToString(eDataType, instanceValue);
			case _4Package.VOLUME_TYPE:
				return convertVolumeTypeToString(eDataType, instanceValue);
			case _4Package.XREF_DAY:
				return convertXrefDayToString(eDataType, instanceValue);
			case _4Package.XREF_MONTH:
				return convertXrefMonthToString(eDataType, instanceValue);
			case _4Package.XREF_YEAR:
				return convertXrefYearToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcceptanceDateType createAcceptanceDateType() {
		AcceptanceDateTypeImpl acceptanceDateType = new AcceptanceDateTypeImpl();
		return acceptanceDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltNameType createAltNameType() {
		AltNameTypeImpl altNameType = new AltNameTypeImpl();
		return altNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousType createAnonymousType() {
		AnonymousTypeImpl anonymousType = new AnonymousTypeImpl();
		return anonymousType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApprovalDateType createApprovalDateType() {
		ApprovalDateTypeImpl approvalDateType = new ApprovalDateTypeImpl();
		return approvalDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchiveLocationsType createArchiveLocationsType() {
		ArchiveLocationsTypeImpl archiveLocationsType = new ArchiveLocationsTypeImpl();
		return archiveLocationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchiveType createArchiveType() {
		ArchiveTypeImpl archiveType = new ArchiveTypeImpl();
		return archiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionType createAssertionType() {
		AssertionTypeImpl assertionType = new AssertionTypeImpl();
		return assertionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AType createAType() {
		ATypeImpl aType = new ATypeImpl();
		return aType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyType createBodyType() {
		BodyTypeImpl bodyType = new BodyTypeImpl();
		return bodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookMetadataType createBookMetadataType() {
		BookMetadataTypeImpl bookMetadataType = new BookMetadataTypeImpl();
		return bookMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookSeriesMetadataType createBookSeriesMetadataType() {
		BookSeriesMetadataTypeImpl bookSeriesMetadataType = new BookSeriesMetadataTypeImpl();
		return bookSeriesMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookSetMetadataType createBookSetMetadataType() {
		BookSetMetadataTypeImpl bookSetMetadataType = new BookSetMetadataTypeImpl();
		return bookSetMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookType createBookType() {
		BookTypeImpl bookType = new BookTypeImpl();
		return bookType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationListType createCitationListType() {
		CitationListTypeImpl citationListType = new CitationListTypeImpl();
		return citationListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationT createCitationT() {
		CitationTImpl citationT = new CitationTImpl();
		return citationT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationType createCitationType() {
		CitationTypeImpl citationType = new CitationTypeImpl();
		return citationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompetingInterestStatementType createCompetingInterestStatementType() {
		CompetingInterestStatementTypeImpl competingInterestStatementType = new CompetingInterestStatementTypeImpl();
		return competingInterestStatementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentListType createComponentListType() {
		ComponentListTypeImpl componentListType = new ComponentListTypeImpl();
		return componentListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConferenceDateType createConferenceDateType() {
		ConferenceDateTypeImpl conferenceDateType = new ConferenceDateTypeImpl();
		return conferenceDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConferencePaperType createConferencePaperType() {
		ConferencePaperTypeImpl conferencePaperType = new ConferencePaperTypeImpl();
		return conferencePaperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConferenceType createConferenceType() {
		ConferenceTypeImpl conferenceType = new ConferenceTypeImpl();
		return conferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentDateType createContentDateType() {
		ContentDateTypeImpl contentDateType = new ContentDateTypeImpl();
		return contentDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentItemType createContentItemType() {
		ContentItemTypeImpl contentItemType = new ContentItemTypeImpl();
		return contentItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContributorsType createContributorsType() {
		ContributorsTypeImpl contributorsType = new ContributorsTypeImpl();
		return contributorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreationDateType createCreationDateType() {
		CreationDateTypeImpl creationDateType = new CreationDateTypeImpl();
		return creationDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossmarkDomainsType createCrossmarkDomainsType() {
		CrossmarkDomainsTypeImpl crossmarkDomainsType = new CrossmarkDomainsTypeImpl();
		return crossmarkDomainsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossmarkDomainType createCrossmarkDomainType() {
		CrossmarkDomainTypeImpl crossmarkDomainType = new CrossmarkDomainTypeImpl();
		return crossmarkDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossmarkType createCrossmarkType() {
		CrossmarkTypeImpl crossmarkType = new CrossmarkTypeImpl();
		return crossmarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMetadataType createCustomMetadataType() {
		CustomMetadataTypeImpl customMetadataType = new CustomMetadataTypeImpl();
		return customMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseDateType createDatabaseDateType() {
		DatabaseDateTypeImpl databaseDateType = new DatabaseDateTypeImpl();
		return databaseDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseMetadataType createDatabaseMetadataType() {
		DatabaseMetadataTypeImpl databaseMetadataType = new DatabaseMetadataTypeImpl();
		return databaseMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseType createDatabaseType() {
		DatabaseTypeImpl databaseType = new DatabaseTypeImpl();
		return databaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetType createDatasetType() {
		DatasetTypeImpl datasetType = new DatasetTypeImpl();
		return datasetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateT createDateT() {
		DateTImpl dateT = new DateTImpl();
		return dateT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreesType createDegreesType() {
		DegreesTypeImpl degreesType = new DegreesTypeImpl();
		return degreesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepositorType createDepositorType() {
		DepositorTypeImpl depositorType = new DepositorTypeImpl();
		return depositorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignatorsType createDesignatorsType() {
		DesignatorsTypeImpl designatorsType = new DesignatorsTypeImpl();
		return designatorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DissertationType createDissertationType() {
		DissertationTypeImpl dissertationType = new DissertationTypeImpl();
		return dissertationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoiBatchType createDoiBatchType() {
		DoiBatchTypeImpl doiBatchType = new DoiBatchTypeImpl();
		return doiBatchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoiDataType createDoiDataType() {
		DoiDataTypeImpl doiDataType = new DoiDataTypeImpl();
		return doiDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventMetadataType createEventMetadataType() {
		EventMetadataTypeImpl eventMetadataType = new EventMetadataTypeImpl();
		return eventMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormatType createFormatType() {
		FormatTypeImpl formatType = new FormatTypeImpl();
		return formatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadType createHeadType() {
		HeadTypeImpl headType = new HeadTypeImpl();
		return headType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierType createIdentifierType() {
		IdentifierTypeImpl identifierType = new IdentifierTypeImpl();
		return identifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstitutionType createInstitutionType() {
		InstitutionTypeImpl institutionType = new InstitutionTypeImpl();
		return institutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntentStatementType createIntentStatementType() {
		IntentStatementTypeImpl intentStatementType = new IntentStatementTypeImpl();
		return intentStatementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsbnType createIsbnType() {
		IsbnTypeImpl isbnType = new IsbnTypeImpl();
		return isbnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssnType createIssnType() {
		IssnTypeImpl issnType = new IssnTypeImpl();
		return issnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemNumberType createItemNumberType() {
		ItemNumberTypeImpl itemNumberType = new ItemNumberTypeImpl();
		return itemNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalArticleType createJournalArticleType() {
		JournalArticleTypeImpl journalArticleType = new JournalArticleTypeImpl();
		return journalArticleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalIssueType createJournalIssueType() {
		JournalIssueTypeImpl journalIssueType = new JournalIssueTypeImpl();
		return journalIssueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalMetadataType createJournalMetadataType() {
		JournalMetadataTypeImpl journalMetadataType = new JournalMetadataTypeImpl();
		return journalMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalType createJournalType() {
		JournalTypeImpl journalType = new JournalTypeImpl();
		return journalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalVolumeType createJournalVolumeType() {
		JournalVolumeTypeImpl journalVolumeType = new JournalVolumeTypeImpl();
		return journalVolumeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameType1 createNameType1() {
		NameType1Impl nameType1 = new NameType1Impl();
		return nameType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoisbnType createNoisbnType() {
		NoisbnTypeImpl noisbnType = new NoisbnTypeImpl();
		return noisbnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ORCIDType createORCIDType() {
		ORCIDTypeImpl orcidType = new ORCIDTypeImpl();
		return orcidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationType createOrganizationType() {
		OrganizationTypeImpl organizationType = new OrganizationTypeImpl();
		return organizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OriginalLanguageTitleType createOriginalLanguageTitleType() {
		OriginalLanguageTitleTypeImpl originalLanguageTitleType = new OriginalLanguageTitleTypeImpl();
		return originalLanguageTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PagesType createPagesType() {
		PagesTypeImpl pagesType = new PagesTypeImpl();
		return pagesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeerReviewType createPeerReviewType() {
		PeerReviewTypeImpl peerReviewType = new PeerReviewTypeImpl();
		return peerReviewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PendingPublicationType createPendingPublicationType() {
		PendingPublicationTypeImpl pendingPublicationType = new PendingPublicationTypeImpl();
		return pendingPublicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonNameType createPersonNameType() {
		PersonNameTypeImpl personNameType = new PersonNameTypeImpl();
		return personNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostedContentType createPostedContentType() {
		PostedContentTypeImpl postedContentType = new PostedContentTypeImpl();
		return postedContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostedDateType createPostedDateType() {
		PostedDateTypeImpl postedDateType = new PostedDateTypeImpl();
		return postedDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixType createPrefixType() {
		PrefixTypeImpl prefixType = new PrefixTypeImpl();
		return prefixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceedingsMetadataType createProceedingsMetadataType() {
		ProceedingsMetadataTypeImpl proceedingsMetadataType = new ProceedingsMetadataTypeImpl();
		return proceedingsMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceedingsSeriesMetadataType createProceedingsSeriesMetadataType() {
		ProceedingsSeriesMetadataTypeImpl proceedingsSeriesMetadataType = new ProceedingsSeriesMetadataTypeImpl();
		return proceedingsSeriesMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationDateType createPublicationDateType() {
		PublicationDateTypeImpl publicationDateType = new PublicationDateTypeImpl();
		return publicationDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationType createPublicationType() {
		PublicationTypeImpl publicationType = new PublicationTypeImpl();
		return publicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherItemType createPublisherItemType() {
		PublisherItemTypeImpl publisherItemType = new PublisherItemTypeImpl();
		return publisherItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherType createPublisherType() {
		PublisherTypeImpl publisherType = new PublisherTypeImpl();
		return publisherType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportPaperMetadataType createReportPaperMetadataType() {
		ReportPaperMetadataTypeImpl reportPaperMetadataType = new ReportPaperMetadataTypeImpl();
		return reportPaperMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportPaperSeriesMetadataType createReportPaperSeriesMetadataType() {
		ReportPaperSeriesMetadataTypeImpl reportPaperSeriesMetadataType = new ReportPaperSeriesMetadataTypeImpl();
		return reportPaperSeriesMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportPaperType createReportPaperType() {
		ReportPaperTypeImpl reportPaperType = new ReportPaperTypeImpl();
		return reportPaperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewDateType createReviewDateType() {
		ReviewDateTypeImpl reviewDateType = new ReviewDateTypeImpl();
		return reviewDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SaComponentType createSaComponentType() {
		SaComponentTypeImpl saComponentType = new SaComponentTypeImpl();
		return saComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScnPoliciesType createScnPoliciesType() {
		ScnPoliciesTypeImpl scnPoliciesType = new ScnPoliciesTypeImpl();
		return scnPoliciesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScnPolicyRefType createScnPolicyRefType() {
		ScnPolicyRefTypeImpl scnPolicyRefType = new ScnPolicyRefTypeImpl();
		return scnPolicyRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScnPolicySetType createScnPolicySetType() {
		ScnPolicySetTypeImpl scnPolicySetType = new ScnPolicySetTypeImpl();
		return scnPolicySetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesMetadataType createSeriesMetadataType() {
		SeriesMetadataTypeImpl seriesMetadataType = new SeriesMetadataTypeImpl();
		return seriesMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetMetadataType createSetMetadataType() {
		SetMetadataTypeImpl setMetadataType = new SetMetadataTypeImpl();
		return setMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardMetadataType createStandardMetadataType() {
		StandardMetadataTypeImpl standardMetadataType = new StandardMetadataTypeImpl();
		return standardMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardsBodyType createStandardsBodyType() {
		StandardsBodyTypeImpl standardsBodyType = new StandardsBodyTypeImpl();
		return standardsBodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardType createStandardType() {
		StandardTypeImpl standardType = new StandardTypeImpl();
		return standardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdAltAsPublishedType createStdAltAsPublishedType() {
		StdAltAsPublishedTypeImpl stdAltAsPublishedType = new StdAltAsPublishedTypeImpl();
		return stdAltAsPublishedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdAsPublishedType createStdAsPublishedType() {
		StdAsPublishedTypeImpl stdAsPublishedType = new StdAsPublishedTypeImpl();
		return stdAsPublishedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdDesignatorT createStdDesignatorT() {
		StdDesignatorTImpl stdDesignatorT = new StdDesignatorTImpl();
		return stdDesignatorT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdSetDesignatorType createStdSetDesignatorType() {
		StdSetDesignatorTypeImpl stdSetDesignatorType = new StdSetDesignatorTypeImpl();
		return stdSetDesignatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdUndatedDesignatorType createStdUndatedDesignatorType() {
		StdUndatedDesignatorTypeImpl stdUndatedDesignatorType = new StdUndatedDesignatorTypeImpl();
		return stdUndatedDesignatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringNameType createStringNameType() {
		StringNameTypeImpl stringNameType = new StringNameTypeImpl();
		return stringNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubtitleType createSubtitleType() {
		SubtitleTypeImpl subtitleType = new SubtitleTypeImpl();
		return subtitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitlesType createTitlesType() {
		TitlesTypeImpl titlesType = new TitlesTypeImpl();
		return titlesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType createTitleType() {
		TitleTypeImpl titleType = new TitleTypeImpl();
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnassignedContentType createUnassignedContentType() {
		UnassignedContentTypeImpl unassignedContentType = new UnassignedContentTypeImpl();
		return unassignedContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredCitationType createUnstructuredCitationType() {
		UnstructuredCitationTypeImpl unstructuredCitationType = new UnstructuredCitationTypeImpl();
		return unstructuredCitationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateDateType createUpdateDateType() {
		UpdateDateTypeImpl updateDateType = new UpdateDateTypeImpl();
		return updateDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdatesType createUpdatesType() {
		UpdatesTypeImpl updatesType = new UpdatesTypeImpl();
		return updatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateType createUpdateType() {
		UpdateTypeImpl updateType = new UpdateTypeImpl();
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces createXrefFaces() {
		XrefFacesImpl xrefFaces = new XrefFacesImpl();
		return xrefFaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookTypeType createBookTypeTypeFromString(EDataType eDataType, String initialValue) {
		BookTypeType result = BookTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmUpdateType createCmUpdateTypeFromString(EDataType eDataType, String initialValue) {
		CmUpdateType result = CmUpdateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmUpdateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypeType createComponentTypeTypeFromString(EDataType eDataType, String initialValue) {
		ComponentTypeType result = ComponentTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentVersionType createContentVersionTypeFromString(EDataType eDataType, String initialValue) {
		ContentVersionType result = ContentVersionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorRoleType createContributorRoleTypeFromString(EDataType eDataType, String initialValue) {
		ContributorRoleType result = ContributorRoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryType createCountryTypeFromString(EDataType eDataType, String initialValue) {
		CountryType result = CountryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrawlerType createCrawlerTypeFromString(EDataType eDataType, String initialValue) {
		CrawlerType result = CrawlerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrawlerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetTypeType createDatasetTypeTypeFromString(EDataType eDataType, String initialValue) {
		DatasetTypeType result = DatasetTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatasetTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdTypeType createIdTypeTypeFromString(EDataType eDataType, String initialValue) {
		IdTypeType result = IdTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType createLanguageTypeFromString(EDataType eDataType, String initialValue) {
		LanguageType result = LanguageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkHeaderRelationshipType createLinkHeaderRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		LinkHeaderRelationshipType result = LinkHeaderRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkHeaderRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeType createMediaTypeTypeFromString(EDataType eDataType, String initialValue) {
		MediaTypeType result = MediaTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeType1 createMediaTypeType1FromString(EDataType eDataType, String initialValue) {
		MediaTypeType1 result = MediaTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeType createMimeTypeTypeFromString(EDataType eDataType, String initialValue) {
		MimeTypeType result = MimeTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimeTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiResolutionType createMultiResolutionTypeFromString(EDataType eDataType, String initialValue) {
		MultiResolutionType result = MultiResolutionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiResolutionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStyleType createNameStyleTypeFromString(EDataType eDataType, String initialValue) {
		NameStyleType result = NameStyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStyleType1 createNameStyleType1FromString(EDataType eDataType, String initialValue) {
		NameStyleType1 result = NameStyleType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameStyleType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStyleType2 createNameStyleType2FromString(EDataType eDataType, String initialValue) {
		NameStyleType2 result = NameStyleType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameStyleType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameTypeFromString(EDataType eDataType, String initialValue) {
		NameType result = NameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentRelationType createParentRelationTypeFromString(EDataType eDataType, String initialValue) {
		ParentRelationType result = ParentRelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParentRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType1 createPropertyType1FromString(EDataType eDataType, String initialValue) {
		PropertyType1 result = PropertyType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatusType createPublicationStatusTypeFromString(EDataType eDataType, String initialValue) {
		PublicationStatusType result = PublicationStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationTypeType createPublicationTypeTypeFromString(EDataType eDataType, String initialValue) {
		PublicationTypeType result = PublicationTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonType1 createReasonType1FromString(EDataType eDataType, String initialValue) {
		ReasonType1 result = ReasonType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonTypeItem createReasonTypeItemFromString(EDataType eDataType, String initialValue) {
		ReasonTypeItem result = ReasonTypeItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonTypeItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationType createRecommendationTypeFromString(EDataType eDataType, String initialValue) {
		RecommendationType result = RecommendationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecommendationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceDistributionOptsType createReferenceDistributionOptsTypeFromString(EDataType eDataType, String initialValue) {
		ReferenceDistributionOptsType result = ReferenceDistributionOptsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceDistributionOptsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceTypeFromString(EDataType eDataType, String initialValue) {
		SequenceType result = SequenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageType createStageTypeFromString(EDataType eDataType, String initialValue) {
		StageType result = StageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
		TypeType1 result = TypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType2 createTypeType2FromString(EDataType eDataType, String initialValue) {
		TypeType2 result = TypeType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAbbrevTitleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbbrevTitleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAffiliationTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffiliationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createApprovedMonthTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApprovedMonthTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createApprovedYearTypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApprovedYearTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookTypeType createBookTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBookTypeTypeFromString(_4Package.eINSTANCE.getBookTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBookTypeTypeToString(_4Package.eINSTANCE.getBookTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCmAssertionFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmAssertionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCmAssertionGroupLabelFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmAssertionGroupLabelToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCmAssertionGroupNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmAssertionGroupNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCmAssertionLabelFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmAssertionLabelToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCmAssertionNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmAssertionNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCmDomainFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmDomainToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmUpdateType createCmUpdateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCmUpdateTypeFromString(_4Package.eINSTANCE.getCmUpdateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmUpdateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCmUpdateTypeToString(_4Package.eINSTANCE.getCmUpdateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCodenTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodenTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createComponentNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createComponentSizeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentSizeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypeType createComponentTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createComponentTypeTypeFromString(_4Package.eINSTANCE.getComponentTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertComponentTypeTypeToString(_4Package.eINSTANCE.getComponentTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConferenceAcronymTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConferenceAcronymTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConferenceDateTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConferenceDateTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConferenceLocationTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConferenceLocationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConferenceNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConferenceNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConferenceNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConferenceNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConferenceSponsorTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConferenceSponsorTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConferenceThemeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConferenceThemeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentVersionType createContentVersionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createContentVersionTypeFromString(_4Package.eINSTANCE.getContentVersionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentVersionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContentVersionTypeToString(_4Package.eINSTANCE.getContentVersionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createContractNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorRoleType createContributorRoleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createContributorRoleTypeFromString(_4Package.eINSTANCE.getContributorRoleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorRoleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContributorRoleTypeToString(_4Package.eINSTANCE.getContributorRoleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryType createCountryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCountryTypeFromString(_4Package.eINSTANCE.getCountryType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCountryTypeToString(_4Package.eINSTANCE.getCountryType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrawlerType createCrawlerTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCrawlerTypeFromString(_4Package.eINSTANCE.getCrawlerType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrawlerTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCrawlerTypeToString(_4Package.eINSTANCE.getCrawlerType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetTypeType createDatasetTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDatasetTypeTypeFromString(_4Package.eINSTANCE.getDatasetTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatasetTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDatasetTypeTypeToString(_4Package.eINSTANCE.getDatasetTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDegreeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDegreeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDepositorNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDepositorNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDoiBatchIdTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoiBatchIdTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDoiTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoiTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDoiTypeFromString(EDataType eDataType, String initialValue) {
		return createDoiTFromString(_4Package.eINSTANCE.getDoiT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoiTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDoiTToString(_4Package.eINSTANCE.getDoiT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEditionNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEditionNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEmailAddressTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmailAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFirstPageTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFirstPageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFormatTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFullTitleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFullTitleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGivenNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGivenNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGroupTitleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTitleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdentifierTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdTypeType createIdTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIdTypeTypeFromString(_4Package.eINSTANCE.getIdTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdTypeTypeToString(_4Package.eINSTANCE.getIdTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInstitutionAcronymTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstitutionAcronymTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInstitutionDepartmentTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstitutionDepartmentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInstitutionNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstitutionNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInstitutionPlaceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstitutionPlaceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIsbnTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsbnTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIssnTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssnTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIssueTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createItemNumberTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemNumberTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKeyTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLabelTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType createLanguageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLanguageTypeFromString(_4Package.eINSTANCE.getLanguageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLanguageTypeToString(_4Package.eINSTANCE.getLanguageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLastPageTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLastPageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createLevelSequenceNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelSequenceNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkHeaderRelationshipType createLinkHeaderRelationshipTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkHeaderRelationshipTypeFromString(_4Package.eINSTANCE.getLinkHeaderRelationshipType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkHeaderRelationshipTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkHeaderRelationshipTypeToString(_4Package.eINSTANCE.getLinkHeaderRelationshipType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeType createMediaTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMediaTypeTypeFromString(_4Package.eINSTANCE.getMediaTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMediaTypeTypeToString(_4Package.eINSTANCE.getMediaTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeType1 createMediaTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createMediaTypeType1FromString(_4Package.eINSTANCE.getMediaTypeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertMediaTypeType1ToString(_4Package.eINSTANCE.getMediaTypeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeType createMimeTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMimeTypeTypeFromString(_4Package.eINSTANCE.getMimeTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimeTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMimeTypeTypeToString(_4Package.eINSTANCE.getMimeTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiResolutionType createMultiResolutionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMultiResolutionTypeFromString(_4Package.eINSTANCE.getMultiResolutionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiResolutionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultiResolutionTypeToString(_4Package.eINSTANCE.getMultiResolutionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStyleType createNameStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNameStyleTypeFromString(_4Package.eINSTANCE.getNameStyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameStyleTypeToString(_4Package.eINSTANCE.getNameStyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStyleType1 createNameStyleTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createNameStyleType1FromString(_4Package.eINSTANCE.getNameStyleType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameStyleTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertNameStyleType1ToString(_4Package.eINSTANCE.getNameStyleType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStyleType2 createNameStyleTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createNameStyleType2FromString(_4Package.eINSTANCE.getNameStyleType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameStyleTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertNameStyleType2ToString(_4Package.eINSTANCE.getNameStyleType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNameTypeFromString(_4Package.eINSTANCE.getNameType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameTypeToString(_4Package.eINSTANCE.getNameType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOrcidTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrcidTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOrganizationTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrganizationTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOtherPagesTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherPagesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createParentDoiTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParentDoiTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentRelationType createParentRelationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createParentRelationTypeFromString(_4Package.eINSTANCE.getParentRelationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParentRelationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParentRelationTypeToString(_4Package.eINSTANCE.getParentRelationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPartNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createProceedingsSubjectTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProceedingsSubjectTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createProceedingsTitleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProceedingsTitleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPropertyTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType1 createPropertyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyType1FromString(_4Package.eINSTANCE.getPropertyType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyType1ToString(_4Package.eINSTANCE.getPropertyType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatusType createPublicationStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPublicationStatusTypeFromString(_4Package.eINSTANCE.getPublicationStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPublicationStatusTypeToString(_4Package.eINSTANCE.getPublicationStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationTypeType createPublicationTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPublicationTypeTypeFromString(_4Package.eINSTANCE.getPublicationTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPublicationTypeTypeToString(_4Package.eINSTANCE.getPublicationTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPublisherNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublisherNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPublisherPlaceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublisherPlaceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ReasonTypeItem> createReasonTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<ReasonTypeItem> result = new ArrayList<ReasonTypeItem>();
		for (String item : split(initialValue)) {
			result.add(createReasonTypeItemFromString(_4Package.eINSTANCE.getReasonTypeItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertReasonTypeItemToString(_4Package.eINSTANCE.getReasonTypeItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonTypeItem createReasonTypeItemObjectFromString(EDataType eDataType, String initialValue) {
		return createReasonTypeItemFromString(_4Package.eINSTANCE.getReasonTypeItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonTypeItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReasonTypeItemToString(_4Package.eINSTANCE.getReasonTypeItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonType1 createReasonTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReasonType1FromString(_4Package.eINSTANCE.getReasonType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReasonType1ToString(_4Package.eINSTANCE.getReasonType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationType createRecommendationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRecommendationTypeFromString(_4Package.eINSTANCE.getRecommendationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecommendationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRecommendationTypeToString(_4Package.eINSTANCE.getRecommendationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceDistributionOptsType createReferenceDistributionOptsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceDistributionOptsTypeFromString(_4Package.eINSTANCE.getReferenceDistributionOptsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceDistributionOptsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceDistributionOptsTypeToString(_4Package.eINSTANCE.getReferenceDistributionOptsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRegAgencyTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegAgencyTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRegistrantTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegistrantTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createResourceTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSequenceTypeFromString(_4Package.eINSTANCE.getSequenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSequenceTypeToString(_4Package.eINSTANCE.getSequenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSeriesNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeriesNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSpecialNumberingTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialNumberingTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageType createStageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStageTypeFromString(_4Package.eINSTANCE.getStageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStageTypeToString(_4Package.eINSTANCE.getStageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStdDesignatorvalueTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStdDesignatorvalueTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSuffixTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuffixTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSurnameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSurnameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(_4Package.eINSTANCE.getTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(_4Package.eINSTANCE.getTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeType1FromString(_4Package.eINSTANCE.getTypeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType1ToString(_4Package.eINSTANCE.getTypeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType2 createTypeTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createTypeType2FromString(_4Package.eINSTANCE.getTypeType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType2ToString(_4Package.eINSTANCE.getTypeType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVolumeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createXrefDayFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXrefDayToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createXrefMonthFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXrefMonthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createXrefYearFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXrefYearToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _4Package get_4Package() {
		return (_4Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _4Package getPackage() {
		return _4Package.eINSTANCE;
	}

} //_4FactoryImpl
