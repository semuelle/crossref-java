/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.BoxedTextType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.ChemStructWrapType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.DefListType;
import gov.nih.nlm.ncbi.jats1.DispFormulaGroupType;
import gov.nih.nlm.ncbi.jats1.DispFormulaType;
import gov.nih.nlm.ncbi.jats1.DispQuoteType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FigGroupType;
import gov.nih.nlm.ncbi.jats1.FigType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.IndexTermRangeEndType;
import gov.nih.nlm.ncbi.jats1.IndexTermType;
import gov.nih.nlm.ncbi.jats1.InlineFormulaType;
import gov.nih.nlm.ncbi.jats1.InlineGraphicType;
import gov.nih.nlm.ncbi.jats1.InlineMediaType;
import gov.nih.nlm.ncbi.jats1.InlineSupplementaryMaterialType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.ListType;
import gov.nih.nlm.ncbi.jats1.MediaType;
import gov.nih.nlm.ncbi.jats1.MilestoneEndType;
import gov.nih.nlm.ncbi.jats1.MilestoneStartType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.PrivateCharType;
import gov.nih.nlm.ncbi.jats1.RelatedArticleType;
import gov.nih.nlm.ncbi.jats1.RelatedObjectType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.SpeechType;
import gov.nih.nlm.ncbi.jats1.StatementType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.SupplementaryMaterialType;
import gov.nih.nlm.ncbi.jats1.TableWrapGroupType;
import gov.nih.nlm.ncbi.jats1.TableWrapType;
import gov.nih.nlm.ncbi.jats1.TargetType;
import gov.nih.nlm.ncbi.jats1.TexMathType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.UriType;
import gov.nih.nlm.ncbi.jats1.VerseGroupType;
import gov.nih.nlm.ncbi.jats1.XrefType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.MathType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getNamedContentElements <em>Named Content Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getRid <em>Rid</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getVocab <em>Vocab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getVocabIdentifier <em>Vocab Identifier</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getVocabTerm <em>Vocab Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NamedContentTypeImpl#getVocabTermIdentifier <em>Vocab Term Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedContentTypeImpl extends MinimalEObjectImpl.Container implements NamedContentType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected String alt = ALT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected Object lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getRid() <em>Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRid()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> RID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRid() <em>Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRid()
	 * @generated
	 * @ordered
	 */
	protected List<String> rid = RID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFIC_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected String specificUse = SPECIFIC_USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getVocab() <em>Vocab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocab()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocab() <em>Vocab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocab()
	 * @generated
	 * @ordered
	 */
	protected String vocab = VOCAB_EDEFAULT;

	/**
	 * The default value of the '{@link #getVocabIdentifier() <em>Vocab Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabIdentifier() <em>Vocab Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String vocabIdentifier = VOCAB_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVocabTerm() <em>Vocab Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabTerm() <em>Vocab Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTerm()
	 * @generated
	 * @ordered
	 */
	protected String vocabTerm = VOCAB_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVocabTermIdentifier() <em>Vocab Term Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTermIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_TERM_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabTermIdentifier() <em>Vocab Term Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTermIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String vocabTermIdentifier = VOCAB_TERM_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getNamedContentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.NAMED_CONTENT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNamedContentElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getNamedContentType_NamedContentElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineSupplementaryMaterialType> getInlineSupplementaryMaterial() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_InlineSupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoxedTextType> getBoxedText() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_BoxedText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructWrapType> getChemStructWrap() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_ChemStructWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigType> getFig() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Fig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigGroupType> getFigGroup() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_FigGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapType> getTableWrap() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_TableWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapGroupType> getTableWrapGroup() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_TableWrapGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaGroupType> getDispFormulaGroup() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_DispFormulaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispQuoteType> getDispQuote() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_DispQuote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechType> getSpeech() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Speech());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatementType> getStatement() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_Statement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseGroupType> getVerseGroup() {
		return getNamedContentElements().list(Jats1Package.eINSTANCE.getNamedContentType_VerseGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.NAMED_CONTENT_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlt() {
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlt(String newAlt) {
		String oldAlt = alt;
		alt = newAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__ALT, oldAlt, alt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang(Object newLang) {
		Object oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getRid() {
		return rid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRid(List<String> newRid) {
		List<String> oldRid = rid;
		rid = newRid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__RID, oldRid, rid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShowType getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShow(ShowType newShow) {
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShow() {
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.NAMED_CONTENT_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecificUse() {
		return specificUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecificUse(String newSpecificUse) {
		String oldSpecificUse = specificUse;
		specificUse = newSpecificUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.NAMED_CONTENT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocab() {
		return vocab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocab(String newVocab) {
		String oldVocab = vocab;
		vocab = newVocab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__VOCAB, oldVocab, vocab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocabIdentifier() {
		return vocabIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocabIdentifier(String newVocabIdentifier) {
		String oldVocabIdentifier = vocabIdentifier;
		vocabIdentifier = newVocabIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__VOCAB_IDENTIFIER, oldVocabIdentifier, vocabIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocabTerm() {
		return vocabTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocabTerm(String newVocabTerm) {
		String oldVocabTerm = vocabTerm;
		vocabTerm = newVocabTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__VOCAB_TERM, oldVocabTerm, vocabTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocabTermIdentifier() {
		return vocabTermIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocabTermIdentifier(String newVocabTermIdentifier) {
		String oldVocabTermIdentifier = vocabTermIdentifier;
		vocabTermIdentifier = newVocabTermIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAMED_CONTENT_TYPE__VOCAB_TERM_IDENTIFIER, oldVocabTermIdentifier, vocabTermIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.NAMED_CONTENT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__NAMED_CONTENT_ELEMENTS:
				return ((InternalEList<?>)getNamedContentElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getInlineSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__BOXED_TEXT:
				return ((InternalEList<?>)getBoxedText()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__CHEM_STRUCT_WRAP:
				return ((InternalEList<?>)getChemStructWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__FIG:
				return ((InternalEList<?>)getFig()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__FIG_GROUP:
				return ((InternalEList<?>)getFigGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__TABLE_WRAP:
				return ((InternalEList<?>)getTableWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__TABLE_WRAP_GROUP:
				return ((InternalEList<?>)getTableWrapGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_FORMULA_GROUP:
				return ((InternalEList<?>)getDispFormulaGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_QUOTE:
				return ((InternalEList<?>)getDispQuote()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__SPEECH:
				return ((InternalEList<?>)getSpeech()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.NAMED_CONTENT_TYPE__VERSE_GROUP:
				return ((InternalEList<?>)getVerseGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Jats1Package.NAMED_CONTENT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.NAMED_CONTENT_TYPE__NAMED_CONTENT_ELEMENTS:
				if (coreType) return getNamedContentElements();
				return ((FeatureMap.Internal)getNamedContentElements()).getWrapper();
			case Jats1Package.NAMED_CONTENT_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.NAMED_CONTENT_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.NAMED_CONTENT_TYPE__URI:
				return getUri();
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return getInlineSupplementaryMaterial();
			case Jats1Package.NAMED_CONTENT_TYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.NAMED_CONTENT_TYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.NAMED_CONTENT_TYPE__ADDRESS:
				return getAddress();
			case Jats1Package.NAMED_CONTENT_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.NAMED_CONTENT_TYPE__ARRAY:
				return getArray();
			case Jats1Package.NAMED_CONTENT_TYPE__BOXED_TEXT:
				return getBoxedText();
			case Jats1Package.NAMED_CONTENT_TYPE__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.NAMED_CONTENT_TYPE__CODE:
				return getCode();
			case Jats1Package.NAMED_CONTENT_TYPE__FIG:
				return getFig();
			case Jats1Package.NAMED_CONTENT_TYPE__FIG_GROUP:
				return getFigGroup();
			case Jats1Package.NAMED_CONTENT_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.NAMED_CONTENT_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.NAMED_CONTENT_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.NAMED_CONTENT_TYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.NAMED_CONTENT_TYPE__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.NAMED_CONTENT_TYPE__TABLE_WRAP_GROUP:
				return getTableWrapGroup();
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.NAMED_CONTENT_TYPE__BOLD:
				return getBold();
			case Jats1Package.NAMED_CONTENT_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.NAMED_CONTENT_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.NAMED_CONTENT_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.NAMED_CONTENT_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.NAMED_CONTENT_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.NAMED_CONTENT_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.NAMED_CONTENT_TYPE__SC:
				return getSc();
			case Jats1Package.NAMED_CONTENT_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.NAMED_CONTENT_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.NAMED_CONTENT_TYPE__RUBY:
				return getRuby();
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.NAMED_CONTENT_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.NAMED_CONTENT_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.NAMED_CONTENT_TYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.NAMED_CONTENT_TYPE__LIST:
				return getList();
			case Jats1Package.NAMED_CONTENT_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.NAMED_CONTENT_TYPE__MATH:
				return getMath();
			case Jats1Package.NAMED_CONTENT_TYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.NAMED_CONTENT_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.NAMED_CONTENT_TYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.NAMED_CONTENT_TYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.NAMED_CONTENT_TYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.NAMED_CONTENT_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.NAMED_CONTENT_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.NAMED_CONTENT_TYPE__FN:
				return getFn();
			case Jats1Package.NAMED_CONTENT_TYPE__TARGET:
				return getTarget();
			case Jats1Package.NAMED_CONTENT_TYPE__XREF:
				return getXref();
			case Jats1Package.NAMED_CONTENT_TYPE__SUB:
				return getSub();
			case Jats1Package.NAMED_CONTENT_TYPE__SUP:
				return getSup();
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_QUOTE:
				return getDispQuote();
			case Jats1Package.NAMED_CONTENT_TYPE__SPEECH:
				return getSpeech();
			case Jats1Package.NAMED_CONTENT_TYPE__STATEMENT:
				return getStatement();
			case Jats1Package.NAMED_CONTENT_TYPE__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.NAMED_CONTENT_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.NAMED_CONTENT_TYPE__ALT:
				return getAlt();
			case Jats1Package.NAMED_CONTENT_TYPE__BASE:
				return getBase();
			case Jats1Package.NAMED_CONTENT_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.NAMED_CONTENT_TYPE__HREF:
				return getHref();
			case Jats1Package.NAMED_CONTENT_TYPE__ID:
				return getId();
			case Jats1Package.NAMED_CONTENT_TYPE__LANG:
				return getLang();
			case Jats1Package.NAMED_CONTENT_TYPE__RID:
				return getRid();
			case Jats1Package.NAMED_CONTENT_TYPE__ROLE:
				return getRole();
			case Jats1Package.NAMED_CONTENT_TYPE__SHOW:
				return getShow();
			case Jats1Package.NAMED_CONTENT_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.NAMED_CONTENT_TYPE__TITLE:
				return getTitle();
			case Jats1Package.NAMED_CONTENT_TYPE__TYPE:
				return getType();
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB:
				return getVocab();
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_IDENTIFIER:
				return getVocabIdentifier();
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_TERM:
				return getVocabTerm();
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_TERM_IDENTIFIER:
				return getVocabTermIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Jats1Package.NAMED_CONTENT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__NAMED_CONTENT_ELEMENTS:
				((FeatureMap.Internal)getNamedContentElements()).set(newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				getInlineSupplementaryMaterial().addAll((Collection<? extends InlineSupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				getBoxedText().addAll((Collection<? extends BoxedTextType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				getChemStructWrap().addAll((Collection<? extends ChemStructWrapType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__FIG:
				getFig().clear();
				getFig().addAll((Collection<? extends FigType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__FIG_GROUP:
				getFigGroup().clear();
				getFigGroup().addAll((Collection<? extends FigGroupType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				getTableWrap().addAll((Collection<? extends TableWrapType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				getTableWrapGroup().addAll((Collection<? extends TableWrapGroupType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				getDispFormulaGroup().addAll((Collection<? extends DispFormulaGroupType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				getDispQuote().addAll((Collection<? extends DispQuoteType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SPEECH:
				getSpeech().clear();
				getSpeech().addAll((Collection<? extends SpeechType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends StatementType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				getVerseGroup().addAll((Collection<? extends VerseGroupType>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ALT:
				setAlt((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__RID:
				setRid((List<String>)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TYPE:
				setType((TypeType)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB:
				setVocab((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_IDENTIFIER:
				setVocabIdentifier((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_TERM:
				setVocabTerm((String)newValue);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_TERM_IDENTIFIER:
				setVocabTermIdentifier((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Jats1Package.NAMED_CONTENT_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__NAMED_CONTENT_ELEMENTS:
				getNamedContentElements().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__FIG:
				getFig().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__FIG_GROUP:
				getFigGroup().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SPEECH:
				getSpeech().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__STATEMENT:
				getStatement().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ALT:
				setAlt(ALT_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__RID:
				setRid(RID_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__TYPE:
				unsetType();
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB:
				setVocab(VOCAB_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_IDENTIFIER:
				setVocabIdentifier(VOCAB_IDENTIFIER_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_TERM:
				setVocabTerm(VOCAB_TERM_EDEFAULT);
				return;
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_TERM_IDENTIFIER:
				setVocabTermIdentifier(VOCAB_TERM_IDENTIFIER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Jats1Package.NAMED_CONTENT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__NAMED_CONTENT_ELEMENTS:
				return !getNamedContentElements().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return !getInlineSupplementaryMaterial().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__BOXED_TEXT:
				return !getBoxedText().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__CHEM_STRUCT_WRAP:
				return !getChemStructWrap().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__FIG:
				return !getFig().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__FIG_GROUP:
				return !getFigGroup().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__TABLE_WRAP:
				return !getTableWrap().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__TABLE_WRAP_GROUP:
				return !getTableWrapGroup().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_FORMULA_GROUP:
				return !getDispFormulaGroup().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__DISP_QUOTE:
				return !getDispQuote().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__SPEECH:
				return !getSpeech().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__STATEMENT:
				return !getStatement().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__VERSE_GROUP:
				return !getVerseGroup().isEmpty();
			case Jats1Package.NAMED_CONTENT_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.NAMED_CONTENT_TYPE__ALT:
				return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
			case Jats1Package.NAMED_CONTENT_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.NAMED_CONTENT_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.NAMED_CONTENT_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.NAMED_CONTENT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.NAMED_CONTENT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.NAMED_CONTENT_TYPE__RID:
				return RID_EDEFAULT == null ? rid != null : !RID_EDEFAULT.equals(rid);
			case Jats1Package.NAMED_CONTENT_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Jats1Package.NAMED_CONTENT_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.NAMED_CONTENT_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.NAMED_CONTENT_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Jats1Package.NAMED_CONTENT_TYPE__TYPE:
				return isSetType();
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB:
				return VOCAB_EDEFAULT == null ? vocab != null : !VOCAB_EDEFAULT.equals(vocab);
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_IDENTIFIER:
				return VOCAB_IDENTIFIER_EDEFAULT == null ? vocabIdentifier != null : !VOCAB_IDENTIFIER_EDEFAULT.equals(vocabIdentifier);
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_TERM:
				return VOCAB_TERM_EDEFAULT == null ? vocabTerm != null : !VOCAB_TERM_EDEFAULT.equals(vocabTerm);
			case Jats1Package.NAMED_CONTENT_TYPE__VOCAB_TERM_IDENTIFIER:
				return VOCAB_TERM_IDENTIFIER_EDEFAULT == null ? vocabTermIdentifier != null : !VOCAB_TERM_IDENTIFIER_EDEFAULT.equals(vocabTermIdentifier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", alt: ");
		result.append(alt);
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", rid: ");
		result.append(rid);
		result.append(", role: ");
		result.append(role);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", vocab: ");
		result.append(vocab);
		result.append(", vocabIdentifier: ");
		result.append(vocabIdentifier);
		result.append(", vocabTerm: ");
		result.append(vocabTerm);
		result.append(", vocabTermIdentifier: ");
		result.append(vocabTermIdentifier);
		result.append(')');
		return result.toString();
	}

} //NamedContentTypeImpl
