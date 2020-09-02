/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Crawler Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getCrawlerType()
 * @model extendedMetaData="name='crawler_._type'"
 * @generated
 */
public enum CrawlerType implements Enumerator {
	/**
	 * The '<em><b>Google</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_VALUE
	 * @generated
	 * @ordered
	 */
	GOOGLE(0, "google", "google"),

	/**
	 * The '<em><b>Msn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSN_VALUE
	 * @generated
	 * @ordered
	 */
	MSN(1, "msn", "msn"),

	/**
	 * The '<em><b>Scirus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIRUS_VALUE
	 * @generated
	 * @ordered
	 */
	SCIRUS(2, "scirus", "scirus"),

	/**
	 * The '<em><b>Yahoo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YAHOO_VALUE
	 * @generated
	 * @ordered
	 */
	YAHOO(3, "yahoo", "yahoo"),

	/**
	 * The '<em><b>IParadigms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPARADIGMS_VALUE
	 * @generated
	 * @ordered
	 */
	IPARADIGMS(4, "iParadigms", "iParadigms");

	/**
	 * The '<em><b>Google</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE
	 * @model name="google"
	 * @generated
	 * @ordered
	 */
	public static final int GOOGLE_VALUE = 0;

	/**
	 * The '<em><b>Msn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSN
	 * @model name="msn"
	 * @generated
	 * @ordered
	 */
	public static final int MSN_VALUE = 1;

	/**
	 * The '<em><b>Scirus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIRUS
	 * @model name="scirus"
	 * @generated
	 * @ordered
	 */
	public static final int SCIRUS_VALUE = 2;

	/**
	 * The '<em><b>Yahoo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YAHOO
	 * @model name="yahoo"
	 * @generated
	 * @ordered
	 */
	public static final int YAHOO_VALUE = 3;

	/**
	 * The '<em><b>IParadigms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPARADIGMS
	 * @model name="iParadigms"
	 * @generated
	 * @ordered
	 */
	public static final int IPARADIGMS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Crawler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CrawlerType[] VALUES_ARRAY =
		new CrawlerType[] {
			GOOGLE,
			MSN,
			SCIRUS,
			YAHOO,
			IPARADIGMS,
		};

	/**
	 * A public read-only list of all the '<em><b>Crawler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CrawlerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Crawler Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CrawlerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CrawlerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crawler Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CrawlerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CrawlerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crawler Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CrawlerType get(int value) {
		switch (value) {
			case GOOGLE_VALUE: return GOOGLE;
			case MSN_VALUE: return MSN;
			case SCIRUS_VALUE: return SCIRUS;
			case YAHOO_VALUE: return YAHOO;
			case IPARADIGMS_VALUE: return IPARADIGMS;
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
	private CrawlerType(int value, String name, String literal) {
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
	
} //CrawlerType
