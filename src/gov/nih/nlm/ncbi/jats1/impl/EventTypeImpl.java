/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ArticleIdType;
import gov.nih.nlm.ncbi.jats1.ArticleVersionAlternativesType;
import gov.nih.nlm.ncbi.jats1.ArticleVersionType;
import gov.nih.nlm.ncbi.jats1.DateType;
import gov.nih.nlm.ncbi.jats1.EventDescType;
import gov.nih.nlm.ncbi.jats1.EventType;
import gov.nih.nlm.ncbi.jats1.IsbnType;
import gov.nih.nlm.ncbi.jats1.IssnLType;
import gov.nih.nlm.ncbi.jats1.IssnType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.NotesType;
import gov.nih.nlm.ncbi.jats1.PermissionsType;
import gov.nih.nlm.ncbi.jats1.PubDateNotAvailableType;
import gov.nih.nlm.ncbi.jats1.PubDateType;
import gov.nih.nlm.ncbi.jats1.SelfUriType;

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
 * An implementation of the model object '<em><b>Event Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getEventDesc <em>Event Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getArticleId <em>Article Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getArticleVersion <em>Article Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getArticleVersionAlternatives <em>Article Version Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getPubDateClass <em>Pub Date Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getPubDate <em>Pub Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getPubDateNotAvailable <em>Pub Date Not Available</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getDateClass <em>Date Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getIssnL <em>Issn L</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getSelfUri <em>Self Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventTypeImpl extends MinimalEObjectImpl.Container implements EventType {
	/**
	 * The cached value of the '{@link #getEventDesc() <em>Event Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDesc()
	 * @generated
	 * @ordered
	 */
	protected EventDescType eventDesc;

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
	 * The cached value of the '{@link #getDateClass() <em>Date Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap dateClass;

	/**
	 * The cached value of the '{@link #getIssn() <em>Issn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssn()
	 * @generated
	 * @ordered
	 */
	protected EList<IssnType> issn;

	/**
	 * The cached value of the '{@link #getIssnL() <em>Issn L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssnL()
	 * @generated
	 * @ordered
	 */
	protected IssnLType issnL;

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
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected PermissionsType permissions;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<NotesType> notes;

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
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected String eventType = EVENT_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getEventType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDescType getEventDesc() {
		return eventDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventDesc(EventDescType newEventDesc, NotificationChain msgs) {
		EventDescType oldEventDesc = eventDesc;
		eventDesc = newEventDesc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__EVENT_DESC, oldEventDesc, newEventDesc);
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
	public void setEventDesc(EventDescType newEventDesc) {
		if (newEventDesc != eventDesc) {
			NotificationChain msgs = null;
			if (eventDesc != null)
				msgs = ((InternalEObject)eventDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__EVENT_DESC, null, msgs);
			if (newEventDesc != null)
				msgs = ((InternalEObject)newEventDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__EVENT_DESC, null, msgs);
			msgs = basicSetEventDesc(newEventDesc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__EVENT_DESC, newEventDesc, newEventDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArticleIdType> getArticleId() {
		if (articleId == null) {
			articleId = new EObjectContainmentEList<ArticleIdType>(ArticleIdType.class, this, Jats1Package.EVENT_TYPE__ARTICLE_ID);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__ARTICLE_VERSION, oldArticleVersion, newArticleVersion);
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
				msgs = ((InternalEObject)articleVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__ARTICLE_VERSION, null, msgs);
			if (newArticleVersion != null)
				msgs = ((InternalEObject)newArticleVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__ARTICLE_VERSION, null, msgs);
			msgs = basicSetArticleVersion(newArticleVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__ARTICLE_VERSION, newArticleVersion, newArticleVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__ARTICLE_VERSION_ALTERNATIVES, oldArticleVersionAlternatives, newArticleVersionAlternatives);
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
				msgs = ((InternalEObject)articleVersionAlternatives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__ARTICLE_VERSION_ALTERNATIVES, null, msgs);
			if (newArticleVersionAlternatives != null)
				msgs = ((InternalEObject)newArticleVersionAlternatives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__ARTICLE_VERSION_ALTERNATIVES, null, msgs);
			msgs = basicSetArticleVersionAlternatives(newArticleVersionAlternatives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__ARTICLE_VERSION_ALTERNATIVES, newArticleVersionAlternatives, newArticleVersionAlternatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPubDateClass() {
		if (pubDateClass == null) {
			pubDateClass = new BasicFeatureMap(this, Jats1Package.EVENT_TYPE__PUB_DATE_CLASS);
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
		return getPubDateClass().list(Jats1Package.eINSTANCE.getEventType_PubDate());
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__PUB_DATE_NOT_AVAILABLE, oldPubDateNotAvailable, newPubDateNotAvailable);
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
				msgs = ((InternalEObject)pubDateNotAvailable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__PUB_DATE_NOT_AVAILABLE, null, msgs);
			if (newPubDateNotAvailable != null)
				msgs = ((InternalEObject)newPubDateNotAvailable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__PUB_DATE_NOT_AVAILABLE, null, msgs);
			msgs = basicSetPubDateNotAvailable(newPubDateNotAvailable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__PUB_DATE_NOT_AVAILABLE, newPubDateNotAvailable, newPubDateNotAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDateClass() {
		if (dateClass == null) {
			dateClass = new BasicFeatureMap(this, Jats1Package.EVENT_TYPE__DATE_CLASS);
		}
		return dateClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateType> getDate() {
		return getDateClass().list(Jats1Package.eINSTANCE.getEventType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssnType> getIssn() {
		if (issn == null) {
			issn = new EObjectContainmentEList<IssnType>(IssnType.class, this, Jats1Package.EVENT_TYPE__ISSN);
		}
		return issn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssnLType getIssnL() {
		return issnL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssnL(IssnLType newIssnL, NotificationChain msgs) {
		IssnLType oldIssnL = issnL;
		issnL = newIssnL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__ISSN_L, oldIssnL, newIssnL);
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
	public void setIssnL(IssnLType newIssnL) {
		if (newIssnL != issnL) {
			NotificationChain msgs = null;
			if (issnL != null)
				msgs = ((InternalEObject)issnL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__ISSN_L, null, msgs);
			if (newIssnL != null)
				msgs = ((InternalEObject)newIssnL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__ISSN_L, null, msgs);
			msgs = basicSetIssnL(newIssnL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__ISSN_L, newIssnL, newIssnL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IsbnType> getIsbn() {
		if (isbn == null) {
			isbn = new EObjectContainmentEList<IsbnType>(IsbnType.class, this, Jats1Package.EVENT_TYPE__ISBN);
		}
		return isbn;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__PERMISSIONS, oldPermissions, newPermissions);
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
				msgs = ((InternalEObject)permissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__PERMISSIONS, null, msgs);
			if (newPermissions != null)
				msgs = ((InternalEObject)newPermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.EVENT_TYPE__PERMISSIONS, null, msgs);
			msgs = basicSetPermissions(newPermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__PERMISSIONS, newPermissions, newPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NotesType> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<NotesType>(NotesType.class, this, Jats1Package.EVENT_TYPE__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelfUriType> getSelfUri() {
		if (selfUri == null) {
			selfUri = new EObjectContainmentEList<SelfUriType>(SelfUriType.class, this, Jats1Package.EVENT_TYPE__SELF_URI);
		}
		return selfUri;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventType(String newEventType) {
		String oldEventType = eventType;
		eventType = newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__EVENT_TYPE, oldEventType, eventType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.EVENT_TYPE__EVENT_DESC:
				return basicSetEventDesc(null, msgs);
			case Jats1Package.EVENT_TYPE__ARTICLE_ID:
				return ((InternalEList<?>)getArticleId()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_TYPE__ARTICLE_VERSION:
				return basicSetArticleVersion(null, msgs);
			case Jats1Package.EVENT_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				return basicSetArticleVersionAlternatives(null, msgs);
			case Jats1Package.EVENT_TYPE__PUB_DATE_CLASS:
				return ((InternalEList<?>)getPubDateClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_TYPE__PUB_DATE:
				return ((InternalEList<?>)getPubDate()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_TYPE__PUB_DATE_NOT_AVAILABLE:
				return basicSetPubDateNotAvailable(null, msgs);
			case Jats1Package.EVENT_TYPE__DATE_CLASS:
				return ((InternalEList<?>)getDateClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_TYPE__ISSN:
				return ((InternalEList<?>)getIssn()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_TYPE__ISSN_L:
				return basicSetIssnL(null, msgs);
			case Jats1Package.EVENT_TYPE__ISBN:
				return ((InternalEList<?>)getIsbn()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_TYPE__PERMISSIONS:
				return basicSetPermissions(null, msgs);
			case Jats1Package.EVENT_TYPE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_TYPE__SELF_URI:
				return ((InternalEList<?>)getSelfUri()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.EVENT_TYPE__EVENT_DESC:
				return getEventDesc();
			case Jats1Package.EVENT_TYPE__ARTICLE_ID:
				return getArticleId();
			case Jats1Package.EVENT_TYPE__ARTICLE_VERSION:
				return getArticleVersion();
			case Jats1Package.EVENT_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				return getArticleVersionAlternatives();
			case Jats1Package.EVENT_TYPE__PUB_DATE_CLASS:
				if (coreType) return getPubDateClass();
				return ((FeatureMap.Internal)getPubDateClass()).getWrapper();
			case Jats1Package.EVENT_TYPE__PUB_DATE:
				return getPubDate();
			case Jats1Package.EVENT_TYPE__PUB_DATE_NOT_AVAILABLE:
				return getPubDateNotAvailable();
			case Jats1Package.EVENT_TYPE__DATE_CLASS:
				if (coreType) return getDateClass();
				return ((FeatureMap.Internal)getDateClass()).getWrapper();
			case Jats1Package.EVENT_TYPE__DATE:
				return getDate();
			case Jats1Package.EVENT_TYPE__ISSN:
				return getIssn();
			case Jats1Package.EVENT_TYPE__ISSN_L:
				return getIssnL();
			case Jats1Package.EVENT_TYPE__ISBN:
				return getIsbn();
			case Jats1Package.EVENT_TYPE__PERMISSIONS:
				return getPermissions();
			case Jats1Package.EVENT_TYPE__NOTES:
				return getNotes();
			case Jats1Package.EVENT_TYPE__SELF_URI:
				return getSelfUri();
			case Jats1Package.EVENT_TYPE__BASE:
				return getBase();
			case Jats1Package.EVENT_TYPE__EVENT_TYPE:
				return getEventType();
			case Jats1Package.EVENT_TYPE__ID:
				return getId();
			case Jats1Package.EVENT_TYPE__LANG:
				return getLang();
			case Jats1Package.EVENT_TYPE__SPECIFIC_USE:
				return getSpecificUse();
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
			case Jats1Package.EVENT_TYPE__EVENT_DESC:
				setEventDesc((EventDescType)newValue);
				return;
			case Jats1Package.EVENT_TYPE__ARTICLE_ID:
				getArticleId().clear();
				getArticleId().addAll((Collection<? extends ArticleIdType>)newValue);
				return;
			case Jats1Package.EVENT_TYPE__ARTICLE_VERSION:
				setArticleVersion((ArticleVersionType)newValue);
				return;
			case Jats1Package.EVENT_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				setArticleVersionAlternatives((ArticleVersionAlternativesType)newValue);
				return;
			case Jats1Package.EVENT_TYPE__PUB_DATE_CLASS:
				((FeatureMap.Internal)getPubDateClass()).set(newValue);
				return;
			case Jats1Package.EVENT_TYPE__PUB_DATE:
				getPubDate().clear();
				getPubDate().addAll((Collection<? extends PubDateType>)newValue);
				return;
			case Jats1Package.EVENT_TYPE__PUB_DATE_NOT_AVAILABLE:
				setPubDateNotAvailable((PubDateNotAvailableType)newValue);
				return;
			case Jats1Package.EVENT_TYPE__DATE_CLASS:
				((FeatureMap.Internal)getDateClass()).set(newValue);
				return;
			case Jats1Package.EVENT_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case Jats1Package.EVENT_TYPE__ISSN:
				getIssn().clear();
				getIssn().addAll((Collection<? extends IssnType>)newValue);
				return;
			case Jats1Package.EVENT_TYPE__ISSN_L:
				setIssnL((IssnLType)newValue);
				return;
			case Jats1Package.EVENT_TYPE__ISBN:
				getIsbn().clear();
				getIsbn().addAll((Collection<? extends IsbnType>)newValue);
				return;
			case Jats1Package.EVENT_TYPE__PERMISSIONS:
				setPermissions((PermissionsType)newValue);
				return;
			case Jats1Package.EVENT_TYPE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends NotesType>)newValue);
				return;
			case Jats1Package.EVENT_TYPE__SELF_URI:
				getSelfUri().clear();
				getSelfUri().addAll((Collection<? extends SelfUriType>)newValue);
				return;
			case Jats1Package.EVENT_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.EVENT_TYPE__EVENT_TYPE:
				setEventType((String)newValue);
				return;
			case Jats1Package.EVENT_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.EVENT_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.EVENT_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
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
			case Jats1Package.EVENT_TYPE__EVENT_DESC:
				setEventDesc((EventDescType)null);
				return;
			case Jats1Package.EVENT_TYPE__ARTICLE_ID:
				getArticleId().clear();
				return;
			case Jats1Package.EVENT_TYPE__ARTICLE_VERSION:
				setArticleVersion((ArticleVersionType)null);
				return;
			case Jats1Package.EVENT_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				setArticleVersionAlternatives((ArticleVersionAlternativesType)null);
				return;
			case Jats1Package.EVENT_TYPE__PUB_DATE_CLASS:
				getPubDateClass().clear();
				return;
			case Jats1Package.EVENT_TYPE__PUB_DATE:
				getPubDate().clear();
				return;
			case Jats1Package.EVENT_TYPE__PUB_DATE_NOT_AVAILABLE:
				setPubDateNotAvailable((PubDateNotAvailableType)null);
				return;
			case Jats1Package.EVENT_TYPE__DATE_CLASS:
				getDateClass().clear();
				return;
			case Jats1Package.EVENT_TYPE__DATE:
				getDate().clear();
				return;
			case Jats1Package.EVENT_TYPE__ISSN:
				getIssn().clear();
				return;
			case Jats1Package.EVENT_TYPE__ISSN_L:
				setIssnL((IssnLType)null);
				return;
			case Jats1Package.EVENT_TYPE__ISBN:
				getIsbn().clear();
				return;
			case Jats1Package.EVENT_TYPE__PERMISSIONS:
				setPermissions((PermissionsType)null);
				return;
			case Jats1Package.EVENT_TYPE__NOTES:
				getNotes().clear();
				return;
			case Jats1Package.EVENT_TYPE__SELF_URI:
				getSelfUri().clear();
				return;
			case Jats1Package.EVENT_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.EVENT_TYPE__EVENT_TYPE:
				setEventType(EVENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.EVENT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.EVENT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.EVENT_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
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
			case Jats1Package.EVENT_TYPE__EVENT_DESC:
				return eventDesc != null;
			case Jats1Package.EVENT_TYPE__ARTICLE_ID:
				return articleId != null && !articleId.isEmpty();
			case Jats1Package.EVENT_TYPE__ARTICLE_VERSION:
				return articleVersion != null;
			case Jats1Package.EVENT_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				return articleVersionAlternatives != null;
			case Jats1Package.EVENT_TYPE__PUB_DATE_CLASS:
				return pubDateClass != null && !pubDateClass.isEmpty();
			case Jats1Package.EVENT_TYPE__PUB_DATE:
				return !getPubDate().isEmpty();
			case Jats1Package.EVENT_TYPE__PUB_DATE_NOT_AVAILABLE:
				return pubDateNotAvailable != null;
			case Jats1Package.EVENT_TYPE__DATE_CLASS:
				return dateClass != null && !dateClass.isEmpty();
			case Jats1Package.EVENT_TYPE__DATE:
				return !getDate().isEmpty();
			case Jats1Package.EVENT_TYPE__ISSN:
				return issn != null && !issn.isEmpty();
			case Jats1Package.EVENT_TYPE__ISSN_L:
				return issnL != null;
			case Jats1Package.EVENT_TYPE__ISBN:
				return isbn != null && !isbn.isEmpty();
			case Jats1Package.EVENT_TYPE__PERMISSIONS:
				return permissions != null;
			case Jats1Package.EVENT_TYPE__NOTES:
				return notes != null && !notes.isEmpty();
			case Jats1Package.EVENT_TYPE__SELF_URI:
				return selfUri != null && !selfUri.isEmpty();
			case Jats1Package.EVENT_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.EVENT_TYPE__EVENT_TYPE:
				return EVENT_TYPE_EDEFAULT == null ? eventType != null : !EVENT_TYPE_EDEFAULT.equals(eventType);
			case Jats1Package.EVENT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.EVENT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.EVENT_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
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
		result.append(" (pubDateClass: ");
		result.append(pubDateClass);
		result.append(", dateClass: ");
		result.append(dateClass);
		result.append(", base: ");
		result.append(base);
		result.append(", eventType: ");
		result.append(eventType);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //EventTypeImpl
