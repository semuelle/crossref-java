/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Issue Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.JournalIssueType#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalIssueType#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalIssueType#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalIssueType#getJournalVolume <em>Journal Volume</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalIssueType#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalIssueType#getSpecialNumbering <em>Special Numbering</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalIssueType#getArchiveLocations <em>Archive Locations</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.JournalIssueType#getDoiData <em>Doi Data</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getJournalIssueType()
 * @model extendedMetaData="name='journal_issue_._type' kind='elementOnly'"
 * @generated
 */
public interface JournalIssueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for all who contributed to authoring or editing an
	 * 				entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributors</em>' containment reference.
	 * @see #setContributors(ContributorsType)
	 * @see org.crossref.schema._4._4._4Package#getJournalIssueType_Contributors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributorsType getContributors();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalIssueType#getContributors <em>Contributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributors</em>' containment reference.
	 * @see #getContributors()
	 * @generated
	 */
	void setContributors(ContributorsType value);

	/**
	 * Returns the value of the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for the title and original language title
	 * 				elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Titles</em>' containment reference.
	 * @see #setTitles(TitlesType)
	 * @see org.crossref.schema._4._4._4Package#getJournalIssueType_Titles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='titles' namespace='##targetNamespace'"
	 * @generated
	 */
	TitlesType getTitles();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalIssueType#getTitles <em>Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titles</em>' containment reference.
	 * @see #getTitles()
	 * @generated
	 */
	void setTitles(TitlesType value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.PublicationDateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of publication. In all cases, multiple dates are allowed to
	 * 				allow for different dates of publication for online and print versions. This element
	 * 				was previously called date, but was renamed publication_date to distinguish more
	 * 				clearly from conference_date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Date</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getJournalIssueType_PublicationDate()
	 * @model containment="true" required="true" upper="10"
	 *        extendedMetaData="kind='element' name='publication_date' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PublicationDateType> getPublicationDate();

	/**
	 * Returns the value of the '<em><b>Journal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for the journal volume and DOI assigned to an entire
	 * 				journal volume. You may register a DOI for an entire volume by including doi_data in
	 * 				journal_volume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Volume</em>' containment reference.
	 * @see #setJournalVolume(JournalVolumeType)
	 * @see org.crossref.schema._4._4._4Package#getJournalIssueType_JournalVolume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='journal_volume' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalVolumeType getJournalVolume();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalIssueType#getJournalVolume <em>Journal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Volume</em>' containment reference.
	 * @see #getJournalVolume()
	 * @generated
	 */
	void setJournalVolume(JournalVolumeType value);

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
	 * @see org.crossref.schema._4._4._4Package#getJournalIssueType_Issue()
	 * @model dataType="org.crossref.schema._4._4.IssueType"
	 *        extendedMetaData="kind='element' name='issue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIssue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalIssueType#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(String value);

	/**
	 * Returns the value of the '<em><b>Special Numbering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue level numbering for supplements or special issues.
	 * 							Text defining the type of special issue (e.g. "suppl") should be
	 * 							included in this element along with the number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Numbering</em>' attribute.
	 * @see #setSpecialNumbering(String)
	 * @see org.crossref.schema._4._4._4Package#getJournalIssueType_SpecialNumbering()
	 * @model dataType="org.crossref.schema._4._4.SpecialNumberingType"
	 *        extendedMetaData="kind='element' name='special_numbering' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpecialNumbering();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalIssueType#getSpecialNumbering <em>Special Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Numbering</em>' attribute.
	 * @see #getSpecialNumbering()
	 * @generated
	 */
	void setSpecialNumbering(String value);

	/**
	 * Returns the value of the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for archive. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Locations</em>' containment reference.
	 * @see #setArchiveLocations(ArchiveLocationsType)
	 * @see org.crossref.schema._4._4._4Package#getJournalIssueType_ArchiveLocations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='archive_locations' namespace='##targetNamespace'"
	 * @generated
	 */
	ArchiveLocationsType getArchiveLocations();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalIssueType#getArchiveLocations <em>Archive Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Locations</em>' containment reference.
	 * @see #getArchiveLocations()
	 * @generated
	 */
	void setArchiveLocations(ArchiveLocationsType value);

	/**
	 * Returns the value of the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for elements related directly to a DOI. doi_data
	 * 				contains the doi, timestamp (version) and corresponding resource (URI) data for the
	 * 				doi. Cases of single-resolution (i.e. one DOI with a single corresponding URI)
	 * 				should be tagged with a doi/resource pair in doi_data. If additional resources are
	 * 				to be proved the <collection> element may also be used. The single URL
	 * 				provided in the <resource> is mandatory and serves as the single resolution
	 * 				target for the DOI. Note: A timestamp value placed inside doi_data will override any
	 * 				timestamp value placed in the <head> element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi Data</em>' containment reference.
	 * @see #setDoiData(DoiDataType)
	 * @see org.crossref.schema._4._4._4Package#getJournalIssueType_DoiData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doi_data' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiDataType getDoiData();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.JournalIssueType#getDoiData <em>Doi Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Data</em>' containment reference.
	 * @see #getDoiData()
	 * @generated
	 */
	void setDoiData(DoiDataType value);

} // JournalIssueType
