/**
 */
package org.crossref.relations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.relations.ProgramType#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link org.crossref.relations.ProgramType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.crossref.relations.RelationsPackage#getProgramType()
 * @model extendedMetaData="name='program_._type' kind='elementOnly'"
 * @generated
 */
public interface ProgramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.relations.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Item</em>' containment reference list.
	 * @see org.crossref.relations.RelationsPackage#getProgramType_RelatedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related_item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedItemType> getRelatedItem();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"relations"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.crossref.relations.RelationsPackage#getProgramType_Name()
	 * @model default="relations" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.crossref.relations.ProgramType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.crossref.relations.ProgramType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.crossref.relations.ProgramType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // ProgramType
