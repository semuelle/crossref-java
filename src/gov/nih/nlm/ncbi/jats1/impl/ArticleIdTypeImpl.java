/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ArticleIdType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.PubIdTypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article Id Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleIdTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleIdTypeImpl#getAssigningAuthority <em>Assigning Authority</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleIdTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleIdTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleIdTypeImpl#getPubIdType <em>Pub Id Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleIdTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleIdTypeImpl extends MinimalEObjectImpl.Container implements ArticleIdType {
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
	 * The default value of the '{@link #getAssigningAuthority() <em>Assigning Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigningAuthority()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNING_AUTHORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssigningAuthority() <em>Assigning Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigningAuthority()
	 * @generated
	 * @ordered
	 */
	protected String assigningAuthority = ASSIGNING_AUTHORITY_EDEFAULT;

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
	 * The default value of the '{@link #getPubIdType() <em>Pub Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubIdType()
	 * @generated
	 * @ordered
	 */
	protected static final PubIdTypeType PUB_ID_TYPE_EDEFAULT = PubIdTypeType.ACCESSION;

	/**
	 * The cached value of the '{@link #getPubIdType() <em>Pub Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubIdType()
	 * @generated
	 * @ordered
	 */
	protected PubIdTypeType pubIdType = PUB_ID_TYPE_EDEFAULT;

	/**
	 * This is true if the Pub Id Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pubIdTypeESet;

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
	protected ArticleIdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getArticleIdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.ARTICLE_ID_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssigningAuthority() {
		return assigningAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssigningAuthority(String newAssigningAuthority) {
		String oldAssigningAuthority = assigningAuthority;
		assigningAuthority = newAssigningAuthority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_ID_TYPE__ASSIGNING_AUTHORITY, oldAssigningAuthority, assigningAuthority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_ID_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_ID_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubIdTypeType getPubIdType() {
		return pubIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubIdType(PubIdTypeType newPubIdType) {
		PubIdTypeType oldPubIdType = pubIdType;
		pubIdType = newPubIdType == null ? PUB_ID_TYPE_EDEFAULT : newPubIdType;
		boolean oldPubIdTypeESet = pubIdTypeESet;
		pubIdTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_ID_TYPE__PUB_ID_TYPE, oldPubIdType, pubIdType, !oldPubIdTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPubIdType() {
		PubIdTypeType oldPubIdType = pubIdType;
		boolean oldPubIdTypeESet = pubIdTypeESet;
		pubIdType = PUB_ID_TYPE_EDEFAULT;
		pubIdTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.ARTICLE_ID_TYPE__PUB_ID_TYPE, oldPubIdType, PUB_ID_TYPE_EDEFAULT, oldPubIdTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPubIdType() {
		return pubIdTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_ID_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ARTICLE_ID_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.ARTICLE_ID_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.ARTICLE_ID_TYPE__ASSIGNING_AUTHORITY:
				return getAssigningAuthority();
			case Jats1Package.ARTICLE_ID_TYPE__BASE:
				return getBase();
			case Jats1Package.ARTICLE_ID_TYPE__ID:
				return getId();
			case Jats1Package.ARTICLE_ID_TYPE__PUB_ID_TYPE:
				return getPubIdType();
			case Jats1Package.ARTICLE_ID_TYPE__SPECIFIC_USE:
				return getSpecificUse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Jats1Package.ARTICLE_ID_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.ARTICLE_ID_TYPE__ASSIGNING_AUTHORITY:
				setAssigningAuthority((String)newValue);
				return;
			case Jats1Package.ARTICLE_ID_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ARTICLE_ID_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.ARTICLE_ID_TYPE__PUB_ID_TYPE:
				setPubIdType((PubIdTypeType)newValue);
				return;
			case Jats1Package.ARTICLE_ID_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ARTICLE_ID_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.ARTICLE_ID_TYPE__ASSIGNING_AUTHORITY:
				setAssigningAuthority(ASSIGNING_AUTHORITY_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_ID_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_ID_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_ID_TYPE__PUB_ID_TYPE:
				unsetPubIdType();
				return;
			case Jats1Package.ARTICLE_ID_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ARTICLE_ID_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.ARTICLE_ID_TYPE__ASSIGNING_AUTHORITY:
				return ASSIGNING_AUTHORITY_EDEFAULT == null ? assigningAuthority != null : !ASSIGNING_AUTHORITY_EDEFAULT.equals(assigningAuthority);
			case Jats1Package.ARTICLE_ID_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ARTICLE_ID_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.ARTICLE_ID_TYPE__PUB_ID_TYPE:
				return isSetPubIdType();
			case Jats1Package.ARTICLE_ID_TYPE__SPECIFIC_USE:
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
		result.append(", assigningAuthority: ");
		result.append(assigningAuthority);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", pubIdType: ");
		if (pubIdTypeESet) result.append(pubIdType); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //ArticleIdTypeImpl
