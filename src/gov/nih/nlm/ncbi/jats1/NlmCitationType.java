/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nlm Citation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPersonGroup <em>Person Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getCollab <em>Collab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getTransTitle <em>Trans Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPatent <em>Patent</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getTransSource <em>Trans Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getYear <em>Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getSeason <em>Season</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getAccessDate <em>Access Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getVolume <em>Volume</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getConfName <em>Conf Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getConfDate <em>Conf Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getConfLoc <em>Conf Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getIssue <em>Issue</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPublisherLoc <em>Publisher Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getFpage <em>Fpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getLpage <em>Lpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getSeries <em>Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getComment <em>Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPubId <em>Pub Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPublicationFormat <em>Publication Format</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPublicationType <em>Publication Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPublisherType <em>Publisher Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType()
 * @model extendedMetaData="name='nlm-citation_._type' kind='elementOnly'"
 * @generated
 */
public interface NlmCitationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Person Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PersonGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Person Group For a Cited Publication</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_PersonGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person-group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PersonGroupType> getPersonGroup();

	/**
	 * Returns the value of the '<em><b>Collab</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CollabType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Collaborative (Group) Author</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collab</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Collab()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collab' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CollabType> getCollab();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Article Title</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ArticleTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Title</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_ArticleTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article-title' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<ArticleTitleType> getArticleTitle();

	/**
	 * Returns the value of the '<em><b>Trans Title</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TransTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Title</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_TransTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-title' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<TransTitleType> getTransTitle();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Source</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SourceType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceType getSource();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceType value);

	/**
	 * Returns the value of the '<em><b>Patent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Patent Number, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patent</em>' containment reference.
	 * @see #setPatent(PatentType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Patent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patent' namespace='##targetNamespace'"
	 * @generated
	 */
	PatentType getPatent();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPatent <em>Patent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patent</em>' containment reference.
	 * @see #getPatent()
	 * @generated
	 */
	void setPatent(PatentType value);

	/**
	 * Returns the value of the '<em><b>Trans Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Source</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Source</em>' containment reference.
	 * @see #setTransSource(TransSourceType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_TransSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trans-source' namespace='##targetNamespace'"
	 * @generated
	 */
	TransSourceType getTransSource();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getTransSource <em>Trans Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Source</em>' containment reference.
	 * @see #getTransSource()
	 * @generated
	 */
	void setTransSource(TransSourceType value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Year</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Year</em>' containment reference.
	 * @see #setYear(YearType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Year()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
	 * @generated
	 */
	YearType getYear();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getYear <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' containment reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(YearType value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Month</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month</em>' containment reference.
	 * @see #setMonth(MonthType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Month()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
	 * @generated
	 */
	MonthType getMonth();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getMonth <em>Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' containment reference.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(MonthType value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Day</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day</em>' containment reference.
	 * @see #setDay(DayType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Day()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='day' namespace='##targetNamespace'"
	 * @generated
	 */
	DayType getDay();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getDay <em>Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' containment reference.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(DayType value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Time Stamp For Cited Work</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(TimeStampType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_TimeStamp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time-stamp' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeStampType getTimeStamp();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(TimeStampType value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Season</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Season</em>' containment reference.
	 * @see #setSeason(SeasonType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Season()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='season' namespace='##targetNamespace'"
	 * @generated
	 */
	SeasonType getSeason();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getSeason <em>Season</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' containment reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(SeasonType value);

	/**
	 * Returns the value of the '<em><b>Access Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Access Date For Cited Work</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Date</em>' containment reference.
	 * @see #setAccessDate(AccessDateType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_AccessDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='access-date' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessDateType getAccessDate();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getAccessDate <em>Access Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Date</em>' containment reference.
	 * @see #getAccessDate()
	 * @generated
	 */
	void setAccessDate(AccessDateType value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Volume Number</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' containment reference.
	 * @see #setVolume(VolumeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Volume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
	 * @generated
	 */
	VolumeType getVolume();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getVolume <em>Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' containment reference.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(VolumeType value);

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Edition Statement, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edition</em>' containment reference.
	 * @see #setEdition(EditionType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Edition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace'"
	 * @generated
	 */
	EditionType getEdition();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getEdition <em>Edition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' containment reference.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(EditionType value);

	/**
	 * Returns the value of the '<em><b>Conf Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Name</em>' containment reference.
	 * @see #setConfName(ConfNameType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_ConfName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conf-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfNameType getConfName();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getConfName <em>Conf Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Name</em>' containment reference.
	 * @see #getConfName()
	 * @generated
	 */
	void setConfName(ConfNameType value);

	/**
	 * Returns the value of the '<em><b>Conf Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Date</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Date</em>' containment reference.
	 * @see #setConfDate(ConfDateType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_ConfDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conf-date' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfDateType getConfDate();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getConfDate <em>Conf Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Date</em>' containment reference.
	 * @see #getConfDate()
	 * @generated
	 */
	void setConfDate(ConfDateType value);

	/**
	 * Returns the value of the '<em><b>Conf Loc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Location</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Loc</em>' containment reference.
	 * @see #setConfLoc(ConfLocType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_ConfLoc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conf-loc' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfLocType getConfLoc();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getConfLoc <em>Conf Loc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Loc</em>' containment reference.
	 * @see #getConfLoc()
	 * @generated
	 */
	void setConfLoc(ConfLocType value);

	/**
	 * Returns the value of the '<em><b>Group2</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group2</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Group2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:20'"
	 * @generated
	 */
	FeatureMap getGroup2();

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Number</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Issue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue' namespace='##targetNamespace' group='#group:20'"
	 * @generated
	 */
	EList<IssueType> getIssue();

	/**
	 * Returns the value of the '<em><b>Supplement</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SupplementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Supplement</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplement</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Supplement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='supplement' namespace='##targetNamespace' group='#group:20'"
	 * @generated
	 */
	EList<SupplementType> getSupplement();

	/**
	 * Returns the value of the '<em><b>Publisher Loc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publisher's Location</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Loc</em>' containment reference.
	 * @see #setPublisherLoc(PublisherLocType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_PublisherLoc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher-loc' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherLocType getPublisherLoc();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPublisherLoc <em>Publisher Loc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Loc</em>' containment reference.
	 * @see #getPublisherLoc()
	 * @generated
	 */
	void setPublisherLoc(PublisherLocType value);

	/**
	 * Returns the value of the '<em><b>Publisher Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publisher's Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Name</em>' containment reference.
	 * @see #setPublisherName(PublisherNameType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_PublisherName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher-name' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherNameType getPublisherName();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPublisherName <em>Publisher Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Name</em>' containment reference.
	 * @see #getPublisherName()
	 * @generated
	 */
	void setPublisherName(PublisherNameType value);

	/**
	 * Returns the value of the '<em><b>Group3</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group3</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:25'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Fpage</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.FpageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>First Page</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fpage</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Fpage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fpage' namespace='##targetNamespace' group='#group:25'"
	 * @generated
	 */
	EList<FpageType> getFpage();

	/**
	 * Returns the value of the '<em><b>Lpage</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.LpageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Last Page</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lpage</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Lpage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lpage' namespace='##targetNamespace' group='#group:25'"
	 * @generated
	 */
	EList<LpageType> getLpage();

	/**
	 * Returns the value of the '<em><b>Page Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Page Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Count</em>' containment reference.
	 * @see #setPageCount(PageCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_PageCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page-count' namespace='##targetNamespace'"
	 * @generated
	 */
	PageCountType getPageCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPageCount <em>Page Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Count</em>' containment reference.
	 * @see #getPageCount()
	 * @generated
	 */
	void setPageCount(PageCountType value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Series</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(SeriesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	SeriesType getSeries();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(SeriesType value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CommentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Comment in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommentType> getComment();

	/**
	 * Returns the value of the '<em><b>Pub Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PubIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publication Identifier For a Cited Publication</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub Id</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_PubId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pub-id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PubIdType> getPubId();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Annotation in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(AnnotationType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnotationType getAnnotation();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(AnnotationType value);

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *          
	 *       
	 *     <h3>base (as an attribute name)</h3>
	 *           
	 *     <p>
	 *        denotes an attribute whose value
	 *        provides a URI to be used as the base for interpreting any
	 *        relative URIs in the scope of the element on which it
	 *        appears; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML Base specification.</p>
	 *          
	 *      
	 *     <p>
	 *             See 
	 *       <a href="http://www.w3.org/TR/xmlbase/">http://www.w3.org/TR/xmlbase/</a>
	 *             for information about this attribute.
	 *      
	 *     </p>
	 *         
	 *   </div>
	 *      
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Href()
	 * @model dataType="org.w3._1999.xlink.HrefType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *          
	 *       
	 *     <h3>lang (as an attribute name)</h3>
	 *           
	 *     <p>
	 *        denotes an attribute whose value
	 *        is a language code for the natural language of the content of
	 *        any element; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML specification.</p>
	 *          
	 *     
	 *   </div>
	 *       
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *          
	 *     <h4>Notes</h4>
	 *          
	 *     <p>
	 *       Attempting to install the relevant ISO 2- and 3-letter
	 *       codes as the enumerated possible values is probably never
	 *       going to be a realistic possibility.  
	 *      </p>
	 *          
	 *     <p>
	 *             See BCP 47 at 
	 *       <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt">
	 *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>
	 *             and the IANA language subtag registry at
	 *       
	 *       <a href="http://www.iana.org/assignments/language-subtag-registry">
	 *        http://www.iana.org/assignments/language-subtag-registry</a>
	 *             for further information.
	 *      
	 *     </p>
	 *          
	 *     <p>
	 *       The union allows for the 'un-declaration' of xml:lang with
	 *       the empty string.
	 *      </p>
	 *         
	 *   </div>
	 *      
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Lang()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Publication Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Format</em>' attribute.
	 * @see #setPublicationFormat(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_PublicationFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='publication-format'"
	 * @generated
	 */
	String getPublicationFormat();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPublicationFormat <em>Publication Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Format</em>' attribute.
	 * @see #getPublicationFormat()
	 * @generated
	 */
	void setPublicationFormat(String value);

	/**
	 * Returns the value of the '<em><b>Publication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Type</em>' attribute.
	 * @see #setPublicationType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_PublicationType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='publication-type'"
	 * @generated
	 */
	String getPublicationType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPublicationType <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Type</em>' attribute.
	 * @see #getPublicationType()
	 * @generated
	 */
	void setPublicationType(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Type</em>' attribute.
	 * @see #setPublisherType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_PublisherType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='publisher-type'"
	 * @generated
	 */
	String getPublisherType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getPublisherType <em>Publisher Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Type</em>' attribute.
	 * @see #getPublisherType()
	 * @generated
	 */
	void setPublisherType(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Role()
	 * @model dataType="org.w3._1999.xlink.RoleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Title()
	 * @model dataType="org.w3._1999.xlink.TitleAttrType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3._1999.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getNlmCitationType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.w3._1999.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.NlmCitationType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // NlmCitationType
