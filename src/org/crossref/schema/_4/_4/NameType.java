/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Name Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getNameType()
 * @model extendedMetaData="name='name_._type'"
 * @generated
 */
public enum NameType implements Enumerator {
	/**
	 * The '<em><b>CLOCKSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOCKSS_VALUE
	 * @generated
	 * @ordered
	 */
	CLOCKSS(0, "CLOCKSS", "CLOCKSS"),

	/**
	 * The '<em><b>LOCKSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKSS_VALUE
	 * @generated
	 * @ordered
	 */
	LOCKSS(1, "LOCKSS", "LOCKSS"),

	/**
	 * The '<em><b>Portico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTICO_VALUE
	 * @generated
	 * @ordered
	 */
	PORTICO(2, "Portico", "Portico"),

	/**
	 * The '<em><b>KB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KB_VALUE
	 * @generated
	 * @ordered
	 */
	KB(3, "KB", "KB"),

	/**
	 * The '<em><b>Internet Archive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_ARCHIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNET_ARCHIVE(4, "InternetArchive", "Internet Archive"),

	/**
	 * The '<em><b>DWT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DWT_VALUE
	 * @generated
	 * @ordered
	 */
	DWT(5, "DWT", "DWT");

	/**
	 * The '<em><b>CLOCKSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOCKSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOCKSS_VALUE = 0;

	/**
	 * The '<em><b>LOCKSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCKSS_VALUE = 1;

	/**
	 * The '<em><b>Portico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTICO
	 * @model name="Portico"
	 * @generated
	 * @ordered
	 */
	public static final int PORTICO_VALUE = 2;

	/**
	 * The '<em><b>KB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KB_VALUE = 3;

	/**
	 * The '<em><b>Internet Archive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_ARCHIVE
	 * @model name="InternetArchive" literal="Internet Archive"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNET_ARCHIVE_VALUE = 4;

	/**
	 * The '<em><b>DWT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DWT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DWT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NameType[] VALUES_ARRAY =
		new NameType[] {
			CLOCKSS,
			LOCKSS,
			PORTICO,
			KB,
			INTERNET_ARCHIVE,
			DWT,
		};

	/**
	 * A public read-only list of all the '<em><b>Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NameType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType get(int value) {
		switch (value) {
			case CLOCKSS_VALUE: return CLOCKSS;
			case LOCKSS_VALUE: return LOCKSS;
			case PORTICO_VALUE: return PORTICO;
			case KB_VALUE: return KB;
			case INTERNET_ARCHIVE_VALUE: return INTERNET_ARCHIVE;
			case DWT_VALUE: return DWT;
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
	private NameType(int value, String name, String literal) {
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
	
} //NameType
