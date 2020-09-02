/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getTypeType1()
 * @model extendedMetaData="name='type_._1_._type'"
 * @generated
 */
public enum TypeType1 implements Enumerator {
	/**
	 * The '<em><b>Preprint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPRINT_VALUE
	 * @generated
	 * @ordered
	 */
	PREPRINT(0, "preprint", "preprint"),

	/**
	 * The '<em><b>Working Paper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING_PAPER_VALUE
	 * @generated
	 * @ordered
	 */
	WORKING_PAPER(1, "workingPaper", "working_paper"),

	/**
	 * The '<em><b>Letter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LETTER_VALUE
	 * @generated
	 * @ordered
	 */
	LETTER(2, "letter", "letter"),

	/**
	 * The '<em><b>Dissertation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISSERTATION_VALUE
	 * @generated
	 * @ordered
	 */
	DISSERTATION(3, "dissertation", "dissertation"),

	/**
	 * The '<em><b>Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT(4, "report", "report"),

	/**
	 * The '<em><b>Review</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEW(5, "review", "review"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "other", "other");

	/**
	 * The '<em><b>Preprint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPRINT
	 * @model name="preprint"
	 * @generated
	 * @ordered
	 */
	public static final int PREPRINT_VALUE = 0;

	/**
	 * The '<em><b>Working Paper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING_PAPER
	 * @model name="workingPaper" literal="working_paper"
	 * @generated
	 * @ordered
	 */
	public static final int WORKING_PAPER_VALUE = 1;

	/**
	 * The '<em><b>Letter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LETTER
	 * @model name="letter"
	 * @generated
	 * @ordered
	 */
	public static final int LETTER_VALUE = 2;

	/**
	 * The '<em><b>Dissertation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISSERTATION
	 * @model name="dissertation"
	 * @generated
	 * @ordered
	 */
	public static final int DISSERTATION_VALUE = 3;

	/**
	 * The '<em><b>Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT
	 * @model name="report"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_VALUE = 4;

	/**
	 * The '<em><b>Review</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW
	 * @model name="review"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEW_VALUE = 5;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType1[] VALUES_ARRAY =
		new TypeType1[] {
			PREPRINT,
			WORKING_PAPER,
			LETTER,
			DISSERTATION,
			REPORT,
			REVIEW,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType1 get(int value) {
		switch (value) {
			case PREPRINT_VALUE: return PREPRINT;
			case WORKING_PAPER_VALUE: return WORKING_PAPER;
			case LETTER_VALUE: return LETTER;
			case DISSERTATION_VALUE: return DISSERTATION;
			case REPORT_VALUE: return REPORT;
			case REVIEW_VALUE: return REVIEW;
			case OTHER_VALUE: return OTHER;
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
	private TypeType1(int value, String name, String literal) {
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
	
} //TypeType1
