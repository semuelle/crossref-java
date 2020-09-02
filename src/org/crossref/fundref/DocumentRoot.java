/**
 */
package org.crossref.fundref;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.fundref.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.fundref.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.crossref.fundref.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.crossref.fundref.DocumentRoot#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.crossref.fundref.DocumentRoot#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see org.crossref.fundref.FundrefPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.crossref.fundref.FundrefPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.crossref.fundref.FundrefPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.crossref.fundref.FundrefPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
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
	 * @return the value of the '<em>Assertion</em>' containment reference.
	 * @see #setAssertion(AssertionType)
	 * @see org.crossref.fundref.FundrefPackage#getDocumentRoot_Assertion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assertion' namespace='##targetNamespace'"
	 * @generated
	 */
	AssertionType getAssertion();

	/**
	 * Sets the value of the '{@link org.crossref.fundref.DocumentRoot#getAssertion <em>Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' containment reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(AssertionType value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 FundRef documentation and examples: http://help.crossref.org/#fundref
	 *                 
	 *                 As part of CrossMark metadata, a deposit may contain what is called FundRef info. This details the funding behind a published article. The schema is a sequence of nested <assertion> tags. 
	 *                 
	 *                 If a DOI is not participating in CrossMark, FundRef data may be deposited as part of the <journal_article> metadata.
	 *                     
	 *                     Note: Some rules will be enforced by the deposit logic (e.g. not the schema). 
	 *                     
	 *                     FundRef data includes one or more award numbers (award_number), each of which may have one or more funders (funder_name). Each funder may have one or more optional identifiers (funder_identifier).
	 *                     
	 *                     A FundRef deposit begins with a <fr:program> tag within the <crossmark> structure (where fr is the namespace for the FundRef program).
	 *                         
	 *                         The <program> element is an implicit funder_group and will typically contain:
	 *                             
	 *                             A) one or more funder_name assertions and an award_number assertion.
	 *                             
	 *                             or
	 *                             
	 *                             B) one or more funder_group assertions where each funder_group should contain one or more funder_name assertions and at least one award_number assertion.
	 *                             
	 *                             Multiple 'award_number's may be included in a single program or fundgroup. Deposits without an award_number will be accepted, but award_number should be provided whenever possible. Items with several award numbers associated with a single funding organization should be grouped together by enclosing the "funder_name", "funder_identifier", and award_number(s) within a "fundgroup" assertion.    
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(ProgramType)
	 * @see org.crossref.fundref.FundrefPackage#getDocumentRoot_Program()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='program' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.fundref.DocumentRoot#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(ProgramType value);

} // DocumentRoot
