/**
 */
package org.crossref.relations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relationship Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.relations.RelationsPackage#getRelationshipTypeType()
 * @model extendedMetaData="name='relationship-type_._type'"
 * @generated
 */
public enum RelationshipTypeType implements Enumerator {
	/**
	 * The '<em><b>Is Translation Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_TRANSLATION_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_TRANSLATION_OF(0, "isTranslationOf", "isTranslationOf"),

	/**
	 * The '<em><b>Has Translation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_TRANSLATION_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_TRANSLATION(1, "hasTranslation", "hasTranslation"),

	/**
	 * The '<em><b>Is Preprint Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PREPRINT_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_PREPRINT_OF(2, "isPreprintOf", "isPreprintOf"),

	/**
	 * The '<em><b>Has Preprint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_PREPRINT_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_PREPRINT(3, "hasPreprint", "hasPreprint"),

	/**
	 * The '<em><b>Is Manuscript Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_MANUSCRIPT_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_MANUSCRIPT_OF(4, "isManuscriptOf", "isManuscriptOf"),

	/**
	 * The '<em><b>Has Manuscript</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_MANUSCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_MANUSCRIPT(5, "hasManuscript", "hasManuscript"),

	/**
	 * The '<em><b>Is Expression Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_EXPRESSION_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_EXPRESSION_OF(6, "isExpressionOf", "isExpressionOf"),

	/**
	 * The '<em><b>Has Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_EXPRESSION(7, "hasExpression", "hasExpression"),

	/**
	 * The '<em><b>Is Manifestation Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_MANIFESTATION_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_MANIFESTATION_OF(8, "isManifestationOf", "isManifestationOf"),

	/**
	 * The '<em><b>Has Manifestation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_MANIFESTATION_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_MANIFESTATION(9, "hasManifestation", "hasManifestation"),

	/**
	 * The '<em><b>Is Replaced By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REPLACED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_REPLACED_BY(10, "isReplacedBy", "isReplacedBy"),

	/**
	 * The '<em><b>Replaces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACES_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACES(11, "replaces", "replaces"),

	/**
	 * The '<em><b>Is Same As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SAME_AS_VALUE
	 * @generated
	 * @ordered
	 */
	IS_SAME_AS(12, "isSameAs", "isSameAs"),

	/**
	 * The '<em><b>Is Identical To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_IDENTICAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	IS_IDENTICAL_TO(13, "isIdenticalTo", "isIdenticalTo"),

	/**
	 * The '<em><b>Is Variant Form Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_VARIANT_FORM_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_VARIANT_FORM_OF(14, "isVariantFormOf", "isVariantFormOf"),

	/**
	 * The '<em><b>Is Original Form Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ORIGINAL_FORM_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_ORIGINAL_FORM_OF(15, "isOriginalFormOf", "isOriginalFormOf"),

	/**
	 * The '<em><b>Is Version Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_VERSION_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_VERSION_OF(16, "isVersionOf", "isVersionOf"),

	/**
	 * The '<em><b>Has Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_VERSION(17, "hasVersion", "hasVersion"),

	/**
	 * The '<em><b>Is Format Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_FORMAT_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_FORMAT_OF(18, "isFormatOf", "isFormatOf"),

	/**
	 * The '<em><b>Has Format</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_FORMAT(19, "hasFormat", "hasFormat");

	/**
	 * The '<em><b>Is Translation Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_TRANSLATION_OF
	 * @model name="isTranslationOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_TRANSLATION_OF_VALUE = 0;

	/**
	 * The '<em><b>Has Translation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_TRANSLATION
	 * @model name="hasTranslation"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_TRANSLATION_VALUE = 1;

	/**
	 * The '<em><b>Is Preprint Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PREPRINT_OF
	 * @model name="isPreprintOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_PREPRINT_OF_VALUE = 2;

	/**
	 * The '<em><b>Has Preprint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_PREPRINT
	 * @model name="hasPreprint"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_PREPRINT_VALUE = 3;

	/**
	 * The '<em><b>Is Manuscript Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_MANUSCRIPT_OF
	 * @model name="isManuscriptOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_MANUSCRIPT_OF_VALUE = 4;

	/**
	 * The '<em><b>Has Manuscript</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_MANUSCRIPT
	 * @model name="hasManuscript"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_MANUSCRIPT_VALUE = 5;

	/**
	 * The '<em><b>Is Expression Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_EXPRESSION_OF
	 * @model name="isExpressionOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_EXPRESSION_OF_VALUE = 6;

	/**
	 * The '<em><b>Has Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_EXPRESSION
	 * @model name="hasExpression"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_EXPRESSION_VALUE = 7;

	/**
	 * The '<em><b>Is Manifestation Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_MANIFESTATION_OF
	 * @model name="isManifestationOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_MANIFESTATION_OF_VALUE = 8;

	/**
	 * The '<em><b>Has Manifestation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_MANIFESTATION
	 * @model name="hasManifestation"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_MANIFESTATION_VALUE = 9;

	/**
	 * The '<em><b>Is Replaced By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REPLACED_BY
	 * @model name="isReplacedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_REPLACED_BY_VALUE = 10;

	/**
	 * The '<em><b>Replaces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACES
	 * @model name="replaces"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACES_VALUE = 11;

	/**
	 * The '<em><b>Is Same As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SAME_AS
	 * @model name="isSameAs"
	 * @generated
	 * @ordered
	 */
	public static final int IS_SAME_AS_VALUE = 12;

