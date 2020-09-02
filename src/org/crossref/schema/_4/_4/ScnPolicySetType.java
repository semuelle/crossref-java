/**
 */
package org.crossref.schema._4._4;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scn Policy Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ScnPolicySetType#getScnPolicyRef <em>Scn Policy Ref</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ScnPolicySetType#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getScnPolicySetType()
 * @model extendedMetaData="name='scn_policy_set_._type' kind='elementOnly'"
 * @generated
 */
public interface ScnPolicySetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scn Policy Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ScnPolicyRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual SCN policy
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scn Policy Ref</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getScnPolicySetType_ScnPolicyRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scn_policy_ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScnPolicyRefType> getScnPolicyRef();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(XMLGregorianCalendar)
	 * @see org.crossref.schema._4._4._4Package#getScnPolicySetType_StartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='start_date'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ScnPolicySetType#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(XMLGregorianCalendar value);

} // ScnPolicySetType
