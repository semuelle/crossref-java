/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive Locations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ArchiveLocationsType#getArchive <em>Archive</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getArchiveLocationsType()
 * @model extendedMetaData="name='archive_locations_._type' kind='elementOnly'"
 * @generated
 */
public interface ArchiveLocationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Archive</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ArchiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to indicate the designated archiving organization(s) for an
	 * 				item. Values for the name attribute are CLOCKSS, LOCKSS Portico, KB, DWT (Deep Web
	 * 				Technologies), Internet Archive
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getArchiveLocationsType_Archive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='archive' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArchiveType> getArchive();

} // ArchiveLocationsType
