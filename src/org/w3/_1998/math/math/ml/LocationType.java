/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Location Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getLocationType()
 * @model extendedMetaData="name='location_._1_._type'"
 * @generated
 */
public enum LocationType implements Enumerator {
	/**
	 * The '<em><b>W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W_VALUE
	 * @generated
	 * @ordered
	 */
	W(0, "w", "w"),

	/**
	 * The '<em><b>Nw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NW_VALUE
	 * @generated
	 * @ordered
	 */
	NW(1, "nw", "nw"),

	/**
	 * The '<em><b>N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N_VALUE
	 * @generated
	 * @ordered
	 */
	N(2, "n", "n"),

	/**
	 * The '<em><b>Ne</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NE_VALUE
	 * @generated
	 * @ordered
	 */
	NE(3, "ne", "ne"),

	/**
	 * The '<em><b>E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E_VALUE
	 * @generated
	 * @ordered
	 */
	E(4, "e", "e"),

	/**
	 * The '<em><b>Se</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SE_VALUE
	 * @generated
	 * @ordered
	 */
	SE(5, "se", "se"),

	/**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(6, "s", "s"),

	/**
	 * The '<em><b>Sw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SW_VALUE
	 * @generated
	 * @ordered
	 */
	SW(7, "sw", "sw");

	/**
	 * The '<em><b>W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W
	 * @model name="w"
	 * @generated
	 * @ordered
	 */
	public static final int W_VALUE = 0;

	/**
	 * The '<em><b>Nw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NW
	 * @model name="nw"
	 * @generated
	 * @ordered
	 */
	public static final int NW_VALUE = 1;

	/**
	 * The '<em><b>N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N
	 * @model name="n"
	 * @generated
	 * @ordered
	 */
	public static final int N_VALUE = 2;

	/**
	 * The '<em><b>Ne</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NE
	 * @model name="ne"
	 * @generated
	 * @ordered
	 */
	public static final int NE_VALUE = 3;

	/**
	 * The '<em><b>E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E
	 * @model name="e"
	 * @generated
	 * @ordered
	 */
	public static final int E_VALUE = 4;

	/**
	 * The '<em><b>Se</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SE
	 * @model name="se"
	 * @generated
	 * @ordered
	 */
	public static final int SE_VALUE = 5;

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S
	 * @model name="s"
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 6;

	/**
	 * The '<em><b>Sw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SW
	 * @model name="sw"
	 * @generated
	 * @ordered
	 */
	public static final int SW_VALUE = 7;

	/**
	 * An array of all the '<em><b>Location Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LocationType[] VALUES_ARRAY =
		new LocationType[] {
			W,
			NW,
			N,
			NE,
			E,
			SE,
			S,
			SW,
		};

	/**
	 * A public read-only list of all the '<em><b>Location Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LocationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Location Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LocationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LocationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LocationType get(int value) {
		switch (value) {
			case W_VALUE: return W;
			case NW_VALUE: return NW;
			case N_VALUE: return N;
			case NE_VALUE: return NE;
			case E_VALUE: return E;
			case SE_VALUE: return SE;
			case S_VALUE: return S;
			case SW_VALUE: return SW;
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
	private LocationType(int value, String name, String literal) {
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
	
} //LocationType
