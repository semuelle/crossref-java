/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ConferenceType#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ConferenceType#getEventMetadata <em>Event Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ConferenceType#getProceedingsSeriesMetadata <em>Proceedings Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ConferenceType#getProceedingsMetadata <em>Proceedings Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ConferenceType#getConferencePaper <em>Conference Paper</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getConferenceType()
 * @model extendedMetaData="name='conference_._type' kind='elementOnly'"
 * @generated
 */
public interface ConferenceType extends EObject {
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
	 * @see org.crossref.schema._4._4._4Package#getConferenceType_Contributors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributorsType getContributors();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceType#getContributors <em>Contributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributors</em>' containment reference.
	 * @see #getContributors()
	 * @generated
	 */
	void setContributors(ContributorsType value);

	/**
	 * Returns the value of the '<em><b>Event Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to a conference event.
	 * 				event_metadata captures information about a conference event. Data about conference
	 * 				proceedings is captured in proceedings_metadata. NOTE: The Crossref system currently
	 * 				uses the proceedings_title and conference_acronym in the query matching process.
	 * 				This system can cause problems when the proceedings have a simple non-changing title
	 * 				(e.g PRoceedings of SPIE) and the conference event name, conference_name, is used to
	 * 				differentiate conference topics (e.g. Optoelectronic Integrated Circuits II). To
	 * 				avoid this problem, Crossref recommends that you make sure the conference_acronym
	 * 				accurately reflects the event name (e.g OpIC II in this
	 * 				example).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Metadata</em>' containment reference.
	 * @see #setEventMetadata(EventMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getConferenceType_EventMetadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='event_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	EventMetadataType getEventMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceType#getEventMetadata <em>Event Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Metadata</em>' containment reference.
	 * @see #getEventMetadata()
	 * @generated
	 */
	void setEventMetadata(EventMetadataType value);

	/**
	 * Returns the value of the '<em><b>Proceedings Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to a specific conference
	 * 				proceeding that is part of a series. A conference proceedings published as a series
	 * 				can sometimes look just like a journnal in that there is no volume information (no
	 * 				volume title, no ISBN). In these cases the conference proceeding may be deposited as
	 * 				a journal (which more accurately should have been called a 'series_publication'). To
	 * 				allow for the use of a consistent XML heirarchy we will allow a
	 * 				proceedings_series_metadata root element to also describe such a publication. Note:
	 * 				this structure is organized to allow backward compatibility with previous schema
	 * 				versions by maintaining the prior sequence of elements. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proceedings Series Metadata</em>' containment reference.
	 * @see #setProceedingsSeriesMetadata(ProceedingsSeriesMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getConferenceType_ProceedingsSeriesMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='proceedings_series_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ProceedingsSeriesMetadataType getProceedingsSeriesMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceType#getProceedingsSeriesMetadata <em>Proceedings Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proceedings Series Metadata</em>' containment reference.
	 * @see #getProceedingsSeriesMetadata()
	 * @generated
	 */
	void setProceedingsSeriesMetadata(ProceedingsSeriesMetadataType value);

	/**
	 * Returns the value of the '<em><b>Proceedings Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for all information that applies to a non-series
	 * 				conference proceeding. proceedings_metadata captures information about conference
	 * 				proceedings. Data about conference events is captured in
	 * 				event_metadata
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proceedings Metadata</em>' containment reference.
	 * @see #setProceedingsMetadata(ProceedingsMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getConferenceType_ProceedingsMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='proceedings_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ProceedingsMetadataType getProceedingsMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ConferenceType#getProceedingsMetadata <em>Proceedings Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proceedings Metadata</em>' containment reference.
	 * @see #getProceedingsMetadata()
	 * @generated
	 */
	void setProceedingsMetadata(ProceedingsMetadataType value);

	/**
	 * Returns the value of the '<em><b>Conference Paper</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.ConferencePaperType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for all information about a single conference paper. A
	 * 				conference paper is required to have contributors, title and doi_data. All other
	 * 				information is optional. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Paper</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getConferenceType_ConferencePaper()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conference_paper' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConferencePaperType> getConferencePaper();

} // ConferenceType
