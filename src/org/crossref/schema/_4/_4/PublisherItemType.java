/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.PublisherItemType#getItemNumber <em>Item Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PublisherItemType#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getPublisherItemType()
 * @model extendedMetaData="name='publisher_item_._type' kind='elementOnly'"
 * @generated
 */
public interface PublisherItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Item Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ItemNumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A publisher identifier that can be used to uniquely identify the
	 * 				entity being registered. This identifier is a publisher-assigned number that
	 * 				uniquely identifies the entity being registered. This element should be used for
	 * 				identifiers based on publisher internal standards. Use identifier for a publisher
	 * 				identifier that is based on a public standard such as PII or SICI. If the
	 * 				item_number and identifier are identical, there is no need to submit both. In this
	 * 				case, the preferred element to use is identifier. Data may be alpha, numeric or a
	 * 				combination. item_number has an optional attribute, item_number_type. It is assigned
	 * 				by the publisher to provide context for the data in item_number. If item_number
	 * 				contains only a publisher's tracking number, this attribute need not be supplied. If
	 * 				the item_number contains other data, this attribute can be used to define the
	 * 				content. For example, if a journal is published online (i.e. it has no page
	 * 				numbers), and each article on the table of contents is assigned a sequential number,
	 * 				this article number can be placed in item_number, and the item_number_type attribute
	 * 				can be set to "article_number". Although Crossref has not provided a set of
	 * 				enumerated types for this attribute, please check with Crossref before using this
	 * 				attribute to determine if a standard attribute has already been defined for your
	 * 				specific needs. If a dissertation DAI has been assigned, it should be deposited in
	 * 				the identifier element with the id_type attribute set to "dai". If an institution
	 * 				has its own numbering system, it should be deposited in item_number, and the
	 * 				item_number_type should be set to "institution" If the report number of an item
	 * 				follows Z39.23, the number should be deposited in the identifier element with the
	 * 				id_type attribute set to "Z39.23". If a report number uses its own numbering system,
	 * 				it should be deposited in the identifier element, and the id_type should be set to
	 * 				"report-number" The designation for a standard should be placed inside the
	 * 				identifier element with the id_type attribute set to "ISO-std-ref" or
	 * 				"std-designation" (more generic label)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Number</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getPublisherItemType_ItemNumber()
	 * @model containment="true" upper="3"
	 *        extendedMetaData="kind='element' name='item_number' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemNumberType> getItemNumber();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.IdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A public standard identifier that can be used to uniquely identify
	 * 				the entity being registered. This identifier is a publisher-assigned number that
	 * 				uniquely identifies the entity being registered. This element should be used for
	 * 				identifiers based on public standards. Use item_number for a publisher identifier
	 * 				that is based on a publisher's internal systems rather than on a public standard.
	 * 				The supported standards are: PII - Publisher Item Identifier SICI - Serial Item and
	 * 				Contribution Identifier DOI - Digital Object Identifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getPublisherItemType_Identifier()
	 * @model containment="true" upper="10"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentifierType> getIdentifier();

} // PublisherItemType
