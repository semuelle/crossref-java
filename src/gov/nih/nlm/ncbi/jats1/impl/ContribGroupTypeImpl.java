/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.AffAlternativesType;
import gov.nih.nlm.ncbi.jats1.AffType;
import gov.nih.nlm.ncbi.jats1.AuthorCommentType;
import gov.nih.nlm.ncbi.jats1.BioType;
import gov.nih.nlm.ncbi.jats1.ContribGroupType;
import gov.nih.nlm.ncbi.jats1.ContribType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.OnBehalfOfType;
import gov.nih.nlm.ncbi.jats1.RoleType;
import gov.nih.nlm.ncbi.jats1.UriType;
import gov.nih.nlm.ncbi.jats1.XrefType;

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
 * An implementation of the model object '<em><b>Contrib Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getContribClass <em>Contrib Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getContrib <em>Contrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getContribInfoClass <em>Contrib Info Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getAff <em>Aff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getAffAlternatives <em>Aff Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getAuthorComment <em>Author Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getBio <em>Bio</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribGroupTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContribGroupTypeImpl extends MinimalEObjectImpl.Container implements ContribGroupType {
	/**
	 * The cached value of the '{@link #getContribClass() <em>Contrib Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contribClass;

	/**
	 * The cached value of the '{@link #getContribInfoClass() <em>Contrib Info Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribInfoClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contribInfoClass;

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
	protected ContribGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getContribGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getContribClass() {
		if (contribClass == null) {
			contribClass = new BasicFeatureMap(this, Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_CLASS);
		}
		return contribClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContribType> getContrib() {
		return getContribClass().list(Jats1Package.eINSTANCE.getContribGroupType_Contrib());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getContribInfoClass() {
		if (contribInfoClass == null) {
			contribInfoClass = new BasicFeatureMap(this, Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_INFO_CLASS);
		}
		return contribInfoClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffType> getAff() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_Aff());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffAlternativesType> getAffAlternatives() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_AffAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorCommentType> getAuthorComment() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_AuthorComment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BioType> getBio() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_Bio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnBehalfOfType> getOnBehalfOf() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_OnBehalfOf());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleType> getRole() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_Role());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribGroupType_Xref());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_GROUP_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_GROUP_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_GROUP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_CLASS:
				return ((InternalEList<?>)getContribClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB:
				return ((InternalEList<?>)getContrib()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_INFO_CLASS:
				return ((InternalEList<?>)getContribInfoClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__AFF:
				return ((InternalEList<?>)getAff()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__AFF_ALTERNATIVES:
				return ((InternalEList<?>)getAffAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__AUTHOR_COMMENT:
				return ((InternalEList<?>)getAuthorComment()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__BIO:
				return ((InternalEList<?>)getBio()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__ON_BEHALF_OF:
				return ((InternalEList<?>)getOnBehalfOf()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_GROUP_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_CLASS:
				if (coreType) return getContribClass();
				return ((FeatureMap.Internal)getContribClass()).getWrapper();
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB:
				return getContrib();
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_INFO_CLASS:
				if (coreType) return getContribInfoClass();
				return ((FeatureMap.Internal)getContribInfoClass()).getWrapper();
			case Jats1Package.CONTRIB_GROUP_TYPE__ADDRESS:
				return getAddress();
			case Jats1Package.CONTRIB_GROUP_TYPE__AFF:
				return getAff();
			case Jats1Package.CONTRIB_GROUP_TYPE__AFF_ALTERNATIVES:
				return getAffAlternatives();
			case Jats1Package.CONTRIB_GROUP_TYPE__AUTHOR_COMMENT:
				return getAuthorComment();
			case Jats1Package.CONTRIB_GROUP_TYPE__BIO:
				return getBio();
			case Jats1Package.CONTRIB_GROUP_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.CONTRIB_GROUP_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.CONTRIB_GROUP_TYPE__ON_BEHALF_OF:
				return getOnBehalfOf();
			case Jats1Package.CONTRIB_GROUP_TYPE__ROLE:
				return getRole();
			case Jats1Package.CONTRIB_GROUP_TYPE__URI:
				return getUri();
			case Jats1Package.CONTRIB_GROUP_TYPE__XREF:
				return getXref();
			case Jats1Package.CONTRIB_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.CONTRIB_GROUP_TYPE__ID:
				return getId();
			case Jats1Package.CONTRIB_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_CLASS:
				((FeatureMap.Internal)getContribClass()).set(newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB:
				getContrib().clear();
				getContrib().addAll((Collection<? extends ContribType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_INFO_CLASS:
				((FeatureMap.Internal)getContribInfoClass()).set(newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__AFF:
				getAff().clear();
				getAff().addAll((Collection<? extends AffType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				getAffAlternatives().addAll((Collection<? extends AffAlternativesType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__AUTHOR_COMMENT:
				getAuthorComment().clear();
				getAuthorComment().addAll((Collection<? extends AuthorCommentType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__BIO:
				getBio().clear();
				getBio().addAll((Collection<? extends BioType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__ON_BEHALF_OF:
				getOnBehalfOf().clear();
				getOnBehalfOf().addAll((Collection<? extends OnBehalfOfType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends RoleType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_CLASS:
				getContribClass().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB:
				getContrib().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_INFO_CLASS:
				getContribInfoClass().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__AFF:
				getAff().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__AUTHOR_COMMENT:
				getAuthorComment().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__BIO:
				getBio().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__ON_BEHALF_OF:
				getOnBehalfOf().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__ROLE:
				getRole().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_GROUP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_CLASS:
				return contribClass != null && !contribClass.isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB:
				return !getContrib().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTRIB_INFO_CLASS:
				return contribInfoClass != null && !contribInfoClass.isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__AFF:
				return !getAff().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__AFF_ALTERNATIVES:
				return !getAffAlternatives().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__AUTHOR_COMMENT:
				return !getAuthorComment().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__BIO:
				return !getBio().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__ON_BEHALF_OF:
				return !getOnBehalfOf().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__ROLE:
				return !getRole().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.CONTRIB_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.CONTRIB_GROUP_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.CONTRIB_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.CONTRIB_GROUP_TYPE__SPECIFIC_USE:
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
		result.append(" (contribClass: ");
		result.append(contribClass);
		result.append(", contribInfoClass: ");
		result.append(contribInfoClass);
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //ContribGroupTypeImpl
