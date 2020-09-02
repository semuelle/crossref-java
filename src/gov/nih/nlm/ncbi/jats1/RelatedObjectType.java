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
 * A representation of the model object '<em><b>Related Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getRelatedObjectElements <em>Related Object Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getChapterTitle <em>Chapter Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getCollab <em>Collab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getCollabAlternatives <em>Collab Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getComment <em>Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getConfAcronym <em>Conf Acronym</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getConfDate <em>Conf Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getConfLoc <em>Conf Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getConfName <em>Conf Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getConfSponsor <em>Conf Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getDataTitle <em>Data Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getDate <em>Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getDateInCitation <em>Date In Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getEtal <em>Etal</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getFpage <em>Fpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getGov <em>Gov</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getIssn <em>Issn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getIssnL <em>Issn L</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getIssue <em>Issue</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getIssueId <em>Issue Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getIssuePart <em>Issue Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getIssueTitle <em>Issue Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getLpage <em>Lpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getName <em>Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getNameAlternatives <em>Name Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getPageRange <em>Page Range</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getPartTitle <em>Part Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getPatent <em>Patent</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getPersonGroup <em>Person Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getPubId <em>Pub Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getPublisherLoc <em>Publisher Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSeason <em>Season</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSeries <em>Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSize <em>Size</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getStd <em>Std</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getStringName <em>String Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getTransSource <em>Trans Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getTransTitle <em>Trans Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getVersion <em>Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getVolume <em>Volume</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getVolumeId <em>Volume Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getVolumeSeries <em>Volume Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getYear <em>Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getDocumentIdType <em>Document Id Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getExtLinkType <em>Ext Link Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getObjectId1 <em>Object Id1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getObjectIdType <em>Object Id Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getRole1 <em>Role1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSourceIdType <em>Source Id Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType()
 * @model extendedMetaData="name='related-object_._type' kind='mixed'"
 * @generated
 */
