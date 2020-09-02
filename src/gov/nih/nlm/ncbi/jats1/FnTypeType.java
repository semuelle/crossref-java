/**
 */
package gov.nih.nlm.ncbi.jats1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fn Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getFnTypeType()
 * @model extendedMetaData="name='fn-type_._type'"
 * @generated
 */
public enum FnTypeType implements Enumerator {
	/**
	 * The '<em><b>Abbr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABBR_VALUE
	 * @generated
	 * @ordered
	 */
	ABBR(0, "abbr", "abbr"),

	/**
	 * The '<em><b>Coi Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COI_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	COI_STATEMENT(1, "coiStatement", "coi-statement"),

	/**
	 * The '<em><b>Com</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COM_VALUE
	 * @generated
	 * @ordered
	 */
	COM(2, "com", "com"),

	/**
	 * The '<em><b>Con</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CON_VALUE
	 * @generated
	 * @ordered
	 */
	CON(3, "con", "con"),

	/**
	 * The '<em><b>Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICT(4, "conflict", "conflict"),

	/**
	 * The '<em><b>Corresp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRESP_VALUE
	 * @generated
	 * @ordered
	 */
	CORRESP(5, "corresp", "corresp"),

	/**
	 * The '<em><b>Current Aff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_AFF_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_AFF(6, "currentAff", "current-aff"),

	/**
	 * The '<em><b>Deceased</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECEASED_VALUE
	 * @generated
	 * @ordered
	 */
	DECEASED(7, "deceased", "deceased"),

