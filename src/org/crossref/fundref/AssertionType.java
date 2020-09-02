/**
 */
package org.crossref.fundref;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.fundref.AssertionType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.fundref.AssertionType#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.crossref.fundref.AssertionType#getName <em>Name</em>}</li>
 *   <li>{@link org.crossref.fundref.AssertionType#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see org.crossref.fundref.FundrefPackage#getAssertionType()
 * @model extendedMetaData="name='assertion_._type' kind='mixed'"
 * @generated
 */
public interface AssertionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.crossref.fundref.FundrefPackage#getAssertionType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.crossref.fundref.FundrefPackage#getAssertionType_Assertion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assertion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssertionType> getAssertion();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.fundref.NameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.crossref.fundref.NameType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(NameType)
	 * @see org.crossref.fundref.FundrefPackage#getAssertionType_Name()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.crossref.fundref.AssertionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see org.crossref.fundref.NameType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Unsets the value of the '{@link org.crossref.fundref.AssertionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(NameType)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.crossref.fundref.AssertionType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(NameType)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * The default value is <code>"publisher"</code>.
	 * The literals are from the enumeration {@link org.crossref.fundref.ProviderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see org.crossref.fundref.ProviderType
	 * @see #isSetProvider()
	 * @see #unsetProvider()
	 * @see #setProvider(ProviderType)
	 * @see org.crossref.fundref.FundrefPackage#getAssertionType_Provider()
	 * @model default="publisher" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='provider'"
	 * @generated
	 */
	ProviderType getProvider();

	/**
	 * Sets the value of the '{@link org.crossref.fundref.AssertionType#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see org.crossref.fundref.ProviderType
	 * @see #isSetProvider()
	 * @see #unsetProvider()
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(ProviderType value);

	/**
	 * Unsets the value of the '{@link org.crossref.fundref.AssertionType#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProvider()
	 * @see #getProvider()
	 * @see #setProvider(ProviderType)
	 * @generated
	 */
	void unsetProvider();

	/**
	 * Returns whether the value of the '{@link org.crossref.fundref.AssertionType#getProvider <em>Provider</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provider</em>' attribute is set.
	 * @see #unsetProvider()
	 * @see #getProvider()
	 * @see #setProvider(ProviderType)
	 * @generated
	 */
	boolean isSetProvider();

} // AssertionType
