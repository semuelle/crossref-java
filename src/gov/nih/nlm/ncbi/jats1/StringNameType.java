/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getPersonNameClass <em>Person Name Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getGivenNames <em>Given Names</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getSurname <em>Surname</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.StringNameType#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType()
 * @model extendedMetaData="name='string-name_._type' kind='mixed'"
 * @generated
 */
public interface StringNameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Person Name Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Name Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_PersonNameClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='PersonNameClass:1'"
	 * @generated
	 */
	FeatureMap getPersonNameClass();

	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DegreesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Degree(s)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Degrees</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_Degrees()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='degrees' namespace='##targetNamespace' group='#PersonNameClass:1'"
	 * @generated
	 */
	EList<DegreesType> getDegrees();

	/**
	 * Returns the value of the '<em><b>Given Names</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.GivenNamesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Given (First) Names</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Given Names</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_GivenNames()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='given-names' namespace='##targetNamespace' group='#PersonNameClass:1'"
	 * @generated
	 */
	EList<GivenNamesType> getGivenNames();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PrefixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Prefix</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_Prefix()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prefix' namespace='##targetNamespace' group='#PersonNameClass:1'"
	 * @generated
	 */
	EList<PrefixType> getPrefix();

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SurnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Surname</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surname</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_Surname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='surname' namespace='##targetNamespace' group='#PersonNameClass:1'"
	 * @generated
	 */
	EList<SurnameType> getSurname();

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SuffixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Suffix</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_Suffix()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='suffix' namespace='##targetNamespace' group='#PersonNameClass:1'"
	 * @generated
	 */
	EList<SuffixType> getSuffix();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.StringNameType#getBase <em>Base</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.StringNameType#getContentType <em>Content Type</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.StringNameType#getId <em>Id</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_Lang()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.StringNameType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Name Style</b></em>' attribute.
	 * The default value is <code>"western"</code>.
	 * The literals are from the enumeration {@link gov.nih.nlm.ncbi.jats1.NameStyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Style</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.NameStyleType
	 * @see #isSetNameStyle()
	 * @see #unsetNameStyle()
	 * @see #setNameStyle(NameStyleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_NameStyle()
	 * @model default="western" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='name-style'"
	 * @generated
	 */
	NameStyleType getNameStyle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.StringNameType#getNameStyle <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Style</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.NameStyleType
	 * @see #isSetNameStyle()
	 * @see #unsetNameStyle()
	 * @see #getNameStyle()
	 * @generated
	 */
	void setNameStyle(NameStyleType value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.StringNameType#getNameStyle <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNameStyle()
	 * @see #getNameStyle()
	 * @see #setNameStyle(NameStyleType)
	 * @generated
	 */
	void unsetNameStyle();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.StringNameType#getNameStyle <em>Name Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name Style</em>' attribute is set.
	 * @see #unsetNameStyle()
	 * @see #getNameStyle()
	 * @see #setNameStyle(NameStyleType)
	 * @generated
	 */
	boolean isSetNameStyle();

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getStringNameType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.StringNameType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

} // StringNameType
