/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.AddrLineType;
import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.AffAlternativesType;
import gov.nih.nlm.ncbi.jats1.AffType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.AuthorCommentType;
import gov.nih.nlm.ncbi.jats1.BioType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.CityType;
import gov.nih.nlm.ncbi.jats1.CollabType;
import gov.nih.nlm.ncbi.jats1.ContribGroupType;
import gov.nih.nlm.ncbi.jats1.CountryType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FaxType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.IndexTermRangeEndType;
import gov.nih.nlm.ncbi.jats1.IndexTermType;
import gov.nih.nlm.ncbi.jats1.InlineFormulaType;
import gov.nih.nlm.ncbi.jats1.InlineGraphicType;
import gov.nih.nlm.ncbi.jats1.InlineMediaType;
import gov.nih.nlm.ncbi.jats1.InstitutionType;
import gov.nih.nlm.ncbi.jats1.InstitutionWrapType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MilestoneEndType;
import gov.nih.nlm.ncbi.jats1.MilestoneStartType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.OnBehalfOfType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PhoneType;
import gov.nih.nlm.ncbi.jats1.PostalCodeType;
import gov.nih.nlm.ncbi.jats1.PrivateCharType;
import gov.nih.nlm.ncbi.jats1.RoleType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.StateType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.UriType;
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

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collab Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getCollabElements <em>Collab Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getAddrLine <em>Addr Line</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getCity <em>City</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getContribGroup <em>Contrib Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getAff <em>Aff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getAffAlternatives <em>Aff Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getAuthorComment <em>Author Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getBio <em>Bio</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getCollabType <em>Collab Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CollabTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollabTypeImpl extends MinimalEObjectImpl.Container implements CollabType {
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
	 * The default value of the '{@link #getCollabType() <em>Collab Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollabType()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLAB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollabType() <em>Collab Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollabType()
	 * @generated
	 * @ordered
	 */
	protected String collabType = COLLAB_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected String role1 = ROLE1_EDEFAULT;

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
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollabTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getCollabType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.COLLAB_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCollabElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getCollabType_CollabElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddrLineType> getAddrLine() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_AddrLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CityType> getCity() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_City());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CountryType> getCountry() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Country());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FaxType> getFax() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Fax());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Institution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionWrapType> getInstitutionWrap() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_InstitutionWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhoneType> getPhone() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Phone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PostalCodeType> getPostalCode() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_PostalCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateType> getState() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_State());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContribGroupType> getContribGroup() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_ContribGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffType> getAff() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Aff());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffAlternativesType> getAffAlternatives() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_AffAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorCommentType> getAuthorComment() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_AuthorComment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BioType> getBio() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Bio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnBehalfOfType> getOnBehalfOf() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_OnBehalfOf());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleType> getRole() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Role());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getCollabElements().list(Jats1Package.eINSTANCE.getCollabType_Fn());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.COLLAB_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCollabType() {
		return collabType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollabType(String newCollabType) {
		String oldCollabType = collabType;
		collabType = newCollabType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__COLLAB_TYPE, oldCollabType, collabType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole1() {
		return role1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole1(String newRole1) {
		String oldRole1 = role1;
		role1 = newRole1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__ROLE1, oldRole1, role1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.COLLAB_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__SYMBOL, oldSymbol, symbol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLLAB_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.COLLAB_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.COLLAB_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__COLLAB_ELEMENTS:
				return ((InternalEList<?>)getCollabElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__ADDR_LINE:
				return ((InternalEList<?>)getAddrLine()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__CITY:
				return ((InternalEList<?>)getCity()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__COUNTRY:
				return ((InternalEList<?>)getCountry()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__FAX:
				return ((InternalEList<?>)getFax()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__INSTITUTION_WRAP:
				return ((InternalEList<?>)getInstitutionWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__PHONE:
				return ((InternalEList<?>)getPhone()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__POSTAL_CODE:
				return ((InternalEList<?>)getPostalCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__CONTRIB_GROUP:
				return ((InternalEList<?>)getContribGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__AFF:
				return ((InternalEList<?>)getAff()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__AFF_ALTERNATIVES:
				return ((InternalEList<?>)getAffAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__AUTHOR_COMMENT:
				return ((InternalEList<?>)getAuthorComment()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__BIO:
				return ((InternalEList<?>)getBio()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__ON_BEHALF_OF:
				return ((InternalEList<?>)getOnBehalfOf()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLLAB_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.COLLAB_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.COLLAB_TYPE__COLLAB_ELEMENTS:
				if (coreType) return getCollabElements();
				return ((FeatureMap.Internal)getCollabElements()).getWrapper();
			case Jats1Package.COLLAB_TYPE__BOLD:
				return getBold();
			case Jats1Package.COLLAB_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.COLLAB_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.COLLAB_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.COLLAB_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.COLLAB_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.COLLAB_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.COLLAB_TYPE__SC:
				return getSc();
			case Jats1Package.COLLAB_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.COLLAB_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.COLLAB_TYPE__RUBY:
				return getRuby();
			case Jats1Package.COLLAB_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.COLLAB_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.COLLAB_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.COLLAB_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.COLLAB_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.COLLAB_TYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.COLLAB_TYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.COLLAB_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.COLLAB_TYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.COLLAB_TYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.COLLAB_TYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.COLLAB_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.COLLAB_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.COLLAB_TYPE__SUB:
				return getSub();
			case Jats1Package.COLLAB_TYPE__SUP:
				return getSup();
			case Jats1Package.COLLAB_TYPE__ADDR_LINE:
				return getAddrLine();
			case Jats1Package.COLLAB_TYPE__CITY:
				return getCity();
			case Jats1Package.COLLAB_TYPE__COUNTRY:
				return getCountry();
			case Jats1Package.COLLAB_TYPE__FAX:
				return getFax();
			case Jats1Package.COLLAB_TYPE__INSTITUTION:
				return getInstitution();
			case Jats1Package.COLLAB_TYPE__INSTITUTION_WRAP:
				return getInstitutionWrap();
			case Jats1Package.COLLAB_TYPE__PHONE:
				return getPhone();
			case Jats1Package.COLLAB_TYPE__POSTAL_CODE:
				return getPostalCode();
			case Jats1Package.COLLAB_TYPE__STATE:
				return getState();
			case Jats1Package.COLLAB_TYPE__CONTRIB_GROUP:
				return getContribGroup();
			case Jats1Package.COLLAB_TYPE__ADDRESS:
				return getAddress();
			case Jats1Package.COLLAB_TYPE__AFF:
				return getAff();
			case Jats1Package.COLLAB_TYPE__AFF_ALTERNATIVES:
				return getAffAlternatives();
			case Jats1Package.COLLAB_TYPE__AUTHOR_COMMENT:
				return getAuthorComment();
			case Jats1Package.COLLAB_TYPE__BIO:
				return getBio();
			case Jats1Package.COLLAB_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.COLLAB_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.COLLAB_TYPE__ON_BEHALF_OF:
				return getOnBehalfOf();
			case Jats1Package.COLLAB_TYPE__ROLE:
				return getRole();
			case Jats1Package.COLLAB_TYPE__URI:
				return getUri();
			case Jats1Package.COLLAB_TYPE__XREF:
				return getXref();
			case Jats1Package.COLLAB_TYPE__FN:
				return getFn();
			case Jats1Package.COLLAB_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.COLLAB_TYPE__BASE:
				return getBase();
			case Jats1Package.COLLAB_TYPE__COLLAB_TYPE:
				return getCollabType();
			case Jats1Package.COLLAB_TYPE__HREF:
				return getHref();
			case Jats1Package.COLLAB_TYPE__ID:
				return getId();
			case Jats1Package.COLLAB_TYPE__LANG:
				return getLang();
			case Jats1Package.COLLAB_TYPE__ROLE1:
				return getRole1();
			case Jats1Package.COLLAB_TYPE__SHOW:
				return getShow();
			case Jats1Package.COLLAB_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.COLLAB_TYPE__SYMBOL:
				return getSymbol();
			case Jats1Package.COLLAB_TYPE__TITLE:
				return getTitle();
			case Jats1Package.COLLAB_TYPE__TYPE:
				return getType();
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
			case Jats1Package.COLLAB_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.COLLAB_TYPE__COLLAB_ELEMENTS:
				((FeatureMap.Internal)getCollabElements()).set(newValue);
				return;
			case Jats1Package.COLLAB_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ADDR_LINE:
				getAddrLine().clear();
				getAddrLine().addAll((Collection<? extends AddrLineType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__CITY:
				getCity().clear();
				getCity().addAll((Collection<? extends CityType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends CountryType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__FAX:
				getFax().clear();
				getFax().addAll((Collection<? extends FaxType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				getInstitutionWrap().addAll((Collection<? extends InstitutionWrapType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__PHONE:
				getPhone().clear();
				getPhone().addAll((Collection<? extends PhoneType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__POSTAL_CODE:
				getPostalCode().clear();
				getPostalCode().addAll((Collection<? extends PostalCodeType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends StateType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__CONTRIB_GROUP:
				getContribGroup().clear();
				getContribGroup().addAll((Collection<? extends ContribGroupType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__AFF:
				getAff().clear();
				getAff().addAll((Collection<? extends AffType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				getAffAlternatives().addAll((Collection<? extends AffAlternativesType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__AUTHOR_COMMENT:
				getAuthorComment().clear();
				getAuthorComment().addAll((Collection<? extends AuthorCommentType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__BIO:
				getBio().clear();
				getBio().addAll((Collection<? extends BioType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ON_BEHALF_OF:
				getOnBehalfOf().clear();
				getOnBehalfOf().addAll((Collection<? extends OnBehalfOfType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends RoleType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__COLLAB_TYPE:
				setCollabType((String)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.COLLAB_TYPE__ROLE1:
				setRole1((String)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__SYMBOL:
				setSymbol((String)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Jats1Package.COLLAB_TYPE__TYPE:
				setType((TypeType)newValue);
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
			case Jats1Package.COLLAB_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.COLLAB_TYPE__COLLAB_ELEMENTS:
				getCollabElements().clear();
				return;
			case Jats1Package.COLLAB_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.COLLAB_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.COLLAB_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.COLLAB_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.COLLAB_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.COLLAB_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.COLLAB_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.COLLAB_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.COLLAB_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.COLLAB_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.COLLAB_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.COLLAB_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.COLLAB_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.COLLAB_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.COLLAB_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.COLLAB_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.COLLAB_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.COLLAB_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.COLLAB_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.COLLAB_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.COLLAB_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.COLLAB_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.COLLAB_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.COLLAB_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.COLLAB_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.COLLAB_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.COLLAB_TYPE__ADDR_LINE:
				getAddrLine().clear();
				return;
			case Jats1Package.COLLAB_TYPE__CITY:
				getCity().clear();
				return;
			case Jats1Package.COLLAB_TYPE__COUNTRY:
				getCountry().clear();
				return;
			case Jats1Package.COLLAB_TYPE__FAX:
				getFax().clear();
				return;
			case Jats1Package.COLLAB_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case Jats1Package.COLLAB_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				return;
			case Jats1Package.COLLAB_TYPE__PHONE:
				getPhone().clear();
				return;
			case Jats1Package.COLLAB_TYPE__POSTAL_CODE:
				getPostalCode().clear();
				return;
			case Jats1Package.COLLAB_TYPE__STATE:
				getState().clear();
				return;
			case Jats1Package.COLLAB_TYPE__CONTRIB_GROUP:
				getContribGroup().clear();
				return;
			case Jats1Package.COLLAB_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.COLLAB_TYPE__AFF:
				getAff().clear();
				return;
			case Jats1Package.COLLAB_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				return;
			case Jats1Package.COLLAB_TYPE__AUTHOR_COMMENT:
				getAuthorComment().clear();
				return;
			case Jats1Package.COLLAB_TYPE__BIO:
				getBio().clear();
				return;
			case Jats1Package.COLLAB_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.COLLAB_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.COLLAB_TYPE__ON_BEHALF_OF:
				getOnBehalfOf().clear();
				return;
			case Jats1Package.COLLAB_TYPE__ROLE:
				getRole().clear();
				return;
			case Jats1Package.COLLAB_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.COLLAB_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.COLLAB_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.COLLAB_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.COLLAB_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.COLLAB_TYPE__COLLAB_TYPE:
				setCollabType(COLLAB_TYPE_EDEFAULT);
				return;
			case Jats1Package.COLLAB_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.COLLAB_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.COLLAB_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.COLLAB_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case Jats1Package.COLLAB_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.COLLAB_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.COLLAB_TYPE__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case Jats1Package.COLLAB_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Jats1Package.COLLAB_TYPE__TYPE:
				unsetType();
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
			case Jats1Package.COLLAB_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.COLLAB_TYPE__COLLAB_ELEMENTS:
				return !getCollabElements().isEmpty();
			case Jats1Package.COLLAB_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.COLLAB_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.COLLAB_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.COLLAB_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.COLLAB_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.COLLAB_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.COLLAB_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.COLLAB_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.COLLAB_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.COLLAB_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.COLLAB_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.COLLAB_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.COLLAB_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.COLLAB_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.COLLAB_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.COLLAB_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.COLLAB_TYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.COLLAB_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.COLLAB_TYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.COLLAB_TYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.COLLAB_TYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.COLLAB_TYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.COLLAB_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.COLLAB_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.COLLAB_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.COLLAB_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.COLLAB_TYPE__ADDR_LINE:
				return !getAddrLine().isEmpty();
			case Jats1Package.COLLAB_TYPE__CITY:
				return !getCity().isEmpty();
			case Jats1Package.COLLAB_TYPE__COUNTRY:
				return !getCountry().isEmpty();
			case Jats1Package.COLLAB_TYPE__FAX:
				return !getFax().isEmpty();
			case Jats1Package.COLLAB_TYPE__INSTITUTION:
				return !getInstitution().isEmpty();
			case Jats1Package.COLLAB_TYPE__INSTITUTION_WRAP:
				return !getInstitutionWrap().isEmpty();
			case Jats1Package.COLLAB_TYPE__PHONE:
				return !getPhone().isEmpty();
			case Jats1Package.COLLAB_TYPE__POSTAL_CODE:
				return !getPostalCode().isEmpty();
			case Jats1Package.COLLAB_TYPE__STATE:
				return !getState().isEmpty();
			case Jats1Package.COLLAB_TYPE__CONTRIB_GROUP:
				return !getContribGroup().isEmpty();
			case Jats1Package.COLLAB_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.COLLAB_TYPE__AFF:
				return !getAff().isEmpty();
			case Jats1Package.COLLAB_TYPE__AFF_ALTERNATIVES:
				return !getAffAlternatives().isEmpty();
			case Jats1Package.COLLAB_TYPE__AUTHOR_COMMENT:
				return !getAuthorComment().isEmpty();
			case Jats1Package.COLLAB_TYPE__BIO:
				return !getBio().isEmpty();
			case Jats1Package.COLLAB_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.COLLAB_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.COLLAB_TYPE__ON_BEHALF_OF:
				return !getOnBehalfOf().isEmpty();
			case Jats1Package.COLLAB_TYPE__ROLE:
				return !getRole().isEmpty();
			case Jats1Package.COLLAB_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.COLLAB_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.COLLAB_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.COLLAB_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.COLLAB_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.COLLAB_TYPE__COLLAB_TYPE:
				return COLLAB_TYPE_EDEFAULT == null ? collabType != null : !COLLAB_TYPE_EDEFAULT.equals(collabType);
			case Jats1Package.COLLAB_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.COLLAB_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.COLLAB_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.COLLAB_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case Jats1Package.COLLAB_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.COLLAB_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.COLLAB_TYPE__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case Jats1Package.COLLAB_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Jats1Package.COLLAB_TYPE__TYPE:
				return isSetType();
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
		result.append(", base: ");
		result.append(base);
		result.append(", collabType: ");
		result.append(collabType);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", role1: ");
		result.append(role1);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", symbol: ");
		result.append(symbol);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CollabTypeImpl
