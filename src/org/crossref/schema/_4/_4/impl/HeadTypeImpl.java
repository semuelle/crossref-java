/**
 */
package org.crossref.schema._4._4.impl;

import java.math.BigInteger;

import org.crossref.schema._4._4.DepositorType;
import org.crossref.schema._4._4.HeadType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.HeadTypeImpl#getDoiBatchId <em>Doi Batch Id</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.HeadTypeImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.HeadTypeImpl#getDepositor <em>Depositor</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.HeadTypeImpl#getRegistrant <em>Registrant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadTypeImpl extends MinimalEObjectImpl.Container implements HeadType {
	/**
	 * The default value of the '{@link #getDoiBatchId() <em>Doi Batch Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoiBatchId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOI_BATCH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoiBatchId() <em>Doi Batch Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoiBatchId()
	 * @generated
	 * @ordered
	 */
	protected String doiBatchId = DOI_BATCH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected BigInteger timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepositor() <em>Depositor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositor()
	 * @generated
	 * @ordered
	 */
	protected DepositorType depositor;

	/**
	 * The default value of the '{@link #getRegistrant() <em>Registrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrant()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistrant() <em>Registrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrant()
	 * @generated
	 * @ordered
	 */
	protected String registrant = REGISTRANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getHeadType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoiBatchId() {
		return doiBatchId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoiBatchId(String newDoiBatchId) {
		String oldDoiBatchId = doiBatchId;
		doiBatchId = newDoiBatchId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.HEAD_TYPE__DOI_BATCH_ID, oldDoiBatchId, doiBatchId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(BigInteger newTimestamp) {
		BigInteger oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.HEAD_TYPE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepositorType getDepositor() {
		return depositor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepositor(DepositorType newDepositor, NotificationChain msgs) {
		DepositorType oldDepositor = depositor;
		depositor = newDepositor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.HEAD_TYPE__DEPOSITOR, oldDepositor, newDepositor);
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
	public void setDepositor(DepositorType newDepositor) {
		if (newDepositor != depositor) {
			NotificationChain msgs = null;
			if (depositor != null)
				msgs = ((InternalEObject)depositor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.HEAD_TYPE__DEPOSITOR, null, msgs);
			if (newDepositor != null)
				msgs = ((InternalEObject)newDepositor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.HEAD_TYPE__DEPOSITOR, null, msgs);
			msgs = basicSetDepositor(newDepositor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.HEAD_TYPE__DEPOSITOR, newDepositor, newDepositor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistrant() {
		return registrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistrant(String newRegistrant) {
		String oldRegistrant = registrant;
		registrant = newRegistrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.HEAD_TYPE__REGISTRANT, oldRegistrant, registrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.HEAD_TYPE__DEPOSITOR:
				return basicSetDepositor(null, msgs);
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
			case _4Package.HEAD_TYPE__DOI_BATCH_ID:
				return getDoiBatchId();
			case _4Package.HEAD_TYPE__TIMESTAMP:
				return getTimestamp();
			case _4Package.HEAD_TYPE__DEPOSITOR:
				return getDepositor();
			case _4Package.HEAD_TYPE__REGISTRANT:
				return getRegistrant();
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
			case _4Package.HEAD_TYPE__DOI_BATCH_ID:
				setDoiBatchId((String)newValue);
				return;
			case _4Package.HEAD_TYPE__TIMESTAMP:
				setTimestamp((BigInteger)newValue);
				return;
			case _4Package.HEAD_TYPE__DEPOSITOR:
				setDepositor((DepositorType)newValue);
				return;
			case _4Package.HEAD_TYPE__REGISTRANT:
				setRegistrant((String)newValue);
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
			case _4Package.HEAD_TYPE__DOI_BATCH_ID:
				setDoiBatchId(DOI_BATCH_ID_EDEFAULT);
				return;
			case _4Package.HEAD_TYPE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case _4Package.HEAD_TYPE__DEPOSITOR:
				setDepositor((DepositorType)null);
				return;
			case _4Package.HEAD_TYPE__REGISTRANT:
				setRegistrant(REGISTRANT_EDEFAULT);
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
			case _4Package.HEAD_TYPE__DOI_BATCH_ID:
				return DOI_BATCH_ID_EDEFAULT == null ? doiBatchId != null : !DOI_BATCH_ID_EDEFAULT.equals(doiBatchId);
			case _4Package.HEAD_TYPE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case _4Package.HEAD_TYPE__DEPOSITOR:
				return depositor != null;
			case _4Package.HEAD_TYPE__REGISTRANT:
				return REGISTRANT_EDEFAULT == null ? registrant != null : !REGISTRANT_EDEFAULT.equals(registrant);
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
		result.append(" (doiBatchId: ");
		result.append(doiBatchId);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", registrant: ");
		result.append(registrant);
		result.append(')');
		return result.toString();
	}

} //HeadTypeImpl
