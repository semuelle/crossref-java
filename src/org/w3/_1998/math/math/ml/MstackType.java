/**
 */
package org.w3._1998.math.math.ml;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mstack Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getMstackExpression <em>Mstack Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getMscarries <em>Mscarries</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getMsline <em>Msline</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getMsrow <em>Msrow</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getMsgroup <em>Msgroup</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getCharalign <em>Charalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getCharspacing <em>Charspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getStackalign <em>Stackalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MstackType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType()
 * @model extendedMetaData="name='mstack_._type' kind='elementOnly'"
 * @generated
 */
public interface MstackType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mstack Expression</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mstack Expression</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_MstackExpression()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MstackExpression:0'"
	 * @generated
	 */
	FeatureMap getMstackExpression();

	/**
	 * Returns the value of the '<em><b>Mscarries</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MscarriesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mscarries</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Mscarries()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mscarries' namespace='##targetNamespace' group='#MstackExpression:0'"
	 * @generated
	 */
	EList<MscarriesType> getMscarries();

	/**
	 * Returns the value of the '<em><b>Msline</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MslineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msline</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Msline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msline' namespace='##targetNamespace' group='#MstackExpression:0'"
	 * @generated
	 */
	EList<MslineType> getMsline();

	/**
	 * Returns the value of the '<em><b>Msrow</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MsrowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msrow</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Msrow()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msrow' namespace='##targetNamespace' group='#MstackExpression:0'"
	 * @generated
	 */
	EList<MsrowType> getMsrow();

	/**
	 * Returns the value of the '<em><b>Msgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MsgroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgroup</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Msgroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgroup' namespace='##targetNamespace' group='#MstackExpression:0'"
	 * @generated
	 */
	EList<MsgroupType> getMsgroup();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see #setAlign(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Align()
	 * @model dataType="org.w3._1998.math.math.ml.AlignType3"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	String getAlign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(String value);

	/**
	 * Returns the value of the '<em><b>Charalign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.CharalignType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.CharalignType
	 * @see #isSetCharalign()
	 * @see #unsetCharalign()
	 * @see #setCharalign(CharalignType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Charalign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='charalign'"
	 * @generated
	 */
	CharalignType getCharalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getCharalign <em>Charalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.CharalignType
	 * @see #isSetCharalign()
	 * @see #unsetCharalign()
	 * @see #getCharalign()
	 * @generated
	 */
	void setCharalign(CharalignType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getCharalign <em>Charalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCharalign()
	 * @see #getCharalign()
	 * @see #setCharalign(CharalignType)
	 * @generated
	 */
	void unsetCharalign();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MstackType#getCharalign <em>Charalign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charalign</em>' attribute is set.
	 * @see #unsetCharalign()
	 * @see #getCharalign()
	 * @see #setCharalign(CharalignType)
	 * @generated
	 */
	boolean isSetCharalign();

	/**
	 * Returns the value of the '<em><b>Charspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charspacing</em>' attribute.
	 * @see #setCharspacing(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Charspacing()
	 * @model dataType="org.w3._1998.math.math.ml.CharspacingType"
	 *        extendedMetaData="kind='attribute' name='charspacing'"
	 * @generated
	 */
	Object getCharspacing();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getCharspacing <em>Charspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charspacing</em>' attribute.
	 * @see #getCharspacing()
	 * @generated
	 */
	void setCharspacing(Object value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getId <em>Id</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getMathcolor <em>Mathcolor</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Object value);

	/**
	 * Returns the value of the '<em><b>Stackalign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.StackalignType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stackalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.StackalignType
	 * @see #isSetStackalign()
	 * @see #unsetStackalign()
	 * @see #setStackalign(StackalignType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Stackalign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='stackalign'"
	 * @generated
	 */
	StackalignType getStackalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getStackalign <em>Stackalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stackalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.StackalignType
	 * @see #isSetStackalign()
	 * @see #unsetStackalign()
	 * @see #getStackalign()
	 * @generated
	 */
	void setStackalign(StackalignType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getStackalign <em>Stackalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStackalign()
	 * @see #getStackalign()
	 * @see #setStackalign(StackalignType)
	 * @generated
	 */
	void unsetStackalign();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MstackType#getStackalign <em>Stackalign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stackalign</em>' attribute is set.
	 * @see #unsetStackalign()
	 * @see #getStackalign()
	 * @see #setStackalign(StackalignType)
	 * @generated
	 */
	boolean isSetStackalign();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MstackType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMstackType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':17' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MstackType
