/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Wrap Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getIdClass <em>Id Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getAbstractClass <em>Abstract Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getKwdGroupClass <em>Kwd Group Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getKwdGroup <em>Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getLongDesc <em>Long Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getInsideTableWrap <em>Inside Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getTable <em>Table</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getTableWrapFoot <em>Table Wrap Foot</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getPosition <em>Position</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType()
 * @model extendedMetaData="name='table-wrap_._type' kind='elementOnly'"
 * @generated
 */
public interface TableWrapType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_IdClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IdClass:0'"
	 * @generated
	 */
	FeatureMap getIdClass();

	/**
	 * Returns the value of the '<em><b>Object Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ObjectIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Object Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Id</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_ObjectId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-id' namespace='##targetNamespace' group='#IdClass:0'"
	 * @generated
	 */
	EList<ObjectIdType> getObjectId();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Caption of a Figure, Table, Etc.</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(CaptionType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Caption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='##targetNamespace'"
	 * @generated
	 */
	CaptionType getCaption();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(CaptionType value);

	/**
	 * Returns the value of the '<em><b>Abstract Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_AbstractClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractClass:4'"
	 * @generated
	 */
	FeatureMap getAbstractClass();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AbstractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Abstract</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Abstract()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace' group='#AbstractClass:4'"
	 * @generated
	 */
	EList<AbstractType> getAbstract();

	/**
	 * Returns the value of the '<em><b>Kwd Group Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kwd Group Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_KwdGroupClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='KwdGroupClass:6'"
	 * @generated
	 */
	FeatureMap getKwdGroupClass();

	/**
	 * Returns the value of the '<em><b>Kwd Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.KwdGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Keyword Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kwd Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_KwdGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kwd-group' namespace='##targetNamespace' group='#KwdGroupClass:6'"
	 * @generated
	 */
	EList<KwdGroupType> getKwdGroup();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:8'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Alt Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AltTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Alternate Title Text For a Figure, Etc.</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Text</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_AltText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alt-text' namespace='##targetNamespace' group='#group:8'"
	 * @generated
	 */
	EList<AltTextType> getAltText();

	/**
	 * Returns the value of the '<em><b>Long Desc</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.LongDescType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Long Description</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Long Desc</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_LongDesc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='long-desc' namespace='##targetNamespace' group='#group:8'"
	 * @generated
	 */
	EList<LongDescType> getLongDesc();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.EmailType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Email Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Email()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace' group='#group:8'"
	 * @generated
	 */
	EList<EmailType> getEmail();

	/**
	 * Returns the value of the '<em><b>Ext Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ExtLinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>External Link</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Link</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_ExtLink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ext-link' namespace='##targetNamespace' group='#group:8'"
	 * @generated
	 */
	EList<ExtLinkType> getExtLink();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.UriType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Uri</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Uri()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace' group='#group:8'"
	 * @generated
	 */
	EList<UriType> getUri();

	/**
	 * Returns the value of the '<em><b>Inside Table Wrap</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inside Table Wrap</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_InsideTableWrap()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='InsideTableWrap:14'"
	 * @generated
	 */
	FeatureMap getInsideTableWrap();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_DispQuote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disp-quote' namespace='##targetNamespace' group='#InsideTableWrap:14'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Speech()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='speech' namespace='##targetNamespace' group='#InsideTableWrap:14'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Statement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='statement' namespace='##targetNamespace' group='#InsideTableWrap:14'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_VerseGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verse-group' namespace='##targetNamespace' group='#InsideTableWrap:14'"
	 * @generated
	 */
	EList<VerseGroupType> getVerseGroup();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_DefList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='def-list' namespace='##targetNamespace' group='#InsideTableWrap:14'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_List()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace' group='#InsideTableWrap:14'"
	 * @generated
	 */
	EList<ListType> getList();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Alternatives()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alternatives' namespace='##targetNamespace' group='#InsideTableWrap:14'"
	 * @generated
	 */
	EList<AlternativesType> getAlternatives();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_ChemStructWrap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chem-struct-wrap' namespace='##targetNamespace' group='#InsideTableWrap:14'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#InsideTableWrap:14'"
	 * @generated
	 */
	EList<CodeType> getCode();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_DispFormula()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disp-formula' namespace='##targetNamespace' group='#InsideTableWrap:14'"
	 * @generated
	 */
	EList<DispFormulaType> getDispFormula();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Graphic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='graphic' namespace='##targetNamespace' group='#InsideTableWrap:14'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Media()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='media' namespace='##targetNamespace' group='#InsideTableWrap:14'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Preformat()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='preformat' namespace='##targetNamespace' group='#InsideTableWrap:14'"
	 * @generated
	 */
	EList<PreformatType> getPreformat();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Table: Table Element ..............................</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#InsideTableWrap:14'"
	 * @generated
	 */
	EList<TableType> getTable();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:29'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Table Wrap Foot</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TableWrapFootType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Table Wrap Footer</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Wrap Foot</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_TableWrapFoot()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-wrap-foot' namespace='##targetNamespace' group='#group:29'"
	 * @generated
	 */
	EList<TableWrapFootType> getTableWrapFoot();

	/**
	 * Returns the value of the '<em><b>Attrib</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AttribType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Attribution</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attrib</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Attrib()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attrib' namespace='##targetNamespace' group='#group:29'"
	 * @generated
	 */
	EList<AttribType> getAttrib();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PermissionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Permissions</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Permissions()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='permissions' namespace='##targetNamespace' group='#group:29'"
	 * @generated
	 */
	EList<PermissionsType> getPermissions();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getBase <em>Base</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getContentType <em>Content Type</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getId <em>Id</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Lang()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The default value is <code>"portrait"</code>.
	 * The literals are from the enumeration {@link gov.nih.nlm.ncbi.jats1.OrientationType5}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.OrientationType5
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(OrientationType5)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Orientation()
	 * @model default="portrait" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='orientation'"
	 * @generated
	 */
	OrientationType5 getOrientation();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.OrientationType5
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType5 value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType5)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType5)
	 * @generated
	 */
	boolean isSetOrientation();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"float"</code>.
	 * The literals are from the enumeration {@link gov.nih.nlm.ncbi.jats1.PositionType9}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.PositionType9
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #setPosition(PositionType9)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_Position()
	 * @model default="float" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='position'"
	 * @generated
	 */
	PositionType9 getPosition();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see gov.nih.nlm.ncbi.jats1.PositionType9
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionType9 value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(PositionType9)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getPosition <em>Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' attribute is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(PositionType9)
	 * @generated
	 */
	boolean isSetPosition();

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getTableWrapType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.TableWrapType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

} // TableWrapType
