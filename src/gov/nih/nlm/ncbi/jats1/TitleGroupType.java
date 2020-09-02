/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getTransTitleGroup <em>Trans Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getAltTitle <em>Alt Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getFnGroup <em>Fn Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTitleGroupType()
 * @model extendedMetaData="name='title-group_._type' kind='elementOnly'"
 * @generated
 */
public interface TitleGroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Article Title</b></em>' containment reference.
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
	 * @return the value of the '<em>Article Title</em>' containment reference.
	 * @see #setArticleTitle(ArticleTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTitleGroupType_ArticleTitle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='article-title' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleTitleType getArticleTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getArticleTitle <em>Article Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Title</em>' containment reference.
	 * @see #getArticleTitle()
	 * @generated
	 */
	void setArticleTitle(ArticleTitleType value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SubtitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Subtitle</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTitleGroupType_Subtitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubtitleType> getSubtitle();

	/**
	 * Returns the value of the '<em><b>Trans Title Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TransTitleGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Title Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Title Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTitleGroupType_TransTitleGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trans-title-group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransTitleGroupType> getTransTitleGroup();

	/**
	 * Returns the value of the '<em><b>Alt Title</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AltTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Alternate Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Title</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTitleGroupType_AltTitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alt-title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AltTitleType> getAltTitle();

	/**
	 * Returns the value of the '<em><b>Fn Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Footnote Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fn Group</em>' containment reference.
	 * @see #setFnGroup(FnGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTitleGroupType_FnGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fn-group' namespace='##targetNamespace'"
	 * @generated
	 */
	FnGroupType getFnGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getFnGroup <em>Fn Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fn Group</em>' containment reference.
	 * @see #getFnGroup()
	 * @generated
	 */
	void setFnGroup(FnGroupType value);

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTitleGroupType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTitleGroupType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TitleGroupType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // TitleGroupType
