/**
 */
package gov.nih.nlm.ncbi.jats1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ref Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRefTypeType()
 * @model extendedMetaData="name='ref-type_._type'"
 * @generated
 */
public enum RefTypeType implements Enumerator {
	/**
	 * The '<em><b>Aff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFF_VALUE
	 * @generated
	 * @ordered
	 */
	AFF(0, "aff", "aff"),

	/**
	 * The '<em><b>App</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_VALUE
	 * @generated
	 * @ordered
	 */
	APP(1, "app", "app"),

	/**
	 * The '<em><b>Author Notes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_NOTES_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR_NOTES(2, "authorNotes", "author-notes"),

	/**
	 * The '<em><b>Award</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWARD_VALUE
	 * @generated
	 * @ordered
	 */
	AWARD(3, "award", "award"),

	/**
	 * The '<em><b>Bibr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIBR_VALUE
	 * @generated
	 * @ordered
	 */
	BIBR(4, "bibr", "bibr"),

	/**
	 * The '<em><b>Bio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIO_VALUE
	 * @generated
	 * @ordered
	 */
	BIO(5, "bio", "bio"),

	/**
	 * The '<em><b>Boxed Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOXED_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	BOXED_TEXT(6, "boxedText", "boxed-text"),

	/**
	 * The '<em><b>Chem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEM_VALUE
	 * @generated
	 * @ordered
	 */
	CHEM(7, "chem", "chem"),

	/**
	 * The '<em><b>Collab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLAB_VALUE
	 * @generated
	 * @ordered
	 */
	COLLAB(8, "collab", "collab"),

	/**
	 * The '<em><b>Contrib</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRIB_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRIB(9, "contrib", "contrib"),

	/**
	 * The '<em><b>Corresp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRESP_VALUE
	 * @generated
	 * @ordered
	 */
	CORRESP(10, "corresp", "corresp"),

	/**
	 * The '<em><b>Disp Formula</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISP_FORMULA_VALUE
	 * @generated
	 * @ordered
	 */
	DISP_FORMULA(11, "dispFormula", "disp-formula"),

	/**
	 * The '<em><b>Fig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIG_VALUE
	 * @generated
	 * @ordered
	 */
	FIG(12, "fig", "fig"),

	/**
	 * The '<em><b>Fn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FN_VALUE
	 * @generated
	 * @ordered
	 */
	FN(13, "fn", "fn"),

