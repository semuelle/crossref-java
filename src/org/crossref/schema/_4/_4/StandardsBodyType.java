/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standards Body Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.StandardsBodyType#getStandardsBodyName <em>Standards Body Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StandardsBodyType#getStandardsBodyAcronym <em>Standards Body Acronym</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getStandardsBodyType()
 * @model extendedMetaData="name='standards_body_._type' kind='elementOnly'"
 * @generated
 */
public interface StandardsBodyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Standards Body Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the standards organization / publisher.
	 * 				Required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standards Body Name</em>' containment reference.
	 * @see #setStandardsBodyName(EObject)
	 * @see org.crossref.schema._4._4._4Package#getStandardsBodyType_StandardsBodyName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='standards_body_name' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getStandardsBodyName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StandardsBodyType#getStandardsBodyName <em>Standards Body Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standards Body Name</em>' containment reference.
	 * @see #getStandardsBodyName()
	 * @generated
	 */
	void setStandardsBodyName(EObject value);

	/**
	 * Returns the value of the '<em><b>Standards Body Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acronym for standards body. Will be used for query matching -
	 * 				required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standards Body Acronym</em>' containment reference.
	 * @see #setStandardsBodyAcronym(EObject)
	 * @see org.crossref.schema._4._4._4Package#getStandardsBodyType_StandardsBodyAcronym()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='standards_body_acronym' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getStandardsBodyAcronym();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StandardsBodyType#getStandardsBodyAcronym <em>Standards Body Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standards Body Acronym</em>' containment reference.
	 * @see #getStandardsBodyAcronym()
	 * @generated
	 */
	void setStandardsBodyAcronym(EObject value);

} // StandardsBodyType
