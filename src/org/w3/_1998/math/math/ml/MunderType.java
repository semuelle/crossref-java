/**
 */
package org.w3._1998.math.math.ml;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Munder Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getAccentunder <em>Accentunder</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MunderType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType()
 * @model extendedMetaData="name='munder_._type' kind='elementOnly'"
 * @generated
 */
public interface MunderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Accentunder</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.AccentunderType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accentunder</em>' attribute.
	 * @see org.w3._1998.math.math.ml.AccentunderType1
	 * @see #isSetAccentunder()
	 * @see #unsetAccentunder()
	 * @see #setAccentunder(AccentunderType1)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_Accentunder()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='accentunder'"
	 * @generated
	 */
	AccentunderType1 getAccentunder();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getAccentunder <em>Accentunder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accentunder</em>' attribute.
	 * @see org.w3._1998.math.math.ml.AccentunderType1
	 * @see #isSetAccentunder()
	 * @see #unsetAccentunder()
	 * @see #getAccentunder()
	 * @generated
	 */
	void setAccentunder(AccentunderType1 value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getAccentunder <em>Accentunder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccentunder()
	 * @see #getAccentunder()
	 * @see #setAccentunder(AccentunderType1)
	 * @generated
	 */
	void unsetAccentunder();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MunderType#getAccentunder <em>Accentunder</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accentunder</em>' attribute is set.
	 * @see #unsetAccentunder()
	 * @see #getAccentunder()
	 * @see #setAccentunder(AccentunderType1)
	 * @generated
	 */
	boolean isSetAccentunder();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.AlignType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.w3._1998.math.math.ml.AlignType2
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(AlignType2)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	AlignType2 getAlign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.w3._1998.math.math.ml.AlignType2
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(AlignType2 value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType2)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MunderType#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType2)
	 * @generated
	 */
	boolean isSetAlign();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getClass_ <em>Class</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getId <em>Id</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getMathcolor <em>Mathcolor</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getOther <em>Other</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MunderType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMunderType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':10' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MunderType
