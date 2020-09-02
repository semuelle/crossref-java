/**
 */
package org.niso.schemas.ali._1._0;

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
 *   <li>{@link org.niso.schemas.ali._1._0.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.niso.schemas.ali._1._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.niso.schemas.ali._1._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.niso.schemas.ali._1._0.DocumentRoot#getFreeToRead <em>Free To Read</em>}</li>
 *   <li>{@link org.niso.schemas.ali._1._0.DocumentRoot#getLicenseRef <em>License Ref</em>}</li>
 * </ul>
 *
 * @see org.niso.schemas.ali._1._0._0Package#getDocumentRoot()
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
	 * @see org.niso.schemas.ali._1._0._0Package#getDocumentRoot_Mixed()
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
	 * @see org.niso.schemas.ali._1._0._0Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.niso.schemas.ali._1._0._0Package#getDocumentRoot_XSISchemaLocation()
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
	 * @see org.niso.schemas.ali._1._0._0Package#getDocumentRoot_FreeToRead()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='free_to_read' namespace='##targetNamespace'"
	 * @generated
	 */
	FreeToReadType getFreeToRead();

	/**
	 * Sets the value of the '{@link org.niso.schemas.ali._1._0.DocumentRoot#getFreeToRead <em>Free To Read</em>}' containment reference.
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
	 * @see org.niso.schemas.ali._1._0._0Package#getDocumentRoot_LicenseRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='license_ref' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseRefType getLicenseRef();

	/**
	 * Sets the value of the '{@link org.niso.schemas.ali._1._0.DocumentRoot#getLicenseRef <em>License Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Ref</em>' containment reference.
	 * @see #getLicenseRef()
	 * @generated
	 */
	void setLicenseRef(LicenseRefType value);

} // DocumentRoot
