/**
 */
package gov.nih.nlm.ncbi.jats1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Notation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNotationType()
 * @model extendedMetaData="name='notation_._type'"
 * @generated
 */
public enum NotationType implements Enumerator {
	/**
	 * The '<em><b>La Te X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA_TE_X_VALUE
	 * @generated
	 * @ordered
	 */
	LA_TE_X(0, "LaTeX", "LaTeX"),

	/**
	 * The '<em><b>TEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEX_VALUE
	 * @generated
	 * @ordered
	 */
	TEX(1, "TEX", "TEX"),

	/**
	 * The '<em><b>Te X1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TE_X1_VALUE
	 * @generated
	 * @ordered
	 */
	TE_X1(2, "TeX1", "TeX"),

	/**
	 * The '<em><b>Tex2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEX2_VALUE
	 * @generated
	 * @ordered
	 */
	TEX2(3, "tex2", "tex");

	/**
	 * The '<em><b>La Te X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA_TE_X
	 * @model name="LaTeX"
	 * @generated
	 * @ordered
	 */
	public static final int LA_TE_X_VALUE = 0;

	/**
	 * The '<em><b>TEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEX_VALUE = 1;

	/**
	 * The '<em><b>Te X1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TE_X1
	 * @model name="TeX1" literal="TeX"
	 * @generated
	 * @ordered
	 */
	public static final int TE_X1_VALUE = 2;

	/**
	 * The '<em><b>Tex2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEX2
	 * @model name="tex2" literal="tex"
	 * @generated
	 * @ordered
	 */
	public static final int TEX2_VALUE = 3;

	/**
	 * An array of all the '<em><b>Notation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NotationType[] VALUES_ARRAY =
		new NotationType[] {
			LA_TE_X,
			TEX,
			TE_X1,
			TEX2,
		};

	/**
	 * A public read-only list of all the '<em><b>Notation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NotationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Notation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotationType get(int value) {
		switch (value) {
			case LA_TE_X_VALUE: return LA_TE_X;
			case TEX_VALUE: return TEX;
			case TE_X1_VALUE: return TE_X1;
			case TEX2_VALUE: return TEX2;
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
	private NotationType(int value, String name, String literal) {
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
	
} //NotationType
