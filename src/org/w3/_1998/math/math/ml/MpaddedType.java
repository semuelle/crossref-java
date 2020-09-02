/**
 */
package org.w3._1998.math.math.ml;

import java.util.List;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mpadded Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getLspace <em>Lspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getVoffset <em>Voffset</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getWidth <em>Width</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MpaddedType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType()
 * @model extendedMetaData="name='mpadded_._type' kind='elementOnly'"
 * @generated
 */
public interface MpaddedType extends ImpliedMrow {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Depth()
	 * @model dataType="org.w3._1998.math.math.ml.MpaddedLength"
	 *        extendedMetaData="kind='attribute' name='depth'"
	 * @generated
	 */
	String getDepth();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Height()
	 * @model dataType="org.w3._1998.math.math.ml.MpaddedLength"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lspace</em>' attribute.
	 * @see #setLspace(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Lspace()
	 * @model dataType="org.w3._1998.math.math.ml.MpaddedLength"
	 *        extendedMetaData="kind='attribute' name='lspace'"
	 * @generated
	 */
	String getLspace();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getLspace <em>Lspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lspace</em>' attribute.
	 * @see #getLspace()
	 * @generated
	 */
	void setLspace(String value);

	/**
	 * Returns the value of the '<em><b>Mathbackground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathbackground</em>' attribute.
	 * @see #setMathbackground(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getMathcolor <em>Mathcolor</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getOther <em>Other</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Voffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voffset</em>' attribute.
	 * @see #setVoffset(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Voffset()
	 * @model dataType="org.w3._1998.math.math.ml.MpaddedLength"
	 *        extendedMetaData="kind='attribute' name='voffset'"
	 * @generated
	 */
	String getVoffset();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getVoffset <em>Voffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voffset</em>' attribute.
	 * @see #getVoffset()
	 * @generated
	 */
	void setVoffset(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Width()
	 * @model dataType="org.w3._1998.math.math.ml.MpaddedLength"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xref</em>' attribute.
	 * @see #setXref(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MpaddedType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMpaddedType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':13' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MpaddedType
