/**
 */
package org.w3._1998.math.math.ml;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getMglyph <em>Mglyph</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getMalignmark <em>Malignmark</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getBackground <em>Background</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getColor <em>Color</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getFontstyle <em>Fontstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getFontweight <em>Fontweight</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getLquote <em>Lquote</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getMathsize <em>Mathsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getMathvariant <em>Mathvariant</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getRquote <em>Rquote</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MsType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMsType()
 * @model extendedMetaData="name='ms_._type' kind='mixed'"
 * @generated
 */
public interface MsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Mglyph</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MglyphType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mglyph</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Mglyph()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mglyph' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MglyphType> getMglyph();

	/**
	 * Returns the value of the '<em><b>Malignmark</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MalignmarkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Malignmark</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Malignmark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='malignmark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MalignmarkType> getMalignmark();

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Background()
	 * @model dataType="org.w3._1998.math.math.ml.BackgroundType"
	 *        extendedMetaData="kind='attribute' name='background'"
	 * @generated
	 */
	Object getBackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getBackground <em>Background</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getClass_ <em>Class</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Color()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='color'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.DirType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.w3._1998.math.math.ml.DirType1
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType1)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType1 getDir();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.w3._1998.math.math.ml.DirType1
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType1 value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MsType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType1)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MsType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType1)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Fontfamily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fontfamily</em>' attribute.
	 * @see #setFontfamily(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Fontfamily()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='fontfamily'"
	 * @generated
	 */
	Object getFontfamily();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getFontfamily <em>Fontfamily</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Fontsize()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='fontsize'"
	 * @generated
	 */
	String getFontsize();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getFontsize <em>Fontsize</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Fontstyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fontstyle'"
	 * @generated
	 */
	FontstyleType getFontstyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getFontstyle <em>Fontstyle</em>}' attribute.
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
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MsType#getFontstyle <em>Fontstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontstyle()
	 * @see #getFontstyle()
	 * @see #setFontstyle(FontstyleType)
	 * @generated
	 */
	void unsetFontstyle();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MsType#getFontstyle <em>Fontstyle</em>}' attribute is set.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Fontweight()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fontweight'"
	 * @generated
	 */
	FontweightType getFontweight();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getFontweight <em>Fontweight</em>}' attribute.
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
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MsType#getFontweight <em>Fontweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontweight()
	 * @see #getFontweight()
	 * @see #setFontweight(FontweightType)
	 * @generated
	 */
	void unsetFontweight();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MsType#getFontweight <em>Fontweight</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lquote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lquote</em>' attribute.
	 * @see #setLquote(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Lquote()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lquote'"
	 * @generated
	 */
	Object getLquote();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getLquote <em>Lquote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lquote</em>' attribute.
	 * @see #getLquote()
	 * @generated
	 */
	void setLquote(Object value);

	/**
	 * Returns the value of the '<em><b>Mathbackground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathbackground</em>' attribute.
	 * @see #setMathbackground(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getMathcolor <em>Mathcolor</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Mathsize()
	 * @model dataType="org.w3._1998.math.math.ml.MathsizeType"
	 *        extendedMetaData="kind='attribute' name='mathsize'"
	 * @generated
	 */
	Object getMathsize();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getMathsize <em>Mathsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathsize</em>' attribute.
	 * @see #getMathsize()
	 * @generated
	 */
	void setMathsize(Object value);

	/**
	 * Returns the value of the '<em><b>Mathvariant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.MathvariantType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathvariant</em>' attribute.
	 * @see org.w3._1998.math.math.ml.MathvariantType
	 * @see #isSetMathvariant()
	 * @see #unsetMathvariant()
	 * @see #setMathvariant(MathvariantType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Mathvariant()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mathvariant'"
	 * @generated
	 */
	MathvariantType getMathvariant();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getMathvariant <em>Mathvariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathvariant</em>' attribute.
	 * @see org.w3._1998.math.math.ml.MathvariantType
	 * @see #isSetMathvariant()
	 * @see #unsetMathvariant()
	 * @see #getMathvariant()
	 * @generated
	 */
	void setMathvariant(MathvariantType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MsType#getMathvariant <em>Mathvariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMathvariant()
	 * @see #getMathvariant()
	 * @see #setMathvariant(MathvariantType)
	 * @generated
	 */
	void unsetMathvariant();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MsType#getMathvariant <em>Mathvariant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mathvariant</em>' attribute is set.
	 * @see #unsetMathvariant()
	 * @see #getMathvariant()
	 * @see #setMathvariant(MathvariantType)
	 * @generated
	 */
	boolean isSetMathvariant();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Object value);

	/**
	 * Returns the value of the '<em><b>Rquote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rquote</em>' attribute.
	 * @see #setRquote(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Rquote()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='rquote'"
	 * @generated
	 */
	Object getRquote();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getRquote <em>Rquote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rquote</em>' attribute.
	 * @see #getRquote()
	 * @generated
	 */
	void setRquote(Object value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MsType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMsType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':23' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MsType
