/**
 */
package org.w3._1998.math.math.ml;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mspace Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getBackground <em>Background</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getColor <em>Color</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getFontstyle <em>Fontstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getFontweight <em>Fontweight</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getIndentalign <em>Indentalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getIndentalignfirst <em>Indentalignfirst</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getIndentalignlast <em>Indentalignlast</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getIndentshift <em>Indentshift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getIndentshiftfirst <em>Indentshiftfirst</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getIndentshiftlast <em>Indentshiftlast</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getIndenttarget <em>Indenttarget</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getLinebreak <em>Linebreak</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getMathsize <em>Mathsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getMathvariant <em>Mathvariant</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getWidth <em>Width</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.MspaceType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType()
 * @model extendedMetaData="name='mspace_._type' kind='empty'"
 * @generated
 */
public interface MspaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Background()
	 * @model dataType="org.w3._1998.math.math.ml.BackgroundType"
	 *        extendedMetaData="kind='attribute' name='background'"
	 * @generated
	 */
	Object getBackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getBackground <em>Background</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getClass_ <em>Class</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Color()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='color'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Depth()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='depth'"
	 * @generated
	 */
	String getDepth();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(String value);

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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType1 getDir();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getDir <em>Dir</em>}' attribute.
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
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType1)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getDir <em>Dir</em>}' attribute is set.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Fontfamily()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='fontfamily'"
	 * @generated
	 */
	Object getFontfamily();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getFontfamily <em>Fontfamily</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Fontsize()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='fontsize'"
	 * @generated
	 */
	String getFontsize();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getFontsize <em>Fontsize</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Fontstyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fontstyle'"
	 * @generated
	 */
	FontstyleType getFontstyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getFontstyle <em>Fontstyle</em>}' attribute.
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
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getFontstyle <em>Fontstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontstyle()
	 * @see #getFontstyle()
	 * @see #setFontstyle(FontstyleType)
	 * @generated
	 */
	void unsetFontstyle();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getFontstyle <em>Fontstyle</em>}' attribute is set.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Fontweight()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fontweight'"
	 * @generated
	 */
	FontweightType getFontweight();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getFontweight <em>Fontweight</em>}' attribute.
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
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getFontweight <em>Fontweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontweight()
	 * @see #getFontweight()
	 * @see #setFontweight(FontweightType)
	 * @generated
	 */
	void unsetFontweight();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getFontweight <em>Fontweight</em>}' attribute is set.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Height()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getHeight <em>Height</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Indentalign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.IndentalignType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indentalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.IndentalignType1
	 * @see #isSetIndentalign()
	 * @see #unsetIndentalign()
	 * @see #setIndentalign(IndentalignType1)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Indentalign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='indentalign'"
	 * @generated
	 */
	IndentalignType1 getIndentalign();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentalign <em>Indentalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indentalign</em>' attribute.
	 * @see org.w3._1998.math.math.ml.IndentalignType1
	 * @see #isSetIndentalign()
	 * @see #unsetIndentalign()
	 * @see #getIndentalign()
	 * @generated
	 */
	void setIndentalign(IndentalignType1 value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentalign <em>Indentalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndentalign()
	 * @see #getIndentalign()
	 * @see #setIndentalign(IndentalignType1)
	 * @generated
	 */
	void unsetIndentalign();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentalign <em>Indentalign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indentalign</em>' attribute is set.
	 * @see #unsetIndentalign()
	 * @see #getIndentalign()
	 * @see #setIndentalign(IndentalignType1)
	 * @generated
	 */
	boolean isSetIndentalign();

	/**
	 * Returns the value of the '<em><b>Indentalignfirst</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.IndentalignfirstType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indentalignfirst</em>' attribute.
	 * @see org.w3._1998.math.math.ml.IndentalignfirstType1
	 * @see #isSetIndentalignfirst()
	 * @see #unsetIndentalignfirst()
	 * @see #setIndentalignfirst(IndentalignfirstType1)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Indentalignfirst()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='indentalignfirst'"
	 * @generated
	 */
	IndentalignfirstType1 getIndentalignfirst();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentalignfirst <em>Indentalignfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indentalignfirst</em>' attribute.
	 * @see org.w3._1998.math.math.ml.IndentalignfirstType1
	 * @see #isSetIndentalignfirst()
	 * @see #unsetIndentalignfirst()
	 * @see #getIndentalignfirst()
	 * @generated
	 */
	void setIndentalignfirst(IndentalignfirstType1 value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentalignfirst <em>Indentalignfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndentalignfirst()
	 * @see #getIndentalignfirst()
	 * @see #setIndentalignfirst(IndentalignfirstType1)
	 * @generated
	 */
	void unsetIndentalignfirst();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentalignfirst <em>Indentalignfirst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indentalignfirst</em>' attribute is set.
	 * @see #unsetIndentalignfirst()
	 * @see #getIndentalignfirst()
	 * @see #setIndentalignfirst(IndentalignfirstType1)
	 * @generated
	 */
	boolean isSetIndentalignfirst();

	/**
	 * Returns the value of the '<em><b>Indentalignlast</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.IndentalignlastType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indentalignlast</em>' attribute.
	 * @see org.w3._1998.math.math.ml.IndentalignlastType
	 * @see #isSetIndentalignlast()
	 * @see #unsetIndentalignlast()
	 * @see #setIndentalignlast(IndentalignlastType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Indentalignlast()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='indentalignlast'"
	 * @generated
	 */
	IndentalignlastType getIndentalignlast();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentalignlast <em>Indentalignlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indentalignlast</em>' attribute.
	 * @see org.w3._1998.math.math.ml.IndentalignlastType
	 * @see #isSetIndentalignlast()
	 * @see #unsetIndentalignlast()
	 * @see #getIndentalignlast()
	 * @generated
	 */
	void setIndentalignlast(IndentalignlastType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentalignlast <em>Indentalignlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndentalignlast()
	 * @see #getIndentalignlast()
	 * @see #setIndentalignlast(IndentalignlastType)
	 * @generated
	 */
	void unsetIndentalignlast();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentalignlast <em>Indentalignlast</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indentalignlast</em>' attribute is set.
	 * @see #unsetIndentalignlast()
	 * @see #getIndentalignlast()
	 * @see #setIndentalignlast(IndentalignlastType)
	 * @generated
	 */
	boolean isSetIndentalignlast();

	/**
	 * Returns the value of the '<em><b>Indentshift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indentshift</em>' attribute.
	 * @see #setIndentshift(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Indentshift()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='indentshift'"
	 * @generated
	 */
	String getIndentshift();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentshift <em>Indentshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indentshift</em>' attribute.
	 * @see #getIndentshift()
	 * @generated
	 */
	void setIndentshift(String value);

	/**
	 * Returns the value of the '<em><b>Indentshiftfirst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indentshiftfirst</em>' attribute.
	 * @see #setIndentshiftfirst(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Indentshiftfirst()
	 * @model dataType="org.w3._1998.math.math.ml.IndentshiftfirstType"
	 *        extendedMetaData="kind='attribute' name='indentshiftfirst'"
	 * @generated
	 */
	Object getIndentshiftfirst();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentshiftfirst <em>Indentshiftfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indentshiftfirst</em>' attribute.
	 * @see #getIndentshiftfirst()
	 * @generated
	 */
	void setIndentshiftfirst(Object value);

	/**
	 * Returns the value of the '<em><b>Indentshiftlast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indentshiftlast</em>' attribute.
	 * @see #setIndentshiftlast(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Indentshiftlast()
	 * @model dataType="org.w3._1998.math.math.ml.IndentshiftlastType1"
	 *        extendedMetaData="kind='attribute' name='indentshiftlast'"
	 * @generated
	 */
	Object getIndentshiftlast();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndentshiftlast <em>Indentshiftlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indentshiftlast</em>' attribute.
	 * @see #getIndentshiftlast()
	 * @generated
	 */
	void setIndentshiftlast(Object value);

	/**
	 * Returns the value of the '<em><b>Indenttarget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indenttarget</em>' attribute.
	 * @see #setIndenttarget(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Indenttarget()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='indenttarget'"
	 * @generated
	 */
	Object getIndenttarget();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getIndenttarget <em>Indenttarget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indenttarget</em>' attribute.
	 * @see #getIndenttarget()
	 * @generated
	 */
	void setIndenttarget(Object value);

	/**
	 * Returns the value of the '<em><b>Linebreak</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1998.math.math.ml.LinebreakType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linebreak</em>' attribute.
	 * @see org.w3._1998.math.math.ml.LinebreakType
	 * @see #isSetLinebreak()
	 * @see #unsetLinebreak()
	 * @see #setLinebreak(LinebreakType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Linebreak()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='linebreak'"
	 * @generated
	 */
	LinebreakType getLinebreak();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getLinebreak <em>Linebreak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linebreak</em>' attribute.
	 * @see org.w3._1998.math.math.ml.LinebreakType
	 * @see #isSetLinebreak()
	 * @see #unsetLinebreak()
	 * @see #getLinebreak()
	 * @generated
	 */
	void setLinebreak(LinebreakType value);

	/**
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getLinebreak <em>Linebreak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinebreak()
	 * @see #getLinebreak()
	 * @see #setLinebreak(LinebreakType)
	 * @generated
	 */
	void unsetLinebreak();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getLinebreak <em>Linebreak</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linebreak</em>' attribute is set.
	 * @see #unsetLinebreak()
	 * @see #getLinebreak()
	 * @see #setLinebreak(LinebreakType)
	 * @generated
	 */
	boolean isSetLinebreak();

	/**
	 * Returns the value of the '<em><b>Mathbackground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathbackground</em>' attribute.
	 * @see #setMathbackground(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Mathbackground()
	 * @model dataType="org.w3._1998.math.math.ml.MathbackgroundType"
	 *        extendedMetaData="kind='attribute' name='mathbackground'"
	 * @generated
	 */
	Object getMathbackground();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getMathbackground <em>Mathbackground</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Mathcolor()
	 * @model dataType="org.w3._1998.math.math.ml.Color"
	 *        extendedMetaData="kind='attribute' name='mathcolor'"
	 * @generated
	 */
	String getMathcolor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getMathcolor <em>Mathcolor</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Mathsize()
	 * @model dataType="org.w3._1998.math.math.ml.MathsizeType"
	 *        extendedMetaData="kind='attribute' name='mathsize'"
	 * @generated
	 */
	Object getMathsize();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getMathsize <em>Mathsize</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Mathvariant()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mathvariant'"
	 * @generated
	 */
	MathvariantType getMathvariant();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getMathvariant <em>Mathvariant</em>}' attribute.
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
	 * Unsets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getMathvariant <em>Mathvariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMathvariant()
	 * @see #getMathvariant()
	 * @see #setMathvariant(MathvariantType)
	 * @generated
	 */
	void unsetMathvariant();

	/**
	 * Returns whether the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getMathvariant <em>Mathvariant</em>}' attribute is set.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getOther <em>Other</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Width()
	 * @model dataType="org.w3._1998.math.math.ml.Length"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getWidth <em>Width</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.MspaceType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getMspaceType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':28' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MspaceType
