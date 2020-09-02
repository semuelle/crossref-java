/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.BookType#getBookMetadata <em>Book Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookType#getBookSeriesMetadata <em>Book Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookType#getBookSetMetadata <em>Book Set Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookType#getContentItem <em>Content Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.BookType#getBookType <em>Book Type</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getBookType()
 * @model extendedMetaData="name='book_._type' kind='elementOnly'"
 * @generated
 */
public interface BookType extends EObject {
	/**
	 * Returns the value of the '<em><b>Book Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to a monograph. It does
	 * 				not include metadata about individual chapters. The language of the book should be
	 * 				specified in the book_metadata language attribute. If a book contains items in
	 * 				multiple languages this attribute should be set for the predominant language of the
	 * 				book. Individual items may have their language specified in content_item. If all
	 * 				content items are the same language, it is only necessary to specify the language of
	 * 				the book in this element. The contributors are the author(s) or editor(s) of the
	 * 				entire work. When using book_metadata, specify the title of the book within
	 * 				book_metadata. edition_number, when given, should include only a number and not
	 * 				additional text such as "edition" or "ed". publisher_item, when given, specifies
	 * 				this information for the entire book or volume. This element also appears in
	 * 				content_item. doi_data is required for each book or volume that you submit. It is
	 * 				not possible to submit DOI information for individual chapters without assigning a
	 * 				DOI to the entire work. Note: citation_list should only be used in book_metadata
	 * 				instead of content_item when the reference list is a separate section of the book,
	 * 				and content_items are not included in the deposit (e.g. you are depositing a book
	 * 				with a bibliography, but not the chapters of the book) In very limited circumstances
	 * 				a book may be deposited without an ISBN, in which case the noisbn element must be
	 * 				supplied to explicitly declare that an ISBN is not accidentily omitted. Great care
	 * 				should be taken when choossing to use noisbn since it may adversely effect matching.
	 * 				This provision is primarily being made to allow for the deposit of DOIs for
	 * 				historical volumes that are difficult to obtain ISBNs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Book Metadata</em>' containment reference.
	 * @see #setBookMetadata(BookMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getBookType_BookMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='book_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	BookMetadataType getBookMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookType#getBookMetadata <em>Book Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Metadata</em>' containment reference.
	 * @see #getBookMetadata()
	 * @generated
	 */
	void setBookMetadata(BookMetadataType value);

	/**
	 * Returns the value of the '<em><b>Book Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to an individual volume
	 * 				of a book series. It does not include metadata about individual chapters. The
	 * 				language of the book should be specified in the book_series_metadata language
	 * 				attribute. If a book contains items in multiple languages this attribute should be
	 * 				set for the predominant language of the book. Individual items may have their
	 * 				language specified in content_item. If all content items are the same language, it
	 * 				is only necessary to specify the language of the book in this element. The
	 * 				contributors are the author(s) or editor(s) of the entire work. If a multi- volume
	 * 				work has separate editors for each volume, those editors should be specified in this
	 * 				element, and the series editors are listed in the series_metadata contributors.
	 * 				Series titles should be specified within series_metadata. Volume titles (when
	 * 				present) are captured in book_series_metadata. If the volumes of a series only have
	 * 				volume numbers and not individual titles, you may specify the volume number within
	 * 				volume_metadata, and no title is required. volume and edition_number, when given,
	 * 				should include only a number and not additional text such as "volume" or "edition".
	 * 				For example, you should submit "3", not "third edition". If a work spans multiple
	 * 				volumes with a unique ISBN for each volume and the whole series, you should specify
	 * 				the series ISBN in isbn in series_metadata and the volume ISBN in isbn in
	 * 				book_series_metadata. WARNING: Care must be taken when submitting books with series.
	 * 				If a series title is submitted and no book title is supplied but an ISBN is supplied
	 * 				at the book_series_metadata level and not with the series title, the Crossref system
	 * 				will index a series title with no ISBN and an ISBN with no title. Please take care
	 * 				to associate the ISBN at the correct level of the XML hierarchy. publisher_item,
	 * 				when given, specifies this information for the entire book or volume. This element
	 * 				also appears in content_item. doi_data is required for each book or volume that you
	 * 				submit. It is not possible to submit DOI information for individual chapters without
	 * 				assigning a DOI to the entire work. Note: citation_list should only be used in
	 * 				book_series_metadata instead of content_item when the reference list is a separate
	 * 				section of the book, and content_items are not included in the deposit (e.g. you are
	 * 				depositing a book with a bibliography, but not the chapters of the book) Normally
	 * 				book content that is published as a series is required to have a series title with
	 * 				an ISSN and a book title and/or a book volume number along with a book ISBN. An
	 * 				exception is when book chapters are published on line first prior to being assigned
	 * 				to a specific book in which case only the series title (and ISSN) is known at time
	 * 				of DOI registration. Element unassigned_content is used as a placeholder to force
	 * 				recognition of this condition and thus prevent accidental omission of book level
	 * 				title information. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Book Series Metadata</em>' containment reference.
	 * @see #setBookSeriesMetadata(BookSeriesMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getBookType_BookSeriesMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='book_series_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	BookSeriesMetadataType getBookSeriesMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookType#getBookSeriesMetadata <em>Book Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Series Metadata</em>' containment reference.
	 * @see #getBookSeriesMetadata()
	 * @generated
	 */
	void setBookSeriesMetadata(BookSeriesMetadataType value);

