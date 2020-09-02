/**
 */
package org.crossref.schema._4._4;

import org.crossref.fundref.ProgramType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.CustomMetadataType#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CustomMetadataType#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CustomMetadataType#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CustomMetadataType#getProgram2 <em>Program2</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CustomMetadataType#getProgram3 <em>Program3</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CustomMetadataType#getProgram4 <em>Program4</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CustomMetadataType#getProgram5 <em>Program5</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CustomMetadataType#getProgram6 <em>Program6</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CustomMetadataType#getProgram7 <em>Program7</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CustomMetadataType#getProgram8 <em>Program8</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType()
 * @model extendedMetaData="name='custom_metadata_._type' kind='elementOnly'"
 * @generated
 */
public interface CustomMetadataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.AssertionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An assertion is a piece of custom, non-bibliographic metadata that
	 * 				the publisher is asserting about the content to which the CrossMark refers.
	 * 				assertion attributes: explanation: If the publisher wants to provide a further
	 * 				explanation of what the particular "assertion" means, they can link to such an
	 * 				explanation by providing an appropriate url on the "explanation" attribute.
	 * 				group_label: This is the human-readable form of the "group_name" attribute. This is
	 * 				what will be displayed in the group headings on the CrossMark metadata record
	 * 				dialog. group_name: Some assertions could be logically "grouped" together in the
	 * 				CrossMark dialog. For instance, if the publisher is recording several pieces of
	 * 				metadata related to funding sources (source name, percentage, grant number), they
	 * 				may want to make sure that these three assertions are grouped next to each-other in
	 * 				the CrossMark dialog. The group_name attribute is the machine-readable value that
	 * 				will be used for grouping such assertions. label: This is the human-readable version
	 * 				of the name attribute which will be displayed in the CrossMark dialog. If this
	 * 				attribute is missing, then the value of the assertion will *not* be displayed in the
	 * 				dialog. Publishers may want to "hide" assertions this way in cases where the
	 * 				assertion value is too large or too complex to display in the dialog, but where the
	 * 				assertion is nonetheless valuable enough to include in API queries and metadata
	 * 				dumps (e.g. detailed licensing terms). name: This is the machine-readable name of
	 * 				the assertion. Use the "label" attribute to provide a human-readable version of the
	 * 				name. order: The publisher may want to control the order in which assertions are
	 * 				displayed to the user in the CrossMark dialog. All assertions will be sorted by this
	 * 				element if it is present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType_Assertion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assertion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssertionType> getAssertion();

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
	 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType_Program()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/fundref.xsd'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of license metadata. The license_ref value will
	 *                 be a URL. Values for the "applies_to" attribute are vor (version of record),am
	 *                 (accepted manuscript), and tdm (text and data mining).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program1</em>' containment reference.
	 * @see #setProgram1(org.crossref.access.indicators.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType_Program1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/AccessIndicators.xsd'"
	 * @generated
	 */
	org.crossref.access.indicators.ProgramType getProgram1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram1 <em>Program1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program1</em>' containment reference.
	 * @see #getProgram1()
	 * @generated
	 */
	void setProgram1(org.crossref.access.indicators.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of linked clincal trials metadata. The clinical-trial-number value will
	 *                 be a string that must match a specific pattern appropriate for a given clinical trial registry. The
	 *                 registry is identified in the required attribute 'registry' and must be the DOI of a recognized registry
	 *                 (see http://dx.doi.org/10.18810/registries)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program2</em>' containment reference.
	 * @see #setProgram2(org.crossref.clinicaltrials.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType_Program2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/clinicaltrials.xsd'"
	 * @generated
	 */
	org.crossref.clinicaltrials.ProgramType getProgram2();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram2 <em>Program2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program2</em>' containment reference.
	 * @see #getProgram2()
	 * @generated
	 */
	void setProgram2(org.crossref.clinicaltrials.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program3</b></em>' containment reference.
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
	 * @return the value of the '<em>Program3</em>' containment reference.
	 * @see #setProgram3(ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType_Program3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/fundref.xsd'"
	 * @generated
	 */
	ProgramType getProgram3();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram3 <em>Program3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program3</em>' containment reference.
	 * @see #getProgram3()
	 * @generated
	 */
	void setProgram3(ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of license metadata. The license_ref value will
	 *                 be a URL. Values for the "applies_to" attribute are vor (version of record),am
	 *                 (accepted manuscript), and tdm (text and data mining).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program4</em>' containment reference.
	 * @see #setProgram4(org.crossref.access.indicators.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType_Program4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/AccessIndicators.xsd'"
	 * @generated
	 */
	org.crossref.access.indicators.ProgramType getProgram4();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram4 <em>Program4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program4</em>' containment reference.
	 * @see #getProgram4()
	 * @generated
	 */
	void setProgram4(org.crossref.access.indicators.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of linked clincal trials metadata. The clinical-trial-number value will
	 *                 be a string that must match a specific pattern appropriate for a given clinical trial registry. The
	 *                 registry is identified in the required attribute 'registry' and must be the DOI of a recognized registry
	 *                 (see http://dx.doi.org/10.18810/registries)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program5</em>' containment reference.
	 * @see #setProgram5(org.crossref.clinicaltrials.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType_Program5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/clinicaltrials.xsd'"
	 * @generated
	 */
	org.crossref.clinicaltrials.ProgramType getProgram5();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram5 <em>Program5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program5</em>' containment reference.
	 * @see #getProgram5()
	 * @generated
	 */
	void setProgram5(org.crossref.clinicaltrials.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of license metadata. The license_ref value will
	 *                 be a URL. Values for the "applies_to" attribute are vor (version of record),am
	 *                 (accepted manuscript), and tdm (text and data mining).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program6</em>' containment reference.
	 * @see #setProgram6(org.crossref.access.indicators.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType_Program6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/AccessIndicators.xsd'"
	 * @generated
	 */
	org.crossref.access.indicators.ProgramType getProgram6();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram6 <em>Program6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program6</em>' containment reference.
	 * @see #getProgram6()
	 * @generated
	 */
	void setProgram6(org.crossref.access.indicators.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of linked clincal trials metadata. The clinical-trial-number value will
	 *                 be a string that must match a specific pattern appropriate for a given clinical trial registry. The
	 *                 registry is identified in the required attribute 'registry' and must be the DOI of a recognized registry
	 *                 (see http://dx.doi.org/10.18810/registries)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program7</em>' containment reference.
	 * @see #setProgram7(org.crossref.clinicaltrials.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType_Program7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/clinicaltrials.xsd'"
	 * @generated
	 */
	org.crossref.clinicaltrials.ProgramType getProgram7();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram7 <em>Program7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program7</em>' containment reference.
	 * @see #getProgram7()
	 * @generated
	 */
	void setProgram7(org.crossref.clinicaltrials.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of linked clincal trials metadata. The clinical-trial-number value will
	 *                 be a string that must match a specific pattern appropriate for a given clinical trial registry. The
	 *                 registry is identified in the required attribute 'registry' and must be the DOI of a recognized registry
	 *                 (see http://dx.doi.org/10.18810/registries)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program8</em>' containment reference.
	 * @see #setProgram8(org.crossref.clinicaltrials.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getCustomMetadataType_Program8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/clinicaltrials.xsd'"
	 * @generated
	 */
	org.crossref.clinicaltrials.ProgramType getProgram8();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram8 <em>Program8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program8</em>' containment reference.
	 * @see #getProgram8()
	 * @generated
	 */
	void setProgram8(org.crossref.clinicaltrials.ProgramType value);

} // CustomMetadataType
