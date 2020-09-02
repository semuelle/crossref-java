/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AttribType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.PermissionsType;
import gov.nih.nlm.ncbi.jats1.SubtitleType;
import gov.nih.nlm.ncbi.jats1.TitleType;
import gov.nih.nlm.ncbi.jats1.VerseGroupType;
import gov.nih.nlm.ncbi.jats1.VerseLineType;

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
 * An implementation of the model object '<em><b>Verse Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getVerseLine <em>Verse Line</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getDisplayBackMatterClass <em>Display Back Matter Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getStyleDetail <em>Style Detail</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseGroupTypeImpl#getStyleType <em>Style Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerseGroupTypeImpl extends MinimalEObjectImpl.Container implements VerseGroupType {
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
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected SubtitleType subtitle;

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
	 * The cached value of the '{@link #getDisplayBackMatterClass() <em>Display Back Matter Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayBackMatterClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap displayBackMatterClass;

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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleDetail() <em>Style Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleDetail() <em>Style Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleDetail()
	 * @generated
	 * @ordered
	 */
	protected String styleDetail = STYLE_DETAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleType() <em>Style Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleType()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleType() <em>Style Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleType()
	 * @generated
	 * @ordered
	 */
	protected String styleType = STYLE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerseGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getVerseGroupType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.VERSE_GROUP_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.VERSE_GROUP_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__LABEL, newLabel, newLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.VERSE_GROUP_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.VERSE_GROUP_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubtitleType getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(SubtitleType newSubtitle, NotificationChain msgs) {
		SubtitleType oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__SUBTITLE, oldSubtitle, newSubtitle);
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
	public void setSubtitle(SubtitleType newSubtitle) {
		if (newSubtitle != subtitle) {
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.VERSE_GROUP_TYPE__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.VERSE_GROUP_TYPE__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.VERSE_GROUP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseLineType> getVerseLine() {
		return getGroup().list(Jats1Package.eINSTANCE.getVerseGroupType_VerseLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseGroupType> getVerseGroup() {
		return getGroup().list(Jats1Package.eINSTANCE.getVerseGroupType_VerseGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDisplayBackMatterClass() {
		if (displayBackMatterClass == null) {
			displayBackMatterClass = new BasicFeatureMap(this, Jats1Package.VERSE_GROUP_TYPE__DISPLAY_BACK_MATTER_CLASS);
		}
		return displayBackMatterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttribType> getAttrib() {
		return getDisplayBackMatterClass().list(Jats1Package.eINSTANCE.getVerseGroupType_Attrib());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PermissionsType> getPermissions() {
		return getDisplayBackMatterClass().list(Jats1Package.eINSTANCE.getVerseGroupType_Permissions());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleDetail() {
		return styleDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleDetail(String newStyleDetail) {
		String oldStyleDetail = styleDetail;
		styleDetail = newStyleDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__STYLE_DETAIL, oldStyleDetail, styleDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleType() {
		return styleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleType(String newStyleType) {
		String oldStyleType = styleType;
		styleType = newStyleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_GROUP_TYPE__STYLE_TYPE, oldStyleType, styleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.VERSE_GROUP_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.VERSE_GROUP_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case Jats1Package.VERSE_GROUP_TYPE__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case Jats1Package.VERSE_GROUP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_GROUP_TYPE__VERSE_LINE:
				return ((InternalEList<?>)getVerseLine()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_GROUP_TYPE__VERSE_GROUP:
				return ((InternalEList<?>)getVerseGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_GROUP_TYPE__DISPLAY_BACK_MATTER_CLASS:
				return ((InternalEList<?>)getDisplayBackMatterClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_GROUP_TYPE__ATTRIB:
				return ((InternalEList<?>)getAttrib()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_GROUP_TYPE__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.VERSE_GROUP_TYPE__LABEL:
				return getLabel();
			case Jats1Package.VERSE_GROUP_TYPE__TITLE:
				return getTitle();
			case Jats1Package.VERSE_GROUP_TYPE__SUBTITLE:
				return getSubtitle();
			case Jats1Package.VERSE_GROUP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.VERSE_GROUP_TYPE__VERSE_LINE:
				return getVerseLine();
			case Jats1Package.VERSE_GROUP_TYPE__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.VERSE_GROUP_TYPE__DISPLAY_BACK_MATTER_CLASS:
				if (coreType) return getDisplayBackMatterClass();
				return ((FeatureMap.Internal)getDisplayBackMatterClass()).getWrapper();
			case Jats1Package.VERSE_GROUP_TYPE__ATTRIB:
				return getAttrib();
			case Jats1Package.VERSE_GROUP_TYPE__PERMISSIONS:
				return getPermissions();
			case Jats1Package.VERSE_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.VERSE_GROUP_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.VERSE_GROUP_TYPE__ID:
				return getId();
			case Jats1Package.VERSE_GROUP_TYPE__LANG:
				return getLang();
			case Jats1Package.VERSE_GROUP_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.VERSE_GROUP_TYPE__STYLE:
				return getStyle();
			case Jats1Package.VERSE_GROUP_TYPE__STYLE_DETAIL:
				return getStyleDetail();
			case Jats1Package.VERSE_GROUP_TYPE__STYLE_TYPE:
				return getStyleType();
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
			case Jats1Package.VERSE_GROUP_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__SUBTITLE:
				setSubtitle((SubtitleType)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__VERSE_LINE:
				getVerseLine().clear();
				getVerseLine().addAll((Collection<? extends VerseLineType>)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				getVerseGroup().addAll((Collection<? extends VerseGroupType>)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__DISPLAY_BACK_MATTER_CLASS:
				((FeatureMap.Internal)getDisplayBackMatterClass()).set(newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__ATTRIB:
				getAttrib().clear();
				getAttrib().addAll((Collection<? extends AttribType>)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends PermissionsType>)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__STYLE_DETAIL:
				setStyleDetail((String)newValue);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__STYLE_TYPE:
				setStyleType((String)newValue);
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
			case Jats1Package.VERSE_GROUP_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__SUBTITLE:
				setSubtitle((SubtitleType)null);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.VERSE_GROUP_TYPE__VERSE_LINE:
				getVerseLine().clear();
				return;
			case Jats1Package.VERSE_GROUP_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				return;
			case Jats1Package.VERSE_GROUP_TYPE__DISPLAY_BACK_MATTER_CLASS:
				getDisplayBackMatterClass().clear();
				return;
			case Jats1Package.VERSE_GROUP_TYPE__ATTRIB:
				getAttrib().clear();
				return;
			case Jats1Package.VERSE_GROUP_TYPE__PERMISSIONS:
				getPermissions().clear();
				return;
			case Jats1Package.VERSE_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__STYLE_DETAIL:
				setStyleDetail(STYLE_DETAIL_EDEFAULT);
				return;
			case Jats1Package.VERSE_GROUP_TYPE__STYLE_TYPE:
				setStyleType(STYLE_TYPE_EDEFAULT);
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
			case Jats1Package.VERSE_GROUP_TYPE__LABEL:
				return label != null;
			case Jats1Package.VERSE_GROUP_TYPE__TITLE:
				return title != null;
			case Jats1Package.VERSE_GROUP_TYPE__SUBTITLE:
				return subtitle != null;
			case Jats1Package.VERSE_GROUP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.VERSE_GROUP_TYPE__VERSE_LINE:
				return !getVerseLine().isEmpty();
			case Jats1Package.VERSE_GROUP_TYPE__VERSE_GROUP:
				return !getVerseGroup().isEmpty();
			case Jats1Package.VERSE_GROUP_TYPE__DISPLAY_BACK_MATTER_CLASS:
				return displayBackMatterClass != null && !displayBackMatterClass.isEmpty();
			case Jats1Package.VERSE_GROUP_TYPE__ATTRIB:
				return !getAttrib().isEmpty();
			case Jats1Package.VERSE_GROUP_TYPE__PERMISSIONS:
				return !getPermissions().isEmpty();
			case Jats1Package.VERSE_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.VERSE_GROUP_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.VERSE_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.VERSE_GROUP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.VERSE_GROUP_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.VERSE_GROUP_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case Jats1Package.VERSE_GROUP_TYPE__STYLE_DETAIL:
				return STYLE_DETAIL_EDEFAULT == null ? styleDetail != null : !STYLE_DETAIL_EDEFAULT.equals(styleDetail);
			case Jats1Package.VERSE_GROUP_TYPE__STYLE_TYPE:
				return STYLE_TYPE_EDEFAULT == null ? styleType != null : !STYLE_TYPE_EDEFAULT.equals(styleType);
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
		result.append(", displayBackMatterClass: ");
		result.append(displayBackMatterClass);
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", style: ");
		result.append(style);
		result.append(", styleDetail: ");
		result.append(styleDetail);
		result.append(", styleType: ");
		result.append(styleType);
		result.append(')');
		return result.toString();
	}

} //VerseGroupTypeImpl
