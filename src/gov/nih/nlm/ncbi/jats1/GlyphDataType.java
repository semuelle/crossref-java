/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3.xml._1998.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glyph Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getFontchar <em>Fontchar</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getFontname <em>Fontname</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getFormat <em>Format</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getResolution <em>Resolution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getSpace <em>Space</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getXSize <em>XSize</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getYSize <em>YSize</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType()
 * @model extendedMetaData="name='glyph-data_._type' kind='mixed'"
 * @generated
 */
public interface GlyphDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *          
	 *       
	 *     <h3>base (as an attribute name)</h3>
	 *           
	 *     <p>
	 *        denotes an attribute whose value
	 *        provides a URI to be used as the base for interpreting any
	 *        relative URIs in the scope of the element on which it
	 *        appears; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML Base specification.</p>
	 *          
	 *      
	 *     <p>
	 *             See 
	 *       <a href="http://www.w3.org/TR/xmlbase/">http://www.w3.org/TR/xmlbase/</a>
	 *             for information about this attribute.
	 *      
	 *     </p>
	 *         
	 *   </div>
	 *      
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Fontchar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fontchar</em>' attribute.
	 * @see #setFontchar(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType_Fontchar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='fontchar'"
	 * @generated
	 */
	String getFontchar();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getFontchar <em>Fontchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fontchar</em>' attribute.
	 * @see #getFontchar()
	 * @generated
	 */
	void setFontchar(String value);

	/**
	 * Returns the value of the '<em><b>Fontname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fontname</em>' attribute.
	 * @see #setFontname(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType_Fontname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='fontname'"
	 * @generated
	 */
	String getFontname();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getFontname <em>Fontname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fontname</em>' attribute.
	 * @see #getFontname()
	 * @generated
	 */
	void setFontname(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType_Format()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='format'"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType_Resolution()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resolution'"
	 * @generated
	 */
	String getResolution();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(String value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * The default value is <code>"preserve"</code>.
	 * The literals are from the enumeration {@link org.w3.xml._1998.namespace.SpaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *          
	 *       
	 *     <h3>space (as an attribute name)</h3>
	 *           
	 *     <p>
	 *        denotes an attribute whose
	 *        value is a keyword indicating what whitespace processing
	 *        discipline is intended for the content of the element; its
	 *        value is inherited.  This name is reserved by virtue of its
	 *        definition in the XML specification.</p>
	 *          
	 *     
	 *   </div>
	 *      
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see org.w3.xml._1998.namespace.SpaceType
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #setSpace(SpaceType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType_Space()
	 * @model default="preserve" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	SpaceType getSpace();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see org.w3.xml._1998.namespace.SpaceType
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(SpaceType value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getSpace <em>Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Space</em>' attribute is set.
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	boolean isSetSpace();

	/**
	 * Returns the value of the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSize</em>' attribute.
	 * @see #setXSize(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType_XSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='x-size'"
	 * @generated
	 */
	String getXSize();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getXSize <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XSize</em>' attribute.
	 * @see #getXSize()
	 * @generated
	 */
	void setXSize(String value);

	/**
	 * Returns the value of the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YSize</em>' attribute.
	 * @see #setYSize(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlyphDataType_YSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='y-size'"
	 * @generated
	 */
	String getYSize();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlyphDataType#getYSize <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YSize</em>' attribute.
	 * @see #getYSize()
	 * @generated
	 */
	void setYSize(String value);

} // GlyphDataType
