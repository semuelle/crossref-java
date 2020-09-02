/**
 */
package gov.nih.nlm.ncbi.jats1.util;

import gov.nih.nlm.ncbi.jats1.*;

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
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package
 * @generated
 */
public class Jats1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Jats1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jats1Switch() {
		if (modelPackage == null) {
			modelPackage = Jats1Package.eINSTANCE;
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
			case Jats1Package.ABBREV_JOURNAL_TITLE_TYPE: {
				AbbrevJournalTitleType abbrevJournalTitleType = (AbbrevJournalTitleType)theEObject;
				T result = caseAbbrevJournalTitleType(abbrevJournalTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ABBREV_TYPE: {
				AbbrevType abbrevType = (AbbrevType)theEObject;
				T result = caseAbbrevType(abbrevType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ABSTRACT_TYPE: {
				AbstractType abstractType = (AbstractType)theEObject;
				T result = caseAbstractType(abstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ACCESS_DATE_TYPE: {
				AccessDateType accessDateType = (AccessDateType)theEObject;
				T result = caseAccessDateType(accessDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ACK_TYPE: {
				AckType ackType = (AckType)theEObject;
				T result = caseAckType(ackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ADDR_LINE_TYPE: {
				AddrLineType addrLineType = (AddrLineType)theEObject;
				T result = caseAddrLineType(addrLineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.AFF_ALTERNATIVES_TYPE: {
				AffAlternativesType affAlternativesType = (AffAlternativesType)theEObject;
				T result = caseAffAlternativesType(affAlternativesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.AFF_TYPE: {
				AffType affType = (AffType)theEObject;
				T result = caseAffType(affType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ALTERNATIVES_TYPE: {
				AlternativesType alternativesType = (AlternativesType)theEObject;
				T result = caseAlternativesType(alternativesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ALT_TEXT_TYPE: {
				AltTextType altTextType = (AltTextType)theEObject;
				T result = caseAltTextType(altTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ALT_TITLE_TYPE: {
				AltTitleType altTitleType = (AltTitleType)theEObject;
				T result = caseAltTitleType(altTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ANNOTATION_TYPE: {
				AnnotationType annotationType = (AnnotationType)theEObject;
				T result = caseAnnotationType(annotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ANONYMOUS_TYPE: {
				AnonymousType anonymousType = (AnonymousType)theEObject;
				T result = caseAnonymousType(anonymousType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.APP_GROUP_TYPE: {
				AppGroupType appGroupType = (AppGroupType)theEObject;
				T result = caseAppGroupType(appGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.APP_TYPE: {
				AppType appType = (AppType)theEObject;
				T result = caseAppType(appType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ARRAY_TYPE: {
				ArrayType arrayType = (ArrayType)theEObject;
				T result = caseArrayType(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ARTICLE_CATEGORIES_TYPE: {
				ArticleCategoriesType articleCategoriesType = (ArticleCategoriesType)theEObject;
				T result = caseArticleCategoriesType(articleCategoriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ARTICLE_ID_TYPE: {
				ArticleIdType articleIdType = (ArticleIdType)theEObject;
				T result = caseArticleIdType(articleIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ARTICLE_META_TYPE: {
				ArticleMetaType articleMetaType = (ArticleMetaType)theEObject;
				T result = caseArticleMetaType(articleMetaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ARTICLE_TITLE_TYPE: {
				ArticleTitleType articleTitleType = (ArticleTitleType)theEObject;
				T result = caseArticleTitleType(articleTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ARTICLE_TYPE: {
				ArticleType articleType = (ArticleType)theEObject;
				T result = caseArticleType(articleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE: {
				ArticleVersionAlternativesType articleVersionAlternativesType = (ArticleVersionAlternativesType)theEObject;
				T result = caseArticleVersionAlternativesType(articleVersionAlternativesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ARTICLE_VERSION_TYPE: {
				ArticleVersionType articleVersionType = (ArticleVersionType)theEObject;
				T result = caseArticleVersionType(articleVersionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ATTRIB_TYPE: {
				AttribType attribType = (AttribType)theEObject;
				T result = caseAttribType(attribType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.AUTHOR_COMMENT_TYPE: {
				AuthorCommentType authorCommentType = (AuthorCommentType)theEObject;
				T result = caseAuthorCommentType(authorCommentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.AUTHOR_NOTES_TYPE: {
				AuthorNotesType authorNotesType = (AuthorNotesType)theEObject;
				T result = caseAuthorNotesType(authorNotesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.AWARD_GROUP_TYPE: {
				AwardGroupType awardGroupType = (AwardGroupType)theEObject;
				T result = caseAwardGroupType(awardGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.AWARD_ID_TYPE: {
				AwardIdType awardIdType = (AwardIdType)theEObject;
				T result = caseAwardIdType(awardIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.BACK_TYPE: {
				BackType backType = (BackType)theEObject;
				T result = caseBackType(backType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.BIO_TYPE: {
				BioType bioType = (BioType)theEObject;
				T result = caseBioType(bioType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.BODY_TYPE: {
				BodyType bodyType = (BodyType)theEObject;
				T result = caseBodyType(bodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.BOLD_TYPE: {
				BoldType boldType = (BoldType)theEObject;
				T result = caseBoldType(boldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.BOXED_TEXT_TYPE: {
				BoxedTextType boxedTextType = (BoxedTextType)theEObject;
				T result = caseBoxedTextType(boxedTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.BREAK_TYPE: {
				BreakType breakType = (BreakType)theEObject;
				T result = caseBreakType(breakType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CAPTION_TYPE: {
				CaptionType captionType = (CaptionType)theEObject;
				T result = caseCaptionType(captionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CHAPTER_TITLE_TYPE: {
				ChapterTitleType chapterTitleType = (ChapterTitleType)theEObject;
				T result = caseChapterTitleType(chapterTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CHEM_STRUCT_TYPE: {
				ChemStructType chemStructType = (ChemStructType)theEObject;
				T result = caseChemStructType(chemStructType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE: {
				ChemStructWrapType chemStructWrapType = (ChemStructWrapType)theEObject;
				T result = caseChemStructWrapType(chemStructWrapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CITATION_ALTERNATIVES_TYPE: {
				CitationAlternativesType citationAlternativesType = (CitationAlternativesType)theEObject;
				T result = caseCitationAlternativesType(citationAlternativesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CITY_TYPE: {
				CityType cityType = (CityType)theEObject;
				T result = caseCityType(cityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CODE_TYPE: {
				CodeType codeType = (CodeType)theEObject;
				T result = caseCodeType(codeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COLGROUP_TYPE: {
				ColgroupType colgroupType = (ColgroupType)theEObject;
				T result = caseColgroupType(colgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COLLAB_ALTERNATIVES_TYPE: {
				CollabAlternativesType collabAlternativesType = (CollabAlternativesType)theEObject;
				T result = caseCollabAlternativesType(collabAlternativesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COLLAB_TYPE: {
				CollabType collabType = (CollabType)theEObject;
				T result = caseCollabType(collabType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COL_TYPE: {
				ColType colType = (ColType)theEObject;
				T result = caseColType(colType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COMMENT_TYPE: {
				CommentType commentType = (CommentType)theEObject;
				T result = caseCommentType(commentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COMPOUND_KWD_PART_TYPE: {
				CompoundKwdPartType compoundKwdPartType = (CompoundKwdPartType)theEObject;
				T result = caseCompoundKwdPartType(compoundKwdPartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COMPOUND_KWD_TYPE: {
				CompoundKwdType compoundKwdType = (CompoundKwdType)theEObject;
				T result = caseCompoundKwdType(compoundKwdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COMPOUND_SUBJECT_PART_TYPE: {
				CompoundSubjectPartType compoundSubjectPartType = (CompoundSubjectPartType)theEObject;
				T result = caseCompoundSubjectPartType(compoundSubjectPartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COMPOUND_SUBJECT_TYPE: {
				CompoundSubjectType compoundSubjectType = (CompoundSubjectType)theEObject;
				T result = caseCompoundSubjectType(compoundSubjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONF_ACRONYM_TYPE: {
				ConfAcronymType confAcronymType = (ConfAcronymType)theEObject;
				T result = caseConfAcronymType(confAcronymType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONF_DATE_TYPE: {
				ConfDateType confDateType = (ConfDateType)theEObject;
				T result = caseConfDateType(confDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONFERENCE_TYPE: {
				ConferenceType conferenceType = (ConferenceType)theEObject;
				T result = caseConferenceType(conferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONF_LOC_TYPE: {
				ConfLocType confLocType = (ConfLocType)theEObject;
				T result = caseConfLocType(confLocType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONF_NAME_TYPE: {
				ConfNameType confNameType = (ConfNameType)theEObject;
				T result = caseConfNameType(confNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONF_NUM_TYPE: {
				ConfNumType confNumType = (ConfNumType)theEObject;
				T result = caseConfNumType(confNumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONF_SPONSOR_TYPE: {
				ConfSponsorType confSponsorType = (ConfSponsorType)theEObject;
				T result = caseConfSponsorType(confSponsorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONF_THEME_TYPE: {
				ConfThemeType confThemeType = (ConfThemeType)theEObject;
				T result = caseConfThemeType(confThemeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONTRIB_GROUP_TYPE: {
				ContribGroupType contribGroupType = (ContribGroupType)theEObject;
				T result = caseContribGroupType(contribGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONTRIB_ID_TYPE: {
				ContribIdType contribIdType = (ContribIdType)theEObject;
				T result = caseContribIdType(contribIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONTRIB_TYPE: {
				ContribType contribType = (ContribType)theEObject;
				T result = caseContribType(contribType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CONTRIBUTED_RESOURCE_GROUP_TYPE: {
				ContributedResourceGroupType contributedResourceGroupType = (ContributedResourceGroupType)theEObject;
				T result = caseContributedResourceGroupType(contributedResourceGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COPYRIGHT_HOLDER_TYPE: {
				CopyrightHolderType copyrightHolderType = (CopyrightHolderType)theEObject;
				T result = caseCopyrightHolderType(copyrightHolderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COPYRIGHT_STATEMENT_TYPE: {
				CopyrightStatementType copyrightStatementType = (CopyrightStatementType)theEObject;
				T result = caseCopyrightStatementType(copyrightStatementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COPYRIGHT_YEAR_TYPE: {
				CopyrightYearType copyrightYearType = (CopyrightYearType)theEObject;
				T result = caseCopyrightYearType(copyrightYearType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CORRESP_TYPE: {
				CorrespType correspType = (CorrespType)theEObject;
				T result = caseCorrespType(correspType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COUNTRY_TYPE: {
				CountryType countryType = (CountryType)theEObject;
				T result = caseCountryType(countryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COUNTS_TYPE: {
				CountsType countsType = (CountsType)theEObject;
				T result = caseCountsType(countsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.COUNT_TYPE: {
				CountType countType = (CountType)theEObject;
				T result = caseCountType(countType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CUSTOM_META_GROUP_TYPE: {
				CustomMetaGroupType customMetaGroupType = (CustomMetaGroupType)theEObject;
				T result = caseCustomMetaGroupType(customMetaGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.CUSTOM_META_TYPE: {
				CustomMetaType customMetaType = (CustomMetaType)theEObject;
				T result = caseCustomMetaType(customMetaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DATA_TITLE_TYPE: {
				DataTitleType dataTitleType = (DataTitleType)theEObject;
				T result = caseDataTitleType(dataTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DATE_IN_CITATION_TYPE: {
				DateInCitationType dateInCitationType = (DateInCitationType)theEObject;
				T result = caseDateInCitationType(dateInCitationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DAY_TYPE: {
				DayType dayType = (DayType)theEObject;
				T result = caseDayType(dayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DEF_HEAD_TYPE: {
				DefHeadType defHeadType = (DefHeadType)theEObject;
				T result = caseDefHeadType(defHeadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DEF_ITEM_TYPE: {
				DefItemType defItemType = (DefItemType)theEObject;
				T result = caseDefItemType(defItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DEF_LIST_TYPE: {
				DefListType defListType = (DefListType)theEObject;
				T result = caseDefListType(defListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DEF_TYPE: {
				DefType defType = (DefType)theEObject;
				T result = caseDefType(defType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DEGREES_TYPE: {
				DegreesType degreesType = (DegreesType)theEObject;
				T result = caseDegreesType(degreesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DISP_FORMULA_GROUP_TYPE: {
				DispFormulaGroupType dispFormulaGroupType = (DispFormulaGroupType)theEObject;
				T result = caseDispFormulaGroupType(dispFormulaGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DISP_FORMULA_TYPE: {
				DispFormulaType dispFormulaType = (DispFormulaType)theEObject;
				T result = caseDispFormulaType(dispFormulaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DISP_QUOTE_TYPE: {
				DispQuoteType dispQuoteType = (DispQuoteType)theEObject;
				T result = caseDispQuoteType(dispQuoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.EDITION_TYPE: {
				EditionType editionType = (EditionType)theEObject;
				T result = caseEditionType(editionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ELEMENT_CITATION_TYPE: {
				ElementCitationType elementCitationType = (ElementCitationType)theEObject;
				T result = caseElementCitationType(elementCitationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ELOCATION_ID_TYPE: {
				ElocationIdType elocationIdType = (ElocationIdType)theEObject;
				T result = caseElocationIdType(elocationIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.EMAIL_TYPE: {
				EmailType emailType = (EmailType)theEObject;
				T result = caseEmailType(emailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.EQUATION_COUNT_TYPE: {
				EquationCountType equationCountType = (EquationCountType)theEObject;
				T result = caseEquationCountType(equationCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ERA_TYPE: {
				EraType eraType = (EraType)theEObject;
				T result = caseEraType(eraType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ETAL_TYPE: {
				EtalType etalType = (EtalType)theEObject;
				T result = caseEtalType(etalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.EVENT_DESC_TYPE: {
				EventDescType eventDescType = (EventDescType)theEObject;
				T result = caseEventDescType(eventDescType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.EVENT_TYPE: {
				EventType eventType = (EventType)theEObject;
				T result = caseEventType(eventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.EXT_LINK_TYPE: {
				ExtLinkType extLinkType = (ExtLinkType)theEObject;
				T result = caseExtLinkType(extLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FAX_TYPE: {
				FaxType faxType = (FaxType)theEObject;
				T result = caseFaxType(faxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FIG_COUNT_TYPE: {
				FigCountType figCountType = (FigCountType)theEObject;
				T result = caseFigCountType(figCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FIG_GROUP_TYPE: {
				FigGroupType figGroupType = (FigGroupType)theEObject;
				T result = caseFigGroupType(figGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FIG_TYPE: {
				FigType figType = (FigType)theEObject;
				T result = caseFigType(figType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FIXED_CASE_TYPE: {
				FixedCaseType fixedCaseType = (FixedCaseType)theEObject;
				T result = caseFixedCaseType(fixedCaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FLOATS_GROUP_TYPE: {
				FloatsGroupType floatsGroupType = (FloatsGroupType)theEObject;
				T result = caseFloatsGroupType(floatsGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FN_GROUP_TYPE: {
				FnGroupType fnGroupType = (FnGroupType)theEObject;
				T result = caseFnGroupType(fnGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FN_TYPE: {
				FnType fnType = (FnType)theEObject;
				T result = caseFnType(fnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FPAGE_TYPE: {
				FpageType fpageType = (FpageType)theEObject;
				T result = caseFpageType(fpageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FRONT_STUB_TYPE: {
				FrontStubType frontStubType = (FrontStubType)theEObject;
				T result = caseFrontStubType(frontStubType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FRONT_TYPE: {
				FrontType frontType = (FrontType)theEObject;
				T result = caseFrontType(frontType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FUNDING_GROUP_TYPE: {
				FundingGroupType fundingGroupType = (FundingGroupType)theEObject;
				T result = caseFundingGroupType(fundingGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FUNDING_SOURCE_TYPE: {
				FundingSourceType fundingSourceType = (FundingSourceType)theEObject;
				T result = caseFundingSourceType(fundingSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.FUNDING_STATEMENT_TYPE: {
				FundingStatementType fundingStatementType = (FundingStatementType)theEObject;
				T result = caseFundingStatementType(fundingStatementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.GIVEN_NAMES_TYPE: {
				GivenNamesType givenNamesType = (GivenNamesType)theEObject;
				T result = caseGivenNamesType(givenNamesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.GLOSSARY_TYPE: {
				GlossaryType glossaryType = (GlossaryType)theEObject;
				T result = caseGlossaryType(glossaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.GLYPH_DATA_TYPE: {
				GlyphDataType glyphDataType = (GlyphDataType)theEObject;
				T result = caseGlyphDataType(glyphDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.GLYPH_REF_TYPE: {
				GlyphRefType glyphRefType = (GlyphRefType)theEObject;
				T result = caseGlyphRefType(glyphRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.GOV_TYPE: {
				GovType govType = (GovType)theEObject;
				T result = caseGovType(govType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.GRAPHIC_TYPE: {
				GraphicType graphicType = (GraphicType)theEObject;
				T result = caseGraphicType(graphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.HISTORY_TYPE: {
				HistoryType historyType = (HistoryType)theEObject;
				T result = caseHistoryType(historyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.HR_TYPE: {
				HrType hrType = (HrType)theEObject;
				T result = caseHrType(hrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.INDEX_TERM_RANGE_END_TYPE: {
				IndexTermRangeEndType indexTermRangeEndType = (IndexTermRangeEndType)theEObject;
				T result = caseIndexTermRangeEndType(indexTermRangeEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.INDEX_TERM_TYPE: {
				IndexTermType indexTermType = (IndexTermType)theEObject;
				T result = caseIndexTermType(indexTermType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.INLINE_FORMULA_TYPE: {
				InlineFormulaType inlineFormulaType = (InlineFormulaType)theEObject;
				T result = caseInlineFormulaType(inlineFormulaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.INLINE_GRAPHIC_TYPE: {
				InlineGraphicType inlineGraphicType = (InlineGraphicType)theEObject;
				T result = caseInlineGraphicType(inlineGraphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.INLINE_MEDIA_TYPE: {
				InlineMediaType inlineMediaType = (InlineMediaType)theEObject;
				T result = caseInlineMediaType(inlineMediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.INLINE_SUPPLEMENTARY_MATERIAL_TYPE: {
				InlineSupplementaryMaterialType inlineSupplementaryMaterialType = (InlineSupplementaryMaterialType)theEObject;
				T result = caseInlineSupplementaryMaterialType(inlineSupplementaryMaterialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.INSTITUTION_ID_TYPE: {
				InstitutionIdType institutionIdType = (InstitutionIdType)theEObject;
				T result = caseInstitutionIdType(institutionIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.INSTITUTION_TYPE: {
				InstitutionType institutionType = (InstitutionType)theEObject;
				T result = caseInstitutionType(institutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.INSTITUTION_WRAP_TYPE: {
				InstitutionWrapType institutionWrapType = (InstitutionWrapType)theEObject;
				T result = caseInstitutionWrapType(institutionWrapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ISBN_TYPE: {
				IsbnType isbnType = (IsbnType)theEObject;
				T result = caseIsbnType(isbnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ISSN_LTYPE: {
				IssnLType issnLType = (IssnLType)theEObject;
				T result = caseIssnLType(issnLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ISSN_TYPE: {
				IssnType issnType = (IssnType)theEObject;
				T result = caseIssnType(issnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ISSUE_ID_TYPE: {
				IssueIdType issueIdType = (IssueIdType)theEObject;
				T result = caseIssueIdType(issueIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ISSUE_PART_TYPE: {
				IssuePartType issuePartType = (IssuePartType)theEObject;
				T result = caseIssuePartType(issuePartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ISSUE_SPONSOR_TYPE: {
				IssueSponsorType issueSponsorType = (IssueSponsorType)theEObject;
				T result = caseIssueSponsorType(issueSponsorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ISSUE_TITLE_TYPE: {
				IssueTitleType issueTitleType = (IssueTitleType)theEObject;
				T result = caseIssueTitleType(issueTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ISSUE_TYPE: {
				IssueType issueType = (IssueType)theEObject;
				T result = caseIssueType(issueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ITALIC_TYPE: {
				ItalicType italicType = (ItalicType)theEObject;
				T result = caseItalicType(italicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.JOURNAL_ID_TYPE: {
				JournalIdType journalIdType = (JournalIdType)theEObject;
				T result = caseJournalIdType(journalIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.JOURNAL_META_TYPE: {
				JournalMetaType journalMetaType = (JournalMetaType)theEObject;
				T result = caseJournalMetaType(journalMetaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.JOURNAL_SUBTITLE_TYPE: {
				JournalSubtitleType journalSubtitleType = (JournalSubtitleType)theEObject;
				T result = caseJournalSubtitleType(journalSubtitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE: {
				JournalTitleGroupType journalTitleGroupType = (JournalTitleGroupType)theEObject;
				T result = caseJournalTitleGroupType(journalTitleGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.JOURNAL_TITLE_TYPE: {
				JournalTitleType journalTitleType = (JournalTitleType)theEObject;
				T result = caseJournalTitleType(journalTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.KWD_GROUP_TYPE: {
				KwdGroupType kwdGroupType = (KwdGroupType)theEObject;
				T result = caseKwdGroupType(kwdGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.KWD_TYPE: {
				KwdType kwdType = (KwdType)theEObject;
				T result = caseKwdType(kwdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.LABEL_TYPE: {
				LabelType labelType = (LabelType)theEObject;
				T result = caseLabelType(labelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.LICENSE_PTYPE: {
				LicensePType licensePType = (LicensePType)theEObject;
				T result = caseLicensePType(licensePType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.LICENSE_TYPE: {
				LicenseType licenseType = (LicenseType)theEObject;
				T result = caseLicenseType(licenseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.LIST_ITEM_TYPE: {
				ListItemType listItemType = (ListItemType)theEObject;
				T result = caseListItemType(listItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.LIST_TYPE: {
				ListType listType = (ListType)theEObject;
				T result = caseListType(listType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.LONG_DESC_TYPE: {
				LongDescType longDescType = (LongDescType)theEObject;
				T result = caseLongDescType(longDescType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.LPAGE_TYPE: {
				LpageType lpageType = (LpageType)theEObject;
				T result = caseLpageType(lpageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.MEDIA_TYPE: {
				MediaType mediaType = (MediaType)theEObject;
				T result = caseMediaType(mediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.META_NAME_TYPE: {
				MetaNameType metaNameType = (MetaNameType)theEObject;
				T result = caseMetaNameType(metaNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.META_VALUE_TYPE: {
				MetaValueType metaValueType = (MetaValueType)theEObject;
				T result = caseMetaValueType(metaValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.MILESTONE_END_TYPE: {
				MilestoneEndType milestoneEndType = (MilestoneEndType)theEObject;
				T result = caseMilestoneEndType(milestoneEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.MILESTONE_START_TYPE: {
				MilestoneStartType milestoneStartType = (MilestoneStartType)theEObject;
				T result = caseMilestoneStartType(milestoneStartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.MIXED_CITATION_TYPE: {
				MixedCitationType mixedCitationType = (MixedCitationType)theEObject;
				T result = caseMixedCitationType(mixedCitationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.MONOSPACE_TYPE: {
				MonospaceType monospaceType = (MonospaceType)theEObject;
				T result = caseMonospaceType(monospaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.MONTH_TYPE: {
				MonthType monthType = (MonthType)theEObject;
				T result = caseMonthType(monthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.NAME_ALTERNATIVES_TYPE: {
				NameAlternativesType nameAlternativesType = (NameAlternativesType)theEObject;
				T result = caseNameAlternativesType(nameAlternativesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.NAMED_CONTENT_TYPE: {
				NamedContentType namedContentType = (NamedContentType)theEObject;
				T result = caseNamedContentType(namedContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.NAME_TYPE: {
				NameType nameType = (NameType)theEObject;
				T result = caseNameType(nameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.NESTED_KWD_TYPE: {
				NestedKwdType nestedKwdType = (NestedKwdType)theEObject;
				T result = caseNestedKwdType(nestedKwdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.NLM_CITATION_TYPE: {
				NlmCitationType nlmCitationType = (NlmCitationType)theEObject;
				T result = caseNlmCitationType(nlmCitationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.NOTES_TYPE: {
				NotesType notesType = (NotesType)theEObject;
				T result = caseNotesType(notesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				T result = caseNoteType(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.OBJECT_ID_TYPE: {
				ObjectIdType objectIdType = (ObjectIdType)theEObject;
				T result = caseObjectIdType(objectIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ON_BEHALF_OF_TYPE: {
				OnBehalfOfType onBehalfOfType = (OnBehalfOfType)theEObject;
				T result = caseOnBehalfOfType(onBehalfOfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.OPEN_ACCESS_TYPE: {
				OpenAccessType openAccessType = (OpenAccessType)theEObject;
				T result = caseOpenAccessType(openAccessType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.OVERLINE_END_TYPE: {
				OverlineEndType overlineEndType = (OverlineEndType)theEObject;
				T result = caseOverlineEndType(overlineEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.OVERLINE_START_TYPE: {
				OverlineStartType overlineStartType = (OverlineStartType)theEObject;
				T result = caseOverlineStartType(overlineStartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.OVERLINE_TYPE: {
				OverlineType overlineType = (OverlineType)theEObject;
				T result = caseOverlineType(overlineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PAGE_COUNT_TYPE: {
				PageCountType pageCountType = (PageCountType)theEObject;
				T result = casePageCountType(pageCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PAGE_RANGE_TYPE: {
				PageRangeType pageRangeType = (PageRangeType)theEObject;
				T result = casePageRangeType(pageRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PART_TITLE_TYPE: {
				PartTitleType partTitleType = (PartTitleType)theEObject;
				T result = casePartTitleType(partTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PATENT_TYPE: {
				PatentType patentType = (PatentType)theEObject;
				T result = casePatentType(patentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PERMISSIONS_TYPE: {
				PermissionsType permissionsType = (PermissionsType)theEObject;
				T result = casePermissionsType(permissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PERSON_GROUP_TYPE: {
				PersonGroupType personGroupType = (PersonGroupType)theEObject;
				T result = casePersonGroupType(personGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PHONE_TYPE: {
				PhoneType phoneType = (PhoneType)theEObject;
				T result = casePhoneType(phoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.POSTAL_CODE_TYPE: {
				PostalCodeType postalCodeType = (PostalCodeType)theEObject;
				T result = casePostalCodeType(postalCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PREFIX_TYPE: {
				PrefixType prefixType = (PrefixType)theEObject;
				T result = casePrefixType(prefixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PREFORMAT_TYPE: {
				PreformatType preformatType = (PreformatType)theEObject;
				T result = casePreformatType(preformatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PRICE_TYPE: {
				PriceType priceType = (PriceType)theEObject;
				T result = casePriceType(priceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PRINCIPAL_AWARD_RECIPIENT_TYPE: {
				PrincipalAwardRecipientType principalAwardRecipientType = (PrincipalAwardRecipientType)theEObject;
				T result = casePrincipalAwardRecipientType(principalAwardRecipientType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PRINCIPAL_INVESTIGATOR_TYPE: {
				PrincipalInvestigatorType principalInvestigatorType = (PrincipalInvestigatorType)theEObject;
				T result = casePrincipalInvestigatorType(principalInvestigatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PRIVATE_CHAR_TYPE: {
				PrivateCharType privateCharType = (PrivateCharType)theEObject;
				T result = casePrivateCharType(privateCharType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PRODUCT_TYPE: {
				ProductType productType = (ProductType)theEObject;
				T result = caseProductType(productType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PTYPE: {
				PType pType = (PType)theEObject;
				T result = casePType(pType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PUB_DATE_NOT_AVAILABLE_TYPE: {
				PubDateNotAvailableType pubDateNotAvailableType = (PubDateNotAvailableType)theEObject;
				T result = casePubDateNotAvailableType(pubDateNotAvailableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PUB_DATE_TYPE: {
				PubDateType pubDateType = (PubDateType)theEObject;
				T result = casePubDateType(pubDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PUB_HISTORY_TYPE: {
				PubHistoryType pubHistoryType = (PubHistoryType)theEObject;
				T result = casePubHistoryType(pubHistoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PUB_ID_TYPE: {
				PubIdType pubIdType = (PubIdType)theEObject;
				T result = casePubIdType(pubIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PUBLISHER_LOC_TYPE: {
				PublisherLocType publisherLocType = (PublisherLocType)theEObject;
				T result = casePublisherLocType(publisherLocType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PUBLISHER_NAME_TYPE: {
				PublisherNameType publisherNameType = (PublisherNameType)theEObject;
				T result = casePublisherNameType(publisherNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.PUBLISHER_TYPE: {
				PublisherType publisherType = (PublisherType)theEObject;
				T result = casePublisherType(publisherType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RB_TYPE: {
				RbType rbType = (RbType)theEObject;
				T result = caseRbType(rbType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.REF_COUNT_TYPE: {
				RefCountType refCountType = (RefCountType)theEObject;
				T result = caseRefCountType(refCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.REF_LIST_TYPE: {
				RefListType refListType = (RefListType)theEObject;
				T result = caseRefListType(refListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.REF_TYPE: {
				RefType refType = (RefType)theEObject;
				T result = caseRefType(refType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RELATED_ARTICLE_TYPE: {
				RelatedArticleType relatedArticleType = (RelatedArticleType)theEObject;
				T result = caseRelatedArticleType(relatedArticleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RELATED_OBJECT_TYPE: {
				RelatedObjectType relatedObjectType = (RelatedObjectType)theEObject;
				T result = caseRelatedObjectType(relatedObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RESOURCE_GROUP_TYPE: {
				ResourceGroupType resourceGroupType = (ResourceGroupType)theEObject;
				T result = caseResourceGroupType(resourceGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RESOURCE_ID_TYPE: {
				ResourceIdType resourceIdType = (ResourceIdType)theEObject;
				T result = caseResourceIdType(resourceIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RESOURCE_NAME_TYPE: {
				ResourceNameType resourceNameType = (ResourceNameType)theEObject;
				T result = caseResourceNameType(resourceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RESOURCE_WRAP_TYPE: {
				ResourceWrapType resourceWrapType = (ResourceWrapType)theEObject;
				T result = caseResourceWrapType(resourceWrapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RESPONSE_TYPE: {
				ResponseType responseType = (ResponseType)theEObject;
				T result = caseResponseType(responseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ROLE_TYPE: {
				RoleType roleType = (RoleType)theEObject;
				T result = caseRoleType(roleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.ROMAN_TYPE: {
				RomanType romanType = (RomanType)theEObject;
				T result = caseRomanType(romanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RP_TYPE: {
				RpType rpType = (RpType)theEObject;
				T result = caseRpType(rpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RT_TYPE: {
				RtType rtType = (RtType)theEObject;
				T result = caseRtType(rtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.RUBY_TYPE: {
				RubyType rubyType = (RubyType)theEObject;
				T result = caseRubyType(rubyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SANS_SERIF_TYPE: {
				SansSerifType sansSerifType = (SansSerifType)theEObject;
				T result = caseSansSerifType(sansSerifType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SC_TYPE: {
				ScType scType = (ScType)theEObject;
				T result = caseScType(scType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SEASON_TYPE: {
				SeasonType seasonType = (SeasonType)theEObject;
				T result = caseSeasonType(seasonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SEC_META_TYPE: {
				SecMetaType secMetaType = (SecMetaType)theEObject;
				T result = caseSecMetaType(secMetaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SEC_TYPE: {
				SecType secType = (SecType)theEObject;
				T result = caseSecType(secType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SEE_ALSO_TYPE: {
				SeeAlsoType seeAlsoType = (SeeAlsoType)theEObject;
				T result = caseSeeAlsoType(seeAlsoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SEE_TYPE: {
				SeeType seeType = (SeeType)theEObject;
				T result = caseSeeType(seeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SELF_URI_TYPE: {
				SelfUriType selfUriType = (SelfUriType)theEObject;
				T result = caseSelfUriType(selfUriType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SERIES_TEXT_TYPE: {
				SeriesTextType seriesTextType = (SeriesTextType)theEObject;
				T result = caseSeriesTextType(seriesTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SERIES_TITLE_TYPE: {
				SeriesTitleType seriesTitleType = (SeriesTitleType)theEObject;
				T result = caseSeriesTitleType(seriesTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SERIES_TYPE: {
				SeriesType seriesType = (SeriesType)theEObject;
				T result = caseSeriesType(seriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SIG_BLOCK_TYPE: {
				SigBlockType sigBlockType = (SigBlockType)theEObject;
				T result = caseSigBlockType(sigBlockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SIG_TYPE: {
				SigType sigType = (SigType)theEObject;
				T result = caseSigType(sigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SIZE_TYPE: {
				SizeType sizeType = (SizeType)theEObject;
				T result = caseSizeType(sizeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SOURCE_TYPE: {
				SourceType sourceType = (SourceType)theEObject;
				T result = caseSourceType(sourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SPEAKER_TYPE: {
				SpeakerType speakerType = (SpeakerType)theEObject;
				T result = caseSpeakerType(speakerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SPEECH_TYPE: {
				SpeechType speechType = (SpeechType)theEObject;
				T result = caseSpeechType(speechType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.STATEMENT_TYPE: {
				StatementType statementType = (StatementType)theEObject;
				T result = caseStatementType(statementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.STATE_TYPE: {
				StateType stateType = (StateType)theEObject;
				T result = caseStateType(stateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.STD_ORGANIZATION_TYPE: {
				StdOrganizationType stdOrganizationType = (StdOrganizationType)theEObject;
				T result = caseStdOrganizationType(stdOrganizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.STD_TYPE: {
				StdType stdType = (StdType)theEObject;
				T result = caseStdType(stdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.STRIKE_TYPE: {
				StrikeType strikeType = (StrikeType)theEObject;
				T result = caseStrikeType(strikeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.STRING_CONF_TYPE: {
				StringConfType stringConfType = (StringConfType)theEObject;
				T result = caseStringConfType(stringConfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.STRING_DATE_TYPE: {
				StringDateType stringDateType = (StringDateType)theEObject;
				T result = caseStringDateType(stringDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.STRING_NAME_TYPE: {
				StringNameType stringNameType = (StringNameType)theEObject;
				T result = caseStringNameType(stringNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.STYLED_CONTENT_TYPE: {
				StyledContentType styledContentType = (StyledContentType)theEObject;
				T result = caseStyledContentType(styledContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUB_ARTICLE_TYPE: {
				SubArticleType subArticleType = (SubArticleType)theEObject;
				T result = caseSubArticleType(subArticleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUBJECT_TYPE: {
				SubjectType subjectType = (SubjectType)theEObject;
				T result = caseSubjectType(subjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUBJ_GROUP_TYPE: {
				SubjGroupType subjGroupType = (SubjGroupType)theEObject;
				T result = caseSubjGroupType(subjGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUBTITLE_TYPE: {
				SubtitleType subtitleType = (SubtitleType)theEObject;
				T result = caseSubtitleType(subtitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUB_TYPE: {
				SubType subType = (SubType)theEObject;
				T result = caseSubType(subType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUFFIX_TYPE: {
				SuffixType suffixType = (SuffixType)theEObject;
				T result = caseSuffixType(suffixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUPPLEMENTARY_MATERIAL_TYPE: {
				SupplementaryMaterialType supplementaryMaterialType = (SupplementaryMaterialType)theEObject;
				T result = caseSupplementaryMaterialType(supplementaryMaterialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUPPLEMENT_TYPE: {
				SupplementType supplementType = (SupplementType)theEObject;
				T result = caseSupplementType(supplementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUPPORT_DESCRIPTION_TYPE: {
				SupportDescriptionType supportDescriptionType = (SupportDescriptionType)theEObject;
				T result = caseSupportDescriptionType(supportDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUPPORT_GROUP_TYPE: {
				SupportGroupType supportGroupType = (SupportGroupType)theEObject;
				T result = caseSupportGroupType(supportGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUPPORT_SOURCE_TYPE: {
				SupportSourceType supportSourceType = (SupportSourceType)theEObject;
				T result = caseSupportSourceType(supportSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SUP_TYPE: {
				SupType supType = (SupType)theEObject;
				T result = caseSupType(supType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.SURNAME_TYPE: {
				SurnameType surnameType = (SurnameType)theEObject;
				T result = caseSurnameType(surnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TABLE_COUNT_TYPE: {
				TableCountType tableCountType = (TableCountType)theEObject;
				T result = caseTableCountType(tableCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TABLE_TYPE: {
				TableType tableType = (TableType)theEObject;
				T result = caseTableType(tableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TABLE_WRAP_FOOT_TYPE: {
				TableWrapFootType tableWrapFootType = (TableWrapFootType)theEObject;
				T result = caseTableWrapFootType(tableWrapFootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TABLE_WRAP_GROUP_TYPE: {
				TableWrapGroupType tableWrapGroupType = (TableWrapGroupType)theEObject;
				T result = caseTableWrapGroupType(tableWrapGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TABLE_WRAP_TYPE: {
				TableWrapType tableWrapType = (TableWrapType)theEObject;
				T result = caseTableWrapType(tableWrapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TARGET_TYPE: {
				TargetType targetType = (TargetType)theEObject;
				T result = caseTargetType(targetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TBODY_TYPE: {
				TbodyType tbodyType = (TbodyType)theEObject;
				T result = caseTbodyType(tbodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TD_TYPE: {
				TdType tdType = (TdType)theEObject;
				T result = caseTdType(tdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TERM_HEAD_TYPE: {
				TermHeadType termHeadType = (TermHeadType)theEObject;
				T result = caseTermHeadType(termHeadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TERM_TYPE: {
				TermType termType = (TermType)theEObject;
				T result = caseTermType(termType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TEX_MATH_TYPE: {
				TexMathType texMathType = (TexMathType)theEObject;
				T result = caseTexMathType(texMathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TEXTUAL_FORM_TYPE: {
				TextualFormType textualFormType = (TextualFormType)theEObject;
				T result = caseTextualFormType(textualFormType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TFOOT_TYPE: {
				TfootType tfootType = (TfootType)theEObject;
				T result = caseTfootType(tfootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.THEAD_TYPE: {
				TheadType theadType = (TheadType)theEObject;
				T result = caseTheadType(theadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TH_TYPE: {
				ThType thType = (ThType)theEObject;
				T result = caseThType(thType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TIME_STAMP_TYPE: {
				TimeStampType timeStampType = (TimeStampType)theEObject;
				T result = caseTimeStampType(timeStampType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TITLE_GROUP_TYPE: {
				TitleGroupType titleGroupType = (TitleGroupType)theEObject;
				T result = caseTitleGroupType(titleGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TITLE_TYPE: {
				TitleType titleType = (TitleType)theEObject;
				T result = caseTitleType(titleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TRANS_ABSTRACT_TYPE: {
				TransAbstractType transAbstractType = (TransAbstractType)theEObject;
				T result = caseTransAbstractType(transAbstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TRANS_SOURCE_TYPE: {
				TransSourceType transSourceType = (TransSourceType)theEObject;
				T result = caseTransSourceType(transSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TRANS_SUBTITLE_TYPE: {
				TransSubtitleType transSubtitleType = (TransSubtitleType)theEObject;
				T result = caseTransSubtitleType(transSubtitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TRANS_TITLE_GROUP_TYPE: {
				TransTitleGroupType transTitleGroupType = (TransTitleGroupType)theEObject;
				T result = caseTransTitleGroupType(transTitleGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TRANS_TITLE_TYPE: {
				TransTitleType transTitleType = (TransTitleType)theEObject;
				T result = caseTransTitleType(transTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.TR_TYPE: {
				TrType trType = (TrType)theEObject;
				T result = caseTrType(trType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.UNDERLINE_END_TYPE: {
				UnderlineEndType underlineEndType = (UnderlineEndType)theEObject;
				T result = caseUnderlineEndType(underlineEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.UNDERLINE_START_TYPE: {
				UnderlineStartType underlineStartType = (UnderlineStartType)theEObject;
				T result = caseUnderlineStartType(underlineStartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.UNDERLINE_TYPE: {
				UnderlineType underlineType = (UnderlineType)theEObject;
				T result = caseUnderlineType(underlineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.UNSTRUCTURED_KWD_GROUP_TYPE: {
				UnstructuredKwdGroupType unstructuredKwdGroupType = (UnstructuredKwdGroupType)theEObject;
				T result = caseUnstructuredKwdGroupType(unstructuredKwdGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.URI_TYPE: {
				UriType uriType = (UriType)theEObject;
				T result = caseUriType(uriType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.VERSE_GROUP_TYPE: {
				VerseGroupType verseGroupType = (VerseGroupType)theEObject;
				T result = caseVerseGroupType(verseGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.VERSE_LINE_TYPE: {
				VerseLineType verseLineType = (VerseLineType)theEObject;
				T result = caseVerseLineType(verseLineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.VERSION_TYPE: {
				VersionType versionType = (VersionType)theEObject;
				T result = caseVersionType(versionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.VOLUME_ID_TYPE: {
				VolumeIdType volumeIdType = (VolumeIdType)theEObject;
				T result = caseVolumeIdType(volumeIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE: {
				VolumeIssueGroupType volumeIssueGroupType = (VolumeIssueGroupType)theEObject;
				T result = caseVolumeIssueGroupType(volumeIssueGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.VOLUME_SERIES_TYPE: {
				VolumeSeriesType volumeSeriesType = (VolumeSeriesType)theEObject;
				T result = caseVolumeSeriesType(volumeSeriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.VOLUME_TYPE: {
				VolumeType volumeType = (VolumeType)theEObject;
				T result = caseVolumeType(volumeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.WORD_COUNT_TYPE: {
				WordCountType wordCountType = (WordCountType)theEObject;
				T result = caseWordCountType(wordCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.XREF_TYPE: {
				XrefType xrefType = (XrefType)theEObject;
				T result = caseXrefType(xrefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.XTYPE: {
				XType xType = (XType)theEObject;
				T result = caseXType(xType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Jats1Package.YEAR_TYPE: {
				YearType yearType = (YearType)theEObject;
				T result = caseYearType(yearType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbrev Journal Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbrev Journal Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbrevJournalTitleType(AbbrevJournalTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbrev Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbrev Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbrevType(AbbrevType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractType(AbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessDateType(AccessDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ack Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ack Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAckType(AckType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addr Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addr Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddrLineType(AddrLineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aff Alternatives Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aff Alternatives Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffAlternativesType(AffAlternativesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aff Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aff Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffType(AffType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternatives Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternatives Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativesType(AlternativesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltTextType(AltTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltTitleType(AltTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType(AnnotationType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>App Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppGroupType(AppGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppType(AppType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article Categories Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article Categories Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticleCategoriesType(ArticleCategoriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticleIdType(ArticleIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article Meta Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article Meta Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticleMetaType(ArticleMetaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticleTitleType(ArticleTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticleType(ArticleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article Version Alternatives Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article Version Alternatives Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticleVersionAlternativesType(ArticleVersionAlternativesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article Version Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticleVersionType(ArticleVersionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attrib Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attrib Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribType(AttribType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Comment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Comment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorCommentType(AuthorCommentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorNotesType(AuthorNotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Award Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Award Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwardGroupType(AwardGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Award Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Award Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwardIdType(AwardIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackType(BackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bio Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bio Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBioType(BioType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bold Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bold Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoldType(BoldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boxed Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boxed Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoxedTextType(BoxedTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakType(BreakType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaptionType(CaptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChapterTitleType(ChapterTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chem Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chem Struct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChemStructType(ChemStructType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chem Struct Wrap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chem Struct Wrap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChemStructWrapType(ChemStructWrapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citation Alternatives Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citation Alternatives Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitationAlternativesType(CitationAlternativesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>City Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>City Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCityType(CityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeType(CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColgroupType(ColgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collab Alternatives Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collab Alternatives Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollabAlternativesType(CollabAlternativesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collab Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collab Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollabType(CollabType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Col Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Col Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColType(ColType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentType(CommentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Kwd Part Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Kwd Part Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundKwdPartType(CompoundKwdPartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Kwd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Kwd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundKwdType(CompoundKwdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Subject Part Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Subject Part Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundSubjectPartType(CompoundSubjectPartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Subject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Subject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundSubjectType(CompoundSubjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conf Acronym Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf Acronym Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfAcronymType(ConfAcronymType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conf Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfDateType(ConfDateType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Conf Loc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf Loc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfLocType(ConfLocType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conf Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfNameType(ConfNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conf Num Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf Num Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfNumType(ConfNumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conf Sponsor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf Sponsor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfSponsorType(ConfSponsorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conf Theme Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf Theme Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfThemeType(ConfThemeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrib Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrib Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribGroupType(ContribGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrib Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrib Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribIdType(ContribIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrib Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrib Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribType(ContribType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contributed Resource Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contributed Resource Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributedResourceGroupType(ContributedResourceGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright Holder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright Holder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyrightHolderType(CopyrightHolderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright Statement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright Statement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyrightStatementType(CopyrightStatementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright Year Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright Year Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyrightYearType(CopyrightYearType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corresp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corresp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrespType(CorrespType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountryType(CountryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountsType(CountsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountType(CountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Meta Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Meta Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomMetaGroupType(CustomMetaGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Meta Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Meta Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomMetaType(CustomMetaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTitleType(DataTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date In Citation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date In Citation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateInCitationType(DateInCitationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDayType(DayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def Head Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def Head Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefHeadType(DefHeadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefItemType(DefItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefListType(DefListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefType(DefType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Disp Formula Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disp Formula Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispFormulaGroupType(DispFormulaGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disp Formula Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disp Formula Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispFormulaType(DispFormulaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disp Quote Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disp Quote Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispQuoteType(DispQuoteType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Edition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditionType(EditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Citation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Citation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementCitationType(ElementCitationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elocation Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elocation Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElocationIdType(ElocationIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailType(EmailType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equation Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equation Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquationCountType(EquationCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Era Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Era Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEraType(EraType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtalType(EtalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Desc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Desc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDescType(EventDescType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType(EventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ext Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ext Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtLinkType(ExtLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fax Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fax Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaxType(FaxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fig Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fig Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigCountType(FigCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fig Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fig Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigGroupType(FigGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fig Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fig Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigType(FigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedCaseType(FixedCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floats Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floats Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatsGroupType(FloatsGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fn Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fn Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFnGroupType(FnGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fn Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fn Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFnType(FnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fpage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fpage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFpageType(FpageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Front Stub Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Front Stub Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrontStubType(FrontStubType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Front Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Front Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrontType(FrontType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funding Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funding Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFundingGroupType(FundingGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funding Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funding Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFundingSourceType(FundingSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funding Statement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funding Statement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFundingStatementType(FundingStatementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Given Names Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Given Names Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGivenNamesType(GivenNamesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossaryType(GlossaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glyph Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glyph Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlyphDataType(GlyphDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glyph Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glyph Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlyphRefType(GlyphRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gov Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gov Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGovType(GovType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicType(GraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryType(HistoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHrType(HrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Term Range End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Term Range End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexTermRangeEndType(IndexTermRangeEndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Term Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Term Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexTermType(IndexTermType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Formula Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Formula Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineFormulaType(InlineFormulaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineGraphicType(InlineGraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineMediaType(InlineMediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Supplementary Material Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Supplementary Material Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineSupplementaryMaterialType(InlineSupplementaryMaterialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Institution Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Institution Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstitutionIdType(InstitutionIdType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Institution Wrap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Institution Wrap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstitutionWrapType(InstitutionWrapType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Issn LType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issn LType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssnLType(IssnLType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Issue Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueIdType(IssueIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Part Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Part Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssuePartType(IssuePartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Sponsor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Sponsor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueSponsorType(IssueSponsorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueTitleType(IssueTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueType(IssueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Italic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Italic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItalicType(ItalicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalIdType(JournalIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Meta Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Meta Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalMetaType(JournalMetaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Subtitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Subtitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalSubtitleType(JournalSubtitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Title Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Title Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalTitleGroupType(JournalTitleGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalTitleType(JournalTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kwd Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kwd Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKwdGroupType(KwdGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kwd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kwd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKwdType(KwdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType(LabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License PType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License PType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicensePType(LicensePType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicenseType(LicenseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItemType(ListItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListType(ListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Desc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Desc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongDescType(LongDescType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lpage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lpage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLpageType(LpageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaType(MediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaNameType(MetaNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaValueType(MetaValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Milestone End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Milestone End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMilestoneEndType(MilestoneEndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Milestone Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Milestone Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMilestoneStartType(MilestoneStartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixed Citation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixed Citation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixedCitationType(MixedCitationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monospace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monospace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonospaceType(MonospaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Month Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonthType(MonthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Alternatives Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Alternatives Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameAlternativesType(NameAlternativesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedContentType(NamedContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameType(NameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Kwd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Kwd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedKwdType(NestedKwdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nlm Citation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nlm Citation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNlmCitationType(NlmCitationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotesType(NotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIdType(ObjectIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Behalf Of Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Behalf Of Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnBehalfOfType(OnBehalfOfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Access Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Access Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenAccessType(OpenAccessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overline End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overline End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlineEndType(OverlineEndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overline Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overline Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlineStartType(OverlineStartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlineType(OverlineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageCountType(PageCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageRangeType(PageRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartTitleType(PartTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatentType(PatentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissionsType(PermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonGroupType(PersonGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhoneType(PhoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalCodeType(PostalCodeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Preformat Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preformat Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreformatType(PreformatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Price Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Price Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriceType(PriceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Principal Award Recipient Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Principal Award Recipient Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrincipalAwardRecipientType(PrincipalAwardRecipientType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Principal Investigator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Principal Investigator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrincipalInvestigatorType(PrincipalInvestigatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Char Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Char Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateCharType(PrivateCharType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductType(ProductType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePType(PType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pub Date Not Available Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pub Date Not Available Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubDateNotAvailableType(PubDateNotAvailableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pub Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pub Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubDateType(PubDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pub History Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pub History Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubHistoryType(PubHistoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pub Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pub Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubIdType(PubIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher Loc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Loc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisherLocType(PublisherLocType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisherNameType(PublisherNameType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Rb Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rb Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRbType(RbType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefCountType(RefCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefListType(RefListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefType(RefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Article Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Article Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedArticleType(RelatedArticleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedObjectType(RelatedObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceGroupType(ResourceGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceIdType(ResourceIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceNameType(ResourceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Wrap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Wrap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceWrapType(ResourceWrapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseType(ResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleType(RoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roman Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roman Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRomanType(RomanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRpType(RpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtType(RtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyType(RubyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sans Serif Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sans Serif Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSansSerifType(SansSerifType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScType(ScType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Season Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Season Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeasonType(SeasonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sec Meta Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sec Meta Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecMetaType(SecMetaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sec Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecType(SecType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>See Also Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>See Also Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeeAlsoType(SeeAlsoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>See Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>See Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeeType(SeeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Uri Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Uri Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfUriType(SelfUriType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesTextType(SeriesTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesTitleType(SeriesTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesType(SeriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sig Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sig Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSigBlockType(SigBlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sig Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sig Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSigType(SigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeType(SizeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceType(SourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speaker Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speaker Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeakerType(SpeakerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechType(SpeechType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementType(StatementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateType(StateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Std Organization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Std Organization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStdOrganizationType(StdOrganizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Std Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Std Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStdType(StdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strike Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strike Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrikeType(StrikeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Conf Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Conf Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConfType(StringConfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringDateType(StringDateType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Styled Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Styled Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyledContentType(StyledContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Article Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Article Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubArticleType(SubArticleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectType(SubjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subj Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subj Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjGroupType(SubjGroupType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sub Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubType(SubType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suffix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suffix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuffixType(SuffixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplementary Material Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplementary Material Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplementaryMaterialType(SupplementaryMaterialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplementType(SupplementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportDescriptionType(SupportDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportGroupType(SupportGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportSourceType(SupportSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupType(SupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurnameType(SurnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCountType(TableCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableType(TableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Wrap Foot Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Wrap Foot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableWrapFootType(TableWrapFootType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Wrap Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Wrap Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableWrapGroupType(TableWrapGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Wrap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Wrap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableWrapType(TableWrapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetType(TargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tbody Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tbody Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTbodyType(TbodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Td Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Td Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTdType(TdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Head Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Head Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermHeadType(TermHeadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermType(TermType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tex Math Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tex Math Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTexMathType(TexMathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Form Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Form Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualFormType(TextualFormType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tfoot Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tfoot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTfootType(TfootType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheadType(TheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Th Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Th Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThType(ThType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStampType(TimeStampType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleGroupType(TitleGroupType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Trans Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransAbstractType(TransAbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransSourceType(TransSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Subtitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Subtitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransSubtitleType(TransSubtitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Title Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Title Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransTitleGroupType(TransTitleGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransTitleType(TransTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrType(TrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underline End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underline End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderlineEndType(UnderlineEndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underline Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underline Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderlineStartType(UnderlineStartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderlineType(UnderlineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Kwd Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Kwd Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredKwdGroupType(UnstructuredKwdGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUriType(UriType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verse Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verse Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerseGroupType(VerseGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verse Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verse Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerseLineType(VerseLineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionType(VersionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeIdType(VolumeIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Issue Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Issue Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeIssueGroupType(VolumeIssueGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Series Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Series Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeSeriesType(VolumeSeriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeType(VolumeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Word Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Word Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWordCountType(WordCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXrefType(XrefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXType(XType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYearType(YearType object) {
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

} //Jats1Switch
