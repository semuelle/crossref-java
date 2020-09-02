/**
 */
package org.crossref.clinicaltrials;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Trial Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.clinicaltrials.ClinicalTrialNumberType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.clinicaltrials.ClinicalTrialNumberType#getRegistry <em>Registry</em>}</li>
 *   <li>{@link org.crossref.clinicaltrials.ClinicalTrialNumberType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getClinicalTrialNumberType()
 * @model extendedMetaData="name='clinical-trial-number_._type' kind='mixed'"
 * @generated
 */
public interface ClinicalTrialNumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getClinicalTrialNumberType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The clinical trial identifier related to the article.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registry</em>' attribute.
	 * @see #setRegistry(String)
	 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getClinicalTrialNumberType_Registry()
	 * @model dataType="org.crossref.clinicaltrials.RegistryType" required="true"
	 *        extendedMetaData="kind='attribute' name='registry'"
	 * @generated
	 */
	String getRegistry();

	/**
	 * Sets the value of the '{@link org.crossref.clinicaltrials.ClinicalTrialNumberType#getRegistry <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry</em>' attribute.
	 * @see #getRegistry()
	 * @generated
	 */
	void setRegistry(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.clinicaltrials.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Used to identify the article publication date in relation to the issuance of the trial results
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.crossref.clinicaltrials.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#getClinicalTrialNumberType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.crossref.clinicaltrials.ClinicalTrialNumberType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.crossref.clinicaltrials.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.crossref.clinicaltrials.ClinicalTrialNumberType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.crossref.clinicaltrials.ClinicalTrialNumberType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // ClinicalTrialNumberType
