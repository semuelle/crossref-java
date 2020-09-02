/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Linebreak Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getLinebreakType()
 * @model extendedMetaData="name='linebreak_._1_._type'"
 * @generated
 */
public enum LinebreakType implements Enumerator {
	/**
	 * The '<em><b>Auto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO(0, "auto", "auto"),

	/**
	 * The '<em><b>Newline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWLINE_VALUE
	 * @generated
	 * @ordered
	 */
	NEWLINE(1, "newline", "newline"),

	/**
	 * The '<em><b>Nobreak</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOBREAK_VALUE
	 * @generated
	 * @ordered
	 */
	NOBREAK(2, "nobreak", "nobreak"),

	/**
	 * The '<em><b>Goodbreak</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOODBREAK_VALUE
	 * @generated
	 * @ordered
	 */
	GOODBREAK(3, "goodbreak", "goodbreak"),

	/**
	 * The '<em><b>Badbreak</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BADBREAK_VALUE
	 * @generated
	 * @ordered
	 */
	BADBREAK(4, "badbreak", "badbreak"),

	/**
	 * The '<em><b>Indentingnewline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDENTINGNEWLINE_VALUE
	 * @generated
	 * @ordered
	 */
	INDENTINGNEWLINE(5, "indentingnewline", "indentingnewline");

	/**
	 * The '<em><b>Auto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO
	 * @model name="auto"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_VALUE = 0;

	/**
	 * The '<em><b>Newline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWLINE
	 * @model name="newline"
	 * @generated
	 * @ordered
	 */
	public static final int NEWLINE_VALUE = 1;

	/**
	 * The '<em><b>Nobreak</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOBREAK
	 * @model name="nobreak"
	 * @generated
	 * @ordered
	 */
	public static final int NOBREAK_VALUE = 2;

	/**
	 * The '<em><b>Goodbreak</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOODBREAK
	 * @model name="goodbreak"
	 * @generated
	 * @ordered
	 */
	public static final int GOODBREAK_VALUE = 3;

	/**
	 * The '<em><b>Badbreak</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BADBREAK
	 * @model name="badbreak"
	 * @generated
	 * @ordered
	 */
	public static final int BADBREAK_VALUE = 4;

	/**
	 * The '<em><b>Indentingnewline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDENTINGNEWLINE
	 * @model name="indentingnewline"
	 * @generated
	 * @ordered
	 */
	public static final int INDENTINGNEWLINE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Linebreak Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LinebreakType[] VALUES_ARRAY =
		new LinebreakType[] {
			AUTO,
			NEWLINE,
			NOBREAK,
			GOODBREAK,
			BADBREAK,
			INDENTINGNEWLINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Linebreak Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LinebreakType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Linebreak Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinebreakType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinebreakType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Linebreak Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinebreakType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinebreakType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Linebreak Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinebreakType get(int value) {
		switch (value) {
			case AUTO_VALUE: return AUTO;
			case NEWLINE_VALUE: return NEWLINE;
			case NOBREAK_VALUE: return NOBREAK;
			case GOODBREAK_VALUE: return GOODBREAK;
			case BADBREAK_VALUE: return BADBREAK;
			case INDENTINGNEWLINE_VALUE: return INDENTINGNEWLINE;
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
	private LinebreakType(int value, String name, String literal) {
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
	
} //LinebreakType
