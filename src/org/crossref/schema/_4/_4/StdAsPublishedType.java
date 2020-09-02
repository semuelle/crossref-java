/**
 */
package org.crossref.schema._4._4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Std As Published Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.StdAsPublishedType#getFamily <em>Family</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StdAsPublishedType#getSet <em>Set</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StdAsPublishedType#getUndated <em>Undated</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getStdAsPublishedType()
 * @model extendedMetaData="name='std_as_published_._type' kind='elementOnly'"
 * @generated
 */
public interface StdAsPublishedType extends StdDesignatorT {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see org.crossref.schema._4._4._4Package#getStdAsPublishedType_Family()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='family'"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StdAsPublishedType#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' attribute.
	 * @see #setSet(String)
	 * @see org.crossref.schema._4._4._4Package#getStdAsPublishedType_Set()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='set'"
	 * @generated
	 */
	String getSet();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StdAsPublishedType#getSet <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' attribute.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(String value);

	/**
	 * Returns the value of the '<em><b>Undated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undated</em>' attribute.
	 * @see #setUndated(String)
	 * @see org.crossref.schema._4._4._4Package#getStdAsPublishedType_Undated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='undated'"
	 * @generated
	 */
	String getUndated();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StdAsPublishedType#getUndated <em>Undated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undated</em>' attribute.
	 * @see #getUndated()
	 * @generated
	 */
	void setUndated(String value);

} // StdAsPublishedType
