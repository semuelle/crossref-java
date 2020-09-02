/**
 */
package org.w3._1998.math.math.ml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mathvariant Type2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage#getMathvariantType2()
 * @model extendedMetaData="name='mathvariant_._type'"
 * @generated
 */
public enum MathvariantType2 implements Enumerator {
	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(0, "normal", "normal"),

	/**
	 * The '<em><b>Bold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD(1, "bold", "bold"),

	/**
	 * The '<em><b>Italic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITALIC_VALUE
	 * @generated
	 * @ordered
	 */
	ITALIC(2, "italic", "italic"),

	/**
	 * The '<em><b>Bold Italic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_ITALIC_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD_ITALIC(3, "boldItalic", "bold-italic"),

	/**
	 * The '<em><b>Double Struck</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_STRUCK_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_STRUCK(4, "doubleStruck", "double-struck"),

	/**
	 * The '<em><b>Bold Fraktur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_FRAKTUR_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD_FRAKTUR(5, "boldFraktur", "bold-fraktur"),

	/**
	 * The '<em><b>Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	SCRIPT(6, "script", "script"),

	/**
	 * The '<em><b>Bold Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD_SCRIPT(7, "boldScript", "bold-script"),

	/**
	 * The '<em><b>Fraktur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAKTUR_VALUE
	 * @generated
	 * @ordered
	 */
	FRAKTUR(8, "fraktur", "fraktur"),

	/**
	 * The '<em><b>Sans Serif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SANS_SERIF_VALUE
	 * @generated
	 * @ordered
	 */
	SANS_SERIF(9, "sansSerif", "sans-serif"),

	/**
	 * The '<em><b>Bold Sans Serif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_SANS_SERIF_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD_SANS_SERIF(10, "boldSansSerif", "bold-sans-serif"),

	/**
	 * The '<em><b>Sans Serif Italic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SANS_SERIF_ITALIC_VALUE
	 * @generated
	 * @ordered
	 */
	SANS_SERIF_ITALIC(11, "sansSerifItalic", "sans-serif-italic"),

	/**
	 * The '<em><b>Sans Serif Bold Italic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SANS_SERIF_BOLD_ITALIC_VALUE
	 * @generated
	 * @ordered
	 */
	SANS_SERIF_BOLD_ITALIC(12, "sansSerifBoldItalic", "sans-serif-bold-italic"),

	/**
	 * The '<em><b>Monospace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOSPACE_VALUE
	 * @generated
	 * @ordered
	 */
	MONOSPACE(13, "monospace", "monospace"),

	/**
	 * The '<em><b>Initial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL(14, "initial", "initial"),

	/**
	 * The '<em><b>Tailed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAILED_VALUE
	 * @generated
	 * @ordered
	 */
	TAILED(15, "tailed", "tailed"),

	/**
	 * The '<em><b>Looped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOPED_VALUE
	 * @generated
	 * @ordered
	 */
	LOOPED(16, "looped", "looped"),

	/**
	 * The '<em><b>Stretched</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRETCHED_VALUE
	 * @generated
	 * @ordered
	 */
	STRETCHED(17, "stretched", "stretched");

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model name="normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 0;

	/**
	 * The '<em><b>Bold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD
	 * @model name="bold"
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_VALUE = 1;

	/**
	 * The '<em><b>Italic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITALIC
	 * @model name="italic"
	 * @generated
	 * @ordered
	 */
	public static final int ITALIC_VALUE = 2;

	/**
	 * The '<em><b>Bold Italic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_ITALIC
	 * @model name="boldItalic" literal="bold-italic"
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_ITALIC_VALUE = 3;

	/**
	 * The '<em><b>Double Struck</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_STRUCK
	 * @model name="doubleStruck" literal="double-struck"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_STRUCK_VALUE = 4;

	/**
	 * The '<em><b>Bold Fraktur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_FRAKTUR
	 * @model name="boldFraktur" literal="bold-fraktur"
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_FRAKTUR_VALUE = 5;

	/**
	 * The '<em><b>Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCRIPT
	 * @model name="script"
	 * @generated
	 * @ordered
	 */
	public static final int SCRIPT_VALUE = 6;

	/**
	 * The '<em><b>Bold Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_SCRIPT
	 * @model name="boldScript" literal="bold-script"
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_SCRIPT_VALUE = 7;

	/**
	 * The '<em><b>Fraktur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAKTUR
	 * @model name="fraktur"
	 * @generated
	 * @ordered
	 */
	public static final int FRAKTUR_VALUE = 8;

