/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.DefHeadType;
import gov.nih.nlm.ncbi.jats1.DefItemType;
import gov.nih.nlm.ncbi.jats1.DefListType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.TermHeadType;
import gov.nih.nlm.ncbi.jats1.TitleType;

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
 * An implementation of the model object '<em><b>Def List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getTermHead <em>Term Head</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getDefHead <em>Def Head</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getDefItemClass <em>Def Item Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getDefItem <em>Def Item</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getDefListClass <em>Def List Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getContinuedFrom <em>Continued From</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getListContent <em>List Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getListType <em>List Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getPrefixWord <em>Prefix Word</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DefListTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefListTypeImpl extends MinimalEObjectImpl.Container implements DefListType {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected LabelType label;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getTermHead() <em>Term Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermHead()
	 * @generated
	 * @ordered
	 */
	protected TermHeadType termHead;

	/**
	 * The cached value of the '{@link #getDefHead() <em>Def Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefHead()
	 * @generated
	 * @ordered
	 */
	protected DefHeadType defHead;

	/**
	 * The cached value of the '{@link #getDefItemClass() <em>Def Item Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefItemClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap defItemClass;

	/**
	 * The cached value of the '{@link #getDefListClass() <em>Def List Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefListClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap defListClass;

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
	 * The default value of the '{@link #getContinuedFrom() <em>Continued From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuedFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTINUED_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContinuedFrom() <em>Continued From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuedFrom()
	 * @generated
	 * @ordered
	 */
	protected String continuedFrom = CONTINUED_FROM_EDEFAULT;

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
	 * The default value of the '{@link #getListContent() <em>List Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListContent()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListContent() <em>List Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListContent()
	 * @generated
	 * @ordered
	 */
	protected String listContent = LIST_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getListType() <em>List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListType()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListType() <em>List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListType()
	 * @generated
	 * @ordered
	 */
	protected String listType = LIST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefixWord() <em>Prefix Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixWord()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_WORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefixWord() <em>Prefix Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixWord()
	 * @generated
	 * @ordered
	 */
	protected String prefixWord = PREFIX_WORD_EDEFAULT;

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
	protected DefListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getDefListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType newLabel, NotificationChain msgs) {
		LabelType oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__LABEL, oldLabel, newLabel);
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
	public void setLabel(LabelType newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DEF_LIST_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DEF_LIST_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__TITLE, oldTitle, newTitle);
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
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DEF_LIST_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DEF_LIST_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermHeadType getTermHead() {
		return termHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermHead(TermHeadType newTermHead, NotificationChain msgs) {
		TermHeadType oldTermHead = termHead;
		termHead = newTermHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__TERM_HEAD, oldTermHead, newTermHead);
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
	public void setTermHead(TermHeadType newTermHead) {
		if (newTermHead != termHead) {
			NotificationChain msgs = null;
			if (termHead != null)
				msgs = ((InternalEObject)termHead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DEF_LIST_TYPE__TERM_HEAD, null, msgs);
			if (newTermHead != null)
				msgs = ((InternalEObject)newTermHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DEF_LIST_TYPE__TERM_HEAD, null, msgs);
			msgs = basicSetTermHead(newTermHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__TERM_HEAD, newTermHead, newTermHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefHeadType getDefHead() {
		return defHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefHead(DefHeadType newDefHead, NotificationChain msgs) {
		DefHeadType oldDefHead = defHead;
		defHead = newDefHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__DEF_HEAD, oldDefHead, newDefHead);
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
	public void setDefHead(DefHeadType newDefHead) {
		if (newDefHead != defHead) {
			NotificationChain msgs = null;
			if (defHead != null)
				msgs = ((InternalEObject)defHead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DEF_LIST_TYPE__DEF_HEAD, null, msgs);
			if (newDefHead != null)
				msgs = ((InternalEObject)newDefHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DEF_LIST_TYPE__DEF_HEAD, null, msgs);
			msgs = basicSetDefHead(newDefHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__DEF_HEAD, newDefHead, newDefHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDefItemClass() {
		if (defItemClass == null) {
			defItemClass = new BasicFeatureMap(this, Jats1Package.DEF_LIST_TYPE__DEF_ITEM_CLASS);
		}
		return defItemClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefItemType> getDefItem() {
		return getDefItemClass().list(Jats1Package.eINSTANCE.getDefListType_DefItem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDefListClass() {
		if (defListClass == null) {
			defListClass = new BasicFeatureMap(this, Jats1Package.DEF_LIST_TYPE__DEF_LIST_CLASS);
		}
		return defListClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getDefListClass().list(Jats1Package.eINSTANCE.getDefListType_DefList());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContinuedFrom() {
		return continuedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinuedFrom(String newContinuedFrom) {
		String oldContinuedFrom = continuedFrom;
		continuedFrom = newContinuedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__CONTINUED_FROM, oldContinuedFrom, continuedFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListContent() {
		return listContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListContent(String newListContent) {
		String oldListContent = listContent;
		listContent = newListContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__LIST_CONTENT, oldListContent, listContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListType() {
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListType(String newListType) {
		String oldListType = listType;
		listType = newListType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__LIST_TYPE, oldListType, listType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefixWord() {
		return prefixWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefixWord(String newPrefixWord) {
		String oldPrefixWord = prefixWord;
		prefixWord = newPrefixWord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__PREFIX_WORD, oldPrefixWord, prefixWord));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DEF_LIST_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.DEF_LIST_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.DEF_LIST_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case Jats1Package.DEF_LIST_TYPE__TERM_HEAD:
				return basicSetTermHead(null, msgs);
			case Jats1Package.DEF_LIST_TYPE__DEF_HEAD:
				return basicSetDefHead(null, msgs);
			case Jats1Package.DEF_LIST_TYPE__DEF_ITEM_CLASS:
				return ((InternalEList<?>)getDefItemClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.DEF_LIST_TYPE__DEF_ITEM:
				return ((InternalEList<?>)getDefItem()).basicRemove(otherEnd, msgs);
			case Jats1Package.DEF_LIST_TYPE__DEF_LIST_CLASS:
				return ((InternalEList<?>)getDefListClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.DEF_LIST_TYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.DEF_LIST_TYPE__LABEL:
				return getLabel();
			case Jats1Package.DEF_LIST_TYPE__TITLE:
				return getTitle();
			case Jats1Package.DEF_LIST_TYPE__TERM_HEAD:
				return getTermHead();
			case Jats1Package.DEF_LIST_TYPE__DEF_HEAD:
				return getDefHead();
			case Jats1Package.DEF_LIST_TYPE__DEF_ITEM_CLASS:
				if (coreType) return getDefItemClass();
				return ((FeatureMap.Internal)getDefItemClass()).getWrapper();
			case Jats1Package.DEF_LIST_TYPE__DEF_ITEM:
				return getDefItem();
			case Jats1Package.DEF_LIST_TYPE__DEF_LIST_CLASS:
				if (coreType) return getDefListClass();
				return ((FeatureMap.Internal)getDefListClass()).getWrapper();
			case Jats1Package.DEF_LIST_TYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.DEF_LIST_TYPE__BASE:
				return getBase();
			case Jats1Package.DEF_LIST_TYPE__CONTINUED_FROM:
				return getContinuedFrom();
			case Jats1Package.DEF_LIST_TYPE__ID:
				return getId();
			case Jats1Package.DEF_LIST_TYPE__LANG:
				return getLang();
			case Jats1Package.DEF_LIST_TYPE__LIST_CONTENT:
				return getListContent();
			case Jats1Package.DEF_LIST_TYPE__LIST_TYPE:
				return getListType();
			case Jats1Package.DEF_LIST_TYPE__PREFIX_WORD:
				return getPrefixWord();
			case Jats1Package.DEF_LIST_TYPE__SPECIFIC_USE:
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
			case Jats1Package.DEF_LIST_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__TERM_HEAD:
				setTermHead((TermHeadType)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__DEF_HEAD:
				setDefHead((DefHeadType)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__DEF_ITEM_CLASS:
				((FeatureMap.Internal)getDefItemClass()).set(newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__DEF_ITEM:
				getDefItem().clear();
				getDefItem().addAll((Collection<? extends DefItemType>)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__DEF_LIST_CLASS:
				((FeatureMap.Internal)getDefListClass()).set(newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__CONTINUED_FROM:
				setContinuedFrom((String)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__LIST_CONTENT:
				setListContent((String)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__LIST_TYPE:
				setListType((String)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__PREFIX_WORD:
				setPrefixWord((String)newValue);
				return;
			case Jats1Package.DEF_LIST_TYPE__SPECIFIC_USE:
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
			case Jats1Package.DEF_LIST_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.DEF_LIST_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case Jats1Package.DEF_LIST_TYPE__TERM_HEAD:
				setTermHead((TermHeadType)null);
				return;
			case Jats1Package.DEF_LIST_TYPE__DEF_HEAD:
				setDefHead((DefHeadType)null);
				return;
			case Jats1Package.DEF_LIST_TYPE__DEF_ITEM_CLASS:
				getDefItemClass().clear();
				return;
			case Jats1Package.DEF_LIST_TYPE__DEF_ITEM:
				getDefItem().clear();
				return;
			case Jats1Package.DEF_LIST_TYPE__DEF_LIST_CLASS:
				getDefListClass().clear();
				return;
			case Jats1Package.DEF_LIST_TYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.DEF_LIST_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.DEF_LIST_TYPE__CONTINUED_FROM:
				setContinuedFrom(CONTINUED_FROM_EDEFAULT);
				return;
			case Jats1Package.DEF_LIST_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.DEF_LIST_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.DEF_LIST_TYPE__LIST_CONTENT:
				setListContent(LIST_CONTENT_EDEFAULT);
				return;
			case Jats1Package.DEF_LIST_TYPE__LIST_TYPE:
				setListType(LIST_TYPE_EDEFAULT);
				return;
			case Jats1Package.DEF_LIST_TYPE__PREFIX_WORD:
				setPrefixWord(PREFIX_WORD_EDEFAULT);
				return;
			case Jats1Package.DEF_LIST_TYPE__SPECIFIC_USE:
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
			case Jats1Package.DEF_LIST_TYPE__LABEL:
				return label != null;
			case Jats1Package.DEF_LIST_TYPE__TITLE:
				return title != null;
			case Jats1Package.DEF_LIST_TYPE__TERM_HEAD:
				return termHead != null;
			case Jats1Package.DEF_LIST_TYPE__DEF_HEAD:
				return defHead != null;
			case Jats1Package.DEF_LIST_TYPE__DEF_ITEM_CLASS:
				return defItemClass != null && !defItemClass.isEmpty();
			case Jats1Package.DEF_LIST_TYPE__DEF_ITEM:
				return !getDefItem().isEmpty();
			case Jats1Package.DEF_LIST_TYPE__DEF_LIST_CLASS:
				return defListClass != null && !defListClass.isEmpty();
			case Jats1Package.DEF_LIST_TYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.DEF_LIST_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.DEF_LIST_TYPE__CONTINUED_FROM:
				return CONTINUED_FROM_EDEFAULT == null ? continuedFrom != null : !CONTINUED_FROM_EDEFAULT.equals(continuedFrom);
			case Jats1Package.DEF_LIST_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.DEF_LIST_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.DEF_LIST_TYPE__LIST_CONTENT:
				return LIST_CONTENT_EDEFAULT == null ? listContent != null : !LIST_CONTENT_EDEFAULT.equals(listContent);
			case Jats1Package.DEF_LIST_TYPE__LIST_TYPE:
				return LIST_TYPE_EDEFAULT == null ? listType != null : !LIST_TYPE_EDEFAULT.equals(listType);
			case Jats1Package.DEF_LIST_TYPE__PREFIX_WORD:
				return PREFIX_WORD_EDEFAULT == null ? prefixWord != null : !PREFIX_WORD_EDEFAULT.equals(prefixWord);
			case Jats1Package.DEF_LIST_TYPE__SPECIFIC_USE:
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
		result.append(" (defItemClass: ");
		result.append(defItemClass);
		result.append(", defListClass: ");
		result.append(defListClass);
		result.append(", base: ");
		result.append(base);
		result.append(", continuedFrom: ");
		result.append(continuedFrom);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", listContent: ");
		result.append(listContent);
		result.append(", listType: ");
		result.append(listType);
		result.append(", prefixWord: ");
		result.append(prefixWord);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //DefListTypeImpl
