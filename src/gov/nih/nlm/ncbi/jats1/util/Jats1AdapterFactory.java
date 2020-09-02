/**
 */
package gov.nih.nlm.ncbi.jats1.util;

import gov.nih.nlm.ncbi.jats1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package
 * @generated
 */
public class Jats1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Jats1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jats1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Jats1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Jats1Switch<Adapter> modelSwitch =
		new Jats1Switch<Adapter>() {
			@Override
			public Adapter caseAbbrevJournalTitleType(AbbrevJournalTitleType object) {
				return createAbbrevJournalTitleTypeAdapter();
			}
			@Override
			public Adapter caseAbbrevType(AbbrevType object) {
				return createAbbrevTypeAdapter();
			}
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter caseAccessDateType(AccessDateType object) {
				return createAccessDateTypeAdapter();
			}
			@Override
			public Adapter caseAckType(AckType object) {
				return createAckTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAddrLineType(AddrLineType object) {
				return createAddrLineTypeAdapter();
			}
			@Override
			public Adapter caseAffAlternativesType(AffAlternativesType object) {
				return createAffAlternativesTypeAdapter();
			}
			@Override
			public Adapter caseAffType(AffType object) {
				return createAffTypeAdapter();
			}
			@Override
			public Adapter caseAlternativesType(AlternativesType object) {
				return createAlternativesTypeAdapter();
			}
			@Override
			public Adapter caseAltTextType(AltTextType object) {
				return createAltTextTypeAdapter();
			}
			@Override
			public Adapter caseAltTitleType(AltTitleType object) {
				return createAltTitleTypeAdapter();
			}
			@Override
			public Adapter caseAnnotationType(AnnotationType object) {
				return createAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseAnonymousType(AnonymousType object) {
				return createAnonymousTypeAdapter();
			}
			@Override
			public Adapter caseAppGroupType(AppGroupType object) {
				return createAppGroupTypeAdapter();
			}
			@Override
			public Adapter caseAppType(AppType object) {
				return createAppTypeAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseArticleCategoriesType(ArticleCategoriesType object) {
				return createArticleCategoriesTypeAdapter();
			}
			@Override
			public Adapter caseArticleIdType(ArticleIdType object) {
				return createArticleIdTypeAdapter();
			}
			@Override
			public Adapter caseArticleMetaType(ArticleMetaType object) {
				return createArticleMetaTypeAdapter();
			}
			@Override
			public Adapter caseArticleTitleType(ArticleTitleType object) {
				return createArticleTitleTypeAdapter();
			}
			@Override
			public Adapter caseArticleType(ArticleType object) {
				return createArticleTypeAdapter();
			}
			@Override
			public Adapter caseArticleVersionAlternativesType(ArticleVersionAlternativesType object) {
				return createArticleVersionAlternativesTypeAdapter();
			}
			@Override
			public Adapter caseArticleVersionType(ArticleVersionType object) {
				return createArticleVersionTypeAdapter();
			}
			@Override
			public Adapter caseAttribType(AttribType object) {
				return createAttribTypeAdapter();
			}
			@Override
			public Adapter caseAuthorCommentType(AuthorCommentType object) {
				return createAuthorCommentTypeAdapter();
			}
			@Override
			public Adapter caseAuthorNotesType(AuthorNotesType object) {
				return createAuthorNotesTypeAdapter();
			}
			@Override
			public Adapter caseAwardGroupType(AwardGroupType object) {
				return createAwardGroupTypeAdapter();
			}
			@Override
			public Adapter caseAwardIdType(AwardIdType object) {
				return createAwardIdTypeAdapter();
			}
			@Override
			public Adapter caseBackType(BackType object) {
				return createBackTypeAdapter();
			}
			@Override
			public Adapter caseBioType(BioType object) {
				return createBioTypeAdapter();
			}
			@Override
			public Adapter caseBodyType(BodyType object) {
				return createBodyTypeAdapter();
			}
			@Override
			public Adapter caseBoldType(BoldType object) {
				return createBoldTypeAdapter();
			}
			@Override
			public Adapter caseBoxedTextType(BoxedTextType object) {
				return createBoxedTextTypeAdapter();
			}
			@Override
			public Adapter caseBreakType(BreakType object) {
				return createBreakTypeAdapter();
			}
			@Override
			public Adapter caseCaptionType(CaptionType object) {
				return createCaptionTypeAdapter();
			}
			@Override
			public Adapter caseChapterTitleType(ChapterTitleType object) {
				return createChapterTitleTypeAdapter();
			}
			@Override
			public Adapter caseChemStructType(ChemStructType object) {
				return createChemStructTypeAdapter();
			}
			@Override
			public Adapter caseChemStructWrapType(ChemStructWrapType object) {
				return createChemStructWrapTypeAdapter();
			}
			@Override
			public Adapter caseCitationAlternativesType(CitationAlternativesType object) {
				return createCitationAlternativesTypeAdapter();
			}
			@Override
			public Adapter caseCityType(CityType object) {
				return createCityTypeAdapter();
			}
			@Override
			public Adapter caseCodeType(CodeType object) {
				return createCodeTypeAdapter();
			}
			@Override
			public Adapter caseColgroupType(ColgroupType object) {
				return createColgroupTypeAdapter();
			}
			@Override
			public Adapter caseCollabAlternativesType(CollabAlternativesType object) {
				return createCollabAlternativesTypeAdapter();
			}
			@Override
			public Adapter caseCollabType(CollabType object) {
				return createCollabTypeAdapter();
			}
			@Override
			public Adapter caseColType(ColType object) {
				return createColTypeAdapter();
			}
			@Override
			public Adapter caseCommentType(CommentType object) {
				return createCommentTypeAdapter();
			}
			@Override
			public Adapter caseCompoundKwdPartType(CompoundKwdPartType object) {
				return createCompoundKwdPartTypeAdapter();
			}
			@Override
			public Adapter caseCompoundKwdType(CompoundKwdType object) {
				return createCompoundKwdTypeAdapter();
			}
			@Override
			public Adapter caseCompoundSubjectPartType(CompoundSubjectPartType object) {
				return createCompoundSubjectPartTypeAdapter();
			}
			@Override
			public Adapter caseCompoundSubjectType(CompoundSubjectType object) {
				return createCompoundSubjectTypeAdapter();
			}
			@Override
			public Adapter caseConfAcronymType(ConfAcronymType object) {
				return createConfAcronymTypeAdapter();
			}
			@Override
			public Adapter caseConfDateType(ConfDateType object) {
				return createConfDateTypeAdapter();
			}
			@Override
			public Adapter caseConferenceType(ConferenceType object) {
				return createConferenceTypeAdapter();
			}
			@Override
			public Adapter caseConfLocType(ConfLocType object) {
				return createConfLocTypeAdapter();
			}
			@Override
			public Adapter caseConfNameType(ConfNameType object) {
				return createConfNameTypeAdapter();
			}
			@Override
			public Adapter caseConfNumType(ConfNumType object) {
				return createConfNumTypeAdapter();
			}
			@Override
			public Adapter caseConfSponsorType(ConfSponsorType object) {
				return createConfSponsorTypeAdapter();
			}
			@Override
			public Adapter caseConfThemeType(ConfThemeType object) {
				return createConfThemeTypeAdapter();
			}
			@Override
			public Adapter caseContribGroupType(ContribGroupType object) {
				return createContribGroupTypeAdapter();
			}
			@Override
			public Adapter caseContribIdType(ContribIdType object) {
				return createContribIdTypeAdapter();
			}
			@Override
			public Adapter caseContribType(ContribType object) {
				return createContribTypeAdapter();
			}
			@Override
			public Adapter caseContributedResourceGroupType(ContributedResourceGroupType object) {
				return createContributedResourceGroupTypeAdapter();
			}
			@Override
			public Adapter caseCopyrightHolderType(CopyrightHolderType object) {
				return createCopyrightHolderTypeAdapter();
			}
			@Override
			public Adapter caseCopyrightStatementType(CopyrightStatementType object) {
				return createCopyrightStatementTypeAdapter();
			}
			@Override
			public Adapter caseCopyrightYearType(CopyrightYearType object) {
				return createCopyrightYearTypeAdapter();
			}
			@Override
			public Adapter caseCorrespType(CorrespType object) {
				return createCorrespTypeAdapter();
			}
			@Override
			public Adapter caseCountryType(CountryType object) {
				return createCountryTypeAdapter();
			}
			@Override
			public Adapter caseCountsType(CountsType object) {
				return createCountsTypeAdapter();
			}
			@Override
			public Adapter caseCountType(CountType object) {
				return createCountTypeAdapter();
			}
			@Override
			public Adapter caseCustomMetaGroupType(CustomMetaGroupType object) {
				return createCustomMetaGroupTypeAdapter();
			}
			@Override
			public Adapter caseCustomMetaType(CustomMetaType object) {
				return createCustomMetaTypeAdapter();
			}
			@Override
			public Adapter caseDataTitleType(DataTitleType object) {
				return createDataTitleTypeAdapter();
			}
			@Override
			public Adapter caseDateInCitationType(DateInCitationType object) {
				return createDateInCitationTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseDayType(DayType object) {
				return createDayTypeAdapter();
			}
			@Override
			public Adapter caseDefHeadType(DefHeadType object) {
				return createDefHeadTypeAdapter();
			}
			@Override
			public Adapter caseDefItemType(DefItemType object) {
				return createDefItemTypeAdapter();
			}
			@Override
			public Adapter caseDefListType(DefListType object) {
				return createDefListTypeAdapter();
			}
			@Override
			public Adapter caseDefType(DefType object) {
				return createDefTypeAdapter();
			}
			@Override
			public Adapter caseDegreesType(DegreesType object) {
				return createDegreesTypeAdapter();
			}
			@Override
			public Adapter caseDispFormulaGroupType(DispFormulaGroupType object) {
				return createDispFormulaGroupTypeAdapter();
			}
			@Override
			public Adapter caseDispFormulaType(DispFormulaType object) {
				return createDispFormulaTypeAdapter();
			}
			@Override
			public Adapter caseDispQuoteType(DispQuoteType object) {
				return createDispQuoteTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEditionType(EditionType object) {
				return createEditionTypeAdapter();
			}
			@Override
			public Adapter caseElementCitationType(ElementCitationType object) {
				return createElementCitationTypeAdapter();
			}
			@Override
			public Adapter caseElocationIdType(ElocationIdType object) {
				return createElocationIdTypeAdapter();
			}
			@Override
			public Adapter caseEmailType(EmailType object) {
				return createEmailTypeAdapter();
			}
			@Override
			public Adapter caseEquationCountType(EquationCountType object) {
				return createEquationCountTypeAdapter();
			}
			@Override
			public Adapter caseEraType(EraType object) {
				return createEraTypeAdapter();
			}
			@Override
			public Adapter caseEtalType(EtalType object) {
				return createEtalTypeAdapter();
			}
			@Override
			public Adapter caseEventDescType(EventDescType object) {
				return createEventDescTypeAdapter();
			}
			@Override
			public Adapter caseEventType(EventType object) {
				return createEventTypeAdapter();
			}
			@Override
			public Adapter caseExtLinkType(ExtLinkType object) {
				return createExtLinkTypeAdapter();
			}
			@Override
			public Adapter caseFaxType(FaxType object) {
				return createFaxTypeAdapter();
			}
			@Override
			public Adapter caseFigCountType(FigCountType object) {
				return createFigCountTypeAdapter();
			}
			@Override
			public Adapter caseFigGroupType(FigGroupType object) {
				return createFigGroupTypeAdapter();
			}
			@Override
			public Adapter caseFigType(FigType object) {
				return createFigTypeAdapter();
			}
			@Override
			public Adapter caseFixedCaseType(FixedCaseType object) {
				return createFixedCaseTypeAdapter();
			}
			@Override
			public Adapter caseFloatsGroupType(FloatsGroupType object) {
				return createFloatsGroupTypeAdapter();
			}
			@Override
			public Adapter caseFnGroupType(FnGroupType object) {
				return createFnGroupTypeAdapter();
			}
			@Override
			public Adapter caseFnType(FnType object) {
				return createFnTypeAdapter();
			}
			@Override
			public Adapter caseFpageType(FpageType object) {
				return createFpageTypeAdapter();
			}
			@Override
			public Adapter caseFrontStubType(FrontStubType object) {
				return createFrontStubTypeAdapter();
			}
			@Override
			public Adapter caseFrontType(FrontType object) {
				return createFrontTypeAdapter();
			}
			@Override
			public Adapter caseFundingGroupType(FundingGroupType object) {
				return createFundingGroupTypeAdapter();
			}
			@Override
			public Adapter caseFundingSourceType(FundingSourceType object) {
				return createFundingSourceTypeAdapter();
			}
			@Override
			public Adapter caseFundingStatementType(FundingStatementType object) {
				return createFundingStatementTypeAdapter();
			}
			@Override
			public Adapter caseGivenNamesType(GivenNamesType object) {
				return createGivenNamesTypeAdapter();
			}
			@Override
			public Adapter caseGlossaryType(GlossaryType object) {
				return createGlossaryTypeAdapter();
			}
			@Override
			public Adapter caseGlyphDataType(GlyphDataType object) {
				return createGlyphDataTypeAdapter();
			}
			@Override
			public Adapter caseGlyphRefType(GlyphRefType object) {
				return createGlyphRefTypeAdapter();
			}
			@Override
			public Adapter caseGovType(GovType object) {
				return createGovTypeAdapter();
			}
			@Override
			public Adapter caseGraphicType(GraphicType object) {
				return createGraphicTypeAdapter();
			}
			@Override
			public Adapter caseHistoryType(HistoryType object) {
				return createHistoryTypeAdapter();
			}
			@Override
			public Adapter caseHrType(HrType object) {
				return createHrTypeAdapter();
			}
			@Override
			public Adapter caseIndexTermRangeEndType(IndexTermRangeEndType object) {
				return createIndexTermRangeEndTypeAdapter();
			}
			@Override
			public Adapter caseIndexTermType(IndexTermType object) {
				return createIndexTermTypeAdapter();
			}
			@Override
			public Adapter caseInlineFormulaType(InlineFormulaType object) {
				return createInlineFormulaTypeAdapter();
			}
			@Override
			public Adapter caseInlineGraphicType(InlineGraphicType object) {
				return createInlineGraphicTypeAdapter();
			}
			@Override
			public Adapter caseInlineMediaType(InlineMediaType object) {
				return createInlineMediaTypeAdapter();
			}
			@Override
			public Adapter caseInlineSupplementaryMaterialType(InlineSupplementaryMaterialType object) {
				return createInlineSupplementaryMaterialTypeAdapter();
			}
			@Override
			public Adapter caseInstitutionIdType(InstitutionIdType object) {
				return createInstitutionIdTypeAdapter();
			}
			@Override
			public Adapter caseInstitutionType(InstitutionType object) {
				return createInstitutionTypeAdapter();
			}
			@Override
			public Adapter caseInstitutionWrapType(InstitutionWrapType object) {
				return createInstitutionWrapTypeAdapter();
			}
			@Override
			public Adapter caseIsbnType(IsbnType object) {
				return createIsbnTypeAdapter();
			}
			@Override
			public Adapter caseIssnLType(IssnLType object) {
				return createIssnLTypeAdapter();
			}
			@Override
			public Adapter caseIssnType(IssnType object) {
				return createIssnTypeAdapter();
			}
			@Override
			public Adapter caseIssueIdType(IssueIdType object) {
				return createIssueIdTypeAdapter();
			}
			@Override
			public Adapter caseIssuePartType(IssuePartType object) {
				return createIssuePartTypeAdapter();
			}
			@Override
			public Adapter caseIssueSponsorType(IssueSponsorType object) {
				return createIssueSponsorTypeAdapter();
			}
			@Override
			public Adapter caseIssueTitleType(IssueTitleType object) {
				return createIssueTitleTypeAdapter();
			}
			@Override
			public Adapter caseIssueType(IssueType object) {
				return createIssueTypeAdapter();
			}
			@Override
			public Adapter caseItalicType(ItalicType object) {
				return createItalicTypeAdapter();
			}
			@Override
			public Adapter caseJournalIdType(JournalIdType object) {
				return createJournalIdTypeAdapter();
			}
			@Override
			public Adapter caseJournalMetaType(JournalMetaType object) {
				return createJournalMetaTypeAdapter();
			}
			@Override
			public Adapter caseJournalSubtitleType(JournalSubtitleType object) {
				return createJournalSubtitleTypeAdapter();
			}
			@Override
			public Adapter caseJournalTitleGroupType(JournalTitleGroupType object) {
				return createJournalTitleGroupTypeAdapter();
			}
			@Override
			public Adapter caseJournalTitleType(JournalTitleType object) {
				return createJournalTitleTypeAdapter();
			}
			@Override
			public Adapter caseKwdGroupType(KwdGroupType object) {
				return createKwdGroupTypeAdapter();
			}
			@Override
			public Adapter caseKwdType(KwdType object) {
				return createKwdTypeAdapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseLicensePType(LicensePType object) {
				return createLicensePTypeAdapter();
			}
			@Override
			public Adapter caseLicenseType(LicenseType object) {
				return createLicenseTypeAdapter();
			}
			@Override
			public Adapter caseListItemType(ListItemType object) {
				return createListItemTypeAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
			}
			@Override
			public Adapter caseLongDescType(LongDescType object) {
				return createLongDescTypeAdapter();
			}
			@Override
			public Adapter caseLpageType(LpageType object) {
				return createLpageTypeAdapter();
			}
			@Override
			public Adapter caseMediaType(MediaType object) {
				return createMediaTypeAdapter();
			}
			@Override
			public Adapter caseMetaNameType(MetaNameType object) {
				return createMetaNameTypeAdapter();
			}
			@Override
			public Adapter caseMetaValueType(MetaValueType object) {
				return createMetaValueTypeAdapter();
			}
			@Override
			public Adapter caseMilestoneEndType(MilestoneEndType object) {
				return createMilestoneEndTypeAdapter();
			}
			@Override
			public Adapter caseMilestoneStartType(MilestoneStartType object) {
				return createMilestoneStartTypeAdapter();
			}
			@Override
			public Adapter caseMixedCitationType(MixedCitationType object) {
				return createMixedCitationTypeAdapter();
			}
			@Override
			public Adapter caseMonospaceType(MonospaceType object) {
				return createMonospaceTypeAdapter();
			}
			@Override
			public Adapter caseMonthType(MonthType object) {
				return createMonthTypeAdapter();
			}
			@Override
			public Adapter caseNameAlternativesType(NameAlternativesType object) {
				return createNameAlternativesTypeAdapter();
			}
			@Override
			public Adapter caseNamedContentType(NamedContentType object) {
				return createNamedContentTypeAdapter();
			}
			@Override
			public Adapter caseNameType(NameType object) {
				return createNameTypeAdapter();
			}
			@Override
			public Adapter caseNestedKwdType(NestedKwdType object) {
				return createNestedKwdTypeAdapter();
			}
			@Override
			public Adapter caseNlmCitationType(NlmCitationType object) {
				return createNlmCitationTypeAdapter();
			}
			@Override
			public Adapter caseNotesType(NotesType object) {
				return createNotesTypeAdapter();
			}
			@Override
			public Adapter caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			@Override
			public Adapter caseObjectIdType(ObjectIdType object) {
				return createObjectIdTypeAdapter();
			}
			@Override
			public Adapter caseOnBehalfOfType(OnBehalfOfType object) {
				return createOnBehalfOfTypeAdapter();
			}
			@Override
			public Adapter caseOpenAccessType(OpenAccessType object) {
				return createOpenAccessTypeAdapter();
			}
			@Override
			public Adapter caseOverlineEndType(OverlineEndType object) {
				return createOverlineEndTypeAdapter();
			}
			@Override
			public Adapter caseOverlineStartType(OverlineStartType object) {
				return createOverlineStartTypeAdapter();
			}
			@Override
			public Adapter caseOverlineType(OverlineType object) {
				return createOverlineTypeAdapter();
			}
			@Override
			public Adapter casePageCountType(PageCountType object) {
				return createPageCountTypeAdapter();
			}
			@Override
			public Adapter casePageRangeType(PageRangeType object) {
				return createPageRangeTypeAdapter();
			}
			@Override
			public Adapter casePartTitleType(PartTitleType object) {
				return createPartTitleTypeAdapter();
			}
			@Override
			public Adapter casePatentType(PatentType object) {
				return createPatentTypeAdapter();
			}
			@Override
			public Adapter casePermissionsType(PermissionsType object) {
				return createPermissionsTypeAdapter();
			}
			@Override
			public Adapter casePersonGroupType(PersonGroupType object) {
				return createPersonGroupTypeAdapter();
			}
			@Override
			public Adapter casePhoneType(PhoneType object) {
				return createPhoneTypeAdapter();
			}
			@Override
			public Adapter casePostalCodeType(PostalCodeType object) {
				return createPostalCodeTypeAdapter();
			}
			@Override
			public Adapter casePrefixType(PrefixType object) {
				return createPrefixTypeAdapter();
			}
			@Override
			public Adapter casePreformatType(PreformatType object) {
				return createPreformatTypeAdapter();
			}
			@Override
			public Adapter casePriceType(PriceType object) {
				return createPriceTypeAdapter();
			}
			@Override
			public Adapter casePrincipalAwardRecipientType(PrincipalAwardRecipientType object) {
				return createPrincipalAwardRecipientTypeAdapter();
			}
			@Override
			public Adapter casePrincipalInvestigatorType(PrincipalInvestigatorType object) {
				return createPrincipalInvestigatorTypeAdapter();
			}
			@Override
			public Adapter casePrivateCharType(PrivateCharType object) {
				return createPrivateCharTypeAdapter();
			}
			@Override
			public Adapter caseProductType(ProductType object) {
				return createProductTypeAdapter();
			}
			@Override
			public Adapter casePType(PType object) {
				return createPTypeAdapter();
			}
			@Override
			public Adapter casePubDateNotAvailableType(PubDateNotAvailableType object) {
				return createPubDateNotAvailableTypeAdapter();
			}
			@Override
			public Adapter casePubDateType(PubDateType object) {
				return createPubDateTypeAdapter();
			}
			@Override
			public Adapter casePubHistoryType(PubHistoryType object) {
				return createPubHistoryTypeAdapter();
			}
			@Override
			public Adapter casePubIdType(PubIdType object) {
				return createPubIdTypeAdapter();
			}
			@Override
			public Adapter casePublisherLocType(PublisherLocType object) {
				return createPublisherLocTypeAdapter();
			}
			@Override
			public Adapter casePublisherNameType(PublisherNameType object) {
				return createPublisherNameTypeAdapter();
			}
			@Override
			public Adapter casePublisherType(PublisherType object) {
				return createPublisherTypeAdapter();
			}
			@Override
			public Adapter caseRbType(RbType object) {
				return createRbTypeAdapter();
			}
			@Override
			public Adapter caseRefCountType(RefCountType object) {
				return createRefCountTypeAdapter();
			}
			@Override
			public Adapter caseRefListType(RefListType object) {
				return createRefListTypeAdapter();
			}
			@Override
			public Adapter caseRefType(RefType object) {
				return createRefTypeAdapter();
			}
			@Override
			public Adapter caseRelatedArticleType(RelatedArticleType object) {
				return createRelatedArticleTypeAdapter();
			}
			@Override
			public Adapter caseRelatedObjectType(RelatedObjectType object) {
				return createRelatedObjectTypeAdapter();
			}
			@Override
			public Adapter caseResourceGroupType(ResourceGroupType object) {
				return createResourceGroupTypeAdapter();
			}
			@Override
			public Adapter caseResourceIdType(ResourceIdType object) {
				return createResourceIdTypeAdapter();
			}
			@Override
			public Adapter caseResourceNameType(ResourceNameType object) {
				return createResourceNameTypeAdapter();
			}
			@Override
			public Adapter caseResourceWrapType(ResourceWrapType object) {
				return createResourceWrapTypeAdapter();
			}
			@Override
			public Adapter caseResponseType(ResponseType object) {
				return createResponseTypeAdapter();
			}
			@Override
			public Adapter caseRoleType(RoleType object) {
				return createRoleTypeAdapter();
			}
			@Override
			public Adapter caseRomanType(RomanType object) {
				return createRomanTypeAdapter();
			}
			@Override
			public Adapter caseRpType(RpType object) {
				return createRpTypeAdapter();
			}
			@Override
			public Adapter caseRtType(RtType object) {
				return createRtTypeAdapter();
			}
			@Override
			public Adapter caseRubyType(RubyType object) {
				return createRubyTypeAdapter();
			}
			@Override
			public Adapter caseSansSerifType(SansSerifType object) {
				return createSansSerifTypeAdapter();
			}
			@Override
			public Adapter caseScType(ScType object) {
				return createScTypeAdapter();
			}
			@Override
			public Adapter caseSeasonType(SeasonType object) {
				return createSeasonTypeAdapter();
			}
			@Override
			public Adapter caseSecMetaType(SecMetaType object) {
				return createSecMetaTypeAdapter();
			}
			@Override
			public Adapter caseSecType(SecType object) {
				return createSecTypeAdapter();
			}
			@Override
			public Adapter caseSeeAlsoType(SeeAlsoType object) {
				return createSeeAlsoTypeAdapter();
			}
			@Override
			public Adapter caseSeeType(SeeType object) {
				return createSeeTypeAdapter();
			}
			@Override
			public Adapter caseSelfUriType(SelfUriType object) {
				return createSelfUriTypeAdapter();
			}
			@Override
			public Adapter caseSeriesTextType(SeriesTextType object) {
				return createSeriesTextTypeAdapter();
			}
			@Override
			public Adapter caseSeriesTitleType(SeriesTitleType object) {
				return createSeriesTitleTypeAdapter();
			}
			@Override
			public Adapter caseSeriesType(SeriesType object) {
				return createSeriesTypeAdapter();
			}
			@Override
			public Adapter caseSigBlockType(SigBlockType object) {
				return createSigBlockTypeAdapter();
			}
			@Override
			public Adapter caseSigType(SigType object) {
				return createSigTypeAdapter();
			}
			@Override
			public Adapter caseSizeType(SizeType object) {
				return createSizeTypeAdapter();
			}
			@Override
			public Adapter caseSourceType(SourceType object) {
				return createSourceTypeAdapter();
			}
			@Override
			public Adapter caseSpeakerType(SpeakerType object) {
				return createSpeakerTypeAdapter();
			}
			@Override
			public Adapter caseSpeechType(SpeechType object) {
				return createSpeechTypeAdapter();
			}
			@Override
			public Adapter caseStatementType(StatementType object) {
				return createStatementTypeAdapter();
			}
			@Override
			public Adapter caseStateType(StateType object) {
				return createStateTypeAdapter();
			}
			@Override
			public Adapter caseStdOrganizationType(StdOrganizationType object) {
				return createStdOrganizationTypeAdapter();
			}
			@Override
			public Adapter caseStdType(StdType object) {
				return createStdTypeAdapter();
			}
			@Override
			public Adapter caseStrikeType(StrikeType object) {
				return createStrikeTypeAdapter();
			}
			@Override
			public Adapter caseStringConfType(StringConfType object) {
				return createStringConfTypeAdapter();
			}
			@Override
			public Adapter caseStringDateType(StringDateType object) {
				return createStringDateTypeAdapter();
			}
			@Override
			public Adapter caseStringNameType(StringNameType object) {
				return createStringNameTypeAdapter();
			}
			@Override
			public Adapter caseStyledContentType(StyledContentType object) {
				return createStyledContentTypeAdapter();
			}
			@Override
			public Adapter caseSubArticleType(SubArticleType object) {
				return createSubArticleTypeAdapter();
			}
			@Override
			public Adapter caseSubjectType(SubjectType object) {
				return createSubjectTypeAdapter();
			}
			@Override
			public Adapter caseSubjGroupType(SubjGroupType object) {
				return createSubjGroupTypeAdapter();
			}
			@Override
			public Adapter caseSubtitleType(SubtitleType object) {
				return createSubtitleTypeAdapter();
			}
			@Override
			public Adapter caseSubType(SubType object) {
				return createSubTypeAdapter();
			}
			@Override
			public Adapter caseSuffixType(SuffixType object) {
				return createSuffixTypeAdapter();
			}
			@Override
			public Adapter caseSupplementaryMaterialType(SupplementaryMaterialType object) {
				return createSupplementaryMaterialTypeAdapter();
			}
			@Override
			public Adapter caseSupplementType(SupplementType object) {
				return createSupplementTypeAdapter();
			}
			@Override
			public Adapter caseSupportDescriptionType(SupportDescriptionType object) {
				return createSupportDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSupportGroupType(SupportGroupType object) {
				return createSupportGroupTypeAdapter();
			}
			@Override
			public Adapter caseSupportSourceType(SupportSourceType object) {
				return createSupportSourceTypeAdapter();
			}
			@Override
			public Adapter caseSupType(SupType object) {
				return createSupTypeAdapter();
			}
			@Override
			public Adapter caseSurnameType(SurnameType object) {
				return createSurnameTypeAdapter();
			}
			@Override
			public Adapter caseTableCountType(TableCountType object) {
				return createTableCountTypeAdapter();
			}
			@Override
			public Adapter caseTableType(TableType object) {
				return createTableTypeAdapter();
			}
			@Override
			public Adapter caseTableWrapFootType(TableWrapFootType object) {
				return createTableWrapFootTypeAdapter();
			}
			@Override
			public Adapter caseTableWrapGroupType(TableWrapGroupType object) {
				return createTableWrapGroupTypeAdapter();
			}
			@Override
			public Adapter caseTableWrapType(TableWrapType object) {
				return createTableWrapTypeAdapter();
			}
			@Override
			public Adapter caseTargetType(TargetType object) {
				return createTargetTypeAdapter();
			}
			@Override
			public Adapter caseTbodyType(TbodyType object) {
				return createTbodyTypeAdapter();
			}
			@Override
			public Adapter caseTdType(TdType object) {
				return createTdTypeAdapter();
			}
			@Override
			public Adapter caseTermHeadType(TermHeadType object) {
				return createTermHeadTypeAdapter();
			}
			@Override
			public Adapter caseTermType(TermType object) {
				return createTermTypeAdapter();
			}
			@Override
			public Adapter caseTexMathType(TexMathType object) {
				return createTexMathTypeAdapter();
			}
			@Override
			public Adapter caseTextualFormType(TextualFormType object) {
				return createTextualFormTypeAdapter();
			}
			@Override
			public Adapter caseTfootType(TfootType object) {
				return createTfootTypeAdapter();
			}
			@Override
			public Adapter caseTheadType(TheadType object) {
				return createTheadTypeAdapter();
			}
			@Override
			public Adapter caseThType(ThType object) {
				return createThTypeAdapter();
			}
			@Override
			public Adapter caseTimeStampType(TimeStampType object) {
				return createTimeStampTypeAdapter();
			}
			@Override
			public Adapter caseTitleGroupType(TitleGroupType object) {
				return createTitleGroupTypeAdapter();
			}
			@Override
			public Adapter caseTitleType(TitleType object) {
				return createTitleTypeAdapter();
			}
			@Override
			public Adapter caseTransAbstractType(TransAbstractType object) {
				return createTransAbstractTypeAdapter();
			}
			@Override
			public Adapter caseTransSourceType(TransSourceType object) {
				return createTransSourceTypeAdapter();
			}
			@Override
			public Adapter caseTransSubtitleType(TransSubtitleType object) {
				return createTransSubtitleTypeAdapter();
			}
			@Override
			public Adapter caseTransTitleGroupType(TransTitleGroupType object) {
				return createTransTitleGroupTypeAdapter();
			}
			@Override
			public Adapter caseTransTitleType(TransTitleType object) {
				return createTransTitleTypeAdapter();
			}
			@Override
			public Adapter caseTrType(TrType object) {
				return createTrTypeAdapter();
			}
			@Override
			public Adapter caseUnderlineEndType(UnderlineEndType object) {
				return createUnderlineEndTypeAdapter();
			}
			@Override
			public Adapter caseUnderlineStartType(UnderlineStartType object) {
				return createUnderlineStartTypeAdapter();
			}
			@Override
			public Adapter caseUnderlineType(UnderlineType object) {
				return createUnderlineTypeAdapter();
			}
			@Override
			public Adapter caseUnstructuredKwdGroupType(UnstructuredKwdGroupType object) {
				return createUnstructuredKwdGroupTypeAdapter();
			}
			@Override
			public Adapter caseUriType(UriType object) {
				return createUriTypeAdapter();
			}
			@Override
			public Adapter caseVerseGroupType(VerseGroupType object) {
				return createVerseGroupTypeAdapter();
			}
			@Override
			public Adapter caseVerseLineType(VerseLineType object) {
				return createVerseLineTypeAdapter();
			}
			@Override
			public Adapter caseVersionType(VersionType object) {
				return createVersionTypeAdapter();
			}
			@Override
			public Adapter caseVolumeIdType(VolumeIdType object) {
				return createVolumeIdTypeAdapter();
			}
			@Override
			public Adapter caseVolumeIssueGroupType(VolumeIssueGroupType object) {
				return createVolumeIssueGroupTypeAdapter();
			}
			@Override
			public Adapter caseVolumeSeriesType(VolumeSeriesType object) {
				return createVolumeSeriesTypeAdapter();
			}
			@Override
			public Adapter caseVolumeType(VolumeType object) {
				return createVolumeTypeAdapter();
			}
			@Override
			public Adapter caseWordCountType(WordCountType object) {
				return createWordCountTypeAdapter();
			}
			@Override
			public Adapter caseXrefType(XrefType object) {
				return createXrefTypeAdapter();
			}
			@Override
			public Adapter caseXType(XType object) {
				return createXTypeAdapter();
			}
			@Override
			public Adapter caseYearType(YearType object) {
				return createYearTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AbbrevJournalTitleType <em>Abbrev Journal Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AbbrevJournalTitleType
	 * @generated
	 */
	public Adapter createAbbrevJournalTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AbbrevType <em>Abbrev Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AbbrevType
	 * @generated
	 */
	public Adapter createAbbrevTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AbstractType
	 * @generated
	 */
	public Adapter createAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AccessDateType <em>Access Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AccessDateType
	 * @generated
	 */
	public Adapter createAccessDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AckType <em>Ack Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AckType
	 * @generated
	 */
	public Adapter createAckTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AddrLineType <em>Addr Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AddrLineType
	 * @generated
	 */
	public Adapter createAddrLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AffAlternativesType <em>Aff Alternatives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AffAlternativesType
	 * @generated
	 */
	public Adapter createAffAlternativesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AffType <em>Aff Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AffType
	 * @generated
	 */
	public Adapter createAffTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AlternativesType <em>Alternatives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AlternativesType
	 * @generated
	 */
	public Adapter createAlternativesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AltTextType <em>Alt Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AltTextType
	 * @generated
	 */
	public Adapter createAltTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AltTitleType <em>Alt Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AltTitleType
	 * @generated
	 */
	public Adapter createAltTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AnnotationType
	 * @generated
	 */
	public Adapter createAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AnonymousType <em>Anonymous Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AnonymousType
	 * @generated
	 */
	public Adapter createAnonymousTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AppGroupType <em>App Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AppGroupType
	 * @generated
	 */
	public Adapter createAppGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AppType <em>App Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AppType
	 * @generated
	 */
	public Adapter createAppTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ArticleCategoriesType <em>Article Categories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ArticleCategoriesType
	 * @generated
	 */
	public Adapter createArticleCategoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ArticleIdType <em>Article Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ArticleIdType
	 * @generated
	 */
	public Adapter createArticleIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType <em>Article Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ArticleMetaType
	 * @generated
	 */
	public Adapter createArticleMetaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ArticleTitleType <em>Article Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ArticleTitleType
	 * @generated
	 */
	public Adapter createArticleTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ArticleType <em>Article Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ArticleType
	 * @generated
	 */
	public Adapter createArticleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ArticleVersionAlternativesType <em>Article Version Alternatives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ArticleVersionAlternativesType
	 * @generated
	 */
	public Adapter createArticleVersionAlternativesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ArticleVersionType <em>Article Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ArticleVersionType
	 * @generated
	 */
	public Adapter createArticleVersionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AttribType <em>Attrib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AttribType
	 * @generated
	 */
	public Adapter createAttribTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AuthorCommentType <em>Author Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AuthorCommentType
	 * @generated
	 */
	public Adapter createAuthorCommentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AuthorNotesType <em>Author Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AuthorNotesType
	 * @generated
	 */
	public Adapter createAuthorNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AwardGroupType <em>Award Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AwardGroupType
	 * @generated
	 */
	public Adapter createAwardGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.AwardIdType <em>Award Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.AwardIdType
	 * @generated
	 */
	public Adapter createAwardIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.BackType <em>Back Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.BackType
	 * @generated
	 */
	public Adapter createBackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.BioType <em>Bio Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.BioType
	 * @generated
	 */
	public Adapter createBioTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.BodyType
	 * @generated
	 */
	public Adapter createBodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.BoldType <em>Bold Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.BoldType
	 * @generated
	 */
	public Adapter createBoldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.BoxedTextType <em>Boxed Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.BoxedTextType
	 * @generated
	 */
	public Adapter createBoxedTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.BreakType <em>Break Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.BreakType
	 * @generated
	 */
	public Adapter createBreakTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CaptionType
	 * @generated
	 */
	public Adapter createCaptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ChapterTitleType <em>Chapter Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ChapterTitleType
	 * @generated
	 */
	public Adapter createChapterTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ChemStructType <em>Chem Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ChemStructType
	 * @generated
	 */
	public Adapter createChemStructTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ChemStructWrapType <em>Chem Struct Wrap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ChemStructWrapType
	 * @generated
	 */
	public Adapter createChemStructWrapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CitationAlternativesType <em>Citation Alternatives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CitationAlternativesType
	 * @generated
	 */
	public Adapter createCitationAlternativesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CityType <em>City Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CityType
	 * @generated
	 */
	public Adapter createCityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CodeType
	 * @generated
	 */
	public Adapter createCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ColgroupType <em>Colgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ColgroupType
	 * @generated
	 */
	public Adapter createColgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CollabAlternativesType <em>Collab Alternatives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CollabAlternativesType
	 * @generated
	 */
	public Adapter createCollabAlternativesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CollabType <em>Collab Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CollabType
	 * @generated
	 */
	public Adapter createCollabTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ColType <em>Col Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ColType
	 * @generated
	 */
	public Adapter createColTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CommentType
	 * @generated
	 */
	public Adapter createCommentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CompoundKwdPartType <em>Compound Kwd Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CompoundKwdPartType
	 * @generated
	 */
	public Adapter createCompoundKwdPartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType <em>Compound Kwd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CompoundKwdType
	 * @generated
	 */
	public Adapter createCompoundKwdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CompoundSubjectPartType <em>Compound Subject Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CompoundSubjectPartType
	 * @generated
	 */
	public Adapter createCompoundSubjectPartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CompoundSubjectType <em>Compound Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CompoundSubjectType
	 * @generated
	 */
	public Adapter createCompoundSubjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ConfAcronymType <em>Conf Acronym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ConfAcronymType
	 * @generated
	 */
	public Adapter createConfAcronymTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ConfDateType <em>Conf Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ConfDateType
	 * @generated
	 */
	public Adapter createConfDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ConferenceType <em>Conference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ConferenceType
	 * @generated
	 */
	public Adapter createConferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ConfLocType <em>Conf Loc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ConfLocType
	 * @generated
	 */
	public Adapter createConfLocTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ConfNameType <em>Conf Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ConfNameType
	 * @generated
	 */
	public Adapter createConfNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ConfNumType <em>Conf Num Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ConfNumType
	 * @generated
	 */
	public Adapter createConfNumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ConfSponsorType <em>Conf Sponsor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ConfSponsorType
	 * @generated
	 */
	public Adapter createConfSponsorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ConfThemeType <em>Conf Theme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ConfThemeType
	 * @generated
	 */
	public Adapter createConfThemeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ContribGroupType <em>Contrib Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ContribGroupType
	 * @generated
	 */
	public Adapter createContribGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ContribIdType <em>Contrib Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ContribIdType
	 * @generated
	 */
	public Adapter createContribIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ContribType <em>Contrib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ContribType
	 * @generated
	 */
	public Adapter createContribTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ContributedResourceGroupType <em>Contributed Resource Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ContributedResourceGroupType
	 * @generated
	 */
	public Adapter createContributedResourceGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CopyrightHolderType <em>Copyright Holder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CopyrightHolderType
	 * @generated
	 */
	public Adapter createCopyrightHolderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CopyrightStatementType <em>Copyright Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CopyrightStatementType
	 * @generated
	 */
	public Adapter createCopyrightStatementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CopyrightYearType <em>Copyright Year Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CopyrightYearType
	 * @generated
	 */
	public Adapter createCopyrightYearTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CorrespType <em>Corresp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CorrespType
	 * @generated
	 */
	public Adapter createCorrespTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CountryType <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CountryType
	 * @generated
	 */
	public Adapter createCountryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CountsType <em>Counts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CountsType
	 * @generated
	 */
	public Adapter createCountsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CountType <em>Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CountType
	 * @generated
	 */
	public Adapter createCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CustomMetaGroupType <em>Custom Meta Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CustomMetaGroupType
	 * @generated
	 */
	public Adapter createCustomMetaGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.CustomMetaType <em>Custom Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.CustomMetaType
	 * @generated
	 */
	public Adapter createCustomMetaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DataTitleType <em>Data Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DataTitleType
	 * @generated
	 */
	public Adapter createDataTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DateInCitationType <em>Date In Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DateInCitationType
	 * @generated
	 */
	public Adapter createDateInCitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DayType
	 * @generated
	 */
	public Adapter createDayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DefHeadType <em>Def Head Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DefHeadType
	 * @generated
	 */
	public Adapter createDefHeadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DefItemType <em>Def Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DefItemType
	 * @generated
	 */
	public Adapter createDefItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DefListType <em>Def List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DefListType
	 * @generated
	 */
	public Adapter createDefListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DefType <em>Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DefType
	 * @generated
	 */
	public Adapter createDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DegreesType <em>Degrees Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DegreesType
	 * @generated
	 */
	public Adapter createDegreesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DispFormulaGroupType <em>Disp Formula Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DispFormulaGroupType
	 * @generated
	 */
	public Adapter createDispFormulaGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DispFormulaType <em>Disp Formula Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DispFormulaType
	 * @generated
	 */
	public Adapter createDispFormulaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DispQuoteType <em>Disp Quote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DispQuoteType
	 * @generated
	 */
	public Adapter createDispQuoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.EditionType <em>Edition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.EditionType
	 * @generated
	 */
	public Adapter createEditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ElementCitationType <em>Element Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ElementCitationType
	 * @generated
	 */
	public Adapter createElementCitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ElocationIdType <em>Elocation Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ElocationIdType
	 * @generated
	 */
	public Adapter createElocationIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.EmailType <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.EmailType
	 * @generated
	 */
	public Adapter createEmailTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.EquationCountType <em>Equation Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.EquationCountType
	 * @generated
	 */
	public Adapter createEquationCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.EraType <em>Era Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.EraType
	 * @generated
	 */
	public Adapter createEraTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.EtalType <em>Etal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.EtalType
	 * @generated
	 */
	public Adapter createEtalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.EventDescType <em>Event Desc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.EventDescType
	 * @generated
	 */
	public Adapter createEventDescTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.EventType
	 * @generated
	 */
	public Adapter createEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ExtLinkType <em>Ext Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ExtLinkType
	 * @generated
	 */
	public Adapter createExtLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FaxType <em>Fax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FaxType
	 * @generated
	 */
	public Adapter createFaxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FigCountType <em>Fig Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FigCountType
	 * @generated
	 */
	public Adapter createFigCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FigGroupType <em>Fig Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FigGroupType
	 * @generated
	 */
	public Adapter createFigGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FigType <em>Fig Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FigType
	 * @generated
	 */
	public Adapter createFigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FixedCaseType <em>Fixed Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FixedCaseType
	 * @generated
	 */
	public Adapter createFixedCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FloatsGroupType <em>Floats Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FloatsGroupType
	 * @generated
	 */
	public Adapter createFloatsGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FnGroupType <em>Fn Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FnGroupType
	 * @generated
	 */
	public Adapter createFnGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FnType <em>Fn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FnType
	 * @generated
	 */
	public Adapter createFnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FpageType <em>Fpage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FpageType
	 * @generated
	 */
	public Adapter createFpageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FrontStubType <em>Front Stub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FrontStubType
	 * @generated
	 */
	public Adapter createFrontStubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FrontType <em>Front Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FrontType
	 * @generated
	 */
	public Adapter createFrontTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FundingGroupType <em>Funding Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FundingGroupType
	 * @generated
	 */
	public Adapter createFundingGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FundingSourceType <em>Funding Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FundingSourceType
	 * @generated
	 */
	public Adapter createFundingSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.FundingStatementType <em>Funding Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.FundingStatementType
	 * @generated
	 */
	public Adapter createFundingStatementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.GivenNamesType <em>Given Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.GivenNamesType
	 * @generated
	 */
	public Adapter createGivenNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.GlossaryType <em>Glossary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.GlossaryType
	 * @generated
	 */
	public Adapter createGlossaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType <em>Glyph Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.GlyphDataType
	 * @generated
	 */
	public Adapter createGlyphDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.GlyphRefType <em>Glyph Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.GlyphRefType
	 * @generated
	 */
	public Adapter createGlyphRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.GovType <em>Gov Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.GovType
	 * @generated
	 */
	public Adapter createGovTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.GraphicType <em>Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.GraphicType
	 * @generated
	 */
	public Adapter createGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.HistoryType <em>History Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.HistoryType
	 * @generated
	 */
	public Adapter createHistoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.HrType <em>Hr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.HrType
	 * @generated
	 */
	public Adapter createHrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.IndexTermRangeEndType <em>Index Term Range End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.IndexTermRangeEndType
	 * @generated
	 */
	public Adapter createIndexTermRangeEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.IndexTermType <em>Index Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.IndexTermType
	 * @generated
	 */
	public Adapter createIndexTermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.InlineFormulaType <em>Inline Formula Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.InlineFormulaType
	 * @generated
	 */
	public Adapter createInlineFormulaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.InlineGraphicType <em>Inline Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.InlineGraphicType
	 * @generated
	 */
	public Adapter createInlineGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.InlineMediaType <em>Inline Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.InlineMediaType
	 * @generated
	 */
	public Adapter createInlineMediaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.InlineSupplementaryMaterialType <em>Inline Supplementary Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.InlineSupplementaryMaterialType
	 * @generated
	 */
	public Adapter createInlineSupplementaryMaterialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.InstitutionIdType <em>Institution Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.InstitutionIdType
	 * @generated
	 */
	public Adapter createInstitutionIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.InstitutionType <em>Institution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.InstitutionType
	 * @generated
	 */
	public Adapter createInstitutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.InstitutionWrapType <em>Institution Wrap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.InstitutionWrapType
	 * @generated
	 */
	public Adapter createInstitutionWrapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.IsbnType <em>Isbn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.IsbnType
	 * @generated
	 */
	public Adapter createIsbnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.IssnLType <em>Issn LType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.IssnLType
	 * @generated
	 */
	public Adapter createIssnLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.IssnType <em>Issn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.IssnType
	 * @generated
	 */
	public Adapter createIssnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.IssueIdType <em>Issue Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.IssueIdType
	 * @generated
	 */
	public Adapter createIssueIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.IssuePartType <em>Issue Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.IssuePartType
	 * @generated
	 */
	public Adapter createIssuePartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.IssueSponsorType <em>Issue Sponsor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.IssueSponsorType
	 * @generated
	 */
	public Adapter createIssueSponsorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.IssueTitleType <em>Issue Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.IssueTitleType
	 * @generated
	 */
	public Adapter createIssueTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.IssueType
	 * @generated
	 */
	public Adapter createIssueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ItalicType <em>Italic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ItalicType
	 * @generated
	 */
	public Adapter createItalicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.JournalIdType <em>Journal Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.JournalIdType
	 * @generated
	 */
	public Adapter createJournalIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.JournalMetaType <em>Journal Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.JournalMetaType
	 * @generated
	 */
	public Adapter createJournalMetaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.JournalSubtitleType <em>Journal Subtitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.JournalSubtitleType
	 * @generated
	 */
	public Adapter createJournalSubtitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.JournalTitleGroupType <em>Journal Title Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.JournalTitleGroupType
	 * @generated
	 */
	public Adapter createJournalTitleGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.JournalTitleType <em>Journal Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.JournalTitleType
	 * @generated
	 */
	public Adapter createJournalTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.KwdGroupType <em>Kwd Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.KwdGroupType
	 * @generated
	 */
	public Adapter createKwdGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.KwdType <em>Kwd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.KwdType
	 * @generated
	 */
	public Adapter createKwdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.LicensePType <em>License PType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.LicensePType
	 * @generated
	 */
	public Adapter createLicensePTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.LicenseType <em>License Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.LicenseType
	 * @generated
	 */
	public Adapter createLicenseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ListItemType <em>List Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ListItemType
	 * @generated
	 */
	public Adapter createListItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.LongDescType <em>Long Desc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.LongDescType
	 * @generated
	 */
	public Adapter createLongDescTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.LpageType <em>Lpage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.LpageType
	 * @generated
	 */
	public Adapter createLpageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.MediaType
	 * @generated
	 */
	public Adapter createMediaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.MetaNameType <em>Meta Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.MetaNameType
	 * @generated
	 */
	public Adapter createMetaNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.MetaValueType <em>Meta Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.MetaValueType
	 * @generated
	 */
	public Adapter createMetaValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.MilestoneEndType <em>Milestone End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.MilestoneEndType
	 * @generated
	 */
	public Adapter createMilestoneEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.MilestoneStartType <em>Milestone Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.MilestoneStartType
	 * @generated
	 */
	public Adapter createMilestoneStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType <em>Mixed Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.MixedCitationType
	 * @generated
	 */
	public Adapter createMixedCitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.MonospaceType <em>Monospace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.MonospaceType
	 * @generated
	 */
	public Adapter createMonospaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.MonthType <em>Month Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.MonthType
	 * @generated
	 */
	public Adapter createMonthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.NameAlternativesType <em>Name Alternatives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.NameAlternativesType
	 * @generated
	 */
	public Adapter createNameAlternativesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.NamedContentType <em>Named Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.NamedContentType
	 * @generated
	 */
	public Adapter createNamedContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.NameType
	 * @generated
	 */
	public Adapter createNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.NestedKwdType <em>Nested Kwd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.NestedKwdType
	 * @generated
	 */
	public Adapter createNestedKwdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType <em>Nlm Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.NlmCitationType
	 * @generated
	 */
	public Adapter createNlmCitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.NotesType <em>Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.NotesType
	 * @generated
	 */
	public Adapter createNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ObjectIdType <em>Object Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ObjectIdType
	 * @generated
	 */
	public Adapter createObjectIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.OnBehalfOfType <em>On Behalf Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.OnBehalfOfType
	 * @generated
	 */
	public Adapter createOnBehalfOfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.OpenAccessType <em>Open Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.OpenAccessType
	 * @generated
	 */
	public Adapter createOpenAccessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.OverlineEndType <em>Overline End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.OverlineEndType
	 * @generated
	 */
	public Adapter createOverlineEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.OverlineStartType <em>Overline Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.OverlineStartType
	 * @generated
	 */
	public Adapter createOverlineStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.OverlineType <em>Overline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.OverlineType
	 * @generated
	 */
	public Adapter createOverlineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PageCountType <em>Page Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PageCountType
	 * @generated
	 */
	public Adapter createPageCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PageRangeType <em>Page Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PageRangeType
	 * @generated
	 */
	public Adapter createPageRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PartTitleType <em>Part Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PartTitleType
	 * @generated
	 */
	public Adapter createPartTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PatentType <em>Patent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PatentType
	 * @generated
	 */
	public Adapter createPatentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PermissionsType <em>Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PermissionsType
	 * @generated
	 */
	public Adapter createPermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PersonGroupType <em>Person Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PersonGroupType
	 * @generated
	 */
	public Adapter createPersonGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PhoneType
	 * @generated
	 */
	public Adapter createPhoneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PostalCodeType <em>Postal Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PostalCodeType
	 * @generated
	 */
	public Adapter createPostalCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PrefixType <em>Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PrefixType
	 * @generated
	 */
	public Adapter createPrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PreformatType <em>Preformat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PreformatType
	 * @generated
	 */
	public Adapter createPreformatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PriceType <em>Price Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PriceType
	 * @generated
	 */
	public Adapter createPriceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PrincipalAwardRecipientType <em>Principal Award Recipient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PrincipalAwardRecipientType
	 * @generated
	 */
	public Adapter createPrincipalAwardRecipientTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PrincipalInvestigatorType <em>Principal Investigator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PrincipalInvestigatorType
	 * @generated
	 */
	public Adapter createPrincipalInvestigatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PrivateCharType <em>Private Char Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PrivateCharType
	 * @generated
	 */
	public Adapter createPrivateCharTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ProductType
	 * @generated
	 */
	public Adapter createProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PType
	 * @generated
	 */
	public Adapter createPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PubDateNotAvailableType <em>Pub Date Not Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PubDateNotAvailableType
	 * @generated
	 */
	public Adapter createPubDateNotAvailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PubDateType <em>Pub Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PubDateType
	 * @generated
	 */
	public Adapter createPubDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PubHistoryType <em>Pub History Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PubHistoryType
	 * @generated
	 */
	public Adapter createPubHistoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PubIdType <em>Pub Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PubIdType
	 * @generated
	 */
	public Adapter createPubIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PublisherLocType <em>Publisher Loc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PublisherLocType
	 * @generated
	 */
	public Adapter createPublisherLocTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PublisherNameType <em>Publisher Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PublisherNameType
	 * @generated
	 */
	public Adapter createPublisherNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.PublisherType <em>Publisher Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.PublisherType
	 * @generated
	 */
	public Adapter createPublisherTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RbType <em>Rb Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RbType
	 * @generated
	 */
	public Adapter createRbTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RefCountType <em>Ref Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RefCountType
	 * @generated
	 */
	public Adapter createRefCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RefListType <em>Ref List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RefListType
	 * @generated
	 */
	public Adapter createRefListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RefType
	 * @generated
	 */
	public Adapter createRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RelatedArticleType <em>Related Article Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RelatedArticleType
	 * @generated
	 */
	public Adapter createRelatedArticleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType <em>Related Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RelatedObjectType
	 * @generated
	 */
	public Adapter createRelatedObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ResourceGroupType <em>Resource Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ResourceGroupType
	 * @generated
	 */
	public Adapter createResourceGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ResourceIdType <em>Resource Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ResourceIdType
	 * @generated
	 */
	public Adapter createResourceIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ResourceNameType <em>Resource Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ResourceNameType
	 * @generated
	 */
	public Adapter createResourceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ResourceWrapType <em>Resource Wrap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ResourceWrapType
	 * @generated
	 */
	public Adapter createResourceWrapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ResponseType
	 * @generated
	 */
	public Adapter createResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RoleType
	 * @generated
	 */
	public Adapter createRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RomanType <em>Roman Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RomanType
	 * @generated
	 */
	public Adapter createRomanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RpType <em>Rp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RpType
	 * @generated
	 */
	public Adapter createRpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RtType <em>Rt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RtType
	 * @generated
	 */
	public Adapter createRtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.RubyType <em>Ruby Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.RubyType
	 * @generated
	 */
	public Adapter createRubyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SansSerifType <em>Sans Serif Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SansSerifType
	 * @generated
	 */
	public Adapter createSansSerifTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ScType <em>Sc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ScType
	 * @generated
	 */
	public Adapter createScTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SeasonType <em>Season Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SeasonType
	 * @generated
	 */
	public Adapter createSeasonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SecMetaType <em>Sec Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SecMetaType
	 * @generated
	 */
	public Adapter createSecMetaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SecType <em>Sec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SecType
	 * @generated
	 */
	public Adapter createSecTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SeeAlsoType <em>See Also Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SeeAlsoType
	 * @generated
	 */
	public Adapter createSeeAlsoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SeeType <em>See Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SeeType
	 * @generated
	 */
	public Adapter createSeeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SelfUriType <em>Self Uri Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SelfUriType
	 * @generated
	 */
	public Adapter createSelfUriTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SeriesTextType <em>Series Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SeriesTextType
	 * @generated
	 */
	public Adapter createSeriesTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SeriesTitleType <em>Series Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SeriesTitleType
	 * @generated
	 */
	public Adapter createSeriesTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SeriesType <em>Series Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SeriesType
	 * @generated
	 */
	public Adapter createSeriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SigBlockType <em>Sig Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SigBlockType
	 * @generated
	 */
	public Adapter createSigBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SigType <em>Sig Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SigType
	 * @generated
	 */
	public Adapter createSigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SizeType <em>Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SizeType
	 * @generated
	 */
	public Adapter createSizeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SourceType
	 * @generated
	 */
	public Adapter createSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SpeakerType <em>Speaker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SpeakerType
	 * @generated
	 */
	public Adapter createSpeakerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SpeechType <em>Speech Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SpeechType
	 * @generated
	 */
	public Adapter createSpeechTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.StatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.StatementType
	 * @generated
	 */
	public Adapter createStatementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.StateType
	 * @generated
	 */
	public Adapter createStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.StdOrganizationType <em>Std Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.StdOrganizationType
	 * @generated
	 */
	public Adapter createStdOrganizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.StdType <em>Std Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.StdType
	 * @generated
	 */
	public Adapter createStdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.StrikeType <em>Strike Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.StrikeType
	 * @generated
	 */
	public Adapter createStrikeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.StringConfType <em>String Conf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.StringConfType
	 * @generated
	 */
	public Adapter createStringConfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.StringDateType <em>String Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.StringDateType
	 * @generated
	 */
	public Adapter createStringDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.StringNameType <em>String Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.StringNameType
	 * @generated
	 */
	public Adapter createStringNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.StyledContentType <em>Styled Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.StyledContentType
	 * @generated
	 */
	public Adapter createStyledContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SubArticleType <em>Sub Article Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SubArticleType
	 * @generated
	 */
	public Adapter createSubArticleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SubjectType <em>Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SubjectType
	 * @generated
	 */
	public Adapter createSubjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SubjGroupType <em>Subj Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SubjGroupType
	 * @generated
	 */
	public Adapter createSubjGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SubtitleType <em>Subtitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SubtitleType
	 * @generated
	 */
	public Adapter createSubtitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SubType
	 * @generated
	 */
	public Adapter createSubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SuffixType <em>Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SuffixType
	 * @generated
	 */
	public Adapter createSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SupplementaryMaterialType <em>Supplementary Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SupplementaryMaterialType
	 * @generated
	 */
	public Adapter createSupplementaryMaterialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SupplementType <em>Supplement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SupplementType
	 * @generated
	 */
	public Adapter createSupplementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SupportDescriptionType <em>Support Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SupportDescriptionType
	 * @generated
	 */
	public Adapter createSupportDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SupportGroupType <em>Support Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SupportGroupType
	 * @generated
	 */
	public Adapter createSupportGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SupportSourceType <em>Support Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SupportSourceType
	 * @generated
	 */
	public Adapter createSupportSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SupType <em>Sup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SupType
	 * @generated
	 */
	public Adapter createSupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.SurnameType <em>Surname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.SurnameType
	 * @generated
	 */
	public Adapter createSurnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TableCountType <em>Table Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TableCountType
	 * @generated
	 */
	public Adapter createTableCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TableType
	 * @generated
	 */
	public Adapter createTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TableWrapFootType <em>Table Wrap Foot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TableWrapFootType
	 * @generated
	 */
	public Adapter createTableWrapFootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TableWrapGroupType <em>Table Wrap Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TableWrapGroupType
	 * @generated
	 */
	public Adapter createTableWrapGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TableWrapType <em>Table Wrap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TableWrapType
	 * @generated
	 */
	public Adapter createTableWrapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TargetType
	 * @generated
	 */
	public Adapter createTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TbodyType <em>Tbody Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TbodyType
	 * @generated
	 */
	public Adapter createTbodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TdType <em>Td Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TdType
	 * @generated
	 */
	public Adapter createTdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TermHeadType <em>Term Head Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TermHeadType
	 * @generated
	 */
	public Adapter createTermHeadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TermType
	 * @generated
	 */
	public Adapter createTermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TexMathType <em>Tex Math Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TexMathType
	 * @generated
	 */
	public Adapter createTexMathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TextualFormType <em>Textual Form Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TextualFormType
	 * @generated
	 */
	public Adapter createTextualFormTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TfootType <em>Tfoot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TfootType
	 * @generated
	 */
	public Adapter createTfootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TheadType <em>Thead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TheadType
	 * @generated
	 */
	public Adapter createTheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.ThType <em>Th Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.ThType
	 * @generated
	 */
	public Adapter createThTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TimeStampType <em>Time Stamp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TimeStampType
	 * @generated
	 */
	public Adapter createTimeStampTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TitleGroupType <em>Title Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TitleGroupType
	 * @generated
	 */
	public Adapter createTitleGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TitleType
	 * @generated
	 */
	public Adapter createTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TransAbstractType <em>Trans Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TransAbstractType
	 * @generated
	 */
	public Adapter createTransAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TransSourceType <em>Trans Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TransSourceType
	 * @generated
	 */
	public Adapter createTransSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TransSubtitleType <em>Trans Subtitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TransSubtitleType
	 * @generated
	 */
	public Adapter createTransSubtitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TransTitleGroupType <em>Trans Title Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TransTitleGroupType
	 * @generated
	 */
	public Adapter createTransTitleGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TransTitleType <em>Trans Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TransTitleType
	 * @generated
	 */
	public Adapter createTransTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.TrType <em>Tr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.TrType
	 * @generated
	 */
	public Adapter createTrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.UnderlineEndType <em>Underline End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.UnderlineEndType
	 * @generated
	 */
	public Adapter createUnderlineEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.UnderlineStartType <em>Underline Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.UnderlineStartType
	 * @generated
	 */
	public Adapter createUnderlineStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.UnderlineType <em>Underline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.UnderlineType
	 * @generated
	 */
	public Adapter createUnderlineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.UnstructuredKwdGroupType <em>Unstructured Kwd Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.UnstructuredKwdGroupType
	 * @generated
	 */
	public Adapter createUnstructuredKwdGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.UriType <em>Uri Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.UriType
	 * @generated
	 */
	public Adapter createUriTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.VerseGroupType <em>Verse Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.VerseGroupType
	 * @generated
	 */
	public Adapter createVerseGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.VerseLineType <em>Verse Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.VerseLineType
	 * @generated
	 */
	public Adapter createVerseLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.VersionType
	 * @generated
	 */
	public Adapter createVersionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.VolumeIdType <em>Volume Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.VolumeIdType
	 * @generated
	 */
	public Adapter createVolumeIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.VolumeIssueGroupType <em>Volume Issue Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.VolumeIssueGroupType
	 * @generated
	 */
	public Adapter createVolumeIssueGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.VolumeSeriesType <em>Volume Series Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.VolumeSeriesType
	 * @generated
	 */
	public Adapter createVolumeSeriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.VolumeType <em>Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.VolumeType
	 * @generated
	 */
	public Adapter createVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.WordCountType <em>Word Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.WordCountType
	 * @generated
	 */
	public Adapter createWordCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.XrefType <em>Xref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.XrefType
	 * @generated
	 */
	public Adapter createXrefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.XType <em>XType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.XType
	 * @generated
	 */
	public Adapter createXTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nih.nlm.ncbi.jats1.YearType <em>Year Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nih.nlm.ncbi.jats1.YearType
	 * @generated
	 */
	public Adapter createYearTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Jats1AdapterFactory
