/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getPropertyType1()
 * @model extendedMetaData="name='property_._1_._type'"
 * @generated
 */
public enum PropertyType1 implements Enumerator {
	/**
	 * The '<em><b>List Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	LIST_BASED(0, "listBased", "list-based"),

	/**
	 * The '<em><b>Country Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTRY_BASED(1, "countryBased", "country-based"),

	/**
	 * The '<em><b>Crawler Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRAWLER_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	CRAWLER_BASED(2, "crawlerBased", "crawler-based"),

	/**
	 * The '<em><b>Text Mining</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_MINING_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_MINING(3, "textMining", "text-mining"),

	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(4, "unspecified", "unspecified"),

	/**
	 * The '<em><b>Syndication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	SYNDICATION(5, "syndication", "syndication"),

	/**
	 * The '<em><b>Link Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINK_HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	LINK_HEADER(6, "linkHeader", "link-header");

	/**
	 * The '<em><b>List Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_BASED
	 * @model name="listBased" literal="list-based"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_BASED_VALUE = 0;

	/**
	 * The '<em><b>Country Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_BASED
	 * @model name="countryBased" literal="country-based"
	 * @generated
	 * @ordered
	 */
	public static final int COUNTRY_BASED_VALUE = 1;

	/**
	 * The '<em><b>Crawler Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRAWLER_BASED
	 * @model name="crawlerBased" literal="crawler-based"
	 * @generated
	 * @ordered
	 */
	public static final int CRAWLER_BASED_VALUE = 2;

	/**
	 * The '<em><b>Text Mining</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_MINING
	 * @model name="textMining" literal="text-mining"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_MINING_VALUE = 3;

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED
	 * @model name="unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 4;

	/**
	 * The '<em><b>Syndication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNDICATION
	 * @model name="syndication"
	 * @generated
	 * @ordered
	 */
	public static final int SYNDICATION_VALUE = 5;

	/**
	 * The '<em><b>Link Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINK_HEADER
	 * @model name="linkHeader" literal="link-header"
	 * @generated
	 * @ordered
	 */
	public static final int LINK_HEADER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Property Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyType1[] VALUES_ARRAY =
		new PropertyType1[] {
			LIST_BASED,
			COUNTRY_BASED,
			CRAWLER_BASED,
			TEXT_MINING,
			UNSPECIFIED,
			SYNDICATION,
			LINK_HEADER,
		};

	/**
	 * A public read-only list of all the '<em><b>Property Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyType1 get(int value) {
		switch (value) {
			case LIST_BASED_VALUE: return LIST_BASED;
			case COUNTRY_BASED_VALUE: return COUNTRY_BASED;
			case CRAWLER_BASED_VALUE: return CRAWLER_BASED;
			case TEXT_MINING_VALUE: return TEXT_MINING;
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case SYNDICATION_VALUE: return SYNDICATION;
			case LINK_HEADER_VALUE: return LINK_HEADER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PropertyType1(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PropertyType1
