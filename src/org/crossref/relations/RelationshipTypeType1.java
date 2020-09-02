/**
 */
package org.crossref.relations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relationship Type Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.relations.RelationsPackage#getRelationshipTypeType1()
 * @model extendedMetaData="name='relationship-type_._1_._type'"
 * @generated
 */
public enum RelationshipTypeType1 implements Enumerator {
	/**
	 * The '<em><b>Is Derived From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DERIVED_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	IS_DERIVED_FROM(0, "isDerivedFrom", "isDerivedFrom"),

	/**
	 * The '<em><b>Has Derivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_DERIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_DERIVATION(1, "hasDerivation", "hasDerivation"),

	/**
	 * The '<em><b>Is Review Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REVIEW_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_REVIEW_OF(2, "isReviewOf", "isReviewOf"),

	/**
	 * The '<em><b>Has Review</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_REVIEW(3, "hasReview", "hasReview"),

	/**
	 * The '<em><b>Is Comment On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_COMMENT_ON_VALUE
	 * @generated
	 * @ordered
	 */
	IS_COMMENT_ON(4, "isCommentOn", "isCommentOn"),

	/**
	 * The '<em><b>Has Comment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_COMMENT(5, "hasComment", "hasComment"),

	/**
	 * The '<em><b>Is Reply To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REPLY_TO_VALUE
	 * @generated
	 * @ordered
	 */
	IS_REPLY_TO(6, "isReplyTo", "isReplyTo"),

	/**
	 * The '<em><b>Has Reply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_REPLY_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_REPLY(7, "hasReply", "hasReply"),

	/**
	 * The '<em><b>Based On Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASED_ON_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	BASED_ON_DATA(8, "basedOnData", "basedOnData"),

	/**
	 * The '<em><b>Is Data Basis For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DATA_BASIS_FOR_VALUE
	 * @generated
	 * @ordered
	 */
	IS_DATA_BASIS_FOR(9, "isDataBasisFor", "isDataBasisFor"),

	/**
	 * The '<em><b>Has Related Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_RELATED_MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_RELATED_MATERIAL(10, "hasRelatedMaterial", "hasRelatedMaterial"),

	/**
	 * The '<em><b>Is Related Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_RELATED_MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	IS_RELATED_MATERIAL(11, "isRelatedMaterial", "isRelatedMaterial"),

	/**
	 * The '<em><b>Is Compiled By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_COMPILED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_COMPILED_BY(12, "isCompiledBy", "isCompiledBy"),

	/**
	 * The '<em><b>Compiles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPILES_VALUE
	 * @generated
	 * @ordered
	 */
	COMPILES(13, "compiles", "compiles"),

	/**
	 * The '<em><b>Is Documented By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DOCUMENTED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_DOCUMENTED_BY(14, "isDocumentedBy", "isDocumentedBy"),

	/**
	 * The '<em><b>Documents</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTS(15, "documents", "documents"),

	/**
	 * The '<em><b>Is Supplement To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SUPPLEMENT_TO_VALUE
	 * @generated
	 * @ordered
	 */
	IS_SUPPLEMENT_TO(16, "isSupplementTo", "isSupplementTo"),

	/**
	 * The '<em><b>Is Supplemented By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SUPPLEMENTED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_SUPPLEMENTED_BY(17, "isSupplementedBy", "isSupplementedBy"),

	/**
	 * The '<em><b>Is Continued By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_CONTINUED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_CONTINUED_BY(18, "isContinuedBy", "isContinuedBy"),

	/**
	 * The '<em><b>Continues</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUES_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUES(19, "continues", "continues"),

	/**
	 * The '<em><b>Is Part Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PART_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_PART_OF(20, "isPartOf", "isPartOf"),

	/**
	 * The '<em><b>Has Part</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_PART_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_PART(21, "hasPart", "hasPart"),

	/**
	 * The '<em><b>References</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCES_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCES(22, "references", "references"),

	/**
	 * The '<em><b>Is Referenced By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REFERENCED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_REFERENCED_BY(23, "isReferencedBy", "isReferencedBy"),

	/**
	 * The '<em><b>Is Based On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_BASED_ON_VALUE
	 * @generated
	 * @ordered
	 */
	IS_BASED_ON(24, "isBasedOn", "isBasedOn"),

	/**
	 * The '<em><b>Is Basis For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_BASIS_FOR_VALUE
	 * @generated
	 * @ordered
	 */
	IS_BASIS_FOR(25, "isBasisFor", "isBasisFor"),

	/**
	 * The '<em><b>Requires</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRES_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRES(26, "requires", "requires"),

	/**
	 * The '<em><b>Is Required By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REQUIRED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_REQUIRED_BY(27, "isRequiredBy", "isRequiredBy"),

	/**
	 * The '<em><b>Finances</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINANCES_VALUE
	 * @generated
	 * @ordered
	 */
	FINANCES(28, "finances", "finances"),