	/**
	 * The '<em><b>Edited By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	EDITED_BY(8, "editedBy", "edited-by"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(9, "equal", "equal"),

	/**
	 * The '<em><b>Financial Disclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINANCIAL_DISCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	FINANCIAL_DISCLOSURE(10, "financialDisclosure", "financial-disclosure"),

	/**
	 * The '<em><b>On Leave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_LEAVE_VALUE
	 * @generated
	 * @ordered
	 */
	ON_LEAVE(11, "onLeave", "on-leave"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(12, "other", "other"),

	/**
	 * The '<em><b>Participating Researchers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTICIPATING_RESEARCHERS_VALUE
	 * @generated
	 * @ordered
	 */
	PARTICIPATING_RESEARCHERS(13, "participatingResearchers", "participating-researchers"),

	/**
	 * The '<em><b>Present Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENT_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	PRESENT_ADDRESS(14, "presentAddress", "present-address"),

	/**
	 * The '<em><b>Presented At</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENTED_AT_VALUE
	 * @generated
	 * @ordered
	 */
	PRESENTED_AT(15, "presentedAt", "presented-at"),

	/**
	 * The '<em><b>Presented By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENTED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	PRESENTED_BY(16, "presentedBy", "presented-by"),

	/**
	 * The '<em><b>Previously At</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUSLY_AT_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIOUSLY_AT(17, "previouslyAt", "previously-at"),

	/**
	 * The '<em><b>Study Group Members</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDY_GROUP_MEMBERS_VALUE
	 * @generated
	 * @ordered
	 */
	STUDY_GROUP_MEMBERS(18, "studyGroupMembers", "study-group-members"),

	/**
	 * The '<em><b>Supplementary Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLEMENTARY_MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLEMENTARY_MATERIAL(19, "supplementaryMaterial", "supplementary-material"),

	/**
	 * The '<em><b>Supported By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORTED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORTED_BY(20, "supportedBy", "supported-by");

	/**
	 * The '<em><b>Abbr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABBR
	 * @model name="abbr"
	 * @generated
	 * @ordered
	 */
	public static final int ABBR_VALUE = 0;

	/**
	 * The '<em><b>Coi Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COI_STATEMENT
	 * @model name="coiStatement" literal="coi-statement"
	 * @generated
	 * @ordered
	 */
	public static final int COI_STATEMENT_VALUE = 1;

	/**
	 * The '<em><b>Com</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COM
	 * @model name="com"
	 * @generated
	 * @ordered
	 */
	public static final int COM_VALUE = 2;

	/**
	 * The '<em><b>Con</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CON
	 * @model name="con"
	 * @generated
	 * @ordered
	 */
	public static final int CON_VALUE = 3;

	/**
	 * The '<em><b>Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICT
	 * @model name="conflict"
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICT_VALUE = 4;

	/**
	 * The '<em><b>Corresp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRESP
	 * @model name="corresp"
	 * @generated
	 * @ordered
	 */
	public static final int CORRESP_VALUE = 5;

	/**
	 * The '<em><b>Current Aff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_AFF
	 * @model name="currentAff" literal="current-aff"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_AFF_VALUE = 6;

	/**
	 * The '<em><b>Deceased</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECEASED
	 * @model name="deceased"
	 * @generated
	 * @ordered
	 */
	public static final int DECEASED_VALUE = 7;

	/**
	 * The '<em><b>Edited By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITED_BY
	 * @model name="editedBy" literal="edited-by"
	 * @generated
	 * @ordered
	 */
	public static final int EDITED_BY_VALUE = 8;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 9;

	/**
	 * The '<em><b>Financial Disclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINANCIAL_DISCLOSURE
	 * @model name="financialDisclosure" literal="financial-disclosure"
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_DISCLOSURE_VALUE = 10;

	/**
	 * The '<em><b>On Leave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_LEAVE
	 * @model name="onLeave" literal="on-leave"
	 * @generated
	 * @ordered
	 */
	public static final int ON_LEAVE_VALUE = 11;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 12;

	/**
	 * The '<em><b>Participating Researchers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTICIPATING_RESEARCHERS
	 * @model name="participatingResearchers" literal="participating-researchers"
	 * @generated
	 * @ordered
	 */
	public static final int PARTICIPATING_RESEARCHERS_VALUE = 13;

	/**
	 * The '<em><b>Present Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENT_ADDRESS
	 * @model name="presentAddress" literal="present-address"
	 * @generated
	 * @ordered
	 */
	public static final int PRESENT_ADDRESS_VALUE = 14;

	/**
	 * The '<em><b>Presented At</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENTED_AT
	 * @model name="presentedAt" literal="presented-at"
	 * @generated
	 * @ordered
	 */
	public static final int PRESENTED_AT_VALUE = 15;

	/**
	 * The '<em><b>Presented By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENTED_BY
	 * @model name="presentedBy" literal="presented-by"
	 * @generated
	 * @ordered
	 */
	public static final int PRESENTED_BY_VALUE = 16;

	/**
	 * The '<em><b>Previously At</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUSLY_AT
	 * @model name="previouslyAt" literal="previously-at"
	 * @generated
	 * @ordered
	 */
	public static final int PREVIOUSLY_AT_VALUE = 17;

	/**
	 * The '<em><b>Study Group Members</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDY_GROUP_MEMBERS
	 * @model name="studyGroupMembers" literal="study-group-members"
	 * @generated
	 * @ordered
	 */
	public static final int STUDY_GROUP_MEMBERS_VALUE = 18;

	/**
	 * The '<em><b>Supplementary Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLEMENTARY_MATERIAL
	 * @model name="supplementaryMaterial" literal="supplementary-material"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLEMENTARY_MATERIAL_VALUE = 19;

	/**
	 * The '<em><b>Supported By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORTED_BY
	 * @model name="supportedBy" literal="supported-by"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORTED_BY_VALUE = 20;

	/**
	 * An array of all the '<em><b>Fn Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FnTypeType[] VALUES_ARRAY =
		new FnTypeType[] {
			ABBR,
			COI_STATEMENT,
			COM,
			CON,
			CONFLICT,
			CORRESP,
			CURRENT_AFF,
			DECEASED,
			EDITED_BY,
			EQUAL,
			FINANCIAL_DISCLOSURE,
			ON_LEAVE,
			OTHER,
			PARTICIPATING_RESEARCHERS,
			PRESENT_ADDRESS,
			PRESENTED_AT,
			PRESENTED_BY,
			PREVIOUSLY_AT,
			STUDY_GROUP_MEMBERS,
			SUPPLEMENTARY_MATERIAL,
			SUPPORTED_BY,
		};

	/**
	 * A public read-only list of all the '<em><b>Fn Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FnTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fn Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FnTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FnTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fn Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FnTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FnTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fn Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FnTypeType get(int value) {
		switch (value) {
			case ABBR_VALUE: return ABBR;
			case COI_STATEMENT_VALUE: return COI_STATEMENT;
			case COM_VALUE: return COM;
			case CON_VALUE: return CON;
			case CONFLICT_VALUE: return CONFLICT;
			case CORRESP_VALUE: return CORRESP;
			case CURRENT_AFF_VALUE: return CURRENT_AFF;
			case DECEASED_VALUE: return DECEASED;
			case EDITED_BY_VALUE: return EDITED_BY;
			case EQUAL_VALUE: return EQUAL;
			case FINANCIAL_DISCLOSURE_VALUE: return FINANCIAL_DISCLOSURE;
			case ON_LEAVE_VALUE: return ON_LEAVE;
			case OTHER_VALUE: return OTHER;
			case PARTICIPATING_RESEARCHERS_VALUE: return PARTICIPATING_RESEARCHERS;
			case PRESENT_ADDRESS_VALUE: return PRESENT_ADDRESS;
			case PRESENTED_AT_VALUE: return PRESENTED_AT;
			case PRESENTED_BY_VALUE: return PRESENTED_BY;
			case PREVIOUSLY_AT_VALUE: return PREVIOUSLY_AT;
			case STUDY_GROUP_MEMBERS_VALUE: return STUDY_GROUP_MEMBERS;
			case SUPPLEMENTARY_MATERIAL_VALUE: return SUPPLEMENTARY_MATERIAL;
			case SUPPORTED_BY_VALUE: return SUPPORTED_BY;
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
	private FnTypeType(int value, String name, String literal) {
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
	
} //FnTypeType
