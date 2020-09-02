/**
 */
package org.crossref.relations;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Work Relation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.relations.InterWorkRelationType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.relations.InterWorkRelationType#getIdentifierType <em>Identifier Type</em>}</li>
 *   <li>{@link org.crossref.relations.InterWorkRelationType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.crossref.relations.InterWorkRelationType#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 *
 * @see org.crossref.relations.RelationsPackage#getInterWorkRelationType()
 * @model extendedMetaData="name='inter_work_relation_._type' kind='mixed'"
 * @generated
 */
public interface InterWorkRelationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.crossref.relations.RelationsPackage#getInterWorkRelationType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Identifier Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.relations.IdentifierTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier Type</em>' attribute.
	 * @see org.crossref.relations.IdentifierTypeType
	 * @see #isSetIdentifierType()
	 * @see #unsetIdentifierType()
	 * @see #setIdentifierType(IdentifierTypeType)
	 * @see org.crossref.relations.RelationsPackage#getInterWorkRelationType_IdentifierType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='identifier-type'"
	 * @generated
	 */
	IdentifierTypeType getIdentifierType();

	/**
	 * Sets the value of the '{@link org.crossref.relations.InterWorkRelationType#getIdentifierType <em>Identifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Type</em>' attribute.
	 * @see org.crossref.relations.IdentifierTypeType
	 * @see #isSetIdentifierType()
	 * @see #unsetIdentifierType()
	 * @see #getIdentifierType()
	 * @generated
	 */
	void setIdentifierType(IdentifierTypeType value);

	/**
	 * Unsets the value of the '{@link org.crossref.relations.InterWorkRelationType#getIdentifierType <em>Identifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdentifierType()
	 * @see #getIdentifierType()
	 * @see #setIdentifierType(IdentifierTypeType)
	 * @generated
	 */
	void unsetIdentifierType();

	/**
	 * Returns whether the value of the '{@link org.crossref.relations.InterWorkRelationType#getIdentifierType <em>Identifier Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Identifier Type</em>' attribute is set.
	 * @see #unsetIdentifierType()
	 * @see #getIdentifierType()
	 * @see #setIdentifierType(IdentifierTypeType)
	 * @generated
	 */
	boolean isSetIdentifierType();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier systems may require a namespace that is needed in addition to the identifer value to provide uniqueness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.crossref.relations.RelationsPackage#getInterWorkRelationType_Namespace()
	 * @model dataType="org.crossref.relations.NamespaceType"
	 *        extendedMetaData="kind='attribute' name='namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.crossref.relations.InterWorkRelationType#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.relations.RelationshipTypeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Used to describe relations between items that are not the same work.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see org.crossref.relations.RelationshipTypeType1
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #setRelationshipType(RelationshipTypeType1)
	 * @see org.crossref.relations.RelationsPackage#getInterWorkRelationType_RelationshipType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='relationship-type'"
	 * @generated
	 */
	RelationshipTypeType1 getRelationshipType();

	/**
	 * Sets the value of the '{@link org.crossref.relations.InterWorkRelationType#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see org.crossref.relations.RelationshipTypeType1
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(RelationshipTypeType1 value);

	/**
	 * Unsets the value of the '{@link org.crossref.relations.InterWorkRelationType#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(RelationshipTypeType1)
	 * @generated
	 */
	void unsetRelationshipType();

	/**
	 * Returns whether the value of the '{@link org.crossref.relations.InterWorkRelationType#getRelationshipType <em>Relationship Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Type</em>' attribute is set.
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(RelationshipTypeType1)
	 * @generated
	 */
	boolean isSetRelationshipType();

} // InterWorkRelationType
