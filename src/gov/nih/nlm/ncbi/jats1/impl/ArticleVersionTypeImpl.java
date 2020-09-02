/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ArticleVersionType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 * An implementation of the model object '<em><b>Article Version Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getArticleVersionType <em>Article Version Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getDesignator <em>Designator</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getIso8601Date <em>Iso8601 Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getVocab <em>Vocab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getVocabIdentifier <em>Vocab Identifier</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getVocabTerm <em>Vocab Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionTypeImpl#getVocabTermIdentifier <em>Vocab Term Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleVersionTypeImpl extends MinimalEObjectImpl.Container implements ArticleVersionType {
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
	 * The default value of the '{@link #getArticleVersionType() <em>Article Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleVersionType()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTICLE_VERSION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArticleVersionType() <em>Article Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleVersionType()
	 * @generated
	 * @ordered
	 */
	protected String articleVersionType = ARTICLE_VERSION_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignator() <em>Designator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignator()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGNATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignator() <em>Designator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignator()
	 * @generated
	 * @ordered
	 */
	protected String designator = DESIGNATOR_EDEFAULT;

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
	 * The default value of the '{@link #getIso8601Date() <em>Iso8601 Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIso8601Date()
	 * @generated
	 * @ordered
	 */
	protected static final String ISO8601_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIso8601Date() <em>Iso8601 Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIso8601Date()
	 * @generated
	 * @ordered
	 */
	protected String iso8601Date = ISO8601_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getVocab() <em>Vocab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocab()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocab() <em>Vocab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocab()
	 * @generated
	 * @ordered
	 */
	protected String vocab = VOCAB_EDEFAULT;

	/**
	 * The default value of the '{@link #getVocabIdentifier() <em>Vocab Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabIdentifier() <em>Vocab Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String vocabIdentifier = VOCAB_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVocabTerm() <em>Vocab Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabTerm() <em>Vocab Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTerm()
	 * @generated
	 * @ordered
	 */
	protected String vocabTerm = VOCAB_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVocabTermIdentifier() <em>Vocab Term Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTermIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_TERM_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabTermIdentifier() <em>Vocab Term Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTermIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String vocabTermIdentifier = VOCAB_TERM_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleVersionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getArticleVersionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.ARTICLE_VERSION_TYPE__MIXED);
		}
		return mixed;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.ARTICLE_VERSION_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
	public String getArticleVersionType() {
		return articleVersionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleVersionType(String newArticleVersionType) {
		String oldArticleVersionType = articleVersionType;
		articleVersionType = newArticleVersionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__ARTICLE_VERSION_TYPE, oldArticleVersionType, articleVersionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesignator() {
		return designator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignator(String newDesignator) {
		String oldDesignator = designator;
		designator = newDesignator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__DESIGNATOR, oldDesignator, designator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIso8601Date() {
		return iso8601Date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIso8601Date(String newIso8601Date) {
		String oldIso8601Date = iso8601Date;
		iso8601Date = newIso8601Date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__ISO8601_DATE, oldIso8601Date, iso8601Date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.ARTICLE_VERSION_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.ARTICLE_VERSION_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public String getVocab() {
		return vocab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocab(String newVocab) {
		String oldVocab = vocab;
		vocab = newVocab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__VOCAB, oldVocab, vocab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocabIdentifier() {
		return vocabIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocabIdentifier(String newVocabIdentifier) {
		String oldVocabIdentifier = vocabIdentifier;
		vocabIdentifier = newVocabIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_IDENTIFIER, oldVocabIdentifier, vocabIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocabTerm() {
		return vocabTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocabTerm(String newVocabTerm) {
		String oldVocabTerm = vocabTerm;
		vocabTerm = newVocabTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_TERM, oldVocabTerm, vocabTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocabTermIdentifier() {
		return vocabTermIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocabTermIdentifier(String newVocabTermIdentifier) {
		String oldVocabTermIdentifier = vocabTermIdentifier;
		vocabTermIdentifier = newVocabTermIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_TERM_IDENTIFIER, oldVocabTermIdentifier, vocabTermIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ARTICLE_VERSION_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.ARTICLE_VERSION_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.ARTICLE_VERSION_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.ARTICLE_VERSION_TYPE__ARTICLE_VERSION_TYPE:
				return getArticleVersionType();
			case Jats1Package.ARTICLE_VERSION_TYPE__BASE:
				return getBase();
			case Jats1Package.ARTICLE_VERSION_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.ARTICLE_VERSION_TYPE__DESIGNATOR:
				return getDesignator();
			case Jats1Package.ARTICLE_VERSION_TYPE__HREF:
				return getHref();
			case Jats1Package.ARTICLE_VERSION_TYPE__ID:
				return getId();
			case Jats1Package.ARTICLE_VERSION_TYPE__ISO8601_DATE:
				return getIso8601Date();
			case Jats1Package.ARTICLE_VERSION_TYPE__ROLE:
				return getRole();
			case Jats1Package.ARTICLE_VERSION_TYPE__SHOW:
				return getShow();
			case Jats1Package.ARTICLE_VERSION_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.ARTICLE_VERSION_TYPE__TITLE:
				return getTitle();
			case Jats1Package.ARTICLE_VERSION_TYPE__TYPE:
				return getType();
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB:
				return getVocab();
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_IDENTIFIER:
				return getVocabIdentifier();
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_TERM:
				return getVocabTerm();
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_TERM_IDENTIFIER:
				return getVocabTermIdentifier();
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
			case Jats1Package.ARTICLE_VERSION_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__ARTICLE_VERSION_TYPE:
				setArticleVersionType((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__DESIGNATOR:
				setDesignator((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__ISO8601_DATE:
				setIso8601Date((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__TYPE:
				setType((TypeType)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB:
				setVocab((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_IDENTIFIER:
				setVocabIdentifier((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_TERM:
				setVocabTerm((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_TERM_IDENTIFIER:
				setVocabTermIdentifier((String)newValue);
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
			case Jats1Package.ARTICLE_VERSION_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__ARTICLE_VERSION_TYPE:
				setArticleVersionType(ARTICLE_VERSION_TYPE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__DESIGNATOR:
				setDesignator(DESIGNATOR_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__ISO8601_DATE:
				setIso8601Date(ISO8601_DATE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__TYPE:
				unsetType();
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB:
				setVocab(VOCAB_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_IDENTIFIER:
				setVocabIdentifier(VOCAB_IDENTIFIER_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_TERM:
				setVocabTerm(VOCAB_TERM_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_TERM_IDENTIFIER:
				setVocabTermIdentifier(VOCAB_TERM_IDENTIFIER_EDEFAULT);
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
			case Jats1Package.ARTICLE_VERSION_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.ARTICLE_VERSION_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.ARTICLE_VERSION_TYPE__ARTICLE_VERSION_TYPE:
				return ARTICLE_VERSION_TYPE_EDEFAULT == null ? articleVersionType != null : !ARTICLE_VERSION_TYPE_EDEFAULT.equals(articleVersionType);
			case Jats1Package.ARTICLE_VERSION_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ARTICLE_VERSION_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.ARTICLE_VERSION_TYPE__DESIGNATOR:
				return DESIGNATOR_EDEFAULT == null ? designator != null : !DESIGNATOR_EDEFAULT.equals(designator);
			case Jats1Package.ARTICLE_VERSION_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.ARTICLE_VERSION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.ARTICLE_VERSION_TYPE__ISO8601_DATE:
				return ISO8601_DATE_EDEFAULT == null ? iso8601Date != null : !ISO8601_DATE_EDEFAULT.equals(iso8601Date);
			case Jats1Package.ARTICLE_VERSION_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Jats1Package.ARTICLE_VERSION_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.ARTICLE_VERSION_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.ARTICLE_VERSION_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Jats1Package.ARTICLE_VERSION_TYPE__TYPE:
				return isSetType();
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB:
				return VOCAB_EDEFAULT == null ? vocab != null : !VOCAB_EDEFAULT.equals(vocab);
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_IDENTIFIER:
				return VOCAB_IDENTIFIER_EDEFAULT == null ? vocabIdentifier != null : !VOCAB_IDENTIFIER_EDEFAULT.equals(vocabIdentifier);
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_TERM:
				return VOCAB_TERM_EDEFAULT == null ? vocabTerm != null : !VOCAB_TERM_EDEFAULT.equals(vocabTerm);
			case Jats1Package.ARTICLE_VERSION_TYPE__VOCAB_TERM_IDENTIFIER:
				return VOCAB_TERM_IDENTIFIER_EDEFAULT == null ? vocabTermIdentifier != null : !VOCAB_TERM_IDENTIFIER_EDEFAULT.equals(vocabTermIdentifier);
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
		result.append(", articleVersionType: ");
		result.append(articleVersionType);
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", designator: ");
		result.append(designator);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", iso8601Date: ");
		result.append(iso8601Date);
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
		result.append(", vocab: ");
		result.append(vocab);
		result.append(", vocabIdentifier: ");
		result.append(vocabIdentifier);
		result.append(", vocabTerm: ");
		result.append(vocabTerm);
		result.append(", vocabTermIdentifier: ");
		result.append(vocabTermIdentifier);
		result.append(')');
		return result.toString();
	}

} //ArticleVersionTypeImpl
