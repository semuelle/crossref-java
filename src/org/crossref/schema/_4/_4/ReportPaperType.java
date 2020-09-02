/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Paper Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ReportPaperType#getReportPaperMetadata <em>Report Paper Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ReportPaperType#getReportPaperSeriesMetadata <em>Report Paper Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ReportPaperType#getContentItem <em>Content Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ReportPaperType#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ReportPaperType#getPublicationType <em>Publication Type</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getReportPaperType()
 * @model extendedMetaData="name='report-paper_._type' kind='elementOnly'"
 * @generated
 */
public interface ReportPaperType extends EObject {
	/**
	 * Returns the value of the '<em><b>Report Paper Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * report-paper_metadata is used as a wrapper for the metadata related
	 * 				to a Technical Report or Working Paper. report-paper_metadata is almost identical to
	 * 				book_metadata. It differs only in that report-paper_metadata removes the volume
	 * 				number and adds the elements institution and contract_number. Please see the
	 * 				comments for book_metadata about the usage of most elements in report-
	 * 				paper_metadata. Reports and Working Papers are often sponsored by either
	 * 				universities or by a non-academic organization (corporate or government). Such
	 * 				institutions are not typically considered "publishers" and so the item may be
	 * 				deposited using the institution element. Multiple element instances are permitted so
	 * 				the sponsoring institution and publishing institution can both be deposited as
	 * 				authors may cite either. If the report number of an item follows Z39.23, the number
	 * 				should be deposited in the identifier element with the id_type attribute set to
	 * 				"Z39.23". If a report number uses its own numbering system, it should be deposited
	 * 				in item_number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Paper Metadata</em>' containment reference.
	 * @see #setReportPaperMetadata(ReportPaperMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getReportPaperType_ReportPaperMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='report-paper_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportPaperMetadataType getReportPaperMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ReportPaperType#getReportPaperMetadata <em>Report Paper Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Paper Metadata</em>' containment reference.
	 * @see #getReportPaperMetadata()
	 * @generated
	 */
	void setReportPaperMetadata(ReportPaperMetadataType value);

	/**
	 * Returns the value of the '<em><b>Report Paper Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * report-paper_series_metadata is used as a wrapper for the metadata
	 * 				related to a Technical Report or Working Paper that is part of a series.
	 * 				report-paper_series_metadata is almost identical to book_series_metadata. It differs
	 * 				only in that report-paper_metadata removes the volume number and adds the elements
	 * 				institution and contract_number. Please see the comments for book_series_metadata
	 * 				about the usage of most elements in report- paper_series_metadata. Reports and
	 * 				Working Papers are often sponsored by either universities or by a non-academic
	 * 				organization (corporate or government). Such institutions are not typically
	 * 				considered "publishers" and so the item may be deposited using the institution
	 * 				element. Multiple element instances are permitted so the sponsoring institution and
	 * 				publishing institution can both be deposited as authors may cite either. If the
	 * 				report number of an item follows Z39.23, the number should be deposited in the
	 * 				identifier element with the id_type attribute set to "Z39.23". If a report number
	 * 				uses its own numbering system, it should be deposited in
	 * 				item_number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Paper Series Metadata</em>' containment reference.
	 * @see #setReportPaperSeriesMetadata(ReportPaperSeriesMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getReportPaperType_ReportPaperSeriesMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='report-paper_series_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportPaperSeriesMetadataType getReportPaperSeriesMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ReportPaperType#getReportPaperSeriesMetadata <em>Report Paper Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Paper Series Metadata</em>' containment reference.
	 * @see #getReportPaperSeriesMetadata()
	 * @generated
	 */
	void setReportPaperSeriesMetadata(ReportPaperSeriesMetadataType value);

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
	 * @see org.crossref.schema._4._4._4Package#getReportPaperType_ContentItem()
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
	 * @see org.crossref.schema._4._4._4Package#getReportPaperType_ComponentList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component_list' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentListType getComponentList();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ReportPaperType#getComponentList <em>Component List</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getReportPaperType_PublicationType()
	 * @model default="full_text" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='publication_type'"
	 * @generated
	 */
	PublicationTypeType getPublicationType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ReportPaperType#getPublicationType <em>Publication Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ReportPaperType#getPublicationType <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublicationType()
	 * @see #getPublicationType()
	 * @see #setPublicationType(PublicationTypeType)
	 * @generated
	 */
	void unsetPublicationType();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ReportPaperType#getPublicationType <em>Publication Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Publication Type</em>' attribute is set.
	 * @see #unsetPublicationType()
	 * @see #getPublicationType()
	 * @see #setPublicationType(PublicationTypeType)
	 * @generated
	 */
	boolean isSetPublicationType();

} // ReportPaperType
