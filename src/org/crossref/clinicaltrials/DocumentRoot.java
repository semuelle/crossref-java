/**
 */
package org.crossref.clinicaltrials;

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
 *   <li>{@link org.crossref.clinicaltrials.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.clinicaltrials.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.crossref.clinicaltrials.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.crossref.clinicaltrials.DocumentRoot#getClinicalTrialNumber <em>Clinical Trial Number</em>}</li>
 *   <li>{@link org.crossref.clinicaltrials.DocumentRoot#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getDocumentRoot()
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
	 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getDocumentRoot_Mixed()
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
	 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Clinical Trial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Trial Number</em>' containment reference.
	 * @see #setClinicalTrialNumber(ClinicalTrialNumberType)
	 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getDocumentRoot_ClinicalTrialNumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='clinical-trial-number' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalTrialNumberType getClinicalTrialNumber();

	/**
	 * Sets the value of the '{@link org.crossref.clinicaltrials.DocumentRoot#getClinicalTrialNumber <em>Clinical Trial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Trial Number</em>' containment reference.
	 * @see #getClinicalTrialNumber()
	 * @generated
	 */
	void setClinicalTrialNumber(ClinicalTrialNumberType value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of linked clincal trials metadata. The clinical-trial-number value will
	 *                 be a string that must match a specific pattern appropriate for a given clinical trial registry. The
	 *                 registry is identified in the required attribute 'registry' and must be the DOI of a recognized registry
	 *                 (see http://dx.doi.org/10.18810/registries)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(ProgramType)
	 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getDocumentRoot_Program()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='program' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.clinicaltrials.DocumentRoot#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(ProgramType value);

} // DocumentRoot
