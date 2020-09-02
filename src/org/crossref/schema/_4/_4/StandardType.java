/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.StandardType#getStandardMetadata <em>Standard Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StandardType#getContentItem <em>Content Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StandardType#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StandardType#getPublicationType <em>Publication Type</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getStandardType()
 * @model extendedMetaData="name='standard_._type' kind='elementOnly'"
 * @generated
 */
public interface StandardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Standard Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard_metadata is used as a wrapper for the metadata related to a
	 * 				Standard that is not part of a series. standard_metadata is similar to
	 * 				book_metadata. It differs in that standard_metadata adds the elements institution
	 * 				and approval_date. contributors contains the author(s) of the standard. In most
	 * 				cases, it is expected that the organization element will be used rather than
	 * 				person_name element for standards. However in some cases, standards are cited by
	 * 				their individual authors. In such cases, individual authors should be deposited with
	 * 				person_name, and the SDO or consortia name should be deposited with the organization
	 * 				element in contributors and also the standards_body_name element in standards_body
	 * 				Note that when the organization element is used in contributors, it should have the
	 * 				name of the committee (when appropriate) that developed the standard, not the name
	 * 				of the Standards Development Organization (SDO) or consortia. The SDO or consortia
	 * 				name should be placed in the publisher or standards_body element (as appropriate)
	 * 				Standards more often have version numbers than edition numbers. However the
	 * 				edition_number element can be used for deposit of the version number of a standard
	 * 				approval_date should be used for the date that a standard has been accepted or
	 * 				re-affirmed if different from the date of publication. Both may be provided even if
	 * 				identical Within publisher_item, the designation should be placed inside the
	 * 				item_number element, and the id_type should be set to "designation" to indicate a
	 * 				standard designation. Standards are typically sponsored or hosted by SDOs or
	 * 				Consortia. In some cases standards are published by a traditional publisher rather
	 * 				than by the owning organization. Such cases may be deposited with one or more
	 * 				publishers. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Metadata</em>' containment reference.
	 * @see #setStandardMetadata(StandardMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getStandardType_StandardMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standard_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardMetadataType getStandardMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StandardType#getStandardMetadata <em>Standard Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Metadata</em>' containment reference.
	 * @see #getStandardMetadata()
	 * @generated
	 */
	void setStandardMetadata(StandardMetadataType value);

	/**
	 * Returns the value of the '<em><b>Content Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ContentItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity in a book, such as a chapter, for which a DOI is being
	 * 				registered. A content item is typically an entity listed on the table of contents.
	 * 				There need not be a one-to-one correlation between content listings and content
	 * 				items (e.g. you may choose not to register front and back matter items listed in the
	 * 				table of contents). The language of a content_item only need be set if it differs
	 * 				from the language of book_metadata. The component_type indicates the type of content
	 * 				item you are registering. Please see the example of a book submission in this
	 * 				documentation for a better understanding of how this attribute may be used in nested
	 * 				tables of contents. level_sequence_number indicates the level of nesting for content
	 * 				items. For example, you may use it to indicate when one content item, such as a
	 * 				chapter, is actually inside another content item, such as a section. Please see the
	 * 				example of a book submission in this documentation for a better understanding of how
	 * 				this attribute may be used in nested tables of contents. Note: Because the Crossref
	 * 				schema uses a flat model to indicate hierarchically nested content items, there is
	 * 				an implicit assumption that content items will be listed in the Crossref submission
	 * 				in the same order in which they appear in the table of contents. Please follow this
	 * 				protocol when submitting DOI data for books. This order is not required for journal
	 * 				and conference data. contributors for a content_item need not be listed if all items
	 * 				in a book have the same contributors listed in book_metadata. In other words,
	 * 				contributors must be listed for edited books, but they should not be listed for each
	 * 				content_item in a monograph. The exception case is when a content item such as a
	 * 				Preface or Forward for a monograph has a different author from that of the
	 * 				monograph. In this case, the contributors should be given. The title of each content
	 * 				item must be submitted. If, however, you are submitted data for a monograph that
	 * 				simply has "Chapter 1", "Chapter 2", etc., you should put this information in
	 * 				component_number, not titles. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Item</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getStandardType_ContentItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content_item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentItemType> getContentItem();

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
	 * @see org.crossref.schema._4._4._4Package#getStandardType_ComponentList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component_list' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentListType getComponentList();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StandardType#getComponentList <em>Component List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component List</em>' containment reference.
	 * @see #getComponentList()
	 * @generated
	 */
	void setComponentList(ComponentListType value);

	/**
	 * Returns the value of the '<em><b>Publication Type</b></em>' attribute.
	 * The default value is <code>"full_text"</code>.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.PublicationTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Type</em>' attribute.
	 * @see org.crossref.schema._4._4.PublicationTypeType
	 * @see #isSetPublicationType()
	 * @see #unsetPublicationType()
	 * @see #setPublicationType(PublicationTypeType)
	 * @see org.crossref.schema._4._4._4Package#getStandardType_PublicationType()
	 * @model default="full_text" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='publication_type'"
	 * @generated
	 */
	PublicationTypeType getPublicationType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StandardType#getPublicationType <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Type</em>' attribute.
	 * @see org.crossref.schema._4._4.PublicationTypeType
	 * @see #isSetPublicationType()
	 * @see #unsetPublicationType()
	 * @see #getPublicationType()
	 * @generated
	 */
	void setPublicationType(PublicationTypeType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.StandardType#getPublicationType <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublicationType()
	 * @see #getPublicationType()
	 * @see #setPublicationType(PublicationTypeType)
	 * @generated
	 */
	void unsetPublicationType();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.StandardType#getPublicationType <em>Publication Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Publication Type</em>' attribute is set.
	 * @see #unsetPublicationType()
	 * @see #getPublicationType()
	 * @see #setPublicationType(PublicationTypeType)
	 * @generated
	 */
	boolean isSetPublicationType();

} // StandardType
