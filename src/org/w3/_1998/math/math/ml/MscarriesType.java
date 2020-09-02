/**
 */
package org.w3._1998.math.math.ml;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mscarries Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getNone <em>None</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getMscarry <em>Mscarry</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getCrossout <em>Crossout</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getPosition <em>Position</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getScriptsizemultiplier <em>Scriptsizemultiplier</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MscarriesType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType()
 * @model extendedMetaData="name='mscarries_._type' kind='elementOnly'"
 * @generated
 */
public interface MscarriesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>None</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NoneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_None()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='none' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NoneType> getNone();

	/**
	 * Returns the value of the '<em><b>Mscarry</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MscarryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mscarry</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Mscarry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mscarry' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MscarryType> getMscarry();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Crossout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crossout</em>' attribute.
	 * @see #setCrossout(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Crossout()
	 * @model dataType="org.w3._1998.math.math.ml.CrossoutType" many="false"
	 *        extendedMetaData="kind='attribute' name='crossout'"
	 * @generated
	 */
	List<CrossoutTypeItem1> getCrossout();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getCrossout <em>Crossout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossout</em>' attribute.
	 * @see #getCrossout()
	 * @generated
	 */
	void setCrossout(List<CrossoutTypeItem1> value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see org.w3._1998.math.math.ml.LocationType
	 * @see #isSetLocation()
	 * @see #unsetLocation()
	 * @see #setLocation(LocationType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Location()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='location'"
	 * @generated
	 */
	LocationType getLocation();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see org.w3._1998.math.math.ml.LocationType
	 * @see #isSetLocation()
	 * @see #unsetLocation()
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocation()
	 * @see #getLocation()
	 * @see #setLocation(LocationType)
	 * @generated
	 */
	void unsetLocation();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getLocation <em>Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Location</em>' attribute is set.
	 * @see #unsetLocation()
	 * @see #getLocation()
	 * @see #setLocation(LocationType)
	 * @generated
	 */
	boolean isSetLocation();

	/**
	 * Returns the value of the '<em><b>Mathbackground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathbackground</em>' attribute.
	 * @see #setMathbackground(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getMathcolor <em>Mathcolor</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getOther <em>Other</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Position()
	 * @model dataType="org.w3._1998.math.math.ml.Integer"
	 *        extendedMetaData="kind='attribute' name='position'"
	 * @generated
	 */
	BigInteger getPosition();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Scriptsizemultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scriptsizemultiplier</em>' attribute.
	 * @see #setScriptsizemultiplier(BigDecimal)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Scriptsizemultiplier()
	 * @model dataType="org.w3._1998.math.math.ml.Number"
	 *        extendedMetaData="kind='attribute' name='scriptsizemultiplier'"
	 * @generated
	 */
	BigDecimal getScriptsizemultiplier();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getScriptsizemultiplier <em>Scriptsizemultiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scriptsizemultiplier</em>' attribute.
	 * @see #getScriptsizemultiplier()
	 * @generated
	 */
	void setScriptsizemultiplier(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MscarriesType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMscarriesType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':15' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MscarriesType
