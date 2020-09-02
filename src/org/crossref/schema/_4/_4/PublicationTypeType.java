/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Publication Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getPublicationTypeType()
 * @model extendedMetaData="name='publication_type_._type'"
 * @generated
 */
public enum PublicationTypeType implements Enumerator {
	/**
	 * The '<em><b>Abstract Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT_ONLY(0, "abstractOnly", "abstract_only"),

	/**
	 * The '<em><b>Full Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_TEXT(1, "fullText", "full_text"),

	/**
	 * The '<em><b>Bibliographic Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIBLIOGRAPHIC_RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	BIBLIOGRAPHIC_RECORD(2, "bibliographicRecord", "bibliographic_record");

	/**
	 * The '<em><b>Abstract Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_ONLY
	 * @model name="abstractOnly" literal="abstract_only"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Full Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_TEXT
	 * @model name="fullText" literal="full_text"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_TEXT_VALUE = 1;

	/**
	 * The '<em><b>Bibliographic Record</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIBLIOGRAPHIC_RECORD
	 * @model name="bibliographicRecord" literal="bibliographic_record"
	 * @generated
	 * @ordered
	 */
	public static final int BIBLIOGRAPHIC_RECORD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Publication Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PublicationTypeType[] VALUES_ARRAY =
		new PublicationTypeType[] {
			ABSTRACT_ONLY,
			FULL_TEXT,
			BIBLIOGRAPHIC_RECORD,
		};

	/**
	 * A public read-only list of all the '<em><b>Publication Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PublicationTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Publication Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublicationTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PublicationTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Publication Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublicationTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PublicationTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Publication Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublicationTypeType get(int value) {
		switch (value) {
			case ABSTRACT_ONLY_VALUE: return ABSTRACT_ONLY;
			case FULL_TEXT_VALUE: return FULL_TEXT;
			case BIBLIOGRAPHIC_RECORD_VALUE: return BIBLIOGRAPHIC_RECORD;
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
	private PublicationTypeType(int value, String name, String literal) {
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
	
} //PublicationTypeType
