/**
 */
package gov.nih.nlm.ncbi.jats1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Frame Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getFrameType()
 * @model extendedMetaData="name='frame_._type'"
 * @generated
 */
public enum FrameType implements Enumerator {
	/**
	 * The '<em><b>Above</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABOVE_VALUE
	 * @generated
	 * @ordered
	 */
	ABOVE(0, "above", "above"),

	/**
	 * The '<em><b>Below</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELOW_VALUE
	 * @generated
	 * @ordered
	 */
	BELOW(1, "below", "below"),

	/**
	 * The '<em><b>Border</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER_VALUE
	 * @generated
	 * @ordered
	 */
	BORDER(2, "border", "border"),

	/**
	 * The '<em><b>Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOX_VALUE
	 * @generated
	 * @ordered
	 */
	BOX(3, "box", "box"),

	/**
	 * The '<em><b>Hsides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HSIDES_VALUE
	 * @generated
	 * @ordered
	 */
	HSIDES(4, "hsides", "hsides"),

	/**
	 * The '<em><b>Lhs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHS_VALUE
	 * @generated
	 * @ordered
	 */
	LHS(5, "lhs", "lhs"),

	/**
	 * The '<em><b>Rhs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHS_VALUE
	 * @generated
	 * @ordered
	 */
	RHS(6, "rhs", "rhs"),

	/**
	 * The '<em><b>Void</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOID_VALUE
	 * @generated
	 * @ordered
	 */
	VOID(7, "void", "void"),

	/**
	 * The '<em><b>Vsides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VSIDES_VALUE
	 * @generated
	 * @ordered
	 */
	VSIDES(8, "vsides", "vsides");

	/**
	 * The '<em><b>Above</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABOVE
	 * @model name="above"
	 * @generated
	 * @ordered
	 */
	public static final int ABOVE_VALUE = 0;

	/**
	 * The '<em><b>Below</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELOW
	 * @model name="below"
	 * @generated
	 * @ordered
	 */
	public static final int BELOW_VALUE = 1;

	/**
	 * The '<em><b>Border</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER
	 * @model name="border"
	 * @generated
	 * @ordered
	 */
	public static final int BORDER_VALUE = 2;

	/**
	 * The '<em><b>Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOX
	 * @model name="box"
	 * @generated
	 * @ordered
	 */
	public static final int BOX_VALUE = 3;

	/**
	 * The '<em><b>Hsides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HSIDES
	 * @model name="hsides"
	 * @generated
	 * @ordered
	 */
	public static final int HSIDES_VALUE = 4;

	/**
	 * The '<em><b>Lhs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHS
	 * @model name="lhs"
	 * @generated
	 * @ordered
	 */
	public static final int LHS_VALUE = 5;

	/**
	 * The '<em><b>Rhs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHS
	 * @model name="rhs"
	 * @generated
	 * @ordered
	 */
	public static final int RHS_VALUE = 6;

	/**
	 * The '<em><b>Void</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOID
	 * @model name="void"
	 * @generated
	 * @ordered
	 */
	public static final int VOID_VALUE = 7;

	/**
	 * The '<em><b>Vsides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VSIDES
	 * @model name="vsides"
	 * @generated
	 * @ordered
	 */
	public static final int VSIDES_VALUE = 8;

	/**
	 * An array of all the '<em><b>Frame Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FrameType[] VALUES_ARRAY =
		new FrameType[] {
			ABOVE,
			BELOW,
			BORDER,
			BOX,
			HSIDES,
			LHS,
			RHS,
			VOID,
			VSIDES,
		};

	/**
	 * A public read-only list of all the '<em><b>Frame Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FrameType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Frame Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FrameType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FrameType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Frame Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FrameType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FrameType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Frame Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FrameType get(int value) {
		switch (value) {
			case ABOVE_VALUE: return ABOVE;
			case BELOW_VALUE: return BELOW;
			case BORDER_VALUE: return BORDER;
			case BOX_VALUE: return BOX;
			case HSIDES_VALUE: return HSIDES;
			case LHS_VALUE: return LHS;
			case RHS_VALUE: return RHS;
			case VOID_VALUE: return VOID;
			case VSIDES_VALUE: return VSIDES;
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
	private FrameType(int value, String name, String literal) {
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
	
} //FrameType
