/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ItemNumberType#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ItemNumberType#getItemNumberType <em>Item Number Type</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getItemNumberType()
 * @model extendedMetaData="name='item_number_._type' kind='simple'"
 * @generated
 */
public interface ItemNumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.crossref.schema._4._4._4Package#getItemNumberType_Value()
	 * @model dataType="org.crossref.schema._4._4.ItemNumberT"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ItemNumberType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Item Number Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Number Type</em>' attribute.
	 * @see #setItemNumberType(String)
	 * @see org.crossref.schema._4._4._4Package#getItemNumberType_ItemNumberType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='item_number_type'"
	 * @generated
	 */
	String getItemNumberType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ItemNumberType#getItemNumberType <em>Item Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Number Type</em>' attribute.
	 * @see #getItemNumberType()
	 * @generated
	 */
	void setItemNumberType(String value);

} // ItemNumberType
