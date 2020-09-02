/**
 */
package org.w3._1998.math.math.ml;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mmultiscripts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getMultiScriptExpression <em>Multi Script Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getNone <em>None</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getNone1 <em>None1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getMprescripts <em>Mprescripts</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getMultiScriptExpression1 <em>Multi Script Expression1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getNone2 <em>None2</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getNone3 <em>None3</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getSubscriptshift <em>Subscriptshift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getSuperscriptshift <em>Superscriptshift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MmultiscriptsType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType()
 * @model extendedMetaData="name='mmultiscripts_._type' kind='elementOnly'"
 * @generated
 */
public interface MmultiscriptsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Multi Script Expression</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Script Expression</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_MultiScriptExpression()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MultiScriptExpression:0'"
	 * @generated
	 */
	FeatureMap getMultiScriptExpression();

	/**
	 * Returns the value of the '<em><b>None</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NoneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_None()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='none' namespace='##targetNamespace' group='#MultiScriptExpression:0'"
	 * @generated
	 */
	EList<NoneType> getNone();

	/**
	 * Returns the value of the '<em><b>None1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NoneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_None1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='none' namespace='##targetNamespace' group='#MultiScriptExpression:0'"
	 * @generated
	 */
	EList<NoneType> getNone1();

	/**
	 * Returns the value of the '<em><b>Mprescripts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mprescripts</em>' containment reference.
	 * @see #setMprescripts(MprescriptsType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Mprescripts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mprescripts' namespace='##targetNamespace'"
	 * @generated
	 */
	MprescriptsType getMprescripts();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getMprescripts <em>Mprescripts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mprescripts</em>' containment reference.
	 * @see #getMprescripts()
	 * @generated
	 */
	void setMprescripts(MprescriptsType value);

	/**
	 * Returns the value of the '<em><b>Multi Script Expression1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Script Expression1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_MultiScriptExpression1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MultiScriptExpression:4'"
	 * @generated
	 */
	FeatureMap getMultiScriptExpression1();

	/**
	 * Returns the value of the '<em><b>None2</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NoneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None2</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_None2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='none' namespace='##targetNamespace' group='#MultiScriptExpression:4'"
	 * @generated
	 */
	EList<NoneType> getNone2();

	/**
	 * Returns the value of the '<em><b>None3</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NoneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None3</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_None3()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='none' namespace='##targetNamespace' group='#MultiScriptExpression:4'"
	 * @generated
	 */
	EList<NoneType> getNone3();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getClass_ <em>Class</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getId <em>Id</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getMathcolor <em>Mathcolor</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Object value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Subscriptshift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptshift</em>' attribute.
	 * @see #setSubscriptshift(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Subscriptshift()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='subscriptshift'"
	 * @generated
	 */
	String getSubscriptshift();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getSubscriptshift <em>Subscriptshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriptshift</em>' attribute.
	 * @see #getSubscriptshift()
	 * @generated
	 */
	void setSubscriptshift(String value);

	/**
	 * Returns the value of the '<em><b>Superscriptshift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superscriptshift</em>' attribute.
	 * @see #setSuperscriptshift(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Superscriptshift()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='superscriptshift'"
	 * @generated
	 */
	String getSuperscriptshift();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getSuperscriptshift <em>Superscriptshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superscriptshift</em>' attribute.
	 * @see #getSuperscriptshift()
	 * @generated
	 */
	void setSuperscriptshift(String value);

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xref</em>' attribute.
	 * @see #setXref(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MmultiscriptsType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMmultiscriptsType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':17' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MmultiscriptsType
