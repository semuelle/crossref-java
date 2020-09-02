/**
 */
package org.w3._1998.math.math.ml;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Msgroup Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getMstackExpression <em>Mstack Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getMscarries <em>Mscarries</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getMsline <em>Msline</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getMsrow <em>Msrow</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getMsgroup <em>Msgroup</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getPosition <em>Position</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getShift <em>Shift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsgroupType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType()
 * @model extendedMetaData="name='msgroup_._type' kind='elementOnly'"
 * @generated
 */
public interface MsgroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mstack Expression</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mstack Expression</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_MstackExpression()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Mscarries()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Msline()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Msrow()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Msgroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgroup' namespace='##targetNamespace' group='#MstackExpression:0'"
	 * @generated
	 */
	EList<MsgroupType> getMsgroup();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsgroupType#getClass_ <em>Class</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsgroupType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsgroupType#getId <em>Id</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsgroupType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsgroupType#getMathcolor <em>Mathcolor</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsgroupType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Object value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(BigInteger)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Position()
	 * @model dataType="org.w3._1998.math.math.ml.Integer"
	 *        extendedMetaData="kind='attribute' name='position'"
	 * @generated
	 */
	BigInteger getPosition();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsgroupType#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' attribute.
	 * @see #setShift(BigInteger)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Shift()
	 * @model dataType="org.w3._1998.math.math.ml.Integer"
	 *        extendedMetaData="kind='attribute' name='shift'"
	 * @generated
	 */
	BigInteger getShift();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsgroupType#getShift <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' attribute.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsgroupType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsgroupType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsgroupType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':15' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MsgroupType
