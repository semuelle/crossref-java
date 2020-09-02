/**
 */
package org.crossref.schema._4._4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Std Set Designator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.StdSetDesignatorType#getFamily <em>Family</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getStdSetDesignatorType()
 * @model extendedMetaData="name='std_set_designator_._type' kind='elementOnly'"
 * @generated
 */
public interface StdSetDesignatorType extends StdDesignatorT {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see org.crossref.schema._4._4._4Package#getStdSetDesignatorType_Family()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='family'"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StdSetDesignatorType#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

} // StdSetDesignatorType
