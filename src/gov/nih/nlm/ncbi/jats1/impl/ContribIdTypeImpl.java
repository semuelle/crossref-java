/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AuthenticatedType;
import gov.nih.nlm.ncbi.jats1.ContribIdType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;

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
 * An implementation of the model object '<em><b>Contrib Id Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribIdTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribIdTypeImpl#getAssigningAuthority <em>Assigning Authority</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribIdTypeImpl#getAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribIdTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribIdTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribIdTypeImpl#getContribIdType <em>Contrib Id Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribIdTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribIdTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribIdTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContribIdTypeImpl extends MinimalEObjectImpl.Container implements ContribIdType {
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
	 * The default value of the '{@link #getAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticatedType AUTHENTICATED_EDEFAULT = AuthenticatedType.FALSE;

	/**
	 * The cached value of the '{@link #getAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected AuthenticatedType authenticated = AUTHENTICATED_EDEFAULT;

	/**
	 * This is true if the Authenticated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authenticatedESet;

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
	 * The default value of the '{@link #getContribIdType() <em>Contrib Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribIdType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIB_ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContribIdType() <em>Contrib Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribIdType()
	 * @generated
	 * @ordered
	 */
	protected String contribIdType = CONTRIB_ID_TYPE_EDEFAULT;

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
	protected ContribIdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getContribIdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.CONTRIB_ID_TYPE__MIXED);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_ID_TYPE__ASSIGNING_AUTHORITY, oldAssigningAuthority, assigningAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticatedType getAuthenticated() {
		return authenticated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticated(AuthenticatedType newAuthenticated) {
		AuthenticatedType oldAuthenticated = authenticated;
		authenticated = newAuthenticated == null ? AUTHENTICATED_EDEFAULT : newAuthenticated;
		boolean oldAuthenticatedESet = authenticatedESet;
		authenticatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_ID_TYPE__AUTHENTICATED, oldAuthenticated, authenticated, !oldAuthenticatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAuthenticated() {
		AuthenticatedType oldAuthenticated = authenticated;
		boolean oldAuthenticatedESet = authenticatedESet;
		authenticated = AUTHENTICATED_EDEFAULT;
		authenticatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CONTRIB_ID_TYPE__AUTHENTICATED, oldAuthenticated, AUTHENTICATED_EDEFAULT, oldAuthenticatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAuthenticated() {
		return authenticatedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_ID_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_ID_TYPE__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContribIdType() {
		return contribIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContribIdType(String newContribIdType) {
		String oldContribIdType = contribIdType;
		contribIdType = newContribIdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_ID_TYPE__CONTRIB_ID_TYPE, oldContribIdType, contribIdType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_ID_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_ID_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_ID_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.CONTRIB_ID_TYPE__MIXED:
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
			case Jats1Package.CONTRIB_ID_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.CONTRIB_ID_TYPE__ASSIGNING_AUTHORITY:
				return getAssigningAuthority();
			case Jats1Package.CONTRIB_ID_TYPE__AUTHENTICATED:
				return getAuthenticated();
			case Jats1Package.CONTRIB_ID_TYPE__BASE:
				return getBase();
			case Jats1Package.CONTRIB_ID_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.CONTRIB_ID_TYPE__CONTRIB_ID_TYPE:
				return getContribIdType();
			case Jats1Package.CONTRIB_ID_TYPE__ID:
				return getId();
			case Jats1Package.CONTRIB_ID_TYPE__LANG:
				return getLang();
			case Jats1Package.CONTRIB_ID_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CONTRIB_ID_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__ASSIGNING_AUTHORITY:
				setAssigningAuthority((String)newValue);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__AUTHENTICATED:
				setAuthenticated((AuthenticatedType)newValue);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__CONTRIB_ID_TYPE:
				setContribIdType((String)newValue);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CONTRIB_ID_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.CONTRIB_ID_TYPE__ASSIGNING_AUTHORITY:
				setAssigningAuthority(ASSIGNING_AUTHORITY_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__AUTHENTICATED:
				unsetAuthenticated();
				return;
			case Jats1Package.CONTRIB_ID_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__CONTRIB_ID_TYPE:
				setContribIdType(CONTRIB_ID_TYPE_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_ID_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CONTRIB_ID_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.CONTRIB_ID_TYPE__ASSIGNING_AUTHORITY:
				return ASSIGNING_AUTHORITY_EDEFAULT == null ? assigningAuthority != null : !ASSIGNING_AUTHORITY_EDEFAULT.equals(assigningAuthority);
			case Jats1Package.CONTRIB_ID_TYPE__AUTHENTICATED:
				return isSetAuthenticated();
			case Jats1Package.CONTRIB_ID_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.CONTRIB_ID_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.CONTRIB_ID_TYPE__CONTRIB_ID_TYPE:
				return CONTRIB_ID_TYPE_EDEFAULT == null ? contribIdType != null : !CONTRIB_ID_TYPE_EDEFAULT.equals(contribIdType);
			case Jats1Package.CONTRIB_ID_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.CONTRIB_ID_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.CONTRIB_ID_TYPE__SPECIFIC_USE:
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
		result.append(", authenticated: ");
		if (authenticatedESet) result.append(authenticated); else result.append("<unset>");
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", contribIdType: ");
		result.append(contribIdType);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //ContribIdTypeImpl