	/**
	 * Returns the value of the '<em><b>Book Set Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to an individual volume
	 * 				of a book set. It does not include metadata about individual chapters. A set is a
	 * 				finite series, and does not have an ISSN The language of the book should be
	 * 				specified in the book_set_metadata language attribute. If a book contains items in
	 * 				multiple languages this attribute should be set for the predominant language of the
	 * 				book. Individual items may have their language specified in content_item. If all
	 * 				content items are the same language, it is only necessary to specify the language of
	 * 				the book in this element. The contributors are the author(s) or editor(s) of the
	 * 				entire work. If a multi- volume work has separate editors for each volume, those
	 * 				editors should be specified in this element, and the series editors are listed in
	 * 				the series_metadata contributors. When using book_set_metadata, specify the title of
	 * 				the entire set and the isbn of the set. Specify the title of the volume in
	 * 				volume_metadata. If the volumes of a set only have volume numbers and not individual
	 * 				titles, you may specify the volume number within volume_metadata, and no title is
	 * 				required. volume and edition_number, when given, should include only a number and
	 * 				not additional text such as "volume" or "edition". For example, you should submit
	 * 				"3", not "third edition". If a work spans multiple volumes with a unique ISBN for
	 * 				each volume and the whole series, you should specify the series ISBN in isbn in
	 * 				series_metadata and the volume ISBN in isbn in book_series_metadata. publisher_item,
	 * 				when given, specifies this information for the entire book or volume. This element
	 * 				also appears in content_item. doi_data is required for each book or volume that you
	 * 				submit. It is not possible to submit DOI information for individual chapters without
	 * 				assigning a DOI to the entire work. Note: citation_list should only be used in
	 * 				book_series_metadata instead of content_item when the reference list is a separate
	 * 				section of the book, and content_items are not included in the deposit (e.g. you are
	 * 				depositing a book with a bibliography, but not the chapters of the
	 * 				book)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Book Set Metadata</em>' containment reference.
	 * @see #setBookSetMetadata(BookSetMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getBookType_BookSetMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='book_set_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	BookSetMetadataType getBookSetMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookType#getBookSetMetadata <em>Book Set Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Set Metadata</em>' containment reference.
	 * @see #getBookSetMetadata()
	 * @generated
	 */
	void setBookSetMetadata(BookSetMetadataType value);

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
	 * @see org.crossref.schema._4._4._4Package#getBookType_ContentItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content_item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentItemType> getContentItem();

	/**
	 * Returns the value of the '<em><b>Book Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.BookTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book Type</em>' attribute.
	 * @see org.crossref.schema._4._4.BookTypeType
	 * @see #isSetBookType()
	 * @see #unsetBookType()
	 * @see #setBookType(BookTypeType)
	 * @see org.crossref.schema._4._4._4Package#getBookType_BookType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='book_type'"
	 * @generated
	 */
	BookTypeType getBookType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.BookType#getBookType <em>Book Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Type</em>' attribute.
	 * @see org.crossref.schema._4._4.BookTypeType
	 * @see #isSetBookType()
	 * @see #unsetBookType()
	 * @see #getBookType()
	 * @generated
	 */
	void setBookType(BookTypeType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.BookType#getBookType <em>Book Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBookType()
	 * @see #getBookType()
	 * @see #setBookType(BookTypeType)
	 * @generated
	 */
	void unsetBookType();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.BookType#getBookType <em>Book Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Book Type</em>' attribute is set.
	 * @see #unsetBookType()
	 * @see #getBookType()
	 * @see #setBookType(BookTypeType)
	 * @generated
	 */
	boolean isSetBookType();

} // BookType
