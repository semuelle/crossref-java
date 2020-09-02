/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getOrderType()
 * @model extendedMetaData="name='order_._type'"
 * @generated
 */
public enum OrderType implements Enumerator {
	/**
	 * The '<em><b>Numeric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC(0, "numeric", "numeric"),

	/**
	 * The '<em><b>Lexicographic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEXICOGRAPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	LEXICOGRAPHIC(1, "lexicographic", "lexicographic");

	/**
	 * The '<em><b>Numeric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC
	 * @model name="numeric"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_VALUE = 0;

	/**
	 * The '<em><b>Lexicographic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEXICOGRAPHIC
	 * @model name="lexicographic"
	 * @generated
	 * @ordered
	 */
	public static final int LEXICOGRAPHIC_VALUE = 1;

	/**
	 * An array of all the '<em><b>Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderType[] VALUES_ARRAY =
		new OrderType[] {
			NUMERIC,
			LEXICOGRAPHIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType get(int value) {
		switch (value) {
			case NUMERIC_VALUE: return NUMERIC;
			case LEXICOGRAPHIC_VALUE: return LEXICOGRAPHIC;
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
	private OrderType(int value, String name, String literal) {
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
	
} //OrderType
