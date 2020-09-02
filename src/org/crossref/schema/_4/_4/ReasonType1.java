/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reason Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getReasonType1()
 * @model extendedMetaData="name='reason_._1_._type'"
 * @generated
 */
public enum ReasonType1 implements Enumerator {
	/**
	 * The '<em><b>Archive Volume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVE_VOLUME_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIVE_VOLUME(0, "archiveVolume", "archive_volume"),

	/**
	 * The '<em><b>Monograph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOGRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	MONOGRAPH(1, "monograph", "monograph"),

	/**
	 * The '<em><b>Simple Series</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_SERIES_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_SERIES(2, "simpleSeries", "simple_series");

	/**
	 * The '<em><b>Archive Volume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVE_VOLUME
	 * @model name="archiveVolume" literal="archive_volume"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIVE_VOLUME_VALUE = 0;

	/**
	 * The '<em><b>Monograph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOGRAPH
	 * @model name="monograph"
	 * @generated
	 * @ordered
	 */
	public static final int MONOGRAPH_VALUE = 1;

	/**
	 * The '<em><b>Simple Series</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_SERIES
	 * @model name="simpleSeries" literal="simple_series"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_SERIES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Reason Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReasonType1[] VALUES_ARRAY =
		new ReasonType1[] {
			ARCHIVE_VOLUME,
			MONOGRAPH,
			SIMPLE_SERIES,
		};

	/**
	 * A public read-only list of all the '<em><b>Reason Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReasonType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reason Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReasonType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReasonType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reason Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReasonType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReasonType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reason Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReasonType1 get(int value) {
		switch (value) {
			case ARCHIVE_VOLUME_VALUE: return ARCHIVE_VOLUME;
			case MONOGRAPH_VALUE: return MONOGRAPH;
			case SIMPLE_SERIES_VALUE: return SIMPLE_SERIES;
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
	private ReasonType1(int value, String name, String literal) {
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
	
} //ReasonType1
