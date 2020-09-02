/**
 */
package gov.nih.nlm.ncbi.jats1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Position Type10</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPositionType10()
 * @model extendedMetaData="name='position_._10_._type'"
 * @generated
 */
public enum PositionType10 implements Enumerator {
	/**
	 * The '<em><b>Anchor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCHOR_VALUE
	 * @generated
	 * @ordered
	 */
	ANCHOR(0, "anchor", "anchor"),

	/**
	 * The '<em><b>Background</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND(1, "background", "background"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(2, "float", "float"),

	/**
	 * The '<em><b>Margin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARGIN_VALUE
	 * @generated
	 * @ordered
	 */
	MARGIN(3, "margin", "margin");

	/**
	 * The '<em><b>Anchor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCHOR
	 * @model name="anchor"
	 * @generated
	 * @ordered
	 */
	public static final int ANCHOR_VALUE = 0;

	/**
	 * The '<em><b>Background</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND
	 * @model name="background"
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_VALUE = 1;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 2;

	/**
	 * The '<em><b>Margin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARGIN
	 * @model name="margin"
	 * @generated
	 * @ordered
	 */
	public static final int MARGIN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Position Type10</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PositionType10[] VALUES_ARRAY =
		new PositionType10[] {
			ANCHOR,
			BACKGROUND,
			FLOAT,
			MARGIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Position Type10</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PositionType10> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Position Type10</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionType10 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PositionType10 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position Type10</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionType10 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PositionType10 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position Type10</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionType10 get(int value) {
		switch (value) {
			case ANCHOR_VALUE: return ANCHOR;
			case BACKGROUND_VALUE: return BACKGROUND;
			case FLOAT_VALUE: return FLOAT;
			case MARGIN_VALUE: return MARGIN;
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
	private PositionType10(int value, String name, String literal) {
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
	
} //PositionType10
