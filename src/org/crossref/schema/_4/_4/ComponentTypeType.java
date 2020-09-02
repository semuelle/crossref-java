/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getComponentTypeType()
 * @model extendedMetaData="name='component_type_._type'"
 * @generated
 */
public enum ComponentTypeType implements Enumerator {
	/**
	 * The '<em><b>Chapter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER_VALUE
	 * @generated
	 * @ordered
	 */
	CHAPTER(0, "chapter", "chapter"),

	/**
	 * The '<em><b>Section</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SECTION(1, "section", "section"),

	/**
	 * The '<em><b>Part</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PART_VALUE
	 * @generated
	 * @ordered
	 */
	PART(2, "part", "part"),

	/**
	 * The '<em><b>Track</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACK_VALUE
	 * @generated
	 * @ordered
	 */
	TRACK(3, "track", "track"),

	/**
	 * The '<em><b>Reference Entry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_ENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE_ENTRY(4, "referenceEntry", "reference_entry"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "other", "other");

	/**
	 * The '<em><b>Chapter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER
	 * @model name="chapter"
	 * @generated
	 * @ordered
	 */
	public static final int CHAPTER_VALUE = 0;

	/**
	 * The '<em><b>Section</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTION
	 * @model name="section"
	 * @generated
	 * @ordered
	 */
	public static final int SECTION_VALUE = 1;

	/**
	 * The '<em><b>Part</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PART
	 * @model name="part"
	 * @generated
	 * @ordered
	 */
	public static final int PART_VALUE = 2;

	/**
	 * The '<em><b>Track</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACK
	 * @model name="track"
	 * @generated
	 * @ordered
	 */
	public static final int TRACK_VALUE = 3;

	/**
	 * The '<em><b>Reference Entry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_ENTRY
	 * @model name="referenceEntry" literal="reference_entry"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_ENTRY_VALUE = 4;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Component Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentTypeType[] VALUES_ARRAY =
		new ComponentTypeType[] {
			CHAPTER,
			SECTION,
			PART,
			TRACK,
			REFERENCE_ENTRY,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Component Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentTypeType get(int value) {
		switch (value) {
			case CHAPTER_VALUE: return CHAPTER;
			case SECTION_VALUE: return SECTION;
			case PART_VALUE: return PART;
			case TRACK_VALUE: return TRACK;
			case REFERENCE_ENTRY_VALUE: return REFERENCE_ENTRY;
			case OTHER_VALUE: return OTHER;
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
	private ComponentTypeType(int value, String name, String literal) {
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
	
} //ComponentTypeType
