/**
 */
package org.crossref.schema._4._4;

import java.math.BigInteger;

import org.crossref.access.indicators.ProgramType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peer Review Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getCompetingInterestStatement <em>Competing Interest Statement</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getRunningNumber <em>Running Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getScnPolicies <em>Scn Policies</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getRevisionRound <em>Revision Round</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getStage <em>Stage</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PeerReviewType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getPeerReviewType()
 * @model extendedMetaData="name='peer_review_._type' kind='elementOnly'"
 * @generated
 */
public interface PeerReviewType extends EObject {
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
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_Contributors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributorsType getContributors();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getContributors <em>Contributors</em>}' containment reference.
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
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_Titles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='titles' namespace='##targetNamespace'"
	 * @generated
	 */
	TitlesType getTitles();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getTitles <em>Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titles</em>' containment reference.
	 * @see #getTitles()
	 * @generated
	 */
	void setTitles(TitlesType value);

	/**
	 * Returns the value of the '<em><b>Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date a review was published to a repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Review Date</em>' containment reference.
	 * @see #setReviewDate(ReviewDateType)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_ReviewDate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='review_date' namespace='##targetNamespace'"
	 * @generated
	 */
	ReviewDateType getReviewDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getReviewDate <em>Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Date</em>' containment reference.
	 * @see #getReviewDate()
	 * @generated
	 */
	void setReviewDate(ReviewDateType value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.InstitutionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wrapper element for information about an organization that sponsored
	 * 				or hosted an item but is not the publisher of the item. The institution element
	 * 				should be used to deposit metadata about an organization that sponsored or hosted
	 * 				the research or development of the published material but was not actually the
	 * 				publisher of the information. The institution is distinctly different from the
	 * 				publisher because it may not be a publishing organization. It is typically an
	 * 				organization such as a university, corporation, government agency, NGO or consortia.
	 * 				If the content was published by an organization other than the sponsor, the use of
	 * 				both the publisher and institution elements is encouraged because authors may cite
	 * 				either one in a reference, and the availability of both may allow for more precise
	 * 				matching in queries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_Institution()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='institution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstitutionType> getInstitution();

	/**
	 * Returns the value of the '<em><b>Competing Interest Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statement of competing interest supplied by a review author during
	 * 				the review process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Competing Interest Statement</em>' containment reference.
	 * @see #setCompetingInterestStatement(CompetingInterestStatementType)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_CompetingInterestStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='competing_interest_statement' namespace='##targetNamespace'"
	 * @generated
	 */
	CompetingInterestStatementType getCompetingInterestStatement();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getCompetingInterestStatement <em>Competing Interest Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Competing Interest Statement</em>' containment reference.
	 * @see #getCompetingInterestStatement()
	 * @generated
	 */
	void setCompetingInterestStatement(CompetingInterestStatementType value);

	/**
	 * Returns the value of the '<em><b>Running Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Running numbers to specify the various reports (ex: RC1 to RC4)
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Running Number</em>' attribute.
	 * @see #setRunningNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_RunningNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='running_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRunningNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getRunningNumber <em>Running Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Number</em>' attribute.
	 * @see #getRunningNumber()
	 * @generated
	 */
	void setRunningNumber(String value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of license metadata. The license_ref value will
	 *                 be a URL. Values for the "applies_to" attribute are vor (version of record),am
	 *                 (accepted manuscript), and tdm (text and data mining).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_Program()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/AccessIndicators.xsd'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(ProgramType value);

	/**
	 * Returns the value of the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wrapper element for relationship metadata
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program1</em>' containment reference.
	 * @see #setProgram1(org.crossref.relations.ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_Program1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/relations.xsd'"
	 * @generated
	 */
	org.crossref.relations.ProgramType getProgram1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getProgram1 <em>Program1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program1</em>' containment reference.
	 * @see #getProgram1()
	 * @generated
	 */
	void setProgram1(org.crossref.relations.ProgramType value);

	/**
	 * Returns the value of the '<em><b>Scn Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A wrapper for Scholarly Sharing Network (SCN) policy
	 * 				information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scn Policies</em>' containment reference.
	 * @see #setScnPolicies(ScnPoliciesType)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_ScnPolicies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scn_policies' namespace='##targetNamespace'"
	 * @generated
	 */
	ScnPoliciesType getScnPolicies();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getScnPolicies <em>Scn Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scn Policies</em>' containment reference.
	 * @see #getScnPolicies()
	 * @generated
	 */
	void setScnPolicies(ScnPoliciesType value);

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
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_DoiData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doi_data' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiDataType getDoiData();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getDoiData <em>Doi Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Data</em>' containment reference.
	 * @see #getDoiData()
	 * @generated
	 */
	void setDoiData(DoiDataType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see org.crossref.schema._4._4.LanguageType
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #setLanguage(LanguageType)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see org.crossref.schema._4._4.LanguageType
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	boolean isSetLanguage();

	/**
	 * Returns the value of the '<em><b>Recommendation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.RecommendationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommendation</em>' attribute.
	 * @see org.crossref.schema._4._4.RecommendationType
	 * @see #isSetRecommendation()
	 * @see #unsetRecommendation()
	 * @see #setRecommendation(RecommendationType)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_Recommendation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='recommendation'"
	 * @generated
	 */
	RecommendationType getRecommendation();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getRecommendation <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommendation</em>' attribute.
	 * @see org.crossref.schema._4._4.RecommendationType
	 * @see #isSetRecommendation()
	 * @see #unsetRecommendation()
	 * @see #getRecommendation()
	 * @generated
	 */
	void setRecommendation(RecommendationType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getRecommendation <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecommendation()
	 * @see #getRecommendation()
	 * @see #setRecommendation(RecommendationType)
	 * @generated
	 */
	void unsetRecommendation();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getRecommendation <em>Recommendation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Recommendation</em>' attribute is set.
	 * @see #unsetRecommendation()
	 * @see #getRecommendation()
	 * @see #setRecommendation(RecommendationType)
	 * @generated
	 */
	boolean isSetRecommendation();

	/**
	 * Returns the value of the '<em><b>Revision Round</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required attribute. First submission defined as revision
	 * 						round zero
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Round</em>' attribute.
	 * @see #setRevisionRound(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_RevisionRound()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='revision-round'"
	 * @generated
	 */
	BigInteger getRevisionRound();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getRevisionRound <em>Revision Round</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Round</em>' attribute.
	 * @see #getRevisionRound()
	 * @generated
	 */
	void setRevisionRound(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.StageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see org.crossref.schema._4._4.StageType
	 * @see #isSetStage()
	 * @see #unsetStage()
	 * @see #setStage(StageType)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_Stage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='stage'"
	 * @generated
	 */
	StageType getStage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see org.crossref.schema._4._4.StageType
	 * @see #isSetStage()
	 * @see #unsetStage()
	 * @see #getStage()
	 * @generated
	 */
	void setStage(StageType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStage()
	 * @see #getStage()
	 * @see #setStage(StageType)
	 * @generated
	 */
	void unsetStage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getStage <em>Stage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stage</em>' attribute is set.
	 * @see #unsetStage()
	 * @see #getStage()
	 * @see #setStage(StageType)
	 * @generated
	 */
	boolean isSetStage();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.TypeType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.crossref.schema._4._4.TypeType2
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType2)
	 * @see org.crossref.schema._4._4._4Package#getPeerReviewType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TypeType2 getType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.crossref.schema._4._4.TypeType2
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType2 value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType2)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.PeerReviewType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType2)
	 * @generated
	 */
	boolean isSetType();

} // PeerReviewType
