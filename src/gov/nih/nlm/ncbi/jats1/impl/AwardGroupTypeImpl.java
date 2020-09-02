/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AwardGroupType;
import gov.nih.nlm.ncbi.jats1.AwardIdType;
import gov.nih.nlm.ncbi.jats1.FundingSourceType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.PrincipalAwardRecipientType;
import gov.nih.nlm.ncbi.jats1.PrincipalInvestigatorType;
import gov.nih.nlm.ncbi.jats1.SupportSourceType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Award Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getFundingSource <em>Funding Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getSupportSource <em>Support Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getAwardId <em>Award Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getPrincipalAwardRecipient <em>Principal Award Recipient</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getPrincipalInvestigator <em>Principal Investigator</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getAwardType <em>Award Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getRid <em>Rid</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AwardGroupTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwardGroupTypeImpl extends MinimalEObjectImpl.Container implements AwardGroupType {
	/**
	 * The cached value of the '{@link #getFundingSource() <em>Funding Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundingSource()
	 * @generated
	 * @ordered
	 */
	protected EList<FundingSourceType> fundingSource;

	/**
	 * The cached value of the '{@link #getSupportSource() <em>Support Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportSourceType> supportSource;

	/**
	 * The cached value of the '{@link #getAwardId() <em>Award Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwardId()
	 * @generated
	 * @ordered
	 */
	protected EList<AwardIdType> awardId;

	/**
	 * The cached value of the '{@link #getPrincipalAwardRecipient() <em>Principal Award Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalAwardRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<PrincipalAwardRecipientType> principalAwardRecipient;

	/**
	 * The cached value of the '{@link #getPrincipalInvestigator() <em>Principal Investigator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalInvestigator()
	 * @generated
	 * @ordered
	 */
	protected EList<PrincipalInvestigatorType> principalInvestigator;

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
	 * The default value of the '{@link #getAwardType() <em>Award Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwardType()
	 * @generated
	 * @ordered
	 */
	protected static final String AWARD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwardType() <em>Award Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwardType()
	 * @generated
	 * @ordered
	 */
	protected String awardType = AWARD_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getRid() <em>Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRid()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> RID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRid() <em>Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRid()
	 * @generated
	 * @ordered
	 */
	protected List<String> rid = RID_EDEFAULT;

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
	protected AwardGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getAwardGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FundingSourceType> getFundingSource() {
		if (fundingSource == null) {
			fundingSource = new EObjectContainmentEList<FundingSourceType>(FundingSourceType.class, this, Jats1Package.AWARD_GROUP_TYPE__FUNDING_SOURCE);
		}
		return fundingSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupportSourceType> getSupportSource() {
		if (supportSource == null) {
			supportSource = new EObjectContainmentEList<SupportSourceType>(SupportSourceType.class, this, Jats1Package.AWARD_GROUP_TYPE__SUPPORT_SOURCE);
		}
		return supportSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AwardIdType> getAwardId() {
		if (awardId == null) {
			awardId = new EObjectContainmentEList<AwardIdType>(AwardIdType.class, this, Jats1Package.AWARD_GROUP_TYPE__AWARD_ID);
		}
		return awardId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrincipalAwardRecipientType> getPrincipalAwardRecipient() {
		if (principalAwardRecipient == null) {
			principalAwardRecipient = new EObjectContainmentEList<PrincipalAwardRecipientType>(PrincipalAwardRecipientType.class, this, Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_AWARD_RECIPIENT);
		}
		return principalAwardRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrincipalInvestigatorType> getPrincipalInvestigator() {
		if (principalInvestigator == null) {
			principalInvestigator = new EObjectContainmentEList<PrincipalInvestigatorType>(PrincipalInvestigatorType.class, this, Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_INVESTIGATOR);
		}
		return principalInvestigator;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.AWARD_GROUP_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
	public String getAwardType() {
		return awardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAwardType(String newAwardType) {
		String oldAwardType = awardType;
		awardType = newAwardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__AWARD_TYPE, oldAwardType, awardType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getRid() {
		return rid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRid(List<String> newRid) {
		List<String> oldRid = rid;
		rid = newRid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__RID, oldRid, rid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.AWARD_GROUP_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AWARD_GROUP_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.AWARD_GROUP_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case Jats1Package.AWARD_GROUP_TYPE__FUNDING_SOURCE:
				return ((InternalEList<?>)getFundingSource()).basicRemove(otherEnd, msgs);
			case Jats1Package.AWARD_GROUP_TYPE__SUPPORT_SOURCE:
				return ((InternalEList<?>)getSupportSource()).basicRemove(otherEnd, msgs);
			case Jats1Package.AWARD_GROUP_TYPE__AWARD_ID:
				return ((InternalEList<?>)getAwardId()).basicRemove(otherEnd, msgs);
			case Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_AWARD_RECIPIENT:
				return ((InternalEList<?>)getPrincipalAwardRecipient()).basicRemove(otherEnd, msgs);
			case Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_INVESTIGATOR:
				return ((InternalEList<?>)getPrincipalInvestigator()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.AWARD_GROUP_TYPE__FUNDING_SOURCE:
				return getFundingSource();
			case Jats1Package.AWARD_GROUP_TYPE__SUPPORT_SOURCE:
				return getSupportSource();
			case Jats1Package.AWARD_GROUP_TYPE__AWARD_ID:
				return getAwardId();
			case Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_AWARD_RECIPIENT:
				return getPrincipalAwardRecipient();
			case Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_INVESTIGATOR:
				return getPrincipalInvestigator();
			case Jats1Package.AWARD_GROUP_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.AWARD_GROUP_TYPE__AWARD_TYPE:
				return getAwardType();
			case Jats1Package.AWARD_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.AWARD_GROUP_TYPE__HREF:
				return getHref();
			case Jats1Package.AWARD_GROUP_TYPE__ID:
				return getId();
			case Jats1Package.AWARD_GROUP_TYPE__LANG:
				return getLang();
			case Jats1Package.AWARD_GROUP_TYPE__RID:
				return getRid();
			case Jats1Package.AWARD_GROUP_TYPE__ROLE:
				return getRole();
			case Jats1Package.AWARD_GROUP_TYPE__SHOW:
				return getShow();
			case Jats1Package.AWARD_GROUP_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.AWARD_GROUP_TYPE__TITLE:
				return getTitle();
			case Jats1Package.AWARD_GROUP_TYPE__TYPE:
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
			case Jats1Package.AWARD_GROUP_TYPE__FUNDING_SOURCE:
				getFundingSource().clear();
				getFundingSource().addAll((Collection<? extends FundingSourceType>)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__SUPPORT_SOURCE:
				getSupportSource().clear();
				getSupportSource().addAll((Collection<? extends SupportSourceType>)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__AWARD_ID:
				getAwardId().clear();
				getAwardId().addAll((Collection<? extends AwardIdType>)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_AWARD_RECIPIENT:
				getPrincipalAwardRecipient().clear();
				getPrincipalAwardRecipient().addAll((Collection<? extends PrincipalAwardRecipientType>)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_INVESTIGATOR:
				getPrincipalInvestigator().clear();
				getPrincipalInvestigator().addAll((Collection<? extends PrincipalInvestigatorType>)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__AWARD_TYPE:
				setAwardType((String)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__RID:
				setRid((List<String>)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__TYPE:
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
			case Jats1Package.AWARD_GROUP_TYPE__FUNDING_SOURCE:
				getFundingSource().clear();
				return;
			case Jats1Package.AWARD_GROUP_TYPE__SUPPORT_SOURCE:
				getSupportSource().clear();
				return;
			case Jats1Package.AWARD_GROUP_TYPE__AWARD_ID:
				getAwardId().clear();
				return;
			case Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_AWARD_RECIPIENT:
				getPrincipalAwardRecipient().clear();
				return;
			case Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_INVESTIGATOR:
				getPrincipalInvestigator().clear();
				return;
			case Jats1Package.AWARD_GROUP_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.AWARD_GROUP_TYPE__AWARD_TYPE:
				setAwardType(AWARD_TYPE_EDEFAULT);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__RID:
				setRid(RID_EDEFAULT);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.AWARD_GROUP_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Jats1Package.AWARD_GROUP_TYPE__TYPE:
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
			case Jats1Package.AWARD_GROUP_TYPE__FUNDING_SOURCE:
				return fundingSource != null && !fundingSource.isEmpty();
			case Jats1Package.AWARD_GROUP_TYPE__SUPPORT_SOURCE:
				return supportSource != null && !supportSource.isEmpty();
			case Jats1Package.AWARD_GROUP_TYPE__AWARD_ID:
				return awardId != null && !awardId.isEmpty();
			case Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_AWARD_RECIPIENT:
				return principalAwardRecipient != null && !principalAwardRecipient.isEmpty();
			case Jats1Package.AWARD_GROUP_TYPE__PRINCIPAL_INVESTIGATOR:
				return principalInvestigator != null && !principalInvestigator.isEmpty();
			case Jats1Package.AWARD_GROUP_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.AWARD_GROUP_TYPE__AWARD_TYPE:
				return AWARD_TYPE_EDEFAULT == null ? awardType != null : !AWARD_TYPE_EDEFAULT.equals(awardType);
			case Jats1Package.AWARD_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.AWARD_GROUP_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.AWARD_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.AWARD_GROUP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.AWARD_GROUP_TYPE__RID:
				return RID_EDEFAULT == null ? rid != null : !RID_EDEFAULT.equals(rid);
			case Jats1Package.AWARD_GROUP_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Jats1Package.AWARD_GROUP_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.AWARD_GROUP_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.AWARD_GROUP_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Jats1Package.AWARD_GROUP_TYPE__TYPE:
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
		result.append(" (actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", awardType: ");
		result.append(awardType);
		result.append(", base: ");
		result.append(base);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", rid: ");
		result.append(rid);
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

} //AwardGroupTypeImpl