	/**
	 * The '<em><b>Is Financed By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_FINANCED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_FINANCED_BY(29, "isFinancedBy", "isFinancedBy");

	/**
	 * The '<em><b>Is Derived From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DERIVED_FROM
	 * @model name="isDerivedFrom"
	 * @generated
	 * @ordered
	 */
	public static final int IS_DERIVED_FROM_VALUE = 0;

	/**
	 * The '<em><b>Has Derivation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_DERIVATION
	 * @model name="hasDerivation"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_DERIVATION_VALUE = 1;

	/**
	 * The '<em><b>Is Review Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REVIEW_OF
	 * @model name="isReviewOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_REVIEW_OF_VALUE = 2;

	/**
	 * The '<em><b>Has Review</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_REVIEW
	 * @model name="hasReview"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_REVIEW_VALUE = 3;

	/**
	 * The '<em><b>Is Comment On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_COMMENT_ON
	 * @model name="isCommentOn"
	 * @generated
	 * @ordered
	 */
	public static final int IS_COMMENT_ON_VALUE = 4;

	/**
	 * The '<em><b>Has Comment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_COMMENT
	 * @model name="hasComment"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_COMMENT_VALUE = 5;

	/**
	 * The '<em><b>Is Reply To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REPLY_TO
	 * @model name="isReplyTo"
	 * @generated
	 * @ordered
	 */
	public static final int IS_REPLY_TO_VALUE = 6;

	/**
	 * The '<em><b>Has Reply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_REPLY
	 * @model name="hasReply"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_REPLY_VALUE = 7;

	/**
	 * The '<em><b>Based On Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASED_ON_DATA
	 * @model name="basedOnData"
	 * @generated
	 * @ordered
	 */
	public static final int BASED_ON_DATA_VALUE = 8;

	/**
	 * The '<em><b>Is Data Basis For</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DATA_BASIS_FOR
	 * @model name="isDataBasisFor"
	 * @generated
	 * @ordered
	 */
	public static final int IS_DATA_BASIS_FOR_VALUE = 9;

	/**
	 * The '<em><b>Has Related Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_RELATED_MATERIAL
	 * @model name="hasRelatedMaterial"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_RELATED_MATERIAL_VALUE = 10;

	/**
	 * The '<em><b>Is Related Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_RELATED_MATERIAL
	 * @model name="isRelatedMaterial"
	 * @generated
	 * @ordered
	 */
	public static final int IS_RELATED_MATERIAL_VALUE = 11;

	/**
	 * The '<em><b>Is Compiled By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_COMPILED_BY
	 * @model name="isCompiledBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_COMPILED_BY_VALUE = 12;

	/**
	 * The '<em><b>Compiles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPILES
	 * @model name="compiles"
	 * @generated
	 * @ordered
	 */
	public static final int COMPILES_VALUE = 13;

	/**
	 * The '<em><b>Is Documented By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DOCUMENTED_BY
	 * @model name="isDocumentedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_DOCUMENTED_BY_VALUE = 14;

	/**
	 * The '<em><b>Documents</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTS
	 * @model name="documents"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTS_VALUE = 15;

	/**
	 * The '<em><b>Is Supplement To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SUPPLEMENT_TO
	 * @model name="isSupplementTo"
	 * @generated
	 * @ordered
	 */
	public static final int IS_SUPPLEMENT_TO_VALUE = 16;

	/**
	 * The '<em><b>Is Supplemented By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SUPPLEMENTED_BY
	 * @model name="isSupplementedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_SUPPLEMENTED_BY_VALUE = 17;

	/**
	 * The '<em><b>Is Continued By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_CONTINUED_BY
	 * @model name="isContinuedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_CONTINUED_BY_VALUE = 18;

	/**
	 * The '<em><b>Continues</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUES
	 * @model name="continues"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUES_VALUE = 19;

	/**
	 * The '<em><b>Is Part Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PART_OF
	 * @model name="isPartOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_PART_OF_VALUE = 20;

	/**
	 * The '<em><b>Has Part</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_PART
	 * @model name="hasPart"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_PART_VALUE = 21;

	/**
	 * The '<em><b>References</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCES
	 * @model name="references"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCES_VALUE = 22;

	/**
	 * The '<em><b>Is Referenced By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REFERENCED_BY
	 * @model name="isReferencedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_REFERENCED_BY_VALUE = 23;

	/**
	 * The '<em><b>Is Based On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_BASED_ON
	 * @model name="isBasedOn"
	 * @generated
	 * @ordered
	 */
	public static final int IS_BASED_ON_VALUE = 24;

