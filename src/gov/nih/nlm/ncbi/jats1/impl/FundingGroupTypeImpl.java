/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AwardGroupType;
import gov.nih.nlm.ncbi.jats1.FundingGroupType;
import gov.nih.nlm.ncbi.jats1.FundingStatementType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.OpenAccessType;

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
 * An implementation of the model object '<em><b>Funding Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FundingGroupTypeImpl#getAwardGroup <em>Award Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FundingGroupTypeImpl#getFundingStatement <em>Funding Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FundingGroupTypeImpl#getOpenAccess <em>Open Access</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FundingGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FundingGroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FundingGroupTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FundingGroupTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FundingGroupTypeImpl extends MinimalEObjectImpl.Container implements FundingGroupType {
	/**
	 * The cached value of the '{@link #getAwardGroup() <em>Award Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwardGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<AwardGroupType> awardGroup;

	/**
	 * The cached value of the '{@link #getFundingStatement() <em>Funding Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundingStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<FundingStatementType> fundingStatement;

	/**
	 * The cached value of the '{@link #getOpenAccess() <em>Open Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenAccessType> openAccess;

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
	protected FundingGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getFundingGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AwardGroupType> getAwardGroup() {
		if (awardGroup == null) {
			awardGroup = new EObjectContainmentEList<AwardGroupType>(AwardGroupType.class, this, Jats1Package.FUNDING_GROUP_TYPE__AWARD_GROUP);
		}
		return awardGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FundingStatementType> getFundingStatement() {
		if (fundingStatement == null) {
			fundingStatement = new EObjectContainmentEList<FundingStatementType>(FundingStatementType.class, this, Jats1Package.FUNDING_GROUP_TYPE__FUNDING_STATEMENT);
		}
		return fundingStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OpenAccessType> getOpenAccess() {
		if (openAccess == null) {
			openAccess = new EObjectContainmentEList<OpenAccessType>(OpenAccessType.class, this, Jats1Package.FUNDING_GROUP_TYPE__OPEN_ACCESS);
		}
		return openAccess;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FUNDING_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FUNDING_GROUP_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FUNDING_GROUP_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FUNDING_GROUP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.FUNDING_GROUP_TYPE__AWARD_GROUP:
				return ((InternalEList<?>)getAwardGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.FUNDING_GROUP_TYPE__FUNDING_STATEMENT:
				return ((InternalEList<?>)getFundingStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.FUNDING_GROUP_TYPE__OPEN_ACCESS:
				return ((InternalEList<?>)getOpenAccess()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.FUNDING_GROUP_TYPE__AWARD_GROUP:
				return getAwardGroup();
			case Jats1Package.FUNDING_GROUP_TYPE__FUNDING_STATEMENT:
				return getFundingStatement();
			case Jats1Package.FUNDING_GROUP_TYPE__OPEN_ACCESS:
				return getOpenAccess();
			case Jats1Package.FUNDING_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.FUNDING_GROUP_TYPE__ID:
				return getId();
			case Jats1Package.FUNDING_GROUP_TYPE__LANG:
				return getLang();
			case Jats1Package.FUNDING_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.FUNDING_GROUP_TYPE__AWARD_GROUP:
				getAwardGroup().clear();
				getAwardGroup().addAll((Collection<? extends AwardGroupType>)newValue);
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__FUNDING_STATEMENT:
				getFundingStatement().clear();
				getFundingStatement().addAll((Collection<? extends FundingStatementType>)newValue);
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__OPEN_ACCESS:
				getOpenAccess().clear();
				getOpenAccess().addAll((Collection<? extends OpenAccessType>)newValue);
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.FUNDING_GROUP_TYPE__AWARD_GROUP:
				getAwardGroup().clear();
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__FUNDING_STATEMENT:
				getFundingStatement().clear();
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__OPEN_ACCESS:
				getOpenAccess().clear();
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.FUNDING_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.FUNDING_GROUP_TYPE__AWARD_GROUP:
				return awardGroup != null && !awardGroup.isEmpty();
			case Jats1Package.FUNDING_GROUP_TYPE__FUNDING_STATEMENT:
				return fundingStatement != null && !fundingStatement.isEmpty();
			case Jats1Package.FUNDING_GROUP_TYPE__OPEN_ACCESS:
				return openAccess != null && !openAccess.isEmpty();
			case Jats1Package.FUNDING_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.FUNDING_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.FUNDING_GROUP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.FUNDING_GROUP_TYPE__SPECIFIC_USE:
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
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //FundingGroupTypeImpl
