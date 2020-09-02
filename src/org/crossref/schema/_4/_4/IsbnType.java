/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Isbn Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.IsbnType#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.IsbnType#getMediaType <em>Media Type</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getIsbnType()
 * @model extendedMetaData="name='isbn_._type' kind='simple'"
 * @generated
 */
public interface IsbnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.crossref.schema._4._4._4Package#getIsbnType_Value()
	 * @model dataType="org.crossref.schema._4._4.IsbnT"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.IsbnType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * The default value is <code>"print"</code>.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.MediaTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see org.crossref.schema._4._4.MediaTypeType
	 * @see #isSetMediaType()
	 * @see #unsetMediaType()
	 * @see #setMediaType(MediaTypeType)
	 * @see org.crossref.schema._4._4._4Package#getIsbnType_MediaType()
	 * @model default="print" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='media_type'"
	 * @generated
	 */
	MediaTypeType getMediaType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.IsbnType#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see org.crossref.schema._4._4.MediaTypeType
	 * @see #isSetMediaType()
	 * @see #unsetMediaType()
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(MediaTypeType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.IsbnType#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMediaType()
	 * @see #getMediaType()
	 * @see #setMediaType(MediaTypeType)
	 * @generated
	 */
	void unsetMediaType();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.IsbnType#getMediaType <em>Media Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Media Type</em>' attribute is set.
	 * @see #unsetMediaType()
	 * @see #getMediaType()
	 * @see #setMediaType(MediaTypeType)
	 * @generated
	 */
	boolean isSetMediaType();

} // IsbnType
