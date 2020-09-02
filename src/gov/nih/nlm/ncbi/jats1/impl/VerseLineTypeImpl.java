/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.IndexTermRangeEndType;
import gov.nih.nlm.ncbi.jats1.IndexTermType;
import gov.nih.nlm.ncbi.jats1.InlineFormulaType;
import gov.nih.nlm.ncbi.jats1.InlineGraphicType;
import gov.nih.nlm.ncbi.jats1.InlineMediaType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MilestoneEndType;
import gov.nih.nlm.ncbi.jats1.MilestoneStartType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PrivateCharType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.TargetType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.VerseLineType;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verse Line Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getVerseLineElements <em>Verse Line Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getIndentLevel <em>Indent Level</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getStyleDetail <em>Style Detail</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.VerseLineTypeImpl#getStyleType <em>Style Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerseLineTypeImpl extends MinimalEObjectImpl.Container implements VerseLineType {
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
	 * The default value of the '{@link #getIndentLevel() <em>Indent Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String INDENT_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndentLevel() <em>Indent Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentLevel()
	 * @generated
	 * @ordered
	 */
	protected String indentLevel = INDENT_LEVEL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerseLineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getVerseLineType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.VERSE_LINE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getVerseLineElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getVerseLineType_VerseLineElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getVerseLineElements().list(Jats1Package.eINSTANCE.getVerseLineType_Xref());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_LINE_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_LINE_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_LINE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndentLevel() {
		return indentLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentLevel(String newIndentLevel) {
		String oldIndentLevel = indentLevel;
		indentLevel = newIndentLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_LINE_TYPE__INDENT_LEVEL, oldIndentLevel, indentLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_LINE_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_LINE_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_LINE_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_LINE_TYPE__STYLE_DETAIL, oldStyleDetail, styleDetail));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.VERSE_LINE_TYPE__STYLE_TYPE, oldStyleType, styleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.VERSE_LINE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__VERSE_LINE_ELEMENTS:
				return ((InternalEList<?>)getVerseLineElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.VERSE_LINE_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.VERSE_LINE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.VERSE_LINE_TYPE__VERSE_LINE_ELEMENTS:
				if (coreType) return getVerseLineElements();
				return ((FeatureMap.Internal)getVerseLineElements()).getWrapper();
			case Jats1Package.VERSE_LINE_TYPE__BOLD:
				return getBold();
			case Jats1Package.VERSE_LINE_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.VERSE_LINE_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.VERSE_LINE_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.VERSE_LINE_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.VERSE_LINE_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.VERSE_LINE_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.VERSE_LINE_TYPE__SC:
				return getSc();
			case Jats1Package.VERSE_LINE_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.VERSE_LINE_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.VERSE_LINE_TYPE__RUBY:
				return getRuby();
			case Jats1Package.VERSE_LINE_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.VERSE_LINE_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.VERSE_LINE_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.VERSE_LINE_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.VERSE_LINE_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.VERSE_LINE_TYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.VERSE_LINE_TYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.VERSE_LINE_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.VERSE_LINE_TYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.VERSE_LINE_TYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.VERSE_LINE_TYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.VERSE_LINE_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.VERSE_LINE_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.VERSE_LINE_TYPE__SUB:
				return getSub();
			case Jats1Package.VERSE_LINE_TYPE__SUP:
				return getSup();
			case Jats1Package.VERSE_LINE_TYPE__FN:
				return getFn();
			case Jats1Package.VERSE_LINE_TYPE__TARGET:
				return getTarget();
			case Jats1Package.VERSE_LINE_TYPE__XREF:
				return getXref();
			case Jats1Package.VERSE_LINE_TYPE__BASE:
				return getBase();
			case Jats1Package.VERSE_LINE_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.VERSE_LINE_TYPE__ID:
				return getId();
			case Jats1Package.VERSE_LINE_TYPE__INDENT_LEVEL:
				return getIndentLevel();
			case Jats1Package.VERSE_LINE_TYPE__LANG:
				return getLang();
			case Jats1Package.VERSE_LINE_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.VERSE_LINE_TYPE__STYLE:
				return getStyle();
			case Jats1Package.VERSE_LINE_TYPE__STYLE_DETAIL:
				return getStyleDetail();
			case Jats1Package.VERSE_LINE_TYPE__STYLE_TYPE:
				return getStyleType();
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
			case Jats1Package.VERSE_LINE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__VERSE_LINE_ELEMENTS:
				((FeatureMap.Internal)getVerseLineElements()).set(newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__INDENT_LEVEL:
				setIndentLevel((String)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__STYLE_DETAIL:
				setStyleDetail((String)newValue);
				return;
			case Jats1Package.VERSE_LINE_TYPE__STYLE_TYPE:
				setStyleType((String)newValue);
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
			case Jats1Package.VERSE_LINE_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__VERSE_LINE_ELEMENTS:
				getVerseLineElements().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.VERSE_LINE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.VERSE_LINE_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.VERSE_LINE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.VERSE_LINE_TYPE__INDENT_LEVEL:
				setIndentLevel(INDENT_LEVEL_EDEFAULT);
				return;
			case Jats1Package.VERSE_LINE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.VERSE_LINE_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.VERSE_LINE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case Jats1Package.VERSE_LINE_TYPE__STYLE_DETAIL:
				setStyleDetail(STYLE_DETAIL_EDEFAULT);
				return;
			case Jats1Package.VERSE_LINE_TYPE__STYLE_TYPE:
				setStyleType(STYLE_TYPE_EDEFAULT);
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
			case Jats1Package.VERSE_LINE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__VERSE_LINE_ELEMENTS:
				return !getVerseLineElements().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.VERSE_LINE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.VERSE_LINE_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.VERSE_LINE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.VERSE_LINE_TYPE__INDENT_LEVEL:
				return INDENT_LEVEL_EDEFAULT == null ? indentLevel != null : !INDENT_LEVEL_EDEFAULT.equals(indentLevel);
			case Jats1Package.VERSE_LINE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.VERSE_LINE_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.VERSE_LINE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case Jats1Package.VERSE_LINE_TYPE__STYLE_DETAIL:
				return STYLE_DETAIL_EDEFAULT == null ? styleDetail != null : !STYLE_DETAIL_EDEFAULT.equals(styleDetail);
			case Jats1Package.VERSE_LINE_TYPE__STYLE_TYPE:
				return STYLE_TYPE_EDEFAULT == null ? styleType != null : !STYLE_TYPE_EDEFAULT.equals(styleType);
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
		result.append(", indentLevel: ");
		result.append(indentLevel);
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
		result.append(')');
		return result.toString();
	}

} //VerseLineTypeImpl
