/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.PublicationType#getFullTitle <em>Full Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PublicationType#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PublicationType#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PublicationType#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PublicationType#getIssn1 <em>Issn1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PublicationType#getIsbn1 <em>Isbn1</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getPublicationType()
 * @model extendedMetaData="name='publication_._type' kind='elementOnly'"
 * @generated
 */
public interface PublicationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full title by which a journal is commonly known or cited.
	 * 				full_title and abbrev_title must both be submitted even if they are identical. Note:
	 * 				In version 4.1.0 and later, this element is allowed up to 10 times to allow for a)
	 * 				journal name changes over time, b) translated journal names (e.g. the Japanese name
	 * 				and the English equivalent), and c) common author mis-spellings of a given journal
	 * 				name. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Title</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getPublicationType_FullTitle()
	 * @model unique="false" dataType="org.crossref.schema._4._4.FullTitleType" required="true" upper="10"
	 *        extendedMetaData="kind='element' name='full_title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFullTitle();

	/**
	 * Returns the value of the '<em><b>Issn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ISSN assigned to an entity. The ISSN must consist of eight digits
	 * 				(where the last digit may be an X), or it must consist of eight digits in two groups
	 * 				of four with a hyphen between the two groups. Spaces or other delimiters should not
	 * 				be included in an ISSN. For more information, please see
	 * 				http://www.issn.org:8080/English/pub/getting- checking/checking or
	 * 				http://www.issn.org. The text "ISSN" should not be included in the issn element in
	 * 				Crossref submissions. Crossref validates all ISSNs supplied in deposits, only valid
	 * 				ISSNs will be accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issn</em>' containment reference.
	 * @see #setIssn(IssnType)
	 * @see org.crossref.schema._4._4._4Package#getPublicationType_Issn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issn' namespace='##targetNamespace'"
	 * @generated
	 */
	IssnType getIssn();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PublicationType#getIssn <em>Issn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issn</em>' containment reference.
	 * @see #getIssn()
	 * @generated
	 */
	void setIssn(IssnType value);

	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ISBN assigned to an entity. If a multi-volume work has one ISBN
	 * 				per volume and a unique ISBN for the series, all may be registered. The ISBN for the
	 * 				series must be in series_metadata, and the ISBN for each volume in
	 * 				proceedings_metadata, or book_metadata, respectively. The text "ISBN" should not be
	 * 				included in the ISBN element in Crossref submissions. Although not required, the
	 * 				ISBN number should retain spaces or hyphens that appear in the formatted number
	 * 				because they aid in human-readability. For more information, please see
	 * 				http://www.isbn.org/standards/home/isbn/international/hyphenation- instructions.asp
	 * 				or http://www.isbn.org.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isbn</em>' containment reference.
	 * @see #setIsbn(IsbnType)
	 * @see org.crossref.schema._4._4._4Package#getPublicationType_Isbn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isbn' namespace='##targetNamespace'"
	 * @generated
	 */
	IsbnType getIsbn();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PublicationType#getIsbn <em>Isbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isbn</em>' containment reference.
	 * @see #getIsbn()
	 * @generated
	 */
	void setIsbn(IsbnType value);

	/**
	 * Returns the value of the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DOI for an entity being registered with Crossref. In 2008 Crossref
	 * 				restricted DOI suffix characters to the following: "a-z", "A-Z", "0-9" and "-._;()/"
	 * 				Existing DOIs with suffix characters outside of the allowed set are still supported.
	 * 				For additional information on DOI syntax, see
	 * 				https://support.crossref.org/hc/en-us/articles/214669823
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi</em>' attribute.
	 * @see #setDoi(String)
	 * @see org.crossref.schema._4._4._4Package#getPublicationType_Doi()
	 * @model dataType="org.crossref.schema._4._4.DoiType"
	 *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDoi();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PublicationType#getDoi <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi</em>' attribute.
	 * @see #getDoi()
	 * @generated
	 */
	void setDoi(String value);

	/**
	 * Returns the value of the '<em><b>Issn1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ISSN assigned to an entity. The ISSN must consist of eight digits
	 * 				(where the last digit may be an X), or it must consist of eight digits in two groups
	 * 				of four with a hyphen between the two groups. Spaces or other delimiters should not
	 * 				be included in an ISSN. For more information, please see
	 * 				http://www.issn.org:8080/English/pub/getting- checking/checking or
	 * 				http://www.issn.org. The text "ISSN" should not be included in the issn element in
	 * 				Crossref submissions. Crossref validates all ISSNs supplied in deposits, only valid
	 * 				ISSNs will be accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issn1</em>' containment reference.
	 * @see #setIssn1(IssnType)
	 * @see org.crossref.schema._4._4._4Package#getPublicationType_Issn1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issn' namespace='##targetNamespace'"
	 * @generated
	 */
	IssnType getIssn1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PublicationType#getIssn1 <em>Issn1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issn1</em>' containment reference.
	 * @see #getIssn1()
	 * @generated
	 */
	void setIssn1(IssnType value);

	/**
	 * Returns the value of the '<em><b>Isbn1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ISBN assigned to an entity. If a multi-volume work has one ISBN
	 * 				per volume and a unique ISBN for the series, all may be registered. The ISBN for the
	 * 				series must be in series_metadata, and the ISBN for each volume in
	 * 				proceedings_metadata, or book_metadata, respectively. The text "ISBN" should not be
	 * 				included in the ISBN element in Crossref submissions. Although not required, the
	 * 				ISBN number should retain spaces or hyphens that appear in the formatted number
	 * 				because they aid in human-readability. For more information, please see
	 * 				http://www.isbn.org/standards/home/isbn/international/hyphenation- instructions.asp
	 * 				or http://www.isbn.org.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isbn1</em>' containment reference.
	 * @see #setIsbn1(IsbnType)
	 * @see org.crossref.schema._4._4._4Package#getPublicationType_Isbn1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isbn' namespace='##targetNamespace'"
	 * @generated
	 */
	IsbnType getIsbn1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PublicationType#getIsbn1 <em>Isbn1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isbn1</em>' containment reference.
	 * @see #getIsbn1()
	 * @generated
	 */
	void setIsbn1(IsbnType value);

} // PublicationType
