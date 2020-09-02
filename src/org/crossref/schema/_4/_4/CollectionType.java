/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.CollectionType#getItem <em>Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CollectionType#getMultiResolution <em>Multi Resolution</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CollectionType#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getCollectionType()
 * @model extendedMetaData="name='collection_._type' kind='elementOnly'"
 * @generated
 */
public interface CollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container used to associate a collection, doi, or resource (URI)
	 * 				with zero or more property elements. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getCollectionType_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getItem();

	/**
	 * Returns the value of the '<em><b>Multi Resolution</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.MultiResolutionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Resolution</em>' attribute.
	 * @see org.crossref.schema._4._4.MultiResolutionType
	 * @see #isSetMultiResolution()
	 * @see #unsetMultiResolution()
	 * @see #setMultiResolution(MultiResolutionType)
	 * @see org.crossref.schema._4._4._4Package#getCollectionType_MultiResolution()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='multi-resolution'"
	 * @generated
	 */
	MultiResolutionType getMultiResolution();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CollectionType#getMultiResolution <em>Multi Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Resolution</em>' attribute.
	 * @see org.crossref.schema._4._4.MultiResolutionType
	 * @see #isSetMultiResolution()
	 * @see #unsetMultiResolution()
	 * @see #getMultiResolution()
	 * @generated
	 */
	void setMultiResolution(MultiResolutionType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.CollectionType#getMultiResolution <em>Multi Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiResolution()
	 * @see #getMultiResolution()
	 * @see #setMultiResolution(MultiResolutionType)
	 * @generated
	 */
	void unsetMultiResolution();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.CollectionType#getMultiResolution <em>Multi Resolution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multi Resolution</em>' attribute is set.
	 * @see #unsetMultiResolution()
	 * @see #getMultiResolution()
	 * @see #setMultiResolution(MultiResolutionType)
	 * @generated
	 */
	boolean isSetMultiResolution();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.PropertyType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see org.crossref.schema._4._4.PropertyType1
	 * @see #isSetProperty()
	 * @see #unsetProperty()
	 * @see #setProperty(PropertyType1)
	 * @see org.crossref.schema._4._4._4Package#getCollectionType_Property()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='property'"
	 * @generated
	 */
	PropertyType1 getProperty();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CollectionType#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see org.crossref.schema._4._4.PropertyType1
	 * @see #isSetProperty()
	 * @see #unsetProperty()
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyType1 value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.CollectionType#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProperty()
	 * @see #getProperty()
	 * @see #setProperty(PropertyType1)
	 * @generated
	 */
	void unsetProperty();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.CollectionType#getProperty <em>Property</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property</em>' attribute is set.
	 * @see #unsetProperty()
	 * @see #getProperty()
	 * @see #setProperty(PropertyType1)
	 * @generated
	 */
	boolean isSetProperty();

} // CollectionType