public interface RelatedObjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Related Object Elements</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Object Elements</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_RelatedObjectElements()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='RelatedObjectElements:1'"
	 * @generated
	 */
	FeatureMap getRelatedObjectElements();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Bold()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bold' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_FixedCase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fixed-case' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Italic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='italic' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Monospace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='monospace' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Overline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='overline' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Roman()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='roman' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_SansSerif()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sans-serif' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Sc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sc' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Strike()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strike' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Underline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='underline' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Ruby()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ruby' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
	 * @generated
	 */
	EList<RubyType> getRuby();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_NamedContent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='named-content' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_StyledContent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='styled-content' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ArticleTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article-title' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ChapterTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chapter-title' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Collab()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collab' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_CollabAlternatives()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collab-alternatives' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Comment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ConfAcronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-acronym' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ConfDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-date' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ConfLoc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-loc' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ConfName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-name' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ConfSponsor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-sponsor' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_DataTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-title' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Date()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_DateInCitation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-in-citation' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Day()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='day' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Edition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Email()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ElocationId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elocation-id' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Etal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='etal' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ExtLink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ext-link' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Fpage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fpage' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Gov()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gov' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Institution()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_InstitutionWrap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution-wrap' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Isbn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isbn' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Issn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issn' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_IssnL()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issn-l' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Issue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_IssueId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue-id' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_IssuePart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue-part' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_IssueTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue-title' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Lpage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lpage' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Month()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Name()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_NameAlternatives()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name-alternatives' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ObjectId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-id' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_PageRange()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-range' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_PartTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='part-title' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Patent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='patent' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_PersonGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person-group' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_PubId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pub-id' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_PublisherLoc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher-loc' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_PublisherName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher-name' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Role()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Season()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='season' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Series()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Size()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Source()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Std()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_StringName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string-name' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Supplement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='supplement' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_TransSource()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-source' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_TransTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-title' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Uri()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Version()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Volume()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_VolumeId()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume-id' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_VolumeSeries()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume-series' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Year()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#RelatedObjectElements:1'"
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getActuate <em>Actuate</em>}' attribute.
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
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getActuate <em>Actuate</em>}' attribute is set.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getBase <em>Base</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Document Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Id</em>' attribute.
	 * @see #setDocumentId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_DocumentId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='document-id'"
	 * @generated
	 */
	String getDocumentId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getDocumentId <em>Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Id</em>' attribute.
	 * @see #getDocumentId()
	 * @generated
	 */
	void setDocumentId(String value);

	/**
	 * Returns the value of the '<em><b>Document Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Id Type</em>' attribute.
	 * @see #setDocumentIdType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_DocumentIdType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='document-id-type'"
	 * @generated
	 */
	String getDocumentIdType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getDocumentIdType <em>Document Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Id Type</em>' attribute.
	 * @see #getDocumentIdType()
	 * @generated
	 */
	void setDocumentIdType(String value);

	/**
	 * Returns the value of the '<em><b>Document Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type</em>' attribute.
	 * @see #setDocumentType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_DocumentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='document-type'"
	 * @generated
	 */
	String getDocumentType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getDocumentType <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' attribute.
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(String value);

	/**
	 * Returns the value of the '<em><b>Ext Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Link Type</em>' attribute.
	 * @see #setExtLinkType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ExtLinkType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ext-link-type'"
	 * @generated
	 */
	String getExtLinkType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getExtLinkType <em>Ext Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Link Type</em>' attribute.
	 * @see #getExtLinkType()
	 * @generated
	 */
	void setExtLinkType(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Href()
	 * @model dataType="org.w3._1999.xlink.HrefType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getHref <em>Href</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getId <em>Id</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Lang()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type</em>' attribute.
	 * @see #setLinkType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_LinkType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='link-type'"
	 * @generated
	 */
	String getLinkType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getLinkType <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' attribute.
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(String value);

	/**
	 * Returns the value of the '<em><b>Object Id1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id1</em>' attribute.
	 * @see #setObjectId1(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ObjectId1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='object-id'"
	 * @generated
	 */
	String getObjectId1();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getObjectId1 <em>Object Id1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id1</em>' attribute.
	 * @see #getObjectId1()
	 * @generated
	 */
	void setObjectId1(String value);

	/**
	 * Returns the value of the '<em><b>Object Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id Type</em>' attribute.
	 * @see #setObjectIdType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ObjectIdType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='object-id-type'"
	 * @generated
	 */
	String getObjectIdType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getObjectIdType <em>Object Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id Type</em>' attribute.
	 * @see #getObjectIdType()
	 * @generated
	 */
	void setObjectIdType(String value);

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see #setObjectType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_ObjectType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='object-type'"
	 * @generated
	 */
	String getObjectType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(String value);

	/**
	 * Returns the value of the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role1</em>' attribute.
	 * @see #setRole1(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Role1()
	 * @model dataType="org.w3._1999.xlink.RoleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getRole1();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getRole1 <em>Role1</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getShow <em>Show</em>}' attribute.
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
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getShow <em>Show</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' attribute.
	 * @see #setSourceId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_SourceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='source-id'"
	 * @generated
	 */
	String getSourceId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSourceId <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' attribute.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(String value);

	/**
	 * Returns the value of the '<em><b>Source Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id Type</em>' attribute.
	 * @see #setSourceIdType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_SourceIdType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='source-id-type'"
	 * @generated
	 */
	String getSourceIdType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSourceIdType <em>Source Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id Type</em>' attribute.
	 * @see #getSourceIdType()
	 * @generated
	 */
	void setSourceIdType(String value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see #setSourceType(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_SourceType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='source-type'"
	 * @generated
	 */
	String getSourceType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(String value);

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	String getSpecificUse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getSpecificUse <em>Specific Use</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Title()
	 * @model dataType="org.w3._1999.xlink.TitleAttrType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getTitle <em>Title</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getRelatedObjectType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link gov.nih.nlm.ncbi.jats1.RelatedObjectType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // RelatedObjectType
