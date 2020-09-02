/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parent Relation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getParentRelationType()
 * @model extendedMetaData="name='parent_relation_._type'"
 * @generated
 */
public enum ParentRelationType implements Enumerator {
	/**
	 * The '<em><b>Is Part Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PART_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_PART_OF(0, "isPartOf", "isPartOf"),

	/**
	 * The '<em><b>Is Referenced By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REFERENCED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_REFERENCED_BY(1, "isReferencedBy", "isReferencedBy"),

	/**
	 * The '<em><b>Is Required By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REQUIRED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_REQUIRED_BY(2, "isRequiredBy", "isRequiredBy"),

	/**
	 * The '<em><b>Is Translation Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_TRANSLATION_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_TRANSLATION_OF(3, "isTranslationOf", "isTranslationOf");

	/**
	 * The '<em><b>Is Part Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PART_OF
	 * @model name="isPartOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_PART_OF_VALUE = 0;

	/**
	 * The '<em><b>Is Referenced By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REFERENCED_BY
	 * @model name="isReferencedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_REFERENCED_BY_VALUE = 1;

	/**
	 * The '<em><b>Is Required By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REQUIRED_BY
	 * @model name="isRequiredBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_REQUIRED_BY_VALUE = 2;

	/**
	 * The '<em><b>Is Translation Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_TRANSLATION_OF
	 * @model name="isTranslationOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_TRANSLATION_OF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Parent Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParentRelationType[] VALUES_ARRAY =
		new ParentRelationType[] {
			IS_PART_OF,
			IS_REFERENCED_BY,
			IS_REQUIRED_BY,
			IS_TRANSLATION_OF,
		};

	/**
	 * A public read-only list of all the '<em><b>Parent Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParentRelationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parent Relation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParentRelationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParentRelationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parent Relation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParentRelationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParentRelationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parent Relation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParentRelationType get(int value) {
		switch (value) {
			case IS_PART_OF_VALUE: return IS_PART_OF;
			case IS_REFERENCED_BY_VALUE: return IS_REFERENCED_BY;
			case IS_REQUIRED_BY_VALUE: return IS_REQUIRED_BY;
			case IS_TRANSLATION_OF_VALUE: return IS_TRANSLATION_OF;
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
	private ParentRelationType(int value, String name, String literal) {
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
	
} //ParentRelationType
