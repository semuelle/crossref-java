/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._1998.math.math.ml.MathType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getParaLevel <em>Para Level</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getP <em>P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType()
 * @model extendedMetaData="name='glossary_._type' kind='elementOnly'"
 * @generated
 */
public interface GlossaryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Label of a Figure, Reference, Etc.</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Para Level</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para Level</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_ParaLevel()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ParaLevel:2'"
	 * @generated
	 */
	FeatureMap getParaLevel();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Address/Contact Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Address()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<AddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AlternativesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Alternatives For Processing</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Alternatives()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alternatives' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<AlternativesType> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ArrayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Array (Simple Tabular Array)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Array()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='array' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<ArrayType> getArray();

	/**
	 * Returns the value of the '<em><b>Boxed Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.BoxedTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Boxed Text</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boxed Text</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_BoxedText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='boxed-text' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<BoxedTextType> getBoxedText();

	/**
	 * Returns the value of the '<em><b>Chem Struct Wrap</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ChemStructWrapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Chemical Structure Wrapper</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chem Struct Wrap</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_ChemStructWrap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chem-struct-wrap' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<ChemStructWrapType> getChemStructWrap();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Code Text</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<CodeType> getCode();

	/**
	 * Returns the value of the '<em><b>Fig</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.FigType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Figure</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fig</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Fig()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fig' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<FigType> getFig();

	/**
	 * Returns the value of the '<em><b>Fig Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.FigGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Figure Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fig Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_FigGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fig-group' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<FigGroupType> getFigGroup();

	/**
	 * Returns the value of the '<em><b>Graphic</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.GraphicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Graphic</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Graphic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='graphic' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<GraphicType> getGraphic();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.MediaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Media Object</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Media()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='media' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<MediaType> getMedia();

	/**
	 * Returns the value of the '<em><b>Preformat</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PreformatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Preformatted Text</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preformat</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Preformat()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='preformat' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<PreformatType> getPreformat();

	/**
	 * Returns the value of the '<em><b>Supplementary Material</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SupplementaryMaterialType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Supplementary Material</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplementary Material</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_SupplementaryMaterial()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='supplementary-material' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<SupplementaryMaterialType> getSupplementaryMaterial();

	/**
	 * Returns the value of the '<em><b>Table Wrap</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TableWrapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Table Wrapper</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Wrap</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_TableWrap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-wrap' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<TableWrapType> getTableWrap();

	/**
	 * Returns the value of the '<em><b>Table Wrap Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TableWrapGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Table Wrapper Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Wrap Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_TableWrapGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-wrap-group' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<TableWrapGroupType> getTableWrapGroup();

	/**
	 * Returns the value of the '<em><b>Disp Formula</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DispFormulaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Formula, Display</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disp Formula</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_DispFormula()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disp-formula' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<DispFormulaType> getDispFormula();

	/**
	 * Returns the value of the '<em><b>Disp Formula Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DispFormulaGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Formula, Display Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disp Formula Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_DispFormulaGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disp-formula-group' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<DispFormulaGroupType> getDispFormulaGroup();

	/**
	 * Returns the value of the '<em><b>Def List</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DefListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def List</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_DefList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='def-list' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<DefListType> getDefList();

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>List</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_List()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<ListType> getList();

	/**
	 * Returns the value of the '<em><b>Tex Math</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TexMathType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Tex Math Equation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tex Math</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_TexMath()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tex-math' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<TexMathType> getTexMath();

	/**
	 * Returns the value of the '<em><b>Math</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MathType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Math</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Math()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='math' namespace='http://www.w3.org/1998/Math/MathML' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<MathType> getMath();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Paragraph</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<PType> getP();

	/**
	 * Returns the value of the '<em><b>Related Article</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.RelatedArticleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Related Article Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Article</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_RelatedArticle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='related-article' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<RelatedArticleType> getRelatedArticle();

	/**
	 * Returns the value of the '<em><b>Related Object</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.RelatedObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Related Object Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Object</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_RelatedObject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='related-object' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<RelatedObjectType> getRelatedObject();

	/**
	 * Returns the value of the '<em><b>Disp Quote</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DispQuoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Quote, Displayed</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disp Quote</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_DispQuote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disp-quote' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<DispQuoteType> getDispQuote();

	/**
	 * Returns the value of the '<em><b>Speech</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SpeechType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Speech</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speech</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Speech()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='speech' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<SpeechType> getSpeech();

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.StatementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Statement, Formal</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Statement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='statement' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<StatementType> getStatement();

	/**
	 * Returns the value of the '<em><b>Verse Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.VerseGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Verse Form For Poetry</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verse Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_VerseGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verse-group' namespace='##targetNamespace' group='#ParaLevel:2'"
	 * @generated
	 */
	EList<VerseGroupType> getVerseGroup();

	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.GlossaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Glossary Elements</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Glossary</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Glossary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='glossary' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GlossaryType> getGlossary();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *          
	 *       
	 *     <h3>lang (as an attribute name)</h3>
	 *           
	 *     <p>
	 *        denotes an attribute whose value
	 *        is a language code for the natural language of the content of
	 *        any element; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML specification.</p>
	 *          
	 *     
	 *   </div>
	 *       
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *          
	 *     <h4>Notes</h4>
	 *          
	 *     <p>
	 *       Attempting to install the relevant ISO 2- and 3-letter
	 *       codes as the enumerated possible values is probably never
	 *       going to be a realistic possibility.  
	 *      </p>
	 *          
	 *     <p>
	 *             See BCP 47 at 
	 *       <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt">
	 *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>
	 *             and the IANA language subtag registry at
	 *       
	 *       <a href="http://www.iana.org/assignments/language-subtag-registry">
	 *        http://www.iana.org/assignments/language-subtag-registry</a>
	 *             for further information.
	 *      
	 *     </p>
	 *          
	 *     <p>
	 *       The union allows for the 'un-declaration' of xml:lang with
	 *       the empty string.
	 *      </p>
	 *         
	 *   </div>
	 *      
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_Lang()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getGlossaryType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.GlossaryType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

} // GlossaryType
