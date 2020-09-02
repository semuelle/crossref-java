/**
 */
package org.crossref.schema._4._4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Std Undated Designator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.StdUndatedDesignatorType#getFamily <em>Family</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StdUndatedDesignatorType#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getStdUndatedDesignatorType()
 * @model extendedMetaData="name='std_undated_designator_._type' kind='elementOnly'"
 * @generated
 */
public interface StdUndatedDesignatorType extends StdDesignatorT {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see org.crossref.schema._4._4._4Package#getStdUndatedDesignatorType_Family()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='family'"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StdUndatedDesignatorType#getFamily <em>Family</em>}' attribute.
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
	 * @see org.crossref.schema._4._4._4Package#getStdUndatedDesignatorType_Set()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='set'"
	 * @generated
	 */
	String getSet();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StdUndatedDesignatorType#getSet <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' attribute.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(String value);

} // StdUndatedDesignatorType
