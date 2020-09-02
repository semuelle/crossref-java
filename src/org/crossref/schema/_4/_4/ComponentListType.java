/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ComponentListType#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getComponentListType()
 * @model extendedMetaData="name='component_list_._type' kind='elementOnly'"
 * @generated
 */
public interface ComponentListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container element that allows registration of supplemental
	 * 				information for a journal article, book chapter, or conference paper such as
	 * 				figures, tables, videos, or data sets. Currently, the deposit of components
	 * 				primarily achieves only the first objective as the Crossref system is not setup yet
	 * 				to support queries for components. The metadata associated with a component is
	 * 				intended to enable simple lookup searches of components in the future. When
	 * 				deposited as part of the metadata for a higher level work the parent DOI is
	 * 				implicitly known via the XML hierarchy. When deposited separately the DOI of the
	 * 				higher level work must be provided explicitly (see sa_component) All descriptive
	 * 				elements are optional allowing for the creation of simple anonymous DOIs. The
	 * 				'parent_relation' attribute is mandatory and refers to the DOI described in the
	 * 				component's direct parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getComponentListType_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentType> getComponent();

} // ComponentListType