	/**
	 * The '<em><b>Is Identical To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_IDENTICAL_TO
	 * @model name="isIdenticalTo"
	 * @generated
	 * @ordered
	 */
	public static final int IS_IDENTICAL_TO_VALUE = 13;

	/**
	 * The '<em><b>Is Variant Form Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_VARIANT_FORM_OF
	 * @model name="isVariantFormOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_VARIANT_FORM_OF_VALUE = 14;

	/**
	 * The '<em><b>Is Original Form Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ORIGINAL_FORM_OF
	 * @model name="isOriginalFormOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_ORIGINAL_FORM_OF_VALUE = 15;

	/**
	 * The '<em><b>Is Version Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_VERSION_OF
	 * @model name="isVersionOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_VERSION_OF_VALUE = 16;

	/**
	 * The '<em><b>Has Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_VERSION
	 * @model name="hasVersion"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_VERSION_VALUE = 17;

	/**
	 * The '<em><b>Is Format Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_FORMAT_OF
	 * @model name="isFormatOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_FORMAT_OF_VALUE = 18;

	/**
	 * The '<em><b>Has Format</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_FORMAT
	 * @model name="hasFormat"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_FORMAT_VALUE = 19;

	/**
	 * An array of all the '<em><b>Relationship Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationshipTypeType[] VALUES_ARRAY =
		new RelationshipTypeType[] {
			IS_TRANSLATION_OF,
			HAS_TRANSLATION,
			IS_PREPRINT_OF,
			HAS_PREPRINT,
			IS_MANUSCRIPT_OF,
			HAS_MANUSCRIPT,
			IS_EXPRESSION_OF,
			HAS_EXPRESSION,
			IS_MANIFESTATION_OF,
			HAS_MANIFESTATION,
			IS_REPLACED_BY,
			REPLACES,
			IS_SAME_AS,
			IS_IDENTICAL_TO,
			IS_VARIANT_FORM_OF,
			IS_ORIGINAL_FORM_OF,
			IS_VERSION_OF,
			HAS_VERSION,
			IS_FORMAT_OF,
			HAS_FORMAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Relationship Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationshipTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relationship Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipTypeType get(int value) {
		switch (value) {
			case IS_TRANSLATION_OF_VALUE: return IS_TRANSLATION_OF;
			case HAS_TRANSLATION_VALUE: return HAS_TRANSLATION;
			case IS_PREPRINT_OF_VALUE: return IS_PREPRINT_OF;
			case HAS_PREPRINT_VALUE: return HAS_PREPRINT;
			case IS_MANUSCRIPT_OF_VALUE: return IS_MANUSCRIPT_OF;
			case HAS_MANUSCRIPT_VALUE: return HAS_MANUSCRIPT;
			case IS_EXPRESSION_OF_VALUE: return IS_EXPRESSION_OF;
			case HAS_EXPRESSION_VALUE: return HAS_EXPRESSION;
			case IS_MANIFESTATION_OF_VALUE: return IS_MANIFESTATION_OF;
			case HAS_MANIFESTATION_VALUE: return HAS_MANIFESTATION;
			case IS_REPLACED_BY_VALUE: return IS_REPLACED_BY;
			case REPLACES_VALUE: return REPLACES;
			case IS_SAME_AS_VALUE: return IS_SAME_AS;
			case IS_IDENTICAL_TO_VALUE: return IS_IDENTICAL_TO;
			case IS_VARIANT_FORM_OF_VALUE: return IS_VARIANT_FORM_OF;
			case IS_ORIGINAL_FORM_OF_VALUE: return IS_ORIGINAL_FORM_OF;
			case IS_VERSION_OF_VALUE: return IS_VERSION_OF;
			case HAS_VERSION_VALUE: return HAS_VERSION;
			case IS_FORMAT_OF_VALUE: return IS_FORMAT_OF;
			case HAS_FORMAT_VALUE: return HAS_FORMAT;
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
	private RelationshipTypeType(int value, String name, String literal) {
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
	
} //RelationshipTypeType
