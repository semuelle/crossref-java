/**
 */
package org.crossref.schema._4._4;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.HeadType#getDoiBatchId <em>Doi Batch Id</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.HeadType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.HeadType#getDepositor <em>Depositor</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.HeadType#getRegistrant <em>Registrant</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getHeadType()
 * @model extendedMetaData="name='head_._type' kind='elementOnly'"
 * @generated
 */
public interface HeadType extends EObject {
	/**
	 * Returns the value of the '<em><b>Doi Batch Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Publisher generated ID that uniquely identifies the DOI submission
	 * 				batch. It will be used as a reference in error messages sent by the MDDB, and can be
	 * 				used for submission tracking. The publisher must ensure that this number is unique
	 * 				for every submission to Crossref. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi Batch Id</em>' attribute.
	 * @see #setDoiBatchId(String)
	 * @see org.crossref.schema._4._4._4Package#getHeadType_DoiBatchId()
	 * @model dataType="org.crossref.schema._4._4.DoiBatchIdType" required="true"
	 *        extendedMetaData="kind='element' name='doi_batch_id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDoiBatchId();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.HeadType#getDoiBatchId <em>Doi Batch Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Batch Id</em>' attribute.
	 * @see #getDoiBatchId()
	 * @generated
	 */
	void setDoiBatchId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates version of a batch file instance or DOI. timestamp is used
	 * 				to uniquely identify batch files and DOI values when a DOI has been updated one or
	 * 				more times. timestamp is an integer representation of date and time that serves as a
	 * 				version number for the record that is being deposited. Because Crossref uses it as a
	 * 				version number, the format need not follow any public standard and therefore the
	 * 				publisher can determine the internal format. The schema format is a double of at
	 * 				least 64 bits, insuring that a fully qualified date/time stamp of 19 digits can be
	 * 				submitted. When depositing data, Crossref will check to see if a DOI has already
	 * 				been deposited for the specific doi value. If the newer data carries a time stamp
	 * 				value that is equal to or greater than the old data based on a strict numeric
	 * 				comparison, the new data will replace the old data. If the new data value is less
	 * 				than the old data value, the new data will not replace the old data. timestamp is
	 * 				optional in doi_data and required in head. The value from the head instance
	 * 				timestamp will be used for all instances of doi_data that do not include a timestamp
	 * 				element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getHeadType_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTimestamp();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.HeadType#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Depositor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the organization submitting DOI metadata to
	 * 				Crossref
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depositor</em>' containment reference.
	 * @see #setDepositor(DepositorType)
	 * @see org.crossref.schema._4._4._4Package#getHeadType_Depositor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='depositor' namespace='##targetNamespace'"
	 * @generated
	 */
	DepositorType getDepositor();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.HeadType#getDepositor <em>Depositor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depositor</em>' containment reference.
	 * @see #getDepositor()
	 * @generated
	 */
	void setDepositor(DepositorType value);

	/**
	 * Returns the value of the '<em><b>Registrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that owns the information being registered.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registrant</em>' attribute.
	 * @see #setRegistrant(String)
	 * @see org.crossref.schema._4._4._4Package#getHeadType_Registrant()
	 * @model dataType="org.crossref.schema._4._4.RegistrantType" required="true"
	 *        extendedMetaData="kind='element' name='registrant' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegistrant();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.HeadType#getRegistrant <em>Registrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registrant</em>' attribute.
	 * @see #getRegistrant()
	 * @generated
	 */
	void setRegistrant(String value);

} // HeadType
