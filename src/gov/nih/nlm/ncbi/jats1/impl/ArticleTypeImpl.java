/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ArticleType;
import gov.nih.nlm.ncbi.jats1.BackType;
import gov.nih.nlm.ncbi.jats1.BodyType;
import gov.nih.nlm.ncbi.jats1.FloatsGroupType;
import gov.nih.nlm.ncbi.jats1.FrontType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.ResponseType;
import gov.nih.nlm.ncbi.jats1.SubArticleType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.xml._1998.namespace.NamespaceFactory;
import org.w3.xml._1998.namespace.NamespacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getFront <em>Front</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getBack <em>Back</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getFloatsGroup <em>Floats Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getSubArticle <em>Sub Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getArticleType <em>Article Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getDtdVersion <em>Dtd Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleTypeImpl extends MinimalEObjectImpl.Container implements ArticleType {
	/**
	 * The cached value of the '{@link #getFront() <em>Front</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFront()
	 * @generated
	 * @ordered
	 */
	protected FrontType front;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected BodyType body;

	/**
	 * The cached value of the '{@link #getBack() <em>Back</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBack()
	 * @generated
	 * @ordered
	 */
	protected BackType back;

	/**
	 * The cached value of the '{@link #getFloatsGroup() <em>Floats Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatsGroup()
	 * @generated
	 * @ordered
	 */
	protected FloatsGroupType floatsGroup;

	/**
	 * The cached value of the '{@link #getSubArticle() <em>Sub Article</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubArticle()
	 * @generated
	 * @ordered
	 */
	protected EList<SubArticleType> subArticle;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseType> response;

	/**
	 * The default value of the '{@link #getArticleType() <em>Article Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleType()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTICLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArticleType() <em>Article Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleType()
	 * @generated
	 * @ordered
	 */
	protected String articleType = ARTICLE_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getDtdVersion() <em>Dtd Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtdVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String DTD_VERSION_EDEFAULT = "1.2";

	/**
	 * The cached value of the '{@link #getDtdVersion() <em>Dtd Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtdVersion()
	 * @generated
	 * @ordered
	 */
	protected String dtdVersion = DTD_VERSION_EDEFAULT;

	/**
	 * This is true if the Dtd Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dtdVersionESet;

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
	protected static final Object LANG_EDEFAULT = NamespaceFactory.eINSTANCE.createFromString(NamespacePackage.eINSTANCE.getLangType(), "en");

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
	 * This is true if the Lang attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean langESet;

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
	protected ArticleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getArticleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontType getFront() {
		return front;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFront(FrontType newFront, NotificationChain msgs) {
		FrontType oldFront = front;
		front = newFront;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__FRONT, oldFront, newFront);
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
	public void setFront(FrontType newFront) {
		if (newFront != front) {
			NotificationChain msgs = null;
			if (front != null)
				msgs = ((InternalEObject)front).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_TYPE__FRONT, null, msgs);
			if (newFront != null)
				msgs = ((InternalEObject)newFront).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_TYPE__FRONT, null, msgs);
			msgs = basicSetFront(newFront, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__FRONT, newFront, newFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyType getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(BodyType newBody, NotificationChain msgs) {
		BodyType oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__BODY, oldBody, newBody);
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
	public void setBody(BodyType newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_TYPE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_TYPE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackType getBack() {
		return back;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBack(BackType newBack, NotificationChain msgs) {
		BackType oldBack = back;
		back = newBack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__BACK, oldBack, newBack);
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
	public void setBack(BackType newBack) {
		if (newBack != back) {
			NotificationChain msgs = null;
			if (back != null)
				msgs = ((InternalEObject)back).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_TYPE__BACK, null, msgs);
			if (newBack != null)
				msgs = ((InternalEObject)newBack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_TYPE__BACK, null, msgs);
			msgs = basicSetBack(newBack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__BACK, newBack, newBack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatsGroupType getFloatsGroup() {
		return floatsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatsGroup(FloatsGroupType newFloatsGroup, NotificationChain msgs) {
		FloatsGroupType oldFloatsGroup = floatsGroup;
		floatsGroup = newFloatsGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__FLOATS_GROUP, oldFloatsGroup, newFloatsGroup);
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
	public void setFloatsGroup(FloatsGroupType newFloatsGroup) {
		if (newFloatsGroup != floatsGroup) {
			NotificationChain msgs = null;
			if (floatsGroup != null)
				msgs = ((InternalEObject)floatsGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_TYPE__FLOATS_GROUP, null, msgs);
			if (newFloatsGroup != null)
				msgs = ((InternalEObject)newFloatsGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARTICLE_TYPE__FLOATS_GROUP, null, msgs);
			msgs = basicSetFloatsGroup(newFloatsGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__FLOATS_GROUP, newFloatsGroup, newFloatsGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubArticleType> getSubArticle() {
		if (subArticle == null) {
			subArticle = new EObjectContainmentEList<SubArticleType>(SubArticleType.class, this, Jats1Package.ARTICLE_TYPE__SUB_ARTICLE);
		}
		return subArticle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponseType> getResponse() {
		if (response == null) {
			response = new EObjectContainmentEList<ResponseType>(ResponseType.class, this, Jats1Package.ARTICLE_TYPE__RESPONSE);
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArticleType() {
		return articleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticleType(String newArticleType) {
		String oldArticleType = articleType;
		articleType = newArticleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__ARTICLE_TYPE, oldArticleType, articleType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDtdVersion() {
		return dtdVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDtdVersion(String newDtdVersion) {
		String oldDtdVersion = dtdVersion;
		dtdVersion = newDtdVersion;
		boolean oldDtdVersionESet = dtdVersionESet;
		dtdVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__DTD_VERSION, oldDtdVersion, dtdVersion, !oldDtdVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDtdVersion() {
		String oldDtdVersion = dtdVersion;
		boolean oldDtdVersionESet = dtdVersionESet;
		dtdVersion = DTD_VERSION_EDEFAULT;
		dtdVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.ARTICLE_TYPE__DTD_VERSION, oldDtdVersion, DTD_VERSION_EDEFAULT, oldDtdVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDtdVersion() {
		return dtdVersionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__ID, oldId, id));
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
		boolean oldLangESet = langESet;
		langESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__LANG, oldLang, lang, !oldLangESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLang() {
		Object oldLang = lang;
		boolean oldLangESet = langESet;
		lang = LANG_EDEFAULT;
		langESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.ARTICLE_TYPE__LANG, oldLang, LANG_EDEFAULT, oldLangESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLang() {
		return langESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ARTICLE_TYPE__FRONT:
				return basicSetFront(null, msgs);
			case Jats1Package.ARTICLE_TYPE__BODY:
				return basicSetBody(null, msgs);
			case Jats1Package.ARTICLE_TYPE__BACK:
				return basicSetBack(null, msgs);
			case Jats1Package.ARTICLE_TYPE__FLOATS_GROUP:
				return basicSetFloatsGroup(null, msgs);
			case Jats1Package.ARTICLE_TYPE__SUB_ARTICLE:
				return ((InternalEList<?>)getSubArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_TYPE__RESPONSE:
				return ((InternalEList<?>)getResponse()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.ARTICLE_TYPE__FRONT:
				return getFront();
			case Jats1Package.ARTICLE_TYPE__BODY:
				return getBody();
			case Jats1Package.ARTICLE_TYPE__BACK:
				return getBack();
			case Jats1Package.ARTICLE_TYPE__FLOATS_GROUP:
				return getFloatsGroup();
			case Jats1Package.ARTICLE_TYPE__SUB_ARTICLE:
				return getSubArticle();
			case Jats1Package.ARTICLE_TYPE__RESPONSE:
				return getResponse();
			case Jats1Package.ARTICLE_TYPE__ARTICLE_TYPE:
				return getArticleType();
			case Jats1Package.ARTICLE_TYPE__BASE:
				return getBase();
			case Jats1Package.ARTICLE_TYPE__DTD_VERSION:
				return getDtdVersion();
			case Jats1Package.ARTICLE_TYPE__ID:
				return getId();
			case Jats1Package.ARTICLE_TYPE__LANG:
				return getLang();
			case Jats1Package.ARTICLE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ARTICLE_TYPE__FRONT:
				setFront((FrontType)newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__BODY:
				setBody((BodyType)newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__BACK:
				setBack((BackType)newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__FLOATS_GROUP:
				setFloatsGroup((FloatsGroupType)newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__SUB_ARTICLE:
				getSubArticle().clear();
				getSubArticle().addAll((Collection<? extends SubArticleType>)newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__RESPONSE:
				getResponse().clear();
				getResponse().addAll((Collection<? extends ResponseType>)newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__ARTICLE_TYPE:
				setArticleType((String)newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__DTD_VERSION:
				setDtdVersion((String)newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.ARTICLE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ARTICLE_TYPE__FRONT:
				setFront((FrontType)null);
				return;
			case Jats1Package.ARTICLE_TYPE__BODY:
				setBody((BodyType)null);
				return;
			case Jats1Package.ARTICLE_TYPE__BACK:
				setBack((BackType)null);
				return;
			case Jats1Package.ARTICLE_TYPE__FLOATS_GROUP:
				setFloatsGroup((FloatsGroupType)null);
				return;
			case Jats1Package.ARTICLE_TYPE__SUB_ARTICLE:
				getSubArticle().clear();
				return;
			case Jats1Package.ARTICLE_TYPE__RESPONSE:
				getResponse().clear();
				return;
			case Jats1Package.ARTICLE_TYPE__ARTICLE_TYPE:
				setArticleType(ARTICLE_TYPE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_TYPE__DTD_VERSION:
				unsetDtdVersion();
				return;
			case Jats1Package.ARTICLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_TYPE__LANG:
				unsetLang();
				return;
			case Jats1Package.ARTICLE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ARTICLE_TYPE__FRONT:
				return front != null;
			case Jats1Package.ARTICLE_TYPE__BODY:
				return body != null;
			case Jats1Package.ARTICLE_TYPE__BACK:
				return back != null;
			case Jats1Package.ARTICLE_TYPE__FLOATS_GROUP:
				return floatsGroup != null;
			case Jats1Package.ARTICLE_TYPE__SUB_ARTICLE:
				return subArticle != null && !subArticle.isEmpty();
			case Jats1Package.ARTICLE_TYPE__RESPONSE:
				return response != null && !response.isEmpty();
			case Jats1Package.ARTICLE_TYPE__ARTICLE_TYPE:
				return ARTICLE_TYPE_EDEFAULT == null ? articleType != null : !ARTICLE_TYPE_EDEFAULT.equals(articleType);
			case Jats1Package.ARTICLE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ARTICLE_TYPE__DTD_VERSION:
				return isSetDtdVersion();
			case Jats1Package.ARTICLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.ARTICLE_TYPE__LANG:
				return isSetLang();
			case Jats1Package.ARTICLE_TYPE__SPECIFIC_USE:
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
		result.append(" (articleType: ");
		result.append(articleType);
		result.append(", base: ");
		result.append(base);
		result.append(", dtdVersion: ");
		if (dtdVersionESet) result.append(dtdVersion); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		if (langESet) result.append(lang); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //ArticleTypeImpl
