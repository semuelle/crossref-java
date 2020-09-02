/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ConfAcronymType;
import gov.nih.nlm.ncbi.jats1.ConfDateType;
import gov.nih.nlm.ncbi.jats1.ConfLocType;
import gov.nih.nlm.ncbi.jats1.ConfNameType;
import gov.nih.nlm.ncbi.jats1.ConfNumType;
import gov.nih.nlm.ncbi.jats1.ConfSponsorType;
import gov.nih.nlm.ncbi.jats1.ConfThemeType;
import gov.nih.nlm.ncbi.jats1.ConferenceType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;

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
 * An implementation of the model object '<em><b>Conference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getConfDate <em>Conf Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getConfName <em>Conf Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getConfAcronym <em>Conf Acronym</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getConfNum <em>Conf Num</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getConfLoc <em>Conf Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getConfSponsor <em>Conf Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getConfTheme <em>Conf Theme</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ConferenceTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConferenceTypeImpl extends MinimalEObjectImpl.Container implements ConferenceType {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getConfNum() <em>Conf Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfNum()
	 * @generated
	 * @ordered
	 */
	protected ConfNumType confNum;

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
	 * The cached value of the '{@link #getConfSponsor() <em>Conf Sponsor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfSponsor()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfSponsorType> confSponsor;

	/**
	 * The cached value of the '{@link #getConfTheme() <em>Conf Theme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfTheme()
	 * @generated
	 * @ordered
	 */
	protected ConfThemeType confTheme;

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
	protected ConferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getConferenceType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__CONF_DATE, oldConfDate, newConfDate);
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
				msgs = ((InternalEObject)confDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CONFERENCE_TYPE__CONF_DATE, null, msgs);
			if (newConfDate != null)
				msgs = ((InternalEObject)newConfDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CONFERENCE_TYPE__CONF_DATE, null, msgs);
			msgs = basicSetConfDate(newConfDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__CONF_DATE, newConfDate, newConfDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.CONFERENCE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfNameType> getConfName() {
		return getGroup().list(Jats1Package.eINSTANCE.getConferenceType_ConfName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfAcronymType> getConfAcronym() {
		return getGroup().list(Jats1Package.eINSTANCE.getConferenceType_ConfAcronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfNumType getConfNum() {
		return confNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfNum(ConfNumType newConfNum, NotificationChain msgs) {
		ConfNumType oldConfNum = confNum;
		confNum = newConfNum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__CONF_NUM, oldConfNum, newConfNum);
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
	public void setConfNum(ConfNumType newConfNum) {
		if (newConfNum != confNum) {
			NotificationChain msgs = null;
			if (confNum != null)
				msgs = ((InternalEObject)confNum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CONFERENCE_TYPE__CONF_NUM, null, msgs);
			if (newConfNum != null)
				msgs = ((InternalEObject)newConfNum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CONFERENCE_TYPE__CONF_NUM, null, msgs);
			msgs = basicSetConfNum(newConfNum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__CONF_NUM, newConfNum, newConfNum));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__CONF_LOC, oldConfLoc, newConfLoc);
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
				msgs = ((InternalEObject)confLoc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CONFERENCE_TYPE__CONF_LOC, null, msgs);
			if (newConfLoc != null)
				msgs = ((InternalEObject)newConfLoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CONFERENCE_TYPE__CONF_LOC, null, msgs);
			msgs = basicSetConfLoc(newConfLoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__CONF_LOC, newConfLoc, newConfLoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfSponsorType> getConfSponsor() {
		if (confSponsor == null) {
			confSponsor = new EObjectContainmentEList<ConfSponsorType>(ConfSponsorType.class, this, Jats1Package.CONFERENCE_TYPE__CONF_SPONSOR);
		}
		return confSponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfThemeType getConfTheme() {
		return confTheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfTheme(ConfThemeType newConfTheme, NotificationChain msgs) {
		ConfThemeType oldConfTheme = confTheme;
		confTheme = newConfTheme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__CONF_THEME, oldConfTheme, newConfTheme);
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
	public void setConfTheme(ConfThemeType newConfTheme) {
		if (newConfTheme != confTheme) {
			NotificationChain msgs = null;
			if (confTheme != null)
				msgs = ((InternalEObject)confTheme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CONFERENCE_TYPE__CONF_THEME, null, msgs);
			if (newConfTheme != null)
				msgs = ((InternalEObject)newConfTheme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CONFERENCE_TYPE__CONF_THEME, null, msgs);
			msgs = basicSetConfTheme(newConfTheme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__CONF_THEME, newConfTheme, newConfTheme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CONFERENCE_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CONFERENCE_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONFERENCE_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CONFERENCE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case Jats1Package.CONFERENCE_TYPE__CONF_DATE:
				return basicSetConfDate(null, msgs);
			case Jats1Package.CONFERENCE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONFERENCE_TYPE__CONF_NAME:
				return ((InternalEList<?>)getConfName()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONFERENCE_TYPE__CONF_ACRONYM:
				return ((InternalEList<?>)getConfAcronym()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONFERENCE_TYPE__CONF_NUM:
				return basicSetConfNum(null, msgs);
			case Jats1Package.CONFERENCE_TYPE__CONF_LOC:
				return basicSetConfLoc(null, msgs);
			case Jats1Package.CONFERENCE_TYPE__CONF_SPONSOR:
				return ((InternalEList<?>)getConfSponsor()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONFERENCE_TYPE__CONF_THEME:
				return basicSetConfTheme(null, msgs);
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
			case Jats1Package.CONFERENCE_TYPE__CONF_DATE:
				return getConfDate();
			case Jats1Package.CONFERENCE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.CONFERENCE_TYPE__CONF_NAME:
				return getConfName();
			case Jats1Package.CONFERENCE_TYPE__CONF_ACRONYM:
				return getConfAcronym();
			case Jats1Package.CONFERENCE_TYPE__CONF_NUM:
				return getConfNum();
			case Jats1Package.CONFERENCE_TYPE__CONF_LOC:
				return getConfLoc();
			case Jats1Package.CONFERENCE_TYPE__CONF_SPONSOR:
				return getConfSponsor();
			case Jats1Package.CONFERENCE_TYPE__CONF_THEME:
				return getConfTheme();
			case Jats1Package.CONFERENCE_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.CONFERENCE_TYPE__BASE:
				return getBase();
			case Jats1Package.CONFERENCE_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.CONFERENCE_TYPE__HREF:
				return getHref();
			case Jats1Package.CONFERENCE_TYPE__ID:
				return getId();
			case Jats1Package.CONFERENCE_TYPE__LANG:
				return getLang();
			case Jats1Package.CONFERENCE_TYPE__ROLE:
				return getRole();
			case Jats1Package.CONFERENCE_TYPE__SHOW:
				return getShow();
			case Jats1Package.CONFERENCE_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.CONFERENCE_TYPE__TITLE:
				return getTitle();
			case Jats1Package.CONFERENCE_TYPE__TYPE:
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
			case Jats1Package.CONFERENCE_TYPE__CONF_DATE:
				setConfDate((ConfDateType)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_NAME:
				getConfName().clear();
				getConfName().addAll((Collection<? extends ConfNameType>)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_ACRONYM:
				getConfAcronym().clear();
				getConfAcronym().addAll((Collection<? extends ConfAcronymType>)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_NUM:
				setConfNum((ConfNumType)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_LOC:
				setConfLoc((ConfLocType)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_SPONSOR:
				getConfSponsor().clear();
				getConfSponsor().addAll((Collection<? extends ConfSponsorType>)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_THEME:
				setConfTheme((ConfThemeType)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Jats1Package.CONFERENCE_TYPE__TYPE:
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
			case Jats1Package.CONFERENCE_TYPE__CONF_DATE:
				setConfDate((ConfDateType)null);
				return;
			case Jats1Package.CONFERENCE_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_NAME:
				getConfName().clear();
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_ACRONYM:
				getConfAcronym().clear();
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_NUM:
				setConfNum((ConfNumType)null);
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_LOC:
				setConfLoc((ConfLocType)null);
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_SPONSOR:
				getConfSponsor().clear();
				return;
			case Jats1Package.CONFERENCE_TYPE__CONF_THEME:
				setConfTheme((ConfThemeType)null);
				return;
			case Jats1Package.CONFERENCE_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.CONFERENCE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.CONFERENCE_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.CONFERENCE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.CONFERENCE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.CONFERENCE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.CONFERENCE_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Jats1Package.CONFERENCE_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.CONFERENCE_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.CONFERENCE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Jats1Package.CONFERENCE_TYPE__TYPE:
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
			case Jats1Package.CONFERENCE_TYPE__CONF_DATE:
				return confDate != null;
			case Jats1Package.CONFERENCE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.CONFERENCE_TYPE__CONF_NAME:
				return !getConfName().isEmpty();
			case Jats1Package.CONFERENCE_TYPE__CONF_ACRONYM:
				return !getConfAcronym().isEmpty();
			case Jats1Package.CONFERENCE_TYPE__CONF_NUM:
				return confNum != null;
			case Jats1Package.CONFERENCE_TYPE__CONF_LOC:
				return confLoc != null;
			case Jats1Package.CONFERENCE_TYPE__CONF_SPONSOR:
				return confSponsor != null && !confSponsor.isEmpty();
			case Jats1Package.CONFERENCE_TYPE__CONF_THEME:
				return confTheme != null;
			case Jats1Package.CONFERENCE_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.CONFERENCE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.CONFERENCE_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.CONFERENCE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.CONFERENCE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.CONFERENCE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.CONFERENCE_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Jats1Package.CONFERENCE_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.CONFERENCE_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.CONFERENCE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Jats1Package.CONFERENCE_TYPE__TYPE:
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

} //ConferenceTypeImpl
