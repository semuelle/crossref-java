/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getTypeType2()
 * @model extendedMetaData="name='type_._2_._type'"
 * @generated
 */
public enum TypeType2 implements Enumerator {
	/**
	 * The '<em><b>Referee Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFEREE_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	REFEREE_REPORT(0, "refereeReport", "referee-report"),

	/**
	 * The '<em><b>Editor Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITOR_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	EDITOR_REPORT(1, "editorReport", "editor-report"),

	/**
	 * The '<em><b>Author Comment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR_COMMENT(2, "authorComment", "author-comment"),

	/**
	 * The '<em><b>Community Comment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNITY_COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNITY_COMMENT(3, "communityComment", "community-comment"),

	/**
	 * The '<em><b>Manuscript</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUSCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	MANUSCRIPT(4, "manuscript", "manuscript"),

	/**
	 * The '<em><b>Aggregate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATE_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATE(5, "aggregate", "aggregate"),

	/**
	 * The '<em><b>Recommendation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOMMENDATION_VALUE
	 * @generated
	 * @ordered
	 */
	RECOMMENDATION(6, "recommendation", "recommendation");

	/**
	 * The '<em><b>Referee Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFEREE_REPORT
	 * @model name="refereeReport" literal="referee-report"
	 * @generated
	 * @ordered
	 */
	public static final int REFEREE_REPORT_VALUE = 0;

	/**
	 * The '<em><b>Editor Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITOR_REPORT
	 * @model name="editorReport" literal="editor-report"
	 * @generated
	 * @ordered
	 */
	public static final int EDITOR_REPORT_VALUE = 1;

	/**
	 * The '<em><b>Author Comment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_COMMENT
	 * @model name="authorComment" literal="author-comment"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_COMMENT_VALUE = 2;

	/**
	 * The '<em><b>Community Comment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNITY_COMMENT
	 * @model name="communityComment" literal="community-comment"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNITY_COMMENT_VALUE = 3;

	/**
	 * The '<em><b>Manuscript</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUSCRIPT
	 * @model name="manuscript"
	 * @generated
	 * @ordered
	 */
	public static final int MANUSCRIPT_VALUE = 4;

	/**
	 * The '<em><b>Aggregate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATE
	 * @model name="aggregate"
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATE_VALUE = 5;

	/**
	 * The '<em><b>Recommendation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOMMENDATION
	 * @model name="recommendation"
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType2[] VALUES_ARRAY =
		new TypeType2[] {
			REFEREE_REPORT,
			EDITOR_REPORT,
			AUTHOR_COMMENT,
			COMMUNITY_COMMENT,
			MANUSCRIPT,
			AGGREGATE,
			RECOMMENDATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type2</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType2 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType2 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type2</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType2 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType2 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type2</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType2 get(int value) {
		switch (value) {
			case REFEREE_REPORT_VALUE: return REFEREE_REPORT;
			case EDITOR_REPORT_VALUE: return EDITOR_REPORT;
			case AUTHOR_COMMENT_VALUE: return AUTHOR_COMMENT;
			case COMMUNITY_COMMENT_VALUE: return COMMUNITY_COMMENT;
			case MANUSCRIPT_VALUE: return MANUSCRIPT;
			case AGGREGATE_VALUE: return AGGREGATE;
			case RECOMMENDATION_VALUE: return RECOMMENDATION;
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
	private TypeType2(int value, String name, String literal) {
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
	
} //TypeType2
