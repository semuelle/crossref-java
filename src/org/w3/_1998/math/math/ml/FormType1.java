/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Form Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getFormType1()
 * @model extendedMetaData="name='form_._type'"
 * @generated
 */
public enum FormType1 implements Enumerator {
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
	 * The '<em><b>Postfix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTFIX_VALUE
	 * @generated
	 * @ordered
	 */
	POSTFIX(2, "postfix", "postfix");

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
	 * The '<em><b>Postfix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTFIX
	 * @model name="postfix"
	 * @generated
	 * @ordered
	 */
	public static final int POSTFIX_VALUE = 2;

	/**
	 * An array of all the '<em><b>Form Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormType1[] VALUES_ARRAY =
		new FormType1[] {
			PREFIX,
			INFIX,
			POSTFIX,
		};

	/**
	 * A public read-only list of all the '<em><b>Form Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FormType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Form Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Form Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Form Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormType1 get(int value) {
		switch (value) {
			case PREFIX_VALUE: return PREFIX;
			case INFIX_VALUE: return INFIX;
			case POSTFIX_VALUE: return POSTFIX;
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
	private FormType1(int value, String name, String literal) {
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
	
} //FormType1
