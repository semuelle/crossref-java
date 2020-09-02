/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixed Citation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getCitationElements <em>Citation Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getStringDate <em>String Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getChapterTitle <em>Chapter Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getCollab <em>Collab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getCollabAlternatives <em>Collab Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getComment <em>Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getConfAcronym <em>Conf Acronym</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getConfDate <em>Conf Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getConfLoc <em>Conf Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getConfName <em>Conf Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getConfSponsor <em>Conf Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getDataTitle <em>Data Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getDate <em>Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getDateInCitation <em>Date In Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getEtal <em>Etal</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getFpage <em>Fpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getGov <em>Gov</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getIssn <em>Issn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getIssnL <em>Issn L</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getIssue <em>Issue</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getIssueId <em>Issue Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getIssuePart <em>Issue Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getIssueTitle <em>Issue Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getLpage <em>Lpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getName <em>Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getNameAlternatives <em>Name Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPageRange <em>Page Range</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPartTitle <em>Part Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPatent <em>Patent</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPersonGroup <em>Person Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPubId <em>Pub Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPublisherLoc <em>Publisher Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSeason <em>Season</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSeries <em>Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSize <em>Size</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getStd <em>Std</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getStringName <em>String Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getTransSource <em>Trans Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getTransTitle <em>Trans Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getVersion <em>Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getVolume <em>Volume</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getVolumeId <em>Volume Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getVolumeSeries <em>Volume Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getYear <em>Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPublicationFormat <em>Publication Format</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPublicationType <em>Publication Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPublisherType <em>Publisher Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getRole1 <em>Role1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getType <em>Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getUseType <em>Use Type</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType()
 * @model extendedMetaData="name='mixed-citation_._type' kind='mixed'"
 * @generated
 */
