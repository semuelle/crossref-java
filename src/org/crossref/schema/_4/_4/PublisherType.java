/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.PublisherType#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PublisherType#getPublisherPlace <em>Publisher Place</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getPublisherType()
 * @model extendedMetaData="name='publisher_._type' kind='elementOnly'"
 * @generated
 */
public interface PublisherType extends EObject {
	/**
	 * Returns the value of the '<em><b>Publisher Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the publisher of a book or conference proceedings.
	 * 				publisher_name is the imprint of the publication (what the author will likely cite),
	 * 				not the organization registering the DOI, if for any reason they are different. When
	 * 				registering a translation, the translation publisher, not the original publisher,
	 * 				should be given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Name</em>' attribute.
	 * @see #setPublisherName(String)
	 * @see org.crossref.schema._4._4._4Package#getPublisherType_PublisherName()
	 * @model dataType="org.crossref.schema._4._4.PublisherNameType" required="true"
	 *        extendedMetaData="kind='element' name='publisher_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublisherName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PublisherType#getPublisherName <em>Publisher Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Name</em>' attribute.
	 * @see #getPublisherName()
	 * @generated
	 */
	void setPublisherName(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The city where the publisher of this work is located. publisher_place
	 * 				gives the primary city location of the publisher. When the location is a major city
	 * 				(e.g. New York, Amsterdam), no qualifying country, U.S. state, or Canadian province
	 * 				need be given. If the city is not a major city, the appropriate country, U.S. state,
	 * 				or Canadian province should be added.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Place</em>' attribute.
	 * @see #setPublisherPlace(String)
	 * @see org.crossref.schema._4._4._4Package#getPublisherType_PublisherPlace()
	 * @model dataType="org.crossref.schema._4._4.PublisherPlaceType"
	 *        extendedMetaData="kind='element' name='publisher_place' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublisherPlace();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PublisherType#getPublisherPlace <em>Publisher Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Place</em>' attribute.
	 * @see #getPublisherPlace()
	 * @generated
	 */
	void setPublisherPlace(String value);

} // PublisherType
