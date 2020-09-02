/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Infixlinebreakstyle Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getInfixlinebreakstyleType()
 * @model extendedMetaData="name='infixlinebreakstyle_._type'"
 * @generated
 */
public enum InfixlinebreakstyleType implements Enumerator {
	/**
	 * The '<em><b>Before</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE(0, "before", "before"),

	/**
	 * The '<em><b>After</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER(1, "after", "after"),

	/**
	 * The '<em><b>Duplicate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATE_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATE(2, "duplicate", "duplicate");

	/**
	 * The '<em><b>Before</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE
	 * @model name="before"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_VALUE = 0;

	/**
	 * The '<em><b>After</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER
	 * @model name="after"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_VALUE = 1;

	/**
	 * The '<em><b>Duplicate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATE
	 * @model name="duplicate"
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Infixlinebreakstyle Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InfixlinebreakstyleType[] VALUES_ARRAY =
		new InfixlinebreakstyleType[] {
			BEFORE,
			AFTER,
			DUPLICATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Infixlinebreakstyle Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InfixlinebreakstyleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Infixlinebreakstyle Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfixlinebreakstyleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfixlinebreakstyleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Infixlinebreakstyle Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfixlinebreakstyleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfixlinebreakstyleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Infixlinebreakstyle Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfixlinebreakstyleType get(int value) {
		switch (value) {
			case BEFORE_VALUE: return BEFORE;
			case AFTER_VALUE: return AFTER;
			case DUPLICATE_VALUE: return DUPLICATE;
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
	private InfixlinebreakstyleType(int value, String name, String literal) {
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
	
} //InfixlinebreakstyleType
