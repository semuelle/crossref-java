/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CountsType#getCount <em>Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CountsType#getFigCount <em>Fig Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CountsType#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CountsType#getEquationCount <em>Equation Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CountsType#getRefCount <em>Ref Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CountsType#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CountsType#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CountsType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.CountsType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCountsType()
 * @model extendedMetaData="name='counts_._type' kind='elementOnly'"
 * @generated
 */
public interface CountsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCountsType_Count()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CountType> getCount();

	/**
	 * Returns the value of the '<em><b>Fig Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Figure Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fig Count</em>' containment reference.
	 * @see #setFigCount(FigCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCountsType_FigCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fig-count' namespace='##targetNamespace'"
	 * @generated
	 */
	FigCountType getFigCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CountsType#getFigCount <em>Fig Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fig Count</em>' containment reference.
	 * @see #getFigCount()
	 * @generated
	 */
	void setFigCount(FigCountType value);

	/**
	 * Returns the value of the '<em><b>Table Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Table Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Count</em>' containment reference.
	 * @see #setTableCount(TableCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCountsType_TableCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='table-count' namespace='##targetNamespace'"
	 * @generated
	 */
	TableCountType getTableCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CountsType#getTableCount <em>Table Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Count</em>' containment reference.
	 * @see #getTableCount()
	 * @generated
	 */
	void setTableCount(TableCountType value);

	/**
	 * Returns the value of the '<em><b>Equation Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Equation Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Equation Count</em>' containment reference.
	 * @see #setEquationCount(EquationCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCountsType_EquationCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='equation-count' namespace='##targetNamespace'"
	 * @generated
	 */
	EquationCountType getEquationCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CountsType#getEquationCount <em>Equation Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equation Count</em>' containment reference.
	 * @see #getEquationCount()
	 * @generated
	 */
	void setEquationCount(EquationCountType value);

	/**
	 * Returns the value of the '<em><b>Ref Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Reference Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Count</em>' containment reference.
	 * @see #setRefCount(RefCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCountsType_RefCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ref-count' namespace='##targetNamespace'"
	 * @generated
	 */
	RefCountType getRefCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CountsType#getRefCount <em>Ref Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Count</em>' containment reference.
	 * @see #getRefCount()
	 * @generated
	 */
	void setRefCount(RefCountType value);

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCountsType_PageCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page-count' namespace='##targetNamespace'"
	 * @generated
	 */
	PageCountType getPageCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CountsType#getPageCount <em>Page Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Count</em>' containment reference.
	 * @see #getPageCount()
	 * @generated
	 */
	void setPageCount(PageCountType value);

	/**
	 * Returns the value of the '<em><b>Word Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Word Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Word Count</em>' containment reference.
	 * @see #setWordCount(WordCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCountsType_WordCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='word-count' namespace='##targetNamespace'"
	 * @generated
	 */
	WordCountType getWordCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CountsType#getWordCount <em>Word Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Count</em>' containment reference.
	 * @see #getWordCount()
	 * @generated
	 */
	void setWordCount(WordCountType value);

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCountsType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CountsType#getBase <em>Base</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getCountsType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.CountsType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // CountsType
