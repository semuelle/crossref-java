/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ItemType#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ItemType#getResource <em>Resource</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ItemType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ItemType#getCrawler <em>Crawler</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ItemType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ItemType#getLinkHeaderRelationship <em>Link Header Relationship</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getItemType()
 * @model extendedMetaData="name='item_._type' kind='elementOnly'"
 * @generated
 */
public interface ItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DOI for an entity being registered with Crossref. In 2008 Crossref
	 * 				restricted DOI suffix characters to the following: "a-z", "A-Z", "0-9" and "-._;()/"
	 * 				Existing DOIs with suffix characters outside of the allowed set are still supported.
	 * 				For additional information on DOI syntax, see
	 * 				https://support.crossref.org/hc/en-us/articles/214669823
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi</em>' attribute.
	 * @see #setDoi(String)
	 * @see org.crossref.schema._4._4._4Package#getItemType_Doi()
	 * @model dataType="org.crossref.schema._4._4.DoiType"
	 *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDoi();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ItemType#getDoi <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi</em>' attribute.
	 * @see #getDoi()
	 * @generated
	 */
	void setDoi(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element that contains a URI associated with a DOI. URLs are
	 * 				referred to as resources in the 2.0 Crossref schema because they can be any valid
	 * 				URI. Cases of single-resolution (i.e. one DOI with a single corresponding URI)
	 * 				should be tagged with a doi/resource pair in doi_data. Only one resource is allowed
	 * 				per doi_data, the exception being resource elements within a collection element.
	 * 				Values for the "content_version" attribute are vor (version of record) and am
	 * 				(advance manuscript). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(ResourceType)
	 * @see org.crossref.schema._4._4._4Package#getItemType_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceType getResource();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ItemType#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.CountryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see org.crossref.schema._4._4.CountryType
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #setCountry(CountryType)
	 * @see org.crossref.schema._4._4._4Package#getItemType_Country()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='country'"
	 * @generated
	 */
	CountryType getCountry();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ItemType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see org.crossref.schema._4._4.CountryType
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CountryType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ItemType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountry()
	 * @see #getCountry()
	 * @see #setCountry(CountryType)
	 * @generated
	 */
	void unsetCountry();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ItemType#getCountry <em>Country</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Country</em>' attribute is set.
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @see #setCountry(CountryType)
	 * @generated
	 */
	boolean isSetCountry();

	/**
	 * Returns the value of the '<em><b>Crawler</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.CrawlerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crawler</em>' attribute.
	 * @see org.crossref.schema._4._4.CrawlerType
	 * @see #isSetCrawler()
	 * @see #unsetCrawler()
	 * @see #setCrawler(CrawlerType)
	 * @see org.crossref.schema._4._4._4Package#getItemType_Crawler()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='crawler'"
	 * @generated
	 */
	CrawlerType getCrawler();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ItemType#getCrawler <em>Crawler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crawler</em>' attribute.
	 * @see org.crossref.schema._4._4.CrawlerType
	 * @see #isSetCrawler()
	 * @see #unsetCrawler()
	 * @see #getCrawler()
	 * @generated
	 */
	void setCrawler(CrawlerType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ItemType#getCrawler <em>Crawler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrawler()
	 * @see #getCrawler()
	 * @see #setCrawler(CrawlerType)
	 * @generated
	 */
	void unsetCrawler();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ItemType#getCrawler <em>Crawler</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Crawler</em>' attribute is set.
	 * @see #unsetCrawler()
	 * @see #getCrawler()
	 * @see #setCrawler(CrawlerType)
	 * @generated
	 */
	boolean isSetCrawler();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.crossref.schema._4._4._4Package#getItemType_Label()
	 * @model dataType="org.crossref.schema._4._4.LabelType"
	 *        extendedMetaData="kind='attribute' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ItemType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Link Header Relationship</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.LinkHeaderRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Header Relationship</em>' attribute.
	 * @see org.crossref.schema._4._4.LinkHeaderRelationshipType
	 * @see #isSetLinkHeaderRelationship()
	 * @see #unsetLinkHeaderRelationship()
	 * @see #setLinkHeaderRelationship(LinkHeaderRelationshipType)
	 * @see org.crossref.schema._4._4._4Package#getItemType_LinkHeaderRelationship()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='link_header_relationship'"
	 * @generated
	 */
	LinkHeaderRelationshipType getLinkHeaderRelationship();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ItemType#getLinkHeaderRelationship <em>Link Header Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Header Relationship</em>' attribute.
	 * @see org.crossref.schema._4._4.LinkHeaderRelationshipType
	 * @see #isSetLinkHeaderRelationship()
	 * @see #unsetLinkHeaderRelationship()
	 * @see #getLinkHeaderRelationship()
	 * @generated
	 */
	void setLinkHeaderRelationship(LinkHeaderRelationshipType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ItemType#getLinkHeaderRelationship <em>Link Header Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinkHeaderRelationship()
	 * @see #getLinkHeaderRelationship()
	 * @see #setLinkHeaderRelationship(LinkHeaderRelationshipType)
	 * @generated
	 */
	void unsetLinkHeaderRelationship();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ItemType#getLinkHeaderRelationship <em>Link Header Relationship</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Link Header Relationship</em>' attribute is set.
	 * @see #unsetLinkHeaderRelationship()
	 * @see #getLinkHeaderRelationship()
	 * @see #setLinkHeaderRelationship(LinkHeaderRelationshipType)
	 * @generated
	 */
	boolean isSetLinkHeaderRelationship();

} // ItemType
