/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.AwardIdType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.BoxedTextType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.ChemStructWrapType;
import gov.nih.nlm.ncbi.jats1.CitationAlternativesType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.DefListType;
import gov.nih.nlm.ncbi.jats1.DispFormulaGroupType;
import gov.nih.nlm.ncbi.jats1.DispFormulaType;
import gov.nih.nlm.ncbi.jats1.DispQuoteType;
import gov.nih.nlm.ncbi.jats1.ElementCitationType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FigGroupType;
import gov.nih.nlm.ncbi.jats1.FigType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.FundingSourceType;
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
import gov.nih.nlm.ncbi.jats1.MixedCitationType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.NlmCitationType;
import gov.nih.nlm.ncbi.jats1.OpenAccessType;
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
 * An implementation of the model object '<em><b>PType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getPElements <em>PElements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getCitationAlternatives <em>Citation Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getElementCitation <em>Element Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getMixedCitation <em>Mixed Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getNlmCitation <em>Nlm Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getAwardId <em>Award Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getFundingSource <em>Funding Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getOpenAccess <em>Open Access</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTypeImpl extends MinimalEObjectImpl.Container implements PType {
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
	protected PTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getPType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.PTYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getPType_PElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineSupplementaryMaterialType> getInlineSupplementaryMaterial() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_InlineSupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoxedTextType> getBoxedText() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_BoxedText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructWrapType> getChemStructWrap() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_ChemStructWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigType> getFig() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Fig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigGroupType> getFigGroup() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_FigGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapType> getTableWrap() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_TableWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapGroupType> getTableWrapGroup() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_TableWrapGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaGroupType> getDispFormulaGroup() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_DispFormulaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationAlternativesType> getCitationAlternatives() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_CitationAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementCitationType> getElementCitation() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_ElementCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MixedCitationType> getMixedCitation() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_MixedCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NlmCitationType> getNlmCitation() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_NlmCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AwardIdType> getAwardId() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_AwardId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FundingSourceType> getFundingSource() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_FundingSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OpenAccessType> getOpenAccess() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_OpenAccess());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispQuoteType> getDispQuote() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_DispQuote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechType> getSpeech() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Speech());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatementType> getStatement() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Statement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseGroupType> getVerseGroup() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_VerseGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getPElements().list(Jats1Package.eINSTANCE.getPType_Sup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PTYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PTYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PTYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PTYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PTYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.PTYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__PELEMENTS:
				return ((InternalEList<?>)getPElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getInlineSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__BOXED_TEXT:
				return ((InternalEList<?>)getBoxedText()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__CHEM_STRUCT_WRAP:
				return ((InternalEList<?>)getChemStructWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__FIG:
				return ((InternalEList<?>)getFig()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__FIG_GROUP:
				return ((InternalEList<?>)getFigGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__TABLE_WRAP:
				return ((InternalEList<?>)getTableWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__TABLE_WRAP_GROUP:
				return ((InternalEList<?>)getTableWrapGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__DISP_FORMULA_GROUP:
				return ((InternalEList<?>)getDispFormulaGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__CITATION_ALTERNATIVES:
				return ((InternalEList<?>)getCitationAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__ELEMENT_CITATION:
				return ((InternalEList<?>)getElementCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__MIXED_CITATION:
				return ((InternalEList<?>)getMixedCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__NLM_CITATION:
				return ((InternalEList<?>)getNlmCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__AWARD_ID:
				return ((InternalEList<?>)getAwardId()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__FUNDING_SOURCE:
				return ((InternalEList<?>)getFundingSource()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__OPEN_ACCESS:
				return ((InternalEList<?>)getOpenAccess()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__DISP_QUOTE:
				return ((InternalEList<?>)getDispQuote()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__SPEECH:
				return ((InternalEList<?>)getSpeech()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__VERSE_GROUP:
				return ((InternalEList<?>)getVerseGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.PTYPE__SUP:
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
			case Jats1Package.PTYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.PTYPE__PELEMENTS:
				if (coreType) return getPElements();
				return ((FeatureMap.Internal)getPElements()).getWrapper();
			case Jats1Package.PTYPE__EMAIL:
				return getEmail();
			case Jats1Package.PTYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.PTYPE__URI:
				return getUri();
			case Jats1Package.PTYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return getInlineSupplementaryMaterial();
			case Jats1Package.PTYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.PTYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.PTYPE__ADDRESS:
				return getAddress();
			case Jats1Package.PTYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.PTYPE__ARRAY:
				return getArray();
			case Jats1Package.PTYPE__BOXED_TEXT:
				return getBoxedText();
			case Jats1Package.PTYPE__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.PTYPE__CODE:
				return getCode();
			case Jats1Package.PTYPE__FIG:
				return getFig();
			case Jats1Package.PTYPE__FIG_GROUP:
				return getFigGroup();
			case Jats1Package.PTYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.PTYPE__MEDIA:
				return getMedia();
			case Jats1Package.PTYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.PTYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.PTYPE__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.PTYPE__TABLE_WRAP_GROUP:
				return getTableWrapGroup();
			case Jats1Package.PTYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.PTYPE__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.PTYPE__CITATION_ALTERNATIVES:
				return getCitationAlternatives();
			case Jats1Package.PTYPE__ELEMENT_CITATION:
				return getElementCitation();
			case Jats1Package.PTYPE__MIXED_CITATION:
				return getMixedCitation();
			case Jats1Package.PTYPE__NLM_CITATION:
				return getNlmCitation();
			case Jats1Package.PTYPE__BOLD:
				return getBold();
			case Jats1Package.PTYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.PTYPE__ITALIC:
				return getItalic();
			case Jats1Package.PTYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.PTYPE__OVERLINE:
				return getOverline();
			case Jats1Package.PTYPE__ROMAN:
				return getRoman();
			case Jats1Package.PTYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.PTYPE__SC:
				return getSc();
			case Jats1Package.PTYPE__STRIKE:
				return getStrike();
			case Jats1Package.PTYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.PTYPE__RUBY:
				return getRuby();
			case Jats1Package.PTYPE__AWARD_ID:
				return getAwardId();
			case Jats1Package.PTYPE__FUNDING_SOURCE:
				return getFundingSource();
			case Jats1Package.PTYPE__OPEN_ACCESS:
				return getOpenAccess();
			case Jats1Package.PTYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.PTYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.PTYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.PTYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.PTYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.PTYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.PTYPE__LIST:
				return getList();
			case Jats1Package.PTYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.PTYPE__MATH:
				return getMath();
			case Jats1Package.PTYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.PTYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.PTYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.PTYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.PTYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.PTYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.PTYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.PTYPE__DISP_QUOTE:
				return getDispQuote();
			case Jats1Package.PTYPE__SPEECH:
				return getSpeech();
			case Jats1Package.PTYPE__STATEMENT:
				return getStatement();
			case Jats1Package.PTYPE__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.PTYPE__FN:
				return getFn();
			case Jats1Package.PTYPE__TARGET:
				return getTarget();
			case Jats1Package.PTYPE__XREF:
				return getXref();
			case Jats1Package.PTYPE__SUB:
				return getSub();
			case Jats1Package.PTYPE__SUP:
				return getSup();
			case Jats1Package.PTYPE__BASE:
				return getBase();
			case Jats1Package.PTYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.PTYPE__ID:
				return getId();
			case Jats1Package.PTYPE__LANG:
				return getLang();
			case Jats1Package.PTYPE__SPECIFIC_USE:
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
			case Jats1Package.PTYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.PTYPE__PELEMENTS:
				((FeatureMap.Internal)getPElements()).set(newValue);
				return;
			case Jats1Package.PTYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.PTYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.PTYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.PTYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				getInlineSupplementaryMaterial().addAll((Collection<? extends InlineSupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.PTYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.PTYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.PTYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.PTYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.PTYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.PTYPE__BOXED_TEXT:
				getBoxedText().clear();
				getBoxedText().addAll((Collection<? extends BoxedTextType>)newValue);
				return;
			case Jats1Package.PTYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				getChemStructWrap().addAll((Collection<? extends ChemStructWrapType>)newValue);
				return;
			case Jats1Package.PTYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.PTYPE__FIG:
				getFig().clear();
				getFig().addAll((Collection<? extends FigType>)newValue);
				return;
			case Jats1Package.PTYPE__FIG_GROUP:
				getFigGroup().clear();
				getFigGroup().addAll((Collection<? extends FigGroupType>)newValue);
				return;
			case Jats1Package.PTYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.PTYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.PTYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.PTYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.PTYPE__TABLE_WRAP:
				getTableWrap().clear();
				getTableWrap().addAll((Collection<? extends TableWrapType>)newValue);
				return;
			case Jats1Package.PTYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				getTableWrapGroup().addAll((Collection<? extends TableWrapGroupType>)newValue);
				return;
			case Jats1Package.PTYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.PTYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				getDispFormulaGroup().addAll((Collection<? extends DispFormulaGroupType>)newValue);
				return;
			case Jats1Package.PTYPE__CITATION_ALTERNATIVES:
				getCitationAlternatives().clear();
				getCitationAlternatives().addAll((Collection<? extends CitationAlternativesType>)newValue);
				return;
			case Jats1Package.PTYPE__ELEMENT_CITATION:
				getElementCitation().clear();
				getElementCitation().addAll((Collection<? extends ElementCitationType>)newValue);
				return;
			case Jats1Package.PTYPE__MIXED_CITATION:
				getMixedCitation().clear();
				getMixedCitation().addAll((Collection<? extends MixedCitationType>)newValue);
				return;
			case Jats1Package.PTYPE__NLM_CITATION:
				getNlmCitation().clear();
				getNlmCitation().addAll((Collection<? extends NlmCitationType>)newValue);
				return;
			case Jats1Package.PTYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.PTYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.PTYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.PTYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.PTYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.PTYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.PTYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.PTYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.PTYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.PTYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.PTYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.PTYPE__AWARD_ID:
				getAwardId().clear();
				getAwardId().addAll((Collection<? extends AwardIdType>)newValue);
				return;
			case Jats1Package.PTYPE__FUNDING_SOURCE:
				getFundingSource().clear();
				getFundingSource().addAll((Collection<? extends FundingSourceType>)newValue);
				return;
			case Jats1Package.PTYPE__OPEN_ACCESS:
				getOpenAccess().clear();
				getOpenAccess().addAll((Collection<? extends OpenAccessType>)newValue);
				return;
			case Jats1Package.PTYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.PTYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.PTYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.PTYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.PTYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.PTYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.PTYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.PTYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.PTYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.PTYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.PTYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.PTYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.PTYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.PTYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.PTYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.PTYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.PTYPE__DISP_QUOTE:
				getDispQuote().clear();
				getDispQuote().addAll((Collection<? extends DispQuoteType>)newValue);
				return;
			case Jats1Package.PTYPE__SPEECH:
				getSpeech().clear();
				getSpeech().addAll((Collection<? extends SpeechType>)newValue);
				return;
			case Jats1Package.PTYPE__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends StatementType>)newValue);
				return;
			case Jats1Package.PTYPE__VERSE_GROUP:
				getVerseGroup().clear();
				getVerseGroup().addAll((Collection<? extends VerseGroupType>)newValue);
				return;
			case Jats1Package.PTYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.PTYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.PTYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.PTYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.PTYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.PTYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.PTYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.PTYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.PTYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.PTYPE__SPECIFIC_USE:
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
			case Jats1Package.PTYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.PTYPE__PELEMENTS:
				getPElements().clear();
				return;
			case Jats1Package.PTYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.PTYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.PTYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.PTYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				return;
			case Jats1Package.PTYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.PTYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.PTYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.PTYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.PTYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.PTYPE__BOXED_TEXT:
				getBoxedText().clear();
				return;
			case Jats1Package.PTYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				return;
			case Jats1Package.PTYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.PTYPE__FIG:
				getFig().clear();
				return;
			case Jats1Package.PTYPE__FIG_GROUP:
				getFigGroup().clear();
				return;
			case Jats1Package.PTYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.PTYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.PTYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.PTYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.PTYPE__TABLE_WRAP:
				getTableWrap().clear();
				return;
			case Jats1Package.PTYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				return;
			case Jats1Package.PTYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.PTYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				return;
			case Jats1Package.PTYPE__CITATION_ALTERNATIVES:
				getCitationAlternatives().clear();
				return;
			case Jats1Package.PTYPE__ELEMENT_CITATION:
				getElementCitation().clear();
				return;
			case Jats1Package.PTYPE__MIXED_CITATION:
				getMixedCitation().clear();
				return;
			case Jats1Package.PTYPE__NLM_CITATION:
				getNlmCitation().clear();
				return;
			case Jats1Package.PTYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.PTYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.PTYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.PTYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.PTYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.PTYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.PTYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.PTYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.PTYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.PTYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.PTYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.PTYPE__AWARD_ID:
				getAwardId().clear();
				return;
			case Jats1Package.PTYPE__FUNDING_SOURCE:
				getFundingSource().clear();
				return;
			case Jats1Package.PTYPE__OPEN_ACCESS:
				getOpenAccess().clear();
				return;
			case Jats1Package.PTYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.PTYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.PTYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.PTYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.PTYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.PTYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.PTYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.PTYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.PTYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.PTYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.PTYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.PTYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.PTYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.PTYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.PTYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.PTYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.PTYPE__DISP_QUOTE:
				getDispQuote().clear();
				return;
			case Jats1Package.PTYPE__SPEECH:
				getSpeech().clear();
				return;
			case Jats1Package.PTYPE__STATEMENT:
				getStatement().clear();
				return;
			case Jats1Package.PTYPE__VERSE_GROUP:
				getVerseGroup().clear();
				return;
			case Jats1Package.PTYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.PTYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.PTYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.PTYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.PTYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.PTYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.PTYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.PTYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.PTYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.PTYPE__SPECIFIC_USE:
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
			case Jats1Package.PTYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.PTYPE__PELEMENTS:
				return !getPElements().isEmpty();
			case Jats1Package.PTYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.PTYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.PTYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.PTYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return !getInlineSupplementaryMaterial().isEmpty();
			case Jats1Package.PTYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.PTYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.PTYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.PTYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.PTYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.PTYPE__BOXED_TEXT:
				return !getBoxedText().isEmpty();
			case Jats1Package.PTYPE__CHEM_STRUCT_WRAP:
				return !getChemStructWrap().isEmpty();
			case Jats1Package.PTYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.PTYPE__FIG:
				return !getFig().isEmpty();
			case Jats1Package.PTYPE__FIG_GROUP:
				return !getFigGroup().isEmpty();
			case Jats1Package.PTYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.PTYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.PTYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.PTYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.PTYPE__TABLE_WRAP:
				return !getTableWrap().isEmpty();
			case Jats1Package.PTYPE__TABLE_WRAP_GROUP:
				return !getTableWrapGroup().isEmpty();
			case Jats1Package.PTYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.PTYPE__DISP_FORMULA_GROUP:
				return !getDispFormulaGroup().isEmpty();
			case Jats1Package.PTYPE__CITATION_ALTERNATIVES:
				return !getCitationAlternatives().isEmpty();
			case Jats1Package.PTYPE__ELEMENT_CITATION:
				return !getElementCitation().isEmpty();
			case Jats1Package.PTYPE__MIXED_CITATION:
				return !getMixedCitation().isEmpty();
			case Jats1Package.PTYPE__NLM_CITATION:
				return !getNlmCitation().isEmpty();
			case Jats1Package.PTYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.PTYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.PTYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.PTYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.PTYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.PTYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.PTYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.PTYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.PTYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.PTYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.PTYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.PTYPE__AWARD_ID:
				return !getAwardId().isEmpty();
			case Jats1Package.PTYPE__FUNDING_SOURCE:
				return !getFundingSource().isEmpty();
			case Jats1Package.PTYPE__OPEN_ACCESS:
				return !getOpenAccess().isEmpty();
			case Jats1Package.PTYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.PTYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.PTYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.PTYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.PTYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.PTYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.PTYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.PTYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.PTYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.PTYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.PTYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.PTYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.PTYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.PTYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.PTYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.PTYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.PTYPE__DISP_QUOTE:
				return !getDispQuote().isEmpty();
			case Jats1Package.PTYPE__SPEECH:
				return !getSpeech().isEmpty();
			case Jats1Package.PTYPE__STATEMENT:
				return !getStatement().isEmpty();
			case Jats1Package.PTYPE__VERSE_GROUP:
				return !getVerseGroup().isEmpty();
			case Jats1Package.PTYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.PTYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.PTYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.PTYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.PTYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.PTYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.PTYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.PTYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.PTYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.PTYPE__SPECIFIC_USE:
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
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //PTypeImpl
