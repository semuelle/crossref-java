/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.CitationListType#getCitation <em>Citation</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getCitationListType()
 * @model extendedMetaData="name='citation_list_._type' kind='elementOnly'"
 * @generated
 */
public interface CitationListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.CitationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * citation is used to deposit each citation in the reference list of
	 * 				the item for which the DOI is being deposited. For details see:
	 * 				https://crossref.zendesk.com/hc/en-us/articles/215578403 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getCitationListType_Citation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationType> getCitation();

} // CitationListType
