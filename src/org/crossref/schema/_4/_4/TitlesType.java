/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.TitlesType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.TitlesType#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.TitlesType#getOriginalLanguageTitle <em>Original Language Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.TitlesType#getSubtitle1 <em>Subtitle1</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getTitlesType()
 * @model extendedMetaData="name='titles_._type' kind='elementOnly'"
 * @generated
 */
public interface TitlesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the entity being registered. When a title contains a
	 * 				subtitle, it is preferable to capture the subtitle portion in the subtitle element.
	 * 				Only minimal face markup is supported, see
	 * 				https://support.crossref.org/hc/en-us/articles/214532023
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.crossref.schema._4._4._4Package#getTitlesType_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.TitlesType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The sub-title portion of an entity title. When possible, it is better
	 * 				to tag a title and subtitle with separate elements. If this information is not
	 * 				available, it is acceptable to submit the title and subtitle all within the title
	 * 				element with punctuation (preferably a colon) used to separate the subtitle from the
	 * 				title. When a subtitle is tagged, the space and punctuation between the title and
	 * 				subtitle text should not be included. The following examples illustrate correct and
	 * 				incorrect tagging practices: Correct and optimal tagging: 
	 *   <title>The Human
	 * 					Brain</title>
	 *   				
	 *   <subtitle>A Handbook</subtitle>
	 *    Correct but not optimal tagging: 
	 *   <title>The Human
	 * 					Brain: A Handbook</title>
	 *    Incorrect: 
	 *   <title>The Human Brain: </title>
	 *   				
	 *   <subtitle>A Handbook</subtitle>
	 *   				
	 *   <title>The Human Brain</title>
	 *   				
	 *   <subtitle>: A Handbook</subtitle>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(SubtitleType)
	 * @see org.crossref.schema._4._4._4Package#getTitlesType_Subtitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtitleType getSubtitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.TitlesType#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(SubtitleType value);

	/**
	 * Returns the value of the '<em><b>Original Language Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of an entity in its original language if the registration
	 * 				is for a translation of a work. When providing the original language of a title, you
	 * 				should set the language attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Language Title</em>' containment reference.
	 * @see #setOriginalLanguageTitle(OriginalLanguageTitleType)
	 * @see org.crossref.schema._4._4._4Package#getTitlesType_OriginalLanguageTitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='original_language_title' namespace='##targetNamespace'"
	 * @generated
	 */
	OriginalLanguageTitleType getOriginalLanguageTitle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.TitlesType#getOriginalLanguageTitle <em>Original Language Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Language Title</em>' containment reference.
	 * @see #getOriginalLanguageTitle()
	 * @generated
	 */
	void setOriginalLanguageTitle(OriginalLanguageTitleType value);

	/**
	 * Returns the value of the '<em><b>Subtitle1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The sub-title portion of an entity title. When possible, it is better
	 * 				to tag a title and subtitle with separate elements. If this information is not
	 * 				available, it is acceptable to submit the title and subtitle all within the title
	 * 				element with punctuation (preferably a colon) used to separate the subtitle from the
	 * 				title. When a subtitle is tagged, the space and punctuation between the title and
	 * 				subtitle text should not be included. The following examples illustrate correct and
	 * 				incorrect tagging practices: Correct and optimal tagging: 
	 *   <title>The Human
	 * 					Brain</title>
	 *   				
	 *   <subtitle>A Handbook</subtitle>
	 *    Correct but not optimal tagging: 
	 *   <title>The Human
	 * 					Brain: A Handbook</title>
	 *    Incorrect: 
	 *   <title>The Human Brain: </title>
	 *   				
	 *   <subtitle>A Handbook</subtitle>
	 *   				
	 *   <title>The Human Brain</title>
	 *   				
	 *   <subtitle>: A Handbook</subtitle>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtitle1</em>' containment reference.
	 * @see #setSubtitle1(SubtitleType)
	 * @see org.crossref.schema._4._4._4Package#getTitlesType_Subtitle1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtitleType getSubtitle1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.TitlesType#getSubtitle1 <em>Subtitle1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle1</em>' containment reference.
	 * @see #getSubtitle1()
	 * @generated
	 */
	void setSubtitle1(SubtitleType value);

} // TitlesType
