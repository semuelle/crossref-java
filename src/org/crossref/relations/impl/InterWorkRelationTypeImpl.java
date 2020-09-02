/**
 */
package org.crossref.relations.impl;

import org.crossref.relations.IdentifierTypeType;
import org.crossref.relations.InterWorkRelationType;
import org.crossref.relations.RelationsPackage;
import org.crossref.relations.RelationshipTypeType1;

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
 * An implementation of the model object '<em><b>Inter Work Relation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.relations.impl.InterWorkRelationTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.relations.impl.InterWorkRelationTypeImpl#getIdentifierType <em>Identifier Type</em>}</li>
 *   <li>{@link org.crossref.relations.impl.InterWorkRelationTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.crossref.relations.impl.InterWorkRelationTypeImpl#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterWorkRelationTypeImpl extends MinimalEObjectImpl.Container implements InterWorkRelationType {
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
	 * The default value of the '{@link #getIdentifierType() <em>Identifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierType()
	 * @generated
	 * @ordered
	 */
	protected static final IdentifierTypeType IDENTIFIER_TYPE_EDEFAULT = IdentifierTypeType.DOI;

	/**
	 * The cached value of the '{@link #getIdentifierType() <em>Identifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierType()
	 * @generated
	 * @ordered
	 */
	protected IdentifierTypeType identifierType = IDENTIFIER_TYPE_EDEFAULT;

	/**
	 * This is true if the Identifier Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean identifierTypeESet;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected static final RelationshipTypeType1 RELATIONSHIP_TYPE_EDEFAULT = RelationshipTypeType1.IS_DERIVED_FROM;

	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected RelationshipTypeType1 relationshipType = RELATIONSHIP_TYPE_EDEFAULT;

	/**
	 * This is true if the Relationship Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterWorkRelationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.INTER_WORK_RELATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, RelationsPackage.INTER_WORK_RELATION_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierTypeType getIdentifierType() {
		return identifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifierType(IdentifierTypeType newIdentifierType) {
		IdentifierTypeType oldIdentifierType = identifierType;
		identifierType = newIdentifierType == null ? IDENTIFIER_TYPE_EDEFAULT : newIdentifierType;
		boolean oldIdentifierTypeESet = identifierTypeESet;
		identifierTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.INTER_WORK_RELATION_TYPE__IDENTIFIER_TYPE, oldIdentifierType, identifierType, !oldIdentifierTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIdentifierType() {
		IdentifierTypeType oldIdentifierType = identifierType;
		boolean oldIdentifierTypeESet = identifierTypeESet;
		identifierType = IDENTIFIER_TYPE_EDEFAULT;
		identifierTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RelationsPackage.INTER_WORK_RELATION_TYPE__IDENTIFIER_TYPE, oldIdentifierType, IDENTIFIER_TYPE_EDEFAULT, oldIdentifierTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIdentifierType() {
		return identifierTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.INTER_WORK_RELATION_TYPE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipTypeType1 getRelationshipType() {
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipType(RelationshipTypeType1 newRelationshipType) {
		RelationshipTypeType1 oldRelationshipType = relationshipType;
		relationshipType = newRelationshipType == null ? RELATIONSHIP_TYPE_EDEFAULT : newRelationshipType;
		boolean oldRelationshipTypeESet = relationshipTypeESet;
		relationshipTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.INTER_WORK_RELATION_TYPE__RELATIONSHIP_TYPE, oldRelationshipType, relationshipType, !oldRelationshipTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRelationshipType() {
		RelationshipTypeType1 oldRelationshipType = relationshipType;
		boolean oldRelationshipTypeESet = relationshipTypeESet;
		relationshipType = RELATIONSHIP_TYPE_EDEFAULT;
		relationshipTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RelationsPackage.INTER_WORK_RELATION_TYPE__RELATIONSHIP_TYPE, oldRelationshipType, RELATIONSHIP_TYPE_EDEFAULT, oldRelationshipTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRelationshipType() {
		return relationshipTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationsPackage.INTER_WORK_RELATION_TYPE__MIXED:
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
			case RelationsPackage.INTER_WORK_RELATION_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case RelationsPackage.INTER_WORK_RELATION_TYPE__IDENTIFIER_TYPE:
				return getIdentifierType();
			case RelationsPackage.INTER_WORK_RELATION_TYPE__NAMESPACE:
				return getNamespace();
			case RelationsPackage.INTER_WORK_RELATION_TYPE__RELATIONSHIP_TYPE:
				return getRelationshipType();
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
			case RelationsPackage.INTER_WORK_RELATION_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case RelationsPackage.INTER_WORK_RELATION_TYPE__IDENTIFIER_TYPE:
				setIdentifierType((IdentifierTypeType)newValue);
				return;
			case RelationsPackage.INTER_WORK_RELATION_TYPE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case RelationsPackage.INTER_WORK_RELATION_TYPE__RELATIONSHIP_TYPE:
				setRelationshipType((RelationshipTypeType1)newValue);
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
			case RelationsPackage.INTER_WORK_RELATION_TYPE__MIXED:
				getMixed().clear();
				return;
			case RelationsPackage.INTER_WORK_RELATION_TYPE__IDENTIFIER_TYPE:
				unsetIdentifierType();
				return;
			case RelationsPackage.INTER_WORK_RELATION_TYPE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case RelationsPackage.INTER_WORK_RELATION_TYPE__RELATIONSHIP_TYPE:
				unsetRelationshipType();
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
			case RelationsPackage.INTER_WORK_RELATION_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case RelationsPackage.INTER_WORK_RELATION_TYPE__IDENTIFIER_TYPE:
				return isSetIdentifierType();
			case RelationsPackage.INTER_WORK_RELATION_TYPE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case RelationsPackage.INTER_WORK_RELATION_TYPE__RELATIONSHIP_TYPE:
				return isSetRelationshipType();
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
		result.append(", identifierType: ");
		if (identifierTypeESet) result.append(identifierType); else result.append("<unset>");
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", relationshipType: ");
		if (relationshipTypeESet) result.append(relationshipType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InterWorkRelationTypeImpl
