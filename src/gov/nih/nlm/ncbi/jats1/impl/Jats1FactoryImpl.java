/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Jats1FactoryImpl extends EFactoryImpl implements Jats1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Jats1Factory init() {
		try {
			Jats1Factory theJats1Factory = (Jats1Factory)EPackage.Registry.INSTANCE.getEFactory(Jats1Package.eNS_URI);
			if (theJats1Factory != null) {
				return theJats1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Jats1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jats1FactoryImpl() {
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
			case Jats1Package.ABBREV_JOURNAL_TITLE_TYPE: return createAbbrevJournalTitleType();
			case Jats1Package.ABBREV_TYPE: return createAbbrevType();
			case Jats1Package.ABSTRACT_TYPE: return createAbstractType();
			case Jats1Package.ACCESS_DATE_TYPE: return createAccessDateType();
			case Jats1Package.ACK_TYPE: return createAckType();
			case Jats1Package.ADDRESS_TYPE: return createAddressType();
			case Jats1Package.ADDR_LINE_TYPE: return createAddrLineType();
			case Jats1Package.AFF_ALTERNATIVES_TYPE: return createAffAlternativesType();
			case Jats1Package.AFF_TYPE: return createAffType();
			case Jats1Package.ALTERNATIVES_TYPE: return createAlternativesType();
			case Jats1Package.ALT_TEXT_TYPE: return createAltTextType();
			case Jats1Package.ALT_TITLE_TYPE: return createAltTitleType();
			case Jats1Package.ANNOTATION_TYPE: return createAnnotationType();
			case Jats1Package.ANONYMOUS_TYPE: return createAnonymousType();
			case Jats1Package.APP_GROUP_TYPE: return createAppGroupType();
			case Jats1Package.APP_TYPE: return createAppType();
			case Jats1Package.ARRAY_TYPE: return createArrayType();
			case Jats1Package.ARTICLE_CATEGORIES_TYPE: return createArticleCategoriesType();
			case Jats1Package.ARTICLE_ID_TYPE: return createArticleIdType();
			case Jats1Package.ARTICLE_META_TYPE: return createArticleMetaType();
			case Jats1Package.ARTICLE_TITLE_TYPE: return createArticleTitleType();
			case Jats1Package.ARTICLE_TYPE: return createArticleType();
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE: return createArticleVersionAlternativesType();
			case Jats1Package.ARTICLE_VERSION_TYPE: return createArticleVersionType();
			case Jats1Package.ATTRIB_TYPE: return createAttribType();
			case Jats1Package.AUTHOR_COMMENT_TYPE: return createAuthorCommentType();
			case Jats1Package.AUTHOR_NOTES_TYPE: return createAuthorNotesType();
			case Jats1Package.AWARD_GROUP_TYPE: return createAwardGroupType();
			case Jats1Package.AWARD_ID_TYPE: return createAwardIdType();
			case Jats1Package.BACK_TYPE: return createBackType();
			case Jats1Package.BIO_TYPE: return createBioType();
			case Jats1Package.BODY_TYPE: return createBodyType();
			case Jats1Package.BOLD_TYPE: return createBoldType();
			case Jats1Package.BOXED_TEXT_TYPE: return createBoxedTextType();
			case Jats1Package.BREAK_TYPE: return createBreakType();
			case Jats1Package.CAPTION_TYPE: return createCaptionType();
			case Jats1Package.CHAPTER_TITLE_TYPE: return createChapterTitleType();
			case Jats1Package.CHEM_STRUCT_TYPE: return createChemStructType();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE: return createChemStructWrapType();
			case Jats1Package.CITATION_ALTERNATIVES_TYPE: return createCitationAlternativesType();
			case Jats1Package.CITY_TYPE: return createCityType();
			case Jats1Package.CODE_TYPE: return createCodeType();
			case Jats1Package.COLGROUP_TYPE: return createColgroupType();
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE: return createCollabAlternativesType();
			case Jats1Package.COLLAB_TYPE: return createCollabType();
			case Jats1Package.COL_TYPE: return createColType();
			case Jats1Package.COMMENT_TYPE: return createCommentType();
			case Jats1Package.COMPOUND_KWD_PART_TYPE: return createCompoundKwdPartType();
			case Jats1Package.COMPOUND_KWD_TYPE: return createCompoundKwdType();
			case Jats1Package.COMPOUND_SUBJECT_PART_TYPE: return createCompoundSubjectPartType();
			case Jats1Package.COMPOUND_SUBJECT_TYPE: return createCompoundSubjectType();
			case Jats1Package.CONF_ACRONYM_TYPE: return createConfAcronymType();
			case Jats1Package.CONF_DATE_TYPE: return createConfDateType();
			case Jats1Package.CONFERENCE_TYPE: return createConferenceType();
			case Jats1Package.CONF_LOC_TYPE: return createConfLocType();
			case Jats1Package.CONF_NAME_TYPE: return createConfNameType();
			case Jats1Package.CONF_NUM_TYPE: return createConfNumType();
			case Jats1Package.CONF_SPONSOR_TYPE: return createConfSponsorType();
			case Jats1Package.CONF_THEME_TYPE: return createConfThemeType();
			case Jats1Package.CONTRIB_GROUP_TYPE: return createContribGroupType();
			case Jats1Package.CONTRIB_ID_TYPE: return createContribIdType();
			case Jats1Package.CONTRIB_TYPE: return createContribType();
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE: return createContributedResourceGroupType();
			case Jats1Package.COPYRIGHT_HOLDER_TYPE: return createCopyrightHolderType();
			case Jats1Package.COPYRIGHT_STATEMENT_TYPE: return createCopyrightStatementType();
			case Jats1Package.COPYRIGHT_YEAR_TYPE: return createCopyrightYearType();
			case Jats1Package.CORRESP_TYPE: return createCorrespType();
			case Jats1Package.COUNTRY_TYPE: return createCountryType();
			case Jats1Package.COUNTS_TYPE: return createCountsType();
			case Jats1Package.COUNT_TYPE: return createCountType();
			case Jats1Package.CUSTOM_META_GROUP_TYPE: return createCustomMetaGroupType();
			case Jats1Package.CUSTOM_META_TYPE: return createCustomMetaType();
			case Jats1Package.DATA_TITLE_TYPE: return createDataTitleType();
			case Jats1Package.DATE_IN_CITATION_TYPE: return createDateInCitationType();
			case Jats1Package.DATE_TYPE: return createDateType();
			case Jats1Package.DAY_TYPE: return createDayType();
			case Jats1Package.DEF_HEAD_TYPE: return createDefHeadType();
			case Jats1Package.DEF_ITEM_TYPE: return createDefItemType();
			case Jats1Package.DEF_LIST_TYPE: return createDefListType();
			case Jats1Package.DEF_TYPE: return createDefType();
			case Jats1Package.DEGREES_TYPE: return createDegreesType();
			case Jats1Package.DISP_FORMULA_GROUP_TYPE: return createDispFormulaGroupType();
			case Jats1Package.DISP_FORMULA_TYPE: return createDispFormulaType();
			case Jats1Package.DISP_QUOTE_TYPE: return createDispQuoteType();
			case Jats1Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Jats1Package.EDITION_TYPE: return createEditionType();
			case Jats1Package.ELEMENT_CITATION_TYPE: return createElementCitationType();
			case Jats1Package.ELOCATION_ID_TYPE: return createElocationIdType();
			case Jats1Package.EMAIL_TYPE: return createEmailType();
			case Jats1Package.EQUATION_COUNT_TYPE: return createEquationCountType();
			case Jats1Package.ERA_TYPE: return createEraType();
			case Jats1Package.ETAL_TYPE: return createEtalType();
			case Jats1Package.EVENT_DESC_TYPE: return createEventDescType();
			case Jats1Package.EVENT_TYPE: return createEventType();
			case Jats1Package.EXT_LINK_TYPE: return createExtLinkType();
			case Jats1Package.FAX_TYPE: return createFaxType();
			case Jats1Package.FIG_COUNT_TYPE: return createFigCountType();
			case Jats1Package.FIG_GROUP_TYPE: return createFigGroupType();
			case Jats1Package.FIG_TYPE: return createFigType();
			case Jats1Package.FIXED_CASE_TYPE: return createFixedCaseType();
			case Jats1Package.FLOATS_GROUP_TYPE: return createFloatsGroupType();
			case Jats1Package.FN_GROUP_TYPE: return createFnGroupType();
			case Jats1Package.FN_TYPE: return createFnType();
			case Jats1Package.FPAGE_TYPE: return createFpageType();
			case Jats1Package.FRONT_STUB_TYPE: return createFrontStubType();
			case Jats1Package.FRONT_TYPE: return createFrontType();
			case Jats1Package.FUNDING_GROUP_TYPE: return createFundingGroupType();
			case Jats1Package.FUNDING_SOURCE_TYPE: return createFundingSourceType();
			case Jats1Package.FUNDING_STATEMENT_TYPE: return createFundingStatementType();
			case Jats1Package.GIVEN_NAMES_TYPE: return createGivenNamesType();
			case Jats1Package.GLOSSARY_TYPE: return createGlossaryType();
			case Jats1Package.GLYPH_DATA_TYPE: return createGlyphDataType();
			case Jats1Package.GLYPH_REF_TYPE: return createGlyphRefType();
			case Jats1Package.GOV_TYPE: return createGovType();
			case Jats1Package.GRAPHIC_TYPE: return createGraphicType();
			case Jats1Package.HISTORY_TYPE: return createHistoryType();
			case Jats1Package.HR_TYPE: return createHrType();
			case Jats1Package.INDEX_TERM_RANGE_END_TYPE: return createIndexTermRangeEndType();
			case Jats1Package.INDEX_TERM_TYPE: return createIndexTermType();
			case Jats1Package.INLINE_FORMULA_TYPE: return createInlineFormulaType();
			case Jats1Package.INLINE_GRAPHIC_TYPE: return createInlineGraphicType();
			case Jats1Package.INLINE_MEDIA_TYPE: return createInlineMediaType();
			case Jats1Package.INLINE_SUPPLEMENTARY_MATERIAL_TYPE: return createInlineSupplementaryMaterialType();
			case Jats1Package.INSTITUTION_ID_TYPE: return createInstitutionIdType();
			case Jats1Package.INSTITUTION_TYPE: return createInstitutionType();
			case Jats1Package.INSTITUTION_WRAP_TYPE: return createInstitutionWrapType();
			case Jats1Package.ISBN_TYPE: return createIsbnType();
			case Jats1Package.ISSN_LTYPE: return createIssnLType();
			case Jats1Package.ISSN_TYPE: return createIssnType();
			case Jats1Package.ISSUE_ID_TYPE: return createIssueIdType();
			case Jats1Package.ISSUE_PART_TYPE: return createIssuePartType();
			case Jats1Package.ISSUE_SPONSOR_TYPE: return createIssueSponsorType();
			case Jats1Package.ISSUE_TITLE_TYPE: return createIssueTitleType();
			case Jats1Package.ISSUE_TYPE: return createIssueType();
			case Jats1Package.ITALIC_TYPE: return createItalicType();
			case Jats1Package.JOURNAL_ID_TYPE: return createJournalIdType();
			case Jats1Package.JOURNAL_META_TYPE: return createJournalMetaType();
			case Jats1Package.JOURNAL_SUBTITLE_TYPE: return createJournalSubtitleType();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE: return createJournalTitleGroupType();
			case Jats1Package.JOURNAL_TITLE_TYPE: return createJournalTitleType();
			case Jats1Package.KWD_GROUP_TYPE: return createKwdGroupType();
			case Jats1Package.KWD_TYPE: return createKwdType();
			case Jats1Package.LABEL_TYPE: return createLabelType();
			case Jats1Package.LICENSE_PTYPE: return createLicensePType();
			case Jats1Package.LICENSE_TYPE: return createLicenseType();
			case Jats1Package.LIST_ITEM_TYPE: return createListItemType();
			case Jats1Package.LIST_TYPE: return createListType();
			case Jats1Package.LONG_DESC_TYPE: return createLongDescType();
			case Jats1Package.LPAGE_TYPE: return createLpageType();
			case Jats1Package.MEDIA_TYPE: return createMediaType();
			case Jats1Package.META_NAME_TYPE: return createMetaNameType();
			case Jats1Package.META_VALUE_TYPE: return createMetaValueType();
			case Jats1Package.MILESTONE_END_TYPE: return createMilestoneEndType();
			case Jats1Package.MILESTONE_START_TYPE: return createMilestoneStartType();
			case Jats1Package.MIXED_CITATION_TYPE: return createMixedCitationType();
			case Jats1Package.MONOSPACE_TYPE: return createMonospaceType();
			case Jats1Package.MONTH_TYPE: return createMonthType();
			case Jats1Package.NAME_ALTERNATIVES_TYPE: return createNameAlternativesType();
			case Jats1Package.NAMED_CONTENT_TYPE: return createNamedContentType();
			case Jats1Package.NAME_TYPE: return createNameType();
			case Jats1Package.NESTED_KWD_TYPE: return createNestedKwdType();
			case Jats1Package.NLM_CITATION_TYPE: return createNlmCitationType();
			case Jats1Package.NOTES_TYPE: return createNotesType();
			case Jats1Package.NOTE_TYPE: return createNoteType();
			case Jats1Package.OBJECT_ID_TYPE: return createObjectIdType();
			case Jats1Package.ON_BEHALF_OF_TYPE: return createOnBehalfOfType();
			case Jats1Package.OPEN_ACCESS_TYPE: return createOpenAccessType();
			case Jats1Package.OVERLINE_END_TYPE: return createOverlineEndType();
			case Jats1Package.OVERLINE_START_TYPE: return createOverlineStartType();
			case Jats1Package.OVERLINE_TYPE: return createOverlineType();
			case Jats1Package.PAGE_COUNT_TYPE: return createPageCountType();
			case Jats1Package.PAGE_RANGE_TYPE: return createPageRangeType();
			case Jats1Package.PART_TITLE_TYPE: return createPartTitleType();
			case Jats1Package.PATENT_TYPE: return createPatentType();
			case Jats1Package.PERMISSIONS_TYPE: return createPermissionsType();
			case Jats1Package.PERSON_GROUP_TYPE: return createPersonGroupType();
			case Jats1Package.PHONE_TYPE: return createPhoneType();
			case Jats1Package.POSTAL_CODE_TYPE: return createPostalCodeType();
			case Jats1Package.PREFIX_TYPE: return createPrefixType();
			case Jats1Package.PREFORMAT_TYPE: return createPreformatType();
			case Jats1Package.PRICE_TYPE: return createPriceType();
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE: return createPrincipalAwardRecipientType();
			case Jats1Package.PRINCIPAL_INVESTIGATOR_TYPE: return createPrincipalInvestigatorType();
			case Jats1Package.PRIVATE_CHAR_TYPE: return createPrivateCharType();
			case Jats1Package.PRODUCT_TYPE: return createProductType();
			case Jats1Package.PTYPE: return createPType();
			case Jats1Package.PUB_DATE_NOT_AVAILABLE_TYPE: return createPubDateNotAvailableType();
			case Jats1Package.PUB_DATE_TYPE: return createPubDateType();
			case Jats1Package.PUB_HISTORY_TYPE: return createPubHistoryType();
			case Jats1Package.PUB_ID_TYPE: return createPubIdType();
			case Jats1Package.PUBLISHER_LOC_TYPE: return createPublisherLocType();
			case Jats1Package.PUBLISHER_NAME_TYPE: return createPublisherNameType();
			case Jats1Package.PUBLISHER_TYPE: return createPublisherType();
			case Jats1Package.RB_TYPE: return createRbType();
			case Jats1Package.REF_COUNT_TYPE: return createRefCountType();
			case Jats1Package.REF_LIST_TYPE: return createRefListType();
			case Jats1Package.REF_TYPE: return createRefType();
			case Jats1Package.RELATED_ARTICLE_TYPE: return createRelatedArticleType();
			case Jats1Package.RELATED_OBJECT_TYPE: return createRelatedObjectType();
			case Jats1Package.RESOURCE_GROUP_TYPE: return createResourceGroupType();
			case Jats1Package.RESOURCE_ID_TYPE: return createResourceIdType();
			case Jats1Package.RESOURCE_NAME_TYPE: return createResourceNameType();
			case Jats1Package.RESOURCE_WRAP_TYPE: return createResourceWrapType();
			case Jats1Package.RESPONSE_TYPE: return createResponseType();
			case Jats1Package.ROLE_TYPE: return createRoleType();
			case Jats1Package.ROMAN_TYPE: return createRomanType();
			case Jats1Package.RP_TYPE: return createRpType();
			case Jats1Package.RT_TYPE: return createRtType();
			case Jats1Package.RUBY_TYPE: return createRubyType();
			case Jats1Package.SANS_SERIF_TYPE: return createSansSerifType();
			case Jats1Package.SC_TYPE: return createScType();
			case Jats1Package.SEASON_TYPE: return createSeasonType();
			case Jats1Package.SEC_META_TYPE: return createSecMetaType();
			case Jats1Package.SEC_TYPE: return createSecType();
			case Jats1Package.SEE_ALSO_TYPE: return createSeeAlsoType();
			case Jats1Package.SEE_TYPE: return createSeeType();
			case Jats1Package.SELF_URI_TYPE: return createSelfUriType();
			case Jats1Package.SERIES_TEXT_TYPE: return createSeriesTextType();
			case Jats1Package.SERIES_TITLE_TYPE: return createSeriesTitleType();
			case Jats1Package.SERIES_TYPE: return createSeriesType();
			case Jats1Package.SIG_BLOCK_TYPE: return createSigBlockType();
			case Jats1Package.SIG_TYPE: return createSigType();
			case Jats1Package.SIZE_TYPE: return createSizeType();
			case Jats1Package.SOURCE_TYPE: return createSourceType();
			case Jats1Package.SPEAKER_TYPE: return createSpeakerType();
			case Jats1Package.SPEECH_TYPE: return createSpeechType();
			case Jats1Package.STATEMENT_TYPE: return createStatementType();
			case Jats1Package.STATE_TYPE: return createStateType();
			case Jats1Package.STD_ORGANIZATION_TYPE: return createStdOrganizationType();
			case Jats1Package.STD_TYPE: return createStdType();
			case Jats1Package.STRIKE_TYPE: return createStrikeType();
			case Jats1Package.STRING_CONF_TYPE: return createStringConfType();
			case Jats1Package.STRING_DATE_TYPE: return createStringDateType();
			case Jats1Package.STRING_NAME_TYPE: return createStringNameType();
			case Jats1Package.STYLED_CONTENT_TYPE: return createStyledContentType();
			case Jats1Package.SUB_ARTICLE_TYPE: return createSubArticleType();
			case Jats1Package.SUBJECT_TYPE: return createSubjectType();
			case Jats1Package.SUBJ_GROUP_TYPE: return createSubjGroupType();
			case Jats1Package.SUBTITLE_TYPE: return createSubtitleType();
			case Jats1Package.SUB_TYPE: return createSubType();
			case Jats1Package.SUFFIX_TYPE: return createSuffixType();
			case Jats1Package.SUPPLEMENTARY_MATERIAL_TYPE: return createSupplementaryMaterialType();
			case Jats1Package.SUPPLEMENT_TYPE: return createSupplementType();
			case Jats1Package.SUPPORT_DESCRIPTION_TYPE: return createSupportDescriptionType();
			case Jats1Package.SUPPORT_GROUP_TYPE: return createSupportGroupType();
			case Jats1Package.SUPPORT_SOURCE_TYPE: return createSupportSourceType();
			case Jats1Package.SUP_TYPE: return createSupType();
			case Jats1Package.SURNAME_TYPE: return createSurnameType();
			case Jats1Package.TABLE_COUNT_TYPE: return createTableCountType();
			case Jats1Package.TABLE_TYPE: return createTableType();
			case Jats1Package.TABLE_WRAP_FOOT_TYPE: return createTableWrapFootType();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE: return createTableWrapGroupType();
			case Jats1Package.TABLE_WRAP_TYPE: return createTableWrapType();
			case Jats1Package.TARGET_TYPE: return createTargetType();
			case Jats1Package.TBODY_TYPE: return createTbodyType();
			case Jats1Package.TD_TYPE: return createTdType();
			case Jats1Package.TERM_HEAD_TYPE: return createTermHeadType();
			case Jats1Package.TERM_TYPE: return createTermType();
			case Jats1Package.TEX_MATH_TYPE: return createTexMathType();
			case Jats1Package.TEXTUAL_FORM_TYPE: return createTextualFormType();
			case Jats1Package.TFOOT_TYPE: return createTfootType();
			case Jats1Package.THEAD_TYPE: return createTheadType();
			case Jats1Package.TH_TYPE: return createThType();
			case Jats1Package.TIME_STAMP_TYPE: return createTimeStampType();
			case Jats1Package.TITLE_GROUP_TYPE: return createTitleGroupType();
			case Jats1Package.TITLE_TYPE: return createTitleType();
			case Jats1Package.TRANS_ABSTRACT_TYPE: return createTransAbstractType();
			case Jats1Package.TRANS_SOURCE_TYPE: return createTransSourceType();
			case Jats1Package.TRANS_SUBTITLE_TYPE: return createTransSubtitleType();
			case Jats1Package.TRANS_TITLE_GROUP_TYPE: return createTransTitleGroupType();
			case Jats1Package.TRANS_TITLE_TYPE: return createTransTitleType();
			case Jats1Package.TR_TYPE: return createTrType();
			case Jats1Package.UNDERLINE_END_TYPE: return createUnderlineEndType();
			case Jats1Package.UNDERLINE_START_TYPE: return createUnderlineStartType();
			case Jats1Package.UNDERLINE_TYPE: return createUnderlineType();
			case Jats1Package.UNSTRUCTURED_KWD_GROUP_TYPE: return createUnstructuredKwdGroupType();
			case Jats1Package.URI_TYPE: return createUriType();
			case Jats1Package.VERSE_GROUP_TYPE: return createVerseGroupType();
			case Jats1Package.VERSE_LINE_TYPE: return createVerseLineType();
			case Jats1Package.VERSION_TYPE: return createVersionType();
			case Jats1Package.VOLUME_ID_TYPE: return createVolumeIdType();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE: return createVolumeIssueGroupType();
			case Jats1Package.VOLUME_SERIES_TYPE: return createVolumeSeriesType();
			case Jats1Package.VOLUME_TYPE: return createVolumeType();
			case Jats1Package.WORD_COUNT_TYPE: return createWordCountType();
			case Jats1Package.XREF_TYPE: return createXrefType();
			case Jats1Package.XTYPE: return createXType();
			case Jats1Package.YEAR_TYPE: return createYearType();
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
			case Jats1Package.ALIGN_TYPE:
				return createAlignTypeFromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE1:
				return createAlignType1FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE2:
				return createAlignType2FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE3:
				return createAlignType3FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE4:
				return createAlignType4FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE5:
				return createAlignType5FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE6:
				return createAlignType6FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE7:
				return createAlignType7FromString(eDataType, initialValue);
			case Jats1Package.ARRANGE_TYPE:
				return createArrangeTypeFromString(eDataType, initialValue);
			case Jats1Package.ARRANGE_TYPE1:
				return createArrangeType1FromString(eDataType, initialValue);
			case Jats1Package.AUTHENTICATED_TYPE:
				return createAuthenticatedTypeFromString(eDataType, initialValue);
			case Jats1Package.CORRESP_TYPE1:
				return createCorrespType1FromString(eDataType, initialValue);
			case Jats1Package.DECEASED_TYPE:
				return createDeceasedTypeFromString(eDataType, initialValue);
			case Jats1Package.EQUAL_CONTRIB_TYPE:
				return createEqualContribTypeFromString(eDataType, initialValue);
			case Jats1Package.EXECUTABLE_TYPE:
				return createExecutableTypeFromString(eDataType, initialValue);
			case Jats1Package.FN_TYPE_TYPE:
				return createFnTypeTypeFromString(eDataType, initialValue);
			case Jats1Package.FRAME_TYPE:
				return createFrameTypeFromString(eDataType, initialValue);
			case Jats1Package.NAME_STYLE_TYPE:
				return createNameStyleTypeFromString(eDataType, initialValue);
			case Jats1Package.NAME_STYLE_TYPE1:
				return createNameStyleType1FromString(eDataType, initialValue);
			case Jats1Package.NOTATION_TYPE:
				return createNotationTypeFromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE:
				return createOrientationTypeFromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE1:
				return createOrientationType1FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE2:
				return createOrientationType2FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE3:
				return createOrientationType3FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE4:
				return createOrientationType4FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE5:
				return createOrientationType5FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE6:
				return createOrientationType6FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE7:
				return createOrientationType7FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE8:
				return createOrientationType8FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE9:
				return createOrientationType9FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE10:
				return createOrientationType10FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE11:
				return createOrientationType11FromString(eDataType, initialValue);
			case Jats1Package.PERSON_GROUP_TYPE_TYPE:
				return createPersonGroupTypeTypeFromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE:
				return createPositionTypeFromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE1:
				return createPositionType1FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE2:
				return createPositionType2FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE3:
				return createPositionType3FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE4:
				return createPositionType4FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE5:
				return createPositionType5FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE6:
				return createPositionType6FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE7:
				return createPositionType7FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE8:
				return createPositionType8FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE9:
				return createPositionType9FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE10:
				return createPositionType10FromString(eDataType, initialValue);
			case Jats1Package.PUB_ID_TYPE_TYPE:
				return createPubIdTypeTypeFromString(eDataType, initialValue);
			case Jats1Package.PUB_ID_TYPE_TYPE1:
				return createPubIdTypeType1FromString(eDataType, initialValue);
			case Jats1Package.REF_TYPE_TYPE:
				return createRefTypeTypeFromString(eDataType, initialValue);
			case Jats1Package.RULES_TYPE:
				return createRulesTypeFromString(eDataType, initialValue);
			case Jats1Package.SCOPE_TYPE:
				return createScopeTypeFromString(eDataType, initialValue);
			case Jats1Package.SCOPE_TYPE1:
				return createScopeType1FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE:
				return createToggleTypeFromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE1:
				return createToggleType1FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE2:
				return createToggleType2FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE3:
				return createToggleType3FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE4:
				return createToggleType4FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE5:
				return createToggleType5FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE6:
				return createToggleType6FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE7:
				return createToggleType7FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE8:
				return createToggleType8FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE9:
				return createToggleType9FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE:
				return createValignTypeFromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE1:
				return createValignType1FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE2:
				return createValignType2FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE3:
				return createValignType3FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE4:
				return createValignType4FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE5:
				return createValignType5FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE6:
				return createValignType6FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE7:
				return createValignType7FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE_OBJECT:
				return createAlignTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE_OBJECT1:
				return createAlignTypeObject1FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE_OBJECT2:
				return createAlignTypeObject2FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE_OBJECT3:
				return createAlignTypeObject3FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE_OBJECT4:
				return createAlignTypeObject4FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE_OBJECT5:
				return createAlignTypeObject5FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE_OBJECT6:
				return createAlignTypeObject6FromString(eDataType, initialValue);
			case Jats1Package.ALIGN_TYPE_OBJECT7:
				return createAlignTypeObject7FromString(eDataType, initialValue);
			case Jats1Package.ARRANGE_TYPE_OBJECT:
				return createArrangeTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.ARRANGE_TYPE_OBJECT1:
				return createArrangeTypeObject1FromString(eDataType, initialValue);
			case Jats1Package.AUTHENTICATED_TYPE_OBJECT:
				return createAuthenticatedTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.CORRESP_TYPE_OBJECT:
				return createCorrespTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.DECEASED_TYPE_OBJECT:
				return createDeceasedTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.EQUAL_CONTRIB_TYPE_OBJECT:
				return createEqualContribTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.EXECUTABLE_TYPE_OBJECT:
				return createExecutableTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.FN_TYPE_TYPE_OBJECT:
				return createFnTypeTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.FRAME_TYPE_OBJECT:
				return createFrameTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.NAME_STYLE_TYPE_OBJECT:
				return createNameStyleTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.NAME_STYLE_TYPE_OBJECT1:
				return createNameStyleTypeObject1FromString(eDataType, initialValue);
			case Jats1Package.NOTATION_TYPE_OBJECT:
				return createNotationTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT:
				return createOrientationTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT1:
				return createOrientationTypeObject1FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT2:
				return createOrientationTypeObject2FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT3:
				return createOrientationTypeObject3FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT4:
				return createOrientationTypeObject4FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT5:
				return createOrientationTypeObject5FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT6:
				return createOrientationTypeObject6FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT7:
				return createOrientationTypeObject7FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT8:
				return createOrientationTypeObject8FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT9:
				return createOrientationTypeObject9FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT10:
				return createOrientationTypeObject10FromString(eDataType, initialValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT11:
				return createOrientationTypeObject11FromString(eDataType, initialValue);
			case Jats1Package.PERSON_GROUP_TYPE_TYPE_OBJECT:
				return createPersonGroupTypeTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT:
				return createPositionTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT1:
				return createPositionTypeObject1FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT2:
				return createPositionTypeObject2FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT3:
				return createPositionTypeObject3FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT4:
				return createPositionTypeObject4FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT5:
				return createPositionTypeObject5FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT6:
				return createPositionTypeObject6FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT7:
				return createPositionTypeObject7FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT8:
				return createPositionTypeObject8FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT9:
				return createPositionTypeObject9FromString(eDataType, initialValue);
			case Jats1Package.POSITION_TYPE_OBJECT10:
				return createPositionTypeObject10FromString(eDataType, initialValue);
			case Jats1Package.PUB_ID_TYPE_TYPE_OBJECT:
				return createPubIdTypeTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.PUB_ID_TYPE_TYPE_OBJECT1:
				return createPubIdTypeTypeObject1FromString(eDataType, initialValue);
			case Jats1Package.REF_TYPE_TYPE_OBJECT:
				return createRefTypeTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.RULES_TYPE_OBJECT:
				return createRulesTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.SCOPE_TYPE_OBJECT:
				return createScopeTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.SCOPE_TYPE_OBJECT1:
				return createScopeTypeObject1FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT:
				return createToggleTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT1:
				return createToggleTypeObject1FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT2:
				return createToggleTypeObject2FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT3:
				return createToggleTypeObject3FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT4:
				return createToggleTypeObject4FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT5:
				return createToggleTypeObject5FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT6:
				return createToggleTypeObject6FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT7:
				return createToggleTypeObject7FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT8:
				return createToggleTypeObject8FromString(eDataType, initialValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT9:
				return createToggleTypeObject9FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE_OBJECT:
				return createValignTypeObjectFromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE_OBJECT1:
				return createValignTypeObject1FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE_OBJECT2:
				return createValignTypeObject2FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE_OBJECT3:
				return createValignTypeObject3FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE_OBJECT4:
				return createValignTypeObject4FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE_OBJECT5:
				return createValignTypeObject5FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE_OBJECT6:
				return createValignTypeObject6FromString(eDataType, initialValue);
			case Jats1Package.VALIGN_TYPE_OBJECT7:
				return createValignTypeObject7FromString(eDataType, initialValue);
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
			case Jats1Package.ALIGN_TYPE:
				return convertAlignTypeToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE1:
				return convertAlignType1ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE2:
				return convertAlignType2ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE3:
				return convertAlignType3ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE4:
				return convertAlignType4ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE5:
				return convertAlignType5ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE6:
				return convertAlignType6ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE7:
				return convertAlignType7ToString(eDataType, instanceValue);
			case Jats1Package.ARRANGE_TYPE:
				return convertArrangeTypeToString(eDataType, instanceValue);
			case Jats1Package.ARRANGE_TYPE1:
				return convertArrangeType1ToString(eDataType, instanceValue);
			case Jats1Package.AUTHENTICATED_TYPE:
				return convertAuthenticatedTypeToString(eDataType, instanceValue);
			case Jats1Package.CORRESP_TYPE1:
				return convertCorrespType1ToString(eDataType, instanceValue);
			case Jats1Package.DECEASED_TYPE:
				return convertDeceasedTypeToString(eDataType, instanceValue);
			case Jats1Package.EQUAL_CONTRIB_TYPE:
				return convertEqualContribTypeToString(eDataType, instanceValue);
			case Jats1Package.EXECUTABLE_TYPE:
				return convertExecutableTypeToString(eDataType, instanceValue);
			case Jats1Package.FN_TYPE_TYPE:
				return convertFnTypeTypeToString(eDataType, instanceValue);
			case Jats1Package.FRAME_TYPE:
				return convertFrameTypeToString(eDataType, instanceValue);
			case Jats1Package.NAME_STYLE_TYPE:
				return convertNameStyleTypeToString(eDataType, instanceValue);
			case Jats1Package.NAME_STYLE_TYPE1:
				return convertNameStyleType1ToString(eDataType, instanceValue);
			case Jats1Package.NOTATION_TYPE:
				return convertNotationTypeToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE:
				return convertOrientationTypeToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE1:
				return convertOrientationType1ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE2:
				return convertOrientationType2ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE3:
				return convertOrientationType3ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE4:
				return convertOrientationType4ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE5:
				return convertOrientationType5ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE6:
				return convertOrientationType6ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE7:
				return convertOrientationType7ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE8:
				return convertOrientationType8ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE9:
				return convertOrientationType9ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE10:
				return convertOrientationType10ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE11:
				return convertOrientationType11ToString(eDataType, instanceValue);
			case Jats1Package.PERSON_GROUP_TYPE_TYPE:
				return convertPersonGroupTypeTypeToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE:
				return convertPositionTypeToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE1:
				return convertPositionType1ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE2:
				return convertPositionType2ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE3:
				return convertPositionType3ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE4:
				return convertPositionType4ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE5:
				return convertPositionType5ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE6:
				return convertPositionType6ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE7:
				return convertPositionType7ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE8:
				return convertPositionType8ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE9:
				return convertPositionType9ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE10:
				return convertPositionType10ToString(eDataType, instanceValue);
			case Jats1Package.PUB_ID_TYPE_TYPE:
				return convertPubIdTypeTypeToString(eDataType, instanceValue);
			case Jats1Package.PUB_ID_TYPE_TYPE1:
				return convertPubIdTypeType1ToString(eDataType, instanceValue);
			case Jats1Package.REF_TYPE_TYPE:
				return convertRefTypeTypeToString(eDataType, instanceValue);
			case Jats1Package.RULES_TYPE:
				return convertRulesTypeToString(eDataType, instanceValue);
			case Jats1Package.SCOPE_TYPE:
				return convertScopeTypeToString(eDataType, instanceValue);
			case Jats1Package.SCOPE_TYPE1:
				return convertScopeType1ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE:
				return convertToggleTypeToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE1:
				return convertToggleType1ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE2:
				return convertToggleType2ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE3:
				return convertToggleType3ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE4:
				return convertToggleType4ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE5:
				return convertToggleType5ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE6:
				return convertToggleType6ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE7:
				return convertToggleType7ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE8:
				return convertToggleType8ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE9:
				return convertToggleType9ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE:
				return convertValignTypeToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE1:
				return convertValignType1ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE2:
				return convertValignType2ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE3:
				return convertValignType3ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE4:
				return convertValignType4ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE5:
				return convertValignType5ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE6:
				return convertValignType6ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE7:
				return convertValignType7ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE_OBJECT:
				return convertAlignTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE_OBJECT1:
				return convertAlignTypeObject1ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE_OBJECT2:
				return convertAlignTypeObject2ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE_OBJECT3:
				return convertAlignTypeObject3ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE_OBJECT4:
				return convertAlignTypeObject4ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE_OBJECT5:
				return convertAlignTypeObject5ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE_OBJECT6:
				return convertAlignTypeObject6ToString(eDataType, instanceValue);
			case Jats1Package.ALIGN_TYPE_OBJECT7:
				return convertAlignTypeObject7ToString(eDataType, instanceValue);
			case Jats1Package.ARRANGE_TYPE_OBJECT:
				return convertArrangeTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.ARRANGE_TYPE_OBJECT1:
				return convertArrangeTypeObject1ToString(eDataType, instanceValue);
			case Jats1Package.AUTHENTICATED_TYPE_OBJECT:
				return convertAuthenticatedTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.CORRESP_TYPE_OBJECT:
				return convertCorrespTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.DECEASED_TYPE_OBJECT:
				return convertDeceasedTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.EQUAL_CONTRIB_TYPE_OBJECT:
				return convertEqualContribTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.EXECUTABLE_TYPE_OBJECT:
				return convertExecutableTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.FN_TYPE_TYPE_OBJECT:
				return convertFnTypeTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.FRAME_TYPE_OBJECT:
				return convertFrameTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.NAME_STYLE_TYPE_OBJECT:
				return convertNameStyleTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.NAME_STYLE_TYPE_OBJECT1:
				return convertNameStyleTypeObject1ToString(eDataType, instanceValue);
			case Jats1Package.NOTATION_TYPE_OBJECT:
				return convertNotationTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT:
				return convertOrientationTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT1:
				return convertOrientationTypeObject1ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT2:
				return convertOrientationTypeObject2ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT3:
				return convertOrientationTypeObject3ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT4:
				return convertOrientationTypeObject4ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT5:
				return convertOrientationTypeObject5ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT6:
				return convertOrientationTypeObject6ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT7:
				return convertOrientationTypeObject7ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT8:
				return convertOrientationTypeObject8ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT9:
				return convertOrientationTypeObject9ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT10:
				return convertOrientationTypeObject10ToString(eDataType, instanceValue);
			case Jats1Package.ORIENTATION_TYPE_OBJECT11:
				return convertOrientationTypeObject11ToString(eDataType, instanceValue);
			case Jats1Package.PERSON_GROUP_TYPE_TYPE_OBJECT:
				return convertPersonGroupTypeTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT:
				return convertPositionTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT1:
				return convertPositionTypeObject1ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT2:
				return convertPositionTypeObject2ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT3:
				return convertPositionTypeObject3ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT4:
				return convertPositionTypeObject4ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT5:
				return convertPositionTypeObject5ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT6:
				return convertPositionTypeObject6ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT7:
				return convertPositionTypeObject7ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT8:
				return convertPositionTypeObject8ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT9:
				return convertPositionTypeObject9ToString(eDataType, instanceValue);
			case Jats1Package.POSITION_TYPE_OBJECT10:
				return convertPositionTypeObject10ToString(eDataType, instanceValue);
			case Jats1Package.PUB_ID_TYPE_TYPE_OBJECT:
				return convertPubIdTypeTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.PUB_ID_TYPE_TYPE_OBJECT1:
				return convertPubIdTypeTypeObject1ToString(eDataType, instanceValue);
			case Jats1Package.REF_TYPE_TYPE_OBJECT:
				return convertRefTypeTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.RULES_TYPE_OBJECT:
				return convertRulesTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.SCOPE_TYPE_OBJECT:
				return convertScopeTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.SCOPE_TYPE_OBJECT1:
				return convertScopeTypeObject1ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT:
				return convertToggleTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT1:
				return convertToggleTypeObject1ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT2:
				return convertToggleTypeObject2ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT3:
				return convertToggleTypeObject3ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT4:
				return convertToggleTypeObject4ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT5:
				return convertToggleTypeObject5ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT6:
				return convertToggleTypeObject6ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT7:
				return convertToggleTypeObject7ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT8:
				return convertToggleTypeObject8ToString(eDataType, instanceValue);
			case Jats1Package.TOGGLE_TYPE_OBJECT9:
				return convertToggleTypeObject9ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE_OBJECT:
				return convertValignTypeObjectToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE_OBJECT1:
				return convertValignTypeObject1ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE_OBJECT2:
				return convertValignTypeObject2ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE_OBJECT3:
				return convertValignTypeObject3ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE_OBJECT4:
				return convertValignTypeObject4ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE_OBJECT5:
				return convertValignTypeObject5ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE_OBJECT6:
				return convertValignTypeObject6ToString(eDataType, instanceValue);
			case Jats1Package.VALIGN_TYPE_OBJECT7:
				return convertValignTypeObject7ToString(eDataType, instanceValue);
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
	public AbbrevJournalTitleType createAbbrevJournalTitleType() {
		AbbrevJournalTitleTypeImpl abbrevJournalTitleType = new AbbrevJournalTitleTypeImpl();
		return abbrevJournalTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbbrevType createAbbrevType() {
		AbbrevTypeImpl abbrevType = new AbbrevTypeImpl();
		return abbrevType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractType createAbstractType() {
		AbstractTypeImpl abstractType = new AbstractTypeImpl();
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessDateType createAccessDateType() {
		AccessDateTypeImpl accessDateType = new AccessDateTypeImpl();
		return accessDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AckType createAckType() {
		AckTypeImpl ackType = new AckTypeImpl();
		return ackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddrLineType createAddrLineType() {
		AddrLineTypeImpl addrLineType = new AddrLineTypeImpl();
		return addrLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffAlternativesType createAffAlternativesType() {
		AffAlternativesTypeImpl affAlternativesType = new AffAlternativesTypeImpl();
		return affAlternativesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffType createAffType() {
		AffTypeImpl affType = new AffTypeImpl();
		return affType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlternativesType createAlternativesType() {
		AlternativesTypeImpl alternativesType = new AlternativesTypeImpl();
		return alternativesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltTextType createAltTextType() {
		AltTextTypeImpl altTextType = new AltTextTypeImpl();
		return altTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltTitleType createAltTitleType() {
		AltTitleTypeImpl altTitleType = new AltTitleTypeImpl();
		return altTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
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
	public AppGroupType createAppGroupType() {
		AppGroupTypeImpl appGroupType = new AppGroupTypeImpl();
		return appGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppType createAppType() {
		AppTypeImpl appType = new AppTypeImpl();
		return appType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleCategoriesType createArticleCategoriesType() {
		ArticleCategoriesTypeImpl articleCategoriesType = new ArticleCategoriesTypeImpl();
		return articleCategoriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleIdType createArticleIdType() {
		ArticleIdTypeImpl articleIdType = new ArticleIdTypeImpl();
		return articleIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleMetaType createArticleMetaType() {
		ArticleMetaTypeImpl articleMetaType = new ArticleMetaTypeImpl();
		return articleMetaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleTitleType createArticleTitleType() {
		ArticleTitleTypeImpl articleTitleType = new ArticleTitleTypeImpl();
		return articleTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleType createArticleType() {
		ArticleTypeImpl articleType = new ArticleTypeImpl();
		return articleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleVersionAlternativesType createArticleVersionAlternativesType() {
		ArticleVersionAlternativesTypeImpl articleVersionAlternativesType = new ArticleVersionAlternativesTypeImpl();
		return articleVersionAlternativesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleVersionType createArticleVersionType() {
		ArticleVersionTypeImpl articleVersionType = new ArticleVersionTypeImpl();
		return articleVersionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttribType createAttribType() {
		AttribTypeImpl attribType = new AttribTypeImpl();
		return attribType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorCommentType createAuthorCommentType() {
		AuthorCommentTypeImpl authorCommentType = new AuthorCommentTypeImpl();
		return authorCommentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorNotesType createAuthorNotesType() {
		AuthorNotesTypeImpl authorNotesType = new AuthorNotesTypeImpl();
		return authorNotesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwardGroupType createAwardGroupType() {
		AwardGroupTypeImpl awardGroupType = new AwardGroupTypeImpl();
		return awardGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwardIdType createAwardIdType() {
		AwardIdTypeImpl awardIdType = new AwardIdTypeImpl();
		return awardIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackType createBackType() {
		BackTypeImpl backType = new BackTypeImpl();
		return backType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BioType createBioType() {
		BioTypeImpl bioType = new BioTypeImpl();
		return bioType;
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
	public BoldType createBoldType() {
		BoldTypeImpl boldType = new BoldTypeImpl();
		return boldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoxedTextType createBoxedTextType() {
		BoxedTextTypeImpl boxedTextType = new BoxedTextTypeImpl();
		return boxedTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreakType createBreakType() {
		BreakTypeImpl breakType = new BreakTypeImpl();
		return breakType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaptionType createCaptionType() {
		CaptionTypeImpl captionType = new CaptionTypeImpl();
		return captionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChapterTitleType createChapterTitleType() {
		ChapterTitleTypeImpl chapterTitleType = new ChapterTitleTypeImpl();
		return chapterTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChemStructType createChemStructType() {
		ChemStructTypeImpl chemStructType = new ChemStructTypeImpl();
		return chemStructType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChemStructWrapType createChemStructWrapType() {
		ChemStructWrapTypeImpl chemStructWrapType = new ChemStructWrapTypeImpl();
		return chemStructWrapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationAlternativesType createCitationAlternativesType() {
		CitationAlternativesTypeImpl citationAlternativesType = new CitationAlternativesTypeImpl();
		return citationAlternativesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CityType createCityType() {
		CityTypeImpl cityType = new CityTypeImpl();
		return cityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType createCodeType() {
		CodeTypeImpl codeType = new CodeTypeImpl();
		return codeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColgroupType createColgroupType() {
		ColgroupTypeImpl colgroupType = new ColgroupTypeImpl();
		return colgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollabAlternativesType createCollabAlternativesType() {
		CollabAlternativesTypeImpl collabAlternativesType = new CollabAlternativesTypeImpl();
		return collabAlternativesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollabType createCollabType() {
		CollabTypeImpl collabType = new CollabTypeImpl();
		return collabType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColType createColType() {
		ColTypeImpl colType = new ColTypeImpl();
		return colType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentType createCommentType() {
		CommentTypeImpl commentType = new CommentTypeImpl();
		return commentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundKwdPartType createCompoundKwdPartType() {
		CompoundKwdPartTypeImpl compoundKwdPartType = new CompoundKwdPartTypeImpl();
		return compoundKwdPartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundKwdType createCompoundKwdType() {
		CompoundKwdTypeImpl compoundKwdType = new CompoundKwdTypeImpl();
		return compoundKwdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundSubjectPartType createCompoundSubjectPartType() {
		CompoundSubjectPartTypeImpl compoundSubjectPartType = new CompoundSubjectPartTypeImpl();
		return compoundSubjectPartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundSubjectType createCompoundSubjectType() {
		CompoundSubjectTypeImpl compoundSubjectType = new CompoundSubjectTypeImpl();
		return compoundSubjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfAcronymType createConfAcronymType() {
		ConfAcronymTypeImpl confAcronymType = new ConfAcronymTypeImpl();
		return confAcronymType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfDateType createConfDateType() {
		ConfDateTypeImpl confDateType = new ConfDateTypeImpl();
		return confDateType;
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
	public ConfLocType createConfLocType() {
		ConfLocTypeImpl confLocType = new ConfLocTypeImpl();
		return confLocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfNameType createConfNameType() {
		ConfNameTypeImpl confNameType = new ConfNameTypeImpl();
		return confNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfNumType createConfNumType() {
		ConfNumTypeImpl confNumType = new ConfNumTypeImpl();
		return confNumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfSponsorType createConfSponsorType() {
		ConfSponsorTypeImpl confSponsorType = new ConfSponsorTypeImpl();
		return confSponsorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfThemeType createConfThemeType() {
		ConfThemeTypeImpl confThemeType = new ConfThemeTypeImpl();
		return confThemeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContribGroupType createContribGroupType() {
		ContribGroupTypeImpl contribGroupType = new ContribGroupTypeImpl();
		return contribGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContribIdType createContribIdType() {
		ContribIdTypeImpl contribIdType = new ContribIdTypeImpl();
		return contribIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContribType createContribType() {
		ContribTypeImpl contribType = new ContribTypeImpl();
		return contribType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContributedResourceGroupType createContributedResourceGroupType() {
		ContributedResourceGroupTypeImpl contributedResourceGroupType = new ContributedResourceGroupTypeImpl();
		return contributedResourceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyrightHolderType createCopyrightHolderType() {
		CopyrightHolderTypeImpl copyrightHolderType = new CopyrightHolderTypeImpl();
		return copyrightHolderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyrightStatementType createCopyrightStatementType() {
		CopyrightStatementTypeImpl copyrightStatementType = new CopyrightStatementTypeImpl();
		return copyrightStatementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyrightYearType createCopyrightYearType() {
		CopyrightYearTypeImpl copyrightYearType = new CopyrightYearTypeImpl();
		return copyrightYearType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrespType createCorrespType() {
		CorrespTypeImpl correspType = new CorrespTypeImpl();
		return correspType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryType createCountryType() {
		CountryTypeImpl countryType = new CountryTypeImpl();
		return countryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountsType createCountsType() {
		CountsTypeImpl countsType = new CountsTypeImpl();
		return countsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountType createCountType() {
		CountTypeImpl countType = new CountTypeImpl();
		return countType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMetaGroupType createCustomMetaGroupType() {
		CustomMetaGroupTypeImpl customMetaGroupType = new CustomMetaGroupTypeImpl();
		return customMetaGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMetaType createCustomMetaType() {
		CustomMetaTypeImpl customMetaType = new CustomMetaTypeImpl();
		return customMetaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTitleType createDataTitleType() {
		DataTitleTypeImpl dataTitleType = new DataTitleTypeImpl();
		return dataTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateInCitationType createDateInCitationType() {
		DateInCitationTypeImpl dateInCitationType = new DateInCitationTypeImpl();
		return dateInCitationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DayType createDayType() {
		DayTypeImpl dayType = new DayTypeImpl();
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefHeadType createDefHeadType() {
		DefHeadTypeImpl defHeadType = new DefHeadTypeImpl();
		return defHeadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefItemType createDefItemType() {
		DefItemTypeImpl defItemType = new DefItemTypeImpl();
		return defItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefListType createDefListType() {
		DefListTypeImpl defListType = new DefListTypeImpl();
		return defListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefType createDefType() {
		DefTypeImpl defType = new DefTypeImpl();
		return defType;
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
	public DispFormulaGroupType createDispFormulaGroupType() {
		DispFormulaGroupTypeImpl dispFormulaGroupType = new DispFormulaGroupTypeImpl();
		return dispFormulaGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DispFormulaType createDispFormulaType() {
		DispFormulaTypeImpl dispFormulaType = new DispFormulaTypeImpl();
		return dispFormulaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DispQuoteType createDispQuoteType() {
		DispQuoteTypeImpl dispQuoteType = new DispQuoteTypeImpl();
		return dispQuoteType;
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
	public EditionType createEditionType() {
		EditionTypeImpl editionType = new EditionTypeImpl();
		return editionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementCitationType createElementCitationType() {
		ElementCitationTypeImpl elementCitationType = new ElementCitationTypeImpl();
		return elementCitationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElocationIdType createElocationIdType() {
		ElocationIdTypeImpl elocationIdType = new ElocationIdTypeImpl();
		return elocationIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailType createEmailType() {
		EmailTypeImpl emailType = new EmailTypeImpl();
		return emailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EquationCountType createEquationCountType() {
		EquationCountTypeImpl equationCountType = new EquationCountTypeImpl();
		return equationCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EraType createEraType() {
		EraTypeImpl eraType = new EraTypeImpl();
		return eraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtalType createEtalType() {
		EtalTypeImpl etalType = new EtalTypeImpl();
		return etalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDescType createEventDescType() {
		EventDescTypeImpl eventDescType = new EventDescTypeImpl();
		return eventDescType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtLinkType createExtLinkType() {
		ExtLinkTypeImpl extLinkType = new ExtLinkTypeImpl();
		return extLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaxType createFaxType() {
		FaxTypeImpl faxType = new FaxTypeImpl();
		return faxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigCountType createFigCountType() {
		FigCountTypeImpl figCountType = new FigCountTypeImpl();
		return figCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigGroupType createFigGroupType() {
		FigGroupTypeImpl figGroupType = new FigGroupTypeImpl();
		return figGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigType createFigType() {
		FigTypeImpl figType = new FigTypeImpl();
		return figType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedCaseType createFixedCaseType() {
		FixedCaseTypeImpl fixedCaseType = new FixedCaseTypeImpl();
		return fixedCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatsGroupType createFloatsGroupType() {
		FloatsGroupTypeImpl floatsGroupType = new FloatsGroupTypeImpl();
		return floatsGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FnGroupType createFnGroupType() {
		FnGroupTypeImpl fnGroupType = new FnGroupTypeImpl();
		return fnGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FnType createFnType() {
		FnTypeImpl fnType = new FnTypeImpl();
		return fnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FpageType createFpageType() {
		FpageTypeImpl fpageType = new FpageTypeImpl();
		return fpageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontStubType createFrontStubType() {
		FrontStubTypeImpl frontStubType = new FrontStubTypeImpl();
		return frontStubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontType createFrontType() {
		FrontTypeImpl frontType = new FrontTypeImpl();
		return frontType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FundingGroupType createFundingGroupType() {
		FundingGroupTypeImpl fundingGroupType = new FundingGroupTypeImpl();
		return fundingGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FundingSourceType createFundingSourceType() {
		FundingSourceTypeImpl fundingSourceType = new FundingSourceTypeImpl();
		return fundingSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FundingStatementType createFundingStatementType() {
		FundingStatementTypeImpl fundingStatementType = new FundingStatementTypeImpl();
		return fundingStatementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GivenNamesType createGivenNamesType() {
		GivenNamesTypeImpl givenNamesType = new GivenNamesTypeImpl();
		return givenNamesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossaryType createGlossaryType() {
		GlossaryTypeImpl glossaryType = new GlossaryTypeImpl();
		return glossaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlyphDataType createGlyphDataType() {
		GlyphDataTypeImpl glyphDataType = new GlyphDataTypeImpl();
		return glyphDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlyphRefType createGlyphRefType() {
		GlyphRefTypeImpl glyphRefType = new GlyphRefTypeImpl();
		return glyphRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GovType createGovType() {
		GovTypeImpl govType = new GovTypeImpl();
		return govType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicType createGraphicType() {
		GraphicTypeImpl graphicType = new GraphicTypeImpl();
		return graphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryType createHistoryType() {
		HistoryTypeImpl historyType = new HistoryTypeImpl();
		return historyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HrType createHrType() {
		HrTypeImpl hrType = new HrTypeImpl();
		return hrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexTermRangeEndType createIndexTermRangeEndType() {
		IndexTermRangeEndTypeImpl indexTermRangeEndType = new IndexTermRangeEndTypeImpl();
		return indexTermRangeEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexTermType createIndexTermType() {
		IndexTermTypeImpl indexTermType = new IndexTermTypeImpl();
		return indexTermType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineFormulaType createInlineFormulaType() {
		InlineFormulaTypeImpl inlineFormulaType = new InlineFormulaTypeImpl();
		return inlineFormulaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineGraphicType createInlineGraphicType() {
		InlineGraphicTypeImpl inlineGraphicType = new InlineGraphicTypeImpl();
		return inlineGraphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineMediaType createInlineMediaType() {
		InlineMediaTypeImpl inlineMediaType = new InlineMediaTypeImpl();
		return inlineMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineSupplementaryMaterialType createInlineSupplementaryMaterialType() {
		InlineSupplementaryMaterialTypeImpl inlineSupplementaryMaterialType = new InlineSupplementaryMaterialTypeImpl();
		return inlineSupplementaryMaterialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstitutionIdType createInstitutionIdType() {
		InstitutionIdTypeImpl institutionIdType = new InstitutionIdTypeImpl();
		return institutionIdType;
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
	public InstitutionWrapType createInstitutionWrapType() {
		InstitutionWrapTypeImpl institutionWrapType = new InstitutionWrapTypeImpl();
		return institutionWrapType;
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
	public IssnLType createIssnLType() {
		IssnLTypeImpl issnLType = new IssnLTypeImpl();
		return issnLType;
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
	public IssueIdType createIssueIdType() {
		IssueIdTypeImpl issueIdType = new IssueIdTypeImpl();
		return issueIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssuePartType createIssuePartType() {
		IssuePartTypeImpl issuePartType = new IssuePartTypeImpl();
		return issuePartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueSponsorType createIssueSponsorType() {
		IssueSponsorTypeImpl issueSponsorType = new IssueSponsorTypeImpl();
		return issueSponsorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueTitleType createIssueTitleType() {
		IssueTitleTypeImpl issueTitleType = new IssueTitleTypeImpl();
		return issueTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueType createIssueType() {
		IssueTypeImpl issueType = new IssueTypeImpl();
		return issueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItalicType createItalicType() {
		ItalicTypeImpl italicType = new ItalicTypeImpl();
		return italicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalIdType createJournalIdType() {
		JournalIdTypeImpl journalIdType = new JournalIdTypeImpl();
		return journalIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalMetaType createJournalMetaType() {
		JournalMetaTypeImpl journalMetaType = new JournalMetaTypeImpl();
		return journalMetaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalSubtitleType createJournalSubtitleType() {
		JournalSubtitleTypeImpl journalSubtitleType = new JournalSubtitleTypeImpl();
		return journalSubtitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalTitleGroupType createJournalTitleGroupType() {
		JournalTitleGroupTypeImpl journalTitleGroupType = new JournalTitleGroupTypeImpl();
		return journalTitleGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalTitleType createJournalTitleType() {
		JournalTitleTypeImpl journalTitleType = new JournalTitleTypeImpl();
		return journalTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KwdGroupType createKwdGroupType() {
		KwdGroupTypeImpl kwdGroupType = new KwdGroupTypeImpl();
		return kwdGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KwdType createKwdType() {
		KwdTypeImpl kwdType = new KwdTypeImpl();
		return kwdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicensePType createLicensePType() {
		LicensePTypeImpl licensePType = new LicensePTypeImpl();
		return licensePType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseType createLicenseType() {
		LicenseTypeImpl licenseType = new LicenseTypeImpl();
		return licenseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListItemType createListItemType() {
		ListItemTypeImpl listItemType = new ListItemTypeImpl();
		return listItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongDescType createLongDescType() {
		LongDescTypeImpl longDescType = new LongDescTypeImpl();
		return longDescType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LpageType createLpageType() {
		LpageTypeImpl lpageType = new LpageTypeImpl();
		return lpageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediaType createMediaType() {
		MediaTypeImpl mediaType = new MediaTypeImpl();
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaNameType createMetaNameType() {
		MetaNameTypeImpl metaNameType = new MetaNameTypeImpl();
		return metaNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaValueType createMetaValueType() {
		MetaValueTypeImpl metaValueType = new MetaValueTypeImpl();
		return metaValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MilestoneEndType createMilestoneEndType() {
		MilestoneEndTypeImpl milestoneEndType = new MilestoneEndTypeImpl();
		return milestoneEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MilestoneStartType createMilestoneStartType() {
		MilestoneStartTypeImpl milestoneStartType = new MilestoneStartTypeImpl();
		return milestoneStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixedCitationType createMixedCitationType() {
		MixedCitationTypeImpl mixedCitationType = new MixedCitationTypeImpl();
		return mixedCitationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonospaceType createMonospaceType() {
		MonospaceTypeImpl monospaceType = new MonospaceTypeImpl();
		return monospaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonthType createMonthType() {
		MonthTypeImpl monthType = new MonthTypeImpl();
		return monthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameAlternativesType createNameAlternativesType() {
		NameAlternativesTypeImpl nameAlternativesType = new NameAlternativesTypeImpl();
		return nameAlternativesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedContentType createNamedContentType() {
		NamedContentTypeImpl namedContentType = new NamedContentTypeImpl();
		return namedContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameType createNameType() {
		NameTypeImpl nameType = new NameTypeImpl();
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedKwdType createNestedKwdType() {
		NestedKwdTypeImpl nestedKwdType = new NestedKwdTypeImpl();
		return nestedKwdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NlmCitationType createNlmCitationType() {
		NlmCitationTypeImpl nlmCitationType = new NlmCitationTypeImpl();
		return nlmCitationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotesType createNotesType() {
		NotesTypeImpl notesType = new NotesTypeImpl();
		return notesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectIdType createObjectIdType() {
		ObjectIdTypeImpl objectIdType = new ObjectIdTypeImpl();
		return objectIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnBehalfOfType createOnBehalfOfType() {
		OnBehalfOfTypeImpl onBehalfOfType = new OnBehalfOfTypeImpl();
		return onBehalfOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAccessType createOpenAccessType() {
		OpenAccessTypeImpl openAccessType = new OpenAccessTypeImpl();
		return openAccessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlineEndType createOverlineEndType() {
		OverlineEndTypeImpl overlineEndType = new OverlineEndTypeImpl();
		return overlineEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlineStartType createOverlineStartType() {
		OverlineStartTypeImpl overlineStartType = new OverlineStartTypeImpl();
		return overlineStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlineType createOverlineType() {
		OverlineTypeImpl overlineType = new OverlineTypeImpl();
		return overlineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageCountType createPageCountType() {
		PageCountTypeImpl pageCountType = new PageCountTypeImpl();
		return pageCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageRangeType createPageRangeType() {
		PageRangeTypeImpl pageRangeType = new PageRangeTypeImpl();
		return pageRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartTitleType createPartTitleType() {
		PartTitleTypeImpl partTitleType = new PartTitleTypeImpl();
		return partTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatentType createPatentType() {
		PatentTypeImpl patentType = new PatentTypeImpl();
		return patentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsType createPermissionsType() {
		PermissionsTypeImpl permissionsType = new PermissionsTypeImpl();
		return permissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonGroupType createPersonGroupType() {
		PersonGroupTypeImpl personGroupType = new PersonGroupTypeImpl();
		return personGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhoneType createPhoneType() {
		PhoneTypeImpl phoneType = new PhoneTypeImpl();
		return phoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalCodeType createPostalCodeType() {
		PostalCodeTypeImpl postalCodeType = new PostalCodeTypeImpl();
		return postalCodeType;
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
	public PreformatType createPreformatType() {
		PreformatTypeImpl preformatType = new PreformatTypeImpl();
		return preformatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriceType createPriceType() {
		PriceTypeImpl priceType = new PriceTypeImpl();
		return priceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrincipalAwardRecipientType createPrincipalAwardRecipientType() {
		PrincipalAwardRecipientTypeImpl principalAwardRecipientType = new PrincipalAwardRecipientTypeImpl();
		return principalAwardRecipientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrincipalInvestigatorType createPrincipalInvestigatorType() {
		PrincipalInvestigatorTypeImpl principalInvestigatorType = new PrincipalInvestigatorTypeImpl();
		return principalInvestigatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateCharType createPrivateCharType() {
		PrivateCharTypeImpl privateCharType = new PrivateCharTypeImpl();
		return privateCharType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductType createProductType() {
		ProductTypeImpl productType = new ProductTypeImpl();
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PType createPType() {
		PTypeImpl pType = new PTypeImpl();
		return pType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubDateNotAvailableType createPubDateNotAvailableType() {
		PubDateNotAvailableTypeImpl pubDateNotAvailableType = new PubDateNotAvailableTypeImpl();
		return pubDateNotAvailableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubDateType createPubDateType() {
		PubDateTypeImpl pubDateType = new PubDateTypeImpl();
		return pubDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubHistoryType createPubHistoryType() {
		PubHistoryTypeImpl pubHistoryType = new PubHistoryTypeImpl();
		return pubHistoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubIdType createPubIdType() {
		PubIdTypeImpl pubIdType = new PubIdTypeImpl();
		return pubIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherLocType createPublisherLocType() {
		PublisherLocTypeImpl publisherLocType = new PublisherLocTypeImpl();
		return publisherLocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherNameType createPublisherNameType() {
		PublisherNameTypeImpl publisherNameType = new PublisherNameTypeImpl();
		return publisherNameType;
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
	public RbType createRbType() {
		RbTypeImpl rbType = new RbTypeImpl();
		return rbType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefCountType createRefCountType() {
		RefCountTypeImpl refCountType = new RefCountTypeImpl();
		return refCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefListType createRefListType() {
		RefListTypeImpl refListType = new RefListTypeImpl();
		return refListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefType createRefType() {
		RefTypeImpl refType = new RefTypeImpl();
		return refType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedArticleType createRelatedArticleType() {
		RelatedArticleTypeImpl relatedArticleType = new RelatedArticleTypeImpl();
		return relatedArticleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedObjectType createRelatedObjectType() {
		RelatedObjectTypeImpl relatedObjectType = new RelatedObjectTypeImpl();
		return relatedObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceGroupType createResourceGroupType() {
		ResourceGroupTypeImpl resourceGroupType = new ResourceGroupTypeImpl();
		return resourceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceIdType createResourceIdType() {
		ResourceIdTypeImpl resourceIdType = new ResourceIdTypeImpl();
		return resourceIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceNameType createResourceNameType() {
		ResourceNameTypeImpl resourceNameType = new ResourceNameTypeImpl();
		return resourceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceWrapType createResourceWrapType() {
		ResourceWrapTypeImpl resourceWrapType = new ResourceWrapTypeImpl();
		return resourceWrapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseType createResponseType() {
		ResponseTypeImpl responseType = new ResponseTypeImpl();
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RomanType createRomanType() {
		RomanTypeImpl romanType = new RomanTypeImpl();
		return romanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RpType createRpType() {
		RpTypeImpl rpType = new RpTypeImpl();
		return rpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RtType createRtType() {
		RtTypeImpl rtType = new RtTypeImpl();
		return rtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RubyType createRubyType() {
		RubyTypeImpl rubyType = new RubyTypeImpl();
		return rubyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SansSerifType createSansSerifType() {
		SansSerifTypeImpl sansSerifType = new SansSerifTypeImpl();
		return sansSerifType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScType createScType() {
		ScTypeImpl scType = new ScTypeImpl();
		return scType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeasonType createSeasonType() {
		SeasonTypeImpl seasonType = new SeasonTypeImpl();
		return seasonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecMetaType createSecMetaType() {
		SecMetaTypeImpl secMetaType = new SecMetaTypeImpl();
		return secMetaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecType createSecType() {
		SecTypeImpl secType = new SecTypeImpl();
		return secType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeeAlsoType createSeeAlsoType() {
		SeeAlsoTypeImpl seeAlsoType = new SeeAlsoTypeImpl();
		return seeAlsoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeeType createSeeType() {
		SeeTypeImpl seeType = new SeeTypeImpl();
		return seeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfUriType createSelfUriType() {
		SelfUriTypeImpl selfUriType = new SelfUriTypeImpl();
		return selfUriType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesTextType createSeriesTextType() {
		SeriesTextTypeImpl seriesTextType = new SeriesTextTypeImpl();
		return seriesTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesTitleType createSeriesTitleType() {
		SeriesTitleTypeImpl seriesTitleType = new SeriesTitleTypeImpl();
		return seriesTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesType createSeriesType() {
		SeriesTypeImpl seriesType = new SeriesTypeImpl();
		return seriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SigBlockType createSigBlockType() {
		SigBlockTypeImpl sigBlockType = new SigBlockTypeImpl();
		return sigBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SigType createSigType() {
		SigTypeImpl sigType = new SigTypeImpl();
		return sigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizeType createSizeType() {
		SizeTypeImpl sizeType = new SizeTypeImpl();
		return sizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceType createSourceType() {
		SourceTypeImpl sourceType = new SourceTypeImpl();
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeakerType createSpeakerType() {
		SpeakerTypeImpl speakerType = new SpeakerTypeImpl();
		return speakerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechType createSpeechType() {
		SpeechTypeImpl speechType = new SpeechTypeImpl();
		return speechType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatementType createStatementType() {
		StatementTypeImpl statementType = new StatementTypeImpl();
		return statementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateType createStateType() {
		StateTypeImpl stateType = new StateTypeImpl();
		return stateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdOrganizationType createStdOrganizationType() {
		StdOrganizationTypeImpl stdOrganizationType = new StdOrganizationTypeImpl();
		return stdOrganizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdType createStdType() {
		StdTypeImpl stdType = new StdTypeImpl();
		return stdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrikeType createStrikeType() {
		StrikeTypeImpl strikeType = new StrikeTypeImpl();
		return strikeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringConfType createStringConfType() {
		StringConfTypeImpl stringConfType = new StringConfTypeImpl();
		return stringConfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringDateType createStringDateType() {
		StringDateTypeImpl stringDateType = new StringDateTypeImpl();
		return stringDateType;
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
	public StyledContentType createStyledContentType() {
		StyledContentTypeImpl styledContentType = new StyledContentTypeImpl();
		return styledContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubArticleType createSubArticleType() {
		SubArticleTypeImpl subArticleType = new SubArticleTypeImpl();
		return subArticleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectType createSubjectType() {
		SubjectTypeImpl subjectType = new SubjectTypeImpl();
		return subjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjGroupType createSubjGroupType() {
		SubjGroupTypeImpl subjGroupType = new SubjGroupTypeImpl();
		return subjGroupType;
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
	public SubType createSubType() {
		SubTypeImpl subType = new SubTypeImpl();
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuffixType createSuffixType() {
		SuffixTypeImpl suffixType = new SuffixTypeImpl();
		return suffixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplementaryMaterialType createSupplementaryMaterialType() {
		SupplementaryMaterialTypeImpl supplementaryMaterialType = new SupplementaryMaterialTypeImpl();
		return supplementaryMaterialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplementType createSupplementType() {
		SupplementTypeImpl supplementType = new SupplementTypeImpl();
		return supplementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportDescriptionType createSupportDescriptionType() {
		SupportDescriptionTypeImpl supportDescriptionType = new SupportDescriptionTypeImpl();
		return supportDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportGroupType createSupportGroupType() {
		SupportGroupTypeImpl supportGroupType = new SupportGroupTypeImpl();
		return supportGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportSourceType createSupportSourceType() {
		SupportSourceTypeImpl supportSourceType = new SupportSourceTypeImpl();
		return supportSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupType createSupType() {
		SupTypeImpl supType = new SupTypeImpl();
		return supType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurnameType createSurnameType() {
		SurnameTypeImpl surnameType = new SurnameTypeImpl();
		return surnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCountType createTableCountType() {
		TableCountTypeImpl tableCountType = new TableCountTypeImpl();
		return tableCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableWrapFootType createTableWrapFootType() {
		TableWrapFootTypeImpl tableWrapFootType = new TableWrapFootTypeImpl();
		return tableWrapFootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableWrapGroupType createTableWrapGroupType() {
		TableWrapGroupTypeImpl tableWrapGroupType = new TableWrapGroupTypeImpl();
		return tableWrapGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableWrapType createTableWrapType() {
		TableWrapTypeImpl tableWrapType = new TableWrapTypeImpl();
		return tableWrapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetType createTargetType() {
		TargetTypeImpl targetType = new TargetTypeImpl();
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TbodyType createTbodyType() {
		TbodyTypeImpl tbodyType = new TbodyTypeImpl();
		return tbodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TdType createTdType() {
		TdTypeImpl tdType = new TdTypeImpl();
		return tdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermHeadType createTermHeadType() {
		TermHeadTypeImpl termHeadType = new TermHeadTypeImpl();
		return termHeadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermType createTermType() {
		TermTypeImpl termType = new TermTypeImpl();
		return termType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TexMathType createTexMathType() {
		TexMathTypeImpl texMathType = new TexMathTypeImpl();
		return texMathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextualFormType createTextualFormType() {
		TextualFormTypeImpl textualFormType = new TextualFormTypeImpl();
		return textualFormType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TfootType createTfootType() {
		TfootTypeImpl tfootType = new TfootTypeImpl();
		return tfootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TheadType createTheadType() {
		TheadTypeImpl theadType = new TheadTypeImpl();
		return theadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThType createThType() {
		ThTypeImpl thType = new ThTypeImpl();
		return thType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStampType createTimeStampType() {
		TimeStampTypeImpl timeStampType = new TimeStampTypeImpl();
		return timeStampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleGroupType createTitleGroupType() {
		TitleGroupTypeImpl titleGroupType = new TitleGroupTypeImpl();
		return titleGroupType;
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
	public TransAbstractType createTransAbstractType() {
		TransAbstractTypeImpl transAbstractType = new TransAbstractTypeImpl();
		return transAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransSourceType createTransSourceType() {
		TransSourceTypeImpl transSourceType = new TransSourceTypeImpl();
		return transSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransSubtitleType createTransSubtitleType() {
		TransSubtitleTypeImpl transSubtitleType = new TransSubtitleTypeImpl();
		return transSubtitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransTitleGroupType createTransTitleGroupType() {
		TransTitleGroupTypeImpl transTitleGroupType = new TransTitleGroupTypeImpl();
		return transTitleGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransTitleType createTransTitleType() {
		TransTitleTypeImpl transTitleType = new TransTitleTypeImpl();
		return transTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrType createTrType() {
		TrTypeImpl trType = new TrTypeImpl();
		return trType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnderlineEndType createUnderlineEndType() {
		UnderlineEndTypeImpl underlineEndType = new UnderlineEndTypeImpl();
		return underlineEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnderlineStartType createUnderlineStartType() {
		UnderlineStartTypeImpl underlineStartType = new UnderlineStartTypeImpl();
		return underlineStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnderlineType createUnderlineType() {
		UnderlineTypeImpl underlineType = new UnderlineTypeImpl();
		return underlineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredKwdGroupType createUnstructuredKwdGroupType() {
		UnstructuredKwdGroupTypeImpl unstructuredKwdGroupType = new UnstructuredKwdGroupTypeImpl();
		return unstructuredKwdGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UriType createUriType() {
		UriTypeImpl uriType = new UriTypeImpl();
		return uriType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerseGroupType createVerseGroupType() {
		VerseGroupTypeImpl verseGroupType = new VerseGroupTypeImpl();
		return verseGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerseLineType createVerseLineType() {
		VerseLineTypeImpl verseLineType = new VerseLineTypeImpl();
		return verseLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionType createVersionType() {
		VersionTypeImpl versionType = new VersionTypeImpl();
		return versionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeIdType createVolumeIdType() {
		VolumeIdTypeImpl volumeIdType = new VolumeIdTypeImpl();
		return volumeIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeIssueGroupType createVolumeIssueGroupType() {
		VolumeIssueGroupTypeImpl volumeIssueGroupType = new VolumeIssueGroupTypeImpl();
		return volumeIssueGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeSeriesType createVolumeSeriesType() {
		VolumeSeriesTypeImpl volumeSeriesType = new VolumeSeriesTypeImpl();
		return volumeSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeType createVolumeType() {
		VolumeTypeImpl volumeType = new VolumeTypeImpl();
		return volumeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WordCountType createWordCountType() {
		WordCountTypeImpl wordCountType = new WordCountTypeImpl();
		return wordCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefType createXrefType() {
		XrefTypeImpl xrefType = new XrefTypeImpl();
		return xrefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XType createXType() {
		XTypeImpl xType = new XTypeImpl();
		return xType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YearType createYearType() {
		YearTypeImpl yearType = new YearTypeImpl();
		return yearType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
		AlignType result = AlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType1 createAlignType1FromString(EDataType eDataType, String initialValue) {
		AlignType1 result = AlignType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType2 createAlignType2FromString(EDataType eDataType, String initialValue) {
		AlignType2 result = AlignType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType3 createAlignType3FromString(EDataType eDataType, String initialValue) {
		AlignType3 result = AlignType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType4 createAlignType4FromString(EDataType eDataType, String initialValue) {
		AlignType4 result = AlignType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType5 createAlignType5FromString(EDataType eDataType, String initialValue) {
		AlignType5 result = AlignType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType6 createAlignType6FromString(EDataType eDataType, String initialValue) {
		AlignType6 result = AlignType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType7 createAlignType7FromString(EDataType eDataType, String initialValue) {
		AlignType7 result = AlignType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrangeType createArrangeTypeFromString(EDataType eDataType, String initialValue) {
		ArrangeType result = ArrangeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrangeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrangeType1 createArrangeType1FromString(EDataType eDataType, String initialValue) {
		ArrangeType1 result = ArrangeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrangeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticatedType createAuthenticatedTypeFromString(EDataType eDataType, String initialValue) {
		AuthenticatedType result = AuthenticatedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthenticatedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespType1 createCorrespType1FromString(EDataType eDataType, String initialValue) {
		CorrespType1 result = CorrespType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCorrespType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeceasedType createDeceasedTypeFromString(EDataType eDataType, String initialValue) {
		DeceasedType result = DeceasedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeceasedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualContribType createEqualContribTypeFromString(EDataType eDataType, String initialValue) {
		EqualContribType result = EqualContribType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualContribTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableType createExecutableTypeFromString(EDataType eDataType, String initialValue) {
		ExecutableType result = ExecutableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FnTypeType createFnTypeTypeFromString(EDataType eDataType, String initialValue) {
		FnTypeType result = FnTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFnTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType createFrameTypeFromString(EDataType eDataType, String initialValue) {
		FrameType result = FrameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameTypeToString(EDataType eDataType, Object instanceValue) {
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
	public NotationType createNotationTypeFromString(EDataType eDataType, String initialValue) {
		NotationType result = NotationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationTypeFromString(EDataType eDataType, String initialValue) {
		OrientationType result = OrientationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType1 createOrientationType1FromString(EDataType eDataType, String initialValue) {
		OrientationType1 result = OrientationType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType2 createOrientationType2FromString(EDataType eDataType, String initialValue) {
		OrientationType2 result = OrientationType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType3 createOrientationType3FromString(EDataType eDataType, String initialValue) {
		OrientationType3 result = OrientationType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType4 createOrientationType4FromString(EDataType eDataType, String initialValue) {
		OrientationType4 result = OrientationType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType5 createOrientationType5FromString(EDataType eDataType, String initialValue) {
		OrientationType5 result = OrientationType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType6 createOrientationType6FromString(EDataType eDataType, String initialValue) {
		OrientationType6 result = OrientationType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType7 createOrientationType7FromString(EDataType eDataType, String initialValue) {
		OrientationType7 result = OrientationType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType8 createOrientationType8FromString(EDataType eDataType, String initialValue) {
		OrientationType8 result = OrientationType8.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType9 createOrientationType9FromString(EDataType eDataType, String initialValue) {
		OrientationType9 result = OrientationType9.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType9ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType10 createOrientationType10FromString(EDataType eDataType, String initialValue) {
		OrientationType10 result = OrientationType10.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType10ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType11 createOrientationType11FromString(EDataType eDataType, String initialValue) {
		OrientationType11 result = OrientationType11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonGroupTypeType createPersonGroupTypeTypeFromString(EDataType eDataType, String initialValue) {
		PersonGroupTypeType result = PersonGroupTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonGroupTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType createPositionTypeFromString(EDataType eDataType, String initialValue) {
		PositionType result = PositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType1 createPositionType1FromString(EDataType eDataType, String initialValue) {
		PositionType1 result = PositionType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType2 createPositionType2FromString(EDataType eDataType, String initialValue) {
		PositionType2 result = PositionType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType3 createPositionType3FromString(EDataType eDataType, String initialValue) {
		PositionType3 result = PositionType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType4 createPositionType4FromString(EDataType eDataType, String initialValue) {
		PositionType4 result = PositionType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType5 createPositionType5FromString(EDataType eDataType, String initialValue) {
		PositionType5 result = PositionType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType6 createPositionType6FromString(EDataType eDataType, String initialValue) {
		PositionType6 result = PositionType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType7 createPositionType7FromString(EDataType eDataType, String initialValue) {
		PositionType7 result = PositionType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType8 createPositionType8FromString(EDataType eDataType, String initialValue) {
		PositionType8 result = PositionType8.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType9 createPositionType9FromString(EDataType eDataType, String initialValue) {
		PositionType9 result = PositionType9.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType9ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType10 createPositionType10FromString(EDataType eDataType, String initialValue) {
		PositionType10 result = PositionType10.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType10ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubIdTypeType createPubIdTypeTypeFromString(EDataType eDataType, String initialValue) {
		PubIdTypeType result = PubIdTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubIdTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubIdTypeType1 createPubIdTypeType1FromString(EDataType eDataType, String initialValue) {
		PubIdTypeType1 result = PubIdTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubIdTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTypeType createRefTypeTypeFromString(EDataType eDataType, String initialValue) {
		RefTypeType result = RefTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesType createRulesTypeFromString(EDataType eDataType, String initialValue) {
		RulesType result = RulesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRulesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
		ScopeType result = ScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType1 createScopeType1FromString(EDataType eDataType, String initialValue) {
		ScopeType1 result = ScopeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType createToggleTypeFromString(EDataType eDataType, String initialValue) {
		ToggleType result = ToggleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType1 createToggleType1FromString(EDataType eDataType, String initialValue) {
		ToggleType1 result = ToggleType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType2 createToggleType2FromString(EDataType eDataType, String initialValue) {
		ToggleType2 result = ToggleType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType3 createToggleType3FromString(EDataType eDataType, String initialValue) {
		ToggleType3 result = ToggleType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType4 createToggleType4FromString(EDataType eDataType, String initialValue) {
		ToggleType4 result = ToggleType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType5 createToggleType5FromString(EDataType eDataType, String initialValue) {
		ToggleType5 result = ToggleType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType6 createToggleType6FromString(EDataType eDataType, String initialValue) {
		ToggleType6 result = ToggleType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType7 createToggleType7FromString(EDataType eDataType, String initialValue) {
		ToggleType7 result = ToggleType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType8 createToggleType8FromString(EDataType eDataType, String initialValue) {
		ToggleType8 result = ToggleType8.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleType8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType9 createToggleType9FromString(EDataType eDataType, String initialValue) {
		ToggleType9 result = ToggleType9.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleType9ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeFromString(EDataType eDataType, String initialValue) {
		ValignType result = ValignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType1 createValignType1FromString(EDataType eDataType, String initialValue) {
		ValignType1 result = ValignType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType2 createValignType2FromString(EDataType eDataType, String initialValue) {
		ValignType2 result = ValignType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType3 createValignType3FromString(EDataType eDataType, String initialValue) {
		ValignType3 result = ValignType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType4 createValignType4FromString(EDataType eDataType, String initialValue) {
		ValignType4 result = ValignType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType5 createValignType5FromString(EDataType eDataType, String initialValue) {
		ValignType5 result = ValignType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType6 createValignType6FromString(EDataType eDataType, String initialValue) {
		ValignType6 result = ValignType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType7 createValignType7FromString(EDataType eDataType, String initialValue) {
		ValignType7 result = ValignType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType3 createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignType3FromString(Jats1Package.eINSTANCE.getAlignType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType3ToString(Jats1Package.eINSTANCE.getAlignType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType4 createAlignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createAlignType4FromString(Jats1Package.eINSTANCE.getAlignType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType4ToString(Jats1Package.eINSTANCE.getAlignType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType1 createAlignTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createAlignType1FromString(Jats1Package.eINSTANCE.getAlignType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType1ToString(Jats1Package.eINSTANCE.getAlignType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType5 createAlignTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createAlignType5FromString(Jats1Package.eINSTANCE.getAlignType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType5ToString(Jats1Package.eINSTANCE.getAlignType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createAlignTypeFromString(Jats1Package.eINSTANCE.getAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignTypeToString(Jats1Package.eINSTANCE.getAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType6 createAlignTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createAlignType6FromString(Jats1Package.eINSTANCE.getAlignType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType6ToString(Jats1Package.eINSTANCE.getAlignType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType2 createAlignTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createAlignType2FromString(Jats1Package.eINSTANCE.getAlignType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType2ToString(Jats1Package.eINSTANCE.getAlignType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType7 createAlignTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createAlignType7FromString(Jats1Package.eINSTANCE.getAlignType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType7ToString(Jats1Package.eINSTANCE.getAlignType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrangeType createArrangeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createArrangeTypeFromString(Jats1Package.eINSTANCE.getArrangeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrangeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArrangeTypeToString(Jats1Package.eINSTANCE.getArrangeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrangeType1 createArrangeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createArrangeType1FromString(Jats1Package.eINSTANCE.getArrangeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrangeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertArrangeType1ToString(Jats1Package.eINSTANCE.getArrangeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticatedType createAuthenticatedTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAuthenticatedTypeFromString(Jats1Package.eINSTANCE.getAuthenticatedType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthenticatedTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuthenticatedTypeToString(Jats1Package.eINSTANCE.getAuthenticatedType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespType1 createCorrespTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCorrespType1FromString(Jats1Package.eINSTANCE.getCorrespType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCorrespTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCorrespType1ToString(Jats1Package.eINSTANCE.getCorrespType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeceasedType createDeceasedTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDeceasedTypeFromString(Jats1Package.eINSTANCE.getDeceasedType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeceasedTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeceasedTypeToString(Jats1Package.eINSTANCE.getDeceasedType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualContribType createEqualContribTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEqualContribTypeFromString(Jats1Package.eINSTANCE.getEqualContribType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualContribTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEqualContribTypeToString(Jats1Package.eINSTANCE.getEqualContribType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableType createExecutableTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createExecutableTypeFromString(Jats1Package.eINSTANCE.getExecutableType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutableTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExecutableTypeToString(Jats1Package.eINSTANCE.getExecutableType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FnTypeType createFnTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFnTypeTypeFromString(Jats1Package.eINSTANCE.getFnTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFnTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFnTypeTypeToString(Jats1Package.eINSTANCE.getFnTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType createFrameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFrameTypeFromString(Jats1Package.eINSTANCE.getFrameType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFrameTypeToString(Jats1Package.eINSTANCE.getFrameType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStyleType createNameStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNameStyleTypeFromString(Jats1Package.eINSTANCE.getNameStyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameStyleTypeToString(Jats1Package.eINSTANCE.getNameStyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStyleType1 createNameStyleTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createNameStyleType1FromString(Jats1Package.eINSTANCE.getNameStyleType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameStyleTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertNameStyleType1ToString(Jats1Package.eINSTANCE.getNameStyleType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationType createNotationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNotationTypeFromString(Jats1Package.eINSTANCE.getNotationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNotationTypeToString(Jats1Package.eINSTANCE.getNotationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType6 createOrientationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOrientationType6FromString(Jats1Package.eINSTANCE.getOrientationType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType6ToString(Jats1Package.eINSTANCE.getOrientationType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createOrientationTypeFromString(Jats1Package.eINSTANCE.getOrientationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationTypeToString(Jats1Package.eINSTANCE.getOrientationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType1 createOrientationTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createOrientationType1FromString(Jats1Package.eINSTANCE.getOrientationType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType1ToString(Jats1Package.eINSTANCE.getOrientationType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType4 createOrientationTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createOrientationType4FromString(Jats1Package.eINSTANCE.getOrientationType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType4ToString(Jats1Package.eINSTANCE.getOrientationType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType2 createOrientationTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createOrientationType2FromString(Jats1Package.eINSTANCE.getOrientationType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType2ToString(Jats1Package.eINSTANCE.getOrientationType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType7 createOrientationTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createOrientationType7FromString(Jats1Package.eINSTANCE.getOrientationType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType7ToString(Jats1Package.eINSTANCE.getOrientationType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType3 createOrientationTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createOrientationType3FromString(Jats1Package.eINSTANCE.getOrientationType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType3ToString(Jats1Package.eINSTANCE.getOrientationType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType5 createOrientationTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createOrientationType5FromString(Jats1Package.eINSTANCE.getOrientationType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType5ToString(Jats1Package.eINSTANCE.getOrientationType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType9 createOrientationTypeObject8FromString(EDataType eDataType, String initialValue) {
		return createOrientationType9FromString(Jats1Package.eINSTANCE.getOrientationType9(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject8ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType9ToString(Jats1Package.eINSTANCE.getOrientationType9(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType8 createOrientationTypeObject9FromString(EDataType eDataType, String initialValue) {
		return createOrientationType8FromString(Jats1Package.eINSTANCE.getOrientationType8(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject9ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType8ToString(Jats1Package.eINSTANCE.getOrientationType8(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType10 createOrientationTypeObject10FromString(EDataType eDataType, String initialValue) {
		return createOrientationType10FromString(Jats1Package.eINSTANCE.getOrientationType10(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject10ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType10ToString(Jats1Package.eINSTANCE.getOrientationType10(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType11 createOrientationTypeObject11FromString(EDataType eDataType, String initialValue) {
		return createOrientationType11FromString(Jats1Package.eINSTANCE.getOrientationType11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject11ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType11ToString(Jats1Package.eINSTANCE.getOrientationType11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonGroupTypeType createPersonGroupTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPersonGroupTypeTypeFromString(Jats1Package.eINSTANCE.getPersonGroupTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonGroupTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersonGroupTypeTypeToString(Jats1Package.eINSTANCE.getPersonGroupTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType6 createPositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPositionType6FromString(Jats1Package.eINSTANCE.getPositionType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositionType6ToString(Jats1Package.eINSTANCE.getPositionType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType1 createPositionTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createPositionType1FromString(Jats1Package.eINSTANCE.getPositionType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertPositionType1ToString(Jats1Package.eINSTANCE.getPositionType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType7 createPositionTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createPositionType7FromString(Jats1Package.eINSTANCE.getPositionType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertPositionType7ToString(Jats1Package.eINSTANCE.getPositionType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType3 createPositionTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createPositionType3FromString(Jats1Package.eINSTANCE.getPositionType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertPositionType3ToString(Jats1Package.eINSTANCE.getPositionType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType4 createPositionTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createPositionType4FromString(Jats1Package.eINSTANCE.getPositionType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertPositionType4ToString(Jats1Package.eINSTANCE.getPositionType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType5 createPositionTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createPositionType5FromString(Jats1Package.eINSTANCE.getPositionType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertPositionType5ToString(Jats1Package.eINSTANCE.getPositionType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType2 createPositionTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createPositionType2FromString(Jats1Package.eINSTANCE.getPositionType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertPositionType2ToString(Jats1Package.eINSTANCE.getPositionType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType8 createPositionTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createPositionType8FromString(Jats1Package.eINSTANCE.getPositionType8(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertPositionType8ToString(Jats1Package.eINSTANCE.getPositionType8(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType createPositionTypeObject8FromString(EDataType eDataType, String initialValue) {
		return createPositionTypeFromString(Jats1Package.eINSTANCE.getPositionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObject8ToString(EDataType eDataType, Object instanceValue) {
		return convertPositionTypeToString(Jats1Package.eINSTANCE.getPositionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType9 createPositionTypeObject9FromString(EDataType eDataType, String initialValue) {
		return createPositionType9FromString(Jats1Package.eINSTANCE.getPositionType9(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObject9ToString(EDataType eDataType, Object instanceValue) {
		return convertPositionType9ToString(Jats1Package.eINSTANCE.getPositionType9(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType10 createPositionTypeObject10FromString(EDataType eDataType, String initialValue) {
		return createPositionType10FromString(Jats1Package.eINSTANCE.getPositionType10(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeObject10ToString(EDataType eDataType, Object instanceValue) {
		return convertPositionType10ToString(Jats1Package.eINSTANCE.getPositionType10(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubIdTypeType createPubIdTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPubIdTypeTypeFromString(Jats1Package.eINSTANCE.getPubIdTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubIdTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPubIdTypeTypeToString(Jats1Package.eINSTANCE.getPubIdTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubIdTypeType1 createPubIdTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createPubIdTypeType1FromString(Jats1Package.eINSTANCE.getPubIdTypeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubIdTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertPubIdTypeType1ToString(Jats1Package.eINSTANCE.getPubIdTypeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTypeType createRefTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRefTypeTypeFromString(Jats1Package.eINSTANCE.getRefTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRefTypeTypeToString(Jats1Package.eINSTANCE.getRefTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesType createRulesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRulesTypeFromString(Jats1Package.eINSTANCE.getRulesType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRulesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRulesTypeToString(Jats1Package.eINSTANCE.getRulesType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeTypeFromString(Jats1Package.eINSTANCE.getScopeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeTypeToString(Jats1Package.eINSTANCE.getScopeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType1 createScopeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createScopeType1FromString(Jats1Package.eINSTANCE.getScopeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertScopeType1ToString(Jats1Package.eINSTANCE.getScopeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType createToggleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createToggleTypeFromString(Jats1Package.eINSTANCE.getToggleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertToggleTypeToString(Jats1Package.eINSTANCE.getToggleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType2 createToggleTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createToggleType2FromString(Jats1Package.eINSTANCE.getToggleType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertToggleType2ToString(Jats1Package.eINSTANCE.getToggleType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType5 createToggleTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createToggleType5FromString(Jats1Package.eINSTANCE.getToggleType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertToggleType5ToString(Jats1Package.eINSTANCE.getToggleType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType7 createToggleTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createToggleType7FromString(Jats1Package.eINSTANCE.getToggleType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertToggleType7ToString(Jats1Package.eINSTANCE.getToggleType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType3 createToggleTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createToggleType3FromString(Jats1Package.eINSTANCE.getToggleType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertToggleType3ToString(Jats1Package.eINSTANCE.getToggleType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType4 createToggleTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createToggleType4FromString(Jats1Package.eINSTANCE.getToggleType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertToggleType4ToString(Jats1Package.eINSTANCE.getToggleType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType1 createToggleTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createToggleType1FromString(Jats1Package.eINSTANCE.getToggleType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertToggleType1ToString(Jats1Package.eINSTANCE.getToggleType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType6 createToggleTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createToggleType6FromString(Jats1Package.eINSTANCE.getToggleType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertToggleType6ToString(Jats1Package.eINSTANCE.getToggleType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType8 createToggleTypeObject8FromString(EDataType eDataType, String initialValue) {
		return createToggleType8FromString(Jats1Package.eINSTANCE.getToggleType8(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeObject8ToString(EDataType eDataType, Object instanceValue) {
		return convertToggleType8ToString(Jats1Package.eINSTANCE.getToggleType8(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleType9 createToggleTypeObject9FromString(EDataType eDataType, String initialValue) {
		return createToggleType9FromString(Jats1Package.eINSTANCE.getToggleType9(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToggleTypeObject9ToString(EDataType eDataType, Object instanceValue) {
		return convertToggleType9ToString(Jats1Package.eINSTANCE.getToggleType9(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValignTypeFromString(Jats1Package.eINSTANCE.getValignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValignTypeToString(Jats1Package.eINSTANCE.getValignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType2 createValignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createValignType2FromString(Jats1Package.eINSTANCE.getValignType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType2ToString(Jats1Package.eINSTANCE.getValignType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType4 createValignTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createValignType4FromString(Jats1Package.eINSTANCE.getValignType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType4ToString(Jats1Package.eINSTANCE.getValignType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType1 createValignTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createValignType1FromString(Jats1Package.eINSTANCE.getValignType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType1ToString(Jats1Package.eINSTANCE.getValignType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType6 createValignTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createValignType6FromString(Jats1Package.eINSTANCE.getValignType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType6ToString(Jats1Package.eINSTANCE.getValignType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType3 createValignTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createValignType3FromString(Jats1Package.eINSTANCE.getValignType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType3ToString(Jats1Package.eINSTANCE.getValignType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType5 createValignTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createValignType5FromString(Jats1Package.eINSTANCE.getValignType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType5ToString(Jats1Package.eINSTANCE.getValignType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType7 createValignTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createValignType7FromString(Jats1Package.eINSTANCE.getValignType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType7ToString(Jats1Package.eINSTANCE.getValignType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Jats1Package getJats1Package() {
		return (Jats1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Jats1Package getPackage() {
		return Jats1Package.eINSTANCE;
	}

} //Jats1FactoryImpl
