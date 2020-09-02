/**
 */
package org.w3._1998.math.math.ml;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mglyph Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getBackground <em>Background</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getColor <em>Color</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getFontstyle <em>Fontstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getFontweight <em>Fontweight</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getIndex <em>Index</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getMathsize <em>Mathsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getMathvariant <em>Mathvariant</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getSrc <em>Src</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getValign <em>Valign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getWidth <em>Width</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MglyphType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType()
 * @model extendedMetaData="name='mglyph_._type' kind='empty'"
 * @generated
 */
public interface MglyphType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Alt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='alt'"
	 * @generated
	 */
	Object getAlt();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(Object value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Background()
	 * @model dataType="org.w3._1998.math.math.ml.BackgroundType"
	 *        extendedMetaData="kind='attribute' name='background'"
	 * @generated
	 */
	Object getBackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Object value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Color()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='color'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Fontfamily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fontfamily</em>' attribute.
	 * @see #setFontfamily(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Fontfamily()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='fontfamily'"
	 * @generated
	 */
	Object getFontfamily();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getFontfamily <em>Fontfamily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fontfamily</em>' attribute.
	 * @see #getFontfamily()
	 * @generated
	 */
	void setFontfamily(Object value);

	/**
	 * Returns the value of the '<em><b>Fontsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fontsize</em>' attribute.
	 * @see #setFontsize(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Fontsize()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='fontsize'"
	 * @generated
	 */
	String getFontsize();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getFontsize <em>Fontsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fontsize</em>' attribute.
	 * @see #getFontsize()
	 * @generated
	 */
	void setFontsize(String value);

	/**
	 * Returns the value of the '<em><b>Fontstyle</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.FontstyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fontstyle</em>' attribute.
	 * @see org.w3._1998.math.math.ml.FontstyleType
	 * @see #isSetFontstyle()
	 * @see #unsetFontstyle()
	 * @see #setFontstyle(FontstyleType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Fontstyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fontstyle'"
	 * @generated
	 */
	FontstyleType getFontstyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getFontstyle <em>Fontstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fontstyle</em>' attribute.
	 * @see org.w3._1998.math.math.ml.FontstyleType
	 * @see #isSetFontstyle()
	 * @see #unsetFontstyle()
	 * @see #getFontstyle()
	 * @generated
	 */
	void setFontstyle(FontstyleType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getFontstyle <em>Fontstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontstyle()
	 * @see #getFontstyle()
	 * @see #setFontstyle(FontstyleType)
	 * @generated
	 */
	void unsetFontstyle();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getFontstyle <em>Fontstyle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fontstyle</em>' attribute is set.
	 * @see #unsetFontstyle()
	 * @see #getFontstyle()
	 * @see #setFontstyle(FontstyleType)
	 * @generated
	 */
	boolean isSetFontstyle();

	/**
	 * Returns the value of the '<em><b>Fontweight</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.FontweightType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fontweight</em>' attribute.
	 * @see org.w3._1998.math.math.ml.FontweightType
	 * @see #isSetFontweight()
	 * @see #unsetFontweight()
	 * @see #setFontweight(FontweightType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Fontweight()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fontweight'"
	 * @generated
	 */
	FontweightType getFontweight();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getFontweight <em>Fontweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fontweight</em>' attribute.
	 * @see org.w3._1998.math.math.ml.FontweightType
	 * @see #isSetFontweight()
	 * @see #unsetFontweight()
	 * @see #getFontweight()
	 * @generated
	 */
	void setFontweight(FontweightType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getFontweight <em>Fontweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontweight()
	 * @see #getFontweight()
	 * @see #setFontweight(FontweightType)
	 * @generated
	 */
	void unsetFontweight();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getFontweight <em>Fontweight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fontweight</em>' attribute is set.
	 * @see #unsetFontweight()
	 * @see #getFontweight()
	 * @see #setFontweight(FontweightType)
	 * @generated
	 */
	boolean isSetFontweight();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Height()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getHeight <em>Height</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(BigInteger)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Index()
	 * @model dataType="org.w3._1998.math.math.ml.Integer"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	BigInteger getIndex();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mathbackground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathbackground</em>' attribute.
	 * @see #setMathbackground(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getMathcolor <em>Mathcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathcolor</em>' attribute.
	 * @see #getMathcolor()
	 * @generated
	 */
	void setMathcolor(String value);

	/**
	 * Returns the value of the '<em><b>Mathsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathsize</em>' attribute.
	 * @see #setMathsize(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Mathsize()
	 * @model dataType="org.w3._1998.math.math.ml.MathsizeType1"
	 *        extendedMetaData="kind='attribute' name='mathsize'"
	 * @generated
	 */
	Object getMathsize();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getMathsize <em>Mathsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathsize</em>' attribute.
	 * @see #getMathsize()
	 * @generated
	 */
	void setMathsize(Object value);

	/**
	 * Returns the value of the '<em><b>Mathvariant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.MathvariantType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathvariant</em>' attribute.
	 * @see org.w3._1998.math.math.ml.MathvariantType1
	 * @see #isSetMathvariant()
	 * @see #unsetMathvariant()
	 * @see #setMathvariant(MathvariantType1)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Mathvariant()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mathvariant'"
	 * @generated
	 */
	MathvariantType1 getMathvariant();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getMathvariant <em>Mathvariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathvariant</em>' attribute.
	 * @see org.w3._1998.math.math.ml.MathvariantType1
	 * @see #isSetMathvariant()
	 * @see #unsetMathvariant()
	 * @see #getMathvariant()
	 * @generated
	 */
	void setMathvariant(MathvariantType1 value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getMathvariant <em>Mathvariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMathvariant()
	 * @see #getMathvariant()
	 * @see #setMathvariant(MathvariantType1)
	 * @generated
	 */
	void unsetMathvariant();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getMathvariant <em>Mathvariant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mathvariant</em>' attribute is set.
	 * @see #unsetMathvariant()
	 * @see #getMathvariant()
	 * @see #setMathvariant(MathvariantType1)
	 * @generated
	 */
	boolean isSetMathvariant();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Object value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Src()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='src'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valign</em>' attribute.
	 * @see #setValign(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Valign()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='valign'"
	 * @generated
	 */
	String getValign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valign</em>' attribute.
	 * @see #getValign()
	 * @generated
	 */
	void setValign(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Width()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getWidth <em>Width</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MglyphType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMglyphType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':22' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MglyphType
