/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.CopyrightHolderType;
import gov.nih.nlm.ncbi.jats1.CopyrightStatementType;
import gov.nih.nlm.ncbi.jats1.CopyrightYearType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LicenseType;
import gov.nih.nlm.ncbi.jats1.PermissionsType;

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

import org.niso.schemas.ali._1._0.FreeToReadType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PermissionsTypeImpl#getCopyrightStatement <em>Copyright Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PermissionsTypeImpl#getCopyrightYear <em>Copyright Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PermissionsTypeImpl#getCopyrightHolder <em>Copyright Holder</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PermissionsTypeImpl#getLicenseClass <em>License Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PermissionsTypeImpl#getFreeToRead <em>Free To Read</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PermissionsTypeImpl#getLicense <em>License</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PermissionsTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PermissionsTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionsTypeImpl extends MinimalEObjectImpl.Container implements PermissionsType {
	/**
	 * The cached value of the '{@link #getCopyrightStatement() <em>Copyright Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<CopyrightStatementType> copyrightStatement;

	/**
	 * The cached value of the '{@link #getCopyrightYear() <em>Copyright Year</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightYear()
	 * @generated
	 * @ordered
	 */
	protected EList<CopyrightYearType> copyrightYear;

	/**
	 * The cached value of the '{@link #getCopyrightHolder() <em>Copyright Holder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightHolder()
	 * @generated
	 * @ordered
	 */
	protected EList<CopyrightHolderType> copyrightHolder;

	/**
	 * The cached value of the '{@link #getLicenseClass() <em>License Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap licenseClass;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getPermissionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CopyrightStatementType> getCopyrightStatement() {
		if (copyrightStatement == null) {
			copyrightStatement = new EObjectContainmentEList<CopyrightStatementType>(CopyrightStatementType.class, this, Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_STATEMENT);
		}
		return copyrightStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CopyrightYearType> getCopyrightYear() {
		if (copyrightYear == null) {
			copyrightYear = new EObjectContainmentEList<CopyrightYearType>(CopyrightYearType.class, this, Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_YEAR);
		}
		return copyrightYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CopyrightHolderType> getCopyrightHolder() {
		if (copyrightHolder == null) {
			copyrightHolder = new EObjectContainmentEList<CopyrightHolderType>(CopyrightHolderType.class, this, Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_HOLDER);
		}
		return copyrightHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLicenseClass() {
		if (licenseClass == null) {
			licenseClass = new BasicFeatureMap(this, Jats1Package.PERMISSIONS_TYPE__LICENSE_CLASS);
		}
		return licenseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FreeToReadType> getFreeToRead() {
		return getLicenseClass().list(Jats1Package.eINSTANCE.getPermissionsType_FreeToRead());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LicenseType> getLicense() {
		return getLicenseClass().list(Jats1Package.eINSTANCE.getPermissionsType_License());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PERMISSIONS_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PERMISSIONS_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_STATEMENT:
				return ((InternalEList<?>)getCopyrightStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_YEAR:
				return ((InternalEList<?>)getCopyrightYear()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_HOLDER:
				return ((InternalEList<?>)getCopyrightHolder()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERMISSIONS_TYPE__LICENSE_CLASS:
				return ((InternalEList<?>)getLicenseClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERMISSIONS_TYPE__FREE_TO_READ:
				return ((InternalEList<?>)getFreeToRead()).basicRemove(otherEnd, msgs);
			case Jats1Package.PERMISSIONS_TYPE__LICENSE:
				return ((InternalEList<?>)getLicense()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_STATEMENT:
				return getCopyrightStatement();
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_YEAR:
				return getCopyrightYear();
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_HOLDER:
				return getCopyrightHolder();
			case Jats1Package.PERMISSIONS_TYPE__LICENSE_CLASS:
				if (coreType) return getLicenseClass();
				return ((FeatureMap.Internal)getLicenseClass()).getWrapper();
			case Jats1Package.PERMISSIONS_TYPE__FREE_TO_READ:
				return getFreeToRead();
			case Jats1Package.PERMISSIONS_TYPE__LICENSE:
				return getLicense();
			case Jats1Package.PERMISSIONS_TYPE__BASE:
				return getBase();
			case Jats1Package.PERMISSIONS_TYPE__ID:
				return getId();
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
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_STATEMENT:
				getCopyrightStatement().clear();
				getCopyrightStatement().addAll((Collection<? extends CopyrightStatementType>)newValue);
				return;
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_YEAR:
				getCopyrightYear().clear();
				getCopyrightYear().addAll((Collection<? extends CopyrightYearType>)newValue);
				return;
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_HOLDER:
				getCopyrightHolder().clear();
				getCopyrightHolder().addAll((Collection<? extends CopyrightHolderType>)newValue);
				return;
			case Jats1Package.PERMISSIONS_TYPE__LICENSE_CLASS:
				((FeatureMap.Internal)getLicenseClass()).set(newValue);
				return;
			case Jats1Package.PERMISSIONS_TYPE__FREE_TO_READ:
				getFreeToRead().clear();
				getFreeToRead().addAll((Collection<? extends FreeToReadType>)newValue);
				return;
			case Jats1Package.PERMISSIONS_TYPE__LICENSE:
				getLicense().clear();
				getLicense().addAll((Collection<? extends LicenseType>)newValue);
				return;
			case Jats1Package.PERMISSIONS_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.PERMISSIONS_TYPE__ID:
				setId((String)newValue);
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
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_STATEMENT:
				getCopyrightStatement().clear();
				return;
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_YEAR:
				getCopyrightYear().clear();
				return;
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_HOLDER:
				getCopyrightHolder().clear();
				return;
			case Jats1Package.PERMISSIONS_TYPE__LICENSE_CLASS:
				getLicenseClass().clear();
				return;
			case Jats1Package.PERMISSIONS_TYPE__FREE_TO_READ:
				getFreeToRead().clear();
				return;
			case Jats1Package.PERMISSIONS_TYPE__LICENSE:
				getLicense().clear();
				return;
			case Jats1Package.PERMISSIONS_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.PERMISSIONS_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_STATEMENT:
				return copyrightStatement != null && !copyrightStatement.isEmpty();
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_YEAR:
				return copyrightYear != null && !copyrightYear.isEmpty();
			case Jats1Package.PERMISSIONS_TYPE__COPYRIGHT_HOLDER:
				return copyrightHolder != null && !copyrightHolder.isEmpty();
			case Jats1Package.PERMISSIONS_TYPE__LICENSE_CLASS:
				return licenseClass != null && !licenseClass.isEmpty();
			case Jats1Package.PERMISSIONS_TYPE__FREE_TO_READ:
				return !getFreeToRead().isEmpty();
			case Jats1Package.PERMISSIONS_TYPE__LICENSE:
				return !getLicense().isEmpty();
			case Jats1Package.PERMISSIONS_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.PERMISSIONS_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (licenseClass: ");
		result.append(licenseClass);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PermissionsTypeImpl
