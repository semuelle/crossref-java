/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Occurrence Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getOccurrenceType()
 * @model extendedMetaData="name='occurrence_._type'"
 * @generated
 */
public enum OccurrenceType implements Enumerator {
	/**
	 * The '<em><b>Prefix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREFIX_VALUE
	 * @generated
	 * @ordered
	 */
	PREFIX(0, "prefix", "prefix"),

	/**
	 * The '<em><b>Infix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFIX_VALUE
	 * @generated
	 * @ordered
	 */
	INFIX(1, "infix", "infix"),

	/**
	 * The '<em><b>Function Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_MODEL(2, "functionModel", "function-model");

	/**
	 * The '<em><b>Prefix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREFIX
	 * @model name="prefix"
	 * @generated
	 * @ordered
	 */
	public static final int PREFIX_VALUE = 0;

	/**
	 * The '<em><b>Infix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFIX
	 * @model name="infix"
	 * @generated
	 * @ordered
	 */
	public static final int INFIX_VALUE = 1;

	/**
	 * The '<em><b>Function Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_MODEL
	 * @model name="functionModel" literal="function-model"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_MODEL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Occurrence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OccurrenceType[] VALUES_ARRAY =
		new OccurrenceType[] {
			PREFIX,
			INFIX,
			FUNCTION_MODEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Occurrence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OccurrenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Occurrence Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OccurrenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OccurrenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Occurrence Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OccurrenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OccurrenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Occurrence Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OccurrenceType get(int value) {
		switch (value) {
			case PREFIX_VALUE: return PREFIX;
			case INFIX_VALUE: return INFIX;
			case FUNCTION_MODEL_VALUE: return FUNCTION_MODEL;
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
	private OccurrenceType(int value, String name, String literal) {
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
	
} //OccurrenceType
