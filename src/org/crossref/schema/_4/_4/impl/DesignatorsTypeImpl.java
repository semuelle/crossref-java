/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.DesignatorsType;
import org.crossref.schema._4._4.StdAltAsPublishedType;
import org.crossref.schema._4._4.StdAsPublishedType;
import org.crossref.schema._4._4.StdDesignatorT;
import org.crossref.schema._4._4.StdSetDesignatorType;
import org.crossref.schema._4._4.StdUndatedDesignatorType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Designators Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.DesignatorsTypeImpl#getStdFamilyDesignator <em>Std Family Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DesignatorsTypeImpl#getStdSetDesignator <em>Std Set Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DesignatorsTypeImpl#getStdUndatedDesignator <em>Std Undated Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DesignatorsTypeImpl#getStdAsPublished <em>Std As Published</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DesignatorsTypeImpl#getStdAltAsPublished <em>Std Alt As Published</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DesignatorsTypeImpl#getStdSupersedes <em>Std Supersedes</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DesignatorsTypeImpl#getStdAdoptedFrom <em>Std Adopted From</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.DesignatorsTypeImpl#getStdRevisionOf <em>Std Revision Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignatorsTypeImpl extends MinimalEObjectImpl.Container implements DesignatorsType {
	/**
	 * The cached value of the '{@link #getStdFamilyDesignator() <em>Std Family Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdFamilyDesignator()
	 * @generated
	 * @ordered
	 */
	protected StdDesignatorT stdFamilyDesignator;

	/**
	 * The cached value of the '{@link #getStdSetDesignator() <em>Std Set Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdSetDesignator()
	 * @generated
	 * @ordered
	 */
	protected StdSetDesignatorType stdSetDesignator;

	/**
	 * The cached value of the '{@link #getStdUndatedDesignator() <em>Std Undated Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdUndatedDesignator()
	 * @generated
	 * @ordered
	 */
	protected StdUndatedDesignatorType stdUndatedDesignator;

	/**
	 * The cached value of the '{@link #getStdAsPublished() <em>Std As Published</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdAsPublished()
	 * @generated
	 * @ordered
	 */
	protected StdAsPublishedType stdAsPublished;

	/**
	 * The cached value of the '{@link #getStdAltAsPublished() <em>Std Alt As Published</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdAltAsPublished()
	 * @generated
	 * @ordered
	 */
	protected EList<StdAltAsPublishedType> stdAltAsPublished;

	/**
	 * The cached value of the '{@link #getStdSupersedes() <em>Std Supersedes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdSupersedes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stdSupersedes;

	/**
	 * The cached value of the '{@link #getStdAdoptedFrom() <em>Std Adopted From</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdAdoptedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stdAdoptedFrom;

	/**
	 * The cached value of the '{@link #getStdRevisionOf() <em>Std Revision Of</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdRevisionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stdRevisionOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignatorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getDesignatorsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdDesignatorT getStdFamilyDesignator() {
		return stdFamilyDesignator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStdFamilyDesignator(StdDesignatorT newStdFamilyDesignator, NotificationChain msgs) {
		StdDesignatorT oldStdFamilyDesignator = stdFamilyDesignator;
		stdFamilyDesignator = newStdFamilyDesignator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.DESIGNATORS_TYPE__STD_FAMILY_DESIGNATOR, oldStdFamilyDesignator, newStdFamilyDesignator);
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
	public void setStdFamilyDesignator(StdDesignatorT newStdFamilyDesignator) {
		if (newStdFamilyDesignator != stdFamilyDesignator) {
			NotificationChain msgs = null;
			if (stdFamilyDesignator != null)
				msgs = ((InternalEObject)stdFamilyDesignator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.DESIGNATORS_TYPE__STD_FAMILY_DESIGNATOR, null, msgs);
			if (newStdFamilyDesignator != null)
				msgs = ((InternalEObject)newStdFamilyDesignator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.DESIGNATORS_TYPE__STD_FAMILY_DESIGNATOR, null, msgs);
			msgs = basicSetStdFamilyDesignator(newStdFamilyDesignator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DESIGNATORS_TYPE__STD_FAMILY_DESIGNATOR, newStdFamilyDesignator, newStdFamilyDesignator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdSetDesignatorType getStdSetDesignator() {
		return stdSetDesignator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStdSetDesignator(StdSetDesignatorType newStdSetDesignator, NotificationChain msgs) {
		StdSetDesignatorType oldStdSetDesignator = stdSetDesignator;
		stdSetDesignator = newStdSetDesignator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.DESIGNATORS_TYPE__STD_SET_DESIGNATOR, oldStdSetDesignator, newStdSetDesignator);
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
	public void setStdSetDesignator(StdSetDesignatorType newStdSetDesignator) {
		if (newStdSetDesignator != stdSetDesignator) {
			NotificationChain msgs = null;
			if (stdSetDesignator != null)
				msgs = ((InternalEObject)stdSetDesignator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.DESIGNATORS_TYPE__STD_SET_DESIGNATOR, null, msgs);
			if (newStdSetDesignator != null)
				msgs = ((InternalEObject)newStdSetDesignator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.DESIGNATORS_TYPE__STD_SET_DESIGNATOR, null, msgs);
			msgs = basicSetStdSetDesignator(newStdSetDesignator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DESIGNATORS_TYPE__STD_SET_DESIGNATOR, newStdSetDesignator, newStdSetDesignator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdUndatedDesignatorType getStdUndatedDesignator() {
		return stdUndatedDesignator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStdUndatedDesignator(StdUndatedDesignatorType newStdUndatedDesignator, NotificationChain msgs) {
		StdUndatedDesignatorType oldStdUndatedDesignator = stdUndatedDesignator;
		stdUndatedDesignator = newStdUndatedDesignator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.DESIGNATORS_TYPE__STD_UNDATED_DESIGNATOR, oldStdUndatedDesignator, newStdUndatedDesignator);
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
	public void setStdUndatedDesignator(StdUndatedDesignatorType newStdUndatedDesignator) {
		if (newStdUndatedDesignator != stdUndatedDesignator) {
			NotificationChain msgs = null;
			if (stdUndatedDesignator != null)
				msgs = ((InternalEObject)stdUndatedDesignator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.DESIGNATORS_TYPE__STD_UNDATED_DESIGNATOR, null, msgs);
			if (newStdUndatedDesignator != null)
				msgs = ((InternalEObject)newStdUndatedDesignator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.DESIGNATORS_TYPE__STD_UNDATED_DESIGNATOR, null, msgs);
			msgs = basicSetStdUndatedDesignator(newStdUndatedDesignator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DESIGNATORS_TYPE__STD_UNDATED_DESIGNATOR, newStdUndatedDesignator, newStdUndatedDesignator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StdAsPublishedType getStdAsPublished() {
		return stdAsPublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStdAsPublished(StdAsPublishedType newStdAsPublished, NotificationChain msgs) {
		StdAsPublishedType oldStdAsPublished = stdAsPublished;
		stdAsPublished = newStdAsPublished;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.DESIGNATORS_TYPE__STD_AS_PUBLISHED, oldStdAsPublished, newStdAsPublished);
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
	public void setStdAsPublished(StdAsPublishedType newStdAsPublished) {
		if (newStdAsPublished != stdAsPublished) {
			NotificationChain msgs = null;
			if (stdAsPublished != null)
				msgs = ((InternalEObject)stdAsPublished).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.DESIGNATORS_TYPE__STD_AS_PUBLISHED, null, msgs);
			if (newStdAsPublished != null)
				msgs = ((InternalEObject)newStdAsPublished).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.DESIGNATORS_TYPE__STD_AS_PUBLISHED, null, msgs);
			msgs = basicSetStdAsPublished(newStdAsPublished, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.DESIGNATORS_TYPE__STD_AS_PUBLISHED, newStdAsPublished, newStdAsPublished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StdAltAsPublishedType> getStdAltAsPublished() {
		if (stdAltAsPublished == null) {
			stdAltAsPublished = new EObjectContainmentEList<StdAltAsPublishedType>(StdAltAsPublishedType.class, this, _4Package.DESIGNATORS_TYPE__STD_ALT_AS_PUBLISHED);
		}
		return stdAltAsPublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStdSupersedes() {
		if (stdSupersedes == null) {
			stdSupersedes = new EDataTypeEList<String>(String.class, this, _4Package.DESIGNATORS_TYPE__STD_SUPERSEDES);
		}
		return stdSupersedes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStdAdoptedFrom() {
		if (stdAdoptedFrom == null) {
			stdAdoptedFrom = new EDataTypeEList<String>(String.class, this, _4Package.DESIGNATORS_TYPE__STD_ADOPTED_FROM);
		}
		return stdAdoptedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStdRevisionOf() {
		if (stdRevisionOf == null) {
			stdRevisionOf = new EDataTypeEList<String>(String.class, this, _4Package.DESIGNATORS_TYPE__STD_REVISION_OF);
		}
		return stdRevisionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.DESIGNATORS_TYPE__STD_FAMILY_DESIGNATOR:
				return basicSetStdFamilyDesignator(null, msgs);
			case _4Package.DESIGNATORS_TYPE__STD_SET_DESIGNATOR:
				return basicSetStdSetDesignator(null, msgs);
			case _4Package.DESIGNATORS_TYPE__STD_UNDATED_DESIGNATOR:
				return basicSetStdUndatedDesignator(null, msgs);
			case _4Package.DESIGNATORS_TYPE__STD_AS_PUBLISHED:
				return basicSetStdAsPublished(null, msgs);
			case _4Package.DESIGNATORS_TYPE__STD_ALT_AS_PUBLISHED:
				return ((InternalEList<?>)getStdAltAsPublished()).basicRemove(otherEnd, msgs);
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
			case _4Package.DESIGNATORS_TYPE__STD_FAMILY_DESIGNATOR:
				return getStdFamilyDesignator();
			case _4Package.DESIGNATORS_TYPE__STD_SET_DESIGNATOR:
				return getStdSetDesignator();
			case _4Package.DESIGNATORS_TYPE__STD_UNDATED_DESIGNATOR:
				return getStdUndatedDesignator();
			case _4Package.DESIGNATORS_TYPE__STD_AS_PUBLISHED:
				return getStdAsPublished();
			case _4Package.DESIGNATORS_TYPE__STD_ALT_AS_PUBLISHED:
				return getStdAltAsPublished();
			case _4Package.DESIGNATORS_TYPE__STD_SUPERSEDES:
				return getStdSupersedes();
			case _4Package.DESIGNATORS_TYPE__STD_ADOPTED_FROM:
				return getStdAdoptedFrom();
			case _4Package.DESIGNATORS_TYPE__STD_REVISION_OF:
				return getStdRevisionOf();
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
			case _4Package.DESIGNATORS_TYPE__STD_FAMILY_DESIGNATOR:
				setStdFamilyDesignator((StdDesignatorT)newValue);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_SET_DESIGNATOR:
				setStdSetDesignator((StdSetDesignatorType)newValue);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_UNDATED_DESIGNATOR:
				setStdUndatedDesignator((StdUndatedDesignatorType)newValue);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_AS_PUBLISHED:
				setStdAsPublished((StdAsPublishedType)newValue);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_ALT_AS_PUBLISHED:
				getStdAltAsPublished().clear();
				getStdAltAsPublished().addAll((Collection<? extends StdAltAsPublishedType>)newValue);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_SUPERSEDES:
				getStdSupersedes().clear();
				getStdSupersedes().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_ADOPTED_FROM:
				getStdAdoptedFrom().clear();
				getStdAdoptedFrom().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_REVISION_OF:
				getStdRevisionOf().clear();
				getStdRevisionOf().addAll((Collection<? extends String>)newValue);
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
			case _4Package.DESIGNATORS_TYPE__STD_FAMILY_DESIGNATOR:
				setStdFamilyDesignator((StdDesignatorT)null);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_SET_DESIGNATOR:
				setStdSetDesignator((StdSetDesignatorType)null);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_UNDATED_DESIGNATOR:
				setStdUndatedDesignator((StdUndatedDesignatorType)null);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_AS_PUBLISHED:
				setStdAsPublished((StdAsPublishedType)null);
				return;
			case _4Package.DESIGNATORS_TYPE__STD_ALT_AS_PUBLISHED:
				getStdAltAsPublished().clear();
				return;
			case _4Package.DESIGNATORS_TYPE__STD_SUPERSEDES:
				getStdSupersedes().clear();
				return;
			case _4Package.DESIGNATORS_TYPE__STD_ADOPTED_FROM:
				getStdAdoptedFrom().clear();
				return;
			case _4Package.DESIGNATORS_TYPE__STD_REVISION_OF:
				getStdRevisionOf().clear();
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
			case _4Package.DESIGNATORS_TYPE__STD_FAMILY_DESIGNATOR:
				return stdFamilyDesignator != null;
			case _4Package.DESIGNATORS_TYPE__STD_SET_DESIGNATOR:
				return stdSetDesignator != null;
			case _4Package.DESIGNATORS_TYPE__STD_UNDATED_DESIGNATOR:
				return stdUndatedDesignator != null;
			case _4Package.DESIGNATORS_TYPE__STD_AS_PUBLISHED:
				return stdAsPublished != null;
			case _4Package.DESIGNATORS_TYPE__STD_ALT_AS_PUBLISHED:
				return stdAltAsPublished != null && !stdAltAsPublished.isEmpty();
			case _4Package.DESIGNATORS_TYPE__STD_SUPERSEDES:
				return stdSupersedes != null && !stdSupersedes.isEmpty();
			case _4Package.DESIGNATORS_TYPE__STD_ADOPTED_FROM:
				return stdAdoptedFrom != null && !stdAdoptedFrom.isEmpty();
			case _4Package.DESIGNATORS_TYPE__STD_REVISION_OF:
				return stdRevisionOf != null && !stdRevisionOf.isEmpty();
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
		result.append(" (stdSupersedes: ");
		result.append(stdSupersedes);
		result.append(", stdAdoptedFrom: ");
		result.append(stdAdoptedFrom);
		result.append(", stdRevisionOf: ");
		result.append(stdRevisionOf);
		result.append(')');
		return result.toString();
	}

} //DesignatorsTypeImpl
