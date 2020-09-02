/**
 */
package org.crossref.schema._4._4;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.UpdateType#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.UpdateType#getDate <em>Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.UpdateType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getUpdateType()
 * @model extendedMetaData="name='update_._type' kind='simple'"
 * @generated
 */
public interface UpdateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.crossref.schema._4._4._4Package#getUpdateType_Value()
	 * @model dataType="org.crossref.schema._4._4.DoiT"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.UpdateType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required attribute. The date of the update will be
	 * 								displayed in the CrossMark dialog and can help the researcher easily
	 * 								tell whther they are likley to have seen the
	 * 								update.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @see org.crossref.schema._4._4._4Package#getUpdateType_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='attribute' name='date'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.UpdateType#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.CmUpdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   Required attribute. This attribute should be used to
	 * 								list the update type. Allowed update types are: 
	 *   <ul>
	 *     									
	 *     <li>addendum</li>
	 *     									
	 *     <li>clarification</li>
	 *     									
	 *     <li>correction</li>
	 *     									
	 *     <li>corrigendum</li>
	 *     									
	 *     <li>erratum</li>
	 *     									
	 *     <li>expression_of_concern</li>
	 *     									
	 *     <li>new_edition</li>
	 *     									
	 *     <li>new_version</li>
	 *     									
	 *     <li>partial_retraction</li>
	 *     									
	 *     <li>removal</li>
	 *     									
	 *     <li>retraction</li>
	 *     									
	 *     <li>withdrawal</li>
	 *     								
	 *   </ul>
	 *   							
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.crossref.schema._4._4.CmUpdateType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(CmUpdateType)
	 * @see org.crossref.schema._4._4._4Package#getUpdateType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	CmUpdateType getType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.UpdateType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.crossref.schema._4._4.CmUpdateType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(CmUpdateType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.UpdateType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(CmUpdateType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.UpdateType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(CmUpdateType)
	 * @generated
	 */
	boolean isSetType();

} // UpdateType
