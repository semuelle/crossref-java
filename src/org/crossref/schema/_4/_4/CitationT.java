/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getIssn <em>Issn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getJournalTitle <em>Journal Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getFirstPage <em>First Page</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getCYear <em>CYear</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getSeriesTitle <em>Series Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getVolumeTitle <em>Volume Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getEditionNumber <em>Edition Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getComponentNumber <em>Component Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getStdDesignator <em>Std Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getStandardsBody <em>Standards Body</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CitationT#getUnstructuredCitation <em>Unstructured Citation</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getCitationT()
 * @model extendedMetaData="name='citation_t' kind='elementOnly'"
 * @generated
 */
public interface CitationT extends EObject {
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
	 * @see org.crossref.schema._4._4._4Package#getCitationT_Issn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issn' namespace='##targetNamespace'"
	 * @generated
	 */
	IssnType getIssn();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getIssn <em>Issn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issn</em>' containment reference.
	 * @see #getIssn()
	 * @generated
	 */
	void setIssn(IssnType value);

	/**
	 * Returns the value of the '<em><b>Journal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   Journal title in a citation. Only used in the citation element.
	 * 				Journal title in citation deposits is used for both abbreviated and spelled out
	 * 				journal names. No attribute is required to distinguish between name types. Both
	 * 					
	 *   <journal_title>Proc. Natl. Acad. Sci. U.S.A.</journal_title>
	 *    and
	 * 					
	 *   <journal_title>Proceedings of the National Academy of Sciences of the United
	 * 					States of America</journal_title>
	 *    are valid journal titles to use in this
	 * 				element.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Title</em>' attribute.
	 * @see #setJournalTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_JournalTitle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='journal_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJournalTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getJournalTitle <em>Journal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Title</em>' attribute.
	 * @see #getJournalTitle()
	 * @generated
	 */
	void setJournalTitle(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   First author in a citation. Only used in the citation element. The
	 * 				author element tags one author name in a citation without the hierarchy required by
	 * 				the contributors or person_name elements Only the first author should be deposited
	 * 				for each item. The author surname is required. Author initials may be added but are
	 * 				not recommended because queries work best when only the last name is provided. For
	 * 				example, the author "John Doe" can be deposited as 
	 *   <author>Doe</author>
	 *    or
	 * 					
	 *   <author>Doe J</author>
	 *   , but the former style is recommended. If the author of a
	 * 				work is an organization rather than a person, the organization may be deposited as
	 * 				in: 
	 *   <author>World Health Organization</author>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The volume number of a published journal, or the number of a printed
	 * 				volume for a book or conference proceedings. A journal volume is contained in the
	 * 				journal_volume element to allow for the assignment of a DOI to an entire journal
	 * 				volume. Do not include the words "Volume" or "vol." in this element. Data may be
	 * 				alpha, numeric or a combination. Roman numerals are acceptable. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_Volume()
	 * @model dataType="org.crossref.schema._4._4.VolumeType"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVolume();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(String value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The issue number in which an article is published. Only one issue
	 * 				name should be used for the issue. The issue number takes precedence over any other
	 * 				name. For example, if an issue has only a seasonal name, then the season should be
	 * 				listed in issue. However, if an issue has a number and a season, then only the
	 * 				number should be listed in issue, and the season should be placed in month (see the
	 * 				table in month, below, for proper encoding of the season) if the specific month of
	 * 				publication is not known. Do not include the words "issue", "No" or "number" in this
	 * 				element. When submitting DOIs for journal articles published online ahead of print,
	 * 				you should submit the issue number, when known, even if the pagination information
	 * 				for the entity is not yet known. Data may be alpha, numeric or a combination.
	 * 				Examples: 74(3):1999 
	 *   <journal_issue>
	 *     					
	 *     <publication_date media_type="print">
	 *       						
	 *       <year>1999</year>
	 *       					
	 *     </publication_date>
	 *     					
	 *     <journal_volume>
	 *       						
	 *       <volume>74</volume>
	 *       					
	 *     </journal_volume>
	 *     					
	 *     <issue>3</issue>
	 *     				
	 *   </journal_issue>
	 *    Volume 74, Spring 1999 
	 *   <journal_issue>
	 *     					
	 *     <publication_date media_type="print">
	 *       						
	 *       <year>1999</year>
	 *       					
	 *     </publication_date>
	 *     					
	 *     <journal_volume>
	 *       						
	 *       <volume>74</volume>
	 *       					
	 *     </journal_volume>
	 *     					
	 *     <issue>Spring</issue>
	 *     				
	 *   </journal_issue>
	 *    Volume 74, issue 3 Spring 1999 
	 *   <journal_issue>
	 *     					
	 *     <publication_date media_type="print">
	 *       						
	 *       <month>21</month>
	 *       						
	 *       <year>1999</year>
	 *       					
	 *     </publication_date>
	 *     					
	 *     <journal_volume>
	 *       						
	 *       <volume>74</volume>
	 *       					
	 *     </journal_volume>
	 *     					
	 *     <issue>3</issue>
	 *     				
	 *   </journal_issue>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue</em>' attribute.
	 * @see #setIssue(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_Issue()
	 * @model dataType="org.crossref.schema._4._4.IssueType"
	 *        extendedMetaData="kind='element' name='issue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIssue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(String value);

	/**
	 * Returns the value of the '<em><b>First Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First page number where an entity is located. Data may be alpha,
	 * 				numeric or a combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Page</em>' attribute.
	 * @see #setFirstPage(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_FirstPage()
	 * @model dataType="org.crossref.schema._4._4.FirstPageType"
	 *        extendedMetaData="kind='element' name='first_page' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstPage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getFirstPage <em>First Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page</em>' attribute.
	 * @see #getFirstPage()
	 * @generated
	 */
	void setFirstPage(String value);

	/**
	 * Returns the value of the '<em><b>Elocation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * article number or other page identifier for an article that does not
	 * 				have page numbers, used typically for electronic-only journals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elocation Id</em>' attribute.
	 * @see #setElocationId(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_ElocationId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='elocation_id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getElocationId();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getElocationId <em>Elocation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elocation Id</em>' attribute.
	 * @see #getElocationId()
	 * @generated
	 */
	void setElocationId(String value);

	/**
	 * Returns the value of the '<em><b>CYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Year of publication in citation. Unlike the year element, cYear has a
	 * 				loose text model that can accommodate non-standard years such as year ranges such as
	 * 				"1998-1999". Note that years such as "1998a" or "1999b" should be deposited without
	 * 				the letter, e.g. "1998" or "1999". The letter is used for internal source document
	 * 				linking in name/date (Harvard) style documents rather than external cross reference
	 * 				linking to the original item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CYear</em>' attribute.
	 * @see #setCYear(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_CYear()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cYear' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCYear();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getCYear <em>CYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CYear</em>' attribute.
	 * @see #getCYear()
	 * @generated
	 */
	void setCYear(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getCitationT_Doi()
	 * @model dataType="org.crossref.schema._4._4.DoiType"
	 *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDoi();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getDoi <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi</em>' attribute.
	 * @see #getDoi()
	 * @generated
	 */
	void setDoi(String value);

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
	 * @see org.crossref.schema._4._4._4Package#getCitationT_Isbn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isbn' namespace='##targetNamespace'"
	 * @generated
	 */
	IsbnType getIsbn();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getIsbn <em>Isbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isbn</em>' containment reference.
	 * @see #getIsbn()
	 * @generated
	 */
	void setIsbn(IsbnType value);

	/**
	 * Returns the value of the '<em><b>Series Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Book series title in a citation. Only used in the citation element.
	 * 				series_title is an element for the deposit of book or conference series titles in
	 * 				citations without the hierarchy required by the series_metadata element. Note that
	 * 				face markup is not permitted when this element is deposited as part of a
	 * 				citation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Title</em>' attribute.
	 * @see #setSeriesTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_SeriesTitle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='series_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSeriesTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getSeriesTitle <em>Series Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Title</em>' attribute.
	 * @see #getSeriesTitle()
	 * @generated
	 */
	void setSeriesTitle(String value);

	/**
	 * Returns the value of the '<em><b>Volume Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Book volume title in a citation. Only used in the citation element.
	 * 				volume_title is an element for the deposit of book or conference volume titles in
	 * 				citations without the hierarchy required by the titles element. Note that face
	 * 				markup is not permitted when this element is deposited as part of a
	 * 				citation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Title</em>' attribute.
	 * @see #setVolumeTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_VolumeTitle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='volume_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVolumeTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getVolumeTitle <em>Volume Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Title</em>' attribute.
	 * @see #getVolumeTitle()
	 * @generated
	 */
	void setVolumeTitle(String value);

	/**
	 * Returns the value of the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The edition number of a book. edition_number should include only a
	 * 				number and not additional text such as "edition". For example, you should submit
	 * 				"3", not "third edition" or "3rd edition". Roman numerals are acceptable. Publishers
	 * 				will update a print edition with a new edition number when more than ten percent of
	 * 				the content has changed. However, publishers expect to continuously update online
	 * 				editions of books without changing the edition number. 
	 *   <i>The ability to update the
	 * 					electronic version independent of the print version could be problematic for
	 * 					researchers. For example, if a research article cites the print version of a
	 * 					chapter, and a researcher subsequently links to the online version of the same
	 * 					chapter, the content may be different from the print version without the typical
	 * 					indication of a new edition. This topic requires further discussion outside of
	 * 					the scope of this specification.</i>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edition Number</em>' attribute.
	 * @see #setEditionNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_EditionNumber()
	 * @model dataType="org.crossref.schema._4._4.EditionNumberType"
	 *        extendedMetaData="kind='element' name='edition_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEditionNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getEditionNumber <em>Edition Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition Number</em>' attribute.
	 * @see #getEditionNumber()
	 * @generated
	 */
	void setEditionNumber(String value);

	/**
	 * Returns the value of the '<em><b>Component Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The chapter, section, part, etc. number for a content item in a book.
	 * 				Unlike volume and edition_number, component_number should include any additional
	 * 				text that helps identify the type of component. In the example above, the text
	 * 				"Section 8" appeared on the table of contents and it is reflected here. "8" is also
	 * 				acceptable, however the former treatment is preferred. The type of the component is
	 * 				given the component_type attribute of content_item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Number</em>' attribute.
	 * @see #setComponentNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_ComponentNumber()
	 * @model dataType="org.crossref.schema._4._4.ComponentNumberType"
	 *        extendedMetaData="kind='element' name='component_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComponentNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getComponentNumber <em>Component Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Number</em>' attribute.
	 * @see #getComponentNumber()
	 * @generated
	 */
	void setComponentNumber(String value);

	/**
	 * Returns the value of the '<em><b>Article Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Article title in a citation. Use care to remove face markup (such as
	 * 				italic applied to genus or species names) from article titles as this markup is not
	 * 				supported by Crossref.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Title</em>' attribute.
	 * @see #setArticleTitle(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_ArticleTitle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='article_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArticleTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getArticleTitle <em>Article Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Title</em>' attribute.
	 * @see #getArticleTitle()
	 * @generated
	 */
	void setArticleTitle(String value);

	/**
	 * Returns the value of the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Designator</em>' attribute.
	 * @see #setStdDesignator(String)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_StdDesignator()
	 * @model dataType="org.crossref.schema._4._4.StdDesignatorvalueT"
	 *        extendedMetaData="kind='element' name='std_designator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStdDesignator();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getStdDesignator <em>Std Designator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Designator</em>' attribute.
	 * @see #getStdDesignator()
	 * @generated
	 */
	void setStdDesignator(String value);

	/**
	 * Returns the value of the '<em><b>Standards Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A wrapper for standards body information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standards Body</em>' containment reference.
	 * @see #setStandardsBody(StandardsBodyType)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_StandardsBody()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standards_body' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardsBodyType getStandardsBody();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getStandardsBody <em>Standards Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standards Body</em>' containment reference.
	 * @see #getStandardsBody()
	 * @generated
	 */
	void setStandardsBody(StandardsBodyType value);

	/**
	 * Returns the value of the '<em><b>Unstructured Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A citation to an item that is not structured with the Crossref citation model.  'unstructured_citation' supports deposit of references for which no structural information is available. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unstructured Citation</em>' containment reference.
	 * @see #setUnstructuredCitation(UnstructuredCitationType)
	 * @see org.crossref.schema._4._4._4Package#getCitationT_UnstructuredCitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unstructured_citation' namespace='##targetNamespace'"
	 * @generated
	 */
	UnstructuredCitationType getUnstructuredCitation();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CitationT#getUnstructuredCitation <em>Unstructured Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unstructured Citation</em>' containment reference.
	 * @see #getUnstructuredCitation()
	 * @generated
	 */
	void setUnstructuredCitation(UnstructuredCitationType value);

} // CitationT
