/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getSeason <em>Season</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getYear <em>Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getEra <em>Era</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getDateType <em>Date Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getIso8601Date <em>Iso8601 Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getPublicationFormat <em>Publication Format</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DateType#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType()
 * @model extendedMetaData="name='date_._type' kind='elementOnly'"
 * @generated
 */
public interface DateType extends EObject {
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_Day()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='day' namespace='##targetNamespace'"
	 * @generated
	 */
	DayType getDay();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getDay <em>Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' containment reference.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(DayType value);

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_Month()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
	 * @generated
	 */
	MonthType getMonth();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getMonth <em>Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' containment reference.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(MonthType value);

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_Season()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='season' namespace='##targetNamespace'"
	 * @generated
	 */
	SeasonType getSeason();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getSeason <em>Season</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' containment reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(SeasonType value);

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_Year()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
	 * @generated
	 */
	YearType getYear();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getYear <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' containment reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(YearType value);

	/**
	 * Returns the value of the '<em><b>Era</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Era</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Era</em>' containment reference.
	 * @see #setEra(EraType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_Era()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='era' namespace='##targetNamespace'"
	 * @generated
	 */
	EraType getEra();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getEra <em>Era</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Era</em>' containment reference.
	 * @see #getEra()
	 * @generated
	 */
	void setEra(EraType value);

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar</em>' attribute.
	 * @see #setCalendar(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_Calendar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='calendar'"
	 * @generated
	 */
	String getCalendar();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getCalendar <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar</em>' attribute.
	 * @see #getCalendar()
	 * @generated
	 */
	void setCalendar(String value);

	/**
	 * Returns the value of the '<em><b>Date Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Type</em>' attribute.
	 * @see #setDateType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_DateType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='date-type'"
	 * @generated
	 */
	String getDateType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getDateType <em>Date Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Type</em>' attribute.
	 * @see #getDateType()
	 * @generated
	 */
	void setDateType(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Iso8601 Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iso8601 Date</em>' attribute.
	 * @see #setIso8601Date(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_Iso8601Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='iso-8601-date'"
	 * @generated
	 */
	String getIso8601Date();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getIso8601Date <em>Iso8601 Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso8601 Date</em>' attribute.
	 * @see #getIso8601Date()
	 * @generated
	 */
	void setIso8601Date(String value);

	/**
	 * Returns the value of the '<em><b>Publication Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Format</em>' attribute.
	 * @see #setPublicationFormat(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_PublicationFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='publication-format'"
	 * @generated
	 */
	String getPublicationFormat();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getPublicationFormat <em>Publication Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Format</em>' attribute.
	 * @see #getPublicationFormat()
	 * @generated
	 */
	void setPublicationFormat(String value);

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDateType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DateType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

} // DateType
