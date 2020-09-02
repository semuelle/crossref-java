/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.ResourceNameType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;

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

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getResourceNameElements <em>Resource Name Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResourceNameTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceNameTypeImpl extends MinimalEObjectImpl.Container implements ResourceNameType {
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
	protected ResourceNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getResourceNameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.RESOURCE_NAME_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getResourceNameElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getResourceNameType_ResourceNameElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getResourceNameElements().list(Jats1Package.eINSTANCE.getResourceNameType_Sup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.RESOURCE_NAME_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.RESOURCE_NAME_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESOURCE_NAME_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.RESOURCE_NAME_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case Jats1Package.RESOURCE_NAME_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__RESOURCE_NAME_ELEMENTS:
				return ((InternalEList<?>)getResourceNameElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.RESOURCE_NAME_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.RESOURCE_NAME_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.RESOURCE_NAME_TYPE__RESOURCE_NAME_ELEMENTS:
				if (coreType) return getResourceNameElements();
				return ((FeatureMap.Internal)getResourceNameElements()).getWrapper();
			case Jats1Package.RESOURCE_NAME_TYPE__BOLD:
				return getBold();
			case Jats1Package.RESOURCE_NAME_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.RESOURCE_NAME_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.RESOURCE_NAME_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.RESOURCE_NAME_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.RESOURCE_NAME_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.RESOURCE_NAME_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.RESOURCE_NAME_TYPE__SC:
				return getSc();
			case Jats1Package.RESOURCE_NAME_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.RESOURCE_NAME_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.RESOURCE_NAME_TYPE__SUB:
				return getSub();
			case Jats1Package.RESOURCE_NAME_TYPE__SUP:
				return getSup();
			case Jats1Package.RESOURCE_NAME_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.RESOURCE_NAME_TYPE__BASE:
				return getBase();
			case Jats1Package.RESOURCE_NAME_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.RESOURCE_NAME_TYPE__HREF:
				return getHref();
			case Jats1Package.RESOURCE_NAME_TYPE__ID:
				return getId();
			case Jats1Package.RESOURCE_NAME_TYPE__LANG:
				return getLang();
			case Jats1Package.RESOURCE_NAME_TYPE__ROLE:
				return getRole();
			case Jats1Package.RESOURCE_NAME_TYPE__SHOW:
				return getShow();
			case Jats1Package.RESOURCE_NAME_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.RESOURCE_NAME_TYPE__TITLE:
				return getTitle();
			case Jats1Package.RESOURCE_NAME_TYPE__TYPE:
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
			case Jats1Package.RESOURCE_NAME_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__RESOURCE_NAME_ELEMENTS:
				((FeatureMap.Internal)getResourceNameElements()).set(newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__TYPE:
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
			case Jats1Package.RESOURCE_NAME_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__RESOURCE_NAME_ELEMENTS:
				getResourceNameElements().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Jats1Package.RESOURCE_NAME_TYPE__TYPE:
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
			case Jats1Package.RESOURCE_NAME_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__RESOURCE_NAME_ELEMENTS:
				return !getResourceNameElements().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.RESOURCE_NAME_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.RESOURCE_NAME_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.RESOURCE_NAME_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.RESOURCE_NAME_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.RESOURCE_NAME_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.RESOURCE_NAME_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.RESOURCE_NAME_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Jats1Package.RESOURCE_NAME_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.RESOURCE_NAME_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.RESOURCE_NAME_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Jats1Package.RESOURCE_NAME_TYPE__TYPE:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
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

} //ResourceNameTypeImpl
