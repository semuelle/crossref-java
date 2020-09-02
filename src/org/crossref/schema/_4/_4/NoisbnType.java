/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noisbn Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.NoisbnType#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getNoisbnType()
 * @model extendedMetaData="name='noisbn_._type' kind='empty'"
 * @generated
 */
public interface NoisbnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.ReasonType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see org.crossref.schema._4._4.ReasonType1
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #setReason(ReasonType1)
	 * @see org.crossref.schema._4._4._4Package#getNoisbnType_Reason()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='reason'"
	 * @generated
	 */
	ReasonType1 getReason();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.NoisbnType#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see org.crossref.schema._4._4.ReasonType1
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #getReason()
	 * @generated
	 */
	void setReason(ReasonType1 value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.NoisbnType#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReason()
	 * @see #getReason()
	 * @see #setReason(ReasonType1)
	 * @generated
	 */
	void unsetReason();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.NoisbnType#getReason <em>Reason</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reason</em>' attribute is set.
	 * @see #unsetReason()
	 * @see #getReason()
	 * @see #setReason(ReasonType1)
	 * @generated
	 */
	boolean isSetReason();

} // NoisbnType
