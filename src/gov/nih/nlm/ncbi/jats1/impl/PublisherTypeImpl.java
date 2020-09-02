/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.PublisherLocType;
import gov.nih.nlm.ncbi.jats1.PublisherNameType;
import gov.nih.nlm.ncbi.jats1.PublisherType;

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
 * An implementation of the model object '<em><b>Publisher Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PublisherTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PublisherTypeImpl#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PublisherTypeImpl#getPublisherLoc <em>Publisher Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PublisherTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PublisherTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PublisherTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublisherTypeImpl extends MinimalEObjectImpl.Container implements PublisherType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getPublisherType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.PUBLISHER_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublisherNameType> getPublisherName() {
		return getGroup().list(Jats1Package.eINSTANCE.getPublisherType_PublisherName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublisherLocType> getPublisherLoc() {
		return getGroup().list(Jats1Package.eINSTANCE.getPublisherType_PublisherLoc());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PUBLISHER_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PUBLISHER_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PUBLISHER_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.PUBLISHER_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.PUBLISHER_TYPE__PUBLISHER_NAME:
				return ((InternalEList<?>)getPublisherName()).basicRemove(otherEnd, msgs);
			case Jats1Package.PUBLISHER_TYPE__PUBLISHER_LOC:
				return ((InternalEList<?>)getPublisherLoc()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.PUBLISHER_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.PUBLISHER_TYPE__PUBLISHER_NAME:
				return getPublisherName();
			case Jats1Package.PUBLISHER_TYPE__PUBLISHER_LOC:
				return getPublisherLoc();
			case Jats1Package.PUBLISHER_TYPE__BASE:
				return getBase();
			case Jats1Package.PUBLISHER_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.PUBLISHER_TYPE__ID:
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
			case Jats1Package.PUBLISHER_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.PUBLISHER_TYPE__PUBLISHER_NAME:
				getPublisherName().clear();
				getPublisherName().addAll((Collection<? extends PublisherNameType>)newValue);
				return;
			case Jats1Package.PUBLISHER_TYPE__PUBLISHER_LOC:
				getPublisherLoc().clear();
				getPublisherLoc().addAll((Collection<? extends PublisherLocType>)newValue);
				return;
			case Jats1Package.PUBLISHER_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.PUBLISHER_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.PUBLISHER_TYPE__ID:
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
			case Jats1Package.PUBLISHER_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.PUBLISHER_TYPE__PUBLISHER_NAME:
				getPublisherName().clear();
				return;
			case Jats1Package.PUBLISHER_TYPE__PUBLISHER_LOC:
				getPublisherLoc().clear();
				return;
			case Jats1Package.PUBLISHER_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.PUBLISHER_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.PUBLISHER_TYPE__ID:
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
			case Jats1Package.PUBLISHER_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.PUBLISHER_TYPE__PUBLISHER_NAME:
				return !getPublisherName().isEmpty();
			case Jats1Package.PUBLISHER_TYPE__PUBLISHER_LOC:
				return !getPublisherLoc().isEmpty();
			case Jats1Package.PUBLISHER_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.PUBLISHER_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.PUBLISHER_TYPE__ID:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PublisherTypeImpl
