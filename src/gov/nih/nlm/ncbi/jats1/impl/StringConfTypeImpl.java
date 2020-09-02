/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.ConfAcronymType;
import gov.nih.nlm.ncbi.jats1.ConfDateType;
import gov.nih.nlm.ncbi.jats1.ConfLocType;
import gov.nih.nlm.ncbi.jats1.ConfNameType;
import gov.nih.nlm.ncbi.jats1.ConfNumType;
import gov.nih.nlm.ncbi.jats1.ConfSponsorType;
import gov.nih.nlm.ncbi.jats1.ConfThemeType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
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
import gov.nih.nlm.ncbi.jats1.StringConfType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;

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
 * An implementation of the model object '<em><b>String Conf Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getStringConfElements <em>String Conf Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getConfDate <em>Conf Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getConfName <em>Conf Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getConfNum <em>Conf Num</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getConfLoc <em>Conf Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getConfSponsor <em>Conf Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getConfTheme <em>Conf Theme</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getConfAcronym <em>Conf Acronym</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getStringConf <em>String Conf</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringConfTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringConfTypeImpl extends MinimalEObjectImpl.Container implements StringConfType {
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
	protected StringConfTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getStringConfType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.STRING_CONF_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getStringConfElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getStringConfType_StringConfElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfDateType> getConfDate() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_ConfDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfNameType> getConfName() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_ConfName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfNumType> getConfNum() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_ConfNum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfLocType> getConfLoc() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_ConfLoc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfSponsorType> getConfSponsor() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_ConfSponsor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfThemeType> getConfTheme() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_ConfTheme());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfAcronymType> getConfAcronym() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_ConfAcronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringConfType> getStringConf() {
		return getStringConfElements().list(Jats1Package.eINSTANCE.getStringConfType_StringConf());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_CONF_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_CONF_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_CONF_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_CONF_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_CONF_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.STRING_CONF_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__STRING_CONF_ELEMENTS:
				return ((InternalEList<?>)getStringConfElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__CONF_DATE:
				return ((InternalEList<?>)getConfDate()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__CONF_NAME:
				return ((InternalEList<?>)getConfName()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__CONF_NUM:
				return ((InternalEList<?>)getConfNum()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__CONF_LOC:
				return ((InternalEList<?>)getConfLoc()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__CONF_SPONSOR:
				return ((InternalEList<?>)getConfSponsor()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__CONF_THEME:
				return ((InternalEList<?>)getConfTheme()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__CONF_ACRONYM:
				return ((InternalEList<?>)getConfAcronym()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_CONF_TYPE__STRING_CONF:
				return ((InternalEList<?>)getStringConf()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.STRING_CONF_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.STRING_CONF_TYPE__STRING_CONF_ELEMENTS:
				if (coreType) return getStringConfElements();
				return ((FeatureMap.Internal)getStringConfElements()).getWrapper();
			case Jats1Package.STRING_CONF_TYPE__BOLD:
				return getBold();
			case Jats1Package.STRING_CONF_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.STRING_CONF_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.STRING_CONF_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.STRING_CONF_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.STRING_CONF_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.STRING_CONF_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.STRING_CONF_TYPE__SC:
				return getSc();
			case Jats1Package.STRING_CONF_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.STRING_CONF_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.STRING_CONF_TYPE__RUBY:
				return getRuby();
			case Jats1Package.STRING_CONF_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.STRING_CONF_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.STRING_CONF_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.STRING_CONF_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.STRING_CONF_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.STRING_CONF_TYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.STRING_CONF_TYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.STRING_CONF_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.STRING_CONF_TYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.STRING_CONF_TYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.STRING_CONF_TYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.STRING_CONF_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.STRING_CONF_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.STRING_CONF_TYPE__SUB:
				return getSub();
			case Jats1Package.STRING_CONF_TYPE__SUP:
				return getSup();
			case Jats1Package.STRING_CONF_TYPE__CONF_DATE:
				return getConfDate();
			case Jats1Package.STRING_CONF_TYPE__CONF_NAME:
				return getConfName();
			case Jats1Package.STRING_CONF_TYPE__CONF_NUM:
				return getConfNum();
			case Jats1Package.STRING_CONF_TYPE__CONF_LOC:
				return getConfLoc();
			case Jats1Package.STRING_CONF_TYPE__CONF_SPONSOR:
				return getConfSponsor();
			case Jats1Package.STRING_CONF_TYPE__CONF_THEME:
				return getConfTheme();
			case Jats1Package.STRING_CONF_TYPE__CONF_ACRONYM:
				return getConfAcronym();
			case Jats1Package.STRING_CONF_TYPE__STRING_CONF:
				return getStringConf();
			case Jats1Package.STRING_CONF_TYPE__BASE:
				return getBase();
			case Jats1Package.STRING_CONF_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.STRING_CONF_TYPE__ID:
				return getId();
			case Jats1Package.STRING_CONF_TYPE__LANG:
				return getLang();
			case Jats1Package.STRING_CONF_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STRING_CONF_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__STRING_CONF_ELEMENTS:
				((FeatureMap.Internal)getStringConfElements()).set(newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_DATE:
				getConfDate().clear();
				getConfDate().addAll((Collection<? extends ConfDateType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_NAME:
				getConfName().clear();
				getConfName().addAll((Collection<? extends ConfNameType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_NUM:
				getConfNum().clear();
				getConfNum().addAll((Collection<? extends ConfNumType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_LOC:
				getConfLoc().clear();
				getConfLoc().addAll((Collection<? extends ConfLocType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_SPONSOR:
				getConfSponsor().clear();
				getConfSponsor().addAll((Collection<? extends ConfSponsorType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_THEME:
				getConfTheme().clear();
				getConfTheme().addAll((Collection<? extends ConfThemeType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_ACRONYM:
				getConfAcronym().clear();
				getConfAcronym().addAll((Collection<? extends ConfAcronymType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__STRING_CONF:
				getStringConf().clear();
				getStringConf().addAll((Collection<? extends StringConfType>)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.STRING_CONF_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STRING_CONF_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__STRING_CONF_ELEMENTS:
				getStringConfElements().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_DATE:
				getConfDate().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_NAME:
				getConfName().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_NUM:
				getConfNum().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_LOC:
				getConfLoc().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_SPONSOR:
				getConfSponsor().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_THEME:
				getConfTheme().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__CONF_ACRONYM:
				getConfAcronym().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__STRING_CONF:
				getStringConf().clear();
				return;
			case Jats1Package.STRING_CONF_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.STRING_CONF_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.STRING_CONF_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.STRING_CONF_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.STRING_CONF_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STRING_CONF_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.STRING_CONF_TYPE__STRING_CONF_ELEMENTS:
				return !getStringConfElements().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__CONF_DATE:
				return !getConfDate().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__CONF_NAME:
				return !getConfName().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__CONF_NUM:
				return !getConfNum().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__CONF_LOC:
				return !getConfLoc().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__CONF_SPONSOR:
				return !getConfSponsor().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__CONF_THEME:
				return !getConfTheme().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__CONF_ACRONYM:
				return !getConfAcronym().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__STRING_CONF:
				return !getStringConf().isEmpty();
			case Jats1Package.STRING_CONF_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.STRING_CONF_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.STRING_CONF_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.STRING_CONF_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.STRING_CONF_TYPE__SPECIFIC_USE:
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

} //StringConfTypeImpl
