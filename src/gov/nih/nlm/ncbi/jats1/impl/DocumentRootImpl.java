/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevJournalTitleType;
import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.AbstractType;
import gov.nih.nlm.ncbi.jats1.AccessDateType;
import gov.nih.nlm.ncbi.jats1.AckType;
import gov.nih.nlm.ncbi.jats1.AddrLineType;
import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.AffAlternativesType;
import gov.nih.nlm.ncbi.jats1.AffType;
import gov.nih.nlm.ncbi.jats1.AltTextType;
import gov.nih.nlm.ncbi.jats1.AltTitleType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.AnnotationType;
import gov.nih.nlm.ncbi.jats1.AnonymousType;
import gov.nih.nlm.ncbi.jats1.AppGroupType;
import gov.nih.nlm.ncbi.jats1.AppType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.ArticleCategoriesType;
import gov.nih.nlm.ncbi.jats1.ArticleIdType;
import gov.nih.nlm.ncbi.jats1.ArticleMetaType;
import gov.nih.nlm.ncbi.jats1.ArticleTitleType;
import gov.nih.nlm.ncbi.jats1.ArticleType;
import gov.nih.nlm.ncbi.jats1.ArticleVersionAlternativesType;
import gov.nih.nlm.ncbi.jats1.ArticleVersionType;
import gov.nih.nlm.ncbi.jats1.AttribType;
import gov.nih.nlm.ncbi.jats1.AuthorCommentType;
import gov.nih.nlm.ncbi.jats1.AuthorNotesType;
import gov.nih.nlm.ncbi.jats1.AwardGroupType;
import gov.nih.nlm.ncbi.jats1.AwardIdType;
import gov.nih.nlm.ncbi.jats1.BackType;
import gov.nih.nlm.ncbi.jats1.BioType;
import gov.nih.nlm.ncbi.jats1.BodyType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.BoxedTextType;
import gov.nih.nlm.ncbi.jats1.BreakType;
import gov.nih.nlm.ncbi.jats1.CaptionType;
import gov.nih.nlm.ncbi.jats1.ChapterTitleType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.ChemStructWrapType;
import gov.nih.nlm.ncbi.jats1.CitationAlternativesType;
import gov.nih.nlm.ncbi.jats1.CityType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.ColType;
import gov.nih.nlm.ncbi.jats1.ColgroupType;
import gov.nih.nlm.ncbi.jats1.CollabAlternativesType;
import gov.nih.nlm.ncbi.jats1.CollabType;
import gov.nih.nlm.ncbi.jats1.CommentType;
import gov.nih.nlm.ncbi.jats1.CompoundKwdPartType;
import gov.nih.nlm.ncbi.jats1.CompoundKwdType;
import gov.nih.nlm.ncbi.jats1.CompoundSubjectPartType;
import gov.nih.nlm.ncbi.jats1.CompoundSubjectType;
import gov.nih.nlm.ncbi.jats1.ConfAcronymType;
import gov.nih.nlm.ncbi.jats1.ConfDateType;
import gov.nih.nlm.ncbi.jats1.ConfLocType;
import gov.nih.nlm.ncbi.jats1.ConfNameType;
import gov.nih.nlm.ncbi.jats1.ConfNumType;
import gov.nih.nlm.ncbi.jats1.ConfSponsorType;
import gov.nih.nlm.ncbi.jats1.ConfThemeType;
import gov.nih.nlm.ncbi.jats1.ConferenceType;
import gov.nih.nlm.ncbi.jats1.ContribGroupType;
import gov.nih.nlm.ncbi.jats1.ContribIdType;
import gov.nih.nlm.ncbi.jats1.ContribType;
import gov.nih.nlm.ncbi.jats1.ContributedResourceGroupType;
import gov.nih.nlm.ncbi.jats1.CopyrightHolderType;
import gov.nih.nlm.ncbi.jats1.CopyrightStatementType;
import gov.nih.nlm.ncbi.jats1.CopyrightYearType;
import gov.nih.nlm.ncbi.jats1.CorrespType;
import gov.nih.nlm.ncbi.jats1.CountType;
import gov.nih.nlm.ncbi.jats1.CountryType;
import gov.nih.nlm.ncbi.jats1.CountsType;
import gov.nih.nlm.ncbi.jats1.CustomMetaGroupType;
import gov.nih.nlm.ncbi.jats1.CustomMetaType;
import gov.nih.nlm.ncbi.jats1.DataTitleType;
import gov.nih.nlm.ncbi.jats1.DateInCitationType;
import gov.nih.nlm.ncbi.jats1.DateType;
import gov.nih.nlm.ncbi.jats1.DayType;
import gov.nih.nlm.ncbi.jats1.DefHeadType;
import gov.nih.nlm.ncbi.jats1.DefItemType;
import gov.nih.nlm.ncbi.jats1.DefListType;
import gov.nih.nlm.ncbi.jats1.DefType;
import gov.nih.nlm.ncbi.jats1.DegreesType;
import gov.nih.nlm.ncbi.jats1.DispFormulaGroupType;
import gov.nih.nlm.ncbi.jats1.DispFormulaType;
import gov.nih.nlm.ncbi.jats1.DispQuoteType;
import gov.nih.nlm.ncbi.jats1.DocumentRoot;
import gov.nih.nlm.ncbi.jats1.EditionType;
import gov.nih.nlm.ncbi.jats1.ElementCitationType;
import gov.nih.nlm.ncbi.jats1.ElocationIdType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.EquationCountType;
import gov.nih.nlm.ncbi.jats1.EraType;
import gov.nih.nlm.ncbi.jats1.EtalType;
import gov.nih.nlm.ncbi.jats1.EventDescType;
import gov.nih.nlm.ncbi.jats1.EventType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FaxType;
import gov.nih.nlm.ncbi.jats1.FigCountType;
import gov.nih.nlm.ncbi.jats1.FigGroupType;
import gov.nih.nlm.ncbi.jats1.FigType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FloatsGroupType;
import gov.nih.nlm.ncbi.jats1.FnGroupType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.FpageType;
import gov.nih.nlm.ncbi.jats1.FrontStubType;
import gov.nih.nlm.ncbi.jats1.FrontType;
import gov.nih.nlm.ncbi.jats1.FundingGroupType;
import gov.nih.nlm.ncbi.jats1.FundingSourceType;
import gov.nih.nlm.ncbi.jats1.FundingStatementType;
import gov.nih.nlm.ncbi.jats1.GivenNamesType;
import gov.nih.nlm.ncbi.jats1.GlossaryType;
import gov.nih.nlm.ncbi.jats1.GlyphDataType;
import gov.nih.nlm.ncbi.jats1.GlyphRefType;
import gov.nih.nlm.ncbi.jats1.GovType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.HistoryType;
import gov.nih.nlm.ncbi.jats1.HrType;
import gov.nih.nlm.ncbi.jats1.IndexTermRangeEndType;
import gov.nih.nlm.ncbi.jats1.IndexTermType;
import gov.nih.nlm.ncbi.jats1.InlineFormulaType;
import gov.nih.nlm.ncbi.jats1.InlineGraphicType;
import gov.nih.nlm.ncbi.jats1.InlineMediaType;
import gov.nih.nlm.ncbi.jats1.InlineSupplementaryMaterialType;
import gov.nih.nlm.ncbi.jats1.InstitutionIdType;
import gov.nih.nlm.ncbi.jats1.InstitutionType;
import gov.nih.nlm.ncbi.jats1.InstitutionWrapType;
import gov.nih.nlm.ncbi.jats1.IsbnType;
import gov.nih.nlm.ncbi.jats1.IssnLType;
import gov.nih.nlm.ncbi.jats1.IssnType;
import gov.nih.nlm.ncbi.jats1.IssueIdType;
import gov.nih.nlm.ncbi.jats1.IssuePartType;
import gov.nih.nlm.ncbi.jats1.IssueSponsorType;
import gov.nih.nlm.ncbi.jats1.IssueTitleType;
import gov.nih.nlm.ncbi.jats1.IssueType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.JournalIdType;
import gov.nih.nlm.ncbi.jats1.JournalMetaType;
import gov.nih.nlm.ncbi.jats1.JournalSubtitleType;
import gov.nih.nlm.ncbi.jats1.JournalTitleGroupType;
import gov.nih.nlm.ncbi.jats1.JournalTitleType;
import gov.nih.nlm.ncbi.jats1.KwdGroupType;
import gov.nih.nlm.ncbi.jats1.KwdType;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.LicensePType;
import gov.nih.nlm.ncbi.jats1.LicenseType;
import gov.nih.nlm.ncbi.jats1.ListItemType;
import gov.nih.nlm.ncbi.jats1.ListType;
import gov.nih.nlm.ncbi.jats1.LongDescType;
import gov.nih.nlm.ncbi.jats1.LpageType;
import gov.nih.nlm.ncbi.jats1.MediaType;
import gov.nih.nlm.ncbi.jats1.MetaNameType;
import gov.nih.nlm.ncbi.jats1.MetaValueType;
import gov.nih.nlm.ncbi.jats1.MilestoneEndType;
import gov.nih.nlm.ncbi.jats1.MilestoneStartType;
import gov.nih.nlm.ncbi.jats1.MixedCitationType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.MonthType;
import gov.nih.nlm.ncbi.jats1.NameAlternativesType;
import gov.nih.nlm.ncbi.jats1.NameType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.NestedKwdType;
import gov.nih.nlm.ncbi.jats1.NlmCitationType;
import gov.nih.nlm.ncbi.jats1.NoteType;
import gov.nih.nlm.ncbi.jats1.NotesType;
import gov.nih.nlm.ncbi.jats1.ObjectIdType;
import gov.nih.nlm.ncbi.jats1.OnBehalfOfType;
import gov.nih.nlm.ncbi.jats1.OpenAccessType;
import gov.nih.nlm.ncbi.jats1.OverlineEndType;
import gov.nih.nlm.ncbi.jats1.OverlineStartType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PType;
import gov.nih.nlm.ncbi.jats1.PageCountType;
import gov.nih.nlm.ncbi.jats1.PageRangeType;
import gov.nih.nlm.ncbi.jats1.PartTitleType;
import gov.nih.nlm.ncbi.jats1.PatentType;
import gov.nih.nlm.ncbi.jats1.PermissionsType;
import gov.nih.nlm.ncbi.jats1.PersonGroupType;
import gov.nih.nlm.ncbi.jats1.PhoneType;
import gov.nih.nlm.ncbi.jats1.PostalCodeType;
import gov.nih.nlm.ncbi.jats1.PrefixType;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.PriceType;
import gov.nih.nlm.ncbi.jats1.PrincipalAwardRecipientType;
import gov.nih.nlm.ncbi.jats1.PrincipalInvestigatorType;
import gov.nih.nlm.ncbi.jats1.PrivateCharType;
import gov.nih.nlm.ncbi.jats1.ProductType;
import gov.nih.nlm.ncbi.jats1.PubDateNotAvailableType;
import gov.nih.nlm.ncbi.jats1.PubDateType;
import gov.nih.nlm.ncbi.jats1.PubHistoryType;
import gov.nih.nlm.ncbi.jats1.PubIdType;
import gov.nih.nlm.ncbi.jats1.PublisherLocType;
import gov.nih.nlm.ncbi.jats1.PublisherNameType;
import gov.nih.nlm.ncbi.jats1.PublisherType;
import gov.nih.nlm.ncbi.jats1.RbType;
import gov.nih.nlm.ncbi.jats1.RefCountType;
import gov.nih.nlm.ncbi.jats1.RefListType;
import gov.nih.nlm.ncbi.jats1.RefType;
import gov.nih.nlm.ncbi.jats1.RelatedArticleType;
import gov.nih.nlm.ncbi.jats1.RelatedObjectType;
import gov.nih.nlm.ncbi.jats1.ResourceGroupType;
import gov.nih.nlm.ncbi.jats1.ResourceIdType;
import gov.nih.nlm.ncbi.jats1.ResourceNameType;
import gov.nih.nlm.ncbi.jats1.ResourceWrapType;
import gov.nih.nlm.ncbi.jats1.ResponseType;
import gov.nih.nlm.ncbi.jats1.RoleType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RpType;
import gov.nih.nlm.ncbi.jats1.RtType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.SeasonType;
import gov.nih.nlm.ncbi.jats1.SecMetaType;
import gov.nih.nlm.ncbi.jats1.SecType;
import gov.nih.nlm.ncbi.jats1.SeeAlsoType;
import gov.nih.nlm.ncbi.jats1.SeeType;
import gov.nih.nlm.ncbi.jats1.SelfUriType;
import gov.nih.nlm.ncbi.jats1.SeriesTextType;
import gov.nih.nlm.ncbi.jats1.SeriesTitleType;
import gov.nih.nlm.ncbi.jats1.SeriesType;
import gov.nih.nlm.ncbi.jats1.SigBlockType;
import gov.nih.nlm.ncbi.jats1.SigType;
import gov.nih.nlm.ncbi.jats1.SizeType;
import gov.nih.nlm.ncbi.jats1.SourceType;
import gov.nih.nlm.ncbi.jats1.SpeakerType;
import gov.nih.nlm.ncbi.jats1.SpeechType;
import gov.nih.nlm.ncbi.jats1.StateType;
import gov.nih.nlm.ncbi.jats1.StatementType;
import gov.nih.nlm.ncbi.jats1.StdOrganizationType;
import gov.nih.nlm.ncbi.jats1.StdType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.StringConfType;
import gov.nih.nlm.ncbi.jats1.StringDateType;
import gov.nih.nlm.ncbi.jats1.StringNameType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubArticleType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SubjGroupType;
import gov.nih.nlm.ncbi.jats1.SubjectType;
import gov.nih.nlm.ncbi.jats1.SubtitleType;
import gov.nih.nlm.ncbi.jats1.SuffixType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.SupplementType;
import gov.nih.nlm.ncbi.jats1.SupplementaryMaterialType;
import gov.nih.nlm.ncbi.jats1.SupportDescriptionType;
import gov.nih.nlm.ncbi.jats1.SupportGroupType;
import gov.nih.nlm.ncbi.jats1.SupportSourceType;
import gov.nih.nlm.ncbi.jats1.SurnameType;
import gov.nih.nlm.ncbi.jats1.TableCountType;
import gov.nih.nlm.ncbi.jats1.TableType;
import gov.nih.nlm.ncbi.jats1.TableWrapFootType;
import gov.nih.nlm.ncbi.jats1.TableWrapGroupType;
import gov.nih.nlm.ncbi.jats1.TableWrapType;
import gov.nih.nlm.ncbi.jats1.TargetType;
import gov.nih.nlm.ncbi.jats1.TbodyType;
import gov.nih.nlm.ncbi.jats1.TdType;
import gov.nih.nlm.ncbi.jats1.TermHeadType;
import gov.nih.nlm.ncbi.jats1.TermType;
import gov.nih.nlm.ncbi.jats1.TexMathType;
import gov.nih.nlm.ncbi.jats1.TextualFormType;
import gov.nih.nlm.ncbi.jats1.TfootType;
import gov.nih.nlm.ncbi.jats1.ThType;
import gov.nih.nlm.ncbi.jats1.TheadType;
import gov.nih.nlm.ncbi.jats1.TimeStampType;
import gov.nih.nlm.ncbi.jats1.TitleGroupType;
import gov.nih.nlm.ncbi.jats1.TitleType;
import gov.nih.nlm.ncbi.jats1.TrType;
import gov.nih.nlm.ncbi.jats1.TransAbstractType;
import gov.nih.nlm.ncbi.jats1.TransSourceType;
import gov.nih.nlm.ncbi.jats1.TransSubtitleType;
import gov.nih.nlm.ncbi.jats1.TransTitleGroupType;
import gov.nih.nlm.ncbi.jats1.TransTitleType;
import gov.nih.nlm.ncbi.jats1.UnderlineEndType;
import gov.nih.nlm.ncbi.jats1.UnderlineStartType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.UnstructuredKwdGroupType;
import gov.nih.nlm.ncbi.jats1.UriType;
import gov.nih.nlm.ncbi.jats1.VerseGroupType;
import gov.nih.nlm.ncbi.jats1.VerseLineType;
import gov.nih.nlm.ncbi.jats1.VersionType;
import gov.nih.nlm.ncbi.jats1.VolumeIdType;
import gov.nih.nlm.ncbi.jats1.VolumeIssueGroupType;
import gov.nih.nlm.ncbi.jats1.VolumeSeriesType;
import gov.nih.nlm.ncbi.jats1.VolumeType;
import gov.nih.nlm.ncbi.jats1.WordCountType;
import gov.nih.nlm.ncbi.jats1.XType;
import gov.nih.nlm.ncbi.jats1.XrefType;
import gov.nih.nlm.ncbi.jats1.YearType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAbbrevJournalTitle <em>Abbrev Journal Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAccessDate <em>Access Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAck <em>Ack</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAddrLine <em>Addr Line</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAff <em>Aff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAffAlternatives <em>Aff Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAltTitle <em>Alt Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getApp <em>App</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAppGroup <em>App Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getArticle <em>Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getArticleCategories <em>Article Categories</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getArticleId <em>Article Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getArticleMeta <em>Article Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getArticleVersion <em>Article Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getArticleVersionAlternatives <em>Article Version Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAuthorComment <em>Author Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAuthorNotes <em>Author Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAwardGroup <em>Award Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getAwardId <em>Award Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getBack <em>Back</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getBio <em>Bio</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getBody <em>Body</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getBreak <em>Break</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getChapterTitle <em>Chapter Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCitationAlternatives <em>Citation Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCity <em>City</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCol <em>Col</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCollab <em>Collab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCollabAlternatives <em>Collab Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCompoundKwd <em>Compound Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCompoundKwdPart <em>Compound Kwd Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCompoundSubject <em>Compound Subject</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCompoundSubjectPart <em>Compound Subject Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getConfAcronym <em>Conf Acronym</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getConfDate <em>Conf Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getConfLoc <em>Conf Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getConfName <em>Conf Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getConfNum <em>Conf Num</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getConfSponsor <em>Conf Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getConfTheme <em>Conf Theme</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getConference <em>Conference</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getContrib <em>Contrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getContribGroup <em>Contrib Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getContribId <em>Contrib Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getContributedResourceGroup <em>Contributed Resource Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCopyrightHolder <em>Copyright Holder</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCopyrightStatement <em>Copyright Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCopyrightYear <em>Copyright Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCorresp <em>Corresp</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCount <em>Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCounts <em>Counts</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCustomMeta <em>Custom Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getCustomMetaGroup <em>Custom Meta Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDataTitle <em>Data Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDateInCitation <em>Date In Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDef <em>Def</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDefHead <em>Def Head</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDefItem <em>Def Item</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getElementCitation <em>Element Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getEquationCount <em>Equation Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getEra <em>Era</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getEtal <em>Etal</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getEventDesc <em>Event Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFigCount <em>Fig Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFloatsGroup <em>Floats Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFnGroup <em>Fn Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFpage <em>Fpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFront <em>Front</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFrontStub <em>Front Stub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFundingGroup <em>Funding Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFundingSource <em>Funding Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getFundingStatement <em>Funding Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getGivenNames <em>Given Names</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getGlyphData <em>Glyph Data</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getGlyphRef <em>Glyph Ref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getGov <em>Gov</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getHistory <em>History</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getInstitutionId <em>Institution Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getIssnL <em>Issn L</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getIssueId <em>Issue Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getIssuePart <em>Issue Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getIssueSponsor <em>Issue Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getIssueTitle <em>Issue Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getJournalId <em>Journal Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getJournalMeta <em>Journal Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getJournalSubtitle <em>Journal Subtitle</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getJournalTitle <em>Journal Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getJournalTitleGroup <em>Journal Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getKwd <em>Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getKwdGroup <em>Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getLicense <em>License</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getLicenseP <em>License P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getListItem <em>List Item</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getLongDesc <em>Long Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getLpage <em>Lpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getMetaName <em>Meta Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getMetaValue <em>Meta Value</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getMixedCitation <em>Mixed Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getNameAlternatives <em>Name Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getNestedKwd <em>Nested Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getNlmCitation <em>Nlm Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getNote <em>Note</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getOpenAccess <em>Open Access</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getOverlineEnd <em>Overline End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getOverlineStart <em>Overline Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getP <em>P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPageRange <em>Page Range</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPartTitle <em>Part Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPatent <em>Patent</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPersonGroup <em>Person Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPrincipalAwardRecipient <em>Principal Award Recipient</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPrincipalInvestigator <em>Principal Investigator</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPubDate <em>Pub Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPubDateNotAvailable <em>Pub Date Not Available</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPubHistory <em>Pub History</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPubId <em>Pub Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPublisherLoc <em>Publisher Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRb <em>Rb</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRefCount <em>Ref Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRefList <em>Ref List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getResourceWrap <em>Resource Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRp <em>Rp</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRt <em>Rt</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSecMeta <em>Sec Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSee <em>See</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSelfUri <em>Self Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSeriesText <em>Series Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSeriesTitle <em>Series Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSig <em>Sig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSigBlock <em>Sig Block</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSize <em>Size</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSpeaker <em>Speaker</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getState <em>State</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getStd <em>Std</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getStdOrganization <em>Std Organization</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getStringConf <em>String Conf</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getStringDate <em>String Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getStringName <em>String Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSubArticle <em>Sub Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSubjGroup <em>Subj Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSupportDescription <em>Support Description</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSupportGroup <em>Support Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSupportSource <em>Support Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTable <em>Table</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTableWrapFoot <em>Table Wrap Foot</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTbody <em>Tbody</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTd <em>Td</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTermHead <em>Term Head</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTextualForm <em>Textual Form</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTh <em>Th</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getThead <em>Thead</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTitleGroup <em>Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTransAbstract <em>Trans Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTransSource <em>Trans Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTransSubtitle <em>Trans Subtitle</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTransTitle <em>Trans Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getTransTitleGroup <em>Trans Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getUnderlineEnd <em>Underline End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getUnderlineStart <em>Underline Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getUnstructuredKwdGroup <em>Unstructured Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getVerseLine <em>Verse Line</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getVolumeId <em>Volume Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getVolumeIssueGroup <em>Volume Issue Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getVolumeSeries <em>Volume Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getX <em>X</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DocumentRootImpl#getYear <em>Year</em>}</li>
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
		return Jats1Package.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Jats1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Jats1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbbrevType getAbbrev() {
		return (AbbrevType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Abbrev(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbbrev(AbbrevType newAbbrev, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Abbrev(), newAbbrev, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbrev(AbbrevType newAbbrev) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Abbrev(), newAbbrev);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbbrevJournalTitleType getAbbrevJournalTitle() {
		return (AbbrevJournalTitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AbbrevJournalTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbbrevJournalTitle(AbbrevJournalTitleType newAbbrevJournalTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AbbrevJournalTitle(), newAbbrevJournalTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbrevJournalTitle(AbbrevJournalTitleType newAbbrevJournalTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AbbrevJournalTitle(), newAbbrevJournalTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractType getAbstract() {
		return (AbstractType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Abstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(AbstractType newAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Abstract(), newAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(AbstractType newAbstract) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Abstract(), newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessDateType getAccessDate() {
		return (AccessDateType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AccessDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessDate(AccessDateType newAccessDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AccessDate(), newAccessDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessDate(AccessDateType newAccessDate) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AccessDate(), newAccessDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AckType getAck() {
		return (AckType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Ack(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAck(AckType newAck, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Ack(), newAck, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAck(AckType newAck) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Ack(), newAck);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddrLineType getAddrLine() {
		return (AddrLineType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AddrLine(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddrLine(AddrLineType newAddrLine, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AddrLine(), newAddrLine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddrLine(AddrLineType newAddrLine) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AddrLine(), newAddrLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressType getAddress() {
		return (AddressType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Address(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressType newAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Address(), newAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(AddressType newAddress) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Address(), newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffType getAff() {
		return (AffType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Aff(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAff(AffType newAff, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Aff(), newAff, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAff(AffType newAff) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Aff(), newAff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffAlternativesType getAffAlternatives() {
		return (AffAlternativesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AffAlternatives(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffAlternatives(AffAlternativesType newAffAlternatives, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AffAlternatives(), newAffAlternatives, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffAlternatives(AffAlternativesType newAffAlternatives) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AffAlternatives(), newAffAlternatives);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltTextType getAltText() {
		return (AltTextType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AltText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltText(AltTextType newAltText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AltText(), newAltText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltText(AltTextType newAltText) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AltText(), newAltText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltTitleType getAltTitle() {
		return (AltTitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AltTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltTitle(AltTitleType newAltTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AltTitle(), newAltTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltTitle(AltTitleType newAltTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AltTitle(), newAltTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlternativesType getAlternatives() {
		return (AlternativesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Alternatives(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternatives(AlternativesType newAlternatives, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Alternatives(), newAlternatives, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternatives(AlternativesType newAlternatives) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Alternatives(), newAlternatives);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationType getAnnotation() {
		return (AnnotationType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Annotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(AnnotationType newAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Annotation(), newAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotation(AnnotationType newAnnotation) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Annotation(), newAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousType getAnonymous() {
		return (AnonymousType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Anonymous(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymous(AnonymousType newAnonymous, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Anonymous(), newAnonymous, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnonymous(AnonymousType newAnonymous) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Anonymous(), newAnonymous);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppType getApp() {
		return (AppType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_App(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApp(AppType newApp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_App(), newApp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApp(AppType newApp) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_App(), newApp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppGroupType getAppGroup() {
		return (AppGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AppGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppGroup(AppGroupType newAppGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AppGroup(), newAppGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppGroup(AppGroupType newAppGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AppGroup(), newAppGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType getArray() {
		return (ArrayType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Array(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray(ArrayType newArray, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Array(), newArray, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArray(ArrayType newArray) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Array(), newArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleType getArticle() {
		return (ArticleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Article(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticle(ArticleType newArticle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Article(), newArticle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticle(ArticleType newArticle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Article(), newArticle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleCategoriesType getArticleCategories() {
		return (ArticleCategoriesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ArticleCategories(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleCategories(ArticleCategoriesType newArticleCategories, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ArticleCategories(), newArticleCategories, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleCategories(ArticleCategoriesType newArticleCategories) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ArticleCategories(), newArticleCategories);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleIdType getArticleId() {
		return (ArticleIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ArticleId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleId(ArticleIdType newArticleId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ArticleId(), newArticleId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleId(ArticleIdType newArticleId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ArticleId(), newArticleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleMetaType getArticleMeta() {
		return (ArticleMetaType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ArticleMeta(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleMeta(ArticleMetaType newArticleMeta, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ArticleMeta(), newArticleMeta, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleMeta(ArticleMetaType newArticleMeta) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ArticleMeta(), newArticleMeta);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleTitleType getArticleTitle() {
		return (ArticleTitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ArticleTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleTitle(ArticleTitleType newArticleTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ArticleTitle(), newArticleTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleTitle(ArticleTitleType newArticleTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ArticleTitle(), newArticleTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleVersionType getArticleVersion() {
		return (ArticleVersionType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ArticleVersion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleVersion(ArticleVersionType newArticleVersion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ArticleVersion(), newArticleVersion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleVersion(ArticleVersionType newArticleVersion) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ArticleVersion(), newArticleVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleVersionAlternativesType getArticleVersionAlternatives() {
		return (ArticleVersionAlternativesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ArticleVersionAlternatives(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleVersionAlternatives(ArticleVersionAlternativesType newArticleVersionAlternatives, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ArticleVersionAlternatives(), newArticleVersionAlternatives, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleVersionAlternatives(ArticleVersionAlternativesType newArticleVersionAlternatives) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ArticleVersionAlternatives(), newArticleVersionAlternatives);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttribType getAttrib() {
		return (AttribType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Attrib(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttrib(AttribType newAttrib, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Attrib(), newAttrib, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrib(AttribType newAttrib) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Attrib(), newAttrib);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorCommentType getAuthorComment() {
		return (AuthorCommentType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AuthorComment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorComment(AuthorCommentType newAuthorComment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AuthorComment(), newAuthorComment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorComment(AuthorCommentType newAuthorComment) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AuthorComment(), newAuthorComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorNotesType getAuthorNotes() {
		return (AuthorNotesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AuthorNotes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorNotes(AuthorNotesType newAuthorNotes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AuthorNotes(), newAuthorNotes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorNotes(AuthorNotesType newAuthorNotes) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AuthorNotes(), newAuthorNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwardGroupType getAwardGroup() {
		return (AwardGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AwardGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwardGroup(AwardGroupType newAwardGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AwardGroup(), newAwardGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAwardGroup(AwardGroupType newAwardGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AwardGroup(), newAwardGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwardIdType getAwardId() {
		return (AwardIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_AwardId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwardId(AwardIdType newAwardId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_AwardId(), newAwardId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAwardId(AwardIdType newAwardId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_AwardId(), newAwardId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackType getBack() {
		return (BackType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Back(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBack(BackType newBack, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Back(), newBack, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBack(BackType newBack) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Back(), newBack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BioType getBio() {
		return (BioType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Bio(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBio(BioType newBio, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Bio(), newBio, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBio(BioType newBio) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Bio(), newBio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyType getBody() {
		return (BodyType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Body(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(BodyType newBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Body(), newBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(BodyType newBody) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Body(), newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoldType getBold() {
		return (BoldType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Bold(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBold(BoldType newBold, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Bold(), newBold, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBold(BoldType newBold) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Bold(), newBold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoxedTextType getBoxedText() {
		return (BoxedTextType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_BoxedText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoxedText(BoxedTextType newBoxedText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_BoxedText(), newBoxedText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxedText(BoxedTextType newBoxedText) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_BoxedText(), newBoxedText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreakType getBreak() {
		return (BreakType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Break(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBreak(BreakType newBreak, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Break(), newBreak, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBreak(BreakType newBreak) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Break(), newBreak);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaptionType getCaption() {
		return (CaptionType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Caption(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(CaptionType newCaption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Caption(), newCaption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaption(CaptionType newCaption) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Caption(), newCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChapterTitleType getChapterTitle() {
		return (ChapterTitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ChapterTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChapterTitle(ChapterTitleType newChapterTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ChapterTitle(), newChapterTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChapterTitle(ChapterTitleType newChapterTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ChapterTitle(), newChapterTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChemStructType getChemStruct() {
		return (ChemStructType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ChemStruct(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChemStruct(ChemStructType newChemStruct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ChemStruct(), newChemStruct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChemStruct(ChemStructType newChemStruct) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ChemStruct(), newChemStruct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChemStructWrapType getChemStructWrap() {
		return (ChemStructWrapType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ChemStructWrap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChemStructWrap(ChemStructWrapType newChemStructWrap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ChemStructWrap(), newChemStructWrap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChemStructWrap(ChemStructWrapType newChemStructWrap) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ChemStructWrap(), newChemStructWrap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationAlternativesType getCitationAlternatives() {
		return (CitationAlternativesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CitationAlternatives(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitationAlternatives(CitationAlternativesType newCitationAlternatives, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CitationAlternatives(), newCitationAlternatives, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitationAlternatives(CitationAlternativesType newCitationAlternatives) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CitationAlternatives(), newCitationAlternatives);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CityType getCity() {
		return (CityType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_City(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCity(CityType newCity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_City(), newCity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(CityType newCity) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_City(), newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getCode() {
		return (CodeType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Code(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeType newCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Code(), newCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(CodeType newCode) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Code(), newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColType getCol() {
		return (ColType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Col(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCol(ColType newCol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Col(), newCol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCol(ColType newCol) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Col(), newCol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColgroupType getColgroup() {
		return (ColgroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Colgroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColgroup(ColgroupType newColgroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Colgroup(), newColgroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColgroup(ColgroupType newColgroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Colgroup(), newColgroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollabType getCollab() {
		return (CollabType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Collab(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollab(CollabType newCollab, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Collab(), newCollab, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollab(CollabType newCollab) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Collab(), newCollab);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollabAlternativesType getCollabAlternatives() {
		return (CollabAlternativesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CollabAlternatives(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollabAlternatives(CollabAlternativesType newCollabAlternatives, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CollabAlternatives(), newCollabAlternatives, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollabAlternatives(CollabAlternativesType newCollabAlternatives) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CollabAlternatives(), newCollabAlternatives);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentType getComment() {
		return (CommentType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Comment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(CommentType newComment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Comment(), newComment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(CommentType newComment) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Comment(), newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundKwdType getCompoundKwd() {
		return (CompoundKwdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CompoundKwd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundKwd(CompoundKwdType newCompoundKwd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CompoundKwd(), newCompoundKwd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompoundKwd(CompoundKwdType newCompoundKwd) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CompoundKwd(), newCompoundKwd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundKwdPartType getCompoundKwdPart() {
		return (CompoundKwdPartType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CompoundKwdPart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundKwdPart(CompoundKwdPartType newCompoundKwdPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CompoundKwdPart(), newCompoundKwdPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompoundKwdPart(CompoundKwdPartType newCompoundKwdPart) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CompoundKwdPart(), newCompoundKwdPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundSubjectType getCompoundSubject() {
		return (CompoundSubjectType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CompoundSubject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundSubject(CompoundSubjectType newCompoundSubject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CompoundSubject(), newCompoundSubject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompoundSubject(CompoundSubjectType newCompoundSubject) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CompoundSubject(), newCompoundSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundSubjectPartType getCompoundSubjectPart() {
		return (CompoundSubjectPartType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CompoundSubjectPart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundSubjectPart(CompoundSubjectPartType newCompoundSubjectPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CompoundSubjectPart(), newCompoundSubjectPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompoundSubjectPart(CompoundSubjectPartType newCompoundSubjectPart) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CompoundSubjectPart(), newCompoundSubjectPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfAcronymType getConfAcronym() {
		return (ConfAcronymType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ConfAcronym(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfAcronym(ConfAcronymType newConfAcronym, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ConfAcronym(), newConfAcronym, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfAcronym(ConfAcronymType newConfAcronym) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ConfAcronym(), newConfAcronym);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfDateType getConfDate() {
		return (ConfDateType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ConfDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfDate(ConfDateType newConfDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ConfDate(), newConfDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfDate(ConfDateType newConfDate) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ConfDate(), newConfDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfLocType getConfLoc() {
		return (ConfLocType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ConfLoc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfLoc(ConfLocType newConfLoc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ConfLoc(), newConfLoc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfLoc(ConfLocType newConfLoc) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ConfLoc(), newConfLoc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfNameType getConfName() {
		return (ConfNameType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ConfName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfName(ConfNameType newConfName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ConfName(), newConfName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfName(ConfNameType newConfName) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ConfName(), newConfName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfNumType getConfNum() {
		return (ConfNumType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ConfNum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfNum(ConfNumType newConfNum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ConfNum(), newConfNum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfNum(ConfNumType newConfNum) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ConfNum(), newConfNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfSponsorType getConfSponsor() {
		return (ConfSponsorType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ConfSponsor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfSponsor(ConfSponsorType newConfSponsor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ConfSponsor(), newConfSponsor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfSponsor(ConfSponsorType newConfSponsor) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ConfSponsor(), newConfSponsor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfThemeType getConfTheme() {
		return (ConfThemeType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ConfTheme(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfTheme(ConfThemeType newConfTheme, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ConfTheme(), newConfTheme, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfTheme(ConfThemeType newConfTheme) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ConfTheme(), newConfTheme);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConferenceType getConference() {
		return (ConferenceType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Conference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConference(ConferenceType newConference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Conference(), newConference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConference(ConferenceType newConference) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Conference(), newConference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContribType getContrib() {
		return (ContribType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Contrib(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContrib(ContribType newContrib, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Contrib(), newContrib, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContrib(ContribType newContrib) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Contrib(), newContrib);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContribGroupType getContribGroup() {
		return (ContribGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ContribGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContribGroup(ContribGroupType newContribGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ContribGroup(), newContribGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContribGroup(ContribGroupType newContribGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ContribGroup(), newContribGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContribIdType getContribId() {
		return (ContribIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ContribId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContribId(ContribIdType newContribId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ContribId(), newContribId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContribId(ContribIdType newContribId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ContribId(), newContribId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContributedResourceGroupType getContributedResourceGroup() {
		return (ContributedResourceGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ContributedResourceGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributedResourceGroup(ContributedResourceGroupType newContributedResourceGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ContributedResourceGroup(), newContributedResourceGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContributedResourceGroup(ContributedResourceGroupType newContributedResourceGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ContributedResourceGroup(), newContributedResourceGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyrightHolderType getCopyrightHolder() {
		return (CopyrightHolderType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CopyrightHolder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyrightHolder(CopyrightHolderType newCopyrightHolder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CopyrightHolder(), newCopyrightHolder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyrightHolder(CopyrightHolderType newCopyrightHolder) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CopyrightHolder(), newCopyrightHolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyrightStatementType getCopyrightStatement() {
		return (CopyrightStatementType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CopyrightStatement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyrightStatement(CopyrightStatementType newCopyrightStatement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CopyrightStatement(), newCopyrightStatement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyrightStatement(CopyrightStatementType newCopyrightStatement) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CopyrightStatement(), newCopyrightStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyrightYearType getCopyrightYear() {
		return (CopyrightYearType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CopyrightYear(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyrightYear(CopyrightYearType newCopyrightYear, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CopyrightYear(), newCopyrightYear, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyrightYear(CopyrightYearType newCopyrightYear) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CopyrightYear(), newCopyrightYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrespType getCorresp() {
		return (CorrespType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Corresp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorresp(CorrespType newCorresp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Corresp(), newCorresp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorresp(CorrespType newCorresp) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Corresp(), newCorresp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountType getCount() {
		return (CountType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Count(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(CountType newCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Count(), newCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(CountType newCount) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Count(), newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryType getCountry() {
		return (CountryType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Country(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(CountryType newCountry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Country(), newCountry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(CountryType newCountry) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Country(), newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountsType getCounts() {
		return (CountsType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Counts(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounts(CountsType newCounts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Counts(), newCounts, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounts(CountsType newCounts) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Counts(), newCounts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMetaType getCustomMeta() {
		return (CustomMetaType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CustomMeta(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomMeta(CustomMetaType newCustomMeta, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CustomMeta(), newCustomMeta, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMeta(CustomMetaType newCustomMeta) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CustomMeta(), newCustomMeta);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMetaGroupType getCustomMetaGroup() {
		return (CustomMetaGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_CustomMetaGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomMetaGroup(CustomMetaGroupType newCustomMetaGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_CustomMetaGroup(), newCustomMetaGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMetaGroup(CustomMetaGroupType newCustomMetaGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_CustomMetaGroup(), newCustomMetaGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTitleType getDataTitle() {
		return (DataTitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_DataTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTitle(DataTitleType newDataTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_DataTitle(), newDataTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTitle(DataTitleType newDataTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_DataTitle(), newDataTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateType getDate() {
		return (DateType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Date(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateType newDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Date(), newDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(DateType newDate) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Date(), newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateInCitationType getDateInCitation() {
		return (DateInCitationType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_DateInCitation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateInCitation(DateInCitationType newDateInCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_DateInCitation(), newDateInCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateInCitation(DateInCitationType newDateInCitation) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_DateInCitation(), newDateInCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DayType getDay() {
		return (DayType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Day(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDay(DayType newDay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Day(), newDay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(DayType newDay) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Day(), newDay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefType getDef() {
		return (DefType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Def(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDef(DefType newDef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Def(), newDef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDef(DefType newDef) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Def(), newDef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefHeadType getDefHead() {
		return (DefHeadType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_DefHead(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefHead(DefHeadType newDefHead, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_DefHead(), newDefHead, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefHead(DefHeadType newDefHead) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_DefHead(), newDefHead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefItemType getDefItem() {
		return (DefItemType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_DefItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefItem(DefItemType newDefItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_DefItem(), newDefItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefItem(DefItemType newDefItem) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_DefItem(), newDefItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefListType getDefList() {
		return (DefListType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_DefList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefList(DefListType newDefList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_DefList(), newDefList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefList(DefListType newDefList) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_DefList(), newDefList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreesType getDegrees() {
		return (DegreesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Degrees(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegrees(DegreesType newDegrees, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Degrees(), newDegrees, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegrees(DegreesType newDegrees) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Degrees(), newDegrees);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DispFormulaType getDispFormula() {
		return (DispFormulaType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_DispFormula(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispFormula(DispFormulaType newDispFormula, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_DispFormula(), newDispFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDispFormula(DispFormulaType newDispFormula) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_DispFormula(), newDispFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DispFormulaGroupType getDispFormulaGroup() {
		return (DispFormulaGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_DispFormulaGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispFormulaGroup(DispFormulaGroupType newDispFormulaGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_DispFormulaGroup(), newDispFormulaGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDispFormulaGroup(DispFormulaGroupType newDispFormulaGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_DispFormulaGroup(), newDispFormulaGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DispQuoteType getDispQuote() {
		return (DispQuoteType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_DispQuote(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispQuote(DispQuoteType newDispQuote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_DispQuote(), newDispQuote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDispQuote(DispQuoteType newDispQuote) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_DispQuote(), newDispQuote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditionType getEdition() {
		return (EditionType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Edition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdition(EditionType newEdition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Edition(), newEdition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdition(EditionType newEdition) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Edition(), newEdition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementCitationType getElementCitation() {
		return (ElementCitationType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ElementCitation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementCitation(ElementCitationType newElementCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ElementCitation(), newElementCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementCitation(ElementCitationType newElementCitation) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ElementCitation(), newElementCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElocationIdType getElocationId() {
		return (ElocationIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ElocationId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElocationId(ElocationIdType newElocationId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ElocationId(), newElocationId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElocationId(ElocationIdType newElocationId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ElocationId(), newElocationId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailType getEmail() {
		return (EmailType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Email(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmail(EmailType newEmail, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Email(), newEmail, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(EmailType newEmail) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Email(), newEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EquationCountType getEquationCount() {
		return (EquationCountType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_EquationCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquationCount(EquationCountType newEquationCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_EquationCount(), newEquationCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEquationCount(EquationCountType newEquationCount) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_EquationCount(), newEquationCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EraType getEra() {
		return (EraType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Era(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEra(EraType newEra, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Era(), newEra, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEra(EraType newEra) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Era(), newEra);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtalType getEtal() {
		return (EtalType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Etal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtal(EtalType newEtal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Etal(), newEtal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEtal(EtalType newEtal) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Etal(), newEtal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventType getEvent() {
		return (EventType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Event(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(EventType newEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Event(), newEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvent(EventType newEvent) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Event(), newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDescType getEventDesc() {
		return (EventDescType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_EventDesc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventDesc(EventDescType newEventDesc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_EventDesc(), newEventDesc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventDesc(EventDescType newEventDesc) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_EventDesc(), newEventDesc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtLinkType getExtLink() {
		return (ExtLinkType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ExtLink(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtLink(ExtLinkType newExtLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ExtLink(), newExtLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtLink(ExtLinkType newExtLink) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ExtLink(), newExtLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaxType getFax() {
		return (FaxType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Fax(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFax(FaxType newFax, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Fax(), newFax, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFax(FaxType newFax) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Fax(), newFax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigType getFig() {
		return (FigType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Fig(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFig(FigType newFig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Fig(), newFig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFig(FigType newFig) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Fig(), newFig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigCountType getFigCount() {
		return (FigCountType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_FigCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigCount(FigCountType newFigCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_FigCount(), newFigCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFigCount(FigCountType newFigCount) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_FigCount(), newFigCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigGroupType getFigGroup() {
		return (FigGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_FigGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigGroup(FigGroupType newFigGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_FigGroup(), newFigGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFigGroup(FigGroupType newFigGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_FigGroup(), newFigGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedCaseType getFixedCase() {
		return (FixedCaseType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_FixedCase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedCase(FixedCaseType newFixedCase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_FixedCase(), newFixedCase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedCase(FixedCaseType newFixedCase) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_FixedCase(), newFixedCase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatsGroupType getFloatsGroup() {
		return (FloatsGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_FloatsGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatsGroup(FloatsGroupType newFloatsGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_FloatsGroup(), newFloatsGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloatsGroup(FloatsGroupType newFloatsGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_FloatsGroup(), newFloatsGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FnType getFn() {
		return (FnType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Fn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFn(FnType newFn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Fn(), newFn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFn(FnType newFn) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Fn(), newFn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FnGroupType getFnGroup() {
		return (FnGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_FnGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFnGroup(FnGroupType newFnGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_FnGroup(), newFnGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFnGroup(FnGroupType newFnGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_FnGroup(), newFnGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FpageType getFpage() {
		return (FpageType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Fpage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFpage(FpageType newFpage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Fpage(), newFpage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFpage(FpageType newFpage) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Fpage(), newFpage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontType getFront() {
		return (FrontType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Front(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFront(FrontType newFront, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Front(), newFront, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFront(FrontType newFront) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Front(), newFront);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontStubType getFrontStub() {
		return (FrontStubType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_FrontStub(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrontStub(FrontStubType newFrontStub, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_FrontStub(), newFrontStub, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrontStub(FrontStubType newFrontStub) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_FrontStub(), newFrontStub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FundingGroupType getFundingGroup() {
		return (FundingGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_FundingGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundingGroup(FundingGroupType newFundingGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_FundingGroup(), newFundingGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFundingGroup(FundingGroupType newFundingGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_FundingGroup(), newFundingGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FundingSourceType getFundingSource() {
		return (FundingSourceType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_FundingSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundingSource(FundingSourceType newFundingSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_FundingSource(), newFundingSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFundingSource(FundingSourceType newFundingSource) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_FundingSource(), newFundingSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FundingStatementType getFundingStatement() {
		return (FundingStatementType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_FundingStatement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundingStatement(FundingStatementType newFundingStatement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_FundingStatement(), newFundingStatement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFundingStatement(FundingStatementType newFundingStatement) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_FundingStatement(), newFundingStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GivenNamesType getGivenNames() {
		return (GivenNamesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_GivenNames(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGivenNames(GivenNamesType newGivenNames, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_GivenNames(), newGivenNames, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGivenNames(GivenNamesType newGivenNames) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_GivenNames(), newGivenNames);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossaryType getGlossary() {
		return (GlossaryType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Glossary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossary(GlossaryType newGlossary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Glossary(), newGlossary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlossary(GlossaryType newGlossary) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Glossary(), newGlossary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlyphDataType getGlyphData() {
		return (GlyphDataType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_GlyphData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlyphData(GlyphDataType newGlyphData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_GlyphData(), newGlyphData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlyphData(GlyphDataType newGlyphData) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_GlyphData(), newGlyphData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlyphRefType getGlyphRef() {
		return (GlyphRefType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_GlyphRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlyphRef(GlyphRefType newGlyphRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_GlyphRef(), newGlyphRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlyphRef(GlyphRefType newGlyphRef) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_GlyphRef(), newGlyphRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GovType getGov() {
		return (GovType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Gov(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGov(GovType newGov, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Gov(), newGov, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGov(GovType newGov) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Gov(), newGov);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicType getGraphic() {
		return (GraphicType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Graphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphic(GraphicType newGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Graphic(), newGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraphic(GraphicType newGraphic) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Graphic(), newGraphic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryType getHistory() {
		return (HistoryType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_History(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistory(HistoryType newHistory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_History(), newHistory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistory(HistoryType newHistory) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_History(), newHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HrType getHr() {
		return (HrType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Hr(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHr(HrType newHr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Hr(), newHr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHr(HrType newHr) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Hr(), newHr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexTermType getIndexTerm() {
		return (IndexTermType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_IndexTerm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexTerm(IndexTermType newIndexTerm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_IndexTerm(), newIndexTerm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexTerm(IndexTermType newIndexTerm) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_IndexTerm(), newIndexTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexTermRangeEndType getIndexTermRangeEnd() {
		return (IndexTermRangeEndType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_IndexTermRangeEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexTermRangeEnd(IndexTermRangeEndType newIndexTermRangeEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_IndexTermRangeEnd(), newIndexTermRangeEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexTermRangeEnd(IndexTermRangeEndType newIndexTermRangeEnd) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_IndexTermRangeEnd(), newIndexTermRangeEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineFormulaType getInlineFormula() {
		return (InlineFormulaType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_InlineFormula(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInlineFormula(InlineFormulaType newInlineFormula, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_InlineFormula(), newInlineFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInlineFormula(InlineFormulaType newInlineFormula) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_InlineFormula(), newInlineFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineGraphicType getInlineGraphic() {
		return (InlineGraphicType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_InlineGraphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInlineGraphic(InlineGraphicType newInlineGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_InlineGraphic(), newInlineGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInlineGraphic(InlineGraphicType newInlineGraphic) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_InlineGraphic(), newInlineGraphic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineMediaType getInlineMedia() {
		return (InlineMediaType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_InlineMedia(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInlineMedia(InlineMediaType newInlineMedia, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_InlineMedia(), newInlineMedia, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInlineMedia(InlineMediaType newInlineMedia) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_InlineMedia(), newInlineMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineSupplementaryMaterialType getInlineSupplementaryMaterial() {
		return (InlineSupplementaryMaterialType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_InlineSupplementaryMaterial(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInlineSupplementaryMaterial(InlineSupplementaryMaterialType newInlineSupplementaryMaterial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_InlineSupplementaryMaterial(), newInlineSupplementaryMaterial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInlineSupplementaryMaterial(InlineSupplementaryMaterialType newInlineSupplementaryMaterial) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_InlineSupplementaryMaterial(), newInlineSupplementaryMaterial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstitutionType getInstitution() {
		return (InstitutionType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Institution(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstitution(InstitutionType newInstitution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Institution(), newInstitution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitution(InstitutionType newInstitution) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Institution(), newInstitution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstitutionIdType getInstitutionId() {
		return (InstitutionIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_InstitutionId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstitutionId(InstitutionIdType newInstitutionId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_InstitutionId(), newInstitutionId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitutionId(InstitutionIdType newInstitutionId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_InstitutionId(), newInstitutionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstitutionWrapType getInstitutionWrap() {
		return (InstitutionWrapType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_InstitutionWrap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstitutionWrap(InstitutionWrapType newInstitutionWrap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_InstitutionWrap(), newInstitutionWrap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitutionWrap(InstitutionWrapType newInstitutionWrap) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_InstitutionWrap(), newInstitutionWrap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsbnType getIsbn() {
		return (IsbnType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Isbn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsbn(IsbnType newIsbn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Isbn(), newIsbn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsbn(IsbnType newIsbn) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Isbn(), newIsbn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssnType getIssn() {
		return (IssnType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Issn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssn(IssnType newIssn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Issn(), newIssn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssn(IssnType newIssn) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Issn(), newIssn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssnLType getIssnL() {
		return (IssnLType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_IssnL(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssnL(IssnLType newIssnL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_IssnL(), newIssnL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssnL(IssnLType newIssnL) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_IssnL(), newIssnL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueType getIssue() {
		return (IssueType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Issue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssue(IssueType newIssue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Issue(), newIssue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssue(IssueType newIssue) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Issue(), newIssue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueIdType getIssueId() {
		return (IssueIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_IssueId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssueId(IssueIdType newIssueId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_IssueId(), newIssueId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueId(IssueIdType newIssueId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_IssueId(), newIssueId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssuePartType getIssuePart() {
		return (IssuePartType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_IssuePart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuePart(IssuePartType newIssuePart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_IssuePart(), newIssuePart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuePart(IssuePartType newIssuePart) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_IssuePart(), newIssuePart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueSponsorType getIssueSponsor() {
		return (IssueSponsorType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_IssueSponsor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssueSponsor(IssueSponsorType newIssueSponsor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_IssueSponsor(), newIssueSponsor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueSponsor(IssueSponsorType newIssueSponsor) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_IssueSponsor(), newIssueSponsor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueTitleType getIssueTitle() {
		return (IssueTitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_IssueTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssueTitle(IssueTitleType newIssueTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_IssueTitle(), newIssueTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueTitle(IssueTitleType newIssueTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_IssueTitle(), newIssueTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItalicType getItalic() {
		return (ItalicType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Italic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItalic(ItalicType newItalic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Italic(), newItalic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItalic(ItalicType newItalic) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Italic(), newItalic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalIdType getJournalId() {
		return (JournalIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_JournalId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalId(JournalIdType newJournalId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_JournalId(), newJournalId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalId(JournalIdType newJournalId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_JournalId(), newJournalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalMetaType getJournalMeta() {
		return (JournalMetaType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_JournalMeta(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalMeta(JournalMetaType newJournalMeta, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_JournalMeta(), newJournalMeta, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalMeta(JournalMetaType newJournalMeta) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_JournalMeta(), newJournalMeta);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalSubtitleType getJournalSubtitle() {
		return (JournalSubtitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_JournalSubtitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalSubtitle(JournalSubtitleType newJournalSubtitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_JournalSubtitle(), newJournalSubtitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalSubtitle(JournalSubtitleType newJournalSubtitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_JournalSubtitle(), newJournalSubtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalTitleType getJournalTitle() {
		return (JournalTitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_JournalTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalTitle(JournalTitleType newJournalTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_JournalTitle(), newJournalTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalTitle(JournalTitleType newJournalTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_JournalTitle(), newJournalTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalTitleGroupType getJournalTitleGroup() {
		return (JournalTitleGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_JournalTitleGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalTitleGroup(JournalTitleGroupType newJournalTitleGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_JournalTitleGroup(), newJournalTitleGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalTitleGroup(JournalTitleGroupType newJournalTitleGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_JournalTitleGroup(), newJournalTitleGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KwdType getKwd() {
		return (KwdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Kwd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKwd(KwdType newKwd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Kwd(), newKwd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKwd(KwdType newKwd) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Kwd(), newKwd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KwdGroupType getKwdGroup() {
		return (KwdGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_KwdGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKwdGroup(KwdGroupType newKwdGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_KwdGroup(), newKwdGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKwdGroup(KwdGroupType newKwdGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_KwdGroup(), newKwdGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType getLabel() {
		return (LabelType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Label(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType newLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Label(), newLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(LabelType newLabel) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Label(), newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseType getLicense() {
		return (LicenseType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_License(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicense(LicenseType newLicense, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_License(), newLicense, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicense(LicenseType newLicense) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_License(), newLicense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicensePType getLicenseP() {
		return (LicensePType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_LicenseP(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicenseP(LicensePType newLicenseP, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_LicenseP(), newLicenseP, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicenseP(LicensePType newLicenseP) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_LicenseP(), newLicenseP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListType getList() {
		return (ListType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_List(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(ListType newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_List(), newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setList(ListType newList) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_List(), newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListItemType getListItem() {
		return (ListItemType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ListItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListItem(ListItemType newListItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ListItem(), newListItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListItem(ListItemType newListItem) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ListItem(), newListItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongDescType getLongDesc() {
		return (LongDescType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_LongDesc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongDesc(LongDescType newLongDesc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_LongDesc(), newLongDesc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongDesc(LongDescType newLongDesc) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_LongDesc(), newLongDesc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LpageType getLpage() {
		return (LpageType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Lpage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpage(LpageType newLpage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Lpage(), newLpage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLpage(LpageType newLpage) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Lpage(), newLpage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediaType getMedia() {
		return (MediaType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Media(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedia(MediaType newMedia, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Media(), newMedia, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedia(MediaType newMedia) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Media(), newMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaNameType getMetaName() {
		return (MetaNameType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_MetaName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaName(MetaNameType newMetaName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_MetaName(), newMetaName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaName(MetaNameType newMetaName) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_MetaName(), newMetaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaValueType getMetaValue() {
		return (MetaValueType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_MetaValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaValue(MetaValueType newMetaValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_MetaValue(), newMetaValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaValue(MetaValueType newMetaValue) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_MetaValue(), newMetaValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MilestoneEndType getMilestoneEnd() {
		return (MilestoneEndType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_MilestoneEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMilestoneEnd(MilestoneEndType newMilestoneEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_MilestoneEnd(), newMilestoneEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMilestoneEnd(MilestoneEndType newMilestoneEnd) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_MilestoneEnd(), newMilestoneEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MilestoneStartType getMilestoneStart() {
		return (MilestoneStartType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_MilestoneStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMilestoneStart(MilestoneStartType newMilestoneStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_MilestoneStart(), newMilestoneStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMilestoneStart(MilestoneStartType newMilestoneStart) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_MilestoneStart(), newMilestoneStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixedCitationType getMixedCitation() {
		return (MixedCitationType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_MixedCitation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMixedCitation(MixedCitationType newMixedCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_MixedCitation(), newMixedCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMixedCitation(MixedCitationType newMixedCitation) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_MixedCitation(), newMixedCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonospaceType getMonospace() {
		return (MonospaceType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Monospace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonospace(MonospaceType newMonospace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Monospace(), newMonospace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonospace(MonospaceType newMonospace) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Monospace(), newMonospace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonthType getMonth() {
		return (MonthType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Month(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonth(MonthType newMonth, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Month(), newMonth, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonth(MonthType newMonth) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Month(), newMonth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameType getName() {
		return (NameType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType newName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Name(), newName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(NameType newName) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameAlternativesType getNameAlternatives() {
		return (NameAlternativesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_NameAlternatives(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameAlternatives(NameAlternativesType newNameAlternatives, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_NameAlternatives(), newNameAlternatives, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameAlternatives(NameAlternativesType newNameAlternatives) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_NameAlternatives(), newNameAlternatives);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedContentType getNamedContent() {
		return (NamedContentType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_NamedContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedContent(NamedContentType newNamedContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_NamedContent(), newNamedContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamedContent(NamedContentType newNamedContent) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_NamedContent(), newNamedContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedKwdType getNestedKwd() {
		return (NestedKwdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_NestedKwd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedKwd(NestedKwdType newNestedKwd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_NestedKwd(), newNestedKwd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNestedKwd(NestedKwdType newNestedKwd) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_NestedKwd(), newNestedKwd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NlmCitationType getNlmCitation() {
		return (NlmCitationType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_NlmCitation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNlmCitation(NlmCitationType newNlmCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_NlmCitation(), newNlmCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNlmCitation(NlmCitationType newNlmCitation) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_NlmCitation(), newNlmCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteType getNote() {
		return (NoteType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Note(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(NoteType newNote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Note(), newNote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNote(NoteType newNote) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Note(), newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotesType getNotes() {
		return (NotesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Notes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(NotesType newNotes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Notes(), newNotes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotes(NotesType newNotes) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Notes(), newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectIdType getObjectId() {
		return (ObjectIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ObjectId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectId(ObjectIdType newObjectId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ObjectId(), newObjectId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectId(ObjectIdType newObjectId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ObjectId(), newObjectId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnBehalfOfType getOnBehalfOf() {
		return (OnBehalfOfType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_OnBehalfOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnBehalfOf(OnBehalfOfType newOnBehalfOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_OnBehalfOf(), newOnBehalfOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnBehalfOf(OnBehalfOfType newOnBehalfOf) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_OnBehalfOf(), newOnBehalfOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAccessType getOpenAccess() {
		return (OpenAccessType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_OpenAccess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenAccess(OpenAccessType newOpenAccess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_OpenAccess(), newOpenAccess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenAccess(OpenAccessType newOpenAccess) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_OpenAccess(), newOpenAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlineType getOverline() {
		return (OverlineType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Overline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverline(OverlineType newOverline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Overline(), newOverline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverline(OverlineType newOverline) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Overline(), newOverline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlineEndType getOverlineEnd() {
		return (OverlineEndType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_OverlineEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverlineEnd(OverlineEndType newOverlineEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_OverlineEnd(), newOverlineEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverlineEnd(OverlineEndType newOverlineEnd) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_OverlineEnd(), newOverlineEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlineStartType getOverlineStart() {
		return (OverlineStartType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_OverlineStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverlineStart(OverlineStartType newOverlineStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_OverlineStart(), newOverlineStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverlineStart(OverlineStartType newOverlineStart) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_OverlineStart(), newOverlineStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PType getP() {
		return (PType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_P(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(PType newP, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_P(), newP, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP(PType newP) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_P(), newP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageCountType getPageCount() {
		return (PageCountType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PageCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageCount(PageCountType newPageCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PageCount(), newPageCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageCount(PageCountType newPageCount) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PageCount(), newPageCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageRangeType getPageRange() {
		return (PageRangeType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PageRange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageRange(PageRangeType newPageRange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PageRange(), newPageRange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageRange(PageRangeType newPageRange) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PageRange(), newPageRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartTitleType getPartTitle() {
		return (PartTitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PartTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartTitle(PartTitleType newPartTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PartTitle(), newPartTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartTitle(PartTitleType newPartTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PartTitle(), newPartTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatentType getPatent() {
		return (PatentType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Patent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatent(PatentType newPatent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Patent(), newPatent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatent(PatentType newPatent) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Patent(), newPatent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsType getPermissions() {
		return (PermissionsType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Permissions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermissions(PermissionsType newPermissions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Permissions(), newPermissions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissions(PermissionsType newPermissions) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Permissions(), newPermissions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonGroupType getPersonGroup() {
		return (PersonGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PersonGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonGroup(PersonGroupType newPersonGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PersonGroup(), newPersonGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonGroup(PersonGroupType newPersonGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PersonGroup(), newPersonGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhoneType getPhone() {
		return (PhoneType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Phone(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone(PhoneType newPhone, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Phone(), newPhone, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone(PhoneType newPhone) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Phone(), newPhone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalCodeType getPostalCode() {
		return (PostalCodeType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PostalCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalCode(PostalCodeType newPostalCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PostalCode(), newPostalCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(PostalCodeType newPostalCode) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PostalCode(), newPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixType getPrefix() {
		return (PrefixType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Prefix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(PrefixType newPrefix, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Prefix(), newPrefix, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(PrefixType newPrefix) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Prefix(), newPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreformatType getPreformat() {
		return (PreformatType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Preformat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreformat(PreformatType newPreformat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Preformat(), newPreformat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreformat(PreformatType newPreformat) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Preformat(), newPreformat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriceType getPrice() {
		return (PriceType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Price(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrice(PriceType newPrice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Price(), newPrice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(PriceType newPrice) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Price(), newPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrincipalAwardRecipientType getPrincipalAwardRecipient() {
		return (PrincipalAwardRecipientType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PrincipalAwardRecipient(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrincipalAwardRecipient(PrincipalAwardRecipientType newPrincipalAwardRecipient, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PrincipalAwardRecipient(), newPrincipalAwardRecipient, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrincipalAwardRecipient(PrincipalAwardRecipientType newPrincipalAwardRecipient) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PrincipalAwardRecipient(), newPrincipalAwardRecipient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrincipalInvestigatorType getPrincipalInvestigator() {
		return (PrincipalInvestigatorType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PrincipalInvestigator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrincipalInvestigator(PrincipalInvestigatorType newPrincipalInvestigator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PrincipalInvestigator(), newPrincipalInvestigator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrincipalInvestigator(PrincipalInvestigatorType newPrincipalInvestigator) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PrincipalInvestigator(), newPrincipalInvestigator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateCharType getPrivateChar() {
		return (PrivateCharType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PrivateChar(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrivateChar(PrivateCharType newPrivateChar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PrivateChar(), newPrivateChar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateChar(PrivateCharType newPrivateChar) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PrivateChar(), newPrivateChar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductType getProduct() {
		return (ProductType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Product(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(ProductType newProduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Product(), newProduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(ProductType newProduct) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Product(), newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubDateType getPubDate() {
		return (PubDateType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PubDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubDate(PubDateType newPubDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PubDate(), newPubDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubDate(PubDateType newPubDate) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PubDate(), newPubDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubDateNotAvailableType getPubDateNotAvailable() {
		return (PubDateNotAvailableType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PubDateNotAvailable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubDateNotAvailable(PubDateNotAvailableType newPubDateNotAvailable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PubDateNotAvailable(), newPubDateNotAvailable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubDateNotAvailable(PubDateNotAvailableType newPubDateNotAvailable) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PubDateNotAvailable(), newPubDateNotAvailable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubHistoryType getPubHistory() {
		return (PubHistoryType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PubHistory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubHistory(PubHistoryType newPubHistory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PubHistory(), newPubHistory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubHistory(PubHistoryType newPubHistory) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PubHistory(), newPubHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubIdType getPubId() {
		return (PubIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PubId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubId(PubIdType newPubId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PubId(), newPubId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubId(PubIdType newPubId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PubId(), newPubId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherType getPublisher() {
		return (PublisherType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Publisher(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(PublisherType newPublisher, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Publisher(), newPublisher, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(PublisherType newPublisher) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Publisher(), newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherLocType getPublisherLoc() {
		return (PublisherLocType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PublisherLoc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisherLoc(PublisherLocType newPublisherLoc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PublisherLoc(), newPublisherLoc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisherLoc(PublisherLocType newPublisherLoc) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PublisherLoc(), newPublisherLoc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherNameType getPublisherName() {
		return (PublisherNameType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_PublisherName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisherName(PublisherNameType newPublisherName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_PublisherName(), newPublisherName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisherName(PublisherNameType newPublisherName) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_PublisherName(), newPublisherName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RbType getRb() {
		return (RbType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Rb(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRb(RbType newRb, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Rb(), newRb, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRb(RbType newRb) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Rb(), newRb);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefType getRef() {
		return (RefType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Ref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRef(RefType newRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Ref(), newRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(RefType newRef) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Ref(), newRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefCountType getRefCount() {
		return (RefCountType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_RefCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefCount(RefCountType newRefCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_RefCount(), newRefCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefCount(RefCountType newRefCount) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_RefCount(), newRefCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefListType getRefList() {
		return (RefListType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_RefList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefList(RefListType newRefList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_RefList(), newRefList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefList(RefListType newRefList) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_RefList(), newRefList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedArticleType getRelatedArticle() {
		return (RelatedArticleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_RelatedArticle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedArticle(RelatedArticleType newRelatedArticle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_RelatedArticle(), newRelatedArticle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedArticle(RelatedArticleType newRelatedArticle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_RelatedArticle(), newRelatedArticle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedObjectType getRelatedObject() {
		return (RelatedObjectType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_RelatedObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedObject(RelatedObjectType newRelatedObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_RelatedObject(), newRelatedObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedObject(RelatedObjectType newRelatedObject) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_RelatedObject(), newRelatedObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceGroupType getResourceGroup() {
		return (ResourceGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ResourceGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceGroup(ResourceGroupType newResourceGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ResourceGroup(), newResourceGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceGroup(ResourceGroupType newResourceGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ResourceGroup(), newResourceGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceIdType getResourceId() {
		return (ResourceIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ResourceId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceId(ResourceIdType newResourceId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ResourceId(), newResourceId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceId(ResourceIdType newResourceId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ResourceId(), newResourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceNameType getResourceName() {
		return (ResourceNameType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ResourceName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceName(ResourceNameType newResourceName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ResourceName(), newResourceName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceName(ResourceNameType newResourceName) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ResourceName(), newResourceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceWrapType getResourceWrap() {
		return (ResourceWrapType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_ResourceWrap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceWrap(ResourceWrapType newResourceWrap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_ResourceWrap(), newResourceWrap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceWrap(ResourceWrapType newResourceWrap) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_ResourceWrap(), newResourceWrap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseType getResponse() {
		return (ResponseType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Response(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(ResponseType newResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Response(), newResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponse(ResponseType newResponse) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Response(), newResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRole() {
		return (RoleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Role(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(RoleType newRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Role(), newRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(RoleType newRole) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Role(), newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RomanType getRoman() {
		return (RomanType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Roman(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoman(RomanType newRoman, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Roman(), newRoman, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoman(RomanType newRoman) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Roman(), newRoman);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RpType getRp() {
		return (RpType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Rp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRp(RpType newRp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Rp(), newRp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRp(RpType newRp) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Rp(), newRp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RtType getRt() {
		return (RtType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Rt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRt(RtType newRt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Rt(), newRt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRt(RtType newRt) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Rt(), newRt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RubyType getRuby() {
		return (RubyType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Ruby(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuby(RubyType newRuby, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Ruby(), newRuby, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuby(RubyType newRuby) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Ruby(), newRuby);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SansSerifType getSansSerif() {
		return (SansSerifType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SansSerif(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSansSerif(SansSerifType newSansSerif, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SansSerif(), newSansSerif, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSansSerif(SansSerifType newSansSerif) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SansSerif(), newSansSerif);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScType getSc() {
		return (ScType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Sc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSc(ScType newSc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Sc(), newSc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSc(ScType newSc) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Sc(), newSc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeasonType getSeason() {
		return (SeasonType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Season(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(SeasonType newSeason, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Season(), newSeason, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeason(SeasonType newSeason) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Season(), newSeason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecType getSec() {
		return (SecType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Sec(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSec(SecType newSec, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Sec(), newSec, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSec(SecType newSec) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Sec(), newSec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecMetaType getSecMeta() {
		return (SecMetaType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SecMeta(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecMeta(SecMetaType newSecMeta, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SecMeta(), newSecMeta, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecMeta(SecMetaType newSecMeta) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SecMeta(), newSecMeta);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeeType getSee() {
		return (SeeType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_See(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSee(SeeType newSee, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_See(), newSee, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSee(SeeType newSee) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_See(), newSee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeeAlsoType getSeeAlso() {
		return (SeeAlsoType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SeeAlso(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeeAlso(SeeAlsoType newSeeAlso, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SeeAlso(), newSeeAlso, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeeAlso(SeeAlsoType newSeeAlso) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SeeAlso(), newSeeAlso);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfUriType getSelfUri() {
		return (SelfUriType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SelfUri(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelfUri(SelfUriType newSelfUri, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SelfUri(), newSelfUri, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelfUri(SelfUriType newSelfUri) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SelfUri(), newSelfUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesType getSeries() {
		return (SeriesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Series(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(SeriesType newSeries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Series(), newSeries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeries(SeriesType newSeries) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Series(), newSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesTextType getSeriesText() {
		return (SeriesTextType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SeriesText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesText(SeriesTextType newSeriesText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SeriesText(), newSeriesText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeriesText(SeriesTextType newSeriesText) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SeriesText(), newSeriesText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesTitleType getSeriesTitle() {
		return (SeriesTitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SeriesTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesTitle(SeriesTitleType newSeriesTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SeriesTitle(), newSeriesTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeriesTitle(SeriesTitleType newSeriesTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SeriesTitle(), newSeriesTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SigType getSig() {
		return (SigType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Sig(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSig(SigType newSig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Sig(), newSig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSig(SigType newSig) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Sig(), newSig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SigBlockType getSigBlock() {
		return (SigBlockType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SigBlock(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSigBlock(SigBlockType newSigBlock, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SigBlock(), newSigBlock, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSigBlock(SigBlockType newSigBlock) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SigBlock(), newSigBlock);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizeType getSize() {
		return (SizeType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Size(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(SizeType newSize, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Size(), newSize, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(SizeType newSize) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Size(), newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceType getSource() {
		return (SourceType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Source(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SourceType newSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Source(), newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(SourceType newSource) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Source(), newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeakerType getSpeaker() {
		return (SpeakerType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Speaker(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeaker(SpeakerType newSpeaker, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Speaker(), newSpeaker, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeaker(SpeakerType newSpeaker) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Speaker(), newSpeaker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechType getSpeech() {
		return (SpeechType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Speech(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeech(SpeechType newSpeech, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Speech(), newSpeech, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeech(SpeechType newSpeech) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Speech(), newSpeech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateType getState() {
		return (StateType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_State(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(StateType newState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_State(), newState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(StateType newState) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_State(), newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatementType getStatement() {
		return (StatementType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Statement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement(StatementType newStatement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Statement(), newStatement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatement(StatementType newStatement) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Statement(), newStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdType getStd() {
		return (StdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Std(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStd(StdType newStd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Std(), newStd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStd(StdType newStd) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Std(), newStd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdOrganizationType getStdOrganization() {
		return (StdOrganizationType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_StdOrganization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStdOrganization(StdOrganizationType newStdOrganization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_StdOrganization(), newStdOrganization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdOrganization(StdOrganizationType newStdOrganization) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_StdOrganization(), newStdOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrikeType getStrike() {
		return (StrikeType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Strike(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrike(StrikeType newStrike, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Strike(), newStrike, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrike(StrikeType newStrike) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Strike(), newStrike);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringConfType getStringConf() {
		return (StringConfType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_StringConf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringConf(StringConfType newStringConf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_StringConf(), newStringConf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringConf(StringConfType newStringConf) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_StringConf(), newStringConf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringDateType getStringDate() {
		return (StringDateType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_StringDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringDate(StringDateType newStringDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_StringDate(), newStringDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringDate(StringDateType newStringDate) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_StringDate(), newStringDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringNameType getStringName() {
		return (StringNameType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_StringName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringName(StringNameType newStringName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_StringName(), newStringName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringName(StringNameType newStringName) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_StringName(), newStringName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyledContentType getStyledContent() {
		return (StyledContentType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_StyledContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyledContent(StyledContentType newStyledContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_StyledContent(), newStyledContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyledContent(StyledContentType newStyledContent) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_StyledContent(), newStyledContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubType getSub() {
		return (SubType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Sub(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSub(SubType newSub, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Sub(), newSub, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSub(SubType newSub) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Sub(), newSub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubArticleType getSubArticle() {
		return (SubArticleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SubArticle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubArticle(SubArticleType newSubArticle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SubArticle(), newSubArticle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubArticle(SubArticleType newSubArticle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SubArticle(), newSubArticle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjGroupType getSubjGroup() {
		return (SubjGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SubjGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjGroup(SubjGroupType newSubjGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SubjGroup(), newSubjGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjGroup(SubjGroupType newSubjGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SubjGroup(), newSubjGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectType getSubject() {
		return (SubjectType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Subject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(SubjectType newSubject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Subject(), newSubject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(SubjectType newSubject) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Subject(), newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubtitleType getSubtitle() {
		return (SubtitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Subtitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(SubtitleType newSubtitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Subtitle(), newSubtitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtitle(SubtitleType newSubtitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Subtitle(), newSubtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuffixType getSuffix() {
		return (SuffixType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Suffix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuffix(SuffixType newSuffix, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Suffix(), newSuffix, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffix(SuffixType newSuffix) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Suffix(), newSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupType getSup() {
		return (SupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Sup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSup(SupType newSup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Sup(), newSup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSup(SupType newSup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Sup(), newSup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplementType getSupplement() {
		return (SupplementType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Supplement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplement(SupplementType newSupplement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Supplement(), newSupplement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplement(SupplementType newSupplement) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Supplement(), newSupplement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplementaryMaterialType getSupplementaryMaterial() {
		return (SupplementaryMaterialType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SupplementaryMaterial(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplementaryMaterial(SupplementaryMaterialType newSupplementaryMaterial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SupplementaryMaterial(), newSupplementaryMaterial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplementaryMaterial(SupplementaryMaterialType newSupplementaryMaterial) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SupplementaryMaterial(), newSupplementaryMaterial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportDescriptionType getSupportDescription() {
		return (SupportDescriptionType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SupportDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportDescription(SupportDescriptionType newSupportDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SupportDescription(), newSupportDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportDescription(SupportDescriptionType newSupportDescription) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SupportDescription(), newSupportDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportGroupType getSupportGroup() {
		return (SupportGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SupportGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportGroup(SupportGroupType newSupportGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SupportGroup(), newSupportGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportGroup(SupportGroupType newSupportGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SupportGroup(), newSupportGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportSourceType getSupportSource() {
		return (SupportSourceType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_SupportSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportSource(SupportSourceType newSupportSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_SupportSource(), newSupportSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportSource(SupportSourceType newSupportSource) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_SupportSource(), newSupportSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurnameType getSurname() {
		return (SurnameType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Surname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurname(SurnameType newSurname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Surname(), newSurname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurname(SurnameType newSurname) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Surname(), newSurname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableType getTable() {
		return (TableType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Table(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(TableType newTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Table(), newTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTable(TableType newTable) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Table(), newTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCountType getTableCount() {
		return (TableCountType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TableCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableCount(TableCountType newTableCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TableCount(), newTableCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableCount(TableCountType newTableCount) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TableCount(), newTableCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableWrapType getTableWrap() {
		return (TableWrapType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TableWrap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableWrap(TableWrapType newTableWrap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TableWrap(), newTableWrap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableWrap(TableWrapType newTableWrap) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TableWrap(), newTableWrap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableWrapFootType getTableWrapFoot() {
		return (TableWrapFootType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TableWrapFoot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableWrapFoot(TableWrapFootType newTableWrapFoot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TableWrapFoot(), newTableWrapFoot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableWrapFoot(TableWrapFootType newTableWrapFoot) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TableWrapFoot(), newTableWrapFoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableWrapGroupType getTableWrapGroup() {
		return (TableWrapGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TableWrapGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableWrapGroup(TableWrapGroupType newTableWrapGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TableWrapGroup(), newTableWrapGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableWrapGroup(TableWrapGroupType newTableWrapGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TableWrapGroup(), newTableWrapGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetType getTarget() {
		return (TargetType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Target(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetType newTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Target(), newTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TargetType newTarget) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Target(), newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TbodyType getTbody() {
		return (TbodyType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Tbody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTbody(TbodyType newTbody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Tbody(), newTbody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTbody(TbodyType newTbody) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Tbody(), newTbody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TdType getTd() {
		return (TdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Td(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTd(TdType newTd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Td(), newTd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTd(TdType newTd) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Td(), newTd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermType getTerm() {
		return (TermType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Term(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(TermType newTerm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Term(), newTerm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerm(TermType newTerm) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Term(), newTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermHeadType getTermHead() {
		return (TermHeadType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TermHead(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermHead(TermHeadType newTermHead, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TermHead(), newTermHead, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermHead(TermHeadType newTermHead) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TermHead(), newTermHead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TexMathType getTexMath() {
		return (TexMathType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TexMath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTexMath(TexMathType newTexMath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TexMath(), newTexMath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexMath(TexMathType newTexMath) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TexMath(), newTexMath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextualFormType getTextualForm() {
		return (TextualFormType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TextualForm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextualForm(TextualFormType newTextualForm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TextualForm(), newTextualForm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextualForm(TextualFormType newTextualForm) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TextualForm(), newTextualForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TfootType getTfoot() {
		return (TfootType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Tfoot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTfoot(TfootType newTfoot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Tfoot(), newTfoot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTfoot(TfootType newTfoot) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Tfoot(), newTfoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThType getTh() {
		return (ThType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Th(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTh(ThType newTh, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Th(), newTh, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTh(ThType newTh) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Th(), newTh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TheadType getThead() {
		return (TheadType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Thead(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThead(TheadType newThead, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Thead(), newThead, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThead(TheadType newThead) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Thead(), newThead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStampType getTimeStamp() {
		return (TimeStampType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TimeStamp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(TimeStampType newTimeStamp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TimeStamp(), newTimeStamp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStamp(TimeStampType newTimeStamp) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TimeStamp(), newTimeStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitle() {
		return (TitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Title(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Title(), newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(TitleType newTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Title(), newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleGroupType getTitleGroup() {
		return (TitleGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TitleGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitleGroup(TitleGroupType newTitleGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TitleGroup(), newTitleGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleGroup(TitleGroupType newTitleGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TitleGroup(), newTitleGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrType getTr() {
		return (TrType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Tr(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTr(TrType newTr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Tr(), newTr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTr(TrType newTr) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Tr(), newTr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransAbstractType getTransAbstract() {
		return (TransAbstractType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TransAbstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransAbstract(TransAbstractType newTransAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TransAbstract(), newTransAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransAbstract(TransAbstractType newTransAbstract) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TransAbstract(), newTransAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransSourceType getTransSource() {
		return (TransSourceType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TransSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransSource(TransSourceType newTransSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TransSource(), newTransSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransSource(TransSourceType newTransSource) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TransSource(), newTransSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransSubtitleType getTransSubtitle() {
		return (TransSubtitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TransSubtitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransSubtitle(TransSubtitleType newTransSubtitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TransSubtitle(), newTransSubtitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransSubtitle(TransSubtitleType newTransSubtitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TransSubtitle(), newTransSubtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransTitleType getTransTitle() {
		return (TransTitleType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TransTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransTitle(TransTitleType newTransTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TransTitle(), newTransTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransTitle(TransTitleType newTransTitle) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TransTitle(), newTransTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransTitleGroupType getTransTitleGroup() {
		return (TransTitleGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_TransTitleGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransTitleGroup(TransTitleGroupType newTransTitleGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_TransTitleGroup(), newTransTitleGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransTitleGroup(TransTitleGroupType newTransTitleGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_TransTitleGroup(), newTransTitleGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnderlineType getUnderline() {
		return (UnderlineType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Underline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnderline(UnderlineType newUnderline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Underline(), newUnderline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnderline(UnderlineType newUnderline) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Underline(), newUnderline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnderlineEndType getUnderlineEnd() {
		return (UnderlineEndType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_UnderlineEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnderlineEnd(UnderlineEndType newUnderlineEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_UnderlineEnd(), newUnderlineEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnderlineEnd(UnderlineEndType newUnderlineEnd) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_UnderlineEnd(), newUnderlineEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnderlineStartType getUnderlineStart() {
		return (UnderlineStartType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_UnderlineStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnderlineStart(UnderlineStartType newUnderlineStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_UnderlineStart(), newUnderlineStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnderlineStart(UnderlineStartType newUnderlineStart) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_UnderlineStart(), newUnderlineStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredKwdGroupType getUnstructuredKwdGroup() {
		return (UnstructuredKwdGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_UnstructuredKwdGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnstructuredKwdGroup(UnstructuredKwdGroupType newUnstructuredKwdGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_UnstructuredKwdGroup(), newUnstructuredKwdGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnstructuredKwdGroup(UnstructuredKwdGroupType newUnstructuredKwdGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_UnstructuredKwdGroup(), newUnstructuredKwdGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UriType getUri() {
		return (UriType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Uri(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUri(UriType newUri, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Uri(), newUri, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(UriType newUri) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Uri(), newUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerseGroupType getVerseGroup() {
		return (VerseGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_VerseGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerseGroup(VerseGroupType newVerseGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_VerseGroup(), newVerseGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerseGroup(VerseGroupType newVerseGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_VerseGroup(), newVerseGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerseLineType getVerseLine() {
		return (VerseLineType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_VerseLine(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerseLine(VerseLineType newVerseLine, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_VerseLine(), newVerseLine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerseLine(VerseLineType newVerseLine) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_VerseLine(), newVerseLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionType getVersion() {
		return (VersionType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Version(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(VersionType newVersion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Version(), newVersion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(VersionType newVersion) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Version(), newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeType getVolume() {
		return (VolumeType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Volume(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolume(VolumeType newVolume, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Volume(), newVolume, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolume(VolumeType newVolume) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Volume(), newVolume);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeIdType getVolumeId() {
		return (VolumeIdType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_VolumeId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumeId(VolumeIdType newVolumeId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_VolumeId(), newVolumeId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeId(VolumeIdType newVolumeId) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_VolumeId(), newVolumeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeIssueGroupType getVolumeIssueGroup() {
		return (VolumeIssueGroupType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_VolumeIssueGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumeIssueGroup(VolumeIssueGroupType newVolumeIssueGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_VolumeIssueGroup(), newVolumeIssueGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeIssueGroup(VolumeIssueGroupType newVolumeIssueGroup) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_VolumeIssueGroup(), newVolumeIssueGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeSeriesType getVolumeSeries() {
		return (VolumeSeriesType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_VolumeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumeSeries(VolumeSeriesType newVolumeSeries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_VolumeSeries(), newVolumeSeries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeSeries(VolumeSeriesType newVolumeSeries) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_VolumeSeries(), newVolumeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WordCountType getWordCount() {
		return (WordCountType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_WordCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWordCount(WordCountType newWordCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_WordCount(), newWordCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWordCount(WordCountType newWordCount) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_WordCount(), newWordCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XType getX() {
		return (XType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_X(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(XType newX, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_X(), newX, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(XType newX) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_X(), newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefType getXref() {
		return (XrefType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Xref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXref(XrefType newXref, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Xref(), newXref, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXref(XrefType newXref) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Xref(), newXref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YearType getYear() {
		return (YearType)getMixed().get(Jats1Package.eINSTANCE.getDocumentRoot_Year(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(YearType newYear, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jats1Package.eINSTANCE.getDocumentRoot_Year(), newYear, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(YearType newYear) {
		((FeatureMap.Internal)getMixed()).set(Jats1Package.eINSTANCE.getDocumentRoot_Year(), newYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Jats1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Jats1Package.DOCUMENT_ROOT__ABBREV:
				return basicSetAbbrev(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ABBREV_JOURNAL_TITLE:
				return basicSetAbbrevJournalTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ACCESS_DATE:
				return basicSetAccessDate(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ACK:
				return basicSetAck(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ADDR_LINE:
				return basicSetAddrLine(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ADDRESS:
				return basicSetAddress(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__AFF:
				return basicSetAff(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__AFF_ALTERNATIVES:
				return basicSetAffAlternatives(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ALT_TEXT:
				return basicSetAltText(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ALT_TITLE:
				return basicSetAltTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ALTERNATIVES:
				return basicSetAlternatives(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ANONYMOUS:
				return basicSetAnonymous(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__APP:
				return basicSetApp(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__APP_GROUP:
				return basicSetAppGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ARRAY:
				return basicSetArray(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ARTICLE:
				return basicSetArticle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_CATEGORIES:
				return basicSetArticleCategories(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_ID:
				return basicSetArticleId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_META:
				return basicSetArticleMeta(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_TITLE:
				return basicSetArticleTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_VERSION:
				return basicSetArticleVersion(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_VERSION_ALTERNATIVES:
				return basicSetArticleVersionAlternatives(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ATTRIB:
				return basicSetAttrib(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__AUTHOR_COMMENT:
				return basicSetAuthorComment(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__AUTHOR_NOTES:
				return basicSetAuthorNotes(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__AWARD_GROUP:
				return basicSetAwardGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__AWARD_ID:
				return basicSetAwardId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__BACK:
				return basicSetBack(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__BIO:
				return basicSetBio(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__BODY:
				return basicSetBody(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__BOLD:
				return basicSetBold(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__BOXED_TEXT:
				return basicSetBoxedText(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__BREAK:
				return basicSetBreak(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CAPTION:
				return basicSetCaption(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CHAPTER_TITLE:
				return basicSetChapterTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CHEM_STRUCT:
				return basicSetChemStruct(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CHEM_STRUCT_WRAP:
				return basicSetChemStructWrap(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CITATION_ALTERNATIVES:
				return basicSetCitationAlternatives(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CITY:
				return basicSetCity(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CODE:
				return basicSetCode(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COL:
				return basicSetCol(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COLGROUP:
				return basicSetColgroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COLLAB:
				return basicSetCollab(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COLLAB_ALTERNATIVES:
				return basicSetCollabAlternatives(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COMMENT:
				return basicSetComment(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_KWD:
				return basicSetCompoundKwd(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_KWD_PART:
				return basicSetCompoundKwdPart(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_SUBJECT:
				return basicSetCompoundSubject(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_SUBJECT_PART:
				return basicSetCompoundSubjectPart(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONF_ACRONYM:
				return basicSetConfAcronym(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONF_DATE:
				return basicSetConfDate(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONF_LOC:
				return basicSetConfLoc(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONF_NAME:
				return basicSetConfName(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONF_NUM:
				return basicSetConfNum(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONF_SPONSOR:
				return basicSetConfSponsor(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONF_THEME:
				return basicSetConfTheme(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONFERENCE:
				return basicSetConference(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONTRIB:
				return basicSetContrib(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONTRIB_GROUP:
				return basicSetContribGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONTRIB_ID:
				return basicSetContribId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CONTRIBUTED_RESOURCE_GROUP:
				return basicSetContributedResourceGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_HOLDER:
				return basicSetCopyrightHolder(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_STATEMENT:
				return basicSetCopyrightStatement(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_YEAR:
				return basicSetCopyrightYear(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CORRESP:
				return basicSetCorresp(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COUNT:
				return basicSetCount(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COUNTRY:
				return basicSetCountry(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__COUNTS:
				return basicSetCounts(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CUSTOM_META:
				return basicSetCustomMeta(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__CUSTOM_META_GROUP:
				return basicSetCustomMetaGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DATA_TITLE:
				return basicSetDataTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DATE:
				return basicSetDate(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DATE_IN_CITATION:
				return basicSetDateInCitation(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DAY:
				return basicSetDay(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DEF:
				return basicSetDef(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DEF_HEAD:
				return basicSetDefHead(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DEF_ITEM:
				return basicSetDefItem(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DEF_LIST:
				return basicSetDefList(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DEGREES:
				return basicSetDegrees(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DISP_FORMULA:
				return basicSetDispFormula(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DISP_FORMULA_GROUP:
				return basicSetDispFormulaGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__DISP_QUOTE:
				return basicSetDispQuote(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__EDITION:
				return basicSetEdition(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ELEMENT_CITATION:
				return basicSetElementCitation(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ELOCATION_ID:
				return basicSetElocationId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__EMAIL:
				return basicSetEmail(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__EQUATION_COUNT:
				return basicSetEquationCount(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ERA:
				return basicSetEra(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ETAL:
				return basicSetEtal(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__EVENT:
				return basicSetEvent(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__EVENT_DESC:
				return basicSetEventDesc(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__EXT_LINK:
				return basicSetExtLink(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FAX:
				return basicSetFax(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FIG:
				return basicSetFig(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FIG_COUNT:
				return basicSetFigCount(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FIG_GROUP:
				return basicSetFigGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FIXED_CASE:
				return basicSetFixedCase(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FLOATS_GROUP:
				return basicSetFloatsGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FN:
				return basicSetFn(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FN_GROUP:
				return basicSetFnGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FPAGE:
				return basicSetFpage(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FRONT:
				return basicSetFront(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FRONT_STUB:
				return basicSetFrontStub(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FUNDING_GROUP:
				return basicSetFundingGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FUNDING_SOURCE:
				return basicSetFundingSource(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__FUNDING_STATEMENT:
				return basicSetFundingStatement(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__GIVEN_NAMES:
				return basicSetGivenNames(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__GLOSSARY:
				return basicSetGlossary(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__GLYPH_DATA:
				return basicSetGlyphData(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__GLYPH_REF:
				return basicSetGlyphRef(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__GOV:
				return basicSetGov(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__GRAPHIC:
				return basicSetGraphic(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__HISTORY:
				return basicSetHistory(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__HR:
				return basicSetHr(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__INDEX_TERM:
				return basicSetIndexTerm(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__INDEX_TERM_RANGE_END:
				return basicSetIndexTermRangeEnd(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__INLINE_FORMULA:
				return basicSetInlineFormula(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__INLINE_GRAPHIC:
				return basicSetInlineGraphic(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__INLINE_MEDIA:
				return basicSetInlineMedia(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__INLINE_SUPPLEMENTARY_MATERIAL:
				return basicSetInlineSupplementaryMaterial(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION:
				return basicSetInstitution(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION_ID:
				return basicSetInstitutionId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION_WRAP:
				return basicSetInstitutionWrap(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ISBN:
				return basicSetIsbn(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ISSN:
				return basicSetIssn(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ISSN_L:
				return basicSetIssnL(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ISSUE:
				return basicSetIssue(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ISSUE_ID:
				return basicSetIssueId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ISSUE_PART:
				return basicSetIssuePart(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ISSUE_SPONSOR:
				return basicSetIssueSponsor(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ISSUE_TITLE:
				return basicSetIssueTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ITALIC:
				return basicSetItalic(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_ID:
				return basicSetJournalId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_META:
				return basicSetJournalMeta(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_SUBTITLE:
				return basicSetJournalSubtitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_TITLE:
				return basicSetJournalTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_TITLE_GROUP:
				return basicSetJournalTitleGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__KWD:
				return basicSetKwd(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__KWD_GROUP:
				return basicSetKwdGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__LICENSE:
				return basicSetLicense(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__LICENSE_P:
				return basicSetLicenseP(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__LIST:
				return basicSetList(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__LIST_ITEM:
				return basicSetListItem(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__LONG_DESC:
				return basicSetLongDesc(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__LPAGE:
				return basicSetLpage(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__MEDIA:
				return basicSetMedia(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__META_NAME:
				return basicSetMetaName(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__META_VALUE:
				return basicSetMetaValue(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__MILESTONE_END:
				return basicSetMilestoneEnd(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__MILESTONE_START:
				return basicSetMilestoneStart(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__MIXED_CITATION:
				return basicSetMixedCitation(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__MONOSPACE:
				return basicSetMonospace(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__MONTH:
				return basicSetMonth(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__NAME:
				return basicSetName(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__NAME_ALTERNATIVES:
				return basicSetNameAlternatives(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__NAMED_CONTENT:
				return basicSetNamedContent(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__NESTED_KWD:
				return basicSetNestedKwd(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__NLM_CITATION:
				return basicSetNlmCitation(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__NOTE:
				return basicSetNote(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__NOTES:
				return basicSetNotes(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__OBJECT_ID:
				return basicSetObjectId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ON_BEHALF_OF:
				return basicSetOnBehalfOf(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__OPEN_ACCESS:
				return basicSetOpenAccess(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__OVERLINE:
				return basicSetOverline(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__OVERLINE_END:
				return basicSetOverlineEnd(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__OVERLINE_START:
				return basicSetOverlineStart(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__P:
				return basicSetP(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PAGE_COUNT:
				return basicSetPageCount(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PAGE_RANGE:
				return basicSetPageRange(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PART_TITLE:
				return basicSetPartTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PATENT:
				return basicSetPatent(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PERMISSIONS:
				return basicSetPermissions(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PERSON_GROUP:
				return basicSetPersonGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PHONE:
				return basicSetPhone(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PREFIX:
				return basicSetPrefix(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PREFORMAT:
				return basicSetPreformat(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PRICE:
				return basicSetPrice(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PRINCIPAL_AWARD_RECIPIENT:
				return basicSetPrincipalAwardRecipient(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PRINCIPAL_INVESTIGATOR:
				return basicSetPrincipalInvestigator(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PRIVATE_CHAR:
				return basicSetPrivateChar(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PRODUCT:
				return basicSetProduct(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PUB_DATE:
				return basicSetPubDate(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PUB_DATE_NOT_AVAILABLE:
				return basicSetPubDateNotAvailable(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PUB_HISTORY:
				return basicSetPubHistory(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PUB_ID:
				return basicSetPubId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER_LOC:
				return basicSetPublisherLoc(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER_NAME:
				return basicSetPublisherName(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RB:
				return basicSetRb(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__REF:
				return basicSetRef(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__REF_COUNT:
				return basicSetRefCount(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__REF_LIST:
				return basicSetRefList(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RELATED_ARTICLE:
				return basicSetRelatedArticle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RELATED_OBJECT:
				return basicSetRelatedObject(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_GROUP:
				return basicSetResourceGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_ID:
				return basicSetResourceId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_NAME:
				return basicSetResourceName(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_WRAP:
				return basicSetResourceWrap(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RESPONSE:
				return basicSetResponse(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ROLE:
				return basicSetRole(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__ROMAN:
				return basicSetRoman(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RP:
				return basicSetRp(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RT:
				return basicSetRt(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__RUBY:
				return basicSetRuby(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SANS_SERIF:
				return basicSetSansSerif(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SC:
				return basicSetSc(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SEASON:
				return basicSetSeason(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SEC:
				return basicSetSec(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SEC_META:
				return basicSetSecMeta(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SEE:
				return basicSetSee(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SEE_ALSO:
				return basicSetSeeAlso(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SELF_URI:
				return basicSetSelfUri(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SERIES:
				return basicSetSeries(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SERIES_TEXT:
				return basicSetSeriesText(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SERIES_TITLE:
				return basicSetSeriesTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SIG:
				return basicSetSig(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SIG_BLOCK:
				return basicSetSigBlock(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SIZE:
				return basicSetSize(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SOURCE:
				return basicSetSource(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SPEAKER:
				return basicSetSpeaker(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SPEECH:
				return basicSetSpeech(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__STATE:
				return basicSetState(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__STATEMENT:
				return basicSetStatement(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__STD:
				return basicSetStd(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__STD_ORGANIZATION:
				return basicSetStdOrganization(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__STRIKE:
				return basicSetStrike(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__STRING_CONF:
				return basicSetStringConf(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__STRING_DATE:
				return basicSetStringDate(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__STRING_NAME:
				return basicSetStringName(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__STYLED_CONTENT:
				return basicSetStyledContent(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUB:
				return basicSetSub(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUB_ARTICLE:
				return basicSetSubArticle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUBJ_GROUP:
				return basicSetSubjGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUBJECT:
				return basicSetSubject(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUFFIX:
				return basicSetSuffix(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUP:
				return basicSetSup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUPPLEMENT:
				return basicSetSupplement(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUPPLEMENTARY_MATERIAL:
				return basicSetSupplementaryMaterial(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_DESCRIPTION:
				return basicSetSupportDescription(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_GROUP:
				return basicSetSupportGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_SOURCE:
				return basicSetSupportSource(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__SURNAME:
				return basicSetSurname(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TABLE:
				return basicSetTable(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TABLE_COUNT:
				return basicSetTableCount(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP:
				return basicSetTableWrap(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP_FOOT:
				return basicSetTableWrapFoot(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP_GROUP:
				return basicSetTableWrapGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TARGET:
				return basicSetTarget(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TBODY:
				return basicSetTbody(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TD:
				return basicSetTd(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TERM:
				return basicSetTerm(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TERM_HEAD:
				return basicSetTermHead(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TEX_MATH:
				return basicSetTexMath(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TEXTUAL_FORM:
				return basicSetTextualForm(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TFOOT:
				return basicSetTfoot(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TH:
				return basicSetTh(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__THEAD:
				return basicSetThead(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TITLE_GROUP:
				return basicSetTitleGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TR:
				return basicSetTr(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TRANS_ABSTRACT:
				return basicSetTransAbstract(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TRANS_SOURCE:
				return basicSetTransSource(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TRANS_SUBTITLE:
				return basicSetTransSubtitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TRANS_TITLE:
				return basicSetTransTitle(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__TRANS_TITLE_GROUP:
				return basicSetTransTitleGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE:
				return basicSetUnderline(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE_END:
				return basicSetUnderlineEnd(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE_START:
				return basicSetUnderlineStart(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__UNSTRUCTURED_KWD_GROUP:
				return basicSetUnstructuredKwdGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__URI:
				return basicSetUri(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__VERSE_GROUP:
				return basicSetVerseGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__VERSE_LINE:
				return basicSetVerseLine(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__VERSION:
				return basicSetVersion(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__VOLUME:
				return basicSetVolume(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__VOLUME_ID:
				return basicSetVolumeId(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__VOLUME_ISSUE_GROUP:
				return basicSetVolumeIssueGroup(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__VOLUME_SERIES:
				return basicSetVolumeSeries(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__WORD_COUNT:
				return basicSetWordCount(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__X:
				return basicSetX(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__XREF:
				return basicSetXref(null, msgs);
			case Jats1Package.DOCUMENT_ROOT__YEAR:
				return basicSetYear(null, msgs);
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
			case Jats1Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Jats1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Jats1Package.DOCUMENT_ROOT__ABBREV:
				return getAbbrev();
			case Jats1Package.DOCUMENT_ROOT__ABBREV_JOURNAL_TITLE:
				return getAbbrevJournalTitle();
			case Jats1Package.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract();
			case Jats1Package.DOCUMENT_ROOT__ACCESS_DATE:
				return getAccessDate();
			case Jats1Package.DOCUMENT_ROOT__ACK:
				return getAck();
			case Jats1Package.DOCUMENT_ROOT__ADDR_LINE:
				return getAddrLine();
			case Jats1Package.DOCUMENT_ROOT__ADDRESS:
				return getAddress();
			case Jats1Package.DOCUMENT_ROOT__AFF:
				return getAff();
			case Jats1Package.DOCUMENT_ROOT__AFF_ALTERNATIVES:
				return getAffAlternatives();
			case Jats1Package.DOCUMENT_ROOT__ALT_TEXT:
				return getAltText();
			case Jats1Package.DOCUMENT_ROOT__ALT_TITLE:
				return getAltTitle();
			case Jats1Package.DOCUMENT_ROOT__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation();
			case Jats1Package.DOCUMENT_ROOT__ANONYMOUS:
				return getAnonymous();
			case Jats1Package.DOCUMENT_ROOT__APP:
				return getApp();
			case Jats1Package.DOCUMENT_ROOT__APP_GROUP:
				return getAppGroup();
			case Jats1Package.DOCUMENT_ROOT__ARRAY:
				return getArray();
			case Jats1Package.DOCUMENT_ROOT__ARTICLE:
				return getArticle();
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_CATEGORIES:
				return getArticleCategories();
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_ID:
				return getArticleId();
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_META:
				return getArticleMeta();
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_TITLE:
				return getArticleTitle();
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_VERSION:
				return getArticleVersion();
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_VERSION_ALTERNATIVES:
				return getArticleVersionAlternatives();
			case Jats1Package.DOCUMENT_ROOT__ATTRIB:
				return getAttrib();
			case Jats1Package.DOCUMENT_ROOT__AUTHOR_COMMENT:
				return getAuthorComment();
			case Jats1Package.DOCUMENT_ROOT__AUTHOR_NOTES:
				return getAuthorNotes();
			case Jats1Package.DOCUMENT_ROOT__AWARD_GROUP:
				return getAwardGroup();
			case Jats1Package.DOCUMENT_ROOT__AWARD_ID:
				return getAwardId();
			case Jats1Package.DOCUMENT_ROOT__BACK:
				return getBack();
			case Jats1Package.DOCUMENT_ROOT__BIO:
				return getBio();
			case Jats1Package.DOCUMENT_ROOT__BODY:
				return getBody();
			case Jats1Package.DOCUMENT_ROOT__BOLD:
				return getBold();
			case Jats1Package.DOCUMENT_ROOT__BOXED_TEXT:
				return getBoxedText();
			case Jats1Package.DOCUMENT_ROOT__BREAK:
				return getBreak();
			case Jats1Package.DOCUMENT_ROOT__CAPTION:
				return getCaption();
			case Jats1Package.DOCUMENT_ROOT__CHAPTER_TITLE:
				return getChapterTitle();
			case Jats1Package.DOCUMENT_ROOT__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.DOCUMENT_ROOT__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.DOCUMENT_ROOT__CITATION_ALTERNATIVES:
				return getCitationAlternatives();
			case Jats1Package.DOCUMENT_ROOT__CITY:
				return getCity();
			case Jats1Package.DOCUMENT_ROOT__CODE:
				return getCode();
			case Jats1Package.DOCUMENT_ROOT__COL:
				return getCol();
			case Jats1Package.DOCUMENT_ROOT__COLGROUP:
				return getColgroup();
			case Jats1Package.DOCUMENT_ROOT__COLLAB:
				return getCollab();
			case Jats1Package.DOCUMENT_ROOT__COLLAB_ALTERNATIVES:
				return getCollabAlternatives();
			case Jats1Package.DOCUMENT_ROOT__COMMENT:
				return getComment();
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_KWD:
				return getCompoundKwd();
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_KWD_PART:
				return getCompoundKwdPart();
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_SUBJECT:
				return getCompoundSubject();
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_SUBJECT_PART:
				return getCompoundSubjectPart();
			case Jats1Package.DOCUMENT_ROOT__CONF_ACRONYM:
				return getConfAcronym();
			case Jats1Package.DOCUMENT_ROOT__CONF_DATE:
				return getConfDate();
			case Jats1Package.DOCUMENT_ROOT__CONF_LOC:
				return getConfLoc();
			case Jats1Package.DOCUMENT_ROOT__CONF_NAME:
				return getConfName();
			case Jats1Package.DOCUMENT_ROOT__CONF_NUM:
				return getConfNum();
			case Jats1Package.DOCUMENT_ROOT__CONF_SPONSOR:
				return getConfSponsor();
			case Jats1Package.DOCUMENT_ROOT__CONF_THEME:
				return getConfTheme();
			case Jats1Package.DOCUMENT_ROOT__CONFERENCE:
				return getConference();
			case Jats1Package.DOCUMENT_ROOT__CONTRIB:
				return getContrib();
			case Jats1Package.DOCUMENT_ROOT__CONTRIB_GROUP:
				return getContribGroup();
			case Jats1Package.DOCUMENT_ROOT__CONTRIB_ID:
				return getContribId();
			case Jats1Package.DOCUMENT_ROOT__CONTRIBUTED_RESOURCE_GROUP:
				return getContributedResourceGroup();
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_HOLDER:
				return getCopyrightHolder();
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_STATEMENT:
				return getCopyrightStatement();
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_YEAR:
				return getCopyrightYear();
			case Jats1Package.DOCUMENT_ROOT__CORRESP:
				return getCorresp();
			case Jats1Package.DOCUMENT_ROOT__COUNT:
				return getCount();
			case Jats1Package.DOCUMENT_ROOT__COUNTRY:
				return getCountry();
			case Jats1Package.DOCUMENT_ROOT__COUNTS:
				return getCounts();
			case Jats1Package.DOCUMENT_ROOT__CUSTOM_META:
				return getCustomMeta();
			case Jats1Package.DOCUMENT_ROOT__CUSTOM_META_GROUP:
				return getCustomMetaGroup();
			case Jats1Package.DOCUMENT_ROOT__DATA_TITLE:
				return getDataTitle();
			case Jats1Package.DOCUMENT_ROOT__DATE:
				return getDate();
			case Jats1Package.DOCUMENT_ROOT__DATE_IN_CITATION:
				return getDateInCitation();
			case Jats1Package.DOCUMENT_ROOT__DAY:
				return getDay();
			case Jats1Package.DOCUMENT_ROOT__DEF:
				return getDef();
			case Jats1Package.DOCUMENT_ROOT__DEF_HEAD:
				return getDefHead();
			case Jats1Package.DOCUMENT_ROOT__DEF_ITEM:
				return getDefItem();
			case Jats1Package.DOCUMENT_ROOT__DEF_LIST:
				return getDefList();
			case Jats1Package.DOCUMENT_ROOT__DEGREES:
				return getDegrees();
			case Jats1Package.DOCUMENT_ROOT__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.DOCUMENT_ROOT__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.DOCUMENT_ROOT__DISP_QUOTE:
				return getDispQuote();
			case Jats1Package.DOCUMENT_ROOT__EDITION:
				return getEdition();
			case Jats1Package.DOCUMENT_ROOT__ELEMENT_CITATION:
				return getElementCitation();
			case Jats1Package.DOCUMENT_ROOT__ELOCATION_ID:
				return getElocationId();
			case Jats1Package.DOCUMENT_ROOT__EMAIL:
				return getEmail();
			case Jats1Package.DOCUMENT_ROOT__EQUATION_COUNT:
				return getEquationCount();
			case Jats1Package.DOCUMENT_ROOT__ERA:
				return getEra();
			case Jats1Package.DOCUMENT_ROOT__ETAL:
				return getEtal();
			case Jats1Package.DOCUMENT_ROOT__EVENT:
				return getEvent();
			case Jats1Package.DOCUMENT_ROOT__EVENT_DESC:
				return getEventDesc();
			case Jats1Package.DOCUMENT_ROOT__EXT_LINK:
				return getExtLink();
			case Jats1Package.DOCUMENT_ROOT__FAX:
				return getFax();
			case Jats1Package.DOCUMENT_ROOT__FIG:
				return getFig();
			case Jats1Package.DOCUMENT_ROOT__FIG_COUNT:
				return getFigCount();
			case Jats1Package.DOCUMENT_ROOT__FIG_GROUP:
				return getFigGroup();
			case Jats1Package.DOCUMENT_ROOT__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.DOCUMENT_ROOT__FLOATS_GROUP:
				return getFloatsGroup();
			case Jats1Package.DOCUMENT_ROOT__FN:
				return getFn();
			case Jats1Package.DOCUMENT_ROOT__FN_GROUP:
				return getFnGroup();
			case Jats1Package.DOCUMENT_ROOT__FPAGE:
				return getFpage();
			case Jats1Package.DOCUMENT_ROOT__FRONT:
				return getFront();
			case Jats1Package.DOCUMENT_ROOT__FRONT_STUB:
				return getFrontStub();
			case Jats1Package.DOCUMENT_ROOT__FUNDING_GROUP:
				return getFundingGroup();
			case Jats1Package.DOCUMENT_ROOT__FUNDING_SOURCE:
				return getFundingSource();
			case Jats1Package.DOCUMENT_ROOT__FUNDING_STATEMENT:
				return getFundingStatement();
			case Jats1Package.DOCUMENT_ROOT__GIVEN_NAMES:
				return getGivenNames();
			case Jats1Package.DOCUMENT_ROOT__GLOSSARY:
				return getGlossary();
			case Jats1Package.DOCUMENT_ROOT__GLYPH_DATA:
				return getGlyphData();
			case Jats1Package.DOCUMENT_ROOT__GLYPH_REF:
				return getGlyphRef();
			case Jats1Package.DOCUMENT_ROOT__GOV:
				return getGov();
			case Jats1Package.DOCUMENT_ROOT__GRAPHIC:
				return getGraphic();
			case Jats1Package.DOCUMENT_ROOT__HISTORY:
				return getHistory();
			case Jats1Package.DOCUMENT_ROOT__HR:
				return getHr();
			case Jats1Package.DOCUMENT_ROOT__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.DOCUMENT_ROOT__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.DOCUMENT_ROOT__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.DOCUMENT_ROOT__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.DOCUMENT_ROOT__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.DOCUMENT_ROOT__INLINE_SUPPLEMENTARY_MATERIAL:
				return getInlineSupplementaryMaterial();
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION:
				return getInstitution();
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION_ID:
				return getInstitutionId();
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION_WRAP:
				return getInstitutionWrap();
			case Jats1Package.DOCUMENT_ROOT__ISBN:
				return getIsbn();
			case Jats1Package.DOCUMENT_ROOT__ISSN:
				return getIssn();
			case Jats1Package.DOCUMENT_ROOT__ISSN_L:
				return getIssnL();
			case Jats1Package.DOCUMENT_ROOT__ISSUE:
				return getIssue();
			case Jats1Package.DOCUMENT_ROOT__ISSUE_ID:
				return getIssueId();
			case Jats1Package.DOCUMENT_ROOT__ISSUE_PART:
				return getIssuePart();
			case Jats1Package.DOCUMENT_ROOT__ISSUE_SPONSOR:
				return getIssueSponsor();
			case Jats1Package.DOCUMENT_ROOT__ISSUE_TITLE:
				return getIssueTitle();
			case Jats1Package.DOCUMENT_ROOT__ITALIC:
				return getItalic();
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_ID:
				return getJournalId();
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_META:
				return getJournalMeta();
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_SUBTITLE:
				return getJournalSubtitle();
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_TITLE:
				return getJournalTitle();
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_TITLE_GROUP:
				return getJournalTitleGroup();
			case Jats1Package.DOCUMENT_ROOT__KWD:
				return getKwd();
			case Jats1Package.DOCUMENT_ROOT__KWD_GROUP:
				return getKwdGroup();
			case Jats1Package.DOCUMENT_ROOT__LABEL:
				return getLabel();
			case Jats1Package.DOCUMENT_ROOT__LICENSE:
				return getLicense();
			case Jats1Package.DOCUMENT_ROOT__LICENSE_P:
				return getLicenseP();
			case Jats1Package.DOCUMENT_ROOT__LIST:
				return getList();
			case Jats1Package.DOCUMENT_ROOT__LIST_ITEM:
				return getListItem();
			case Jats1Package.DOCUMENT_ROOT__LONG_DESC:
				return getLongDesc();
			case Jats1Package.DOCUMENT_ROOT__LPAGE:
				return getLpage();
			case Jats1Package.DOCUMENT_ROOT__MEDIA:
				return getMedia();
			case Jats1Package.DOCUMENT_ROOT__META_NAME:
				return getMetaName();
			case Jats1Package.DOCUMENT_ROOT__META_VALUE:
				return getMetaValue();
			case Jats1Package.DOCUMENT_ROOT__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.DOCUMENT_ROOT__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.DOCUMENT_ROOT__MIXED_CITATION:
				return getMixedCitation();
			case Jats1Package.DOCUMENT_ROOT__MONOSPACE:
				return getMonospace();
			case Jats1Package.DOCUMENT_ROOT__MONTH:
				return getMonth();
			case Jats1Package.DOCUMENT_ROOT__NAME:
				return getName();
			case Jats1Package.DOCUMENT_ROOT__NAME_ALTERNATIVES:
				return getNameAlternatives();
			case Jats1Package.DOCUMENT_ROOT__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.DOCUMENT_ROOT__NESTED_KWD:
				return getNestedKwd();
			case Jats1Package.DOCUMENT_ROOT__NLM_CITATION:
				return getNlmCitation();
			case Jats1Package.DOCUMENT_ROOT__NOTE:
				return getNote();
			case Jats1Package.DOCUMENT_ROOT__NOTES:
				return getNotes();
			case Jats1Package.DOCUMENT_ROOT__OBJECT_ID:
				return getObjectId();
			case Jats1Package.DOCUMENT_ROOT__ON_BEHALF_OF:
				return getOnBehalfOf();
			case Jats1Package.DOCUMENT_ROOT__OPEN_ACCESS:
				return getOpenAccess();
			case Jats1Package.DOCUMENT_ROOT__OVERLINE:
				return getOverline();
			case Jats1Package.DOCUMENT_ROOT__OVERLINE_END:
				return getOverlineEnd();
			case Jats1Package.DOCUMENT_ROOT__OVERLINE_START:
				return getOverlineStart();
			case Jats1Package.DOCUMENT_ROOT__P:
				return getP();
			case Jats1Package.DOCUMENT_ROOT__PAGE_COUNT:
				return getPageCount();
			case Jats1Package.DOCUMENT_ROOT__PAGE_RANGE:
				return getPageRange();
			case Jats1Package.DOCUMENT_ROOT__PART_TITLE:
				return getPartTitle();
			case Jats1Package.DOCUMENT_ROOT__PATENT:
				return getPatent();
			case Jats1Package.DOCUMENT_ROOT__PERMISSIONS:
				return getPermissions();
			case Jats1Package.DOCUMENT_ROOT__PERSON_GROUP:
				return getPersonGroup();
			case Jats1Package.DOCUMENT_ROOT__PHONE:
				return getPhone();
			case Jats1Package.DOCUMENT_ROOT__POSTAL_CODE:
				return getPostalCode();
			case Jats1Package.DOCUMENT_ROOT__PREFIX:
				return getPrefix();
			case Jats1Package.DOCUMENT_ROOT__PREFORMAT:
				return getPreformat();
			case Jats1Package.DOCUMENT_ROOT__PRICE:
				return getPrice();
			case Jats1Package.DOCUMENT_ROOT__PRINCIPAL_AWARD_RECIPIENT:
				return getPrincipalAwardRecipient();
			case Jats1Package.DOCUMENT_ROOT__PRINCIPAL_INVESTIGATOR:
				return getPrincipalInvestigator();
			case Jats1Package.DOCUMENT_ROOT__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.DOCUMENT_ROOT__PRODUCT:
				return getProduct();
			case Jats1Package.DOCUMENT_ROOT__PUB_DATE:
				return getPubDate();
			case Jats1Package.DOCUMENT_ROOT__PUB_DATE_NOT_AVAILABLE:
				return getPubDateNotAvailable();
			case Jats1Package.DOCUMENT_ROOT__PUB_HISTORY:
				return getPubHistory();
			case Jats1Package.DOCUMENT_ROOT__PUB_ID:
				return getPubId();
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher();
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER_LOC:
				return getPublisherLoc();
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER_NAME:
				return getPublisherName();
			case Jats1Package.DOCUMENT_ROOT__RB:
				return getRb();
			case Jats1Package.DOCUMENT_ROOT__REF:
				return getRef();
			case Jats1Package.DOCUMENT_ROOT__REF_COUNT:
				return getRefCount();
			case Jats1Package.DOCUMENT_ROOT__REF_LIST:
				return getRefList();
			case Jats1Package.DOCUMENT_ROOT__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.DOCUMENT_ROOT__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_GROUP:
				return getResourceGroup();
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_ID:
				return getResourceId();
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_NAME:
				return getResourceName();
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_WRAP:
				return getResourceWrap();
			case Jats1Package.DOCUMENT_ROOT__RESPONSE:
				return getResponse();
			case Jats1Package.DOCUMENT_ROOT__ROLE:
				return getRole();
			case Jats1Package.DOCUMENT_ROOT__ROMAN:
				return getRoman();
			case Jats1Package.DOCUMENT_ROOT__RP:
				return getRp();
			case Jats1Package.DOCUMENT_ROOT__RT:
				return getRt();
			case Jats1Package.DOCUMENT_ROOT__RUBY:
				return getRuby();
			case Jats1Package.DOCUMENT_ROOT__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.DOCUMENT_ROOT__SC:
				return getSc();
			case Jats1Package.DOCUMENT_ROOT__SEASON:
				return getSeason();
			case Jats1Package.DOCUMENT_ROOT__SEC:
				return getSec();
			case Jats1Package.DOCUMENT_ROOT__SEC_META:
				return getSecMeta();
			case Jats1Package.DOCUMENT_ROOT__SEE:
				return getSee();
			case Jats1Package.DOCUMENT_ROOT__SEE_ALSO:
				return getSeeAlso();
			case Jats1Package.DOCUMENT_ROOT__SELF_URI:
				return getSelfUri();
			case Jats1Package.DOCUMENT_ROOT__SERIES:
				return getSeries();
			case Jats1Package.DOCUMENT_ROOT__SERIES_TEXT:
				return getSeriesText();
			case Jats1Package.DOCUMENT_ROOT__SERIES_TITLE:
				return getSeriesTitle();
			case Jats1Package.DOCUMENT_ROOT__SIG:
				return getSig();
			case Jats1Package.DOCUMENT_ROOT__SIG_BLOCK:
				return getSigBlock();
			case Jats1Package.DOCUMENT_ROOT__SIZE:
				return getSize();
			case Jats1Package.DOCUMENT_ROOT__SOURCE:
				return getSource();
			case Jats1Package.DOCUMENT_ROOT__SPEAKER:
				return getSpeaker();
			case Jats1Package.DOCUMENT_ROOT__SPEECH:
				return getSpeech();
			case Jats1Package.DOCUMENT_ROOT__STATE:
				return getState();
			case Jats1Package.DOCUMENT_ROOT__STATEMENT:
				return getStatement();
			case Jats1Package.DOCUMENT_ROOT__STD:
				return getStd();
			case Jats1Package.DOCUMENT_ROOT__STD_ORGANIZATION:
				return getStdOrganization();
			case Jats1Package.DOCUMENT_ROOT__STRIKE:
				return getStrike();
			case Jats1Package.DOCUMENT_ROOT__STRING_CONF:
				return getStringConf();
			case Jats1Package.DOCUMENT_ROOT__STRING_DATE:
				return getStringDate();
			case Jats1Package.DOCUMENT_ROOT__STRING_NAME:
				return getStringName();
			case Jats1Package.DOCUMENT_ROOT__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.DOCUMENT_ROOT__SUB:
				return getSub();
			case Jats1Package.DOCUMENT_ROOT__SUB_ARTICLE:
				return getSubArticle();
			case Jats1Package.DOCUMENT_ROOT__SUBJ_GROUP:
				return getSubjGroup();
			case Jats1Package.DOCUMENT_ROOT__SUBJECT:
				return getSubject();
			case Jats1Package.DOCUMENT_ROOT__SUBTITLE:
				return getSubtitle();
			case Jats1Package.DOCUMENT_ROOT__SUFFIX:
				return getSuffix();
			case Jats1Package.DOCUMENT_ROOT__SUP:
				return getSup();
			case Jats1Package.DOCUMENT_ROOT__SUPPLEMENT:
				return getSupplement();
			case Jats1Package.DOCUMENT_ROOT__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_DESCRIPTION:
				return getSupportDescription();
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_GROUP:
				return getSupportGroup();
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_SOURCE:
				return getSupportSource();
			case Jats1Package.DOCUMENT_ROOT__SURNAME:
				return getSurname();
			case Jats1Package.DOCUMENT_ROOT__TABLE:
				return getTable();
			case Jats1Package.DOCUMENT_ROOT__TABLE_COUNT:
				return getTableCount();
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP_FOOT:
				return getTableWrapFoot();
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP_GROUP:
				return getTableWrapGroup();
			case Jats1Package.DOCUMENT_ROOT__TARGET:
				return getTarget();
			case Jats1Package.DOCUMENT_ROOT__TBODY:
				return getTbody();
			case Jats1Package.DOCUMENT_ROOT__TD:
				return getTd();
			case Jats1Package.DOCUMENT_ROOT__TERM:
				return getTerm();
			case Jats1Package.DOCUMENT_ROOT__TERM_HEAD:
				return getTermHead();
			case Jats1Package.DOCUMENT_ROOT__TEX_MATH:
				return getTexMath();
			case Jats1Package.DOCUMENT_ROOT__TEXTUAL_FORM:
				return getTextualForm();
			case Jats1Package.DOCUMENT_ROOT__TFOOT:
				return getTfoot();
			case Jats1Package.DOCUMENT_ROOT__TH:
				return getTh();
			case Jats1Package.DOCUMENT_ROOT__THEAD:
				return getThead();
			case Jats1Package.DOCUMENT_ROOT__TIME_STAMP:
				return getTimeStamp();
			case Jats1Package.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case Jats1Package.DOCUMENT_ROOT__TITLE_GROUP:
				return getTitleGroup();
			case Jats1Package.DOCUMENT_ROOT__TR:
				return getTr();
			case Jats1Package.DOCUMENT_ROOT__TRANS_ABSTRACT:
				return getTransAbstract();
			case Jats1Package.DOCUMENT_ROOT__TRANS_SOURCE:
				return getTransSource();
			case Jats1Package.DOCUMENT_ROOT__TRANS_SUBTITLE:
				return getTransSubtitle();
			case Jats1Package.DOCUMENT_ROOT__TRANS_TITLE:
				return getTransTitle();
			case Jats1Package.DOCUMENT_ROOT__TRANS_TITLE_GROUP:
				return getTransTitleGroup();
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE:
				return getUnderline();
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE_END:
				return getUnderlineEnd();
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE_START:
				return getUnderlineStart();
			case Jats1Package.DOCUMENT_ROOT__UNSTRUCTURED_KWD_GROUP:
				return getUnstructuredKwdGroup();
			case Jats1Package.DOCUMENT_ROOT__URI:
				return getUri();
			case Jats1Package.DOCUMENT_ROOT__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.DOCUMENT_ROOT__VERSE_LINE:
				return getVerseLine();
			case Jats1Package.DOCUMENT_ROOT__VERSION:
				return getVersion();
			case Jats1Package.DOCUMENT_ROOT__VOLUME:
				return getVolume();
			case Jats1Package.DOCUMENT_ROOT__VOLUME_ID:
				return getVolumeId();
			case Jats1Package.DOCUMENT_ROOT__VOLUME_ISSUE_GROUP:
				return getVolumeIssueGroup();
			case Jats1Package.DOCUMENT_ROOT__VOLUME_SERIES:
				return getVolumeSeries();
			case Jats1Package.DOCUMENT_ROOT__WORD_COUNT:
				return getWordCount();
			case Jats1Package.DOCUMENT_ROOT__X:
				return getX();
			case Jats1Package.DOCUMENT_ROOT__XREF:
				return getXref();
			case Jats1Package.DOCUMENT_ROOT__YEAR:
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
			case Jats1Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ABBREV:
				setAbbrev((AbbrevType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ABBREV_JOURNAL_TITLE:
				setAbbrevJournalTitle((AbbrevJournalTitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((AbstractType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ACCESS_DATE:
				setAccessDate((AccessDateType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ACK:
				setAck((AckType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ADDR_LINE:
				setAddrLine((AddrLineType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__AFF:
				setAff((AffType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__AFF_ALTERNATIVES:
				setAffAlternatives((AffAlternativesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ALT_TEXT:
				setAltText((AltTextType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ALT_TITLE:
				setAltTitle((AltTitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ALTERNATIVES:
				setAlternatives((AlternativesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((AnnotationType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ANONYMOUS:
				setAnonymous((AnonymousType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__APP:
				setApp((AppType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__APP_GROUP:
				setAppGroup((AppGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARRAY:
				setArray((ArrayType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE:
				setArticle((ArticleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_CATEGORIES:
				setArticleCategories((ArticleCategoriesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_ID:
				setArticleId((ArticleIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_META:
				setArticleMeta((ArticleMetaType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_TITLE:
				setArticleTitle((ArticleTitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_VERSION:
				setArticleVersion((ArticleVersionType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_VERSION_ALTERNATIVES:
				setArticleVersionAlternatives((ArticleVersionAlternativesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ATTRIB:
				setAttrib((AttribType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__AUTHOR_COMMENT:
				setAuthorComment((AuthorCommentType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__AUTHOR_NOTES:
				setAuthorNotes((AuthorNotesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__AWARD_GROUP:
				setAwardGroup((AwardGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__AWARD_ID:
				setAwardId((AwardIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__BACK:
				setBack((BackType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__BIO:
				setBio((BioType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__BODY:
				setBody((BodyType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__BOLD:
				setBold((BoldType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__BOXED_TEXT:
				setBoxedText((BoxedTextType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__BREAK:
				setBreak((BreakType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CHAPTER_TITLE:
				setChapterTitle((ChapterTitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CHEM_STRUCT:
				setChemStruct((ChemStructType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CHEM_STRUCT_WRAP:
				setChemStructWrap((ChemStructWrapType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CITATION_ALTERNATIVES:
				setCitationAlternatives((CitationAlternativesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CITY:
				setCity((CityType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CODE:
				setCode((CodeType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COL:
				setCol((ColType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COLGROUP:
				setColgroup((ColgroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COLLAB:
				setCollab((CollabType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COLLAB_ALTERNATIVES:
				setCollabAlternatives((CollabAlternativesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COMMENT:
				setComment((CommentType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_KWD:
				setCompoundKwd((CompoundKwdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_KWD_PART:
				setCompoundKwdPart((CompoundKwdPartType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_SUBJECT:
				setCompoundSubject((CompoundSubjectType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_SUBJECT_PART:
				setCompoundSubjectPart((CompoundSubjectPartType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_ACRONYM:
				setConfAcronym((ConfAcronymType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_DATE:
				setConfDate((ConfDateType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_LOC:
				setConfLoc((ConfLocType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_NAME:
				setConfName((ConfNameType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_NUM:
				setConfNum((ConfNumType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_SPONSOR:
				setConfSponsor((ConfSponsorType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_THEME:
				setConfTheme((ConfThemeType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONFERENCE:
				setConference((ConferenceType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONTRIB:
				setContrib((ContribType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONTRIB_GROUP:
				setContribGroup((ContribGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONTRIB_ID:
				setContribId((ContribIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONTRIBUTED_RESOURCE_GROUP:
				setContributedResourceGroup((ContributedResourceGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_HOLDER:
				setCopyrightHolder((CopyrightHolderType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_STATEMENT:
				setCopyrightStatement((CopyrightStatementType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_YEAR:
				setCopyrightYear((CopyrightYearType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CORRESP:
				setCorresp((CorrespType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COUNT:
				setCount((CountType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COUNTRY:
				setCountry((CountryType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__COUNTS:
				setCounts((CountsType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CUSTOM_META:
				setCustomMeta((CustomMetaType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__CUSTOM_META_GROUP:
				setCustomMetaGroup((CustomMetaGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DATA_TITLE:
				setDataTitle((DataTitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DATE:
				setDate((DateType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DATE_IN_CITATION:
				setDateInCitation((DateInCitationType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DAY:
				setDay((DayType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DEF:
				setDef((DefType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DEF_HEAD:
				setDefHead((DefHeadType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DEF_ITEM:
				setDefItem((DefItemType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DEF_LIST:
				setDefList((DefListType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DEGREES:
				setDegrees((DegreesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DISP_FORMULA:
				setDispFormula((DispFormulaType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DISP_FORMULA_GROUP:
				setDispFormulaGroup((DispFormulaGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__DISP_QUOTE:
				setDispQuote((DispQuoteType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__EDITION:
				setEdition((EditionType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ELEMENT_CITATION:
				setElementCitation((ElementCitationType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ELOCATION_ID:
				setElocationId((ElocationIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__EMAIL:
				setEmail((EmailType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__EQUATION_COUNT:
				setEquationCount((EquationCountType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ERA:
				setEra((EraType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ETAL:
				setEtal((EtalType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__EVENT:
				setEvent((EventType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__EVENT_DESC:
				setEventDesc((EventDescType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__EXT_LINK:
				setExtLink((ExtLinkType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FAX:
				setFax((FaxType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FIG:
				setFig((FigType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FIG_COUNT:
				setFigCount((FigCountType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FIG_GROUP:
				setFigGroup((FigGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FIXED_CASE:
				setFixedCase((FixedCaseType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FLOATS_GROUP:
				setFloatsGroup((FloatsGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FN:
				setFn((FnType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FN_GROUP:
				setFnGroup((FnGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FPAGE:
				setFpage((FpageType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FRONT:
				setFront((FrontType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FRONT_STUB:
				setFrontStub((FrontStubType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FUNDING_GROUP:
				setFundingGroup((FundingGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FUNDING_SOURCE:
				setFundingSource((FundingSourceType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__FUNDING_STATEMENT:
				setFundingStatement((FundingStatementType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__GIVEN_NAMES:
				setGivenNames((GivenNamesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__GLOSSARY:
				setGlossary((GlossaryType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__GLYPH_DATA:
				setGlyphData((GlyphDataType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__GLYPH_REF:
				setGlyphRef((GlyphRefType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__GOV:
				setGov((GovType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__GRAPHIC:
				setGraphic((GraphicType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__HISTORY:
				setHistory((HistoryType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__HR:
				setHr((HrType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__INDEX_TERM:
				setIndexTerm((IndexTermType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__INDEX_TERM_RANGE_END:
				setIndexTermRangeEnd((IndexTermRangeEndType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__INLINE_FORMULA:
				setInlineFormula((InlineFormulaType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__INLINE_GRAPHIC:
				setInlineGraphic((InlineGraphicType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__INLINE_MEDIA:
				setInlineMedia((InlineMediaType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__INLINE_SUPPLEMENTARY_MATERIAL:
				setInlineSupplementaryMaterial((InlineSupplementaryMaterialType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION:
				setInstitution((InstitutionType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION_ID:
				setInstitutionId((InstitutionIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION_WRAP:
				setInstitutionWrap((InstitutionWrapType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISBN:
				setIsbn((IsbnType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSN:
				setIssn((IssnType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSN_L:
				setIssnL((IssnLType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSUE:
				setIssue((IssueType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_ID:
				setIssueId((IssueIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_PART:
				setIssuePart((IssuePartType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_SPONSOR:
				setIssueSponsor((IssueSponsorType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_TITLE:
				setIssueTitle((IssueTitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ITALIC:
				setItalic((ItalicType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_ID:
				setJournalId((JournalIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_META:
				setJournalMeta((JournalMetaType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_SUBTITLE:
				setJournalSubtitle((JournalSubtitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_TITLE:
				setJournalTitle((JournalTitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_TITLE_GROUP:
				setJournalTitleGroup((JournalTitleGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__KWD:
				setKwd((KwdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__KWD_GROUP:
				setKwdGroup((KwdGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__LICENSE:
				setLicense((LicenseType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__LICENSE_P:
				setLicenseP((LicensePType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__LIST:
				setList((ListType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__LIST_ITEM:
				setListItem((ListItemType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__LONG_DESC:
				setLongDesc((LongDescType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__LPAGE:
				setLpage((LpageType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__MEDIA:
				setMedia((MediaType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__META_NAME:
				setMetaName((MetaNameType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__META_VALUE:
				setMetaValue((MetaValueType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__MILESTONE_END:
				setMilestoneEnd((MilestoneEndType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__MILESTONE_START:
				setMilestoneStart((MilestoneStartType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__MIXED_CITATION:
				setMixedCitation((MixedCitationType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__MONOSPACE:
				setMonospace((MonospaceType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__MONTH:
				setMonth((MonthType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__NAME:
				setName((NameType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__NAME_ALTERNATIVES:
				setNameAlternatives((NameAlternativesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__NAMED_CONTENT:
				setNamedContent((NamedContentType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__NESTED_KWD:
				setNestedKwd((NestedKwdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__NLM_CITATION:
				setNlmCitation((NlmCitationType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__NOTE:
				setNote((NoteType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__NOTES:
				setNotes((NotesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__OBJECT_ID:
				setObjectId((ObjectIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ON_BEHALF_OF:
				setOnBehalfOf((OnBehalfOfType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__OPEN_ACCESS:
				setOpenAccess((OpenAccessType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__OVERLINE:
				setOverline((OverlineType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__OVERLINE_END:
				setOverlineEnd((OverlineEndType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__OVERLINE_START:
				setOverlineStart((OverlineStartType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__P:
				setP((PType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PAGE_COUNT:
				setPageCount((PageCountType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PAGE_RANGE:
				setPageRange((PageRangeType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PART_TITLE:
				setPartTitle((PartTitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PATENT:
				setPatent((PatentType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PERMISSIONS:
				setPermissions((PermissionsType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PERSON_GROUP:
				setPersonGroup((PersonGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PHONE:
				setPhone((PhoneType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__POSTAL_CODE:
				setPostalCode((PostalCodeType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PREFIX:
				setPrefix((PrefixType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PREFORMAT:
				setPreformat((PreformatType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PRICE:
				setPrice((PriceType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PRINCIPAL_AWARD_RECIPIENT:
				setPrincipalAwardRecipient((PrincipalAwardRecipientType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PRINCIPAL_INVESTIGATOR:
				setPrincipalInvestigator((PrincipalInvestigatorType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PRIVATE_CHAR:
				setPrivateChar((PrivateCharType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PRODUCT:
				setProduct((ProductType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUB_DATE:
				setPubDate((PubDateType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUB_DATE_NOT_AVAILABLE:
				setPubDateNotAvailable((PubDateNotAvailableType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUB_HISTORY:
				setPubHistory((PubHistoryType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUB_ID:
				setPubId((PubIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((PublisherType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER_LOC:
				setPublisherLoc((PublisherLocType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER_NAME:
				setPublisherName((PublisherNameType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RB:
				setRb((RbType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__REF:
				setRef((RefType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__REF_COUNT:
				setRefCount((RefCountType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__REF_LIST:
				setRefList((RefListType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RELATED_ARTICLE:
				setRelatedArticle((RelatedArticleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RELATED_OBJECT:
				setRelatedObject((RelatedObjectType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_GROUP:
				setResourceGroup((ResourceGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_ID:
				setResourceId((ResourceIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_NAME:
				setResourceName((ResourceNameType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_WRAP:
				setResourceWrap((ResourceWrapType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RESPONSE:
				setResponse((ResponseType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ROLE:
				setRole((RoleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__ROMAN:
				setRoman((RomanType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RP:
				setRp((RpType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RT:
				setRt((RtType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__RUBY:
				setRuby((RubyType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SANS_SERIF:
				setSansSerif((SansSerifType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SC:
				setSc((ScType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SEASON:
				setSeason((SeasonType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SEC:
				setSec((SecType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SEC_META:
				setSecMeta((SecMetaType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SEE:
				setSee((SeeType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SEE_ALSO:
				setSeeAlso((SeeAlsoType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SELF_URI:
				setSelfUri((SelfUriType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SERIES:
				setSeries((SeriesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SERIES_TEXT:
				setSeriesText((SeriesTextType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SERIES_TITLE:
				setSeriesTitle((SeriesTitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SIG:
				setSig((SigType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SIG_BLOCK:
				setSigBlock((SigBlockType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SIZE:
				setSize((SizeType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SOURCE:
				setSource((SourceType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SPEAKER:
				setSpeaker((SpeakerType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SPEECH:
				setSpeech((SpeechType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__STATE:
				setState((StateType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__STATEMENT:
				setStatement((StatementType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__STD:
				setStd((StdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__STD_ORGANIZATION:
				setStdOrganization((StdOrganizationType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__STRIKE:
				setStrike((StrikeType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__STRING_CONF:
				setStringConf((StringConfType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__STRING_DATE:
				setStringDate((StringDateType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__STRING_NAME:
				setStringName((StringNameType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__STYLED_CONTENT:
				setStyledContent((StyledContentType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUB:
				setSub((SubType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUB_ARTICLE:
				setSubArticle((SubArticleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUBJ_GROUP:
				setSubjGroup((SubjGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUBJECT:
				setSubject((SubjectType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUBTITLE:
				setSubtitle((SubtitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUFFIX:
				setSuffix((SuffixType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUP:
				setSup((SupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUPPLEMENT:
				setSupplement((SupplementType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUPPLEMENTARY_MATERIAL:
				setSupplementaryMaterial((SupplementaryMaterialType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_DESCRIPTION:
				setSupportDescription((SupportDescriptionType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_GROUP:
				setSupportGroup((SupportGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_SOURCE:
				setSupportSource((SupportSourceType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__SURNAME:
				setSurname((SurnameType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TABLE:
				setTable((TableType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TABLE_COUNT:
				setTableCount((TableCountType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP:
				setTableWrap((TableWrapType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP_FOOT:
				setTableWrapFoot((TableWrapFootType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP_GROUP:
				setTableWrapGroup((TableWrapGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TARGET:
				setTarget((TargetType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TBODY:
				setTbody((TbodyType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TD:
				setTd((TdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TERM:
				setTerm((TermType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TERM_HEAD:
				setTermHead((TermHeadType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TEX_MATH:
				setTexMath((TexMathType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TEXTUAL_FORM:
				setTextualForm((TextualFormType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TFOOT:
				setTfoot((TfootType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TH:
				setTh((ThType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__THEAD:
				setThead((TheadType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TIME_STAMP:
				setTimeStamp((TimeStampType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TITLE_GROUP:
				setTitleGroup((TitleGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TR:
				setTr((TrType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TRANS_ABSTRACT:
				setTransAbstract((TransAbstractType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TRANS_SOURCE:
				setTransSource((TransSourceType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TRANS_SUBTITLE:
				setTransSubtitle((TransSubtitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TRANS_TITLE:
				setTransTitle((TransTitleType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__TRANS_TITLE_GROUP:
				setTransTitleGroup((TransTitleGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE:
				setUnderline((UnderlineType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE_END:
				setUnderlineEnd((UnderlineEndType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE_START:
				setUnderlineStart((UnderlineStartType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__UNSTRUCTURED_KWD_GROUP:
				setUnstructuredKwdGroup((UnstructuredKwdGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__URI:
				setUri((UriType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__VERSE_GROUP:
				setVerseGroup((VerseGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__VERSE_LINE:
				setVerseLine((VerseLineType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__VERSION:
				setVersion((VersionType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__VOLUME:
				setVolume((VolumeType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__VOLUME_ID:
				setVolumeId((VolumeIdType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__VOLUME_ISSUE_GROUP:
				setVolumeIssueGroup((VolumeIssueGroupType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__VOLUME_SERIES:
				setVolumeSeries((VolumeSeriesType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__WORD_COUNT:
				setWordCount((WordCountType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__X:
				setX((XType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__XREF:
				setXref((XrefType)newValue);
				return;
			case Jats1Package.DOCUMENT_ROOT__YEAR:
				setYear((YearType)newValue);
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
			case Jats1Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Jats1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Jats1Package.DOCUMENT_ROOT__ABBREV:
				setAbbrev((AbbrevType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ABBREV_JOURNAL_TITLE:
				setAbbrevJournalTitle((AbbrevJournalTitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((AbstractType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ACCESS_DATE:
				setAccessDate((AccessDateType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ACK:
				setAck((AckType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ADDR_LINE:
				setAddrLine((AddrLineType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__AFF:
				setAff((AffType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__AFF_ALTERNATIVES:
				setAffAlternatives((AffAlternativesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ALT_TEXT:
				setAltText((AltTextType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ALT_TITLE:
				setAltTitle((AltTitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ALTERNATIVES:
				setAlternatives((AlternativesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((AnnotationType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ANONYMOUS:
				setAnonymous((AnonymousType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__APP:
				setApp((AppType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__APP_GROUP:
				setAppGroup((AppGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARRAY:
				setArray((ArrayType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE:
				setArticle((ArticleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_CATEGORIES:
				setArticleCategories((ArticleCategoriesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_ID:
				setArticleId((ArticleIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_META:
				setArticleMeta((ArticleMetaType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_TITLE:
				setArticleTitle((ArticleTitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_VERSION:
				setArticleVersion((ArticleVersionType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_VERSION_ALTERNATIVES:
				setArticleVersionAlternatives((ArticleVersionAlternativesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ATTRIB:
				setAttrib((AttribType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__AUTHOR_COMMENT:
				setAuthorComment((AuthorCommentType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__AUTHOR_NOTES:
				setAuthorNotes((AuthorNotesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__AWARD_GROUP:
				setAwardGroup((AwardGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__AWARD_ID:
				setAwardId((AwardIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__BACK:
				setBack((BackType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__BIO:
				setBio((BioType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__BODY:
				setBody((BodyType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__BOLD:
				setBold((BoldType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__BOXED_TEXT:
				setBoxedText((BoxedTextType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__BREAK:
				setBreak((BreakType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CAPTION:
				setCaption((CaptionType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CHAPTER_TITLE:
				setChapterTitle((ChapterTitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CHEM_STRUCT:
				setChemStruct((ChemStructType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CHEM_STRUCT_WRAP:
				setChemStructWrap((ChemStructWrapType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CITATION_ALTERNATIVES:
				setCitationAlternatives((CitationAlternativesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CITY:
				setCity((CityType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CODE:
				setCode((CodeType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COL:
				setCol((ColType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COLGROUP:
				setColgroup((ColgroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COLLAB:
				setCollab((CollabType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COLLAB_ALTERNATIVES:
				setCollabAlternatives((CollabAlternativesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COMMENT:
				setComment((CommentType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_KWD:
				setCompoundKwd((CompoundKwdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_KWD_PART:
				setCompoundKwdPart((CompoundKwdPartType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_SUBJECT:
				setCompoundSubject((CompoundSubjectType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_SUBJECT_PART:
				setCompoundSubjectPart((CompoundSubjectPartType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_ACRONYM:
				setConfAcronym((ConfAcronymType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_DATE:
				setConfDate((ConfDateType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_LOC:
				setConfLoc((ConfLocType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_NAME:
				setConfName((ConfNameType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_NUM:
				setConfNum((ConfNumType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_SPONSOR:
				setConfSponsor((ConfSponsorType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONF_THEME:
				setConfTheme((ConfThemeType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONFERENCE:
				setConference((ConferenceType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONTRIB:
				setContrib((ContribType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONTRIB_GROUP:
				setContribGroup((ContribGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONTRIB_ID:
				setContribId((ContribIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CONTRIBUTED_RESOURCE_GROUP:
				setContributedResourceGroup((ContributedResourceGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_HOLDER:
				setCopyrightHolder((CopyrightHolderType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_STATEMENT:
				setCopyrightStatement((CopyrightStatementType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_YEAR:
				setCopyrightYear((CopyrightYearType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CORRESP:
				setCorresp((CorrespType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COUNT:
				setCount((CountType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COUNTRY:
				setCountry((CountryType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__COUNTS:
				setCounts((CountsType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CUSTOM_META:
				setCustomMeta((CustomMetaType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__CUSTOM_META_GROUP:
				setCustomMetaGroup((CustomMetaGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DATA_TITLE:
				setDataTitle((DataTitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DATE:
				setDate((DateType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DATE_IN_CITATION:
				setDateInCitation((DateInCitationType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DAY:
				setDay((DayType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DEF:
				setDef((DefType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DEF_HEAD:
				setDefHead((DefHeadType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DEF_ITEM:
				setDefItem((DefItemType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DEF_LIST:
				setDefList((DefListType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DEGREES:
				setDegrees((DegreesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DISP_FORMULA:
				setDispFormula((DispFormulaType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DISP_FORMULA_GROUP:
				setDispFormulaGroup((DispFormulaGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__DISP_QUOTE:
				setDispQuote((DispQuoteType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__EDITION:
				setEdition((EditionType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ELEMENT_CITATION:
				setElementCitation((ElementCitationType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ELOCATION_ID:
				setElocationId((ElocationIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__EMAIL:
				setEmail((EmailType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__EQUATION_COUNT:
				setEquationCount((EquationCountType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ERA:
				setEra((EraType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ETAL:
				setEtal((EtalType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__EVENT:
				setEvent((EventType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__EVENT_DESC:
				setEventDesc((EventDescType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__EXT_LINK:
				setExtLink((ExtLinkType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FAX:
				setFax((FaxType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FIG:
				setFig((FigType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FIG_COUNT:
				setFigCount((FigCountType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FIG_GROUP:
				setFigGroup((FigGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FIXED_CASE:
				setFixedCase((FixedCaseType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FLOATS_GROUP:
				setFloatsGroup((FloatsGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FN:
				setFn((FnType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FN_GROUP:
				setFnGroup((FnGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FPAGE:
				setFpage((FpageType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FRONT:
				setFront((FrontType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FRONT_STUB:
				setFrontStub((FrontStubType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FUNDING_GROUP:
				setFundingGroup((FundingGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FUNDING_SOURCE:
				setFundingSource((FundingSourceType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__FUNDING_STATEMENT:
				setFundingStatement((FundingStatementType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__GIVEN_NAMES:
				setGivenNames((GivenNamesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__GLOSSARY:
				setGlossary((GlossaryType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__GLYPH_DATA:
				setGlyphData((GlyphDataType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__GLYPH_REF:
				setGlyphRef((GlyphRefType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__GOV:
				setGov((GovType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__GRAPHIC:
				setGraphic((GraphicType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__HISTORY:
				setHistory((HistoryType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__HR:
				setHr((HrType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__INDEX_TERM:
				setIndexTerm((IndexTermType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__INDEX_TERM_RANGE_END:
				setIndexTermRangeEnd((IndexTermRangeEndType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__INLINE_FORMULA:
				setInlineFormula((InlineFormulaType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__INLINE_GRAPHIC:
				setInlineGraphic((InlineGraphicType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__INLINE_MEDIA:
				setInlineMedia((InlineMediaType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__INLINE_SUPPLEMENTARY_MATERIAL:
				setInlineSupplementaryMaterial((InlineSupplementaryMaterialType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION:
				setInstitution((InstitutionType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION_ID:
				setInstitutionId((InstitutionIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION_WRAP:
				setInstitutionWrap((InstitutionWrapType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISBN:
				setIsbn((IsbnType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSN:
				setIssn((IssnType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSN_L:
				setIssnL((IssnLType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSUE:
				setIssue((IssueType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_ID:
				setIssueId((IssueIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_PART:
				setIssuePart((IssuePartType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_SPONSOR:
				setIssueSponsor((IssueSponsorType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_TITLE:
				setIssueTitle((IssueTitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ITALIC:
				setItalic((ItalicType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_ID:
				setJournalId((JournalIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_META:
				setJournalMeta((JournalMetaType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_SUBTITLE:
				setJournalSubtitle((JournalSubtitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_TITLE:
				setJournalTitle((JournalTitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_TITLE_GROUP:
				setJournalTitleGroup((JournalTitleGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__KWD:
				setKwd((KwdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__KWD_GROUP:
				setKwdGroup((KwdGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__LICENSE:
				setLicense((LicenseType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__LICENSE_P:
				setLicenseP((LicensePType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__LIST:
				setList((ListType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__LIST_ITEM:
				setListItem((ListItemType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__LONG_DESC:
				setLongDesc((LongDescType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__LPAGE:
				setLpage((LpageType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__MEDIA:
				setMedia((MediaType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__META_NAME:
				setMetaName((MetaNameType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__META_VALUE:
				setMetaValue((MetaValueType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__MILESTONE_END:
				setMilestoneEnd((MilestoneEndType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__MILESTONE_START:
				setMilestoneStart((MilestoneStartType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__MIXED_CITATION:
				setMixedCitation((MixedCitationType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__MONOSPACE:
				setMonospace((MonospaceType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__MONTH:
				setMonth((MonthType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__NAME:
				setName((NameType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__NAME_ALTERNATIVES:
				setNameAlternatives((NameAlternativesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__NAMED_CONTENT:
				setNamedContent((NamedContentType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__NESTED_KWD:
				setNestedKwd((NestedKwdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__NLM_CITATION:
				setNlmCitation((NlmCitationType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__NOTE:
				setNote((NoteType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__NOTES:
				setNotes((NotesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__OBJECT_ID:
				setObjectId((ObjectIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ON_BEHALF_OF:
				setOnBehalfOf((OnBehalfOfType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__OPEN_ACCESS:
				setOpenAccess((OpenAccessType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__OVERLINE:
				setOverline((OverlineType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__OVERLINE_END:
				setOverlineEnd((OverlineEndType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__OVERLINE_START:
				setOverlineStart((OverlineStartType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__P:
				setP((PType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PAGE_COUNT:
				setPageCount((PageCountType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PAGE_RANGE:
				setPageRange((PageRangeType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PART_TITLE:
				setPartTitle((PartTitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PATENT:
				setPatent((PatentType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PERMISSIONS:
				setPermissions((PermissionsType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PERSON_GROUP:
				setPersonGroup((PersonGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PHONE:
				setPhone((PhoneType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__POSTAL_CODE:
				setPostalCode((PostalCodeType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PREFIX:
				setPrefix((PrefixType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PREFORMAT:
				setPreformat((PreformatType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PRICE:
				setPrice((PriceType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PRINCIPAL_AWARD_RECIPIENT:
				setPrincipalAwardRecipient((PrincipalAwardRecipientType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PRINCIPAL_INVESTIGATOR:
				setPrincipalInvestigator((PrincipalInvestigatorType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PRIVATE_CHAR:
				setPrivateChar((PrivateCharType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PRODUCT:
				setProduct((ProductType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUB_DATE:
				setPubDate((PubDateType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUB_DATE_NOT_AVAILABLE:
				setPubDateNotAvailable((PubDateNotAvailableType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUB_HISTORY:
				setPubHistory((PubHistoryType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUB_ID:
				setPubId((PubIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((PublisherType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER_LOC:
				setPublisherLoc((PublisherLocType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER_NAME:
				setPublisherName((PublisherNameType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RB:
				setRb((RbType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__REF:
				setRef((RefType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__REF_COUNT:
				setRefCount((RefCountType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__REF_LIST:
				setRefList((RefListType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RELATED_ARTICLE:
				setRelatedArticle((RelatedArticleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RELATED_OBJECT:
				setRelatedObject((RelatedObjectType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_GROUP:
				setResourceGroup((ResourceGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_ID:
				setResourceId((ResourceIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_NAME:
				setResourceName((ResourceNameType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_WRAP:
				setResourceWrap((ResourceWrapType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RESPONSE:
				setResponse((ResponseType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ROLE:
				setRole((RoleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__ROMAN:
				setRoman((RomanType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RP:
				setRp((RpType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RT:
				setRt((RtType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__RUBY:
				setRuby((RubyType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SANS_SERIF:
				setSansSerif((SansSerifType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SC:
				setSc((ScType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SEASON:
				setSeason((SeasonType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SEC:
				setSec((SecType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SEC_META:
				setSecMeta((SecMetaType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SEE:
				setSee((SeeType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SEE_ALSO:
				setSeeAlso((SeeAlsoType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SELF_URI:
				setSelfUri((SelfUriType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SERIES:
				setSeries((SeriesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SERIES_TEXT:
				setSeriesText((SeriesTextType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SERIES_TITLE:
				setSeriesTitle((SeriesTitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SIG:
				setSig((SigType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SIG_BLOCK:
				setSigBlock((SigBlockType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SIZE:
				setSize((SizeType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SOURCE:
				setSource((SourceType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SPEAKER:
				setSpeaker((SpeakerType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SPEECH:
				setSpeech((SpeechType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__STATE:
				setState((StateType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__STATEMENT:
				setStatement((StatementType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__STD:
				setStd((StdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__STD_ORGANIZATION:
				setStdOrganization((StdOrganizationType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__STRIKE:
				setStrike((StrikeType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__STRING_CONF:
				setStringConf((StringConfType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__STRING_DATE:
				setStringDate((StringDateType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__STRING_NAME:
				setStringName((StringNameType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__STYLED_CONTENT:
				setStyledContent((StyledContentType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUB:
				setSub((SubType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUB_ARTICLE:
				setSubArticle((SubArticleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUBJ_GROUP:
				setSubjGroup((SubjGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUBJECT:
				setSubject((SubjectType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUBTITLE:
				setSubtitle((SubtitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUFFIX:
				setSuffix((SuffixType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUP:
				setSup((SupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUPPLEMENT:
				setSupplement((SupplementType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUPPLEMENTARY_MATERIAL:
				setSupplementaryMaterial((SupplementaryMaterialType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_DESCRIPTION:
				setSupportDescription((SupportDescriptionType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_GROUP:
				setSupportGroup((SupportGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_SOURCE:
				setSupportSource((SupportSourceType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__SURNAME:
				setSurname((SurnameType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TABLE:
				setTable((TableType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TABLE_COUNT:
				setTableCount((TableCountType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP:
				setTableWrap((TableWrapType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP_FOOT:
				setTableWrapFoot((TableWrapFootType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP_GROUP:
				setTableWrapGroup((TableWrapGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TARGET:
				setTarget((TargetType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TBODY:
				setTbody((TbodyType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TD:
				setTd((TdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TERM:
				setTerm((TermType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TERM_HEAD:
				setTermHead((TermHeadType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TEX_MATH:
				setTexMath((TexMathType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TEXTUAL_FORM:
				setTextualForm((TextualFormType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TFOOT:
				setTfoot((TfootType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TH:
				setTh((ThType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__THEAD:
				setThead((TheadType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TIME_STAMP:
				setTimeStamp((TimeStampType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TITLE_GROUP:
				setTitleGroup((TitleGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TR:
				setTr((TrType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TRANS_ABSTRACT:
				setTransAbstract((TransAbstractType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TRANS_SOURCE:
				setTransSource((TransSourceType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TRANS_SUBTITLE:
				setTransSubtitle((TransSubtitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TRANS_TITLE:
				setTransTitle((TransTitleType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__TRANS_TITLE_GROUP:
				setTransTitleGroup((TransTitleGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE:
				setUnderline((UnderlineType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE_END:
				setUnderlineEnd((UnderlineEndType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE_START:
				setUnderlineStart((UnderlineStartType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__UNSTRUCTURED_KWD_GROUP:
				setUnstructuredKwdGroup((UnstructuredKwdGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__URI:
				setUri((UriType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__VERSE_GROUP:
				setVerseGroup((VerseGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__VERSE_LINE:
				setVerseLine((VerseLineType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__VERSION:
				setVersion((VersionType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__VOLUME:
				setVolume((VolumeType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__VOLUME_ID:
				setVolumeId((VolumeIdType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__VOLUME_ISSUE_GROUP:
				setVolumeIssueGroup((VolumeIssueGroupType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__VOLUME_SERIES:
				setVolumeSeries((VolumeSeriesType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__WORD_COUNT:
				setWordCount((WordCountType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__X:
				setX((XType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__XREF:
				setXref((XrefType)null);
				return;
			case Jats1Package.DOCUMENT_ROOT__YEAR:
				setYear((YearType)null);
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
			case Jats1Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Jats1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Jats1Package.DOCUMENT_ROOT__ABBREV:
				return getAbbrev() != null;
			case Jats1Package.DOCUMENT_ROOT__ABBREV_JOURNAL_TITLE:
				return getAbbrevJournalTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract() != null;
			case Jats1Package.DOCUMENT_ROOT__ACCESS_DATE:
				return getAccessDate() != null;
			case Jats1Package.DOCUMENT_ROOT__ACK:
				return getAck() != null;
			case Jats1Package.DOCUMENT_ROOT__ADDR_LINE:
				return getAddrLine() != null;
			case Jats1Package.DOCUMENT_ROOT__ADDRESS:
				return getAddress() != null;
			case Jats1Package.DOCUMENT_ROOT__AFF:
				return getAff() != null;
			case Jats1Package.DOCUMENT_ROOT__AFF_ALTERNATIVES:
				return getAffAlternatives() != null;
			case Jats1Package.DOCUMENT_ROOT__ALT_TEXT:
				return getAltText() != null;
			case Jats1Package.DOCUMENT_ROOT__ALT_TITLE:
				return getAltTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__ALTERNATIVES:
				return getAlternatives() != null;
			case Jats1Package.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation() != null;
			case Jats1Package.DOCUMENT_ROOT__ANONYMOUS:
				return getAnonymous() != null;
			case Jats1Package.DOCUMENT_ROOT__APP:
				return getApp() != null;
			case Jats1Package.DOCUMENT_ROOT__APP_GROUP:
				return getAppGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__ARRAY:
				return getArray() != null;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE:
				return getArticle() != null;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_CATEGORIES:
				return getArticleCategories() != null;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_ID:
				return getArticleId() != null;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_META:
				return getArticleMeta() != null;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_TITLE:
				return getArticleTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_VERSION:
				return getArticleVersion() != null;
			case Jats1Package.DOCUMENT_ROOT__ARTICLE_VERSION_ALTERNATIVES:
				return getArticleVersionAlternatives() != null;
			case Jats1Package.DOCUMENT_ROOT__ATTRIB:
				return getAttrib() != null;
			case Jats1Package.DOCUMENT_ROOT__AUTHOR_COMMENT:
				return getAuthorComment() != null;
			case Jats1Package.DOCUMENT_ROOT__AUTHOR_NOTES:
				return getAuthorNotes() != null;
			case Jats1Package.DOCUMENT_ROOT__AWARD_GROUP:
				return getAwardGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__AWARD_ID:
				return getAwardId() != null;
			case Jats1Package.DOCUMENT_ROOT__BACK:
				return getBack() != null;
			case Jats1Package.DOCUMENT_ROOT__BIO:
				return getBio() != null;
			case Jats1Package.DOCUMENT_ROOT__BODY:
				return getBody() != null;
			case Jats1Package.DOCUMENT_ROOT__BOLD:
				return getBold() != null;
			case Jats1Package.DOCUMENT_ROOT__BOXED_TEXT:
				return getBoxedText() != null;
			case Jats1Package.DOCUMENT_ROOT__BREAK:
				return getBreak() != null;
			case Jats1Package.DOCUMENT_ROOT__CAPTION:
				return getCaption() != null;
			case Jats1Package.DOCUMENT_ROOT__CHAPTER_TITLE:
				return getChapterTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__CHEM_STRUCT:
				return getChemStruct() != null;
			case Jats1Package.DOCUMENT_ROOT__CHEM_STRUCT_WRAP:
				return getChemStructWrap() != null;
			case Jats1Package.DOCUMENT_ROOT__CITATION_ALTERNATIVES:
				return getCitationAlternatives() != null;
			case Jats1Package.DOCUMENT_ROOT__CITY:
				return getCity() != null;
			case Jats1Package.DOCUMENT_ROOT__CODE:
				return getCode() != null;
			case Jats1Package.DOCUMENT_ROOT__COL:
				return getCol() != null;
			case Jats1Package.DOCUMENT_ROOT__COLGROUP:
				return getColgroup() != null;
			case Jats1Package.DOCUMENT_ROOT__COLLAB:
				return getCollab() != null;
			case Jats1Package.DOCUMENT_ROOT__COLLAB_ALTERNATIVES:
				return getCollabAlternatives() != null;
			case Jats1Package.DOCUMENT_ROOT__COMMENT:
				return getComment() != null;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_KWD:
				return getCompoundKwd() != null;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_KWD_PART:
				return getCompoundKwdPart() != null;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_SUBJECT:
				return getCompoundSubject() != null;
			case Jats1Package.DOCUMENT_ROOT__COMPOUND_SUBJECT_PART:
				return getCompoundSubjectPart() != null;
			case Jats1Package.DOCUMENT_ROOT__CONF_ACRONYM:
				return getConfAcronym() != null;
			case Jats1Package.DOCUMENT_ROOT__CONF_DATE:
				return getConfDate() != null;
			case Jats1Package.DOCUMENT_ROOT__CONF_LOC:
				return getConfLoc() != null;
			case Jats1Package.DOCUMENT_ROOT__CONF_NAME:
				return getConfName() != null;
			case Jats1Package.DOCUMENT_ROOT__CONF_NUM:
				return getConfNum() != null;
			case Jats1Package.DOCUMENT_ROOT__CONF_SPONSOR:
				return getConfSponsor() != null;
			case Jats1Package.DOCUMENT_ROOT__CONF_THEME:
				return getConfTheme() != null;
			case Jats1Package.DOCUMENT_ROOT__CONFERENCE:
				return getConference() != null;
			case Jats1Package.DOCUMENT_ROOT__CONTRIB:
				return getContrib() != null;
			case Jats1Package.DOCUMENT_ROOT__CONTRIB_GROUP:
				return getContribGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__CONTRIB_ID:
				return getContribId() != null;
			case Jats1Package.DOCUMENT_ROOT__CONTRIBUTED_RESOURCE_GROUP:
				return getContributedResourceGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_HOLDER:
				return getCopyrightHolder() != null;
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_STATEMENT:
				return getCopyrightStatement() != null;
			case Jats1Package.DOCUMENT_ROOT__COPYRIGHT_YEAR:
				return getCopyrightYear() != null;
			case Jats1Package.DOCUMENT_ROOT__CORRESP:
				return getCorresp() != null;
			case Jats1Package.DOCUMENT_ROOT__COUNT:
				return getCount() != null;
			case Jats1Package.DOCUMENT_ROOT__COUNTRY:
				return getCountry() != null;
			case Jats1Package.DOCUMENT_ROOT__COUNTS:
				return getCounts() != null;
			case Jats1Package.DOCUMENT_ROOT__CUSTOM_META:
				return getCustomMeta() != null;
			case Jats1Package.DOCUMENT_ROOT__CUSTOM_META_GROUP:
				return getCustomMetaGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__DATA_TITLE:
				return getDataTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__DATE:
				return getDate() != null;
			case Jats1Package.DOCUMENT_ROOT__DATE_IN_CITATION:
				return getDateInCitation() != null;
			case Jats1Package.DOCUMENT_ROOT__DAY:
				return getDay() != null;
			case Jats1Package.DOCUMENT_ROOT__DEF:
				return getDef() != null;
			case Jats1Package.DOCUMENT_ROOT__DEF_HEAD:
				return getDefHead() != null;
			case Jats1Package.DOCUMENT_ROOT__DEF_ITEM:
				return getDefItem() != null;
			case Jats1Package.DOCUMENT_ROOT__DEF_LIST:
				return getDefList() != null;
			case Jats1Package.DOCUMENT_ROOT__DEGREES:
				return getDegrees() != null;
			case Jats1Package.DOCUMENT_ROOT__DISP_FORMULA:
				return getDispFormula() != null;
			case Jats1Package.DOCUMENT_ROOT__DISP_FORMULA_GROUP:
				return getDispFormulaGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__DISP_QUOTE:
				return getDispQuote() != null;
			case Jats1Package.DOCUMENT_ROOT__EDITION:
				return getEdition() != null;
			case Jats1Package.DOCUMENT_ROOT__ELEMENT_CITATION:
				return getElementCitation() != null;
			case Jats1Package.DOCUMENT_ROOT__ELOCATION_ID:
				return getElocationId() != null;
			case Jats1Package.DOCUMENT_ROOT__EMAIL:
				return getEmail() != null;
			case Jats1Package.DOCUMENT_ROOT__EQUATION_COUNT:
				return getEquationCount() != null;
			case Jats1Package.DOCUMENT_ROOT__ERA:
				return getEra() != null;
			case Jats1Package.DOCUMENT_ROOT__ETAL:
				return getEtal() != null;
			case Jats1Package.DOCUMENT_ROOT__EVENT:
				return getEvent() != null;
			case Jats1Package.DOCUMENT_ROOT__EVENT_DESC:
				return getEventDesc() != null;
			case Jats1Package.DOCUMENT_ROOT__EXT_LINK:
				return getExtLink() != null;
			case Jats1Package.DOCUMENT_ROOT__FAX:
				return getFax() != null;
			case Jats1Package.DOCUMENT_ROOT__FIG:
				return getFig() != null;
			case Jats1Package.DOCUMENT_ROOT__FIG_COUNT:
				return getFigCount() != null;
			case Jats1Package.DOCUMENT_ROOT__FIG_GROUP:
				return getFigGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__FIXED_CASE:
				return getFixedCase() != null;
			case Jats1Package.DOCUMENT_ROOT__FLOATS_GROUP:
				return getFloatsGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__FN:
				return getFn() != null;
			case Jats1Package.DOCUMENT_ROOT__FN_GROUP:
				return getFnGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__FPAGE:
				return getFpage() != null;
			case Jats1Package.DOCUMENT_ROOT__FRONT:
				return getFront() != null;
			case Jats1Package.DOCUMENT_ROOT__FRONT_STUB:
				return getFrontStub() != null;
			case Jats1Package.DOCUMENT_ROOT__FUNDING_GROUP:
				return getFundingGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__FUNDING_SOURCE:
				return getFundingSource() != null;
			case Jats1Package.DOCUMENT_ROOT__FUNDING_STATEMENT:
				return getFundingStatement() != null;
			case Jats1Package.DOCUMENT_ROOT__GIVEN_NAMES:
				return getGivenNames() != null;
			case Jats1Package.DOCUMENT_ROOT__GLOSSARY:
				return getGlossary() != null;
			case Jats1Package.DOCUMENT_ROOT__GLYPH_DATA:
				return getGlyphData() != null;
			case Jats1Package.DOCUMENT_ROOT__GLYPH_REF:
				return getGlyphRef() != null;
			case Jats1Package.DOCUMENT_ROOT__GOV:
				return getGov() != null;
			case Jats1Package.DOCUMENT_ROOT__GRAPHIC:
				return getGraphic() != null;
			case Jats1Package.DOCUMENT_ROOT__HISTORY:
				return getHistory() != null;
			case Jats1Package.DOCUMENT_ROOT__HR:
				return getHr() != null;
			case Jats1Package.DOCUMENT_ROOT__INDEX_TERM:
				return getIndexTerm() != null;
			case Jats1Package.DOCUMENT_ROOT__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd() != null;
			case Jats1Package.DOCUMENT_ROOT__INLINE_FORMULA:
				return getInlineFormula() != null;
			case Jats1Package.DOCUMENT_ROOT__INLINE_GRAPHIC:
				return getInlineGraphic() != null;
			case Jats1Package.DOCUMENT_ROOT__INLINE_MEDIA:
				return getInlineMedia() != null;
			case Jats1Package.DOCUMENT_ROOT__INLINE_SUPPLEMENTARY_MATERIAL:
				return getInlineSupplementaryMaterial() != null;
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION:
				return getInstitution() != null;
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION_ID:
				return getInstitutionId() != null;
			case Jats1Package.DOCUMENT_ROOT__INSTITUTION_WRAP:
				return getInstitutionWrap() != null;
			case Jats1Package.DOCUMENT_ROOT__ISBN:
				return getIsbn() != null;
			case Jats1Package.DOCUMENT_ROOT__ISSN:
				return getIssn() != null;
			case Jats1Package.DOCUMENT_ROOT__ISSN_L:
				return getIssnL() != null;
			case Jats1Package.DOCUMENT_ROOT__ISSUE:
				return getIssue() != null;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_ID:
				return getIssueId() != null;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_PART:
				return getIssuePart() != null;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_SPONSOR:
				return getIssueSponsor() != null;
			case Jats1Package.DOCUMENT_ROOT__ISSUE_TITLE:
				return getIssueTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__ITALIC:
				return getItalic() != null;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_ID:
				return getJournalId() != null;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_META:
				return getJournalMeta() != null;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_SUBTITLE:
				return getJournalSubtitle() != null;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_TITLE:
				return getJournalTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__JOURNAL_TITLE_GROUP:
				return getJournalTitleGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__KWD:
				return getKwd() != null;
			case Jats1Package.DOCUMENT_ROOT__KWD_GROUP:
				return getKwdGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__LABEL:
				return getLabel() != null;
			case Jats1Package.DOCUMENT_ROOT__LICENSE:
				return getLicense() != null;
			case Jats1Package.DOCUMENT_ROOT__LICENSE_P:
				return getLicenseP() != null;
			case Jats1Package.DOCUMENT_ROOT__LIST:
				return getList() != null;
			case Jats1Package.DOCUMENT_ROOT__LIST_ITEM:
				return getListItem() != null;
			case Jats1Package.DOCUMENT_ROOT__LONG_DESC:
				return getLongDesc() != null;
			case Jats1Package.DOCUMENT_ROOT__LPAGE:
				return getLpage() != null;
			case Jats1Package.DOCUMENT_ROOT__MEDIA:
				return getMedia() != null;
			case Jats1Package.DOCUMENT_ROOT__META_NAME:
				return getMetaName() != null;
			case Jats1Package.DOCUMENT_ROOT__META_VALUE:
				return getMetaValue() != null;
			case Jats1Package.DOCUMENT_ROOT__MILESTONE_END:
				return getMilestoneEnd() != null;
			case Jats1Package.DOCUMENT_ROOT__MILESTONE_START:
				return getMilestoneStart() != null;
			case Jats1Package.DOCUMENT_ROOT__MIXED_CITATION:
				return getMixedCitation() != null;
			case Jats1Package.DOCUMENT_ROOT__MONOSPACE:
				return getMonospace() != null;
			case Jats1Package.DOCUMENT_ROOT__MONTH:
				return getMonth() != null;
			case Jats1Package.DOCUMENT_ROOT__NAME:
				return getName() != null;
			case Jats1Package.DOCUMENT_ROOT__NAME_ALTERNATIVES:
				return getNameAlternatives() != null;
			case Jats1Package.DOCUMENT_ROOT__NAMED_CONTENT:
				return getNamedContent() != null;
			case Jats1Package.DOCUMENT_ROOT__NESTED_KWD:
				return getNestedKwd() != null;
			case Jats1Package.DOCUMENT_ROOT__NLM_CITATION:
				return getNlmCitation() != null;
			case Jats1Package.DOCUMENT_ROOT__NOTE:
				return getNote() != null;
			case Jats1Package.DOCUMENT_ROOT__NOTES:
				return getNotes() != null;
			case Jats1Package.DOCUMENT_ROOT__OBJECT_ID:
				return getObjectId() != null;
			case Jats1Package.DOCUMENT_ROOT__ON_BEHALF_OF:
				return getOnBehalfOf() != null;
			case Jats1Package.DOCUMENT_ROOT__OPEN_ACCESS:
				return getOpenAccess() != null;
			case Jats1Package.DOCUMENT_ROOT__OVERLINE:
				return getOverline() != null;
			case Jats1Package.DOCUMENT_ROOT__OVERLINE_END:
				return getOverlineEnd() != null;
			case Jats1Package.DOCUMENT_ROOT__OVERLINE_START:
				return getOverlineStart() != null;
			case Jats1Package.DOCUMENT_ROOT__P:
				return getP() != null;
			case Jats1Package.DOCUMENT_ROOT__PAGE_COUNT:
				return getPageCount() != null;
			case Jats1Package.DOCUMENT_ROOT__PAGE_RANGE:
				return getPageRange() != null;
			case Jats1Package.DOCUMENT_ROOT__PART_TITLE:
				return getPartTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__PATENT:
				return getPatent() != null;
			case Jats1Package.DOCUMENT_ROOT__PERMISSIONS:
				return getPermissions() != null;
			case Jats1Package.DOCUMENT_ROOT__PERSON_GROUP:
				return getPersonGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__PHONE:
				return getPhone() != null;
			case Jats1Package.DOCUMENT_ROOT__POSTAL_CODE:
				return getPostalCode() != null;
			case Jats1Package.DOCUMENT_ROOT__PREFIX:
				return getPrefix() != null;
			case Jats1Package.DOCUMENT_ROOT__PREFORMAT:
				return getPreformat() != null;
			case Jats1Package.DOCUMENT_ROOT__PRICE:
				return getPrice() != null;
			case Jats1Package.DOCUMENT_ROOT__PRINCIPAL_AWARD_RECIPIENT:
				return getPrincipalAwardRecipient() != null;
			case Jats1Package.DOCUMENT_ROOT__PRINCIPAL_INVESTIGATOR:
				return getPrincipalInvestigator() != null;
			case Jats1Package.DOCUMENT_ROOT__PRIVATE_CHAR:
				return getPrivateChar() != null;
			case Jats1Package.DOCUMENT_ROOT__PRODUCT:
				return getProduct() != null;
			case Jats1Package.DOCUMENT_ROOT__PUB_DATE:
				return getPubDate() != null;
			case Jats1Package.DOCUMENT_ROOT__PUB_DATE_NOT_AVAILABLE:
				return getPubDateNotAvailable() != null;
			case Jats1Package.DOCUMENT_ROOT__PUB_HISTORY:
				return getPubHistory() != null;
			case Jats1Package.DOCUMENT_ROOT__PUB_ID:
				return getPubId() != null;
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher() != null;
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER_LOC:
				return getPublisherLoc() != null;
			case Jats1Package.DOCUMENT_ROOT__PUBLISHER_NAME:
				return getPublisherName() != null;
			case Jats1Package.DOCUMENT_ROOT__RB:
				return getRb() != null;
			case Jats1Package.DOCUMENT_ROOT__REF:
				return getRef() != null;
			case Jats1Package.DOCUMENT_ROOT__REF_COUNT:
				return getRefCount() != null;
			case Jats1Package.DOCUMENT_ROOT__REF_LIST:
				return getRefList() != null;
			case Jats1Package.DOCUMENT_ROOT__RELATED_ARTICLE:
				return getRelatedArticle() != null;
			case Jats1Package.DOCUMENT_ROOT__RELATED_OBJECT:
				return getRelatedObject() != null;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_GROUP:
				return getResourceGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_ID:
				return getResourceId() != null;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_NAME:
				return getResourceName() != null;
			case Jats1Package.DOCUMENT_ROOT__RESOURCE_WRAP:
				return getResourceWrap() != null;
			case Jats1Package.DOCUMENT_ROOT__RESPONSE:
				return getResponse() != null;
			case Jats1Package.DOCUMENT_ROOT__ROLE:
				return getRole() != null;
			case Jats1Package.DOCUMENT_ROOT__ROMAN:
				return getRoman() != null;
			case Jats1Package.DOCUMENT_ROOT__RP:
				return getRp() != null;
			case Jats1Package.DOCUMENT_ROOT__RT:
				return getRt() != null;
			case Jats1Package.DOCUMENT_ROOT__RUBY:
				return getRuby() != null;
			case Jats1Package.DOCUMENT_ROOT__SANS_SERIF:
				return getSansSerif() != null;
			case Jats1Package.DOCUMENT_ROOT__SC:
				return getSc() != null;
			case Jats1Package.DOCUMENT_ROOT__SEASON:
				return getSeason() != null;
			case Jats1Package.DOCUMENT_ROOT__SEC:
				return getSec() != null;
			case Jats1Package.DOCUMENT_ROOT__SEC_META:
				return getSecMeta() != null;
			case Jats1Package.DOCUMENT_ROOT__SEE:
				return getSee() != null;
			case Jats1Package.DOCUMENT_ROOT__SEE_ALSO:
				return getSeeAlso() != null;
			case Jats1Package.DOCUMENT_ROOT__SELF_URI:
				return getSelfUri() != null;
			case Jats1Package.DOCUMENT_ROOT__SERIES:
				return getSeries() != null;
			case Jats1Package.DOCUMENT_ROOT__SERIES_TEXT:
				return getSeriesText() != null;
			case Jats1Package.DOCUMENT_ROOT__SERIES_TITLE:
				return getSeriesTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__SIG:
				return getSig() != null;
			case Jats1Package.DOCUMENT_ROOT__SIG_BLOCK:
				return getSigBlock() != null;
			case Jats1Package.DOCUMENT_ROOT__SIZE:
				return getSize() != null;
			case Jats1Package.DOCUMENT_ROOT__SOURCE:
				return getSource() != null;
			case Jats1Package.DOCUMENT_ROOT__SPEAKER:
				return getSpeaker() != null;
			case Jats1Package.DOCUMENT_ROOT__SPEECH:
				return getSpeech() != null;
			case Jats1Package.DOCUMENT_ROOT__STATE:
				return getState() != null;
			case Jats1Package.DOCUMENT_ROOT__STATEMENT:
				return getStatement() != null;
			case Jats1Package.DOCUMENT_ROOT__STD:
				return getStd() != null;
			case Jats1Package.DOCUMENT_ROOT__STD_ORGANIZATION:
				return getStdOrganization() != null;
			case Jats1Package.DOCUMENT_ROOT__STRIKE:
				return getStrike() != null;
			case Jats1Package.DOCUMENT_ROOT__STRING_CONF:
				return getStringConf() != null;
			case Jats1Package.DOCUMENT_ROOT__STRING_DATE:
				return getStringDate() != null;
			case Jats1Package.DOCUMENT_ROOT__STRING_NAME:
				return getStringName() != null;
			case Jats1Package.DOCUMENT_ROOT__STYLED_CONTENT:
				return getStyledContent() != null;
			case Jats1Package.DOCUMENT_ROOT__SUB:
				return getSub() != null;
			case Jats1Package.DOCUMENT_ROOT__SUB_ARTICLE:
				return getSubArticle() != null;
			case Jats1Package.DOCUMENT_ROOT__SUBJ_GROUP:
				return getSubjGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__SUBJECT:
				return getSubject() != null;
			case Jats1Package.DOCUMENT_ROOT__SUBTITLE:
				return getSubtitle() != null;
			case Jats1Package.DOCUMENT_ROOT__SUFFIX:
				return getSuffix() != null;
			case Jats1Package.DOCUMENT_ROOT__SUP:
				return getSup() != null;
			case Jats1Package.DOCUMENT_ROOT__SUPPLEMENT:
				return getSupplement() != null;
			case Jats1Package.DOCUMENT_ROOT__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial() != null;
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_DESCRIPTION:
				return getSupportDescription() != null;
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_GROUP:
				return getSupportGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__SUPPORT_SOURCE:
				return getSupportSource() != null;
			case Jats1Package.DOCUMENT_ROOT__SURNAME:
				return getSurname() != null;
			case Jats1Package.DOCUMENT_ROOT__TABLE:
				return getTable() != null;
			case Jats1Package.DOCUMENT_ROOT__TABLE_COUNT:
				return getTableCount() != null;
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP:
				return getTableWrap() != null;
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP_FOOT:
				return getTableWrapFoot() != null;
			case Jats1Package.DOCUMENT_ROOT__TABLE_WRAP_GROUP:
				return getTableWrapGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__TARGET:
				return getTarget() != null;
			case Jats1Package.DOCUMENT_ROOT__TBODY:
				return getTbody() != null;
			case Jats1Package.DOCUMENT_ROOT__TD:
				return getTd() != null;
			case Jats1Package.DOCUMENT_ROOT__TERM:
				return getTerm() != null;
			case Jats1Package.DOCUMENT_ROOT__TERM_HEAD:
				return getTermHead() != null;
			case Jats1Package.DOCUMENT_ROOT__TEX_MATH:
				return getTexMath() != null;
			case Jats1Package.DOCUMENT_ROOT__TEXTUAL_FORM:
				return getTextualForm() != null;
			case Jats1Package.DOCUMENT_ROOT__TFOOT:
				return getTfoot() != null;
			case Jats1Package.DOCUMENT_ROOT__TH:
				return getTh() != null;
			case Jats1Package.DOCUMENT_ROOT__THEAD:
				return getThead() != null;
			case Jats1Package.DOCUMENT_ROOT__TIME_STAMP:
				return getTimeStamp() != null;
			case Jats1Package.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__TITLE_GROUP:
				return getTitleGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__TR:
				return getTr() != null;
			case Jats1Package.DOCUMENT_ROOT__TRANS_ABSTRACT:
				return getTransAbstract() != null;
			case Jats1Package.DOCUMENT_ROOT__TRANS_SOURCE:
				return getTransSource() != null;
			case Jats1Package.DOCUMENT_ROOT__TRANS_SUBTITLE:
				return getTransSubtitle() != null;
			case Jats1Package.DOCUMENT_ROOT__TRANS_TITLE:
				return getTransTitle() != null;
			case Jats1Package.DOCUMENT_ROOT__TRANS_TITLE_GROUP:
				return getTransTitleGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE:
				return getUnderline() != null;
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE_END:
				return getUnderlineEnd() != null;
			case Jats1Package.DOCUMENT_ROOT__UNDERLINE_START:
				return getUnderlineStart() != null;
			case Jats1Package.DOCUMENT_ROOT__UNSTRUCTURED_KWD_GROUP:
				return getUnstructuredKwdGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__URI:
				return getUri() != null;
			case Jats1Package.DOCUMENT_ROOT__VERSE_GROUP:
				return getVerseGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__VERSE_LINE:
				return getVerseLine() != null;
			case Jats1Package.DOCUMENT_ROOT__VERSION:
				return getVersion() != null;
			case Jats1Package.DOCUMENT_ROOT__VOLUME:
				return getVolume() != null;
			case Jats1Package.DOCUMENT_ROOT__VOLUME_ID:
				return getVolumeId() != null;
			case Jats1Package.DOCUMENT_ROOT__VOLUME_ISSUE_GROUP:
				return getVolumeIssueGroup() != null;
			case Jats1Package.DOCUMENT_ROOT__VOLUME_SERIES:
				return getVolumeSeries() != null;
			case Jats1Package.DOCUMENT_ROOT__WORD_COUNT:
				return getWordCount() != null;
			case Jats1Package.DOCUMENT_ROOT__X:
				return getX() != null;
			case Jats1Package.DOCUMENT_ROOT__XREF:
				return getXref() != null;
			case Jats1Package.DOCUMENT_ROOT__YEAR:
				return getYear() != null;
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
