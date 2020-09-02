/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Crossout Type Item</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getCrossoutTypeItem()
 * @model extendedMetaData="name='crossout_._2_._type_._item'"
 * @generated
 */
public enum CrossoutTypeItem implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Updiagonalstrike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDIAGONALSTRIKE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDIAGONALSTRIKE(1, "updiagonalstrike", "updiagonalstrike"),

	/**
	 * The '<em><b>Downdiagonalstrike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNDIAGONALSTRIKE_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNDIAGONALSTRIKE(2, "downdiagonalstrike", "downdiagonalstrike"),

	/**
	 * The '<em><b>Verticalstrike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICALSTRIKE_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICALSTRIKE(3, "verticalstrike", "verticalstrike"),

	/**
	 * The '<em><b>Horizontalstrike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTALSTRIKE_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTALSTRIKE(4, "horizontalstrike", "horizontalstrike");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Updiagonalstrike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDIAGONALSTRIKE
	 * @model name="updiagonalstrike"
	 * @generated
	 * @ordered
	 */
	public static final int UPDIAGONALSTRIKE_VALUE = 1;

	/**
	 * The '<em><b>Downdiagonalstrike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNDIAGONALSTRIKE
	 * @model name="downdiagonalstrike"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNDIAGONALSTRIKE_VALUE = 2;

	/**
	 * The '<em><b>Verticalstrike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICALSTRIKE
	 * @model name="verticalstrike"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICALSTRIKE_VALUE = 3;

	/**
	 * The '<em><b>Horizontalstrike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTALSTRIKE
	 * @model name="horizontalstrike"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTALSTRIKE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Crossout Type Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CrossoutTypeItem[] VALUES_ARRAY =
		new CrossoutTypeItem[] {
			NONE,
			UPDIAGONALSTRIKE,
			DOWNDIAGONALSTRIKE,
			VERTICALSTRIKE,
			HORIZONTALSTRIKE,
		};

	/**
	 * A public read-only list of all the '<em><b>Crossout Type Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CrossoutTypeItem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Crossout Type Item</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CrossoutTypeItem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CrossoutTypeItem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crossout Type Item</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CrossoutTypeItem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CrossoutTypeItem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crossout Type Item</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CrossoutTypeItem get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case UPDIAGONALSTRIKE_VALUE: return UPDIAGONALSTRIKE;
			case DOWNDIAGONALSTRIKE_VALUE: return DOWNDIAGONALSTRIKE;
			case VERTICALSTRIKE_VALUE: return VERTICALSTRIKE;
			case HORIZONTALSTRIKE_VALUE: return HORIZONTALSTRIKE;
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
	private CrossoutTypeItem(int value, String name, String literal) {
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
	
} //CrossoutTypeItem
