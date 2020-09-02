/**
 */
package org.crossref.access.indicators;

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
 *   <li>{@link org.crossref.access.indicators.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.access.indicators.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.crossref.access.indicators.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.crossref.access.indicators.DocumentRoot#getFreeToRead <em>Free To Read</em>}</li>
 *   <li>{@link org.crossref.access.indicators.DocumentRoot#getLicenseRef <em>License Ref</em>}</li>
 *   <li>{@link org.crossref.access.indicators.DocumentRoot#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see org.crossref.access.indicators.IndicatorsPackage#getDocumentRoot()
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
	 * @see org.crossref.access.indicators.IndicatorsPackage#getDocumentRoot_Mixed()
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
	 * @see org.crossref.access.indicators.IndicatorsPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.crossref.access.indicators.IndicatorsPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Free To Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free To Read</em>' containment reference.
	 * @see #setFreeToRead(FreeToReadType)
	 * @see org.crossref.access.indicators.IndicatorsPackage#getDocumentRoot_FreeToRead()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='free_to_read' namespace='##targetNamespace'"
	 * @generated
	 */
	FreeToReadType getFreeToRead();

	/**
	 * Sets the value of the '{@link org.crossref.access.indicators.DocumentRoot#getFreeToRead <em>Free To Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free To Read</em>' containment reference.
	 * @see #getFreeToRead()
	 * @generated
	 */
	void setFreeToRead(FreeToReadType value);

	/**
	 * Returns the value of the '<em><b>License Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Ref</em>' containment reference.
	 * @see #setLicenseRef(LicenseRefType)
	 * @see org.crossref.access.indicators.IndicatorsPackage#getDocumentRoot_LicenseRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='license_ref' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseRefType getLicenseRef();

	/**
	 * Sets the value of the '{@link org.crossref.access.indicators.DocumentRoot#getLicenseRef <em>License Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Ref</em>' containment reference.
	 * @see #getLicenseRef()
	 * @generated
	 */
	void setLicenseRef(LicenseRefType value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of license metadata. The license_ref value will
	 *                 be a URL. Values for the "applies_to" attribute are vor (version of record),am
	 *                 (accepted manuscript), and tdm (text and data mining).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(ProgramType)
	 * @see org.crossref.access.indicators.IndicatorsPackage#getDocumentRoot_Program()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='program' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.access.indicators.DocumentRoot#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(ProgramType value);

} // DocumentRoot
