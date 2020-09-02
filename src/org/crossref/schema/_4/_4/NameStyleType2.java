/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Name Style Type2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getNameStyleType2()
 * @model extendedMetaData="name='name-style_._2_._type'"
 * @generated
 */
public enum NameStyleType2 implements Enumerator {
	/**
	 * The '<em><b>Western</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WESTERN_VALUE
	 * @generated
	 * @ordered
	 */
	WESTERN(0, "western", "western"),

	/**
	 * The '<em><b>Eastern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EASTERN_VALUE
	 * @generated
	 * @ordered
	 */
	EASTERN(1, "eastern", "eastern"),

	/**
	 * The '<em><b>Islensk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISLENSK_VALUE
	 * @generated
	 * @ordered
	 */
	ISLENSK(2, "islensk", "islensk"),

	/**
	 * The '<em><b>Given Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIVEN_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GIVEN_ONLY(3, "givenOnly", "given-only");

	/**
	 * The '<em><b>Western</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WESTERN
	 * @model name="western"
	 * @generated
	 * @ordered
	 */
	public static final int WESTERN_VALUE = 0;

	/**
	 * The '<em><b>Eastern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EASTERN
	 * @model name="eastern"
	 * @generated
	 * @ordered
	 */
	public static final int EASTERN_VALUE = 1;

	/**
	 * The '<em><b>Islensk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISLENSK
	 * @model name="islensk"
	 * @generated
	 * @ordered
	 */
	public static final int ISLENSK_VALUE = 2;

	/**
	 * The '<em><b>Given Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIVEN_ONLY
	 * @model name="givenOnly" literal="given-only"
	 * @generated
	 * @ordered
	 */
	public static final int GIVEN_ONLY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Name Style Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NameStyleType2[] VALUES_ARRAY =
		new NameStyleType2[] {
			WESTERN,
			EASTERN,
			ISLENSK,
			GIVEN_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Name Style Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NameStyleType2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Name Style Type2</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameStyleType2 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameStyleType2 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Style Type2</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameStyleType2 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameStyleType2 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Style Type2</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameStyleType2 get(int value) {
		switch (value) {
			case WESTERN_VALUE: return WESTERN;
			case EASTERN_VALUE: return EASTERN;
			case ISLENSK_VALUE: return ISLENSK;
			case GIVEN_ONLY_VALUE: return GIVEN_ONLY;
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
	private NameStyleType2(int value, String name, String literal) {
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
	
} //NameStyleType2
