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
import gov.nih.nlm.ncbi.jats1.ToggleType9;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.UriType;
import gov.nih.nlm.ncbi.jats1.VerseGroupType;
import gov.nih.nlm.ncbi.jats1.XrefType;

import java.util.Collection;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Styled Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getStyledContentElements <em>Styled Content Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getStyleDetail <em>Style Detail</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getStyleType <em>Style Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StyledContentTypeImpl#getToggle <em>Toggle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyledContentTypeImpl extends MinimalEObjectImpl.Container implements StyledContentType {
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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleDetail() <em>Style Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleDetail() <em>Style Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleDetail()
	 * @generated
	 * @ordered
	 */
	protected String styleDetail = STYLE_DETAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleType() <em>Style Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleType()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleType() <em>Style Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleType()
	 * @generated
	 * @ordered
	 */
	protected String styleType = STYLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToggle() <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToggle()
	 * @generated
	 * @ordered
	 */
	protected static final ToggleType9 TOGGLE_EDEFAULT = ToggleType9.NO;

	/**
	 * The cached value of the '{@link #getToggle() <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToggle()
	 * @generated
	 * @ordered
	 */
	protected ToggleType9 toggle = TOGGLE_EDEFAULT;

	/**
	 * This is true if the Toggle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean toggleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyledContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getStyledContentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.STYLED_CONTENT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getStyledContentElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getStyledContentType_StyledContentElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineSupplementaryMaterialType> getInlineSupplementaryMaterial() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_InlineSupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoxedTextType> getBoxedText() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_BoxedText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructWrapType> getChemStructWrap() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_ChemStructWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigType> getFig() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Fig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigGroupType> getFigGroup() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_FigGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapType> getTableWrap() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_TableWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapGroupType> getTableWrapGroup() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_TableWrapGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaGroupType> getDispFormulaGroup() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_DispFormulaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispQuoteType> getDispQuote() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_DispQuote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechType> getSpeech() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Speech());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatementType> getStatement() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_Statement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseGroupType> getVerseGroup() {
		return getStyledContentElements().list(Jats1Package.eINSTANCE.getStyledContentType_VerseGroup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STYLED_CONTENT_TYPE__ALT, oldAlt, alt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STYLED_CONTENT_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STYLED_CONTENT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STYLED_CONTENT_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STYLED_CONTENT_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STYLED_CONTENT_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleDetail() {
		return styleDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleDetail(String newStyleDetail) {
		String oldStyleDetail = styleDetail;
		styleDetail = newStyleDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STYLED_CONTENT_TYPE__STYLE_DETAIL, oldStyleDetail, styleDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleType() {
		return styleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleType(String newStyleType) {
		String oldStyleType = styleType;
		styleType = newStyleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STYLED_CONTENT_TYPE__STYLE_TYPE, oldStyleType, styleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToggleType9 getToggle() {
		return toggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToggle(ToggleType9 newToggle) {
		ToggleType9 oldToggle = toggle;
		toggle = newToggle == null ? TOGGLE_EDEFAULT : newToggle;
		boolean oldToggleESet = toggleESet;
		toggleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STYLED_CONTENT_TYPE__TOGGLE, oldToggle, toggle, !oldToggleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetToggle() {
		ToggleType9 oldToggle = toggle;
		boolean oldToggleESet = toggleESet;
		toggle = TOGGLE_EDEFAULT;
		toggleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.STYLED_CONTENT_TYPE__TOGGLE, oldToggle, TOGGLE_EDEFAULT, oldToggleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetToggle() {
		return toggleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.STYLED_CONTENT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__STYLED_CONTENT_ELEMENTS:
				return ((InternalEList<?>)getStyledContentElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getInlineSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__BOXED_TEXT:
				return ((InternalEList<?>)getBoxedText()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__CHEM_STRUCT_WRAP:
				return ((InternalEList<?>)getChemStructWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__FIG:
				return ((InternalEList<?>)getFig()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__FIG_GROUP:
				return ((InternalEList<?>)getFigGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__TABLE_WRAP:
				return ((InternalEList<?>)getTableWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__TABLE_WRAP_GROUP:
				return ((InternalEList<?>)getTableWrapGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_FORMULA_GROUP:
				return ((InternalEList<?>)getDispFormulaGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_QUOTE:
				return ((InternalEList<?>)getDispQuote()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__SPEECH:
				return ((InternalEList<?>)getSpeech()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.STYLED_CONTENT_TYPE__VERSE_GROUP:
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
			case Jats1Package.STYLED_CONTENT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.STYLED_CONTENT_TYPE__STYLED_CONTENT_ELEMENTS:
				if (coreType) return getStyledContentElements();
				return ((FeatureMap.Internal)getStyledContentElements()).getWrapper();
			case Jats1Package.STYLED_CONTENT_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.STYLED_CONTENT_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.STYLED_CONTENT_TYPE__URI:
				return getUri();
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return getInlineSupplementaryMaterial();
			case Jats1Package.STYLED_CONTENT_TYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.STYLED_CONTENT_TYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.STYLED_CONTENT_TYPE__ADDRESS:
				return getAddress();
			case Jats1Package.STYLED_CONTENT_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.STYLED_CONTENT_TYPE__ARRAY:
				return getArray();
			case Jats1Package.STYLED_CONTENT_TYPE__BOXED_TEXT:
				return getBoxedText();
			case Jats1Package.STYLED_CONTENT_TYPE__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.STYLED_CONTENT_TYPE__CODE:
				return getCode();
			case Jats1Package.STYLED_CONTENT_TYPE__FIG:
				return getFig();
			case Jats1Package.STYLED_CONTENT_TYPE__FIG_GROUP:
				return getFigGroup();
			case Jats1Package.STYLED_CONTENT_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.STYLED_CONTENT_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.STYLED_CONTENT_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.STYLED_CONTENT_TYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.STYLED_CONTENT_TYPE__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.STYLED_CONTENT_TYPE__TABLE_WRAP_GROUP:
				return getTableWrapGroup();
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.STYLED_CONTENT_TYPE__BOLD:
				return getBold();
			case Jats1Package.STYLED_CONTENT_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.STYLED_CONTENT_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.STYLED_CONTENT_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.STYLED_CONTENT_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.STYLED_CONTENT_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.STYLED_CONTENT_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.STYLED_CONTENT_TYPE__SC:
				return getSc();
			case Jats1Package.STYLED_CONTENT_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.STYLED_CONTENT_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.STYLED_CONTENT_TYPE__RUBY:
				return getRuby();
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.STYLED_CONTENT_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.STYLED_CONTENT_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.STYLED_CONTENT_TYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.STYLED_CONTENT_TYPE__LIST:
				return getList();
			case Jats1Package.STYLED_CONTENT_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.STYLED_CONTENT_TYPE__MATH:
				return getMath();
			case Jats1Package.STYLED_CONTENT_TYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.STYLED_CONTENT_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.STYLED_CONTENT_TYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.STYLED_CONTENT_TYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.STYLED_CONTENT_TYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.STYLED_CONTENT_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.STYLED_CONTENT_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.STYLED_CONTENT_TYPE__FN:
				return getFn();
			case Jats1Package.STYLED_CONTENT_TYPE__TARGET:
				return getTarget();
			case Jats1Package.STYLED_CONTENT_TYPE__XREF:
				return getXref();
			case Jats1Package.STYLED_CONTENT_TYPE__SUB:
				return getSub();
			case Jats1Package.STYLED_CONTENT_TYPE__SUP:
				return getSup();
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_QUOTE:
				return getDispQuote();
			case Jats1Package.STYLED_CONTENT_TYPE__SPEECH:
				return getSpeech();
			case Jats1Package.STYLED_CONTENT_TYPE__STATEMENT:
				return getStatement();
			case Jats1Package.STYLED_CONTENT_TYPE__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.STYLED_CONTENT_TYPE__ALT:
				return getAlt();
			case Jats1Package.STYLED_CONTENT_TYPE__BASE:
				return getBase();
			case Jats1Package.STYLED_CONTENT_TYPE__ID:
				return getId();
			case Jats1Package.STYLED_CONTENT_TYPE__LANG:
				return getLang();
			case Jats1Package.STYLED_CONTENT_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE:
				return getStyle();
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE_DETAIL:
				return getStyleDetail();
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE_TYPE:
				return getStyleType();
			case Jats1Package.STYLED_CONTENT_TYPE__TOGGLE:
				return getToggle();
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
			case Jats1Package.STYLED_CONTENT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STYLED_CONTENT_ELEMENTS:
				((FeatureMap.Internal)getStyledContentElements()).set(newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				getInlineSupplementaryMaterial().addAll((Collection<? extends InlineSupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				getBoxedText().addAll((Collection<? extends BoxedTextType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				getChemStructWrap().addAll((Collection<? extends ChemStructWrapType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__FIG:
				getFig().clear();
				getFig().addAll((Collection<? extends FigType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__FIG_GROUP:
				getFigGroup().clear();
				getFigGroup().addAll((Collection<? extends FigGroupType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				getTableWrap().addAll((Collection<? extends TableWrapType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				getTableWrapGroup().addAll((Collection<? extends TableWrapGroupType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				getDispFormulaGroup().addAll((Collection<? extends DispFormulaGroupType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				getDispQuote().addAll((Collection<? extends DispQuoteType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SPEECH:
				getSpeech().clear();
				getSpeech().addAll((Collection<? extends SpeechType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends StatementType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				getVerseGroup().addAll((Collection<? extends VerseGroupType>)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ALT:
				setAlt((String)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE_DETAIL:
				setStyleDetail((String)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE_TYPE:
				setStyleType((String)newValue);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__TOGGLE:
				setToggle((ToggleType9)newValue);
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
			case Jats1Package.STYLED_CONTENT_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STYLED_CONTENT_ELEMENTS:
				getStyledContentElements().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__FIG:
				getFig().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__FIG_GROUP:
				getFigGroup().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SPEECH:
				getSpeech().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STATEMENT:
				getStatement().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ALT:
				setAlt(ALT_EDEFAULT);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE_DETAIL:
				setStyleDetail(STYLE_DETAIL_EDEFAULT);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE_TYPE:
				setStyleType(STYLE_TYPE_EDEFAULT);
				return;
			case Jats1Package.STYLED_CONTENT_TYPE__TOGGLE:
				unsetToggle();
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
			case Jats1Package.STYLED_CONTENT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__STYLED_CONTENT_ELEMENTS:
				return !getStyledContentElements().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return !getInlineSupplementaryMaterial().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__BOXED_TEXT:
				return !getBoxedText().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__CHEM_STRUCT_WRAP:
				return !getChemStructWrap().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__FIG:
				return !getFig().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__FIG_GROUP:
				return !getFigGroup().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__TABLE_WRAP:
				return !getTableWrap().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__TABLE_WRAP_GROUP:
				return !getTableWrapGroup().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_FORMULA_GROUP:
				return !getDispFormulaGroup().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__DISP_QUOTE:
				return !getDispQuote().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__SPEECH:
				return !getSpeech().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__STATEMENT:
				return !getStatement().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__VERSE_GROUP:
				return !getVerseGroup().isEmpty();
			case Jats1Package.STYLED_CONTENT_TYPE__ALT:
				return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
			case Jats1Package.STYLED_CONTENT_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.STYLED_CONTENT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.STYLED_CONTENT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.STYLED_CONTENT_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE_DETAIL:
				return STYLE_DETAIL_EDEFAULT == null ? styleDetail != null : !STYLE_DETAIL_EDEFAULT.equals(styleDetail);
			case Jats1Package.STYLED_CONTENT_TYPE__STYLE_TYPE:
				return STYLE_TYPE_EDEFAULT == null ? styleType != null : !STYLE_TYPE_EDEFAULT.equals(styleType);
			case Jats1Package.STYLED_CONTENT_TYPE__TOGGLE:
				return isSetToggle();
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
		result.append(", alt: ");
		result.append(alt);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", style: ");
		result.append(style);
		result.append(", styleDetail: ");
		result.append(styleDetail);
		result.append(", styleType: ");
		result.append(styleType);
		result.append(", toggle: ");
		if (toggleESet) result.append(toggle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StyledContentTypeImpl
