/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AltTextType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.AttribType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LongDescType;
import gov.nih.nlm.ncbi.jats1.MediaType;
import gov.nih.nlm.ncbi.jats1.OrientationType7;
import gov.nih.nlm.ncbi.jats1.PermissionsType;
import gov.nih.nlm.ncbi.jats1.TbodyType;
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
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getLongDesc <em>Long Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getJustBaseDisplayClass <em>Just Base Display Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getTbody <em>Tbody</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getDisplayBackMatterClass <em>Display Back Matter Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArrayTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeImpl extends MinimalEObjectImpl.Container implements ArrayType {
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
	 * The cached value of the '{@link #getJustBaseDisplayClass() <em>Just Base Display Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustBaseDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap justBaseDisplayClass;

	/**
	 * The cached value of the '{@link #getTbody() <em>Tbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbody()
	 * @generated
	 * @ordered
	 */
	protected TbodyType tbody;

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
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationType7 ORIENTATION_EDEFAULT = OrientationType7.PORTRAIT;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType7 orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

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
	protected ArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getArrayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.ARRAY_TYPE__GROUP);
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
		return getGroup().list(Jats1Package.eINSTANCE.getArrayType_AltText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LongDescType> getLongDesc() {
		return getGroup().list(Jats1Package.eINSTANCE.getArrayType_LongDesc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getGroup().list(Jats1Package.eINSTANCE.getArrayType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getGroup().list(Jats1Package.eINSTANCE.getArrayType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getGroup().list(Jats1Package.eINSTANCE.getArrayType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getJustBaseDisplayClass() {
		if (justBaseDisplayClass == null) {
			justBaseDisplayClass = new BasicFeatureMap(this, Jats1Package.ARRAY_TYPE__JUST_BASE_DISPLAY_CLASS);
		}
		return justBaseDisplayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getJustBaseDisplayClass().list(Jats1Package.eINSTANCE.getArrayType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getJustBaseDisplayClass().list(Jats1Package.eINSTANCE.getArrayType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getJustBaseDisplayClass().list(Jats1Package.eINSTANCE.getArrayType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TbodyType getTbody() {
		return tbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTbody(TbodyType newTbody, NotificationChain msgs) {
		TbodyType oldTbody = tbody;
		tbody = newTbody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ARRAY_TYPE__TBODY, oldTbody, newTbody);
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
	public void setTbody(TbodyType newTbody) {
		if (newTbody != tbody) {
			NotificationChain msgs = null;
			if (tbody != null)
				msgs = ((InternalEObject)tbody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARRAY_TYPE__TBODY, null, msgs);
			if (newTbody != null)
				msgs = ((InternalEObject)newTbody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ARRAY_TYPE__TBODY, null, msgs);
			msgs = basicSetTbody(newTbody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARRAY_TYPE__TBODY, newTbody, newTbody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDisplayBackMatterClass() {
		if (displayBackMatterClass == null) {
			displayBackMatterClass = new BasicFeatureMap(this, Jats1Package.ARRAY_TYPE__DISPLAY_BACK_MATTER_CLASS);
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
		return getDisplayBackMatterClass().list(Jats1Package.eINSTANCE.getArrayType_Attrib());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PermissionsType> getPermissions() {
		return getDisplayBackMatterClass().list(Jats1Package.eINSTANCE.getArrayType_Permissions());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARRAY_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARRAY_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARRAY_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARRAY_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType7 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(OrientationType7 newOrientation) {
		OrientationType7 oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARRAY_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrientation() {
		OrientationType7 oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.ARRAY_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARRAY_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ARRAY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__ALT_TEXT:
				return ((InternalEList<?>)getAltText()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__LONG_DESC:
				return ((InternalEList<?>)getLongDesc()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__JUST_BASE_DISPLAY_CLASS:
				return ((InternalEList<?>)getJustBaseDisplayClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__TBODY:
				return basicSetTbody(null, msgs);
			case Jats1Package.ARRAY_TYPE__DISPLAY_BACK_MATTER_CLASS:
				return ((InternalEList<?>)getDisplayBackMatterClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__ATTRIB:
				return ((InternalEList<?>)getAttrib()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARRAY_TYPE__PERMISSIONS:
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
			case Jats1Package.ARRAY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.ARRAY_TYPE__ALT_TEXT:
				return getAltText();
			case Jats1Package.ARRAY_TYPE__LONG_DESC:
				return getLongDesc();
			case Jats1Package.ARRAY_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.ARRAY_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.ARRAY_TYPE__URI:
				return getUri();
			case Jats1Package.ARRAY_TYPE__JUST_BASE_DISPLAY_CLASS:
				if (coreType) return getJustBaseDisplayClass();
				return ((FeatureMap.Internal)getJustBaseDisplayClass()).getWrapper();
			case Jats1Package.ARRAY_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.ARRAY_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.ARRAY_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.ARRAY_TYPE__TBODY:
				return getTbody();
			case Jats1Package.ARRAY_TYPE__DISPLAY_BACK_MATTER_CLASS:
				if (coreType) return getDisplayBackMatterClass();
				return ((FeatureMap.Internal)getDisplayBackMatterClass()).getWrapper();
			case Jats1Package.ARRAY_TYPE__ATTRIB:
				return getAttrib();
			case Jats1Package.ARRAY_TYPE__PERMISSIONS:
				return getPermissions();
			case Jats1Package.ARRAY_TYPE__BASE:
				return getBase();
			case Jats1Package.ARRAY_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.ARRAY_TYPE__ID:
				return getId();
			case Jats1Package.ARRAY_TYPE__LANG:
				return getLang();
			case Jats1Package.ARRAY_TYPE__ORIENTATION:
				return getOrientation();
			case Jats1Package.ARRAY_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ARRAY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.ARRAY_TYPE__ALT_TEXT:
				getAltText().clear();
				getAltText().addAll((Collection<? extends AltTextType>)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__LONG_DESC:
				getLongDesc().clear();
				getLongDesc().addAll((Collection<? extends LongDescType>)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__JUST_BASE_DISPLAY_CLASS:
				((FeatureMap.Internal)getJustBaseDisplayClass()).set(newValue);
				return;
			case Jats1Package.ARRAY_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__TBODY:
				setTbody((TbodyType)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__DISPLAY_BACK_MATTER_CLASS:
				((FeatureMap.Internal)getDisplayBackMatterClass()).set(newValue);
				return;
			case Jats1Package.ARRAY_TYPE__ATTRIB:
				getAttrib().clear();
				getAttrib().addAll((Collection<? extends AttribType>)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends PermissionsType>)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.ARRAY_TYPE__ORIENTATION:
				setOrientation((OrientationType7)newValue);
				return;
			case Jats1Package.ARRAY_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ARRAY_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.ARRAY_TYPE__ALT_TEXT:
				getAltText().clear();
				return;
			case Jats1Package.ARRAY_TYPE__LONG_DESC:
				getLongDesc().clear();
				return;
			case Jats1Package.ARRAY_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.ARRAY_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.ARRAY_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.ARRAY_TYPE__JUST_BASE_DISPLAY_CLASS:
				getJustBaseDisplayClass().clear();
				return;
			case Jats1Package.ARRAY_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.ARRAY_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.ARRAY_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.ARRAY_TYPE__TBODY:
				setTbody((TbodyType)null);
				return;
			case Jats1Package.ARRAY_TYPE__DISPLAY_BACK_MATTER_CLASS:
				getDisplayBackMatterClass().clear();
				return;
			case Jats1Package.ARRAY_TYPE__ATTRIB:
				getAttrib().clear();
				return;
			case Jats1Package.ARRAY_TYPE__PERMISSIONS:
				getPermissions().clear();
				return;
			case Jats1Package.ARRAY_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ARRAY_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.ARRAY_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.ARRAY_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.ARRAY_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case Jats1Package.ARRAY_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ARRAY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.ARRAY_TYPE__ALT_TEXT:
				return !getAltText().isEmpty();
			case Jats1Package.ARRAY_TYPE__LONG_DESC:
				return !getLongDesc().isEmpty();
			case Jats1Package.ARRAY_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.ARRAY_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.ARRAY_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.ARRAY_TYPE__JUST_BASE_DISPLAY_CLASS:
				return justBaseDisplayClass != null && !justBaseDisplayClass.isEmpty();
			case Jats1Package.ARRAY_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.ARRAY_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.ARRAY_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.ARRAY_TYPE__TBODY:
				return tbody != null;
			case Jats1Package.ARRAY_TYPE__DISPLAY_BACK_MATTER_CLASS:
				return displayBackMatterClass != null && !displayBackMatterClass.isEmpty();
			case Jats1Package.ARRAY_TYPE__ATTRIB:
				return !getAttrib().isEmpty();
			case Jats1Package.ARRAY_TYPE__PERMISSIONS:
				return !getPermissions().isEmpty();
			case Jats1Package.ARRAY_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ARRAY_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.ARRAY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.ARRAY_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.ARRAY_TYPE__ORIENTATION:
				return isSetOrientation();
			case Jats1Package.ARRAY_TYPE__SPECIFIC_USE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", justBaseDisplayClass: ");
		result.append(justBaseDisplayClass);
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
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //ArrayTypeImpl
