/**
 */
package org.w3._1998.math.math.ml;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell Expression Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getColumnalign <em>Columnalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getColumnspan <em>Columnspan</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getGroupalign <em>Groupalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getRowalign <em>Rowalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.TableCellExpressionType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType()
 * @model extendedMetaData="name='TableCellExpression_._type' kind='elementOnly'"
 * @generated
 */
public interface TableCellExpressionType extends ImpliedMrow {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Columnalign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.Columnalignstyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.Columnalignstyle
	 * @see #isSetColumnalign()
	 * @see #unsetColumnalign()
	 * @see #setColumnalign(Columnalignstyle)
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Columnalign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='columnalign'"
	 * @generated
	 */
	Columnalignstyle getColumnalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getColumnalign <em>Columnalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.Columnalignstyle
	 * @see #isSetColumnalign()
	 * @see #unsetColumnalign()
	 * @see #getColumnalign()
	 * @generated
	 */
	void setColumnalign(Columnalignstyle value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getColumnalign <em>Columnalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColumnalign()
	 * @see #getColumnalign()
	 * @see #setColumnalign(Columnalignstyle)
	 * @generated
	 */
	void unsetColumnalign();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getColumnalign <em>Columnalign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Columnalign</em>' attribute is set.
	 * @see #unsetColumnalign()
	 * @see #getColumnalign()
	 * @see #setColumnalign(Columnalignstyle)
	 * @generated
	 */
	boolean isSetColumnalign();

	/**
	 * Returns the value of the '<em><b>Columnspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnspan</em>' attribute.
	 * @see #setColumnspan(BigInteger)
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Columnspan()
	 * @model dataType="org.w3._1998.math.math.ml.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='columnspan'"
	 * @generated
	 */
	BigInteger getColumnspan();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getColumnspan <em>Columnspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnspan</em>' attribute.
	 * @see #getColumnspan()
	 * @generated
	 */
	void setColumnspan(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Groupalign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupalign</em>' attribute.
	 * @see #setGroupalign(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Groupalign()
	 * @model dataType="org.w3._1998.math.math.ml.GroupAlignmentList" many="false"
	 *        extendedMetaData="kind='attribute' name='groupalign'"
	 * @generated
	 */
	List<GroupAlignment> getGroupalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getGroupalign <em>Groupalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupalign</em>' attribute.
	 * @see #getGroupalign()
	 * @generated
	 */
	void setGroupalign(List<GroupAlignment> value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getId <em>Id</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getMathcolor <em>Mathcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathcolor</em>' attribute.
	 * @see #getMathcolor()
	 * @generated
	 */
	void setMathcolor(String value);

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Object value);

	/**
	 * Returns the value of the '<em><b>Rowalign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.RowalignType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.RowalignType2
	 * @see #isSetRowalign()
	 * @see #unsetRowalign()
	 * @see #setRowalign(RowalignType2)
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Rowalign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rowalign'"
	 * @generated
	 */
	RowalignType2 getRowalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getRowalign <em>Rowalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.RowalignType2
	 * @see #isSetRowalign()
	 * @see #unsetRowalign()
	 * @see #getRowalign()
	 * @generated
	 */
	void setRowalign(RowalignType2 value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getRowalign <em>Rowalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowalign()
	 * @see #getRowalign()
	 * @see #setRowalign(RowalignType2)
	 * @generated
	 */
	void unsetRowalign();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getRowalign <em>Rowalign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rowalign</em>' attribute is set.
	 * @see #unsetRowalign()
	 * @see #getRowalign()
	 * @see #setRowalign(RowalignType2)
	 * @generated
	 */
	boolean isSetRowalign();

	/**
	 * Returns the value of the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowspan</em>' attribute.
	 * @see #setRowspan(BigInteger)
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Rowspan()
	 * @model dataType="org.w3._1998.math.math.ml.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='rowspan'"
	 * @generated
	 */
	BigInteger getRowspan();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getRowspan <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowspan</em>' attribute.
	 * @see #getRowspan()
	 * @generated
	 */
	void setRowspan(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xref</em>' attribute.
	 * @see #setXref(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.TableCellExpressionType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getTableCellExpressionType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':13' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // TableCellExpressionType
