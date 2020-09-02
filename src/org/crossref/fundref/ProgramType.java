/**
 */
package org.crossref.fundref;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.fundref.ProgramType#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.crossref.fundref.ProgramType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.crossref.fundref.FundrefPackage#getProgramType()
 * @model extendedMetaData="name='program_._type' kind='elementOnly'"
 * @generated
 */
public interface ProgramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.fundref.AssertionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FundRef attributes included in assertion are:
	 * 
	 * fundgroup: used to group funding info for items with multiple funding sources. Required for items with multiple award_number assertions, optional for items with a single award_number
	 * 
	 * funder_identifier: funding agency identifier, must be nested within the funder_name assertion
	 * 
	 * funder_name: name of the funding agency (required)
	 * 
	 * award_number: grant number or other fund identifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference list.
	 * @see org.crossref.fundref.FundrefPackage#getProgramType_Assertion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assertion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssertionType> getAssertion();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"fundref"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.crossref.fundref.FundrefPackage#getProgramType_Name()
	 * @model default="fundref" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.crossref.fundref.ProgramType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.crossref.fundref.ProgramType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.crossref.fundref.ProgramType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // ProgramType
