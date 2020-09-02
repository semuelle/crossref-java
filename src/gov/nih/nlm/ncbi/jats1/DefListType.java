/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getTermHead <em>Term Head</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getDefHead <em>Def Head</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getDefItemClass <em>Def Item Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getDefItem <em>Def Item</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getDefListClass <em>Def List Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getContinuedFrom <em>Continued From</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getListContent <em>List Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getListType <em>List Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getPrefixWord <em>Prefix Word</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DefListType#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType()
 * @model extendedMetaData="name='def-list_._type' kind='elementOnly'"
 * @generated
 */
public interface DefListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Label of a Figure, Reference, Etc.</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Term Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List: Term Head</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Head</em>' containment reference.
	 * @see #setTermHead(TermHeadType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_TermHead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='term-head' namespace='##targetNamespace'"
	 * @generated
	 */
	TermHeadType getTermHead();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getTermHead <em>Term Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Head</em>' containment reference.
	 * @see #getTermHead()
	 * @generated
	 */
	void setTermHead(TermHeadType value);

	/**
	 * Returns the value of the '<em><b>Def Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List: Definition Head</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def Head</em>' containment reference.
	 * @see #setDefHead(DefHeadType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_DefHead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='def-head' namespace='##targetNamespace'"
	 * @generated
	 */
	DefHeadType getDefHead();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getDefHead <em>Def Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Head</em>' containment reference.
	 * @see #getDefHead()
	 * @generated
	 */
	void setDefHead(DefHeadType value);

	/**
	 * Returns the value of the '<em><b>Def Item Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Item Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_DefItemClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DefItemClass:4'"
	 * @generated
	 */
	FeatureMap getDefItemClass();

	/**
	 * Returns the value of the '<em><b>Def Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DefItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List: Definition Item</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def Item</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_DefItem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='def-item' namespace='##targetNamespace' group='#DefItemClass:4'"
	 * @generated
	 */
	EList<DefItemType> getDefItem();

	/**
	 * Returns the value of the '<em><b>Def List Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def List Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_DefListClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DefListClass:6'"
	 * @generated
	 */
	FeatureMap getDefListClass();

	/**
	 * Returns the value of the '<em><b>Def List</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DefListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def List</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_DefList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='def-list' namespace='##targetNamespace' group='#DefListClass:6'"
	 * @generated
	 */
	EList<DefListType> getDefList();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Continued From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continued From</em>' attribute.
	 * @see #setContinuedFrom(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_ContinuedFrom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='continued-from'"
	 * @generated
	 */
	String getContinuedFrom();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getContinuedFrom <em>Continued From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continued From</em>' attribute.
	 * @see #getContinuedFrom()
	 * @generated
	 */
	void setContinuedFrom(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getId <em>Id</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_Lang()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>List Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Content</em>' attribute.
	 * @see #setListContent(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_ListContent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='list-content'"
	 * @generated
	 */
	String getListContent();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getListContent <em>List Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Content</em>' attribute.
	 * @see #getListContent()
	 * @generated
	 */
	void setListContent(String value);

	/**
	 * Returns the value of the '<em><b>List Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Type</em>' attribute.
	 * @see #setListType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_ListType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='list-type'"
	 * @generated
	 */
	String getListType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getListType <em>List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Type</em>' attribute.
	 * @see #getListType()
	 * @generated
	 */
	void setListType(String value);

	/**
	 * Returns the value of the '<em><b>Prefix Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Word</em>' attribute.
	 * @see #setPrefixWord(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_PrefixWord()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='prefix-word'"
	 * @generated
	 */
	String getPrefixWord();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getPrefixWord <em>Prefix Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix Word</em>' attribute.
	 * @see #getPrefixWord()
	 * @generated
	 */
	void setPrefixWord(String value);

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDefListType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DefListType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

} // DefListType
