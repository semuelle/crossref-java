/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Indentshiftlast Type Member11</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getIndentshiftlastTypeMember11()
 * @model extendedMetaData="name='indentshiftlast_._1_._type_._member_._1'"
 * @generated
 */
public enum IndentshiftlastTypeMember11 implements Enumerator {
	/**
	 * The '<em><b>Indentshift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDENTSHIFT_VALUE
	 * @generated
	 * @ordered
	 */
	INDENTSHIFT(0, "indentshift", "indentshift");

	/**
	 * The '<em><b>Indentshift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDENTSHIFT
	 * @model name="indentshift"
	 * @generated
	 * @ordered
	 */
	public static final int INDENTSHIFT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Indentshiftlast Type Member11</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IndentshiftlastTypeMember11[] VALUES_ARRAY =
		new IndentshiftlastTypeMember11[] {
			INDENTSHIFT,
		};

	/**
	 * A public read-only list of all the '<em><b>Indentshiftlast Type Member11</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IndentshiftlastTypeMember11> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Indentshiftlast Type Member11</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IndentshiftlastTypeMember11 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IndentshiftlastTypeMember11 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Indentshiftlast Type Member11</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IndentshiftlastTypeMember11 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IndentshiftlastTypeMember11 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Indentshiftlast Type Member11</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IndentshiftlastTypeMember11 get(int value) {
		switch (value) {
			case INDENTSHIFT_VALUE: return INDENTSHIFT;
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
	private IndentshiftlastTypeMember11(int value, String name, String literal) {
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
	
} //IndentshiftlastTypeMember11
