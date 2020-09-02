/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ArticleIdType;
import gov.nih.nlm.ncbi.jats1.ArticleVersionAlternativesType;
import gov.nih.nlm.ncbi.jats1.ArticleVersionType;
import gov.nih.nlm.ncbi.jats1.DateType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.EventDescType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.IsbnType;
import gov.nih.nlm.ncbi.jats1.IssnLType;
import gov.nih.nlm.ncbi.jats1.IssnType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.PubDateNotAvailableType;
import gov.nih.nlm.ncbi.jats1.PubDateType;
import gov.nih.nlm.ncbi.jats1.UriType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Desc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getEventDescElements <em>Event Desc Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getArticleId <em>Article Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getIssnL <em>Issn L</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getArticleVersion <em>Article Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getArticleVersionAlternatives <em>Article Version Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getPubDate <em>Pub Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getPubDateNotAvailable <em>Pub Date Not Available</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.EventDescTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventDescTypeImpl extends MinimalEObjectImpl.Container implements EventDescType {
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
	protected EventDescTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getEventDescType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.EVENT_DESC_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getEventDescElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getEventDescType_EventDescElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArticleIdType> getArticleId() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_ArticleId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssnType> getIssn() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_Issn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssnLType> getIssnL() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_IssnL());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IsbnType> getIsbn() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_Isbn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArticleVersionType> getArticleVersion() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_ArticleVersion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArticleVersionAlternativesType> getArticleVersionAlternatives() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_ArticleVersionAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateType> getDate() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PubDateType> getPubDate() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_PubDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PubDateNotAvailableType> getPubDateNotAvailable() {
		return getEventDescElements().list(Jats1Package.eINSTANCE.getEventDescType_PubDateNotAvailable());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_DESC_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_DESC_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_DESC_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.EVENT_DESC_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.EVENT_DESC_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__EVENT_DESC_ELEMENTS:
				return ((InternalEList<?>)getEventDescElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_ID:
				return ((InternalEList<?>)getArticleId()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__ISSN:
				return ((InternalEList<?>)getIssn()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__ISSN_L:
				return ((InternalEList<?>)getIssnL()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__ISBN:
				return ((InternalEList<?>)getIsbn()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_VERSION:
				return ((InternalEList<?>)getArticleVersion()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				return ((InternalEList<?>)getArticleVersionAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__PUB_DATE:
				return ((InternalEList<?>)getPubDate()).basicRemove(otherEnd, msgs);
			case Jats1Package.EVENT_DESC_TYPE__PUB_DATE_NOT_AVAILABLE:
				return ((InternalEList<?>)getPubDateNotAvailable()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.EVENT_DESC_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.EVENT_DESC_TYPE__EVENT_DESC_ELEMENTS:
				if (coreType) return getEventDescElements();
				return ((FeatureMap.Internal)getEventDescElements()).getWrapper();
			case Jats1Package.EVENT_DESC_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.EVENT_DESC_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.EVENT_DESC_TYPE__URI:
				return getUri();
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_ID:
				return getArticleId();
			case Jats1Package.EVENT_DESC_TYPE__ISSN:
				return getIssn();
			case Jats1Package.EVENT_DESC_TYPE__ISSN_L:
				return getIssnL();
			case Jats1Package.EVENT_DESC_TYPE__ISBN:
				return getIsbn();
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_VERSION:
				return getArticleVersion();
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				return getArticleVersionAlternatives();
			case Jats1Package.EVENT_DESC_TYPE__DATE:
				return getDate();
			case Jats1Package.EVENT_DESC_TYPE__PUB_DATE:
				return getPubDate();
			case Jats1Package.EVENT_DESC_TYPE__PUB_DATE_NOT_AVAILABLE:
				return getPubDateNotAvailable();
			case Jats1Package.EVENT_DESC_TYPE__BASE:
				return getBase();
			case Jats1Package.EVENT_DESC_TYPE__ID:
				return getId();
			case Jats1Package.EVENT_DESC_TYPE__LANG:
				return getLang();
			case Jats1Package.EVENT_DESC_TYPE__SPECIFIC_USE:
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
			case Jats1Package.EVENT_DESC_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__EVENT_DESC_ELEMENTS:
				((FeatureMap.Internal)getEventDescElements()).set(newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_ID:
				getArticleId().clear();
				getArticleId().addAll((Collection<? extends ArticleIdType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__ISSN:
				getIssn().clear();
				getIssn().addAll((Collection<? extends IssnType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__ISSN_L:
				getIssnL().clear();
				getIssnL().addAll((Collection<? extends IssnLType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__ISBN:
				getIsbn().clear();
				getIsbn().addAll((Collection<? extends IsbnType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_VERSION:
				getArticleVersion().clear();
				getArticleVersion().addAll((Collection<? extends ArticleVersionType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				getArticleVersionAlternatives().clear();
				getArticleVersionAlternatives().addAll((Collection<? extends ArticleVersionAlternativesType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__PUB_DATE:
				getPubDate().clear();
				getPubDate().addAll((Collection<? extends PubDateType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__PUB_DATE_NOT_AVAILABLE:
				getPubDateNotAvailable().clear();
				getPubDateNotAvailable().addAll((Collection<? extends PubDateNotAvailableType>)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.EVENT_DESC_TYPE__SPECIFIC_USE:
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
			case Jats1Package.EVENT_DESC_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__EVENT_DESC_ELEMENTS:
				getEventDescElements().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_ID:
				getArticleId().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__ISSN:
				getIssn().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__ISSN_L:
				getIssnL().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__ISBN:
				getIsbn().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_VERSION:
				getArticleVersion().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				getArticleVersionAlternatives().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__DATE:
				getDate().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__PUB_DATE:
				getPubDate().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__PUB_DATE_NOT_AVAILABLE:
				getPubDateNotAvailable().clear();
				return;
			case Jats1Package.EVENT_DESC_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.EVENT_DESC_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.EVENT_DESC_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.EVENT_DESC_TYPE__SPECIFIC_USE:
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
			case Jats1Package.EVENT_DESC_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__EVENT_DESC_ELEMENTS:
				return !getEventDescElements().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_ID:
				return !getArticleId().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__ISSN:
				return !getIssn().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__ISSN_L:
				return !getIssnL().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__ISBN:
				return !getIsbn().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_VERSION:
				return !getArticleVersion().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__ARTICLE_VERSION_ALTERNATIVES:
				return !getArticleVersionAlternatives().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__DATE:
				return !getDate().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__PUB_DATE:
				return !getPubDate().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__PUB_DATE_NOT_AVAILABLE:
				return !getPubDateNotAvailable().isEmpty();
			case Jats1Package.EVENT_DESC_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.EVENT_DESC_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.EVENT_DESC_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.EVENT_DESC_TYPE__SPECIFIC_USE:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //EventDescTypeImpl
