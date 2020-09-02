/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbstractType;
import gov.nih.nlm.ncbi.jats1.AffAlternativesType;
import gov.nih.nlm.ncbi.jats1.AffType;
import gov.nih.nlm.ncbi.jats1.ArticleCategoriesType;
import gov.nih.nlm.ncbi.jats1.ArticleIdType;
import gov.nih.nlm.ncbi.jats1.ArticleMetaType;
import gov.nih.nlm.ncbi.jats1.ArticleVersionAlternativesType;
import gov.nih.nlm.ncbi.jats1.ArticleVersionType;
import gov.nih.nlm.ncbi.jats1.AuthorNotesType;
import gov.nih.nlm.ncbi.jats1.ConferenceType;
import gov.nih.nlm.ncbi.jats1.ContribGroupType;
import gov.nih.nlm.ncbi.jats1.CountsType;
import gov.nih.nlm.ncbi.jats1.CustomMetaGroupType;
import gov.nih.nlm.ncbi.jats1.ElocationIdType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FpageType;
import gov.nih.nlm.ncbi.jats1.FundingGroupType;
import gov.nih.nlm.ncbi.jats1.HistoryType;
import gov.nih.nlm.ncbi.jats1.IsbnType;
import gov.nih.nlm.ncbi.jats1.IssueIdType;
import gov.nih.nlm.ncbi.jats1.IssuePartType;
import gov.nih.nlm.ncbi.jats1.IssueSponsorType;
import gov.nih.nlm.ncbi.jats1.IssueTitleType;
import gov.nih.nlm.ncbi.jats1.IssueType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.KwdGroupType;
import gov.nih.nlm.ncbi.jats1.LpageType;
import gov.nih.nlm.ncbi.jats1.PageRangeType;
import gov.nih.nlm.ncbi.jats1.PermissionsType;
import gov.nih.nlm.ncbi.jats1.ProductType;
import gov.nih.nlm.ncbi.jats1.PubDateNotAvailableType;
import gov.nih.nlm.ncbi.jats1.PubDateType;
import gov.nih.nlm.ncbi.jats1.PubHistoryType;
import gov.nih.nlm.ncbi.jats1.RelatedArticleType;
import gov.nih.nlm.ncbi.jats1.RelatedObjectType;
import gov.nih.nlm.ncbi.jats1.SelfUriType;
import gov.nih.nlm.ncbi.jats1.SupplementType;
import gov.nih.nlm.ncbi.jats1.SupplementaryMaterialType;
import gov.nih.nlm.ncbi.jats1.SupportGroupType;
import gov.nih.nlm.ncbi.jats1.TitleGroupType;
import gov.nih.nlm.ncbi.jats1.TransAbstractType;
import gov.nih.nlm.ncbi.jats1.UriType;
import gov.nih.nlm.ncbi.jats1.VolumeIdType;
import gov.nih.nlm.ncbi.jats1.VolumeIssueGroupType;
import gov.nih.nlm.ncbi.jats1.VolumeSeriesType;
import gov.nih.nlm.ncbi.jats1.VolumeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article Meta Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getArticleId <em>Article Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getArticleVersion <em>Article Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getArticleVersionAlternatives <em>Article Version Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getArticleCategories <em>Article Categories</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getTitleGroup <em>Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getContribGroup <em>Contrib Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getAff <em>Aff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getAffAlternatives <em>Aff Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getAuthorNotes <em>Author Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getPubDateClass <em>Pub Date Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getPubDate <em>Pub Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getPubDateNotAvailable <em>Pub Date Not Available</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getVolumeId <em>Volume Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getVolumeSeries <em>Volume Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getIssueId <em>Issue Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getIssueTitle <em>Issue Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getIssueSponsor <em>Issue Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getIssuePart <em>Issue Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getVolumeIssueGroup <em>Volume Issue Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getFpage <em>Fpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getLpage <em>Lpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getPageRange <em>Page Range</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getHistory <em>History</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getPubHistory <em>Pub History</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getSelfUri <em>Self Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getRelatedArticleClass <em>Related Article Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getAbstractClass <em>Abstract Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getTransAbstract <em>Trans Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getKwdGroupClass <em>Kwd Group Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getKwdGroup <em>Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getFundingGroup <em>Funding Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getSupportGroup <em>Support Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getConference <em>Conference</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getCounts <em>Counts</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getCustomMetaGroup <em>Custom Meta Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleMetaTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleMetaTypeImpl extends MinimalEObjectImpl.Container implements ArticleMetaType {
	/**
	 * The cached value of the '{@link #getArticleId() <em>Article Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleId()
	 * @generated
	 * @ordered
	 */
	protected EList<ArticleIdType> articleId;

	/**
	 * The cached value of the '{@link #getArticleVersion() <em>Article Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleVersion()
	 * @generated
	 * @ordered
	 */
	protected ArticleVersionType articleVersion;

	/**
	 * The cached value of the '{@link #getArticleVersionAlternatives() <em>Article Version Alternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleVersionAlternatives()
	 * @generated
	 * @ordered
	 */
	protected ArticleVersionAlternativesType articleVersionAlternatives;

	/**
	 * The cached value of the '{@link #getArticleCategories() <em>Article Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleCategories()
	 * @generated
	 * @ordered
	 */
	protected ArticleCategoriesType articleCategories;

	/**
	 * The cached value of the '{@link #getTitleGroup() <em>Title Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleGroup()
	 * @generated
	 * @ordered
	 */
	protected TitleGroupType titleGroup;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getAuthorNotes() <em>Author Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorNotes()
	 * @generated
	 * @ordered
	 */
	protected AuthorNotesType authorNotes;

	/**
	 * The cached value of the '{@link #getPubDateClass() <em>Pub Date Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubDateClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap pubDateClass;

	/**
	 * The cached value of the '{@link #getPubDateNotAvailable() <em>Pub Date Not Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubDateNotAvailable()
	 * @generated
	 * @ordered
	 */
	protected PubDateNotAvailableType pubDateNotAvailable;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeType> volume;

	/**
	 * The cached value of the '{@link #getVolumeId() <em>Volume Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeId()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeIdType> volumeId;

	/**
	 * The cached value of the '{@link #getVolumeSeries() <em>Volume Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeSeries()
	 * @generated
	 * @ordered
	 */
	protected VolumeSeriesType volumeSeries;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueType> issue;

	/**
	 * The cached value of the '{@link #getIssueId() <em>Issue Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueId()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueIdType> issueId;

	/**
	 * The cached value of the '{@link #getIssueTitle() <em>Issue Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueTitleType> issueTitle;

	/**
	 * The cached value of the '{@link #getIssueSponsor() <em>Issue Sponsor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueSponsor()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueSponsorType> issueSponsor;

	/**
	 * The cached value of the '{@link #getIssuePart() <em>Issue Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuePart()
	 * @generated
	 * @ordered
	 */
	protected IssuePartType issuePart;

	/**
	 * The cached value of the '{@link #getVolumeIssueGroup() <em>Volume Issue Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeIssueGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeIssueGroupType> volumeIssueGroup;

	/**
	 * The cached value of the '{@link #getIsbn() <em>Isbn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected EList<IsbnType> isbn;

	/**
	 * The cached value of the '{@link #getSupplement() <em>Supplement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplement()
	 * @generated
	 * @ordered
	 */
	protected SupplementType supplement;

	/**
	 * The cached value of the '{@link #getFpage() <em>Fpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpage()
	 * @generated
	 * @ordered
	 */
	protected FpageType fpage;

	/**
	 * The cached value of the '{@link #getLpage() <em>Lpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpage()
	 * @generated
	 * @ordered
	 */
	protected LpageType lpage;

	/**
	 * The cached value of the '{@link #getPageRange() <em>Page Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageRange()
	 * @generated
	 * @ordered
	 */
	protected PageRangeType pageRange;

	/**
	 * The cached value of the '{@link #getElocationId() <em>Elocation Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElocationId()
	 * @generated
	 * @ordered
	 */
	protected ElocationIdType elocationId;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected HistoryType history;

	/**
	 * The cached value of the '{@link #getPubHistory() <em>Pub History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubHistory()
	 * @generated
	 * @ordered
	 */
	protected PubHistoryType pubHistory;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected PermissionsType permissions;

	/**
	 * The cached value of the '{@link #getSelfUri() <em>Self Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfUri()
	 * @generated
	 * @ordered
	 */
	protected EList<SelfUriType> selfUri;

	/**
	 * The cached value of the '{@link #getRelatedArticleClass() <em>Related Article Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArticleClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap relatedArticleClass;

	/**
	 * The cached value of the '{@link #getAbstractClass() <em>Abstract Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractClass;

	/**
	 * The cached value of the '{@link #getTransAbstract() <em>Trans Abstract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransAbstract()
	 * @generated
	 * @ordered
	 */
	protected EList<TransAbstractType> transAbstract;

	/**
	 * The cached value of the '{@link #getKwdGroupClass() <em>Kwd Group Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKwdGroupClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap kwdGroupClass;

	/**
	 * The cached value of the '{@link #getFundingGroup() <em>Funding Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundingGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<FundingGroupType> fundingGroup;

	/**
	 * The cached value of the '{@link #getSupportGroup() <em>Support Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportGroupType> supportGroup;

	/**
	 * The cached value of the '{@link #getConference() <em>Conference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConference()
	 * @generated
	 * @ordered
	 */
	protected EList<ConferenceType> conference;

	/**
	 * The cached value of the '{@link #getCounts() <em>Counts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounts()
	 * @generated
	 * @ordered
	 */
	protected CountsType counts;

	/**
	 * The cached value of the '{@link #getCustomMetaGroup() <em>Custom Meta Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMetaGroup()
	 * @generated
	 * @ordered
	 */
	protected CustomMetaGroupType customMetaGroup;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleMetaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getArticleMetaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArticleIdType> getArticleId() {
		if (articleId == null) {
			articleId = new EObjectContainmentEList<ArticleIdType>(ArticleIdType.class, this, Jats1Package.ARTICLE_META_TYPE__ARTICLE_ID);
		}
		return articleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleVersionType getArticleVersion() {
		return articleVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleVersion(ArticleVersionType newArticleVersion, NotificationChain msgs) {
		ArticleVersionType oldArticleVersion = articleVersion;
		articleVersion = newArticleVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION, oldArticleVersion, newArticleVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleVersion(ArticleVersionType newArticleVersion) {
		if (newArticleVersion != articleVersion) {
			NotificationChain msgs = null;
			if (articleVersion != null)
				msgs = ((InternalEObject)articleVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION, null, msgs);
			if (newArticleVersion != null)
				msgs = ((InternalEObject)newArticleVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION, null, msgs);
			msgs = basicSetArticleVersion(newArticleVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION, newArticleVersion, newArticleVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleVersionAlternativesType getArticleVersionAlternatives() {
		return articleVersionAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleVersionAlternatives(ArticleVersionAlternativesType newArticleVersionAlternatives, NotificationChain msgs) {
		ArticleVersionAlternativesType oldArticleVersionAlternatives = articleVersionAlternatives;
		articleVersionAlternatives = newArticleVersionAlternatives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION_ALTERNATIVES, oldArticleVersionAlternatives, newArticleVersionAlternatives);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleVersionAlternatives(ArticleVersionAlternativesType newArticleVersionAlternatives) {
		if (newArticleVersionAlternatives != articleVersionAlternatives) {
			NotificationChain msgs = null;
			if (articleVersionAlternatives != null)
				msgs = ((InternalEObject)articleVersionAlternatives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION_ALTERNATIVES, null, msgs);
			if (newArticleVersionAlternatives != null)
				msgs = ((InternalEObject)newArticleVersionAlternatives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION_ALTERNATIVES, null, msgs);
			msgs = basicSetArticleVersionAlternatives(newArticleVersionAlternatives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION_ALTERNATIVES, newArticleVersionAlternatives, newArticleVersionAlternatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleCategoriesType getArticleCategories() {
		return articleCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleCategories(ArticleCategoriesType newArticleCategories, NotificationChain msgs) {
		ArticleCategoriesType oldArticleCategories = articleCategories;
		articleCategories = newArticleCategories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ARTICLE_CATEGORIES, oldArticleCategories, newArticleCategories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleCategories(ArticleCategoriesType newArticleCategories) {
		if (newArticleCategories != articleCategories) {
			NotificationChain msgs = null;
			if (articleCategories != null)
				msgs = ((InternalEObject)articleCategories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__ARTICLE_CATEGORIES, null, msgs);
			if (newArticleCategories != null)
				msgs = ((InternalEObject)newArticleCategories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__ARTICLE_CATEGORIES, null, msgs);
			msgs = basicSetArticleCategories(newArticleCategories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ARTICLE_CATEGORIES, newArticleCategories, newArticleCategories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleGroupType getTitleGroup() {
		return titleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitleGroup(TitleGroupType newTitleGroup, NotificationChain msgs) {
		TitleGroupType oldTitleGroup = titleGroup;
		titleGroup = newTitleGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__TITLE_GROUP, oldTitleGroup, newTitleGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleGroup(TitleGroupType newTitleGroup) {
		if (newTitleGroup != titleGroup) {
			NotificationChain msgs = null;
			if (titleGroup != null)
				msgs = ((InternalEObject)titleGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__TITLE_GROUP, null, msgs);
			if (newTitleGroup != null)
				msgs = ((InternalEObject)newTitleGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__TITLE_GROUP, null, msgs);
			msgs = basicSetTitleGroup(newTitleGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__TITLE_GROUP, newTitleGroup, newTitleGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.ARTICLE_META_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContribGroupType> getContribGroup() {
		return getGroup().list(Jats1Package.eINSTANCE.getArticleMetaType_ContribGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffType> getAff() {
		return getGroup().list(Jats1Package.eINSTANCE.getArticleMetaType_Aff());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffAlternativesType> getAffAlternatives() {
		return getGroup().list(Jats1Package.eINSTANCE.getArticleMetaType_AffAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorNotesType getAuthorNotes() {
		return authorNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorNotes(AuthorNotesType newAuthorNotes, NotificationChain msgs) {
		AuthorNotesType oldAuthorNotes = authorNotes;
		authorNotes = newAuthorNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__AUTHOR_NOTES, oldAuthorNotes, newAuthorNotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorNotes(AuthorNotesType newAuthorNotes) {
		if (newAuthorNotes != authorNotes) {
			NotificationChain msgs = null;
			if (authorNotes != null)
				msgs = ((InternalEObject)authorNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__AUTHOR_NOTES, null, msgs);
			if (newAuthorNotes != null)
				msgs = ((InternalEObject)newAuthorNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__AUTHOR_NOTES, null, msgs);
			msgs = basicSetAuthorNotes(newAuthorNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__AUTHOR_NOTES, newAuthorNotes, newAuthorNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPubDateClass() {
		if (pubDateClass == null) {
			pubDateClass = new BasicFeatureMap(this, Jats1Package.ARTICLE_META_TYPE__PUB_DATE_CLASS);
		}
		return pubDateClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PubDateType> getPubDate() {
		return getPubDateClass().list(Jats1Package.eINSTANCE.getArticleMetaType_PubDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubDateNotAvailableType getPubDateNotAvailable() {
		return pubDateNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubDateNotAvailable(PubDateNotAvailableType newPubDateNotAvailable, NotificationChain msgs) {
		PubDateNotAvailableType oldPubDateNotAvailable = pubDateNotAvailable;
		pubDateNotAvailable = newPubDateNotAvailable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__PUB_DATE_NOT_AVAILABLE, oldPubDateNotAvailable, newPubDateNotAvailable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubDateNotAvailable(PubDateNotAvailableType newPubDateNotAvailable) {
		if (newPubDateNotAvailable != pubDateNotAvailable) {
			NotificationChain msgs = null;
			if (pubDateNotAvailable != null)
				msgs = ((InternalEObject)pubDateNotAvailable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__PUB_DATE_NOT_AVAILABLE, null, msgs);
			if (newPubDateNotAvailable != null)
				msgs = ((InternalEObject)newPubDateNotAvailable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__PUB_DATE_NOT_AVAILABLE, null, msgs);
			msgs = basicSetPubDateNotAvailable(newPubDateNotAvailable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__PUB_DATE_NOT_AVAILABLE, newPubDateNotAvailable, newPubDateNotAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeType> getVolume() {
		if (volume == null) {
			volume = new EObjectContainmentEList<VolumeType>(VolumeType.class, this, Jats1Package.ARTICLE_META_TYPE__VOLUME);
		}
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeIdType> getVolumeId() {
		if (volumeId == null) {
			volumeId = new EObjectContainmentEList<VolumeIdType>(VolumeIdType.class, this, Jats1Package.ARTICLE_META_TYPE__VOLUME_ID);
		}
		return volumeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeSeriesType getVolumeSeries() {
		return volumeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumeSeries(VolumeSeriesType newVolumeSeries, NotificationChain msgs) {
		VolumeSeriesType oldVolumeSeries = volumeSeries;
		volumeSeries = newVolumeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__VOLUME_SERIES, oldVolumeSeries, newVolumeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeSeries(VolumeSeriesType newVolumeSeries) {
		if (newVolumeSeries != volumeSeries) {
			NotificationChain msgs = null;
			if (volumeSeries != null)
				msgs = ((InternalEObject)volumeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__VOLUME_SERIES, null, msgs);
			if (newVolumeSeries != null)
				msgs = ((InternalEObject)newVolumeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__VOLUME_SERIES, null, msgs);
			msgs = basicSetVolumeSeries(newVolumeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__VOLUME_SERIES, newVolumeSeries, newVolumeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueType> getIssue() {
		if (issue == null) {
			issue = new EObjectContainmentEList<IssueType>(IssueType.class, this, Jats1Package.ARTICLE_META_TYPE__ISSUE);
		}
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueIdType> getIssueId() {
		if (issueId == null) {
			issueId = new EObjectContainmentEList<IssueIdType>(IssueIdType.class, this, Jats1Package.ARTICLE_META_TYPE__ISSUE_ID);
		}
		return issueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueTitleType> getIssueTitle() {
		if (issueTitle == null) {
			issueTitle = new EObjectContainmentEList<IssueTitleType>(IssueTitleType.class, this, Jats1Package.ARTICLE_META_TYPE__ISSUE_TITLE);
		}
		return issueTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueSponsorType> getIssueSponsor() {
		if (issueSponsor == null) {
			issueSponsor = new EObjectContainmentEList<IssueSponsorType>(IssueSponsorType.class, this, Jats1Package.ARTICLE_META_TYPE__ISSUE_SPONSOR);
		}
		return issueSponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssuePartType getIssuePart() {
		return issuePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuePart(IssuePartType newIssuePart, NotificationChain msgs) {
		IssuePartType oldIssuePart = issuePart;
		issuePart = newIssuePart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ISSUE_PART, oldIssuePart, newIssuePart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuePart(IssuePartType newIssuePart) {
		if (newIssuePart != issuePart) {
			NotificationChain msgs = null;
			if (issuePart != null)
				msgs = ((InternalEObject)issuePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__ISSUE_PART, null, msgs);
			if (newIssuePart != null)
				msgs = ((InternalEObject)newIssuePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__ISSUE_PART, null, msgs);
			msgs = basicSetIssuePart(newIssuePart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ISSUE_PART, newIssuePart, newIssuePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeIssueGroupType> getVolumeIssueGroup() {
		if (volumeIssueGroup == null) {
			volumeIssueGroup = new EObjectContainmentEList<VolumeIssueGroupType>(VolumeIssueGroupType.class, this, Jats1Package.ARTICLE_META_TYPE__VOLUME_ISSUE_GROUP);
		}
		return volumeIssueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IsbnType> getIsbn() {
		if (isbn == null) {
			isbn = new EObjectContainmentEList<IsbnType>(IsbnType.class, this, Jats1Package.ARTICLE_META_TYPE__ISBN);
		}
		return isbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplementType getSupplement() {
		return supplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplement(SupplementType newSupplement, NotificationChain msgs) {
		SupplementType oldSupplement = supplement;
		supplement = newSupplement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__SUPPLEMENT, oldSupplement, newSupplement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplement(SupplementType newSupplement) {
		if (newSupplement != supplement) {
			NotificationChain msgs = null;
			if (supplement != null)
				msgs = ((InternalEObject)supplement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__SUPPLEMENT, null, msgs);
			if (newSupplement != null)
				msgs = ((InternalEObject)newSupplement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__SUPPLEMENT, null, msgs);
			msgs = basicSetSupplement(newSupplement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__SUPPLEMENT, newSupplement, newSupplement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FpageType getFpage() {
		return fpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFpage(FpageType newFpage, NotificationChain msgs) {
		FpageType oldFpage = fpage;
		fpage = newFpage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__FPAGE, oldFpage, newFpage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFpage(FpageType newFpage) {
		if (newFpage != fpage) {
			NotificationChain msgs = null;
			if (fpage != null)
				msgs = ((InternalEObject)fpage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__FPAGE, null, msgs);
			if (newFpage != null)
				msgs = ((InternalEObject)newFpage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__FPAGE, null, msgs);
			msgs = basicSetFpage(newFpage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__FPAGE, newFpage, newFpage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LpageType getLpage() {
		return lpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpage(LpageType newLpage, NotificationChain msgs) {
		LpageType oldLpage = lpage;
		lpage = newLpage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__LPAGE, oldLpage, newLpage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLpage(LpageType newLpage) {
		if (newLpage != lpage) {
			NotificationChain msgs = null;
			if (lpage != null)
				msgs = ((InternalEObject)lpage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__LPAGE, null, msgs);
			if (newLpage != null)
				msgs = ((InternalEObject)newLpage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__LPAGE, null, msgs);
			msgs = basicSetLpage(newLpage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__LPAGE, newLpage, newLpage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageRangeType getPageRange() {
		return pageRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageRange(PageRangeType newPageRange, NotificationChain msgs) {
		PageRangeType oldPageRange = pageRange;
		pageRange = newPageRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__PAGE_RANGE, oldPageRange, newPageRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageRange(PageRangeType newPageRange) {
		if (newPageRange != pageRange) {
			NotificationChain msgs = null;
			if (pageRange != null)
				msgs = ((InternalEObject)pageRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__PAGE_RANGE, null, msgs);
			if (newPageRange != null)
				msgs = ((InternalEObject)newPageRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__PAGE_RANGE, null, msgs);
			msgs = basicSetPageRange(newPageRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__PAGE_RANGE, newPageRange, newPageRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElocationIdType getElocationId() {
		return elocationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElocationId(ElocationIdType newElocationId, NotificationChain msgs) {
		ElocationIdType oldElocationId = elocationId;
		elocationId = newElocationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ELOCATION_ID, oldElocationId, newElocationId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElocationId(ElocationIdType newElocationId) {
		if (newElocationId != elocationId) {
			NotificationChain msgs = null;
			if (elocationId != null)
				msgs = ((InternalEObject)elocationId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__ELOCATION_ID, null, msgs);
			if (newElocationId != null)
				msgs = ((InternalEObject)newElocationId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__ELOCATION_ID, null, msgs);
			msgs = basicSetElocationId(newElocationId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ELOCATION_ID, newElocationId, newElocationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, Jats1Package.ARTICLE_META_TYPE__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getGroup1().list(Jats1Package.eINSTANCE.getArticleMetaType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getGroup1().list(Jats1Package.eINSTANCE.getArticleMetaType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getGroup1().list(Jats1Package.eINSTANCE.getArticleMetaType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductType> getProduct() {
		return getGroup1().list(Jats1Package.eINSTANCE.getArticleMetaType_Product());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getGroup1().list(Jats1Package.eINSTANCE.getArticleMetaType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryType getHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistory(HistoryType newHistory, NotificationChain msgs) {
		HistoryType oldHistory = history;
		history = newHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__HISTORY, oldHistory, newHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistory(HistoryType newHistory) {
		if (newHistory != history) {
			NotificationChain msgs = null;
			if (history != null)
				msgs = ((InternalEObject)history).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__HISTORY, null, msgs);
			if (newHistory != null)
				msgs = ((InternalEObject)newHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__HISTORY, null, msgs);
			msgs = basicSetHistory(newHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__HISTORY, newHistory, newHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubHistoryType getPubHistory() {
		return pubHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubHistory(PubHistoryType newPubHistory, NotificationChain msgs) {
		PubHistoryType oldPubHistory = pubHistory;
		pubHistory = newPubHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__PUB_HISTORY, oldPubHistory, newPubHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubHistory(PubHistoryType newPubHistory) {
		if (newPubHistory != pubHistory) {
			NotificationChain msgs = null;
			if (pubHistory != null)
				msgs = ((InternalEObject)pubHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__PUB_HISTORY, null, msgs);
			if (newPubHistory != null)
				msgs = ((InternalEObject)newPubHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__PUB_HISTORY, null, msgs);
			msgs = basicSetPubHistory(newPubHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__PUB_HISTORY, newPubHistory, newPubHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsType getPermissions() {
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermissions(PermissionsType newPermissions, NotificationChain msgs) {
		PermissionsType oldPermissions = permissions;
		permissions = newPermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__PERMISSIONS, oldPermissions, newPermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissions(PermissionsType newPermissions) {
		if (newPermissions != permissions) {
			NotificationChain msgs = null;
			if (permissions != null)
				msgs = ((InternalEObject)permissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__PERMISSIONS, null, msgs);
			if (newPermissions != null)
				msgs = ((InternalEObject)newPermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__PERMISSIONS, null, msgs);
			msgs = basicSetPermissions(newPermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__PERMISSIONS, newPermissions, newPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelfUriType> getSelfUri() {
		if (selfUri == null) {
			selfUri = new EObjectContainmentEList<SelfUriType>(SelfUriType.class, this, Jats1Package.ARTICLE_META_TYPE__SELF_URI);
		}
		return selfUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getRelatedArticleClass() {
		if (relatedArticleClass == null) {
			relatedArticleClass = new BasicFeatureMap(this, Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE_CLASS);
		}
		return relatedArticleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getRelatedArticleClass().list(Jats1Package.eINSTANCE.getArticleMetaType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getRelatedArticleClass().list(Jats1Package.eINSTANCE.getArticleMetaType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractClass() {
		if (abstractClass == null) {
			abstractClass = new BasicFeatureMap(this, Jats1Package.ARTICLE_META_TYPE__ABSTRACT_CLASS);
		}
		return abstractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractType> getAbstract() {
		return getAbstractClass().list(Jats1Package.eINSTANCE.getArticleMetaType_Abstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransAbstractType> getTransAbstract() {
		if (transAbstract == null) {
			transAbstract = new EObjectContainmentEList<TransAbstractType>(TransAbstractType.class, this, Jats1Package.ARTICLE_META_TYPE__TRANS_ABSTRACT);
		}
		return transAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getKwdGroupClass() {
		if (kwdGroupClass == null) {
			kwdGroupClass = new BasicFeatureMap(this, Jats1Package.ARTICLE_META_TYPE__KWD_GROUP_CLASS);
		}
		return kwdGroupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KwdGroupType> getKwdGroup() {
		return getKwdGroupClass().list(Jats1Package.eINSTANCE.getArticleMetaType_KwdGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FundingGroupType> getFundingGroup() {
		if (fundingGroup == null) {
			fundingGroup = new EObjectContainmentEList<FundingGroupType>(FundingGroupType.class, this, Jats1Package.ARTICLE_META_TYPE__FUNDING_GROUP);
		}
		return fundingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupportGroupType> getSupportGroup() {
		if (supportGroup == null) {
			supportGroup = new EObjectContainmentEList<SupportGroupType>(SupportGroupType.class, this, Jats1Package.ARTICLE_META_TYPE__SUPPORT_GROUP);
		}
		return supportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConferenceType> getConference() {
		if (conference == null) {
			conference = new EObjectContainmentEList<ConferenceType>(ConferenceType.class, this, Jats1Package.ARTICLE_META_TYPE__CONFERENCE);
		}
		return conference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountsType getCounts() {
		return counts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounts(CountsType newCounts, NotificationChain msgs) {
		CountsType oldCounts = counts;
		counts = newCounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__COUNTS, oldCounts, newCounts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounts(CountsType newCounts) {
		if (newCounts != counts) {
			NotificationChain msgs = null;
			if (counts != null)
				msgs = ((InternalEObject)counts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__COUNTS, null, msgs);
			if (newCounts != null)
				msgs = ((InternalEObject)newCounts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__COUNTS, null, msgs);
			msgs = basicSetCounts(newCounts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__COUNTS, newCounts, newCounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMetaGroupType getCustomMetaGroup() {
		return customMetaGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomMetaGroup(CustomMetaGroupType newCustomMetaGroup, NotificationChain msgs) {
		CustomMetaGroupType oldCustomMetaGroup = customMetaGroup;
		customMetaGroup = newCustomMetaGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__CUSTOM_META_GROUP, oldCustomMetaGroup, newCustomMetaGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMetaGroup(CustomMetaGroupType newCustomMetaGroup) {
		if (newCustomMetaGroup != customMetaGroup) {
			NotificationChain msgs = null;
			if (customMetaGroup != null)
				msgs = ((InternalEObject)customMetaGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__CUSTOM_META_GROUP, null, msgs);
			if (newCustomMetaGroup != null)
				msgs = ((InternalEObject)newCustomMetaGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_META_TYPE__CUSTOM_META_GROUP, null, msgs);
			msgs = basicSetCustomMetaGroup(newCustomMetaGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__CUSTOM_META_GROUP, newCustomMetaGroup, newCustomMetaGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_META_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_ID:
				return ((InternalEList<?>)getArticleId()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION:
				return basicSetArticleVersion(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				return basicSetArticleVersionAlternatives(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_CATEGORIES:
				return basicSetArticleCategories(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__TITLE_GROUP:
				return basicSetTitleGroup(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__CONTRIB_GROUP:
				return ((InternalEList<?>)getContribGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__AFF:
				return ((InternalEList<?>)getAff()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__AFF_ALTERNATIVES:
				return ((InternalEList<?>)getAffAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__AUTHOR_NOTES:
				return basicSetAuthorNotes(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE_CLASS:
				return ((InternalEList<?>)getPubDateClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE:
				return ((InternalEList<?>)getPubDate()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE_NOT_AVAILABLE:
				return basicSetPubDateNotAvailable(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__VOLUME:
				return ((InternalEList<?>)getVolume()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_ID:
				return ((InternalEList<?>)getVolumeId()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_SERIES:
				return basicSetVolumeSeries(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ISSUE:
				return ((InternalEList<?>)getIssue()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_ID:
				return ((InternalEList<?>)getIssueId()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_TITLE:
				return ((InternalEList<?>)getIssueTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_SPONSOR:
				return ((InternalEList<?>)getIssueSponsor()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_PART:
				return basicSetIssuePart(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_ISSUE_GROUP:
				return ((InternalEList<?>)getVolumeIssueGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ISBN:
				return ((InternalEList<?>)getIsbn()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__SUPPLEMENT:
				return basicSetSupplement(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__FPAGE:
				return basicSetFpage(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__LPAGE:
				return basicSetLpage(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__PAGE_RANGE:
				return basicSetPageRange(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ELOCATION_ID:
				return basicSetElocationId(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__PRODUCT:
				return ((InternalEList<?>)getProduct()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__HISTORY:
				return basicSetHistory(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__PUB_HISTORY:
				return basicSetPubHistory(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__PERMISSIONS:
				return basicSetPermissions(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__SELF_URI:
				return ((InternalEList<?>)getSelfUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE_CLASS:
				return ((InternalEList<?>)getRelatedArticleClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ABSTRACT_CLASS:
				return ((InternalEList<?>)getAbstractClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__TRANS_ABSTRACT:
				return ((InternalEList<?>)getTransAbstract()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__KWD_GROUP_CLASS:
				return ((InternalEList<?>)getKwdGroupClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__KWD_GROUP:
				return ((InternalEList<?>)getKwdGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__FUNDING_GROUP:
				return ((InternalEList<?>)getFundingGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__SUPPORT_GROUP:
				return ((InternalEList<?>)getSupportGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__CONFERENCE:
				return ((InternalEList<?>)getConference()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_META_TYPE__COUNTS:
				return basicSetCounts(null, msgs);
			case Jats1Package.ARTICLE_META_TYPE__CUSTOM_META_GROUP:
				return basicSetCustomMetaGroup(null, msgs);
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
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_ID:
				return getArticleId();
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION:
				return getArticleVersion();
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				return getArticleVersionAlternatives();
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_CATEGORIES:
				return getArticleCategories();
			case Jats1Package.ARTICLE_META_TYPE__TITLE_GROUP:
				return getTitleGroup();
			case Jats1Package.ARTICLE_META_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.ARTICLE_META_TYPE__CONTRIB_GROUP:
				return getContribGroup();
			case Jats1Package.ARTICLE_META_TYPE__AFF:
				return getAff();
			case Jats1Package.ARTICLE_META_TYPE__AFF_ALTERNATIVES:
				return getAffAlternatives();
			case Jats1Package.ARTICLE_META_TYPE__AUTHOR_NOTES:
				return getAuthorNotes();
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE_CLASS:
				if (coreType) return getPubDateClass();
				return ((FeatureMap.Internal)getPubDateClass()).getWrapper();
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE:
				return getPubDate();
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE_NOT_AVAILABLE:
				return getPubDateNotAvailable();
			case Jats1Package.ARTICLE_META_TYPE__VOLUME:
				return getVolume();
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_ID:
				return getVolumeId();
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_SERIES:
				return getVolumeSeries();
			case Jats1Package.ARTICLE_META_TYPE__ISSUE:
				return getIssue();
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_ID:
				return getIssueId();
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_TITLE:
				return getIssueTitle();
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_SPONSOR:
				return getIssueSponsor();
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_PART:
				return getIssuePart();
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_ISSUE_GROUP:
				return getVolumeIssueGroup();
			case Jats1Package.ARTICLE_META_TYPE__ISBN:
				return getIsbn();
			case Jats1Package.ARTICLE_META_TYPE__SUPPLEMENT:
				return getSupplement();
			case Jats1Package.ARTICLE_META_TYPE__FPAGE:
				return getFpage();
			case Jats1Package.ARTICLE_META_TYPE__LPAGE:
				return getLpage();
			case Jats1Package.ARTICLE_META_TYPE__PAGE_RANGE:
				return getPageRange();
			case Jats1Package.ARTICLE_META_TYPE__ELOCATION_ID:
				return getElocationId();
			case Jats1Package.ARTICLE_META_TYPE__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case Jats1Package.ARTICLE_META_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.ARTICLE_META_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.ARTICLE_META_TYPE__URI:
				return getUri();
			case Jats1Package.ARTICLE_META_TYPE__PRODUCT:
				return getProduct();
			case Jats1Package.ARTICLE_META_TYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.ARTICLE_META_TYPE__HISTORY:
				return getHistory();
			case Jats1Package.ARTICLE_META_TYPE__PUB_HISTORY:
				return getPubHistory();
			case Jats1Package.ARTICLE_META_TYPE__PERMISSIONS:
				return getPermissions();
			case Jats1Package.ARTICLE_META_TYPE__SELF_URI:
				return getSelfUri();
			case Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE_CLASS:
				if (coreType) return getRelatedArticleClass();
				return ((FeatureMap.Internal)getRelatedArticleClass()).getWrapper();
			case Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.ARTICLE_META_TYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.ARTICLE_META_TYPE__ABSTRACT_CLASS:
				if (coreType) return getAbstractClass();
				return ((FeatureMap.Internal)getAbstractClass()).getWrapper();
			case Jats1Package.ARTICLE_META_TYPE__ABSTRACT:
				return getAbstract();
			case Jats1Package.ARTICLE_META_TYPE__TRANS_ABSTRACT:
				return getTransAbstract();
			case Jats1Package.ARTICLE_META_TYPE__KWD_GROUP_CLASS:
				if (coreType) return getKwdGroupClass();
				return ((FeatureMap.Internal)getKwdGroupClass()).getWrapper();
			case Jats1Package.ARTICLE_META_TYPE__KWD_GROUP:
				return getKwdGroup();
			case Jats1Package.ARTICLE_META_TYPE__FUNDING_GROUP:
				return getFundingGroup();
			case Jats1Package.ARTICLE_META_TYPE__SUPPORT_GROUP:
				return getSupportGroup();
			case Jats1Package.ARTICLE_META_TYPE__CONFERENCE:
				return getConference();
			case Jats1Package.ARTICLE_META_TYPE__COUNTS:
				return getCounts();
			case Jats1Package.ARTICLE_META_TYPE__CUSTOM_META_GROUP:
				return getCustomMetaGroup();
			case Jats1Package.ARTICLE_META_TYPE__BASE:
				return getBase();
			case Jats1Package.ARTICLE_META_TYPE__ID:
				return getId();
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
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_ID:
				getArticleId().clear();
				getArticleId().addAll((Collection<? extends ArticleIdType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION:
				setArticleVersion((ArticleVersionType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				setArticleVersionAlternatives((ArticleVersionAlternativesType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_CATEGORIES:
				setArticleCategories((ArticleCategoriesType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__TITLE_GROUP:
				setTitleGroup((TitleGroupType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__CONTRIB_GROUP:
				getContribGroup().clear();
				getContribGroup().addAll((Collection<? extends ContribGroupType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__AFF:
				getAff().clear();
				getAff().addAll((Collection<? extends AffType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				getAffAlternatives().addAll((Collection<? extends AffAlternativesType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__AUTHOR_NOTES:
				setAuthorNotes((AuthorNotesType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE_CLASS:
				((FeatureMap.Internal)getPubDateClass()).set(newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE:
				getPubDate().clear();
				getPubDate().addAll((Collection<? extends PubDateType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE_NOT_AVAILABLE:
				setPubDateNotAvailable((PubDateNotAvailableType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__VOLUME:
				getVolume().clear();
				getVolume().addAll((Collection<? extends VolumeType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_ID:
				getVolumeId().clear();
				getVolumeId().addAll((Collection<? extends VolumeIdType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_SERIES:
				setVolumeSeries((VolumeSeriesType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE:
				getIssue().clear();
				getIssue().addAll((Collection<? extends IssueType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_ID:
				getIssueId().clear();
				getIssueId().addAll((Collection<? extends IssueIdType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_TITLE:
				getIssueTitle().clear();
				getIssueTitle().addAll((Collection<? extends IssueTitleType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_SPONSOR:
				getIssueSponsor().clear();
				getIssueSponsor().addAll((Collection<? extends IssueSponsorType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_PART:
				setIssuePart((IssuePartType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_ISSUE_GROUP:
				getVolumeIssueGroup().clear();
				getVolumeIssueGroup().addAll((Collection<? extends VolumeIssueGroupType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISBN:
				getIsbn().clear();
				getIsbn().addAll((Collection<? extends IsbnType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__SUPPLEMENT:
				setSupplement((SupplementType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__FPAGE:
				setFpage((FpageType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__LPAGE:
				setLpage((LpageType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PAGE_RANGE:
				setPageRange((PageRangeType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ELOCATION_ID:
				setElocationId((ElocationIdType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PRODUCT:
				getProduct().clear();
				getProduct().addAll((Collection<? extends ProductType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__HISTORY:
				setHistory((HistoryType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PUB_HISTORY:
				setPubHistory((PubHistoryType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PERMISSIONS:
				setPermissions((PermissionsType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__SELF_URI:
				getSelfUri().clear();
				getSelfUri().addAll((Collection<? extends SelfUriType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE_CLASS:
				((FeatureMap.Internal)getRelatedArticleClass()).set(newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ABSTRACT_CLASS:
				((FeatureMap.Internal)getAbstractClass()).set(newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__TRANS_ABSTRACT:
				getTransAbstract().clear();
				getTransAbstract().addAll((Collection<? extends TransAbstractType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__KWD_GROUP_CLASS:
				((FeatureMap.Internal)getKwdGroupClass()).set(newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__KWD_GROUP:
				getKwdGroup().clear();
				getKwdGroup().addAll((Collection<? extends KwdGroupType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__FUNDING_GROUP:
				getFundingGroup().clear();
				getFundingGroup().addAll((Collection<? extends FundingGroupType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__SUPPORT_GROUP:
				getSupportGroup().clear();
				getSupportGroup().addAll((Collection<? extends SupportGroupType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__CONFERENCE:
				getConference().clear();
				getConference().addAll((Collection<? extends ConferenceType>)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__COUNTS:
				setCounts((CountsType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__CUSTOM_META_GROUP:
				setCustomMetaGroup((CustomMetaGroupType)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ID:
				setId((String)newValue);
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
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_ID:
				getArticleId().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION:
				setArticleVersion((ArticleVersionType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				setArticleVersionAlternatives((ArticleVersionAlternativesType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_CATEGORIES:
				setArticleCategories((ArticleCategoriesType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__TITLE_GROUP:
				setTitleGroup((TitleGroupType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__CONTRIB_GROUP:
				getContribGroup().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__AFF:
				getAff().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__AUTHOR_NOTES:
				setAuthorNotes((AuthorNotesType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE_CLASS:
				getPubDateClass().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE:
				getPubDate().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE_NOT_AVAILABLE:
				setPubDateNotAvailable((PubDateNotAvailableType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__VOLUME:
				getVolume().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_ID:
				getVolumeId().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_SERIES:
				setVolumeSeries((VolumeSeriesType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE:
				getIssue().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_ID:
				getIssueId().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_TITLE:
				getIssueTitle().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_SPONSOR:
				getIssueSponsor().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_PART:
				setIssuePart((IssuePartType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_ISSUE_GROUP:
				getVolumeIssueGroup().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__ISBN:
				getIsbn().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__SUPPLEMENT:
				setSupplement((SupplementType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__FPAGE:
				setFpage((FpageType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__LPAGE:
				setLpage((LpageType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PAGE_RANGE:
				setPageRange((PageRangeType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ELOCATION_ID:
				setElocationId((ElocationIdType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__PRODUCT:
				getProduct().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__HISTORY:
				setHistory((HistoryType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PUB_HISTORY:
				setPubHistory((PubHistoryType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__PERMISSIONS:
				setPermissions((PermissionsType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__SELF_URI:
				getSelfUri().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE_CLASS:
				getRelatedArticleClass().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__ABSTRACT_CLASS:
				getAbstractClass().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__TRANS_ABSTRACT:
				getTransAbstract().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__KWD_GROUP_CLASS:
				getKwdGroupClass().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__KWD_GROUP:
				getKwdGroup().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__FUNDING_GROUP:
				getFundingGroup().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__SUPPORT_GROUP:
				getSupportGroup().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__CONFERENCE:
				getConference().clear();
				return;
			case Jats1Package.ARTICLE_META_TYPE__COUNTS:
				setCounts((CountsType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__CUSTOM_META_GROUP:
				setCustomMetaGroup((CustomMetaGroupType)null);
				return;
			case Jats1Package.ARTICLE_META_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_META_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_ID:
				return articleId != null && !articleId.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION:
				return articleVersion != null;
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				return articleVersionAlternatives != null;
			case Jats1Package.ARTICLE_META_TYPE__ARTICLE_CATEGORIES:
				return articleCategories != null;
			case Jats1Package.ARTICLE_META_TYPE__TITLE_GROUP:
				return titleGroup != null;
			case Jats1Package.ARTICLE_META_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__CONTRIB_GROUP:
				return !getContribGroup().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__AFF:
				return !getAff().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__AFF_ALTERNATIVES:
				return !getAffAlternatives().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__AUTHOR_NOTES:
				return authorNotes != null;
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE_CLASS:
				return pubDateClass != null && !pubDateClass.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE:
				return !getPubDate().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__PUB_DATE_NOT_AVAILABLE:
				return pubDateNotAvailable != null;
			case Jats1Package.ARTICLE_META_TYPE__VOLUME:
				return volume != null && !volume.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_ID:
				return volumeId != null && !volumeId.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_SERIES:
				return volumeSeries != null;
			case Jats1Package.ARTICLE_META_TYPE__ISSUE:
				return issue != null && !issue.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_ID:
				return issueId != null && !issueId.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_TITLE:
				return issueTitle != null && !issueTitle.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_SPONSOR:
				return issueSponsor != null && !issueSponsor.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__ISSUE_PART:
				return issuePart != null;
			case Jats1Package.ARTICLE_META_TYPE__VOLUME_ISSUE_GROUP:
				return volumeIssueGroup != null && !volumeIssueGroup.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__ISBN:
				return isbn != null && !isbn.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__SUPPLEMENT:
				return supplement != null;
			case Jats1Package.ARTICLE_META_TYPE__FPAGE:
				return fpage != null;
			case Jats1Package.ARTICLE_META_TYPE__LPAGE:
				return lpage != null;
			case Jats1Package.ARTICLE_META_TYPE__PAGE_RANGE:
				return pageRange != null;
			case Jats1Package.ARTICLE_META_TYPE__ELOCATION_ID:
				return elocationId != null;
			case Jats1Package.ARTICLE_META_TYPE__GROUP1:
				return group1 != null && !group1.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__PRODUCT:
				return !getProduct().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__HISTORY:
				return history != null;
			case Jats1Package.ARTICLE_META_TYPE__PUB_HISTORY:
				return pubHistory != null;
			case Jats1Package.ARTICLE_META_TYPE__PERMISSIONS:
				return permissions != null;
			case Jats1Package.ARTICLE_META_TYPE__SELF_URI:
				return selfUri != null && !selfUri.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE_CLASS:
				return relatedArticleClass != null && !relatedArticleClass.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__ABSTRACT_CLASS:
				return abstractClass != null && !abstractClass.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__ABSTRACT:
				return !getAbstract().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__TRANS_ABSTRACT:
				return transAbstract != null && !transAbstract.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__KWD_GROUP_CLASS:
				return kwdGroupClass != null && !kwdGroupClass.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__KWD_GROUP:
				return !getKwdGroup().isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__FUNDING_GROUP:
				return fundingGroup != null && !fundingGroup.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__SUPPORT_GROUP:
				return supportGroup != null && !supportGroup.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__CONFERENCE:
				return conference != null && !conference.isEmpty();
			case Jats1Package.ARTICLE_META_TYPE__COUNTS:
				return counts != null;
			case Jats1Package.ARTICLE_META_TYPE__CUSTOM_META_GROUP:
				return customMetaGroup != null;
			case Jats1Package.ARTICLE_META_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ARTICLE_META_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", pubDateClass: ");
		result.append(pubDateClass);
		result.append(", group1: ");
		result.append(group1);
		result.append(", relatedArticleClass: ");
		result.append(relatedArticleClass);
		result.append(", abstractClass: ");
		result.append(abstractClass);
		result.append(", kwdGroupClass: ");
		result.append(kwdGroupClass);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ArticleMetaTypeImpl
