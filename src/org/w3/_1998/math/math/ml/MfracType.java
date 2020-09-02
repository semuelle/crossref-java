/**
 */
package org.w3._1998.math.math.ml;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mfrac Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getBevelled <em>Bevelled</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getDenomalign <em>Denomalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getLinethickness <em>Linethickness</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getNumalign <em>Numalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MfracType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType()
 * @model extendedMetaData="name='mfrac_._type' kind='elementOnly'"
 * @generated
 */
public interface MfracType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bevelled</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.BevelledType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bevelled</em>' attribute.
	 * @see org.w3._1998.math.math.ml.BevelledType
	 * @see #isSetBevelled()
	 * @see #unsetBevelled()
	 * @see #setBevelled(BevelledType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Bevelled()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='bevelled'"
	 * @generated
	 */
	BevelledType getBevelled();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getBevelled <em>Bevelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bevelled</em>' attribute.
	 * @see org.w3._1998.math.math.ml.BevelledType
	 * @see #isSetBevelled()
	 * @see #unsetBevelled()
	 * @see #getBevelled()
	 * @generated
	 */
	void setBevelled(BevelledType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getBevelled <em>Bevelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBevelled()
	 * @see #getBevelled()
	 * @see #setBevelled(BevelledType)
	 * @generated
	 */
	void unsetBevelled();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MfracType#getBevelled <em>Bevelled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bevelled</em>' attribute is set.
	 * @see #unsetBevelled()
	 * @see #getBevelled()
	 * @see #setBevelled(BevelledType)
	 * @generated
	 */
	boolean isSetBevelled();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Denomalign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.DenomalignType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denomalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.DenomalignType
	 * @see #isSetDenomalign()
	 * @see #unsetDenomalign()
	 * @see #setDenomalign(DenomalignType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Denomalign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='denomalign'"
	 * @generated
	 */
	DenomalignType getDenomalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getDenomalign <em>Denomalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denomalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.DenomalignType
	 * @see #isSetDenomalign()
	 * @see #unsetDenomalign()
	 * @see #getDenomalign()
	 * @generated
	 */
	void setDenomalign(DenomalignType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getDenomalign <em>Denomalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDenomalign()
	 * @see #getDenomalign()
	 * @see #setDenomalign(DenomalignType)
	 * @generated
	 */
	void unsetDenomalign();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MfracType#getDenomalign <em>Denomalign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Denomalign</em>' attribute is set.
	 * @see #unsetDenomalign()
	 * @see #getDenomalign()
	 * @see #setDenomalign(DenomalignType)
	 * @generated
	 */
	boolean isSetDenomalign();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Linethickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linethickness</em>' attribute.
	 * @see #setLinethickness(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Linethickness()
	 * @model dataType="org.w3._1998.math.math.ml.LinethicknessType"
	 *        extendedMetaData="kind='attribute' name='linethickness'"
	 * @generated
	 */
	Object getLinethickness();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getLinethickness <em>Linethickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linethickness</em>' attribute.
	 * @see #getLinethickness()
	 * @generated
	 */
	void setLinethickness(Object value);

	/**
	 * Returns the value of the '<em><b>Mathbackground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathbackground</em>' attribute.
	 * @see #setMathbackground(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getMathcolor <em>Mathcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathcolor</em>' attribute.
	 * @see #getMathcolor()
	 * @generated
	 */
	void setMathcolor(String value);

	/**
	 * Returns the value of the '<em><b>Numalign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.NumalignType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.NumalignType
	 * @see #isSetNumalign()
	 * @see #unsetNumalign()
	 * @see #setNumalign(NumalignType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Numalign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='numalign'"
	 * @generated
	 */
	NumalignType getNumalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getNumalign <em>Numalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.NumalignType
	 * @see #isSetNumalign()
	 * @see #unsetNumalign()
	 * @see #getNumalign()
	 * @generated
	 */
	void setNumalign(NumalignType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getNumalign <em>Numalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumalign()
	 * @see #getNumalign()
	 * @see #setNumalign(NumalignType)
	 * @generated
	 */
	void unsetNumalign();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MfracType#getNumalign <em>Numalign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numalign</em>' attribute is set.
	 * @see #unsetNumalign()
	 * @see #getNumalign()
	 * @see #setNumalign(NumalignType)
	 * @generated
	 */
	boolean isSetNumalign();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getOther <em>Other</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MfracType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMfracType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':12' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MfracType
