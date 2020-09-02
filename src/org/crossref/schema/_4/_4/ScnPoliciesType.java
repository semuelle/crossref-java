/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scn Policies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ScnPoliciesType#getScnPolicySet <em>Scn Policy Set</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getScnPoliciesType()
 * @model extendedMetaData="name='scn_policies_._type' kind='elementOnly'"
 * @generated
 */
public interface ScnPoliciesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scn Policy Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ScnPolicySetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A group of related SCN policies
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scn Policy Set</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getScnPoliciesType_ScnPolicySet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scn_policy_set' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScnPolicySetType> getScnPolicySet();

} // ScnPoliciesType
