/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.JournalType#getJournalMetadata <em>Journal Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalType#getJournalIssue <em>Journal Issue</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalType#getJournalArticle <em>Journal Article</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getJournalType()
 * @model extendedMetaData="name='journal_._type' kind='elementOnly'"
 * @generated
 */
public interface JournalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Journal Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for metadata that defines a
	 * 				journal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Metadata</em>' containment reference.
	 * @see #setJournalMetadata(JournalMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getJournalType_JournalMetadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='journal_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalMetadataType getJournalMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalType#getJournalMetadata <em>Journal Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Metadata</em>' containment reference.
	 * @see #getJournalMetadata()
	 * @generated
	 */
	void setJournalMetadata(JournalMetadataType value);

	/**
	 * Returns the value of the '<em><b>Journal Issue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for metadata that defines a single issue of a journal.
	 * 				Special issue numbering information for a journal should be placed in
	 * 				special_numbering. You may register a DOI for an entire issue by including doi_data
	 * 				in journal_issue. The URI should resolve to the table of contents for the issue.
	 * 				contributors is included in journal_issue to allow inclusion of editors of special
	 * 				issues. This element allows linking from a reference such as: R.Glaser, L.Bond
	 * 				(Eds.), Testing: concepts and research, American Psychologist 36 (10-12) (1981)
	 * 				(special issue). You should not include contributors for the regular editors of
	 * 				regular issues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Issue</em>' containment reference.
	 * @see #setJournalIssue(JournalIssueType)
	 * @see org.crossref.schema._4._4._4Package#getJournalType_JournalIssue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='journal_issue' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalIssueType getJournalIssue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalType#getJournalIssue <em>Journal Issue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Issue</em>' containment reference.
	 * @see #getJournalIssue()
	 * @generated
	 */
	void setJournalIssue(JournalIssueType value);

	/**
	 * Returns the value of the '<em><b>Journal Article</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.JournalArticleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for all information about a single journal article. A
	 * 				journal article is required to have title and doi_data. All other information is
	 * 				optional. When registering items that do not have titles, use the appropriate
	 * 				heading from the journal section or table of contents (e.g. "Errata") in title.
	 * 				journal_article allows for multiple titles per entity. In some cases it may be
	 * 				helpful to submit multiple titles. For example, if an erratum carries title of the
	 * 				original article a nd the heading "Errata", both should be submitted by using two
	 * 				titles elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Article</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getJournalType_JournalArticle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='journal_article' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JournalArticleType> getJournalArticle();

} // JournalType
