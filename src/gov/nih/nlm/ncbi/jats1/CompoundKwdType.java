/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Kwd Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getCompoundKwdPart <em>Compound Kwd Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getVocab <em>Vocab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getVocabIdentifier <em>Vocab Identifier</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getVocabTerm <em>Vocab Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getVocabTermIdentifier <em>Vocab Term Identifier</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCompoundKwdType()
 * @model extendedMetaData="name='compound-kwd_._type' kind='elementOnly'"
 * @generated
 */
public interface CompoundKwdType extends EObject {
	/**
	 * Returns the value of the '<em><b>Compound Kwd Part</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CompoundKwdPartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Compound Keyword Part</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound Kwd Part</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCompoundKwdType_CompoundKwdPart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compound-kwd-part' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompoundKwdPartType> getCompoundKwdPart();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCompoundKwdType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getBase <em>Base</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCompoundKwdType_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getContentType <em>Content Type</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCompoundKwdType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Vocab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocab</em>' attribute.
	 * @see #setVocab(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCompoundKwdType_Vocab()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='vocab'"
	 * @generated
	 */
	String getVocab();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getVocab <em>Vocab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocab</em>' attribute.
	 * @see #getVocab()
	 * @generated
	 */
	void setVocab(String value);

	/**
	 * Returns the value of the '<em><b>Vocab Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocab Identifier</em>' attribute.
	 * @see #setVocabIdentifier(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCompoundKwdType_VocabIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='vocab-identifier'"
	 * @generated
	 */
	String getVocabIdentifier();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getVocabIdentifier <em>Vocab Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocab Identifier</em>' attribute.
	 * @see #getVocabIdentifier()
	 * @generated
	 */
	void setVocabIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Vocab Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocab Term</em>' attribute.
	 * @see #setVocabTerm(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCompoundKwdType_VocabTerm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='vocab-term'"
	 * @generated
	 */
	String getVocabTerm();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getVocabTerm <em>Vocab Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocab Term</em>' attribute.
	 * @see #getVocabTerm()
	 * @generated
	 */
	void setVocabTerm(String value);

	/**
	 * Returns the value of the '<em><b>Vocab Term Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocab Term Identifier</em>' attribute.
	 * @see #setVocabTermIdentifier(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCompoundKwdType_VocabTermIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='vocab-term-identifier'"
	 * @generated
	 */
	String getVocabTermIdentifier();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CompoundKwdType#getVocabTermIdentifier <em>Vocab Term Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocab Term Identifier</em>' attribute.
	 * @see #getVocabTermIdentifier()
	 * @generated
	 */
	void setVocabTermIdentifier(String value);

} // CompoundKwdType
