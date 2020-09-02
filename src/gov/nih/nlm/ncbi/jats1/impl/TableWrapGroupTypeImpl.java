/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbstractType;
import gov.nih.nlm.ncbi.jats1.AltTextType;
import gov.nih.nlm.ncbi.jats1.CaptionType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.KwdGroupType;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.LongDescType;
import gov.nih.nlm.ncbi.jats1.OrientationType6;
import gov.nih.nlm.ncbi.jats1.PositionType2;
import gov.nih.nlm.ncbi.jats1.TableWrapGroupType;
import gov.nih.nlm.ncbi.jats1.TableWrapType;
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
 * An implementation of the model object '<em><b>Table Wrap Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getAbstractClass <em>Abstract Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getKwdGroupClass <em>Kwd Group Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getKwdGroup <em>Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getLongDesc <em>Long Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getJustTableClass <em>Just Table Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapGroupTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableWrapGroupTypeImpl extends MinimalEObjectImpl.Container implements TableWrapGroupType {
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
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected CaptionType caption;

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
	 * The cached value of the '{@link #getKwdGroupClass() <em>Kwd Group Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKwdGroupClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap kwdGroupClass;

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
	 * The cached value of the '{@link #getJustTableClass() <em>Just Table Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustTableClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap justTableClass;

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
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationType6 ORIENTATION_EDEFAULT = OrientationType6.PORTRAIT;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType6 orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final PositionType2 POSITION_EDEFAULT = PositionType2.FLOAT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionType2 position = POSITION_EDEFAULT;

	/**
	 * This is true if the Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionESet;

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
	protected TableWrapGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getTableWrapGroupType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_WRAP_GROUP_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_WRAP_GROUP_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaptionType getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(CaptionType newCaption, NotificationChain msgs) {
		CaptionType oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__CAPTION, oldCaption, newCaption);
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
	public void setCaption(CaptionType newCaption) {
		if (newCaption != caption) {
			NotificationChain msgs = null;
			if (caption != null)
				msgs = ((InternalEObject)caption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_WRAP_GROUP_TYPE__CAPTION, null, msgs);
			if (newCaption != null)
				msgs = ((InternalEObject)newCaption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_WRAP_GROUP_TYPE__CAPTION, null, msgs);
			msgs = basicSetCaption(newCaption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__CAPTION, newCaption, newCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractClass() {
		if (abstractClass == null) {
			abstractClass = new BasicFeatureMap(this, Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT_CLASS);
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
		return getAbstractClass().list(Jats1Package.eINSTANCE.getTableWrapGroupType_Abstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getKwdGroupClass() {
		if (kwdGroupClass == null) {
			kwdGroupClass = new BasicFeatureMap(this, Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP_CLASS);
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
		return getKwdGroupClass().list(Jats1Package.eINSTANCE.getTableWrapGroupType_KwdGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.TABLE_WRAP_GROUP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltTextType> getAltText() {
		return getGroup().list(Jats1Package.eINSTANCE.getTableWrapGroupType_AltText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LongDescType> getLongDesc() {
		return getGroup().list(Jats1Package.eINSTANCE.getTableWrapGroupType_LongDesc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getGroup().list(Jats1Package.eINSTANCE.getTableWrapGroupType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getGroup().list(Jats1Package.eINSTANCE.getTableWrapGroupType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getGroup().list(Jats1Package.eINSTANCE.getTableWrapGroupType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getJustTableClass() {
		if (justTableClass == null) {
			justTableClass = new BasicFeatureMap(this, Jats1Package.TABLE_WRAP_GROUP_TYPE__JUST_TABLE_CLASS);
		}
		return justTableClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapType> getTableWrap() {
		return getJustTableClass().list(Jats1Package.eINSTANCE.getTableWrapGroupType_TableWrap());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType6 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(OrientationType6 newOrientation) {
		OrientationType6 oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrientation() {
		OrientationType6 oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TABLE_WRAP_GROUP_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionType2 getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(PositionType2 newPosition) {
		PositionType2 oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		boolean oldPositionESet = positionESet;
		positionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__POSITION, oldPosition, position, !oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPosition() {
		PositionType2 oldPosition = position;
		boolean oldPositionESet = positionESet;
		position = POSITION_EDEFAULT;
		positionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TABLE_WRAP_GROUP_TYPE__POSITION, oldPosition, POSITION_EDEFAULT, oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPosition() {
		return positionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_GROUP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__CAPTION:
				return basicSetCaption(null, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT_CLASS:
				return ((InternalEList<?>)getAbstractClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP_CLASS:
				return ((InternalEList<?>)getKwdGroupClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP:
				return ((InternalEList<?>)getKwdGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ALT_TEXT:
				return ((InternalEList<?>)getAltText()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LONG_DESC:
				return ((InternalEList<?>)getLongDesc()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__JUST_TABLE_CLASS:
				return ((InternalEList<?>)getJustTableClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__TABLE_WRAP:
				return ((InternalEList<?>)getTableWrap()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LABEL:
				return getLabel();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__CAPTION:
				return getCaption();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT_CLASS:
				if (coreType) return getAbstractClass();
				return ((FeatureMap.Internal)getAbstractClass()).getWrapper();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT:
				return getAbstract();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP_CLASS:
				if (coreType) return getKwdGroupClass();
				return ((FeatureMap.Internal)getKwdGroupClass()).getWrapper();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP:
				return getKwdGroup();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ALT_TEXT:
				return getAltText();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LONG_DESC:
				return getLongDesc();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__URI:
				return getUri();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__JUST_TABLE_CLASS:
				if (coreType) return getJustTableClass();
				return ((FeatureMap.Internal)getJustTableClass()).getWrapper();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ID:
				return getId();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LANG:
				return getLang();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ORIENTATION:
				return getOrientation();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__POSITION:
				return getPosition();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT_CLASS:
				((FeatureMap.Internal)getAbstractClass()).set(newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP_CLASS:
				((FeatureMap.Internal)getKwdGroupClass()).set(newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP:
				getKwdGroup().clear();
				getKwdGroup().addAll((Collection<? extends KwdGroupType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ALT_TEXT:
				getAltText().clear();
				getAltText().addAll((Collection<? extends AltTextType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LONG_DESC:
				getLongDesc().clear();
				getLongDesc().addAll((Collection<? extends LongDescType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__JUST_TABLE_CLASS:
				((FeatureMap.Internal)getJustTableClass()).set(newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				getTableWrap().addAll((Collection<? extends TableWrapType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ORIENTATION:
				setOrientation((OrientationType6)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__POSITION:
				setPosition((PositionType2)newValue);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__CAPTION:
				setCaption((CaptionType)null);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT_CLASS:
				getAbstractClass().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP_CLASS:
				getKwdGroupClass().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP:
				getKwdGroup().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ALT_TEXT:
				getAltText().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LONG_DESC:
				getLongDesc().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__JUST_TABLE_CLASS:
				getJustTableClass().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__POSITION:
				unsetPosition();
				return;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LABEL:
				return label != null;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__CAPTION:
				return caption != null;
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT_CLASS:
				return abstractClass != null && !abstractClass.isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ABSTRACT:
				return !getAbstract().isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP_CLASS:
				return kwdGroupClass != null && !kwdGroupClass.isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__KWD_GROUP:
				return !getKwdGroup().isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ALT_TEXT:
				return !getAltText().isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LONG_DESC:
				return !getLongDesc().isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__JUST_TABLE_CLASS:
				return justTableClass != null && !justTableClass.isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__TABLE_WRAP:
				return !getTableWrap().isEmpty();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__ORIENTATION:
				return isSetOrientation();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__POSITION:
				return isSetPosition();
			case Jats1Package.TABLE_WRAP_GROUP_TYPE__SPECIFIC_USE:
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
		result.append(" (abstractClass: ");
		result.append(abstractClass);
		result.append(", kwdGroupClass: ");
		result.append(kwdGroupClass);
		result.append(", group: ");
		result.append(group);
		result.append(", justTableClass: ");
		result.append(justTableClass);
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", position: ");
		if (positionESet) result.append(position); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //TableWrapGroupTypeImpl
