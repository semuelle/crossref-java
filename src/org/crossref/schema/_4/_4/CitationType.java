/**
 */
package org.crossref.schema._4._4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.CitationType#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getCitationType()
 * @model extendedMetaData="name='citation_._type' kind='elementOnly'"
 * @generated
 */
public interface CitationType extends CitationT {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationType_Key()
	 * @model dataType="org.crossref.schema._4._4.KeyType" required="true"
	 *        extendedMetaData="kind='attribute' name='key'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // CitationType
