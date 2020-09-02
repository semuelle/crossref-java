/**
 */
package org.crossref.relations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.relations.RelatedItemType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.crossref.relations.RelatedItemType#getInterWorkRelation <em>Inter Work Relation</em>}</li>
 *   <li>{@link org.crossref.relations.RelatedItemType#getIntraWorkRelation <em>Intra Work Relation</em>}</li>
 * </ul>
 *
 * @see org.crossref.relations.RelationsPackage#getRelatedItemType()
 * @model extendedMetaData="name='related_item_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A narrative description of the relationship target item
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.crossref.relations.RelationsPackage#getRelatedItemType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.crossref.relations.RelatedItemType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Inter Work Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Work Relation</em>' containment reference.
	 * @see #setInterWorkRelation(InterWorkRelationType)
	 * @see org.crossref.relations.RelationsPackage#getRelatedItemType_InterWorkRelation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inter_work_relation' namespace='##targetNamespace'"
	 * @generated
	 */
	InterWorkRelationType getInterWorkRelation();

	/**
	 * Sets the value of the '{@link org.crossref.relations.RelatedItemType#getInterWorkRelation <em>Inter Work Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Work Relation</em>' containment reference.
	 * @see #getInterWorkRelation()
	 * @generated
	 */
	void setInterWorkRelation(InterWorkRelationType value);

	/**
	 * Returns the value of the '<em><b>Intra Work Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intra Work Relation</em>' containment reference.
	 * @see #setIntraWorkRelation(IntraWorkRelationType)
	 * @see org.crossref.relations.RelationsPackage#getRelatedItemType_IntraWorkRelation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intra_work_relation' namespace='##targetNamespace'"
	 * @generated
	 */
	IntraWorkRelationType getIntraWorkRelation();

	/**
	 * Sets the value of the '{@link org.crossref.relations.RelatedItemType#getIntraWorkRelation <em>Intra Work Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intra Work Relation</em>' containment reference.
	 * @see #getIntraWorkRelation()
	 * @generated
	 */
	void setIntraWorkRelation(IntraWorkRelationType value);

} // RelatedItemType
