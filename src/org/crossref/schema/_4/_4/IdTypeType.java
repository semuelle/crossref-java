/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Id Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getIdTypeType()
 * @model extendedMetaData="name='id_type_._type'"
 * @generated
 */
public enum IdTypeType implements Enumerator {
	/**
	 * The '<em><b>Pii</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PII_VALUE
	 * @generated
	 * @ordered
	 */
	PII(0, "pii", "pii"),

	/**
	 * The '<em><b>Sici</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SICI_VALUE
	 * @generated
	 * @ordered
	 */
	SICI(1, "sici", "sici"),

	/**
	 * The '<em><b>Doi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOI_VALUE
	 * @generated
	 * @ordered
	 */
	DOI(2, "doi", "doi"),

	/**
	 * The '<em><b>Dai</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAI_VALUE
	 * @generated
	 * @ordered
	 */
	DAI(3, "dai", "dai"),

	/**
	 * The '<em><b>Z3923</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Z3923_VALUE
	 * @generated
	 * @ordered
	 */
	Z3923(4, "Z3923", "Z39.23"),

	/**
	 * The '<em><b>ISO Std Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_STD_REF_VALUE
	 * @generated
	 * @ordered
	 */
	ISO_STD_REF(5, "ISOStdRef", "ISO-std-ref"),

	/**
	 * The '<em><b>Std Designation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STD_DESIGNATION_VALUE
	 * @generated
	 * @ordered
	 */
	STD_DESIGNATION(6, "stdDesignation", "std-designation"),

	/**
	 * The '<em><b>Report Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT_NUMBER(7, "reportNumber", "report-number"),

	/**
	 * The '<em><b>Pmid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMID_VALUE
	 * @generated
	 * @ordered
	 */
	PMID(8, "pmid", "pmid"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(9, "other", "other");

	/**
	 * The '<em><b>Pii</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PII
	 * @model name="pii"
	 * @generated
	 * @ordered
	 */
	public static final int PII_VALUE = 0;

	/**
	 * The '<em><b>Sici</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SICI
	 * @model name="sici"
	 * @generated
	 * @ordered
	 */
	public static final int SICI_VALUE = 1;

	/**
	 * The '<em><b>Doi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOI
	 * @model name="doi"
	 * @generated
	 * @ordered
	 */
	public static final int DOI_VALUE = 2;

	/**
	 * The '<em><b>Dai</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAI
	 * @model name="dai"
	 * @generated
	 * @ordered
	 */
	public static final int DAI_VALUE = 3;

	/**
	 * The '<em><b>Z3923</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Z3923
	 * @model literal="Z39.23"
	 * @generated
	 * @ordered
	 */
	public static final int Z3923_VALUE = 4;

	/**
	 * The '<em><b>ISO Std Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_STD_REF
	 * @model name="ISOStdRef" literal="ISO-std-ref"
	 * @generated
	 * @ordered
	 */
	public static final int ISO_STD_REF_VALUE = 5;

	/**
	 * The '<em><b>Std Designation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STD_DESIGNATION
	 * @model name="stdDesignation" literal="std-designation"
	 * @generated
	 * @ordered
	 */
	public static final int STD_DESIGNATION_VALUE = 6;

	/**
	 * The '<em><b>Report Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_NUMBER
	 * @model name="reportNumber" literal="report-number"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_NUMBER_VALUE = 7;

	/**
	 * The '<em><b>Pmid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMID
	 * @model name="pmid"
	 * @generated
	 * @ordered
	 */
	public static final int PMID_VALUE = 8;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 9;

	/**
	 * An array of all the '<em><b>Id Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdTypeType[] VALUES_ARRAY =
		new IdTypeType[] {
			PII,
			SICI,
			DOI,
			DAI,
			Z3923,
			ISO_STD_REF,
			STD_DESIGNATION,
			REPORT_NUMBER,
			PMID,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Id Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Id Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Id Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Id Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdTypeType get(int value) {
		switch (value) {
			case PII_VALUE: return PII;
			case SICI_VALUE: return SICI;
			case DOI_VALUE: return DOI;
			case DAI_VALUE: return DAI;
			case Z3923_VALUE: return Z3923;
			case ISO_STD_REF_VALUE: return ISO_STD_REF;
			case STD_DESIGNATION_VALUE: return STD_DESIGNATION;
			case REPORT_NUMBER_VALUE: return REPORT_NUMBER;
			case PMID_VALUE: return PMID;
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
	private IdTypeType(int value, String name, String literal) {
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
	
} //IdTypeType