	/**
	 * The '<em><b>Is Basis For</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_BASIS_FOR
	 * @model name="isBasisFor"
	 * @generated
	 * @ordered
	 */
	public static final int IS_BASIS_FOR_VALUE = 25;

	/**
	 * The '<em><b>Requires</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRES
	 * @model name="requires"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRES_VALUE = 26;

	/**
	 * The '<em><b>Is Required By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REQUIRED_BY
	 * @model name="isRequiredBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_REQUIRED_BY_VALUE = 27;

	/**
	 * The '<em><b>Finances</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINANCES
	 * @model name="finances"
	 * @generated
	 * @ordered
	 */
	public static final int FINANCES_VALUE = 28;

	/**
	 * The '<em><b>Is Financed By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_FINANCED_BY
	 * @model name="isFinancedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_FINANCED_BY_VALUE = 29;

	/**
	 * An array of all the '<em><b>Relationship Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationshipTypeType1[] VALUES_ARRAY =
		new RelationshipTypeType1[] {
			IS_DERIVED_FROM,
			HAS_DERIVATION,
			IS_REVIEW_OF,
			HAS_REVIEW,
			IS_COMMENT_ON,
			HAS_COMMENT,
			IS_REPLY_TO,
			HAS_REPLY,
			BASED_ON_DATA,
			IS_DATA_BASIS_FOR,
			HAS_RELATED_MATERIAL,
			IS_RELATED_MATERIAL,
			IS_COMPILED_BY,
			COMPILES,
			IS_DOCUMENTED_BY,
			DOCUMENTS,
			IS_SUPPLEMENT_TO,
			IS_SUPPLEMENTED_BY,
			IS_CONTINUED_BY,
			CONTINUES,
			IS_PART_OF,
			HAS_PART,
			REFERENCES,
			IS_REFERENCED_BY,
			IS_BASED_ON,
			IS_BASIS_FOR,
			REQUIRES,
			IS_REQUIRED_BY,
			FINANCES,
			IS_FINANCED_BY,
		};

	/**
	 * A public read-only list of all the '<em><b>Relationship Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationshipTypeType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relationship Type Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipTypeType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipTypeType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipTypeType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipTypeType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipTypeType1 get(int value) {
		switch (value) {
			case IS_DERIVED_FROM_VALUE: return IS_DERIVED_FROM;
			case HAS_DERIVATION_VALUE: return HAS_DERIVATION;
			case IS_REVIEW_OF_VALUE: return IS_REVIEW_OF;
			case HAS_REVIEW_VALUE: return HAS_REVIEW;
			case IS_COMMENT_ON_VALUE: return IS_COMMENT_ON;
			case HAS_COMMENT_VALUE: return HAS_COMMENT;
			case IS_REPLY_TO_VALUE: return IS_REPLY_TO;
			case HAS_REPLY_VALUE: return HAS_REPLY;
			case BASED_ON_DATA_VALUE: return BASED_ON_DATA;
			case IS_DATA_BASIS_FOR_VALUE: return IS_DATA_BASIS_FOR;
			case HAS_RELATED_MATERIAL_VALUE: return HAS_RELATED_MATERIAL;
			case IS_RELATED_MATERIAL_VALUE: return IS_RELATED_MATERIAL;
			case IS_COMPILED_BY_VALUE: return IS_COMPILED_BY;
			case COMPILES_VALUE: return COMPILES;
			case IS_DOCUMENTED_BY_VALUE: return IS_DOCUMENTED_BY;
			case DOCUMENTS_VALUE: return DOCUMENTS;
			case IS_SUPPLEMENT_TO_VALUE: return IS_SUPPLEMENT_TO;
			case IS_SUPPLEMENTED_BY_VALUE: return IS_SUPPLEMENTED_BY;
			case IS_CONTINUED_BY_VALUE: return IS_CONTINUED_BY;
			case CONTINUES_VALUE: return CONTINUES;
			case IS_PART_OF_VALUE: return IS_PART_OF;
			case HAS_PART_VALUE: return HAS_PART;
			case REFERENCES_VALUE: return REFERENCES;
			case IS_REFERENCED_BY_VALUE: return IS_REFERENCED_BY;
			case IS_BASED_ON_VALUE: return IS_BASED_ON;
			case IS_BASIS_FOR_VALUE: return IS_BASIS_FOR;
			case REQUIRES_VALUE: return REQUIRES;
			case IS_REQUIRED_BY_VALUE: return IS_REQUIRED_BY;
			case FINANCES_VALUE: return FINANCES;
			case IS_FINANCED_BY_VALUE: return IS_FINANCED_BY;
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
	private RelationshipTypeType1(int value, String name, String literal) {
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
	
} //RelationshipTypeType1
