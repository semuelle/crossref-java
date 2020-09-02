/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getEventDesc <em>Event Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getArticleId <em>Article Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getArticleVersion <em>Article Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getArticleVersionAlternatives <em>Article Version Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getPubDateClass <em>Pub Date Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getPubDate <em>Pub Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getPubDateNotAvailable <em>Pub Date Not Available</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getDateClass <em>Date Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getDate <em>Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getIssn <em>Issn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getIssnL <em>Issn L</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getNotes <em>Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getSelfUri <em>Self Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getEventType <em>Event Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.EventType#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType()
 * @model extendedMetaData="name='event_._type' kind='elementOnly'"
 * @generated
 */
public interface EventType extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Event Description</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Desc</em>' containment reference.
	 * @see #setEventDesc(EventDescType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_EventDesc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event-desc' namespace='##targetNamespace'"
	 * @generated
	 */
	EventDescType getEventDesc();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getEventDesc <em>Event Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Desc</em>' containment reference.
	 * @see #getEventDesc()
	 * @generated
	 */
	void setEventDesc(EventDescType value);

	/**
	 * Returns the value of the '<em><b>Article Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ArticleIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Id</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_ArticleId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='article-id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArticleIdType> getArticleId();

	/**
	 * Returns the value of the '<em><b>Article Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Version</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Version</em>' containment reference.
	 * @see #setArticleVersion(ArticleVersionType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_ArticleVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='article-version' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleVersionType getArticleVersion();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getArticleVersion <em>Article Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Version</em>' containment reference.
	 * @see #getArticleVersion()
	 * @generated
	 */
	void setArticleVersion(ArticleVersionType value);

	/**
	 * Returns the value of the '<em><b>Article Version Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Version Alternatives</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Version Alternatives</em>' containment reference.
	 * @see #setArticleVersionAlternatives(ArticleVersionAlternativesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_ArticleVersionAlternatives()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='article-version-alternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleVersionAlternativesType getArticleVersionAlternatives();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getArticleVersionAlternatives <em>Article Version Alternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Version Alternatives</em>' containment reference.
	 * @see #getArticleVersionAlternatives()
	 * @generated
	 */
	void setArticleVersionAlternatives(ArticleVersionAlternativesType value);

	/**
	 * Returns the value of the '<em><b>Pub Date Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Date Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_PubDateClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PubDateClass:4'"
	 * @generated
	 */
	FeatureMap getPubDateClass();

	/**
	 * Returns the value of the '<em><b>Pub Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PubDateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publication Date</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub Date</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_PubDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pub-date' namespace='##targetNamespace' group='#PubDateClass:4'"
	 * @generated
	 */
	EList<PubDateType> getPubDate();

	/**
	 * Returns the value of the '<em><b>Pub Date Not Available</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Date Not Available Flag</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub Date Not Available</em>' containment reference.
	 * @see #setPubDateNotAvailable(PubDateNotAvailableType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_PubDateNotAvailable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pub-date-not-available' namespace='##targetNamespace'"
	 * @generated
	 */
	PubDateNotAvailableType getPubDateNotAvailable();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getPubDateNotAvailable <em>Pub Date Not Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Date Not Available</em>' containment reference.
	 * @see #getPubDateNotAvailable()
	 * @generated
	 */
	void setPubDateNotAvailable(PubDateNotAvailableType value);

	/**
	 * Returns the value of the '<em><b>Date Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_DateClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DateClass:7'"
	 * @generated
	 */
	FeatureMap getDateClass();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Date</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_Date()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='#DateClass:7'"
	 * @generated
	 */
	EList<DateType> getDate();

	/**
	 * Returns the value of the '<em><b>Issn</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issn</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issn</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_Issn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IssnType> getIssn();

	/**
	 * Returns the value of the '<em><b>Issn L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issn Linking</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issn L</em>' containment reference.
	 * @see #setIssnL(IssnLType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_IssnL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issn-l' namespace='##targetNamespace'"
	 * @generated
	 */
	IssnLType getIssnL();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getIssnL <em>Issn L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issn L</em>' containment reference.
	 * @see #getIssnL()
	 * @generated
	 */
	void setIssnL(IssnLType value);

	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IsbnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Isbn</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isbn</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_Isbn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isbn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IsbnType> getIsbn();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Permissions</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(PermissionsType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_Permissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='permissions' namespace='##targetNamespace'"
	 * @generated
	 */
	PermissionsType getPermissions();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(PermissionsType value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.NotesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Notes</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NotesType> getNotes();

	/**
	 * Returns the value of the '<em><b>Self Uri</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SelfUriType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Uri For This Same Article Online</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Uri</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_SelfUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='self-uri' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SelfUriType> getSelfUri();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see #setEventType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_EventType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='event-type'"
	 * @generated
	 */
	String getEventType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getId <em>Id</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_Lang()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getEventType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.EventType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

} // EventType
