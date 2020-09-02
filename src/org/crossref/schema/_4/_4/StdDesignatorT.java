/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Std Designator T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.StdDesignatorT#getStdDesignator <em>Std Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StdDesignatorT#getStdAltScript <em>Std Alt Script</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StdDesignatorT#getStdVariantForm <em>Std Variant Form</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getStdDesignatorT()
 * @model extendedMetaData="name='std_designator_t' kind='elementOnly'"
 * @generated
 */
public interface StdDesignatorT extends EObject {
	/**
	 * Returns the value of the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Designator</em>' attribute.
	 * @see #setStdDesignator(String)
	 * @see org.crossref.schema._4._4._4Package#getStdDesignatorT_StdDesignator()
	 * @model dataType="org.crossref.schema._4._4.StdDesignatorvalueT" required="true"
	 *        extendedMetaData="kind='element' name='std_designator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStdDesignator();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StdDesignatorT#getStdDesignator <em>Std Designator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Designator</em>' attribute.
	 * @see #getStdDesignator()
	 * @generated
	 */
	void setStdDesignator(String value);

	/**
	 * Returns the value of the '<em><b>Std Alt Script</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Alt Script</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getStdDesignatorT_StdAltScript()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT"
	 *        extendedMetaData="kind='element' name='std_alt_script' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getStdAltScript();

	/**
	 * Returns the value of the '<em><b>Std Variant Form</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Variant Form</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getStdDesignatorT_StdVariantForm()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT"
	 *        extendedMetaData="kind='element' name='std_variant_form' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getStdVariantForm();

} // StdDesignatorT
