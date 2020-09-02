/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getLongDesc <em>Long Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getJustBaseDisplayClass <em>Just Base Display Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getTbody <em>Tbody</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getDisplayBackMatterClass <em>Display Back Matter Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArrayType#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType()
 * @model extendedMetaData="name='array_._type' kind='elementOnly'"
 * @generated
 */
public interface ArrayType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Alt Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AltTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Alternate Title Text For a Figure, Etc.</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Text</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_AltText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alt-text' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AltTextType> getAltText();

	/**
	 * Returns the value of the '<em><b>Long Desc</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.LongDescType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Long Description</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Long Desc</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_LongDesc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='long-desc' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LongDescType> getLongDesc();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.EmailType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Email Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Email()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EmailType> getEmail();

	/**
	 * Returns the value of the '<em><b>Ext Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ExtLinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>External Link</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Link</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_ExtLink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ext-link' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExtLinkType> getExtLink();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.UriType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Uri</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Uri()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UriType> getUri();

	/**
	 * Returns the value of the '<em><b>Just Base Display Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Just Base Display Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_JustBaseDisplayClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='JustBaseDisplayClass:6'"
	 * @generated
	 */
	FeatureMap getJustBaseDisplayClass();

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AlternativesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Alternatives For Processing</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Alternatives()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alternatives' namespace='##targetNamespace' group='#JustBaseDisplayClass:6'"
	 * @generated
	 */
	EList<AlternativesType> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Graphic</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.GraphicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Graphic</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Graphic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='graphic' namespace='##targetNamespace' group='#JustBaseDisplayClass:6'"
	 * @generated
	 */
	EList<GraphicType> getGraphic();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.MediaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Media Object</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Media()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='media' namespace='##targetNamespace' group='#JustBaseDisplayClass:6'"
	 * @generated
	 */
	EList<MediaType> getMedia();

	/**
	 * Returns the value of the '<em><b>Tbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tbody</em>' containment reference.
	 * @see #setTbody(TbodyType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Tbody()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tbody' namespace='##targetNamespace'"
	 * @generated
	 */
	TbodyType getTbody();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArrayType#getTbody <em>Tbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbody</em>' containment reference.
	 * @see #getTbody()
	 * @generated
	 */
	void setTbody(TbodyType value);

	/**
	 * Returns the value of the '<em><b>Display Back Matter Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Back Matter Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_DisplayBackMatterClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DisplayBackMatterClass:11'"
	 * @generated
	 */
	FeatureMap getDisplayBackMatterClass();

	/**
	 * Returns the value of the '<em><b>Attrib</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AttribType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Attribution</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attrib</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Attrib()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attrib' namespace='##targetNamespace' group='#DisplayBackMatterClass:11'"
	 * @generated
	 */
	EList<AttribType> getAttrib();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PermissionsType}.
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
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Permissions()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='permissions' namespace='##targetNamespace' group='#DisplayBackMatterClass:11'"
	 * @generated
	 */
	EList<PermissionsType> getPermissions();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArrayType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArrayType#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArrayType#getId <em>Id</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Lang()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArrayType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The default value is <code>"portrait"</code>.
	 * The literals are from the enumeration {@link gov.nih.nlm.ncbi.jats1.OrientationType7}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.OrientationType7
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(OrientationType7)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_Orientation()
	 * @model default="portrait" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='orientation'"
	 * @generated
	 */
	OrientationType7 getOrientation();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArrayType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.OrientationType7
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType7 value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArrayType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType7)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.ArrayType#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType7)
	 * @generated
	 */
	boolean isSetOrientation();

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArrayType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArrayType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

} // ArrayType
