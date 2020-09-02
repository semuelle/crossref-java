/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ArchiveType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getArchiveType()
 * @model extendedMetaData="name='archive_._type' kind='empty'"
 * @generated
 */
public interface ArchiveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.NameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.crossref.schema._4._4.NameType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(NameType)
	 * @see org.crossref.schema._4._4._4Package#getArchiveType_Name()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ArchiveType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see org.crossref.schema._4._4.NameType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ArchiveType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(NameType)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ArchiveType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(NameType)
	 * @generated
	 */
	boolean isSetName();

} // ArchiveType
