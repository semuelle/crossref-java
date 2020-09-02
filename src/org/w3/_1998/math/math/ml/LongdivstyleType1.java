/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Longdivstyle Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getLongdivstyleType1()
 * @model extendedMetaData="name='longdivstyle_._type'"
 * @generated
 */
public enum LongdivstyleType1 implements Enumerator {
	/**
	 * The '<em><b>Lefttop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFTTOP_VALUE
	 * @generated
	 * @ordered
	 */
	LEFTTOP(0, "lefttop", "lefttop"),

	/**
	 * The '<em><b>Stackedrightright</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACKEDRIGHTRIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	STACKEDRIGHTRIGHT(1, "stackedrightright", "stackedrightright"),

	/**
	 * The '<em><b>Mediumstackedrightright</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUMSTACKEDRIGHTRIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUMSTACKEDRIGHTRIGHT(2, "mediumstackedrightright", "mediumstackedrightright"),

	/**
	 * The '<em><b>Shortstackedrightright</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORTSTACKEDRIGHTRIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORTSTACKEDRIGHTRIGHT(3, "shortstackedrightright", "shortstackedrightright"),

	/**
	 * The '<em><b>Righttop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHTTOP_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHTTOP(4, "righttop", "righttop"),

	/**
	 * The '<em><b>Left Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_RIGHT(5, "leftRight", "left/\\right"),

	/**
	 * The '<em><b>Left Right1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_RIGHT1_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_RIGHT1(6, "leftRight1", "left)(right"),

	/**
	 * The '<em><b>Right Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_RIGHT(7, "rightRight", ":right=right"),

	/**
	 * The '<em><b>Stackedleftleft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACKEDLEFTLEFT_VALUE
	 * @generated
	 * @ordered
	 */
	STACKEDLEFTLEFT(8, "stackedleftleft", "stackedleftleft"),

	/**
	 * The '<em><b>Stackedleftlinetop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACKEDLEFTLINETOP_VALUE
	 * @generated
	 * @ordered
	 */
	STACKEDLEFTLINETOP(9, "stackedleftlinetop", "stackedleftlinetop");

	/**
	 * The '<em><b>Lefttop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFTTOP
	 * @model name="lefttop"
	 * @generated
	 * @ordered
	 */
	public static final int LEFTTOP_VALUE = 0;

	/**
	 * The '<em><b>Stackedrightright</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACKEDRIGHTRIGHT
	 * @model name="stackedrightright"
	 * @generated
	 * @ordered
	 */
	public static final int STACKEDRIGHTRIGHT_VALUE = 1;

	/**
	 * The '<em><b>Mediumstackedrightright</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUMSTACKEDRIGHTRIGHT
	 * @model name="mediumstackedrightright"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUMSTACKEDRIGHTRIGHT_VALUE = 2;

	/**
	 * The '<em><b>Shortstackedrightright</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORTSTACKEDRIGHTRIGHT
	 * @model name="shortstackedrightright"
	 * @generated
	 * @ordered
	 */
	public static final int SHORTSTACKEDRIGHTRIGHT_VALUE = 3;

	/**
	 * The '<em><b>Righttop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHTTOP
	 * @model name="righttop"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHTTOP_VALUE = 4;

	/**
	 * The '<em><b>Left Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_RIGHT
	 * @model name="leftRight" literal="left/\\right"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_RIGHT_VALUE = 5;

	/**
	 * The '<em><b>Left Right1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_RIGHT1
	 * @model name="leftRight1" literal="left)(right"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_RIGHT1_VALUE = 6;

	/**
	 * The '<em><b>Right Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_RIGHT
	 * @model name="rightRight" literal=":right=right"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_RIGHT_VALUE = 7;

	/**
	 * The '<em><b>Stackedleftleft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACKEDLEFTLEFT
	 * @model name="stackedleftleft"
	 * @generated
	 * @ordered
	 */
	public static final int STACKEDLEFTLEFT_VALUE = 8;

	/**
	 * The '<em><b>Stackedleftlinetop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACKEDLEFTLINETOP
	 * @model name="stackedleftlinetop"
	 * @generated
	 * @ordered
	 */
	public static final int STACKEDLEFTLINETOP_VALUE = 9;

	/**
	 * An array of all the '<em><b>Longdivstyle Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LongdivstyleType1[] VALUES_ARRAY =
		new LongdivstyleType1[] {
			LEFTTOP,
			STACKEDRIGHTRIGHT,
			MEDIUMSTACKEDRIGHTRIGHT,
			SHORTSTACKEDRIGHTRIGHT,
			RIGHTTOP,
			LEFT_RIGHT,
			LEFT_RIGHT1,
			RIGHT_RIGHT,
			STACKEDLEFTLEFT,
			STACKEDLEFTLINETOP,
		};

	/**
	 * A public read-only list of all the '<em><b>Longdivstyle Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LongdivstyleType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Longdivstyle Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LongdivstyleType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LongdivstyleType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Longdivstyle Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LongdivstyleType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LongdivstyleType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Longdivstyle Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LongdivstyleType1 get(int value) {
		switch (value) {
			case LEFTTOP_VALUE: return LEFTTOP;
			case STACKEDRIGHTRIGHT_VALUE: return STACKEDRIGHTRIGHT;
			case MEDIUMSTACKEDRIGHTRIGHT_VALUE: return MEDIUMSTACKEDRIGHTRIGHT;
			case SHORTSTACKEDRIGHTRIGHT_VALUE: return SHORTSTACKEDRIGHTRIGHT;
			case RIGHTTOP_VALUE: return RIGHTTOP;
			case LEFT_RIGHT_VALUE: return LEFT_RIGHT;
			case LEFT_RIGHT1_VALUE: return LEFT_RIGHT1;
			case RIGHT_RIGHT_VALUE: return RIGHT_RIGHT;
			case STACKEDLEFTLEFT_VALUE: return STACKEDLEFTLEFT;
			case STACKEDLEFTLINETOP_VALUE: return STACKEDLEFTLINETOP;
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
	private LongdivstyleType1(int value, String name, String literal) {
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
	
} //LongdivstyleType1
