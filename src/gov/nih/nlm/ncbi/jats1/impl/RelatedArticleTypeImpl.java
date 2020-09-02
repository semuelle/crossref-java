/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AnnotationType;
import gov.nih.nlm.ncbi.jats1.ArticleTitleType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.ChapterTitleType;
import gov.nih.nlm.ncbi.jats1.CollabAlternativesType;
import gov.nih.nlm.ncbi.jats1.CollabType;
import gov.nih.nlm.ncbi.jats1.CommentType;
import gov.nih.nlm.ncbi.jats1.ConfAcronymType;
import gov.nih.nlm.ncbi.jats1.ConfDateType;
import gov.nih.nlm.ncbi.jats1.ConfLocType;
import gov.nih.nlm.ncbi.jats1.ConfNameType;
import gov.nih.nlm.ncbi.jats1.ConfSponsorType;
import gov.nih.nlm.ncbi.jats1.DataTitleType;
import gov.nih.nlm.ncbi.jats1.DateInCitationType;
import gov.nih.nlm.ncbi.jats1.DateType;
import gov.nih.nlm.ncbi.jats1.DayType;
import gov.nih.nlm.ncbi.jats1.EditionType;
import gov.nih.nlm.ncbi.jats1.ElocationIdType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.EtalType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FpageType;
import gov.nih.nlm.ncbi.jats1.GovType;
import gov.nih.nlm.ncbi.jats1.InstitutionType;
import gov.nih.nlm.ncbi.jats1.InstitutionWrapType;
import gov.nih.nlm.ncbi.jats1.IsbnType;
import gov.nih.nlm.ncbi.jats1.IssnLType;
import gov.nih.nlm.ncbi.jats1.IssnType;
import gov.nih.nlm.ncbi.jats1.IssueIdType;
import gov.nih.nlm.ncbi.jats1.IssuePartType;
import gov.nih.nlm.ncbi.jats1.IssueTitleType;
import gov.nih.nlm.ncbi.jats1.IssueType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.JournalIdType;
import gov.nih.nlm.ncbi.jats1.LpageType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.MonthType;
import gov.nih.nlm.ncbi.jats1.NameAlternativesType;
import gov.nih.nlm.ncbi.jats1.NameType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.ObjectIdType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PageRangeType;
import gov.nih.nlm.ncbi.jats1.PartTitleType;
import gov.nih.nlm.ncbi.jats1.PatentType;
import gov.nih.nlm.ncbi.jats1.PersonGroupType;
import gov.nih.nlm.ncbi.jats1.PubIdType;
import gov.nih.nlm.ncbi.jats1.PublisherLocType;
import gov.nih.nlm.ncbi.jats1.PublisherNameType;
import gov.nih.nlm.ncbi.jats1.RelatedArticleType;
import gov.nih.nlm.ncbi.jats1.RoleType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.SeasonType;
import gov.nih.nlm.ncbi.jats1.SeriesType;
import gov.nih.nlm.ncbi.jats1.SizeType;
import gov.nih.nlm.ncbi.jats1.SourceType;
import gov.nih.nlm.ncbi.jats1.StdType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.StringNameType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.SupplementType;
import gov.nih.nlm.ncbi.jats1.TransSourceType;
import gov.nih.nlm.ncbi.jats1.TransTitleType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.UriType;
import gov.nih.nlm.ncbi.jats1.VersionType;
import gov.nih.nlm.ncbi.jats1.VolumeIdType;
import gov.nih.nlm.ncbi.jats1.VolumeSeriesType;
import gov.nih.nlm.ncbi.jats1.VolumeType;
import gov.nih.nlm.ncbi.jats1.YearType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Article Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getRelatedArticleElements <em>Related Article Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getJournalId <em>Journal Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getChapterTitle <em>Chapter Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getCollab <em>Collab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getCollabAlternatives <em>Collab Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getConfAcronym <em>Conf Acronym</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getConfDate <em>Conf Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getConfLoc <em>Conf Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getConfName <em>Conf Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getConfSponsor <em>Conf Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getDataTitle <em>Data Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getDateInCitation <em>Date In Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getEtal <em>Etal</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getFpage <em>Fpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getGov <em>Gov</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getIssnL <em>Issn L</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getIssueId <em>Issue Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getIssuePart <em>Issue Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getIssueTitle <em>Issue Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getLpage <em>Lpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getNameAlternatives <em>Name Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getPageRange <em>Page Range</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getPartTitle <em>Part Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getPatent <em>Patent</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getPersonGroup <em>Person Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getPubId <em>Pub Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getPublisherLoc <em>Publisher Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getStd <em>Std</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getStringName <em>String Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getTransSource <em>Trans Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getTransTitle <em>Trans Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getVolumeId <em>Volume Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getVolumeSeries <em>Volume Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getElocationId1 <em>Elocation Id1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getExtLinkType <em>Ext Link Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getIssue1 <em>Issue1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getJournalId1 <em>Journal Id1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getJournalIdType <em>Journal Id Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getPage <em>Page</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getRelatedArticleType <em>Related Article Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.RelatedArticleTypeImpl#getVol <em>Vol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedArticleTypeImpl extends MinimalEObjectImpl.Container implements RelatedArticleType {
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
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElocationId1() <em>Elocation Id1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElocationId1()
	 * @generated
	 * @ordered
	 */
	protected static final String ELOCATION_ID1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElocationId1() <em>Elocation Id1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElocationId1()
	 * @generated
	 * @ordered
	 */
	protected String elocationId1 = ELOCATION_ID1_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtLinkType() <em>Ext Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXT_LINK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtLinkType() <em>Ext Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtLinkType()
	 * @generated
	 * @ordered
	 */
	protected String extLinkType = EXT_LINK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssue1() <em>Issue1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue1()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssue1() <em>Issue1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue1()
	 * @generated
	 * @ordered
	 */
	protected String issue1 = ISSUE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getJournalId1() <em>Journal Id1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalId1()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNAL_ID1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJournalId1() <em>Journal Id1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalId1()
	 * @generated
	 * @ordered
	 */
	protected String journalId1 = JOURNAL_ID1_EDEFAULT;

	/**
	 * The default value of the '{@link #getJournalIdType() <em>Journal Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalIdType()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNAL_ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJournalIdType() <em>Journal Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalIdType()
	 * @generated
	 * @ordered
	 */
	protected String journalIdType = JOURNAL_ID_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected Object lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPage() <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected String page = PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelatedArticleType() <em>Related Article Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArticleType()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATED_ARTICLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelatedArticleType() <em>Related Article Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArticleType()
	 * @generated
	 * @ordered
	 */
	protected String relatedArticleType = RELATED_ARTICLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected String role1 = ROLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFIC_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected String specificUse = SPECIFIC_USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getVol() <em>Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVol()
	 * @generated
	 * @ordered
	 */
	protected static final String VOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVol() <em>Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVol()
	 * @generated
	 * @ordered
	 */
	protected String vol = VOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedArticleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getRelatedArticleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.RELATED_ARTICLE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getRelatedArticleElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getRelatedArticleType_RelatedArticleElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JournalIdType> getJournalId() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_JournalId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArticleTitleType> getArticleTitle() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_ArticleTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChapterTitleType> getChapterTitle() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_ChapterTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabType> getCollab() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Collab());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabAlternativesType> getCollabAlternatives() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_CollabAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommentType> getComment() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Comment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfAcronymType> getConfAcronym() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_ConfAcronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfDateType> getConfDate() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_ConfDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfLocType> getConfLoc() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_ConfLoc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfNameType> getConfName() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_ConfName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfSponsorType> getConfSponsor() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_ConfSponsor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataTitleType> getDataTitle() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_DataTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateType> getDate() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateInCitationType> getDateInCitation() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_DateInCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DayType> getDay() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Day());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EditionType> getEdition() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Edition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElocationIdType> getElocationId() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_ElocationId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EtalType> getEtal() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Etal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FpageType> getFpage() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Fpage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GovType> getGov() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Gov());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Institution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionWrapType> getInstitutionWrap() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_InstitutionWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IsbnType> getIsbn() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Isbn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssnType> getIssn() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Issn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssnLType> getIssnL() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_IssnL());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueType> getIssue() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Issue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueIdType> getIssueId() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_IssueId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssuePartType> getIssuePart() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_IssuePart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueTitleType> getIssueTitle() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_IssueTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LpageType> getLpage() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Lpage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonthType> getMonth() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Month());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameType> getName() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameAlternativesType> getNameAlternatives() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_NameAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectIdType> getObjectId() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_ObjectId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PageRangeType> getPageRange() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_PageRange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PartTitleType> getPartTitle() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_PartTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatentType> getPatent() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Patent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonGroupType> getPersonGroup() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_PersonGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PubIdType> getPubId() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_PubId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublisherLocType> getPublisherLoc() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_PublisherLoc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublisherNameType> getPublisherName() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_PublisherName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleType> getRole() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Role());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeasonType> getSeason() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Season());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeriesType> getSeries() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Series());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SizeType> getSize() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Size());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourceType> getSource() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Source());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StdType> getStd() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Std());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringNameType> getStringName() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_StringName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementType> getSupplement() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Supplement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransSourceType> getTransSource() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_TransSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransTitleType> getTransTitle() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_TransTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VersionType> getVersion() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Version());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeType> getVolume() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Volume());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeIdType> getVolumeId() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_VolumeId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeSeriesType> getVolumeSeries() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_VolumeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<YearType> getYear() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Year());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getRelatedArticleElements().list(Jats1Package.eINSTANCE.getRelatedArticleType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.RELATED_ARTICLE_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElocationId1() {
		return elocationId1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElocationId1(String newElocationId1) {
		String oldElocationId1 = elocationId1;
		elocationId1 = newElocationId1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__ELOCATION_ID1, oldElocationId1, elocationId1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtLinkType() {
		return extLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtLinkType(String newExtLinkType) {
		String oldExtLinkType = extLinkType;
		extLinkType = newExtLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__EXT_LINK_TYPE, oldExtLinkType, extLinkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssue1() {
		return issue1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssue1(String newIssue1) {
		String oldIssue1 = issue1;
		issue1 = newIssue1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__ISSUE1, oldIssue1, issue1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJournalId1() {
		return journalId1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalId1(String newJournalId1) {
		String oldJournalId1 = journalId1;
		journalId1 = newJournalId1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID1, oldJournalId1, journalId1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJournalIdType() {
		return journalIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJournalIdType(String newJournalIdType) {
		String oldJournalIdType = journalIdType;
		journalIdType = newJournalIdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID_TYPE, oldJournalIdType, journalIdType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang(Object newLang) {
		Object oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPage(String newPage) {
		String oldPage = page;
		page = newPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelatedArticleType() {
		return relatedArticleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedArticleType(String newRelatedArticleType) {
		String oldRelatedArticleType = relatedArticleType;
		relatedArticleType = newRelatedArticleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__RELATED_ARTICLE_TYPE, oldRelatedArticleType, relatedArticleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole1() {
		return role1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole1(String newRole1) {
		String oldRole1 = role1;
		role1 = newRole1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__ROLE1, oldRole1, role1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShowType getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShow(ShowType newShow) {
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShow() {
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.RELATED_ARTICLE_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecificUse() {
		return specificUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecificUse(String newSpecificUse) {
		String oldSpecificUse = specificUse;
		specificUse = newSpecificUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.RELATED_ARTICLE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVol() {
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVol(String newVol) {
		String oldVol = vol;
		vol = newVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RELATED_ARTICLE_TYPE__VOL, oldVol, vol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.RELATED_ARTICLE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__RELATED_ARTICLE_ELEMENTS:
				return ((InternalEList<?>)getRelatedArticleElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID:
				return ((InternalEList<?>)getJournalId()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ARTICLE_TITLE:
				return ((InternalEList<?>)getArticleTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__CHAPTER_TITLE:
				return ((InternalEList<?>)getChapterTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__COLLAB:
				return ((InternalEList<?>)getCollab()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__COLLAB_ALTERNATIVES:
				return ((InternalEList<?>)getCollabAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_ACRONYM:
				return ((InternalEList<?>)getConfAcronym()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_DATE:
				return ((InternalEList<?>)getConfDate()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_LOC:
				return ((InternalEList<?>)getConfLoc()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_NAME:
				return ((InternalEList<?>)getConfName()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_SPONSOR:
				return ((InternalEList<?>)getConfSponsor()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__DATA_TITLE:
				return ((InternalEList<?>)getDataTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__DATE_IN_CITATION:
				return ((InternalEList<?>)getDateInCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__DAY:
				return ((InternalEList<?>)getDay()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__EDITION:
				return ((InternalEList<?>)getEdition()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ELOCATION_ID:
				return ((InternalEList<?>)getElocationId()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ETAL:
				return ((InternalEList<?>)getEtal()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__FPAGE:
				return ((InternalEList<?>)getFpage()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__GOV:
				return ((InternalEList<?>)getGov()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__INSTITUTION_WRAP:
				return ((InternalEList<?>)getInstitutionWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ISBN:
				return ((InternalEList<?>)getIsbn()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSN:
				return ((InternalEList<?>)getIssn()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSN_L:
				return ((InternalEList<?>)getIssnL()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE:
				return ((InternalEList<?>)getIssue()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_ID:
				return ((InternalEList<?>)getIssueId()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_PART:
				return ((InternalEList<?>)getIssuePart()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_TITLE:
				return ((InternalEList<?>)getIssueTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__LPAGE:
				return ((InternalEList<?>)getLpage()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__MONTH:
				return ((InternalEList<?>)getMonth()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__NAME_ALTERNATIVES:
				return ((InternalEList<?>)getNameAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__OBJECT_ID:
				return ((InternalEList<?>)getObjectId()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__PAGE_RANGE:
				return ((InternalEList<?>)getPageRange()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__PART_TITLE:
				return ((InternalEList<?>)getPartTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__PATENT:
				return ((InternalEList<?>)getPatent()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__PERSON_GROUP:
				return ((InternalEList<?>)getPersonGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__PUB_ID:
				return ((InternalEList<?>)getPubId()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__PUBLISHER_LOC:
				return ((InternalEList<?>)getPublisherLoc()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__PUBLISHER_NAME:
				return ((InternalEList<?>)getPublisherName()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__SEASON:
				return ((InternalEList<?>)getSeason()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__SIZE:
				return ((InternalEList<?>)getSize()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__STD:
				return ((InternalEList<?>)getStd()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__STRING_NAME:
				return ((InternalEList<?>)getStringName()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__SUPPLEMENT:
				return ((InternalEList<?>)getSupplement()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__TRANS_SOURCE:
				return ((InternalEList<?>)getTransSource()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__TRANS_TITLE:
				return ((InternalEList<?>)getTransTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME:
				return ((InternalEList<?>)getVolume()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME_ID:
				return ((InternalEList<?>)getVolumeId()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME_SERIES:
				return ((InternalEList<?>)getVolumeSeries()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__YEAR:
				return ((InternalEList<?>)getYear()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.RELATED_ARTICLE_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.RELATED_ARTICLE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.RELATED_ARTICLE_TYPE__RELATED_ARTICLE_ELEMENTS:
				if (coreType) return getRelatedArticleElements();
				return ((FeatureMap.Internal)getRelatedArticleElements()).getWrapper();
			case Jats1Package.RELATED_ARTICLE_TYPE__BOLD:
				return getBold();
			case Jats1Package.RELATED_ARTICLE_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.RELATED_ARTICLE_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.RELATED_ARTICLE_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.RELATED_ARTICLE_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.RELATED_ARTICLE_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.RELATED_ARTICLE_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.RELATED_ARTICLE_TYPE__SC:
				return getSc();
			case Jats1Package.RELATED_ARTICLE_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.RELATED_ARTICLE_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.RELATED_ARTICLE_TYPE__RUBY:
				return getRuby();
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID:
				return getJournalId();
			case Jats1Package.RELATED_ARTICLE_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.RELATED_ARTICLE_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.RELATED_ARTICLE_TYPE__ANNOTATION:
				return getAnnotation();
			case Jats1Package.RELATED_ARTICLE_TYPE__ARTICLE_TITLE:
				return getArticleTitle();
			case Jats1Package.RELATED_ARTICLE_TYPE__CHAPTER_TITLE:
				return getChapterTitle();
			case Jats1Package.RELATED_ARTICLE_TYPE__COLLAB:
				return getCollab();
			case Jats1Package.RELATED_ARTICLE_TYPE__COLLAB_ALTERNATIVES:
				return getCollabAlternatives();
			case Jats1Package.RELATED_ARTICLE_TYPE__COMMENT:
				return getComment();
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_ACRONYM:
				return getConfAcronym();
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_DATE:
				return getConfDate();
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_LOC:
				return getConfLoc();
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_NAME:
				return getConfName();
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_SPONSOR:
				return getConfSponsor();
			case Jats1Package.RELATED_ARTICLE_TYPE__DATA_TITLE:
				return getDataTitle();
			case Jats1Package.RELATED_ARTICLE_TYPE__DATE:
				return getDate();
			case Jats1Package.RELATED_ARTICLE_TYPE__DATE_IN_CITATION:
				return getDateInCitation();
			case Jats1Package.RELATED_ARTICLE_TYPE__DAY:
				return getDay();
			case Jats1Package.RELATED_ARTICLE_TYPE__EDITION:
				return getEdition();
			case Jats1Package.RELATED_ARTICLE_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.RELATED_ARTICLE_TYPE__ELOCATION_ID:
				return getElocationId();
			case Jats1Package.RELATED_ARTICLE_TYPE__ETAL:
				return getEtal();
			case Jats1Package.RELATED_ARTICLE_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.RELATED_ARTICLE_TYPE__FPAGE:
				return getFpage();
			case Jats1Package.RELATED_ARTICLE_TYPE__GOV:
				return getGov();
			case Jats1Package.RELATED_ARTICLE_TYPE__INSTITUTION:
				return getInstitution();
			case Jats1Package.RELATED_ARTICLE_TYPE__INSTITUTION_WRAP:
				return getInstitutionWrap();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISBN:
				return getIsbn();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSN:
				return getIssn();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSN_L:
				return getIssnL();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE:
				return getIssue();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_ID:
				return getIssueId();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_PART:
				return getIssuePart();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_TITLE:
				return getIssueTitle();
			case Jats1Package.RELATED_ARTICLE_TYPE__LPAGE:
				return getLpage();
			case Jats1Package.RELATED_ARTICLE_TYPE__MONTH:
				return getMonth();
			case Jats1Package.RELATED_ARTICLE_TYPE__NAME:
				return getName();
			case Jats1Package.RELATED_ARTICLE_TYPE__NAME_ALTERNATIVES:
				return getNameAlternatives();
			case Jats1Package.RELATED_ARTICLE_TYPE__OBJECT_ID:
				return getObjectId();
			case Jats1Package.RELATED_ARTICLE_TYPE__PAGE_RANGE:
				return getPageRange();
			case Jats1Package.RELATED_ARTICLE_TYPE__PART_TITLE:
				return getPartTitle();
			case Jats1Package.RELATED_ARTICLE_TYPE__PATENT:
				return getPatent();
			case Jats1Package.RELATED_ARTICLE_TYPE__PERSON_GROUP:
				return getPersonGroup();
			case Jats1Package.RELATED_ARTICLE_TYPE__PUB_ID:
				return getPubId();
			case Jats1Package.RELATED_ARTICLE_TYPE__PUBLISHER_LOC:
				return getPublisherLoc();
			case Jats1Package.RELATED_ARTICLE_TYPE__PUBLISHER_NAME:
				return getPublisherName();
			case Jats1Package.RELATED_ARTICLE_TYPE__ROLE:
				return getRole();
			case Jats1Package.RELATED_ARTICLE_TYPE__SEASON:
				return getSeason();
			case Jats1Package.RELATED_ARTICLE_TYPE__SERIES:
				return getSeries();
			case Jats1Package.RELATED_ARTICLE_TYPE__SIZE:
				return getSize();
			case Jats1Package.RELATED_ARTICLE_TYPE__SOURCE:
				return getSource();
			case Jats1Package.RELATED_ARTICLE_TYPE__STD:
				return getStd();
			case Jats1Package.RELATED_ARTICLE_TYPE__STRING_NAME:
				return getStringName();
			case Jats1Package.RELATED_ARTICLE_TYPE__SUPPLEMENT:
				return getSupplement();
			case Jats1Package.RELATED_ARTICLE_TYPE__TRANS_SOURCE:
				return getTransSource();
			case Jats1Package.RELATED_ARTICLE_TYPE__TRANS_TITLE:
				return getTransTitle();
			case Jats1Package.RELATED_ARTICLE_TYPE__URI:
				return getUri();
			case Jats1Package.RELATED_ARTICLE_TYPE__VERSION:
				return getVersion();
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME:
				return getVolume();
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME_ID:
				return getVolumeId();
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME_SERIES:
				return getVolumeSeries();
			case Jats1Package.RELATED_ARTICLE_TYPE__YEAR:
				return getYear();
			case Jats1Package.RELATED_ARTICLE_TYPE__SUB:
				return getSub();
			case Jats1Package.RELATED_ARTICLE_TYPE__SUP:
				return getSup();
			case Jats1Package.RELATED_ARTICLE_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.RELATED_ARTICLE_TYPE__BASE:
				return getBase();
			case Jats1Package.RELATED_ARTICLE_TYPE__ELOCATION_ID1:
				return getElocationId1();
			case Jats1Package.RELATED_ARTICLE_TYPE__EXT_LINK_TYPE:
				return getExtLinkType();
			case Jats1Package.RELATED_ARTICLE_TYPE__HREF:
				return getHref();
			case Jats1Package.RELATED_ARTICLE_TYPE__ID:
				return getId();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE1:
				return getIssue1();
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID1:
				return getJournalId1();
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID_TYPE:
				return getJournalIdType();
			case Jats1Package.RELATED_ARTICLE_TYPE__LANG:
				return getLang();
			case Jats1Package.RELATED_ARTICLE_TYPE__PAGE:
				return getPage();
			case Jats1Package.RELATED_ARTICLE_TYPE__RELATED_ARTICLE_TYPE:
				return getRelatedArticleType();
			case Jats1Package.RELATED_ARTICLE_TYPE__ROLE1:
				return getRole1();
			case Jats1Package.RELATED_ARTICLE_TYPE__SHOW:
				return getShow();
			case Jats1Package.RELATED_ARTICLE_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.RELATED_ARTICLE_TYPE__TITLE:
				return getTitle();
			case Jats1Package.RELATED_ARTICLE_TYPE__TYPE:
				return getType();
			case Jats1Package.RELATED_ARTICLE_TYPE__VOL:
				return getVol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Jats1Package.RELATED_ARTICLE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__RELATED_ARTICLE_ELEMENTS:
				((FeatureMap.Internal)getRelatedArticleElements()).set(newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID:
				getJournalId().clear();
				getJournalId().addAll((Collection<? extends JournalIdType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ARTICLE_TITLE:
				getArticleTitle().clear();
				getArticleTitle().addAll((Collection<? extends ArticleTitleType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CHAPTER_TITLE:
				getChapterTitle().clear();
				getChapterTitle().addAll((Collection<? extends ChapterTitleType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__COLLAB:
				getCollab().clear();
				getCollab().addAll((Collection<? extends CollabType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__COLLAB_ALTERNATIVES:
				getCollabAlternatives().clear();
				getCollabAlternatives().addAll((Collection<? extends CollabAlternativesType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends CommentType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_ACRONYM:
				getConfAcronym().clear();
				getConfAcronym().addAll((Collection<? extends ConfAcronymType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_DATE:
				getConfDate().clear();
				getConfDate().addAll((Collection<? extends ConfDateType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_LOC:
				getConfLoc().clear();
				getConfLoc().addAll((Collection<? extends ConfLocType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_NAME:
				getConfName().clear();
				getConfName().addAll((Collection<? extends ConfNameType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_SPONSOR:
				getConfSponsor().clear();
				getConfSponsor().addAll((Collection<? extends ConfSponsorType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__DATA_TITLE:
				getDataTitle().clear();
				getDataTitle().addAll((Collection<? extends DataTitleType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__DATE_IN_CITATION:
				getDateInCitation().clear();
				getDateInCitation().addAll((Collection<? extends DateInCitationType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__DAY:
				getDay().clear();
				getDay().addAll((Collection<? extends DayType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__EDITION:
				getEdition().clear();
				getEdition().addAll((Collection<? extends EditionType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ELOCATION_ID:
				getElocationId().clear();
				getElocationId().addAll((Collection<? extends ElocationIdType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ETAL:
				getEtal().clear();
				getEtal().addAll((Collection<? extends EtalType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__FPAGE:
				getFpage().clear();
				getFpage().addAll((Collection<? extends FpageType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__GOV:
				getGov().clear();
				getGov().addAll((Collection<? extends GovType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				getInstitutionWrap().addAll((Collection<? extends InstitutionWrapType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISBN:
				getIsbn().clear();
				getIsbn().addAll((Collection<? extends IsbnType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSN:
				getIssn().clear();
				getIssn().addAll((Collection<? extends IssnType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSN_L:
				getIssnL().clear();
				getIssnL().addAll((Collection<? extends IssnLType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE:
				getIssue().clear();
				getIssue().addAll((Collection<? extends IssueType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_ID:
				getIssueId().clear();
				getIssueId().addAll((Collection<? extends IssueIdType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_PART:
				getIssuePart().clear();
				getIssuePart().addAll((Collection<? extends IssuePartType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_TITLE:
				getIssueTitle().clear();
				getIssueTitle().addAll((Collection<? extends IssueTitleType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__LPAGE:
				getLpage().clear();
				getLpage().addAll((Collection<? extends LpageType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__MONTH:
				getMonth().clear();
				getMonth().addAll((Collection<? extends MonthType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends NameType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__NAME_ALTERNATIVES:
				getNameAlternatives().clear();
				getNameAlternatives().addAll((Collection<? extends NameAlternativesType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__OBJECT_ID:
				getObjectId().clear();
				getObjectId().addAll((Collection<? extends ObjectIdType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PAGE_RANGE:
				getPageRange().clear();
				getPageRange().addAll((Collection<? extends PageRangeType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PART_TITLE:
				getPartTitle().clear();
				getPartTitle().addAll((Collection<? extends PartTitleType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PATENT:
				getPatent().clear();
				getPatent().addAll((Collection<? extends PatentType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PERSON_GROUP:
				getPersonGroup().clear();
				getPersonGroup().addAll((Collection<? extends PersonGroupType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PUB_ID:
				getPubId().clear();
				getPubId().addAll((Collection<? extends PubIdType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PUBLISHER_LOC:
				getPublisherLoc().clear();
				getPublisherLoc().addAll((Collection<? extends PublisherLocType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PUBLISHER_NAME:
				getPublisherName().clear();
				getPublisherName().addAll((Collection<? extends PublisherNameType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends RoleType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SEASON:
				getSeason().clear();
				getSeason().addAll((Collection<? extends SeasonType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends SeriesType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SIZE:
				getSize().clear();
				getSize().addAll((Collection<? extends SizeType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__STD:
				getStd().clear();
				getStd().addAll((Collection<? extends StdType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__STRING_NAME:
				getStringName().clear();
				getStringName().addAll((Collection<? extends StringNameType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SUPPLEMENT:
				getSupplement().clear();
				getSupplement().addAll((Collection<? extends SupplementType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__TRANS_SOURCE:
				getTransSource().clear();
				getTransSource().addAll((Collection<? extends TransSourceType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__TRANS_TITLE:
				getTransTitle().clear();
				getTransTitle().addAll((Collection<? extends TransTitleType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends VersionType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME:
				getVolume().clear();
				getVolume().addAll((Collection<? extends VolumeType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME_ID:
				getVolumeId().clear();
				getVolumeId().addAll((Collection<? extends VolumeIdType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME_SERIES:
				getVolumeSeries().clear();
				getVolumeSeries().addAll((Collection<? extends VolumeSeriesType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__YEAR:
				getYear().clear();
				getYear().addAll((Collection<? extends YearType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ELOCATION_ID1:
				setElocationId1((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__EXT_LINK_TYPE:
				setExtLinkType((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE1:
				setIssue1((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID1:
				setJournalId1((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID_TYPE:
				setJournalIdType((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PAGE:
				setPage((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__RELATED_ARTICLE_TYPE:
				setRelatedArticleType((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ROLE1:
				setRole1((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__TYPE:
				setType((TypeType)newValue);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__VOL:
				setVol((String)newValue);
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
			case Jats1Package.RELATED_ARTICLE_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__RELATED_ARTICLE_ELEMENTS:
				getRelatedArticleElements().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID:
				getJournalId().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ARTICLE_TITLE:
				getArticleTitle().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CHAPTER_TITLE:
				getChapterTitle().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__COLLAB:
				getCollab().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__COLLAB_ALTERNATIVES:
				getCollabAlternatives().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__COMMENT:
				getComment().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_ACRONYM:
				getConfAcronym().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_DATE:
				getConfDate().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_LOC:
				getConfLoc().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_NAME:
				getConfName().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_SPONSOR:
				getConfSponsor().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__DATA_TITLE:
				getDataTitle().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__DATE:
				getDate().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__DATE_IN_CITATION:
				getDateInCitation().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__DAY:
				getDay().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__EDITION:
				getEdition().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ELOCATION_ID:
				getElocationId().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ETAL:
				getEtal().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__FPAGE:
				getFpage().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__GOV:
				getGov().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISBN:
				getIsbn().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSN:
				getIssn().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSN_L:
				getIssnL().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE:
				getIssue().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_ID:
				getIssueId().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_PART:
				getIssuePart().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_TITLE:
				getIssueTitle().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__LPAGE:
				getLpage().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__MONTH:
				getMonth().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__NAME:
				getName().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__NAME_ALTERNATIVES:
				getNameAlternatives().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__OBJECT_ID:
				getObjectId().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PAGE_RANGE:
				getPageRange().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PART_TITLE:
				getPartTitle().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PATENT:
				getPatent().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PERSON_GROUP:
				getPersonGroup().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PUB_ID:
				getPubId().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PUBLISHER_LOC:
				getPublisherLoc().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PUBLISHER_NAME:
				getPublisherName().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ROLE:
				getRole().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SEASON:
				getSeason().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SERIES:
				getSeries().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SIZE:
				getSize().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SOURCE:
				getSource().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__STD:
				getStd().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__STRING_NAME:
				getStringName().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SUPPLEMENT:
				getSupplement().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__TRANS_SOURCE:
				getTransSource().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__TRANS_TITLE:
				getTransTitle().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__VERSION:
				getVersion().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME:
				getVolume().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME_ID:
				getVolumeId().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME_SERIES:
				getVolumeSeries().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__YEAR:
				getYear().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ELOCATION_ID1:
				setElocationId1(ELOCATION_ID1_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__EXT_LINK_TYPE:
				setExtLinkType(EXT_LINK_TYPE_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE1:
				setIssue1(ISSUE1_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID1:
				setJournalId1(JOURNAL_ID1_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID_TYPE:
				setJournalIdType(JOURNAL_ID_TYPE_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__PAGE:
				setPage(PAGE_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__RELATED_ARTICLE_TYPE:
				setRelatedArticleType(RELATED_ARTICLE_TYPE_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__TYPE:
				unsetType();
				return;
			case Jats1Package.RELATED_ARTICLE_TYPE__VOL:
				setVol(VOL_EDEFAULT);
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
			case Jats1Package.RELATED_ARTICLE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__RELATED_ARTICLE_ELEMENTS:
				return !getRelatedArticleElements().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID:
				return !getJournalId().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ARTICLE_TITLE:
				return !getArticleTitle().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__CHAPTER_TITLE:
				return !getChapterTitle().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__COLLAB:
				return !getCollab().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__COLLAB_ALTERNATIVES:
				return !getCollabAlternatives().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__COMMENT:
				return !getComment().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_ACRONYM:
				return !getConfAcronym().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_DATE:
				return !getConfDate().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_LOC:
				return !getConfLoc().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_NAME:
				return !getConfName().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__CONF_SPONSOR:
				return !getConfSponsor().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__DATA_TITLE:
				return !getDataTitle().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__DATE:
				return !getDate().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__DATE_IN_CITATION:
				return !getDateInCitation().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__DAY:
				return !getDay().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__EDITION:
				return !getEdition().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ELOCATION_ID:
				return !getElocationId().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ETAL:
				return !getEtal().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__FPAGE:
				return !getFpage().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__GOV:
				return !getGov().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__INSTITUTION:
				return !getInstitution().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__INSTITUTION_WRAP:
				return !getInstitutionWrap().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISBN:
				return !getIsbn().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSN:
				return !getIssn().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSN_L:
				return !getIssnL().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE:
				return !getIssue().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_ID:
				return !getIssueId().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_PART:
				return !getIssuePart().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE_TITLE:
				return !getIssueTitle().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__LPAGE:
				return !getLpage().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__MONTH:
				return !getMonth().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__NAME:
				return !getName().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__NAME_ALTERNATIVES:
				return !getNameAlternatives().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__OBJECT_ID:
				return !getObjectId().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__PAGE_RANGE:
				return !getPageRange().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__PART_TITLE:
				return !getPartTitle().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__PATENT:
				return !getPatent().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__PERSON_GROUP:
				return !getPersonGroup().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__PUB_ID:
				return !getPubId().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__PUBLISHER_LOC:
				return !getPublisherLoc().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__PUBLISHER_NAME:
				return !getPublisherName().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ROLE:
				return !getRole().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__SEASON:
				return !getSeason().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__SERIES:
				return !getSeries().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__SIZE:
				return !getSize().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__SOURCE:
				return !getSource().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__STD:
				return !getStd().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__STRING_NAME:
				return !getStringName().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__SUPPLEMENT:
				return !getSupplement().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__TRANS_SOURCE:
				return !getTransSource().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__TRANS_TITLE:
				return !getTransTitle().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__VERSION:
				return !getVersion().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME:
				return !getVolume().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME_ID:
				return !getVolumeId().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__VOLUME_SERIES:
				return !getVolumeSeries().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__YEAR:
				return !getYear().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.RELATED_ARTICLE_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.RELATED_ARTICLE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.RELATED_ARTICLE_TYPE__ELOCATION_ID1:
				return ELOCATION_ID1_EDEFAULT == null ? elocationId1 != null : !ELOCATION_ID1_EDEFAULT.equals(elocationId1);
			case Jats1Package.RELATED_ARTICLE_TYPE__EXT_LINK_TYPE:
				return EXT_LINK_TYPE_EDEFAULT == null ? extLinkType != null : !EXT_LINK_TYPE_EDEFAULT.equals(extLinkType);
			case Jats1Package.RELATED_ARTICLE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.RELATED_ARTICLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.RELATED_ARTICLE_TYPE__ISSUE1:
				return ISSUE1_EDEFAULT == null ? issue1 != null : !ISSUE1_EDEFAULT.equals(issue1);
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID1:
				return JOURNAL_ID1_EDEFAULT == null ? journalId1 != null : !JOURNAL_ID1_EDEFAULT.equals(journalId1);
			case Jats1Package.RELATED_ARTICLE_TYPE__JOURNAL_ID_TYPE:
				return JOURNAL_ID_TYPE_EDEFAULT == null ? journalIdType != null : !JOURNAL_ID_TYPE_EDEFAULT.equals(journalIdType);
			case Jats1Package.RELATED_ARTICLE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.RELATED_ARTICLE_TYPE__PAGE:
				return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
			case Jats1Package.RELATED_ARTICLE_TYPE__RELATED_ARTICLE_TYPE:
				return RELATED_ARTICLE_TYPE_EDEFAULT == null ? relatedArticleType != null : !RELATED_ARTICLE_TYPE_EDEFAULT.equals(relatedArticleType);
			case Jats1Package.RELATED_ARTICLE_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case Jats1Package.RELATED_ARTICLE_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.RELATED_ARTICLE_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.RELATED_ARTICLE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Jats1Package.RELATED_ARTICLE_TYPE__TYPE:
				return isSetType();
			case Jats1Package.RELATED_ARTICLE_TYPE__VOL:
				return VOL_EDEFAULT == null ? vol != null : !VOL_EDEFAULT.equals(vol);
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
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", base: ");
		result.append(base);
		result.append(", elocationId1: ");
		result.append(elocationId1);
		result.append(", extLinkType: ");
		result.append(extLinkType);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", issue1: ");
		result.append(issue1);
		result.append(", journalId1: ");
		result.append(journalId1);
		result.append(", journalIdType: ");
		result.append(journalIdType);
		result.append(", lang: ");
		result.append(lang);
		result.append(", page: ");
		result.append(page);
		result.append(", relatedArticleType: ");
		result.append(relatedArticleType);
		result.append(", role1: ");
		result.append(role1);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", vol: ");
		result.append(vol);
		result.append(')');
		return result.toString();
	}

} //RelatedArticleTypeImpl
