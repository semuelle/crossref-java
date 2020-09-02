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
import gov.nih.nlm.ncbi.jats1.LicensePType;
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
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.PriceType;
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
 * An implementation of the model object '<em><b>License PType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getLicensePElements <em>License PElements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getCitationAlternatives <em>Citation Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getElementCitation <em>Element Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getMixedCitation <em>Mixed Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getNlmCitation <em>Nlm Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getAwardId <em>Award Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getFundingSource <em>Funding Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getOpenAccess <em>Open Access</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.LicensePTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicensePTypeImpl extends MinimalEObjectImpl.Container implements LicensePType {
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
	protected LicensePTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getLicensePType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.LICENSE_PTYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLicensePElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getLicensePType_LicensePElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineSupplementaryMaterialType> getInlineSupplementaryMaterial() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_InlineSupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoxedTextType> getBoxedText() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_BoxedText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructWrapType> getChemStructWrap() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_ChemStructWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigType> getFig() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Fig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigGroupType> getFigGroup() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_FigGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapType> getTableWrap() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_TableWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapGroupType> getTableWrapGroup() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_TableWrapGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaGroupType> getDispFormulaGroup() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_DispFormulaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationAlternativesType> getCitationAlternatives() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_CitationAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementCitationType> getElementCitation() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_ElementCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MixedCitationType> getMixedCitation() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_MixedCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NlmCitationType> getNlmCitation() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_NlmCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AwardIdType> getAwardId() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_AwardId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FundingSourceType> getFundingSource() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_FundingSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OpenAccessType> getOpenAccess() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_OpenAccess());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispQuoteType> getDispQuote() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_DispQuote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechType> getSpeech() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Speech());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatementType> getStatement() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Statement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseGroupType> getVerseGroup() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_VerseGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PriceType> getPrice() {
		return getLicensePElements().list(Jats1Package.eINSTANCE.getLicensePType_Price());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.LICENSE_PTYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.LICENSE_PTYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.LICENSE_PTYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.LICENSE_PTYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.LICENSE_PTYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__LICENSE_PELEMENTS:
				return ((InternalEList<?>)getLicensePElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getInlineSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__BOXED_TEXT:
				return ((InternalEList<?>)getBoxedText()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__CHEM_STRUCT_WRAP:
				return ((InternalEList<?>)getChemStructWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__FIG:
				return ((InternalEList<?>)getFig()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__FIG_GROUP:
				return ((InternalEList<?>)getFigGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__TABLE_WRAP:
				return ((InternalEList<?>)getTableWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__TABLE_WRAP_GROUP:
				return ((InternalEList<?>)getTableWrapGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__DISP_FORMULA_GROUP:
				return ((InternalEList<?>)getDispFormulaGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__CITATION_ALTERNATIVES:
				return ((InternalEList<?>)getCitationAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__ELEMENT_CITATION:
				return ((InternalEList<?>)getElementCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__MIXED_CITATION:
				return ((InternalEList<?>)getMixedCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__NLM_CITATION:
				return ((InternalEList<?>)getNlmCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__AWARD_ID:
				return ((InternalEList<?>)getAwardId()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__FUNDING_SOURCE:
				return ((InternalEList<?>)getFundingSource()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__OPEN_ACCESS:
				return ((InternalEList<?>)getOpenAccess()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__DISP_QUOTE:
				return ((InternalEList<?>)getDispQuote()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__SPEECH:
				return ((InternalEList<?>)getSpeech()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__VERSE_GROUP:
				return ((InternalEList<?>)getVerseGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Jats1Package.LICENSE_PTYPE__PRICE:
				return ((InternalEList<?>)getPrice()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.LICENSE_PTYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.LICENSE_PTYPE__LICENSE_PELEMENTS:
				if (coreType) return getLicensePElements();
				return ((FeatureMap.Internal)getLicensePElements()).getWrapper();
			case Jats1Package.LICENSE_PTYPE__EMAIL:
				return getEmail();
			case Jats1Package.LICENSE_PTYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.LICENSE_PTYPE__URI:
				return getUri();
			case Jats1Package.LICENSE_PTYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return getInlineSupplementaryMaterial();
			case Jats1Package.LICENSE_PTYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.LICENSE_PTYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.LICENSE_PTYPE__ADDRESS:
				return getAddress();
			case Jats1Package.LICENSE_PTYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.LICENSE_PTYPE__ARRAY:
				return getArray();
			case Jats1Package.LICENSE_PTYPE__BOXED_TEXT:
				return getBoxedText();
			case Jats1Package.LICENSE_PTYPE__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.LICENSE_PTYPE__CODE:
				return getCode();
			case Jats1Package.LICENSE_PTYPE__FIG:
				return getFig();
			case Jats1Package.LICENSE_PTYPE__FIG_GROUP:
				return getFigGroup();
			case Jats1Package.LICENSE_PTYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.LICENSE_PTYPE__MEDIA:
				return getMedia();
			case Jats1Package.LICENSE_PTYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.LICENSE_PTYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.LICENSE_PTYPE__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.LICENSE_PTYPE__TABLE_WRAP_GROUP:
				return getTableWrapGroup();
			case Jats1Package.LICENSE_PTYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.LICENSE_PTYPE__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.LICENSE_PTYPE__CITATION_ALTERNATIVES:
				return getCitationAlternatives();
			case Jats1Package.LICENSE_PTYPE__ELEMENT_CITATION:
				return getElementCitation();
			case Jats1Package.LICENSE_PTYPE__MIXED_CITATION:
				return getMixedCitation();
			case Jats1Package.LICENSE_PTYPE__NLM_CITATION:
				return getNlmCitation();
			case Jats1Package.LICENSE_PTYPE__BOLD:
				return getBold();
			case Jats1Package.LICENSE_PTYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.LICENSE_PTYPE__ITALIC:
				return getItalic();
			case Jats1Package.LICENSE_PTYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.LICENSE_PTYPE__OVERLINE:
				return getOverline();
			case Jats1Package.LICENSE_PTYPE__ROMAN:
				return getRoman();
			case Jats1Package.LICENSE_PTYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.LICENSE_PTYPE__SC:
				return getSc();
			case Jats1Package.LICENSE_PTYPE__STRIKE:
				return getStrike();
			case Jats1Package.LICENSE_PTYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.LICENSE_PTYPE__RUBY:
				return getRuby();
			case Jats1Package.LICENSE_PTYPE__AWARD_ID:
				return getAwardId();
			case Jats1Package.LICENSE_PTYPE__FUNDING_SOURCE:
				return getFundingSource();
			case Jats1Package.LICENSE_PTYPE__OPEN_ACCESS:
				return getOpenAccess();
			case Jats1Package.LICENSE_PTYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.LICENSE_PTYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.LICENSE_PTYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.LICENSE_PTYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.LICENSE_PTYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.LICENSE_PTYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.LICENSE_PTYPE__LIST:
				return getList();
			case Jats1Package.LICENSE_PTYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.LICENSE_PTYPE__MATH:
				return getMath();
			case Jats1Package.LICENSE_PTYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.LICENSE_PTYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.LICENSE_PTYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.LICENSE_PTYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.LICENSE_PTYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.LICENSE_PTYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.LICENSE_PTYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.LICENSE_PTYPE__DISP_QUOTE:
				return getDispQuote();
			case Jats1Package.LICENSE_PTYPE__SPEECH:
				return getSpeech();
			case Jats1Package.LICENSE_PTYPE__STATEMENT:
				return getStatement();
			case Jats1Package.LICENSE_PTYPE__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.LICENSE_PTYPE__FN:
				return getFn();
			case Jats1Package.LICENSE_PTYPE__TARGET:
				return getTarget();
			case Jats1Package.LICENSE_PTYPE__XREF:
				return getXref();
			case Jats1Package.LICENSE_PTYPE__SUB:
				return getSub();
			case Jats1Package.LICENSE_PTYPE__SUP:
				return getSup();
			case Jats1Package.LICENSE_PTYPE__PRICE:
				return getPrice();
			case Jats1Package.LICENSE_PTYPE__BASE:
				return getBase();
			case Jats1Package.LICENSE_PTYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.LICENSE_PTYPE__ID:
				return getId();
			case Jats1Package.LICENSE_PTYPE__SPECIFIC_USE:
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
			case Jats1Package.LICENSE_PTYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__LICENSE_PELEMENTS:
				((FeatureMap.Internal)getLicensePElements()).set(newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				getInlineSupplementaryMaterial().addAll((Collection<? extends InlineSupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__BOXED_TEXT:
				getBoxedText().clear();
				getBoxedText().addAll((Collection<? extends BoxedTextType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				getChemStructWrap().addAll((Collection<? extends ChemStructWrapType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__FIG:
				getFig().clear();
				getFig().addAll((Collection<? extends FigType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__FIG_GROUP:
				getFigGroup().clear();
				getFigGroup().addAll((Collection<? extends FigGroupType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__TABLE_WRAP:
				getTableWrap().clear();
				getTableWrap().addAll((Collection<? extends TableWrapType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				getTableWrapGroup().addAll((Collection<? extends TableWrapGroupType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				getDispFormulaGroup().addAll((Collection<? extends DispFormulaGroupType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__CITATION_ALTERNATIVES:
				getCitationAlternatives().clear();
				getCitationAlternatives().addAll((Collection<? extends CitationAlternativesType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__ELEMENT_CITATION:
				getElementCitation().clear();
				getElementCitation().addAll((Collection<? extends ElementCitationType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__MIXED_CITATION:
				getMixedCitation().clear();
				getMixedCitation().addAll((Collection<? extends MixedCitationType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__NLM_CITATION:
				getNlmCitation().clear();
				getNlmCitation().addAll((Collection<? extends NlmCitationType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__AWARD_ID:
				getAwardId().clear();
				getAwardId().addAll((Collection<? extends AwardIdType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__FUNDING_SOURCE:
				getFundingSource().clear();
				getFundingSource().addAll((Collection<? extends FundingSourceType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__OPEN_ACCESS:
				getOpenAccess().clear();
				getOpenAccess().addAll((Collection<? extends OpenAccessType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__DISP_QUOTE:
				getDispQuote().clear();
				getDispQuote().addAll((Collection<? extends DispQuoteType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__SPEECH:
				getSpeech().clear();
				getSpeech().addAll((Collection<? extends SpeechType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends StatementType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__VERSE_GROUP:
				getVerseGroup().clear();
				getVerseGroup().addAll((Collection<? extends VerseGroupType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__PRICE:
				getPrice().clear();
				getPrice().addAll((Collection<? extends PriceType>)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.LICENSE_PTYPE__SPECIFIC_USE:
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
			case Jats1Package.LICENSE_PTYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__LICENSE_PELEMENTS:
				getLicensePElements().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__BOXED_TEXT:
				getBoxedText().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__FIG:
				getFig().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__FIG_GROUP:
				getFigGroup().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__TABLE_WRAP:
				getTableWrap().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__CITATION_ALTERNATIVES:
				getCitationAlternatives().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__ELEMENT_CITATION:
				getElementCitation().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__MIXED_CITATION:
				getMixedCitation().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__NLM_CITATION:
				getNlmCitation().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__AWARD_ID:
				getAwardId().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__FUNDING_SOURCE:
				getFundingSource().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__OPEN_ACCESS:
				getOpenAccess().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__DISP_QUOTE:
				getDispQuote().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__SPEECH:
				getSpeech().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__STATEMENT:
				getStatement().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__VERSE_GROUP:
				getVerseGroup().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__PRICE:
				getPrice().clear();
				return;
			case Jats1Package.LICENSE_PTYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.LICENSE_PTYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.LICENSE_PTYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.LICENSE_PTYPE__SPECIFIC_USE:
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
			case Jats1Package.LICENSE_PTYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.LICENSE_PTYPE__LICENSE_PELEMENTS:
				return !getLicensePElements().isEmpty();
			case Jats1Package.LICENSE_PTYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.LICENSE_PTYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.LICENSE_PTYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.LICENSE_PTYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return !getInlineSupplementaryMaterial().isEmpty();
			case Jats1Package.LICENSE_PTYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.LICENSE_PTYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.LICENSE_PTYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.LICENSE_PTYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.LICENSE_PTYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.LICENSE_PTYPE__BOXED_TEXT:
				return !getBoxedText().isEmpty();
			case Jats1Package.LICENSE_PTYPE__CHEM_STRUCT_WRAP:
				return !getChemStructWrap().isEmpty();
			case Jats1Package.LICENSE_PTYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.LICENSE_PTYPE__FIG:
				return !getFig().isEmpty();
			case Jats1Package.LICENSE_PTYPE__FIG_GROUP:
				return !getFigGroup().isEmpty();
			case Jats1Package.LICENSE_PTYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.LICENSE_PTYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.LICENSE_PTYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.LICENSE_PTYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.LICENSE_PTYPE__TABLE_WRAP:
				return !getTableWrap().isEmpty();
			case Jats1Package.LICENSE_PTYPE__TABLE_WRAP_GROUP:
				return !getTableWrapGroup().isEmpty();
			case Jats1Package.LICENSE_PTYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.LICENSE_PTYPE__DISP_FORMULA_GROUP:
				return !getDispFormulaGroup().isEmpty();
			case Jats1Package.LICENSE_PTYPE__CITATION_ALTERNATIVES:
				return !getCitationAlternatives().isEmpty();
			case Jats1Package.LICENSE_PTYPE__ELEMENT_CITATION:
				return !getElementCitation().isEmpty();
			case Jats1Package.LICENSE_PTYPE__MIXED_CITATION:
				return !getMixedCitation().isEmpty();
			case Jats1Package.LICENSE_PTYPE__NLM_CITATION:
				return !getNlmCitation().isEmpty();
			case Jats1Package.LICENSE_PTYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.LICENSE_PTYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.LICENSE_PTYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.LICENSE_PTYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.LICENSE_PTYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.LICENSE_PTYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.LICENSE_PTYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.LICENSE_PTYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.LICENSE_PTYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.LICENSE_PTYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.LICENSE_PTYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.LICENSE_PTYPE__AWARD_ID:
				return !getAwardId().isEmpty();
			case Jats1Package.LICENSE_PTYPE__FUNDING_SOURCE:
				return !getFundingSource().isEmpty();
			case Jats1Package.LICENSE_PTYPE__OPEN_ACCESS:
				return !getOpenAccess().isEmpty();
			case Jats1Package.LICENSE_PTYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.LICENSE_PTYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.LICENSE_PTYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.LICENSE_PTYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.LICENSE_PTYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.LICENSE_PTYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.LICENSE_PTYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.LICENSE_PTYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.LICENSE_PTYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.LICENSE_PTYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.LICENSE_PTYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.LICENSE_PTYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.LICENSE_PTYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.LICENSE_PTYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.LICENSE_PTYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.LICENSE_PTYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.LICENSE_PTYPE__DISP_QUOTE:
				return !getDispQuote().isEmpty();
			case Jats1Package.LICENSE_PTYPE__SPEECH:
				return !getSpeech().isEmpty();
			case Jats1Package.LICENSE_PTYPE__STATEMENT:
				return !getStatement().isEmpty();
			case Jats1Package.LICENSE_PTYPE__VERSE_GROUP:
				return !getVerseGroup().isEmpty();
			case Jats1Package.LICENSE_PTYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.LICENSE_PTYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.LICENSE_PTYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.LICENSE_PTYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.LICENSE_PTYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.LICENSE_PTYPE__PRICE:
				return !getPrice().isEmpty();
			case Jats1Package.LICENSE_PTYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.LICENSE_PTYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.LICENSE_PTYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.LICENSE_PTYPE__SPECIFIC_USE:
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
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //LicensePTypeImpl
