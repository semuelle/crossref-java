/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.CrossmarkDomainsType;
import org.crossref.schema._4._4.CrossmarkType;
import org.crossref.schema._4._4.CustomMetadataType;
import org.crossref.schema._4._4.UpdatesType;
import org.crossref.schema._4._4._4Package;

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
 * An implementation of the model object '<em><b>Crossmark Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.CrossmarkTypeImpl#getCrossmarkVersion <em>Crossmark Version</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CrossmarkTypeImpl#getCrossmarkPolicy <em>Crossmark Policy</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CrossmarkTypeImpl#getCrossmarkDomains <em>Crossmark Domains</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CrossmarkTypeImpl#isCrossmarkDomainExclusive <em>Crossmark Domain Exclusive</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CrossmarkTypeImpl#getUpdates <em>Updates</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CrossmarkTypeImpl#getCustomMetadata <em>Custom Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossmarkTypeImpl extends MinimalEObjectImpl.Container implements CrossmarkType {
	/**
	 * The default value of the '{@link #getCrossmarkVersion() <em>Crossmark Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossmarkVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CROSSMARK_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrossmarkVersion() <em>Crossmark Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossmarkVersion()
	 * @generated
	 * @ordered
	 */
	protected String crossmarkVersion = CROSSMARK_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossmarkPolicy() <em>Crossmark Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossmarkPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String CROSSMARK_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrossmarkPolicy() <em>Crossmark Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossmarkPolicy()
	 * @generated
	 * @ordered
	 */
	protected String crossmarkPolicy = CROSSMARK_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCrossmarkDomains() <em>Crossmark Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossmarkDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossmarkDomainsType> crossmarkDomains;

	/**
	 * The default value of the '{@link #isCrossmarkDomainExclusive() <em>Crossmark Domain Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrossmarkDomainExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CROSSMARK_DOMAIN_EXCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCrossmarkDomainExclusive() <em>Crossmark Domain Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrossmarkDomainExclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean crossmarkDomainExclusive = CROSSMARK_DOMAIN_EXCLUSIVE_EDEFAULT;

	/**
	 * This is true if the Crossmark Domain Exclusive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean crossmarkDomainExclusiveESet;

	/**
	 * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected UpdatesType updates;

	/**
	 * The cached value of the '{@link #getCustomMetadata() <em>Custom Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMetadata()
	 * @generated
	 * @ordered
	 */
	protected CustomMetadataType customMetadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossmarkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getCrossmarkType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCrossmarkVersion() {
		return crossmarkVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossmarkVersion(String newCrossmarkVersion) {
		String oldCrossmarkVersion = crossmarkVersion;
		crossmarkVersion = newCrossmarkVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CROSSMARK_TYPE__CROSSMARK_VERSION, oldCrossmarkVersion, crossmarkVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCrossmarkPolicy() {
		return crossmarkPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossmarkPolicy(String newCrossmarkPolicy) {
		String oldCrossmarkPolicy = crossmarkPolicy;
		crossmarkPolicy = newCrossmarkPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CROSSMARK_TYPE__CROSSMARK_POLICY, oldCrossmarkPolicy, crossmarkPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossmarkDomainsType> getCrossmarkDomains() {
		if (crossmarkDomains == null) {
			crossmarkDomains = new EObjectContainmentEList<CrossmarkDomainsType>(CrossmarkDomainsType.class, this, _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAINS);
		}
		return crossmarkDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCrossmarkDomainExclusive() {
		return crossmarkDomainExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossmarkDomainExclusive(boolean newCrossmarkDomainExclusive) {
		boolean oldCrossmarkDomainExclusive = crossmarkDomainExclusive;
		crossmarkDomainExclusive = newCrossmarkDomainExclusive;
		boolean oldCrossmarkDomainExclusiveESet = crossmarkDomainExclusiveESet;
		crossmarkDomainExclusiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAIN_EXCLUSIVE, oldCrossmarkDomainExclusive, crossmarkDomainExclusive, !oldCrossmarkDomainExclusiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCrossmarkDomainExclusive() {
		boolean oldCrossmarkDomainExclusive = crossmarkDomainExclusive;
		boolean oldCrossmarkDomainExclusiveESet = crossmarkDomainExclusiveESet;
		crossmarkDomainExclusive = CROSSMARK_DOMAIN_EXCLUSIVE_EDEFAULT;
		crossmarkDomainExclusiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAIN_EXCLUSIVE, oldCrossmarkDomainExclusive, CROSSMARK_DOMAIN_EXCLUSIVE_EDEFAULT, oldCrossmarkDomainExclusiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCrossmarkDomainExclusive() {
		return crossmarkDomainExclusiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdatesType getUpdates() {
		return updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdates(UpdatesType newUpdates, NotificationChain msgs) {
		UpdatesType oldUpdates = updates;
		updates = newUpdates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CROSSMARK_TYPE__UPDATES, oldUpdates, newUpdates);
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
	public void setUpdates(UpdatesType newUpdates) {
		if (newUpdates != updates) {
			NotificationChain msgs = null;
			if (updates != null)
				msgs = ((InternalEObject)updates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CROSSMARK_TYPE__UPDATES, null, msgs);
			if (newUpdates != null)
				msgs = ((InternalEObject)newUpdates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CROSSMARK_TYPE__UPDATES, null, msgs);
			msgs = basicSetUpdates(newUpdates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CROSSMARK_TYPE__UPDATES, newUpdates, newUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMetadataType getCustomMetadata() {
		return customMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomMetadata(CustomMetadataType newCustomMetadata, NotificationChain msgs) {
		CustomMetadataType oldCustomMetadata = customMetadata;
		customMetadata = newCustomMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CROSSMARK_TYPE__CUSTOM_METADATA, oldCustomMetadata, newCustomMetadata);
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
	public void setCustomMetadata(CustomMetadataType newCustomMetadata) {
		if (newCustomMetadata != customMetadata) {
			NotificationChain msgs = null;
			if (customMetadata != null)
				msgs = ((InternalEObject)customMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CROSSMARK_TYPE__CUSTOM_METADATA, null, msgs);
			if (newCustomMetadata != null)
				msgs = ((InternalEObject)newCustomMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CROSSMARK_TYPE__CUSTOM_METADATA, null, msgs);
			msgs = basicSetCustomMetadata(newCustomMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CROSSMARK_TYPE__CUSTOM_METADATA, newCustomMetadata, newCustomMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAINS:
				return ((InternalEList<?>)getCrossmarkDomains()).basicRemove(otherEnd, msgs);
			case _4Package.CROSSMARK_TYPE__UPDATES:
				return basicSetUpdates(null, msgs);
			case _4Package.CROSSMARK_TYPE__CUSTOM_METADATA:
				return basicSetCustomMetadata(null, msgs);
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
			case _4Package.CROSSMARK_TYPE__CROSSMARK_VERSION:
				return getCrossmarkVersion();
			case _4Package.CROSSMARK_TYPE__CROSSMARK_POLICY:
				return getCrossmarkPolicy();
			case _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAINS:
				return getCrossmarkDomains();
			case _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAIN_EXCLUSIVE:
				return isCrossmarkDomainExclusive();
			case _4Package.CROSSMARK_TYPE__UPDATES:
				return getUpdates();
			case _4Package.CROSSMARK_TYPE__CUSTOM_METADATA:
				return getCustomMetadata();
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
			case _4Package.CROSSMARK_TYPE__CROSSMARK_VERSION:
				setCrossmarkVersion((String)newValue);
				return;
			case _4Package.CROSSMARK_TYPE__CROSSMARK_POLICY:
				setCrossmarkPolicy((String)newValue);
				return;
			case _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAINS:
				getCrossmarkDomains().clear();
				getCrossmarkDomains().addAll((Collection<? extends CrossmarkDomainsType>)newValue);
				return;
			case _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAIN_EXCLUSIVE:
				setCrossmarkDomainExclusive((Boolean)newValue);
				return;
			case _4Package.CROSSMARK_TYPE__UPDATES:
				setUpdates((UpdatesType)newValue);
				return;
			case _4Package.CROSSMARK_TYPE__CUSTOM_METADATA:
				setCustomMetadata((CustomMetadataType)newValue);
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
			case _4Package.CROSSMARK_TYPE__CROSSMARK_VERSION:
				setCrossmarkVersion(CROSSMARK_VERSION_EDEFAULT);
				return;
			case _4Package.CROSSMARK_TYPE__CROSSMARK_POLICY:
				setCrossmarkPolicy(CROSSMARK_POLICY_EDEFAULT);
				return;
			case _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAINS:
				getCrossmarkDomains().clear();
				return;
			case _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAIN_EXCLUSIVE:
				unsetCrossmarkDomainExclusive();
				return;
			case _4Package.CROSSMARK_TYPE__UPDATES:
				setUpdates((UpdatesType)null);
				return;
			case _4Package.CROSSMARK_TYPE__CUSTOM_METADATA:
				setCustomMetadata((CustomMetadataType)null);
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
			case _4Package.CROSSMARK_TYPE__CROSSMARK_VERSION:
				return CROSSMARK_VERSION_EDEFAULT == null ? crossmarkVersion != null : !CROSSMARK_VERSION_EDEFAULT.equals(crossmarkVersion);
			case _4Package.CROSSMARK_TYPE__CROSSMARK_POLICY:
				return CROSSMARK_POLICY_EDEFAULT == null ? crossmarkPolicy != null : !CROSSMARK_POLICY_EDEFAULT.equals(crossmarkPolicy);
			case _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAINS:
				return crossmarkDomains != null && !crossmarkDomains.isEmpty();
			case _4Package.CROSSMARK_TYPE__CROSSMARK_DOMAIN_EXCLUSIVE:
				return isSetCrossmarkDomainExclusive();
			case _4Package.CROSSMARK_TYPE__UPDATES:
				return updates != null;
			case _4Package.CROSSMARK_TYPE__CUSTOM_METADATA:
				return customMetadata != null;
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
		result.append(" (crossmarkVersion: ");
		result.append(crossmarkVersion);
		result.append(", crossmarkPolicy: ");
		result.append(crossmarkPolicy);
		result.append(", crossmarkDomainExclusive: ");
		if (crossmarkDomainExclusiveESet) result.append(crossmarkDomainExclusive); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CrossmarkTypeImpl
