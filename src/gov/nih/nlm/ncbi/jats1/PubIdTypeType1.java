/**
 */
package gov.nih.nlm.ncbi.jats1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pub Id Type Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPubIdTypeType1()
 * @model extendedMetaData="name='pub-id-type_._type'"
 * @generated
 */
public enum PubIdTypeType1 implements Enumerator {
	/**
	 * The '<em><b>Accession</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSION_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESSION(0, "accession", "accession"),

	/**
	 * The '<em><b>Archive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIVE(1, "archive", "archive"),

	/**
	 * The '<em><b>Ark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARK_VALUE
	 * @generated
	 * @ordered
	 */
	ARK(2, "ark", "ark"),

	/**
	 * The '<em><b>Art Access Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ART_ACCESS_ID_VALUE
	 * @generated
	 * @ordered
	 */
	ART_ACCESS_ID(3, "artAccessId", "art-access-id"),

	/**
	 * The '<em><b>Arxiv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARXIV_VALUE
	 * @generated
	 * @ordered
	 */
	ARXIV(4, "arxiv", "arxiv"),

	/**
	 * The '<em><b>Coden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODEN_VALUE
	 * @generated
	 * @ordered
	 */
	CODEN(5, "coden", "coden"),

	/**
	 * The '<em><b>Doaj</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOAJ_VALUE
	 * @generated
	 * @ordered
	 */
	DOAJ(6, "doaj", "doaj"),

	/**
	 * The '<em><b>Doi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOI_VALUE
	 * @generated
	 * @ordered
	 */
	DOI(7, "doi", "doi"),

	/**
	 * The '<em><b>Handle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDLE_VALUE
	 * @generated
	 * @ordered
	 */
	HANDLE(8, "handle", "handle"),

	/**
	 * The '<em><b>Index</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEX_VALUE
	 * @generated
	 * @ordered
	 */
	INDEX(9, "index", "index"),

	/**
	 * The '<em><b>Isbn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISBN_VALUE
	 * @generated
	 * @ordered
	 */
	ISBN(10, "isbn", "isbn"),

	/**
	 * The '<em><b>Manuscript</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUSCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	MANUSCRIPT(11, "manuscript", "manuscript"),

	/**
	 * The '<em><b>Medline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDLINE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDLINE(12, "medline", "medline"),

	/**
	 * The '<em><b>Mr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR_VALUE
	 * @generated
	 * @ordered
	 */
	MR(13, "mr", "mr"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(14, "other", "other"),

	/**
	 * The '<em><b>Pii</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PII_VALUE
	 * @generated
	 * @ordered
	 */
	PII(15, "pii", "pii"),

	/**
	 * The '<em><b>Pmcid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMCID_VALUE
	 * @generated
	 * @ordered
	 */
	PMCID(16, "pmcid", "pmcid"),

	/**
	 * The '<em><b>Pmid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMID_VALUE
	 * @generated
	 * @ordered
	 */
	PMID(17, "pmid", "pmid"),

	/**
	 * The '<em><b>Publisher Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISHER_ID_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISHER_ID(18, "publisherId", "publisher-id"),

	/**
	 * The '<em><b>Sici</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SICI_VALUE
	 * @generated
	 * @ordered
	 */
	SICI(19, "sici", "sici"),

	/**
	 * The '<em><b>Std Designation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STD_DESIGNATION_VALUE
	 * @generated
	 * @ordered
	 */
	STD_DESIGNATION(20, "stdDesignation", "std-designation"),

	/**
	 * The '<em><b>Zbl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZBL_VALUE
	 * @generated
	 * @ordered
	 */
	ZBL(21, "zbl", "zbl");

	/**
	 * The '<em><b>Accession</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSION
	 * @model name="accession"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESSION_VALUE = 0;

	/**
	 * The '<em><b>Archive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVE
	 * @model name="archive"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIVE_VALUE = 1;

	/**
	 * The '<em><b>Ark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARK
	 * @model name="ark"
	 * @generated
	 * @ordered
	 */
	public static final int ARK_VALUE = 2;

	/**
	 * The '<em><b>Art Access Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ART_ACCESS_ID
	 * @model name="artAccessId" literal="art-access-id"
	 * @generated
	 * @ordered
	 */
	public static final int ART_ACCESS_ID_VALUE = 3;

	/**
	 * The '<em><b>Arxiv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARXIV
	 * @model name="arxiv"
	 * @generated
	 * @ordered
	 */
	public static final int ARXIV_VALUE = 4;

	/**
	 * The '<em><b>Coden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODEN
	 * @model name="coden"
	 * @generated
	 * @ordered
	 */
	public static final int CODEN_VALUE = 5;

	/**
	 * The '<em><b>Doaj</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOAJ
	 * @model name="doaj"
	 * @generated
	 * @ordered
	 */
	public static final int DOAJ_VALUE = 6;

	/**
	 * The '<em><b>Doi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOI
	 * @model name="doi"
	 * @generated
	 * @ordered
	 */
	public static final int DOI_VALUE = 7;

	/**
	 * The '<em><b>Handle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDLE
	 * @model name="handle"
	 * @generated
	 * @ordered
	 */
	public static final int HANDLE_VALUE = 8;

	/**
	 * The '<em><b>Index</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEX
	 * @model name="index"
	 * @generated
	 * @ordered
	 */
	public static final int INDEX_VALUE = 9;

	/**
	 * The '<em><b>Isbn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISBN
	 * @model name="isbn"
	 * @generated
	 * @ordered
	 */
	public static final int ISBN_VALUE = 10;

	/**
	 * The '<em><b>Manuscript</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUSCRIPT
	 * @model name="manuscript"
	 * @generated
	 * @ordered
	 */
	public static final int MANUSCRIPT_VALUE = 11;

	/**
	 * The '<em><b>Medline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDLINE
	 * @model name="medline"
	 * @generated
	 * @ordered
	 */
	public static final int MEDLINE_VALUE = 12;

	/**
	 * The '<em><b>Mr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR
	 * @model name="mr"
	 * @generated
	 * @ordered
	 */
	public static final int MR_VALUE = 13;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 14;

	/**
	 * The '<em><b>Pii</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PII
	 * @model name="pii"
	 * @generated
	 * @ordered
	 */
	public static final int PII_VALUE = 15;

	/**
	 * The '<em><b>Pmcid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMCID
	 * @model name="pmcid"
	 * @generated
	 * @ordered
	 */
	public static final int PMCID_VALUE = 16;

	/**
	 * The '<em><b>Pmid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMID
	 * @model name="pmid"
	 * @generated
	 * @ordered
	 */
	public static final int PMID_VALUE = 17;

	/**
	 * The '<em><b>Publisher Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISHER_ID
	 * @model name="publisherId" literal="publisher-id"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISHER_ID_VALUE = 18;

	/**
	 * The '<em><b>Sici</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SICI
	 * @model name="sici"
	 * @generated
	 * @ordered
	 */
	public static final int SICI_VALUE = 19;

	/**
	 * The '<em><b>Std Designation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STD_DESIGNATION
	 * @model name="stdDesignation" literal="std-designation"
	 * @generated
	 * @ordered
	 */
	public static final int STD_DESIGNATION_VALUE = 20;

	/**
	 * The '<em><b>Zbl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZBL
	 * @model name="zbl"
	 * @generated
	 * @ordered
	 */
	public static final int ZBL_VALUE = 21;

	/**
	 * An array of all the '<em><b>Pub Id Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PubIdTypeType1[] VALUES_ARRAY =
		new PubIdTypeType1[] {
			ACCESSION,
			ARCHIVE,
			ARK,
			ART_ACCESS_ID,
			ARXIV,
			CODEN,
			DOAJ,
			DOI,
			HANDLE,
			INDEX,
			ISBN,
			MANUSCRIPT,
			MEDLINE,
			MR,
			OTHER,
			PII,
			PMCID,
			PMID,
			PUBLISHER_ID,
			SICI,
			STD_DESIGNATION,
			ZBL,
		};

	/**
	 * A public read-only list of all the '<em><b>Pub Id Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PubIdTypeType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pub Id Type Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubIdTypeType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PubIdTypeType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pub Id Type Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubIdTypeType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PubIdTypeType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pub Id Type Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubIdTypeType1 get(int value) {
		switch (value) {
			case ACCESSION_VALUE: return ACCESSION;
			case ARCHIVE_VALUE: return ARCHIVE;
			case ARK_VALUE: return ARK;
			case ART_ACCESS_ID_VALUE: return ART_ACCESS_ID;
			case ARXIV_VALUE: return ARXIV;
			case CODEN_VALUE: return CODEN;
			case DOAJ_VALUE: return DOAJ;
			case DOI_VALUE: return DOI;
			case HANDLE_VALUE: return HANDLE;
			case INDEX_VALUE: return INDEX;
			case ISBN_VALUE: return ISBN;
			case MANUSCRIPT_VALUE: return MANUSCRIPT;
			case MEDLINE_VALUE: return MEDLINE;
			case MR_VALUE: return MR;
			case OTHER_VALUE: return OTHER;
			case PII_VALUE: return PII;
			case PMCID_VALUE: return PMCID;
			case PMID_VALUE: return PMID;
			case PUBLISHER_ID_VALUE: return PUBLISHER_ID;
			case SICI_VALUE: return SICI;
			case STD_DESIGNATION_VALUE: return STD_DESIGNATION;
			case ZBL_VALUE: return ZBL;
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
	private PubIdTypeType1(int value, String name, String literal) {
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
	
} //PubIdTypeType1
