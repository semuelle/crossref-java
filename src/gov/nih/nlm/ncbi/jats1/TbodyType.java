/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tbody Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TbodyType#getTbodyContent <em>Tbody Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TbodyType#getTr <em>Tr</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TbodyType#getAlign <em>Align</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TbodyType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TbodyType#getChar <em>Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TbodyType#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TbodyType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TbodyType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TbodyType#getStyle <em>Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TbodyType#getValign <em>Valign</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType()
 * @model extendedMetaData="name='tbody_._type' kind='elementOnly'"
 * @generated
 */
public interface TbodyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tbody Content</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbody Content</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType_TbodyContent()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TbodyContent:0'"
	 * @generated
	 */
	FeatureMap getTbodyContent();

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType_Tr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tr' namespace='##targetNamespace' group='#TbodyContent:0'"
	 * @generated
	 */
	EList<TrType> getTr();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.nih.nlm.ncbi.jats1.AlignType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.AlignType3
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(AlignType3)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	AlignType3 getAlign();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.AlignType3
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(AlignType3 value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType3)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType3)
	 * @generated
	 */
	boolean isSetAlign();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' attribute.
	 * @see #setChar(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType_Char()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='char'"
	 * @generated
	 */
	String getChar();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getChar <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' attribute.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(String value);

	/**
	 * Returns the value of the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charoff</em>' attribute.
	 * @see #setCharoff(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType_Charoff()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='charoff'"
	 * @generated
	 */
	String getCharoff();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getCharoff <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charoff</em>' attribute.
	 * @see #getCharoff()
	 * @generated
	 */
	void setCharoff(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getContentType <em>Content Type</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Valign</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.nih.nlm.ncbi.jats1.ValignType5}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valign</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.ValignType5
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #setValign(ValignType5)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTbodyType_Valign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valign'"
	 * @generated
	 */
	ValignType5 getValign();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valign</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.ValignType5
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #getValign()
	 * @generated
	 */
	void setValign(ValignType5 value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType5)
	 * @generated
	 */
	void unsetValign();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.TbodyType#getValign <em>Valign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valign</em>' attribute is set.
	 * @see #unsetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType5)
	 * @generated
	 */
	boolean isSetValign();

} // TbodyType
