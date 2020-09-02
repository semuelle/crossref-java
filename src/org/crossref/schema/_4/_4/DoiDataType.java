/**
 */
package org.crossref.schema._4._4;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doi Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.DoiDataType#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DoiDataType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DoiDataType#getResource <em>Resource</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DoiDataType#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getDoiDataType()
 * @model extendedMetaData="name='doi_data_._type' kind='elementOnly'"
 * @generated
 */
public interface DoiDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DOI for an entity being registered with Crossref. In 2008 Crossref
	 * 				restricted DOI suffix characters to the following: "a-z", "A-Z", "0-9" and "-._;()/"
	 * 				Existing DOIs with suffix characters outside of the allowed set are still supported.
	 * 				For additional information on DOI syntax, see
	 * 				https://support.crossref.org/hc/en-us/articles/214669823
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi</em>' attribute.
	 * @see #setDoi(String)
	 * @see org.crossref.schema._4._4._4Package#getDoiDataType_Doi()
	 * @model dataType="org.crossref.schema._4._4.DoiType" required="true"
	 *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDoi();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DoiDataType#getDoi <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi</em>' attribute.
	 * @see #getDoi()
	 * @generated
	 */
	void setDoi(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates version of a batch file instance or DOI. timestamp is used
	 * 				to uniquely identify batch files and DOI values when a DOI has been updated one or
	 * 				more times. timestamp is an integer representation of date and time that serves as a
	 * 				version number for the record that is being deposited. Because Crossref uses it as a
	 * 				version number, the format need not follow any public standard and therefore the
	 * 				publisher can determine the internal format. The schema format is a double of at
	 * 				least 64 bits, insuring that a fully qualified date/time stamp of 19 digits can be
	 * 				submitted. When depositing data, Crossref will check to see if a DOI has already
	 * 				been deposited for the specific doi value. If the newer data carries a time stamp
	 * 				value that is equal to or greater than the old data based on a strict numeric
	 * 				comparison, the new data will replace the old data. If the new data value is less
	 * 				than the old data value, the new data will not replace the old data. timestamp is
	 * 				optional in doi_data and required in head. The value from the head instance
	 * 				timestamp will be used for all instances of doi_data that do not include a timestamp
	 * 				element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getDoiDataType_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTimestamp();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DoiDataType#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element that contains a URI associated with a DOI. URLs are
	 * 				referred to as resources in the 2.0 Crossref schema because they can be any valid
	 * 				URI. Cases of single-resolution (i.e. one DOI with a single corresponding URI)
	 * 				should be tagged with a doi/resource pair in doi_data. Only one resource is allowed
	 * 				per doi_data, the exception being resource elements within a collection element.
	 * 				Values for the "content_version" attribute are vor (version of record) and am
	 * 				(advance manuscript). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(ResourceType)
	 * @see org.crossref.schema._4._4._4Package#getDoiDataType_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceType getResource();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DoiDataType#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.CollectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  A collection is a container for one or more items each holding a doi
	 * 				or a resource (URI) which is related to the DOI in the ancestor <doi_data>
	 * 				element. A collection must be qualified by a property attibute or the
	 * 				multi-resolution attribute. property attributes: list-based: uses an interim page
	 * 				and presents the list of items to the user (via Multiple Resolution) country-based:
	 * 				proxy picks destination based on the country code of the user's location
	 * 				crawler-based: identifies resource to be crawled by the specified crawlers.
	 * 				text-mining: identifies resource to be used for text and data mining unspecified:
	 * 				identifies resource with unspecified usage syndication: identifies resource to be
	 * 				used for syndication link-header: identifies resource to be used as an endpoint The
	 * 				multi-resolution attribute may be used to lock or unlock DOIs for multiple
	 * 				resolution. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getDoiDataType_Collection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CollectionType> getCollection();

} // DoiDataType
