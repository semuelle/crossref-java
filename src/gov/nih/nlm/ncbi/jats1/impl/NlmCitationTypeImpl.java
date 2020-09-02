/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AccessDateType;
import gov.nih.nlm.ncbi.jats1.AnnotationType;
import gov.nih.nlm.ncbi.jats1.ArticleTitleType;
import gov.nih.nlm.ncbi.jats1.CollabType;
import gov.nih.nlm.ncbi.jats1.CommentType;
import gov.nih.nlm.ncbi.jats1.ConfDateType;
import gov.nih.nlm.ncbi.jats1.ConfLocType;
import gov.nih.nlm.ncbi.jats1.ConfNameType;
import gov.nih.nlm.ncbi.jats1.DayType;
import gov.nih.nlm.ncbi.jats1.EditionType;
import gov.nih.nlm.ncbi.jats1.FpageType;
import gov.nih.nlm.ncbi.jats1.IssueType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LpageType;
import gov.nih.nlm.ncbi.jats1.MonthType;
import gov.nih.nlm.ncbi.jats1.NlmCitationType;
import gov.nih.nlm.ncbi.jats1.PageCountType;
import gov.nih.nlm.ncbi.jats1.PatentType;
import gov.nih.nlm.ncbi.jats1.PersonGroupType;
import gov.nih.nlm.ncbi.jats1.PubIdType;
import gov.nih.nlm.ncbi.jats1.PublisherLocType;
import gov.nih.nlm.ncbi.jats1.PublisherNameType;
import gov.nih.nlm.ncbi.jats1.SeasonType;
import gov.nih.nlm.ncbi.jats1.SeriesType;
import gov.nih.nlm.ncbi.jats1.SourceType;
import gov.nih.nlm.ncbi.jats1.SupplementType;
import gov.nih.nlm.ncbi.jats1.TimeStampType;
import gov.nih.nlm.ncbi.jats1.TransSourceType;
import gov.nih.nlm.ncbi.jats1.TransTitleType;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nlm Citation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getPersonGroup <em>Person Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getCollab <em>Collab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getTransTitle <em>Trans Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getPatent <em>Patent</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getTransSource <em>Trans Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getAccessDate <em>Access Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getConfName <em>Conf Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getConfDate <em>Conf Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getConfLoc <em>Conf Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getPublisherLoc <em>Publisher Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getFpage <em>Fpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getLpage <em>Lpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getPubId <em>Pub Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getPublicationFormat <em>Publication Format</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getPublicationType <em>Publication Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getPublisherType <em>Publisher Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NlmCitationTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NlmCitationTypeImpl extends MinimalEObjectImpl.Container implements NlmCitationType {
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
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SourceType source;

	/**
	 * The cached value of the '{@link #getPatent() <em>Patent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatent()
	 * @generated
	 * @ordered
	 */
	protected PatentType patent;

	/**
	 * The cached value of the '{@link #getTransSource() <em>Trans Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransSource()
	 * @generated
	 * @ordered
	 */
	protected TransSourceType transSource;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected YearType year;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected MonthType month;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected DayType day;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected TimeStampType timeStamp;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected SeasonType season;

	/**
	 * The cached value of the '{@link #getAccessDate() <em>Access Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessDate()
	 * @generated
	 * @ordered
	 */
	protected AccessDateType accessDate;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected VolumeType volume;

	/**
	 * The cached value of the '{@link #getEdition() <em>Edition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected EditionType edition;

	/**
	 * The cached value of the '{@link #getConfName() <em>Conf Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfName()
	 * @generated
	 * @ordered
	 */
	protected ConfNameType confName;

	/**
	 * The cached value of the '{@link #getConfDate() <em>Conf Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfDate()
	 * @generated
	 * @ordered
	 */
	protected ConfDateType confDate;

	/**
	 * The cached value of the '{@link #getConfLoc() <em>Conf Loc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfLoc()
	 * @generated
	 * @ordered
	 */
	protected ConfLocType confLoc;

	/**
	 * The cached value of the '{@link #getGroup2() <em>Group2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup2()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group2;

	/**
	 * The cached value of the '{@link #getPublisherLoc() <em>Publisher Loc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherLoc()
	 * @generated
	 * @ordered
	 */
	protected PublisherLocType publisherLoc;

	/**
	 * The cached value of the '{@link #getPublisherName() <em>Publisher Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherName()
	 * @generated
	 * @ordered
	 */
	protected PublisherNameType publisherName;

	/**
	 * The cached value of the '{@link #getGroup3() <em>Group3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup3()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group3;

	/**
	 * The cached value of the '{@link #getPageCount() <em>Page Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageCount()
	 * @generated
	 * @ordered
	 */
	protected PageCountType pageCount;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected SeriesType series;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<CommentType> comment;

	/**
	 * The cached value of the '{@link #getPubId() <em>Pub Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubId()
	 * @generated
	 * @ordered
	 */
	protected EList<PubIdType> pubId;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected AnnotationType annotation;

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
	 * The default value of the '{@link #getPublicationFormat() <em>Publication Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationFormat() <em>Publication Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationFormat()
	 * @generated
	 * @ordered
	 */
	protected String publicationFormat = PUBLICATION_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicationType() <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationType()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationType() <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationType()
	 * @generated
	 * @ordered
	 */
	protected String publicationType = PUBLICATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherType() <em>Publisher Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherType()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherType() <em>Publisher Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherType()
	 * @generated
	 * @ordered
	 */
	protected String publisherType = PUBLISHER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NlmCitationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getNlmCitationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.NLM_CITATION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonGroupType> getPersonGroup() {
		return getGroup().list(Jats1Package.eINSTANCE.getNlmCitationType_PersonGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabType> getCollab() {
		return getGroup().list(Jats1Package.eINSTANCE.getNlmCitationType_Collab());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, Jats1Package.NLM_CITATION_TYPE__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArticleTitleType> getArticleTitle() {
		return getGroup1().list(Jats1Package.eINSTANCE.getNlmCitationType_ArticleTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransTitleType> getTransTitle() {
		return getGroup1().list(Jats1Package.eINSTANCE.getNlmCitationType_TransTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceType getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SourceType newSource, NotificationChain msgs) {
		SourceType oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__SOURCE, oldSource, newSource);
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
	public void setSource(SourceType newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatentType getPatent() {
		return patent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatent(PatentType newPatent, NotificationChain msgs) {
		PatentType oldPatent = patent;
		patent = newPatent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PATENT, oldPatent, newPatent);
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
	public void setPatent(PatentType newPatent) {
		if (newPatent != patent) {
			NotificationChain msgs = null;
			if (patent != null)
				msgs = ((InternalEObject)patent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__PATENT, null, msgs);
			if (newPatent != null)
				msgs = ((InternalEObject)newPatent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__PATENT, null, msgs);
			msgs = basicSetPatent(newPatent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PATENT, newPatent, newPatent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransSourceType getTransSource() {
		return transSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransSource(TransSourceType newTransSource, NotificationChain msgs) {
		TransSourceType oldTransSource = transSource;
		transSource = newTransSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__TRANS_SOURCE, oldTransSource, newTransSource);
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
	public void setTransSource(TransSourceType newTransSource) {
		if (newTransSource != transSource) {
			NotificationChain msgs = null;
			if (transSource != null)
				msgs = ((InternalEObject)transSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__TRANS_SOURCE, null, msgs);
			if (newTransSource != null)
				msgs = ((InternalEObject)newTransSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__TRANS_SOURCE, null, msgs);
			msgs = basicSetTransSource(newTransSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__TRANS_SOURCE, newTransSource, newTransSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YearType getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(YearType newYear, NotificationChain msgs) {
		YearType oldYear = year;
		year = newYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__YEAR, oldYear, newYear);
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
	public void setYear(YearType newYear) {
		if (newYear != year) {
			NotificationChain msgs = null;
			if (year != null)
				msgs = ((InternalEObject)year).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__YEAR, null, msgs);
			if (newYear != null)
				msgs = ((InternalEObject)newYear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__YEAR, null, msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__YEAR, newYear, newYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonthType getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonth(MonthType newMonth, NotificationChain msgs) {
		MonthType oldMonth = month;
		month = newMonth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__MONTH, oldMonth, newMonth);
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
	public void setMonth(MonthType newMonth) {
		if (newMonth != month) {
			NotificationChain msgs = null;
			if (month != null)
				msgs = ((InternalEObject)month).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__MONTH, null, msgs);
			if (newMonth != null)
				msgs = ((InternalEObject)newMonth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__MONTH, null, msgs);
			msgs = basicSetMonth(newMonth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__MONTH, newMonth, newMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DayType getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDay(DayType newDay, NotificationChain msgs) {
		DayType oldDay = day;
		day = newDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__DAY, oldDay, newDay);
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
	public void setDay(DayType newDay) {
		if (newDay != day) {
			NotificationChain msgs = null;
			if (day != null)
				msgs = ((InternalEObject)day).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__DAY, null, msgs);
			if (newDay != null)
				msgs = ((InternalEObject)newDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__DAY, null, msgs);
			msgs = basicSetDay(newDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__DAY, newDay, newDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStampType getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(TimeStampType newTimeStamp, NotificationChain msgs) {
		TimeStampType oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
	public void setTimeStamp(TimeStampType newTimeStamp) {
		if (newTimeStamp != timeStamp) {
			NotificationChain msgs = null;
			if (timeStamp != null)
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeasonType getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(SeasonType newSeason, NotificationChain msgs) {
		SeasonType oldSeason = season;
		season = newSeason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__SEASON, oldSeason, newSeason);
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
	public void setSeason(SeasonType newSeason) {
		if (newSeason != season) {
			NotificationChain msgs = null;
			if (season != null)
				msgs = ((InternalEObject)season).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__SEASON, null, msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__SEASON, null, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__SEASON, newSeason, newSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessDateType getAccessDate() {
		return accessDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessDate(AccessDateType newAccessDate, NotificationChain msgs) {
		AccessDateType oldAccessDate = accessDate;
		accessDate = newAccessDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__ACCESS_DATE, oldAccessDate, newAccessDate);
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
	public void setAccessDate(AccessDateType newAccessDate) {
		if (newAccessDate != accessDate) {
			NotificationChain msgs = null;
			if (accessDate != null)
				msgs = ((InternalEObject)accessDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__ACCESS_DATE, null, msgs);
			if (newAccessDate != null)
				msgs = ((InternalEObject)newAccessDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__ACCESS_DATE, null, msgs);
			msgs = basicSetAccessDate(newAccessDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__ACCESS_DATE, newAccessDate, newAccessDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeType getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolume(VolumeType newVolume, NotificationChain msgs) {
		VolumeType oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__VOLUME, oldVolume, newVolume);
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
	public void setVolume(VolumeType newVolume) {
		if (newVolume != volume) {
			NotificationChain msgs = null;
			if (volume != null)
				msgs = ((InternalEObject)volume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__VOLUME, null, msgs);
			if (newVolume != null)
				msgs = ((InternalEObject)newVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__VOLUME, null, msgs);
			msgs = basicSetVolume(newVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__VOLUME, newVolume, newVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditionType getEdition() {
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdition(EditionType newEdition, NotificationChain msgs) {
		EditionType oldEdition = edition;
		edition = newEdition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__EDITION, oldEdition, newEdition);
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
	public void setEdition(EditionType newEdition) {
		if (newEdition != edition) {
			NotificationChain msgs = null;
			if (edition != null)
				msgs = ((InternalEObject)edition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__EDITION, null, msgs);
			if (newEdition != null)
				msgs = ((InternalEObject)newEdition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__EDITION, null, msgs);
			msgs = basicSetEdition(newEdition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__EDITION, newEdition, newEdition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfNameType getConfName() {
		return confName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfName(ConfNameType newConfName, NotificationChain msgs) {
		ConfNameType oldConfName = confName;
		confName = newConfName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__CONF_NAME, oldConfName, newConfName);
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
	public void setConfName(ConfNameType newConfName) {
		if (newConfName != confName) {
			NotificationChain msgs = null;
			if (confName != null)
				msgs = ((InternalEObject)confName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__CONF_NAME, null, msgs);
			if (newConfName != null)
				msgs = ((InternalEObject)newConfName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__CONF_NAME, null, msgs);
			msgs = basicSetConfName(newConfName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__CONF_NAME, newConfName, newConfName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfDateType getConfDate() {
		return confDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfDate(ConfDateType newConfDate, NotificationChain msgs) {
		ConfDateType oldConfDate = confDate;
		confDate = newConfDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__CONF_DATE, oldConfDate, newConfDate);
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
	public void setConfDate(ConfDateType newConfDate) {
		if (newConfDate != confDate) {
			NotificationChain msgs = null;
			if (confDate != null)
				msgs = ((InternalEObject)confDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__CONF_DATE, null, msgs);
			if (newConfDate != null)
				msgs = ((InternalEObject)newConfDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__CONF_DATE, null, msgs);
			msgs = basicSetConfDate(newConfDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__CONF_DATE, newConfDate, newConfDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfLocType getConfLoc() {
		return confLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfLoc(ConfLocType newConfLoc, NotificationChain msgs) {
		ConfLocType oldConfLoc = confLoc;
		confLoc = newConfLoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__CONF_LOC, oldConfLoc, newConfLoc);
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
	public void setConfLoc(ConfLocType newConfLoc) {
		if (newConfLoc != confLoc) {
			NotificationChain msgs = null;
			if (confLoc != null)
				msgs = ((InternalEObject)confLoc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__CONF_LOC, null, msgs);
			if (newConfLoc != null)
				msgs = ((InternalEObject)newConfLoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__CONF_LOC, null, msgs);
			msgs = basicSetConfLoc(newConfLoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__CONF_LOC, newConfLoc, newConfLoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup2() {
		if (group2 == null) {
			group2 = new BasicFeatureMap(this, Jats1Package.NLM_CITATION_TYPE__GROUP2);
		}
		return group2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueType> getIssue() {
		return getGroup2().list(Jats1Package.eINSTANCE.getNlmCitationType_Issue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementType> getSupplement() {
		return getGroup2().list(Jats1Package.eINSTANCE.getNlmCitationType_Supplement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherLocType getPublisherLoc() {
		return publisherLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisherLoc(PublisherLocType newPublisherLoc, NotificationChain msgs) {
		PublisherLocType oldPublisherLoc = publisherLoc;
		publisherLoc = newPublisherLoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PUBLISHER_LOC, oldPublisherLoc, newPublisherLoc);
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
	public void setPublisherLoc(PublisherLocType newPublisherLoc) {
		if (newPublisherLoc != publisherLoc) {
			NotificationChain msgs = null;
			if (publisherLoc != null)
				msgs = ((InternalEObject)publisherLoc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__PUBLISHER_LOC, null, msgs);
			if (newPublisherLoc != null)
				msgs = ((InternalEObject)newPublisherLoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__PUBLISHER_LOC, null, msgs);
			msgs = basicSetPublisherLoc(newPublisherLoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PUBLISHER_LOC, newPublisherLoc, newPublisherLoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherNameType getPublisherName() {
		return publisherName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisherName(PublisherNameType newPublisherName, NotificationChain msgs) {
		PublisherNameType oldPublisherName = publisherName;
		publisherName = newPublisherName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PUBLISHER_NAME, oldPublisherName, newPublisherName);
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
	public void setPublisherName(PublisherNameType newPublisherName) {
		if (newPublisherName != publisherName) {
			NotificationChain msgs = null;
			if (publisherName != null)
				msgs = ((InternalEObject)publisherName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__PUBLISHER_NAME, null, msgs);
			if (newPublisherName != null)
				msgs = ((InternalEObject)newPublisherName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__PUBLISHER_NAME, null, msgs);
			msgs = basicSetPublisherName(newPublisherName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PUBLISHER_NAME, newPublisherName, newPublisherName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup3() {
		if (group3 == null) {
			group3 = new BasicFeatureMap(this, Jats1Package.NLM_CITATION_TYPE__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FpageType> getFpage() {
		return getGroup3().list(Jats1Package.eINSTANCE.getNlmCitationType_Fpage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LpageType> getLpage() {
		return getGroup3().list(Jats1Package.eINSTANCE.getNlmCitationType_Lpage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageCountType getPageCount() {
		return pageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageCount(PageCountType newPageCount, NotificationChain msgs) {
		PageCountType oldPageCount = pageCount;
		pageCount = newPageCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PAGE_COUNT, oldPageCount, newPageCount);
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
	public void setPageCount(PageCountType newPageCount) {
		if (newPageCount != pageCount) {
			NotificationChain msgs = null;
			if (pageCount != null)
				msgs = ((InternalEObject)pageCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__PAGE_COUNT, null, msgs);
			if (newPageCount != null)
				msgs = ((InternalEObject)newPageCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__PAGE_COUNT, null, msgs);
			msgs = basicSetPageCount(newPageCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PAGE_COUNT, newPageCount, newPageCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesType getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(SeriesType newSeries, NotificationChain msgs) {
		SeriesType oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__SERIES, oldSeries, newSeries);
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
	public void setSeries(SeriesType newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommentType> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<CommentType>(CommentType.class, this, Jats1Package.NLM_CITATION_TYPE__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PubIdType> getPubId() {
		if (pubId == null) {
			pubId = new EObjectContainmentEList<PubIdType>(PubIdType.class, this, Jats1Package.NLM_CITATION_TYPE__PUB_ID);
		}
		return pubId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationType getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(AnnotationType newAnnotation, NotificationChain msgs) {
		AnnotationType oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
	public void setAnnotation(AnnotationType newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NLM_CITATION_TYPE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__ANNOTATION, newAnnotation, newAnnotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.NLM_CITATION_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicationFormat() {
		return publicationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicationFormat(String newPublicationFormat) {
		String oldPublicationFormat = publicationFormat;
		publicationFormat = newPublicationFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PUBLICATION_FORMAT, oldPublicationFormat, publicationFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicationType() {
		return publicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicationType(String newPublicationType) {
		String oldPublicationType = publicationType;
		publicationType = newPublicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PUBLICATION_TYPE, oldPublicationType, publicationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublisherType() {
		return publisherType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisherType(String newPublisherType) {
		String oldPublisherType = publisherType;
		publisherType = newPublisherType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__PUBLISHER_TYPE, oldPublisherType, publisherType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.NLM_CITATION_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NLM_CITATION_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.NLM_CITATION_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.NLM_CITATION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__PERSON_GROUP:
				return ((InternalEList<?>)getPersonGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__COLLAB:
				return ((InternalEList<?>)getCollab()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__ARTICLE_TITLE:
				return ((InternalEList<?>)getArticleTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__TRANS_TITLE:
				return ((InternalEList<?>)getTransTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__SOURCE:
				return basicSetSource(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__PATENT:
				return basicSetPatent(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__TRANS_SOURCE:
				return basicSetTransSource(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__YEAR:
				return basicSetYear(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__MONTH:
				return basicSetMonth(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__DAY:
				return basicSetDay(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__SEASON:
				return basicSetSeason(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__ACCESS_DATE:
				return basicSetAccessDate(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__VOLUME:
				return basicSetVolume(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__EDITION:
				return basicSetEdition(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__CONF_NAME:
				return basicSetConfName(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__CONF_DATE:
				return basicSetConfDate(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__CONF_LOC:
				return basicSetConfLoc(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__GROUP2:
				return ((InternalEList<?>)getGroup2()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__ISSUE:
				return ((InternalEList<?>)getIssue()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__SUPPLEMENT:
				return ((InternalEList<?>)getSupplement()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_LOC:
				return basicSetPublisherLoc(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_NAME:
				return basicSetPublisherName(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__FPAGE:
				return ((InternalEList<?>)getFpage()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__LPAGE:
				return ((InternalEList<?>)getLpage()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__PAGE_COUNT:
				return basicSetPageCount(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__SERIES:
				return basicSetSeries(null, msgs);
			case Jats1Package.NLM_CITATION_TYPE__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__PUB_ID:
				return ((InternalEList<?>)getPubId()).basicRemove(otherEnd, msgs);
			case Jats1Package.NLM_CITATION_TYPE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
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
			case Jats1Package.NLM_CITATION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.NLM_CITATION_TYPE__PERSON_GROUP:
				return getPersonGroup();
			case Jats1Package.NLM_CITATION_TYPE__COLLAB:
				return getCollab();
			case Jats1Package.NLM_CITATION_TYPE__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case Jats1Package.NLM_CITATION_TYPE__ARTICLE_TITLE:
				return getArticleTitle();
			case Jats1Package.NLM_CITATION_TYPE__TRANS_TITLE:
				return getTransTitle();
			case Jats1Package.NLM_CITATION_TYPE__SOURCE:
				return getSource();
			case Jats1Package.NLM_CITATION_TYPE__PATENT:
				return getPatent();
			case Jats1Package.NLM_CITATION_TYPE__TRANS_SOURCE:
				return getTransSource();
			case Jats1Package.NLM_CITATION_TYPE__YEAR:
				return getYear();
			case Jats1Package.NLM_CITATION_TYPE__MONTH:
				return getMonth();
			case Jats1Package.NLM_CITATION_TYPE__DAY:
				return getDay();
			case Jats1Package.NLM_CITATION_TYPE__TIME_STAMP:
				return getTimeStamp();
			case Jats1Package.NLM_CITATION_TYPE__SEASON:
				return getSeason();
			case Jats1Package.NLM_CITATION_TYPE__ACCESS_DATE:
				return getAccessDate();
			case Jats1Package.NLM_CITATION_TYPE__VOLUME:
				return getVolume();
			case Jats1Package.NLM_CITATION_TYPE__EDITION:
				return getEdition();
			case Jats1Package.NLM_CITATION_TYPE__CONF_NAME:
				return getConfName();
			case Jats1Package.NLM_CITATION_TYPE__CONF_DATE:
				return getConfDate();
			case Jats1Package.NLM_CITATION_TYPE__CONF_LOC:
				return getConfLoc();
			case Jats1Package.NLM_CITATION_TYPE__GROUP2:
				if (coreType) return getGroup2();
				return ((FeatureMap.Internal)getGroup2()).getWrapper();
			case Jats1Package.NLM_CITATION_TYPE__ISSUE:
				return getIssue();
			case Jats1Package.NLM_CITATION_TYPE__SUPPLEMENT:
				return getSupplement();
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_LOC:
				return getPublisherLoc();
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_NAME:
				return getPublisherName();
			case Jats1Package.NLM_CITATION_TYPE__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case Jats1Package.NLM_CITATION_TYPE__FPAGE:
				return getFpage();
			case Jats1Package.NLM_CITATION_TYPE__LPAGE:
				return getLpage();
			case Jats1Package.NLM_CITATION_TYPE__PAGE_COUNT:
				return getPageCount();
			case Jats1Package.NLM_CITATION_TYPE__SERIES:
				return getSeries();
			case Jats1Package.NLM_CITATION_TYPE__COMMENT:
				return getComment();
			case Jats1Package.NLM_CITATION_TYPE__PUB_ID:
				return getPubId();
			case Jats1Package.NLM_CITATION_TYPE__ANNOTATION:
				return getAnnotation();
			case Jats1Package.NLM_CITATION_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.NLM_CITATION_TYPE__BASE:
				return getBase();
			case Jats1Package.NLM_CITATION_TYPE__HREF:
				return getHref();
			case Jats1Package.NLM_CITATION_TYPE__ID:
				return getId();
			case Jats1Package.NLM_CITATION_TYPE__LANG:
				return getLang();
			case Jats1Package.NLM_CITATION_TYPE__PUBLICATION_FORMAT:
				return getPublicationFormat();
			case Jats1Package.NLM_CITATION_TYPE__PUBLICATION_TYPE:
				return getPublicationType();
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_TYPE:
				return getPublisherType();
			case Jats1Package.NLM_CITATION_TYPE__ROLE:
				return getRole();
			case Jats1Package.NLM_CITATION_TYPE__SHOW:
				return getShow();
			case Jats1Package.NLM_CITATION_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.NLM_CITATION_TYPE__TITLE:
				return getTitle();
			case Jats1Package.NLM_CITATION_TYPE__TYPE:
				return getType();
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
			case Jats1Package.NLM_CITATION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PERSON_GROUP:
				getPersonGroup().clear();
				getPersonGroup().addAll((Collection<? extends PersonGroupType>)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__COLLAB:
				getCollab().clear();
				getCollab().addAll((Collection<? extends CollabType>)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ARTICLE_TITLE:
				getArticleTitle().clear();
				getArticleTitle().addAll((Collection<? extends ArticleTitleType>)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__TRANS_TITLE:
				getTransTitle().clear();
				getTransTitle().addAll((Collection<? extends TransTitleType>)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__SOURCE:
				setSource((SourceType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PATENT:
				setPatent((PatentType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__TRANS_SOURCE:
				setTransSource((TransSourceType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__YEAR:
				setYear((YearType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__MONTH:
				setMonth((MonthType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__DAY:
				setDay((DayType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__TIME_STAMP:
				setTimeStamp((TimeStampType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__SEASON:
				setSeason((SeasonType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ACCESS_DATE:
				setAccessDate((AccessDateType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__VOLUME:
				setVolume((VolumeType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__EDITION:
				setEdition((EditionType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__CONF_NAME:
				setConfName((ConfNameType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__CONF_DATE:
				setConfDate((ConfDateType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__CONF_LOC:
				setConfLoc((ConfLocType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__GROUP2:
				((FeatureMap.Internal)getGroup2()).set(newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ISSUE:
				getIssue().clear();
				getIssue().addAll((Collection<? extends IssueType>)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__SUPPLEMENT:
				getSupplement().clear();
				getSupplement().addAll((Collection<? extends SupplementType>)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_LOC:
				setPublisherLoc((PublisherLocType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_NAME:
				setPublisherName((PublisherNameType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__FPAGE:
				getFpage().clear();
				getFpage().addAll((Collection<? extends FpageType>)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__LPAGE:
				getLpage().clear();
				getLpage().addAll((Collection<? extends LpageType>)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PAGE_COUNT:
				setPageCount((PageCountType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__SERIES:
				setSeries((SeriesType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends CommentType>)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUB_ID:
				getPubId().clear();
				getPubId().addAll((Collection<? extends PubIdType>)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ANNOTATION:
				setAnnotation((AnnotationType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUBLICATION_FORMAT:
				setPublicationFormat((String)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUBLICATION_TYPE:
				setPublicationType((String)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_TYPE:
				setPublisherType((String)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Jats1Package.NLM_CITATION_TYPE__TYPE:
				setType((TypeType)newValue);
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
			case Jats1Package.NLM_CITATION_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__PERSON_GROUP:
				getPersonGroup().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__COLLAB:
				getCollab().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__ARTICLE_TITLE:
				getArticleTitle().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__TRANS_TITLE:
				getTransTitle().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__SOURCE:
				setSource((SourceType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PATENT:
				setPatent((PatentType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__TRANS_SOURCE:
				setTransSource((TransSourceType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__YEAR:
				setYear((YearType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__MONTH:
				setMonth((MonthType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__DAY:
				setDay((DayType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__TIME_STAMP:
				setTimeStamp((TimeStampType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__SEASON:
				setSeason((SeasonType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ACCESS_DATE:
				setAccessDate((AccessDateType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__VOLUME:
				setVolume((VolumeType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__EDITION:
				setEdition((EditionType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__CONF_NAME:
				setConfName((ConfNameType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__CONF_DATE:
				setConfDate((ConfDateType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__CONF_LOC:
				setConfLoc((ConfLocType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__GROUP2:
				getGroup2().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__ISSUE:
				getIssue().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__SUPPLEMENT:
				getSupplement().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_LOC:
				setPublisherLoc((PublisherLocType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_NAME:
				setPublisherName((PublisherNameType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__GROUP3:
				getGroup3().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__FPAGE:
				getFpage().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__LPAGE:
				getLpage().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__PAGE_COUNT:
				setPageCount((PageCountType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__SERIES:
				setSeries((SeriesType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__COMMENT:
				getComment().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUB_ID:
				getPubId().clear();
				return;
			case Jats1Package.NLM_CITATION_TYPE__ANNOTATION:
				setAnnotation((AnnotationType)null);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.NLM_CITATION_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.NLM_CITATION_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.NLM_CITATION_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUBLICATION_FORMAT:
				setPublicationFormat(PUBLICATION_FORMAT_EDEFAULT);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUBLICATION_TYPE:
				setPublicationType(PUBLICATION_TYPE_EDEFAULT);
				return;
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_TYPE:
				setPublisherType(PUBLISHER_TYPE_EDEFAULT);
				return;
			case Jats1Package.NLM_CITATION_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Jats1Package.NLM_CITATION_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.NLM_CITATION_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.NLM_CITATION_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Jats1Package.NLM_CITATION_TYPE__TYPE:
				unsetType();
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
			case Jats1Package.NLM_CITATION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__PERSON_GROUP:
				return !getPersonGroup().isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__COLLAB:
				return !getCollab().isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__GROUP1:
				return group1 != null && !group1.isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__ARTICLE_TITLE:
				return !getArticleTitle().isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__TRANS_TITLE:
				return !getTransTitle().isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__SOURCE:
				return source != null;
			case Jats1Package.NLM_CITATION_TYPE__PATENT:
				return patent != null;
			case Jats1Package.NLM_CITATION_TYPE__TRANS_SOURCE:
				return transSource != null;
			case Jats1Package.NLM_CITATION_TYPE__YEAR:
				return year != null;
			case Jats1Package.NLM_CITATION_TYPE__MONTH:
				return month != null;
			case Jats1Package.NLM_CITATION_TYPE__DAY:
				return day != null;
			case Jats1Package.NLM_CITATION_TYPE__TIME_STAMP:
				return timeStamp != null;
			case Jats1Package.NLM_CITATION_TYPE__SEASON:
				return season != null;
			case Jats1Package.NLM_CITATION_TYPE__ACCESS_DATE:
				return accessDate != null;
			case Jats1Package.NLM_CITATION_TYPE__VOLUME:
				return volume != null;
			case Jats1Package.NLM_CITATION_TYPE__EDITION:
				return edition != null;
			case Jats1Package.NLM_CITATION_TYPE__CONF_NAME:
				return confName != null;
			case Jats1Package.NLM_CITATION_TYPE__CONF_DATE:
				return confDate != null;
			case Jats1Package.NLM_CITATION_TYPE__CONF_LOC:
				return confLoc != null;
			case Jats1Package.NLM_CITATION_TYPE__GROUP2:
				return group2 != null && !group2.isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__ISSUE:
				return !getIssue().isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__SUPPLEMENT:
				return !getSupplement().isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_LOC:
				return publisherLoc != null;
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_NAME:
				return publisherName != null;
			case Jats1Package.NLM_CITATION_TYPE__GROUP3:
				return group3 != null && !group3.isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__FPAGE:
				return !getFpage().isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__LPAGE:
				return !getLpage().isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__PAGE_COUNT:
				return pageCount != null;
			case Jats1Package.NLM_CITATION_TYPE__SERIES:
				return series != null;
			case Jats1Package.NLM_CITATION_TYPE__COMMENT:
				return comment != null && !comment.isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__PUB_ID:
				return pubId != null && !pubId.isEmpty();
			case Jats1Package.NLM_CITATION_TYPE__ANNOTATION:
				return annotation != null;
			case Jats1Package.NLM_CITATION_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.NLM_CITATION_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.NLM_CITATION_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.NLM_CITATION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.NLM_CITATION_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.NLM_CITATION_TYPE__PUBLICATION_FORMAT:
				return PUBLICATION_FORMAT_EDEFAULT == null ? publicationFormat != null : !PUBLICATION_FORMAT_EDEFAULT.equals(publicationFormat);
			case Jats1Package.NLM_CITATION_TYPE__PUBLICATION_TYPE:
				return PUBLICATION_TYPE_EDEFAULT == null ? publicationType != null : !PUBLICATION_TYPE_EDEFAULT.equals(publicationType);
			case Jats1Package.NLM_CITATION_TYPE__PUBLISHER_TYPE:
				return PUBLISHER_TYPE_EDEFAULT == null ? publisherType != null : !PUBLISHER_TYPE_EDEFAULT.equals(publisherType);
			case Jats1Package.NLM_CITATION_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Jats1Package.NLM_CITATION_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.NLM_CITATION_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.NLM_CITATION_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Jats1Package.NLM_CITATION_TYPE__TYPE:
				return isSetType();
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
		result.append(", group1: ");
		result.append(group1);
		result.append(", group2: ");
		result.append(group2);
		result.append(", group3: ");
		result.append(group3);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", base: ");
		result.append(base);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", publicationFormat: ");
		result.append(publicationFormat);
		result.append(", publicationType: ");
		result.append(publicationType);
		result.append(", publisherType: ");
		result.append(publisherType);
		result.append(", role: ");
		result.append(role);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NlmCitationTypeImpl
