/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.AlignType2;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.BreakType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.CitationAlternativesType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.DefListType;
import gov.nih.nlm.ncbi.jats1.DispFormulaGroupType;
import gov.nih.nlm.ncbi.jats1.DispFormulaType;
import gov.nih.nlm.ncbi.jats1.ElementCitationType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.HrType;
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
import gov.nih.nlm.ncbi.jats1.MixedCitationType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.NlmCitationType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PType;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.PrivateCharType;
import gov.nih.nlm.ncbi.jats1.RelatedArticleType;
import gov.nih.nlm.ncbi.jats1.RelatedObjectType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.ScopeType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.TargetType;
import gov.nih.nlm.ncbi.jats1.TdType;
import gov.nih.nlm.ncbi.jats1.TexMathType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.UriType;
import gov.nih.nlm.ncbi.jats1.ValignType6;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Td Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getInsideCell <em>Inside Cell</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getBreak <em>Break</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getCitationAlternatives <em>Citation Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getElementCitation <em>Element Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getMixedCitation <em>Mixed Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getNlmCitation <em>Nlm Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TdTypeImpl#getValign <em>Valign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TdTypeImpl extends MinimalEObjectImpl.Container implements TdType {
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
	 * The default value of the '{@link #getAbbr() <em>Abbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbr()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbr() <em>Abbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbr()
	 * @generated
	 * @ordered
	 */
	protected String abbr = ABBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType2 ALIGN_EDEFAULT = AlignType2.CENTER;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType2 align = ALIGN_EDEFAULT;

	/**
	 * This is true if the Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignESet;

	/**
	 * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected static final String AXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected String axis = AXIS_EDEFAULT;

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
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected String char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAROFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected String charoff = CHAROFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected static final String COLSPAN_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected String colspan = COLSPAN_EDEFAULT;

	/**
	 * This is true if the Colspan attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colspanESet;

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
	 * The default value of the '{@link #getHeaders() <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> HEADERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected List<String> headers = HEADERS_EDEFAULT;

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
	 * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected static final String ROWSPAN_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected String rowspan = ROWSPAN_EDEFAULT;

	/**
	 * This is true if the Rowspan attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowspanESet;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeType SCOPE_EDEFAULT = ScopeType.COL;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected ScopeType scope = SCOPE_EDEFAULT;

	/**
	 * This is true if the Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scopeESet;

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
	 * The default value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected static final ValignType6 VALIGN_EDEFAULT = ValignType6.BASELINE;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected ValignType6 valign = VALIGN_EDEFAULT;

	/**
	 * This is true if the Valign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valignESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getTdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.TD_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getInsideCell() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getTdType_InsideCell());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HrType> getHr() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Hr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineSupplementaryMaterialType> getInlineSupplementaryMaterial() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_InlineSupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaGroupType> getDispFormulaGroup() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_DispFormulaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BreakType> getBreak() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Break());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationAlternativesType> getCitationAlternatives() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_CitationAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementCitationType> getElementCitation() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_ElementCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MixedCitationType> getMixedCitation() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_MixedCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NlmCitationType> getNlmCitation() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_NlmCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PType> getP() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getInsideCell().list(Jats1Package.eINSTANCE.getTdType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbbr() {
		return abbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbr(String newAbbr) {
		String oldAbbr = abbr;
		abbr = newAbbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__ABBR, oldAbbr, abbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignType2 getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign(AlignType2 newAlign) {
		AlignType2 oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAlign() {
		AlignType2 oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TD_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAlign() {
		return alignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxis(String newAxis) {
		String oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__AXIS, oldAxis, axis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChar(String newChar) {
		String oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharoff() {
		return charoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharoff(String newCharoff) {
		String oldCharoff = charoff;
		charoff = newCharoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__CHAROFF, oldCharoff, charoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColspan() {
		return colspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColspan(String newColspan) {
		String oldColspan = colspan;
		colspan = newColspan;
		boolean oldColspanESet = colspanESet;
		colspanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__COLSPAN, oldColspan, colspan, !oldColspanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetColspan() {
		String oldColspan = colspan;
		boolean oldColspanESet = colspanESet;
		colspan = COLSPAN_EDEFAULT;
		colspanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TD_TYPE__COLSPAN, oldColspan, COLSPAN_EDEFAULT, oldColspanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetColspan() {
		return colspanESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getHeaders() {
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaders(List<String> newHeaders) {
		List<String> oldHeaders = headers;
		headers = newHeaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__HEADERS, oldHeaders, headers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRowspan() {
		return rowspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowspan(String newRowspan) {
		String oldRowspan = rowspan;
		rowspan = newRowspan;
		boolean oldRowspanESet = rowspanESet;
		rowspanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__ROWSPAN, oldRowspan, rowspan, !oldRowspanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRowspan() {
		String oldRowspan = rowspan;
		boolean oldRowspanESet = rowspanESet;
		rowspan = ROWSPAN_EDEFAULT;
		rowspanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TD_TYPE__ROWSPAN, oldRowspan, ROWSPAN_EDEFAULT, oldRowspanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRowspan() {
		return rowspanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopeType getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(ScopeType newScope) {
		ScopeType oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		boolean oldScopeESet = scopeESet;
		scopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScope() {
		ScopeType oldScope = scope;
		boolean oldScopeESet = scopeESet;
		scope = SCOPE_EDEFAULT;
		scopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TD_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetScope() {
		return scopeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValignType6 getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValign(ValignType6 newValign) {
		ValignType6 oldValign = valign;
		valign = newValign == null ? VALIGN_EDEFAULT : newValign;
		boolean oldValignESet = valignESet;
		valignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TD_TYPE__VALIGN, oldValign, valign, !oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValign() {
		ValignType6 oldValign = valign;
		boolean oldValignESet = valignESet;
		valign = VALIGN_EDEFAULT;
		valignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TD_TYPE__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValign() {
		return valignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.TD_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__INSIDE_CELL:
				return ((InternalEList<?>)getInsideCell()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getInlineSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__DISP_FORMULA_GROUP:
				return ((InternalEList<?>)getDispFormulaGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__BREAK:
				return ((InternalEList<?>)getBreak()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__CITATION_ALTERNATIVES:
				return ((InternalEList<?>)getCitationAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__ELEMENT_CITATION:
				return ((InternalEList<?>)getElementCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__MIXED_CITATION:
				return ((InternalEList<?>)getMixedCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__NLM_CITATION:
				return ((InternalEList<?>)getNlmCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.TD_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.TD_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.TD_TYPE__INSIDE_CELL:
				if (coreType) return getInsideCell();
				return ((FeatureMap.Internal)getInsideCell()).getWrapper();
			case Jats1Package.TD_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.TD_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.TD_TYPE__URI:
				return getUri();
			case Jats1Package.TD_TYPE__HR:
				return getHr();
			case Jats1Package.TD_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return getInlineSupplementaryMaterial();
			case Jats1Package.TD_TYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.TD_TYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.TD_TYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.TD_TYPE__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.TD_TYPE__BREAK:
				return getBreak();
			case Jats1Package.TD_TYPE__CITATION_ALTERNATIVES:
				return getCitationAlternatives();
			case Jats1Package.TD_TYPE__ELEMENT_CITATION:
				return getElementCitation();
			case Jats1Package.TD_TYPE__MIXED_CITATION:
				return getMixedCitation();
			case Jats1Package.TD_TYPE__NLM_CITATION:
				return getNlmCitation();
			case Jats1Package.TD_TYPE__BOLD:
				return getBold();
			case Jats1Package.TD_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.TD_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.TD_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.TD_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.TD_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.TD_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.TD_TYPE__SC:
				return getSc();
			case Jats1Package.TD_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.TD_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.TD_TYPE__RUBY:
				return getRuby();
			case Jats1Package.TD_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.TD_TYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.TD_TYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.TD_TYPE__LIST:
				return getList();
			case Jats1Package.TD_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.TD_TYPE__MATH:
				return getMath();
			case Jats1Package.TD_TYPE__P:
				return getP();
			case Jats1Package.TD_TYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.TD_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.TD_TYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.TD_TYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.TD_TYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.TD_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.TD_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.TD_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.TD_TYPE__ARRAY:
				return getArray();
			case Jats1Package.TD_TYPE__CODE:
				return getCode();
			case Jats1Package.TD_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.TD_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.TD_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.TD_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.TD_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.TD_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.TD_TYPE__FN:
				return getFn();
			case Jats1Package.TD_TYPE__TARGET:
				return getTarget();
			case Jats1Package.TD_TYPE__XREF:
				return getXref();
			case Jats1Package.TD_TYPE__SUB:
				return getSub();
			case Jats1Package.TD_TYPE__SUP:
				return getSup();
			case Jats1Package.TD_TYPE__ABBR:
				return getAbbr();
			case Jats1Package.TD_TYPE__ALIGN:
				return getAlign();
			case Jats1Package.TD_TYPE__AXIS:
				return getAxis();
			case Jats1Package.TD_TYPE__BASE:
				return getBase();
			case Jats1Package.TD_TYPE__CHAR:
				return getChar();
			case Jats1Package.TD_TYPE__CHAROFF:
				return getCharoff();
			case Jats1Package.TD_TYPE__COLSPAN:
				return getColspan();
			case Jats1Package.TD_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.TD_TYPE__HEADERS:
				return getHeaders();
			case Jats1Package.TD_TYPE__ID:
				return getId();
			case Jats1Package.TD_TYPE__ROWSPAN:
				return getRowspan();
			case Jats1Package.TD_TYPE__SCOPE:
				return getScope();
			case Jats1Package.TD_TYPE__STYLE:
				return getStyle();
			case Jats1Package.TD_TYPE__VALIGN:
				return getValign();
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
			case Jats1Package.TD_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.TD_TYPE__INSIDE_CELL:
				((FeatureMap.Internal)getInsideCell()).set(newValue);
				return;
			case Jats1Package.TD_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.TD_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.TD_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.TD_TYPE__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends HrType>)newValue);
				return;
			case Jats1Package.TD_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				getInlineSupplementaryMaterial().addAll((Collection<? extends InlineSupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.TD_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.TD_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.TD_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.TD_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				getDispFormulaGroup().addAll((Collection<? extends DispFormulaGroupType>)newValue);
				return;
			case Jats1Package.TD_TYPE__BREAK:
				getBreak().clear();
				getBreak().addAll((Collection<? extends BreakType>)newValue);
				return;
			case Jats1Package.TD_TYPE__CITATION_ALTERNATIVES:
				getCitationAlternatives().clear();
				getCitationAlternatives().addAll((Collection<? extends CitationAlternativesType>)newValue);
				return;
			case Jats1Package.TD_TYPE__ELEMENT_CITATION:
				getElementCitation().clear();
				getElementCitation().addAll((Collection<? extends ElementCitationType>)newValue);
				return;
			case Jats1Package.TD_TYPE__MIXED_CITATION:
				getMixedCitation().clear();
				getMixedCitation().addAll((Collection<? extends MixedCitationType>)newValue);
				return;
			case Jats1Package.TD_TYPE__NLM_CITATION:
				getNlmCitation().clear();
				getNlmCitation().addAll((Collection<? extends NlmCitationType>)newValue);
				return;
			case Jats1Package.TD_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.TD_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.TD_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.TD_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.TD_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.TD_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.TD_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.TD_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.TD_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.TD_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.TD_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.TD_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.TD_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.TD_TYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.TD_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.TD_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.TD_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.TD_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case Jats1Package.TD_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.TD_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.TD_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.TD_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.TD_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.TD_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.TD_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.TD_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.TD_TYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.TD_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.TD_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.TD_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.TD_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.TD_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.TD_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.TD_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.TD_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.TD_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.TD_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.TD_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.TD_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.TD_TYPE__ABBR:
				setAbbr((String)newValue);
				return;
			case Jats1Package.TD_TYPE__ALIGN:
				setAlign((AlignType2)newValue);
				return;
			case Jats1Package.TD_TYPE__AXIS:
				setAxis((String)newValue);
				return;
			case Jats1Package.TD_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.TD_TYPE__CHAR:
				setChar((String)newValue);
				return;
			case Jats1Package.TD_TYPE__CHAROFF:
				setCharoff((String)newValue);
				return;
			case Jats1Package.TD_TYPE__COLSPAN:
				setColspan((String)newValue);
				return;
			case Jats1Package.TD_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.TD_TYPE__HEADERS:
				setHeaders((List<String>)newValue);
				return;
			case Jats1Package.TD_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.TD_TYPE__ROWSPAN:
				setRowspan((String)newValue);
				return;
			case Jats1Package.TD_TYPE__SCOPE:
				setScope((ScopeType)newValue);
				return;
			case Jats1Package.TD_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case Jats1Package.TD_TYPE__VALIGN:
				setValign((ValignType6)newValue);
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
			case Jats1Package.TD_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.TD_TYPE__INSIDE_CELL:
				getInsideCell().clear();
				return;
			case Jats1Package.TD_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.TD_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.TD_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.TD_TYPE__HR:
				getHr().clear();
				return;
			case Jats1Package.TD_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				return;
			case Jats1Package.TD_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.TD_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.TD_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.TD_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				return;
			case Jats1Package.TD_TYPE__BREAK:
				getBreak().clear();
				return;
			case Jats1Package.TD_TYPE__CITATION_ALTERNATIVES:
				getCitationAlternatives().clear();
				return;
			case Jats1Package.TD_TYPE__ELEMENT_CITATION:
				getElementCitation().clear();
				return;
			case Jats1Package.TD_TYPE__MIXED_CITATION:
				getMixedCitation().clear();
				return;
			case Jats1Package.TD_TYPE__NLM_CITATION:
				getNlmCitation().clear();
				return;
			case Jats1Package.TD_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.TD_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.TD_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.TD_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.TD_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.TD_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.TD_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.TD_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.TD_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.TD_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.TD_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.TD_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.TD_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.TD_TYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.TD_TYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.TD_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.TD_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.TD_TYPE__P:
				getP().clear();
				return;
			case Jats1Package.TD_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.TD_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.TD_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.TD_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.TD_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.TD_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.TD_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.TD_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.TD_TYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.TD_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.TD_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.TD_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.TD_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.TD_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.TD_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.TD_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.TD_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.TD_TYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.TD_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.TD_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.TD_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.TD_TYPE__ABBR:
				setAbbr(ABBR_EDEFAULT);
				return;
			case Jats1Package.TD_TYPE__ALIGN:
				unsetAlign();
				return;
			case Jats1Package.TD_TYPE__AXIS:
				setAxis(AXIS_EDEFAULT);
				return;
			case Jats1Package.TD_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.TD_TYPE__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case Jats1Package.TD_TYPE__CHAROFF:
				setCharoff(CHAROFF_EDEFAULT);
				return;
			case Jats1Package.TD_TYPE__COLSPAN:
				unsetColspan();
				return;
			case Jats1Package.TD_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.TD_TYPE__HEADERS:
				setHeaders(HEADERS_EDEFAULT);
				return;
			case Jats1Package.TD_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.TD_TYPE__ROWSPAN:
				unsetRowspan();
				return;
			case Jats1Package.TD_TYPE__SCOPE:
				unsetScope();
				return;
			case Jats1Package.TD_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case Jats1Package.TD_TYPE__VALIGN:
				unsetValign();
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
			case Jats1Package.TD_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.TD_TYPE__INSIDE_CELL:
				return !getInsideCell().isEmpty();
			case Jats1Package.TD_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.TD_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.TD_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.TD_TYPE__HR:
				return !getHr().isEmpty();
			case Jats1Package.TD_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return !getInlineSupplementaryMaterial().isEmpty();
			case Jats1Package.TD_TYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.TD_TYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.TD_TYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.TD_TYPE__DISP_FORMULA_GROUP:
				return !getDispFormulaGroup().isEmpty();
			case Jats1Package.TD_TYPE__BREAK:
				return !getBreak().isEmpty();
			case Jats1Package.TD_TYPE__CITATION_ALTERNATIVES:
				return !getCitationAlternatives().isEmpty();
			case Jats1Package.TD_TYPE__ELEMENT_CITATION:
				return !getElementCitation().isEmpty();
			case Jats1Package.TD_TYPE__MIXED_CITATION:
				return !getMixedCitation().isEmpty();
			case Jats1Package.TD_TYPE__NLM_CITATION:
				return !getNlmCitation().isEmpty();
			case Jats1Package.TD_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.TD_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.TD_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.TD_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.TD_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.TD_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.TD_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.TD_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.TD_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.TD_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.TD_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.TD_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.TD_TYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.TD_TYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.TD_TYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.TD_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.TD_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.TD_TYPE__P:
				return !getP().isEmpty();
			case Jats1Package.TD_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.TD_TYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.TD_TYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.TD_TYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.TD_TYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.TD_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.TD_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.TD_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.TD_TYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.TD_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.TD_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.TD_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.TD_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.TD_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.TD_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.TD_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.TD_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.TD_TYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.TD_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.TD_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.TD_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.TD_TYPE__ABBR:
				return ABBR_EDEFAULT == null ? abbr != null : !ABBR_EDEFAULT.equals(abbr);
			case Jats1Package.TD_TYPE__ALIGN:
				return isSetAlign();
			case Jats1Package.TD_TYPE__AXIS:
				return AXIS_EDEFAULT == null ? axis != null : !AXIS_EDEFAULT.equals(axis);
			case Jats1Package.TD_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.TD_TYPE__CHAR:
				return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
			case Jats1Package.TD_TYPE__CHAROFF:
				return CHAROFF_EDEFAULT == null ? charoff != null : !CHAROFF_EDEFAULT.equals(charoff);
			case Jats1Package.TD_TYPE__COLSPAN:
				return isSetColspan();
			case Jats1Package.TD_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.TD_TYPE__HEADERS:
				return HEADERS_EDEFAULT == null ? headers != null : !HEADERS_EDEFAULT.equals(headers);
			case Jats1Package.TD_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.TD_TYPE__ROWSPAN:
				return isSetRowspan();
			case Jats1Package.TD_TYPE__SCOPE:
				return isSetScope();
			case Jats1Package.TD_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case Jats1Package.TD_TYPE__VALIGN:
				return isSetValign();
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
		result.append(", abbr: ");
		result.append(abbr);
		result.append(", align: ");
		if (alignESet) result.append(align); else result.append("<unset>");
		result.append(", axis: ");
		result.append(axis);
		result.append(", base: ");
		result.append(base);
		result.append(", char: ");
		result.append(char_);
		result.append(", charoff: ");
		result.append(charoff);
		result.append(", colspan: ");
		if (colspanESet) result.append(colspan); else result.append("<unset>");
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", headers: ");
		result.append(headers);
		result.append(", id: ");
		result.append(id);
		result.append(", rowspan: ");
		if (rowspanESet) result.append(rowspan); else result.append("<unset>");
		result.append(", scope: ");
		if (scopeESet) result.append(scope); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", valign: ");
		if (valignESet) result.append(valign); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TdTypeImpl
