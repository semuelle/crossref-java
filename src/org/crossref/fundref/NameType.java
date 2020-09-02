/**
 */
package org.crossref.fundref;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Name Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.fundref.FundrefPackage#getNameType()
 * @model extendedMetaData="name='name_._type'"
 * @generated
 */
public enum NameType implements Enumerator {
	/**
	 * The '<em><b>Fundgroup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNDGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	FUNDGROUP(0, "fundgroup", "fundgroup"),

	/**
	 * The '<em><b>Funder Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNDER_IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	FUNDER_IDENTIFIER(1, "funderIdentifier", "funder_identifier"),

	/**
	 * The '<em><b>Funder Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNDER_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	FUNDER_NAME(2, "funderName", "funder_name"),

	/**
	 * The '<em><b>Award Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWARD_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	AWARD_NUMBER(3, "awardNumber", "award_number");

	/**
	 * The '<em><b>Fundgroup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNDGROUP
	 * @model name="fundgroup"
	 * @generated
	 * @ordered
	 */
	public static final int FUNDGROUP_VALUE = 0;

	/**
	 * The '<em><b>Funder Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNDER_IDENTIFIER
	 * @model name="funderIdentifier" literal="funder_identifier"
	 * @generated
	 * @ordered
	 */
	public static final int FUNDER_IDENTIFIER_VALUE = 1;

	/**
	 * The '<em><b>Funder Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNDER_NAME
	 * @model name="funderName" literal="funder_name"
	 * @generated
	 * @ordered
	 */
	public static final int FUNDER_NAME_VALUE = 2;

	/**
	 * The '<em><b>Award Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWARD_NUMBER
	 * @model name="awardNumber" literal="award_number"
	 * @generated
	 * @ordered
	 */
	public static final int AWARD_NUMBER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NameType[] VALUES_ARRAY =
		new NameType[] {
			FUNDGROUP,
			FUNDER_IDENTIFIER,
			FUNDER_NAME,
			AWARD_NUMBER,
		};

	/**
	 * A public read-only list of all the '<em><b>Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NameType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType get(int value) {
		switch (value) {
			case FUNDGROUP_VALUE: return FUNDGROUP;
			case FUNDER_IDENTIFIER_VALUE: return FUNDER_IDENTIFIER;
			case FUNDER_NAME_VALUE: return FUNDER_NAME;
			case AWARD_NUMBER_VALUE: return AWARD_NUMBER;
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
	private NameType(int value, String name, String literal) {
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
	
} //NameType
