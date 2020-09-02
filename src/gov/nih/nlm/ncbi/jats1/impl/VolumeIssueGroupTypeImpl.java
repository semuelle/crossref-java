/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.IssueIdType;
import gov.nih.nlm.ncbi.jats1.IssuePartType;
import gov.nih.nlm.ncbi.jats1.IssueSponsorType;
import gov.nih.nlm.ncbi.jats1.IssueTitleType;
import gov.nih.nlm.ncbi.jats1.IssueType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.VolumeIdType;
import gov.nih.nlm.ncbi.jats1.VolumeIssueGroupType;
import gov.nih.nlm.ncbi.jats1.VolumeSeriesType;
import gov.nih.nlm.ncbi.jats1.VolumeType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume Issue Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getVolumeId <em>Volume Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getVolumeSeries <em>Volume Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getIssueId <em>Issue Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getIssueTitle <em>Issue Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getIssueSponsor <em>Issue Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getIssuePart <em>Issue Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VolumeIssueGroupTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeIssueGroupTypeImpl extends MinimalEObjectImpl.Container implements VolumeIssueGroupType {
	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeType> volume;

	/**
	 * The cached value of the '{@link #getVolumeId() <em>Volume Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeId()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeIdType> volumeId;

	/**
	 * The cached value of the '{@link #getVolumeSeries() <em>Volume Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeSeries()
	 * @generated
	 * @ordered
	 */
	protected VolumeSeriesType volumeSeries;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueType> issue;

	/**
	 * The cached value of the '{@link #getIssueId() <em>Issue Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueId()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueIdType> issueId;

	/**
	 * The cached value of the '{@link #getIssueTitle() <em>Issue Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueTitleType> issueTitle;

	/**
	 * The cached value of the '{@link #getIssueSponsor() <em>Issue Sponsor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueSponsor()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueSponsorType> issueSponsor;

	/**
	 * The cached value of the '{@link #getIssuePart() <em>Issue Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuePart()
	 * @generated
	 * @ordered
	 */
	protected IssuePartType issuePart;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeIssueGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getVolumeIssueGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeType> getVolume() {
		if (volume == null) {
			volume = new EObjectContainmentEList<VolumeType>(VolumeType.class, this, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME);
		}
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeIdType> getVolumeId() {
		if (volumeId == null) {
			volumeId = new EObjectContainmentEList<VolumeIdType>(VolumeIdType.class, this, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_ID);
		}
		return volumeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeSeriesType getVolumeSeries() {
		return volumeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumeSeries(VolumeSeriesType newVolumeSeries, NotificationChain msgs) {
		VolumeSeriesType oldVolumeSeries = volumeSeries;
		volumeSeries = newVolumeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_SERIES, oldVolumeSeries, newVolumeSeries);
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
	public void setVolumeSeries(VolumeSeriesType newVolumeSeries) {
		if (newVolumeSeries != volumeSeries) {
			NotificationChain msgs = null;
			if (volumeSeries != null)
				msgs = ((InternalEObject)volumeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_SERIES, null, msgs);
			if (newVolumeSeries != null)
				msgs = ((InternalEObject)newVolumeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_SERIES, null, msgs);
			msgs = basicSetVolumeSeries(newVolumeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_SERIES, newVolumeSeries, newVolumeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueType> getIssue() {
		if (issue == null) {
			issue = new EObjectContainmentEList<IssueType>(IssueType.class, this, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE);
		}
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueIdType> getIssueId() {
		if (issueId == null) {
			issueId = new EObjectContainmentEList<IssueIdType>(IssueIdType.class, this, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_ID);
		}
		return issueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueTitleType> getIssueTitle() {
		if (issueTitle == null) {
			issueTitle = new EObjectContainmentEList<IssueTitleType>(IssueTitleType.class, this, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_TITLE);
		}
		return issueTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueSponsorType> getIssueSponsor() {
		if (issueSponsor == null) {
			issueSponsor = new EObjectContainmentEList<IssueSponsorType>(IssueSponsorType.class, this, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_SPONSOR);
		}
		return issueSponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssuePartType getIssuePart() {
		return issuePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuePart(IssuePartType newIssuePart, NotificationChain msgs) {
		IssuePartType oldIssuePart = issuePart;
		issuePart = newIssuePart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_PART, oldIssuePart, newIssuePart);
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
	public void setIssuePart(IssuePartType newIssuePart) {
		if (newIssuePart != issuePart) {
			NotificationChain msgs = null;
			if (issuePart != null)
				msgs = ((InternalEObject)issuePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_PART, null, msgs);
			if (newIssuePart != null)
				msgs = ((InternalEObject)newIssuePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_PART, null, msgs);
			msgs = basicSetIssuePart(newIssuePart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_PART, newIssuePart, newIssuePart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VOLUME_ISSUE_GROUP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME:
				return ((InternalEList<?>)getVolume()).basicRemove(otherEnd, msgs);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_ID:
				return ((InternalEList<?>)getVolumeId()).basicRemove(otherEnd, msgs);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_SERIES:
				return basicSetVolumeSeries(null, msgs);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE:
				return ((InternalEList<?>)getIssue()).basicRemove(otherEnd, msgs);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_ID:
				return ((InternalEList<?>)getIssueId()).basicRemove(otherEnd, msgs);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_TITLE:
				return ((InternalEList<?>)getIssueTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_SPONSOR:
				return ((InternalEList<?>)getIssueSponsor()).basicRemove(otherEnd, msgs);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_PART:
				return basicSetIssuePart(null, msgs);
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
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME:
				return getVolume();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_ID:
				return getVolumeId();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_SERIES:
				return getVolumeSeries();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE:
				return getIssue();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_ID:
				return getIssueId();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_TITLE:
				return getIssueTitle();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_SPONSOR:
				return getIssueSponsor();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_PART:
				return getIssuePart();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ID:
				return getId();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__LANG:
				return getLang();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME:
				getVolume().clear();
				getVolume().addAll((Collection<? extends VolumeType>)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_ID:
				getVolumeId().clear();
				getVolumeId().addAll((Collection<? extends VolumeIdType>)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_SERIES:
				setVolumeSeries((VolumeSeriesType)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE:
				getIssue().clear();
				getIssue().addAll((Collection<? extends IssueType>)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_ID:
				getIssueId().clear();
				getIssueId().addAll((Collection<? extends IssueIdType>)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_TITLE:
				getIssueTitle().clear();
				getIssueTitle().addAll((Collection<? extends IssueTitleType>)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_SPONSOR:
				getIssueSponsor().clear();
				getIssueSponsor().addAll((Collection<? extends IssueSponsorType>)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_PART:
				setIssuePart((IssuePartType)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME:
				getVolume().clear();
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_ID:
				getVolumeId().clear();
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_SERIES:
				setVolumeSeries((VolumeSeriesType)null);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE:
				getIssue().clear();
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_ID:
				getIssueId().clear();
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_TITLE:
				getIssueTitle().clear();
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_SPONSOR:
				getIssueSponsor().clear();
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_PART:
				setIssuePart((IssuePartType)null);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME:
				return volume != null && !volume.isEmpty();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_ID:
				return volumeId != null && !volumeId.isEmpty();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__VOLUME_SERIES:
				return volumeSeries != null;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE:
				return issue != null && !issue.isEmpty();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_ID:
				return issueId != null && !issueId.isEmpty();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_TITLE:
				return issueTitle != null && !issueTitle.isEmpty();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_SPONSOR:
				return issueSponsor != null && !issueSponsor.isEmpty();
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ISSUE_PART:
				return issuePart != null;
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.VOLUME_ISSUE_GROUP_TYPE__SPECIFIC_USE:
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
		result.append(" (base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //VolumeIssueGroupTypeImpl
