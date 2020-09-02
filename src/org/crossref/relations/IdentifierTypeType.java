/**
 */
package org.crossref.relations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Identifier Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.relations.RelationsPackage#getIdentifierTypeType()
 * @model extendedMetaData="name='identifier-type_._type'"
 * @generated
 */
public enum IdentifierTypeType implements Enumerator {
	/**
	 * The '<em><b>Doi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOI_VALUE
	 * @generated
	 * @ordered
	 */
	DOI(0, "doi", "doi"),

	/**
	 * The '<em><b>Issn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSN_VALUE
	 * @generated
	 * @ordered
	 */
	ISSN(1, "issn", "issn"),

	/**
	 * The '<em><b>Isbn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISBN_VALUE
	 * @generated
	 * @ordered
	 */
	ISBN(2, "isbn", "isbn"),

	/**
	 * The '<em><b>Uri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URI_VALUE
	 * @generated
	 * @ordered
	 */
	URI(3, "uri", "uri"),

	/**
	 * The '<em><b>Pmid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMID_VALUE
	 * @generated
	 * @ordered
	 */
	PMID(4, "pmid", "pmid"),

	/**
	 * The '<em><b>Pmcid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMCID_VALUE
	 * @generated
	 * @ordered
	 */
	PMCID(5, "pmcid", "pmcid"),

	/**
	 * The '<em><b>Purl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURL_VALUE
	 * @generated
	 * @ordered
	 */
	PURL(6, "purl", "purl"),

	/**
	 * The '<em><b>Arxiv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARXIV_VALUE
	 * @generated
	 * @ordered
	 */
	ARXIV(7, "arxiv", "arxiv"),

	/**
	 * The '<em><b>Ark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARK_VALUE
	 * @generated
	 * @ordered
	 */
	ARK(8, "ark", "ark"),

	/**
	 * The '<em><b>Handle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDLE_VALUE
	 * @generated
	 * @ordered
	 */
	HANDLE(9, "handle", "handle"),

	/**
	 * The '<em><b>Uuid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUID_VALUE
	 * @generated
	 * @ordered
	 */
	UUID(10, "uuid", "uuid"),

	/**
	 * The '<em><b>Ecli</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECLI_VALUE
	 * @generated
	 * @ordered
	 */
	ECLI(11, "ecli", "ecli"),

	/**
	 * The '<em><b>Accession</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSION_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESSION(12, "accession", "accession"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(13, "other", "other");

	/**
	 * The '<em><b>Doi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOI
	 * @model name="doi"
	 * @generated
	 * @ordered
	 */
	public static final int DOI_VALUE = 0;

	/**
	 * The '<em><b>Issn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSN
	 * @model name="issn"
	 * @generated
	 * @ordered
	 */
	public static final int ISSN_VALUE = 1;

	/**
	 * The '<em><b>Isbn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISBN
	 * @model name="isbn"
	 * @generated
	 * @ordered
	 */
	public static final int ISBN_VALUE = 2;

	/**
	 * The '<em><b>Uri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URI
	 * @model name="uri"
	 * @generated
	 * @ordered
	 */
	public static final int URI_VALUE = 3;

	/**
	 * The '<em><b>Pmid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMID
	 * @model name="pmid"
	 * @generated
	 * @ordered
	 */
	public static final int PMID_VALUE = 4;

	/**
	 * The '<em><b>Pmcid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMCID
	 * @model name="pmcid"
	 * @generated
	 * @ordered
	 */
	public static final int PMCID_VALUE = 5;

	/**
	 * The '<em><b>Purl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURL
	 * @model name="purl"
	 * @generated
	 * @ordered
	 */
	public static final int PURL_VALUE = 6;

	/**
	 * The '<em><b>Arxiv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARXIV
	 * @model name="arxiv"
	 * @generated
	 * @ordered
	 */
	public static final int ARXIV_VALUE = 7;

	/**
	 * The '<em><b>Ark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARK
	 * @model name="ark"
	 * @generated
	 * @ordered
	 */
	public static final int ARK_VALUE = 8;

	/**
	 * The '<em><b>Handle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDLE
	 * @model name="handle"
	 * @generated
	 * @ordered
	 */
	public static final int HANDLE_VALUE = 9;

	/**
	 * The '<em><b>Uuid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUID
	 * @model name="uuid"
	 * @generated
	 * @ordered
	 */
	public static final int UUID_VALUE = 10;

	/**
	 * The '<em><b>Ecli</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECLI
	 * @model name="ecli"
	 * @generated
	 * @ordered
	 */
	public static final int ECLI_VALUE = 11;

	/**
	 * The '<em><b>Accession</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSION
	 * @model name="accession"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESSION_VALUE = 12;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 13;

	/**
	 * An array of all the '<em><b>Identifier Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdentifierTypeType[] VALUES_ARRAY =
		new IdentifierTypeType[] {
			DOI,
			ISSN,
			ISBN,
			URI,
			PMID,
			PMCID,
			PURL,
			ARXIV,
			ARK,
			HANDLE,
			UUID,
			ECLI,
			ACCESSION,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Identifier Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdentifierTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Identifier Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifierTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifier Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifierTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifier Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierTypeType get(int value) {
		switch (value) {
			case DOI_VALUE: return DOI;
			case ISSN_VALUE: return ISSN;
			case ISBN_VALUE: return ISBN;
			case URI_VALUE: return URI;
			case PMID_VALUE: return PMID;
			case PMCID_VALUE: return PMCID;
			case PURL_VALUE: return PURL;
			case ARXIV_VALUE: return ARXIV;
			case ARK_VALUE: return ARK;
			case HANDLE_VALUE: return HANDLE;
			case UUID_VALUE: return UUID;
			case ECLI_VALUE: return ECLI;
			case ACCESSION_VALUE: return ACCESSION;
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
	private IdentifierTypeType(int value, String name, String literal) {
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
	
} //IdentifierTypeType
