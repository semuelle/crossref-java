/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ORCID Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ORCIDType#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ORCIDType#isAuthenticated <em>Authenticated</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getORCIDType()
 * @model extendedMetaData="name='ORCID_._type' kind='simple'"
 * @generated
 */
public interface ORCIDType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.crossref.schema._4._4._4Package#getORCIDType_Value()
	 * @model dataType="org.crossref.schema._4._4.OrcidT"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ORCIDType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Authenticated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticated</em>' attribute.
	 * @see #isSetAuthenticated()
	 * @see #unsetAuthenticated()
	 * @see #setAuthenticated(boolean)
	 * @see org.crossref.schema._4._4._4Package#getORCIDType_Authenticated()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='authenticated'"
	 * @generated
	 */
	boolean isAuthenticated();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ORCIDType#isAuthenticated <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticated</em>' attribute.
	 * @see #isSetAuthenticated()
	 * @see #unsetAuthenticated()
	 * @see #isAuthenticated()
	 * @generated
	 */
	void setAuthenticated(boolean value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ORCIDType#isAuthenticated <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthenticated()
	 * @see #isAuthenticated()
	 * @see #setAuthenticated(boolean)
	 * @generated
	 */
	void unsetAuthenticated();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ORCIDType#isAuthenticated <em>Authenticated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authenticated</em>' attribute is set.
	 * @see #unsetAuthenticated()
	 * @see #isAuthenticated()
	 * @see #setAuthenticated(boolean)
	 * @generated
	 */
	boolean isSetAuthenticated();

} // ORCIDType