	/**
	 * The '<em><b>Kwd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWD_VALUE
	 * @generated
	 * @ordered
	 */
	KWD(14, "kwd", "kwd"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(15, "list", "list"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(16, "other", "other"),

	/**
	 * The '<em><b>Plate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATE_VALUE
	 * @generated
	 * @ordered
	 */
	PLATE(17, "plate", "plate"),

	/**
	 * The '<em><b>Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEME(18, "scheme", "scheme"),

	/**
	 * The '<em><b>Sec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEC_VALUE
	 * @generated
	 * @ordered
	 */
	SEC(19, "sec", "sec"),

	/**
	 * The '<em><b>Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	STATEMENT(20, "statement", "statement"),

	/**
	 * The '<em><b>Supplementary Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLEMENTARY_MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLEMENTARY_MATERIAL(21, "supplementaryMaterial", "supplementary-material"),

	/**
	 * The '<em><b>Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE(22, "table", "table"),

	/**
	 * The '<em><b>Table Fn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_FN_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_FN(23, "tableFn", "table-fn");

	/**
	 * The '<em><b>Aff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFF
	 * @model name="aff"
	 * @generated
	 * @ordered
	 */
	public static final int AFF_VALUE = 0;

	/**
	 * The '<em><b>App</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP
	 * @model name="app"
	 * @generated
	 * @ordered
	 */
	public static final int APP_VALUE = 1;

	/**
	 * The '<em><b>Author Notes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_NOTES
	 * @model name="authorNotes" literal="author-notes"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_NOTES_VALUE = 2;

	/**
	 * The '<em><b>Award</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWARD
	 * @model name="award"
	 * @generated
	 * @ordered
	 */
	public static final int AWARD_VALUE = 3;

	/**
	 * The '<em><b>Bibr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIBR
	 * @model name="bibr"
	 * @generated
	 * @ordered
	 */
	public static final int BIBR_VALUE = 4;

	/**
	 * The '<em><b>Bio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIO
	 * @model name="bio"
	 * @generated
	 * @ordered
	 */
	public static final int BIO_VALUE = 5;

	/**
	 * The '<em><b>Boxed Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOXED_TEXT
	 * @model name="boxedText" literal="boxed-text"
	 * @generated
	 * @ordered
	 */
	public static final int BOXED_TEXT_VALUE = 6;

	/**
	 * The '<em><b>Chem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEM
	 * @model name="chem"
	 * @generated
	 * @ordered
	 */
	public static final int CHEM_VALUE = 7;

	/**
	 * The '<em><b>Collab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLAB
	 * @model name="collab"
	 * @generated
	 * @ordered
	 */
	public static final int COLLAB_VALUE = 8;

	/**
	 * The '<em><b>Contrib</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRIB
	 * @model name="contrib"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRIB_VALUE = 9;

	/**
	 * The '<em><b>Corresp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRESP
	 * @model name="corresp"
	 * @generated
	 * @ordered
	 */
	public static final int CORRESP_VALUE = 10;

	/**
	 * The '<em><b>Disp Formula</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISP_FORMULA
	 * @model name="dispFormula" literal="disp-formula"
	 * @generated
	 * @ordered
	 */
	public static final int DISP_FORMULA_VALUE = 11;

	/**
	 * The '<em><b>Fig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIG
	 * @model name="fig"
	 * @generated
	 * @ordered
	 */
	public static final int FIG_VALUE = 12;

	/**
	 * The '<em><b>Fn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FN
	 * @model name="fn"
	 * @generated
	 * @ordered
	 */
	public static final int FN_VALUE = 13;

	/**
	 * The '<em><b>Kwd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWD
	 * @model name="kwd"
	 * @generated
	 * @ordered
	 */
	public static final int KWD_VALUE = 14;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model name="list"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 15;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 16;

	/**
	 * The '<em><b>Plate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATE
	 * @model name="plate"
	 * @generated
	 * @ordered
	 */
	public static final int PLATE_VALUE = 17;

	/**
	 * The '<em><b>Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEME
	 * @model name="scheme"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEME_VALUE = 18;

	/**
	 * The '<em><b>Sec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEC
	 * @model name="sec"
	 * @generated
	 * @ordered
	 */
	public static final int SEC_VALUE = 19;

	/**
	 * The '<em><b>Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEMENT
	 * @model name="statement"
	 * @generated
	 * @ordered
	 */
	public static final int STATEMENT_VALUE = 20;

	/**
	 * The '<em><b>Supplementary Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLEMENTARY_MATERIAL
	 * @model name="supplementaryMaterial" literal="supplementary-material"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLEMENTARY_MATERIAL_VALUE = 21;

	/**
	 * The '<em><b>Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE
	 * @model name="table"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_VALUE = 22;

	/**
	 * The '<em><b>Table Fn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_FN
	 * @model name="tableFn" literal="table-fn"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_FN_VALUE = 23;

	/**
	 * An array of all the '<em><b>Ref Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RefTypeType[] VALUES_ARRAY =
		new RefTypeType[] {
			AFF,
			APP,
			AUTHOR_NOTES,
			AWARD,
			BIBR,
			BIO,
			BOXED_TEXT,
			CHEM,
			COLLAB,
			CONTRIB,
			CORRESP,
			DISP_FORMULA,
			FIG,
			FN,
			KWD,
			LIST,
			OTHER,
			PLATE,
			SCHEME,
			SEC,
			STATEMENT,
			SUPPLEMENTARY_MATERIAL,
			TABLE,
			TABLE_FN,
		};

	/**
	 * A public read-only list of all the '<em><b>Ref Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RefTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ref Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RefTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ref Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RefTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ref Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RefTypeType get(int value) {
		switch (value) {
			case AFF_VALUE: return AFF;
			case APP_VALUE: return APP;
			case AUTHOR_NOTES_VALUE: return AUTHOR_NOTES;
			case AWARD_VALUE: return AWARD;
			case BIBR_VALUE: return BIBR;
			case BIO_VALUE: return BIO;
			case BOXED_TEXT_VALUE: return BOXED_TEXT;
			case CHEM_VALUE: return CHEM;
			case COLLAB_VALUE: return COLLAB;
			case CONTRIB_VALUE: return CONTRIB;
			case CORRESP_VALUE: return CORRESP;
			case DISP_FORMULA_VALUE: return DISP_FORMULA;
			case FIG_VALUE: return FIG;
			case FN_VALUE: return FN;
			case KWD_VALUE: return KWD;
			case LIST_VALUE: return LIST;
			case OTHER_VALUE: return OTHER;
			case PLATE_VALUE: return PLATE;
			case SCHEME_VALUE: return SCHEME;
			case SEC_VALUE: return SEC;
			case STATEMENT_VALUE: return STATEMENT;
			case SUPPLEMENTARY_MATERIAL_VALUE: return SUPPLEMENTARY_MATERIAL;
			case TABLE_VALUE: return TABLE;
			case TABLE_FN_VALUE: return TABLE_FN;
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
	private RefTypeType(int value, String name, String literal) {
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
	
} //RefTypeType
