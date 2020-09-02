/**
 */
package org.w3._1998.math.math.ml;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mtable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getTableRowExpressionGroup <em>Table Row Expression Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getTableRowExpression <em>Table Row Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getAlignmentscope <em>Alignmentscope</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getColumnalign <em>Columnalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getColumnlines <em>Columnlines</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getColumnspacing <em>Columnspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getColumnwidth <em>Columnwidth</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getDisplaystyle <em>Displaystyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getEqualcolumns <em>Equalcolumns</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getEqualrows <em>Equalrows</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getFramespacing <em>Framespacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getGroupalign <em>Groupalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getMinlabelspacing <em>Minlabelspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getRowalign <em>Rowalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getRowlines <em>Rowlines</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getRowspacing <em>Rowspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getSide <em>Side</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getWidth <em>Width</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MtableType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType()
 * @model extendedMetaData="name='mtable_._type' kind='elementOnly'"
 * @generated
 */
public interface MtableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Row Expression Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Row Expression Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_TableRowExpressionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TableRowExpression:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTableRowExpressionGroup();

	/**
	 * Returns the value of the '<em><b>Table Row Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Row Expression</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_TableRowExpression()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TableRowExpression' namespace='##targetNamespace' group='TableRowExpression:group'"
	 * @generated
	 */
	EList<EObject> getTableRowExpression();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see #setAlign(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Align()
	 * @model dataType="org.w3._1998.math.math.ml.AlignType4"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	String getAlign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(String value);

	/**
	 * Returns the value of the '<em><b>Alignmentscope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignmentscope</em>' attribute.
	 * @see #setAlignmentscope(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Alignmentscope()
	 * @model dataType="org.w3._1998.math.math.ml.AlignmentscopeType" many="false"
	 *        extendedMetaData="kind='attribute' name='alignmentscope'"
	 * @generated
	 */
	List<AlignmentscopeTypeBaseItem> getAlignmentscope();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getAlignmentscope <em>Alignmentscope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignmentscope</em>' attribute.
	 * @see #getAlignmentscope()
	 * @generated
	 */
	void setAlignmentscope(List<AlignmentscopeTypeBaseItem> value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Columnalign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnalign</em>' attribute.
	 * @see #setColumnalign(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Columnalign()
	 * @model dataType="org.w3._1998.math.math.ml.ColumnalignType1" many="false"
	 *        extendedMetaData="kind='attribute' name='columnalign'"
	 * @generated
	 */
	List<Columnalignstyle> getColumnalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getColumnalign <em>Columnalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnalign</em>' attribute.
	 * @see #getColumnalign()
	 * @generated
	 */
	void setColumnalign(List<Columnalignstyle> value);

	/**
	 * Returns the value of the '<em><b>Columnlines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnlines</em>' attribute.
	 * @see #setColumnlines(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Columnlines()
	 * @model dataType="org.w3._1998.math.math.ml.ColumnlinesType" many="false"
	 *        extendedMetaData="kind='attribute' name='columnlines'"
	 * @generated
	 */
	List<Linestyle> getColumnlines();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getColumnlines <em>Columnlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnlines</em>' attribute.
	 * @see #getColumnlines()
	 * @generated
	 */
	void setColumnlines(List<Linestyle> value);

	/**
	 * Returns the value of the '<em><b>Columnspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnspacing</em>' attribute.
	 * @see #setColumnspacing(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Columnspacing()
	 * @model dataType="org.w3._1998.math.math.ml.ColumnspacingType" many="false"
	 *        extendedMetaData="kind='attribute' name='columnspacing'"
	 * @generated
	 */
	List<String> getColumnspacing();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getColumnspacing <em>Columnspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnspacing</em>' attribute.
	 * @see #getColumnspacing()
	 * @generated
	 */
	void setColumnspacing(List<String> value);

	/**
	 * Returns the value of the '<em><b>Columnwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnwidth</em>' attribute.
	 * @see #setColumnwidth(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Columnwidth()
	 * @model dataType="org.w3._1998.math.math.ml.ColumnwidthType" many="false"
	 *        extendedMetaData="kind='attribute' name='columnwidth'"
	 * @generated
	 */
	List<Object> getColumnwidth();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getColumnwidth <em>Columnwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnwidth</em>' attribute.
	 * @see #getColumnwidth()
	 * @generated
	 */
	void setColumnwidth(List<Object> value);

	/**
	 * Returns the value of the '<em><b>Displaystyle</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.DisplaystyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displaystyle</em>' attribute.
	 * @see org.w3._1998.math.math.ml.DisplaystyleType
	 * @see #isSetDisplaystyle()
	 * @see #unsetDisplaystyle()
	 * @see #setDisplaystyle(DisplaystyleType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Displaystyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='displaystyle'"
	 * @generated
	 */
	DisplaystyleType getDisplaystyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getDisplaystyle <em>Displaystyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displaystyle</em>' attribute.
	 * @see org.w3._1998.math.math.ml.DisplaystyleType
	 * @see #isSetDisplaystyle()
	 * @see #unsetDisplaystyle()
	 * @see #getDisplaystyle()
	 * @generated
	 */
	void setDisplaystyle(DisplaystyleType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getDisplaystyle <em>Displaystyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplaystyle()
	 * @see #getDisplaystyle()
	 * @see #setDisplaystyle(DisplaystyleType)
	 * @generated
	 */
	void unsetDisplaystyle();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MtableType#getDisplaystyle <em>Displaystyle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displaystyle</em>' attribute is set.
	 * @see #unsetDisplaystyle()
	 * @see #getDisplaystyle()
	 * @see #setDisplaystyle(DisplaystyleType)
	 * @generated
	 */
	boolean isSetDisplaystyle();

	/**
	 * Returns the value of the '<em><b>Equalcolumns</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.EqualcolumnsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equalcolumns</em>' attribute.
	 * @see org.w3._1998.math.math.ml.EqualcolumnsType
	 * @see #isSetEqualcolumns()
	 * @see #unsetEqualcolumns()
	 * @see #setEqualcolumns(EqualcolumnsType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Equalcolumns()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='equalcolumns'"
	 * @generated
	 */
	EqualcolumnsType getEqualcolumns();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getEqualcolumns <em>Equalcolumns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equalcolumns</em>' attribute.
	 * @see org.w3._1998.math.math.ml.EqualcolumnsType
	 * @see #isSetEqualcolumns()
	 * @see #unsetEqualcolumns()
	 * @see #getEqualcolumns()
	 * @generated
	 */
	void setEqualcolumns(EqualcolumnsType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getEqualcolumns <em>Equalcolumns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEqualcolumns()
	 * @see #getEqualcolumns()
	 * @see #setEqualcolumns(EqualcolumnsType)
	 * @generated
	 */
	void unsetEqualcolumns();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MtableType#getEqualcolumns <em>Equalcolumns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Equalcolumns</em>' attribute is set.
	 * @see #unsetEqualcolumns()
	 * @see #getEqualcolumns()
	 * @see #setEqualcolumns(EqualcolumnsType)
	 * @generated
	 */
	boolean isSetEqualcolumns();

	/**
	 * Returns the value of the '<em><b>Equalrows</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.EqualrowsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equalrows</em>' attribute.
	 * @see org.w3._1998.math.math.ml.EqualrowsType
	 * @see #isSetEqualrows()
	 * @see #unsetEqualrows()
	 * @see #setEqualrows(EqualrowsType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Equalrows()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='equalrows'"
	 * @generated
	 */
	EqualrowsType getEqualrows();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getEqualrows <em>Equalrows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equalrows</em>' attribute.
	 * @see org.w3._1998.math.math.ml.EqualrowsType
	 * @see #isSetEqualrows()
	 * @see #unsetEqualrows()
	 * @see #getEqualrows()
	 * @generated
	 */
	void setEqualrows(EqualrowsType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getEqualrows <em>Equalrows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEqualrows()
	 * @see #getEqualrows()
	 * @see #setEqualrows(EqualrowsType)
	 * @generated
	 */
	void unsetEqualrows();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MtableType#getEqualrows <em>Equalrows</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Equalrows</em>' attribute is set.
	 * @see #unsetEqualrows()
	 * @see #getEqualrows()
	 * @see #setEqualrows(EqualrowsType)
	 * @generated
	 */
	boolean isSetEqualrows();

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.Linestyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see org.w3._1998.math.math.ml.Linestyle
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #setFrame(Linestyle)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Frame()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='frame'"
	 * @generated
	 */
	Linestyle getFrame();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see org.w3._1998.math.math.ml.Linestyle
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(Linestyle value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrame()
	 * @see #getFrame()
	 * @see #setFrame(Linestyle)
	 * @generated
	 */
	void unsetFrame();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MtableType#getFrame <em>Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame</em>' attribute is set.
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @see #setFrame(Linestyle)
	 * @generated
	 */
	boolean isSetFrame();

	/**
	 * Returns the value of the '<em><b>Framespacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framespacing</em>' attribute.
	 * @see #setFramespacing(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Framespacing()
	 * @model dataType="org.w3._1998.math.math.ml.FramespacingType" many="false"
	 *        extendedMetaData="kind='attribute' name='framespacing'"
	 * @generated
	 */
	List<String> getFramespacing();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getFramespacing <em>Framespacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framespacing</em>' attribute.
	 * @see #getFramespacing()
	 * @generated
	 */
	void setFramespacing(List<String> value);

	/**
	 * Returns the value of the '<em><b>Groupalign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupalign</em>' attribute.
	 * @see #setGroupalign(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Groupalign()
	 * @model dataType="org.w3._1998.math.math.ml.GroupAlignmentListList"
	 *        extendedMetaData="kind='attribute' name='groupalign'"
	 * @generated
	 */
	String getGroupalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getGroupalign <em>Groupalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupalign</em>' attribute.
	 * @see #getGroupalign()
	 * @generated
	 */
	void setGroupalign(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Mathbackground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathbackground</em>' attribute.
	 * @see #setMathbackground(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getMathbackground <em>Mathbackground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathbackground</em>' attribute.
	 * @see #getMathbackground()
	 * @generated
	 */
	void setMathbackground(Object value);

	/**
	 * Returns the value of the '<em><b>Mathcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathcolor</em>' attribute.
	 * @see #setMathcolor(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getMathcolor <em>Mathcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathcolor</em>' attribute.
	 * @see #getMathcolor()
	 * @generated
	 */
	void setMathcolor(String value);

	/**
	 * Returns the value of the '<em><b>Minlabelspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minlabelspacing</em>' attribute.
	 * @see #setMinlabelspacing(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Minlabelspacing()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='minlabelspacing'"
	 * @generated
	 */
	String getMinlabelspacing();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getMinlabelspacing <em>Minlabelspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minlabelspacing</em>' attribute.
	 * @see #getMinlabelspacing()
	 * @generated
	 */
	void setMinlabelspacing(String value);

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Object value);

	/**
	 * Returns the value of the '<em><b>Rowalign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowalign</em>' attribute.
	 * @see #setRowalign(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Rowalign()
	 * @model dataType="org.w3._1998.math.math.ml.RowalignType1" many="false"
	 *        extendedMetaData="kind='attribute' name='rowalign'"
	 * @generated
	 */
	List<Verticalalign> getRowalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getRowalign <em>Rowalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowalign</em>' attribute.
	 * @see #getRowalign()
	 * @generated
	 */
	void setRowalign(List<Verticalalign> value);

	/**
	 * Returns the value of the '<em><b>Rowlines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowlines</em>' attribute.
	 * @see #setRowlines(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Rowlines()
	 * @model dataType="org.w3._1998.math.math.ml.RowlinesType" many="false"
	 *        extendedMetaData="kind='attribute' name='rowlines'"
	 * @generated
	 */
	List<Linestyle> getRowlines();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getRowlines <em>Rowlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowlines</em>' attribute.
	 * @see #getRowlines()
	 * @generated
	 */
	void setRowlines(List<Linestyle> value);

	/**
	 * Returns the value of the '<em><b>Rowspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowspacing</em>' attribute.
	 * @see #setRowspacing(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Rowspacing()
	 * @model dataType="org.w3._1998.math.math.ml.RowspacingType" many="false"
	 *        extendedMetaData="kind='attribute' name='rowspacing'"
	 * @generated
	 */
	List<String> getRowspacing();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getRowspacing <em>Rowspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowspacing</em>' attribute.
	 * @see #getRowspacing()
	 * @generated
	 */
	void setRowspacing(List<String> value);

	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.SideType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see org.w3._1998.math.math.ml.SideType
	 * @see #isSetSide()
	 * @see #unsetSide()
	 * @see #setSide(SideType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Side()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='side'"
	 * @generated
	 */
	SideType getSide();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see org.w3._1998.math.math.ml.SideType
	 * @see #isSetSide()
	 * @see #unsetSide()
	 * @see #getSide()
	 * @generated
	 */
	void setSide(SideType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSide()
	 * @see #getSide()
	 * @see #setSide(SideType)
	 * @generated
	 */
	void unsetSide();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MtableType#getSide <em>Side</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Side</em>' attribute is set.
	 * @see #unsetSide()
	 * @see #getSide()
	 * @see #setSide(SideType)
	 * @generated
	 */
	boolean isSetSide();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Width()
	 * @model dataType="org.w3._1998.math.math.ml.WidthType"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	Object getWidth();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Object value);

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xref</em>' attribute.
	 * @see #setXref(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MtableType#getXref <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xref</em>' attribute.
	 * @see #getXref()
	 * @generated
	 */
	void setXref(Object value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMtableType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':28' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MtableType
