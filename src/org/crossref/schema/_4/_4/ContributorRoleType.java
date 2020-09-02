/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contributor Role Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getContributorRoleType()
 * @model extendedMetaData="name='contributor_role_._type'"
 * @generated
 */
public enum ContributorRoleType implements Enumerator {
	/**
	 * The '<em><b>Author</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR(0, "author", "author"),

	/**
	 * The '<em><b>Editor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	EDITOR(1, "editor", "editor"),

	/**
	 * The '<em><b>Chair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAIR_VALUE
	 * @generated
	 * @ordered
	 */
	CHAIR(2, "chair", "chair"),

	/**
	 * The '<em><b>Reviewer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEWER_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEWER(3, "reviewer", "reviewer"),

	/**
	 * The '<em><b>Review Assistant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_ASSISTANT_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEW_ASSISTANT(4, "reviewAssistant", "review-assistant"),

	/**
	 * The '<em><b>Stats Reviewer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATS_REVIEWER_VALUE
	 * @generated
	 * @ordered
	 */
	STATS_REVIEWER(5, "statsReviewer", "stats-reviewer"),

	/**
	 * The '<em><b>Reviewer External</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEWER_EXTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEWER_EXTERNAL(6, "reviewerExternal", "reviewer-external"),

	/**
	 * The '<em><b>Reader</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READER_VALUE
	 * @generated
	 * @ordered
	 */
	READER(7, "reader", "reader"),

	/**
	 * The '<em><b>Translator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSLATOR_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSLATOR(8, "translator", "translator");

	/**
	 * The '<em><b>Author</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR
	 * @model name="author"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_VALUE = 0;

	/**
	 * The '<em><b>Editor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITOR
	 * @model name="editor"
	 * @generated
	 * @ordered
	 */
	public static final int EDITOR_VALUE = 1;

	/**
	 * The '<em><b>Chair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAIR
	 * @model name="chair"
	 * @generated
	 * @ordered
	 */
	public static final int CHAIR_VALUE = 2;

	/**
	 * The '<em><b>Reviewer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEWER
	 * @model name="reviewer"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEWER_VALUE = 3;

	/**
	 * The '<em><b>Review Assistant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_ASSISTANT
	 * @model name="reviewAssistant" literal="review-assistant"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEW_ASSISTANT_VALUE = 4;

	/**
	 * The '<em><b>Stats Reviewer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATS_REVIEWER
	 * @model name="statsReviewer" literal="stats-reviewer"
	 * @generated
	 * @ordered
	 */
	public static final int STATS_REVIEWER_VALUE = 5;

	/**
	 * The '<em><b>Reviewer External</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEWER_EXTERNAL
	 * @model name="reviewerExternal" literal="reviewer-external"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEWER_EXTERNAL_VALUE = 6;

	/**
	 * The '<em><b>Reader</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READER
	 * @model name="reader"
	 * @generated
	 * @ordered
	 */
	public static final int READER_VALUE = 7;

	/**
	 * The '<em><b>Translator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSLATOR
	 * @model name="translator"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSLATOR_VALUE = 8;

	/**
	 * An array of all the '<em><b>Contributor Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContributorRoleType[] VALUES_ARRAY =
		new ContributorRoleType[] {
			AUTHOR,
			EDITOR,
			CHAIR,
			REVIEWER,
			REVIEW_ASSISTANT,
			STATS_REVIEWER,
			REVIEWER_EXTERNAL,
			READER,
			TRANSLATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Contributor Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContributorRoleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contributor Role Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContributorRoleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContributorRoleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contributor Role Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContributorRoleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContributorRoleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contributor Role Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContributorRoleType get(int value) {
		switch (value) {
			case AUTHOR_VALUE: return AUTHOR;
			case EDITOR_VALUE: return EDITOR;
			case CHAIR_VALUE: return CHAIR;
			case REVIEWER_VALUE: return REVIEWER;
			case REVIEW_ASSISTANT_VALUE: return REVIEW_ASSISTANT;
			case STATS_REVIEWER_VALUE: return STATS_REVIEWER;
			case REVIEWER_EXTERNAL_VALUE: return REVIEWER_EXTERNAL;
			case READER_VALUE: return READER;
			case TRANSLATOR_VALUE: return TRANSLATOR;
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
	private ContributorRoleType(int value, String name, String literal) {
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
	
} //ContributorRoleType
