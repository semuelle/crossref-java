/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Updates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.UpdatesType#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getUpdatesType()
 * @model extendedMetaData="name='updates_._type' kind='elementOnly'"
 * @generated
 */
public interface UpdatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.UpdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DOI of the content being updated (e.g. corrected, retracted,
	 * 				etc.) In the CrossMark Terms and Conditions "updates" are defined as changes that
	 * 				are likely to "change the reader’s interpretation or crediting of the work." That
	 * 				is, *editorially significant* changes. "Updates" should not include minor changes to
	 * 				spelling, punctuation, formatting, etc. Attributes: label: Required attribute. This
	 * 				should be a human-readable version of the "type" attribute. This is what gets
	 * 				displayed in the CrossMark dialog when there is an update. type: Required attribute.
	 * 				This attribute should be used to give the machine-readable name of the update type.
	 * 				The human-readable version of the type should be but in the "label" attribute. There
	 * 				are many "types" of updates. "Corrections, "clarifications", "retractions" and
	 * 				"withdrawals" are just a few of the better-known types. For these common types we
	 * 				recommend you use the values "correction", "clarification", "retraction" and
	 * 				"withdrawal" respectively as per your editorial policy. However, different
	 * 				publishers sometimes have to support different, custom update types- for instance,
	 * 				"protocol amendments", "letters of concern", "comments", etc. The attribute supports
	 * 				custom types as well. date: The date of the update will be displayed in the
	 * 				CrossMark dialog and can help the researcher easily tell whther they are likley to
	 * 				have seen the update.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getUpdatesType_Update()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='update' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UpdateType> getUpdate();

} // UpdatesType
