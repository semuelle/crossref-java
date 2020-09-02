/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Columnwidth Type Base Item Member21</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getColumnwidthTypeBaseItemMember21()
 * @model extendedMetaData="name='columnwidth_._type_._base_._item_._member_._2'"
 * @generated
 */
public enum ColumnwidthTypeBaseItemMember21 implements Enumerator {
	/**
	 * The '<em><b>Fit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIT_VALUE
	 * @generated
	 * @ordered
	 */
	FIT(0, "fit", "fit");

	/**
	 * The '<em><b>Fit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIT
	 * @model name="fit"
	 * @generated
	 * @ordered
	 */
	public static final int FIT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Columnwidth Type Base Item Member21</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ColumnwidthTypeBaseItemMember21[] VALUES_ARRAY =
		new ColumnwidthTypeBaseItemMember21[] {
			FIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Columnwidth Type Base Item Member21</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ColumnwidthTypeBaseItemMember21> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Columnwidth Type Base Item Member21</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColumnwidthTypeBaseItemMember21 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColumnwidthTypeBaseItemMember21 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Columnwidth Type Base Item Member21</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColumnwidthTypeBaseItemMember21 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColumnwidthTypeBaseItemMember21 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Columnwidth Type Base Item Member21</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColumnwidthTypeBaseItemMember21 get(int value) {
		switch (value) {
			case FIT_VALUE: return FIT;
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
	private ColumnwidthTypeBaseItemMember21(int value, String name, String literal) {
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
	
} //ColumnwidthTypeBaseItemMember21
