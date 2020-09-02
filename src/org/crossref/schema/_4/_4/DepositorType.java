/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depositor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.DepositorType#getDepositorName <em>Depositor Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DepositorType#getEmailAddress <em>Email Address</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getDepositorType()
 * @model extendedMetaData="name='depositor_._type' kind='elementOnly'"
 * @generated
 */
public interface DepositorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Depositor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the organization registering the DOIs. The name placed in
	 * 				this element should match the name under which a depositing organization has
	 * 				registered with Crossref.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depositor Name</em>' attribute.
	 * @see #setDepositorName(String)
	 * @see org.crossref.schema._4._4._4Package#getDepositorType_DepositorName()
	 * @model dataType="org.crossref.schema._4._4.DepositorNameType" required="true"
	 *        extendedMetaData="kind='element' name='depositor_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDepositorName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DepositorType#getDepositorName <em>Depositor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depositor Name</em>' attribute.
	 * @see #getDepositorName()
	 * @generated
	 */
	void setDepositorName(String value);

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e-mail address to which batch success and/or error messages are sent.
	 * 				It is recommended that this address be unique to a position within the organization
	 * 				submitting data (e.g. "doi@...") rather than unique to a person. In this way, the
	 * 				alias for delivery of this mail can be changed as responsibility for submission of
	 * 				DOI data within the organization changes from one person to another.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute.
	 * @see #setEmailAddress(String)
	 * @see org.crossref.schema._4._4._4Package#getDepositorType_EmailAddress()
	 * @model dataType="org.crossref.schema._4._4.EmailAddressType" required="true"
	 *        extendedMetaData="kind='element' name='email_address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmailAddress();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DepositorType#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(String value);

} // DepositorType