public interface MixedCitationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Citation Elements</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation Elements</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_CitationElements()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='CitationElements:1'"
	 * @generated
	 */
	FeatureMap getCitationElements();

	/**
	 * Returns the value of the '<em><b>String Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.StringDateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Date As a String</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>String Date</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_StringDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string-date' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<StringDateType> getStringDate();

	/**
	 * Returns the value of the '<em><b>Bold</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.BoldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Bold</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bold</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Bold()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bold' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<BoldType> getBold();

	/**
	 * Returns the value of the '<em><b>Fixed Case</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.FixedCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Fixed Case</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Case</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_FixedCase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fixed-case' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<FixedCaseType> getFixedCase();

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ItalicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Italic</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Italic</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Italic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='italic' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ItalicType> getItalic();

	/**
	 * Returns the value of the '<em><b>Monospace</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.MonospaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Monospace Text (Typewriter Text)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monospace</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Monospace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='monospace' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<MonospaceType> getMonospace();

	/**
	 * Returns the value of the '<em><b>Overline</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.OverlineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Overline</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overline</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Overline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='overline' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<OverlineType> getOverline();

	/**
	 * Returns the value of the '<em><b>Roman</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.RomanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Roman</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roman</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Roman()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='roman' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<RomanType> getRoman();

	/**
	 * Returns the value of the '<em><b>Sans Serif</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SansSerifType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Sans Serif</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sans Serif</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_SansSerif()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sans-serif' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<SansSerifType> getSansSerif();

	/**
	 * Returns the value of the '<em><b>Sc</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ScType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Small Caps</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sc</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Sc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sc' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ScType> getSc();

	/**
	 * Returns the value of the '<em><b>Strike</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.StrikeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Strike Through</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strike</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Strike()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strike' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<StrikeType> getStrike();

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.UnderlineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Underline</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Underline</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Underline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='underline' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<UnderlineType> getUnderline();

	/**
	 * Returns the value of the '<em><b>Ruby</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.RubyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Ruby Wrapper</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruby</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Ruby()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ruby' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<RubyType> getRuby();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Alternatives()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alternatives' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<AlternativesType> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Inline Graphic</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.InlineGraphicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Inline Graphic</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline Graphic</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_InlineGraphic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inline-graphic' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<InlineGraphicType> getInlineGraphic();

	/**
	 * Returns the value of the '<em><b>Inline Media</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.InlineMediaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Inline Media Object</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline Media</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_InlineMedia()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inline-media' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<InlineMediaType> getInlineMedia();

	/**
	 * Returns the value of the '<em><b>Private Char</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PrivateCharType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Private Character (Custom or Unicode)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Char</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_PrivateChar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='private-char' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<PrivateCharType> getPrivateChar();

	/**
	 * Returns the value of the '<em><b>Chem Struct</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ChemStructType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Chemical Structure (Display)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chem Struct</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ChemStruct()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chem-struct' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ChemStructType> getChemStruct();

	/**
	 * Returns the value of the '<em><b>Inline Formula</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.InlineFormulaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Formula, Inline</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline Formula</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_InlineFormula()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inline-formula' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<InlineFormulaType> getInlineFormula();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.LabelType}.
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
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Label()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<LabelType> getLabel();

	/**
	 * Returns the value of the '<em><b>Abbrev</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AbbrevType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Abbreviation or Acronym</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abbrev</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Abbrev()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbrev' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<AbbrevType> getAbbrev();

	/**
	 * Returns the value of the '<em><b>Index Term</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IndexTermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Index Term</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index Term</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_IndexTerm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-term' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<IndexTermType> getIndexTerm();

	/**
	 * Returns the value of the '<em><b>Index Term Range End</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IndexTermRangeEndType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Index Term Range End</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index Term Range End</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_IndexTermRangeEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-term-range-end' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<IndexTermRangeEndType> getIndexTermRangeEnd();

	/**
	 * Returns the value of the '<em><b>Milestone End</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.MilestoneEndType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Milestone End</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Milestone End</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_MilestoneEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='milestone-end' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<MilestoneEndType> getMilestoneEnd();

	/**
	 * Returns the value of the '<em><b>Milestone Start</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.MilestoneStartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Milestone Start</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Milestone Start</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_MilestoneStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='milestone-start' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<MilestoneStartType> getMilestoneStart();

	/**
	 * Returns the value of the '<em><b>Named Content</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.NamedContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Named Special (Subject) Content</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Named Content</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_NamedContent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='named-content' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<NamedContentType> getNamedContent();

	/**
	 * Returns the value of the '<em><b>Styled Content</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.StyledContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Styled Special (Subject) Content</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Styled Content</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_StyledContent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='styled-content' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<StyledContentType> getStyledContent();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Annotation in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Article Title</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ArticleTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Title</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ArticleTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article-title' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ArticleTitleType> getArticleTitle();

	/**
	 * Returns the value of the '<em><b>Chapter Title</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ChapterTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Chapter Title in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chapter Title</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ChapterTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chapter-title' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ChapterTitleType> getChapterTitle();

	/**
	 * Returns the value of the '<em><b>Collab</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CollabType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Collaborative (Group) Author</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collab</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Collab()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collab' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<CollabType> getCollab();

	/**
	 * Returns the value of the '<em><b>Collab Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CollabAlternativesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Collaboration Alternatives</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collab Alternatives</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_CollabAlternatives()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collab-alternatives' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<CollabAlternativesType> getCollabAlternatives();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CommentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Comment in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Comment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<CommentType> getComment();

	/**
	 * Returns the value of the '<em><b>Conf Acronym</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ConfAcronymType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Acronym</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Acronym</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ConfAcronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-acronym' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ConfAcronymType> getConfAcronym();

	/**
	 * Returns the value of the '<em><b>Conf Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ConfDateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Date</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Date</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ConfDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-date' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ConfDateType> getConfDate();

	/**
	 * Returns the value of the '<em><b>Conf Loc</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ConfLocType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Location</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Loc</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ConfLoc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-loc' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ConfLocType> getConfLoc();

	/**
	 * Returns the value of the '<em><b>Conf Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ConfNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Name</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ConfName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-name' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ConfNameType> getConfName();

	/**
	 * Returns the value of the '<em><b>Conf Sponsor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ConfSponsorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Sponsor</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Sponsor</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ConfSponsor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-sponsor' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ConfSponsorType> getConfSponsor();

	/**
	 * Returns the value of the '<em><b>Data Title</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DataTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Data Title in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Title</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_DataTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-title' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<DataTitleType> getDataTitle();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Date</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Date()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<DateType> getDate();

	/**
	 * Returns the value of the '<em><b>Date In Citation</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DateInCitationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Date Inside Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date In Citation</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_DateInCitation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-in-citation' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<DateInCitationType> getDateInCitation();

	/**
	 * Returns the value of the '<em><b>Day</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.DayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Day</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Day()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='day' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<DayType> getDay();

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.EditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Edition Statement, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edition</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Edition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<EditionType> getEdition();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Email()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<EmailType> getEmail();

	/**
	 * Returns the value of the '<em><b>Elocation Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ElocationIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Electronic Location Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elocation Id</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ElocationId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elocation-id' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ElocationIdType> getElocationId();

	/**
	 * Returns the value of the '<em><b>Etal</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.EtalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Et Al</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Etal</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Etal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='etal' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<EtalType> getEtal();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ExtLink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ext-link' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ExtLinkType> getExtLink();

	/**
	 * Returns the value of the '<em><b>Fpage</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.FpageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>First Page</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fpage</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Fpage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fpage' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<FpageType> getFpage();

	/**
	 * Returns the value of the '<em><b>Gov</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.GovType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Government Report, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gov</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Gov()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gov' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<GovType> getGov();

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.InstitutionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Institution Name: in an Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Institution()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<InstitutionType> getInstitution();

	/**
	 * Returns the value of the '<em><b>Institution Wrap</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.InstitutionWrapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Institution Wrapper</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Wrap</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_InstitutionWrap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution-wrap' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<InstitutionWrapType> getInstitutionWrap();

	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IsbnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Isbn</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isbn</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Isbn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isbn' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<IsbnType> getIsbn();

	/**
	 * Returns the value of the '<em><b>Issn</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issn</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issn</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Issn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issn' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<IssnType> getIssn();

	/**
	 * Returns the value of the '<em><b>Issn L</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssnLType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issn Linking</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issn L</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_IssnL()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issn-l' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<IssnLType> getIssnL();

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Number</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Issue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<IssueType> getIssue();

	/**
	 * Returns the value of the '<em><b>Issue Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssueIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Id</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_IssueId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue-id' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<IssueIdType> getIssueId();

	/**
	 * Returns the value of the '<em><b>Issue Part</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssuePartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Part</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Part</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_IssuePart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue-part' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<IssuePartType> getIssuePart();

	/**
	 * Returns the value of the '<em><b>Issue Title</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssueTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Title</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_IssueTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue-title' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<IssueTitleType> getIssueTitle();

	/**
	 * Returns the value of the '<em><b>Lpage</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.LpageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Last Page</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lpage</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Lpage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lpage' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<LpageType> getLpage();

	/**
	 * Returns the value of the '<em><b>Month</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.MonthType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Month</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Month()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<MonthType> getMonth();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.NameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Name of Person (Structured)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Name()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<NameType> getName();

	/**
	 * Returns the value of the '<em><b>Name Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.NameAlternativesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Name Alternatives</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Alternatives</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_NameAlternatives()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name-alternatives' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<NameAlternativesType> getNameAlternatives();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_ObjectId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-id' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<ObjectIdType> getObjectId();

	/**
	 * Returns the value of the '<em><b>Page Range</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PageRangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Page Ranges</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Range</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_PageRange()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-range' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<PageRangeType> getPageRange();

	/**
	 * Returns the value of the '<em><b>Part Title</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PartTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Part Title in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Title</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_PartTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='part-title' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<PartTitleType> getPartTitle();

	/**
	 * Returns the value of the '<em><b>Patent</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PatentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Patent Number, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patent</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Patent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='patent' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<PatentType> getPatent();

	/**
	 * Returns the value of the '<em><b>Person Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PersonGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Person Group For a Cited Publication</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_PersonGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person-group' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<PersonGroupType> getPersonGroup();

	/**
	 * Returns the value of the '<em><b>Pub Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PubIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publication Identifier For a Cited Publication</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub Id</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_PubId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pub-id' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<PubIdType> getPubId();

	/**
	 * Returns the value of the '<em><b>Publisher Loc</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PublisherLocType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publisher's Location</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Loc</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_PublisherLoc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher-loc' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<PublisherLocType> getPublisherLoc();

	/**
	 * Returns the value of the '<em><b>Publisher Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PublisherNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publisher's Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Name</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_PublisherName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher-name' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<PublisherNameType> getPublisherName();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.RoleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Role or Function Title of Contributor</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Role()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<RoleType> getRole();

	/**
	 * Returns the value of the '<em><b>Season</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SeasonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Season</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Season</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Season()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='season' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<SeasonType> getSeason();

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SeriesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Series</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Series()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<SeriesType> getSeries();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SizeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Size</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Size()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<SizeType> getSize();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Source</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Source()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<SourceType> getSource();

	/**
	 * Returns the value of the '<em><b>Std</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.StdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Standard, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Std()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<StdType> getStd();

	/**
	 * Returns the value of the '<em><b>String Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.StringNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Name of Person (Unstructured)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>String Name</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_StringName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string-name' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<StringNameType> getStringName();

	/**
	 * Returns the value of the '<em><b>Supplement</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SupplementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Supplement</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplement</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Supplement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='supplement' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<SupplementType> getSupplement();

	/**
	 * Returns the value of the '<em><b>Trans Source</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TransSourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Source</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Source</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_TransSource()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-source' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<TransSourceType> getTransSource();

	/**
	 * Returns the value of the '<em><b>Trans Title</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TransTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Title</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_TransTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-title' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<TransTitleType> getTransTitle();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Uri()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<UriType> getUri();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.VersionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Version Statement, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Version()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<VersionType> getVersion();

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.VolumeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Volume Number</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Volume()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<VolumeType> getVolume();

	/**
	 * Returns the value of the '<em><b>Volume Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.VolumeIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Volume Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Id</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_VolumeId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume-id' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<VolumeIdType> getVolumeId();

	/**
	 * Returns the value of the '<em><b>Volume Series</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.VolumeSeriesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Volume Series</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Series</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_VolumeSeries()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume-series' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<VolumeSeriesType> getVolumeSeries();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.YearType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Year</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Year</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Year()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<YearType> getYear();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SubType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Subscript</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<SubType> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Superscript</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#CitationElements:1'"
	 * @generated
	 */
	EList<SupType> getSup();

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Href()
	 * @model dataType="org.w3._1999.xlink.HrefType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getHref <em>Href</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getId <em>Id</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Lang()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Publication Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Format</em>' attribute.
	 * @see #setPublicationFormat(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_PublicationFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='publication-format'"
	 * @generated
	 */
	String getPublicationFormat();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPublicationFormat <em>Publication Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Format</em>' attribute.
	 * @see #getPublicationFormat()
	 * @generated
	 */
	void setPublicationFormat(String value);

	/**
	 * Returns the value of the '<em><b>Publication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Type</em>' attribute.
	 * @see #setPublicationType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_PublicationType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='publication-type'"
	 * @generated
	 */
	String getPublicationType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPublicationType <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Type</em>' attribute.
	 * @see #getPublicationType()
	 * @generated
	 */
	void setPublicationType(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Type</em>' attribute.
	 * @see #setPublisherType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_PublisherType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='publisher-type'"
	 * @generated
	 */
	String getPublisherType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getPublisherType <em>Publisher Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Type</em>' attribute.
	 * @see #getPublisherType()
	 * @generated
	 */
	void setPublisherType(String value);

	/**
	 * Returns the value of the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role1</em>' attribute.
	 * @see #setRole1(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Role1()
	 * @model dataType="org.w3._1999.xlink.RoleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getRole1();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getRole1 <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role1</em>' attribute.
	 * @see #getRole1()
	 * @generated
	 */
	void setRole1(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Title()
	 * @model dataType="org.w3._1999.xlink.TitleAttrType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3._1999.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.w3._1999.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Use Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Type</em>' attribute.
	 * @see #setUseType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getMixedCitationType_UseType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='use-type'"
	 * @generated
	 */
	String getUseType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.MixedCitationType#getUseType <em>Use Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Type</em>' attribute.
	 * @see #getUseType()
	 * @generated
	 */
	void setUseType(String value);

} // MixedCitationType
