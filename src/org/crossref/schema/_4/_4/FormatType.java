/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.FormatType#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.FormatType#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getFormatType()
 * @model extendedMetaData="name='format_._type' kind='simple'"
 * @generated
 */
public interface FormatType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.crossref.schema._4._4._4Package#getFormatType_Value()
	 * @model dataType="org.crossref.schema._4._4.FormatT"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.FormatType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.MimeTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see org.crossref.schema._4._4.MimeTypeType
	 * @see #isSetMimeType()
	 * @see #unsetMimeType()
	 * @see #setMimeType(MimeTypeType)
	 * @see org.crossref.schema._4._4._4Package#getFormatType_MimeType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mime_type'"
	 * @generated
	 */
	MimeTypeType getMimeType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.FormatType#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see org.crossref.schema._4._4.MimeTypeType
	 * @see #isSetMimeType()
	 * @see #unsetMimeType()
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(MimeTypeType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.FormatType#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMimeType()
	 * @see #getMimeType()
	 * @see #setMimeType(MimeTypeType)
	 * @generated
	 */
	void unsetMimeType();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.FormatType#getMimeType <em>Mime Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mime Type</em>' attribute is set.
	 * @see #unsetMimeType()
	 * @see #getMimeType()
	 * @see #setMimeType(MimeTypeType)
	 * @generated
	 */
	boolean isSetMimeType();

} // FormatType
