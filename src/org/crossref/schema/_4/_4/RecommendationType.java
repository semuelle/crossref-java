/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Recommendation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getRecommendationType()
 * @model extendedMetaData="name='recommendation_._type'"
 * @generated
 */
public enum RecommendationType implements Enumerator {
	/**
	 * The '<em><b>Major Revision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_REVISION_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR_REVISION(0, "majorRevision", "major-revision"),

	/**
	 * The '<em><b>Minor Revision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_REVISION_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR_REVISION(1, "minorRevision", "minor-revision"),

	/**
	 * The '<em><b>Reject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT(2, "reject", "reject"),

	/**
	 * The '<em><b>Reject With Resubmit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_WITH_RESUBMIT_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT_WITH_RESUBMIT(3, "rejectWithResubmit", "reject-with-resubmit"),

	/**
	 * The '<em><b>Accept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPT(4, "accept", "accept"),

	/**
	 * The '<em><b>Accept With Reservation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPT_WITH_RESERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPT_WITH_RESERVATION(5, "acceptWithReservation", "accept-with-reservation");

	/**
	 * The '<em><b>Major Revision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_REVISION
	 * @model name="majorRevision" literal="major-revision"
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_REVISION_VALUE = 0;

	/**
	 * The '<em><b>Minor Revision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_REVISION
	 * @model name="minorRevision" literal="minor-revision"
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_REVISION_VALUE = 1;

	/**
	 * The '<em><b>Reject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT
	 * @model name="reject"
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_VALUE = 2;

	/**
	 * The '<em><b>Reject With Resubmit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_WITH_RESUBMIT
	 * @model name="rejectWithResubmit" literal="reject-with-resubmit"
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_WITH_RESUBMIT_VALUE = 3;

	/**
	 * The '<em><b>Accept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPT
	 * @model name="accept"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPT_VALUE = 4;

	/**
	 * The '<em><b>Accept With Reservation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPT_WITH_RESERVATION
	 * @model name="acceptWithReservation" literal="accept-with-reservation"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPT_WITH_RESERVATION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Recommendation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RecommendationType[] VALUES_ARRAY =
		new RecommendationType[] {
			MAJOR_REVISION,
			MINOR_REVISION,
			REJECT,
			REJECT_WITH_RESUBMIT,
			ACCEPT,
			ACCEPT_WITH_RESERVATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Recommendation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RecommendationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Recommendation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecommendationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecommendationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recommendation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecommendationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecommendationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recommendation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecommendationType get(int value) {
		switch (value) {
			case MAJOR_REVISION_VALUE: return MAJOR_REVISION;
			case MINOR_REVISION_VALUE: return MINOR_REVISION;
			case REJECT_VALUE: return REJECT;
			case REJECT_WITH_RESUBMIT_VALUE: return REJECT_WITH_RESUBMIT;
			case ACCEPT_VALUE: return ACCEPT;
			case ACCEPT_WITH_RESERVATION_VALUE: return ACCEPT_WITH_RESERVATION;
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
	private RecommendationType(int value, String name, String literal) {
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
	
} //RecommendationType
