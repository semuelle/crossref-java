/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.DatabaseDateType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DatabaseDateType#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DatabaseDateType#getUpdateDate <em>Update Date</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getDatabaseDateType()
 * @model extendedMetaData="name='database_date_._type' kind='elementOnly'"
 * @generated
 */
public interface DatabaseDateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date a database or dataset item was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' containment reference.
	 * @see #setCreationDate(CreationDateType)
	 * @see org.crossref.schema._4._4._4Package#getDatabaseDateType_CreationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='creation_date' namespace='##targetNamespace'"
	 * @generated
	 */
	CreationDateType getCreationDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DatabaseDateType#getCreationDate <em>Creation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' containment reference.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(CreationDateType value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of publication. In all cases, multiple dates are allowed to
	 * 				allow for different dates of publication for online and print versions. This element
	 * 				was previously called date, but was renamed publication_date to distinguish more
	 * 				clearly from conference_date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Date</em>' containment reference.
	 * @see #setPublicationDate(PublicationDateType)
	 * @see org.crossref.schema._4._4._4Package#getDatabaseDateType_PublicationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publication_date' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationDateType getPublicationDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DatabaseDateType#getPublicationDate <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' containment reference.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(PublicationDateType value);

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date a database or dataset item was updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Date</em>' containment reference.
	 * @see #setUpdateDate(UpdateDateType)
	 * @see org.crossref.schema._4._4._4Package#getDatabaseDateType_UpdateDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='update_date' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateDateType getUpdateDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DatabaseDateType#getUpdateDate <em>Update Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' containment reference.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(UpdateDateType value);

} // DatabaseDateType
