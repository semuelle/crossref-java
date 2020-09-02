/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sa Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.SaComponentType#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.SaComponentType#getParentDoi <em>Parent Doi</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getSaComponentType()
 * @model extendedMetaData="name='sa_component_._type' kind='elementOnly'"
 * @generated
 */
public interface SaComponentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The wrapper element for including a group of components under a
	 * 				journal article, conference proceeding, book chapter, stand alone component,
	 * 				dissertation, technical report or working paper, standard, or
	 * 				database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component List</em>' containment reference.
	 * @see #setComponentList(ComponentListType)
	 * @see org.crossref.schema._4._4._4Package#getSaComponentType_ComponentList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='component_list' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentListType getComponentList();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SaComponentType#getComponentList <em>Component List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component List</em>' containment reference.
	 * @see #getComponentList()
	 * @generated
	 */
	void setComponentList(ComponentListType value);

	/**
	 * Returns the value of the '<em><b>Parent Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Doi</em>' attribute.
	 * @see #setParentDoi(String)
	 * @see org.crossref.schema._4._4._4Package#getSaComponentType_ParentDoi()
	 * @model dataType="org.crossref.schema._4._4.ParentDoiType" required="true"
	 *        extendedMetaData="kind='attribute' name='parent_doi'"
	 * @generated
	 */
	String getParentDoi();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.SaComponentType#getParentDoi <em>Parent Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Doi</em>' attribute.
	 * @see #getParentDoi()
	 * @generated
	 */
	void setParentDoi(String value);

} // SaComponentType
