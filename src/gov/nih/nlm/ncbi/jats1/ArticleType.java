/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getFront <em>Front</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getBody <em>Body</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getBack <em>Back</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getFloatsGroup <em>Floats Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getSubArticle <em>Sub Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getResponse <em>Response</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getArticleType <em>Article Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getDtdVersion <em>Dtd Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleType#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType()
 * @model extendedMetaData="name='article_._type' kind='elementOnly'"
 * @generated
 */
public interface ArticleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Front</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Front Matter</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Front</em>' containment reference.
	 * @see #setFront(FrontType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_Front()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='front' namespace='##targetNamespace'"
	 * @generated
	 */
	FrontType getFront();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getFront <em>Front</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front</em>' containment reference.
	 * @see #getFront()
	 * @generated
	 */
	void setFront(FrontType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Body of the Article</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodyType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_Body()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyType getBody();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodyType value);

	/**
	 * Returns the value of the '<em><b>Back</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Back Matter</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back</em>' containment reference.
	 * @see #setBack(BackType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_Back()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='back' namespace='##targetNamespace'"
	 * @generated
	 */
	BackType getBack();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getBack <em>Back</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back</em>' containment reference.
	 * @see #getBack()
	 * @generated
	 */
	void setBack(BackType value);

	/**
	 * Returns the value of the '<em><b>Floats Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Floats Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Floats Group</em>' containment reference.
	 * @see #setFloatsGroup(FloatsGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_FloatsGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='floats-group' namespace='##targetNamespace'"
	 * @generated
	 */
	FloatsGroupType getFloatsGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getFloatsGroup <em>Floats Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floats Group</em>' containment reference.
	 * @see #getFloatsGroup()
	 * @generated
	 */
	void setFloatsGroup(FloatsGroupType value);

	/**
	 * Returns the value of the '<em><b>Sub Article</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SubArticleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Sub-Article</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Article</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_SubArticle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sub-article' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubArticleType> getSubArticle();

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ResponseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Response</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResponseType> getResponse();

	/**
	 * Returns the value of the '<em><b>Article Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Article Type</em>' attribute.
	 * @see #setArticleType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_ArticleType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='article-type'"
	 * @generated
	 */
	String getArticleType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getArticleType <em>Article Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Type</em>' attribute.
	 * @see #getArticleType()
	 * @generated
	 */
	void setArticleType(String value);

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Dtd Version</b></em>' attribute.
	 * The default value is <code>"1.2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtd Version</em>' attribute.
	 * @see #isSetDtdVersion()
	 * @see #unsetDtdVersion()
	 * @see #setDtdVersion(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_DtdVersion()
	 * @model default="1.2" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dtd-version'"
	 * @generated
	 */
	String getDtdVersion();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getDtdVersion <em>Dtd Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtd Version</em>' attribute.
	 * @see #isSetDtdVersion()
	 * @see #unsetDtdVersion()
	 * @see #getDtdVersion()
	 * @generated
	 */
	void setDtdVersion(String value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getDtdVersion <em>Dtd Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDtdVersion()
	 * @see #getDtdVersion()
	 * @see #setDtdVersion(String)
	 * @generated
	 */
	void unsetDtdVersion();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getDtdVersion <em>Dtd Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dtd Version</em>' attribute is set.
	 * @see #unsetDtdVersion()
	 * @see #getDtdVersion()
	 * @see #setDtdVersion(String)
	 * @generated
	 */
	boolean isSetDtdVersion();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * The default value is <code>"en"</code>.
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
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #setLang(Object)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_Lang()
	 * @model default="en" unsettable="true" dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLang()
	 * @see #getLang()
	 * @see #setLang(Object)
	 * @generated
	 */
	void unsetLang();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getLang <em>Lang</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lang</em>' attribute is set.
	 * @see #unsetLang()
	 * @see #getLang()
	 * @see #setLang(Object)
	 * @generated
	 */
	boolean isSetLang();

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

} // ArticleType
