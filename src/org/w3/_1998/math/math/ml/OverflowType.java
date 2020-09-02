/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Overflow Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getOverflowType()
 * @model extendedMetaData="name='overflow_._type'"
 * @generated
 */
public enum OverflowType implements Enumerator {
	/**
	 * The '<em><b>Linebreak</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEBREAK_VALUE
	 * @generated
	 * @ordered
	 */
	LINEBREAK(0, "linebreak", "linebreak"),

	/**
	 * The '<em><b>Scroll</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROLL_VALUE
	 * @generated
	 * @ordered
	 */
	SCROLL(1, "scroll", "scroll"),

	/**
	 * The '<em><b>Elide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIDE_VALUE
	 * @generated
	 * @ordered
	 */
	ELIDE(2, "elide", "elide"),

	/**
	 * The '<em><b>Truncate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUNCATE_VALUE
	 * @generated
	 * @ordered
	 */
	TRUNCATE(3, "truncate", "truncate"),

	/**
	 * The '<em><b>Scale</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	SCALE(4, "scale", "scale");

	/**
	 * The '<em><b>Linebreak</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEBREAK
	 * @model name="linebreak"
	 * @generated
	 * @ordered
	 */
	public static final int LINEBREAK_VALUE = 0;

	/**
	 * The '<em><b>Scroll</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROLL
	 * @model name="scroll"
	 * @generated
	 * @ordered
	 */
	public static final int SCROLL_VALUE = 1;

	/**
	 * The '<em><b>Elide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIDE
	 * @model name="elide"
	 * @generated
	 * @ordered
	 */
	public static final int ELIDE_VALUE = 2;

	/**
	 * The '<em><b>Truncate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUNCATE
	 * @model name="truncate"
	 * @generated
	 * @ordered
	 */
	public static final int TRUNCATE_VALUE = 3;

	/**
	 * The '<em><b>Scale</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALE
	 * @model name="scale"
	 * @generated
	 * @ordered
	 */
	public static final int SCALE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Overflow Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OverflowType[] VALUES_ARRAY =
		new OverflowType[] {
			LINEBREAK,
			SCROLL,
			ELIDE,
			TRUNCATE,
			SCALE,
		};

	/**
	 * A public read-only list of all the '<em><b>Overflow Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OverflowType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Overflow Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OverflowType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OverflowType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Overflow Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OverflowType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OverflowType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Overflow Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OverflowType get(int value) {
		switch (value) {
			case LINEBREAK_VALUE: return LINEBREAK;
			case SCROLL_VALUE: return SCROLL;
			case ELIDE_VALUE: return ELIDE;
			case TRUNCATE_VALUE: return TRUNCATE;
			case SCALE_VALUE: return SCALE;
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
	private OverflowType(int value, String name, String literal) {
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
	
} //OverflowType
