/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.DispFormulaGroupType;
import gov.nih.nlm.ncbi.jats1.DispFormulaType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
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
import gov.nih.nlm.ncbi.jats1.SeeAlsoType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.TargetType;
import gov.nih.nlm.ncbi.jats1.TexMathType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.UriType;
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
 * An implementation of the model object '<em><b>See Also Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getSeeAlsoElements <em>See Also Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getRid <em>Rid</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SeeAlsoTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeeAlsoTypeImpl extends MinimalEObjectImpl.Container implements SeeAlsoType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeeAlsoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getSeeAlsoType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.SEE_ALSO_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSeeAlsoElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getSeeAlsoType_SeeAlsoElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineSupplementaryMaterialType> getInlineSupplementaryMaterial() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_InlineSupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaGroupType> getDispFormulaGroup() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_DispFormulaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getSeeAlsoElements().list(Jats1Package.eINSTANCE.getSeeAlsoType_Preformat());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SEE_ALSO_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SEE_ALSO_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SEE_ALSO_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SEE_ALSO_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SEE_ALSO_TYPE__RID, oldRid, rid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SEE_ALSO_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.SEE_ALSO_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__SEE_ALSO_ELEMENTS:
				return ((InternalEList<?>)getSeeAlsoElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getInlineSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__DISP_FORMULA_GROUP:
				return ((InternalEList<?>)getDispFormulaGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.SEE_ALSO_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.SEE_ALSO_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.SEE_ALSO_TYPE__SEE_ALSO_ELEMENTS:
				if (coreType) return getSeeAlsoElements();
				return ((FeatureMap.Internal)getSeeAlsoElements()).getWrapper();
			case Jats1Package.SEE_ALSO_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.SEE_ALSO_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.SEE_ALSO_TYPE__URI:
				return getUri();
			case Jats1Package.SEE_ALSO_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return getInlineSupplementaryMaterial();
			case Jats1Package.SEE_ALSO_TYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.SEE_ALSO_TYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.SEE_ALSO_TYPE__BOLD:
				return getBold();
			case Jats1Package.SEE_ALSO_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.SEE_ALSO_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.SEE_ALSO_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.SEE_ALSO_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.SEE_ALSO_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.SEE_ALSO_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.SEE_ALSO_TYPE__SC:
				return getSc();
			case Jats1Package.SEE_ALSO_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.SEE_ALSO_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.SEE_ALSO_TYPE__RUBY:
				return getRuby();
			case Jats1Package.SEE_ALSO_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.SEE_ALSO_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.SEE_ALSO_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.SEE_ALSO_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.SEE_ALSO_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.SEE_ALSO_TYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.SEE_ALSO_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.SEE_ALSO_TYPE__MATH:
				return getMath();
			case Jats1Package.SEE_ALSO_TYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.SEE_ALSO_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.SEE_ALSO_TYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.SEE_ALSO_TYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.SEE_ALSO_TYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.SEE_ALSO_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.SEE_ALSO_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.SEE_ALSO_TYPE__FN:
				return getFn();
			case Jats1Package.SEE_ALSO_TYPE__TARGET:
				return getTarget();
			case Jats1Package.SEE_ALSO_TYPE__XREF:
				return getXref();
			case Jats1Package.SEE_ALSO_TYPE__SUB:
				return getSub();
			case Jats1Package.SEE_ALSO_TYPE__SUP:
				return getSup();
			case Jats1Package.SEE_ALSO_TYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.SEE_ALSO_TYPE__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.SEE_ALSO_TYPE__ARRAY:
				return getArray();
			case Jats1Package.SEE_ALSO_TYPE__CODE:
				return getCode();
			case Jats1Package.SEE_ALSO_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.SEE_ALSO_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.SEE_ALSO_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.SEE_ALSO_TYPE__BASE:
				return getBase();
			case Jats1Package.SEE_ALSO_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.SEE_ALSO_TYPE__ID:
				return getId();
			case Jats1Package.SEE_ALSO_TYPE__LANG:
				return getLang();
			case Jats1Package.SEE_ALSO_TYPE__RID:
				return getRid();
			case Jats1Package.SEE_ALSO_TYPE__SPECIFIC_USE:
				return getSpecificUse();
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
			case Jats1Package.SEE_ALSO_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__SEE_ALSO_ELEMENTS:
				((FeatureMap.Internal)getSeeAlsoElements()).set(newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				getInlineSupplementaryMaterial().addAll((Collection<? extends InlineSupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				getDispFormulaGroup().addAll((Collection<? extends DispFormulaGroupType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__RID:
				setRid((List<String>)newValue);
				return;
			case Jats1Package.SEE_ALSO_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
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
			case Jats1Package.SEE_ALSO_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__SEE_ALSO_ELEMENTS:
				getSeeAlsoElements().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.SEE_ALSO_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.SEE_ALSO_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.SEE_ALSO_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.SEE_ALSO_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.SEE_ALSO_TYPE__RID:
				setRid(RID_EDEFAULT);
				return;
			case Jats1Package.SEE_ALSO_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
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
			case Jats1Package.SEE_ALSO_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__SEE_ALSO_ELEMENTS:
				return !getSeeAlsoElements().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return !getInlineSupplementaryMaterial().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__DISP_FORMULA_GROUP:
				return !getDispFormulaGroup().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.SEE_ALSO_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.SEE_ALSO_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.SEE_ALSO_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.SEE_ALSO_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.SEE_ALSO_TYPE__RID:
				return RID_EDEFAULT == null ? rid != null : !RID_EDEFAULT.equals(rid);
			case Jats1Package.SEE_ALSO_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
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
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", rid: ");
		result.append(rid);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //SeeAlsoTypeImpl