	/**
	 * The '<em><b>Sans Serif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SANS_SERIF
	 * @model name="sansSerif" literal="sans-serif"
	 * @generated
	 * @ordered
	 */
	public static final int SANS_SERIF_VALUE = 9;

	/**
	 * The '<em><b>Bold Sans Serif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_SANS_SERIF
	 * @model name="boldSansSerif" literal="bold-sans-serif"
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_SANS_SERIF_VALUE = 10;

	/**
	 * The '<em><b>Sans Serif Italic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SANS_SERIF_ITALIC
	 * @model name="sansSerifItalic" literal="sans-serif-italic"
	 * @generated
	 * @ordered
	 */
	public static final int SANS_SERIF_ITALIC_VALUE = 11;

	/**
	 * The '<em><b>Sans Serif Bold Italic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SANS_SERIF_BOLD_ITALIC
	 * @model name="sansSerifBoldItalic" literal="sans-serif-bold-italic"
	 * @generated
	 * @ordered
	 */
	public static final int SANS_SERIF_BOLD_ITALIC_VALUE = 12;

	/**
	 * The '<em><b>Monospace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOSPACE
	 * @model name="monospace"
	 * @generated
	 * @ordered
	 */
	public static final int MONOSPACE_VALUE = 13;

	/**
	 * The '<em><b>Initial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL
	 * @model name="initial"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_VALUE = 14;

	/**
	 * The '<em><b>Tailed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAILED
	 * @model name="tailed"
	 * @generated
	 * @ordered
	 */
	public static final int TAILED_VALUE = 15;

	/**
	 * The '<em><b>Looped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOPED
	 * @model name="looped"
	 * @generated
	 * @ordered
	 */
	public static final int LOOPED_VALUE = 16;

	/**
	 * The '<em><b>Stretched</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRETCHED
	 * @model name="stretched"
	 * @generated
	 * @ordered
	 */
	public static final int STRETCHED_VALUE = 17;

	/**
	 * An array of all the '<em><b>Mathvariant Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MathvariantType2[] VALUES_ARRAY =
		new MathvariantType2[] {
			NORMAL,
			BOLD,
			ITALIC,
			BOLD_ITALIC,
			DOUBLE_STRUCK,
			BOLD_FRAKTUR,
			SCRIPT,
			BOLD_SCRIPT,
			FRAKTUR,
			SANS_SERIF,
			BOLD_SANS_SERIF,
			SANS_SERIF_ITALIC,
			SANS_SERIF_BOLD_ITALIC,
			MONOSPACE,
			INITIAL,
			TAILED,
			LOOPED,
			STRETCHED,
		};

	/**
	 * A public read-only list of all the '<em><b>Mathvariant Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MathvariantType2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mathvariant Type2</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MathvariantType2 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MathvariantType2 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mathvariant Type2</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MathvariantType2 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MathvariantType2 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mathvariant Type2</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MathvariantType2 get(int value) {
		switch (value) {
			case NORMAL_VALUE: return NORMAL;
			case BOLD_VALUE: return BOLD;
			case ITALIC_VALUE: return ITALIC;
			case BOLD_ITALIC_VALUE: return BOLD_ITALIC;
			case DOUBLE_STRUCK_VALUE: return DOUBLE_STRUCK;
			case BOLD_FRAKTUR_VALUE: return BOLD_FRAKTUR;
			case SCRIPT_VALUE: return SCRIPT;
			case BOLD_SCRIPT_VALUE: return BOLD_SCRIPT;
			case FRAKTUR_VALUE: return FRAKTUR;
			case SANS_SERIF_VALUE: return SANS_SERIF;
			case BOLD_SANS_SERIF_VALUE: return BOLD_SANS_SERIF;
			case SANS_SERIF_ITALIC_VALUE: return SANS_SERIF_ITALIC;
			case SANS_SERIF_BOLD_ITALIC_VALUE: return SANS_SERIF_BOLD_ITALIC;
			case MONOSPACE_VALUE: return MONOSPACE;
			case INITIAL_VALUE: return INITIAL;
			case TAILED_VALUE: return TAILED;
			case LOOPED_VALUE: return LOOPED;
			case STRETCHED_VALUE: return STRETCHED;
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
	private MathvariantType2(int value, String name, String literal) {
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
	
} //MathvariantType2
