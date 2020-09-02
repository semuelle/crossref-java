/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reason Type Item</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getReasonTypeItem()
 * @model extendedMetaData="name='reason_._type_._item'"
 * @generated
 */
public enum ReasonTypeItem implements Enumerator {
	/**
	 * The '<em><b>Editorial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITORIAL_VALUE
	 * @generated
	 * @ordered
	 */
	EDITORIAL(0, "editorial", "editorial"),

	/**
	 * The '<em><b>Revision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISION_VALUE
	 * @generated
	 * @ordered
	 */
	REVISION(1, "revision", "revision"),

	/**
	 * The '<em><b>Reapproval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAPPROVAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAPPROVAL(2, "reapproval", "reapproval"),

	/**
	 * The '<em><b>Correction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTION(3, "correction", "correction"),

	/**
	 * The '<em><b>Amendment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDMENT_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDMENT(4, "amendment", "amendment");

	/**
	 * The '<em><b>Editorial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITORIAL
	 * @model name="editorial"
	 * @generated
	 * @ordered
	 */
	public static final int EDITORIAL_VALUE = 0;

	/**
	 * The '<em><b>Revision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISION
	 * @model name="revision"
	 * @generated
	 * @ordered
	 */
	public static final int REVISION_VALUE = 1;

	/**
	 * The '<em><b>Reapproval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAPPROVAL
	 * @model name="reapproval"
	 * @generated
	 * @ordered
	 */
	public static final int REAPPROVAL_VALUE = 2;

	/**
	 * The '<em><b>Correction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRECTION
	 * @model name="correction"
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTION_VALUE = 3;

	/**
	 * The '<em><b>Amendment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDMENT
	 * @model name="amendment"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDMENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Reason Type Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReasonTypeItem[] VALUES_ARRAY =
		new ReasonTypeItem[] {
			EDITORIAL,
			REVISION,
			REAPPROVAL,
			CORRECTION,
			AMENDMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Reason Type Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReasonTypeItem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reason Type Item</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReasonTypeItem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReasonTypeItem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reason Type Item</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReasonTypeItem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReasonTypeItem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reason Type Item</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReasonTypeItem get(int value) {
		switch (value) {
			case EDITORIAL_VALUE: return EDITORIAL;
			case REVISION_VALUE: return REVISION;
			case REAPPROVAL_VALUE: return REAPPROVAL;
			case CORRECTION_VALUE: return CORRECTION;
			case AMENDMENT_VALUE: return AMENDMENT;
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
	private ReasonTypeItem(int value, String name, String literal) {
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
	
} //ReasonTypeItem
