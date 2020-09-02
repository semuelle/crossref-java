/**
 */
package org.crossref.relations.impl;

import org.crossref.relations.DescriptionType;
import org.crossref.relations.InterWorkRelationType;
import org.crossref.relations.IntraWorkRelationType;
import org.crossref.relations.RelatedItemType;
import org.crossref.relations.RelationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.relations.impl.RelatedItemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.crossref.relations.impl.RelatedItemTypeImpl#getInterWorkRelation <em>Inter Work Relation</em>}</li>
 *   <li>{@link org.crossref.relations.impl.RelatedItemTypeImpl#getIntraWorkRelation <em>Intra Work Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedItemTypeImpl extends MinimalEObjectImpl.Container implements RelatedItemType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getInterWorkRelation() <em>Inter Work Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterWorkRelation()
	 * @generated
	 * @ordered
	 */
	protected InterWorkRelationType interWorkRelation;

	/**
	 * The cached value of the '{@link #getIntraWorkRelation() <em>Intra Work Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntraWorkRelation()
	 * @generated
	 * @ordered
	 */
	protected IntraWorkRelationType intraWorkRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.RELATED_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATED_ITEM_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RelationsPackage.RELATED_ITEM_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RelationsPackage.RELATED_ITEM_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATED_ITEM_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterWorkRelationType getInterWorkRelation() {
		return interWorkRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterWorkRelation(InterWorkRelationType newInterWorkRelation, NotificationChain msgs) {
		InterWorkRelationType oldInterWorkRelation = interWorkRelation;
		interWorkRelation = newInterWorkRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATED_ITEM_TYPE__INTER_WORK_RELATION, oldInterWorkRelation, newInterWorkRelation);
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
	public void setInterWorkRelation(InterWorkRelationType newInterWorkRelation) {
		if (newInterWorkRelation != interWorkRelation) {
			NotificationChain msgs = null;
			if (interWorkRelation != null)
				msgs = ((InternalEObject)interWorkRelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RelationsPackage.RELATED_ITEM_TYPE__INTER_WORK_RELATION, null, msgs);
			if (newInterWorkRelation != null)
				msgs = ((InternalEObject)newInterWorkRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RelationsPackage.RELATED_ITEM_TYPE__INTER_WORK_RELATION, null, msgs);
			msgs = basicSetInterWorkRelation(newInterWorkRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATED_ITEM_TYPE__INTER_WORK_RELATION, newInterWorkRelation, newInterWorkRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntraWorkRelationType getIntraWorkRelation() {
		return intraWorkRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntraWorkRelation(IntraWorkRelationType newIntraWorkRelation, NotificationChain msgs) {
		IntraWorkRelationType oldIntraWorkRelation = intraWorkRelation;
		intraWorkRelation = newIntraWorkRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATED_ITEM_TYPE__INTRA_WORK_RELATION, oldIntraWorkRelation, newIntraWorkRelation);
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
	public void setIntraWorkRelation(IntraWorkRelationType newIntraWorkRelation) {
		if (newIntraWorkRelation != intraWorkRelation) {
			NotificationChain msgs = null;
			if (intraWorkRelation != null)
				msgs = ((InternalEObject)intraWorkRelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RelationsPackage.RELATED_ITEM_TYPE__INTRA_WORK_RELATION, null, msgs);
			if (newIntraWorkRelation != null)
				msgs = ((InternalEObject)newIntraWorkRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RelationsPackage.RELATED_ITEM_TYPE__INTRA_WORK_RELATION, null, msgs);
			msgs = basicSetIntraWorkRelation(newIntraWorkRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATED_ITEM_TYPE__INTRA_WORK_RELATION, newIntraWorkRelation, newIntraWorkRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationsPackage.RELATED_ITEM_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case RelationsPackage.RELATED_ITEM_TYPE__INTER_WORK_RELATION:
				return basicSetInterWorkRelation(null, msgs);
			case RelationsPackage.RELATED_ITEM_TYPE__INTRA_WORK_RELATION:
				return basicSetIntraWorkRelation(null, msgs);
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
			case RelationsPackage.RELATED_ITEM_TYPE__DESCRIPTION:
				return getDescription();
			case RelationsPackage.RELATED_ITEM_TYPE__INTER_WORK_RELATION:
				return getInterWorkRelation();
			case RelationsPackage.RELATED_ITEM_TYPE__INTRA_WORK_RELATION:
				return getIntraWorkRelation();
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
			case RelationsPackage.RELATED_ITEM_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case RelationsPackage.RELATED_ITEM_TYPE__INTER_WORK_RELATION:
				setInterWorkRelation((InterWorkRelationType)newValue);
				return;
			case RelationsPackage.RELATED_ITEM_TYPE__INTRA_WORK_RELATION:
				setIntraWorkRelation((IntraWorkRelationType)newValue);
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
			case RelationsPackage.RELATED_ITEM_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case RelationsPackage.RELATED_ITEM_TYPE__INTER_WORK_RELATION:
				setInterWorkRelation((InterWorkRelationType)null);
				return;
			case RelationsPackage.RELATED_ITEM_TYPE__INTRA_WORK_RELATION:
				setIntraWorkRelation((IntraWorkRelationType)null);
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
			case RelationsPackage.RELATED_ITEM_TYPE__DESCRIPTION:
				return description != null;
			case RelationsPackage.RELATED_ITEM_TYPE__INTER_WORK_RELATION:
				return interWorkRelation != null;
			case RelationsPackage.RELATED_ITEM_TYPE__INTRA_WORK_RELATION:
				return intraWorkRelation != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatedItemTypeImpl
