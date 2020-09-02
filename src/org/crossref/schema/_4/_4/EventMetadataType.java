/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.EventMetadataType#getConferenceName <em>Conference Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.EventMetadataType#getConferenceTheme <em>Conference Theme</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.EventMetadataType#getConferenceAcronym <em>Conference Acronym</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.EventMetadataType#getConferenceSponsor <em>Conference Sponsor</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.EventMetadataType#getConferenceNumber <em>Conference Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.EventMetadataType#getConferenceLocation <em>Conference Location</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.EventMetadataType#getConferenceDate <em>Conference Date</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getEventMetadataType()
 * @model extendedMetaData="name='event_metadata_._type' kind='elementOnly'"
 * @generated
 */
public interface EventMetadataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Conference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The official name of the conference. conference_name does not include
	 * 				"Proceedings of". For example, "The 23rd Annual Meeting of the American Society for
	 * 				Information Science" is a correct conference name. It is quite common for a
	 * 				conference name to include the conference number or subject. When any of these
	 * 				metadata items appear in the conference name, they should be included in this
	 * 				element, and also in the respective sub-element, conference_number or
	 * 				proceedings_subject. The following example shows incorrect tagging of a conference
	 * 				name and then the corrected version: INCORRECT: 
	 *   <event_metadata xmlns="http://www.crossref.org/schema/4.4.2">
	 *     					
	 *     <conference_name>the second international conference</conference_name>
	 *     					
	 *     <conference_acronym>IEA/AIE '89</conference_acronym>
	 *     					
	 *     <conference_number>1989</conference_number>
	 *     					
	 *     <conference_location>Tullahoma, TN</conference_location>
	 *     					
	 *     <conference_date start_year="1989"/>
	 *     				
	 *   </event_metadata>
	 *   				
	 *   <proceedings_metadata language="en" xmlns="http://www.crossref.org/schema/4.4.2">
	 *     					
	 *     <proceedings_title>Proceedings of the second international conference on
	 * 						Industrial and engineering applications of artificial intelligence and
	 * 						expert systems - IEA/AIE'89</proceedings_title>
	 *     					
	 *     <proceedings_subject>Industrial and engineering applications of artificial
	 * 						intelligence and expert systems</proceedings_subject>
	 *     				
	 *   </proceedings_metadata>
	 *    CORRECT: 
	 *   <event_metadata xmlns="http://www.crossref.org/schema/4.4.2">
	 *     					
	 *     <conference_name>The second international conference on Industrial and
	 * 						engineering applications of artificial intelligence and expert
	 * 						systems</conference_name>
	 *     					
	 *     <conference_acronym>IEA/AIE '89</conference_acronym>
	 *     					
	 *     <conference_number>2</conference_number>
	 *     					
	 *     <conference_location>Tullahoma, TN</conference_location>
	 *     					
	 *     <conference_date start_year="1989"/>
	 *     				
	 *   </event_metadata>
	 *   				
	 *   <proceedings_metadata language="en" xmlns="http://www.crossref.org/schema/4.4.2">
	 *     					
	 *     <proceedings_title>Proceedings of the second international conference on
	 * 						Industrial and engineering applications of artificial intelligence and
	 * 						expert systems - IEA/AIE '89</proceedings_title>
	 *     					
	 *     <proceedings_subject>Industrial and engineering applications of artificial
	 * 						intelligence and expert systems</proceedings_subject>
	 *     				
	 *   </proceedings_metadata>
	 *    Authors commonly cite a conference by the official name, so
	 * 				it is important to provide this information as accurately as
	 * 				possible.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Name</em>' attribute.
	 * @see #setConferenceName(String)
	 * @see org.crossref.schema._4._4._4Package#getEventMetadataType_ConferenceName()
	 * @model dataType="org.crossref.schema._4._4.ConferenceNameType" required="true"
	 *        extendedMetaData="kind='element' name='conference_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceName <em>Conference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Name</em>' attribute.
	 * @see #getConferenceName()
	 * @generated
	 */
	void setConferenceName(String value);

	/**
	 * Returns the value of the '<em><b>Conference Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The theme is the slogan or special emphasis of a conference in a
	 * 				particular year. The theme is the slogan of the conference. It differs from the
	 * 				subject of a conference in that the subject is stable over the years while the theme
	 * 				may vary from year to year. For example, the American Society for Information
	 * 				Science and Technology conference theme was "Knowledge: Creation, Organization and
	 * 				Use" in 1999 and "Defining Information Architecture" in 2000.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Theme</em>' attribute.
	 * @see #setConferenceTheme(String)
	 * @see org.crossref.schema._4._4._4Package#getEventMetadataType_ConferenceTheme()
	 * @model dataType="org.crossref.schema._4._4.ConferenceThemeType"
	 *        extendedMetaData="kind='element' name='conference_theme' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceTheme();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceTheme <em>Conference Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Theme</em>' attribute.
	 * @see #getConferenceTheme()
	 * @generated
	 */
	void setConferenceTheme(String value);

	/**
	 * Returns the value of the '<em><b>Conference Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The popularly known as or jargon name (e.g. SIGGRAPH for "Special
	 * 				Interest Group on Computer Graphics"). Authors commonly cite the conference acronym
	 * 				rather than the full conference or proceedings name, so it is best to include this
	 * 				element when it is available. The conference acronym often includes the year of the
	 * 				conference (e.g. SGML '97) or, less often, the conference number. It is preferred,
	 * 				but not required, that submission of metadata exclude number or year information
	 * 				from the conference acronym. It is better to include such information in
	 * 				conference_number, or conference_date, respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Acronym</em>' attribute.
	 * @see #setConferenceAcronym(String)
	 * @see org.crossref.schema._4._4._4Package#getEventMetadataType_ConferenceAcronym()
	 * @model dataType="org.crossref.schema._4._4.ConferenceAcronymType"
	 *        extendedMetaData="kind='element' name='conference_acronym' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceAcronym();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceAcronym <em>Conference Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Acronym</em>' attribute.
	 * @see #getConferenceAcronym()
	 * @generated
	 */
	void setConferenceAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Conference Sponsor</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sponsoring organization(s) of a conference. Multiple sponsors may
	 * 				be given if a conference is hosted by more than one
	 * 				organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Sponsor</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getEventMetadataType_ConferenceSponsor()
	 * @model unique="false" dataType="org.crossref.schema._4._4.ConferenceSponsorType" upper="10"
	 *        extendedMetaData="kind='element' name='conference_sponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getConferenceSponsor();

	/**
	 * Returns the value of the '<em><b>Conference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The number of a conference. conference_number should include only the
	 * 				number of the conference without any extra text. For example, "The 24th Annual
	 * 				Conference on..." should be tagged as shown in the example above, and "th" should
	 * 				not be included. Roman numerals are acceptable. When a conference is named such that
	 * 				the year of the conference indicates the number (e.g. "SGML 1994"), the year appears
	 * 				in conference_name, conference_date, and conference_number, as in:
	 * 					
	 *   <conference_name xmlns="http://www.crossref.org/schema/4.4.2">SGML 1994</conference_name>
	 *   				
	 *   <conference_acronym xmlns="http://www.crossref.org/schema/4.4.2">SGML</conference_acronym>
	 *   				
	 *   <conference_number xmlns="http://www.crossref.org/schema/4.4.2">1994</conference_number>
	 *   				
	 *   <conference_date end_day="10" end_month="11" end_year="1994" start_day="07" start_month="11" start_year="1994" xmlns="http://www.crossref.org/schema/4.4.2">November 7-10, 1994</conference_date>
	 *   			
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Number</em>' attribute.
	 * @see #setConferenceNumber(String)
	 * @see org.crossref.schema._4._4._4Package#getEventMetadataType_ConferenceNumber()
	 * @model dataType="org.crossref.schema._4._4.ConferenceNumberType"
	 *        extendedMetaData="kind='element' name='conference_number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceNumber();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceNumber <em>Conference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Number</em>' attribute.
	 * @see #getConferenceNumber()
	 * @generated
	 */
	void setConferenceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Conference Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location of the conference. The city and country of the
	 * 				conference. If the conference is in the United States, the appropriate state should
	 * 				also be provided, and the country may be omitted. If the conference is in Canada,
	 * 				the province should be provided, and the country may be omitted. The specific venue
	 * 				or address within a city (e.g. conference center, hotel, etc.) should not be
	 * 				provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Location</em>' attribute.
	 * @see #setConferenceLocation(String)
	 * @see org.crossref.schema._4._4._4Package#getEventMetadataType_ConferenceLocation()
	 * @model dataType="org.crossref.schema._4._4.ConferenceLocationType"
	 *        extendedMetaData="kind='element' name='conference_location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConferenceLocation();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceLocation <em>Conference Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Location</em>' attribute.
	 * @see #getConferenceLocation()
	 * @generated
	 */
	void setConferenceLocation(String value);

	/**
	 * Returns the value of the '<em><b>Conference Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The start and end dates of a conference event. conference_date may be
	 * 				used in three ways: 1. If publishers that do not have parsed date values, provide
	 * 				just text with the conference dates. The date text should be taken from the
	 * 				proceedings title page. 2. If publishers have parsed date values, provide them in
	 * 				the attributes. 3. If both parsed date values and the date text are available, both
	 * 				should be provided. This is the preferred tagging for conference_date. For example:
	 * 					
	 *   <conference_date end_day="17" end_month="01" end_year="1997" start_day="15" start_month="01" start_year="1997" xmlns="http://www.crossref.org/schema/4.4.2">Jan. 15-17, 1997</conference_date>
	 *   			
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference Date</em>' containment reference.
	 * @see #setConferenceDate(ConferenceDateType)
	 * @see org.crossref.schema._4._4._4Package#getEventMetadataType_ConferenceDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conference_date' namespace='##targetNamespace'"
	 * @generated
	 */
	ConferenceDateType getConferenceDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceDate <em>Conference Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Date</em>' containment reference.
	 * @see #getConferenceDate()
	 * @generated
	 */
	void setConferenceDate(ConferenceDateType value);

} // EventMetadataType
