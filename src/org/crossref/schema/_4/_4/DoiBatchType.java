/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doi Batch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.DoiBatchType#getHead <em>Head</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DoiBatchType#getBody <em>Body</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DoiBatchType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getDoiBatchType()
 * @model extendedMetaData="name='doi_batch_._type' kind='elementOnly'"
 * @generated
 */
public interface DoiBatchType extends EObject {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for information related to the DOI batch submission.
	 * 				This element uniquely identifies the batch deposit to Crossref and contains
	 * 				information that will be used as a reference in error messages sent by the MDDB.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(HeadType)
	 * @see org.crossref.schema._4._4._4Package#getDoiBatchType_Head()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='head' namespace='##targetNamespace'"
	 * @generated
	 */
	HeadType getHead();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DoiBatchType#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(HeadType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for the main body of a DOI record submission. The body
	 * 				contains a set of journal, book, conference proceedings or stand alone component
	 * 				records. It is not possible to mix genres within a single DOI submission. It is
	 * 				possible to include records for multiple journals, books, conferences, or stand
	 * 				alone components in a single submission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodyType)
	 * @see org.crossref.schema._4._4._4Package#getDoiBatchType_Body()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyType getBody();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DoiBatchType#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodyType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"4.4.2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see org.crossref.schema._4._4._4Package#getDoiBatchType_Version()
	 * @model default="4.4.2" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DoiBatchType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.DoiBatchType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.DoiBatchType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // DoiBatchType
