/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getCol <em>Col</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getThead <em>Thead</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getTbody <em>Tbody</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getTr <em>Tr</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getBorder <em>Border</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getCellpadding <em>Cellpadding</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getCellspacing <em>Cellspacing</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getFrame <em>Frame</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getRules <em>Rules</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getStyle <em>Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getSummary <em>Summary</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableType#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType()
 * @model extendedMetaData="name='table_._type' kind='elementOnly'"
 * @generated
 */
public interface TableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Col</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ColType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Col()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='col' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColType> getCol();

	/**
	 * Returns the value of the '<em><b>Colgroup</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ColgroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Colgroup</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Colgroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='colgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColgroupType> getColgroup();

	/**
	 * Returns the value of the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thead</em>' containment reference.
	 * @see #setThead(TheadType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Thead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thead' namespace='##targetNamespace'"
	 * @generated
	 */
	TheadType getThead();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getThead <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thead</em>' containment reference.
	 * @see #getThead()
	 * @generated
	 */
	void setThead(TheadType value);

	/**
	 * Returns the value of the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tfoot</em>' containment reference.
	 * @see #setTfoot(TfootType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Tfoot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tfoot' namespace='##targetNamespace'"
	 * @generated
	 */
	TfootType getTfoot();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getTfoot <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tfoot</em>' containment reference.
	 * @see #getTfoot()
	 * @generated
	 */
	void setTfoot(TfootType value);

	/**
	 * Returns the value of the '<em><b>Tbody</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TbodyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tbody</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Tbody()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tbody' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TbodyType> getTbody();

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Tr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TrType> getTr();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Border()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='border'"
	 * @generated
	 */
	String getBorder();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(String value);

	/**
	 * Returns the value of the '<em><b>Cellpadding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellpadding</em>' attribute.
	 * @see #setCellpadding(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Cellpadding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cellpadding'"
	 * @generated
	 */
	String getCellpadding();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getCellpadding <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellpadding</em>' attribute.
	 * @see #getCellpadding()
	 * @generated
	 */
	void setCellpadding(String value);

	/**
	 * Returns the value of the '<em><b>Cellspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellspacing</em>' attribute.
	 * @see #setCellspacing(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Cellspacing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cellspacing'"
	 * @generated
	 */
	String getCellspacing();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getCellspacing <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellspacing</em>' attribute.
	 * @see #getCellspacing()
	 * @generated
	 */
	void setCellspacing(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.nih.nlm.ncbi.jats1.FrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.FrameType
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #setFrame(FrameType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Frame()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='frame'"
	 * @generated
	 */
	FrameType getFrame();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.FrameType
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(FrameType value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrame()
	 * @see #getFrame()
	 * @see #setFrame(FrameType)
	 * @generated
	 */
	void unsetFrame();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getFrame <em>Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame</em>' attribute is set.
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @see #setFrame(FrameType)
	 * @generated
	 */
	boolean isSetFrame();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.nih.nlm.ncbi.jats1.RulesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.RulesType
	 * @see #isSetRules()
	 * @see #unsetRules()
	 * @see #setRules(RulesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Rules()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rules'"
	 * @generated
	 */
	RulesType getRules();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getRules <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.RulesType
	 * @see #isSetRules()
	 * @see #unsetRules()
	 * @see #getRules()
	 * @generated
	 */
	void setRules(RulesType value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getRules <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRules()
	 * @see #getRules()
	 * @see #setRules(RulesType)
	 * @generated
	 */
	void unsetRules();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getRules <em>Rules</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rules</em>' attribute is set.
	 * @see #unsetRules()
	 * @see #getRules()
	 * @see #setRules(RulesType)
	 * @generated
	 */
	boolean isSetRules();

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Summary()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='summary'"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableType_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // TableType
